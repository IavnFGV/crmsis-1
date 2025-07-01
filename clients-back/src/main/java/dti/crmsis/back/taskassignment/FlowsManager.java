package dti.crmsis.back.taskassignment;

import dti.crmsis.back.dao.app.DslConfigEntity;
import dti.crmsis.back.dao.app.DslConfigEntityType;
import dti.crmsis.back.services.webhooks.WebhookRequestService;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class FlowsManager {

    public DslConfigEntity determineFlow(WebhookRequestService.JsonProxy jsonProxy) {
        List<DslConfigEntity> configsWithMaxVersion = DslConfigEntity.findConfigsWithMaxVersion(DslConfigEntityType.FOR_FLOW);
        return configsWithMaxVersion.get(configsWithMaxVersion.size()-1);
    }
}
