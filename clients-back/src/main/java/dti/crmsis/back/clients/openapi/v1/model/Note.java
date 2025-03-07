package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.NoteDeal;
import dti.crmsis.back.clients.openapi.v1.model.NoteOrganization;
import dti.crmsis.back.clients.openapi.v1.model.NotePerson;
import dti.crmsis.back.clients.openapi.v1.model.NoteUser;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Note  {

    /**
      * The ID of the note
     **/
    private Integer id;
    /**
      * Whether the note is active or deleted
     **/
    private Boolean activeFlag;
    /**
      * The creation date and time of the note
     **/
    private String addTime;
    /**
      * The content of the note in HTML format. Subject to sanitization on the back-end.
     **/
    private String content;
    private NoteDeal deal;
    /**
      * The ID of the lead the note is attached to
     **/
    private UUID leadId;
    /**
      * The ID of the deal the note is attached to
     **/
    private Integer dealId;
    /**
      * The ID of the user who last updated the note
     **/
    private Integer lastUpdateUserId;
    /**
      * The ID of the organization the note is attached to
     **/
    private Integer orgId;
    private NoteOrganization organization;
    private NotePerson person;
    /**
      * The ID of the person the note is attached to
     **/
    private Integer personId;
    /**
      * If true, the results are filtered by note to deal pinning state
     **/
    private Boolean pinnedToDealFlag;
    /**
      * If true, the results are filtered by note to organization pinning state
     **/
    private Boolean pinnedToOrganizationFlag;
    /**
      * If true, the results are filtered by note to person pinning state
     **/
    private Boolean pinnedToPersonFlag;
    /**
      * The last updated date and time of the note
     **/
    private String updateTime;
    private NoteUser user;
    /**
      * The ID of the note creator
     **/
    private Integer userId;

    /**
    * The ID of the note
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

    public Note id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * Whether the note is active or deleted
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

    public Note activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * The creation date and time of the note
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

    public Note addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The content of the note in HTML format. Subject to sanitization on the back-end.
    * @return content
    **/
    @JsonProperty("content")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getContent() {
        return content;
    }

    /**
     * Set content
     **/
    public void setContent(String content) {
        this.content = content;
    }

    public Note content(String content) {
        this.content = content;
        return this;
    }

    /**
    * Get deal
    * @return deal
    **/
    @JsonProperty("deal")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NoteDeal getDeal() {
        return deal;
    }

    /**
     * Set deal
     **/
    public void setDeal(NoteDeal deal) {
        this.deal = deal;
    }

    public Note deal(NoteDeal deal) {
        this.deal = deal;
        return this;
    }

    /**
    * The ID of the lead the note is attached to
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

    public Note leadId(UUID leadId) {
        this.leadId = leadId;
        return this;
    }

    /**
    * The ID of the deal the note is attached to
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

    public Note dealId(Integer dealId) {
        this.dealId = dealId;
        return this;
    }

    /**
    * The ID of the user who last updated the note
    * @return lastUpdateUserId
    **/
    @JsonProperty("last_update_user_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    /**
     * Set lastUpdateUserId
     **/
    public void setLastUpdateUserId(Integer lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    public Note lastUpdateUserId(Integer lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
        return this;
    }

    /**
    * The ID of the organization the note is attached to
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

    public Note orgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }

    /**
    * Get organization
    * @return organization
    **/
    @JsonProperty("organization")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NoteOrganization getOrganization() {
        return organization;
    }

    /**
     * Set organization
     **/
    public void setOrganization(NoteOrganization organization) {
        this.organization = organization;
    }

    public Note organization(NoteOrganization organization) {
        this.organization = organization;
        return this;
    }

    /**
    * Get person
    * @return person
    **/
    @JsonProperty("person")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NotePerson getPerson() {
        return person;
    }

    /**
     * Set person
     **/
    public void setPerson(NotePerson person) {
        this.person = person;
    }

    public Note person(NotePerson person) {
        this.person = person;
        return this;
    }

    /**
    * The ID of the person the note is attached to
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

    public Note personId(Integer personId) {
        this.personId = personId;
        return this;
    }

    /**
    * If true, the results are filtered by note to deal pinning state
    * @return pinnedToDealFlag
    **/
    @JsonProperty("pinned_to_deal_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPinnedToDealFlag() {
        return pinnedToDealFlag;
    }

    /**
     * Set pinnedToDealFlag
     **/
    public void setPinnedToDealFlag(Boolean pinnedToDealFlag) {
        this.pinnedToDealFlag = pinnedToDealFlag;
    }

    public Note pinnedToDealFlag(Boolean pinnedToDealFlag) {
        this.pinnedToDealFlag = pinnedToDealFlag;
        return this;
    }

    /**
    * If true, the results are filtered by note to organization pinning state
    * @return pinnedToOrganizationFlag
    **/
    @JsonProperty("pinned_to_organization_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPinnedToOrganizationFlag() {
        return pinnedToOrganizationFlag;
    }

    /**
     * Set pinnedToOrganizationFlag
     **/
    public void setPinnedToOrganizationFlag(Boolean pinnedToOrganizationFlag) {
        this.pinnedToOrganizationFlag = pinnedToOrganizationFlag;
    }

    public Note pinnedToOrganizationFlag(Boolean pinnedToOrganizationFlag) {
        this.pinnedToOrganizationFlag = pinnedToOrganizationFlag;
        return this;
    }

    /**
    * If true, the results are filtered by note to person pinning state
    * @return pinnedToPersonFlag
    **/
    @JsonProperty("pinned_to_person_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPinnedToPersonFlag() {
        return pinnedToPersonFlag;
    }

    /**
     * Set pinnedToPersonFlag
     **/
    public void setPinnedToPersonFlag(Boolean pinnedToPersonFlag) {
        this.pinnedToPersonFlag = pinnedToPersonFlag;
    }

    public Note pinnedToPersonFlag(Boolean pinnedToPersonFlag) {
        this.pinnedToPersonFlag = pinnedToPersonFlag;
        return this;
    }

    /**
    * The last updated date and time of the note
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

    public Note updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
    * Get user
    * @return user
    **/
    @JsonProperty("user")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NoteUser getUser() {
        return user;
    }

    /**
     * Set user
     **/
    public void setUser(NoteUser user) {
        this.user = user;
    }

    public Note user(NoteUser user) {
        this.user = user;
        return this;
    }

    /**
    * The ID of the note creator
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

    public Note userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Note {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    deal: ").append(toIndentedString(deal)).append("\n");
        sb.append("    leadId: ").append(toIndentedString(leadId)).append("\n");
        sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
        sb.append("    lastUpdateUserId: ").append(toIndentedString(lastUpdateUserId)).append("\n");
        sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    person: ").append(toIndentedString(person)).append("\n");
        sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
        sb.append("    pinnedToDealFlag: ").append(toIndentedString(pinnedToDealFlag)).append("\n");
        sb.append("    pinnedToOrganizationFlag: ").append(toIndentedString(pinnedToOrganizationFlag)).append("\n");
        sb.append("    pinnedToPersonFlag: ").append(toIndentedString(pinnedToPersonFlag)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code Note} object that
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

        Note model = (Note) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(content, model.content) &&
        java.util.Objects.equals(deal, model.deal) &&
        java.util.Objects.equals(leadId, model.leadId) &&
        java.util.Objects.equals(dealId, model.dealId) &&
        java.util.Objects.equals(lastUpdateUserId, model.lastUpdateUserId) &&
        java.util.Objects.equals(orgId, model.orgId) &&
        java.util.Objects.equals(organization, model.organization) &&
        java.util.Objects.equals(person, model.person) &&
        java.util.Objects.equals(personId, model.personId) &&
        java.util.Objects.equals(pinnedToDealFlag, model.pinnedToDealFlag) &&
        java.util.Objects.equals(pinnedToOrganizationFlag, model.pinnedToOrganizationFlag) &&
        java.util.Objects.equals(pinnedToPersonFlag, model.pinnedToPersonFlag) &&
        java.util.Objects.equals(updateTime, model.updateTime) &&
        java.util.Objects.equals(user, model.user) &&
        java.util.Objects.equals(userId, model.userId);
    }

    /**
     * Returns a hash code for a {@code Note}.
     *
     * @return a hash code value for a {@code Note}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        activeFlag,
        addTime,
        content,
        deal,
        leadId,
        dealId,
        lastUpdateUserId,
        orgId,
        organization,
        person,
        personId,
        pinnedToDealFlag,
        pinnedToOrganizationFlag,
        pinnedToPersonFlag,
        updateTime,
        user,
        userId);
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
    public static class NoteQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        @jakarta.ws.rs.QueryParam("content")
        private String content;
        @jakarta.ws.rs.QueryParam("deal")
        private NoteDeal deal;
        @jakarta.ws.rs.QueryParam("leadId")
        private UUID leadId;
        @jakarta.ws.rs.QueryParam("dealId")
        private Integer dealId;
        @jakarta.ws.rs.QueryParam("lastUpdateUserId")
        private Integer lastUpdateUserId;
        @jakarta.ws.rs.QueryParam("orgId")
        private Integer orgId;
        @jakarta.ws.rs.QueryParam("organization")
        private NoteOrganization organization;
        @jakarta.ws.rs.QueryParam("person")
        private NotePerson person;
        @jakarta.ws.rs.QueryParam("personId")
        private Integer personId;
        @jakarta.ws.rs.QueryParam("pinnedToDealFlag")
        private Boolean pinnedToDealFlag;
        @jakarta.ws.rs.QueryParam("pinnedToOrganizationFlag")
        private Boolean pinnedToOrganizationFlag;
        @jakarta.ws.rs.QueryParam("pinnedToPersonFlag")
        private Boolean pinnedToPersonFlag;
        @jakarta.ws.rs.QueryParam("updateTime")
        private String updateTime;
        @jakarta.ws.rs.QueryParam("user")
        private NoteUser user;
        @jakarta.ws.rs.QueryParam("userId")
        private Integer userId;

        /**
        * The ID of the note
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

        public NoteQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * Whether the note is active or deleted
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

        public NoteQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * The creation date and time of the note
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

        public NoteQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

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

        public NoteQueryParam content(String content) {
            this.content = content;
            return this;
        }

        /**
        * Get deal
        * @return deal
        **/
        @JsonProperty("deal")
        public NoteDeal getDeal() {
            return deal;
        }

        /**
         * Set deal
         **/
        public void setDeal(NoteDeal deal) {
            this.deal = deal;
        }

        public NoteQueryParam deal(NoteDeal deal) {
            this.deal = deal;
            return this;
        }

        /**
        * The ID of the lead the note is attached to
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

        public NoteQueryParam leadId(UUID leadId) {
            this.leadId = leadId;
            return this;
        }

        /**
        * The ID of the deal the note is attached to
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

        public NoteQueryParam dealId(Integer dealId) {
            this.dealId = dealId;
            return this;
        }

        /**
        * The ID of the user who last updated the note
        * @return lastUpdateUserId
        **/
        @JsonProperty("last_update_user_id")
        public Integer getLastUpdateUserId() {
            return lastUpdateUserId;
        }

        /**
         * Set lastUpdateUserId
         **/
        public void setLastUpdateUserId(Integer lastUpdateUserId) {
            this.lastUpdateUserId = lastUpdateUserId;
        }

        public NoteQueryParam lastUpdateUserId(Integer lastUpdateUserId) {
            this.lastUpdateUserId = lastUpdateUserId;
            return this;
        }

        /**
        * The ID of the organization the note is attached to
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

        public NoteQueryParam orgId(Integer orgId) {
            this.orgId = orgId;
            return this;
        }

        /**
        * Get organization
        * @return organization
        **/
        @JsonProperty("organization")
        public NoteOrganization getOrganization() {
            return organization;
        }

        /**
         * Set organization
         **/
        public void setOrganization(NoteOrganization organization) {
            this.organization = organization;
        }

        public NoteQueryParam organization(NoteOrganization organization) {
            this.organization = organization;
            return this;
        }

        /**
        * Get person
        * @return person
        **/
        @JsonProperty("person")
        public NotePerson getPerson() {
            return person;
        }

        /**
         * Set person
         **/
        public void setPerson(NotePerson person) {
            this.person = person;
        }

        public NoteQueryParam person(NotePerson person) {
            this.person = person;
            return this;
        }

        /**
        * The ID of the person the note is attached to
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

        public NoteQueryParam personId(Integer personId) {
            this.personId = personId;
            return this;
        }

        /**
        * If true, the results are filtered by note to deal pinning state
        * @return pinnedToDealFlag
        **/
        @JsonProperty("pinned_to_deal_flag")
        public Boolean getPinnedToDealFlag() {
            return pinnedToDealFlag;
        }

        /**
         * Set pinnedToDealFlag
         **/
        public void setPinnedToDealFlag(Boolean pinnedToDealFlag) {
            this.pinnedToDealFlag = pinnedToDealFlag;
        }

        public NoteQueryParam pinnedToDealFlag(Boolean pinnedToDealFlag) {
            this.pinnedToDealFlag = pinnedToDealFlag;
            return this;
        }

        /**
        * If true, the results are filtered by note to organization pinning state
        * @return pinnedToOrganizationFlag
        **/
        @JsonProperty("pinned_to_organization_flag")
        public Boolean getPinnedToOrganizationFlag() {
            return pinnedToOrganizationFlag;
        }

        /**
         * Set pinnedToOrganizationFlag
         **/
        public void setPinnedToOrganizationFlag(Boolean pinnedToOrganizationFlag) {
            this.pinnedToOrganizationFlag = pinnedToOrganizationFlag;
        }

        public NoteQueryParam pinnedToOrganizationFlag(Boolean pinnedToOrganizationFlag) {
            this.pinnedToOrganizationFlag = pinnedToOrganizationFlag;
            return this;
        }

        /**
        * If true, the results are filtered by note to person pinning state
        * @return pinnedToPersonFlag
        **/
        @JsonProperty("pinned_to_person_flag")
        public Boolean getPinnedToPersonFlag() {
            return pinnedToPersonFlag;
        }

        /**
         * Set pinnedToPersonFlag
         **/
        public void setPinnedToPersonFlag(Boolean pinnedToPersonFlag) {
            this.pinnedToPersonFlag = pinnedToPersonFlag;
        }

        public NoteQueryParam pinnedToPersonFlag(Boolean pinnedToPersonFlag) {
            this.pinnedToPersonFlag = pinnedToPersonFlag;
            return this;
        }

        /**
        * The last updated date and time of the note
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

        public NoteQueryParam updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
        * Get user
        * @return user
        **/
        @JsonProperty("user")
        public NoteUser getUser() {
            return user;
        }

        /**
         * Set user
         **/
        public void setUser(NoteUser user) {
            this.user = user;
        }

        public NoteQueryParam user(NoteUser user) {
            this.user = user;
            return this;
        }

        /**
        * The ID of the note creator
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

        public NoteQueryParam userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class NoteQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    content: ").append(toIndentedString(content)).append("\n");
            sb.append("    deal: ").append(toIndentedString(deal)).append("\n");
            sb.append("    leadId: ").append(toIndentedString(leadId)).append("\n");
            sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
            sb.append("    lastUpdateUserId: ").append(toIndentedString(lastUpdateUserId)).append("\n");
            sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
            sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
            sb.append("    person: ").append(toIndentedString(person)).append("\n");
            sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
            sb.append("    pinnedToDealFlag: ").append(toIndentedString(pinnedToDealFlag)).append("\n");
            sb.append("    pinnedToOrganizationFlag: ").append(toIndentedString(pinnedToOrganizationFlag)).append("\n");
            sb.append("    pinnedToPersonFlag: ").append(toIndentedString(pinnedToPersonFlag)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
            sb.append("    user: ").append(toIndentedString(user)).append("\n");
            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
