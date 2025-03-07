package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Activity  {

    /**
      * The due date of the activity. Format: YYYY-MM-DD
     **/
    private LocalDate dueDate;
    /**
      * The due time of the activity in UTC. Format: HH:MM
     **/
    private String dueTime;
    /**
      * The duration of the activity. Format: HH:MM
     **/
    private String duration;
    /**
      * The ID of the deal this activity is associated with
     **/
    private Integer dealId;
    /**
      * The ID of the lead in the UUID format this activity is associated with
     **/
    private UUID leadId;
    /**
      * The ID of the person this activity is associated with
     **/
    private Integer personId;
    /**
      * The ID of the project this activity is associated with
     **/
    private Integer projectId;
    /**
      * The ID of the organization this activity is associated with
     **/
    private Integer orgId;
    /**
      * The address of the activity.
     **/
    private String location;
    /**
      * Additional details about the activity that is synced to your external calendar. Unlike the note added to the activity, the description is publicly visible to any guests added to the activity.
     **/
    private String publicDescription;
    /**
      * The ID of the activity, generated when the activity was created
     **/
    private Integer id;
    /**
      * The note of the activity (HTML format)
     **/
    private String note;
    /**
      * Whether the activity is done or not
     **/
    private Boolean done;
    /**
      * The subject of the activity
     **/
    private String subject;
    /**
      * The type of the activity. This is in correlation with the `key_string` parameter of ActivityTypes.
     **/
    private String type;
    /**
      * The ID of the user whom the activity is assigned to
     **/
    private Integer userId;
    /**
      * List of multiple persons (participants) this activity is associated with
     **/
    private List<Object> participants;
    /**
      * Marks if the activity is set as 'Busy' or 'Free'. If the flag is set to `true`, your customers will not be able to book that time slot through any Scheduler links. The flag can also be unset. When the value of the flag is unset (`null`), the flag defaults to 'Busy' if it has a time set, and 'Free' if it is an all-day event without specified time.
     **/
    private Boolean busyFlag;
    /**
      * The attendees of the activity. This can be either your existing Pipedrive contacts or an external email address.
     **/
    private List<Object> attendees;
    /**
      * The user's company ID
     **/
    private Integer companyId;
    /**
      * If the activity references some other object, it is indicated here. For example, value `Salesphone` refers to activities created with Caller.
     **/
    private String referenceType;
    /**
      * Together with the `reference_type`, gives the ID of the other object
     **/
    private Integer referenceId;
    /**
      * The ID of the Marketplace app, which is connected to this activity
     **/
    private String conferenceMeetingClient;
    /**
      * The link to join the meeting which is associated with this activity
     **/
    private String conferenceMeetingUrl;
    /**
      * The meeting ID of the meeting provider (Zoom, MS Teams etc.) that is associated with this activity
     **/
    private String conferenceMeetingId;
    /**
      * The creation date and time of the activity in UTC. Format: YYYY-MM-DD HH:MM:SS.
     **/
    private String addTime;
    /**
      * The date and time this activity was marked as done. Format: YYYY-MM-DD HH:MM:SS.
     **/
    private String markedAsDoneTime;
    /**
      * The date and time of latest notifications sent about this activity to the participants or the attendees of this activity
     **/
    private String lastNotificationTime;
    /**
      * The ID of the user who triggered the sending of the latest notifications about this activity to the participants or the attendees of this activity
     **/
    private Integer lastNotificationUserId;
    /**
      * The ID of the language the notifications are sent in
     **/
    private Integer notificationLanguageId;
    /**
      * Whether the activity is active or not
     **/
    private Boolean activeFlag;
    /**
      * The last update date and time of the activity. Format: YYYY-MM-DD HH:MM:SS.
     **/
    private String updateTime;
    /**
      * The ID of the user who was the last to update this activity
     **/
    private Integer updateUserId;
    /**
      * For the activity which syncs to Google calendar, this is the Google event ID. NB! This field is related to old Google calendar sync and will be deprecated soon.
     **/
    private String gcalEventId;
    /**
      * The Google calendar ID that this activity syncs to. NB! This field is related to old Google calendar sync and will be deprecated soon.
     **/
    private String googleCalendarId;
    /**
      * The Google calendar API etag (version) that is used for syncing this activity. NB! This field is related to old Google calendar sync and will be deprecated soon.
     **/
    private String googleCalendarEtag;
    /**
      * For activities that sync to an external calendar, this setting indicates if the activity syncs with context (what are the deals, persons, organizations this activity is related to)
     **/
    private String calendarSyncIncludeContext;
    /**
      * The timezone the activity was created in an external calendar
     **/
    private String sourceTimezone;
    /**
      * The rule for the recurrence of the activity. Is important for activities synced into Pipedrive from an external calendar. Example: \"RRULE:FREQ=WEEKLY;BYDAY=WE\"
     **/
    private String recRule;
    /**
      * Additional rules for the recurrence of the activity, extend the `rec_rule`. Is important for activities synced into Pipedrive from an external calendar.
     **/
    private String recRuleExtension;
    /**
      * The ID of parent activity for a recurrent activity if the current activity is an exception to recurrence rules
     **/
    private Integer recMasterActivityId;
    /**
      * The list of recurring activity instances. It is in a structure as follows: `[{due_date: \"2020-06-24\", due_time: \"10:00:00\"}]`
     **/
    private List<Object> series;
    /**
      * The ID of the user who created the activity
     **/
    private Integer createdByUserId;
    /**
      * A subfield of the location field. Indicates apartment/suite number.
     **/
    private String locationSubpremise;
    /**
      * A subfield of the location field. Indicates house number.
     **/
    private String locationStreetNumber;
    /**
      * A subfield of the location field. Indicates street name.
     **/
    private String locationRoute;
    /**
      * A subfield of the location field. Indicates district/sublocality.
     **/
    private String locationSublocality;
    /**
      * A subfield of the location field. Indicates city/town/village/locality.
     **/
    private String locationLocality;
    /**
      * A subfield of the location field. Indicates state/county.
     **/
    private String locationAdminAreaLevel1;
    /**
      * A subfield of the location field. Indicates region.
     **/
    private String locationAdminAreaLevel2;
    /**
      * A subfield of the location field. Indicates country.
     **/
    private String locationCountry;
    /**
      * A subfield of the location field. Indicates ZIP/postal code.
     **/
    private String locationPostalCode;
    /**
      * A subfield of the location field. Indicates full/combined address.
     **/
    private String locationFormattedAddress;
    /**
      * The name of the organization this activity is associated with
     **/
    private String orgName;
    /**
      * The name of the person this activity is associated with
     **/
    private String personName;
    /**
      * The name of the deal this activity is associated with
     **/
    private String dealTitle;
    /**
      * The name of the user this activity is owned by
     **/
    private String ownerName;
    /**
      * The BCC email address of the person
     **/
    private String personDropboxBcc;
    /**
      * The BCC email address of the deal
     **/
    private String dealDropboxBcc;
    /**
      * The ID of the user to whom the activity is assigned to. Equal to `user_id`.
     **/
    private Integer assignedToUserId;
    /**
      * The file that is attached to this activity. For example, this can be a reference to an audio note file generated with Pipedrive mobile app.
     **/
    private Object _file;

    /**
    * The due date of the activity. Format: YYYY-MM-DD
    * @return dueDate
    **/
    @JsonProperty("due_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LocalDate getDueDate() {
        return dueDate;
    }

    /**
     * Set dueDate
     **/
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Activity dueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
    * The due time of the activity in UTC. Format: HH:MM
    * @return dueTime
    **/
    @JsonProperty("due_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDueTime() {
        return dueTime;
    }

    /**
     * Set dueTime
     **/
    public void setDueTime(String dueTime) {
        this.dueTime = dueTime;
    }

    public Activity dueTime(String dueTime) {
        this.dueTime = dueTime;
        return this;
    }

    /**
    * The duration of the activity. Format: HH:MM
    * @return duration
    **/
    @JsonProperty("duration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDuration() {
        return duration;
    }

    /**
     * Set duration
     **/
    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Activity duration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
    * The ID of the deal this activity is associated with
    * @return dealId
    **/
    @JsonProperty("deal_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getDealId() {
        return dealId;
    }

    /**
     * Set dealId
     **/
    public void setDealId(Integer dealId) {
        this.dealId = dealId;
    }

    public Activity dealId(Integer dealId) {
        this.dealId = dealId;
        return this;
    }

    /**
    * The ID of the lead in the UUID format this activity is associated with
    * @return leadId
    **/
    @JsonProperty("lead_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getLeadId() {
        return leadId;
    }

    /**
     * Set leadId
     **/
    public void setLeadId(UUID leadId) {
        this.leadId = leadId;
    }

    public Activity leadId(UUID leadId) {
        this.leadId = leadId;
        return this;
    }

    /**
    * The ID of the person this activity is associated with
    * @return personId
    **/
    @JsonProperty("person_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPersonId() {
        return personId;
    }

    /**
     * Set personId
     **/
    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Activity personId(Integer personId) {
        this.personId = personId;
        return this;
    }

    /**
    * The ID of the project this activity is associated with
    * @return projectId
    **/
    @JsonProperty("project_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * Set projectId
     **/
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Activity projectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
    * The ID of the organization this activity is associated with
    * @return orgId
    **/
    @JsonProperty("org_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * Set orgId
     **/
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Activity orgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }

    /**
    * The address of the activity.
    * @return location
    **/
    @JsonProperty("location")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocation() {
        return location;
    }

    /**
     * Set location
     **/
    public void setLocation(String location) {
        this.location = location;
    }

    public Activity location(String location) {
        this.location = location;
        return this;
    }

    /**
    * Additional details about the activity that is synced to your external calendar. Unlike the note added to the activity, the description is publicly visible to any guests added to the activity.
    * @return publicDescription
    **/
    @JsonProperty("public_description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPublicDescription() {
        return publicDescription;
    }

    /**
     * Set publicDescription
     **/
    public void setPublicDescription(String publicDescription) {
        this.publicDescription = publicDescription;
    }

    public Activity publicDescription(String publicDescription) {
        this.publicDescription = publicDescription;
        return this;
    }

    /**
    * The ID of the activity, generated when the activity was created
    * @return id
    **/
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(Integer id) {
        this.id = id;
    }

    public Activity id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The note of the activity (HTML format)
    * @return note
    **/
    @JsonProperty("note")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNote() {
        return note;
    }

    /**
     * Set note
     **/
    public void setNote(String note) {
        this.note = note;
    }

    public Activity note(String note) {
        this.note = note;
        return this;
    }

    /**
    * Whether the activity is done or not
    * @return done
    **/
    @JsonProperty("done")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDone() {
        return done;
    }

    /**
     * Set done
     **/
    public void setDone(Boolean done) {
        this.done = done;
    }

    public Activity done(Boolean done) {
        this.done = done;
        return this;
    }

    /**
    * The subject of the activity
    * @return subject
    **/
    @JsonProperty("subject")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSubject() {
        return subject;
    }

    /**
     * Set subject
     **/
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Activity subject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
    * The type of the activity. This is in correlation with the `key_string` parameter of ActivityTypes.
    * @return type
    **/
    @JsonProperty("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(String type) {
        this.type = type;
    }

    public Activity type(String type) {
        this.type = type;
        return this;
    }

    /**
    * The ID of the user whom the activity is assigned to
    * @return userId
    **/
    @JsonProperty("user_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getUserId() {
        return userId;
    }

    /**
     * Set userId
     **/
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Activity userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
    * List of multiple persons (participants) this activity is associated with
    * @return participants
    **/
    @JsonProperty("participants")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Object> getParticipants() {
        return participants;
    }

    /**
     * Set participants
     **/
    public void setParticipants(List<Object> participants) {
        this.participants = participants;
    }

    public Activity participants(List<Object> participants) {
        this.participants = participants;
        return this;
    }
    public Activity addParticipantsItem(Object participantsItem) {
        if (this.participants == null){
            participants = new ArrayList<>();
        }
        this.participants.add(participantsItem);
        return this;
    }

    /**
    * Marks if the activity is set as 'Busy' or 'Free'. If the flag is set to `true`, your customers will not be able to book that time slot through any Scheduler links. The flag can also be unset. When the value of the flag is unset (`null`), the flag defaults to 'Busy' if it has a time set, and 'Free' if it is an all-day event without specified time.
    * @return busyFlag
    **/
    @JsonProperty("busy_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getBusyFlag() {
        return busyFlag;
    }

    /**
     * Set busyFlag
     **/
    public void setBusyFlag(Boolean busyFlag) {
        this.busyFlag = busyFlag;
    }

    public Activity busyFlag(Boolean busyFlag) {
        this.busyFlag = busyFlag;
        return this;
    }

    /**
    * The attendees of the activity. This can be either your existing Pipedrive contacts or an external email address.
    * @return attendees
    **/
    @JsonProperty("attendees")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Object> getAttendees() {
        return attendees;
    }

    /**
     * Set attendees
     **/
    public void setAttendees(List<Object> attendees) {
        this.attendees = attendees;
    }

    public Activity attendees(List<Object> attendees) {
        this.attendees = attendees;
        return this;
    }
    public Activity addAttendeesItem(Object attendeesItem) {
        if (this.attendees == null){
            attendees = new ArrayList<>();
        }
        this.attendees.add(attendeesItem);
        return this;
    }

    /**
    * The user's company ID
    * @return companyId
    **/
    @JsonProperty("company_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * Set companyId
     **/
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Activity companyId(Integer companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
    * If the activity references some other object, it is indicated here. For example, value `Salesphone` refers to activities created with Caller.
    * @return referenceType
    **/
    @JsonProperty("reference_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReferenceType() {
        return referenceType;
    }

    /**
     * Set referenceType
     **/
    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    public Activity referenceType(String referenceType) {
        this.referenceType = referenceType;
        return this;
    }

    /**
    * Together with the `reference_type`, gives the ID of the other object
    * @return referenceId
    **/
    @JsonProperty("reference_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getReferenceId() {
        return referenceId;
    }

    /**
     * Set referenceId
     **/
    public void setReferenceId(Integer referenceId) {
        this.referenceId = referenceId;
    }

    public Activity referenceId(Integer referenceId) {
        this.referenceId = referenceId;
        return this;
    }

    /**
    * The ID of the Marketplace app, which is connected to this activity
    * @return conferenceMeetingClient
    **/
    @JsonProperty("conference_meeting_client")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getConferenceMeetingClient() {
        return conferenceMeetingClient;
    }

    /**
     * Set conferenceMeetingClient
     **/
    public void setConferenceMeetingClient(String conferenceMeetingClient) {
        this.conferenceMeetingClient = conferenceMeetingClient;
    }

    public Activity conferenceMeetingClient(String conferenceMeetingClient) {
        this.conferenceMeetingClient = conferenceMeetingClient;
        return this;
    }

    /**
    * The link to join the meeting which is associated with this activity
    * @return conferenceMeetingUrl
    **/
    @JsonProperty("conference_meeting_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getConferenceMeetingUrl() {
        return conferenceMeetingUrl;
    }

    /**
     * Set conferenceMeetingUrl
     **/
    public void setConferenceMeetingUrl(String conferenceMeetingUrl) {
        this.conferenceMeetingUrl = conferenceMeetingUrl;
    }

    public Activity conferenceMeetingUrl(String conferenceMeetingUrl) {
        this.conferenceMeetingUrl = conferenceMeetingUrl;
        return this;
    }

    /**
    * The meeting ID of the meeting provider (Zoom, MS Teams etc.) that is associated with this activity
    * @return conferenceMeetingId
    **/
    @JsonProperty("conference_meeting_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getConferenceMeetingId() {
        return conferenceMeetingId;
    }

    /**
     * Set conferenceMeetingId
     **/
    public void setConferenceMeetingId(String conferenceMeetingId) {
        this.conferenceMeetingId = conferenceMeetingId;
    }

    public Activity conferenceMeetingId(String conferenceMeetingId) {
        this.conferenceMeetingId = conferenceMeetingId;
        return this;
    }

    /**
    * The creation date and time of the activity in UTC. Format: YYYY-MM-DD HH:MM:SS.
    * @return addTime
    **/
    @JsonProperty("add_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddTime() {
        return addTime;
    }

    /**
     * Set addTime
     **/
    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public Activity addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The date and time this activity was marked as done. Format: YYYY-MM-DD HH:MM:SS.
    * @return markedAsDoneTime
    **/
    @JsonProperty("marked_as_done_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMarkedAsDoneTime() {
        return markedAsDoneTime;
    }

    /**
     * Set markedAsDoneTime
     **/
    public void setMarkedAsDoneTime(String markedAsDoneTime) {
        this.markedAsDoneTime = markedAsDoneTime;
    }

    public Activity markedAsDoneTime(String markedAsDoneTime) {
        this.markedAsDoneTime = markedAsDoneTime;
        return this;
    }

    /**
    * The date and time of latest notifications sent about this activity to the participants or the attendees of this activity
    * @return lastNotificationTime
    **/
    @JsonProperty("last_notification_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastNotificationTime() {
        return lastNotificationTime;
    }

    /**
     * Set lastNotificationTime
     **/
    public void setLastNotificationTime(String lastNotificationTime) {
        this.lastNotificationTime = lastNotificationTime;
    }

    public Activity lastNotificationTime(String lastNotificationTime) {
        this.lastNotificationTime = lastNotificationTime;
        return this;
    }

    /**
    * The ID of the user who triggered the sending of the latest notifications about this activity to the participants or the attendees of this activity
    * @return lastNotificationUserId
    **/
    @JsonProperty("last_notification_user_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getLastNotificationUserId() {
        return lastNotificationUserId;
    }

    /**
     * Set lastNotificationUserId
     **/
    public void setLastNotificationUserId(Integer lastNotificationUserId) {
        this.lastNotificationUserId = lastNotificationUserId;
    }

    public Activity lastNotificationUserId(Integer lastNotificationUserId) {
        this.lastNotificationUserId = lastNotificationUserId;
        return this;
    }

    /**
    * The ID of the language the notifications are sent in
    * @return notificationLanguageId
    **/
    @JsonProperty("notification_language_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNotificationLanguageId() {
        return notificationLanguageId;
    }

    /**
     * Set notificationLanguageId
     **/
    public void setNotificationLanguageId(Integer notificationLanguageId) {
        this.notificationLanguageId = notificationLanguageId;
    }

    public Activity notificationLanguageId(Integer notificationLanguageId) {
        this.notificationLanguageId = notificationLanguageId;
        return this;
    }

    /**
    * Whether the activity is active or not
    * @return activeFlag
    **/
    @JsonProperty("active_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getActiveFlag() {
        return activeFlag;
    }

    /**
     * Set activeFlag
     **/
    public void setActiveFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
    }

    public Activity activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * The last update date and time of the activity. Format: YYYY-MM-DD HH:MM:SS.
    * @return updateTime
    **/
    @JsonProperty("update_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Set updateTime
     **/
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Activity updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
    * The ID of the user who was the last to update this activity
    * @return updateUserId
    **/
    @JsonProperty("update_user_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    /**
     * Set updateUserId
     **/
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Activity updateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
        return this;
    }

    /**
    * For the activity which syncs to Google calendar, this is the Google event ID. NB! This field is related to old Google calendar sync and will be deprecated soon.
    * @return gcalEventId
    **/
    @JsonProperty("gcal_event_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGcalEventId() {
        return gcalEventId;
    }

    /**
     * Set gcalEventId
     **/
    public void setGcalEventId(String gcalEventId) {
        this.gcalEventId = gcalEventId;
    }

    public Activity gcalEventId(String gcalEventId) {
        this.gcalEventId = gcalEventId;
        return this;
    }

    /**
    * The Google calendar ID that this activity syncs to. NB! This field is related to old Google calendar sync and will be deprecated soon.
    * @return googleCalendarId
    **/
    @JsonProperty("google_calendar_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGoogleCalendarId() {
        return googleCalendarId;
    }

    /**
     * Set googleCalendarId
     **/
    public void setGoogleCalendarId(String googleCalendarId) {
        this.googleCalendarId = googleCalendarId;
    }

    public Activity googleCalendarId(String googleCalendarId) {
        this.googleCalendarId = googleCalendarId;
        return this;
    }

    /**
    * The Google calendar API etag (version) that is used for syncing this activity. NB! This field is related to old Google calendar sync and will be deprecated soon.
    * @return googleCalendarEtag
    **/
    @JsonProperty("google_calendar_etag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGoogleCalendarEtag() {
        return googleCalendarEtag;
    }

    /**
     * Set googleCalendarEtag
     **/
    public void setGoogleCalendarEtag(String googleCalendarEtag) {
        this.googleCalendarEtag = googleCalendarEtag;
    }

    public Activity googleCalendarEtag(String googleCalendarEtag) {
        this.googleCalendarEtag = googleCalendarEtag;
        return this;
    }

    /**
    * For activities that sync to an external calendar, this setting indicates if the activity syncs with context (what are the deals, persons, organizations this activity is related to)
    * @return calendarSyncIncludeContext
    **/
    @JsonProperty("calendar_sync_include_context")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCalendarSyncIncludeContext() {
        return calendarSyncIncludeContext;
    }

    /**
     * Set calendarSyncIncludeContext
     **/
    public void setCalendarSyncIncludeContext(String calendarSyncIncludeContext) {
        this.calendarSyncIncludeContext = calendarSyncIncludeContext;
    }

    public Activity calendarSyncIncludeContext(String calendarSyncIncludeContext) {
        this.calendarSyncIncludeContext = calendarSyncIncludeContext;
        return this;
    }

    /**
    * The timezone the activity was created in an external calendar
    * @return sourceTimezone
    **/
    @JsonProperty("source_timezone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSourceTimezone() {
        return sourceTimezone;
    }

    /**
     * Set sourceTimezone
     **/
    public void setSourceTimezone(String sourceTimezone) {
        this.sourceTimezone = sourceTimezone;
    }

    public Activity sourceTimezone(String sourceTimezone) {
        this.sourceTimezone = sourceTimezone;
        return this;
    }

    /**
    * The rule for the recurrence of the activity. Is important for activities synced into Pipedrive from an external calendar. Example: \"RRULE:FREQ=WEEKLY;BYDAY=WE\"
    * @return recRule
    **/
    @JsonProperty("rec_rule")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRecRule() {
        return recRule;
    }

    /**
     * Set recRule
     **/
    public void setRecRule(String recRule) {
        this.recRule = recRule;
    }

    public Activity recRule(String recRule) {
        this.recRule = recRule;
        return this;
    }

    /**
    * Additional rules for the recurrence of the activity, extend the `rec_rule`. Is important for activities synced into Pipedrive from an external calendar.
    * @return recRuleExtension
    **/
    @JsonProperty("rec_rule_extension")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRecRuleExtension() {
        return recRuleExtension;
    }

    /**
     * Set recRuleExtension
     **/
    public void setRecRuleExtension(String recRuleExtension) {
        this.recRuleExtension = recRuleExtension;
    }

    public Activity recRuleExtension(String recRuleExtension) {
        this.recRuleExtension = recRuleExtension;
        return this;
    }

    /**
    * The ID of parent activity for a recurrent activity if the current activity is an exception to recurrence rules
    * @return recMasterActivityId
    **/
    @JsonProperty("rec_master_activity_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getRecMasterActivityId() {
        return recMasterActivityId;
    }

    /**
     * Set recMasterActivityId
     **/
    public void setRecMasterActivityId(Integer recMasterActivityId) {
        this.recMasterActivityId = recMasterActivityId;
    }

    public Activity recMasterActivityId(Integer recMasterActivityId) {
        this.recMasterActivityId = recMasterActivityId;
        return this;
    }

    /**
    * The list of recurring activity instances. It is in a structure as follows: `[{due_date: \"2020-06-24\", due_time: \"10:00:00\"}]`
    * @return series
    **/
    @JsonProperty("series")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Object> getSeries() {
        return series;
    }

    /**
     * Set series
     **/
    public void setSeries(List<Object> series) {
        this.series = series;
    }

    public Activity series(List<Object> series) {
        this.series = series;
        return this;
    }
    public Activity addSeriesItem(Object seriesItem) {
        if (this.series == null){
            series = new ArrayList<>();
        }
        this.series.add(seriesItem);
        return this;
    }

    /**
    * The ID of the user who created the activity
    * @return createdByUserId
    **/
    @JsonProperty("created_by_user_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCreatedByUserId() {
        return createdByUserId;
    }

    /**
     * Set createdByUserId
     **/
    public void setCreatedByUserId(Integer createdByUserId) {
        this.createdByUserId = createdByUserId;
    }

    public Activity createdByUserId(Integer createdByUserId) {
        this.createdByUserId = createdByUserId;
        return this;
    }

    /**
    * A subfield of the location field. Indicates apartment/suite number.
    * @return locationSubpremise
    **/
    @JsonProperty("location_subpremise")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocationSubpremise() {
        return locationSubpremise;
    }

    /**
     * Set locationSubpremise
     **/
    public void setLocationSubpremise(String locationSubpremise) {
        this.locationSubpremise = locationSubpremise;
    }

    public Activity locationSubpremise(String locationSubpremise) {
        this.locationSubpremise = locationSubpremise;
        return this;
    }

    /**
    * A subfield of the location field. Indicates house number.
    * @return locationStreetNumber
    **/
    @JsonProperty("location_street_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocationStreetNumber() {
        return locationStreetNumber;
    }

    /**
     * Set locationStreetNumber
     **/
    public void setLocationStreetNumber(String locationStreetNumber) {
        this.locationStreetNumber = locationStreetNumber;
    }

    public Activity locationStreetNumber(String locationStreetNumber) {
        this.locationStreetNumber = locationStreetNumber;
        return this;
    }

    /**
    * A subfield of the location field. Indicates street name.
    * @return locationRoute
    **/
    @JsonProperty("location_route")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocationRoute() {
        return locationRoute;
    }

    /**
     * Set locationRoute
     **/
    public void setLocationRoute(String locationRoute) {
        this.locationRoute = locationRoute;
    }

    public Activity locationRoute(String locationRoute) {
        this.locationRoute = locationRoute;
        return this;
    }

    /**
    * A subfield of the location field. Indicates district/sublocality.
    * @return locationSublocality
    **/
    @JsonProperty("location_sublocality")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocationSublocality() {
        return locationSublocality;
    }

    /**
     * Set locationSublocality
     **/
    public void setLocationSublocality(String locationSublocality) {
        this.locationSublocality = locationSublocality;
    }

    public Activity locationSublocality(String locationSublocality) {
        this.locationSublocality = locationSublocality;
        return this;
    }

    /**
    * A subfield of the location field. Indicates city/town/village/locality.
    * @return locationLocality
    **/
    @JsonProperty("location_locality")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocationLocality() {
        return locationLocality;
    }

    /**
     * Set locationLocality
     **/
    public void setLocationLocality(String locationLocality) {
        this.locationLocality = locationLocality;
    }

    public Activity locationLocality(String locationLocality) {
        this.locationLocality = locationLocality;
        return this;
    }

    /**
    * A subfield of the location field. Indicates state/county.
    * @return locationAdminAreaLevel1
    **/
    @JsonProperty("location_admin_area_level_1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocationAdminAreaLevel1() {
        return locationAdminAreaLevel1;
    }

    /**
     * Set locationAdminAreaLevel1
     **/
    public void setLocationAdminAreaLevel1(String locationAdminAreaLevel1) {
        this.locationAdminAreaLevel1 = locationAdminAreaLevel1;
    }

    public Activity locationAdminAreaLevel1(String locationAdminAreaLevel1) {
        this.locationAdminAreaLevel1 = locationAdminAreaLevel1;
        return this;
    }

    /**
    * A subfield of the location field. Indicates region.
    * @return locationAdminAreaLevel2
    **/
    @JsonProperty("location_admin_area_level_2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocationAdminAreaLevel2() {
        return locationAdminAreaLevel2;
    }

    /**
     * Set locationAdminAreaLevel2
     **/
    public void setLocationAdminAreaLevel2(String locationAdminAreaLevel2) {
        this.locationAdminAreaLevel2 = locationAdminAreaLevel2;
    }

    public Activity locationAdminAreaLevel2(String locationAdminAreaLevel2) {
        this.locationAdminAreaLevel2 = locationAdminAreaLevel2;
        return this;
    }

    /**
    * A subfield of the location field. Indicates country.
    * @return locationCountry
    **/
    @JsonProperty("location_country")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocationCountry() {
        return locationCountry;
    }

    /**
     * Set locationCountry
     **/
    public void setLocationCountry(String locationCountry) {
        this.locationCountry = locationCountry;
    }

    public Activity locationCountry(String locationCountry) {
        this.locationCountry = locationCountry;
        return this;
    }

    /**
    * A subfield of the location field. Indicates ZIP/postal code.
    * @return locationPostalCode
    **/
    @JsonProperty("location_postal_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocationPostalCode() {
        return locationPostalCode;
    }

    /**
     * Set locationPostalCode
     **/
    public void setLocationPostalCode(String locationPostalCode) {
        this.locationPostalCode = locationPostalCode;
    }

    public Activity locationPostalCode(String locationPostalCode) {
        this.locationPostalCode = locationPostalCode;
        return this;
    }

    /**
    * A subfield of the location field. Indicates full/combined address.
    * @return locationFormattedAddress
    **/
    @JsonProperty("location_formatted_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocationFormattedAddress() {
        return locationFormattedAddress;
    }

    /**
     * Set locationFormattedAddress
     **/
    public void setLocationFormattedAddress(String locationFormattedAddress) {
        this.locationFormattedAddress = locationFormattedAddress;
    }

    public Activity locationFormattedAddress(String locationFormattedAddress) {
        this.locationFormattedAddress = locationFormattedAddress;
        return this;
    }

    /**
    * The name of the organization this activity is associated with
    * @return orgName
    **/
    @JsonProperty("org_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOrgName() {
        return orgName;
    }

    /**
     * Set orgName
     **/
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Activity orgName(String orgName) {
        this.orgName = orgName;
        return this;
    }

    /**
    * The name of the person this activity is associated with
    * @return personName
    **/
    @JsonProperty("person_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPersonName() {
        return personName;
    }

    /**
     * Set personName
     **/
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Activity personName(String personName) {
        this.personName = personName;
        return this;
    }

    /**
    * The name of the deal this activity is associated with
    * @return dealTitle
    **/
    @JsonProperty("deal_title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDealTitle() {
        return dealTitle;
    }

    /**
     * Set dealTitle
     **/
    public void setDealTitle(String dealTitle) {
        this.dealTitle = dealTitle;
    }

    public Activity dealTitle(String dealTitle) {
        this.dealTitle = dealTitle;
        return this;
    }

    /**
    * The name of the user this activity is owned by
    * @return ownerName
    **/
    @JsonProperty("owner_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Set ownerName
     **/
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Activity ownerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    /**
    * The BCC email address of the person
    * @return personDropboxBcc
    **/
    @JsonProperty("person_dropbox_bcc")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPersonDropboxBcc() {
        return personDropboxBcc;
    }

    /**
     * Set personDropboxBcc
     **/
    public void setPersonDropboxBcc(String personDropboxBcc) {
        this.personDropboxBcc = personDropboxBcc;
    }

    public Activity personDropboxBcc(String personDropboxBcc) {
        this.personDropboxBcc = personDropboxBcc;
        return this;
    }

    /**
    * The BCC email address of the deal
    * @return dealDropboxBcc
    **/
    @JsonProperty("deal_dropbox_bcc")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDealDropboxBcc() {
        return dealDropboxBcc;
    }

    /**
     * Set dealDropboxBcc
     **/
    public void setDealDropboxBcc(String dealDropboxBcc) {
        this.dealDropboxBcc = dealDropboxBcc;
    }

    public Activity dealDropboxBcc(String dealDropboxBcc) {
        this.dealDropboxBcc = dealDropboxBcc;
        return this;
    }

    /**
    * The ID of the user to whom the activity is assigned to. Equal to `user_id`.
    * @return assignedToUserId
    **/
    @JsonProperty("assigned_to_user_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAssignedToUserId() {
        return assignedToUserId;
    }

    /**
     * Set assignedToUserId
     **/
    public void setAssignedToUserId(Integer assignedToUserId) {
        this.assignedToUserId = assignedToUserId;
    }

    public Activity assignedToUserId(Integer assignedToUserId) {
        this.assignedToUserId = assignedToUserId;
        return this;
    }

    /**
    * The file that is attached to this activity. For example, this can be a reference to an audio note file generated with Pipedrive mobile app.
    * @return _file
    **/
    @JsonProperty("file")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getFile() {
        return _file;
    }

    /**
     * Set _file
     **/
    public void setFile(Object _file) {
        this._file = _file;
    }

    public Activity _file(Object _file) {
        this._file = _file;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Activity {\n");

        sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
        sb.append("    dueTime: ").append(toIndentedString(dueTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
        sb.append("    leadId: ").append(toIndentedString(leadId)).append("\n");
        sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    publicDescription: ").append(toIndentedString(publicDescription)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    done: ").append(toIndentedString(done)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
        sb.append("    busyFlag: ").append(toIndentedString(busyFlag)).append("\n");
        sb.append("    attendees: ").append(toIndentedString(attendees)).append("\n");
        sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
        sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
        sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
        sb.append("    conferenceMeetingClient: ").append(toIndentedString(conferenceMeetingClient)).append("\n");
        sb.append("    conferenceMeetingUrl: ").append(toIndentedString(conferenceMeetingUrl)).append("\n");
        sb.append("    conferenceMeetingId: ").append(toIndentedString(conferenceMeetingId)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    markedAsDoneTime: ").append(toIndentedString(markedAsDoneTime)).append("\n");
        sb.append("    lastNotificationTime: ").append(toIndentedString(lastNotificationTime)).append("\n");
        sb.append("    lastNotificationUserId: ").append(toIndentedString(lastNotificationUserId)).append("\n");
        sb.append("    notificationLanguageId: ").append(toIndentedString(notificationLanguageId)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateUserId: ").append(toIndentedString(updateUserId)).append("\n");
        sb.append("    gcalEventId: ").append(toIndentedString(gcalEventId)).append("\n");
        sb.append("    googleCalendarId: ").append(toIndentedString(googleCalendarId)).append("\n");
        sb.append("    googleCalendarEtag: ").append(toIndentedString(googleCalendarEtag)).append("\n");
        sb.append("    calendarSyncIncludeContext: ").append(toIndentedString(calendarSyncIncludeContext)).append("\n");
        sb.append("    sourceTimezone: ").append(toIndentedString(sourceTimezone)).append("\n");
        sb.append("    recRule: ").append(toIndentedString(recRule)).append("\n");
        sb.append("    recRuleExtension: ").append(toIndentedString(recRuleExtension)).append("\n");
        sb.append("    recMasterActivityId: ").append(toIndentedString(recMasterActivityId)).append("\n");
        sb.append("    series: ").append(toIndentedString(series)).append("\n");
        sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
        sb.append("    locationSubpremise: ").append(toIndentedString(locationSubpremise)).append("\n");
        sb.append("    locationStreetNumber: ").append(toIndentedString(locationStreetNumber)).append("\n");
        sb.append("    locationRoute: ").append(toIndentedString(locationRoute)).append("\n");
        sb.append("    locationSublocality: ").append(toIndentedString(locationSublocality)).append("\n");
        sb.append("    locationLocality: ").append(toIndentedString(locationLocality)).append("\n");
        sb.append("    locationAdminAreaLevel1: ").append(toIndentedString(locationAdminAreaLevel1)).append("\n");
        sb.append("    locationAdminAreaLevel2: ").append(toIndentedString(locationAdminAreaLevel2)).append("\n");
        sb.append("    locationCountry: ").append(toIndentedString(locationCountry)).append("\n");
        sb.append("    locationPostalCode: ").append(toIndentedString(locationPostalCode)).append("\n");
        sb.append("    locationFormattedAddress: ").append(toIndentedString(locationFormattedAddress)).append("\n");
        sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
        sb.append("    personName: ").append(toIndentedString(personName)).append("\n");
        sb.append("    dealTitle: ").append(toIndentedString(dealTitle)).append("\n");
        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
        sb.append("    personDropboxBcc: ").append(toIndentedString(personDropboxBcc)).append("\n");
        sb.append("    dealDropboxBcc: ").append(toIndentedString(dealDropboxBcc)).append("\n");
        sb.append("    assignedToUserId: ").append(toIndentedString(assignedToUserId)).append("\n");
        sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code Activity} object that
     * contains the same values as this object.
     *
     * @param   obj   the object to compare with.
     * @return  {@code true} if the objects are the same;
     *          {@code false} otherwise.
     **/
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Activity model = (Activity) obj;

        return java.util.Objects.equals(dueDate, model.dueDate) &&
        java.util.Objects.equals(dueTime, model.dueTime) &&
        java.util.Objects.equals(duration, model.duration) &&
        java.util.Objects.equals(dealId, model.dealId) &&
        java.util.Objects.equals(leadId, model.leadId) &&
        java.util.Objects.equals(personId, model.personId) &&
        java.util.Objects.equals(projectId, model.projectId) &&
        java.util.Objects.equals(orgId, model.orgId) &&
        java.util.Objects.equals(location, model.location) &&
        java.util.Objects.equals(publicDescription, model.publicDescription) &&
        java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(note, model.note) &&
        java.util.Objects.equals(done, model.done) &&
        java.util.Objects.equals(subject, model.subject) &&
        java.util.Objects.equals(type, model.type) &&
        java.util.Objects.equals(userId, model.userId) &&
        java.util.Objects.equals(participants, model.participants) &&
        java.util.Objects.equals(busyFlag, model.busyFlag) &&
        java.util.Objects.equals(attendees, model.attendees) &&
        java.util.Objects.equals(companyId, model.companyId) &&
        java.util.Objects.equals(referenceType, model.referenceType) &&
        java.util.Objects.equals(referenceId, model.referenceId) &&
        java.util.Objects.equals(conferenceMeetingClient, model.conferenceMeetingClient) &&
        java.util.Objects.equals(conferenceMeetingUrl, model.conferenceMeetingUrl) &&
        java.util.Objects.equals(conferenceMeetingId, model.conferenceMeetingId) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(markedAsDoneTime, model.markedAsDoneTime) &&
        java.util.Objects.equals(lastNotificationTime, model.lastNotificationTime) &&
        java.util.Objects.equals(lastNotificationUserId, model.lastNotificationUserId) &&
        java.util.Objects.equals(notificationLanguageId, model.notificationLanguageId) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(updateTime, model.updateTime) &&
        java.util.Objects.equals(updateUserId, model.updateUserId) &&
        java.util.Objects.equals(gcalEventId, model.gcalEventId) &&
        java.util.Objects.equals(googleCalendarId, model.googleCalendarId) &&
        java.util.Objects.equals(googleCalendarEtag, model.googleCalendarEtag) &&
        java.util.Objects.equals(calendarSyncIncludeContext, model.calendarSyncIncludeContext) &&
        java.util.Objects.equals(sourceTimezone, model.sourceTimezone) &&
        java.util.Objects.equals(recRule, model.recRule) &&
        java.util.Objects.equals(recRuleExtension, model.recRuleExtension) &&
        java.util.Objects.equals(recMasterActivityId, model.recMasterActivityId) &&
        java.util.Objects.equals(series, model.series) &&
        java.util.Objects.equals(createdByUserId, model.createdByUserId) &&
        java.util.Objects.equals(locationSubpremise, model.locationSubpremise) &&
        java.util.Objects.equals(locationStreetNumber, model.locationStreetNumber) &&
        java.util.Objects.equals(locationRoute, model.locationRoute) &&
        java.util.Objects.equals(locationSublocality, model.locationSublocality) &&
        java.util.Objects.equals(locationLocality, model.locationLocality) &&
        java.util.Objects.equals(locationAdminAreaLevel1, model.locationAdminAreaLevel1) &&
        java.util.Objects.equals(locationAdminAreaLevel2, model.locationAdminAreaLevel2) &&
        java.util.Objects.equals(locationCountry, model.locationCountry) &&
        java.util.Objects.equals(locationPostalCode, model.locationPostalCode) &&
        java.util.Objects.equals(locationFormattedAddress, model.locationFormattedAddress) &&
        java.util.Objects.equals(orgName, model.orgName) &&
        java.util.Objects.equals(personName, model.personName) &&
        java.util.Objects.equals(dealTitle, model.dealTitle) &&
        java.util.Objects.equals(ownerName, model.ownerName) &&
        java.util.Objects.equals(personDropboxBcc, model.personDropboxBcc) &&
        java.util.Objects.equals(dealDropboxBcc, model.dealDropboxBcc) &&
        java.util.Objects.equals(assignedToUserId, model.assignedToUserId) &&
        java.util.Objects.equals(_file, model._file);
    }

    /**
     * Returns a hash code for a {@code Activity}.
     *
     * @return a hash code value for a {@code Activity}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(dueDate,
        dueTime,
        duration,
        dealId,
        leadId,
        personId,
        projectId,
        orgId,
        location,
        publicDescription,
        id,
        note,
        done,
        subject,
        type,
        userId,
        participants,
        busyFlag,
        attendees,
        companyId,
        referenceType,
        referenceId,
        conferenceMeetingClient,
        conferenceMeetingUrl,
        conferenceMeetingId,
        addTime,
        markedAsDoneTime,
        lastNotificationTime,
        lastNotificationUserId,
        notificationLanguageId,
        activeFlag,
        updateTime,
        updateUserId,
        gcalEventId,
        googleCalendarId,
        googleCalendarEtag,
        calendarSyncIncludeContext,
        sourceTimezone,
        recRule,
        recRuleExtension,
        recMasterActivityId,
        series,
        createdByUserId,
        locationSubpremise,
        locationStreetNumber,
        locationRoute,
        locationSublocality,
        locationLocality,
        locationAdminAreaLevel1,
        locationAdminAreaLevel2,
        locationCountry,
        locationPostalCode,
        locationFormattedAddress,
        orgName,
        personName,
        dealTitle,
        ownerName,
        personDropboxBcc,
        dealDropboxBcc,
        assignedToUserId,
        _file);
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private static String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ActivityQueryParam  {

        @jakarta.ws.rs.QueryParam("dueDate")
        private LocalDate dueDate;
        @jakarta.ws.rs.QueryParam("dueTime")
        private String dueTime;
        @jakarta.ws.rs.QueryParam("duration")
        private String duration;
        @jakarta.ws.rs.QueryParam("dealId")
        private Integer dealId;
        @jakarta.ws.rs.QueryParam("leadId")
        private UUID leadId;
        @jakarta.ws.rs.QueryParam("personId")
        private Integer personId;
        @jakarta.ws.rs.QueryParam("projectId")
        private Integer projectId;
        @jakarta.ws.rs.QueryParam("orgId")
        private Integer orgId;
        @jakarta.ws.rs.QueryParam("location")
        private String location;
        @jakarta.ws.rs.QueryParam("publicDescription")
        private String publicDescription;
        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("note")
        private String note;
        @jakarta.ws.rs.QueryParam("done")
        private Boolean done;
        @jakarta.ws.rs.QueryParam("subject")
        private String subject;
        @jakarta.ws.rs.QueryParam("type")
        private String type;
        @jakarta.ws.rs.QueryParam("userId")
        private Integer userId;
        @jakarta.ws.rs.QueryParam("participants")
        private List<Object> participants = null;
        @jakarta.ws.rs.QueryParam("busyFlag")
        private Boolean busyFlag;
        @jakarta.ws.rs.QueryParam("attendees")
        private List<Object> attendees = null;
        @jakarta.ws.rs.QueryParam("companyId")
        private Integer companyId;
        @jakarta.ws.rs.QueryParam("referenceType")
        private String referenceType;
        @jakarta.ws.rs.QueryParam("referenceId")
        private Integer referenceId;
        @jakarta.ws.rs.QueryParam("conferenceMeetingClient")
        private String conferenceMeetingClient;
        @jakarta.ws.rs.QueryParam("conferenceMeetingUrl")
        private String conferenceMeetingUrl;
        @jakarta.ws.rs.QueryParam("conferenceMeetingId")
        private String conferenceMeetingId;
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        @jakarta.ws.rs.QueryParam("markedAsDoneTime")
        private String markedAsDoneTime;
        @jakarta.ws.rs.QueryParam("lastNotificationTime")
        private String lastNotificationTime;
        @jakarta.ws.rs.QueryParam("lastNotificationUserId")
        private Integer lastNotificationUserId;
        @jakarta.ws.rs.QueryParam("notificationLanguageId")
        private Integer notificationLanguageId;
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        @jakarta.ws.rs.QueryParam("updateTime")
        private String updateTime;
        @jakarta.ws.rs.QueryParam("updateUserId")
        private Integer updateUserId;
        @jakarta.ws.rs.QueryParam("gcalEventId")
        private String gcalEventId;
        @jakarta.ws.rs.QueryParam("googleCalendarId")
        private String googleCalendarId;
        @jakarta.ws.rs.QueryParam("googleCalendarEtag")
        private String googleCalendarEtag;
        @jakarta.ws.rs.QueryParam("calendarSyncIncludeContext")
        private String calendarSyncIncludeContext;
        @jakarta.ws.rs.QueryParam("sourceTimezone")
        private String sourceTimezone;
        @jakarta.ws.rs.QueryParam("recRule")
        private String recRule;
        @jakarta.ws.rs.QueryParam("recRuleExtension")
        private String recRuleExtension;
        @jakarta.ws.rs.QueryParam("recMasterActivityId")
        private Integer recMasterActivityId;
        @jakarta.ws.rs.QueryParam("series")
        private List<Object> series = null;
        @jakarta.ws.rs.QueryParam("createdByUserId")
        private Integer createdByUserId;
        @jakarta.ws.rs.QueryParam("locationSubpremise")
        private String locationSubpremise;
        @jakarta.ws.rs.QueryParam("locationStreetNumber")
        private String locationStreetNumber;
        @jakarta.ws.rs.QueryParam("locationRoute")
        private String locationRoute;
        @jakarta.ws.rs.QueryParam("locationSublocality")
        private String locationSublocality;
        @jakarta.ws.rs.QueryParam("locationLocality")
        private String locationLocality;
        @jakarta.ws.rs.QueryParam("locationAdminAreaLevel1")
        private String locationAdminAreaLevel1;
        @jakarta.ws.rs.QueryParam("locationAdminAreaLevel2")
        private String locationAdminAreaLevel2;
        @jakarta.ws.rs.QueryParam("locationCountry")
        private String locationCountry;
        @jakarta.ws.rs.QueryParam("locationPostalCode")
        private String locationPostalCode;
        @jakarta.ws.rs.QueryParam("locationFormattedAddress")
        private String locationFormattedAddress;
        @jakarta.ws.rs.QueryParam("orgName")
        private String orgName;
        @jakarta.ws.rs.QueryParam("personName")
        private String personName;
        @jakarta.ws.rs.QueryParam("dealTitle")
        private String dealTitle;
        @jakarta.ws.rs.QueryParam("ownerName")
        private String ownerName;
        @jakarta.ws.rs.QueryParam("personDropboxBcc")
        private String personDropboxBcc;
        @jakarta.ws.rs.QueryParam("dealDropboxBcc")
        private String dealDropboxBcc;
        @jakarta.ws.rs.QueryParam("assignedToUserId")
        private Integer assignedToUserId;
        @jakarta.ws.rs.QueryParam("_file")
        private Object _file;

        /**
        * The due date of the activity. Format: YYYY-MM-DD
        * @return dueDate
        **/
        @JsonProperty("due_date")
        public LocalDate getDueDate() {
            return dueDate;
        }

        /**
         * Set dueDate
         **/
        public void setDueDate(LocalDate dueDate) {
            this.dueDate = dueDate;
        }

        public ActivityQueryParam dueDate(LocalDate dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        /**
        * The due time of the activity in UTC. Format: HH:MM
        * @return dueTime
        **/
        @JsonProperty("due_time")
        public String getDueTime() {
            return dueTime;
        }

        /**
         * Set dueTime
         **/
        public void setDueTime(String dueTime) {
            this.dueTime = dueTime;
        }

        public ActivityQueryParam dueTime(String dueTime) {
            this.dueTime = dueTime;
            return this;
        }

        /**
        * The duration of the activity. Format: HH:MM
        * @return duration
        **/
        @JsonProperty("duration")
        public String getDuration() {
            return duration;
        }

        /**
         * Set duration
         **/
        public void setDuration(String duration) {
            this.duration = duration;
        }

        public ActivityQueryParam duration(String duration) {
            this.duration = duration;
            return this;
        }

        /**
        * The ID of the deal this activity is associated with
        * @return dealId
        **/
        @JsonProperty("deal_id")
        public Integer getDealId() {
            return dealId;
        }

        /**
         * Set dealId
         **/
        public void setDealId(Integer dealId) {
            this.dealId = dealId;
        }

        public ActivityQueryParam dealId(Integer dealId) {
            this.dealId = dealId;
            return this;
        }

        /**
        * The ID of the lead in the UUID format this activity is associated with
        * @return leadId
        **/
        @JsonProperty("lead_id")
        public UUID getLeadId() {
            return leadId;
        }

        /**
         * Set leadId
         **/
        public void setLeadId(UUID leadId) {
            this.leadId = leadId;
        }

        public ActivityQueryParam leadId(UUID leadId) {
            this.leadId = leadId;
            return this;
        }

        /**
        * The ID of the person this activity is associated with
        * @return personId
        **/
        @JsonProperty("person_id")
        public Integer getPersonId() {
            return personId;
        }

        /**
         * Set personId
         **/
        public void setPersonId(Integer personId) {
            this.personId = personId;
        }

        public ActivityQueryParam personId(Integer personId) {
            this.personId = personId;
            return this;
        }

        /**
        * The ID of the project this activity is associated with
        * @return projectId
        **/
        @JsonProperty("project_id")
        public Integer getProjectId() {
            return projectId;
        }

        /**
         * Set projectId
         **/
        public void setProjectId(Integer projectId) {
            this.projectId = projectId;
        }

        public ActivityQueryParam projectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
        * The ID of the organization this activity is associated with
        * @return orgId
        **/
        @JsonProperty("org_id")
        public Integer getOrgId() {
            return orgId;
        }

        /**
         * Set orgId
         **/
        public void setOrgId(Integer orgId) {
            this.orgId = orgId;
        }

        public ActivityQueryParam orgId(Integer orgId) {
            this.orgId = orgId;
            return this;
        }

        /**
        * The address of the activity.
        * @return location
        **/
        @JsonProperty("location")
        public String getLocation() {
            return location;
        }

        /**
         * Set location
         **/
        public void setLocation(String location) {
            this.location = location;
        }

        public ActivityQueryParam location(String location) {
            this.location = location;
            return this;
        }

        /**
        * Additional details about the activity that is synced to your external calendar. Unlike the note added to the activity, the description is publicly visible to any guests added to the activity.
        * @return publicDescription
        **/
        @JsonProperty("public_description")
        public String getPublicDescription() {
            return publicDescription;
        }

        /**
         * Set publicDescription
         **/
        public void setPublicDescription(String publicDescription) {
            this.publicDescription = publicDescription;
        }

        public ActivityQueryParam publicDescription(String publicDescription) {
            this.publicDescription = publicDescription;
            return this;
        }

        /**
        * The ID of the activity, generated when the activity was created
        * @return id
        **/
        @JsonProperty("id")
        public Integer getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(Integer id) {
            this.id = id;
        }

        public ActivityQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The note of the activity (HTML format)
        * @return note
        **/
        @JsonProperty("note")
        public String getNote() {
            return note;
        }

        /**
         * Set note
         **/
        public void setNote(String note) {
            this.note = note;
        }

        public ActivityQueryParam note(String note) {
            this.note = note;
            return this;
        }

        /**
        * Whether the activity is done or not
        * @return done
        **/
        @JsonProperty("done")
        public Boolean getDone() {
            return done;
        }

        /**
         * Set done
         **/
        public void setDone(Boolean done) {
            this.done = done;
        }

        public ActivityQueryParam done(Boolean done) {
            this.done = done;
            return this;
        }

        /**
        * The subject of the activity
        * @return subject
        **/
        @JsonProperty("subject")
        public String getSubject() {
            return subject;
        }

        /**
         * Set subject
         **/
        public void setSubject(String subject) {
            this.subject = subject;
        }

        public ActivityQueryParam subject(String subject) {
            this.subject = subject;
            return this;
        }

        /**
        * The type of the activity. This is in correlation with the `key_string` parameter of ActivityTypes.
        * @return type
        **/
        @JsonProperty("type")
        public String getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(String type) {
            this.type = type;
        }

        public ActivityQueryParam type(String type) {
            this.type = type;
            return this;
        }

        /**
        * The ID of the user whom the activity is assigned to
        * @return userId
        **/
        @JsonProperty("user_id")
        public Integer getUserId() {
            return userId;
        }

        /**
         * Set userId
         **/
        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public ActivityQueryParam userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        /**
        * List of multiple persons (participants) this activity is associated with
        * @return participants
        **/
        @JsonProperty("participants")
        public List<Object> getParticipants() {
            return participants;
        }

        /**
         * Set participants
         **/
        public void setParticipants(List<Object> participants) {
            this.participants = participants;
        }

        public ActivityQueryParam participants(List<Object> participants) {
            this.participants = participants;
            return this;
        }
        public ActivityQueryParam addParticipantsItem(Object participantsItem) {
            this.participants.add(participantsItem);
            return this;
        }

        /**
        * Marks if the activity is set as 'Busy' or 'Free'. If the flag is set to `true`, your customers will not be able to book that time slot through any Scheduler links. The flag can also be unset. When the value of the flag is unset (`null`), the flag defaults to 'Busy' if it has a time set, and 'Free' if it is an all-day event without specified time.
        * @return busyFlag
        **/
        @JsonProperty("busy_flag")
        public Boolean getBusyFlag() {
            return busyFlag;
        }

        /**
         * Set busyFlag
         **/
        public void setBusyFlag(Boolean busyFlag) {
            this.busyFlag = busyFlag;
        }

        public ActivityQueryParam busyFlag(Boolean busyFlag) {
            this.busyFlag = busyFlag;
            return this;
        }

        /**
        * The attendees of the activity. This can be either your existing Pipedrive contacts or an external email address.
        * @return attendees
        **/
        @JsonProperty("attendees")
        public List<Object> getAttendees() {
            return attendees;
        }

        /**
         * Set attendees
         **/
        public void setAttendees(List<Object> attendees) {
            this.attendees = attendees;
        }

        public ActivityQueryParam attendees(List<Object> attendees) {
            this.attendees = attendees;
            return this;
        }
        public ActivityQueryParam addAttendeesItem(Object attendeesItem) {
            this.attendees.add(attendeesItem);
            return this;
        }

        /**
        * The user's company ID
        * @return companyId
        **/
        @JsonProperty("company_id")
        public Integer getCompanyId() {
            return companyId;
        }

        /**
         * Set companyId
         **/
        public void setCompanyId(Integer companyId) {
            this.companyId = companyId;
        }

        public ActivityQueryParam companyId(Integer companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
        * If the activity references some other object, it is indicated here. For example, value `Salesphone` refers to activities created with Caller.
        * @return referenceType
        **/
        @JsonProperty("reference_type")
        public String getReferenceType() {
            return referenceType;
        }

        /**
         * Set referenceType
         **/
        public void setReferenceType(String referenceType) {
            this.referenceType = referenceType;
        }

        public ActivityQueryParam referenceType(String referenceType) {
            this.referenceType = referenceType;
            return this;
        }

        /**
        * Together with the `reference_type`, gives the ID of the other object
        * @return referenceId
        **/
        @JsonProperty("reference_id")
        public Integer getReferenceId() {
            return referenceId;
        }

        /**
         * Set referenceId
         **/
        public void setReferenceId(Integer referenceId) {
            this.referenceId = referenceId;
        }

        public ActivityQueryParam referenceId(Integer referenceId) {
            this.referenceId = referenceId;
            return this;
        }

        /**
        * The ID of the Marketplace app, which is connected to this activity
        * @return conferenceMeetingClient
        **/
        @JsonProperty("conference_meeting_client")
        public String getConferenceMeetingClient() {
            return conferenceMeetingClient;
        }

        /**
         * Set conferenceMeetingClient
         **/
        public void setConferenceMeetingClient(String conferenceMeetingClient) {
            this.conferenceMeetingClient = conferenceMeetingClient;
        }

        public ActivityQueryParam conferenceMeetingClient(String conferenceMeetingClient) {
            this.conferenceMeetingClient = conferenceMeetingClient;
            return this;
        }

        /**
        * The link to join the meeting which is associated with this activity
        * @return conferenceMeetingUrl
        **/
        @JsonProperty("conference_meeting_url")
        public String getConferenceMeetingUrl() {
            return conferenceMeetingUrl;
        }

        /**
         * Set conferenceMeetingUrl
         **/
        public void setConferenceMeetingUrl(String conferenceMeetingUrl) {
            this.conferenceMeetingUrl = conferenceMeetingUrl;
        }

        public ActivityQueryParam conferenceMeetingUrl(String conferenceMeetingUrl) {
            this.conferenceMeetingUrl = conferenceMeetingUrl;
            return this;
        }

        /**
        * The meeting ID of the meeting provider (Zoom, MS Teams etc.) that is associated with this activity
        * @return conferenceMeetingId
        **/
        @JsonProperty("conference_meeting_id")
        public String getConferenceMeetingId() {
            return conferenceMeetingId;
        }

        /**
         * Set conferenceMeetingId
         **/
        public void setConferenceMeetingId(String conferenceMeetingId) {
            this.conferenceMeetingId = conferenceMeetingId;
        }

        public ActivityQueryParam conferenceMeetingId(String conferenceMeetingId) {
            this.conferenceMeetingId = conferenceMeetingId;
            return this;
        }

        /**
        * The creation date and time of the activity in UTC. Format: YYYY-MM-DD HH:MM:SS.
        * @return addTime
        **/
        @JsonProperty("add_time")
        public String getAddTime() {
            return addTime;
        }

        /**
         * Set addTime
         **/
        public void setAddTime(String addTime) {
            this.addTime = addTime;
        }

        public ActivityQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The date and time this activity was marked as done. Format: YYYY-MM-DD HH:MM:SS.
        * @return markedAsDoneTime
        **/
        @JsonProperty("marked_as_done_time")
        public String getMarkedAsDoneTime() {
            return markedAsDoneTime;
        }

        /**
         * Set markedAsDoneTime
         **/
        public void setMarkedAsDoneTime(String markedAsDoneTime) {
            this.markedAsDoneTime = markedAsDoneTime;
        }

        public ActivityQueryParam markedAsDoneTime(String markedAsDoneTime) {
            this.markedAsDoneTime = markedAsDoneTime;
            return this;
        }

        /**
        * The date and time of latest notifications sent about this activity to the participants or the attendees of this activity
        * @return lastNotificationTime
        **/
        @JsonProperty("last_notification_time")
        public String getLastNotificationTime() {
            return lastNotificationTime;
        }

        /**
         * Set lastNotificationTime
         **/
        public void setLastNotificationTime(String lastNotificationTime) {
            this.lastNotificationTime = lastNotificationTime;
        }

        public ActivityQueryParam lastNotificationTime(String lastNotificationTime) {
            this.lastNotificationTime = lastNotificationTime;
            return this;
        }

        /**
        * The ID of the user who triggered the sending of the latest notifications about this activity to the participants or the attendees of this activity
        * @return lastNotificationUserId
        **/
        @JsonProperty("last_notification_user_id")
        public Integer getLastNotificationUserId() {
            return lastNotificationUserId;
        }

        /**
         * Set lastNotificationUserId
         **/
        public void setLastNotificationUserId(Integer lastNotificationUserId) {
            this.lastNotificationUserId = lastNotificationUserId;
        }

        public ActivityQueryParam lastNotificationUserId(Integer lastNotificationUserId) {
            this.lastNotificationUserId = lastNotificationUserId;
            return this;
        }

        /**
        * The ID of the language the notifications are sent in
        * @return notificationLanguageId
        **/
        @JsonProperty("notification_language_id")
        public Integer getNotificationLanguageId() {
            return notificationLanguageId;
        }

        /**
         * Set notificationLanguageId
         **/
        public void setNotificationLanguageId(Integer notificationLanguageId) {
            this.notificationLanguageId = notificationLanguageId;
        }

        public ActivityQueryParam notificationLanguageId(Integer notificationLanguageId) {
            this.notificationLanguageId = notificationLanguageId;
            return this;
        }

        /**
        * Whether the activity is active or not
        * @return activeFlag
        **/
        @JsonProperty("active_flag")
        public Boolean getActiveFlag() {
            return activeFlag;
        }

        /**
         * Set activeFlag
         **/
        public void setActiveFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
        }

        public ActivityQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * The last update date and time of the activity. Format: YYYY-MM-DD HH:MM:SS.
        * @return updateTime
        **/
        @JsonProperty("update_time")
        public String getUpdateTime() {
            return updateTime;
        }

        /**
         * Set updateTime
         **/
        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public ActivityQueryParam updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
        * The ID of the user who was the last to update this activity
        * @return updateUserId
        **/
        @JsonProperty("update_user_id")
        public Integer getUpdateUserId() {
            return updateUserId;
        }

        /**
         * Set updateUserId
         **/
        public void setUpdateUserId(Integer updateUserId) {
            this.updateUserId = updateUserId;
        }

        public ActivityQueryParam updateUserId(Integer updateUserId) {
            this.updateUserId = updateUserId;
            return this;
        }

        /**
        * For the activity which syncs to Google calendar, this is the Google event ID. NB! This field is related to old Google calendar sync and will be deprecated soon.
        * @return gcalEventId
        **/
        @JsonProperty("gcal_event_id")
        public String getGcalEventId() {
            return gcalEventId;
        }

        /**
         * Set gcalEventId
         **/
        public void setGcalEventId(String gcalEventId) {
            this.gcalEventId = gcalEventId;
        }

        public ActivityQueryParam gcalEventId(String gcalEventId) {
            this.gcalEventId = gcalEventId;
            return this;
        }

        /**
        * The Google calendar ID that this activity syncs to. NB! This field is related to old Google calendar sync and will be deprecated soon.
        * @return googleCalendarId
        **/
        @JsonProperty("google_calendar_id")
        public String getGoogleCalendarId() {
            return googleCalendarId;
        }

        /**
         * Set googleCalendarId
         **/
        public void setGoogleCalendarId(String googleCalendarId) {
            this.googleCalendarId = googleCalendarId;
        }

        public ActivityQueryParam googleCalendarId(String googleCalendarId) {
            this.googleCalendarId = googleCalendarId;
            return this;
        }

        /**
        * The Google calendar API etag (version) that is used for syncing this activity. NB! This field is related to old Google calendar sync and will be deprecated soon.
        * @return googleCalendarEtag
        **/
        @JsonProperty("google_calendar_etag")
        public String getGoogleCalendarEtag() {
            return googleCalendarEtag;
        }

        /**
         * Set googleCalendarEtag
         **/
        public void setGoogleCalendarEtag(String googleCalendarEtag) {
            this.googleCalendarEtag = googleCalendarEtag;
        }

        public ActivityQueryParam googleCalendarEtag(String googleCalendarEtag) {
            this.googleCalendarEtag = googleCalendarEtag;
            return this;
        }

        /**
        * For activities that sync to an external calendar, this setting indicates if the activity syncs with context (what are the deals, persons, organizations this activity is related to)
        * @return calendarSyncIncludeContext
        **/
        @JsonProperty("calendar_sync_include_context")
        public String getCalendarSyncIncludeContext() {
            return calendarSyncIncludeContext;
        }

        /**
         * Set calendarSyncIncludeContext
         **/
        public void setCalendarSyncIncludeContext(String calendarSyncIncludeContext) {
            this.calendarSyncIncludeContext = calendarSyncIncludeContext;
        }

        public ActivityQueryParam calendarSyncIncludeContext(String calendarSyncIncludeContext) {
            this.calendarSyncIncludeContext = calendarSyncIncludeContext;
            return this;
        }

        /**
        * The timezone the activity was created in an external calendar
        * @return sourceTimezone
        **/
        @JsonProperty("source_timezone")
        public String getSourceTimezone() {
            return sourceTimezone;
        }

        /**
         * Set sourceTimezone
         **/
        public void setSourceTimezone(String sourceTimezone) {
            this.sourceTimezone = sourceTimezone;
        }

        public ActivityQueryParam sourceTimezone(String sourceTimezone) {
            this.sourceTimezone = sourceTimezone;
            return this;
        }

        /**
        * The rule for the recurrence of the activity. Is important for activities synced into Pipedrive from an external calendar. Example: \"RRULE:FREQ=WEEKLY;BYDAY=WE\"
        * @return recRule
        **/
        @JsonProperty("rec_rule")
        public String getRecRule() {
            return recRule;
        }

        /**
         * Set recRule
         **/
        public void setRecRule(String recRule) {
            this.recRule = recRule;
        }

        public ActivityQueryParam recRule(String recRule) {
            this.recRule = recRule;
            return this;
        }

        /**
        * Additional rules for the recurrence of the activity, extend the `rec_rule`. Is important for activities synced into Pipedrive from an external calendar.
        * @return recRuleExtension
        **/
        @JsonProperty("rec_rule_extension")
        public String getRecRuleExtension() {
            return recRuleExtension;
        }

        /**
         * Set recRuleExtension
         **/
        public void setRecRuleExtension(String recRuleExtension) {
            this.recRuleExtension = recRuleExtension;
        }

        public ActivityQueryParam recRuleExtension(String recRuleExtension) {
            this.recRuleExtension = recRuleExtension;
            return this;
        }

        /**
        * The ID of parent activity for a recurrent activity if the current activity is an exception to recurrence rules
        * @return recMasterActivityId
        **/
        @JsonProperty("rec_master_activity_id")
        public Integer getRecMasterActivityId() {
            return recMasterActivityId;
        }

        /**
         * Set recMasterActivityId
         **/
        public void setRecMasterActivityId(Integer recMasterActivityId) {
            this.recMasterActivityId = recMasterActivityId;
        }

        public ActivityQueryParam recMasterActivityId(Integer recMasterActivityId) {
            this.recMasterActivityId = recMasterActivityId;
            return this;
        }

        /**
        * The list of recurring activity instances. It is in a structure as follows: `[{due_date: \"2020-06-24\", due_time: \"10:00:00\"}]`
        * @return series
        **/
        @JsonProperty("series")
        public List<Object> getSeries() {
            return series;
        }

        /**
         * Set series
         **/
        public void setSeries(List<Object> series) {
            this.series = series;
        }

        public ActivityQueryParam series(List<Object> series) {
            this.series = series;
            return this;
        }
        public ActivityQueryParam addSeriesItem(Object seriesItem) {
            this.series.add(seriesItem);
            return this;
        }

        /**
        * The ID of the user who created the activity
        * @return createdByUserId
        **/
        @JsonProperty("created_by_user_id")
        public Integer getCreatedByUserId() {
            return createdByUserId;
        }

        /**
         * Set createdByUserId
         **/
        public void setCreatedByUserId(Integer createdByUserId) {
            this.createdByUserId = createdByUserId;
        }

        public ActivityQueryParam createdByUserId(Integer createdByUserId) {
            this.createdByUserId = createdByUserId;
            return this;
        }

        /**
        * A subfield of the location field. Indicates apartment/suite number.
        * @return locationSubpremise
        **/
        @JsonProperty("location_subpremise")
        public String getLocationSubpremise() {
            return locationSubpremise;
        }

        /**
         * Set locationSubpremise
         **/
        public void setLocationSubpremise(String locationSubpremise) {
            this.locationSubpremise = locationSubpremise;
        }

        public ActivityQueryParam locationSubpremise(String locationSubpremise) {
            this.locationSubpremise = locationSubpremise;
            return this;
        }

        /**
        * A subfield of the location field. Indicates house number.
        * @return locationStreetNumber
        **/
        @JsonProperty("location_street_number")
        public String getLocationStreetNumber() {
            return locationStreetNumber;
        }

        /**
         * Set locationStreetNumber
         **/
        public void setLocationStreetNumber(String locationStreetNumber) {
            this.locationStreetNumber = locationStreetNumber;
        }

        public ActivityQueryParam locationStreetNumber(String locationStreetNumber) {
            this.locationStreetNumber = locationStreetNumber;
            return this;
        }

        /**
        * A subfield of the location field. Indicates street name.
        * @return locationRoute
        **/
        @JsonProperty("location_route")
        public String getLocationRoute() {
            return locationRoute;
        }

        /**
         * Set locationRoute
         **/
        public void setLocationRoute(String locationRoute) {
            this.locationRoute = locationRoute;
        }

        public ActivityQueryParam locationRoute(String locationRoute) {
            this.locationRoute = locationRoute;
            return this;
        }

        /**
        * A subfield of the location field. Indicates district/sublocality.
        * @return locationSublocality
        **/
        @JsonProperty("location_sublocality")
        public String getLocationSublocality() {
            return locationSublocality;
        }

        /**
         * Set locationSublocality
         **/
        public void setLocationSublocality(String locationSublocality) {
            this.locationSublocality = locationSublocality;
        }

        public ActivityQueryParam locationSublocality(String locationSublocality) {
            this.locationSublocality = locationSublocality;
            return this;
        }

        /**
        * A subfield of the location field. Indicates city/town/village/locality.
        * @return locationLocality
        **/
        @JsonProperty("location_locality")
        public String getLocationLocality() {
            return locationLocality;
        }

        /**
         * Set locationLocality
         **/
        public void setLocationLocality(String locationLocality) {
            this.locationLocality = locationLocality;
        }

        public ActivityQueryParam locationLocality(String locationLocality) {
            this.locationLocality = locationLocality;
            return this;
        }

        /**
        * A subfield of the location field. Indicates state/county.
        * @return locationAdminAreaLevel1
        **/
        @JsonProperty("location_admin_area_level_1")
        public String getLocationAdminAreaLevel1() {
            return locationAdminAreaLevel1;
        }

        /**
         * Set locationAdminAreaLevel1
         **/
        public void setLocationAdminAreaLevel1(String locationAdminAreaLevel1) {
            this.locationAdminAreaLevel1 = locationAdminAreaLevel1;
        }

        public ActivityQueryParam locationAdminAreaLevel1(String locationAdminAreaLevel1) {
            this.locationAdminAreaLevel1 = locationAdminAreaLevel1;
            return this;
        }

        /**
        * A subfield of the location field. Indicates region.
        * @return locationAdminAreaLevel2
        **/
        @JsonProperty("location_admin_area_level_2")
        public String getLocationAdminAreaLevel2() {
            return locationAdminAreaLevel2;
        }

        /**
         * Set locationAdminAreaLevel2
         **/
        public void setLocationAdminAreaLevel2(String locationAdminAreaLevel2) {
            this.locationAdminAreaLevel2 = locationAdminAreaLevel2;
        }

        public ActivityQueryParam locationAdminAreaLevel2(String locationAdminAreaLevel2) {
            this.locationAdminAreaLevel2 = locationAdminAreaLevel2;
            return this;
        }

        /**
        * A subfield of the location field. Indicates country.
        * @return locationCountry
        **/
        @JsonProperty("location_country")
        public String getLocationCountry() {
            return locationCountry;
        }

        /**
         * Set locationCountry
         **/
        public void setLocationCountry(String locationCountry) {
            this.locationCountry = locationCountry;
        }

        public ActivityQueryParam locationCountry(String locationCountry) {
            this.locationCountry = locationCountry;
            return this;
        }

        /**
        * A subfield of the location field. Indicates ZIP/postal code.
        * @return locationPostalCode
        **/
        @JsonProperty("location_postal_code")
        public String getLocationPostalCode() {
            return locationPostalCode;
        }

        /**
         * Set locationPostalCode
         **/
        public void setLocationPostalCode(String locationPostalCode) {
            this.locationPostalCode = locationPostalCode;
        }

        public ActivityQueryParam locationPostalCode(String locationPostalCode) {
            this.locationPostalCode = locationPostalCode;
            return this;
        }

        /**
        * A subfield of the location field. Indicates full/combined address.
        * @return locationFormattedAddress
        **/
        @JsonProperty("location_formatted_address")
        public String getLocationFormattedAddress() {
            return locationFormattedAddress;
        }

        /**
         * Set locationFormattedAddress
         **/
        public void setLocationFormattedAddress(String locationFormattedAddress) {
            this.locationFormattedAddress = locationFormattedAddress;
        }

        public ActivityQueryParam locationFormattedAddress(String locationFormattedAddress) {
            this.locationFormattedAddress = locationFormattedAddress;
            return this;
        }

        /**
        * The name of the organization this activity is associated with
        * @return orgName
        **/
        @JsonProperty("org_name")
        public String getOrgName() {
            return orgName;
        }

        /**
         * Set orgName
         **/
        public void setOrgName(String orgName) {
            this.orgName = orgName;
        }

        public ActivityQueryParam orgName(String orgName) {
            this.orgName = orgName;
            return this;
        }

        /**
        * The name of the person this activity is associated with
        * @return personName
        **/
        @JsonProperty("person_name")
        public String getPersonName() {
            return personName;
        }

        /**
         * Set personName
         **/
        public void setPersonName(String personName) {
            this.personName = personName;
        }

        public ActivityQueryParam personName(String personName) {
            this.personName = personName;
            return this;
        }

        /**
        * The name of the deal this activity is associated with
        * @return dealTitle
        **/
        @JsonProperty("deal_title")
        public String getDealTitle() {
            return dealTitle;
        }

        /**
         * Set dealTitle
         **/
        public void setDealTitle(String dealTitle) {
            this.dealTitle = dealTitle;
        }

        public ActivityQueryParam dealTitle(String dealTitle) {
            this.dealTitle = dealTitle;
            return this;
        }

        /**
        * The name of the user this activity is owned by
        * @return ownerName
        **/
        @JsonProperty("owner_name")
        public String getOwnerName() {
            return ownerName;
        }

        /**
         * Set ownerName
         **/
        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }

        public ActivityQueryParam ownerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }

        /**
        * The BCC email address of the person
        * @return personDropboxBcc
        **/
        @JsonProperty("person_dropbox_bcc")
        public String getPersonDropboxBcc() {
            return personDropboxBcc;
        }

        /**
         * Set personDropboxBcc
         **/
        public void setPersonDropboxBcc(String personDropboxBcc) {
            this.personDropboxBcc = personDropboxBcc;
        }

        public ActivityQueryParam personDropboxBcc(String personDropboxBcc) {
            this.personDropboxBcc = personDropboxBcc;
            return this;
        }

        /**
        * The BCC email address of the deal
        * @return dealDropboxBcc
        **/
        @JsonProperty("deal_dropbox_bcc")
        public String getDealDropboxBcc() {
            return dealDropboxBcc;
        }

        /**
         * Set dealDropboxBcc
         **/
        public void setDealDropboxBcc(String dealDropboxBcc) {
            this.dealDropboxBcc = dealDropboxBcc;
        }

        public ActivityQueryParam dealDropboxBcc(String dealDropboxBcc) {
            this.dealDropboxBcc = dealDropboxBcc;
            return this;
        }

        /**
        * The ID of the user to whom the activity is assigned to. Equal to `user_id`.
        * @return assignedToUserId
        **/
        @JsonProperty("assigned_to_user_id")
        public Integer getAssignedToUserId() {
            return assignedToUserId;
        }

        /**
         * Set assignedToUserId
         **/
        public void setAssignedToUserId(Integer assignedToUserId) {
            this.assignedToUserId = assignedToUserId;
        }

        public ActivityQueryParam assignedToUserId(Integer assignedToUserId) {
            this.assignedToUserId = assignedToUserId;
            return this;
        }

        /**
        * The file that is attached to this activity. For example, this can be a reference to an audio note file generated with Pipedrive mobile app.
        * @return _file
        **/
        @JsonProperty("file")
        public Object getFile() {
            return _file;
        }

        /**
         * Set _file
         **/
        public void setFile(Object _file) {
            this._file = _file;
        }

        public ActivityQueryParam _file(Object _file) {
            this._file = _file;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ActivityQueryParam {\n");

            sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
            sb.append("    dueTime: ").append(toIndentedString(dueTime)).append("\n");
            sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
            sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
            sb.append("    leadId: ").append(toIndentedString(leadId)).append("\n");
            sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
            sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
            sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
            sb.append("    location: ").append(toIndentedString(location)).append("\n");
            sb.append("    publicDescription: ").append(toIndentedString(publicDescription)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    note: ").append(toIndentedString(note)).append("\n");
            sb.append("    done: ").append(toIndentedString(done)).append("\n");
            sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
            sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
            sb.append("    busyFlag: ").append(toIndentedString(busyFlag)).append("\n");
            sb.append("    attendees: ").append(toIndentedString(attendees)).append("\n");
            sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
            sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
            sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
            sb.append("    conferenceMeetingClient: ").append(toIndentedString(conferenceMeetingClient)).append("\n");
            sb.append("    conferenceMeetingUrl: ").append(toIndentedString(conferenceMeetingUrl)).append("\n");
            sb.append("    conferenceMeetingId: ").append(toIndentedString(conferenceMeetingId)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    markedAsDoneTime: ").append(toIndentedString(markedAsDoneTime)).append("\n");
            sb.append("    lastNotificationTime: ").append(toIndentedString(lastNotificationTime)).append("\n");
            sb.append("    lastNotificationUserId: ").append(toIndentedString(lastNotificationUserId)).append("\n");
            sb.append("    notificationLanguageId: ").append(toIndentedString(notificationLanguageId)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
            sb.append("    updateUserId: ").append(toIndentedString(updateUserId)).append("\n");
            sb.append("    gcalEventId: ").append(toIndentedString(gcalEventId)).append("\n");
            sb.append("    googleCalendarId: ").append(toIndentedString(googleCalendarId)).append("\n");
            sb.append("    googleCalendarEtag: ").append(toIndentedString(googleCalendarEtag)).append("\n");
            sb.append("    calendarSyncIncludeContext: ").append(toIndentedString(calendarSyncIncludeContext)).append("\n");
            sb.append("    sourceTimezone: ").append(toIndentedString(sourceTimezone)).append("\n");
            sb.append("    recRule: ").append(toIndentedString(recRule)).append("\n");
            sb.append("    recRuleExtension: ").append(toIndentedString(recRuleExtension)).append("\n");
            sb.append("    recMasterActivityId: ").append(toIndentedString(recMasterActivityId)).append("\n");
            sb.append("    series: ").append(toIndentedString(series)).append("\n");
            sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
            sb.append("    locationSubpremise: ").append(toIndentedString(locationSubpremise)).append("\n");
            sb.append("    locationStreetNumber: ").append(toIndentedString(locationStreetNumber)).append("\n");
            sb.append("    locationRoute: ").append(toIndentedString(locationRoute)).append("\n");
            sb.append("    locationSublocality: ").append(toIndentedString(locationSublocality)).append("\n");
            sb.append("    locationLocality: ").append(toIndentedString(locationLocality)).append("\n");
            sb.append("    locationAdminAreaLevel1: ").append(toIndentedString(locationAdminAreaLevel1)).append("\n");
            sb.append("    locationAdminAreaLevel2: ").append(toIndentedString(locationAdminAreaLevel2)).append("\n");
            sb.append("    locationCountry: ").append(toIndentedString(locationCountry)).append("\n");
            sb.append("    locationPostalCode: ").append(toIndentedString(locationPostalCode)).append("\n");
            sb.append("    locationFormattedAddress: ").append(toIndentedString(locationFormattedAddress)).append("\n");
            sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
            sb.append("    personName: ").append(toIndentedString(personName)).append("\n");
            sb.append("    dealTitle: ").append(toIndentedString(dealTitle)).append("\n");
            sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
            sb.append("    personDropboxBcc: ").append(toIndentedString(personDropboxBcc)).append("\n");
            sb.append("    dealDropboxBcc: ").append(toIndentedString(dealDropboxBcc)).append("\n");
            sb.append("    assignedToUserId: ").append(toIndentedString(assignedToUserId)).append("\n");
            sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
            sb.append("}");
            return sb.toString();
        }

        /**
         * Convert the given object to string with each line indented by 4 spaces
         * (except the first line).
         */
        private static String toIndentedString(Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }
    }}
