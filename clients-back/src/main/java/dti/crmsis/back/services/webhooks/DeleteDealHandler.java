package dti.crmsis.back.services.webhooks;

import com.fasterxml.jackson.databind.JsonNode;
import dti.crmsis.back.dao.pd.DealEntity;
import dti.crmsis.back.services.JsonToEntityServiceAnswer;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class DeleteDealHandler extends AbstractHandler<DealEntity>{

    @Override
    public boolean canProcess(WebhookRequestService.JsonProxy proxy) {
        return "deal".equals(proxy.type) && "delete".equals(proxy.action);
    }

    @Override
    @Transactional(value = Transactional.TxType.REQUIRED)
    public void handle(WebhookRequestService.JsonProxy proxy) {
        DealEntity entity = new DealEntity();
        entity.isDeleted = true;
        entity.idPipedrive = proxy.entityIdPipedrive;
        entity.updateTime = proxy.timeStamp;
        setSourceRequestId(proxy.requestId, List.of(entity));
        persistAll(List.of(entity));
    }

    @Override
    protected JsonToEntityServiceAnswer<DealEntity, PanacheEntityBase, PanacheEntityBase> jsonToEntities(JsonNode data) {
        throw new UnsupportedOperationException("Nothing to convert for delete action");
    }
}
