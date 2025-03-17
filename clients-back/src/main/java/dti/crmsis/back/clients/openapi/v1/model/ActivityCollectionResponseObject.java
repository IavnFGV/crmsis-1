package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class ActivityCollectionResponseObject  {

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
      * Marks if the activity is set as 'Busy' or 'Free'. If the flag is set to `true`, your customers will not be able to book that time slot through any Scheduler links. The flag can also be unset. When the value of the flag is unset (`null`), the flag defaults to 'Busy' if it has a time set, and 'Free' if it is an all-day event without specified time.
     **/
    private Boolean busyFlag;
    /**
      * The user's company ID
     **/
    private Integer companyId;
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
      * The timezone the activity was created in an external calendar
     **/
    private String sourceTimezone;
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
    * The due date of the activity. Format: YYYY-MM-DD
    * @return dueDate
    **/
    @JsonProperty("due_date")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public LocalDate getDueDate() {
        return dueDate;
    }

    /**
     * Set dueDate
     **/
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public ActivityCollectionResponseObject dueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
    * The due time of the activity in UTC. Format: HH:MM
    * @return dueTime
    **/
    @JsonProperty("due_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDueTime() {
        return dueTime;
    }

    /**
     * Set dueTime
     **/
    public void setDueTime(String dueTime) {
        this.dueTime = dueTime;
    }

    public ActivityCollectionResponseObject dueTime(String dueTime) {
        this.dueTime = dueTime;
        return this;
    }

    /**
    * The duration of the activity. Format: HH:MM
    * @return duration
    **/
    @JsonProperty("duration")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDuration() {
        return duration;
    }

    /**
     * Set duration
     **/
    public void setDuration(String duration) {
        this.duration = duration;
    }

    public ActivityCollectionResponseObject duration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
    * The ID of the deal this activity is associated with
    * @return dealId
    **/
    @JsonProperty("deal_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getDealId() {
        return dealId;
    }

    /**
     * Set dealId
     **/
    public void setDealId(Integer dealId) {
        this.dealId = dealId;
    }

    public ActivityCollectionResponseObject dealId(Integer dealId) {
        this.dealId = dealId;
        return this;
    }

    /**
    * The ID of the lead in the UUID format this activity is associated with
    * @return leadId
    **/
    @JsonProperty("lead_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public UUID getLeadId() {
        return leadId;
    }

    /**
     * Set leadId
     **/
    public void setLeadId(UUID leadId) {
        this.leadId = leadId;
    }

    public ActivityCollectionResponseObject leadId(UUID leadId) {
        this.leadId = leadId;
        return this;
    }

    /**
    * The ID of the person this activity is associated with
    * @return personId
    **/
    @JsonProperty("person_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getPersonId() {
        return personId;
    }

    /**
     * Set personId
     **/
    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public ActivityCollectionResponseObject personId(Integer personId) {
        this.personId = personId;
        return this;
    }

    /**
    * The ID of the project this activity is associated with
    * @return projectId
    **/
    @JsonProperty("project_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * Set projectId
     **/
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public ActivityCollectionResponseObject projectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
    * The ID of the organization this activity is associated with
    * @return orgId
    **/
    @JsonProperty("org_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * Set orgId
     **/
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public ActivityCollectionResponseObject orgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }

    /**
    * The address of the activity.
    * @return location
    **/
    @JsonProperty("location")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLocation() {
        return location;
    }

    /**
     * Set location
     **/
    public void setLocation(String location) {
        this.location = location;
    }

    public ActivityCollectionResponseObject location(String location) {
        this.location = location;
        return this;
    }

    /**
    * Additional details about the activity that is synced to your external calendar. Unlike the note added to the activity, the description is publicly visible to any guests added to the activity.
    * @return publicDescription
    **/
    @JsonProperty("public_description")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPublicDescription() {
        return publicDescription;
    }

    /**
     * Set publicDescription
     **/
    public void setPublicDescription(String publicDescription) {
        this.publicDescription = publicDescription;
    }

    public ActivityCollectionResponseObject publicDescription(String publicDescription) {
        this.publicDescription = publicDescription;
        return this;
    }

    /**
    * The ID of the activity, generated when the activity was created
    * @return id
    **/
    @JsonProperty("id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(Integer id) {
        this.id = id;
    }

    public ActivityCollectionResponseObject id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * Whether the activity is done or not
    * @return done
    **/
    @JsonProperty("done")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getDone() {
        return done;
    }

    /**
     * Set done
     **/
    public void setDone(Boolean done) {
        this.done = done;
    }

    public ActivityCollectionResponseObject done(Boolean done) {
        this.done = done;
        return this;
    }

    /**
    * The subject of the activity
    * @return subject
    **/
    @JsonProperty("subject")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getSubject() {
        return subject;
    }

    /**
     * Set subject
     **/
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ActivityCollectionResponseObject subject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
    * The type of the activity. This is in correlation with the `key_string` parameter of ActivityTypes.
    * @return type
    **/
    @JsonProperty("type")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(String type) {
        this.type = type;
    }

    public ActivityCollectionResponseObject type(String type) {
        this.type = type;
        return this;
    }

    /**
    * The ID of the user whom the activity is assigned to
    * @return userId
    **/
    @JsonProperty("user_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getUserId() {
        return userId;
    }

    /**
     * Set userId
     **/
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public ActivityCollectionResponseObject userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
    * Marks if the activity is set as 'Busy' or 'Free'. If the flag is set to `true`, your customers will not be able to book that time slot through any Scheduler links. The flag can also be unset. When the value of the flag is unset (`null`), the flag defaults to 'Busy' if it has a time set, and 'Free' if it is an all-day event without specified time.
    * @return busyFlag
    **/
    @JsonProperty("busy_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getBusyFlag() {
        return busyFlag;
    }

    /**
     * Set busyFlag
     **/
    public void setBusyFlag(Boolean busyFlag) {
        this.busyFlag = busyFlag;
    }

    public ActivityCollectionResponseObject busyFlag(Boolean busyFlag) {
        this.busyFlag = busyFlag;
        return this;
    }

    /**
    * The user's company ID
    * @return companyId
    **/
    @JsonProperty("company_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * Set companyId
     **/
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public ActivityCollectionResponseObject companyId(Integer companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
    * The ID of the Marketplace app, which is connected to this activity
    * @return conferenceMeetingClient
    **/
    @JsonProperty("conference_meeting_client")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getConferenceMeetingClient() {
        return conferenceMeetingClient;
    }

    /**
     * Set conferenceMeetingClient
     **/
    public void setConferenceMeetingClient(String conferenceMeetingClient) {
        this.conferenceMeetingClient = conferenceMeetingClient;
    }

    public ActivityCollectionResponseObject conferenceMeetingClient(String conferenceMeetingClient) {
        this.conferenceMeetingClient = conferenceMeetingClient;
        return this;
    }

    /**
    * The link to join the meeting which is associated with this activity
    * @return conferenceMeetingUrl
    **/
    @JsonProperty("conference_meeting_url")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getConferenceMeetingUrl() {
        return conferenceMeetingUrl;
    }

    /**
     * Set conferenceMeetingUrl
     **/
    public void setConferenceMeetingUrl(String conferenceMeetingUrl) {
        this.conferenceMeetingUrl = conferenceMeetingUrl;
    }

    public ActivityCollectionResponseObject conferenceMeetingUrl(String conferenceMeetingUrl) {
        this.conferenceMeetingUrl = conferenceMeetingUrl;
        return this;
    }

    /**
    * The meeting ID of the meeting provider (Zoom, MS Teams etc.) that is associated with this activity
    * @return conferenceMeetingId
    **/
    @JsonProperty("conference_meeting_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getConferenceMeetingId() {
        return conferenceMeetingId;
    }

    /**
     * Set conferenceMeetingId
     **/
    public void setConferenceMeetingId(String conferenceMeetingId) {
        this.conferenceMeetingId = conferenceMeetingId;
    }

    public ActivityCollectionResponseObject conferenceMeetingId(String conferenceMeetingId) {
        this.conferenceMeetingId = conferenceMeetingId;
        return this;
    }

    /**
    * The creation date and time of the activity in UTC. Format: YYYY-MM-DD HH:MM:SS.
    * @return addTime
    **/
    @JsonProperty("add_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getAddTime() {
        return addTime;
    }

    /**
     * Set addTime
     **/
    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public ActivityCollectionResponseObject addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The date and time this activity was marked as done. Format: YYYY-MM-DD HH:MM:SS.
    * @return markedAsDoneTime
    **/
    @JsonProperty("marked_as_done_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getMarkedAsDoneTime() {
        return markedAsDoneTime;
    }

    /**
     * Set markedAsDoneTime
     **/
    public void setMarkedAsDoneTime(String markedAsDoneTime) {
        this.markedAsDoneTime = markedAsDoneTime;
    }

    public ActivityCollectionResponseObject markedAsDoneTime(String markedAsDoneTime) {
        this.markedAsDoneTime = markedAsDoneTime;
        return this;
    }

    /**
    * Whether the activity is active or not
    * @return activeFlag
    **/
    @JsonProperty("active_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getActiveFlag() {
        return activeFlag;
    }

    /**
     * Set activeFlag
     **/
    public void setActiveFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
    }

    public ActivityCollectionResponseObject activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * The last update date and time of the activity. Format: YYYY-MM-DD HH:MM:SS.
    * @return updateTime
    **/
    @JsonProperty("update_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Set updateTime
     **/
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ActivityCollectionResponseObject updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
    * The ID of the user who was the last to update this activity
    * @return updateUserId
    **/
    @JsonProperty("update_user_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    /**
     * Set updateUserId
     **/
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    public ActivityCollectionResponseObject updateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
        return this;
    }

    /**
    * The timezone the activity was created in an external calendar
    * @return sourceTimezone
    **/
    @JsonProperty("source_timezone")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getSourceTimezone() {
        return sourceTimezone;
    }

    /**
     * Set sourceTimezone
     **/
    public void setSourceTimezone(String sourceTimezone) {
        this.sourceTimezone = sourceTimezone;
    }

    public ActivityCollectionResponseObject sourceTimezone(String sourceTimezone) {
        this.sourceTimezone = sourceTimezone;
        return this;
    }

    /**
    * A subfield of the location field. Indicates apartment/suite number.
    * @return locationSubpremise
    **/
    @JsonProperty("location_subpremise")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLocationSubpremise() {
        return locationSubpremise;
    }

    /**
     * Set locationSubpremise
     **/
    public void setLocationSubpremise(String locationSubpremise) {
        this.locationSubpremise = locationSubpremise;
    }

    public ActivityCollectionResponseObject locationSubpremise(String locationSubpremise) {
        this.locationSubpremise = locationSubpremise;
        return this;
    }

    /**
    * A subfield of the location field. Indicates house number.
    * @return locationStreetNumber
    **/
    @JsonProperty("location_street_number")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLocationStreetNumber() {
        return locationStreetNumber;
    }

    /**
     * Set locationStreetNumber
     **/
    public void setLocationStreetNumber(String locationStreetNumber) {
        this.locationStreetNumber = locationStreetNumber;
    }

    public ActivityCollectionResponseObject locationStreetNumber(String locationStreetNumber) {
        this.locationStreetNumber = locationStreetNumber;
        return this;
    }

    /**
    * A subfield of the location field. Indicates street name.
    * @return locationRoute
    **/
    @JsonProperty("location_route")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLocationRoute() {
        return locationRoute;
    }

    /**
     * Set locationRoute
     **/
    public void setLocationRoute(String locationRoute) {
        this.locationRoute = locationRoute;
    }

    public ActivityCollectionResponseObject locationRoute(String locationRoute) {
        this.locationRoute = locationRoute;
        return this;
    }

    /**
    * A subfield of the location field. Indicates district/sublocality.
    * @return locationSublocality
    **/
    @JsonProperty("location_sublocality")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLocationSublocality() {
        return locationSublocality;
    }

    /**
     * Set locationSublocality
     **/
    public void setLocationSublocality(String locationSublocality) {
        this.locationSublocality = locationSublocality;
    }

    public ActivityCollectionResponseObject locationSublocality(String locationSublocality) {
        this.locationSublocality = locationSublocality;
        return this;
    }

    /**
    * A subfield of the location field. Indicates city/town/village/locality.
    * @return locationLocality
    **/
    @JsonProperty("location_locality")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLocationLocality() {
        return locationLocality;
    }

    /**
     * Set locationLocality
     **/
    public void setLocationLocality(String locationLocality) {
        this.locationLocality = locationLocality;
    }

    public ActivityCollectionResponseObject locationLocality(String locationLocality) {
        this.locationLocality = locationLocality;
        return this;
    }

    /**
    * A subfield of the location field. Indicates state/county.
    * @return locationAdminAreaLevel1
    **/
    @JsonProperty("location_admin_area_level_1")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLocationAdminAreaLevel1() {
        return locationAdminAreaLevel1;
    }

    /**
     * Set locationAdminAreaLevel1
     **/
    public void setLocationAdminAreaLevel1(String locationAdminAreaLevel1) {
        this.locationAdminAreaLevel1 = locationAdminAreaLevel1;
    }

    public ActivityCollectionResponseObject locationAdminAreaLevel1(String locationAdminAreaLevel1) {
        this.locationAdminAreaLevel1 = locationAdminAreaLevel1;
        return this;
    }

    /**
    * A subfield of the location field. Indicates region.
    * @return locationAdminAreaLevel2
    **/
    @JsonProperty("location_admin_area_level_2")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLocationAdminAreaLevel2() {
        return locationAdminAreaLevel2;
    }

    /**
     * Set locationAdminAreaLevel2
     **/
    public void setLocationAdminAreaLevel2(String locationAdminAreaLevel2) {
        this.locationAdminAreaLevel2 = locationAdminAreaLevel2;
    }

    public ActivityCollectionResponseObject locationAdminAreaLevel2(String locationAdminAreaLevel2) {
        this.locationAdminAreaLevel2 = locationAdminAreaLevel2;
        return this;
    }

    /**
    * A subfield of the location field. Indicates country.
    * @return locationCountry
    **/
    @JsonProperty("location_country")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLocationCountry() {
        return locationCountry;
    }

    /**
     * Set locationCountry
     **/
    public void setLocationCountry(String locationCountry) {
        this.locationCountry = locationCountry;
    }

    public ActivityCollectionResponseObject locationCountry(String locationCountry) {
        this.locationCountry = locationCountry;
        return this;
    }

    /**
    * A subfield of the location field. Indicates ZIP/postal code.
    * @return locationPostalCode
    **/
    @JsonProperty("location_postal_code")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLocationPostalCode() {
        return locationPostalCode;
    }

    /**
     * Set locationPostalCode
     **/
    public void setLocationPostalCode(String locationPostalCode) {
        this.locationPostalCode = locationPostalCode;
    }

    public ActivityCollectionResponseObject locationPostalCode(String locationPostalCode) {
        this.locationPostalCode = locationPostalCode;
        return this;
    }

    /**
    * A subfield of the location field. Indicates full/combined address.
    * @return locationFormattedAddress
    **/
    @JsonProperty("location_formatted_address")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLocationFormattedAddress() {
        return locationFormattedAddress;
    }

    /**
     * Set locationFormattedAddress
     **/
    public void setLocationFormattedAddress(String locationFormattedAddress) {
        this.locationFormattedAddress = locationFormattedAddress;
    }

    public ActivityCollectionResponseObject locationFormattedAddress(String locationFormattedAddress) {
        this.locationFormattedAddress = locationFormattedAddress;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActivityCollectionResponseObject {\n");

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
        sb.append("    done: ").append(toIndentedString(done)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    busyFlag: ").append(toIndentedString(busyFlag)).append("\n");
        sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
        sb.append("    conferenceMeetingClient: ").append(toIndentedString(conferenceMeetingClient)).append("\n");
        sb.append("    conferenceMeetingUrl: ").append(toIndentedString(conferenceMeetingUrl)).append("\n");
        sb.append("    conferenceMeetingId: ").append(toIndentedString(conferenceMeetingId)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    markedAsDoneTime: ").append(toIndentedString(markedAsDoneTime)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateUserId: ").append(toIndentedString(updateUserId)).append("\n");
        sb.append("    sourceTimezone: ").append(toIndentedString(sourceTimezone)).append("\n");
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
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code ActivityCollectionResponseObject} object that
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

        ActivityCollectionResponseObject model = (ActivityCollectionResponseObject) obj;

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
        java.util.Objects.equals(done, model.done) &&
        java.util.Objects.equals(subject, model.subject) &&
        java.util.Objects.equals(type, model.type) &&
        java.util.Objects.equals(userId, model.userId) &&
        java.util.Objects.equals(busyFlag, model.busyFlag) &&
        java.util.Objects.equals(companyId, model.companyId) &&
        java.util.Objects.equals(conferenceMeetingClient, model.conferenceMeetingClient) &&
        java.util.Objects.equals(conferenceMeetingUrl, model.conferenceMeetingUrl) &&
        java.util.Objects.equals(conferenceMeetingId, model.conferenceMeetingId) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(markedAsDoneTime, model.markedAsDoneTime) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(updateTime, model.updateTime) &&
        java.util.Objects.equals(updateUserId, model.updateUserId) &&
        java.util.Objects.equals(sourceTimezone, model.sourceTimezone) &&
        java.util.Objects.equals(locationSubpremise, model.locationSubpremise) &&
        java.util.Objects.equals(locationStreetNumber, model.locationStreetNumber) &&
        java.util.Objects.equals(locationRoute, model.locationRoute) &&
        java.util.Objects.equals(locationSublocality, model.locationSublocality) &&
        java.util.Objects.equals(locationLocality, model.locationLocality) &&
        java.util.Objects.equals(locationAdminAreaLevel1, model.locationAdminAreaLevel1) &&
        java.util.Objects.equals(locationAdminAreaLevel2, model.locationAdminAreaLevel2) &&
        java.util.Objects.equals(locationCountry, model.locationCountry) &&
        java.util.Objects.equals(locationPostalCode, model.locationPostalCode) &&
        java.util.Objects.equals(locationFormattedAddress, model.locationFormattedAddress);
    }

    /**
     * Returns a hash code for a {@code ActivityCollectionResponseObject}.
     *
     * @return a hash code value for a {@code ActivityCollectionResponseObject}.
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
        done,
        subject,
        type,
        userId,
        busyFlag,
        companyId,
        conferenceMeetingClient,
        conferenceMeetingUrl,
        conferenceMeetingId,
        addTime,
        markedAsDoneTime,
        activeFlag,
        updateTime,
        updateUserId,
        sourceTimezone,
        locationSubpremise,
        locationStreetNumber,
        locationRoute,
        locationSublocality,
        locationLocality,
        locationAdminAreaLevel1,
        locationAdminAreaLevel2,
        locationCountry,
        locationPostalCode,
        locationFormattedAddress);
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

    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class ActivityCollectionResponseObjectQueryParam  {

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
        @jakarta.ws.rs.QueryParam("done")
        private Boolean done;
        @jakarta.ws.rs.QueryParam("subject")
        private String subject;
        @jakarta.ws.rs.QueryParam("type")
        private String type;
        @jakarta.ws.rs.QueryParam("userId")
        private Integer userId;
        @jakarta.ws.rs.QueryParam("busyFlag")
        private Boolean busyFlag;
        @jakarta.ws.rs.QueryParam("companyId")
        private Integer companyId;
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
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        @jakarta.ws.rs.QueryParam("updateTime")
        private String updateTime;
        @jakarta.ws.rs.QueryParam("updateUserId")
        private Integer updateUserId;
        @jakarta.ws.rs.QueryParam("sourceTimezone")
        private String sourceTimezone;
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

        /**
        * The due date of the activity. Format: YYYY-MM-DD
        * @return dueDate
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("due_date")
        public LocalDate getDueDate() {
            return dueDate;
        }

        /**
         * Set dueDate
         **/
        public void setDueDate(LocalDate dueDate) {
            this.dueDate = dueDate;
        }

        public ActivityCollectionResponseObjectQueryParam dueDate(LocalDate dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        /**
        * The due time of the activity in UTC. Format: HH:MM
        * @return dueTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("due_time")
        public String getDueTime() {
            return dueTime;
        }

        /**
         * Set dueTime
         **/
        public void setDueTime(String dueTime) {
            this.dueTime = dueTime;
        }

        public ActivityCollectionResponseObjectQueryParam dueTime(String dueTime) {
            this.dueTime = dueTime;
            return this;
        }

        /**
        * The duration of the activity. Format: HH:MM
        * @return duration
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("duration")
        public String getDuration() {
            return duration;
        }

        /**
         * Set duration
         **/
        public void setDuration(String duration) {
            this.duration = duration;
        }

        public ActivityCollectionResponseObjectQueryParam duration(String duration) {
            this.duration = duration;
            return this;
        }

        /**
        * The ID of the deal this activity is associated with
        * @return dealId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("deal_id")
        public Integer getDealId() {
            return dealId;
        }

        /**
         * Set dealId
         **/
        public void setDealId(Integer dealId) {
            this.dealId = dealId;
        }

        public ActivityCollectionResponseObjectQueryParam dealId(Integer dealId) {
            this.dealId = dealId;
            return this;
        }

        /**
        * The ID of the lead in the UUID format this activity is associated with
        * @return leadId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("lead_id")
        public UUID getLeadId() {
            return leadId;
        }

        /**
         * Set leadId
         **/
        public void setLeadId(UUID leadId) {
            this.leadId = leadId;
        }

        public ActivityCollectionResponseObjectQueryParam leadId(UUID leadId) {
            this.leadId = leadId;
            return this;
        }

        /**
        * The ID of the person this activity is associated with
        * @return personId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("person_id")
        public Integer getPersonId() {
            return personId;
        }

        /**
         * Set personId
         **/
        public void setPersonId(Integer personId) {
            this.personId = personId;
        }

        public ActivityCollectionResponseObjectQueryParam personId(Integer personId) {
            this.personId = personId;
            return this;
        }

        /**
        * The ID of the project this activity is associated with
        * @return projectId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("project_id")
        public Integer getProjectId() {
            return projectId;
        }

        /**
         * Set projectId
         **/
        public void setProjectId(Integer projectId) {
            this.projectId = projectId;
        }

        public ActivityCollectionResponseObjectQueryParam projectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
        * The ID of the organization this activity is associated with
        * @return orgId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("org_id")
        public Integer getOrgId() {
            return orgId;
        }

        /**
         * Set orgId
         **/
        public void setOrgId(Integer orgId) {
            this.orgId = orgId;
        }

        public ActivityCollectionResponseObjectQueryParam orgId(Integer orgId) {
            this.orgId = orgId;
            return this;
        }

        /**
        * The address of the activity.
        * @return location
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("location")
        public String getLocation() {
            return location;
        }

        /**
         * Set location
         **/
        public void setLocation(String location) {
            this.location = location;
        }

        public ActivityCollectionResponseObjectQueryParam location(String location) {
            this.location = location;
            return this;
        }

        /**
        * Additional details about the activity that is synced to your external calendar. Unlike the note added to the activity, the description is publicly visible to any guests added to the activity.
        * @return publicDescription
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("public_description")
        public String getPublicDescription() {
            return publicDescription;
        }

        /**
         * Set publicDescription
         **/
        public void setPublicDescription(String publicDescription) {
            this.publicDescription = publicDescription;
        }

        public ActivityCollectionResponseObjectQueryParam publicDescription(String publicDescription) {
            this.publicDescription = publicDescription;
            return this;
        }

        /**
        * The ID of the activity, generated when the activity was created
        * @return id
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        public Integer getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(Integer id) {
            this.id = id;
        }

        public ActivityCollectionResponseObjectQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * Whether the activity is done or not
        * @return done
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("done")
        public Boolean getDone() {
            return done;
        }

        /**
         * Set done
         **/
        public void setDone(Boolean done) {
            this.done = done;
        }

        public ActivityCollectionResponseObjectQueryParam done(Boolean done) {
            this.done = done;
            return this;
        }

        /**
        * The subject of the activity
        * @return subject
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("subject")
        public String getSubject() {
            return subject;
        }

        /**
         * Set subject
         **/
        public void setSubject(String subject) {
            this.subject = subject;
        }

        public ActivityCollectionResponseObjectQueryParam subject(String subject) {
            this.subject = subject;
            return this;
        }

        /**
        * The type of the activity. This is in correlation with the `key_string` parameter of ActivityTypes.
        * @return type
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        public String getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(String type) {
            this.type = type;
        }

        public ActivityCollectionResponseObjectQueryParam type(String type) {
            this.type = type;
            return this;
        }

        /**
        * The ID of the user whom the activity is assigned to
        * @return userId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("user_id")
        public Integer getUserId() {
            return userId;
        }

        /**
         * Set userId
         **/
        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public ActivityCollectionResponseObjectQueryParam userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        /**
        * Marks if the activity is set as 'Busy' or 'Free'. If the flag is set to `true`, your customers will not be able to book that time slot through any Scheduler links. The flag can also be unset. When the value of the flag is unset (`null`), the flag defaults to 'Busy' if it has a time set, and 'Free' if it is an all-day event without specified time.
        * @return busyFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("busy_flag")
        public Boolean getBusyFlag() {
            return busyFlag;
        }

        /**
         * Set busyFlag
         **/
        public void setBusyFlag(Boolean busyFlag) {
            this.busyFlag = busyFlag;
        }

        public ActivityCollectionResponseObjectQueryParam busyFlag(Boolean busyFlag) {
            this.busyFlag = busyFlag;
            return this;
        }

        /**
        * The user's company ID
        * @return companyId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("company_id")
        public Integer getCompanyId() {
            return companyId;
        }

        /**
         * Set companyId
         **/
        public void setCompanyId(Integer companyId) {
            this.companyId = companyId;
        }

        public ActivityCollectionResponseObjectQueryParam companyId(Integer companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
        * The ID of the Marketplace app, which is connected to this activity
        * @return conferenceMeetingClient
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("conference_meeting_client")
        public String getConferenceMeetingClient() {
            return conferenceMeetingClient;
        }

        /**
         * Set conferenceMeetingClient
         **/
        public void setConferenceMeetingClient(String conferenceMeetingClient) {
            this.conferenceMeetingClient = conferenceMeetingClient;
        }

        public ActivityCollectionResponseObjectQueryParam conferenceMeetingClient(String conferenceMeetingClient) {
            this.conferenceMeetingClient = conferenceMeetingClient;
            return this;
        }

        /**
        * The link to join the meeting which is associated with this activity
        * @return conferenceMeetingUrl
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("conference_meeting_url")
        public String getConferenceMeetingUrl() {
            return conferenceMeetingUrl;
        }

        /**
         * Set conferenceMeetingUrl
         **/
        public void setConferenceMeetingUrl(String conferenceMeetingUrl) {
            this.conferenceMeetingUrl = conferenceMeetingUrl;
        }

        public ActivityCollectionResponseObjectQueryParam conferenceMeetingUrl(String conferenceMeetingUrl) {
            this.conferenceMeetingUrl = conferenceMeetingUrl;
            return this;
        }

        /**
        * The meeting ID of the meeting provider (Zoom, MS Teams etc.) that is associated with this activity
        * @return conferenceMeetingId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("conference_meeting_id")
        public String getConferenceMeetingId() {
            return conferenceMeetingId;
        }

        /**
         * Set conferenceMeetingId
         **/
        public void setConferenceMeetingId(String conferenceMeetingId) {
            this.conferenceMeetingId = conferenceMeetingId;
        }

        public ActivityCollectionResponseObjectQueryParam conferenceMeetingId(String conferenceMeetingId) {
            this.conferenceMeetingId = conferenceMeetingId;
            return this;
        }

        /**
        * The creation date and time of the activity in UTC. Format: YYYY-MM-DD HH:MM:SS.
        * @return addTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("add_time")
        public String getAddTime() {
            return addTime;
        }

        /**
         * Set addTime
         **/
        public void setAddTime(String addTime) {
            this.addTime = addTime;
        }

        public ActivityCollectionResponseObjectQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The date and time this activity was marked as done. Format: YYYY-MM-DD HH:MM:SS.
        * @return markedAsDoneTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("marked_as_done_time")
        public String getMarkedAsDoneTime() {
            return markedAsDoneTime;
        }

        /**
         * Set markedAsDoneTime
         **/
        public void setMarkedAsDoneTime(String markedAsDoneTime) {
            this.markedAsDoneTime = markedAsDoneTime;
        }

        public ActivityCollectionResponseObjectQueryParam markedAsDoneTime(String markedAsDoneTime) {
            this.markedAsDoneTime = markedAsDoneTime;
            return this;
        }

        /**
        * Whether the activity is active or not
        * @return activeFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("active_flag")
        public Boolean getActiveFlag() {
            return activeFlag;
        }

        /**
         * Set activeFlag
         **/
        public void setActiveFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
        }

        public ActivityCollectionResponseObjectQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * The last update date and time of the activity. Format: YYYY-MM-DD HH:MM:SS.
        * @return updateTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("update_time")
        public String getUpdateTime() {
            return updateTime;
        }

        /**
         * Set updateTime
         **/
        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public ActivityCollectionResponseObjectQueryParam updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
        * The ID of the user who was the last to update this activity
        * @return updateUserId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("update_user_id")
        public Integer getUpdateUserId() {
            return updateUserId;
        }

        /**
         * Set updateUserId
         **/
        public void setUpdateUserId(Integer updateUserId) {
            this.updateUserId = updateUserId;
        }

        public ActivityCollectionResponseObjectQueryParam updateUserId(Integer updateUserId) {
            this.updateUserId = updateUserId;
            return this;
        }

        /**
        * The timezone the activity was created in an external calendar
        * @return sourceTimezone
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("source_timezone")
        public String getSourceTimezone() {
            return sourceTimezone;
        }

        /**
         * Set sourceTimezone
         **/
        public void setSourceTimezone(String sourceTimezone) {
            this.sourceTimezone = sourceTimezone;
        }

        public ActivityCollectionResponseObjectQueryParam sourceTimezone(String sourceTimezone) {
            this.sourceTimezone = sourceTimezone;
            return this;
        }

        /**
        * A subfield of the location field. Indicates apartment/suite number.
        * @return locationSubpremise
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("location_subpremise")
        public String getLocationSubpremise() {
            return locationSubpremise;
        }

        /**
         * Set locationSubpremise
         **/
        public void setLocationSubpremise(String locationSubpremise) {
            this.locationSubpremise = locationSubpremise;
        }

        public ActivityCollectionResponseObjectQueryParam locationSubpremise(String locationSubpremise) {
            this.locationSubpremise = locationSubpremise;
            return this;
        }

        /**
        * A subfield of the location field. Indicates house number.
        * @return locationStreetNumber
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("location_street_number")
        public String getLocationStreetNumber() {
            return locationStreetNumber;
        }

        /**
         * Set locationStreetNumber
         **/
        public void setLocationStreetNumber(String locationStreetNumber) {
            this.locationStreetNumber = locationStreetNumber;
        }

        public ActivityCollectionResponseObjectQueryParam locationStreetNumber(String locationStreetNumber) {
            this.locationStreetNumber = locationStreetNumber;
            return this;
        }

        /**
        * A subfield of the location field. Indicates street name.
        * @return locationRoute
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("location_route")
        public String getLocationRoute() {
            return locationRoute;
        }

        /**
         * Set locationRoute
         **/
        public void setLocationRoute(String locationRoute) {
            this.locationRoute = locationRoute;
        }

        public ActivityCollectionResponseObjectQueryParam locationRoute(String locationRoute) {
            this.locationRoute = locationRoute;
            return this;
        }

        /**
        * A subfield of the location field. Indicates district/sublocality.
        * @return locationSublocality
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("location_sublocality")
        public String getLocationSublocality() {
            return locationSublocality;
        }

        /**
         * Set locationSublocality
         **/
        public void setLocationSublocality(String locationSublocality) {
            this.locationSublocality = locationSublocality;
        }

        public ActivityCollectionResponseObjectQueryParam locationSublocality(String locationSublocality) {
            this.locationSublocality = locationSublocality;
            return this;
        }

        /**
        * A subfield of the location field. Indicates city/town/village/locality.
        * @return locationLocality
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("location_locality")
        public String getLocationLocality() {
            return locationLocality;
        }

        /**
         * Set locationLocality
         **/
        public void setLocationLocality(String locationLocality) {
            this.locationLocality = locationLocality;
        }

        public ActivityCollectionResponseObjectQueryParam locationLocality(String locationLocality) {
            this.locationLocality = locationLocality;
            return this;
        }

        /**
        * A subfield of the location field. Indicates state/county.
        * @return locationAdminAreaLevel1
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("location_admin_area_level_1")
        public String getLocationAdminAreaLevel1() {
            return locationAdminAreaLevel1;
        }

        /**
         * Set locationAdminAreaLevel1
         **/
        public void setLocationAdminAreaLevel1(String locationAdminAreaLevel1) {
            this.locationAdminAreaLevel1 = locationAdminAreaLevel1;
        }

        public ActivityCollectionResponseObjectQueryParam locationAdminAreaLevel1(String locationAdminAreaLevel1) {
            this.locationAdminAreaLevel1 = locationAdminAreaLevel1;
            return this;
        }

        /**
        * A subfield of the location field. Indicates region.
        * @return locationAdminAreaLevel2
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("location_admin_area_level_2")
        public String getLocationAdminAreaLevel2() {
            return locationAdminAreaLevel2;
        }

        /**
         * Set locationAdminAreaLevel2
         **/
        public void setLocationAdminAreaLevel2(String locationAdminAreaLevel2) {
            this.locationAdminAreaLevel2 = locationAdminAreaLevel2;
        }

        public ActivityCollectionResponseObjectQueryParam locationAdminAreaLevel2(String locationAdminAreaLevel2) {
            this.locationAdminAreaLevel2 = locationAdminAreaLevel2;
            return this;
        }

        /**
        * A subfield of the location field. Indicates country.
        * @return locationCountry
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("location_country")
        public String getLocationCountry() {
            return locationCountry;
        }

        /**
         * Set locationCountry
         **/
        public void setLocationCountry(String locationCountry) {
            this.locationCountry = locationCountry;
        }

        public ActivityCollectionResponseObjectQueryParam locationCountry(String locationCountry) {
            this.locationCountry = locationCountry;
            return this;
        }

        /**
        * A subfield of the location field. Indicates ZIP/postal code.
        * @return locationPostalCode
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("location_postal_code")
        public String getLocationPostalCode() {
            return locationPostalCode;
        }

        /**
         * Set locationPostalCode
         **/
        public void setLocationPostalCode(String locationPostalCode) {
            this.locationPostalCode = locationPostalCode;
        }

        public ActivityCollectionResponseObjectQueryParam locationPostalCode(String locationPostalCode) {
            this.locationPostalCode = locationPostalCode;
            return this;
        }

        /**
        * A subfield of the location field. Indicates full/combined address.
        * @return locationFormattedAddress
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("location_formatted_address")
        public String getLocationFormattedAddress() {
            return locationFormattedAddress;
        }

        /**
         * Set locationFormattedAddress
         **/
        public void setLocationFormattedAddress(String locationFormattedAddress) {
            this.locationFormattedAddress = locationFormattedAddress;
        }

        public ActivityCollectionResponseObjectQueryParam locationFormattedAddress(String locationFormattedAddress) {
            this.locationFormattedAddress = locationFormattedAddress;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ActivityCollectionResponseObjectQueryParam {\n");

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
            sb.append("    done: ").append(toIndentedString(done)).append("\n");
            sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
            sb.append("    busyFlag: ").append(toIndentedString(busyFlag)).append("\n");
            sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
            sb.append("    conferenceMeetingClient: ").append(toIndentedString(conferenceMeetingClient)).append("\n");
            sb.append("    conferenceMeetingUrl: ").append(toIndentedString(conferenceMeetingUrl)).append("\n");
            sb.append("    conferenceMeetingId: ").append(toIndentedString(conferenceMeetingId)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    markedAsDoneTime: ").append(toIndentedString(markedAsDoneTime)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
            sb.append("    updateUserId: ").append(toIndentedString(updateUserId)).append("\n");
            sb.append("    sourceTimezone: ").append(toIndentedString(sourceTimezone)).append("\n");
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
