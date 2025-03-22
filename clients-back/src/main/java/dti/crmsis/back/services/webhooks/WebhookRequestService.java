package dti.crmsis.back.services.webhooks;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import dti.crmsis.back.clients.dto.KeyValueStore;
import dti.crmsis.back.dao.clientsback.DealEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.jboss.logging.Logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@ApplicationScoped
public class WebhookRequestService {

    public static Logger logger = Logger.getLogger(WebhookRequestService.class);

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ISO_DATE_TIME;

    @Inject
    ObjectMapper objectMapper;


    public JsonProxy getProxy(String json) {
        JsonProxy jsonProxy = new JsonProxy(json);
        try {
            jsonProxy.init(objectMapper);
        } catch (JsonProcessingException e) {
            jsonProxy.isReady = false;
            jsonProxy.addComment("exception",e.getMessage());
            addComment(e, jsonProxy);
            logger.warn(e.getMessage());
            logger.warn(json);
        }
        return jsonProxy;
    }

    private static void addComment(JsonProcessingException e, JsonProxy jsonProxy) {
        jsonProxy.addComment("exception", e.getMessage());
    }

    public static class JsonProxy {

        public UUID metaCorrelationId ;
        public UUID metaId ;
        public KeyValueStore comment=new KeyValueStore();
        public final String json;
        public JsonNode jsonNode;
        public boolean isReady = true;
        public String type;
        public String action;
        public Long entityIdPipedrive;
        public LocalDateTime timeStamp;

        public JsonProxy(String json) {
            this.json = json;
        }

        public void init(ObjectMapper objectMapper) throws JsonProcessingException {
            JsonNode jsonNode = objectMapper.readTree(json);
            this.jsonNode = jsonNode;
            JsonNode meta = jsonNode.path("meta");

            JsonNode type = meta.path("entity");
            JsonNode pipedriveId = meta.path("entity_id");
            JsonNode timeStamp = meta.path("timestamp");
            JsonNode action = meta.path("action");
            JsonNode uuidID = meta.path("id");
            JsonNode correlationUuidID = meta.path("correlation_id");



            checkNode(type, "meta.entity", () -> this.type = type.textValue());
            checkNode(action, "meta.action", () -> this.action = action.textValue());
            checkNode(pipedriveId, "meta.entity_id", () -> this.entityIdPipedrive = pipedriveId.asLong());
            checkNode(timeStamp, "meta.timestamp", () -> this.timeStamp = LocalDateTime.parse(timeStamp.asText(), FORMATTER));
            checkNode(uuidID, "meta.id", () -> this.metaId = UUID.fromString(uuidID.asText()));
            checkNode(correlationUuidID, "meta.correlation_id", () -> this.metaCorrelationId = UUID.fromString(correlationUuidID.asText()));

        }

        private void checkNode(JsonNode type, String fieldName, Runnable okAction) {
            if (type.isMissingNode()) {
                addComment("missing_node", fieldName);
                logger.warn("Missing node for " + fieldName);
                logger.warn(json);
            }
            okAction.run();
        }

        public void addComment(String code, String comment) {
            this.comment.addValue(code, comment);
            isReady = false;
        }
    }

    PanacheEntityBase toEntity(JsonProxy jsonProxy) {
        if (!jsonProxy.isReady) {
            return null;
        }

        if (jsonProxy.type.equals("deal")) {
            DealEntity dealEntity = new DealEntity();
            dealEntity.idPipedrive = jsonProxy.entityIdPipedrive;

            return dealEntity;
        }
        return null;
    }


}
