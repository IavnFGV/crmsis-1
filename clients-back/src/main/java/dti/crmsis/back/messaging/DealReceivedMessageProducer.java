package dti.crmsis.back.messaging;

import com.fasterxml.jackson.databind.JsonNode;
import dti.crmsis.back.services.webhooks.WebhookRequestService;
import io.vertx.core.eventbus.EventBus;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class DealReceivedMessageProducer {

    @Inject
    EventBus eventBus;

    void handle(WebhookRequestService.JsonProxy proxy) {
        JsonNode data = proxy.jsonNode.path("data");
        JsonNode ownerId = data.path("owner_id");
        if (ownerId.isMissingNode() || !"23761519".equals(ownerId.asText())) {
            return;
        }
        if ("deal".equals(proxy.type) &&
            "create".equals(proxy.action)
        ) {
            eventBus.publish(TopicUtils.DEAL_RECEIVED_API, proxy);
        }
    }
}
