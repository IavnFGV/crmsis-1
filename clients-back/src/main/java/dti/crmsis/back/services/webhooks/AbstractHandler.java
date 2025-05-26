package dti.crmsis.back.services.webhooks;

import com.fasterxml.jackson.databind.JsonNode;
import dti.crmsis.back.dao.pd.HasSourceRequestId;
import dti.crmsis.back.services.JsonToEntityServiceAnswer;
import dti.crmsis.back.services.JsonToEntityServiceGenerated;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;

public abstract class AbstractHandler<T extends PanacheEntityBase> implements ProxyHandler {


    @Inject
    JsonToEntityServiceGenerated jsonToEntityServiceGenerated;

    abstract protected JsonToEntityServiceAnswer<T, PanacheEntityBase, PanacheEntityBase> jsonToEntities(JsonNode data);

    protected void processAnswer(JsonToEntityServiceAnswer<T, PanacheEntityBase, PanacheEntityBase> answer, Long requestId) {
        setSourceRequestId(requestId, answer.getEntities());
        setSourceRequestId(requestId, answer.getCustomFieldEntities());
        setSourceRequestId(requestId, answer.getCustomFieldsRefs());
        persistAll(answer.getEntities());
        persistAll(answer.getCustomFieldEntities());
        persistAll(answer.getCustomFieldsRefs());
    }

    protected void persistAll(List<? extends PanacheEntityBase> entities) {
        PanacheEntityBase.persist(entities);
    }

    protected void setSourceRequestId(Long requestId, List<? extends PanacheEntityBase> entities) {
        if (entities != null) {
            entities.forEach(panacheEntityBase -> ((HasSourceRequestId) panacheEntityBase).setSourceRequestId(requestId));
        }

    }

    @Override
    @Transactional(value = Transactional.TxType.REQUIRED)
    public void handle(WebhookRequestService.JsonProxy proxy) {
        JsonNode data = proxy.jsonNode.path("data");
        JsonToEntityServiceAnswer<T, PanacheEntityBase, PanacheEntityBase> answer = jsonToEntities(data);
        processAnswer(answer, proxy.requestId);
    }
}
