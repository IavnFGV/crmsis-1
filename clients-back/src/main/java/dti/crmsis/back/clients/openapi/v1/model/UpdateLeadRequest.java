package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.LeadValue;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateLeadRequest  {

    /**
      * The name of the lead
     **/
    private String title;
    /**
      * The ID of the user which will be the owner of the created lead. If not provided, the user making the request will be used.
     **/
    private Integer ownerId;
    /**
      * The IDs of the lead labels which will be associated with the lead
     **/
    private List<UUID> labelIds;
    /**
      * The ID of a person which this lead will be linked to. If the person does not exist yet, it needs to be created first. A lead always has to be linked to a person or organization or both. 
     **/
    private Integer personId;
    /**
      * The ID of an organization which this lead will be linked to. If the organization does not exist yet, it needs to be created first. A lead always has to be linked to a person or organization or both.
     **/
    private Integer organizationId;
    /**
      * A flag indicating whether the lead is archived or not
     **/
    private Boolean isArchived;
    private LeadValue value;
    /**
      * The date of when the deal which will be created from the lead is expected to be closed. In ISO 8601 format: YYYY-MM-DD.
     **/
    private LocalDate expectedCloseDate;

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
      * A flag indicating whether the lead was seen by someone in the Pipedrive UI
     **/
    private Boolean wasSeen;
    /**
      * The ID of Marketing channel this lead was created from. Provided value must be one of the channels configured for your company which you can fetch with <a href=\"https://developers.pipedrive.com/docs/api/v1/DealFields#getDealField\" target=\"_blank\" rel=\"noopener noreferrer\">GET /v1/dealFields</a>.
     **/
    private Integer channel;
    /**
      * The optional ID to further distinguish the Marketing channel.
     **/
    private String channelId;

    /**
    * The name of the lead
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

    public UpdateLeadRequest title(String title) {
        this.title = title;
        return this;
    }

    /**
    * The ID of the user which will be the owner of the created lead. If not provided, the user making the request will be used.
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

    public UpdateLeadRequest ownerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
    * The IDs of the lead labels which will be associated with the lead
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

    public UpdateLeadRequest labelIds(List<UUID> labelIds) {
        this.labelIds = labelIds;
        return this;
    }
    public UpdateLeadRequest addLabelIdsItem(UUID labelIdsItem) {
        if (this.labelIds == null){
            labelIds = new ArrayList<>();
        }
        this.labelIds.add(labelIdsItem);
        return this;
    }

    /**
    * The ID of a person which this lead will be linked to. If the person does not exist yet, it needs to be created first. A lead always has to be linked to a person or organization or both. 
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

    public UpdateLeadRequest personId(Integer personId) {
        this.personId = personId;
        return this;
    }

    /**
    * The ID of an organization which this lead will be linked to. If the organization does not exist yet, it needs to be created first. A lead always has to be linked to a person or organization or both.
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

    public UpdateLeadRequest organizationId(Integer organizationId) {
        this.organizationId = organizationId;
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

    public UpdateLeadRequest isArchived(Boolean isArchived) {
        this.isArchived = isArchived;
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

    public UpdateLeadRequest value(LeadValue value) {
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

    public UpdateLeadRequest expectedCloseDate(LocalDate expectedCloseDate) {
        this.expectedCloseDate = expectedCloseDate;
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

    public UpdateLeadRequest visibleTo(VisibleToEnum visibleTo) {
        this.visibleTo = visibleTo;
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

    public UpdateLeadRequest wasSeen(Boolean wasSeen) {
        this.wasSeen = wasSeen;
        return this;
    }

    /**
    * The ID of Marketing channel this lead was created from. Provided value must be one of the channels configured for your company which you can fetch with <a href=\"https://developers.pipedrive.com/docs/api/v1/DealFields#getDealField\" target=\"_blank\" rel=\"noopener noreferrer\">GET /v1/dealFields</a>.
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

    public UpdateLeadRequest channel(Integer channel) {
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

    public UpdateLeadRequest channelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLeadRequest {\n");

        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
        sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
        sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    expectedCloseDate: ").append(toIndentedString(expectedCloseDate)).append("\n");
        sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
        sb.append("    wasSeen: ").append(toIndentedString(wasSeen)).append("\n");
        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code UpdateLeadRequest} object that
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

        UpdateLeadRequest model = (UpdateLeadRequest) obj;

        return java.util.Objects.equals(title, model.title) &&
        java.util.Objects.equals(ownerId, model.ownerId) &&
        java.util.Objects.equals(labelIds, model.labelIds) &&
        java.util.Objects.equals(personId, model.personId) &&
        java.util.Objects.equals(organizationId, model.organizationId) &&
        java.util.Objects.equals(isArchived, model.isArchived) &&
        java.util.Objects.equals(value, model.value) &&
        java.util.Objects.equals(expectedCloseDate, model.expectedCloseDate) &&
        java.util.Objects.equals(visibleTo, model.visibleTo) &&
        java.util.Objects.equals(wasSeen, model.wasSeen) &&
        java.util.Objects.equals(channel, model.channel) &&
        java.util.Objects.equals(channelId, model.channelId);
    }

    /**
     * Returns a hash code for a {@code UpdateLeadRequest}.
     *
     * @return a hash code value for a {@code UpdateLeadRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(title,
        ownerId,
        labelIds,
        personId,
        organizationId,
        isArchived,
        value,
        expectedCloseDate,
        visibleTo,
        wasSeen,
        channel,
        channelId);
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
    public static class UpdateLeadRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("title")
        private String title;
        @jakarta.ws.rs.QueryParam("ownerId")
        private Integer ownerId;
        @jakarta.ws.rs.QueryParam("labelIds")
        private List<UUID> labelIds = null;
        @jakarta.ws.rs.QueryParam("personId")
        private Integer personId;
        @jakarta.ws.rs.QueryParam("organizationId")
        private Integer organizationId;
        @jakarta.ws.rs.QueryParam("isArchived")
        private Boolean isArchived;
        @jakarta.ws.rs.QueryParam("value")
        private LeadValue value;
        @jakarta.ws.rs.QueryParam("expectedCloseDate")
        private LocalDate expectedCloseDate;

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
        @jakarta.ws.rs.QueryParam("wasSeen")
        private Boolean wasSeen;
        @jakarta.ws.rs.QueryParam("channel")
        private Integer channel;
        @jakarta.ws.rs.QueryParam("channelId")
        private String channelId;

        /**
        * The name of the lead
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

        public UpdateLeadRequestQueryParam title(String title) {
            this.title = title;
            return this;
        }

        /**
        * The ID of the user which will be the owner of the created lead. If not provided, the user making the request will be used.
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

        public UpdateLeadRequestQueryParam ownerId(Integer ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
        * The IDs of the lead labels which will be associated with the lead
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

        public UpdateLeadRequestQueryParam labelIds(List<UUID> labelIds) {
            this.labelIds = labelIds;
            return this;
        }
        public UpdateLeadRequestQueryParam addLabelIdsItem(UUID labelIdsItem) {
            this.labelIds.add(labelIdsItem);
            return this;
        }

        /**
        * The ID of a person which this lead will be linked to. If the person does not exist yet, it needs to be created first. A lead always has to be linked to a person or organization or both. 
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

        public UpdateLeadRequestQueryParam personId(Integer personId) {
            this.personId = personId;
            return this;
        }

        /**
        * The ID of an organization which this lead will be linked to. If the organization does not exist yet, it needs to be created first. A lead always has to be linked to a person or organization or both.
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

        public UpdateLeadRequestQueryParam organizationId(Integer organizationId) {
            this.organizationId = organizationId;
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

        public UpdateLeadRequestQueryParam isArchived(Boolean isArchived) {
            this.isArchived = isArchived;
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

        public UpdateLeadRequestQueryParam value(LeadValue value) {
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

        public UpdateLeadRequestQueryParam expectedCloseDate(LocalDate expectedCloseDate) {
            this.expectedCloseDate = expectedCloseDate;
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

        public UpdateLeadRequestQueryParam visibleTo(VisibleToEnum visibleTo) {
            this.visibleTo = visibleTo;
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

        public UpdateLeadRequestQueryParam wasSeen(Boolean wasSeen) {
            this.wasSeen = wasSeen;
            return this;
        }

        /**
        * The ID of Marketing channel this lead was created from. Provided value must be one of the channels configured for your company which you can fetch with <a href=\"https://developers.pipedrive.com/docs/api/v1/DealFields#getDealField\" target=\"_blank\" rel=\"noopener noreferrer\">GET /v1/dealFields</a>.
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

        public UpdateLeadRequestQueryParam channel(Integer channel) {
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

        public UpdateLeadRequestQueryParam channelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class UpdateLeadRequestQueryParam {\n");

            sb.append("    title: ").append(toIndentedString(title)).append("\n");
            sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
            sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
            sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
            sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
            sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
            sb.append("    value: ").append(toIndentedString(value)).append("\n");
            sb.append("    expectedCloseDate: ").append(toIndentedString(expectedCloseDate)).append("\n");
            sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
            sb.append("    wasSeen: ").append(toIndentedString(wasSeen)).append("\n");
            sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
            sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
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
