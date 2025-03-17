package dti.crmsis.back.services;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import dti.crmsis.back.dao.clientsback.*;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import dti.crmsis.back.dao.crmsis.CustomerEntity;
import io.quarkus.panache.common.Page;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.jboss.logging.Logger;
import java.util.stream.Collectors;
import java.util.concurrent.ThreadPoolExecutor;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.Instant;
import java.time.ZoneOffset;

import java.io.*;
import java.util.*;

@ApplicationScoped
public class InitialEventsProcessorGenerated {

    private static final Logger logger = Logger.getLogger(InitialEventsProcessorGenerated.class);

    @Inject
    private ObjectMapper objectMapper;

    @Inject
    private ThreadPoolExecutor executorService;

    public void processInitialEvents(CustomerEntity customerEntity) {
        try {
            initActivities();
                initRef_Activity_Fields();
                initActivity_Types();
                initCurrencies();
                initRef_Deal_Fields();
                initDeals();
                initLead_Labels();
                initLeads();
                initRef_Organization_Fields();
                initOrganizations();
                initRef_Person_Fields();
                initPersons();
                initPipelines();
                initRef_Product_Fields();
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

    public PanacheEntityBase saveCustomField(String mainEntityClassName, Long mainEntityId, String customFieldName, String value) {
        if(value == null || value.isEmpty()) {
            return null;
        }
        switch (mainEntityClassName) {
            case "ActivityEntity":
                ActivityCustomFieldEntity  activityCustomFieldEntity = new ActivityCustomFieldEntity();
                activityCustomFieldEntity.mainEntityId = mainEntityId;
                activityCustomFieldEntity.key = customFieldName;
                activityCustomFieldEntity.value = value;
                return activityCustomFieldEntity;
            case "DealEntity":
                DealCustomFieldEntity  dealCustomFieldEntity = new DealCustomFieldEntity();
                dealCustomFieldEntity.mainEntityId = mainEntityId;
                dealCustomFieldEntity.key = customFieldName;
                dealCustomFieldEntity.value = value;
                return dealCustomFieldEntity;
            case "OrganizationEntity":
                OrganizationCustomFieldEntity organizationCustomFieldEntity = new OrganizationCustomFieldEntity();
                organizationCustomFieldEntity.mainEntityId = mainEntityId;
                organizationCustomFieldEntity.key = customFieldName;
                organizationCustomFieldEntity.value = value;
                return organizationCustomFieldEntity;
            case "PersonEntity":
                PersonCustomFieldEntity  personCustomFieldEntity = new PersonCustomFieldEntity();
                personCustomFieldEntity.mainEntityId = mainEntityId;
                personCustomFieldEntity.key = customFieldName;
                personCustomFieldEntity.value = value;
                return personCustomFieldEntity;
            case "ProductEntity":
                ProductCustomFieldEntity productCustomFieldEntity = new ProductCustomFieldEntity();
                productCustomFieldEntity.mainEntityId = mainEntityId;
                productCustomFieldEntity.key = customFieldName;
                productCustomFieldEntity.value = value;
                return productCustomFieldEntity;
            default:
                logger.warn("Unknown main entity type: " + mainEntityClassName);
                break;
        }
        return null;
    }

    protected   List<EventEntity> getEventEntities(int pageIndex, int pageSize, String entityName) {
        List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", entityName)
                .page(Page.of(pageIndex, pageSize))
                .list();
        return events;
    }

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public void persistEntities(List<PanacheEntityBase> entities,String entityName){
        logger.infof("Persisting %d entities of type %s", entities.size(), entityName);
        PanacheEntityBase.persist(entities);
    }

    public void  persistEntitiesAsync(List<PanacheEntityBase> entities,String entityName){
        logger.infof("active %d queue %d max %d",executorService.getActiveCount(),executorService.getQueue().size(), executorService.getLargestPoolSize());
        executorService.submit(() -> persistEntities(entities, entityName));
    }

    public LocalDateTime parseDateTime(String dateStr) {
        if (dateStr == null || dateStr.isEmpty()) {
            return null;
        }
        LocalDateTime dateTime;
        try {
            dateTime = LocalDateTime.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        } catch (DateTimeParseException e1) {
            try {
                dateTime = LocalDateTime.parse(dateStr, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
            } catch (DateTimeParseException e2) {
                dateTime = LocalDateTime.ofInstant(Instant.parse(dateStr), ZoneOffset.UTC);
            }
        }
        return dateTime;
    }

    public LocalDate parseDate(String dateStr) {
        if (dateStr == null || dateStr.isEmpty()) {
            return null;
        }
        LocalDate localDate = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return localDate;
    }


        @Transactional
    public void initActivities() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "ACTIVITIES");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase>  entities = new ArrayList<>();
                List<PanacheEntityBase>  customFields = new ArrayList<>();
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        ActivityEntity entity = new ActivityEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        entity.userId = node.hasNonNull("user_id") ? node.get("user_id").asLong() : null;
                    entity.done = node.hasNonNull("done") ? node.get("done").asBoolean() : null;
                    entity.type = node.hasNonNull("type") ? objectMapper.writeValueAsString(node.get("type")) : null;
                    entity.referenceType = node.hasNonNull("reference_type") ? objectMapper.writeValueAsString(node.get("reference_type")) : null;
                    entity.referenceId = node.hasNonNull("reference_id") ? node.get("reference_id").asLong() : null;
                    entity.conferenceMeetingClient = node.hasNonNull("conference_meeting_client") ? objectMapper.writeValueAsString(node.get("conference_meeting_client")) : null;
                    entity.conferenceMeetingUrl = node.hasNonNull("conference_meeting_url") ? objectMapper.writeValueAsString(node.get("conference_meeting_url")) : null;
                    entity.dueDate = parseDate(node.hasNonNull("due_date") ? node.get("due_date").asText() : null);
                    entity.dueTime = node.hasNonNull("due_time") ? objectMapper.writeValueAsString(node.get("due_time")) : null;
                    entity.duration = node.hasNonNull("duration") ? node.get("duration").asBoolean() : null;
                    entity.busyFlag = node.hasNonNull("busy_flag") ? node.get("busy_flag").asBoolean() : null;
                    entity.addTime = parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
                    entity.markedAsDoneTime = parseDateTime(node.hasNonNull("marked_as_done_time") ? node.get("marked_as_done_time").asText() : null);
                    entity.lastNotificationTime = parseDateTime(node.hasNonNull("last_notification_time") ? node.get("last_notification_time").asText() : null);
                    entity.lastNotificationUserId = node.hasNonNull("last_notification_user_id") ? node.get("last_notification_user_id").asLong() : null;
                    entity.notificationLanguageId = node.hasNonNull("notification_language_id") ? node.get("notification_language_id").asLong() : null;
                    entity.subject = node.hasNonNull("subject") ? objectMapper.writeValueAsString(node.get("subject")) : null;
                    entity.publicDescription = node.hasNonNull("public_description") ? node.get("public_description").asBoolean() : null;
                    entity.calendarSyncIncludeContext = node.hasNonNull("calendar_sync_include_context") ? objectMapper.writeValueAsString(node.get("calendar_sync_include_context")) : null;
                    entity.location = node.hasNonNull("location") ? objectMapper.writeValueAsString(node.get("location")) : null;
                    entity.orgId = node.hasNonNull("org_id") ? node.get("org_id").asLong() : null;
                    entity.personId = node.hasNonNull("person_id") ? node.get("person_id").asLong() : null;
                    entity.dealId = node.hasNonNull("deal_id") ? node.get("deal_id").asLong() : null;
                    entity.leadId = node.hasNonNull("lead_id") ? node.get("lead_id").asLong() : null;
                    entity.activeFlag = node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
                    entity.updateTime = parseDateTime(node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
                    entity.updateUserId = node.hasNonNull("update_user_id") ? node.get("update_user_id").asLong() : null;
                    entity.sourceTimezone = node.hasNonNull("source_timezone") ? objectMapper.writeValueAsString(node.get("source_timezone")) : null;
                    entity.recRule = node.hasNonNull("rec_rule") ? objectMapper.writeValueAsString(node.get("rec_rule")) : null;
                    entity.recRuleExtension = node.hasNonNull("rec_rule_extension") ? objectMapper.writeValueAsString(node.get("rec_rule_extension")) : null;
                    entity.recMasterActivityId = node.hasNonNull("rec_master_activity_id") ? node.get("rec_master_activity_id").asLong() : null;
                    entity.conferenceMeetingId = node.hasNonNull("conference_meeting_id") ? node.get("conference_meeting_id").asLong() : null;
                    entity.originalStartTime = parseDateTime(node.hasNonNull("original_start_time") ? node.get("original_start_time").asText() : null);
                    entity.isPrivate = node.hasNonNull("private") ? node.get("private").asBoolean() : null;
                    entity.priority = node.hasNonNull("priority") ? objectMapper.writeValueAsString(node.get("priority")) : null;
                    entity.note = node.hasNonNull("note") ? objectMapper.writeValueAsString(node.get("note")) : null;
                    entity.createdByUserId = node.hasNonNull("created_by_user_id") ? node.get("created_by_user_id").asLong() : null;
                    entity.locationSubpremise = node.hasNonNull("location_subpremise") ? objectMapper.writeValueAsString(node.get("location_subpremise")) : null;
                    entity.locationStreetNumber = node.hasNonNull("location_street_number") ? objectMapper.writeValueAsString(node.get("location_street_number")) : null;
                    entity.locationRoute = node.hasNonNull("location_route") ? objectMapper.writeValueAsString(node.get("location_route")) : null;
                    entity.locationSublocality = node.hasNonNull("location_sublocality") ? objectMapper.writeValueAsString(node.get("location_sublocality")) : null;
                    entity.locationLocality = node.hasNonNull("location_locality") ? objectMapper.writeValueAsString(node.get("location_locality")) : null;
                    entity.locationAdminAreaLevel1 = node.hasNonNull("location_admin_area_level_1") ? objectMapper.writeValueAsString(node.get("location_admin_area_level_1")) : null;
                    entity.locationAdminAreaLevel2 = node.hasNonNull("location_admin_area_level_2") ? objectMapper.writeValueAsString(node.get("location_admin_area_level_2")) : null;
                    entity.locationCountry = node.hasNonNull("location_country") ? objectMapper.writeValueAsString(node.get("location_country")) : null;
                    entity.locationPostalCode = node.hasNonNull("location_postal_code") ? objectMapper.writeValueAsString(node.get("location_postal_code")) : null;
                    entity.locationFormattedAddress = node.hasNonNull("location_formatted_address") ? objectMapper.writeValueAsString(node.get("location_formatted_address")) : null;
                    entity.attendees = node.hasNonNull("attendees") ? objectMapper.writeValueAsString(node.get("attendees")) : null;
                    entity.participants = node.hasNonNull("participants") ? objectMapper.writeValueAsString(node.get("participants")) : null;
                    entity.series = node.hasNonNull("series") ? objectMapper.writeValueAsString(node.get("series")) : null;
                    entity.isRecurring = node.hasNonNull("is_recurring") ? node.get("is_recurring").asBoolean() : null;
                    entity.orgName = node.hasNonNull("org_name") ? objectMapper.writeValueAsString(node.get("org_name")) : null;
                    entity.personName = node.hasNonNull("person_name") ? objectMapper.writeValueAsString(node.get("person_name")) : null;
                    entity.dealTitle = node.hasNonNull("deal_title") ? objectMapper.writeValueAsString(node.get("deal_title")) : null;
                    entity.leadTitle = node.hasNonNull("lead_title") ? objectMapper.writeValueAsString(node.get("lead_title")) : null;
                    entity.ownerName = node.hasNonNull("owner_name") ? objectMapper.writeValueAsString(node.get("owner_name")) : null;
                    entity.personDropboxBcc = node.hasNonNull("person_dropbox_bcc") ? objectMapper.writeValueAsString(node.get("person_dropbox_bcc")) : null;
                    entity.dealDropboxBcc = node.hasNonNull("deal_dropbox_bcc") ? objectMapper.writeValueAsString(node.get("deal_dropbox_bcc")) : null;
                    entity.assignedToUserId = node.hasNonNull("assigned_to_user_id") ? node.get("assigned_to_user_id").asLong() : null;
                    entity.typeName = node.hasNonNull("type_name") ? objectMapper.writeValueAsString(node.get("type_name")) : null;
                    entity.lead = node.hasNonNull("lead") ? objectMapper.writeValueAsString(node.get("lead")) : null;
                    entity.companyId = node.hasNonNull("company_id") ? node.get("company_id").asLong() : null;
                        customFields = customFields.stream().filter(Objects::nonNull).collect(Collectors.toList());
                        entity.json = objectMapper.writeValueAsString(node);
                        entities.add(entity);
                    }

                    persistEntities(entities,"Activities");
                    persistEntitiesAsync(customFields,"Activities");
                }else{
                    logger.warn("Activities HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Activities DONE");
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Activities processed. Events = " + eventsCount + ", entities = " + entitiesCount);
    }
    @Transactional
    public void initRef_Activity_Fields() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "ACTIVITY_FIELDS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase>  entities = new ArrayList<>();
                List<PanacheEntityBase>  customFields = new ArrayList<>();
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        RefActivityFieldEntity entity = new RefActivityFieldEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        entity.key = node.get("key").asText();
                    entity.name = node.get("name").asText();
                    entity.fieldType = node.get("field_type").asText();
                    entity.groupId = node.hasNonNull("group_id") ? node.get("group_id").asLong() : null;
                    entity.orderNr = node.hasNonNull("order_nr") ? node.get("order_nr").asLong() : null;
                    entity.jsonColumnFlag = node.hasNonNull("json_column_flag") ? node.get("json_column_flag").asBoolean() : null;
                    entity.addTime = parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
                    entity.updateTime = parseDateTime(node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
                    entity.lastUpdatedByUserId = node.hasNonNull("last_updated_by_user_id") ? node.get("last_updated_by_user_id").asLong() : null;
                    entity.editFlag = node.hasNonNull("edit_flag") ? node.get("edit_flag").asBoolean() : null;
                    entity.detailsVisibleFlag = node.hasNonNull("details_visible_flag") ? node.get("details_visible_flag").asBoolean() : null;
                    entity.addVisibleFlag = node.hasNonNull("add_visible_flag") ? node.get("add_visible_flag").asBoolean() : null;
                    entity.importantFlag = node.hasNonNull("important_flag") ? node.get("important_flag").asBoolean() : null;
                    entity.bulkEditAllowed = node.hasNonNull("bulk_edit_allowed") ? node.get("bulk_edit_allowed").asBoolean() : null;
                    entity.filteringAllowed = node.hasNonNull("filtering_allowed") ? node.get("filtering_allowed").asBoolean() : null;
                    entity.sortableFlag = node.hasNonNull("sortable_flag") ? node.get("sortable_flag").asBoolean() : null;
                    entity.mandatoryFlag = node.hasNonNull("mandatory_flag") ? node.get("mandatory_flag").asBoolean() : null;
                    entity.searchableFlag = node.hasNonNull("searchable_flag") ? node.get("searchable_flag").asBoolean() : null;
                    entity.description = node.hasNonNull("description") ? objectMapper.writeValueAsString(node.get("description")) : null;
                    entity.createdByUserId = node.hasNonNull("created_by_user_id") ? node.get("created_by_user_id").asLong() : null;
                    entity.activeFlag = node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
                    entity.options = node.hasNonNull("options") ? objectMapper.writeValueAsString(node.get("options")) : null;
                    entity.isSubfield = node.hasNonNull("is_subfield") ? node.get("is_subfield").asBoolean() : null;
                    entity.parentId = node.hasNonNull("parent_id") ? node.get("parent_id").asLong() : null;
                    entity.idSuffix = node.hasNonNull("id_suffix") ? objectMapper.writeValueAsString(node.get("id_suffix")) : null;
                        customFields = customFields.stream().filter(Objects::nonNull).collect(Collectors.toList());
                        entity.json = objectMapper.writeValueAsString(node);
                        entities.add(entity);
                    }

                    persistEntities(entities,"Ref_Activity_Fields");
                    persistEntitiesAsync(customFields,"Ref_Activity_Fields");
                }else{
                    logger.warn("Ref_Activity_Fields HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Ref_Activity_Fields DONE");
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Ref_Activity_Fields processed. Events = " + eventsCount + ", entities = " + entitiesCount);
    }
    @Transactional
    public void initActivity_Types() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "ACTIVITY_TYPES");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase>  entities = new ArrayList<>();
                List<PanacheEntityBase>  customFields = new ArrayList<>();
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        ActivityTypeEntity entity = new ActivityTypeEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        entity.orderNr = node.hasNonNull("order_nr") ? node.get("order_nr").asLong() : null;
                    entity.name = node.hasNonNull("name") ? objectMapper.writeValueAsString(node.get("name")) : null;
                    entity.keyString = node.hasNonNull("key_string") ? objectMapper.writeValueAsString(node.get("key_string")) : null;
                    entity.iconKey = node.hasNonNull("icon_key") ? objectMapper.writeValueAsString(node.get("icon_key")) : null;
                    entity.activeFlag = node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
                    entity.color = node.hasNonNull("color") ? objectMapper.writeValueAsString(node.get("color")) : null;
                    entity.isCustomFlag = node.hasNonNull("is_custom_flag") ? node.get("is_custom_flag").asBoolean() : null;
                    entity.addTime = parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
                    entity.updateTime = parseDateTime(node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
                        customFields = customFields.stream().filter(Objects::nonNull).collect(Collectors.toList());
                        entity.json = objectMapper.writeValueAsString(node);
                        entities.add(entity);
                    }

                    persistEntities(entities,"Activity_Types");
                    persistEntitiesAsync(customFields,"Activity_Types");
                }else{
                    logger.warn("Activity_Types HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Activity_Types DONE");
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Activity_Types processed. Events = " + eventsCount + ", entities = " + entitiesCount);
    }
    @Transactional
    public void initCurrencies() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "CURRENCIES");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase>  entities = new ArrayList<>();
                List<PanacheEntityBase>  customFields = new ArrayList<>();
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        CurrencieEntity entity = new CurrencieEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        entity.code = node.hasNonNull("code") ? objectMapper.writeValueAsString(node.get("code")) : null;
                    entity.name = node.hasNonNull("name") ? objectMapper.writeValueAsString(node.get("name")) : null;
                    entity.symbol = node.hasNonNull("symbol") ? objectMapper.writeValueAsString(node.get("symbol")) : null;
                    entity.decimalPoints = node.hasNonNull("decimal_points") ? node.get("decimal_points").asLong() : null;
                    entity.activeFlag = node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
                    entity.isCustomFlag = node.hasNonNull("is_custom_flag") ? node.get("is_custom_flag").asBoolean() : null;
                        customFields = customFields.stream().filter(Objects::nonNull).collect(Collectors.toList());
                        entity.json = objectMapper.writeValueAsString(node);
                        entities.add(entity);
                    }

                    persistEntities(entities,"Currencies");
                    persistEntitiesAsync(customFields,"Currencies");
                }else{
                    logger.warn("Currencies HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Currencies DONE");
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Currencies processed. Events = " + eventsCount + ", entities = " + entitiesCount);
    }
    @Transactional
    public void initRef_Deal_Fields() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "DEAL_FIELDS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase>  entities = new ArrayList<>();
                List<PanacheEntityBase>  customFields = new ArrayList<>();
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        RefDealFieldEntity entity = new RefDealFieldEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        entity.key = node.get("key").asText();
                    entity.name = node.get("name").asText();
                    entity.fieldType = node.get("field_type").asText();
                    entity.groupId = node.hasNonNull("group_id") ? node.get("group_id").asLong() : null;
                    entity.orderNr = node.hasNonNull("order_nr") ? node.get("order_nr").asLong() : null;
                    entity.jsonColumnFlag = node.hasNonNull("json_column_flag") ? node.get("json_column_flag").asBoolean() : null;
                    entity.addTime = parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
                    entity.updateTime = parseDateTime(node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
                    entity.lastUpdatedByUserId = node.hasNonNull("last_updated_by_user_id") ? node.get("last_updated_by_user_id").asLong() : null;
                    entity.editFlag = node.hasNonNull("edit_flag") ? node.get("edit_flag").asBoolean() : null;
                    entity.detailsVisibleFlag = node.hasNonNull("details_visible_flag") ? node.get("details_visible_flag").asBoolean() : null;
                    entity.addVisibleFlag = node.hasNonNull("add_visible_flag") ? node.get("add_visible_flag").asBoolean() : null;
                    entity.importantFlag = node.hasNonNull("important_flag") ? node.get("important_flag").asBoolean() : null;
                    entity.bulkEditAllowed = node.hasNonNull("bulk_edit_allowed") ? node.get("bulk_edit_allowed").asBoolean() : null;
                    entity.filteringAllowed = node.hasNonNull("filtering_allowed") ? node.get("filtering_allowed").asBoolean() : null;
                    entity.sortableFlag = node.hasNonNull("sortable_flag") ? node.get("sortable_flag").asBoolean() : null;
                    entity.mandatoryFlag = node.hasNonNull("mandatory_flag") ? objectMapper.writeValueAsString(node.get("mandatory_flag")) : null;
                    entity.searchableFlag = node.hasNonNull("searchable_flag") ? node.get("searchable_flag").asBoolean() : null;
                    entity.description = node.hasNonNull("description") ? objectMapper.writeValueAsString(node.get("description")) : null;
                    entity.createdByUserId = node.hasNonNull("created_by_user_id") ? node.get("created_by_user_id").asLong() : null;
                    entity.activeFlag = node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
                    entity.projectsDetailVisibleFlag = node.hasNonNull("projects_detail_visible_flag") ? node.get("projects_detail_visible_flag").asBoolean() : null;
                    entity.showInPipelines = node.hasNonNull("show_in_pipelines") ? objectMapper.writeValueAsString(node.get("show_in_pipelines")) : null;
                    entity.useField = node.hasNonNull("use_field") ? objectMapper.writeValueAsString(node.get("use_field")) : null;
                    entity.link = node.hasNonNull("link") ? objectMapper.writeValueAsString(node.get("link")) : null;
                    entity.isSubfield = node.hasNonNull("is_subfield") ? node.get("is_subfield").asBoolean() : null;
                    entity.parentId = node.hasNonNull("parent_id") ? node.get("parent_id").asLong() : null;
                    entity.idSuffix = node.hasNonNull("id_suffix") ? objectMapper.writeValueAsString(node.get("id_suffix")) : null;
                    entity.options = node.hasNonNull("options") ? objectMapper.writeValueAsString(node.get("options")) : null;
                        customFields = customFields.stream().filter(Objects::nonNull).collect(Collectors.toList());
                        entity.json = objectMapper.writeValueAsString(node);
                        entities.add(entity);
                    }

                    persistEntities(entities,"Ref_Deal_Fields");
                    persistEntitiesAsync(customFields,"Ref_Deal_Fields");
                }else{
                    logger.warn("Ref_Deal_Fields HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Ref_Deal_Fields DONE");
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Ref_Deal_Fields processed. Events = " + eventsCount + ", entities = " + entitiesCount);
    }
    @Transactional
    public void initDeals() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "DEALS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase>  entities = new ArrayList<>();
                List<PanacheEntityBase>  customFields = new ArrayList<>();
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        DealEntity entity = new DealEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        entity.creatorUserId = node.hasNonNull("creator_user_id") ? node.get("creator_user_id").asLong() : null;
                    entity.userId = node.hasNonNull("user_id") ? node.get("user_id").asLong() : null;
                    entity.personId = node.hasNonNull("person_id") ? node.get("person_id").asLong() : null;
                    entity.orgId = node.hasNonNull("org_id") ? node.get("org_id").asLong() : null;
                    entity.stageId = node.hasNonNull("stage_id") ? node.get("stage_id").asLong() : null;
                    entity.title = node.hasNonNull("title") ? objectMapper.writeValueAsString(node.get("title")) : null;
                    entity.value = node.hasNonNull("value") ? node.get("value").asDouble() : null;
                    entity.currency = node.hasNonNull("currency") ? objectMapper.writeValueAsString(node.get("currency")) : null;
                    entity.addTime = parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
                    entity.updateTime = parseDateTime(node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
                    entity.status = node.hasNonNull("status") ? objectMapper.writeValueAsString(node.get("status")) : null;
                    entity.probability = node.hasNonNull("probability") ? objectMapper.writeValueAsString(node.get("probability")) : null;
                    entity.lostReason = node.hasNonNull("lost_reason") ? objectMapper.writeValueAsString(node.get("lost_reason")) : null;
                    entity.visibleTo = node.hasNonNull("visible_to") ? objectMapper.writeValueAsString(node.get("visible_to")) : null;
                    entity.closeTime = parseDateTime(node.hasNonNull("close_time") ? node.get("close_time").asText() : null);
                    entity.pipelineId = node.hasNonNull("pipeline_id") ? node.get("pipeline_id").asLong() : null;
                    entity.wonTime = parseDateTime(node.hasNonNull("won_time") ? node.get("won_time").asText() : null);
                    entity.lostTime = parseDateTime(node.hasNonNull("lost_time") ? node.get("lost_time").asText() : null);
                    entity.expectedCloseDate = parseDate(node.hasNonNull("expected_close_date") ? node.get("expected_close_date").asText() : null);
                    entity.label = node.hasNonNull("label") ? objectMapper.writeValueAsString(node.get("label")) : null;
                    customFields.add(saveCustomField("DealEntity", node.get("id").asLong(), "3883508ee2b24c7e32ffab7a0495669094e8bda7", node.hasNonNull("3883508ee2b24c7e32ffab7a0495669094e8bda7") ? objectMapper.writeValueAsString(node.get("3883508ee2b24c7e32ffab7a0495669094e8bda7")) : null));
                    customFields.add(saveCustomField("DealEntity", node.get("id").asLong(), "0b9d4472baec48899d2ac6862777d37401ff116b", node.hasNonNull("0b9d4472baec48899d2ac6862777d37401ff116b") ? objectMapper.writeValueAsString(node.get("0b9d4472baec48899d2ac6862777d37401ff116b")) : null));
                    customFields.add(saveCustomField("DealEntity", node.get("id").asLong(), "65d68fc7fd9580ec398278279af739e81f46c69b", node.hasNonNull("65d68fc7fd9580ec398278279af739e81f46c69b") ? objectMapper.writeValueAsString(node.get("65d68fc7fd9580ec398278279af739e81f46c69b")) : null));
                    customFields.add(saveCustomField("DealEntity", node.get("id").asLong(), "63dcdaadd906301fb8d49583f076e60d6778e02b", node.hasNonNull("63dcdaadd906301fb8d49583f076e60d6778e02b") ? objectMapper.writeValueAsString(node.get("63dcdaadd906301fb8d49583f076e60d6778e02b")) : null));
                    customFields.add(saveCustomField("DealEntity", node.get("id").asLong(), "d81269cef9a27d5fe421990a5b25d1035e726278", node.hasNonNull("d81269cef9a27d5fe421990a5b25d1035e726278") ? objectMapper.writeValueAsString(node.get("d81269cef9a27d5fe421990a5b25d1035e726278")) : null));
                    customFields.add(saveCustomField("DealEntity", node.get("id").asLong(), "447ae5b6e73c3aacc87873c7a2b0c6db302b6772", node.hasNonNull("447ae5b6e73c3aacc87873c7a2b0c6db302b6772") ? objectMapper.writeValueAsString(node.get("447ae5b6e73c3aacc87873c7a2b0c6db302b6772")) : null));
                    customFields.add(saveCustomField("DealEntity", node.get("id").asLong(), "f9cb09a3d65029b77889df2ec437a6ea2926d903", node.hasNonNull("f9cb09a3d65029b77889df2ec437a6ea2926d903") ? objectMapper.writeValueAsString(node.get("f9cb09a3d65029b77889df2ec437a6ea2926d903")) : null));
                    customFields.add(saveCustomField("DealEntity", node.get("id").asLong(), "87e85a5534b18cff61f906e173354c8b1069d4df", node.hasNonNull("87e85a5534b18cff61f906e173354c8b1069d4df") ? objectMapper.writeValueAsString(node.get("87e85a5534b18cff61f906e173354c8b1069d4df")) : null));
                    customFields.add(saveCustomField("DealEntity", node.get("id").asLong(), "4eecb53ceb49f5b42d8f0916750909e3b11dc617", node.hasNonNull("4eecb53ceb49f5b42d8f0916750909e3b11dc617") ? objectMapper.writeValueAsString(node.get("4eecb53ceb49f5b42d8f0916750909e3b11dc617")) : null));
                    customFields.add(saveCustomField("DealEntity", node.get("id").asLong(), "302b8516b5021dab05bb0440db68fe12f6ebbbf7", node.hasNonNull("302b8516b5021dab05bb0440db68fe12f6ebbbf7") ? objectMapper.writeValueAsString(node.get("302b8516b5021dab05bb0440db68fe12f6ebbbf7")) : null));
                    customFields.add(saveCustomField("DealEntity", node.get("id").asLong(), "38e2819059967b6a5674a81fccd3119a071220ce", node.hasNonNull("38e2819059967b6a5674a81fccd3119a071220ce") ? objectMapper.writeValueAsString(node.get("38e2819059967b6a5674a81fccd3119a071220ce")) : null));
                    customFields.add(saveCustomField("DealEntity", node.get("id").asLong(), "2b79fd3ef8aeded77fddfada47808d486d7af456", node.hasNonNull("2b79fd3ef8aeded77fddfada47808d486d7af456") ? objectMapper.writeValueAsString(node.get("2b79fd3ef8aeded77fddfada47808d486d7af456")) : null));
                    customFields.add(saveCustomField("DealEntity", node.get("id").asLong(), "22465465f349d9902050838bed48cc481b8aad33", node.hasNonNull("22465465f349d9902050838bed48cc481b8aad33") ? objectMapper.writeValueAsString(node.get("22465465f349d9902050838bed48cc481b8aad33")) : null));
                    customFields.add(saveCustomField("DealEntity", node.get("id").asLong(), "465f1d50c1544de7bdf7ad752d1f96353f15cfd1", node.hasNonNull("465f1d50c1544de7bdf7ad752d1f96353f15cfd1") ? objectMapper.writeValueAsString(node.get("465f1d50c1544de7bdf7ad752d1f96353f15cfd1")) : null));
                    customFields.add(saveCustomField("DealEntity", node.get("id").asLong(), "59d0afccc1f28f8f07d633822ae106ee01fb88c8", node.hasNonNull("59d0afccc1f28f8f07d633822ae106ee01fb88c8") ? objectMapper.writeValueAsString(node.get("59d0afccc1f28f8f07d633822ae106ee01fb88c8")) : null));
                    customFields.add(saveCustomField("DealEntity", node.get("id").asLong(), "22491a17f6579d7759e03fdf6211dbc26c56f280", node.hasNonNull("22491a17f6579d7759e03fdf6211dbc26c56f280") ? objectMapper.writeValueAsString(node.get("22491a17f6579d7759e03fdf6211dbc26c56f280")) : null));
                    customFields.add(saveCustomField("DealEntity", node.get("id").asLong(), "e03e32567fde47b2b76f4b45ebff2cf6accdc270", node.hasNonNull("e03e32567fde47b2b76f4b45ebff2cf6accdc270") ? objectMapper.writeValueAsString(node.get("e03e32567fde47b2b76f4b45ebff2cf6accdc270")) : null));
                    customFields.add(saveCustomField("DealEntity", node.get("id").asLong(), "da6dbbee66a5ddf5eb03537a1120884f1e4624bc", node.hasNonNull("da6dbbee66a5ddf5eb03537a1120884f1e4624bc") ? objectMapper.writeValueAsString(node.get("da6dbbee66a5ddf5eb03537a1120884f1e4624bc")) : null));
                    customFields.add(saveCustomField("DealEntity", node.get("id").asLong(), "b2d9d57ff766881c26ef19043e1acfb7b90f1acd", node.hasNonNull("b2d9d57ff766881c26ef19043e1acfb7b90f1acd") ? objectMapper.writeValueAsString(node.get("b2d9d57ff766881c26ef19043e1acfb7b90f1acd")) : null));
                    customFields.add(saveCustomField("DealEntity", node.get("id").asLong(), "566658a615fb64eefa4e30b05dc88b474d0437b7", node.hasNonNull("566658a615fb64eefa4e30b05dc88b474d0437b7") ? objectMapper.writeValueAsString(node.get("566658a615fb64eefa4e30b05dc88b474d0437b7")) : null));
                    customFields.add(saveCustomField("DealEntity", node.get("id").asLong(), "477c1ee94c57bfef11e8b1e749f4f1b1a288e3df", node.hasNonNull("477c1ee94c57bfef11e8b1e749f4f1b1a288e3df") ? objectMapper.writeValueAsString(node.get("477c1ee94c57bfef11e8b1e749f4f1b1a288e3df")) : null));
                        customFields = customFields.stream().filter(Objects::nonNull).collect(Collectors.toList());
                        entity.json = objectMapper.writeValueAsString(node);
                        entities.add(entity);
                    }

                    persistEntities(entities,"Deals");
                    persistEntitiesAsync(customFields,"Deals");
                }else{
                    logger.warn("Deals HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Deals DONE");
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Deals processed. Events = " + eventsCount + ", entities = " + entitiesCount);
    }
    @Transactional
    public void initLead_Labels() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "LEAD_LABELS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase>  entities = new ArrayList<>();
                List<PanacheEntityBase>  customFields = new ArrayList<>();
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        LeadLabelEntity entity = new LeadLabelEntity();
                        entity.idPipedrive = UUID.fromString(node.get("id").asText());
                        entity.name = node.hasNonNull("name") ? objectMapper.writeValueAsString(node.get("name")) : null;
                    entity.color = node.hasNonNull("color") ? objectMapper.writeValueAsString(node.get("color")) : null;
                    entity.addTime = node.hasNonNull("add_time") ? objectMapper.writeValueAsString(node.get("add_time")) : null;
                    entity.updateTime = node.hasNonNull("update_time") ? objectMapper.writeValueAsString(node.get("update_time")) : null;
                        customFields = customFields.stream().filter(Objects::nonNull).collect(Collectors.toList());
                        entity.json = objectMapper.writeValueAsString(node);
                        entities.add(entity);
                    }

                    persistEntities(entities,"Lead_Labels");
                    persistEntitiesAsync(customFields,"Lead_Labels");
                }else{
                    logger.warn("Lead_Labels HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Lead_Labels DONE");
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Lead_Labels processed. Events = " + eventsCount + ", entities = " + entitiesCount);
    }
    @Transactional
    public void initLeads() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "LEADS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase>  entities = new ArrayList<>();
                List<PanacheEntityBase>  customFields = new ArrayList<>();
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        LeadEntity entity = new LeadEntity();
                        entity.idPipedrive = UUID.fromString(node.get("id").asText());
                        
                        customFields = customFields.stream().filter(Objects::nonNull).collect(Collectors.toList());
                        entity.json = objectMapper.writeValueAsString(node);
                        entities.add(entity);
                    }

                    persistEntities(entities,"Leads");
                    persistEntitiesAsync(customFields,"Leads");
                }else{
                    logger.warn("Leads HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Leads DONE");
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Leads processed. Events = " + eventsCount + ", entities = " + entitiesCount);
    }
    @Transactional
    public void initRef_Organization_Fields() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "ORGANIZATION_FIELDS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase>  entities = new ArrayList<>();
                List<PanacheEntityBase>  customFields = new ArrayList<>();
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        RefOrganizationFieldEntity entity = new RefOrganizationFieldEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        entity.key = node.get("key").asText();
                    entity.name = node.get("name").asText();
                    entity.fieldType = node.get("field_type").asText();
                    entity.groupId = node.hasNonNull("group_id") ? node.get("group_id").asLong() : null;
                    entity.orderNr = node.hasNonNull("order_nr") ? node.get("order_nr").asLong() : null;
                    entity.jsonColumnFlag = node.hasNonNull("json_column_flag") ? node.get("json_column_flag").asBoolean() : null;
                    entity.addTime = parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
                    entity.updateTime = parseDateTime(node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
                    entity.lastUpdatedByUserId = node.hasNonNull("last_updated_by_user_id") ? node.get("last_updated_by_user_id").asLong() : null;
                    entity.editFlag = node.hasNonNull("edit_flag") ? node.get("edit_flag").asBoolean() : null;
                    entity.detailsVisibleFlag = node.hasNonNull("details_visible_flag") ? node.get("details_visible_flag").asBoolean() : null;
                    entity.addVisibleFlag = node.hasNonNull("add_visible_flag") ? node.get("add_visible_flag").asBoolean() : null;
                    entity.importantFlag = node.hasNonNull("important_flag") ? node.get("important_flag").asBoolean() : null;
                    entity.bulkEditAllowed = node.hasNonNull("bulk_edit_allowed") ? node.get("bulk_edit_allowed").asBoolean() : null;
                    entity.filteringAllowed = node.hasNonNull("filtering_allowed") ? node.get("filtering_allowed").asBoolean() : null;
                    entity.sortableFlag = node.hasNonNull("sortable_flag") ? node.get("sortable_flag").asBoolean() : null;
                    entity.mandatoryFlag = node.hasNonNull("mandatory_flag") ? node.get("mandatory_flag").asBoolean() : null;
                    entity.searchableFlag = node.hasNonNull("searchable_flag") ? node.get("searchable_flag").asBoolean() : null;
                    entity.description = node.hasNonNull("description") ? objectMapper.writeValueAsString(node.get("description")) : null;
                    entity.createdByUserId = node.hasNonNull("created_by_user_id") ? node.get("created_by_user_id").asLong() : null;
                    entity.activeFlag = node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
                    entity.useField = node.hasNonNull("use_field") ? objectMapper.writeValueAsString(node.get("use_field")) : null;
                    entity.link = node.hasNonNull("link") ? objectMapper.writeValueAsString(node.get("link")) : null;
                    entity.options = node.hasNonNull("options") ? objectMapper.writeValueAsString(node.get("options")) : null;
                    entity.displayField = node.hasNonNull("display_field") ? objectMapper.writeValueAsString(node.get("display_field")) : null;
                    entity.isSubfield = node.hasNonNull("is_subfield") ? node.get("is_subfield").asBoolean() : null;
                    entity.parentId = node.hasNonNull("parent_id") ? node.get("parent_id").asLong() : null;
                    entity.idSuffix = node.hasNonNull("id_suffix") ? objectMapper.writeValueAsString(node.get("id_suffix")) : null;
                        customFields = customFields.stream().filter(Objects::nonNull).collect(Collectors.toList());
                        entity.json = objectMapper.writeValueAsString(node);
                        entities.add(entity);
                    }

                    persistEntities(entities,"Ref_Organization_Fields");
                    persistEntitiesAsync(customFields,"Ref_Organization_Fields");
                }else{
                    logger.warn("Ref_Organization_Fields HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Ref_Organization_Fields DONE");
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Ref_Organization_Fields processed. Events = " + eventsCount + ", entities = " + entitiesCount);
    }
    @Transactional
    public void initOrganizations() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "ORGANIZATIONS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase>  entities = new ArrayList<>();
                List<PanacheEntityBase>  customFields = new ArrayList<>();
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        OrganizationEntity entity = new OrganizationEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        
                        customFields = customFields.stream().filter(Objects::nonNull).collect(Collectors.toList());
                        entity.json = objectMapper.writeValueAsString(node);
                        entities.add(entity);
                    }

                    persistEntities(entities,"Organizations");
                    persistEntitiesAsync(customFields,"Organizations");
                }else{
                    logger.warn("Organizations HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Organizations DONE");
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Organizations processed. Events = " + eventsCount + ", entities = " + entitiesCount);
    }
    @Transactional
    public void initRef_Person_Fields() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "PERSON_FIELDS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase>  entities = new ArrayList<>();
                List<PanacheEntityBase>  customFields = new ArrayList<>();
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        RefPersonFieldEntity entity = new RefPersonFieldEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        entity.key = node.get("key").asText();
                    entity.name = node.get("name").asText();
                    entity.fieldType = node.get("field_type").asText();
                    entity.groupId = node.hasNonNull("group_id") ? node.get("group_id").asLong() : null;
                    entity.orderNr = node.hasNonNull("order_nr") ? node.get("order_nr").asLong() : null;
                    entity.jsonColumnFlag = node.hasNonNull("json_column_flag") ? node.get("json_column_flag").asBoolean() : null;
                    entity.addTime = parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
                    entity.updateTime = parseDateTime(node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
                    entity.lastUpdatedByUserId = node.hasNonNull("last_updated_by_user_id") ? node.get("last_updated_by_user_id").asLong() : null;
                    entity.editFlag = node.hasNonNull("edit_flag") ? node.get("edit_flag").asBoolean() : null;
                    entity.detailsVisibleFlag = node.hasNonNull("details_visible_flag") ? node.get("details_visible_flag").asBoolean() : null;
                    entity.addVisibleFlag = node.hasNonNull("add_visible_flag") ? node.get("add_visible_flag").asBoolean() : null;
                    entity.importantFlag = node.hasNonNull("important_flag") ? node.get("important_flag").asBoolean() : null;
                    entity.bulkEditAllowed = node.hasNonNull("bulk_edit_allowed") ? node.get("bulk_edit_allowed").asBoolean() : null;
                    entity.filteringAllowed = node.hasNonNull("filtering_allowed") ? node.get("filtering_allowed").asBoolean() : null;
                    entity.sortableFlag = node.hasNonNull("sortable_flag") ? node.get("sortable_flag").asBoolean() : null;
                    entity.mandatoryFlag = node.hasNonNull("mandatory_flag") ? node.get("mandatory_flag").asBoolean() : null;
                    entity.searchableFlag = node.hasNonNull("searchable_flag") ? node.get("searchable_flag").asBoolean() : null;
                    entity.description = node.hasNonNull("description") ? objectMapper.writeValueAsString(node.get("description")) : null;
                    entity.createdByUserId = node.hasNonNull("created_by_user_id") ? node.get("created_by_user_id").asLong() : null;
                    entity.activeFlag = node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
                    entity.useField = node.hasNonNull("use_field") ? objectMapper.writeValueAsString(node.get("use_field")) : null;
                    entity.link = node.hasNonNull("link") ? objectMapper.writeValueAsString(node.get("link")) : null;
                    entity.options = node.hasNonNull("options") ? objectMapper.writeValueAsString(node.get("options")) : null;
                    entity.autocomplete = node.hasNonNull("autocomplete") ? objectMapper.writeValueAsString(node.get("autocomplete")) : null;
                    entity.displayField = node.hasNonNull("display_field") ? objectMapper.writeValueAsString(node.get("display_field")) : null;
                        customFields = customFields.stream().filter(Objects::nonNull).collect(Collectors.toList());
                        entity.json = objectMapper.writeValueAsString(node);
                        entities.add(entity);
                    }

                    persistEntities(entities,"Ref_Person_Fields");
                    persistEntitiesAsync(customFields,"Ref_Person_Fields");
                }else{
                    logger.warn("Ref_Person_Fields HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Ref_Person_Fields DONE");
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Ref_Person_Fields processed. Events = " + eventsCount + ", entities = " + entitiesCount);
    }
    @Transactional
    public void initPersons() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "PERSONS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase>  entities = new ArrayList<>();
                List<PanacheEntityBase>  customFields = new ArrayList<>();
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        PersonEntity entity = new PersonEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        entity.activeFlag = node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
                    entity.ownerId = node.hasNonNull("owner_id") ? node.get("owner_id").asLong() : null;
                    entity.orgId = node.hasNonNull("org_id") ? node.get("org_id").asLong() : null;
                    entity.name = node.hasNonNull("name") ? objectMapper.writeValueAsString(node.get("name")) : null;
                    entity.phone = node.hasNonNull("phone") ? objectMapper.writeValueAsString(node.get("phone")) : null;
                    entity.email = node.hasNonNull("email") ? objectMapper.writeValueAsString(node.get("email")) : null;
                    entity.updateTime = parseDateTime(node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
                    entity.deleteTime = parseDateTime(node.hasNonNull("delete_time") ? node.get("delete_time").asText() : null);
                    entity.addTime = parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
                    entity.visibleTo = node.hasNonNull("visible_to") ? objectMapper.writeValueAsString(node.get("visible_to")) : null;
                    entity.pictureId = node.hasNonNull("picture_id") ? node.get("picture_id").asLong() : null;
                    entity.label = node.hasNonNull("label") ? objectMapper.writeValueAsString(node.get("label")) : null;
                    entity.ccEmail = node.hasNonNull("cc_email") ? objectMapper.writeValueAsString(node.get("cc_email")) : null;
                    customFields.add(saveCustomField("PersonEntity", node.get("id").asLong(), "43bfe2a67561e910f73e802f02e641dc2be77f8b", node.hasNonNull("43bfe2a67561e910f73e802f02e641dc2be77f8b") ? objectMapper.writeValueAsString(node.get("43bfe2a67561e910f73e802f02e641dc2be77f8b")) : null));
                        customFields = customFields.stream().filter(Objects::nonNull).collect(Collectors.toList());
                        entity.json = objectMapper.writeValueAsString(node);
                        entities.add(entity);
                    }

                    persistEntities(entities,"Persons");
                    persistEntitiesAsync(customFields,"Persons");
                }else{
                    logger.warn("Persons HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Persons DONE");
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Persons processed. Events = " + eventsCount + ", entities = " + entitiesCount);
    }
    @Transactional
    public void initPipelines() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "PIPELINES");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase>  entities = new ArrayList<>();
                List<PanacheEntityBase>  customFields = new ArrayList<>();
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        PipelineEntity entity = new PipelineEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        entity.name = node.hasNonNull("name") ? objectMapper.writeValueAsString(node.get("name")) : null;
                    entity.urlTitle = node.hasNonNull("url_title") ? objectMapper.writeValueAsString(node.get("url_title")) : null;
                    entity.orderNr = node.hasNonNull("order_nr") ? node.get("order_nr").asLong() : null;
                    entity.active = node.hasNonNull("active") ? node.get("active").asBoolean() : null;
                    entity.dealProbability = node.hasNonNull("deal_probability") ? node.get("deal_probability").asBoolean() : null;
                    entity.addTime = parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
                    entity.updateTime = parseDateTime(node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
                    entity.selected = node.hasNonNull("selected") ? node.get("selected").asBoolean() : null;
                        customFields = customFields.stream().filter(Objects::nonNull).collect(Collectors.toList());
                        entity.json = objectMapper.writeValueAsString(node);
                        entities.add(entity);
                    }

                    persistEntities(entities,"Pipelines");
                    persistEntitiesAsync(customFields,"Pipelines");
                }else{
                    logger.warn("Pipelines HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Pipelines DONE");
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Pipelines processed. Events = " + eventsCount + ", entities = " + entitiesCount);
    }
    @Transactional
    public void initRef_Product_Fields() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "PRODUCT_FIELDS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase>  entities = new ArrayList<>();
                List<PanacheEntityBase>  customFields = new ArrayList<>();
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        RefProductFieldEntity entity = new RefProductFieldEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        entity.key = node.get("key").asText();
                    entity.name = node.get("name").asText();
                    entity.fieldType = node.get("field_type").asText();
                    entity.groupId = node.hasNonNull("group_id") ? node.get("group_id").asLong() : null;
                    entity.orderNr = node.hasNonNull("order_nr") ? node.get("order_nr").asLong() : null;
                    entity.jsonColumnFlag = node.hasNonNull("json_column_flag") ? node.get("json_column_flag").asBoolean() : null;
                    entity.addTime = parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
                    entity.updateTime = parseDateTime(node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
                    entity.lastUpdatedByUserId = node.hasNonNull("last_updated_by_user_id") ? node.get("last_updated_by_user_id").asLong() : null;
                    entity.editFlag = node.hasNonNull("edit_flag") ? node.get("edit_flag").asBoolean() : null;
                    entity.detailsVisibleFlag = node.hasNonNull("details_visible_flag") ? node.get("details_visible_flag").asBoolean() : null;
                    entity.addVisibleFlag = node.hasNonNull("add_visible_flag") ? node.get("add_visible_flag").asBoolean() : null;
                    entity.importantFlag = node.hasNonNull("important_flag") ? node.get("important_flag").asBoolean() : null;
                    entity.bulkEditAllowed = node.hasNonNull("bulk_edit_allowed") ? node.get("bulk_edit_allowed").asBoolean() : null;
                    entity.filteringAllowed = node.hasNonNull("filtering_allowed") ? node.get("filtering_allowed").asBoolean() : null;
                    entity.sortableFlag = node.hasNonNull("sortable_flag") ? node.get("sortable_flag").asBoolean() : null;
                    entity.mandatoryFlag = node.hasNonNull("mandatory_flag") ? node.get("mandatory_flag").asBoolean() : null;
                    entity.searchableFlag = node.hasNonNull("searchable_flag") ? node.get("searchable_flag").asBoolean() : null;
                    entity.description = node.hasNonNull("description") ? objectMapper.writeValueAsString(node.get("description")) : null;
                    entity.createdByUserId = node.hasNonNull("created_by_user_id") ? node.get("created_by_user_id").asLong() : null;
                    entity.activeFlag = node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
                    entity.useField = node.hasNonNull("use_field") ? objectMapper.writeValueAsString(node.get("use_field")) : null;
                    entity.link = node.hasNonNull("link") ? objectMapper.writeValueAsString(node.get("link")) : null;
                    entity.displayField = node.hasNonNull("display_field") ? objectMapper.writeValueAsString(node.get("display_field")) : null;
                    entity.options = node.hasNonNull("options") ? objectMapper.writeValueAsString(node.get("options")) : null;
                        customFields = customFields.stream().filter(Objects::nonNull).collect(Collectors.toList());
                        entity.json = objectMapper.writeValueAsString(node);
                        entities.add(entity);
                    }

                    persistEntities(entities,"Ref_Product_Fields");
                    persistEntitiesAsync(customFields,"Ref_Product_Fields");
                }else{
                    logger.warn("Ref_Product_Fields HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Ref_Product_Fields DONE");
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Ref_Product_Fields processed. Events = " + eventsCount + ", entities = " + entitiesCount);
    }
    @Transactional
    public void initProducts() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "PRODUCTS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase>  entities = new ArrayList<>();
                List<PanacheEntityBase>  customFields = new ArrayList<>();
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        ProductEntity entity = new ProductEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        entity.name = node.hasNonNull("name") ? objectMapper.writeValueAsString(node.get("name")) : null;
                    entity.code = node.hasNonNull("code") ? objectMapper.writeValueAsString(node.get("code")) : null;
                    entity.description = node.hasNonNull("description") ? objectMapper.writeValueAsString(node.get("description")) : null;
                    entity.unit = node.hasNonNull("unit") ? objectMapper.writeValueAsString(node.get("unit")) : null;
                    entity.tax = node.hasNonNull("tax") ? node.get("tax").asLong() : null;
                    entity.category = node.hasNonNull("category") ? objectMapper.writeValueAsString(node.get("category")) : null;
                    entity.activeFlag = node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
                    entity.selectable = node.hasNonNull("selectable") ? node.get("selectable").asBoolean() : null;
                    entity.firstChar = node.hasNonNull("first_char") ? objectMapper.writeValueAsString(node.get("first_char")) : null;
                    entity.visibleTo = node.hasNonNull("visible_to") ? objectMapper.writeValueAsString(node.get("visible_to")) : null;
                    entity.ownerId = node.hasNonNull("owner_id") ? objectMapper.writeValueAsString(node.get("owner_id")) : null;
                    entity.filesCount = node.hasNonNull("files_count") ? objectMapper.writeValueAsString(node.get("files_count")) : null;
                    entity.addTime = parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
                    entity.updateTime = parseDateTime(node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
                    entity.prices = node.hasNonNull("prices") ? objectMapper.writeValueAsString(node.get("prices")) : null;
                    entity.productVariations = node.hasNonNull("product_variations") ? objectMapper.writeValueAsString(node.get("product_variations")) : null;
                        customFields = customFields.stream().filter(Objects::nonNull).collect(Collectors.toList());
                        entity.json = objectMapper.writeValueAsString(node);
                        entities.add(entity);
                    }

                    persistEntities(entities,"Products");
                    persistEntitiesAsync(customFields,"Products");
                }else{
                    logger.warn("Products HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Products DONE");
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Products processed. Events = " + eventsCount + ", entities = " + entitiesCount);
    }
    @Transactional
    public void initProjects() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "PROJECTS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase>  entities = new ArrayList<>();
                List<PanacheEntityBase>  customFields = new ArrayList<>();
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        ProjectEntity entity = new ProjectEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        
                        customFields = customFields.stream().filter(Objects::nonNull).collect(Collectors.toList());
                        entity.json = objectMapper.writeValueAsString(node);
                        entities.add(entity);
                    }

                    persistEntities(entities,"Projects");
                    persistEntitiesAsync(customFields,"Projects");
                }else{
                    logger.warn("Projects HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Projects DONE");
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Projects processed. Events = " + eventsCount + ", entities = " + entitiesCount);
    }
    @Transactional
    public void initRoles() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "ROLES");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase>  entities = new ArrayList<>();
                List<PanacheEntityBase>  customFields = new ArrayList<>();
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        RoleEntity entity = new RoleEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        entity.parentRoleId = node.hasNonNull("parent_role_id") ? node.get("parent_role_id").asLong() : null;
                    entity.name = node.hasNonNull("name") ? objectMapper.writeValueAsString(node.get("name")) : null;
                    entity.activeFlag = node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
                    entity.assignmentCount = node.hasNonNull("assignment_count") ? objectMapper.writeValueAsString(node.get("assignment_count")) : null;
                    entity.subRoleCount = node.hasNonNull("sub_role_count") ? objectMapper.writeValueAsString(node.get("sub_role_count")) : null;
                    entity.level = node.hasNonNull("level") ? node.get("level").asLong() : null;
                    entity.description = node.hasNonNull("description") ? objectMapper.writeValueAsString(node.get("description")) : null;
                        customFields = customFields.stream().filter(Objects::nonNull).collect(Collectors.toList());
                        entity.json = objectMapper.writeValueAsString(node);
                        entities.add(entity);
                    }

                    persistEntities(entities,"Roles");
                    persistEntitiesAsync(customFields,"Roles");
                }else{
                    logger.warn("Roles HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Roles DONE");
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Roles processed. Events = " + eventsCount + ", entities = " + entitiesCount);
    }
    @Transactional
    public void initStages() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "STAGES");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase>  entities = new ArrayList<>();
                List<PanacheEntityBase>  customFields = new ArrayList<>();
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        StageEntity entity = new StageEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        entity.orderNr = node.hasNonNull("order_nr") ? node.get("order_nr").asLong() : null;
                    entity.name = node.hasNonNull("name") ? objectMapper.writeValueAsString(node.get("name")) : null;
                    entity.activeFlag = node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
                    entity.dealProbability = node.hasNonNull("deal_probability") ? node.get("deal_probability").asLong() : null;
                    entity.pipelineId = node.hasNonNull("pipeline_id") ? node.get("pipeline_id").asLong() : null;
                    entity.rottenFlag = node.hasNonNull("rotten_flag") ? node.get("rotten_flag").asBoolean() : null;
                    entity.rottenDays = node.hasNonNull("rotten_days") ? objectMapper.writeValueAsString(node.get("rotten_days")) : null;
                    entity.addTime = parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
                    entity.updateTime = parseDateTime(node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
                    entity.pipelineName = node.hasNonNull("pipeline_name") ? objectMapper.writeValueAsString(node.get("pipeline_name")) : null;
                    entity.pipelineDealProbability = node.hasNonNull("pipeline_deal_probability") ? node.get("pipeline_deal_probability").asBoolean() : null;
                        customFields = customFields.stream().filter(Objects::nonNull).collect(Collectors.toList());
                        entity.json = objectMapper.writeValueAsString(node);
                        entities.add(entity);
                    }

                    persistEntities(entities,"Stages");
                    persistEntitiesAsync(customFields,"Stages");
                }else{
                    logger.warn("Stages HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Stages DONE");
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Stages processed. Events = " + eventsCount + ", entities = " + entitiesCount);
    }
    @Transactional
    public void initTasks() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "TASKS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase>  entities = new ArrayList<>();
                List<PanacheEntityBase>  customFields = new ArrayList<>();
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        TaskEntity entity = new TaskEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        
                        customFields = customFields.stream().filter(Objects::nonNull).collect(Collectors.toList());
                        entity.json = objectMapper.writeValueAsString(node);
                        entities.add(entity);
                    }

                    persistEntities(entities,"Tasks");
                    persistEntitiesAsync(customFields,"Tasks");
                }else{
                    logger.warn("Tasks HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Tasks DONE");
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Tasks processed. Events = " + eventsCount + ", entities = " + entitiesCount);
    }
    @Transactional
    public void initUsers() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "USERS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase>  entities = new ArrayList<>();
                List<PanacheEntityBase>  customFields = new ArrayList<>();
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        UserEntity entity = new UserEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        entity.name = node.hasNonNull("name") ? objectMapper.writeValueAsString(node.get("name")) : null;
                    entity.email = node.hasNonNull("email") ? objectMapper.writeValueAsString(node.get("email")) : null;
                    entity.lang = node.hasNonNull("lang") ? node.get("lang").asLong() : null;
                    entity.locale = node.hasNonNull("locale") ? objectMapper.writeValueAsString(node.get("locale")) : null;
                    entity.timezoneName = node.hasNonNull("timezone_name") ? objectMapper.writeValueAsString(node.get("timezone_name")) : null;
                    entity.timezoneOffset = node.hasNonNull("timezone_offset") ? objectMapper.writeValueAsString(node.get("timezone_offset")) : null;
                    entity.defaultCurrency = node.hasNonNull("default_currency") ? objectMapper.writeValueAsString(node.get("default_currency")) : null;
                    entity.iconUrl = node.hasNonNull("icon_url") ? objectMapper.writeValueAsString(node.get("icon_url")) : null;
                    entity.activeFlag = node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
                    entity.isDeleted = node.hasNonNull("is_deleted") ? node.get("is_deleted").asBoolean() : null;
                    entity.isAdmin = node.hasNonNull("is_admin") ? node.get("is_admin").asLong() : null;
                    entity.roleId = node.hasNonNull("role_id") ? node.get("role_id").asLong() : null;
                    entity.created = parseDateTime(node.hasNonNull("created") ? node.get("created").asText() : null);
                    entity.hasCreatedCompany = node.hasNonNull("has_created_company") ? node.get("has_created_company").asBoolean() : null;
                    entity.isYou = node.hasNonNull("is_you") ? node.get("is_you").asBoolean() : null;
                    entity.access = node.hasNonNull("access") ? objectMapper.writeValueAsString(node.get("access")) : null;
                    entity.modified = parseDateTime(node.hasNonNull("modified") ? node.get("modified").asText() : null);
                    entity.lastLogin = parseDateTime(node.hasNonNull("last_login") ? node.get("last_login").asText() : null);
                    entity.phone = node.hasNonNull("phone") ? objectMapper.writeValueAsString(node.get("phone")) : null;
                        customFields = customFields.stream().filter(Objects::nonNull).collect(Collectors.toList());
                        entity.json = objectMapper.writeValueAsString(node);
                        entities.add(entity);
                    }

                    persistEntities(entities,"Users");
                    persistEntitiesAsync(customFields,"Users");
                }else{
                    logger.warn("Users HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Users DONE");
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Users processed. Events = " + eventsCount + ", entities = " + entitiesCount);
    }
    @Transactional
    public void initWebhooks() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = getEventEntities(pageIndex, pageSize, "WEBHOOKS");
            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                List<PanacheEntityBase>  entities = new ArrayList<>();
                List<PanacheEntityBase>  customFields = new ArrayList<>();
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        WebhookEntity entity = new WebhookEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        entity.companyId = node.hasNonNull("company_id") ? node.get("company_id").asLong() : null;
                    entity.ownerId = node.hasNonNull("owner_id") ? node.get("owner_id").asLong() : null;
                    entity.userId = node.hasNonNull("user_id") ? node.get("user_id").asLong() : null;
                    entity.eventAction = node.hasNonNull("event_action") ? objectMapper.writeValueAsString(node.get("event_action")) : null;
                    entity.eventObject = node.hasNonNull("event_object") ? objectMapper.writeValueAsString(node.get("event_object")) : null;
                    entity.subscriptionUrl = node.hasNonNull("subscription_url") ? objectMapper.writeValueAsString(node.get("subscription_url")) : null;
                    entity.isActive = node.hasNonNull("is_active") ? node.get("is_active").asLong() : null;
                    entity.addTime = node.hasNonNull("add_time") ? objectMapper.writeValueAsString(node.get("add_time")) : null;
                    entity.removeTime = parseDateTime(node.hasNonNull("remove_time") ? node.get("remove_time").asText() : null);
                    entity.type = node.hasNonNull("type") ? objectMapper.writeValueAsString(node.get("type")) : null;
                    entity.httpAuthUser = node.hasNonNull("http_auth_user") ? objectMapper.writeValueAsString(node.get("http_auth_user")) : null;
                    entity.httpAuthPassword = node.hasNonNull("http_auth_password") ? objectMapper.writeValueAsString(node.get("http_auth_password")) : null;
                    entity.removeReason = node.hasNonNull("remove_reason") ? objectMapper.writeValueAsString(node.get("remove_reason")) : null;
                    entity.version = node.hasNonNull("version") ? objectMapper.writeValueAsString(node.get("version")) : null;
                    entity.name = node.hasNonNull("name") ? objectMapper.writeValueAsString(node.get("name")) : null;
                    entity.lastDeliveryTime = node.hasNonNull("last_delivery_time") ? objectMapper.writeValueAsString(node.get("last_delivery_time")) : null;
                    entity.lastHttpStatus = node.hasNonNull("last_http_status") ? objectMapper.writeValueAsString(node.get("last_http_status")) : null;
                    entity.adminId = node.hasNonNull("admin_id") ? node.get("admin_id").asLong() : null;
                        customFields = customFields.stream().filter(Objects::nonNull).collect(Collectors.toList());
                        entity.json = objectMapper.writeValueAsString(node);
                        entities.add(entity);
                    }

                    persistEntities(entities,"Webhooks");
                    persistEntitiesAsync(customFields,"Webhooks");
                }else{
                    logger.warn("Webhooks HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            logger.info(pageIndex + " Webhooks DONE");
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Webhooks processed. Events = " + eventsCount + ", entities = " + entitiesCount);
    }

}