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
public class AddLeadRequest  {

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
      * The ID of a person which this lead will be linked to. If the person does not exist yet, it needs to be created first. This property is required unless `organization_id` is specified.
     **/
    private Integer personId;
    /**
      * The ID of an organization which this lead will be linked to. If the organization does not exist yet, it needs to be created first. This property is required unless `person_id` is specified.
     **/
    private Integer organizationId;
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
      * The optional ID to further distinguish the origin of the lead - e.g. Which API integration created this lead. If omitted, `origin_id` will be set to null.
     **/
    private String originId;
    /**
      * The ID of Marketing channel this lead was created from. Provided value must be one of the channels configured for your company. You can fetch allowed values with <a href=\"https://developers.pipedrive.com/docs/api/v1/DealFields#getDealField\" target=\"_blank\" rel=\"noopener noreferrer\">GET /v1/dealFields</a>. If omitted, channel will be set to null.
     **/
    private Integer channel;
    /**
      * The optional ID to further distinguish the Marketing channel. If omitted, `channel_id` will be set to null.
     **/
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

    public AddLeadRequest title(String title) {
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

    public AddLeadRequest ownerId(Integer ownerId) {
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

    public AddLeadRequest labelIds(List<UUID> labelIds) {
        this.labelIds = labelIds;
        return this;
    }
    public AddLeadRequest addLabelIdsItem(UUID labelIdsItem) {
        if (this.labelIds == null){
            labelIds = new ArrayList<>();
        }
        this.labelIds.add(labelIdsItem);
        return this;
    }

    /**
    * The ID of a person which this lead will be linked to. If the person does not exist yet, it needs to be created first. This property is required unless `organization_id` is specified.
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

    public AddLeadRequest personId(Integer personId) {
        this.personId = personId;
        return this;
    }

    /**
    * The ID of an organization which this lead will be linked to. If the organization does not exist yet, it needs to be created first. This property is required unless `person_id` is specified.
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

    public AddLeadRequest organizationId(Integer organizationId) {
        this.organizationId = organizationId;
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

    public AddLeadRequest value(LeadValue value) {
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

    public AddLeadRequest expectedCloseDate(LocalDate expectedCloseDate) {
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

    public AddLeadRequest visibleTo(VisibleToEnum visibleTo) {
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

    public AddLeadRequest wasSeen(Boolean wasSeen) {
        this.wasSeen = wasSeen;
        return this;
    }

    /**
    * The optional ID to further distinguish the origin of the lead - e.g. Which API integration created this lead. If omitted, `origin_id` will be set to null.
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

    public AddLeadRequest originId(String originId) {
        this.originId = originId;
        return this;
    }

    /**
    * The ID of Marketing channel this lead was created from. Provided value must be one of the channels configured for your company. You can fetch allowed values with <a href=\"https://developers.pipedrive.com/docs/api/v1/DealFields#getDealField\" target=\"_blank\" rel=\"noopener noreferrer\">GET /v1/dealFields</a>. If omitted, channel will be set to null.
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

    public AddLeadRequest channel(Integer channel) {
        this.channel = channel;
        return this;
    }

    /**
    * The optional ID to further distinguish the Marketing channel. If omitted, `channel_id` will be set to null.
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

    public AddLeadRequest channelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddLeadRequest {\n");

        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
        sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    expectedCloseDate: ").append(toIndentedString(expectedCloseDate)).append("\n");
        sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
        sb.append("    wasSeen: ").append(toIndentedString(wasSeen)).append("\n");
        sb.append("    originId: ").append(toIndentedString(originId)).append("\n");
        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddLeadRequest} object that
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

        AddLeadRequest model = (AddLeadRequest) obj;

        return java.util.Objects.equals(title, model.title) &&
        java.util.Objects.equals(ownerId, model.ownerId) &&
        java.util.Objects.equals(labelIds, model.labelIds) &&
        java.util.Objects.equals(personId, model.personId) &&
        java.util.Objects.equals(organizationId, model.organizationId) &&
        java.util.Objects.equals(value, model.value) &&
        java.util.Objects.equals(expectedCloseDate, model.expectedCloseDate) &&
        java.util.Objects.equals(visibleTo, model.visibleTo) &&
        java.util.Objects.equals(wasSeen, model.wasSeen) &&
        java.util.Objects.equals(originId, model.originId) &&
        java.util.Objects.equals(channel, model.channel) &&
        java.util.Objects.equals(channelId, model.channelId);
    }

    /**
     * Returns a hash code for a {@code AddLeadRequest}.
     *
     * @return a hash code value for a {@code AddLeadRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(title,
        ownerId,
        labelIds,
        personId,
        organizationId,
        value,
        expectedCloseDate,
        visibleTo,
        wasSeen,
        originId,
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
    public static class AddLeadRequestQueryParam  {

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
        @jakarta.ws.rs.QueryParam("originId")
        private String originId;
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

        public AddLeadRequestQueryParam title(String title) {
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

        public AddLeadRequestQueryParam ownerId(Integer ownerId) {
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

        public AddLeadRequestQueryParam labelIds(List<UUID> labelIds) {
            this.labelIds = labelIds;
            return this;
        }
        public AddLeadRequestQueryParam addLabelIdsItem(UUID labelIdsItem) {
            this.labelIds.add(labelIdsItem);
            return this;
        }

        /**
        * The ID of a person which this lead will be linked to. If the person does not exist yet, it needs to be created first. This property is required unless `organization_id` is specified.
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

        public AddLeadRequestQueryParam personId(Integer personId) {
            this.personId = personId;
            return this;
        }

        /**
        * The ID of an organization which this lead will be linked to. If the organization does not exist yet, it needs to be created first. This property is required unless `person_id` is specified.
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

        public AddLeadRequestQueryParam organizationId(Integer organizationId) {
            this.organizationId = organizationId;
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

        public AddLeadRequestQueryParam value(LeadValue value) {
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

        public AddLeadRequestQueryParam expectedCloseDate(LocalDate expectedCloseDate) {
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

        public AddLeadRequestQueryParam visibleTo(VisibleToEnum visibleTo) {
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

        public AddLeadRequestQueryParam wasSeen(Boolean wasSeen) {
            this.wasSeen = wasSeen;
            return this;
        }

        /**
        * The optional ID to further distinguish the origin of the lead - e.g. Which API integration created this lead. If omitted, `origin_id` will be set to null.
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

        public AddLeadRequestQueryParam originId(String originId) {
            this.originId = originId;
            return this;
        }

        /**
        * The ID of Marketing channel this lead was created from. Provided value must be one of the channels configured for your company. You can fetch allowed values with <a href=\"https://developers.pipedrive.com/docs/api/v1/DealFields#getDealField\" target=\"_blank\" rel=\"noopener noreferrer\">GET /v1/dealFields</a>. If omitted, channel will be set to null.
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

        public AddLeadRequestQueryParam channel(Integer channel) {
            this.channel = channel;
            return this;
        }

        /**
        * The optional ID to further distinguish the Marketing channel. If omitted, `channel_id` will be set to null.
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

        public AddLeadRequestQueryParam channelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddLeadRequestQueryParam {\n");

            sb.append("    title: ").append(toIndentedString(title)).append("\n");
            sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
            sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
            sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
            sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
            sb.append("    value: ").append(toIndentedString(value)).append("\n");
            sb.append("    expectedCloseDate: ").append(toIndentedString(expectedCloseDate)).append("\n");
            sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
            sb.append("    wasSeen: ").append(toIndentedString(wasSeen)).append("\n");
            sb.append("    originId: ").append(toIndentedString(originId)).append("\n");
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
