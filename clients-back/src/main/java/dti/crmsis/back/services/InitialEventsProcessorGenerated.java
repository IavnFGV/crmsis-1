package dti.crmsis.back.services;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import dti.crmsis.back.dao.pd.*;
import dti.crmsis.back.utils.DateUtils;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.panache.common.Page;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import org.jboss.logging.Logger;

import java.io.*;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;

@ApplicationScoped
public class InitialEventsProcessorGenerated {

    private static final Logger logger = Logger.getLogger(InitialEventsProcessorGenerated.class);

    @Inject private ObjectMapper objectMapper;

    @Inject private ThreadPoolExecutor executorService;

    @Inject JsonToEntityServiceGenerated jsonService;
    private LocalDateTime webhookRegistered;

    public void processInitialEvents() {
        try {
            initRef_Activity_Fields();
            initRef_Deal_Fields();
            initRef_Organization_Fields();
            initRef_Person_Fields();
            initRef_Product_Fields();
            initActivities();
            initActivity_Types();
            initCurrencies();
            initDeals();
            initLead_Labels();
            initLeads();
            initNotes();
            initOrganizations();
            initPersons();
            initPipelines();
            initProducts();
            initProjects();
            initRoles();
            initStages();
            initTasks();
            initUsers();
            initWebhooks();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected List<EventEntity> getEventEntities(int pageIndex, int pageSize, String entityName) {
        List<EventEntity> events =
                EventEntity.find(
                                "JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", entityName)
                        .page(Page.of(pageIndex, pageSize))
                        .list();
        return events;
    }

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public void persistEntities(List<PanacheEntityBase> entities, String entityName) {
        logger.infof("Persisting %d entities of type %s", entities.size(), entityName);
        PanacheEntityBase.persist(entities);
    }

    @Inject
    InitialEventsProcessorGenerated self;

    public void persistEntitiesAsync(List<PanacheEntityBase> entities, String entityName) {
        logger.infof(
                "active %d queue %d max %d",
                executorService.getActiveCount(),
                executorService.getQueue().size(),
                executorService.getLargestPoolSize());

        for (int i = 0; i < entities.size(); i += 100) {
            List<PanacheEntityBase> chunk = entities.subList(
                    i,
                    Math.min(i + 100, entities.size())
            );
            executorService.submit(() -> self.persistEntities(chunk, entityName));
            try {
                Thread.sleep(50);
            } catch (InterruptedException ignored) {}
        }
    }

    private synchronized LocalDateTime getWebhookRegisteredTime() {
        if (webhookRegistered == null) {
            webhookRegistered = ExtraInfoEntity.getDateTime(Constants.WEBHOOK_REGISTERED_DATETIME);
        }
        return webhookRegistered;
    }

    public void initActivities() throws IOException {
        int pageIndex = 0;
        int pageSize = 50;
        int eventsCount = 0;
        int entitiesCount = 0;
        int skippedEntitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "ACTIVITIES");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase> entities = new ArrayList<>();
                List<PanacheEntityBase> customFields = new ArrayList<>();
                List<PanacheEntityBase> customFieldRefs = new ArrayList<>();
                if (jsonNode.get("success") != null && jsonNode.get("success").asBoolean()) {
                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        LocalDateTime updateTime =
                                DateUtils.parseDateTime(node.path("update_time").asText());
                        LocalDateTime addTime =
                                DateUtils.parseDateTime(node.path("add_time").asText());
                        LocalDateTime actionTime = updateTime;
                        if (actionTime == null) {
                            actionTime = addTime;
                        }
                        if (actionTime != null) {
                            LocalDateTime webhookRegisteredTime = getWebhookRegisteredTime();
                            if (webhookRegisteredTime != null
                                    && actionTime.isAfter(webhookRegisteredTime)) {
                                // entity shows data for the operation after webhook registration -
                                // it should be in webhooks
                                logger.warn(
                                        "Skipped due to unacceptable action time. Event id = "
                                                + event.id);
                                skippedEntitiesCount++;
                                continue;
                            }
                        }
                        entitiesCount++;
                        JsonToEntityServiceAnswer<
                                        ActivityEntity, PanacheEntityBase, PanacheEntityBase>
                                answer = jsonService.toActivityEntity(node);
                        entities.addAll(answer.getEntities());
                        customFields.addAll(answer.getCustomFieldEntities());
                        customFieldRefs.addAll(answer.getCustomFieldsRefs());
                    }

                    persistEntities(customFieldRefs, "Activities_customFieldRefs");
                    persistEntities(entities, "Activities");
                    persistEntitiesAsync(customFields, "ActivitiesCustomField");
                } else {
                    logger.warn("Activities HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Activities DONE");
            pageIndex++;
System.gc(); // Переход к следующей странице
        }
        logger.info(
                "Activities processed. Events = "
                        + eventsCount
                        + ", entities = "
                        + entitiesCount
                        + ", skipped = "
                        + skippedEntitiesCount);
    }

    public void initRef_Activity_Fields() throws IOException {
        int pageIndex = 0;
        int pageSize = 50;
        int eventsCount = 0;
        int entitiesCount = 0;
        int skippedEntitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "REF_ACTIVITY_FIELDS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase> entities = new ArrayList<>();
                List<PanacheEntityBase> customFields = new ArrayList<>();
                List<PanacheEntityBase> customFieldRefs = new ArrayList<>();
                if (jsonNode.get("success") != null && jsonNode.get("success").asBoolean()) {
                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        LocalDateTime updateTime =
                                DateUtils.parseDateTime(node.path("update_time").asText());
                        LocalDateTime addTime =
                                DateUtils.parseDateTime(node.path("add_time").asText());
                        LocalDateTime actionTime = updateTime;
                        if (actionTime == null) {
                            actionTime = addTime;
                        }
                        if (actionTime != null) {
                            LocalDateTime webhookRegisteredTime = getWebhookRegisteredTime();
                            if (webhookRegisteredTime != null
                                    && actionTime.isAfter(webhookRegisteredTime)) {
                                // entity shows data for the operation after webhook registration -
                                // it should be in webhooks
                                logger.warn(
                                        "Skipped due to unacceptable action time. Event id = "
                                                + event.id);
                                skippedEntitiesCount++;
                                continue;
                            }
                        }
                        entitiesCount++;
                        JsonToEntityServiceAnswer<
                                        RefActivityFieldEntity,
                                        PanacheEntityBase,
                                        PanacheEntityBase>
                                answer = jsonService.toRefActivityFieldEntity(node);
                        entities.addAll(answer.getEntities());
                        customFields.addAll(answer.getCustomFieldEntities());
                        customFieldRefs.addAll(answer.getCustomFieldsRefs());
                    }

                    persistEntities(customFieldRefs, "Ref_Activity_Fields_customFieldRefs");
                    persistEntities(entities, "Ref_Activity_Fields");
                    persistEntitiesAsync(customFields, "Ref_Activity_FieldsCustomField");
                } else {
                    logger.warn("Ref_Activity_Fields HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Ref_Activity_Fields DONE");
            pageIndex++;
System.gc(); // Переход к следующей странице
        }
        logger.info(
                "Ref_Activity_Fields processed. Events = "
                        + eventsCount
                        + ", entities = "
                        + entitiesCount
                        + ", skipped = "
                        + skippedEntitiesCount);
    }

    public void initActivity_Types() throws IOException {
        int pageIndex = 0;
        int pageSize = 50;
        int eventsCount = 0;
        int entitiesCount = 0;
        int skippedEntitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "ACTIVITY_TYPES");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase> entities = new ArrayList<>();
                List<PanacheEntityBase> customFields = new ArrayList<>();
                List<PanacheEntityBase> customFieldRefs = new ArrayList<>();
                if (jsonNode.get("success") != null && jsonNode.get("success").asBoolean()) {
                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        LocalDateTime updateTime =
                                DateUtils.parseDateTime(node.path("update_time").asText());
                        LocalDateTime addTime =
                                DateUtils.parseDateTime(node.path("add_time").asText());
                        LocalDateTime actionTime = updateTime;
                        if (actionTime == null) {
                            actionTime = addTime;
                        }
                        if (actionTime != null) {
                            LocalDateTime webhookRegisteredTime = getWebhookRegisteredTime();
                            if (webhookRegisteredTime != null
                                    && actionTime.isAfter(webhookRegisteredTime)) {
                                // entity shows data for the operation after webhook registration -
                                // it should be in webhooks
                                logger.warn(
                                        "Skipped due to unacceptable action time. Event id = "
                                                + event.id);
                                skippedEntitiesCount++;
                                continue;
                            }
                        }
                        entitiesCount++;
                        JsonToEntityServiceAnswer<
                                        ActivityTypeEntity, PanacheEntityBase, PanacheEntityBase>
                                answer = jsonService.toActivityTypeEntity(node);
                        entities.addAll(answer.getEntities());
                        customFields.addAll(answer.getCustomFieldEntities());
                        customFieldRefs.addAll(answer.getCustomFieldsRefs());
                    }

                    persistEntities(customFieldRefs, "Activity_Types_customFieldRefs");
                    persistEntities(entities, "Activity_Types");
                    persistEntitiesAsync(customFields, "Activity_TypesCustomField");
                } else {
                    logger.warn("Activity_Types HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Activity_Types DONE");
            pageIndex++;
System.gc(); // Переход к следующей странице
        }
        logger.info(
                "Activity_Types processed. Events = "
                        + eventsCount
                        + ", entities = "
                        + entitiesCount
                        + ", skipped = "
                        + skippedEntitiesCount);
    }

    public void initCurrencies() throws IOException {
        int pageIndex = 0;
        int pageSize = 50;
        int eventsCount = 0;
        int entitiesCount = 0;
        int skippedEntitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "CURRENCIES");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase> entities = new ArrayList<>();
                List<PanacheEntityBase> customFields = new ArrayList<>();
                List<PanacheEntityBase> customFieldRefs = new ArrayList<>();
                if (jsonNode.get("success") != null && jsonNode.get("success").asBoolean()) {
                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        LocalDateTime updateTime =
                                DateUtils.parseDateTime(node.path("update_time").asText());
                        LocalDateTime addTime =
                                DateUtils.parseDateTime(node.path("add_time").asText());
                        LocalDateTime actionTime = updateTime;
                        if (actionTime == null) {
                            actionTime = addTime;
                        }
                        if (actionTime != null) {
                            LocalDateTime webhookRegisteredTime = getWebhookRegisteredTime();
                            if (webhookRegisteredTime != null
                                    && actionTime.isAfter(webhookRegisteredTime)) {
                                // entity shows data for the operation after webhook registration -
                                // it should be in webhooks
                                logger.warn(
                                        "Skipped due to unacceptable action time. Event id = "
                                                + event.id);
                                skippedEntitiesCount++;
                                continue;
                            }
                        }
                        entitiesCount++;
                        JsonToEntityServiceAnswer<
                                        CurrencieEntity, PanacheEntityBase, PanacheEntityBase>
                                answer = jsonService.toCurrencieEntity(node);
                        entities.addAll(answer.getEntities());
                        customFields.addAll(answer.getCustomFieldEntities());
                        customFieldRefs.addAll(answer.getCustomFieldsRefs());
                    }

                    persistEntities(customFieldRefs, "Currencies_customFieldRefs");
                    persistEntities(entities, "Currencies");
                    persistEntitiesAsync(customFields, "CurrenciesCustomField");
                } else {
                    logger.warn("Currencies HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Currencies DONE");
            pageIndex++;
System.gc(); // Переход к следующей странице
        }
        logger.info(
                "Currencies processed. Events = "
                        + eventsCount
                        + ", entities = "
                        + entitiesCount
                        + ", skipped = "
                        + skippedEntitiesCount);
    }

    public void initRef_Deal_Fields() throws IOException {
        int pageIndex = 0;
        int pageSize = 50;
        int eventsCount = 0;
        int entitiesCount = 0;
        int skippedEntitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "REF_DEAL_FIELDS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase> entities = new ArrayList<>();
                List<PanacheEntityBase> customFields = new ArrayList<>();
                List<PanacheEntityBase> customFieldRefs = new ArrayList<>();
                if (jsonNode.get("success") != null && jsonNode.get("success").asBoolean()) {
                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        LocalDateTime updateTime =
                                DateUtils.parseDateTime(node.path("update_time").asText());
                        LocalDateTime addTime =
                                DateUtils.parseDateTime(node.path("add_time").asText());
                        LocalDateTime actionTime = updateTime;
                        if (actionTime == null) {
                            actionTime = addTime;
                        }
                        if (actionTime != null) {
                            LocalDateTime webhookRegisteredTime = getWebhookRegisteredTime();
                            if (webhookRegisteredTime != null
                                    && actionTime.isAfter(webhookRegisteredTime)) {
                                // entity shows data for the operation after webhook registration -
                                // it should be in webhooks
                                logger.warn(
                                        "Skipped due to unacceptable action time. Event id = "
                                                + event.id);
                                skippedEntitiesCount++;
                                continue;
                            }
                        }
                        entitiesCount++;
                        JsonToEntityServiceAnswer<
                                        RefDealFieldEntity, PanacheEntityBase, PanacheEntityBase>
                                answer = jsonService.toRefDealFieldEntity(node);
                        entities.addAll(answer.getEntities());
                        customFields.addAll(answer.getCustomFieldEntities());
                        customFieldRefs.addAll(answer.getCustomFieldsRefs());
                    }

                    persistEntities(customFieldRefs, "Ref_Deal_Fields_customFieldRefs");
                    persistEntities(entities, "Ref_Deal_Fields");
                    persistEntitiesAsync(customFields, "Ref_Deal_FieldsCustomField");
                } else {
                    logger.warn("Ref_Deal_Fields HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Ref_Deal_Fields DONE");
            pageIndex++;
System.gc(); // Переход к следующей странице
        }
        logger.info(
                "Ref_Deal_Fields processed. Events = "
                        + eventsCount
                        + ", entities = "
                        + entitiesCount
                        + ", skipped = "
                        + skippedEntitiesCount);
    }

    public void initDeals() throws IOException {
        int pageIndex = 0;
        int pageSize = 50;
        int eventsCount = 0;
        int entitiesCount = 0;
        int skippedEntitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "DEALS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase> entities = new ArrayList<>();
                List<PanacheEntityBase> customFields = new ArrayList<>();
                List<PanacheEntityBase> customFieldRefs = new ArrayList<>();
                if (jsonNode.get("success") != null && jsonNode.get("success").asBoolean()) {
                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        LocalDateTime updateTime =
                                DateUtils.parseDateTime(node.path("update_time").asText());
                        LocalDateTime addTime =
                                DateUtils.parseDateTime(node.path("add_time").asText());
                        LocalDateTime actionTime = updateTime;
                        if (actionTime == null) {
                            actionTime = addTime;
                        }
                        if (actionTime != null) {
                            LocalDateTime webhookRegisteredTime = getWebhookRegisteredTime();
                            if (webhookRegisteredTime != null
                                    && actionTime.isAfter(webhookRegisteredTime)) {
                                // entity shows data for the operation after webhook registration -
                                // it should be in webhooks
                                logger.warn(
                                        "Skipped due to unacceptable action time. Event id = "
                                                + event.id);
                                skippedEntitiesCount++;
                                continue;
                            }
                        }
                        entitiesCount++;
                        JsonToEntityServiceAnswer<DealEntity, PanacheEntityBase, PanacheEntityBase>
                                answer = jsonService.toDealEntity(node);
                        entities.addAll(answer.getEntities());
                        customFields.addAll(answer.getCustomFieldEntities());
                        customFieldRefs.addAll(answer.getCustomFieldsRefs());
                    }

                    persistEntities(customFieldRefs, "Deals_customFieldRefs");
                    persistEntities(entities, "Deals");
                    persistEntitiesAsync(customFields, "DealsCustomField");
                } else {
                    logger.warn("Deals HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Deals DONE");
            pageIndex++;
System.gc(); // Переход к следующей странице
        }
        logger.info(
                "Deals processed. Events = "
                        + eventsCount
                        + ", entities = "
                        + entitiesCount
                        + ", skipped = "
                        + skippedEntitiesCount);
    }

    public void initLead_Labels() throws IOException {
        int pageIndex = 0;
        int pageSize = 50;
        int eventsCount = 0;
        int entitiesCount = 0;
        int skippedEntitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "LEAD_LABELS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase> entities = new ArrayList<>();
                List<PanacheEntityBase> customFields = new ArrayList<>();
                List<PanacheEntityBase> customFieldRefs = new ArrayList<>();
                if (jsonNode.get("success") != null && jsonNode.get("success").asBoolean()) {
                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        LocalDateTime updateTime =
                                DateUtils.parseDateTime(node.path("update_time").asText());
                        LocalDateTime addTime =
                                DateUtils.parseDateTime(node.path("add_time").asText());
                        LocalDateTime actionTime = updateTime;
                        if (actionTime == null) {
                            actionTime = addTime;
                        }
                        if (actionTime != null) {
                            LocalDateTime webhookRegisteredTime = getWebhookRegisteredTime();
                            if (webhookRegisteredTime != null
                                    && actionTime.isAfter(webhookRegisteredTime)) {
                                // entity shows data for the operation after webhook registration -
                                // it should be in webhooks
                                logger.warn(
                                        "Skipped due to unacceptable action time. Event id = "
                                                + event.id);
                                skippedEntitiesCount++;
                                continue;
                            }
                        }
                        entitiesCount++;
                        JsonToEntityServiceAnswer<
                                        LeadLabelEntity, PanacheEntityBase, PanacheEntityBase>
                                answer = jsonService.toLeadLabelEntity(node);
                        entities.addAll(answer.getEntities());
                        customFields.addAll(answer.getCustomFieldEntities());
                        customFieldRefs.addAll(answer.getCustomFieldsRefs());
                    }

                    persistEntities(customFieldRefs, "Lead_Labels_customFieldRefs");
                    persistEntities(entities, "Lead_Labels");
                    persistEntitiesAsync(customFields, "Lead_LabelsCustomField");
                } else {
                    logger.warn("Lead_Labels HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Lead_Labels DONE");
            pageIndex++;
System.gc(); // Переход к следующей странице
        }
        logger.info(
                "Lead_Labels processed. Events = "
                        + eventsCount
                        + ", entities = "
                        + entitiesCount
                        + ", skipped = "
                        + skippedEntitiesCount);
    }

    public void initLeads() throws IOException {
        int pageIndex = 0;
        int pageSize = 50;
        int eventsCount = 0;
        int entitiesCount = 0;
        int skippedEntitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "LEADS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase> entities = new ArrayList<>();
                List<PanacheEntityBase> customFields = new ArrayList<>();
                List<PanacheEntityBase> customFieldRefs = new ArrayList<>();
                if (jsonNode.get("success") != null && jsonNode.get("success").asBoolean()) {
                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        LocalDateTime updateTime =
                                DateUtils.parseDateTime(node.path("update_time").asText());
                        LocalDateTime addTime =
                                DateUtils.parseDateTime(node.path("add_time").asText());
                        LocalDateTime actionTime = updateTime;
                        if (actionTime == null) {
                            actionTime = addTime;
                        }
                        if (actionTime != null) {
                            LocalDateTime webhookRegisteredTime = getWebhookRegisteredTime();
                            if (webhookRegisteredTime != null
                                    && actionTime.isAfter(webhookRegisteredTime)) {
                                // entity shows data for the operation after webhook registration -
                                // it should be in webhooks
                                logger.warn(
                                        "Skipped due to unacceptable action time. Event id = "
                                                + event.id);
                                skippedEntitiesCount++;
                                continue;
                            }
                        }
                        entitiesCount++;
                        JsonToEntityServiceAnswer<LeadEntity, PanacheEntityBase, PanacheEntityBase>
                                answer = jsonService.toLeadEntity(node);
                        entities.addAll(answer.getEntities());
                        customFields.addAll(answer.getCustomFieldEntities());
                        customFieldRefs.addAll(answer.getCustomFieldsRefs());
                    }

                    persistEntities(customFieldRefs, "Leads_customFieldRefs");
                    persistEntities(entities, "Leads");
                    persistEntitiesAsync(customFields, "LeadsCustomField");
                } else {
                    logger.warn("Leads HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Leads DONE");
            pageIndex++;
System.gc(); // Переход к следующей странице
        }
        logger.info(
                "Leads processed. Events = "
                        + eventsCount
                        + ", entities = "
                        + entitiesCount
                        + ", skipped = "
                        + skippedEntitiesCount);
    }

    public void initNotes() throws IOException {
        int pageIndex = 0;
        int pageSize = 50;
        int eventsCount = 0;
        int entitiesCount = 0;
        int skippedEntitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "NOTES");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase> entities = new ArrayList<>();
                List<PanacheEntityBase> customFields = new ArrayList<>();
                List<PanacheEntityBase> customFieldRefs = new ArrayList<>();
                if (jsonNode.get("success") != null && jsonNode.get("success").asBoolean()) {
                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        LocalDateTime updateTime =
                                DateUtils.parseDateTime(node.path("update_time").asText());
                        LocalDateTime addTime =
                                DateUtils.parseDateTime(node.path("add_time").asText());
                        LocalDateTime actionTime = updateTime;
                        if (actionTime == null) {
                            actionTime = addTime;
                        }
                        if (actionTime != null) {
                            LocalDateTime webhookRegisteredTime = getWebhookRegisteredTime();
                            if (webhookRegisteredTime != null
                                    && actionTime.isAfter(webhookRegisteredTime)) {
                                // entity shows data for the operation after webhook registration -
                                // it should be in webhooks
                                logger.warn(
                                        "Skipped due to unacceptable action time. Event id = "
                                                + event.id);
                                skippedEntitiesCount++;
                                continue;
                            }
                        }
                        entitiesCount++;
                        JsonToEntityServiceAnswer<NoteEntity, PanacheEntityBase, PanacheEntityBase>
                                answer = jsonService.toNoteEntity(node);
                        entities.addAll(answer.getEntities());
                        customFields.addAll(answer.getCustomFieldEntities());
                        customFieldRefs.addAll(answer.getCustomFieldsRefs());
                    }

                    persistEntities(customFieldRefs, "Notes_customFieldRefs");
                    persistEntities(entities, "Notes");
                    persistEntitiesAsync(customFields, "NotesCustomField");
                } else {
                    logger.warn("Notes HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Notes DONE");
            pageIndex++;
System.gc(); // Переход к следующей странице
        }
        logger.info(
                "Notes processed. Events = "
                        + eventsCount
                        + ", entities = "
                        + entitiesCount
                        + ", skipped = "
                        + skippedEntitiesCount);
    }

    public void initRef_Organization_Fields() throws IOException {
        int pageIndex = 0;
        int pageSize = 50;
        int eventsCount = 0;
        int entitiesCount = 0;
        int skippedEntitiesCount = 0;
        while (true) {
            List<EventEntity> events =
                    getEventEntities(pageIndex, pageSize, "REF_ORGANIZATION_FIELDS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase> entities = new ArrayList<>();
                List<PanacheEntityBase> customFields = new ArrayList<>();
                List<PanacheEntityBase> customFieldRefs = new ArrayList<>();
                if (jsonNode.get("success") != null && jsonNode.get("success").asBoolean()) {
                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        LocalDateTime updateTime =
                                DateUtils.parseDateTime(node.path("update_time").asText());
                        LocalDateTime addTime =
                                DateUtils.parseDateTime(node.path("add_time").asText());
                        LocalDateTime actionTime = updateTime;
                        if (actionTime == null) {
                            actionTime = addTime;
                        }
                        if (actionTime != null) {
                            LocalDateTime webhookRegisteredTime = getWebhookRegisteredTime();
                            if (webhookRegisteredTime != null
                                    && actionTime.isAfter(webhookRegisteredTime)) {
                                // entity shows data for the operation after webhook registration -
                                // it should be in webhooks
                                logger.warn(
                                        "Skipped due to unacceptable action time. Event id = "
                                                + event.id);
                                skippedEntitiesCount++;
                                continue;
                            }
                        }
                        entitiesCount++;
                        JsonToEntityServiceAnswer<
                                        RefOrganizationFieldEntity,
                                        PanacheEntityBase,
                                        PanacheEntityBase>
                                answer = jsonService.toRefOrganizationFieldEntity(node);
                        entities.addAll(answer.getEntities());
                        customFields.addAll(answer.getCustomFieldEntities());
                        customFieldRefs.addAll(answer.getCustomFieldsRefs());
                    }

                    persistEntities(customFieldRefs, "Ref_Organization_Fields_customFieldRefs");
                    persistEntities(entities, "Ref_Organization_Fields");
                    persistEntitiesAsync(customFields, "Ref_Organization_FieldsCustomField");
                } else {
                    logger.warn(
                            "Ref_Organization_Fields HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Ref_Organization_Fields DONE");
            pageIndex++;
System.gc(); // Переход к следующей странице
        }
        logger.info(
                "Ref_Organization_Fields processed. Events = "
                        + eventsCount
                        + ", entities = "
                        + entitiesCount
                        + ", skipped = "
                        + skippedEntitiesCount);
    }

    public void initOrganizations() throws IOException {
        int pageIndex = 0;
        int pageSize = 50;
        int eventsCount = 0;
        int entitiesCount = 0;
        int skippedEntitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "ORGANIZATIONS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase> entities = new ArrayList<>();
                List<PanacheEntityBase> customFields = new ArrayList<>();
                List<PanacheEntityBase> customFieldRefs = new ArrayList<>();
                if (jsonNode.get("success") != null && jsonNode.get("success").asBoolean()) {
                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        LocalDateTime updateTime =
                                DateUtils.parseDateTime(node.path("update_time").asText());
                        LocalDateTime addTime =
                                DateUtils.parseDateTime(node.path("add_time").asText());
                        LocalDateTime actionTime = updateTime;
                        if (actionTime == null) {
                            actionTime = addTime;
                        }
                        if (actionTime != null) {
                            LocalDateTime webhookRegisteredTime = getWebhookRegisteredTime();
                            if (webhookRegisteredTime != null
                                    && actionTime.isAfter(webhookRegisteredTime)) {
                                // entity shows data for the operation after webhook registration -
                                // it should be in webhooks
                                logger.warn(
                                        "Skipped due to unacceptable action time. Event id = "
                                                + event.id);
                                skippedEntitiesCount++;
                                continue;
                            }
                        }
                        entitiesCount++;
                        JsonToEntityServiceAnswer<
                                        OrganizationEntity, PanacheEntityBase, PanacheEntityBase>
                                answer = jsonService.toOrganizationEntity(node);
                        entities.addAll(answer.getEntities());
                        customFields.addAll(answer.getCustomFieldEntities());
                        customFieldRefs.addAll(answer.getCustomFieldsRefs());
                    }

                    persistEntities(customFieldRefs, "Organizations_customFieldRefs");
                    persistEntities(entities, "Organizations");
                    persistEntitiesAsync(customFields, "OrganizationsCustomField");
                } else {
                    logger.warn("Organizations HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Organizations DONE");
            pageIndex++;
System.gc(); // Переход к следующей странице
        }
        logger.info(
                "Organizations processed. Events = "
                        + eventsCount
                        + ", entities = "
                        + entitiesCount
                        + ", skipped = "
                        + skippedEntitiesCount);
    }

    public void initRef_Person_Fields() throws IOException {
        int pageIndex = 0;
        int pageSize = 50;
        int eventsCount = 0;
        int entitiesCount = 0;
        int skippedEntitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "REF_PERSON_FIELDS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase> entities = new ArrayList<>();
                List<PanacheEntityBase> customFields = new ArrayList<>();
                List<PanacheEntityBase> customFieldRefs = new ArrayList<>();
                if (jsonNode.get("success") != null && jsonNode.get("success").asBoolean()) {
                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        LocalDateTime updateTime =
                                DateUtils.parseDateTime(node.path("update_time").asText());
                        LocalDateTime addTime =
                                DateUtils.parseDateTime(node.path("add_time").asText());
                        LocalDateTime actionTime = updateTime;
                        if (actionTime == null) {
                            actionTime = addTime;
                        }
                        if (actionTime != null) {
                            LocalDateTime webhookRegisteredTime = getWebhookRegisteredTime();
                            if (webhookRegisteredTime != null
                                    && actionTime.isAfter(webhookRegisteredTime)) {
                                // entity shows data for the operation after webhook registration -
                                // it should be in webhooks
                                logger.warn(
                                        "Skipped due to unacceptable action time. Event id = "
                                                + event.id);
                                skippedEntitiesCount++;
                                continue;
                            }
                        }
                        entitiesCount++;
                        JsonToEntityServiceAnswer<
                                        RefPersonFieldEntity, PanacheEntityBase, PanacheEntityBase>
                                answer = jsonService.toRefPersonFieldEntity(node);
                        entities.addAll(answer.getEntities());
                        customFields.addAll(answer.getCustomFieldEntities());
                        customFieldRefs.addAll(answer.getCustomFieldsRefs());
                    }

                    persistEntities(customFieldRefs, "Ref_Person_Fields_customFieldRefs");
                    persistEntities(entities, "Ref_Person_Fields");
                    persistEntitiesAsync(customFields, "Ref_Person_FieldsCustomField");
                } else {
                    logger.warn("Ref_Person_Fields HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Ref_Person_Fields DONE");
            pageIndex++;
System.gc(); // Переход к следующей странице
        }
        logger.info(
                "Ref_Person_Fields processed. Events = "
                        + eventsCount
                        + ", entities = "
                        + entitiesCount
                        + ", skipped = "
                        + skippedEntitiesCount);
    }

    public void initPersons() throws IOException {
        int pageIndex = 0;
        int pageSize = 50;
        int eventsCount = 0;
        int entitiesCount = 0;
        int skippedEntitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "PERSONS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase> entities = new ArrayList<>();
                List<PanacheEntityBase> customFields = new ArrayList<>();
                List<PanacheEntityBase> customFieldRefs = new ArrayList<>();
                if (jsonNode.get("success") != null && jsonNode.get("success").asBoolean()) {
                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        LocalDateTime updateTime =
                                DateUtils.parseDateTime(node.path("update_time").asText());
                        LocalDateTime addTime =
                                DateUtils.parseDateTime(node.path("add_time").asText());
                        LocalDateTime actionTime = updateTime;
                        if (actionTime == null) {
                            actionTime = addTime;
                        }
                        if (actionTime != null) {
                            LocalDateTime webhookRegisteredTime = getWebhookRegisteredTime();
                            if (webhookRegisteredTime != null
                                    && actionTime.isAfter(webhookRegisteredTime)) {
                                // entity shows data for the operation after webhook registration -
                                // it should be in webhooks
                                logger.warn(
                                        "Skipped due to unacceptable action time. Event id = "
                                                + event.id);
                                skippedEntitiesCount++;
                                continue;
                            }
                        }
                        entitiesCount++;
                        JsonToEntityServiceAnswer<
                                        PersonEntity, PanacheEntityBase, PanacheEntityBase>
                                answer = jsonService.toPersonEntity(node);
                        entities.addAll(answer.getEntities());
                        customFields.addAll(answer.getCustomFieldEntities());
                        customFieldRefs.addAll(answer.getCustomFieldsRefs());
                    }

                    persistEntities(customFieldRefs, "Persons_customFieldRefs");
                    persistEntities(entities, "Persons");
                    persistEntitiesAsync(customFields, "PersonsCustomField");
                } else {
                    logger.warn("Persons HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Persons DONE");
            pageIndex++;
System.gc(); // Переход к следующей странице
        }
        logger.info(
                "Persons processed. Events = "
                        + eventsCount
                        + ", entities = "
                        + entitiesCount
                        + ", skipped = "
                        + skippedEntitiesCount);
    }

    public void initPipelines() throws IOException {
        int pageIndex = 0;
        int pageSize = 50;
        int eventsCount = 0;
        int entitiesCount = 0;
        int skippedEntitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "PIPELINES");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase> entities = new ArrayList<>();
                List<PanacheEntityBase> customFields = new ArrayList<>();
                List<PanacheEntityBase> customFieldRefs = new ArrayList<>();
                if (jsonNode.get("success") != null && jsonNode.get("success").asBoolean()) {
                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        LocalDateTime updateTime =
                                DateUtils.parseDateTime(node.path("update_time").asText());
                        LocalDateTime addTime =
                                DateUtils.parseDateTime(node.path("add_time").asText());
                        LocalDateTime actionTime = updateTime;
                        if (actionTime == null) {
                            actionTime = addTime;
                        }
                        if (actionTime != null) {
                            LocalDateTime webhookRegisteredTime = getWebhookRegisteredTime();
                            if (webhookRegisteredTime != null
                                    && actionTime.isAfter(webhookRegisteredTime)) {
                                // entity shows data for the operation after webhook registration -
                                // it should be in webhooks
                                logger.warn(
                                        "Skipped due to unacceptable action time. Event id = "
                                                + event.id);
                                skippedEntitiesCount++;
                                continue;
                            }
                        }
                        entitiesCount++;
                        JsonToEntityServiceAnswer<
                                        PipelineEntity, PanacheEntityBase, PanacheEntityBase>
                                answer = jsonService.toPipelineEntity(node);
                        entities.addAll(answer.getEntities());
                        customFields.addAll(answer.getCustomFieldEntities());
                        customFieldRefs.addAll(answer.getCustomFieldsRefs());
                    }

                    persistEntities(customFieldRefs, "Pipelines_customFieldRefs");
                    persistEntities(entities, "Pipelines");
                    persistEntitiesAsync(customFields, "PipelinesCustomField");
                } else {
                    logger.warn("Pipelines HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Pipelines DONE");
            pageIndex++;
System.gc(); // Переход к следующей странице
        }
        logger.info(
                "Pipelines processed. Events = "
                        + eventsCount
                        + ", entities = "
                        + entitiesCount
                        + ", skipped = "
                        + skippedEntitiesCount);
    }

    public void initRef_Product_Fields() throws IOException {
        int pageIndex = 0;
        int pageSize = 50;
        int eventsCount = 0;
        int entitiesCount = 0;
        int skippedEntitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "REF_PRODUCT_FIELDS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase> entities = new ArrayList<>();
                List<PanacheEntityBase> customFields = new ArrayList<>();
                List<PanacheEntityBase> customFieldRefs = new ArrayList<>();
                if (jsonNode.get("success") != null && jsonNode.get("success").asBoolean()) {
                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        LocalDateTime updateTime =
                                DateUtils.parseDateTime(node.path("update_time").asText());
                        LocalDateTime addTime =
                                DateUtils.parseDateTime(node.path("add_time").asText());
                        LocalDateTime actionTime = updateTime;
                        if (actionTime == null) {
                            actionTime = addTime;
                        }
                        if (actionTime != null) {
                            LocalDateTime webhookRegisteredTime = getWebhookRegisteredTime();
                            if (webhookRegisteredTime != null
                                    && actionTime.isAfter(webhookRegisteredTime)) {
                                // entity shows data for the operation after webhook registration -
                                // it should be in webhooks
                                logger.warn(
                                        "Skipped due to unacceptable action time. Event id = "
                                                + event.id);
                                skippedEntitiesCount++;
                                continue;
                            }
                        }
                        entitiesCount++;
                        JsonToEntityServiceAnswer<
                                        RefProductFieldEntity, PanacheEntityBase, PanacheEntityBase>
                                answer = jsonService.toRefProductFieldEntity(node);
                        entities.addAll(answer.getEntities());
                        customFields.addAll(answer.getCustomFieldEntities());
                        customFieldRefs.addAll(answer.getCustomFieldsRefs());
                    }

                    persistEntities(customFieldRefs, "Ref_Product_Fields_customFieldRefs");
                    persistEntities(entities, "Ref_Product_Fields");
                    persistEntitiesAsync(customFields, "Ref_Product_FieldsCustomField");
                } else {
                    logger.warn("Ref_Product_Fields HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Ref_Product_Fields DONE");
            pageIndex++;
System.gc(); // Переход к следующей странице
        }
        logger.info(
                "Ref_Product_Fields processed. Events = "
                        + eventsCount
                        + ", entities = "
                        + entitiesCount
                        + ", skipped = "
                        + skippedEntitiesCount);
    }

    public void initProducts() throws IOException {
        int pageIndex = 0;
        int pageSize = 50;
        int eventsCount = 0;
        int entitiesCount = 0;
        int skippedEntitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "PRODUCTS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase> entities = new ArrayList<>();
                List<PanacheEntityBase> customFields = new ArrayList<>();
                List<PanacheEntityBase> customFieldRefs = new ArrayList<>();
                if (jsonNode.get("success") != null && jsonNode.get("success").asBoolean()) {
                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        LocalDateTime updateTime =
                                DateUtils.parseDateTime(node.path("update_time").asText());
                        LocalDateTime addTime =
                                DateUtils.parseDateTime(node.path("add_time").asText());
                        LocalDateTime actionTime = updateTime;
                        if (actionTime == null) {
                            actionTime = addTime;
                        }
                        if (actionTime != null) {
                            LocalDateTime webhookRegisteredTime = getWebhookRegisteredTime();
                            if (webhookRegisteredTime != null
                                    && actionTime.isAfter(webhookRegisteredTime)) {
                                // entity shows data for the operation after webhook registration -
                                // it should be in webhooks
                                logger.warn(
                                        "Skipped due to unacceptable action time. Event id = "
                                                + event.id);
                                skippedEntitiesCount++;
                                continue;
                            }
                        }
                        entitiesCount++;
                        JsonToEntityServiceAnswer<
                                        ProductEntity, PanacheEntityBase, PanacheEntityBase>
                                answer = jsonService.toProductEntity(node);
                        entities.addAll(answer.getEntities());
                        customFields.addAll(answer.getCustomFieldEntities());
                        customFieldRefs.addAll(answer.getCustomFieldsRefs());
                    }

                    persistEntities(customFieldRefs, "Products_customFieldRefs");
                    persistEntities(entities, "Products");
                    persistEntitiesAsync(customFields, "ProductsCustomField");
                } else {
                    logger.warn("Products HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Products DONE");
            pageIndex++;
System.gc(); // Переход к следующей странице
        }
        logger.info(
                "Products processed. Events = "
                        + eventsCount
                        + ", entities = "
                        + entitiesCount
                        + ", skipped = "
                        + skippedEntitiesCount);
    }

    public void initProjects() throws IOException {
        int pageIndex = 0;
        int pageSize = 50;
        int eventsCount = 0;
        int entitiesCount = 0;
        int skippedEntitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "PROJECTS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase> entities = new ArrayList<>();
                List<PanacheEntityBase> customFields = new ArrayList<>();
                List<PanacheEntityBase> customFieldRefs = new ArrayList<>();
                if (jsonNode.get("success") != null && jsonNode.get("success").asBoolean()) {
                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        LocalDateTime updateTime =
                                DateUtils.parseDateTime(node.path("update_time").asText());
                        LocalDateTime addTime =
                                DateUtils.parseDateTime(node.path("add_time").asText());
                        LocalDateTime actionTime = updateTime;
                        if (actionTime == null) {
                            actionTime = addTime;
                        }
                        if (actionTime != null) {
                            LocalDateTime webhookRegisteredTime = getWebhookRegisteredTime();
                            if (webhookRegisteredTime != null
                                    && actionTime.isAfter(webhookRegisteredTime)) {
                                // entity shows data for the operation after webhook registration -
                                // it should be in webhooks
                                logger.warn(
                                        "Skipped due to unacceptable action time. Event id = "
                                                + event.id);
                                skippedEntitiesCount++;
                                continue;
                            }
                        }
                        entitiesCount++;
                        JsonToEntityServiceAnswer<
                                        ProjectEntity, PanacheEntityBase, PanacheEntityBase>
                                answer = jsonService.toProjectEntity(node);
                        entities.addAll(answer.getEntities());
                        customFields.addAll(answer.getCustomFieldEntities());
                        customFieldRefs.addAll(answer.getCustomFieldsRefs());
                    }

                    persistEntities(customFieldRefs, "Projects_customFieldRefs");
                    persistEntities(entities, "Projects");
                    persistEntitiesAsync(customFields, "ProjectsCustomField");
                } else {
                    logger.warn("Projects HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Projects DONE");
            pageIndex++;
System.gc(); // Переход к следующей странице
        }
        logger.info(
                "Projects processed. Events = "
                        + eventsCount
                        + ", entities = "
                        + entitiesCount
                        + ", skipped = "
                        + skippedEntitiesCount);
    }

    public void initRoles() throws IOException {
        int pageIndex = 0;
        int pageSize = 50;
        int eventsCount = 0;
        int entitiesCount = 0;
        int skippedEntitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "ROLES");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase> entities = new ArrayList<>();
                List<PanacheEntityBase> customFields = new ArrayList<>();
                List<PanacheEntityBase> customFieldRefs = new ArrayList<>();
                if (jsonNode.get("success") != null && jsonNode.get("success").asBoolean()) {
                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        LocalDateTime updateTime =
                                DateUtils.parseDateTime(node.path("update_time").asText());
                        LocalDateTime addTime =
                                DateUtils.parseDateTime(node.path("add_time").asText());
                        LocalDateTime actionTime = updateTime;
                        if (actionTime == null) {
                            actionTime = addTime;
                        }
                        if (actionTime != null) {
                            LocalDateTime webhookRegisteredTime = getWebhookRegisteredTime();
                            if (webhookRegisteredTime != null
                                    && actionTime.isAfter(webhookRegisteredTime)) {
                                // entity shows data for the operation after webhook registration -
                                // it should be in webhooks
                                logger.warn(
                                        "Skipped due to unacceptable action time. Event id = "
                                                + event.id);
                                skippedEntitiesCount++;
                                continue;
                            }
                        }
                        entitiesCount++;
                        JsonToEntityServiceAnswer<RoleEntity, PanacheEntityBase, PanacheEntityBase>
                                answer = jsonService.toRoleEntity(node);
                        entities.addAll(answer.getEntities());
                        customFields.addAll(answer.getCustomFieldEntities());
                        customFieldRefs.addAll(answer.getCustomFieldsRefs());
                    }

                    persistEntities(customFieldRefs, "Roles_customFieldRefs");
                    persistEntities(entities, "Roles");
                    persistEntitiesAsync(customFields, "RolesCustomField");
                } else {
                    logger.warn("Roles HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Roles DONE");
            pageIndex++;
System.gc(); // Переход к следующей странице
        }
        logger.info(
                "Roles processed. Events = "
                        + eventsCount
                        + ", entities = "
                        + entitiesCount
                        + ", skipped = "
                        + skippedEntitiesCount);
    }

    public void initStages() throws IOException {
        int pageIndex = 0;
        int pageSize = 50;
        int eventsCount = 0;
        int entitiesCount = 0;
        int skippedEntitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "STAGES");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase> entities = new ArrayList<>();
                List<PanacheEntityBase> customFields = new ArrayList<>();
                List<PanacheEntityBase> customFieldRefs = new ArrayList<>();
                if (jsonNode.get("success") != null && jsonNode.get("success").asBoolean()) {
                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        LocalDateTime updateTime =
                                DateUtils.parseDateTime(node.path("update_time").asText());
                        LocalDateTime addTime =
                                DateUtils.parseDateTime(node.path("add_time").asText());
                        LocalDateTime actionTime = updateTime;
                        if (actionTime == null) {
                            actionTime = addTime;
                        }
                        if (actionTime != null) {
                            LocalDateTime webhookRegisteredTime = getWebhookRegisteredTime();
                            if (webhookRegisteredTime != null
                                    && actionTime.isAfter(webhookRegisteredTime)) {
                                // entity shows data for the operation after webhook registration -
                                // it should be in webhooks
                                logger.warn(
                                        "Skipped due to unacceptable action time. Event id = "
                                                + event.id);
                                skippedEntitiesCount++;
                                continue;
                            }
                        }
                        entitiesCount++;
                        JsonToEntityServiceAnswer<StageEntity, PanacheEntityBase, PanacheEntityBase>
                                answer = jsonService.toStageEntity(node);
                        entities.addAll(answer.getEntities());
                        customFields.addAll(answer.getCustomFieldEntities());
                        customFieldRefs.addAll(answer.getCustomFieldsRefs());
                    }

                    persistEntities(customFieldRefs, "Stages_customFieldRefs");
                    persistEntities(entities, "Stages");
                    persistEntitiesAsync(customFields, "StagesCustomField");
                } else {
                    logger.warn("Stages HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Stages DONE");
            pageIndex++;
System.gc(); // Переход к следующей странице
        }
        logger.info(
                "Stages processed. Events = "
                        + eventsCount
                        + ", entities = "
                        + entitiesCount
                        + ", skipped = "
                        + skippedEntitiesCount);
    }

    public void initTasks() throws IOException {
        int pageIndex = 0;
        int pageSize = 50;
        int eventsCount = 0;
        int entitiesCount = 0;
        int skippedEntitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "TASKS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase> entities = new ArrayList<>();
                List<PanacheEntityBase> customFields = new ArrayList<>();
                List<PanacheEntityBase> customFieldRefs = new ArrayList<>();
                if (jsonNode.get("success") != null && jsonNode.get("success").asBoolean()) {
                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        LocalDateTime updateTime =
                                DateUtils.parseDateTime(node.path("update_time").asText());
                        LocalDateTime addTime =
                                DateUtils.parseDateTime(node.path("add_time").asText());
                        LocalDateTime actionTime = updateTime;
                        if (actionTime == null) {
                            actionTime = addTime;
                        }
                        if (actionTime != null) {
                            LocalDateTime webhookRegisteredTime = getWebhookRegisteredTime();
                            if (webhookRegisteredTime != null
                                    && actionTime.isAfter(webhookRegisteredTime)) {
                                // entity shows data for the operation after webhook registration -
                                // it should be in webhooks
                                logger.warn(
                                        "Skipped due to unacceptable action time. Event id = "
                                                + event.id);
                                skippedEntitiesCount++;
                                continue;
                            }
                        }
                        entitiesCount++;
                        JsonToEntityServiceAnswer<TaskEntity, PanacheEntityBase, PanacheEntityBase>
                                answer = jsonService.toTaskEntity(node);
                        entities.addAll(answer.getEntities());
                        customFields.addAll(answer.getCustomFieldEntities());
                        customFieldRefs.addAll(answer.getCustomFieldsRefs());
                    }

                    persistEntities(customFieldRefs, "Tasks_customFieldRefs");
                    persistEntities(entities, "Tasks");
                    persistEntitiesAsync(customFields, "TasksCustomField");
                } else {
                    logger.warn("Tasks HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Tasks DONE");
            pageIndex++;
System.gc(); // Переход к следующей странице
        }
        logger.info(
                "Tasks processed. Events = "
                        + eventsCount
                        + ", entities = "
                        + entitiesCount
                        + ", skipped = "
                        + skippedEntitiesCount);
    }

    public void initUsers() throws IOException {
        int pageIndex = 0;
        int pageSize = 50;
        int eventsCount = 0;
        int entitiesCount = 0;
        int skippedEntitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "USERS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase> entities = new ArrayList<>();
                List<PanacheEntityBase> customFields = new ArrayList<>();
                List<PanacheEntityBase> customFieldRefs = new ArrayList<>();
                if (jsonNode.get("success") != null && jsonNode.get("success").asBoolean()) {
                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        LocalDateTime updateTime =
                                DateUtils.parseDateTime(node.path("update_time").asText());
                        LocalDateTime addTime =
                                DateUtils.parseDateTime(node.path("add_time").asText());
                        LocalDateTime actionTime = updateTime;
                        if (actionTime == null) {
                            actionTime = addTime;
                        }
                        if (actionTime != null) {
                            LocalDateTime webhookRegisteredTime = getWebhookRegisteredTime();
                            if (webhookRegisteredTime != null
                                    && actionTime.isAfter(webhookRegisteredTime)) {
                                // entity shows data for the operation after webhook registration -
                                // it should be in webhooks
                                logger.warn(
                                        "Skipped due to unacceptable action time. Event id = "
                                                + event.id);
                                skippedEntitiesCount++;
                                continue;
                            }
                        }
                        entitiesCount++;
                        JsonToEntityServiceAnswer<UserEntity, PanacheEntityBase, PanacheEntityBase>
                                answer = jsonService.toUserEntity(node);
                        entities.addAll(answer.getEntities());
                        customFields.addAll(answer.getCustomFieldEntities());
                        customFieldRefs.addAll(answer.getCustomFieldsRefs());
                    }

                    persistEntities(customFieldRefs, "Users_customFieldRefs");
                    persistEntities(entities, "Users");
                    persistEntitiesAsync(customFields, "UsersCustomField");
                } else {
                    logger.warn("Users HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Users DONE");
            pageIndex++;
System.gc(); // Переход к следующей странице
        }
        logger.info(
                "Users processed. Events = "
                        + eventsCount
                        + ", entities = "
                        + entitiesCount
                        + ", skipped = "
                        + skippedEntitiesCount);
    }

    public void initWebhooks() throws IOException {
        int pageIndex = 0;
        int pageSize = 50;
        int eventsCount = 0;
        int entitiesCount = 0;
        int skippedEntitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "WEBHOOKS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase> entities = new ArrayList<>();
                List<PanacheEntityBase> customFields = new ArrayList<>();
                List<PanacheEntityBase> customFieldRefs = new ArrayList<>();
                if (jsonNode.get("success") != null && jsonNode.get("success").asBoolean()) {
                    JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        LocalDateTime updateTime =
                                DateUtils.parseDateTime(node.path("update_time").asText());
                        LocalDateTime addTime =
                                DateUtils.parseDateTime(node.path("add_time").asText());
                        LocalDateTime actionTime = updateTime;
                        if (actionTime == null) {
                            actionTime = addTime;
                        }
                        if (actionTime != null) {
                            LocalDateTime webhookRegisteredTime = getWebhookRegisteredTime();
                            if (webhookRegisteredTime != null
                                    && actionTime.isAfter(webhookRegisteredTime)) {
                                // entity shows data for the operation after webhook registration -
                                // it should be in webhooks
                                logger.warn(
                                        "Skipped due to unacceptable action time. Event id = "
                                                + event.id);
                                skippedEntitiesCount++;
                                continue;
                            }
                        }
                        entitiesCount++;
                        JsonToEntityServiceAnswer<
                                        WebhookEntity, PanacheEntityBase, PanacheEntityBase>
                                answer = jsonService.toWebhookEntity(node);
                        entities.addAll(answer.getEntities());
                        customFields.addAll(answer.getCustomFieldEntities());
                        customFieldRefs.addAll(answer.getCustomFieldsRefs());
                    }

                    persistEntities(customFieldRefs, "Webhooks_customFieldRefs");
                    persistEntities(entities, "Webhooks");
                    persistEntitiesAsync(customFields, "WebhooksCustomField");
                } else {
                    logger.warn("Webhooks HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Webhooks DONE");
            pageIndex++;
System.gc(); // Переход к следующей странице
        }
        logger.info(
                "Webhooks processed. Events = "
                        + eventsCount
                        + ", entities = "
                        + entitiesCount
                        + ", skipped = "
                        + skippedEntitiesCount);
    }
}
