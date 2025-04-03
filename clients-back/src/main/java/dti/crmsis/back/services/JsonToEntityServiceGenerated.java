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

    public JsonToEntityServiceAnswer<ActivityEntity, PanacheEntityBase, PanacheEntityBase>
            toActivityEntity(JsonNode node) {
        List<ActivityEntity> entities = new ArrayList<>();

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
        entity.activeFlag =
                node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
        entity.addTime =
                parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
        entity.busyFlag = node.hasNonNull("busy_flag") ? node.get("busy_flag").asBoolean() : null;
        entity.companyId = node.hasNonNull("company_id") ? node.get("company_id").asLong() : null;
        entity.conferenceMeetingClient =
                node.hasNonNull("conference_meeting_client")
                        ? writeNodeAsString(node.get("conference_meeting_client"))
                        : null;
        entity.conferenceMeetingId =
                node.hasNonNull("conference_meeting_id")
                        ? node.get("conference_meeting_id").asLong()
                        : null;
        entity.conferenceMeetingUrl =
                node.hasNonNull("conference_meeting_url")
                        ? writeNodeAsString(node.get("conference_meeting_url"))
                        : null;
        entity.dealId = node.hasNonNull("deal_id") ? node.get("deal_id").asLong() : null;
        entity.done = node.hasNonNull("done") ? node.get("done").asBoolean() : null;
        entity.dueDate =
                parseDate(node.hasNonNull("due_date") ? node.get("due_date").asText() : null);
        entity.dueTime =
                node.hasNonNull("due_time") ? writeNodeAsString(node.get("due_time")) : null;
        entity.duration =
                node.hasNonNull("duration") ? writeNodeAsString(node.get("duration")) : null;
        entity.leadId = node.hasNonNull("lead_id") ? node.get("lead_id").asLong() : null;
        entity.location =
                node.hasNonNull("location") ? writeNodeAsString(node.get("location")) : null;
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
        entity.locationFormattedAddress =
                node.hasNonNull("location_formatted_address")
                        ? writeNodeAsString(node.get("location_formatted_address"))
                        : null;
        entity.locationLocality =
                node.hasNonNull("location_locality")
                        ? writeNodeAsString(node.get("location_locality"))
                        : null;
        entity.locationPostalCode =
                node.hasNonNull("location_postal_code")
                        ? writeNodeAsString(node.get("location_postal_code"))
                        : null;
        entity.locationRoute =
                node.hasNonNull("location_route")
                        ? writeNodeAsString(node.get("location_route"))
                        : null;
        entity.locationStreetNumber =
                node.hasNonNull("location_street_number")
                        ? writeNodeAsString(node.get("location_street_number"))
                        : null;
        entity.locationSublocality =
                node.hasNonNull("location_sublocality")
                        ? writeNodeAsString(node.get("location_sublocality"))
                        : null;
        entity.locationSubpremise =
                node.hasNonNull("location_subpremise")
                        ? writeNodeAsString(node.get("location_subpremise"))
                        : null;
        entity.markedAsDoneTime =
                parseDateTime(
                        node.hasNonNull("marked_as_done_time")
                                ? node.get("marked_as_done_time").asText()
                                : null);
        entity.orgId = node.hasNonNull("org_id") ? node.get("org_id").asLong() : null;
        entity.ownerId = node.hasNonNull("owner_id") ? node.get("owner_id").asLong() : null;
        entity.personId = node.hasNonNull("person_id") ? node.get("person_id").asLong() : null;
        entity.projectId = node.hasNonNull("project_id") ? node.get("project_id").asLong() : null;
        entity.publicDescription =
                node.hasNonNull("public_description")
                        ? node.get("public_description").asBoolean()
                        : null;
        entity.sourceTimezone =
                node.hasNonNull("source_timezone")
                        ? writeNodeAsString(node.get("source_timezone"))
                        : null;
        entity.subject = node.hasNonNull("subject") ? writeNodeAsString(node.get("subject")) : null;
        entity.type = node.hasNonNull("type") ? writeNodeAsString(node.get("type")) : null;
        entity.updateTime =
                parseDateTime(
                        node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
        entity.updateUserId =
                node.hasNonNull("update_user_id") ? node.get("update_user_id").asLong() : null;
        entity.userId = node.hasNonNull("user_id") ? node.get("user_id").asLong() : null;
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return JsonToEntityServiceAnswer.of(entities, customFields, customFieldsRefs);
    }

    public JsonToEntityServiceAnswer<RefActivityFieldEntity, PanacheEntityBase, PanacheEntityBase>
            toRefActivityFieldEntity(JsonNode node) {

        List<RefActivityFieldEntity> entities = new ArrayList<>();

        RefActivityFieldEntity entity = new RefActivityFieldEntity();
        entity.idPipedrive = node.get("id").asLong();
        entity.key = node.get("key").asText();
        entity.name = node.get("name").asText();
        entity.fieldType = node.get("field_type").asText();
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        List<PanacheEntityBase> additionalEntities = new ArrayList<>();
        additionalEntities.addAll(knownFieldService.addKnownField("activity", entity.key));

        return JsonToEntityServiceAnswer.of(entities, additionalEntities, Collections.emptyList());
    }

    public JsonToEntityServiceAnswer<ActivityTypeEntity, PanacheEntityBase, PanacheEntityBase>
            toActivityTypeEntity(JsonNode node) {
        List<ActivityTypeEntity> entities = new ArrayList<>();

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

        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return JsonToEntityServiceAnswer.of(entities, customFields, customFieldsRefs);
    }

    public JsonToEntityServiceAnswer<CurrencieEntity, PanacheEntityBase, PanacheEntityBase>
            toCurrencieEntity(JsonNode node) {
        List<CurrencieEntity> entities = new ArrayList<>();

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

        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return JsonToEntityServiceAnswer.of(entities, customFields, customFieldsRefs);
    }

    public JsonToEntityServiceAnswer<RefDealFieldEntity, PanacheEntityBase, PanacheEntityBase>
            toRefDealFieldEntity(JsonNode node) {

        List<RefDealFieldEntity> entities = new ArrayList<>();

        RefDealFieldEntity entity = new RefDealFieldEntity();
        entity.idPipedrive = node.get("id").asLong();
        entity.key = node.get("key").asText();
        entity.name = node.get("name").asText();
        entity.fieldType = node.get("field_type").asText();
        entity.activeFlag =
                node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
        entity.addTime =
                parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
        entity.addVisibleFlag =
                node.hasNonNull("add_visible_flag")
                        ? node.get("add_visible_flag").asBoolean()
                        : null;
        entity.bulkEditAllowed =
                node.hasNonNull("bulk_edit_allowed")
                        ? node.get("bulk_edit_allowed").asBoolean()
                        : null;
        entity.createdByUserId =
                node.hasNonNull("created_by_user_id")
                        ? node.get("created_by_user_id").asLong()
                        : null;
        entity.description =
                node.hasNonNull("description") ? writeNodeAsString(node.get("description")) : null;
        entity.detailsVisibleFlag =
                node.hasNonNull("details_visible_flag")
                        ? node.get("details_visible_flag").asBoolean()
                        : null;
        entity.editFlag = node.hasNonNull("edit_flag") ? node.get("edit_flag").asBoolean() : null;
        entity.filteringAllowed =
                node.hasNonNull("filtering_allowed")
                        ? node.get("filtering_allowed").asBoolean()
                        : null;
        entity.groupId = node.hasNonNull("group_id") ? node.get("group_id").asLong() : null;
        entity.idSuffix =
                node.hasNonNull("id_suffix") ? writeNodeAsString(node.get("id_suffix")) : null;
        entity.importantFlag =
                node.hasNonNull("important_flag") ? node.get("important_flag").asBoolean() : null;
        entity.isSubfield =
                node.hasNonNull("is_subfield") ? node.get("is_subfield").asBoolean() : null;
        entity.jsonColumnFlag =
                node.hasNonNull("json_column_flag")
                        ? node.get("json_column_flag").asBoolean()
                        : null;
        entity.lastUpdatedByUserId =
                node.hasNonNull("last_updated_by_user_id")
                        ? node.get("last_updated_by_user_id").asLong()
                        : null;
        entity.link = node.hasNonNull("link") ? writeNodeAsString(node.get("link")) : null;
        entity.mandatoryFlag =
                node.hasNonNull("mandatory_flag")
                        ? writeNodeAsString(node.get("mandatory_flag"))
                        : null;
        entity.options = node.hasNonNull("options") ? writeNodeAsString(node.get("options")) : null;
        entity.orderNr = node.hasNonNull("order_nr") ? node.get("order_nr").asLong() : null;
        entity.parentId = node.hasNonNull("parent_id") ? node.get("parent_id").asLong() : null;
        entity.projectsDetailVisibleFlag =
                node.hasNonNull("projects_detail_visible_flag")
                        ? node.get("projects_detail_visible_flag").asBoolean()
                        : null;
        entity.searchableFlag =
                node.hasNonNull("searchable_flag") ? node.get("searchable_flag").asBoolean() : null;
        entity.showInPipelines =
                node.hasNonNull("show_in_pipelines")
                        ? writeNodeAsString(node.get("show_in_pipelines"))
                        : null;
        entity.sortableFlag =
                node.hasNonNull("sortable_flag") ? node.get("sortable_flag").asBoolean() : null;
        entity.updateTime =
                parseDateTime(
                        node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
        entity.useField =
                node.hasNonNull("use_field") ? writeNodeAsString(node.get("use_field")) : null;
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        List<PanacheEntityBase> additionalEntities = new ArrayList<>();
        additionalEntities.addAll(knownFieldService.addKnownField("deal", entity.key));

        return JsonToEntityServiceAnswer.of(entities, additionalEntities, Collections.emptyList());
    }

    public JsonToEntityServiceAnswer<DealEntity, PanacheEntityBase, PanacheEntityBase> toDealEntity(
            JsonNode node) {
        List<DealEntity> entities = new ArrayList<>();

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
        entity.addTime =
                parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
        entity.archiveTime =
                parseDateTime(
                        node.hasNonNull("archive_time") ? node.get("archive_time").asText() : null);
        entity.channel = node.hasNonNull("channel") ? writeNodeAsString(node.get("channel")) : null;
        entity.channelId = node.hasNonNull("channel_id") ? node.get("channel_id").asLong() : null;
        entity.closeTime =
                parseDateTime(
                        node.hasNonNull("close_time") ? node.get("close_time").asText() : null);
        entity.creatorUserId =
                node.hasNonNull("creator_user_id") ? node.get("creator_user_id").asLong() : null;
        entity.currency =
                node.hasNonNull("currency") ? writeNodeAsString(node.get("currency")) : null;
        entity.expectedCloseDate =
                parseDate(
                        node.hasNonNull("expected_close_date")
                                ? node.get("expected_close_date").asText()
                                : null);
        entity.firstWonTime =
                parseDateTime(
                        node.hasNonNull("first_won_time")
                                ? node.get("first_won_time").asText()
                                : null);
        entity.isArchived =
                node.hasNonNull("is_archived") ? node.get("is_archived").asBoolean() : null;
        entity.label = node.hasNonNull("label") ? writeNodeAsString(node.get("label")) : null;
        entity.labelIds =
                node.hasNonNull("label_ids") ? writeNodeAsString(node.get("label_ids")) : null;
        entity.lostReason =
                node.hasNonNull("lost_reason") ? writeNodeAsString(node.get("lost_reason")) : null;
        entity.lostTime =
                parseDateTime(node.hasNonNull("lost_time") ? node.get("lost_time").asText() : null);
        entity.orgId = node.hasNonNull("org_id") ? node.get("org_id").asLong() : null;
        entity.origin = node.hasNonNull("origin") ? writeNodeAsString(node.get("origin")) : null;
        entity.originId = node.hasNonNull("origin_id") ? node.get("origin_id").asLong() : null;
        entity.ownerId = node.hasNonNull("owner_id") ? node.get("owner_id").asLong() : null;
        entity.personId = node.hasNonNull("person_id") ? node.get("person_id").asLong() : null;
        entity.pipelineId =
                node.hasNonNull("pipeline_id") ? node.get("pipeline_id").asLong() : null;
        entity.probability =
                node.hasNonNull("probability") ? writeNodeAsString(node.get("probability")) : null;
        entity.stageChangeTime =
                parseDateTime(
                        node.hasNonNull("stage_change_time")
                                ? node.get("stage_change_time").asText()
                                : null);
        entity.stageId = node.hasNonNull("stage_id") ? node.get("stage_id").asLong() : null;
        entity.status = node.hasNonNull("status") ? writeNodeAsString(node.get("status")) : null;
        entity.title = node.hasNonNull("title") ? writeNodeAsString(node.get("title")) : null;
        entity.updateTime =
                parseDateTime(
                        node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
        entity.userId = node.hasNonNull("user_id") ? node.get("user_id").asLong() : null;
        entity.value = node.hasNonNull("value") ? node.get("value").asDouble() : null;
        entity.visibleTo =
                node.hasNonNull("visible_to") ? writeNodeAsString(node.get("visible_to")) : null;
        entity.wonTime =
                parseDateTime(node.hasNonNull("won_time") ? node.get("won_time").asText() : null);
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return JsonToEntityServiceAnswer.of(entities, customFields, customFieldsRefs);
    }

    public JsonToEntityServiceAnswer<LeadLabelEntity, PanacheEntityBase, PanacheEntityBase>
            toLeadLabelEntity(JsonNode node) {
        List<LeadLabelEntity> entities = new ArrayList<>();

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

        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return JsonToEntityServiceAnswer.of(entities, customFields, customFieldsRefs);
    }

    public JsonToEntityServiceAnswer<LeadEntity, PanacheEntityBase, PanacheEntityBase> toLeadEntity(
            JsonNode node) {
        List<LeadEntity> entities = new ArrayList<>();

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

        return JsonToEntityServiceAnswer.of(entities, customFields, customFieldsRefs);
    }

    public JsonToEntityServiceAnswer<NoteEntity, PanacheEntityBase, PanacheEntityBase> toNoteEntity(
            JsonNode node) {
        List<NoteEntity> entities = new ArrayList<>();

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
        entity.activeFlag =
                node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
        entity.addTime =
                parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
        entity.content = node.hasNonNull("content") ? writeNodeAsString(node.get("content")) : null;
        entity.dealId = node.hasNonNull("deal_id") ? node.get("deal_id").asLong() : null;
        entity.leadId = node.hasNonNull("lead_id") ? node.get("lead_id").asLong() : null;
        entity.orgId = node.hasNonNull("org_id") ? node.get("org_id").asLong() : null;
        entity.personId = node.hasNonNull("person_id") ? node.get("person_id").asLong() : null;
        entity.pinnedToDealFlag =
                node.hasNonNull("pinned_to_deal_flag")
                        ? node.get("pinned_to_deal_flag").asBoolean()
                        : null;
        entity.pinnedToOrganizationFlag =
                node.hasNonNull("pinned_to_organization_flag")
                        ? node.get("pinned_to_organization_flag").asBoolean()
                        : null;
        entity.pinnedToPersonFlag =
                node.hasNonNull("pinned_to_person_flag")
                        ? node.get("pinned_to_person_flag").asBoolean()
                        : null;
        entity.projectId = node.hasNonNull("project_id") ? node.get("project_id").asLong() : null;
        entity.updateTime =
                parseDateTime(
                        node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
        entity.userId = node.hasNonNull("user_id") ? node.get("user_id").asLong() : null;
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return JsonToEntityServiceAnswer.of(entities, customFields, customFieldsRefs);
    }

    public JsonToEntityServiceAnswer<
                    RefOrganizationFieldEntity, PanacheEntityBase, PanacheEntityBase>
            toRefOrganizationFieldEntity(JsonNode node) {

        List<RefOrganizationFieldEntity> entities = new ArrayList<>();

        RefOrganizationFieldEntity entity = new RefOrganizationFieldEntity();
        entity.idPipedrive = node.get("id").asLong();
        entity.key = node.get("key").asText();
        entity.name = node.get("name").asText();
        entity.fieldType = node.get("field_type").asText();
        entity.activeFlag =
                node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
        entity.addTime =
                parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
        entity.addVisibleFlag =
                node.hasNonNull("add_visible_flag")
                        ? node.get("add_visible_flag").asBoolean()
                        : null;
        entity.bulkEditAllowed =
                node.hasNonNull("bulk_edit_allowed")
                        ? node.get("bulk_edit_allowed").asBoolean()
                        : null;
        entity.createdByUserId =
                node.hasNonNull("created_by_user_id")
                        ? node.get("created_by_user_id").asLong()
                        : null;
        entity.description =
                node.hasNonNull("description") ? writeNodeAsString(node.get("description")) : null;
        entity.detailsVisibleFlag =
                node.hasNonNull("details_visible_flag")
                        ? node.get("details_visible_flag").asBoolean()
                        : null;
        entity.displayField =
                node.hasNonNull("display_field")
                        ? writeNodeAsString(node.get("display_field"))
                        : null;
        entity.editFlag = node.hasNonNull("edit_flag") ? node.get("edit_flag").asBoolean() : null;
        entity.filteringAllowed =
                node.hasNonNull("filtering_allowed")
                        ? node.get("filtering_allowed").asBoolean()
                        : null;
        entity.groupId = node.hasNonNull("group_id") ? node.get("group_id").asLong() : null;
        entity.idSuffix =
                node.hasNonNull("id_suffix") ? writeNodeAsString(node.get("id_suffix")) : null;
        entity.importantFlag =
                node.hasNonNull("important_flag") ? node.get("important_flag").asBoolean() : null;
        entity.isSubfield =
                node.hasNonNull("is_subfield") ? node.get("is_subfield").asBoolean() : null;
        entity.jsonColumnFlag =
                node.hasNonNull("json_column_flag")
                        ? node.get("json_column_flag").asBoolean()
                        : null;
        entity.lastUpdatedByUserId =
                node.hasNonNull("last_updated_by_user_id")
                        ? node.get("last_updated_by_user_id").asLong()
                        : null;
        entity.link = node.hasNonNull("link") ? writeNodeAsString(node.get("link")) : null;
        entity.mandatoryFlag =
                node.hasNonNull("mandatory_flag") ? node.get("mandatory_flag").asBoolean() : null;
        entity.options = node.hasNonNull("options") ? writeNodeAsString(node.get("options")) : null;
        entity.orderNr = node.hasNonNull("order_nr") ? node.get("order_nr").asLong() : null;
        entity.parentId = node.hasNonNull("parent_id") ? node.get("parent_id").asLong() : null;
        entity.searchableFlag =
                node.hasNonNull("searchable_flag") ? node.get("searchable_flag").asBoolean() : null;
        entity.sortableFlag =
                node.hasNonNull("sortable_flag") ? node.get("sortable_flag").asBoolean() : null;
        entity.updateTime =
                parseDateTime(
                        node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
        entity.useField =
                node.hasNonNull("use_field") ? writeNodeAsString(node.get("use_field")) : null;
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        List<PanacheEntityBase> additionalEntities = new ArrayList<>();
        additionalEntities.addAll(knownFieldService.addKnownField("organization", entity.key));

        return JsonToEntityServiceAnswer.of(entities, additionalEntities, Collections.emptyList());
    }

    public JsonToEntityServiceAnswer<OrganizationEntity, PanacheEntityBase, PanacheEntityBase>
            toOrganizationEntity(JsonNode node) {
        List<OrganizationEntity> entities = new ArrayList<>();

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

        return JsonToEntityServiceAnswer.of(entities, customFields, customFieldsRefs);
    }

    public JsonToEntityServiceAnswer<RefPersonFieldEntity, PanacheEntityBase, PanacheEntityBase>
            toRefPersonFieldEntity(JsonNode node) {

        List<RefPersonFieldEntity> entities = new ArrayList<>();

        RefPersonFieldEntity entity = new RefPersonFieldEntity();
        entity.idPipedrive = node.get("id").asLong();
        entity.key = node.get("key").asText();
        entity.name = node.get("name").asText();
        entity.fieldType = node.get("field_type").asText();
        entity.activeFlag =
                node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
        entity.addTime =
                parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
        entity.addVisibleFlag =
                node.hasNonNull("add_visible_flag")
                        ? node.get("add_visible_flag").asBoolean()
                        : null;
        entity.autocomplete =
                node.hasNonNull("autocomplete")
                        ? writeNodeAsString(node.get("autocomplete"))
                        : null;
        entity.bulkEditAllowed =
                node.hasNonNull("bulk_edit_allowed")
                        ? node.get("bulk_edit_allowed").asBoolean()
                        : null;
        entity.createdByUserId =
                node.hasNonNull("created_by_user_id")
                        ? node.get("created_by_user_id").asLong()
                        : null;
        entity.description =
                node.hasNonNull("description") ? writeNodeAsString(node.get("description")) : null;
        entity.detailsVisibleFlag =
                node.hasNonNull("details_visible_flag")
                        ? node.get("details_visible_flag").asBoolean()
                        : null;
        entity.displayField =
                node.hasNonNull("display_field")
                        ? writeNodeAsString(node.get("display_field"))
                        : null;
        entity.editFlag = node.hasNonNull("edit_flag") ? node.get("edit_flag").asBoolean() : null;
        entity.filteringAllowed =
                node.hasNonNull("filtering_allowed")
                        ? node.get("filtering_allowed").asBoolean()
                        : null;
        entity.groupId = node.hasNonNull("group_id") ? node.get("group_id").asLong() : null;
        entity.importantFlag =
                node.hasNonNull("important_flag") ? node.get("important_flag").asBoolean() : null;
        entity.jsonColumnFlag =
                node.hasNonNull("json_column_flag")
                        ? node.get("json_column_flag").asBoolean()
                        : null;
        entity.lastUpdatedByUserId =
                node.hasNonNull("last_updated_by_user_id")
                        ? node.get("last_updated_by_user_id").asLong()
                        : null;
        entity.link = node.hasNonNull("link") ? writeNodeAsString(node.get("link")) : null;
        entity.mandatoryFlag =
                node.hasNonNull("mandatory_flag") ? node.get("mandatory_flag").asBoolean() : null;
        entity.options = node.hasNonNull("options") ? writeNodeAsString(node.get("options")) : null;
        entity.orderNr = node.hasNonNull("order_nr") ? node.get("order_nr").asLong() : null;
        entity.searchableFlag =
                node.hasNonNull("searchable_flag") ? node.get("searchable_flag").asBoolean() : null;
        entity.sortableFlag =
                node.hasNonNull("sortable_flag") ? node.get("sortable_flag").asBoolean() : null;
        entity.updateTime =
                parseDateTime(
                        node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
        entity.useField =
                node.hasNonNull("use_field") ? writeNodeAsString(node.get("use_field")) : null;
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        List<PanacheEntityBase> additionalEntities = new ArrayList<>();
        additionalEntities.addAll(knownFieldService.addKnownField("person", entity.key));

        return JsonToEntityServiceAnswer.of(entities, additionalEntities, Collections.emptyList());
    }

    public JsonToEntityServiceAnswer<PersonEntity, PanacheEntityBase, PanacheEntityBase>
            toPersonEntity(JsonNode node) {
        List<PersonEntity> entities = new ArrayList<>();

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
        entity.addTime =
                parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
        entity.ccEmail =
                node.hasNonNull("cc_email") ? writeNodeAsString(node.get("cc_email")) : null;
        entity.deleteTime =
                parseDateTime(
                        node.hasNonNull("delete_time") ? node.get("delete_time").asText() : null);
        entity.email = node.hasNonNull("email") ? writeNodeAsString(node.get("email")) : null;
        entity.emails = node.hasNonNull("emails") ? writeNodeAsString(node.get("emails")) : null;
        entity.firstName =
                node.hasNonNull("first_name") ? writeNodeAsString(node.get("first_name")) : null;
        entity.label = node.hasNonNull("label") ? writeNodeAsString(node.get("label")) : null;
        entity.lastName =
                node.hasNonNull("last_name") ? writeNodeAsString(node.get("last_name")) : null;
        entity.name = node.hasNonNull("name") ? writeNodeAsString(node.get("name")) : null;
        entity.orgId = node.hasNonNull("org_id") ? node.get("org_id").asLong() : null;
        entity.ownerId = node.hasNonNull("owner_id") ? node.get("owner_id").asLong() : null;
        entity.phone = node.hasNonNull("phone") ? writeNodeAsString(node.get("phone")) : null;
        entity.phones = node.hasNonNull("phones") ? writeNodeAsString(node.get("phones")) : null;
        entity.pictureId = node.hasNonNull("picture_id") ? node.get("picture_id").asLong() : null;
        entity.updateTime =
                parseDateTime(
                        node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
        entity.visibleTo =
                node.hasNonNull("visible_to") ? writeNodeAsString(node.get("visible_to")) : null;
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return JsonToEntityServiceAnswer.of(entities, customFields, customFieldsRefs);
    }

    public JsonToEntityServiceAnswer<PipelineEntity, PanacheEntityBase, PanacheEntityBase>
            toPipelineEntity(JsonNode node) {
        List<PipelineEntity> entities = new ArrayList<>();

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
        entity.activeFlag =
                node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
        entity.addTime =
                parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
        entity.dealProbability =
                node.hasNonNull("deal_probability")
                        ? node.get("deal_probability").asBoolean()
                        : null;
        entity.name = node.hasNonNull("name") ? writeNodeAsString(node.get("name")) : null;
        entity.orderNr = node.hasNonNull("order_nr") ? node.get("order_nr").asLong() : null;
        entity.updateTime =
                parseDateTime(
                        node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
        entity.urlTitle =
                node.hasNonNull("url_title") ? writeNodeAsString(node.get("url_title")) : null;
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return JsonToEntityServiceAnswer.of(entities, customFields, customFieldsRefs);
    }

    public JsonToEntityServiceAnswer<RefProductFieldEntity, PanacheEntityBase, PanacheEntityBase>
            toRefProductFieldEntity(JsonNode node) {

        List<RefProductFieldEntity> entities = new ArrayList<>();

        RefProductFieldEntity entity = new RefProductFieldEntity();
        entity.idPipedrive = node.get("id").asLong();
        entity.key = node.get("key").asText();
        entity.name = node.get("name").asText();
        entity.fieldType = node.get("field_type").asText();
        entity.activeFlag =
                node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
        entity.addTime =
                parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
        entity.addVisibleFlag =
                node.hasNonNull("add_visible_flag")
                        ? node.get("add_visible_flag").asBoolean()
                        : null;
        entity.bulkEditAllowed =
                node.hasNonNull("bulk_edit_allowed")
                        ? node.get("bulk_edit_allowed").asBoolean()
                        : null;
        entity.createdByUserId =
                node.hasNonNull("created_by_user_id")
                        ? node.get("created_by_user_id").asLong()
                        : null;
        entity.description =
                node.hasNonNull("description") ? writeNodeAsString(node.get("description")) : null;
        entity.detailsVisibleFlag =
                node.hasNonNull("details_visible_flag")
                        ? node.get("details_visible_flag").asBoolean()
                        : null;
        entity.displayField =
                node.hasNonNull("display_field")
                        ? writeNodeAsString(node.get("display_field"))
                        : null;
        entity.editFlag = node.hasNonNull("edit_flag") ? node.get("edit_flag").asBoolean() : null;
        entity.filteringAllowed =
                node.hasNonNull("filtering_allowed")
                        ? node.get("filtering_allowed").asBoolean()
                        : null;
        entity.groupId = node.hasNonNull("group_id") ? node.get("group_id").asLong() : null;
        entity.importantFlag =
                node.hasNonNull("important_flag") ? node.get("important_flag").asBoolean() : null;
        entity.jsonColumnFlag =
                node.hasNonNull("json_column_flag")
                        ? node.get("json_column_flag").asBoolean()
                        : null;
        entity.lastUpdatedByUserId =
                node.hasNonNull("last_updated_by_user_id")
                        ? node.get("last_updated_by_user_id").asLong()
                        : null;
        entity.link = node.hasNonNull("link") ? writeNodeAsString(node.get("link")) : null;
        entity.mandatoryFlag =
                node.hasNonNull("mandatory_flag") ? node.get("mandatory_flag").asBoolean() : null;
        entity.options = node.hasNonNull("options") ? writeNodeAsString(node.get("options")) : null;
        entity.orderNr = node.hasNonNull("order_nr") ? node.get("order_nr").asLong() : null;
        entity.searchableFlag =
                node.hasNonNull("searchable_flag") ? node.get("searchable_flag").asBoolean() : null;
        entity.sortableFlag =
                node.hasNonNull("sortable_flag") ? node.get("sortable_flag").asBoolean() : null;
        entity.updateTime =
                parseDateTime(
                        node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
        entity.useField =
                node.hasNonNull("use_field") ? writeNodeAsString(node.get("use_field")) : null;
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        List<PanacheEntityBase> additionalEntities = new ArrayList<>();
        additionalEntities.addAll(knownFieldService.addKnownField("product", entity.key));

        return JsonToEntityServiceAnswer.of(entities, additionalEntities, Collections.emptyList());
    }

    public JsonToEntityServiceAnswer<ProductEntity, PanacheEntityBase, PanacheEntityBase>
            toProductEntity(JsonNode node) {
        List<ProductEntity> entities = new ArrayList<>();

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
        entity.activeFlag =
                node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
        entity.addTime =
                parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
        entity.category =
                node.hasNonNull("category") ? writeNodeAsString(node.get("category")) : null;
        entity.code = node.hasNonNull("code") ? writeNodeAsString(node.get("code")) : null;
        entity.description =
                node.hasNonNull("description") ? writeNodeAsString(node.get("description")) : null;
        entity.filesCount =
                node.hasNonNull("files_count") ? writeNodeAsString(node.get("files_count")) : null;
        entity.firstChar =
                node.hasNonNull("first_char") ? writeNodeAsString(node.get("first_char")) : null;
        entity.name = node.hasNonNull("name") ? writeNodeAsString(node.get("name")) : null;
        entity.ownerId =
                node.hasNonNull("owner_id") ? writeNodeAsString(node.get("owner_id")) : null;
        entity.prices = node.hasNonNull("prices") ? writeNodeAsString(node.get("prices")) : null;
        entity.productVariations =
                node.hasNonNull("product_variations")
                        ? writeNodeAsString(node.get("product_variations"))
                        : null;
        entity.selectable =
                node.hasNonNull("selectable") ? node.get("selectable").asBoolean() : null;
        entity.tax = node.hasNonNull("tax") ? node.get("tax").asLong() : null;
        entity.unit = node.hasNonNull("unit") ? writeNodeAsString(node.get("unit")) : null;
        entity.updateTime =
                parseDateTime(
                        node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
        entity.visibleTo =
                node.hasNonNull("visible_to") ? writeNodeAsString(node.get("visible_to")) : null;
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return JsonToEntityServiceAnswer.of(entities, customFields, customFieldsRefs);
    }

    public JsonToEntityServiceAnswer<ProjectEntity, PanacheEntityBase, PanacheEntityBase>
            toProjectEntity(JsonNode node) {
        List<ProjectEntity> entities = new ArrayList<>();

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

        return JsonToEntityServiceAnswer.of(entities, customFields, customFieldsRefs);
    }

    public JsonToEntityServiceAnswer<RoleEntity, PanacheEntityBase, PanacheEntityBase> toRoleEntity(
            JsonNode node) {
        List<RoleEntity> entities = new ArrayList<>();

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
        entity.activeFlag =
                node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
        entity.assignmentCount =
                node.hasNonNull("assignment_count")
                        ? writeNodeAsString(node.get("assignment_count"))
                        : null;
        entity.description =
                node.hasNonNull("description") ? writeNodeAsString(node.get("description")) : null;
        entity.level = node.hasNonNull("level") ? node.get("level").asLong() : null;
        entity.name = node.hasNonNull("name") ? writeNodeAsString(node.get("name")) : null;
        entity.parentRoleId =
                node.hasNonNull("parent_role_id") ? node.get("parent_role_id").asLong() : null;
        entity.subRoleCount =
                node.hasNonNull("sub_role_count")
                        ? writeNodeAsString(node.get("sub_role_count"))
                        : null;
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return JsonToEntityServiceAnswer.of(entities, customFields, customFieldsRefs);
    }

    public JsonToEntityServiceAnswer<StageEntity, PanacheEntityBase, PanacheEntityBase>
            toStageEntity(JsonNode node) {
        List<StageEntity> entities = new ArrayList<>();

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
        entity.activeFlag =
                node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
        entity.addTime =
                parseDateTime(node.hasNonNull("add_time") ? node.get("add_time").asText() : null);
        entity.dealProbability =
                node.hasNonNull("deal_probability") ? node.get("deal_probability").asLong() : null;
        entity.name = node.hasNonNull("name") ? writeNodeAsString(node.get("name")) : null;
        entity.orderNr = node.hasNonNull("order_nr") ? node.get("order_nr").asLong() : null;
        entity.pipelineDealProbability =
                node.hasNonNull("pipeline_deal_probability")
                        ? node.get("pipeline_deal_probability").asBoolean()
                        : null;
        entity.pipelineId =
                node.hasNonNull("pipeline_id") ? node.get("pipeline_id").asLong() : null;
        entity.pipelineName =
                node.hasNonNull("pipeline_name")
                        ? writeNodeAsString(node.get("pipeline_name"))
                        : null;
        entity.rottenDays =
                node.hasNonNull("rotten_days") ? writeNodeAsString(node.get("rotten_days")) : null;
        entity.rottenFlag =
                node.hasNonNull("rotten_flag") ? node.get("rotten_flag").asBoolean() : null;
        entity.updateTime =
                parseDateTime(
                        node.hasNonNull("update_time") ? node.get("update_time").asText() : null);
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return JsonToEntityServiceAnswer.of(entities, customFields, customFieldsRefs);
    }

    public JsonToEntityServiceAnswer<TaskEntity, PanacheEntityBase, PanacheEntityBase> toTaskEntity(
            JsonNode node) {
        List<TaskEntity> entities = new ArrayList<>();

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

        return JsonToEntityServiceAnswer.of(entities, customFields, customFieldsRefs);
    }

    public JsonToEntityServiceAnswer<UserEntity, PanacheEntityBase, PanacheEntityBase> toUserEntity(
            JsonNode node) {
        List<UserEntity> entities = new ArrayList<>();

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
        entity.access = node.hasNonNull("access") ? writeNodeAsString(node.get("access")) : null;
        entity.activeFlag =
                node.hasNonNull("active_flag") ? node.get("active_flag").asBoolean() : null;
        entity.created =
                parseDateTime(node.hasNonNull("created") ? node.get("created").asText() : null);
        entity.defaultCurrency =
                node.hasNonNull("default_currency")
                        ? writeNodeAsString(node.get("default_currency"))
                        : null;
        entity.email = node.hasNonNull("email") ? writeNodeAsString(node.get("email")) : null;
        entity.iconUrl =
                node.hasNonNull("icon_url") ? writeNodeAsString(node.get("icon_url")) : null;
        entity.lang = node.hasNonNull("lang") ? writeNodeAsString(node.get("lang")) : null;
        entity.lastLogin =
                parseDateTime(
                        node.hasNonNull("last_login") ? node.get("last_login").asText() : null);
        entity.locale = node.hasNonNull("locale") ? writeNodeAsString(node.get("locale")) : null;
        entity.modified =
                parseDateTime(node.hasNonNull("modified") ? node.get("modified").asText() : null);
        entity.name = node.hasNonNull("name") ? writeNodeAsString(node.get("name")) : null;
        entity.phone = node.hasNonNull("phone") ? writeNodeAsString(node.get("phone")) : null;
        entity.timezoneName =
                node.hasNonNull("timezone_name")
                        ? writeNodeAsString(node.get("timezone_name"))
                        : null;
        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return JsonToEntityServiceAnswer.of(entities, customFields, customFieldsRefs);
    }

    public JsonToEntityServiceAnswer<WebhookEntity, PanacheEntityBase, PanacheEntityBase>
            toWebhookEntity(JsonNode node) {
        List<WebhookEntity> entities = new ArrayList<>();

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

        entity.json = writeNodeAsString(node);
        entities.add(entity);

        return JsonToEntityServiceAnswer.of(entities, customFields, customFieldsRefs);
    }
}
