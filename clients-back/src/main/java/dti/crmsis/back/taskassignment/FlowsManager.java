package dti.crmsis.back.taskassignment;

import dti.crmsis.back.dao.app.DslFlowConfigEntity;
import dti.crmsis.back.services.webhooks.WebhookRequestService;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FlowsManager {

    public DslFlowConfigEntity determineFlow(WebhookRequestService.JsonProxy jsonProxy) {
        String mockDefinition = """
                  {
                       "flow1": {
                         "version": 1,
                         "type": "flow",
                         "initialBlock": "srcWebhook",
                         "successOnTopic": "deal.claimed",
                         "blocks": {
                           "srcWebhook": {
                             "type": "source",
                             "subscribe": [
                               "deal.received.api",
                               "deal.received.api.retry"
                             ],
                             "passTo": "assignment",
                             "delaySecs":2
                           },
                           "assignment": {
                             "type": "refAssignmentPolicy",
                             "ref": "assignmentPolicy1"
                           }
                         }
                       }
                     }
                """;
        DslFlowConfigEntity mock = new DslFlowConfigEntity();
        mock.id = 1L;
        mock.definition = mockDefinition;
        mock.version = "1";
        return mock;
    }
}
