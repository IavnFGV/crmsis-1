package dti.crmsis.back.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import dti.crmsis.back.dao.clientsback.*;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import org.jboss.logging.Logger;

import java.io.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.stream.Collectors;

@ApplicationScoped
public class JsonToEntityServiceGenerated {

    private static final Logger logger = Logger.getLogger(JsonToEntityServiceGenerated.class);

    @Inject private ObjectMapper objectMapper;

    @Inject KnownFieldService knownFieldService;

    public String writeNodeAsString(JsonNode node) {
        try {
            String s = objectMapper.writeValueAsString(node);
            if (s.startsWith("\"") && s.endsWith("\"")) {
                s = s.substring(1, s.length() - 1);
            }
            return s;
        } catch (JsonProcessingException e) {
            logger.error(e.getMessage(), e);
            return "EMPTY_AS_THERE_WAS_ERROR";
        }
    }

    public LocalDateTime parseDateTime(String dateStr) {
        if (dateStr == null || dateStr.isEmpty()) {
            return null;
        }
        LocalDateTime dateTime;
        try {
            dateTime =
                    LocalDateTime.parse(
                            dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
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

    public static PanacheEntityBase saveCustomField(
            String mainEntityClassName, Long mainEntityId, String customFieldName, String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        switch (mainEntityClassName) {
            case "ActivityEntity":
                ActivityCustomFieldEntity activityCustomFieldEntity =
                        new ActivityCustomFieldEntity();
                activityCustomFieldEntity.mainEntityId = mainEntityId;
                activityCustomFieldEntity.key = customFieldName;
                activityCustomFieldEntity.value = value;
                return activityCustomFieldEntity;
            case "DealEntity":
                DealCustomFieldEntity dealCustomFieldEntity = new DealCustomFieldEntity();
                dealCustomFieldEntity.mainEntityId = mainEntityId;
                dealCustomFieldEntity.key = customFieldName;
                dealCustomFieldEntity.value = value;
                return dealCustomFieldEntity;
            case "OrganizationEntity":
                OrganizationCustomFieldEntity organizationCustomFieldEntity =
                        new OrganizationCustomFieldEntity();
                organizationCustomFieldEntity.mainEntityId = mainEntityId;
                organizationCustomFieldEntity.key = customFieldName;
                organizationCustomFieldEntity.value = value;
                return organizationCustomFieldEntity;
            case "PersonEntity":
                PersonCustomFieldEntity personCustomFieldEntity = new PersonCustomFieldEntity();
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

    public List<List<PanacheEntityBase>> toActivityEntity(JsonNode node) {
        List<PanacheEntityBase> entities = new ArrayList<>();

        List<PanacheEntityBase> additionalEntities =
                knownFieldService.ensureAllFieldsAreKnown(node, "activity");
        Map<Boolean, List<PanacheEntityBase>> partitioned =
                additionalEntities.stream()
                        .collect(Collectors.partitioningBy(entity -> entity instanceof RefField));
        List<PanacheEntityBase> customFieldsRefs = partitioned.get(true);
        List<PanacheEntityBase> customFields = partitioned.get(false);
        if (customFieldsRefs == null) {
            customFieldsRefs = new ArrayList<>();
        }

        ActivityEntity entity = new ActivityEntity();
        entity.idPipedrive = node.get("id").asLong();
        entity.userId = node.hasNonNull("user_id") ? node.get("user_id").asLong() : null;
        entity.done = node.hasNonNull("done") ? node.get("done").asBoolean() : null;
        entity.type = node.hasNonNull("type") ? writeNodeAsString(node.get("type")) : null;
        entity.referenceType =
                node.hasNonNull("reference_type")
                        ? writeNodeAsString(node.get("reference_type"))
                        : null;
        entity.referenceId =
                node.hasNonNull("reference_id") ? node.get("reference_id").asLong() : null;
        entity.conferenceMeetingClient =
                node.hasNonNull("conference_meeting_client")
                        ? writeNodeAsString(node.get("conference_meeting_client"))
                        : null;
        entity.conferenceMeetingUrl =
                node.hasNonNull("conference_meeting_url")
                        ? writeNodeAsString(node.get("conference_meeting_url"))
                        : null;
        entity.dueDate =
                parseDate(node.hasNonNull("due_date") ? node.get("due_date").asText() : null);
        entity.dueTime =
                node.hasNonNull("due_time") ? writeNodeAsString(node.get("due_time")) : null;
        entity.duration = node.hasNonNull("duration") ? node.get("duration").asBoolean() : null;
        entity.busyFlag = node.hasNonNull("busy_flag") ? node.get("busy_flag").asBoolean() : null;
        entity.addTime =
                parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
        entity.markedAsDoneTime =
                parseDateTime(
                        node.hasNonNull("marked_as_done_time")
                                ? node.get("marked_as_done_time").asText()
                                : null);
        entity.lastNotificationTime =
                parseDateTime(
                        node.hasNonNull("last_notification_time")
                                ? node.get("last_notification_time").asText()
                                : null);
        entity.lastNotificationUserId =
                node.hasNonNull("last_notification_user_id")
                        ? node.get("last_notification_user_id").asLong()
                        : null;
        entity.notificationLanguageId =
                node.hasNonNull("notification_language_id")
                        ? node.get("notification_language_id").asLong()
                        : null;
        entity.subject = node.hasNonNull("subject") ? writeNodeAsString(node.get("subject")) : null;
        entity.publicDescription =
                node.hasNonNull("public_description")
                        ? node.get("public_description").asBoolean()
                        : null;
        entity.calendarSyncIncludeContext =
                node.hasNonNull("calendar_sync_include_context")
                        ? writeNodeAsString(node.get("calendar_sync_include_context"))
                        : null;
        entity.location =
                node.hasNonNull("location") ? writeNodeAsString(node.get("location")) : null;
        entity.orgId = node.hasNonNull("org_id") ? node.get("org_id").asLong() : null;
        entity.personId = node.hasNonNull("person_id") ? node.get("person_id").asLong() : null;
        entity.dealId = node.hasNonNull("deal_id") ? node.get("deal_id").asLong() : null;
        entity.leadId = node.hasNonNull("lead_id") ? node.get("lead_id").asLong() : null;
        entity.activeFlag =
                node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
        entity.updateTime =
                parseDateTime(
                        node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
        entity.updateUserId =
                node.hasNonNull("update_user_id") ? node.get("update_user_id").asLong() : null;
        entity.sourceTimezone =
                node.hasNonNull("source_timezone")
                        ? writeNodeAsString(node.get("source_timezone"))
                        : null;
        entity.recRule =
                node.hasNonNull("rec_rule") ? writeNodeAsString(node.get("rec_rule")) : null;
        entity.recRuleExtension =
                node.hasNonNull("rec_rule_extension")
                        ? writeNodeAsString(node.get("rec_rule_extension"))
                        : null;
        entity.recMasterActivityId =
                node.hasNonNull("rec_master_activity_id")
                        ? node.get("rec_master_activity_id").asLong()
                        : null;
        entity.conferenceMeetingId =
                node.hasNonNull("conference_meeting_id")
                        ? node.get("conference_meeting_id").asLong()
                        : null;
        entity.originalStartTime =
                parseDateTime(
                        node.hasNonNull("original_start_time")
                                ? node.get("original_start_time").asText()
                                : null);
        entity.isPrivate = node.hasNonNull("private") ? node.get("private").asBoolean() : null;
        entity.priority =
                node.hasNonNull("priority") ? writeNodeAsString(node.get("priority")) : null;
        entity.note = node.hasNonNull("note") ? writeNodeAsString(node.get("note")) : null;
        entity.createdByUserId =
                node.hasNonNull("created_by_user_id")
                        ? node.get("created_by_user_id").asLong()
                        : null;
        entity.locationSubpremise =
                node.hasNonNull("location_subpremise")
                        ? writeNodeAsString(node.get("location_subpremise"))
                        : null;
        entity.locationStreetNumber =
                node.hasNonNull("location_street_number")
                        ? writeNodeAsString(node.get("location_street_number"))
                        : null;
        entity.locationRoute =node.hasNonNull("location_route")
                        ? writeNodeAsString(node.get("location_route"))
                        : null;
        entity.locationSublocality =
                node.hasNonNull("location_sublocality")
                        ? writeNodeAsString(node.get("location_sublocality"))
                        : null;
        entity.locationLocality =
                node.hasNonNull("location_locality")
                        ? writeNodeAsString(node.get("location_locality"))
                        : null;
        entity.locationAdminAreaLevel1 =
                node.hasNonNull("location_admin_area_level_1")
                        ? writeNodeAsString(node.get("location_admin_area_level_1"))
                        : null;
        entity.locationAdminAreaLevel2 =
                node.hasNonNull("location_admin_area_level_2")
                        ? writeNodeAsString(node.get("location_admin_area_level_2"))
                        : null;
        entity.locationCountry =
                node.hasNonNull("location_country")
                        ? writeNodeAsString(node.get("location_country"))
                        : null;
        entity.locationPostalCode =
                node.hasNonNull("location_postal_code")
                        ? writeNodeAsString(node.get("location_postal_code"))
                        : null;
        entity.locationFormattedAddress =
                node.hasNonNull("location_formatted_address")
                        ? writeNodeAsString(node.get("location_formatted_address"))
                        : null;
        entity.attendees =
                node.hasNonNull("attendees") ? writeNodeAsString(node.get("attendees")) : null;
        entity.participants =
                node.hasNonNull("participants")
                        ? writeNodeAsString(node.get("participants"))
                        : null;
        entity.series = node.hasNonNull("series") ? writeNodeAsString(node.get("series")) : null;
        entity.isRecurring =
                node.hasNonNull("is_recurring") ? node.get("is_recurring").asBoolean() : null;
        entity.orgName =
                node.hasNonNull("org_name") ? writeNodeAsString(node.get("org_name")) : null;
        entity.personName =
                node.hasNonNull("person_name") ? writeNodeAsString(node.get("person_name")) : null;
        entity.dealTitle =
                node.hasNonNull("deal_title") ? writeNodeAsString(node.get("deal_title")) : null;
        entity.leadTitle =
                node.hasNonNull("lead_title") ? writeNodeAsString(node.get("lead_title")) : null;
        entity.ownerName =
                node.hasNonNull("owner_name") ? writeNodeAsString(node.get("owner_name")) : null;
        entity.personDropboxBcc =
                node.hasNonNull("person_dropbox_bcc")
                        ? writeNodeAsString(node.get("person_dropbox_bcc"))
                        : null;
        entity.dealDropboxBcc =
                node.hasNonNull("deal_dropbox_bcc")
                        ? writeNodeAsString(node.get("deal_dropbox_bcc"))
                        : null;
        entity.assignedToUserId =
                node.hasNonNull("assigned_to_user_id")
                        ? node.get("assigned_to_user_id").asLong()
                        : null;
        entity.typeName =
                node.hasNonNull("type_name") ? writeNodeAsString(node.get("type_name")) : null;
        entity.lead = node.hasNonNull("lead") ? writeNodeAsString(node.get("lead")) : null;
        entity.companyId = node.hasNonNull("company_id") ? node.get("company_id").asLong() : null;
        entity.ownerId = node.hasNonNull("owner_id") ? node.get("owner_id").asLong() : null;
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return List.of(entities, customFields, customFieldsRefs);
    }

    public List<List<PanacheEntityBase>> toRefActivityFieldEntity(JsonNode node) {
        List<PanacheEntityBase> entities = new ArrayList<>();

        List<PanacheEntityBase> additionalEntities =
                knownFieldService.ensureAllFieldsAreKnown(node, "refactivityfield");
        Map<Boolean, List<PanacheEntityBase>> partitioned =
                additionalEntities.stream()
                        .collect(Collectors.partitioningBy(entity -> entity instanceof RefField));
        List<PanacheEntityBase> customFieldsRefs = partitioned.get(true);
        List<PanacheEntityBase> customFields = partitioned.get(false);
        if (customFieldsRefs == null) {
            customFieldsRefs = new ArrayList<>();
        }

        RefActivityFieldEntity entity = new RefActivityFieldEntity();
        entity.idPipedrive = node.get("id").asLong();
        entity.key = node.get("key").asText();
        entity.name = node.get("name").asText();
        entity.fieldType = node.get("field_type").asText();
        entity.groupId = node.hasNonNull("group_id") ? node.get("group_id").asLong() : null;
        entity.orderNr = node.hasNonNull("order_nr") ? node.get("order_nr").asLong() : null;
        entity.jsonColumnFlag =
                node.hasNonNull("json_column_flag")
                        ? node.get("json_column_flag").asBoolean()
                        : null;
        entity.addTime =
                parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
        entity.updateTime =
                parseDateTime(
                        node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
        entity.lastUpdatedByUserId =
                node.hasNonNull("last_updated_by_user_id")
                        ? node.get("last_updated_by_user_id").asLong()
                        : null;
        entity.editFlag = node.hasNonNull("edit_flag") ? node.get("edit_flag").asBoolean() : null;
        entity.detailsVisibleFlag =
                node.hasNonNull("details_visible_flag")
                        ? node.get("details_visible_flag").asBoolean()
                        : null;
        entity.addVisibleFlag =
                node.hasNonNull("add_visible_flag")
                        ? node.get("add_visible_flag").asBoolean()
                        : null;
        entity.importantFlag =
                node.hasNonNull("important_flag") ? node.get("important_flag").asBoolean() : null;
        entity.bulkEditAllowed =
                node.hasNonNull("bulk_edit_allowed")
                        ? node.get("bulk_edit_allowed").asBoolean()
                        : null;
        entity.filteringAllowed =
                node.hasNonNull("filtering_allowed")
                        ? node.get("filtering_allowed").asBoolean()
                        : null;
        entity.sortableFlag =
                node.hasNonNull("sortable_flag") ? node.get("sortable_flag").asBoolean() : null;
        entity.mandatoryFlag =
                node.hasNonNull("mandatory_flag") ? node.get("mandatory_flag").asBoolean() : null;
        entity.searchableFlag =
                node.hasNonNull("searchable_flag") ? node.get("searchable_flag").asBoolean() : null;
        entity.description =
                node.hasNonNull("description") ? writeNodeAsString(node.get("description")) : null;
        entity.createdByUserId =
                node.hasNonNull("created_by_user_id")
                        ? node.get("created_by_user_id").asLong()
                        : null;
        entity.activeFlag =
                node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
        entity.options = node.hasNonNull("options") ? writeNodeAsString(node.get("options")) : null;
        entity.isSubfield =
                node.hasNonNull("is_subfield") ? node.get("is_subfield").asBoolean() : null;
        entity.parentId = node.hasNonNull("parent_id") ? node.get("parent_id").asLong() : null;
        entity.idSuffix =
                node.hasNonNull("id_suffix") ? writeNodeAsString(node.get("id_suffix")) : null;
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return List.of(entities, customFields, customFieldsRefs);
    }

    public List<List<PanacheEntityBase>> toActivityTypeEntity(JsonNode node) {
        List<PanacheEntityBase> entities = new ArrayList<>();

        List<PanacheEntityBase> additionalEntities =
                knownFieldService.ensureAllFieldsAreKnown(node, "activitytype");
        Map<Boolean, List<PanacheEntityBase>> partitioned =
                additionalEntities.stream()
                        .collect(Collectors.partitioningBy(entity -> entity instanceof RefField));
        List<PanacheEntityBase> customFieldsRefs = partitioned.get(true);
        List<PanacheEntityBase> customFields = partitioned.get(false);
        if (customFieldsRefs == null) {
            customFieldsRefs = new ArrayList<>();
        }

        ActivityTypeEntity entity = new ActivityTypeEntity();
        entity.idPipedrive = node.get("id").asLong();
        entity.orderNr = node.hasNonNull("order_nr") ? node.get("order_nr").asLong() : null;
        entity.name = node.hasNonNull("name") ? writeNodeAsString(node.get("name")) : null;
        entity.keyString =
                node.hasNonNull("key_string") ? writeNodeAsString(node.get("key_string")) : null;
        entity.iconKey =
                node.hasNonNull("icon_key") ? writeNodeAsString(node.get("icon_key")) : null;
        entity.activeFlag =
                node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
        entity.color = node.hasNonNull("color") ? writeNodeAsString(node.get("color")) : null;
        entity.isCustomFlag =
                node.hasNonNull("is_custom_flag") ? node.get("is_custom_flag").asBoolean() : null;
        entity.addTime =
                parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
        entity.updateTime =
                parseDateTime(
                        node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return List.of(entities, customFields, customFieldsRefs);
    }

    public List<List<PanacheEntityBase>> toCurrencieEntity(JsonNode node) {
        List<PanacheEntityBase> entities = new ArrayList<>();

        List<PanacheEntityBase> additionalEntities =
                knownFieldService.ensureAllFieldsAreKnown(node, "currencie");
        Map<Boolean, List<PanacheEntityBase>> partitioned =
                additionalEntities.stream()
                        .collect(Collectors.partitioningBy(entity -> entity instanceof RefField));
        List<PanacheEntityBase> customFieldsRefs = partitioned.get(true);
        List<PanacheEntityBase> customFields = partitioned.get(false);
        if (customFieldsRefs == null) {
            customFieldsRefs = new ArrayList<>();
        }

        CurrencieEntity entity = new CurrencieEntity();
        entity.idPipedrive = node.get("id").asLong();
        entity.code = node.hasNonNull("code") ? writeNodeAsString(node.get("code")) : null;
        entity.name = node.hasNonNull("name") ? writeNodeAsString(node.get("name")) : null;
        entity.symbol = node.hasNonNull("symbol") ? writeNodeAsString(node.get("symbol")) : null;
        entity.decimalPoints =
                node.hasNonNull("decimal_points") ? node.get("decimal_points").asLong() : null;
        entity.activeFlag =
                node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
        entity.isCustomFlag =
                node.hasNonNull("is_custom_flag") ? node.get("is_custom_flag").asBoolean() : null;
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return List.of(entities, customFields, customFieldsRefs);
    }

    public List<List<PanacheEntityBase>> toRefDealFieldEntity(JsonNode node) {
        List<PanacheEntityBase> entities = new ArrayList<>();

        List<PanacheEntityBase> additionalEntities =
                knownFieldService.ensureAllFieldsAreKnown(node, "refdealfield");
        Map<Boolean, List<PanacheEntityBase>> partitioned =
                additionalEntities.stream()
                        .collect(Collectors.partitioningBy(entity -> entity instanceof RefField));
        List<PanacheEntityBase> customFieldsRefs = partitioned.get(true);
        List<PanacheEntityBase> customFields = partitioned.get(false);
        if (customFieldsRefs == null) {
            customFieldsRefs = new ArrayList<>();
        }

        RefDealFieldEntity entity = new RefDealFieldEntity();
        entity.idPipedrive = node.get("id").asLong();
        entity.key = node.get("key").asText();
        entity.name = node.get("name").asText();
        entity.fieldType = node.get("field_type").asText();
        entity.groupId = node.hasNonNull("group_id") ? node.get("group_id").asLong() : null;
        entity.orderNr = node.hasNonNull("order_nr") ? node.get("order_nr").asLong() : null;
        entity.jsonColumnFlag =
                node.hasNonNull("json_column_flag")
                        ? node.get("json_column_flag").asBoolean()
                        : null;
        entity.addTime =
                parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
        entity.updateTime =
                parseDateTime(
                        node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
        entity.lastUpdatedByUserId =
                node.hasNonNull("last_updated_by_user_id")
                        ? node.get("last_updated_by_user_id").asLong()
                        : null;
        entity.editFlag = node.hasNonNull("edit_flag") ? node.get("edit_flag").asBoolean() : null;
        entity.detailsVisibleFlag =
                node.hasNonNull("details_visible_flag")
                        ? node.get("details_visible_flag").asBoolean()
                        : null;
        entity.addVisibleFlag =
                node.hasNonNull("add_visible_flag")
                        ? node.get("add_visible_flag").asBoolean()
                        : null;
        entity.importantFlag =
                node.hasNonNull("important_flag") ? node.get("important_flag").asBoolean() : null;
        entity.bulkEditAllowed =
                node.hasNonNull("bulk_edit_allowed")
                        ? node.get("bulk_edit_allowed").asBoolean()
                        : null;
        entity.filteringAllowed =
                node.hasNonNull("filtering_allowed")
                        ? node.get("filtering_allowed").asBoolean()
                        : null;
        entity.sortableFlag =
                node.hasNonNull("sortable_flag") ? node.get("sortable_flag").asBoolean() : null;
        entity.mandatoryFlag =
                node.hasNonNull("mandatory_flag")
                        ? writeNodeAsString(node.get("mandatory_flag"))
                        : null;
        entity.searchableFlag =
                node.hasNonNull("searchable_flag") ? node.get("searchable_flag").asBoolean() : null;
        entity.description =
                node.hasNonNull("description") ? writeNodeAsString(node.get("description")) : null;
        entity.createdByUserId =
                node.hasNonNull("created_by_user_id")
                        ? node.get("created_by_user_id").asLong()
                        : null;
        entity.activeFlag =
                node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
        entity.projectsDetailVisibleFlag =
                node.hasNonNull("projects_detail_visible_flag")
                        ? node.get("projects_detail_visible_flag").asBoolean()
                        : null;
        entity.showInPipelines =
                node.hasNonNull("show_in_pipelines")
                        ? writeNodeAsString(node.get("show_in_pipelines"))
                        : null;
        entity.useField =
                node.hasNonNull("use_field") ? writeNodeAsString(node.get("use_field")) : null;
        entity.link = node.hasNonNull("link") ? writeNodeAsString(node.get("link")) : null;
        entity.isSubfield =
                node.hasNonNull("is_subfield") ? node.get("is_subfield").asBoolean() : null;
        entity.parentId = node.hasNonNull("parent_id") ? node.get("parent_id").asLong() : null;
        entity.idSuffix =
                node.hasNonNull("id_suffix") ? writeNodeAsString(node.get("id_suffix")) : null;
        entity.options = node.hasNonNull("options") ? writeNodeAsString(node.get("options")) : null;
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return List.of(entities, customFields, customFieldsRefs);
    }

    public List<List<PanacheEntityBase>> toDealEntity(JsonNode node) {
        List<PanacheEntityBase> entities = new ArrayList<>();

        List<PanacheEntityBase> additionalEntities =
                knownFieldService.ensureAllFieldsAreKnown(node, "deal");
        Map<Boolean, List<PanacheEntityBase>> partitioned =
                additionalEntities.stream()
                        .collect(Collectors.partitioningBy(entity -> entity instanceof RefField));
        List<PanacheEntityBase> customFieldsRefs = partitioned.get(true);
        List<PanacheEntityBase> customFields = partitioned.get(false);
        if (customFieldsRefs == null) {
            customFieldsRefs = new ArrayList<>();
        }

        DealEntity entity = new DealEntity();
        entity.idPipedrive = node.get("id").asLong();
        entity.creatorUserId =
                node.hasNonNull("creator_user_id") ? node.get("creator_user_id").asLong() : null;
        entity.userId = node.hasNonNull("user_id") ? node.get("user_id").asLong() : null;
        entity.personId = node.hasNonNull("person_id") ? node.get("person_id").asLong() : null;
        entity.orgId = node.hasNonNull("org_id") ? node.get("org_id").asLong() : null;
        entity.stageId = node.hasNonNull("stage_id") ? node.get("stage_id").asLong() : null;
        entity.title = node.hasNonNull("title") ? writeNodeAsString(node.get("title")) : null;
        entity.value = node.hasNonNull("value") ? node.get("value").asDouble() : null;
        entity.currency =
                node.hasNonNull("currency") ? writeNodeAsString(node.get("currency")) : null;
        entity.addTime =
                parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
        entity.updateTime =
                parseDateTime(
                        node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
        entity.status = node.hasNonNull("status") ? writeNodeAsString(node.get("status")) : null;
        entity.probability =
                node.hasNonNull("probability") ? writeNodeAsString(node.get("probability")) : null;
        entity.lostReason =
                node.hasNonNull("lost_reason") ? writeNodeAsString(node.get("lost_reason")) : null;
        entity.visibleTo =
                node.hasNonNull("visible_to") ? writeNodeAsString(node.get("visible_to")) : null;
        entity.closeTime =
                parseDateTime(
                        node.hasNonNull("close_time") ? node.get("close_time").asText() : null);
        entity.pipelineId =
                node.hasNonNull("pipeline_id") ? node.get("pipeline_id").asLong() : null;
        entity.wonTime =
                parseDateTime(node.hasNonNull("won_time") ? node.get("won_time").asText() : null);
        entity.lostTime =
                parseDateTime(node.hasNonNull("lost_time") ? node.get("lost_time").asText() : null);
        entity.expectedCloseDate =
                parseDate(
                        node.hasNonNull("expected_close_date")
                                ? node.get("expected_close_date").asText()
                                : null);
        entity.label = node.hasNonNull("label") ? writeNodeAsString(node.get("label")) : null;
        entity.origin = node.hasNonNull("origin") ? writeNodeAsString(node.get("origin")) : null;
        entity.channel = node.hasNonNull("channel") ? writeNodeAsString(node.get("channel")) : null;
        entity.ownerId = node.hasNonNull("owner_id") ? node.get("owner_id").asLong() : null;
        entity.labelIds =
                node.hasNonNull("label_ids") ? writeNodeAsString(node.get("label_ids")) : null;
        entity.originId = node.hasNonNull("origin_id") ? node.get("origin_id").asLong() : null;
        entity.channelId = node.hasNonNull("channel_id") ? node.get("channel_id").asLong() : null;
        entity.firstWonTime =
                parseDateTime(
                        node.hasNonNull("first_won_time")
                                ? node.get("first_won_time").asText()
                                : null);
        entity.stageChangeTime =
                parseDateTime(
                        node.hasNonNull("stage_change_time")
                                ? node.get("stage_change_time").asText()
                                : null);
        entity.isArchived =
                node.hasNonNull("is_archived") ? node.get("is_archived").asBoolean() : null;
        entity.archiveTime =
                parseDateTime(
                        node.hasNonNull("archive_time") ? node.get("archive_time").asText() : null);
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return List.of(entities, customFields, customFieldsRefs);
    }

    public List<List<PanacheEntityBase>> toLeadLabelEntity(JsonNode node) {
        List<PanacheEntityBase> entities = new ArrayList<>();

        List<PanacheEntityBase> additionalEntities =
                knownFieldService.ensureAllFieldsAreKnown(node, "leadlabel");
        Map<Boolean, List<PanacheEntityBase>> partitioned =
                additionalEntities.stream()
                        .collect(Collectors.partitioningBy(entity -> entity instanceof RefField));
        List<PanacheEntityBase> customFieldsRefs = partitioned.get(true);
        List<PanacheEntityBase> customFields = partitioned.get(false);
        if (customFieldsRefs == null) {
            customFieldsRefs = new ArrayList<>();
        }

        LeadLabelEntity entity = new LeadLabelEntity();
        entity.idPipedrive = UUID.fromString(node.get("id").asText());
        entity.name = node.hasNonNull("name") ? writeNodeAsString(node.get("name")) : null;
        entity.color = node.hasNonNull("color") ? writeNodeAsString(node.get("color")) : null;
        entity.addTime =
                parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
        entity.updateTime =
                parseDateTime(
                        node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return List.of(entities, customFields, customFieldsRefs);
    }

    public List<List<PanacheEntityBase>> toLeadEntity(JsonNode node) {
        List<PanacheEntityBase> entities = new ArrayList<>();

        List<PanacheEntityBase> additionalEntities =
                knownFieldService.ensureAllFieldsAreKnown(node, "lead");
        Map<Boolean, List<PanacheEntityBase>> partitioned =
                additionalEntities.stream()
                        .collect(Collectors.partitioningBy(entity -> entity instanceof RefField));
        List<PanacheEntityBase> customFieldsRefs = partitioned.get(true);
        List<PanacheEntityBase> customFields = partitioned.get(false);
        if (customFieldsRefs == null) {
            customFieldsRefs = new ArrayList<>();
        }

        LeadEntity entity = new LeadEntity();
        entity.idPipedrive = UUID.fromString(node.get("id").asText());

        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return List.of(entities, customFields, customFieldsRefs);
    }

    public List<List<PanacheEntityBase>> toNoteEntity(JsonNode node) {
        List<PanacheEntityBase> entities = new ArrayList<>();

        List<PanacheEntityBase> additionalEntities =
                knownFieldService.ensureAllFieldsAreKnown(node, "note");
        Map<Boolean, List<PanacheEntityBase>> partitioned =
                additionalEntities.stream()
                        .collect(Collectors.partitioningBy(entity -> entity instanceof RefField));
        List<PanacheEntityBase> customFieldsRefs = partitioned.get(true);
        List<PanacheEntityBase> customFields = partitioned.get(false);
        if (customFieldsRefs == null) {
            customFieldsRefs = new ArrayList<>();
        }

        NoteEntity entity = new NoteEntity();
        entity.idPipedrive = node.get("id").asLong();
        entity.orgId = node.hasNonNull("org_id") ? node.get("org_id").asLong() : null;
        entity.content = node.hasNonNull("content") ? writeNodeAsString(node.get("content")) : null;
        entity.dealId = node.hasNonNull("deal_id") ? node.get("deal_id").asLong() : null;
        entity.leadId = node.hasNonNull("lead_id") ? node.get("lead_id").asLong() : null;
        entity.userId = node.hasNonNull("user_id") ? node.get("user_id").asLong() : null;
        entity.addTime =
                parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
        entity.personId = node.hasNonNull("person_id") ? node.get("person_id").asLong() : null;
        entity.projectId = node.hasNonNull("project_id") ? node.get("project_id").asLong() : null;
        entity.activeFlag =
                node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
        entity.updateTime =
                parseDateTime(
                        node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
        entity.pinnedToDealFlag =
                node.hasNonNull("pinned_to_deal_flag")
                        ? node.get("pinned_to_deal_flag").asBoolean()
                        : null;
        entity.pinnedToPersonFlag =
                node.hasNonNull("pinned_to_person_flag")
                        ? node.get("pinned_to_person_flag").asBoolean()
                        : null;
        entity.pinnedToOrganizationFlag =
                node.hasNonNull("pinned_to_organization_flag")
                        ? node.get("pinned_to_organization_flag").asBoolean()
                        : null;
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return List.of(entities, customFields, customFieldsRefs);
    }

    public List<List<PanacheEntityBase>> toRefOrganizationFieldEntity(JsonNode node) {
        List<PanacheEntityBase> entities = new ArrayList<>();

        List<PanacheEntityBase> additionalEntities =
                knownFieldService.ensureAllFieldsAreKnown(node, "reforganizationfield");
        Map<Boolean, List<PanacheEntityBase>> partitioned =
                additionalEntities.stream()
                        .collect(Collectors.partitioningBy(entity -> entity instanceof RefField));
        List<PanacheEntityBase> customFieldsRefs = partitioned.get(true);
        List<PanacheEntityBase> customFields = partitioned.get(false);
        if (customFieldsRefs == null) {
            customFieldsRefs = new ArrayList<>();
        }

        RefOrganizationFieldEntity entity = new RefOrganizationFieldEntity();
        entity.idPipedrive = node.get("id").asLong();
        entity.key = node.get("key").asText();
        entity.name = node.get("name").asText();
        entity.fieldType = node.get("field_type").asText();
        entity.groupId = node.hasNonNull("group_id") ? node.get("group_id").asLong() : null;
        entity.orderNr = node.hasNonNull("order_nr") ? node.get("order_nr").asLong() : null;
        entity.jsonColumnFlag =
                node.hasNonNull("json_column_flag")
                        ? node.get("json_column_flag").asBoolean()
                        : null;
        entity.addTime =
                parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
        entity.updateTime =
                parseDateTime(
                        node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
        entity.lastUpdatedByUserId =
                node.hasNonNull("last_updated_by_user_id")
                        ? node.get("last_updated_by_user_id").asLong()
                        : null;
        entity.editFlag = node.hasNonNull("edit_flag") ? node.get("edit_flag").asBoolean() : null;
        entity.detailsVisibleFlag =
                node.hasNonNull("details_visible_flag")
                        ? node.get("details_visible_flag").asBoolean()
                        : null;
        entity.addVisibleFlag =
                node.hasNonNull("add_visible_flag")
                        ? node.get("add_visible_flag").asBoolean()
                        : null;
        entity.importantFlag =
                node.hasNonNull("important_flag") ? node.get("important_flag").asBoolean() : null;
        entity.bulkEditAllowed =
                node.hasNonNull("bulk_edit_allowed")
                        ? node.get("bulk_edit_allowed").asBoolean()
                        : null;
        entity.filteringAllowed =
                node.hasNonNull("filtering_allowed")
                        ? node.get("filtering_allowed").asBoolean()
                        : null;
        entity.sortableFlag =
                node.hasNonNull("sortable_flag") ? node.get("sortable_flag").asBoolean() : null;
        entity.mandatoryFlag =
                node.hasNonNull("mandatory_flag") ? node.get("mandatory_flag").asBoolean() : null;
        entity.searchableFlag =
                node.hasNonNull("searchable_flag") ? node.get("searchable_flag").asBoolean() : null;
        entity.description =
                node.hasNonNull("description") ? writeNodeAsString(node.get("description")) : null;
        entity.createdByUserId =
                node.hasNonNull("created_by_user_id")
                        ? node.get("created_by_user_id").asLong()
                        : null;
        entity.activeFlag =
                node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
        entity.useField =
                node.hasNonNull("use_field") ? writeNodeAsString(node.get("use_field")) : null;
        entity.link = node.hasNonNull("link") ? writeNodeAsString(node.get("link")) : null;
        entity.options = node.hasNonNull("options") ? writeNodeAsString(node.get("options")) : null;
        entity.displayField =
                node.hasNonNull("display_field")
                        ? writeNodeAsString(node.get("display_field"))
                        : null;
        entity.isSubfield =
                node.hasNonNull("is_subfield") ? node.get("is_subfield").asBoolean() : null;
        entity.parentId = node.hasNonNull("parent_id") ? node.get("parent_id").asLong() : null;
        entity.idSuffix =
                node.hasNonNull("id_suffix") ? writeNodeAsString(node.get("id_suffix")) : null;
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return List.of(entities, customFields, customFieldsRefs);
    }

    public List<List<PanacheEntityBase>> toOrganizationEntity(JsonNode node) {
        List<PanacheEntityBase> entities = new ArrayList<>();

        List<PanacheEntityBase> additionalEntities =
                knownFieldService.ensureAllFieldsAreKnown(node, "organization");
        Map<Boolean, List<PanacheEntityBase>> partitioned =
                additionalEntities.stream()
                        .collect(Collectors.partitioningBy(entity -> entity instanceof RefField));
        List<PanacheEntityBase> customFieldsRefs = partitioned.get(true);
        List<PanacheEntityBase> customFields = partitioned.get(false);
        if (customFieldsRefs == null) {
            customFieldsRefs = new ArrayList<>();
        }

        OrganizationEntity entity = new OrganizationEntity();
        entity.idPipedrive = node.get("id").asLong();

        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return List.of(entities, customFields, customFieldsRefs);
    }

    public List<List<PanacheEntityBase>> toRefPersonFieldEntity(JsonNode node) {
        List<PanacheEntityBase> entities = new ArrayList<>();

        List<PanacheEntityBase> additionalEntities =
                knownFieldService.ensureAllFieldsAreKnown(node, "refpersonfield");
        Map<Boolean, List<PanacheEntityBase>> partitioned =
                additionalEntities.stream()
                        .collect(Collectors.partitioningBy(entity -> entity instanceof RefField));
        List<PanacheEntityBase> customFieldsRefs = partitioned.get(true);
        List<PanacheEntityBase> customFields = partitioned.get(false);
        if (customFieldsRefs == null) {
            customFieldsRefs = new ArrayList<>();
        }

        RefPersonFieldEntity entity = new RefPersonFieldEntity();
        entity.idPipedrive = node.get("id").asLong();
        entity.key = node.get("key").asText();
        entity.name = node.get("name").asText();
        entity.fieldType = node.get("field_type").asText();
        entity.groupId = node.hasNonNull("group_id") ? node.get("group_id").asLong() : null;
        entity.orderNr = node.hasNonNull("order_nr") ? node.get("order_nr").asLong() : null;
        entity.jsonColumnFlag =
                node.hasNonNull("json_column_flag")
                        ? node.get("json_column_flag").asBoolean()
                        : null;
        entity.addTime =
                parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
        entity.updateTime =
                parseDateTime(
                        node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
        entity.lastUpdatedByUserId =
                node.hasNonNull("last_updated_by_user_id")
                        ? node.get("last_updated_by_user_id").asLong()
                        : null;
        entity.editFlag = node.hasNonNull("edit_flag") ? node.get("edit_flag").asBoolean() : null;
        entity.detailsVisibleFlag =
                node.hasNonNull("details_visible_flag")
                        ? node.get("details_visible_flag").asBoolean()
                        : null;
        entity.addVisibleFlag =
                node.hasNonNull("add_visible_flag")
                        ? node.get("add_visible_flag").asBoolean()
                        : null;
        entity.importantFlag =
                node.hasNonNull("important_flag") ? node.get("important_flag").asBoolean() : null;
        entity.bulkEditAllowed =
                node.hasNonNull("bulk_edit_allowed")
                        ? node.get("bulk_edit_allowed").asBoolean()
                        : null;
        entity.filteringAllowed =
                node.hasNonNull("filtering_allowed")
                        ? node.get("filtering_allowed").asBoolean()
                        : null;
        entity.sortableFlag =
                node.hasNonNull("sortable_flag") ? node.get("sortable_flag").asBoolean() : null;
        entity.mandatoryFlag =
                node.hasNonNull("mandatory_flag") ? node.get("mandatory_flag").asBoolean() : null;
        entity.searchableFlag =
                node.hasNonNull("searchable_flag") ? node.get("searchable_flag").asBoolean() : null;
        entity.description =
                node.hasNonNull("description") ? writeNodeAsString(node.get("description")) : null;
        entity.createdByUserId =
                node.hasNonNull("created_by_user_id")
                        ? node.get("created_by_user_id").asLong()
                        : null;
        entity.activeFlag =
                node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
        entity.useField =
                node.hasNonNull("use_field") ? writeNodeAsString(node.get("use_field")) : null;
        entity.link = node.hasNonNull("link") ? writeNodeAsString(node.get("link")) : null;
        entity.options = node.hasNonNull("options") ? writeNodeAsString(node.get("options")) : null;
        entity.autocomplete =
                node.hasNonNull("autocomplete")
                        ? writeNodeAsString(node.get("autocomplete"))
                        : null;
        entity.displayField =
                node.hasNonNull("display_field")
                        ? writeNodeAsString(node.get("display_field"))
                        : null;
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return List.of(entities, customFields, customFieldsRefs);
    }

    public List<List<PanacheEntityBase>> toPersonEntity(JsonNode node) {
        List<PanacheEntityBase> entities = new ArrayList<>();

        List<PanacheEntityBase> additionalEntities =
                knownFieldService.ensureAllFieldsAreKnown(node, "person");
        Map<Boolean, List<PanacheEntityBase>> partitioned =
                additionalEntities.stream()
                        .collect(Collectors.partitioningBy(entity -> entity instanceof RefField));
        List<PanacheEntityBase> customFieldsRefs = partitioned.get(true);
        List<PanacheEntityBase> customFields = partitioned.get(false);
        if (customFieldsRefs == null) {
            customFieldsRefs = new ArrayList<>();
        }

        PersonEntity entity = new PersonEntity();
        entity.idPipedrive = node.get("id").asLong();
        entity.activeFlag =
                node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
        entity.ownerId = node.hasNonNull("owner_id") ? node.get("owner_id").asLong() : null;
        entity.orgId = node.hasNonNull("org_id") ? node.get("org_id").asLong() : null;
        entity.name = node.hasNonNull("name") ? writeNodeAsString(node.get("name")) : null;
        entity.phone = node.hasNonNull("phone") ? writeNodeAsString(node.get("phone")) : null;
        entity.email = node.hasNonNull("email") ? writeNodeAsString(node.get("email")) : null;
        entity.updateTime =
                parseDateTime(
                        node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
        entity.deleteTime =
                parseDateTime(
                        node.hasNonNull("delete_time") ? node.get("delete_time").asText() : null);
        entity.addTime =
                parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
        entity.visibleTo =
                node.hasNonNull("visible_to") ? writeNodeAsString(node.get("visible_to")) : null;
        entity.pictureId = node.hasNonNull("picture_id") ? node.get("picture_id").asLong() : null;
        entity.label = node.hasNonNull("label") ? writeNodeAsString(node.get("label")) : null;
        entity.ccEmail =
                node.hasNonNull("cc_email") ? writeNodeAsString(node.get("cc_email")) : null;
        entity.emails = node.hasNonNull("emails") ? writeNodeAsString(node.get("emails")) : null;
        entity.phones = node.hasNonNull("phones") ? writeNodeAsString(node.get("phones")) : null;
        entity.lastName =
                node.hasNonNull("last_name") ? writeNodeAsString(node.get("last_name")) : null;
        entity.firstName =
                node.hasNonNull("first_name") ? writeNodeAsString(node.get("first_name")) : null;
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return List.of(entities, customFields, customFieldsRefs);
    }

    public List<List<PanacheEntityBase>> toPipelineEntity(JsonNode node) {
        List<PanacheEntityBase> entities = new ArrayList<>();

        List<PanacheEntityBase> additionalEntities =
                knownFieldService.ensureAllFieldsAreKnown(node, "pipeline");
        Map<Boolean, List<PanacheEntityBase>> partitioned =
                additionalEntities.stream()
                        .collect(Collectors.partitioningBy(entity -> entity instanceof RefField));
        List<PanacheEntityBase> customFieldsRefs = partitioned.get(true);
        List<PanacheEntityBase> customFields = partitioned.get(false);
        if (customFieldsRefs == null) {
            customFieldsRefs = new ArrayList<>();
        }

        PipelineEntity entity = new PipelineEntity();
        entity.idPipedrive = node.get("id").asLong();
        entity.name = node.hasNonNull("name") ? writeNodeAsString(node.get("name")) : null;
        entity.urlTitle =
                node.hasNonNull("url_title") ? writeNodeAsString(node.get("url_title")) : null;
        entity.orderNr = node.hasNonNull("order_nr") ? node.get("order_nr").asLong() : null;
        entity.active = node.hasNonNull("active") ? node.get("active").asBoolean() : null;
        entity.dealProbability =
                node.hasNonNull("deal_probability")
                        ? node.get("deal_probability").asBoolean()
                        : null;
        entity.addTime =
                parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
        entity.updateTime =
                parseDateTime(
                        node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
        entity.selected = node.hasNonNull("selected") ? node.get("selected").asBoolean() : null;
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return List.of(entities, customFields, customFieldsRefs);
    }

    public List<List<PanacheEntityBase>> toRefProductFieldEntity(JsonNode node) {
        List<PanacheEntityBase> entities = new ArrayList<>();

        List<PanacheEntityBase> additionalEntities =
                knownFieldService.ensureAllFieldsAreKnown(node, "refproductfield");
        Map<Boolean, List<PanacheEntityBase>> partitioned =
                additionalEntities.stream()
                        .collect(Collectors.partitioningBy(entity -> entity instanceof RefField));
        List<PanacheEntityBase> customFieldsRefs = partitioned.get(true);
        List<PanacheEntityBase> customFields = partitioned.get(false);
        if (customFieldsRefs == null) {
            customFieldsRefs = new ArrayList<>();
        }

        RefProductFieldEntity entity = new RefProductFieldEntity();
        entity.idPipedrive = node.get("id").asLong();
        entity.key = node.get("key").asText();
        entity.name = node.get("name").asText();
        entity.fieldType = node.get("field_type").asText();
        entity.groupId = node.hasNonNull("group_id") ? node.get("group_id").asLong() : null;
        entity.orderNr = node.hasNonNull("order_nr") ? node.get("order_nr").asLong() : null;
        entity.jsonColumnFlag =
                node.hasNonNull("json_column_flag")
                        ? node.get("json_column_flag").asBoolean()
                        : null;
        entity.addTime =
                parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
        entity.updateTime =
                parseDateTime(
                        node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
        entity.lastUpdatedByUserId =
                node.hasNonNull("last_updated_by_user_id")
                        ? node.get("last_updated_by_user_id").asLong()
                        : null;
        entity.editFlag = node.hasNonNull("edit_flag") ? node.get("edit_flag").asBoolean() : null;
        entity.detailsVisibleFlag =
                node.hasNonNull("details_visible_flag")
                        ? node.get("details_visible_flag").asBoolean()
                        : null;
        entity.addVisibleFlag =
                node.hasNonNull("add_visible_flag")
                        ? node.get("add_visible_flag").asBoolean()
                        : null;
        entity.importantFlag =
                node.hasNonNull("important_flag") ? node.get("important_flag").asBoolean() : null;
        entity.bulkEditAllowed =
                node.hasNonNull("bulk_edit_allowed")
                        ? node.get("bulk_edit_allowed").asBoolean()
                        : null;
        entity.filteringAllowed =
                node.hasNonNull("filtering_allowed")
                        ? node.get("filtering_allowed").asBoolean()
                        : null;
        entity.sortableFlag =
                node.hasNonNull("sortable_flag") ? node.get("sortable_flag").asBoolean() : null;
        entity.mandatoryFlag =
                node.hasNonNull("mandatory_flag") ? node.get("mandatory_flag").asBoolean() : null;
        entity.searchableFlag =
                node.hasNonNull("searchable_flag") ? node.get("searchable_flag").asBoolean() : null;
        entity.description =
                node.hasNonNull("description") ? writeNodeAsString(node.get("description")) : null;
        entity.createdByUserId =
                node.hasNonNull("created_by_user_id")
                        ? node.get("created_by_user_id").asLong()
                        : null;
        entity.activeFlag =
                node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
        entity.useField =
                node.hasNonNull("use_field") ? writeNodeAsString(node.get("use_field")) : null;
        entity.link = node.hasNonNull("link") ? writeNodeAsString(node.get("link")) : null;
        entity.displayField =
                node.hasNonNull("display_field")
                        ? writeNodeAsString(node.get("display_field"))
                        : null;
        entity.options = node.hasNonNull("options") ? writeNodeAsString(node.get("options")) : null;
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return List.of(entities, customFields, customFieldsRefs);
    }

    public List<List<PanacheEntityBase>> toProductEntity(JsonNode node) {
        List<PanacheEntityBase> entities = new ArrayList<>();

        List<PanacheEntityBase> additionalEntities =
                knownFieldService.ensureAllFieldsAreKnown(node, "product");
        Map<Boolean, List<PanacheEntityBase>> partitioned =
                additionalEntities.stream()
                        .collect(Collectors.partitioningBy(entity -> entity instanceof RefField));
        List<PanacheEntityBase> customFieldsRefs = partitioned.get(true);
        List<PanacheEntityBase> customFields = partitioned.get(false);
        if (customFieldsRefs == null) {
            customFieldsRefs = new ArrayList<>();
        }

        ProductEntity entity = new ProductEntity();
        entity.idPipedrive = node.get("id").asLong();
        entity.name = node.hasNonNull("name") ? writeNodeAsString(node.get("name")) : null;
        entity.code = node.hasNonNull("code") ? writeNodeAsString(node.get("code")) : null;
        entity.description =
                node.hasNonNull("description") ? writeNodeAsString(node.get("description")) : null;
        entity.unit = node.hasNonNull("unit") ? writeNodeAsString(node.get("unit")) : null;
        entity.tax = node.hasNonNull("tax") ? node.get("tax").asLong() : null;
        entity.category =
                node.hasNonNull("category") ? writeNodeAsString(node.get("category")) : null;
        entity.activeFlag =
                node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
        entity.selectable =
                node.hasNonNull("selectable") ? node.get("selectable").asBoolean() : null;
        entity.firstChar =
                node.hasNonNull("first_char") ? writeNodeAsString(node.get("first_char")) : null;
        entity.visibleTo =
                node.hasNonNull("visible_to") ? writeNodeAsString(node.get("visible_to")) : null;
        entity.ownerId =
                node.hasNonNull("owner_id") ? writeNodeAsString(node.get("owner_id")) : null;
        entity.filesCount =
                node.hasNonNull("files_count") ? writeNodeAsString(node.get("files_count")) : null;
        entity.addTime =
                parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
        entity.updateTime =
                parseDateTime(
                        node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
        entity.prices = node.hasNonNull("prices") ? writeNodeAsString(node.get("prices")) : null;
        entity.productVariations =
                node.hasNonNull("product_variations")
                        ? writeNodeAsString(node.get("product_variations"))
                        : null;
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return List.of(entities, customFields, customFieldsRefs);
    }

    public List<List<PanacheEntityBase>> toProjectEntity(JsonNode node) {
        List<PanacheEntityBase> entities = new ArrayList<>();

        List<PanacheEntityBase> additionalEntities =
                knownFieldService.ensureAllFieldsAreKnown(node, "project");
        Map<Boolean, List<PanacheEntityBase>> partitioned =
                additionalEntities.stream()
                        .collect(Collectors.partitioningBy(entity -> entity instanceof RefField));
        List<PanacheEntityBase> customFieldsRefs = partitioned.get(true);
        List<PanacheEntityBase> customFields = partitioned.get(false);
        if (customFieldsRefs == null) {
            customFieldsRefs = new ArrayList<>();
        }

        ProjectEntity entity = new ProjectEntity();
        entity.idPipedrive = node.get("id").asLong();

        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return List.of(entities, customFields, customFieldsRefs);
    }

    public List<List<PanacheEntityBase>> toRoleEntity(JsonNode node) {
        List<PanacheEntityBase> entities = new ArrayList<>();

        List<PanacheEntityBase> additionalEntities =
                knownFieldService.ensureAllFieldsAreKnown(node, "role");
        Map<Boolean, List<PanacheEntityBase>> partitioned =
                additionalEntities.stream()
                        .collect(Collectors.partitioningBy(entity -> entity instanceof RefField));
        List<PanacheEntityBase> customFieldsRefs = partitioned.get(true);
        List<PanacheEntityBase> customFields = partitioned.get(false);
        if (customFieldsRefs == null) {
            customFieldsRefs = new ArrayList<>();
        }

        RoleEntity entity = new RoleEntity();
        entity.idPipedrive = node.get("id").asLong();
        entity.parentRoleId =
                node.hasNonNull("parent_role_id") ? node.get("parent_role_id").asLong() : null;
        entity.name = node.hasNonNull("name") ? writeNodeAsString(node.get("name")) : null;
        entity.activeFlag =
                node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
        entity.assignmentCount =
                node.hasNonNull("assignment_count")
                        ? writeNodeAsString(node.get("assignment_count"))
                        : null;
        entity.subRoleCount =
                node.hasNonNull("sub_role_count")
                        ? writeNodeAsString(node.get("sub_role_count"))
                        : null;
        entity.level = node.hasNonNull("level") ? node.get("level").asLong() : null;
        entity.description =
                node.hasNonNull("description") ? writeNodeAsString(node.get("description")) : null;
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return List.of(entities, customFields, customFieldsRefs);
    }

    public List<List<PanacheEntityBase>> toStageEntity(JsonNode node) {
        List<PanacheEntityBase> entities = new ArrayList<>();

        List<PanacheEntityBase> additionalEntities =
                knownFieldService.ensureAllFieldsAreKnown(node, "stage");
        Map<Boolean, List<PanacheEntityBase>> partitioned =
                additionalEntities.stream()
                        .collect(Collectors.partitioningBy(entity -> entity instanceof RefField));
        List<PanacheEntityBase> customFieldsRefs = partitioned.get(true);
        List<PanacheEntityBase> customFields = partitioned.get(false);
        if (customFieldsRefs == null) {
            customFieldsRefs = new ArrayList<>();
        }

        StageEntity entity = new StageEntity();
        entity.idPipedrive = node.get("id").asLong();
        entity.orderNr = node.hasNonNull("order_nr") ? node.get("order_nr").asLong() : null;
        entity.name = node.hasNonNull("name") ? writeNodeAsString(node.get("name")) : null;
        entity.activeFlag =
                node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
        entity.dealProbability =
                node.hasNonNull("deal_probability") ? node.get("deal_probability").asLong() : null;
        entity.pipelineId =
                node.hasNonNull("pipeline_id") ? node.get("pipeline_id").asLong() : null;
        entity.rottenFlag =
                node.hasNonNull("rotten_flag") ? node.get("rotten_flag").asBoolean() : null;
        entity.rottenDays =
                node.hasNonNull("rotten_days") ? writeNodeAsString(node.get("rotten_days")) : null;
        entity.addTime =
                parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
        entity.updateTime =
                parseDateTime(
                        node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
        entity.pipelineName =
                node.hasNonNull("pipeline_name")
                        ? writeNodeAsString(node.get("pipeline_name"))
                        : null;
        entity.pipelineDealProbability =
                node.hasNonNull("pipeline_deal_probability")
                        ? node.get("pipeline_deal_probability").asBoolean()
                        : null;
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return List.of(entities, customFields, customFieldsRefs);
    }

    public List<List<PanacheEntityBase>> toTaskEntity(JsonNode node) {
        List<PanacheEntityBase> entities = new ArrayList<>();

        List<PanacheEntityBase> additionalEntities =
                knownFieldService.ensureAllFieldsAreKnown(node, "task");
        Map<Boolean, List<PanacheEntityBase>> partitioned =
                additionalEntities.stream()
                        .collect(Collectors.partitioningBy(entity -> entity instanceof RefField));
        List<PanacheEntityBase> customFieldsRefs = partitioned.get(true);
        List<PanacheEntityBase> customFields = partitioned.get(false);
        if (customFieldsRefs == null) {
            customFieldsRefs = new ArrayList<>();
        }

        TaskEntity entity = new TaskEntity();
        entity.idPipedrive = node.get("id").asLong();

        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return List.of(entities, customFields, customFieldsRefs);
    }

    public List<List<PanacheEntityBase>> toUserEntity(JsonNode node) {
        List<PanacheEntityBase> entities = new ArrayList<>();

        List<PanacheEntityBase> additionalEntities =
                knownFieldService.ensureAllFieldsAreKnown(node, "user");
        Map<Boolean, List<PanacheEntityBase>> partitioned =
                additionalEntities.stream()
                        .collect(Collectors.partitioningBy(entity -> entity instanceof RefField));
        List<PanacheEntityBase> customFieldsRefs = partitioned.get(true);
        List<PanacheEntityBase> customFields = partitioned.get(false);
        if (customFieldsRefs == null) {
            customFieldsRefs = new ArrayList<>();
        }

        UserEntity entity = new UserEntity();
        entity.idPipedrive = node.get("id").asLong();
        entity.name = node.hasNonNull("name") ? writeNodeAsString(node.get("name")) : null;
        entity.email = node.hasNonNull("email") ? writeNodeAsString(node.get("email")) : null;
        entity.lang = node.hasNonNull("lang") ? writeNodeAsString(node.get("lang")) : null;
        entity.locale = node.hasNonNull("locale") ? writeNodeAsString(node.get("locale")) : null;
        entity.timezoneName =
                node.hasNonNull("timezone_name")
                        ? writeNodeAsString(node.get("timezone_name"))
                        : null;
        entity.timezoneOffset =
                node.hasNonNull("timezone_offset")
                        ? writeNodeAsString(node.get("timezone_offset"))
                        : null;
        entity.defaultCurrency =
                node.hasNonNull("default_currency")
                        ? writeNodeAsString(node.get("default_currency"))
                        : null;
        entity.iconUrl =
                node.hasNonNull("icon_url") ? writeNodeAsString(node.get("icon_url")) : null;
        entity.activeFlag =
                node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
        entity.isDeleted =
                node.hasNonNull("is_deleted") ? node.get("is_deleted").asBoolean() : null;
        entity.isAdmin = node.hasNonNull("is_admin") ? node.get("is_admin").asLong() : null;
        entity.roleId = node.hasNonNull("role_id") ? node.get("role_id").asLong() : null;
        entity.created =
                parseDateTime(node.hasNonNull("created") ? node.get("created").asText() : null);
        entity.hasCreatedCompany =
                node.hasNonNull("has_created_company")
                        ? node.get("has_created_company").asBoolean()
                        : null;
        entity.isYou = node.hasNonNull("is_you") ? node.get("is_you").asBoolean() : null;
        entity.access = node.hasNonNull("access") ? writeNodeAsString(node.get("access")) : null;
        entity.modified =
                parseDateTime(node.hasNonNull("modified") ? node.get("modified").asText() : null);
        entity.lastLogin =
                parseDateTime(
                        node.hasNonNull("last_login") ? node.get("last_login").asText() : null);
        entity.phone = node.hasNonNull("phone") ? writeNodeAsString(node.get("phone")) : null;
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return List.of(entities, customFields, customFieldsRefs);
    }

    public List<List<PanacheEntityBase>> toWebhookEntity(JsonNode node) {
        List<PanacheEntityBase> entities = new ArrayList<>();

        List<PanacheEntityBase> additionalEntities =
                knownFieldService.ensureAllFieldsAreKnown(node, "webhook");
        Map<Boolean, List<PanacheEntityBase>> partitioned =
                additionalEntities.stream()
                        .collect(Collectors.partitioningBy(entity -> entity instanceof RefField));
        List<PanacheEntityBase> customFieldsRefs = partitioned.get(true);
        List<PanacheEntityBase> customFields = partitioned.get(false);
        if (customFieldsRefs == null) {
            customFieldsRefs = new ArrayList<>();
        }

        WebhookEntity entity = new WebhookEntity();
        entity.idPipedrive = node.get("id").asLong();
        entity.companyId = node.hasNonNull("company_id") ? node.get("company_id").asLong() : null;
        entity.ownerId = node.hasNonNull("owner_id") ? node.get("owner_id").asLong() : null;
        entity.userId = node.hasNonNull("user_id") ? node.get("user_id").asLong() : null;
        entity.eventAction =
                node.hasNonNull("event_action")
                        ? writeNodeAsString(node.get("event_action"))
                        : null;
        entity.eventObject =
                node.hasNonNull("event_object")
                        ? writeNodeAsString(node.get("event_object"))
                        : null;
        entity.subscriptionUrl =
                node.hasNonNull("subscription_url")
                        ? writeNodeAsString(node.get("subscription_url"))
                        : null;
        entity.isActive = node.hasNonNull("is_active") ? node.get("is_active").asLong() : null;
        entity.addTime =
                parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
        entity.removeTime =
                parseDateTime(
                        node.hasNonNull("remove_time") ? node.get("remove_time").asText() : null);
        entity.type = node.hasNonNull("type") ? writeNodeAsString(node.get("type")) : null;
        entity.httpAuthUser =
                node.hasNonNull("http_auth_user")
                        ? writeNodeAsString(node.get("http_auth_user"))
                        : null;
        entity.httpAuthPassword =
                node.hasNonNull("http_auth_password")
                        ? writeNodeAsString(node.get("http_auth_password"))
                        : null;
        entity.removeReason =
                node.hasNonNull("remove_reason")
                        ? writeNodeAsString(node.get("remove_reason"))
                        : null;
        entity.version = node.hasNonNull("version") ? writeNodeAsString(node.get("version")) : null;
        entity.name = node.hasNonNull("name") ? writeNodeAsString(node.get("name")) : null;
        entity.lastDeliveryTime =
                parseDateTime(
                        node.hasNonNull("last_delivery_time")
                                ? node.get("last_delivery_time").asText()
                                : null);
        entity.lastHttpStatus =
                node.hasNonNull("last_http_status")
                        ? writeNodeAsString(node.get("last_http_status"))
                        : null;
        entity.adminId = node.hasNonNull("admin_id") ? node.get("admin_id").asLong() : null;
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return List.of(entities, customFields, customFieldsRefs);
    }
}
