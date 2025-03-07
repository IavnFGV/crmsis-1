package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseCallLogObject  {

    /**
      * The ID of the owner of the call log. Please note that a user without account settings access cannot create call logs for other users.
     **/
    private Integer userId;
    /**
      * If specified, this activity will be converted into a call log, with the information provided. When this field is used, you don't need to specify `deal_id`, `person_id` or `org_id`, as they will be ignored in favor of the values already available in the activity. The `activity_id` must refer to a `call` type activity.
     **/
    private Integer activityId;
    /**
      * The name of the activity this call is attached to
     **/
    private String subject;
    /**
      * The duration of the call in seconds
     **/
    private String duration;

    public enum OutcomeEnum {
        CONNECTED(String.valueOf("connected")), NO_ANSWER(String.valueOf("no_answer")), LEFT_MESSAGE(String.valueOf("left_message")), LEFT_VOICEMAIL(String.valueOf("left_voicemail")), WRONG_NUMBER(String.valueOf("wrong_number")), BUSY(String.valueOf("busy"));

        // caching enum access
        private static final java.util.EnumSet<OutcomeEnum> values = java.util.EnumSet.allOf(OutcomeEnum.class);

        String value;

        OutcomeEnum (String v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OutcomeEnum fromString(String v) {
            for (OutcomeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    /**
      * Describes the outcome of the call
     **/
    private OutcomeEnum outcome;
    /**
      * The number that made the call
     **/
    private String fromPhoneNumber;
    /**
      * The number called
     **/
    private String toPhoneNumber;
    /**
      * The date and time of the start of the call in UTC. Format: YYYY-MM-DD HH:MM:SS.
     **/
    private OffsetDateTime startTime;
    /**
      * The date and time of the end of the call in UTC. Format: YYYY-MM-DD HH:MM:SS.
     **/
    private OffsetDateTime endTime;
    /**
      * The ID of the person this call is associated with
     **/
    private Integer personId;
    /**
      * The ID of the organization this call is associated with
     **/
    private Integer orgId;
    /**
      * The ID of the deal this call is associated with. A call log can be associated with either a deal or a lead, but not both at once.
     **/
    private Integer dealId;
    /**
      * The ID of the lead in the UUID format this call is associated with. A call log can be associated with either a deal or a lead, but not both at once.
     **/
    private UUID leadId;
    /**
      * The note for the call log in HTML format
     **/
    private String note;
    /**
      * The call log ID, generated when the call log was created
     **/
    private String id;
    /**
      * If the call log has an audio recording attached, the value should be true
     **/
    private Boolean hasRecording;
    /**
      * The company ID of the owner of the call log
     **/
    private Integer companyId;

    /**
    * The ID of the owner of the call log. Please note that a user without account settings access cannot create call logs for other users.
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

    public ResponseCallLogObject userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
    * If specified, this activity will be converted into a call log, with the information provided. When this field is used, you don't need to specify `deal_id`, `person_id` or `org_id`, as they will be ignored in favor of the values already available in the activity. The `activity_id` must refer to a `call` type activity.
    * @return activityId
    **/
    @JsonProperty("activity_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getActivityId() {
        return activityId;
    }

    /**
     * Set activityId
     **/
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public ResponseCallLogObject activityId(Integer activityId) {
        this.activityId = activityId;
        return this;
    }

    /**
    * The name of the activity this call is attached to
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

    public ResponseCallLogObject subject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
    * The duration of the call in seconds
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

    public ResponseCallLogObject duration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
    * Describes the outcome of the call
    * @return outcome
    **/
    @JsonProperty("outcome")
    public OutcomeEnum getOutcome() {
        return outcome;
    }

    /**
     * Set outcome
     **/
    public void setOutcome(OutcomeEnum outcome) {
        this.outcome = outcome;
    }

    public ResponseCallLogObject outcome(OutcomeEnum outcome) {
        this.outcome = outcome;
        return this;
    }

    /**
    * The number that made the call
    * @return fromPhoneNumber
    **/
    @JsonProperty("from_phone_number")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getFromPhoneNumber() {
        return fromPhoneNumber;
    }

    /**
     * Set fromPhoneNumber
     **/
    public void setFromPhoneNumber(String fromPhoneNumber) {
        this.fromPhoneNumber = fromPhoneNumber;
    }

    public ResponseCallLogObject fromPhoneNumber(String fromPhoneNumber) {
        this.fromPhoneNumber = fromPhoneNumber;
        return this;
    }

    /**
    * The number called
    * @return toPhoneNumber
    **/
    @JsonProperty("to_phone_number")
    public String getToPhoneNumber() {
        return toPhoneNumber;
    }

    /**
     * Set toPhoneNumber
     **/
    public void setToPhoneNumber(String toPhoneNumber) {
        this.toPhoneNumber = toPhoneNumber;
    }

    public ResponseCallLogObject toPhoneNumber(String toPhoneNumber) {
        this.toPhoneNumber = toPhoneNumber;
        return this;
    }

    /**
    * The date and time of the start of the call in UTC. Format: YYYY-MM-DD HH:MM:SS.
    * @return startTime
    **/
    @JsonProperty("start_time")
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    /**
     * Set startTime
     **/
    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public ResponseCallLogObject startTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
    * The date and time of the end of the call in UTC. Format: YYYY-MM-DD HH:MM:SS.
    * @return endTime
    **/
    @JsonProperty("end_time")
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    /**
     * Set endTime
     **/
    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public ResponseCallLogObject endTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
    * The ID of the person this call is associated with
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

    public ResponseCallLogObject personId(Integer personId) {
        this.personId = personId;
        return this;
    }

    /**
    * The ID of the organization this call is associated with
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

    public ResponseCallLogObject orgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }

    /**
    * The ID of the deal this call is associated with. A call log can be associated with either a deal or a lead, but not both at once.
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

    public ResponseCallLogObject dealId(Integer dealId) {
        this.dealId = dealId;
        return this;
    }

    /**
    * The ID of the lead in the UUID format this call is associated with. A call log can be associated with either a deal or a lead, but not both at once.
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

    public ResponseCallLogObject leadId(UUID leadId) {
        this.leadId = leadId;
        return this;
    }

    /**
    * The note for the call log in HTML format
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

    public ResponseCallLogObject note(String note) {
        this.note = note;
        return this;
    }

    /**
    * The call log ID, generated when the call log was created
    * @return id
    **/
    @JsonProperty("id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(String id) {
        this.id = id;
    }

    public ResponseCallLogObject id(String id) {
        this.id = id;
        return this;
    }

    /**
    * If the call log has an audio recording attached, the value should be true
    * @return hasRecording
    **/
    @JsonProperty("has_recording")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getHasRecording() {
        return hasRecording;
    }

    /**
     * Set hasRecording
     **/
    public void setHasRecording(Boolean hasRecording) {
        this.hasRecording = hasRecording;
    }

    public ResponseCallLogObject hasRecording(Boolean hasRecording) {
        this.hasRecording = hasRecording;
        return this;
    }

    /**
    * The company ID of the owner of the call log
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

    public ResponseCallLogObject companyId(Integer companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseCallLogObject {\n");

        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
        sb.append("    fromPhoneNumber: ").append(toIndentedString(fromPhoneNumber)).append("\n");
        sb.append("    toPhoneNumber: ").append(toIndentedString(toPhoneNumber)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
        sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
        sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
        sb.append("    leadId: ").append(toIndentedString(leadId)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    hasRecording: ").append(toIndentedString(hasRecording)).append("\n");
        sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code ResponseCallLogObject} object that
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

        ResponseCallLogObject model = (ResponseCallLogObject) obj;

        return java.util.Objects.equals(userId, model.userId) &&
        java.util.Objects.equals(activityId, model.activityId) &&
        java.util.Objects.equals(subject, model.subject) &&
        java.util.Objects.equals(duration, model.duration) &&
        java.util.Objects.equals(outcome, model.outcome) &&
        java.util.Objects.equals(fromPhoneNumber, model.fromPhoneNumber) &&
        java.util.Objects.equals(toPhoneNumber, model.toPhoneNumber) &&
        java.util.Objects.equals(startTime, model.startTime) &&
        java.util.Objects.equals(endTime, model.endTime) &&
        java.util.Objects.equals(personId, model.personId) &&
        java.util.Objects.equals(orgId, model.orgId) &&
        java.util.Objects.equals(dealId, model.dealId) &&
        java.util.Objects.equals(leadId, model.leadId) &&
        java.util.Objects.equals(note, model.note) &&
        java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(hasRecording, model.hasRecording) &&
        java.util.Objects.equals(companyId, model.companyId);
    }

    /**
     * Returns a hash code for a {@code ResponseCallLogObject}.
     *
     * @return a hash code value for a {@code ResponseCallLogObject}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(userId,
        activityId,
        subject,
        duration,
        outcome,
        fromPhoneNumber,
        toPhoneNumber,
        startTime,
        endTime,
        personId,
        orgId,
        dealId,
        leadId,
        note,
        id,
        hasRecording,
        companyId);
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
    public static class ResponseCallLogObjectQueryParam  {

        @jakarta.ws.rs.QueryParam("userId")
        private Integer userId;
        @jakarta.ws.rs.QueryParam("activityId")
        private Integer activityId;
        @jakarta.ws.rs.QueryParam("subject")
        private String subject;
        @jakarta.ws.rs.QueryParam("duration")
        private String duration;

    public enum OutcomeEnum {
        CONNECTED(String.valueOf("connected")), NO_ANSWER(String.valueOf("no_answer")), LEFT_MESSAGE(String.valueOf("left_message")), LEFT_VOICEMAIL(String.valueOf("left_voicemail")), WRONG_NUMBER(String.valueOf("wrong_number")), BUSY(String.valueOf("busy"));

        // caching enum access
        private static final java.util.EnumSet<OutcomeEnum> values = java.util.EnumSet.allOf(OutcomeEnum.class);

        String value;

        OutcomeEnum (String v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OutcomeEnum fromString(String v) {
            for (OutcomeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private OutcomeEnum outcome;
        @jakarta.ws.rs.QueryParam("fromPhoneNumber")
        private String fromPhoneNumber;
        @jakarta.ws.rs.QueryParam("toPhoneNumber")
        private String toPhoneNumber;
        @jakarta.ws.rs.QueryParam("startTime")
        private OffsetDateTime startTime;
        @jakarta.ws.rs.QueryParam("endTime")
        private OffsetDateTime endTime;
        @jakarta.ws.rs.QueryParam("personId")
        private Integer personId;
        @jakarta.ws.rs.QueryParam("orgId")
        private Integer orgId;
        @jakarta.ws.rs.QueryParam("dealId")
        private Integer dealId;
        @jakarta.ws.rs.QueryParam("leadId")
        private UUID leadId;
        @jakarta.ws.rs.QueryParam("note")
        private String note;
        @jakarta.ws.rs.QueryParam("id")
        private String id;
        @jakarta.ws.rs.QueryParam("hasRecording")
        private Boolean hasRecording;
        @jakarta.ws.rs.QueryParam("companyId")
        private Integer companyId;

        /**
        * The ID of the owner of the call log. Please note that a user without account settings access cannot create call logs for other users.
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

        public ResponseCallLogObjectQueryParam userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        /**
        * If specified, this activity will be converted into a call log, with the information provided. When this field is used, you don't need to specify `deal_id`, `person_id` or `org_id`, as they will be ignored in favor of the values already available in the activity. The `activity_id` must refer to a `call` type activity.
        * @return activityId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("activity_id")
        public Integer getActivityId() {
            return activityId;
        }

        /**
         * Set activityId
         **/
        public void setActivityId(Integer activityId) {
            this.activityId = activityId;
        }

        public ResponseCallLogObjectQueryParam activityId(Integer activityId) {
            this.activityId = activityId;
            return this;
        }

        /**
        * The name of the activity this call is attached to
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

        public ResponseCallLogObjectQueryParam subject(String subject) {
            this.subject = subject;
            return this;
        }

        /**
        * The duration of the call in seconds
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

        public ResponseCallLogObjectQueryParam duration(String duration) {
            this.duration = duration;
            return this;
        }

        /**
        * Describes the outcome of the call
        * @return outcome
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("outcome")
        public OutcomeEnum getOutcome() {
            return outcome;
        }

        /**
         * Set outcome
         **/
        public void setOutcome(OutcomeEnum outcome) {
            this.outcome = outcome;
        }

        public ResponseCallLogObjectQueryParam outcome(OutcomeEnum outcome) {
            this.outcome = outcome;
            return this;
        }

        /**
        * The number that made the call
        * @return fromPhoneNumber
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("from_phone_number")
        public String getFromPhoneNumber() {
            return fromPhoneNumber;
        }

        /**
         * Set fromPhoneNumber
         **/
        public void setFromPhoneNumber(String fromPhoneNumber) {
            this.fromPhoneNumber = fromPhoneNumber;
        }

        public ResponseCallLogObjectQueryParam fromPhoneNumber(String fromPhoneNumber) {
            this.fromPhoneNumber = fromPhoneNumber;
            return this;
        }

        /**
        * The number called
        * @return toPhoneNumber
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("to_phone_number")
        public String getToPhoneNumber() {
            return toPhoneNumber;
        }

        /**
         * Set toPhoneNumber
         **/
        public void setToPhoneNumber(String toPhoneNumber) {
            this.toPhoneNumber = toPhoneNumber;
        }

        public ResponseCallLogObjectQueryParam toPhoneNumber(String toPhoneNumber) {
            this.toPhoneNumber = toPhoneNumber;
            return this;
        }

        /**
        * The date and time of the start of the call in UTC. Format: YYYY-MM-DD HH:MM:SS.
        * @return startTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("start_time")
        public OffsetDateTime getStartTime() {
            return startTime;
        }

        /**
         * Set startTime
         **/
        public void setStartTime(OffsetDateTime startTime) {
            this.startTime = startTime;
        }

        public ResponseCallLogObjectQueryParam startTime(OffsetDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
        * The date and time of the end of the call in UTC. Format: YYYY-MM-DD HH:MM:SS.
        * @return endTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("end_time")
        public OffsetDateTime getEndTime() {
            return endTime;
        }

        /**
         * Set endTime
         **/
        public void setEndTime(OffsetDateTime endTime) {
            this.endTime = endTime;
        }

        public ResponseCallLogObjectQueryParam endTime(OffsetDateTime endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
        * The ID of the person this call is associated with
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

        public ResponseCallLogObjectQueryParam personId(Integer personId) {
            this.personId = personId;
            return this;
        }

        /**
        * The ID of the organization this call is associated with
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

        public ResponseCallLogObjectQueryParam orgId(Integer orgId) {
            this.orgId = orgId;
            return this;
        }

        /**
        * The ID of the deal this call is associated with. A call log can be associated with either a deal or a lead, but not both at once.
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

        public ResponseCallLogObjectQueryParam dealId(Integer dealId) {
            this.dealId = dealId;
            return this;
        }

        /**
        * The ID of the lead in the UUID format this call is associated with. A call log can be associated with either a deal or a lead, but not both at once.
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

        public ResponseCallLogObjectQueryParam leadId(UUID leadId) {
            this.leadId = leadId;
            return this;
        }

        /**
        * The note for the call log in HTML format
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

        public ResponseCallLogObjectQueryParam note(String note) {
            this.note = note;
            return this;
        }

        /**
        * The call log ID, generated when the call log was created
        * @return id
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        public String getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(String id) {
            this.id = id;
        }

        public ResponseCallLogObjectQueryParam id(String id) {
            this.id = id;
            return this;
        }

        /**
        * If the call log has an audio recording attached, the value should be true
        * @return hasRecording
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("has_recording")
        public Boolean getHasRecording() {
            return hasRecording;
        }

        /**
         * Set hasRecording
         **/
        public void setHasRecording(Boolean hasRecording) {
            this.hasRecording = hasRecording;
        }

        public ResponseCallLogObjectQueryParam hasRecording(Boolean hasRecording) {
            this.hasRecording = hasRecording;
            return this;
        }

        /**
        * The company ID of the owner of the call log
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

        public ResponseCallLogObjectQueryParam companyId(Integer companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ResponseCallLogObjectQueryParam {\n");

            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
            sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
            sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
            sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
            sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
            sb.append("    fromPhoneNumber: ").append(toIndentedString(fromPhoneNumber)).append("\n");
            sb.append("    toPhoneNumber: ").append(toIndentedString(toPhoneNumber)).append("\n");
            sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
            sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
            sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
            sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
            sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
            sb.append("    leadId: ").append(toIndentedString(leadId)).append("\n");
            sb.append("    note: ").append(toIndentedString(note)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    hasRecording: ").append(toIndentedString(hasRecording)).append("\n");
            sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
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
