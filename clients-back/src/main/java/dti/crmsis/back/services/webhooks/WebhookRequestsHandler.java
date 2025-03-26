package dti.crmsis.back.services.webhooks;

import com.fasterxml.jackson.databind.ObjectMapper;
import dti.crmsis.back.clients.dto.Pair;
import dti.crmsis.back.dao.clientsback.ExtraInfoEntity;
import dti.crmsis.back.dao.clientsback.ProcessReportEntity;
import dti.crmsis.back.dao.crmsis.RawRequestEntity;
import dti.crmsis.back.services.Constants;
import io.quarkus.panache.common.Page;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.jboss.logging.Logger;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

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

    public void processNew() {
        int pageIndex = 0;
        int pageSize = 40;
        while (true) {
            List<RawRequestEntity> entities = getRequestEntities(pageIndex, pageSize, lastProcessedId);
            if (entities.isEmpty()) {
                break;
            }
            for (RawRequestEntity entity : entities) {
                processEntity(entity);
            }
        }
    }

    @Transactional
    protected void processEntity(RawRequestEntity requestEntity) {
        lastProcessedId = requestEntity.id;
        WebhookRequestService.JsonProxy proxy = webhookRequestService.getProxy(requestEntity.getRequestData());
        ProcessReportEntity report = new ProcessReportEntity();
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
                report.comment = objectMapper.writeValueAsString(proxy.comment);
            } catch (Exception ex) {
                logger.errorf(ex, "Error serializing comment for request ID %d", requestEntity.id);
            }

            if (wasException) {
                saveReportInSeparateTransaction(report);
            } else {
                if (proxy.exceptionInHandler) {
                    report.status = "FAILED_IN_HANDLER";
                }else{
                    report.status = "OK";
                }
                report.persist();
            }
            ExtraInfoEntity.saveLong(Constants.LAST_PROCESSED_ID, lastProcessedId);
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
    protected void saveReportInSeparateTransaction(ProcessReportEntity status) {
        ExtraInfoEntity.saveLong(Constants.LAST_PROCESSED_ID, lastProcessedId);
        status.persist();
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
