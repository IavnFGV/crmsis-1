package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SubscriptionItem  {

    /**
      * The ID of the subscription
     **/
    private Integer id;
    /**
      * The ID of the user who created the subscription
     **/
    private Integer userId;
    /**
      * The ID of the deal this subscription is associated with
     **/
    private Integer dealId;
    /**
      * The description of the recurring subscription
     **/
    private String description;
    /**
      * The subscription status
     **/
    private Boolean isActive;
    /**
      * Shows how many payments a recurring subscription has
     **/
    private Integer cyclesCount;
    /**
      * The amount of each payment
     **/
    private Integer cycleAmount;
    /**
      * Indicates that the recurring subscription will last until it is manually canceled or deleted
     **/
    private Boolean infinite;
    /**
      * The currency of the subscription
     **/
    private String currency;
    /**
      * The interval between payments
     **/
    private String cadenceType;
    /**
      * The start date of the recurring subscription
     **/
    private LocalDate startDate;
    /**
      * The end date of the subscription
     **/
    private LocalDate endDate;
    /**
      * The total value of all payments
     **/
    private Double lifetimeValue;
    /**
      * The final status of the subscription
     **/
    private String finalStatus;
    /**
      * The creation time of the subscription
     **/
    private OffsetDateTime addTime;
    /**
      * The update time of the subscription
     **/
    private OffsetDateTime updateTime;

    /**
    * The ID of the subscription
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

    public SubscriptionItem id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The ID of the user who created the subscription
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

    public SubscriptionItem userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
    * The ID of the deal this subscription is associated with
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

    public SubscriptionItem dealId(Integer dealId) {
        this.dealId = dealId;
        return this;
    }

    /**
    * The description of the recurring subscription
    * @return description
    **/
    @JsonProperty("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Set description
     **/
    public void setDescription(String description) {
        this.description = description;
    }

    public SubscriptionItem description(String description) {
        this.description = description;
        return this;
    }

    /**
    * The subscription status
    * @return isActive
    **/
    @JsonProperty("is_active")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * Set isActive
     **/
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public SubscriptionItem isActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
    * Shows how many payments a recurring subscription has
    * @return cyclesCount
    **/
    @JsonProperty("cycles_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCyclesCount() {
        return cyclesCount;
    }

    /**
     * Set cyclesCount
     **/
    public void setCyclesCount(Integer cyclesCount) {
        this.cyclesCount = cyclesCount;
    }

    public SubscriptionItem cyclesCount(Integer cyclesCount) {
        this.cyclesCount = cyclesCount;
        return this;
    }

    /**
    * The amount of each payment
    * @return cycleAmount
    **/
    @JsonProperty("cycle_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCycleAmount() {
        return cycleAmount;
    }

    /**
     * Set cycleAmount
     **/
    public void setCycleAmount(Integer cycleAmount) {
        this.cycleAmount = cycleAmount;
    }

    public SubscriptionItem cycleAmount(Integer cycleAmount) {
        this.cycleAmount = cycleAmount;
        return this;
    }

    /**
    * Indicates that the recurring subscription will last until it is manually canceled or deleted
    * @return infinite
    **/
    @JsonProperty("infinite")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getInfinite() {
        return infinite;
    }

    /**
     * Set infinite
     **/
    public void setInfinite(Boolean infinite) {
        this.infinite = infinite;
    }

    public SubscriptionItem infinite(Boolean infinite) {
        this.infinite = infinite;
        return this;
    }

    /**
    * The currency of the subscription
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

    public SubscriptionItem currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
    * The interval between payments
    * @return cadenceType
    **/
    @JsonProperty("cadence_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCadenceType() {
        return cadenceType;
    }

    /**
     * Set cadenceType
     **/
    public void setCadenceType(String cadenceType) {
        this.cadenceType = cadenceType;
    }

    public SubscriptionItem cadenceType(String cadenceType) {
        this.cadenceType = cadenceType;
        return this;
    }

    /**
    * The start date of the recurring subscription
    * @return startDate
    **/
    @JsonProperty("start_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * Set startDate
     **/
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public SubscriptionItem startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
    * The end date of the subscription
    * @return endDate
    **/
    @JsonProperty("end_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * Set endDate
     **/
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public SubscriptionItem endDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
    * The total value of all payments
    * @return lifetimeValue
    **/
    @JsonProperty("lifetime_value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getLifetimeValue() {
        return lifetimeValue;
    }

    /**
     * Set lifetimeValue
     **/
    public void setLifetimeValue(Double lifetimeValue) {
        this.lifetimeValue = lifetimeValue;
    }

    public SubscriptionItem lifetimeValue(Double lifetimeValue) {
        this.lifetimeValue = lifetimeValue;
        return this;
    }

    /**
    * The final status of the subscription
    * @return finalStatus
    **/
    @JsonProperty("final_status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFinalStatus() {
        return finalStatus;
    }

    /**
     * Set finalStatus
     **/
    public void setFinalStatus(String finalStatus) {
        this.finalStatus = finalStatus;
    }

    public SubscriptionItem finalStatus(String finalStatus) {
        this.finalStatus = finalStatus;
        return this;
    }

    /**
    * The creation time of the subscription
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

    public SubscriptionItem addTime(OffsetDateTime addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The update time of the subscription
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

    public SubscriptionItem updateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionItem {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
        sb.append("    cyclesCount: ").append(toIndentedString(cyclesCount)).append("\n");
        sb.append("    cycleAmount: ").append(toIndentedString(cycleAmount)).append("\n");
        sb.append("    infinite: ").append(toIndentedString(infinite)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    cadenceType: ").append(toIndentedString(cadenceType)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    lifetimeValue: ").append(toIndentedString(lifetimeValue)).append("\n");
        sb.append("    finalStatus: ").append(toIndentedString(finalStatus)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code SubscriptionItem} object that
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

        SubscriptionItem model = (SubscriptionItem) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(userId, model.userId) &&
        java.util.Objects.equals(dealId, model.dealId) &&
        java.util.Objects.equals(description, model.description) &&
        java.util.Objects.equals(isActive, model.isActive) &&
        java.util.Objects.equals(cyclesCount, model.cyclesCount) &&
        java.util.Objects.equals(cycleAmount, model.cycleAmount) &&
        java.util.Objects.equals(infinite, model.infinite) &&
        java.util.Objects.equals(currency, model.currency) &&
        java.util.Objects.equals(cadenceType, model.cadenceType) &&
        java.util.Objects.equals(startDate, model.startDate) &&
        java.util.Objects.equals(endDate, model.endDate) &&
        java.util.Objects.equals(lifetimeValue, model.lifetimeValue) &&
        java.util.Objects.equals(finalStatus, model.finalStatus) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime);
    }

    /**
     * Returns a hash code for a {@code SubscriptionItem}.
     *
     * @return a hash code value for a {@code SubscriptionItem}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        userId,
        dealId,
        description,
        isActive,
        cyclesCount,
        cycleAmount,
        infinite,
        currency,
        cadenceType,
        startDate,
        endDate,
        lifetimeValue,
        finalStatus,
        addTime,
        updateTime);
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
    public static class SubscriptionItemQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("userId")
        private Integer userId;
        @jakarta.ws.rs.QueryParam("dealId")
        private Integer dealId;
        @jakarta.ws.rs.QueryParam("description")
        private String description;
        @jakarta.ws.rs.QueryParam("isActive")
        private Boolean isActive;
        @jakarta.ws.rs.QueryParam("cyclesCount")
        private Integer cyclesCount;
        @jakarta.ws.rs.QueryParam("cycleAmount")
        private Integer cycleAmount;
        @jakarta.ws.rs.QueryParam("infinite")
        private Boolean infinite;
        @jakarta.ws.rs.QueryParam("currency")
        private String currency;
        @jakarta.ws.rs.QueryParam("cadenceType")
        private String cadenceType;
        @jakarta.ws.rs.QueryParam("startDate")
        private LocalDate startDate;
        @jakarta.ws.rs.QueryParam("endDate")
        private LocalDate endDate;
        @jakarta.ws.rs.QueryParam("lifetimeValue")
        private Double lifetimeValue;
        @jakarta.ws.rs.QueryParam("finalStatus")
        private String finalStatus;
        @jakarta.ws.rs.QueryParam("addTime")
        private OffsetDateTime addTime;
        @jakarta.ws.rs.QueryParam("updateTime")
        private OffsetDateTime updateTime;

        /**
        * The ID of the subscription
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

        public SubscriptionItemQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The ID of the user who created the subscription
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

        public SubscriptionItemQueryParam userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        /**
        * The ID of the deal this subscription is associated with
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

        public SubscriptionItemQueryParam dealId(Integer dealId) {
            this.dealId = dealId;
            return this;
        }

        /**
        * The description of the recurring subscription
        * @return description
        **/
        @JsonProperty("description")
        public String getDescription() {
            return description;
        }

        /**
         * Set description
         **/
        public void setDescription(String description) {
            this.description = description;
        }

        public SubscriptionItemQueryParam description(String description) {
            this.description = description;
            return this;
        }

        /**
        * The subscription status
        * @return isActive
        **/
        @JsonProperty("is_active")
        public Boolean getIsActive() {
            return isActive;
        }

        /**
         * Set isActive
         **/
        public void setIsActive(Boolean isActive) {
            this.isActive = isActive;
        }

        public SubscriptionItemQueryParam isActive(Boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        /**
        * Shows how many payments a recurring subscription has
        * @return cyclesCount
        **/
        @JsonProperty("cycles_count")
        public Integer getCyclesCount() {
            return cyclesCount;
        }

        /**
         * Set cyclesCount
         **/
        public void setCyclesCount(Integer cyclesCount) {
            this.cyclesCount = cyclesCount;
        }

        public SubscriptionItemQueryParam cyclesCount(Integer cyclesCount) {
            this.cyclesCount = cyclesCount;
            return this;
        }

        /**
        * The amount of each payment
        * @return cycleAmount
        **/
        @JsonProperty("cycle_amount")
        public Integer getCycleAmount() {
            return cycleAmount;
        }

        /**
         * Set cycleAmount
         **/
        public void setCycleAmount(Integer cycleAmount) {
            this.cycleAmount = cycleAmount;
        }

        public SubscriptionItemQueryParam cycleAmount(Integer cycleAmount) {
            this.cycleAmount = cycleAmount;
            return this;
        }

        /**
        * Indicates that the recurring subscription will last until it is manually canceled or deleted
        * @return infinite
        **/
        @JsonProperty("infinite")
        public Boolean getInfinite() {
            return infinite;
        }

        /**
         * Set infinite
         **/
        public void setInfinite(Boolean infinite) {
            this.infinite = infinite;
        }

        public SubscriptionItemQueryParam infinite(Boolean infinite) {
            this.infinite = infinite;
            return this;
        }

        /**
        * The currency of the subscription
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

        public SubscriptionItemQueryParam currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
        * The interval between payments
        * @return cadenceType
        **/
        @JsonProperty("cadence_type")
        public String getCadenceType() {
            return cadenceType;
        }

        /**
         * Set cadenceType
         **/
        public void setCadenceType(String cadenceType) {
            this.cadenceType = cadenceType;
        }

        public SubscriptionItemQueryParam cadenceType(String cadenceType) {
            this.cadenceType = cadenceType;
            return this;
        }

        /**
        * The start date of the recurring subscription
        * @return startDate
        **/
        @JsonProperty("start_date")
        public LocalDate getStartDate() {
            return startDate;
        }

        /**
         * Set startDate
         **/
        public void setStartDate(LocalDate startDate) {
            this.startDate = startDate;
        }

        public SubscriptionItemQueryParam startDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
        * The end date of the subscription
        * @return endDate
        **/
        @JsonProperty("end_date")
        public LocalDate getEndDate() {
            return endDate;
        }

        /**
         * Set endDate
         **/
        public void setEndDate(LocalDate endDate) {
            this.endDate = endDate;
        }

        public SubscriptionItemQueryParam endDate(LocalDate endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
        * The total value of all payments
        * @return lifetimeValue
        **/
        @JsonProperty("lifetime_value")
        public Double getLifetimeValue() {
            return lifetimeValue;
        }

        /**
         * Set lifetimeValue
         **/
        public void setLifetimeValue(Double lifetimeValue) {
            this.lifetimeValue = lifetimeValue;
        }

        public SubscriptionItemQueryParam lifetimeValue(Double lifetimeValue) {
            this.lifetimeValue = lifetimeValue;
            return this;
        }

        /**
        * The final status of the subscription
        * @return finalStatus
        **/
        @JsonProperty("final_status")
        public String getFinalStatus() {
            return finalStatus;
        }

        /**
         * Set finalStatus
         **/
        public void setFinalStatus(String finalStatus) {
            this.finalStatus = finalStatus;
        }

        public SubscriptionItemQueryParam finalStatus(String finalStatus) {
            this.finalStatus = finalStatus;
            return this;
        }

        /**
        * The creation time of the subscription
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

        public SubscriptionItemQueryParam addTime(OffsetDateTime addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The update time of the subscription
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

        public SubscriptionItemQueryParam updateTime(OffsetDateTime updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SubscriptionItemQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
            sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
            sb.append("    cyclesCount: ").append(toIndentedString(cyclesCount)).append("\n");
            sb.append("    cycleAmount: ").append(toIndentedString(cycleAmount)).append("\n");
            sb.append("    infinite: ").append(toIndentedString(infinite)).append("\n");
            sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
            sb.append("    cadenceType: ").append(toIndentedString(cadenceType)).append("\n");
            sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
            sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
            sb.append("    lifetimeValue: ").append(toIndentedString(lifetimeValue)).append("\n");
            sb.append("    finalStatus: ").append(toIndentedString(finalStatus)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
