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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddDealRequest  {

    /**
      * The title of the deal
     **/
    private String title;
    /**
      * The value of the deal. If omitted, value will be set to 0.
     **/
    private String value;
    /**
      * The array of the labels IDs.
     **/
    private List<Integer> label;
    /**
      * The currency of the deal. Accepts a 3-character currency code. If omitted, currency will be set to the default currency of the authorized user.
     **/
    private String currency;
    /**
      * The ID of the user which will be the owner of the created deal. If not provided, the user making the request will be used.
     **/
    private Integer userId;
    /**
      * The ID of a person which this deal will be linked to. If the person does not exist yet, it needs to be created first. This property is required unless `org_id` is specified.
     **/
    private Integer personId;
    /**
      * The ID of an organization which this deal will be linked to. If the organization does not exist yet, it needs to be created first. This property is required unless `person_id` is specified.
     **/
    private Integer orgId;
    /**
      * The ID of the pipeline this deal will be added to. By default, the deal will be added to the first stage of the specified pipeline. Please note that `pipeline_id` and `stage_id` should not be used together as `pipeline_id` will be ignored.
     **/
    private Integer pipelineId;
    /**
      * The ID of the stage this deal will be added to. Please note that a pipeline will be assigned automatically based on the `stage_id`. If omitted, the deal will be placed in the first stage of the default pipeline.
     **/
    private Integer stageId;

    public enum StatusEnum {
        OPEN(String.valueOf("open")), WON(String.valueOf("won")), LOST(String.valueOf("lost")), DELETED(String.valueOf("deleted"));

        // caching enum access
        private static final java.util.EnumSet<StatusEnum> values = java.util.EnumSet.allOf(StatusEnum.class);

        String value;

        StatusEnum (String v) {
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
        public static StatusEnum fromString(String v) {
            for (StatusEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    /**
      * open = Open, won = Won, lost = Lost, deleted = Deleted. If omitted, status will be set to open.
     **/
    private StatusEnum status;
    /**
      * The optional ID to further distinguish the origin of the deal - e.g. Which API integration created this deal. If omitted, `origin_id` will be set to null.
     **/
    private String originId;
    /**
      * The ID of Marketing channel this deal was created from. Provided value must be one of the channels configured for your company. You can fetch allowed values with <a href=\"https://developers.pipedrive.com/docs/api/v1/DealFields#getDealField\" target=\"_blank\" rel=\"noopener noreferrer\">GET /v1/dealFields</a>. If omitted, channel will be set to null.
     **/
    private Integer channel;
    /**
      * The optional ID to further distinguish the Marketing channel. If omitted, `channel_id` will be set to null.
     **/
    private String channelId;
    /**
      * The optional creation date & time of the deal in UTC. Format: YYYY-MM-DD HH:MM:SS
     **/
    private String addTime;
    /**
      * The optional date and time of changing the deal status as won in UTC. Format: YYYY-MM-DD HH:MM:SS. Can be set only when deal `status` is already Won. Can not be used together with `lost_time`.
     **/
    private String wonTime;
    /**
      * The optional date and time of changing the deal status as lost in UTC. Format: YYYY-MM-DD HH:MM:SS. Can be set only when deal `status` is already Lost. Can not be used together with `won_time`.
     **/
    private String lostTime;
    /**
      * The optional date and time of closing the deal in UTC. Format: YYYY-MM-DD HH:MM:SS.
     **/
    private String closeTime;
    /**
      * The expected close date of the deal. In ISO 8601 format: YYYY-MM-DD.
     **/
    private LocalDate expectedCloseDate;
    /**
      * The success probability percentage of the deal. Used/shown only when `deal_probability` for the pipeline of the deal is enabled.
     **/
    private BigDecimal probability;
    /**
      * The optional message about why the deal was lost (to be used when status = lost)
     **/
    private String lostReason;

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
    * The title of the deal
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

    public AddDealRequest title(String title) {
        this.title = title;
        return this;
    }

    /**
    * The value of the deal. If omitted, value will be set to 0.
    * @return value
    **/
    @JsonProperty("value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getValue() {
        return value;
    }

    /**
     * Set value
     **/
    public void setValue(String value) {
        this.value = value;
    }

    public AddDealRequest value(String value) {
        this.value = value;
        return this;
    }

    /**
    * The array of the labels IDs.
    * @return label
    **/
    @JsonProperty("label")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getLabel() {
        return label;
    }

    /**
     * Set label
     **/
    public void setLabel(List<Integer> label) {
        this.label = label;
    }

    public AddDealRequest label(List<Integer> label) {
        this.label = label;
        return this;
    }
    public AddDealRequest addLabelItem(Integer labelItem) {
        if (this.label == null){
            label = new ArrayList<>();
        }
        this.label.add(labelItem);
        return this;
    }

    /**
    * The currency of the deal. Accepts a 3-character currency code. If omitted, currency will be set to the default currency of the authorized user.
    * @return currency
    **/
    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Set currency
     **/
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public AddDealRequest currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
    * The ID of the user which will be the owner of the created deal. If not provided, the user making the request will be used.
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

    public AddDealRequest userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
    * The ID of a person which this deal will be linked to. If the person does not exist yet, it needs to be created first. This property is required unless `org_id` is specified.
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

    public AddDealRequest personId(Integer personId) {
        this.personId = personId;
        return this;
    }

    /**
    * The ID of an organization which this deal will be linked to. If the organization does not exist yet, it needs to be created first. This property is required unless `person_id` is specified.
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

    public AddDealRequest orgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }

    /**
    * The ID of the pipeline this deal will be added to. By default, the deal will be added to the first stage of the specified pipeline. Please note that `pipeline_id` and `stage_id` should not be used together as `pipeline_id` will be ignored.
    * @return pipelineId
    **/
    @JsonProperty("pipeline_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPipelineId() {
        return pipelineId;
    }

    /**
     * Set pipelineId
     **/
    public void setPipelineId(Integer pipelineId) {
        this.pipelineId = pipelineId;
    }

    public AddDealRequest pipelineId(Integer pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
    * The ID of the stage this deal will be added to. Please note that a pipeline will be assigned automatically based on the `stage_id`. If omitted, the deal will be placed in the first stage of the default pipeline.
    * @return stageId
    **/
    @JsonProperty("stage_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getStageId() {
        return stageId;
    }

    /**
     * Set stageId
     **/
    public void setStageId(Integer stageId) {
        this.stageId = stageId;
    }

    public AddDealRequest stageId(Integer stageId) {
        this.stageId = stageId;
        return this;
    }

    /**
    * open = Open, won = Won, lost = Lost, deleted = Deleted. If omitted, status will be set to open.
    * @return status
    **/
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public StatusEnum getStatus() {
        return status;
    }

    /**
     * Set status
     **/
    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public AddDealRequest status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
    * The optional ID to further distinguish the origin of the deal - e.g. Which API integration created this deal. If omitted, `origin_id` will be set to null.
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

    public AddDealRequest originId(String originId) {
        this.originId = originId;
        return this;
    }

    /**
    * The ID of Marketing channel this deal was created from. Provided value must be one of the channels configured for your company. You can fetch allowed values with <a href=\"https://developers.pipedrive.com/docs/api/v1/DealFields#getDealField\" target=\"_blank\" rel=\"noopener noreferrer\">GET /v1/dealFields</a>. If omitted, channel will be set to null.
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

    public AddDealRequest channel(Integer channel) {
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

    public AddDealRequest channelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
    * The optional creation date & time of the deal in UTC. Format: YYYY-MM-DD HH:MM:SS
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

    public AddDealRequest addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The optional date and time of changing the deal status as won in UTC. Format: YYYY-MM-DD HH:MM:SS. Can be set only when deal `status` is already Won. Can not be used together with `lost_time`.
    * @return wonTime
    **/
    @JsonProperty("won_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getWonTime() {
        return wonTime;
    }

    /**
     * Set wonTime
     **/
    public void setWonTime(String wonTime) {
        this.wonTime = wonTime;
    }

    public AddDealRequest wonTime(String wonTime) {
        this.wonTime = wonTime;
        return this;
    }

    /**
    * The optional date and time of changing the deal status as lost in UTC. Format: YYYY-MM-DD HH:MM:SS. Can be set only when deal `status` is already Lost. Can not be used together with `won_time`.
    * @return lostTime
    **/
    @JsonProperty("lost_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLostTime() {
        return lostTime;
    }

    /**
     * Set lostTime
     **/
    public void setLostTime(String lostTime) {
        this.lostTime = lostTime;
    }

    public AddDealRequest lostTime(String lostTime) {
        this.lostTime = lostTime;
        return this;
    }

    /**
    * The optional date and time of closing the deal in UTC. Format: YYYY-MM-DD HH:MM:SS.
    * @return closeTime
    **/
    @JsonProperty("close_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCloseTime() {
        return closeTime;
    }

    /**
     * Set closeTime
     **/
    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public AddDealRequest closeTime(String closeTime) {
        this.closeTime = closeTime;
        return this;
    }

    /**
    * The expected close date of the deal. In ISO 8601 format: YYYY-MM-DD.
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

    public AddDealRequest expectedCloseDate(LocalDate expectedCloseDate) {
        this.expectedCloseDate = expectedCloseDate;
        return this;
    }

    /**
    * The success probability percentage of the deal. Used/shown only when `deal_probability` for the pipeline of the deal is enabled.
    * @return probability
    **/
    @JsonProperty("probability")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getProbability() {
        return probability;
    }

    /**
     * Set probability
     **/
    public void setProbability(BigDecimal probability) {
        this.probability = probability;
    }

    public AddDealRequest probability(BigDecimal probability) {
        this.probability = probability;
        return this;
    }

    /**
    * The optional message about why the deal was lost (to be used when status = lost)
    * @return lostReason
    **/
    @JsonProperty("lost_reason")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLostReason() {
        return lostReason;
    }

    /**
     * Set lostReason
     **/
    public void setLostReason(String lostReason) {
        this.lostReason = lostReason;
    }

    public AddDealRequest lostReason(String lostReason) {
        this.lostReason = lostReason;
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

    public AddDealRequest visibleTo(VisibleToEnum visibleTo) {
        this.visibleTo = visibleTo;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDealRequest {\n");

        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
        sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    originId: ").append(toIndentedString(originId)).append("\n");
        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    wonTime: ").append(toIndentedString(wonTime)).append("\n");
        sb.append("    lostTime: ").append(toIndentedString(lostTime)).append("\n");
        sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
        sb.append("    expectedCloseDate: ").append(toIndentedString(expectedCloseDate)).append("\n");
        sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
        sb.append("    lostReason: ").append(toIndentedString(lostReason)).append("\n");
        sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddDealRequest} object that
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

        AddDealRequest model = (AddDealRequest) obj;

        return java.util.Objects.equals(title, model.title) &&
        java.util.Objects.equals(value, model.value) &&
        java.util.Objects.equals(label, model.label) &&
        java.util.Objects.equals(currency, model.currency) &&
        java.util.Objects.equals(userId, model.userId) &&
        java.util.Objects.equals(personId, model.personId) &&
        java.util.Objects.equals(orgId, model.orgId) &&
        java.util.Objects.equals(pipelineId, model.pipelineId) &&
        java.util.Objects.equals(stageId, model.stageId) &&
        java.util.Objects.equals(status, model.status) &&
        java.util.Objects.equals(originId, model.originId) &&
        java.util.Objects.equals(channel, model.channel) &&
        java.util.Objects.equals(channelId, model.channelId) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(wonTime, model.wonTime) &&
        java.util.Objects.equals(lostTime, model.lostTime) &&
        java.util.Objects.equals(closeTime, model.closeTime) &&
        java.util.Objects.equals(expectedCloseDate, model.expectedCloseDate) &&
        java.util.Objects.equals(probability, model.probability) &&
        java.util.Objects.equals(lostReason, model.lostReason) &&
        java.util.Objects.equals(visibleTo, model.visibleTo);
    }

    /**
     * Returns a hash code for a {@code AddDealRequest}.
     *
     * @return a hash code value for a {@code AddDealRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(title,
        value,
        label,
        currency,
        userId,
        personId,
        orgId,
        pipelineId,
        stageId,
        status,
        originId,
        channel,
        channelId,
        addTime,
        wonTime,
        lostTime,
        closeTime,
        expectedCloseDate,
        probability,
        lostReason,
        visibleTo);
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
    public static class AddDealRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("title")
        private String title;
        @jakarta.ws.rs.QueryParam("value")
        private String value;
        @jakarta.ws.rs.QueryParam("label")
        private List<Integer> label = null;
        @jakarta.ws.rs.QueryParam("currency")
        private String currency;
        @jakarta.ws.rs.QueryParam("userId")
        private Integer userId;
        @jakarta.ws.rs.QueryParam("personId")
        private Integer personId;
        @jakarta.ws.rs.QueryParam("orgId")
        private Integer orgId;
        @jakarta.ws.rs.QueryParam("pipelineId")
        private Integer pipelineId;
        @jakarta.ws.rs.QueryParam("stageId")
        private Integer stageId;

    public enum StatusEnum {
        OPEN(String.valueOf("open")), WON(String.valueOf("won")), LOST(String.valueOf("lost")), DELETED(String.valueOf("deleted"));

        // caching enum access
        private static final java.util.EnumSet<StatusEnum> values = java.util.EnumSet.allOf(StatusEnum.class);

        String value;

        StatusEnum (String v) {
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
        public static StatusEnum fromString(String v) {
            for (StatusEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private StatusEnum status;
        @jakarta.ws.rs.QueryParam("originId")
        private String originId;
        @jakarta.ws.rs.QueryParam("channel")
        private Integer channel;
        @jakarta.ws.rs.QueryParam("channelId")
        private String channelId;
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        @jakarta.ws.rs.QueryParam("wonTime")
        private String wonTime;
        @jakarta.ws.rs.QueryParam("lostTime")
        private String lostTime;
        @jakarta.ws.rs.QueryParam("closeTime")
        private String closeTime;
        @jakarta.ws.rs.QueryParam("expectedCloseDate")
        private LocalDate expectedCloseDate;
        @jakarta.ws.rs.QueryParam("probability")
        private BigDecimal probability;
        @jakarta.ws.rs.QueryParam("lostReason")
        private String lostReason;

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
        * The title of the deal
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

        public AddDealRequestQueryParam title(String title) {
            this.title = title;
            return this;
        }

        /**
        * The value of the deal. If omitted, value will be set to 0.
        * @return value
        **/
        @JsonProperty("value")
        public String getValue() {
            return value;
        }

        /**
         * Set value
         **/
        public void setValue(String value) {
            this.value = value;
        }

        public AddDealRequestQueryParam value(String value) {
            this.value = value;
            return this;
        }

        /**
        * The array of the labels IDs.
        * @return label
        **/
        @JsonProperty("label")
        public List<Integer> getLabel() {
            return label;
        }

        /**
         * Set label
         **/
        public void setLabel(List<Integer> label) {
            this.label = label;
        }

        public AddDealRequestQueryParam label(List<Integer> label) {
            this.label = label;
            return this;
        }
        public AddDealRequestQueryParam addLabelItem(Integer labelItem) {
            this.label.add(labelItem);
            return this;
        }

        /**
        * The currency of the deal. Accepts a 3-character currency code. If omitted, currency will be set to the default currency of the authorized user.
        * @return currency
        **/
        @JsonProperty("currency")
        public String getCurrency() {
            return currency;
        }

        /**
         * Set currency
         **/
        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public AddDealRequestQueryParam currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
        * The ID of the user which will be the owner of the created deal. If not provided, the user making the request will be used.
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

        public AddDealRequestQueryParam userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        /**
        * The ID of a person which this deal will be linked to. If the person does not exist yet, it needs to be created first. This property is required unless `org_id` is specified.
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

        public AddDealRequestQueryParam personId(Integer personId) {
            this.personId = personId;
            return this;
        }

        /**
        * The ID of an organization which this deal will be linked to. If the organization does not exist yet, it needs to be created first. This property is required unless `person_id` is specified.
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

        public AddDealRequestQueryParam orgId(Integer orgId) {
            this.orgId = orgId;
            return this;
        }

        /**
        * The ID of the pipeline this deal will be added to. By default, the deal will be added to the first stage of the specified pipeline. Please note that `pipeline_id` and `stage_id` should not be used together as `pipeline_id` will be ignored.
        * @return pipelineId
        **/
        @JsonProperty("pipeline_id")
        public Integer getPipelineId() {
            return pipelineId;
        }

        /**
         * Set pipelineId
         **/
        public void setPipelineId(Integer pipelineId) {
            this.pipelineId = pipelineId;
        }

        public AddDealRequestQueryParam pipelineId(Integer pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }

        /**
        * The ID of the stage this deal will be added to. Please note that a pipeline will be assigned automatically based on the `stage_id`. If omitted, the deal will be placed in the first stage of the default pipeline.
        * @return stageId
        **/
        @JsonProperty("stage_id")
        public Integer getStageId() {
            return stageId;
        }

        /**
         * Set stageId
         **/
        public void setStageId(Integer stageId) {
            this.stageId = stageId;
        }

        public AddDealRequestQueryParam stageId(Integer stageId) {
            this.stageId = stageId;
            return this;
        }

        /**
        * open = Open, won = Won, lost = Lost, deleted = Deleted. If omitted, status will be set to open.
        * @return status
        **/
        @JsonProperty("status")
        public StatusEnum getStatus() {
            return status;
        }

        /**
         * Set status
         **/
        public void setStatus(StatusEnum status) {
            this.status = status;
        }

        public AddDealRequestQueryParam status(StatusEnum status) {
            this.status = status;
            return this;
        }

        /**
        * The optional ID to further distinguish the origin of the deal - e.g. Which API integration created this deal. If omitted, `origin_id` will be set to null.
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

        public AddDealRequestQueryParam originId(String originId) {
            this.originId = originId;
            return this;
        }

        /**
        * The ID of Marketing channel this deal was created from. Provided value must be one of the channels configured for your company. You can fetch allowed values with <a href=\"https://developers.pipedrive.com/docs/api/v1/DealFields#getDealField\" target=\"_blank\" rel=\"noopener noreferrer\">GET /v1/dealFields</a>. If omitted, channel will be set to null.
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

        public AddDealRequestQueryParam channel(Integer channel) {
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

        public AddDealRequestQueryParam channelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        /**
        * The optional creation date & time of the deal in UTC. Format: YYYY-MM-DD HH:MM:SS
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

        public AddDealRequestQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The optional date and time of changing the deal status as won in UTC. Format: YYYY-MM-DD HH:MM:SS. Can be set only when deal `status` is already Won. Can not be used together with `lost_time`.
        * @return wonTime
        **/
        @JsonProperty("won_time")
        public String getWonTime() {
            return wonTime;
        }

        /**
         * Set wonTime
         **/
        public void setWonTime(String wonTime) {
            this.wonTime = wonTime;
        }

        public AddDealRequestQueryParam wonTime(String wonTime) {
            this.wonTime = wonTime;
            return this;
        }

        /**
        * The optional date and time of changing the deal status as lost in UTC. Format: YYYY-MM-DD HH:MM:SS. Can be set only when deal `status` is already Lost. Can not be used together with `won_time`.
        * @return lostTime
        **/
        @JsonProperty("lost_time")
        public String getLostTime() {
            return lostTime;
        }

        /**
         * Set lostTime
         **/
        public void setLostTime(String lostTime) {
            this.lostTime = lostTime;
        }

        public AddDealRequestQueryParam lostTime(String lostTime) {
            this.lostTime = lostTime;
            return this;
        }

        /**
        * The optional date and time of closing the deal in UTC. Format: YYYY-MM-DD HH:MM:SS.
        * @return closeTime
        **/
        @JsonProperty("close_time")
        public String getCloseTime() {
            return closeTime;
        }

        /**
         * Set closeTime
         **/
        public void setCloseTime(String closeTime) {
            this.closeTime = closeTime;
        }

        public AddDealRequestQueryParam closeTime(String closeTime) {
            this.closeTime = closeTime;
            return this;
        }

        /**
        * The expected close date of the deal. In ISO 8601 format: YYYY-MM-DD.
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

        public AddDealRequestQueryParam expectedCloseDate(LocalDate expectedCloseDate) {
            this.expectedCloseDate = expectedCloseDate;
            return this;
        }

        /**
        * The success probability percentage of the deal. Used/shown only when `deal_probability` for the pipeline of the deal is enabled.
        * @return probability
        **/
        @JsonProperty("probability")
        public BigDecimal getProbability() {
            return probability;
        }

        /**
         * Set probability
         **/
        public void setProbability(BigDecimal probability) {
            this.probability = probability;
        }

        public AddDealRequestQueryParam probability(BigDecimal probability) {
            this.probability = probability;
            return this;
        }

        /**
        * The optional message about why the deal was lost (to be used when status = lost)
        * @return lostReason
        **/
        @JsonProperty("lost_reason")
        public String getLostReason() {
            return lostReason;
        }

        /**
         * Set lostReason
         **/
        public void setLostReason(String lostReason) {
            this.lostReason = lostReason;
        }

        public AddDealRequestQueryParam lostReason(String lostReason) {
            this.lostReason = lostReason;
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

        public AddDealRequestQueryParam visibleTo(VisibleToEnum visibleTo) {
            this.visibleTo = visibleTo;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddDealRequestQueryParam {\n");

            sb.append("    title: ").append(toIndentedString(title)).append("\n");
            sb.append("    value: ").append(toIndentedString(value)).append("\n");
            sb.append("    label: ").append(toIndentedString(label)).append("\n");
            sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
            sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
            sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
            sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
            sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    originId: ").append(toIndentedString(originId)).append("\n");
            sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
            sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    wonTime: ").append(toIndentedString(wonTime)).append("\n");
            sb.append("    lostTime: ").append(toIndentedString(lostTime)).append("\n");
            sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
            sb.append("    expectedCloseDate: ").append(toIndentedString(expectedCloseDate)).append("\n");
            sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
            sb.append("    lostReason: ").append(toIndentedString(lostReason)).append("\n");
            sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
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
