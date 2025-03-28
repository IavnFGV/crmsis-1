package dti.crmsis.back.services.webhooks;

public interface ProxyHandler {
    void handle(WebhookRequestService.JsonProxy proxy);

    boolean canProcess(WebhookRequestService.JsonProxy proxy);
}
