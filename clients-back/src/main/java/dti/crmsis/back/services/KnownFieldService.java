package dti.crmsis.back.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.NullNode;
import dti.crmsis.back.clients.generated.PipedriveRestClientGeneratedV1;
import dti.crmsis.back.dao.clientsback.*;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

import java.util.*;

@ApplicationScoped
public class KnownFieldService {

    private static final Logger logger = Logger.getLogger(KnownFieldService.class);

    @Inject
    @RestClient
    PipedriveRestClientGeneratedV1 pipedriveRestClientGeneratedV1;


    @Inject
    ObjectMapper objectMapper;
    @Inject
    CustomFieldService customFieldService;
    @Inject
    JsonToEntityServiceGenerated jsonService;
    @Inject
    PagingServiceV1 pagingServiceV1;
    Map<String, List<KnownFieldEntity>> allKnown = new HashMap<>();
    @Inject
    EntityManager entityManager;


    FieldStatus calculateFieldStatus(String entity, String field) {
        if (field.equals("id")) {
            return FieldStatus.IN_ENTITY_TABLE;
        }
        List<KnownFieldEntity> knownFieldEntities = allKnown.get(entity);
        if (knownFieldEntities == null) { // unknown entity - let it be
            return FieldStatus.IN_ENTITY_TABLE;
        }
        Optional<KnownFieldEntity> fieldEntity = knownFieldEntities.stream()
                .filter(knownFieldEntity ->
                        Objects.equals(knownFieldEntity.nameInJson, field)
                ).findAny();
        if (fieldEntity.isEmpty()) {
            return FieldStatus.UNKNOWN;
        }
        KnownFieldEntity knownFieldEntity = fieldEntity.get();
        return knownFieldEntity.inBaseTable ? FieldStatus.IN_ENTITY_TABLE : FieldStatus.CUSTOM;
    }

    public void init() {
        getAllKnownFields();
    }


    @Transactional
    protected void getAllKnownFields() {
        PanacheQuery<KnownFieldEntity> all = KnownFieldEntity.<KnownFieldEntity>findAll();
        all.stream().forEach(entity ->
                {
                    entityManager.detach(entity);
                    allKnown.computeIfAbsent(entity.mainEntityTypeName, k -> new ArrayList<>()).add(entity);
                }
        );
    }


    public List<PanacheEntityBase> ensureAllFieldsAreKnown(JsonNode node, String entityName) {
        return traverseJson(node, entityName).stream().filter(Objects::nonNull).toList();
    }

    public List<PanacheEntityBase> traverseJson(JsonNode node, String entityName) {
        List<PanacheEntityBase> entities = new ArrayList<>();
        if (node.isObject()) {
            Long baseEntityId = node.get("id").asLong();
            Iterator<Map.Entry<String, JsonNode>> fields = node.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> entry = fields.next();
                String key = entry.getKey();
                JsonNode value = entry.getValue();

                if ("custom_fields".equals(key) && value.isObject()) {
                    value.fields().forEachRemaining(field ->
                            entities.addAll(processField(entityName, baseEntityId, field.getKey(), field.getValue()))
                    );
                } else if (!value.isObject()) {  // Обычные поля JSON (но НЕ вложенные объекты)
                    entities.addAll(processField(entityName, baseEntityId, key, value));
                }
            }
        }
        return entities;
    }

    List<PanacheEntityBase> processField(String entityName, Long baseEntityId, String fieldName, JsonNode fieldValue) {
        List<PanacheEntityBase> customFieldEntities = new ArrayList<>();
        List<PanacheEntityBase> entities = new ArrayList<>();
        FieldStatus fieldStatus = calculateFieldStatus(entityName, fieldName);
        if (fieldStatus == FieldStatus.CUSTOM) {
            PanacheEntityBase panacheEntityBase = customFieldService.saveCustomField(entityName, baseEntityId, fieldName,
                    (fieldValue != null && !fieldValue.isNull()) ? jsonService.writeNodeAsString(fieldValue) : null);
            customFieldEntities.add(panacheEntityBase);

        } else if (fieldStatus == FieldStatus.UNKNOWN) {
            EntityType entityType = EntityType.fromJson(entityName);
            switch (entityType) {
                case other -> {
                    logger.warn("UNKNOWN " + entityType);
                }
                case activity -> {
                    String response = pipedriveRestClientGeneratedV1.getActivityFieldsAsJson();
                    JsonNode jsonNode = getJsonNode(response);
                    if (jsonNode.get("success") != null && jsonNode.get("success").asBoolean()) {
                        JsonNode jsonArray = jsonNode.path("data");
                        for (JsonNode node : jsonArray) {
                            JsonToEntityServiceAnswer<RefActivityFieldEntity, ?, ?> answer =
                                    jsonService.toRefActivityFieldEntity(node);
                            List<PanacheEntityBase> newFields = filterAllUnknownFields(entityName, answer.getEntities());
                            entities.addAll(newFields);
                        }
                    }
                }
                case deal -> {
                    pagingServiceV1.fetchAllDataNew(
                            0L,
                            start -> pipedriveRestClientGeneratedV1.getDealFieldsAsJson(
                                    start, Constants.PAGE_LIMIT),
                            (String json, Long rootEvent) ->
                            {
                                JsonNode jsonNode = getJsonNode(json);
                                if (jsonNode.get("success") != null && jsonNode.get("success").asBoolean()) {
                                    JsonNode jsonArray = jsonNode.path("data");
                                    for (JsonNode node : jsonArray) {
                                        JsonToEntityServiceAnswer<RefDealFieldEntity, ?, ?> answer =
                                                jsonService.toRefDealFieldEntity(node);
                                        List<PanacheEntityBase> newFields = filterAllUnknownFields(entityName, answer.getEntities());
                                        entities.addAll(newFields);
                                    }
                                }
                                return 0L;
                            }
                    );
                }
                case lead -> {
                    logger.warn("Unexpected LEAD to be extended with custom fields");
                }
                case note -> {
                    logger.warn("Unexpected NOTE to be extended with custom fields");
                }
                case organization -> {
                    pagingServiceV1.fetchAllDataNew(
                            0L,
                            start -> pipedriveRestClientGeneratedV1.getOrganizationFieldsAsJson(
                                    start, Constants.PAGE_LIMIT),
                            (String json, Long rootEvent) ->
                            {
                                JsonNode jsonNode = getJsonNode(json);
                                if (jsonNode.get("success") != null && jsonNode.get("success").asBoolean()) {
                                    JsonNode jsonArray = jsonNode.path("data");
                                    for (JsonNode node : jsonArray) {
                                        JsonToEntityServiceAnswer<RefOrganizationFieldEntity, ?, ?> answer =
                                                jsonService.toRefOrganizationFieldEntity(node);
                                        List<PanacheEntityBase> newFields = filterAllUnknownFields(entityName, answer.getEntities());
                                        entities.addAll(newFields);
                                    }
                                }
                                return 0L;
                            }
                    );
                }
                case person -> {
                    pagingServiceV1.fetchAllDataNew(
                            0L,
                            start -> pipedriveRestClientGeneratedV1.getPersonFieldsAsJson(
                                    start, Constants.PAGE_LIMIT),
                            (String json, Long rootEvent) -> {
                                JsonNode jsonNode = getJsonNode(json);
                                if (jsonNode.get("success") != null && jsonNode.get("success").asBoolean()) {
                                    JsonNode jsonArray = jsonNode.path("data");
                                    for (JsonNode node : jsonArray) {
                                        JsonToEntityServiceAnswer<RefPersonFieldEntity, ?, ?> answer =
                                                jsonService.toRefPersonFieldEntity(node);
                                        List<PanacheEntityBase> newFields = filterAllUnknownFields(entityName, answer.getEntities());
                                        entities.addAll(newFields);
                                    }
                                }
                                return 0L;
                            }
                    );
                }
                case pipeline -> {
                    logger.warn("Unexpected PIPELINE to be extended with custom fields");
                }
                case product -> {
                    pagingServiceV1.fetchAllDataNew(
                            0L,
                            start -> pipedriveRestClientGeneratedV1.getProductFieldsAsJson(
                                    start, Constants.PAGE_LIMIT),
                            (String json, Long rootEvent) -> {
                                JsonNode jsonNode = getJsonNode(json);
                                if (jsonNode.get("success") != null && jsonNode.get("success").asBoolean()) {
                                    JsonNode jsonArray = jsonNode.path("data");
                                    for (JsonNode node : jsonArray) {
                                        JsonToEntityServiceAnswer<RefProductFieldEntity, ?, ?> answer =
                                                jsonService.toRefProductFieldEntity(node);
                                        List<PanacheEntityBase> newFields = filterAllUnknownFields(entityName, answer.getEntities());
                                        entities.addAll(newFields);
                                    }
                                }
                                return 0L;
                            }
                    );
                }
                case stage -> {
                    logger.warn("Unexpected STAGE to be extended with custom fields");

                }
                case user -> {
                    logger.warn("Unexpected USER to be extended with custom fields");
                }
            }

            Optional<RefField> first = entities.stream()
                    .map(panacheEntityBase -> (RefField) panacheEntityBase)
                    .filter(refField -> refField.getKey().equals(fieldName))
                    .findFirst();

            if (first.isEmpty()) {
                PanacheEntityBase entity = null;
                switch (entityType) {
                    case activity -> {
                        RefActivityFieldEntity fieldEntity = new RefActivityFieldEntity();
                        fieldEntity.key = fieldName;
                        fieldEntity.name = "UNKNOWN_NAME";
                        entity = fieldEntity;
                    }
                    case deal -> {
                        RefDealFieldEntity fieldEntity = new RefDealFieldEntity();
                        fieldEntity.key = fieldName;
                        fieldEntity.name = "UNKNOWN_NAME";
                        entity = fieldEntity;
                    }
                    case organization -> {
                        RefOrganizationFieldEntity fieldEntity = new RefOrganizationFieldEntity();
                        fieldEntity.key = fieldName;
                        fieldEntity.name = "UNKNOWN_NAME";
                        entity = fieldEntity;
                    }
                    case person -> {
                        RefPersonFieldEntity fieldEntity = new RefPersonFieldEntity();
                        fieldEntity.key = fieldName;
                        fieldEntity.name = "UNKNOWN_NAME";
                        entity = fieldEntity;
                    }
                    case product -> {
                        RefProductFieldEntity fieldEntity = new RefProductFieldEntity();
                        fieldEntity.key = fieldName;
                        fieldEntity.name = "UNKNOWN_NAME";
                        entity = fieldEntity;
                    }
                    default -> logger.error("UNKNOWN TYPE " + entityType);
                }
                PanacheEntityBase panacheEntityBase = customFieldService.saveCustomField(entityName, baseEntityId, fieldName,
                        (fieldValue != null && !fieldValue.isNull()) ? jsonService.writeNodeAsString(fieldValue) : null);
                customFieldEntities.add(panacheEntityBase);
                if (entity != null) {
                    entities.add(entity);
                }
            }
            saveAsKnown(entityName, entities, entities);
        }

        List<PanacheEntityBase> result = new ArrayList<>();
        result.addAll(entities);
        result.addAll(customFieldEntities);

        return result;
    }

    private void saveAsKnown(String entityName, List<PanacheEntityBase> newFields, List<PanacheEntityBase> entities) {
        for (PanacheEntityBase entity : newFields) {
            if (entity instanceof RefPersonFieldEntity refField) {
                entities.add(addKnownField(entityName, refField.getKey()));
            }
        }
    }


    private JsonNode getJsonNode(String json) {
        try {
            return objectMapper.readTree(json);
        } catch (JsonProcessingException e) {
            logger.warn(e.getMessage(), e);
            logger.warn("problem json " + json);
            return NullNode.getInstance();
        }
    }

    private KnownFieldEntity addKnownField(String mainEntityClassName, String customFieldName) {
        KnownFieldEntity entity = new KnownFieldEntity();
        entity.nameInJson = customFieldName;
        entity.mainEntityTypeName = mainEntityClassName;
        List<KnownFieldEntity> knownFieldEntities = allKnown.get(mainEntityClassName);
        knownFieldEntities.add(entity);
        return entity;
    }

    private List<PanacheEntityBase> filterAllUnknownFields(String entityName, List<? extends RefField> entitiesAndCustomFields) {
        return entitiesAndCustomFields.stream()
                .filter(refField -> calculateFieldStatus(entityName, refField.getKey()) == FieldStatus.UNKNOWN)
                .map(panacheEntityBase -> (PanacheEntityBase) panacheEntityBase)
                .toList();
    }


    enum FieldStatus {
        IN_ENTITY_TABLE,
        CUSTOM,
        UNKNOWN
    }

    enum EntityType {
        activity,
        deal,
        lead,
        note,
        organization,
        person,
        pipeline,
        product,
        stage,
        user,
        other;

        public static EntityType fromJson(String entityType) {
            try {
                return EntityType.valueOf(entityType.toLowerCase());// todo fix
            } catch (IllegalArgumentException e) {
                return other;
            }
        }
    }

}
