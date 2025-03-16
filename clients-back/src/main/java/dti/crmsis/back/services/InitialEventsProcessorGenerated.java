package dti.crmsis.back.services;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import dti.crmsis.back.dao.clientsback.*;
import dti.crmsis.back.dao.crmsis.CustomerEntity;
import io.quarkus.panache.common.Page;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.jboss.logging.Logger;

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
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "ACTIVITIES")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
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
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Activities HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
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
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "ACTIVITY_FIELDS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
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
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Ref_Activity_Fields HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
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
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "ACTIVITY_TYPES")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
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
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Activity_Types HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
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
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "CURRENCIES")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
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
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Currencies HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
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
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "DEAL_FIELDS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
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
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Ref_Deal_Fields HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
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
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "DEALS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
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
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Deals HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
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
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "LEAD_LABELS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
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
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Lead_Labels HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
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
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "LEADS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        LeadEntity entity = new LeadEntity();
                        entity.idPipedrive = UUID.fromString(node.get("id").asText());
                        
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Leads HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
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
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "ORGANIZATION_FIELDS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
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
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Ref_Organization_Fields HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
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
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "ORGANIZATIONS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        OrganizationEntity entity = new OrganizationEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Organizations HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
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
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "PERSON_FIELDS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
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
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Ref_Person_Fields HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
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
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "PERSONS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
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
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Persons HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
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
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "PIPELINES")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
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
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Pipelines HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
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
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "PRODUCT_FIELDS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
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
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Ref_Product_Fields HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
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
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "PRODUCTS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
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
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Products HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
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
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "PROJECTS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        ProjectEntity entity = new ProjectEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Projects HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
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
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "ROLES")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
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
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Roles HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
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
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "STAGES")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
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
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Stages HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
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
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "TASKS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        TaskEntity entity = new TaskEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Tasks HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
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
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "USERS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
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
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Users HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
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
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "WEBHOOKS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
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
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Webhooks HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Webhooks processed. Events = " + eventsCount + ", entities = " + entitiesCount);
    }

}