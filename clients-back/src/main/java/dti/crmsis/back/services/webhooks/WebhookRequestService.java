package dti.crmsis.back.services.webhooks;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import dti.crmsis.back.clients.dto.KeyValueStore;
import dti.crmsis.back.services.TimeZoneService;
import dti.crmsis.back.utils.DateUtils;
import jakarta.enterprise.context.ApplicationScoped;
import org.jboss.logging.Logger;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Optional;
import java.util.UUID;

@ApplicationScoped
public class WebhookRequestService {

    public static Logger logger = Logger.getLogger(WebhookRequestService.class);

    public JsonProxy getProxy(Long requestId, String json) {
        return new JsonProxy(requestId, json);
    }

    public static class JsonProxy {

        public Long requestId;
        public UUID metaCorrelationId;
        public Integer metaCorrelationIdSuffix;
        public KeyValueStore comment = new KeyValueStore();
        public final String json;
        public JsonNode jsonNode;
        public boolean isReady = true;
        public String type;
        public String action;
        public Long entityIdPipedrive;
        public LocalDateTime timeStamp;
        public boolean exceptionInHandler;
        public LocalDateTime actionTime;

        public JsonProxy(Long requestId, String json) {
            this.json = json;
            this.requestId = requestId;
        }

        public void init(ObjectMapper objectMapper) {
            try {
                JsonNode jsonNode = objectMapper.readTree(json);
                this.jsonNode = jsonNode;
                JsonNode meta = jsonNode.path("meta");

                JsonNode type = meta.path("entity");
                JsonNode pipedriveId = meta.path("entity_id");
                JsonNode timeStamp = meta.path("timestamp");
                JsonNode action = meta.path("action");
                JsonNode correlationUuidID = meta.path("correlation_id");

                checkNode(correlationUuidID, "meta.correlation_id", () -> parseCorrelationID(correlationUuidID));
                checkNode(type, "meta.entity", () -> this.type = type.textValue());
                checkNode(action, "meta.action", () -> this.action = action.textValue());
                checkNode(pipedriveId, "meta.entity_id", () -> this.entityIdPipedrive = pipedriveId.asLong());
                checkNode(timeStamp, "meta.timestamp", () -> this.timeStamp = toLocalDateTime(timeStamp));
                calculateActionTime();
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
                logger.error(json);
                throw new JsonProblemException(e.getMessage(), e);
            }
        }

        private void calculateActionTime() {
            if ("change".equals(this.action)) {
                JsonNode data = this.jsonNode.path("data");
                String updateTime = data.path("update_time").asText();
                this.actionTime = DateUtils.parseDateTime(updateTime);
                return;
            }
            if ("create".equals(this.action)) {
                JsonNode data = this.jsonNode.path("data");
                String createTime = data.path("add_time").asText();
                this.actionTime = DateUtils.parseDateTime(createTime);
                return;
            }
            if ("delete".equals(this.action)) {
                this.actionTime = this.timeStamp;
                return;
            }
        }

        private void parseCorrelationID(JsonNode correlationUuidID) {
            ParsedCorrelationId correlationId = ParsedCorrelationId.parse(correlationUuidID.asText());
            this.metaCorrelationId = correlationId.uuid;
            correlationId.getSuffix().ifPresent(suffix -> this.metaCorrelationIdSuffix = suffix);
        }

        private LocalDateTime toLocalDateTime(JsonNode timeStamp) {
            LocalDateTime localDateTime = DateUtils.parseDateTime(timeStamp.asText());
            if (localDateTime == null) {
                throw new RuntimeException("cant parse timestamp " + timeStamp.asText());
            }
            return localDateTime;
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


    public static class ParsedCorrelationId {
        private final UUID uuid;
        private final Integer suffix; // теперь может быть null

        public ParsedCorrelationId(UUID uuid, Integer suffix) {
            this.uuid = uuid;
            this.suffix = suffix;
        }

        public UUID getUuid() {
            return uuid;
        }

        public Optional<Integer> getSuffix() {
            return Optional.ofNullable(suffix);
        }


        public static ParsedCorrelationId parse(String correlationId) {
            if (correlationId == null) {
                throw new IllegalArgumentException("Correlation ID is null");
            }

            String[] parts = correlationId.split("-");

            if (parts.length == 5) {
                // Чистый UUID без суффикса
                UUID uuid = UUID.fromString(correlationId);
                return new ParsedCorrelationId(uuid, null);
            } else if (parts.length == 6) {
                // UUID + числовой суффикс
                String uuidPart = String.join("-", Arrays.copyOf(parts, 5));
                UUID uuid = UUID.fromString(uuidPart);
                int suffix = Integer.parseInt(parts[5]);
                return new ParsedCorrelationId(uuid, suffix);
            } else {
                throw new IllegalArgumentException("Invalid correlation ID format: " + correlationId);
            }
        }


        @Override
        public String toString() {
            return "ParsedCorrelationId{" +
                   "uuid=" + uuid +
                   ", suffix=" + suffix +
                   '}';
        }
    }


}
