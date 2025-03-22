package dti.crmsis.back.services.webhooks;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dti.crmsis.back.clients.dto.Pair;
import dti.crmsis.back.dao.clientsback.ExtraInfoEntity;
import dti.crmsis.back.dao.clientsback.WebhookRequestProcessStatus;
import dti.crmsis.back.dao.crmsis.RawRequestEntity;
import dti.crmsis.back.services.Constants;
import io.quarkus.panache.common.Page;
import io.quarkus.runtime.Startup;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.jboss.logging.Logger;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@ApplicationScoped
public class WebhookRequestsHandler {

    public Set<Pair<String,String>> processed = new HashSet<>();


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
        WebhookRequestProcessStatus status = new WebhookRequestProcessStatus();
        status.localId = requestEntity.id;
        status.correlationId = proxy.metaCorrelationId;
        status.idPipedrive = proxy.metaId;
        if (status.correlationId == null || status.idPipedrive == null) {
            logger.error("Invalid request data");
            logger.error(requestEntity.getRequestData());
            throw new RuntimeException("Invalid request data " + requestEntity.getRequestData());
        }
        status.status = proxy.isReady ? "OK" : "FAILED JSON";

        try {
            process(proxy);
            ExtraInfoEntity.saveLong(Constants.LAST_PROCESSED_ID, lastProcessedId);
            status.comment = objectMapper.writeValueAsString(proxy.comment);
            status.persist();
        } catch (Exception e) {
            try {
                status.comment = objectMapper.writeValueAsString(proxy.comment);
            } catch (JsonProcessingException ex) {
                throw new RuntimeException(ex);
            }
            status.status = "FAILED ENTITY";
            status.comment += " "+e.getMessage();
            logger.error("Failed to process request", e);
            saveReportInSeparateTransaction(status);
        }
    }

    private void process(WebhookRequestService.JsonProxy proxy) {
        boolean processedAtLeastOnce = false;
        this.processed.add(new Pair<>(proxy.type, proxy.action));// dlete this
        for (ProxyHandler handler : handlersCollector.getHandlers()) {
            if (handler.canProcess(proxy)) {
                proxy.addComment(handler.getClass().getSimpleName(), "Can process");
                try {
                    handler.handle(proxy);
                } catch (JsonProcessingException e) {
                    logger.warn(e.getMessage(),e);
                    proxy.addComment(handler.getClass().getSimpleName()+"_exception", e.getClass().getSimpleName());
                    proxy.addComment(handler.getClass().getSimpleName()+"_message", e.getMessage());
                }
                processedAtLeastOnce = true;
            }
        }
        if (!processedAtLeastOnce) {
            proxy.addComment("WebhookRequestsHandler", "No handler found");
        }
    }

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    protected void saveReportInSeparateTransaction(WebhookRequestProcessStatus status) {
        status.persist();
    }


    @Transactional
    protected List<RawRequestEntity> getRequestEntities(int pageIndex, int pageSize, Long idSelector) {
        return RawRequestEntity.find("id > ?1", idSelector)
                .page(Page.of(pageIndex, pageSize))
                .list();
    }


    @Startup(Constants.LAST_PROCESSED_ID_EXTRACT_PRIORITY)
    public void initLastId() {
        // Initialize the last processed ID
        Long longByName = ExtraInfoEntity.getLongByName(Constants.LAST_PROCESSED_ID);
        lastProcessedId = null == longByName ?0:longByName;
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
