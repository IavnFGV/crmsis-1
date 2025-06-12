package dti.crmsis.back.messaging;

import com.fasterxml.jackson.databind.JsonNode;
import dti.crmsis.back.services.webhooks.WebhookRequestService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class DealClaimedMessageProducer {
    @Inject
    BusMessageProcessor busMessageProcessor;

    void handle(WebhookRequestService.JsonProxy proxy) {
        JsonNode data = proxy.jsonNode.path("data");
        JsonNode ownerId = data.path("owner_id");
        JsonNode newStageId = data.path("stage_id");
        JsonNode previous = proxy.jsonNode.path("previous");
        if (previous.isMissingNode() || previous.isEmpty()) {
            return;
        }
        if ("deal".equals(proxy.type) &&
            "change".equals(proxy.action)
        ) {
            JsonNode stageId = previous.path("stage_id");
            if (!stageId.isMissingNode() &&
                !newStageId.toString().equals(stageId.toString())) {
                busMessageProcessor.publish(
                        TopicUtils.getDealClaimedTopic("" + proxy.entityIdPipedrive), proxy.entityIdPipedrive+"");
            }
        }
    }
}
