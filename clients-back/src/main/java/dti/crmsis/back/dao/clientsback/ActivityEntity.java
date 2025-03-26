package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import jakarta.persistence.*;

import org.hibernate.annotations.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "ACTIVITIES")
public class ActivityEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE")
    public Long idPipedrive;

    @Column(columnDefinition = "BIGINT", name = "USER_ID")
    public Long userId;

    @Column(columnDefinition = "BOOLEAN", name = "DONE")
    public Boolean done;

    @Column(columnDefinition = "VARCHAR(255)", name = "TYPE")
    public String type;

    @Column(columnDefinition = "TEXT", name = "REFERENCE_TYPE")
    public String referenceType;

    @Column(columnDefinition = "BIGINT", name = "REFERENCE_ID")
    public Long referenceId;

    @Column(columnDefinition = "TEXT", name = "CONFERENCE_MEETING_CLIENT")
    public String conferenceMeetingClient;

    @Column(columnDefinition = "TEXT", name = "CONFERENCE_MEETING_URL")
    public String conferenceMeetingUrl;

    @Column(columnDefinition = "DATE", name = "DUE_DATE")
    public LocalDate dueDate;

    @Column(columnDefinition = "TEXT", name = "DUE_TIME")
    public String dueTime;

    @Column(columnDefinition = "BOOLEAN", name = "DURATION")
    public Boolean duration;

    @Column(columnDefinition = "BOOLEAN", name = "BUSY_FLAG")
    public Boolean busyFlag;

    @Column(columnDefinition = "DATETIME", name = "ADD_TIME")
    public LocalDateTime addTime;

    @Column(columnDefinition = "DATETIME", name = "MARKED_AS_DONE_TIME")
    public LocalDateTime markedAsDoneTime;

    @Column(columnDefinition = "DATETIME", name = "LAST_NOTIFICATION_TIME")
    public LocalDateTime lastNotificationTime;

    @Column(columnDefinition = "BIGINT", name = "LAST_NOTIFICATION_USER_ID")
    public Long lastNotificationUserId;

    @Column(columnDefinition = "BIGINT", name = "NOTIFICATION_LANGUAGE_ID")
    public Long notificationLanguageId;

    @Column(columnDefinition = "VARCHAR(255)", name = "SUBJECT")
    public String subject;

    @Column(columnDefinition = "BOOLEAN", name = "PUBLIC_DESCRIPTION")
    public Boolean publicDescription;

    @Column(columnDefinition = "TEXT", name = "CALENDAR_SYNC_INCLUDE_CONTEXT")
    public String calendarSyncIncludeContext;

    @Column(columnDefinition = "TEXT", name = "LOCATION")
    public String location;

    @Column(columnDefinition = "BIGINT", name = "ORG_ID")
    public Long orgId;

    @Column(columnDefinition = "BIGINT", name = "PERSON_ID")
    public Long personId;

    @Column(columnDefinition = "BIGINT", name = "DEAL_ID")
    public Long dealId;

    @Column(columnDefinition = "BIGINT", name = "LEAD_ID")
    public Long leadId;

    @Column(columnDefinition = "BOOLEAN", name = "ACTIVE_FLAG")
    public Boolean activeFlag;

    @Column(columnDefinition = "DATETIME", name = "UPDATE_TIME")
    public LocalDateTime updateTime;

    @Column(columnDefinition = "BIGINT", name = "UPDATE_USER_ID")
    public Long updateUserId;

    @Column(columnDefinition = "TEXT", name = "SOURCE_TIMEZONE")
    public String sourceTimezone;

    @Column(columnDefinition = "TEXT", name = "REC_RULE")
    public String recRule;

    @Column(columnDefinition = "TEXT", name = "REC_RULE_EXTENSION")
    public String recRuleExtension;

    @Column(columnDefinition = "BIGINT", name = "REC_MASTER_ACTIVITY_ID")
    public Long recMasterActivityId;

    @Column(columnDefinition = "BIGINT", name = "CONFERENCE_MEETING_ID")
    public Long conferenceMeetingId;

    @Column(columnDefinition = "DATETIME", name = "ORIGINAL_START_TIME")
    public LocalDateTime originalStartTime;

    @Column(columnDefinition = "BOOLEAN", name = "PRIVATE")
    public Boolean isPrivate;

    @Column(columnDefinition = "TEXT", name = "PRIORITY")
    public String priority;

    @Column(columnDefinition = "TEXT", name = "NOTE")
    public String note;

    @Column(columnDefinition = "BIGINT", name = "CREATED_BY_USER_ID")
    public Long createdByUserId;

    @Column(columnDefinition = "TEXT", name = "LOCATION_SUBPREMISE")
    public String locationSubpremise;

    @Column(columnDefinition = "TEXT", name = "LOCATION_STREET_NUMBER")
    public String locationStreetNumber;

    @Column(columnDefinition = "TEXT", name = "LOCATION_ROUTE")
    public String locationRoute;

    @Column(columnDefinition = "TEXT", name = "LOCATION_SUBLOCALITY")
    public String locationSublocality;

    @Column(columnDefinition = "TEXT", name = "LOCATION_LOCALITY")
    public String locationLocality;

    @Column(columnDefinition = "TEXT", name = "LOCATION_ADMIN_AREA_LEVEL_1")
    public String locationAdminAreaLevel1;

    @Column(columnDefinition = "TEXT", name = "LOCATION_ADMIN_AREA_LEVEL_2")
    public String locationAdminAreaLevel2;

    @Column(columnDefinition = "TEXT", name = "LOCATION_COUNTRY")
    public String locationCountry;

    @Column(columnDefinition = "TEXT", name = "LOCATION_POSTAL_CODE")
    public String locationPostalCode;

    @Column(columnDefinition = "TEXT", name = "LOCATION_FORMATTED_ADDRESS")
    public String locationFormattedAddress;

    @Column(columnDefinition = "TEXT", name = "ATTENDEES")
    public String attendees;

    @Column(columnDefinition = "JSON", name = "PARTICIPANTS")
    public String participants;

    @Column(columnDefinition = "TEXT", name = "SERIES")
    public String series;

    @Column(columnDefinition = "BOOLEAN", name = "IS_RECURRING")
    public Boolean isRecurring;

    @Column(columnDefinition = "TEXT", name = "ORG_NAME")
    public String orgName;

    @Column(columnDefinition = "VARCHAR(255)", name = "PERSON_NAME")
    public String personName;

    @Column(columnDefinition = "VARCHAR(255)", name = "DEAL_TITLE")
    public String dealTitle;

    @Column(columnDefinition = "TEXT", name = "LEAD_TITLE")
    public String leadTitle;

    @Column(columnDefinition = "VARCHAR(255)", name = "OWNER_NAME")
    public String ownerName;

    @Column(columnDefinition = "VARCHAR(255)", name = "PERSON_DROPBOX_BCC")
    public String personDropboxBcc;

    @Column(columnDefinition = "VARCHAR(255)", name = "DEAL_DROPBOX_BCC")
    public String dealDropboxBcc;

    @Column(columnDefinition = "BIGINT", name = "ASSIGNED_TO_USER_ID")
    public Long assignedToUserId;

    @Column(columnDefinition = "VARCHAR(255)", name = "TYPE_NAME")
    public String typeName;

    @Column(columnDefinition = "TEXT", name = "LEAD_TEXT")
    public String lead;

    @Column(columnDefinition = "BIGINT", name = "COMPANY_ID")
    public Long companyId;

    @Column(columnDefinition = "BIGINT", name = "OWNER_ID")
    public Long ownerId;

    @Type(JsonType.class)
    @Column(columnDefinition = "json", name = "JSON")
    public String json;

    @Column(name = "PROCESS_REPORT_ID")
    public Long processReportId;
} // close class
