package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddNoteRequest  {

    /**
      * The content of the note in HTML format. Subject to sanitization on the back-end.
     **/
    private String content;
    /**
      * The ID of the lead the note will be attached to. This property is required unless one of (`deal_id/person_id/org_id`) is specified.
     **/
    private UUID leadId;
    /**
      * The ID of the deal the note will be attached to. This property is required unless one of (`lead_id/person_id/org_id`) is specified.
     **/
    private Integer dealId;
    /**
      * The ID of the person this note will be attached to. This property is required unless one of (`deal_id/lead_id/org_id`) is specified.
     **/
    private Integer personId;
    /**
      * The ID of the organization this note will be attached to. This property is required unless one of (`deal_id/lead_id/person_id`) is specified.
     **/
    private Integer orgId;
    /**
      * The ID of the user who will be marked as the author of the note. Only an admin can change the author.
     **/
    private Integer userId;
    /**
      * The optional creation date & time of the note in UTC. Can be set in the past or in the future. Format: YYYY-MM-DD HH:MM:SS
     **/
    private String addTime;

    public enum PinnedToLeadFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<PinnedToLeadFlagEnum> values = java.util.EnumSet.allOf(PinnedToLeadFlagEnum.class);

        BigDecimal value;

        PinnedToLeadFlagEnum (BigDecimal v) {
            value = v;
        }

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PinnedToLeadFlagEnum fromString(String v) {
            for (PinnedToLeadFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private PinnedToLeadFlagEnum pinnedToLeadFlag;

    public enum PinnedToDealFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<PinnedToDealFlagEnum> values = java.util.EnumSet.allOf(PinnedToDealFlagEnum.class);

        BigDecimal value;

        PinnedToDealFlagEnum (BigDecimal v) {
            value = v;
        }

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PinnedToDealFlagEnum fromString(String v) {
            for (PinnedToDealFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private PinnedToDealFlagEnum pinnedToDealFlag;

    public enum PinnedToOrganizationFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<PinnedToOrganizationFlagEnum> values = java.util.EnumSet.allOf(PinnedToOrganizationFlagEnum.class);

        BigDecimal value;

        PinnedToOrganizationFlagEnum (BigDecimal v) {
            value = v;
        }

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PinnedToOrganizationFlagEnum fromString(String v) {
            for (PinnedToOrganizationFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private PinnedToOrganizationFlagEnum pinnedToOrganizationFlag;

    public enum PinnedToPersonFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<PinnedToPersonFlagEnum> values = java.util.EnumSet.allOf(PinnedToPersonFlagEnum.class);

        BigDecimal value;

        PinnedToPersonFlagEnum (BigDecimal v) {
            value = v;
        }

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PinnedToPersonFlagEnum fromString(String v) {
            for (PinnedToPersonFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private PinnedToPersonFlagEnum pinnedToPersonFlag;

    /**
    * The content of the note in HTML format. Subject to sanitization on the back-end.
    * @return content
    **/
    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    /**
     * Set content
     **/
    public void setContent(String content) {
        this.content = content;
    }

    public AddNoteRequest content(String content) {
        this.content = content;
        return this;
    }

    /**
    * The ID of the lead the note will be attached to. This property is required unless one of (`deal_id/person_id/org_id`) is specified.
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

    public AddNoteRequest leadId(UUID leadId) {
        this.leadId = leadId;
        return this;
    }

    /**
    * The ID of the deal the note will be attached to. This property is required unless one of (`lead_id/person_id/org_id`) is specified.
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

    public AddNoteRequest dealId(Integer dealId) {
        this.dealId = dealId;
        return this;
    }

    /**
    * The ID of the person this note will be attached to. This property is required unless one of (`deal_id/lead_id/org_id`) is specified.
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

    public AddNoteRequest personId(Integer personId) {
        this.personId = personId;
        return this;
    }

    /**
    * The ID of the organization this note will be attached to. This property is required unless one of (`deal_id/lead_id/person_id`) is specified.
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

    public AddNoteRequest orgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }

    /**
    * The ID of the user who will be marked as the author of the note. Only an admin can change the author.
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

    public AddNoteRequest userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
    * The optional creation date & time of the note in UTC. Can be set in the past or in the future. Format: YYYY-MM-DD HH:MM:SS
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

    public AddNoteRequest addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * Get pinnedToLeadFlag
    * @return pinnedToLeadFlag
    **/
    @JsonProperty("pinned_to_lead_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PinnedToLeadFlagEnum getPinnedToLeadFlag() {
        return pinnedToLeadFlag;
    }

    /**
     * Set pinnedToLeadFlag
     **/
    public void setPinnedToLeadFlag(PinnedToLeadFlagEnum pinnedToLeadFlag) {
        this.pinnedToLeadFlag = pinnedToLeadFlag;
    }

    public AddNoteRequest pinnedToLeadFlag(PinnedToLeadFlagEnum pinnedToLeadFlag) {
        this.pinnedToLeadFlag = pinnedToLeadFlag;
        return this;
    }

    /**
    * Get pinnedToDealFlag
    * @return pinnedToDealFlag
    **/
    @JsonProperty("pinned_to_deal_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PinnedToDealFlagEnum getPinnedToDealFlag() {
        return pinnedToDealFlag;
    }

    /**
     * Set pinnedToDealFlag
     **/
    public void setPinnedToDealFlag(PinnedToDealFlagEnum pinnedToDealFlag) {
        this.pinnedToDealFlag = pinnedToDealFlag;
    }

    public AddNoteRequest pinnedToDealFlag(PinnedToDealFlagEnum pinnedToDealFlag) {
        this.pinnedToDealFlag = pinnedToDealFlag;
        return this;
    }

    /**
    * Get pinnedToOrganizationFlag
    * @return pinnedToOrganizationFlag
    **/
    @JsonProperty("pinned_to_organization_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PinnedToOrganizationFlagEnum getPinnedToOrganizationFlag() {
        return pinnedToOrganizationFlag;
    }

    /**
     * Set pinnedToOrganizationFlag
     **/
    public void setPinnedToOrganizationFlag(PinnedToOrganizationFlagEnum pinnedToOrganizationFlag) {
        this.pinnedToOrganizationFlag = pinnedToOrganizationFlag;
    }

    public AddNoteRequest pinnedToOrganizationFlag(PinnedToOrganizationFlagEnum pinnedToOrganizationFlag) {
        this.pinnedToOrganizationFlag = pinnedToOrganizationFlag;
        return this;
    }

    /**
    * Get pinnedToPersonFlag
    * @return pinnedToPersonFlag
    **/
    @JsonProperty("pinned_to_person_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PinnedToPersonFlagEnum getPinnedToPersonFlag() {
        return pinnedToPersonFlag;
    }

    /**
     * Set pinnedToPersonFlag
     **/
    public void setPinnedToPersonFlag(PinnedToPersonFlagEnum pinnedToPersonFlag) {
        this.pinnedToPersonFlag = pinnedToPersonFlag;
    }

    public AddNoteRequest pinnedToPersonFlag(PinnedToPersonFlagEnum pinnedToPersonFlag) {
        this.pinnedToPersonFlag = pinnedToPersonFlag;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddNoteRequest {\n");

        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    leadId: ").append(toIndentedString(leadId)).append("\n");
        sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
        sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
        sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    pinnedToLeadFlag: ").append(toIndentedString(pinnedToLeadFlag)).append("\n");
        sb.append("    pinnedToDealFlag: ").append(toIndentedString(pinnedToDealFlag)).append("\n");
        sb.append("    pinnedToOrganizationFlag: ").append(toIndentedString(pinnedToOrganizationFlag)).append("\n");
        sb.append("    pinnedToPersonFlag: ").append(toIndentedString(pinnedToPersonFlag)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddNoteRequest} object that
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

        AddNoteRequest model = (AddNoteRequest) obj;

        return java.util.Objects.equals(content, model.content) &&
        java.util.Objects.equals(leadId, model.leadId) &&
        java.util.Objects.equals(dealId, model.dealId) &&
        java.util.Objects.equals(personId, model.personId) &&
        java.util.Objects.equals(orgId, model.orgId) &&
        java.util.Objects.equals(userId, model.userId) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(pinnedToLeadFlag, model.pinnedToLeadFlag) &&
        java.util.Objects.equals(pinnedToDealFlag, model.pinnedToDealFlag) &&
        java.util.Objects.equals(pinnedToOrganizationFlag, model.pinnedToOrganizationFlag) &&
        java.util.Objects.equals(pinnedToPersonFlag, model.pinnedToPersonFlag);
    }

    /**
     * Returns a hash code for a {@code AddNoteRequest}.
     *
     * @return a hash code value for a {@code AddNoteRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(content,
        leadId,
        dealId,
        personId,
        orgId,
        userId,
        addTime,
        pinnedToLeadFlag,
        pinnedToDealFlag,
        pinnedToOrganizationFlag,
        pinnedToPersonFlag);
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
    public static class AddNoteRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("content")
        private String content;
        @jakarta.ws.rs.QueryParam("leadId")
        private UUID leadId;
        @jakarta.ws.rs.QueryParam("dealId")
        private Integer dealId;
        @jakarta.ws.rs.QueryParam("personId")
        private Integer personId;
        @jakarta.ws.rs.QueryParam("orgId")
        private Integer orgId;
        @jakarta.ws.rs.QueryParam("userId")
        private Integer userId;
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;

    public enum PinnedToLeadFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<PinnedToLeadFlagEnum> values = java.util.EnumSet.allOf(PinnedToLeadFlagEnum.class);

        BigDecimal value;

        PinnedToLeadFlagEnum (BigDecimal v) {
            value = v;
        }

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PinnedToLeadFlagEnum fromString(String v) {
            for (PinnedToLeadFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private PinnedToLeadFlagEnum pinnedToLeadFlag;

    public enum PinnedToDealFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<PinnedToDealFlagEnum> values = java.util.EnumSet.allOf(PinnedToDealFlagEnum.class);

        BigDecimal value;

        PinnedToDealFlagEnum (BigDecimal v) {
            value = v;
        }

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PinnedToDealFlagEnum fromString(String v) {
            for (PinnedToDealFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private PinnedToDealFlagEnum pinnedToDealFlag;

    public enum PinnedToOrganizationFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<PinnedToOrganizationFlagEnum> values = java.util.EnumSet.allOf(PinnedToOrganizationFlagEnum.class);

        BigDecimal value;

        PinnedToOrganizationFlagEnum (BigDecimal v) {
            value = v;
        }

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PinnedToOrganizationFlagEnum fromString(String v) {
            for (PinnedToOrganizationFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private PinnedToOrganizationFlagEnum pinnedToOrganizationFlag;

    public enum PinnedToPersonFlagEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<PinnedToPersonFlagEnum> values = java.util.EnumSet.allOf(PinnedToPersonFlagEnum.class);

        BigDecimal value;

        PinnedToPersonFlagEnum (BigDecimal v) {
            value = v;
        }

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PinnedToPersonFlagEnum fromString(String v) {
            for (PinnedToPersonFlagEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private PinnedToPersonFlagEnum pinnedToPersonFlag;

        /**
        * The content of the note in HTML format. Subject to sanitization on the back-end.
        * @return content
        **/
        @JsonProperty("content")
        public String getContent() {
            return content;
        }

        /**
         * Set content
         **/
        public void setContent(String content) {
            this.content = content;
        }

        public AddNoteRequestQueryParam content(String content) {
            this.content = content;
            return this;
        }

        /**
        * The ID of the lead the note will be attached to. This property is required unless one of (`deal_id/person_id/org_id`) is specified.
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

        public AddNoteRequestQueryParam leadId(UUID leadId) {
            this.leadId = leadId;
            return this;
        }

        /**
        * The ID of the deal the note will be attached to. This property is required unless one of (`lead_id/person_id/org_id`) is specified.
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

        public AddNoteRequestQueryParam dealId(Integer dealId) {
            this.dealId = dealId;
            return this;
        }

        /**
        * The ID of the person this note will be attached to. This property is required unless one of (`deal_id/lead_id/org_id`) is specified.
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

        public AddNoteRequestQueryParam personId(Integer personId) {
            this.personId = personId;
            return this;
        }

        /**
        * The ID of the organization this note will be attached to. This property is required unless one of (`deal_id/lead_id/person_id`) is specified.
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

        public AddNoteRequestQueryParam orgId(Integer orgId) {
            this.orgId = orgId;
            return this;
        }

        /**
        * The ID of the user who will be marked as the author of the note. Only an admin can change the author.
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

        public AddNoteRequestQueryParam userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        /**
        * The optional creation date & time of the note in UTC. Can be set in the past or in the future. Format: YYYY-MM-DD HH:MM:SS
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

        public AddNoteRequestQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * Get pinnedToLeadFlag
        * @return pinnedToLeadFlag
        **/
        @JsonProperty("pinned_to_lead_flag")
        public PinnedToLeadFlagEnum getPinnedToLeadFlag() {
            return pinnedToLeadFlag;
        }

        /**
         * Set pinnedToLeadFlag
         **/
        public void setPinnedToLeadFlag(PinnedToLeadFlagEnum pinnedToLeadFlag) {
            this.pinnedToLeadFlag = pinnedToLeadFlag;
        }

        public AddNoteRequestQueryParam pinnedToLeadFlag(PinnedToLeadFlagEnum pinnedToLeadFlag) {
            this.pinnedToLeadFlag = pinnedToLeadFlag;
            return this;
        }

        /**
        * Get pinnedToDealFlag
        * @return pinnedToDealFlag
        **/
        @JsonProperty("pinned_to_deal_flag")
        public PinnedToDealFlagEnum getPinnedToDealFlag() {
            return pinnedToDealFlag;
        }

        /**
         * Set pinnedToDealFlag
         **/
        public void setPinnedToDealFlag(PinnedToDealFlagEnum pinnedToDealFlag) {
            this.pinnedToDealFlag = pinnedToDealFlag;
        }

        public AddNoteRequestQueryParam pinnedToDealFlag(PinnedToDealFlagEnum pinnedToDealFlag) {
            this.pinnedToDealFlag = pinnedToDealFlag;
            return this;
        }

        /**
        * Get pinnedToOrganizationFlag
        * @return pinnedToOrganizationFlag
        **/
        @JsonProperty("pinned_to_organization_flag")
        public PinnedToOrganizationFlagEnum getPinnedToOrganizationFlag() {
            return pinnedToOrganizationFlag;
        }

        /**
         * Set pinnedToOrganizationFlag
         **/
        public void setPinnedToOrganizationFlag(PinnedToOrganizationFlagEnum pinnedToOrganizationFlag) {
            this.pinnedToOrganizationFlag = pinnedToOrganizationFlag;
        }

        public AddNoteRequestQueryParam pinnedToOrganizationFlag(PinnedToOrganizationFlagEnum pinnedToOrganizationFlag) {
            this.pinnedToOrganizationFlag = pinnedToOrganizationFlag;
            return this;
        }

        /**
        * Get pinnedToPersonFlag
        * @return pinnedToPersonFlag
        **/
        @JsonProperty("pinned_to_person_flag")
        public PinnedToPersonFlagEnum getPinnedToPersonFlag() {
            return pinnedToPersonFlag;
        }

        /**
         * Set pinnedToPersonFlag
         **/
        public void setPinnedToPersonFlag(PinnedToPersonFlagEnum pinnedToPersonFlag) {
            this.pinnedToPersonFlag = pinnedToPersonFlag;
        }

        public AddNoteRequestQueryParam pinnedToPersonFlag(PinnedToPersonFlagEnum pinnedToPersonFlag) {
            this.pinnedToPersonFlag = pinnedToPersonFlag;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddNoteRequestQueryParam {\n");

            sb.append("    content: ").append(toIndentedString(content)).append("\n");
            sb.append("    leadId: ").append(toIndentedString(leadId)).append("\n");
            sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
            sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
            sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    pinnedToLeadFlag: ").append(toIndentedString(pinnedToLeadFlag)).append("\n");
            sb.append("    pinnedToDealFlag: ").append(toIndentedString(pinnedToDealFlag)).append("\n");
            sb.append("    pinnedToOrganizationFlag: ").append(toIndentedString(pinnedToOrganizationFlag)).append("\n");
            sb.append("    pinnedToPersonFlag: ").append(toIndentedString(pinnedToPersonFlag)).append("\n");
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
