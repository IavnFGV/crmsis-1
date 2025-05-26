package dti.crmsis.back.services.webhooks;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ChangeDealHandler extends CreateDealHandler {

    @Override
    public boolean canProcess(WebhookRequestService.JsonProxy proxy) {
        return "deal".equals(proxy.type) && "change".equals(proxy.action);
    }
}
