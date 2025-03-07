package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.LeadValue;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Lead  {

    /**
      * The unique ID of the lead in the UUID format
     **/
    private UUID id;
    /**
      * The title of the lead
     **/
    private String title;
    /**
      * The ID of the user who owns the lead
     **/
    private Integer ownerId;
    /**
      * The ID of the user who created the lead
     **/
    private Integer creatorId;
    /**
      * The IDs of the lead labels which are associated with the lead
     **/
    private List<UUID> labelIds;
    /**
      * The ID of a person which this lead is linked to
     **/
    private Integer personId;
    /**
      * The ID of an organization which this lead is linked to
     **/
    private Integer organizationId;
    /**
      * Defines where the lead comes from. Will be `API` if the lead was created through the Public API and will be `Manually created` if the lead was created manually through the UI. 
     **/
    private String sourceName;
    /**
      * The way this Lead was created. `origin` field is set by Pipedrive when Lead is created and cannot be changed.
     **/
    private String origin;
    /**
      * The optional ID to further distinguish the origin of the lead - e.g. Which API integration created this Lead.
     **/
    private String originId;
    /**
      * The ID of your Marketing channel this Lead was created from. Recognized Marketing channels can be configured in your <a href=\"https://app.pipedrive.com/settings/fields\" target=\"_blank\" rel=\"noopener noreferrer\">Company settings</a>.
     **/
    private Integer channel;
    /**
      * The optional ID to further distinguish the Marketing channel.
     **/
    private String channelId;
    /**
      * A flag indicating whether the lead is archived or not
     **/
    private Boolean isArchived;
    /**
      * A flag indicating whether the lead was seen by someone in the Pipedrive UI
     **/
    private Boolean wasSeen;
    private LeadValue value;
    /**
      * The date of when the deal which will be created from the lead is expected to be closed. In ISO 8601 format: YYYY-MM-DD.
     **/
    private LocalDate expectedCloseDate;
    /**
      * The ID of the next activity associated with the lead
     **/
    private Integer nextActivityId;
    /**
      * The date and time of when the lead was created. In ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
     **/
    private OffsetDateTime addTime;
    /**
      * The date and time of when the lead was last updated. In ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
     **/
    private OffsetDateTime updateTime;

    public enum VisibleToEnum {
        _1(String.valueOf("1")), _3(String.valueOf("3")), _5(String.valueOf("5")), _7(String.valueOf("7"));

        // caching enum access
        private static final java.util.EnumSet<VisibleToEnum> values = java.util.EnumSet.allOf(VisibleToEnum.class);

        String value;

        VisibleToEnum (String v) {
            value = v;
        }

        @JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static VisibleToEnum fromString(String v) {
            for (VisibleToEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private VisibleToEnum visibleTo;
    /**
      * The BCC email of the lead
     **/
    private String ccEmail;

    /**
    * The unique ID of the lead in the UUID format
    * @return id
    **/
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(UUID id) {
        this.id = id;
    }

    public Lead id(UUID id) {
        this.id = id;
        return this;
    }

    /**
    * The title of the lead
    * @return title
    **/
    @JsonProperty("title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTitle() {
        return title;
    }

    /**
     * Set title
     **/
    public void setTitle(String title) {
        this.title = title;
    }

    public Lead title(String title) {
        this.title = title;
        return this;
    }

    /**
    * The ID of the user who owns the lead
    * @return ownerId
    **/
    @JsonProperty("owner_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     * Set ownerId
     **/
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Lead ownerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
    * The ID of the user who created the lead
    * @return creatorId
    **/
    @JsonProperty("creator_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCreatorId() {
        return creatorId;
    }

    /**
     * Set creatorId
     **/
    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public Lead creatorId(Integer creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
    * The IDs of the lead labels which are associated with the lead
    * @return labelIds
    **/
    @JsonProperty("label_ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<UUID> getLabelIds() {
        return labelIds;
    }

    /**
     * Set labelIds
     **/
    public void setLabelIds(List<UUID> labelIds) {
        this.labelIds = labelIds;
    }

    public Lead labelIds(List<UUID> labelIds) {
        this.labelIds = labelIds;
        return this;
    }
    public Lead addLabelIdsItem(UUID labelIdsItem) {
        if (this.labelIds == null){
            labelIds = new ArrayList<>();
        }
        this.labelIds.add(labelIdsItem);
        return this;
    }

    /**
    * The ID of a person which this lead is linked to
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

    public Lead personId(Integer personId) {
        this.personId = personId;
        return this;
    }

    /**
    * The ID of an organization which this lead is linked to
    * @return organizationId
    **/
    @JsonProperty("organization_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getOrganizationId() {
        return organizationId;
    }

    /**
     * Set organizationId
     **/
    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public Lead organizationId(Integer organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
    * Defines where the lead comes from. Will be `API` if the lead was created through the Public API and will be `Manually created` if the lead was created manually through the UI. 
    * @return sourceName
    **/
    @JsonProperty("source_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSourceName() {
        return sourceName;
    }

    /**
     * Set sourceName
     **/
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public Lead sourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    /**
    * The way this Lead was created. `origin` field is set by Pipedrive when Lead is created and cannot be changed.
    * @return origin
    **/
    @JsonProperty("origin")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOrigin() {
        return origin;
    }

    /**
     * Set origin
     **/
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Lead origin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
    * The optional ID to further distinguish the origin of the lead - e.g. Which API integration created this Lead.
    * @return originId
    **/
    @JsonProperty("origin_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOriginId() {
        return originId;
    }

    /**
     * Set originId
     **/
    public void setOriginId(String originId) {
        this.originId = originId;
    }

    public Lead originId(String originId) {
        this.originId = originId;
        return this;
    }

    /**
    * The ID of your Marketing channel this Lead was created from. Recognized Marketing channels can be configured in your <a href=\"https://app.pipedrive.com/settings/fields\" target=\"_blank\" rel=\"noopener noreferrer\">Company settings</a>.
    * @return channel
    **/
    @JsonProperty("channel")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getChannel() {
        return channel;
    }

    /**
     * Set channel
     **/
    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Lead channel(Integer channel) {
        this.channel = channel;
        return this;
    }

    /**
    * The optional ID to further distinguish the Marketing channel.
    * @return channelId
    **/
    @JsonProperty("channel_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getChannelId() {
        return channelId;
    }

    /**
     * Set channelId
     **/
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public Lead channelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
    * A flag indicating whether the lead is archived or not
    * @return isArchived
    **/
    @JsonProperty("is_archived")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsArchived() {
        return isArchived;
    }

    /**
     * Set isArchived
     **/
    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    public Lead isArchived(Boolean isArchived) {
        this.isArchived = isArchived;
        return this;
    }

    /**
    * A flag indicating whether the lead was seen by someone in the Pipedrive UI
    * @return wasSeen
    **/
    @JsonProperty("was_seen")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getWasSeen() {
        return wasSeen;
    }

    /**
     * Set wasSeen
     **/
    public void setWasSeen(Boolean wasSeen) {
        this.wasSeen = wasSeen;
    }

    public Lead wasSeen(Boolean wasSeen) {
        this.wasSeen = wasSeen;
        return this;
    }

    /**
    * Get value
    * @return value
    **/
    @JsonProperty("value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LeadValue getValue() {
        return value;
    }

    /**
     * Set value
     **/
    public void setValue(LeadValue value) {
        this.value = value;
    }

    public Lead value(LeadValue value) {
        this.value = value;
        return this;
    }

    /**
    * The date of when the deal which will be created from the lead is expected to be closed. In ISO 8601 format: YYYY-MM-DD.
    * @return expectedCloseDate
    **/
    @JsonProperty("expected_close_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LocalDate getExpectedCloseDate() {
        return expectedCloseDate;
    }

    /**
     * Set expectedCloseDate
     **/
    public void setExpectedCloseDate(LocalDate expectedCloseDate) {
        this.expectedCloseDate = expectedCloseDate;
    }

    public Lead expectedCloseDate(LocalDate expectedCloseDate) {
        this.expectedCloseDate = expectedCloseDate;
        return this;
    }

    /**
    * The ID of the next activity associated with the lead
    * @return nextActivityId
    **/
    @JsonProperty("next_activity_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNextActivityId() {
        return nextActivityId;
    }

    /**
     * Set nextActivityId
     **/
    public void setNextActivityId(Integer nextActivityId) {
        this.nextActivityId = nextActivityId;
    }

    public Lead nextActivityId(Integer nextActivityId) {
        this.nextActivityId = nextActivityId;
        return this;
    }

    /**
    * The date and time of when the lead was created. In ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
    * @return addTime
    **/
    @JsonProperty("add_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OffsetDateTime getAddTime() {
        return addTime;
    }

    /**
     * Set addTime
     **/
    public void setAddTime(OffsetDateTime addTime) {
        this.addTime = addTime;
    }

    public Lead addTime(OffsetDateTime addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The date and time of when the lead was last updated. In ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
    * @return updateTime
    **/
    @JsonProperty("update_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * Set updateTime
     **/
    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Lead updateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
    * Get visibleTo
    * @return visibleTo
    **/
    @JsonProperty("visible_to")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VisibleToEnum getVisibleTo() {
        return visibleTo;
    }

    /**
     * Set visibleTo
     **/
    public void setVisibleTo(VisibleToEnum visibleTo) {
        this.visibleTo = visibleTo;
    }

    public Lead visibleTo(VisibleToEnum visibleTo) {
        this.visibleTo = visibleTo;
        return this;
    }

    /**
    * The BCC email of the lead
    * @return ccEmail
    **/
    @JsonProperty("cc_email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCcEmail() {
        return ccEmail;
    }

    /**
     * Set ccEmail
     **/
    public void setCcEmail(String ccEmail) {
        this.ccEmail = ccEmail;
    }

    public Lead ccEmail(String ccEmail) {
        this.ccEmail = ccEmail;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Lead {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
        sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
        sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
        sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
        sb.append("    originId: ").append(toIndentedString(originId)).append("\n");
        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
        sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
        sb.append("    wasSeen: ").append(toIndentedString(wasSeen)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    expectedCloseDate: ").append(toIndentedString(expectedCloseDate)).append("\n");
        sb.append("    nextActivityId: ").append(toIndentedString(nextActivityId)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
        sb.append("    ccEmail: ").append(toIndentedString(ccEmail)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code Lead} object that
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

        Lead model = (Lead) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(title, model.title) &&
        java.util.Objects.equals(ownerId, model.ownerId) &&
        java.util.Objects.equals(creatorId, model.creatorId) &&
        java.util.Objects.equals(labelIds, model.labelIds) &&
        java.util.Objects.equals(personId, model.personId) &&
        java.util.Objects.equals(organizationId, model.organizationId) &&
        java.util.Objects.equals(sourceName, model.sourceName) &&
        java.util.Objects.equals(origin, model.origin) &&
        java.util.Objects.equals(originId, model.originId) &&
        java.util.Objects.equals(channel, model.channel) &&
        java.util.Objects.equals(channelId, model.channelId) &&
        java.util.Objects.equals(isArchived, model.isArchived) &&
        java.util.Objects.equals(wasSeen, model.wasSeen) &&
        java.util.Objects.equals(value, model.value) &&
        java.util.Objects.equals(expectedCloseDate, model.expectedCloseDate) &&
        java.util.Objects.equals(nextActivityId, model.nextActivityId) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime) &&
        java.util.Objects.equals(visibleTo, model.visibleTo) &&
        java.util.Objects.equals(ccEmail, model.ccEmail);
    }

    /**
     * Returns a hash code for a {@code Lead}.
     *
     * @return a hash code value for a {@code Lead}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        title,
        ownerId,
        creatorId,
        labelIds,
        personId,
        organizationId,
        sourceName,
        origin,
        originId,
        channel,
        channelId,
        isArchived,
        wasSeen,
        value,
        expectedCloseDate,
        nextActivityId,
        addTime,
        updateTime,
        visibleTo,
        ccEmail);
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
    public static class LeadQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private UUID id;
        @jakarta.ws.rs.QueryParam("title")
        private String title;
        @jakarta.ws.rs.QueryParam("ownerId")
        private Integer ownerId;
        @jakarta.ws.rs.QueryParam("creatorId")
        private Integer creatorId;
        @jakarta.ws.rs.QueryParam("labelIds")
        private List<UUID> labelIds = null;
        @jakarta.ws.rs.QueryParam("personId")
        private Integer personId;
        @jakarta.ws.rs.QueryParam("organizationId")
        private Integer organizationId;
        @jakarta.ws.rs.QueryParam("sourceName")
        private String sourceName;
        @jakarta.ws.rs.QueryParam("origin")
        private String origin;
        @jakarta.ws.rs.QueryParam("originId")
        private String originId;
        @jakarta.ws.rs.QueryParam("channel")
        private Integer channel;
        @jakarta.ws.rs.QueryParam("channelId")
        private String channelId;
        @jakarta.ws.rs.QueryParam("isArchived")
        private Boolean isArchived;
        @jakarta.ws.rs.QueryParam("wasSeen")
        private Boolean wasSeen;
        @jakarta.ws.rs.QueryParam("value")
        private LeadValue value;
        @jakarta.ws.rs.QueryParam("expectedCloseDate")
        private LocalDate expectedCloseDate;
        @jakarta.ws.rs.QueryParam("nextActivityId")
        private Integer nextActivityId;
        @jakarta.ws.rs.QueryParam("addTime")
        private OffsetDateTime addTime;
        @jakarta.ws.rs.QueryParam("updateTime")
        private OffsetDateTime updateTime;

    public enum VisibleToEnum {
        _1(String.valueOf("1")), _3(String.valueOf("3")), _5(String.valueOf("5")), _7(String.valueOf("7"));

        // caching enum access
        private static final java.util.EnumSet<VisibleToEnum> values = java.util.EnumSet.allOf(VisibleToEnum.class);

        String value;

        VisibleToEnum (String v) {
            value = v;
        }

        @JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static VisibleToEnum fromString(String v) {
            for (VisibleToEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private VisibleToEnum visibleTo;
        @jakarta.ws.rs.QueryParam("ccEmail")
        private String ccEmail;

        /**
        * The unique ID of the lead in the UUID format
        * @return id
        **/
        @JsonProperty("id")
        public UUID getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(UUID id) {
            this.id = id;
        }

        public LeadQueryParam id(UUID id) {
            this.id = id;
            return this;
        }

        /**
        * The title of the lead
        * @return title
        **/
        @JsonProperty("title")
        public String getTitle() {
            return title;
        }

        /**
         * Set title
         **/
        public void setTitle(String title) {
            this.title = title;
        }

        public LeadQueryParam title(String title) {
            this.title = title;
            return this;
        }

        /**
        * The ID of the user who owns the lead
        * @return ownerId
        **/
        @JsonProperty("owner_id")
        public Integer getOwnerId() {
            return ownerId;
        }

        /**
         * Set ownerId
         **/
        public void setOwnerId(Integer ownerId) {
            this.ownerId = ownerId;
        }

        public LeadQueryParam ownerId(Integer ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
        * The ID of the user who created the lead
        * @return creatorId
        **/
        @JsonProperty("creator_id")
        public Integer getCreatorId() {
            return creatorId;
        }

        /**
         * Set creatorId
         **/
        public void setCreatorId(Integer creatorId) {
            this.creatorId = creatorId;
        }

        public LeadQueryParam creatorId(Integer creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
        * The IDs of the lead labels which are associated with the lead
        * @return labelIds
        **/
        @JsonProperty("label_ids")
        public List<UUID> getLabelIds() {
            return labelIds;
        }

        /**
         * Set labelIds
         **/
        public void setLabelIds(List<UUID> labelIds) {
            this.labelIds = labelIds;
        }

        public LeadQueryParam labelIds(List<UUID> labelIds) {
            this.labelIds = labelIds;
            return this;
        }
        public LeadQueryParam addLabelIdsItem(UUID labelIdsItem) {
            this.labelIds.add(labelIdsItem);
            return this;
        }

        /**
        * The ID of a person which this lead is linked to
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

        public LeadQueryParam personId(Integer personId) {
            this.personId = personId;
            return this;
        }

        /**
        * The ID of an organization which this lead is linked to
        * @return organizationId
        **/
        @JsonProperty("organization_id")
        public Integer getOrganizationId() {
            return organizationId;
        }

        /**
         * Set organizationId
         **/
        public void setOrganizationId(Integer organizationId) {
            this.organizationId = organizationId;
        }

        public LeadQueryParam organizationId(Integer organizationId) {
            this.organizationId = organizationId;
            return this;
        }

        /**
        * Defines where the lead comes from. Will be `API` if the lead was created through the Public API and will be `Manually created` if the lead was created manually through the UI. 
        * @return sourceName
        **/
        @JsonProperty("source_name")
        public String getSourceName() {
            return sourceName;
        }

        /**
         * Set sourceName
         **/
        public void setSourceName(String sourceName) {
            this.sourceName = sourceName;
        }

        public LeadQueryParam sourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }

        /**
        * The way this Lead was created. `origin` field is set by Pipedrive when Lead is created and cannot be changed.
        * @return origin
        **/
        @JsonProperty("origin")
        public String getOrigin() {
            return origin;
        }

        /**
         * Set origin
         **/
        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public LeadQueryParam origin(String origin) {
            this.origin = origin;
            return this;
        }

        /**
        * The optional ID to further distinguish the origin of the lead - e.g. Which API integration created this Lead.
        * @return originId
        **/
        @JsonProperty("origin_id")
        public String getOriginId() {
            return originId;
        }

        /**
         * Set originId
         **/
        public void setOriginId(String originId) {
            this.originId = originId;
        }

        public LeadQueryParam originId(String originId) {
            this.originId = originId;
            return this;
        }

        /**
        * The ID of your Marketing channel this Lead was created from. Recognized Marketing channels can be configured in your <a href=\"https://app.pipedrive.com/settings/fields\" target=\"_blank\" rel=\"noopener noreferrer\">Company settings</a>.
        * @return channel
        **/
        @JsonProperty("channel")
        public Integer getChannel() {
            return channel;
        }

        /**
         * Set channel
         **/
        public void setChannel(Integer channel) {
            this.channel = channel;
        }

        public LeadQueryParam channel(Integer channel) {
            this.channel = channel;
            return this;
        }

        /**
        * The optional ID to further distinguish the Marketing channel.
        * @return channelId
        **/
        @JsonProperty("channel_id")
        public String getChannelId() {
            return channelId;
        }

        /**
         * Set channelId
         **/
        public void setChannelId(String channelId) {
            this.channelId = channelId;
        }

        public LeadQueryParam channelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        /**
        * A flag indicating whether the lead is archived or not
        * @return isArchived
        **/
        @JsonProperty("is_archived")
        public Boolean getIsArchived() {
            return isArchived;
        }

        /**
         * Set isArchived
         **/
        public void setIsArchived(Boolean isArchived) {
            this.isArchived = isArchived;
        }

        public LeadQueryParam isArchived(Boolean isArchived) {
            this.isArchived = isArchived;
            return this;
        }

        /**
        * A flag indicating whether the lead was seen by someone in the Pipedrive UI
        * @return wasSeen
        **/
        @JsonProperty("was_seen")
        public Boolean getWasSeen() {
            return wasSeen;
        }

        /**
         * Set wasSeen
         **/
        public void setWasSeen(Boolean wasSeen) {
            this.wasSeen = wasSeen;
        }

        public LeadQueryParam wasSeen(Boolean wasSeen) {
            this.wasSeen = wasSeen;
            return this;
        }

        /**
        * Get value
        * @return value
        **/
        @JsonProperty("value")
        public LeadValue getValue() {
            return value;
        }

        /**
         * Set value
         **/
        public void setValue(LeadValue value) {
            this.value = value;
        }

        public LeadQueryParam value(LeadValue value) {
            this.value = value;
            return this;
        }

        /**
        * The date of when the deal which will be created from the lead is expected to be closed. In ISO 8601 format: YYYY-MM-DD.
        * @return expectedCloseDate
        **/
        @JsonProperty("expected_close_date")
        public LocalDate getExpectedCloseDate() {
            return expectedCloseDate;
        }

        /**
         * Set expectedCloseDate
         **/
        public void setExpectedCloseDate(LocalDate expectedCloseDate) {
            this.expectedCloseDate = expectedCloseDate;
        }

        public LeadQueryParam expectedCloseDate(LocalDate expectedCloseDate) {
            this.expectedCloseDate = expectedCloseDate;
            return this;
        }

        /**
        * The ID of the next activity associated with the lead
        * @return nextActivityId
        **/
        @JsonProperty("next_activity_id")
        public Integer getNextActivityId() {
            return nextActivityId;
        }

        /**
         * Set nextActivityId
         **/
        public void setNextActivityId(Integer nextActivityId) {
            this.nextActivityId = nextActivityId;
        }

        public LeadQueryParam nextActivityId(Integer nextActivityId) {
            this.nextActivityId = nextActivityId;
            return this;
        }

        /**
        * The date and time of when the lead was created. In ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
        * @return addTime
        **/
        @JsonProperty("add_time")
        public OffsetDateTime getAddTime() {
            return addTime;
        }

        /**
         * Set addTime
         **/
        public void setAddTime(OffsetDateTime addTime) {
            this.addTime = addTime;
        }

        public LeadQueryParam addTime(OffsetDateTime addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The date and time of when the lead was last updated. In ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
        * @return updateTime
        **/
        @JsonProperty("update_time")
        public OffsetDateTime getUpdateTime() {
            return updateTime;
        }

        /**
         * Set updateTime
         **/
        public void setUpdateTime(OffsetDateTime updateTime) {
            this.updateTime = updateTime;
        }

        public LeadQueryParam updateTime(OffsetDateTime updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
        * Get visibleTo
        * @return visibleTo
        **/
        @JsonProperty("visible_to")
        public VisibleToEnum getVisibleTo() {
            return visibleTo;
        }

        /**
         * Set visibleTo
         **/
        public void setVisibleTo(VisibleToEnum visibleTo) {
            this.visibleTo = visibleTo;
        }

        public LeadQueryParam visibleTo(VisibleToEnum visibleTo) {
            this.visibleTo = visibleTo;
            return this;
        }

        /**
        * The BCC email of the lead
        * @return ccEmail
        **/
        @JsonProperty("cc_email")
        public String getCcEmail() {
            return ccEmail;
        }

        /**
         * Set ccEmail
         **/
        public void setCcEmail(String ccEmail) {
            this.ccEmail = ccEmail;
        }

        public LeadQueryParam ccEmail(String ccEmail) {
            this.ccEmail = ccEmail;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LeadQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    title: ").append(toIndentedString(title)).append("\n");
            sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
            sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
            sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
            sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
            sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
            sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
            sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
            sb.append("    originId: ").append(toIndentedString(originId)).append("\n");
            sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
            sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
            sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
            sb.append("    wasSeen: ").append(toIndentedString(wasSeen)).append("\n");
            sb.append("    value: ").append(toIndentedString(value)).append("\n");
            sb.append("    expectedCloseDate: ").append(toIndentedString(expectedCloseDate)).append("\n");
            sb.append("    nextActivityId: ").append(toIndentedString(nextActivityId)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
            sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
            sb.append("    ccEmail: ").append(toIndentedString(ccEmail)).append("\n");
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
