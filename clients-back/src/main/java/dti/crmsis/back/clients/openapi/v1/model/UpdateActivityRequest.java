package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateActivityRequest  {

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
      * The note of the activity (HTML format)
     **/
    private String note;
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
      * List of multiple persons (participants) this activity is associated with. It requires a structure as follows: `[{\"person_id\":1,\"primary_flag\":true}]`
     **/
    private List<Object> participants;
    /**
      * Set the activity as 'Busy' or 'Free'. If the flag is set to `true`, your customers will not be able to book that time slot through any Scheduler links. The flag can also be unset by never setting it or overriding it with `null`. When the value of the flag is unset (`null`), the flag defaults to 'Busy' if it has a time set, and 'Free' if it is an all-day event without specified time.
     **/
    private Boolean busyFlag;
    /**
      * The attendees of the activity. This can be either your existing Pipedrive contacts or an external email address. It requires a structure as follows: `[{\"email_address\":\"mail@example.org\"}]` or `[{\"person_id\":1, \"email_address\":\"mail@example.org\"}]`
     **/
    private List<Object> attendees;

    public enum DoneEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<DoneEnum> values = java.util.EnumSet.allOf(DoneEnum.class);

        BigDecimal value;

        DoneEnum (BigDecimal v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DoneEnum fromString(String v) {
            for (DoneEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private DoneEnum done;

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

    public UpdateActivityRequest dueDate(LocalDate dueDate) {
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

    public UpdateActivityRequest dueTime(String dueTime) {
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

    public UpdateActivityRequest duration(String duration) {
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

    public UpdateActivityRequest dealId(Integer dealId) {
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

    public UpdateActivityRequest leadId(UUID leadId) {
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

    public UpdateActivityRequest personId(Integer personId) {
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

    public UpdateActivityRequest projectId(Integer projectId) {
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

    public UpdateActivityRequest orgId(Integer orgId) {
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

    public UpdateActivityRequest location(String location) {
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

    public UpdateActivityRequest publicDescription(String publicDescription) {
        this.publicDescription = publicDescription;
        return this;
    }

    /**
    * The note of the activity (HTML format)
    * @return note
    **/
    @JsonProperty("note")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getNote() {
        return note;
    }

    /**
     * Set note
     **/
    public void setNote(String note) {
        this.note = note;
    }

    public UpdateActivityRequest note(String note) {
        this.note = note;
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

    public UpdateActivityRequest subject(String subject) {
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

    public UpdateActivityRequest type(String type) {
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

    public UpdateActivityRequest userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
    * List of multiple persons (participants) this activity is associated with. It requires a structure as follows: `[{\"person_id\":1,\"primary_flag\":true}]`
    * @return participants
    **/
    @JsonProperty("participants")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Object> getParticipants() {
        return participants;
    }

    /**
     * Set participants
     **/
    public void setParticipants(List<Object> participants) {
        this.participants = participants;
    }

    public UpdateActivityRequest participants(List<Object> participants) {
        this.participants = participants;
        return this;
    }
    public UpdateActivityRequest addParticipantsItem(Object participantsItem) {
        if (this.participants == null){
            participants = new ArrayList<>();
        }
        this.participants.add(participantsItem);
        return this;
    }

    /**
    * Set the activity as 'Busy' or 'Free'. If the flag is set to `true`, your customers will not be able to book that time slot through any Scheduler links. The flag can also be unset by never setting it or overriding it with `null`. When the value of the flag is unset (`null`), the flag defaults to 'Busy' if it has a time set, and 'Free' if it is an all-day event without specified time.
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

    public UpdateActivityRequest busyFlag(Boolean busyFlag) {
        this.busyFlag = busyFlag;
        return this;
    }

    /**
    * The attendees of the activity. This can be either your existing Pipedrive contacts or an external email address. It requires a structure as follows: `[{\"email_address\":\"mail@example.org\"}]` or `[{\"person_id\":1, \"email_address\":\"mail@example.org\"}]`
    * @return attendees
    **/
    @JsonProperty("attendees")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Object> getAttendees() {
        return attendees;
    }

    /**
     * Set attendees
     **/
    public void setAttendees(List<Object> attendees) {
        this.attendees = attendees;
    }

    public UpdateActivityRequest attendees(List<Object> attendees) {
        this.attendees = attendees;
        return this;
    }
    public UpdateActivityRequest addAttendeesItem(Object attendeesItem) {
        if (this.attendees == null){
            attendees = new ArrayList<>();
        }
        this.attendees.add(attendeesItem);
        return this;
    }

    /**
    * Get done
    * @return done
    **/
    @JsonProperty("done")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public DoneEnum getDone() {
        return done;
    }

    /**
     * Set done
     **/
    public void setDone(DoneEnum done) {
        this.done = done;
    }

    public UpdateActivityRequest done(DoneEnum done) {
        this.done = done;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateActivityRequest {\n");

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
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
        sb.append("    busyFlag: ").append(toIndentedString(busyFlag)).append("\n");
        sb.append("    attendees: ").append(toIndentedString(attendees)).append("\n");
        sb.append("    done: ").append(toIndentedString(done)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code UpdateActivityRequest} object that
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

        UpdateActivityRequest model = (UpdateActivityRequest) obj;

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
        java.util.Objects.equals(note, model.note) &&
        java.util.Objects.equals(subject, model.subject) &&
        java.util.Objects.equals(type, model.type) &&
        java.util.Objects.equals(userId, model.userId) &&
        java.util.Objects.equals(participants, model.participants) &&
        java.util.Objects.equals(busyFlag, model.busyFlag) &&
        java.util.Objects.equals(attendees, model.attendees) &&
        java.util.Objects.equals(done, model.done);
    }

    /**
     * Returns a hash code for a {@code UpdateActivityRequest}.
     *
     * @return a hash code value for a {@code UpdateActivityRequest}.
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
        note,
        subject,
        type,
        userId,
        participants,
        busyFlag,
        attendees,
        done);
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
    public static class UpdateActivityRequestQueryParam  {

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
        @jakarta.ws.rs.QueryParam("note")
        private String note;
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

    public enum DoneEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<DoneEnum> values = java.util.EnumSet.allOf(DoneEnum.class);

        BigDecimal value;

        DoneEnum (BigDecimal v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DoneEnum fromString(String v) {
            for (DoneEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private DoneEnum done;

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

        public UpdateActivityRequestQueryParam dueDate(LocalDate dueDate) {
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

        public UpdateActivityRequestQueryParam dueTime(String dueTime) {
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

        public UpdateActivityRequestQueryParam duration(String duration) {
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

        public UpdateActivityRequestQueryParam dealId(Integer dealId) {
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

        public UpdateActivityRequestQueryParam leadId(UUID leadId) {
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

        public UpdateActivityRequestQueryParam personId(Integer personId) {
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

        public UpdateActivityRequestQueryParam projectId(Integer projectId) {
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

        public UpdateActivityRequestQueryParam orgId(Integer orgId) {
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

        public UpdateActivityRequestQueryParam location(String location) {
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

        public UpdateActivityRequestQueryParam publicDescription(String publicDescription) {
            this.publicDescription = publicDescription;
            return this;
        }

        /**
        * The note of the activity (HTML format)
        * @return note
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("note")
        public String getNote() {
            return note;
        }

        /**
         * Set note
         **/
        public void setNote(String note) {
            this.note = note;
        }

        public UpdateActivityRequestQueryParam note(String note) {
            this.note = note;
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

        public UpdateActivityRequestQueryParam subject(String subject) {
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

        public UpdateActivityRequestQueryParam type(String type) {
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

        public UpdateActivityRequestQueryParam userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        /**
        * List of multiple persons (participants) this activity is associated with. It requires a structure as follows: `[{\"person_id\":1,\"primary_flag\":true}]`
        * @return participants
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("participants")
        public List<Object> getParticipants() {
            return participants;
        }

        /**
         * Set participants
         **/
        public void setParticipants(List<Object> participants) {
            this.participants = participants;
        }

        public UpdateActivityRequestQueryParam participants(List<Object> participants) {
            this.participants = participants;
            return this;
        }
        public UpdateActivityRequestQueryParam addParticipantsItem(Object participantsItem) {
            this.participants.add(participantsItem);
            return this;
        }

        /**
        * Set the activity as 'Busy' or 'Free'. If the flag is set to `true`, your customers will not be able to book that time slot through any Scheduler links. The flag can also be unset by never setting it or overriding it with `null`. When the value of the flag is unset (`null`), the flag defaults to 'Busy' if it has a time set, and 'Free' if it is an all-day event without specified time.
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

        public UpdateActivityRequestQueryParam busyFlag(Boolean busyFlag) {
            this.busyFlag = busyFlag;
            return this;
        }

        /**
        * The attendees of the activity. This can be either your existing Pipedrive contacts or an external email address. It requires a structure as follows: `[{\"email_address\":\"mail@example.org\"}]` or `[{\"person_id\":1, \"email_address\":\"mail@example.org\"}]`
        * @return attendees
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("attendees")
        public List<Object> getAttendees() {
            return attendees;
        }

        /**
         * Set attendees
         **/
        public void setAttendees(List<Object> attendees) {
            this.attendees = attendees;
        }

        public UpdateActivityRequestQueryParam attendees(List<Object> attendees) {
            this.attendees = attendees;
            return this;
        }
        public UpdateActivityRequestQueryParam addAttendeesItem(Object attendeesItem) {
            this.attendees.add(attendeesItem);
            return this;
        }

        /**
        * Get done
        * @return done
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("done")
        public DoneEnum getDone() {
            return done;
        }

        /**
         * Set done
         **/
        public void setDone(DoneEnum done) {
            this.done = done;
        }

        public UpdateActivityRequestQueryParam done(DoneEnum done) {
            this.done = done;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class UpdateActivityRequestQueryParam {\n");

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
            sb.append("    note: ").append(toIndentedString(note)).append("\n");
            sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
            sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
            sb.append("    busyFlag: ").append(toIndentedString(busyFlag)).append("\n");
            sb.append("    attendees: ").append(toIndentedString(attendees)).append("\n");
            sb.append("    done: ").append(toIndentedString(done)).append("\n");
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
