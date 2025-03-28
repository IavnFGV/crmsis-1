package dti.crmsis.back.services.webhooks;


import com.fasterxml.jackson.databind.JsonNode;
import dti.crmsis.back.dao.clientsback.DealEntity;
import dti.crmsis.back.services.JsonToEntityServiceAnswer;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.enterprise.context.ApplicationScoped;
import org.jboss.logging.Logger;

@ApplicationScoped
public class CreateDealHandler extends AbstractHandler<DealEntity> {

    @Override
    protected JsonToEntityServiceAnswer<DealEntity, PanacheEntityBase, PanacheEntityBase> jsonToEntities(JsonNode data) {
        return jsonToEntityServiceGenerated.toDealEntity(data);
    }

    @Override
    public boolean canProcess(WebhookRequestService.JsonProxy proxy) {
        return "deal".equals(proxy.type) && "create".equals(proxy.action);
    }


}
