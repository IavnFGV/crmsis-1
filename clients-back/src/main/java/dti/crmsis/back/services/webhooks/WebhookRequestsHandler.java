package dti.crmsis.back.services.webhooks;

import com.fasterxml.jackson.databind.ObjectMapper;
import dti.crmsis.back.clients.dto.Pair;
import dti.crmsis.back.dao.clientsback.ExtraInfoEntity;
import dti.crmsis.back.dao.clientsback.ProcessReportEntity;
import dti.crmsis.back.dao.crmsis.RawRequestEntity;
import dti.crmsis.back.dao.sql.RawRequestNativeRepository;
import dti.crmsis.back.services.Constants;
import io.quarkus.panache.common.Page;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.jboss.logging.Logger;

import java.util.*;

@ApplicationScoped
public class WebhookRequestsHandler {

    public Set<Pair<String, String>> processed = new HashSet<>();


    private Long lastProcessedId;

    Logger logger = Logger.getLogger(WebhookRequestsHandler.class);

    @Inject
    ObjectMapper objectMapper;
    @Inject
    WebhookRequestService webhookRequestService;
    @Inject
    HandlersCollector handlersCollector;
    @Inject
    RawRequestNativeRepository rawRequestNativeRepository;


    public void processNew() {
        int pageIndex = 0;
        int pageSize = Constants.PAGE_LIMIT;
        while (true) {
            List<RawRequestEntity> entities = getRequestEntities(pageIndex, pageSize, lastProcessedId);
            if (entities.isEmpty()) {
                break;
            }
            for (RawRequestEntity entity : entities) {
                processEntity(entity, true);
            }
        }
    }

    @Transactional
    protected void processEntity(RawRequestEntity requestEntity, boolean saveLastId) {
        WebhookRequestService.JsonProxy proxy = webhookRequestService.getProxy(requestEntity.id, requestEntity.getRequestData());
        ProcessReportEntity report = ProcessReportEntity.<ProcessReportEntity>find("rawRequestId = ?1", requestEntity.id)
                .firstResultOptional()
                .orElseGet(ProcessReportEntity::new);
        if (saveLastId) {
            lastProcessedId = requestEntity.id;
        }

        boolean wasException = false;
        try {
            proxy.init(objectMapper);
            report.rawRequestId = requestEntity.id;
            report.entityPipedriveId = proxy.entityIdPipedrive;
            report.correlationId = proxy.metaCorrelationId;
            report.correlationIdSuffix = proxy.metaCorrelationIdSuffix;
            report.entityPipedriveType = proxy.type;
            report.pipedriveAction = proxy.action;
            if (report.correlationId == null) {
                logger.errorf("Invalid request data for request ID %d: $s", requestEntity.id, requestEntity.getRequestData());
                throw new NotEnoughFieldsException("Invalid request data " + requestEntity.getRequestData());
            }
            process(proxy);
        } catch (JsonProblemException e) {
            wasException = true;
            report.status = "JSON_PROBLEM";
            logger.errorf(e, "JSON processing error for request ID %d: %s", requestEntity.id, requestEntity.getRequestData());
        } catch (NoHandlerFoundException e) {
            wasException = true;
            report.status = "NO_HANDLER_FOUND";
            logger.errorf(e, "No handler found for request ID %d: %s", requestEntity.id, requestEntity.getRequestData());
        } catch (NotEnoughFieldsException e) {
            wasException = true;
            report.status = "NO_ID_FIELDS";
            report.correlationId = UUID.randomUUID();
            logger.errorf(e, "No Id Fields for request ID %d: %s", requestEntity.id, requestEntity.getRequestData());
        } catch (Throwable e) {
            wasException = true;
            report.status = "GENERIC_FAIL";
            logger.errorf(e, "Exception for request ID %d: %s", requestEntity.id, requestEntity.getRequestData());
        } finally {
            try {
                List<Object> commentList = new ArrayList<>();

                if (report.comment != null && !report.comment.isBlank()) {
                    try {
                        commentList.addAll(objectMapper.readValue(report.comment, List.class));
                    } catch (Exception e) {
                        logger.warnf("Could not parse existing comment array for request ID %d, fallback to string", requestEntity.id);
                        commentList.add(report.comment);
                    }
                }

                commentList.add(proxy.comment);
                report.comment = objectMapper.writeValueAsString(commentList);
            } catch (Exception ex) {
                logger.errorf(ex, "Error serializing comment for request ID %d", requestEntity.id);
            }

            if (wasException) {
                saveReportInSeparateTransaction(report, saveLastId);
            } else {
                if (proxy.exceptionInHandler) {
                    report.status = "FAILED_IN_HANDLER";
                } else {
                    report.status = "OK";
                }
                report.persist();
            }
            if (saveLastId) {
                ExtraInfoEntity.saveLong(Constants.LAST_PROCESSED_ID, lastProcessedId);
            }
        }
    }

    private void process(WebhookRequestService.JsonProxy proxy) {
        boolean processedAtLeastOnce = false;
//        this.processed.add(new Pair<>(proxy.type, proxy.action));// dlete this
        for (ProxyHandler handler : handlersCollector.getHandlers()) {
            if (handler.canProcess(proxy)) {
                proxy.addComment(handler.getClass().getSimpleName(), "Can process");
                try {
                    handler.handle(proxy);
                } catch (Exception e) {
                    logger.warn(e.getMessage(), e);
                    proxy.exceptionInHandler = true;

                    proxy.addComment(handler.getClass().getSimpleName() + "_exception", e.getClass().getSimpleName());
                    proxy.addComment(handler.getClass().getSimpleName() + "_message", e.getMessage());
                }
                processedAtLeastOnce = true;
            }
        }
        if (!processedAtLeastOnce) {
            proxy.addComment("WebhookRequestsHandler", "No handler found");
            throw new NoHandlerFoundException();
        }
    }

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    protected void saveReportInSeparateTransaction(ProcessReportEntity report,boolean saveId) {
        if(saveId){
            ExtraInfoEntity.saveLong(Constants.LAST_PROCESSED_ID, lastProcessedId);
        }
        ProcessReportEntity.getEntityManager().merge(report);
    }


    @Transactional
    protected List<RawRequestEntity> getRequestEntities(int pageIndex, int pageSize, Long idSelector) {
        return RawRequestEntity.find("id > ?1", idSelector)
                .page(Page.of(pageIndex, pageSize))
                .list();
    }


    public void init() {
        // Initialize the last processed ID
        Long longByName = ExtraInfoEntity.getLongByName(Constants.LAST_PROCESSED_ID);
        lastProcessedId = null == longByName ? 0 : longByName;
    }

    public void processRetry() {
        int pageSize = Constants.PAGE_LIMIT;
        long lastId = 0;
        while (true) {
            List<Long> skippedRequestIds = rawRequestNativeRepository.getSkippedRequests(lastId, pageSize);
            if (skippedRequestIds == null || skippedRequestIds.isEmpty()) {
                break;
            }
            List<RawRequestEntity> entities = getRequestEntities(skippedRequestIds);
            if (entities.isEmpty()) {
                break;
            }
            for (RawRequestEntity entity : entities) {
                lastId = entity.getId();
                processEntity(entity, false);
            }
        }
    }

    private List<RawRequestEntity> getRequestEntities(List<Long> ids) {
        if (ids == null || ids.isEmpty()) {
            return List.of();
        }
        return RawRequestEntity.find("id IN ?1 ORDER BY id", ids)
                .list();
    }

    @ApplicationScoped
    public static class HandlersCollector {
        @Inject
        Instance<ProxyHandler> handlers;
        List<ProxyHandler> list;

        public synchronized List<ProxyHandler> getHandlers() {
            if (list == null) {
                list = handlers.stream().toList();
            }
            return list;
        }


    }


}
