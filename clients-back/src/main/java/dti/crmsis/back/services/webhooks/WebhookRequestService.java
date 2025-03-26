package dti.crmsis.back.services.webhooks;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import dti.crmsis.back.clients.dto.KeyValueStore;
import dti.crmsis.back.services.TimeZoneService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
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

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ISO_DATE_TIME;

    @Inject
    TimeZoneService timeZoneService;

    public JsonProxy getProxy(String json) {
        return new JsonProxy(json);
    }

    private static void addComment(JsonProcessingException e, JsonProxy jsonProxy) {
        jsonProxy.addComment("exception", e.getMessage());
    }

    public static class JsonProxy {

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

        public JsonProxy(String json) {
            this.json = json;
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

                checkNode(correlationUuidID, "meta.correlation_id",()-> parseCorrelationID(correlationUuidID));
                checkNode(type, "meta.entity", () -> this.type = type.textValue());
                checkNode(action, "meta.action", () -> this.action = action.textValue());
                checkNode(pipedriveId, "meta.entity_id", () -> this.entityIdPipedrive = pipedriveId.asLong());
                checkNode(timeStamp, "meta.timestamp", () -> this.timeStamp = toLocalDateTime(timeStamp));
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
                logger.error(json);
                throw new JsonProblemException(e.getMessage(), e);
            }
        }

        private void parseCorrelationID(JsonNode correlationUuidID) {
            ParsedCorrelationId correlationId = ParsedCorrelationId.parse(correlationUuidID.asText());
            this.metaCorrelationId = correlationId.uuid;
            correlationId.getSuffix().ifPresent(suffix -> this.metaCorrelationIdSuffix = suffix);
        }

        private LocalDateTime toLocalDateTime(JsonNode timeStamp) {
            LocalDateTime result = null;
            try {
                result = LocalDateTime.parse(timeStamp.asText(), FORMATTER);
            } catch (Exception e) {
                result = LocalDateTime.ofInstant(Instant.ofEpochMilli(timeStamp.asLong()),
                        TimeZoneService.getInstance().getZoneId());
            }
            return result;
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
