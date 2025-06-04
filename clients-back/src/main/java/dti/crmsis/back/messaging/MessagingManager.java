package dti.crmsis.back.messaging;

import dti.crmsis.back.services.webhooks.WebhookRequestService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class MessagingManager {
    @Inject
    DealReceivedMessageProducer dealReceivedMessageProducer;


    public void handleJsonProxyStart(WebhookRequestService.JsonProxy proxy){
        dealReceivedMessageProducer.handle(proxy);
    }

    public void handleJsonProxyFinish(WebhookRequestService.JsonProxy proxy){

    }
}
