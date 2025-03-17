package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class DealCollectionResponseObject  {

    /**
      * The ID of the deal
     **/
    private Integer id;
    /**
      * The ID of the deal creator
     **/
    private Integer creatorUserId;
    /**
      * The ID of the user
     **/
    private Integer userId;
    /**
      * The ID of the person associated with the deal
     **/
    private Integer personId;
    /**
      * The ID of the organization associated with the deal
     **/
    private Integer orgId;
    /**
      * The ID of the deal stage
     **/
    private Integer stageId;
    /**
      * The title of the deal
     **/
    private String title;
    /**
      * The value of the deal
     **/
    private BigDecimal value;
    /**
      * The currency associated with the deal
     **/
    private String currency;
    /**
      * The creation date and time of the deal in UTC. Format: YYYY-MM-DD HH:MM:SS.
     **/
    private String addTime;
    /**
      * The last update date and time of the deal in UTC. Format: YYYY-MM-DD HH:MM:SS.
     **/
    private String updateTime;
    /**
      * The status of the deal
     **/
    private String status;
    /**
      * The success probability percentage of the deal
     **/
    private BigDecimal probability;
    /**
      * The reason for losing the deal
     **/
    private String lostReason;
    /**
      * The visibility of the deal
     **/
    private String visibleTo;
    /**
      * The date and time of closing the deal in UTC. Format: YYYY-MM-DD HH:MM:SS.
     **/
    private String closeTime;
    /**
      * The ID of the pipeline associated with the deal
     **/
    private Integer pipelineId;
    /**
      * The date and time of changing the deal status to won in UTC. Format: YYYY-MM-DD HH:MM:SS.
     **/
    private String wonTime;
    /**
      * The date and time of changing the deal status to lost in UTC. Format: YYYY-MM-DD HH:MM:SS.
     **/
    private String lostTime;
    /**
      * The expected close date of the deal
     **/
    private LocalDate expectedCloseDate;
    /**
      * The label or multiple labels assigned to the deal
     **/
    private String label;

    /**
    * The ID of the deal
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

    public DealCollectionResponseObject id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The ID of the deal creator
    * @return creatorUserId
    **/
    @JsonProperty("creator_user_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getCreatorUserId() {
        return creatorUserId;
    }

    /**
     * Set creatorUserId
     **/
    public void setCreatorUserId(Integer creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public DealCollectionResponseObject creatorUserId(Integer creatorUserId) {
        this.creatorUserId = creatorUserId;
        return this;
    }

    /**
    * The ID of the user
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

    public DealCollectionResponseObject userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
    * The ID of the person associated with the deal
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

    public DealCollectionResponseObject personId(Integer personId) {
        this.personId = personId;
        return this;
    }

    /**
    * The ID of the organization associated with the deal
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

    public DealCollectionResponseObject orgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }

    /**
    * The ID of the deal stage
    * @return stageId
    **/
    @JsonProperty("stage_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getStageId() {
        return stageId;
    }

    /**
     * Set stageId
     **/
    public void setStageId(Integer stageId) {
        this.stageId = stageId;
    }

    public DealCollectionResponseObject stageId(Integer stageId) {
        this.stageId = stageId;
        return this;
    }

    /**
    * The title of the deal
    * @return title
    **/
    @JsonProperty("title")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTitle() {
        return title;
    }

    /**
     * Set title
     **/
    public void setTitle(String title) {
        this.title = title;
    }

    public DealCollectionResponseObject title(String title) {
        this.title = title;
        return this;
    }

    /**
    * The value of the deal
    * @return value
    **/
    @JsonProperty("value")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Set value
     **/
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public DealCollectionResponseObject value(BigDecimal value) {
        this.value = value;
        return this;
    }

    /**
    * The currency associated with the deal
    * @return currency
    **/
    @JsonProperty("currency")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Set currency
     **/
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public DealCollectionResponseObject currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
    * The creation date and time of the deal in UTC. Format: YYYY-MM-DD HH:MM:SS.
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

    public DealCollectionResponseObject addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The last update date and time of the deal in UTC. Format: YYYY-MM-DD HH:MM:SS.
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

    public DealCollectionResponseObject updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
    * The status of the deal
    * @return status
    **/
    @JsonProperty("status")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Set status
     **/
    public void setStatus(String status) {
        this.status = status;
    }

    public DealCollectionResponseObject status(String status) {
        this.status = status;
        return this;
    }

    /**
    * The success probability percentage of the deal
    * @return probability
    **/
    @JsonProperty("probability")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getProbability() {
        return probability;
    }

    /**
     * Set probability
     **/
    public void setProbability(BigDecimal probability) {
        this.probability = probability;
    }

    public DealCollectionResponseObject probability(BigDecimal probability) {
        this.probability = probability;
        return this;
    }

    /**
    * The reason for losing the deal
    * @return lostReason
    **/
    @JsonProperty("lost_reason")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLostReason() {
        return lostReason;
    }

    /**
     * Set lostReason
     **/
    public void setLostReason(String lostReason) {
        this.lostReason = lostReason;
    }

    public DealCollectionResponseObject lostReason(String lostReason) {
        this.lostReason = lostReason;
        return this;
    }

    /**
    * The visibility of the deal
    * @return visibleTo
    **/
    @JsonProperty("visible_to")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getVisibleTo() {
        return visibleTo;
    }

    /**
     * Set visibleTo
     **/
    public void setVisibleTo(String visibleTo) {
        this.visibleTo = visibleTo;
    }

    public DealCollectionResponseObject visibleTo(String visibleTo) {
        this.visibleTo = visibleTo;
        return this;
    }

    /**
    * The date and time of closing the deal in UTC. Format: YYYY-MM-DD HH:MM:SS.
    * @return closeTime
    **/
    @JsonProperty("close_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getCloseTime() {
        return closeTime;
    }

    /**
     * Set closeTime
     **/
    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public DealCollectionResponseObject closeTime(String closeTime) {
        this.closeTime = closeTime;
        return this;
    }

    /**
    * The ID of the pipeline associated with the deal
    * @return pipelineId
    **/
    @JsonProperty("pipeline_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getPipelineId() {
        return pipelineId;
    }

    /**
     * Set pipelineId
     **/
    public void setPipelineId(Integer pipelineId) {
        this.pipelineId = pipelineId;
    }

    public DealCollectionResponseObject pipelineId(Integer pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
    * The date and time of changing the deal status to won in UTC. Format: YYYY-MM-DD HH:MM:SS.
    * @return wonTime
    **/
    @JsonProperty("won_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getWonTime() {
        return wonTime;
    }

    /**
     * Set wonTime
     **/
    public void setWonTime(String wonTime) {
        this.wonTime = wonTime;
    }

    public DealCollectionResponseObject wonTime(String wonTime) {
        this.wonTime = wonTime;
        return this;
    }

    /**
    * The date and time of changing the deal status to lost in UTC. Format: YYYY-MM-DD HH:MM:SS.
    * @return lostTime
    **/
    @JsonProperty("lost_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLostTime() {
        return lostTime;
    }

    /**
     * Set lostTime
     **/
    public void setLostTime(String lostTime) {
        this.lostTime = lostTime;
    }

    public DealCollectionResponseObject lostTime(String lostTime) {
        this.lostTime = lostTime;
        return this;
    }

    /**
    * The expected close date of the deal
    * @return expectedCloseDate
    **/
    @JsonProperty("expected_close_date")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public LocalDate getExpectedCloseDate() {
        return expectedCloseDate;
    }

    /**
     * Set expectedCloseDate
     **/
    public void setExpectedCloseDate(LocalDate expectedCloseDate) {
        this.expectedCloseDate = expectedCloseDate;
    }

    public DealCollectionResponseObject expectedCloseDate(LocalDate expectedCloseDate) {
        this.expectedCloseDate = expectedCloseDate;
        return this;
    }

    /**
    * The label or multiple labels assigned to the deal
    * @return label
    **/
    @JsonProperty("label")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLabel() {
        return label;
    }

    /**
     * Set label
     **/
    public void setLabel(String label) {
        this.label = label;
    }

    public DealCollectionResponseObject label(String label) {
        this.label = label;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DealCollectionResponseObject {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    creatorUserId: ").append(toIndentedString(creatorUserId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
        sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
        sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
        sb.append("    lostReason: ").append(toIndentedString(lostReason)).append("\n");
        sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
        sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    wonTime: ").append(toIndentedString(wonTime)).append("\n");
        sb.append("    lostTime: ").append(toIndentedString(lostTime)).append("\n");
        sb.append("    expectedCloseDate: ").append(toIndentedString(expectedCloseDate)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code DealCollectionResponseObject} object that
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

        DealCollectionResponseObject model = (DealCollectionResponseObject) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(creatorUserId, model.creatorUserId) &&
        java.util.Objects.equals(userId, model.userId) &&
        java.util.Objects.equals(personId, model.personId) &&
        java.util.Objects.equals(orgId, model.orgId) &&
        java.util.Objects.equals(stageId, model.stageId) &&
        java.util.Objects.equals(title, model.title) &&
        java.util.Objects.equals(value, model.value) &&
        java.util.Objects.equals(currency, model.currency) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime) &&
        java.util.Objects.equals(status, model.status) &&
        java.util.Objects.equals(probability, model.probability) &&
        java.util.Objects.equals(lostReason, model.lostReason) &&
        java.util.Objects.equals(visibleTo, model.visibleTo) &&
        java.util.Objects.equals(closeTime, model.closeTime) &&
        java.util.Objects.equals(pipelineId, model.pipelineId) &&
        java.util.Objects.equals(wonTime, model.wonTime) &&
        java.util.Objects.equals(lostTime, model.lostTime) &&
        java.util.Objects.equals(expectedCloseDate, model.expectedCloseDate) &&
        java.util.Objects.equals(label, model.label);
    }

    /**
     * Returns a hash code for a {@code DealCollectionResponseObject}.
     *
     * @return a hash code value for a {@code DealCollectionResponseObject}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        creatorUserId,
        userId,
        personId,
        orgId,
        stageId,
        title,
        value,
        currency,
        addTime,
        updateTime,
        status,
        probability,
        lostReason,
        visibleTo,
        closeTime,
        pipelineId,
        wonTime,
        lostTime,
        expectedCloseDate,
        label);
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
    public static class DealCollectionResponseObjectQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("creatorUserId")
        private Integer creatorUserId;
        @jakarta.ws.rs.QueryParam("userId")
        private Integer userId;
        @jakarta.ws.rs.QueryParam("personId")
        private Integer personId;
        @jakarta.ws.rs.QueryParam("orgId")
        private Integer orgId;
        @jakarta.ws.rs.QueryParam("stageId")
        private Integer stageId;
        @jakarta.ws.rs.QueryParam("title")
        private String title;
        @jakarta.ws.rs.QueryParam("value")
        private BigDecimal value;
        @jakarta.ws.rs.QueryParam("currency")
        private String currency;
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        @jakarta.ws.rs.QueryParam("updateTime")
        private String updateTime;
        @jakarta.ws.rs.QueryParam("status")
        private String status;
        @jakarta.ws.rs.QueryParam("probability")
        private BigDecimal probability;
        @jakarta.ws.rs.QueryParam("lostReason")
        private String lostReason;
        @jakarta.ws.rs.QueryParam("visibleTo")
        private String visibleTo;
        @jakarta.ws.rs.QueryParam("closeTime")
        private String closeTime;
        @jakarta.ws.rs.QueryParam("pipelineId")
        private Integer pipelineId;
        @jakarta.ws.rs.QueryParam("wonTime")
        private String wonTime;
        @jakarta.ws.rs.QueryParam("lostTime")
        private String lostTime;
        @jakarta.ws.rs.QueryParam("expectedCloseDate")
        private LocalDate expectedCloseDate;
        @jakarta.ws.rs.QueryParam("label")
        private String label;

        /**
        * The ID of the deal
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

        public DealCollectionResponseObjectQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The ID of the deal creator
        * @return creatorUserId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("creator_user_id")
        public Integer getCreatorUserId() {
            return creatorUserId;
        }

        /**
         * Set creatorUserId
         **/
        public void setCreatorUserId(Integer creatorUserId) {
            this.creatorUserId = creatorUserId;
        }

        public DealCollectionResponseObjectQueryParam creatorUserId(Integer creatorUserId) {
            this.creatorUserId = creatorUserId;
            return this;
        }

        /**
        * The ID of the user
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

        public DealCollectionResponseObjectQueryParam userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        /**
        * The ID of the person associated with the deal
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

        public DealCollectionResponseObjectQueryParam personId(Integer personId) {
            this.personId = personId;
            return this;
        }

        /**
        * The ID of the organization associated with the deal
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

        public DealCollectionResponseObjectQueryParam orgId(Integer orgId) {
            this.orgId = orgId;
            return this;
        }

        /**
        * The ID of the deal stage
        * @return stageId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("stage_id")
        public Integer getStageId() {
            return stageId;
        }

        /**
         * Set stageId
         **/
        public void setStageId(Integer stageId) {
            this.stageId = stageId;
        }

        public DealCollectionResponseObjectQueryParam stageId(Integer stageId) {
            this.stageId = stageId;
            return this;
        }

        /**
        * The title of the deal
        * @return title
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("title")
        public String getTitle() {
            return title;
        }

        /**
         * Set title
         **/
        public void setTitle(String title) {
            this.title = title;
        }

        public DealCollectionResponseObjectQueryParam title(String title) {
            this.title = title;
            return this;
        }

        /**
        * The value of the deal
        * @return value
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Set value
         **/
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        public DealCollectionResponseObjectQueryParam value(BigDecimal value) {
            this.value = value;
            return this;
        }

        /**
        * The currency associated with the deal
        * @return currency
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("currency")
        public String getCurrency() {
            return currency;
        }

        /**
         * Set currency
         **/
        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public DealCollectionResponseObjectQueryParam currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
        * The creation date and time of the deal in UTC. Format: YYYY-MM-DD HH:MM:SS.
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

        public DealCollectionResponseObjectQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The last update date and time of the deal in UTC. Format: YYYY-MM-DD HH:MM:SS.
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

        public DealCollectionResponseObjectQueryParam updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
        * The status of the deal
        * @return status
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        public String getStatus() {
            return status;
        }

        /**
         * Set status
         **/
        public void setStatus(String status) {
            this.status = status;
        }

        public DealCollectionResponseObjectQueryParam status(String status) {
            this.status = status;
            return this;
        }

        /**
        * The success probability percentage of the deal
        * @return probability
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("probability")
        public BigDecimal getProbability() {
            return probability;
        }

        /**
         * Set probability
         **/
        public void setProbability(BigDecimal probability) {
            this.probability = probability;
        }

        public DealCollectionResponseObjectQueryParam probability(BigDecimal probability) {
            this.probability = probability;
            return this;
        }

        /**
        * The reason for losing the deal
        * @return lostReason
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("lost_reason")
        public String getLostReason() {
            return lostReason;
        }

        /**
         * Set lostReason
         **/
        public void setLostReason(String lostReason) {
            this.lostReason = lostReason;
        }

        public DealCollectionResponseObjectQueryParam lostReason(String lostReason) {
            this.lostReason = lostReason;
            return this;
        }

        /**
        * The visibility of the deal
        * @return visibleTo
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("visible_to")
        public String getVisibleTo() {
            return visibleTo;
        }

        /**
         * Set visibleTo
         **/
        public void setVisibleTo(String visibleTo) {
            this.visibleTo = visibleTo;
        }

        public DealCollectionResponseObjectQueryParam visibleTo(String visibleTo) {
            this.visibleTo = visibleTo;
            return this;
        }

        /**
        * The date and time of closing the deal in UTC. Format: YYYY-MM-DD HH:MM:SS.
        * @return closeTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("close_time")
        public String getCloseTime() {
            return closeTime;
        }

        /**
         * Set closeTime
         **/
        public void setCloseTime(String closeTime) {
            this.closeTime = closeTime;
        }

        public DealCollectionResponseObjectQueryParam closeTime(String closeTime) {
            this.closeTime = closeTime;
            return this;
        }

        /**
        * The ID of the pipeline associated with the deal
        * @return pipelineId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("pipeline_id")
        public Integer getPipelineId() {
            return pipelineId;
        }

        /**
         * Set pipelineId
         **/
        public void setPipelineId(Integer pipelineId) {
            this.pipelineId = pipelineId;
        }

        public DealCollectionResponseObjectQueryParam pipelineId(Integer pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }

        /**
        * The date and time of changing the deal status to won in UTC. Format: YYYY-MM-DD HH:MM:SS.
        * @return wonTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("won_time")
        public String getWonTime() {
            return wonTime;
        }

        /**
         * Set wonTime
         **/
        public void setWonTime(String wonTime) {
            this.wonTime = wonTime;
        }

        public DealCollectionResponseObjectQueryParam wonTime(String wonTime) {
            this.wonTime = wonTime;
            return this;
        }

        /**
        * The date and time of changing the deal status to lost in UTC. Format: YYYY-MM-DD HH:MM:SS.
        * @return lostTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("lost_time")
        public String getLostTime() {
            return lostTime;
        }

        /**
         * Set lostTime
         **/
        public void setLostTime(String lostTime) {
            this.lostTime = lostTime;
        }

        public DealCollectionResponseObjectQueryParam lostTime(String lostTime) {
            this.lostTime = lostTime;
            return this;
        }

        /**
        * The expected close date of the deal
        * @return expectedCloseDate
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("expected_close_date")
        public LocalDate getExpectedCloseDate() {
            return expectedCloseDate;
        }

        /**
         * Set expectedCloseDate
         **/
        public void setExpectedCloseDate(LocalDate expectedCloseDate) {
            this.expectedCloseDate = expectedCloseDate;
        }

        public DealCollectionResponseObjectQueryParam expectedCloseDate(LocalDate expectedCloseDate) {
            this.expectedCloseDate = expectedCloseDate;
            return this;
        }

        /**
        * The label or multiple labels assigned to the deal
        * @return label
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("label")
        public String getLabel() {
            return label;
        }

        /**
         * Set label
         **/
        public void setLabel(String label) {
            this.label = label;
        }

        public DealCollectionResponseObjectQueryParam label(String label) {
            this.label = label;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DealCollectionResponseObjectQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    creatorUserId: ").append(toIndentedString(creatorUserId)).append("\n");
            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
            sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
            sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
            sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
            sb.append("    title: ").append(toIndentedString(title)).append("\n");
            sb.append("    value: ").append(toIndentedString(value)).append("\n");
            sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
            sb.append("    lostReason: ").append(toIndentedString(lostReason)).append("\n");
            sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
            sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
            sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
            sb.append("    wonTime: ").append(toIndentedString(wonTime)).append("\n");
            sb.append("    lostTime: ").append(toIndentedString(lostTime)).append("\n");
            sb.append("    expectedCloseDate: ").append(toIndentedString(expectedCloseDate)).append("\n");
            sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
