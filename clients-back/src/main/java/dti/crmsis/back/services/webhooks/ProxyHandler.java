package dti.crmsis.back.services.webhooks;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface ProxyHandler {
    void handle(WebhookRequestService.JsonProxy proxy) throws JsonProcessingException;

    boolean canProcess(WebhookRequestService.JsonProxy proxy);

}
