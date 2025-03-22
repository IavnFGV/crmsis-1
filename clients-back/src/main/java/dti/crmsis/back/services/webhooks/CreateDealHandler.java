package dti.crmsis.back.services.webhooks;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import dti.crmsis.back.dao.clientsback.DealCustomFieldEntity;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.jboss.logging.Logger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@ApplicationScoped
public class CreateDealHandler implements ProxyHandler {

    private static Logger logger = Logger.getLogger(WebhookRequestService.class);


    @Inject
    ObjectMapper objectMapper;

    @Override
    public boolean canProcess(WebhookRequestService.JsonProxy proxy) {
        return "deal".equals(proxy.type) && "create".equals(proxy.action);
    }

    @Override
    public void handle(WebhookRequestService.JsonProxy proxy) throws JsonProcessingException {
        JsonNode data = proxy.jsonNode.path("data");

        JsonNode customFields = data.path("custom_fields");
        if(customFields.isMissingNode()){
            logger.warn("NO_CUSTOM_FIELDS");
            proxy.addComment("NO_CUSTOM_FIELDS","AS_IS");
            return;
        }
        List<DealCustomFieldEntity> list = new ArrayList<DealCustomFieldEntity>();
        for (Iterator<String> it = customFields.fieldNames(); it.hasNext(); ) {
            String customFieldName = it.next();
            JsonNode value = customFields.get(customFieldName);
            if (value != null && !value.isNull()) {
                DealCustomFieldEntity customFieldEntity = new DealCustomFieldEntity();
                customFieldEntity.correlationId = proxy.metaCorrelationId;
                customFieldEntity.value = objectMapper.writeValueAsString(value);
                customFieldEntity.key = customFieldName;
                customFieldEntity.mainEntityId = proxy.entityIdPipedrive;
                list.add(customFieldEntity);
            }


        }


    }


}
