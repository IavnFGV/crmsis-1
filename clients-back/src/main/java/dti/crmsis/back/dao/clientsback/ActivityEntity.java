package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import jakarta.persistence.*;

import org.hibernate.annotations.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "ACTIVITIES")
public class ActivityEntity extends PanacheEntityBase implements HasSourceRequestId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE")
    public Long idPipedrive;

    @Column(columnDefinition = "BOOLEAN", name = "ACTIVE_FLAG")
    public Boolean activeFlag;

    @Column(columnDefinition = "DATETIME", name = "ADD_TIME")
    public LocalDateTime addTime;

    @Column(columnDefinition = "BIGINT", name = "ASSIGNED_TO_USER_ID")
    public Long assignedToUserId;

    @Column(columnDefinition = "TEXT", name = "ATTENDEES")
    public String attendees;

    @Column(columnDefinition = "BOOLEAN", name = "BUSY_FLAG")
    public Boolean busyFlag;

    @Column(columnDefinition = "TEXT", name = "CALENDAR_SYNC_INCLUDE_CONTEXT")
    public String calendarSyncIncludeContext;

    @Column(columnDefinition = "BIGINT", name = "COMPANY_ID")
    public Long companyId;

    @Column(columnDefinition = "TEXT", name = "CONFERENCE_MEETING_CLIENT")
    public String conferenceMeetingClient;

    @Column(columnDefinition = "BIGINT", name = "CONFERENCE_MEETING_ID")
    public Long conferenceMeetingId;

    @Column(columnDefinition = "TEXT", name = "CONFERENCE_MEETING_URL")
    public String conferenceMeetingUrl;

    @Column(columnDefinition = "BIGINT", name = "CREATED_BY_USER_ID")
    public Long createdByUserId;

    @Column(columnDefinition = "VARCHAR(255)", name = "DEAL_DROPBOX_BCC")
    public String dealDropboxBcc;

    @Column(columnDefinition = "BIGINT", name = "DEAL_ID")
    public Long dealId;

    @Column(columnDefinition = "VARCHAR(255)", name = "DEAL_TITLE")
    public String dealTitle;

    @Column(columnDefinition = "BOOLEAN", name = "DONE")
    public Boolean done;

    @Column(columnDefinition = "DATE", name = "DUE_DATE")
    public LocalDate dueDate;

    @Column(columnDefinition = "TEXT", name = "DUE_TIME")
    public String dueTime;

    @Column(columnDefinition = "TEXT", name = "DURATION")
    public String duration;

    @Column(columnDefinition = "BOOLEAN", name = "IS_RECURRING")
    public Boolean isRecurring;

    @Column(columnDefinition = "DATETIME", name = "LAST_NOTIFICATION_TIME")
    public LocalDateTime lastNotificationTime;

    @Column(columnDefinition = "BIGINT", name = "LAST_NOTIFICATION_USER_ID")
    public Long lastNotificationUserId;

    @Column(columnDefinition = "TEXT", name = "LEAD_TEXT")
    public String lead;

    @Column(columnDefinition = "BIGINT", name = "LEAD_ID")
    public Long leadId;

    @Column(columnDefinition = "TEXT", name = "LEAD_TITLE")
    public String leadTitle;

    @Column(columnDefinition = "TEXT", name = "LOCATION")
    public String location;

    @Column(columnDefinition = "TEXT", name = "LOCATION_ADMIN_AREA_LEVEL_1")
    public String locationAdminAreaLevel1;

    @Column(columnDefinition = "TEXT", name = "LOCATION_ADMIN_AREA_LEVEL_2")
    public String locationAdminAreaLevel2;

    @Column(columnDefinition = "TEXT", name = "LOCATION_COUNTRY")
    public String locationCountry;

    @Column(columnDefinition = "TEXT", name = "LOCATION_FORMATTED_ADDRESS")
    public String locationFormattedAddress;

    @Column(columnDefinition = "TEXT", name = "LOCATION_LOCALITY")
    public String locationLocality;

    @Column(columnDefinition = "TEXT", name = "LOCATION_POSTAL_CODE")
    public String locationPostalCode;

    @Column(columnDefinition = "TEXT", name = "LOCATION_ROUTE")
    public String locationRoute;

    @Column(columnDefinition = "TEXT", name = "LOCATION_STREET_NUMBER")
    public String locationStreetNumber;

    @Column(columnDefinition = "TEXT", name = "LOCATION_SUBLOCALITY")
    public String locationSublocality;

    @Column(columnDefinition = "TEXT", name = "LOCATION_SUBPREMISE")
    public String locationSubpremise;

    @Column(columnDefinition = "DATETIME", name = "MARKED_AS_DONE_TIME")
    public LocalDateTime markedAsDoneTime;

    @Column(columnDefinition = "TEXT", name = "NOTE")
    public String note;

    @Column(columnDefinition = "BIGINT", name = "NOTIFICATION_LANGUAGE_ID")
    public Long notificationLanguageId;

    @Column(columnDefinition = "BIGINT", name = "ORG_ID")
    public Long orgId;

    @Column(columnDefinition = "TEXT", name = "ORG_NAME")
    public String orgName;

    @Column(columnDefinition = "DATETIME", name = "ORIGINAL_START_TIME")
    public LocalDateTime originalStartTime;

    @Column(columnDefinition = "BIGINT", name = "OWNER_ID")
    public Long ownerId;

    @Column(columnDefinition = "VARCHAR(255)", name = "OWNER_NAME")
    public String ownerName;

    @Column(columnDefinition = "JSON", name = "PARTICIPANTS")
    public String participants;

    @Column(columnDefinition = "VARCHAR(255)", name = "PERSON_DROPBOX_BCC")
    public String personDropboxBcc;

    @Column(columnDefinition = "BIGINT", name = "PERSON_ID")
    public Long personId;

    @Column(columnDefinition = "VARCHAR(255)", name = "PERSON_NAME")
    public String personName;

    @Column(columnDefinition = "TEXT", name = "PRIORITY")
    public String priority;

    @Column(columnDefinition = "BOOLEAN", name = "PRIVATE")
    public Boolean isPrivate;

    @Column(columnDefinition = "BOOLEAN", name = "PUBLIC_DESCRIPTION")
    public Boolean publicDescription;

    @Column(columnDefinition = "BIGINT", name = "REC_MASTER_ACTIVITY_ID")
    public Long recMasterActivityId;

    @Column(columnDefinition = "TEXT", name = "REC_RULE")
    public String recRule;

    @Column(columnDefinition = "TEXT", name = "REC_RULE_EXTENSION")
    public String recRuleExtension;

    @Column(columnDefinition = "BIGINT", name = "REFERENCE_ID")
    public Long referenceId;

    @Column(columnDefinition = "TEXT", name = "REFERENCE_TYPE")
    public String referenceType;

    @Column(columnDefinition = "TEXT", name = "SERIES")
    public String series;

    @Column(columnDefinition = "TEXT", name = "SOURCE_TIMEZONE")
    public String sourceTimezone;

    @Column(columnDefinition = "VARCHAR(255)", name = "SUBJECT")
    public String subject;

    @Column(columnDefinition = "VARCHAR(255)", name = "TYPE")
    public String type;

    @Column(columnDefinition = "VARCHAR(255)", name = "TYPE_NAME")
    public String typeName;

    @Column(columnDefinition = "DATETIME", name = "UPDATE_TIME")
    public LocalDateTime updateTime;

    @Column(columnDefinition = "BIGINT", name = "UPDATE_USER_ID")
    public Long updateUserId;

    @Column(columnDefinition = "BIGINT", name = "USER_ID")
    public Long userId;

    @Type(JsonType.class)
    @Column(columnDefinition = "json", name = "JSON")
    public String json;

    @Column(name = "SOURCE_REQUEST_ID")
    public Long sourceRequestId;

    @Override
    public void setSourceRequestId(Long sourceRequestId) {
        this.sourceRequestId = sourceRequestId;
    }

    @Override
    public Long getSourceRequestId() {
        return this.sourceRequestId;
    }

    @Column(name = "IS_DELETED")
    public Boolean isDeleted = false;
} // close class
