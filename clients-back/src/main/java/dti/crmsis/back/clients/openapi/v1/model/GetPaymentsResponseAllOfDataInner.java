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

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetPaymentsResponseAllOfDataInner  {

    /**
      * The ID of the payment
     **/
    private Integer id;
    /**
      * The ID of the subscription this payment is associated with
     **/
    private Integer subscriptionId;
    /**
      * The ID of the deal this payment is associated with
     **/
    private Integer dealId;
    /**
      * The payment status
     **/
    private Boolean isActive;
    /**
      * The payment amount
     **/
    private Double amount;
    /**
      * The currency of the payment
     **/
    private String currency;
    /**
      * The difference between the amount of the current payment and the previous payment. The value can be either positive or negative.
     **/
    private Double changeAmount;
    /**
      * The date when payment occurs
     **/
    private LocalDate dueAt;

    public enum RevenueMovementTypeEnum {
        NEW(String.valueOf("new")), RECURRING(String.valueOf("recurring")), EXPANSION(String.valueOf("expansion")), CONTRACTION(String.valueOf("contraction")), NONE(String.valueOf("none")), CHURN(String.valueOf("churn"));

        // caching enum access
        private static final java.util.EnumSet<RevenueMovementTypeEnum> values = java.util.EnumSet.allOf(RevenueMovementTypeEnum.class);

        String value;

        RevenueMovementTypeEnum (String v) {
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
        public static RevenueMovementTypeEnum fromString(String v) {
            for (RevenueMovementTypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    /**
      * Represents the movement of revenue in comparison with the previous payment. Possible values are: `New` - first payment of the subscription. `Recurring` - no movement. `Expansion` - current payment amount > previous payment amount. `Contraction` - current payment amount < previous payment amount. `Churn` - last payment of the subscription.
     **/
    private RevenueMovementTypeEnum revenueMovementType;

    public enum PaymentTypeEnum {
        RECURRING(String.valueOf("recurring")), ADDITIONAL(String.valueOf("additional")), INSTALLMENT(String.valueOf("installment"));

        // caching enum access
        private static final java.util.EnumSet<PaymentTypeEnum> values = java.util.EnumSet.allOf(PaymentTypeEnum.class);

        String value;

        PaymentTypeEnum (String v) {
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
        public static PaymentTypeEnum fromString(String v) {
            for (PaymentTypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    /**
      * The type of the payment. Possible values are: `Recurring` - payments occur over fixed intervals of time, `Additional` - extra payment not the recurring payment of the recurring subscription, `Installment` - payment of the installment subscription.
     **/
    private PaymentTypeEnum paymentType;
    /**
      * The description of the payment
     **/
    private String description;
    /**
      * The creation time of the payment
     **/
    private OffsetDateTime addTime;
    /**
      * The update time of the payment
     **/
    private OffsetDateTime updateTime;

    /**
    * The ID of the payment
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

    public GetPaymentsResponseAllOfDataInner id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The ID of the subscription this payment is associated with
    * @return subscriptionId
    **/
    @JsonProperty("subscription_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Set subscriptionId
     **/
    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public GetPaymentsResponseAllOfDataInner subscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
    * The ID of the deal this payment is associated with
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

    public GetPaymentsResponseAllOfDataInner dealId(Integer dealId) {
        this.dealId = dealId;
        return this;
    }

    /**
    * The payment status
    * @return isActive
    **/
    @JsonProperty("is_active")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * Set isActive
     **/
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public GetPaymentsResponseAllOfDataInner isActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
    * The payment amount
    * @return amount
    **/
    @JsonProperty("amount")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Double getAmount() {
        return amount;
    }

    /**
     * Set amount
     **/
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public GetPaymentsResponseAllOfDataInner amount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
    * The currency of the payment
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

    public GetPaymentsResponseAllOfDataInner currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
    * The difference between the amount of the current payment and the previous payment. The value can be either positive or negative.
    * @return changeAmount
    **/
    @JsonProperty("change_amount")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Double getChangeAmount() {
        return changeAmount;
    }

    /**
     * Set changeAmount
     **/
    public void setChangeAmount(Double changeAmount) {
        this.changeAmount = changeAmount;
    }

    public GetPaymentsResponseAllOfDataInner changeAmount(Double changeAmount) {
        this.changeAmount = changeAmount;
        return this;
    }

    /**
    * The date when payment occurs
    * @return dueAt
    **/
    @JsonProperty("due_at")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public LocalDate getDueAt() {
        return dueAt;
    }

    /**
     * Set dueAt
     **/
    public void setDueAt(LocalDate dueAt) {
        this.dueAt = dueAt;
    }

    public GetPaymentsResponseAllOfDataInner dueAt(LocalDate dueAt) {
        this.dueAt = dueAt;
        return this;
    }

    /**
    * Represents the movement of revenue in comparison with the previous payment. Possible values are: `New` - first payment of the subscription. `Recurring` - no movement. `Expansion` - current payment amount > previous payment amount. `Contraction` - current payment amount < previous payment amount. `Churn` - last payment of the subscription.
    * @return revenueMovementType
    **/
    @JsonProperty("revenue_movement_type")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public RevenueMovementTypeEnum getRevenueMovementType() {
        return revenueMovementType;
    }

    /**
     * Set revenueMovementType
     **/
    public void setRevenueMovementType(RevenueMovementTypeEnum revenueMovementType) {
        this.revenueMovementType = revenueMovementType;
    }

    public GetPaymentsResponseAllOfDataInner revenueMovementType(RevenueMovementTypeEnum revenueMovementType) {
        this.revenueMovementType = revenueMovementType;
        return this;
    }

    /**
    * The type of the payment. Possible values are: `Recurring` - payments occur over fixed intervals of time, `Additional` - extra payment not the recurring payment of the recurring subscription, `Installment` - payment of the installment subscription.
    * @return paymentType
    **/
    @JsonProperty("payment_type")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PaymentTypeEnum getPaymentType() {
        return paymentType;
    }

    /**
     * Set paymentType
     **/
    public void setPaymentType(PaymentTypeEnum paymentType) {
        this.paymentType = paymentType;
    }

    public GetPaymentsResponseAllOfDataInner paymentType(PaymentTypeEnum paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    /**
    * The description of the payment
    * @return description
    **/
    @JsonProperty("description")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Set description
     **/
    public void setDescription(String description) {
        this.description = description;
    }

    public GetPaymentsResponseAllOfDataInner description(String description) {
        this.description = description;
        return this;
    }

    /**
    * The creation time of the payment
    * @return addTime
    **/
    @JsonProperty("add_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public OffsetDateTime getAddTime() {
        return addTime;
    }

    /**
     * Set addTime
     **/
    public void setAddTime(OffsetDateTime addTime) {
        this.addTime = addTime;
    }

    public GetPaymentsResponseAllOfDataInner addTime(OffsetDateTime addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The update time of the payment
    * @return updateTime
    **/
    @JsonProperty("update_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * Set updateTime
     **/
    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public GetPaymentsResponseAllOfDataInner updateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPaymentsResponseAllOfDataInner {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
        sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    changeAmount: ").append(toIndentedString(changeAmount)).append("\n");
        sb.append("    dueAt: ").append(toIndentedString(dueAt)).append("\n");
        sb.append("    revenueMovementType: ").append(toIndentedString(revenueMovementType)).append("\n");
        sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetPaymentsResponseAllOfDataInner} object that
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

        GetPaymentsResponseAllOfDataInner model = (GetPaymentsResponseAllOfDataInner) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(subscriptionId, model.subscriptionId) &&
        java.util.Objects.equals(dealId, model.dealId) &&
        java.util.Objects.equals(isActive, model.isActive) &&
        java.util.Objects.equals(amount, model.amount) &&
        java.util.Objects.equals(currency, model.currency) &&
        java.util.Objects.equals(changeAmount, model.changeAmount) &&
        java.util.Objects.equals(dueAt, model.dueAt) &&
        java.util.Objects.equals(revenueMovementType, model.revenueMovementType) &&
        java.util.Objects.equals(paymentType, model.paymentType) &&
        java.util.Objects.equals(description, model.description) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime);
    }

    /**
     * Returns a hash code for a {@code GetPaymentsResponseAllOfDataInner}.
     *
     * @return a hash code value for a {@code GetPaymentsResponseAllOfDataInner}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        subscriptionId,
        dealId,
        isActive,
        amount,
        currency,
        changeAmount,
        dueAt,
        revenueMovementType,
        paymentType,
        description,
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

    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetPaymentsResponseAllOfDataInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("subscriptionId")
        private Integer subscriptionId;
        @jakarta.ws.rs.QueryParam("dealId")
        private Integer dealId;
        @jakarta.ws.rs.QueryParam("isActive")
        private Boolean isActive;
        @jakarta.ws.rs.QueryParam("amount")
        private Double amount;
        @jakarta.ws.rs.QueryParam("currency")
        private String currency;
        @jakarta.ws.rs.QueryParam("changeAmount")
        private Double changeAmount;
        @jakarta.ws.rs.QueryParam("dueAt")
        private LocalDate dueAt;

    public enum RevenueMovementTypeEnum {
        NEW(String.valueOf("new")), RECURRING(String.valueOf("recurring")), EXPANSION(String.valueOf("expansion")), CONTRACTION(String.valueOf("contraction")), NONE(String.valueOf("none")), CHURN(String.valueOf("churn"));

        // caching enum access
        private static final java.util.EnumSet<RevenueMovementTypeEnum> values = java.util.EnumSet.allOf(RevenueMovementTypeEnum.class);

        String value;

        RevenueMovementTypeEnum (String v) {
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
        public static RevenueMovementTypeEnum fromString(String v) {
            for (RevenueMovementTypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private RevenueMovementTypeEnum revenueMovementType;

    public enum PaymentTypeEnum {
        RECURRING(String.valueOf("recurring")), ADDITIONAL(String.valueOf("additional")), INSTALLMENT(String.valueOf("installment"));

        // caching enum access
        private static final java.util.EnumSet<PaymentTypeEnum> values = java.util.EnumSet.allOf(PaymentTypeEnum.class);

        String value;

        PaymentTypeEnum (String v) {
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
        public static PaymentTypeEnum fromString(String v) {
            for (PaymentTypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private PaymentTypeEnum paymentType;
        @jakarta.ws.rs.QueryParam("description")
        private String description;
        @jakarta.ws.rs.QueryParam("addTime")
        private OffsetDateTime addTime;
        @jakarta.ws.rs.QueryParam("updateTime")
        private OffsetDateTime updateTime;

        /**
        * The ID of the payment
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

        public GetPaymentsResponseAllOfDataInnerQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The ID of the subscription this payment is associated with
        * @return subscriptionId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("subscription_id")
        public Integer getSubscriptionId() {
            return subscriptionId;
        }

        /**
         * Set subscriptionId
         **/
        public void setSubscriptionId(Integer subscriptionId) {
            this.subscriptionId = subscriptionId;
        }

        public GetPaymentsResponseAllOfDataInnerQueryParam subscriptionId(Integer subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
        * The ID of the deal this payment is associated with
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

        public GetPaymentsResponseAllOfDataInnerQueryParam dealId(Integer dealId) {
            this.dealId = dealId;
            return this;
        }

        /**
        * The payment status
        * @return isActive
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("is_active")
        public Boolean getIsActive() {
            return isActive;
        }

        /**
         * Set isActive
         **/
        public void setIsActive(Boolean isActive) {
            this.isActive = isActive;
        }

        public GetPaymentsResponseAllOfDataInnerQueryParam isActive(Boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        /**
        * The payment amount
        * @return amount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("amount")
        public Double getAmount() {
            return amount;
        }

        /**
         * Set amount
         **/
        public void setAmount(Double amount) {
            this.amount = amount;
        }

        public GetPaymentsResponseAllOfDataInnerQueryParam amount(Double amount) {
            this.amount = amount;
            return this;
        }

        /**
        * The currency of the payment
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

        public GetPaymentsResponseAllOfDataInnerQueryParam currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
        * The difference between the amount of the current payment and the previous payment. The value can be either positive or negative.
        * @return changeAmount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("change_amount")
        public Double getChangeAmount() {
            return changeAmount;
        }

        /**
         * Set changeAmount
         **/
        public void setChangeAmount(Double changeAmount) {
            this.changeAmount = changeAmount;
        }

        public GetPaymentsResponseAllOfDataInnerQueryParam changeAmount(Double changeAmount) {
            this.changeAmount = changeAmount;
            return this;
        }

        /**
        * The date when payment occurs
        * @return dueAt
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("due_at")
        public LocalDate getDueAt() {
            return dueAt;
        }

        /**
         * Set dueAt
         **/
        public void setDueAt(LocalDate dueAt) {
            this.dueAt = dueAt;
        }

        public GetPaymentsResponseAllOfDataInnerQueryParam dueAt(LocalDate dueAt) {
            this.dueAt = dueAt;
            return this;
        }

        /**
        * Represents the movement of revenue in comparison with the previous payment. Possible values are: `New` - first payment of the subscription. `Recurring` - no movement. `Expansion` - current payment amount > previous payment amount. `Contraction` - current payment amount < previous payment amount. `Churn` - last payment of the subscription.
        * @return revenueMovementType
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("revenue_movement_type")
        public RevenueMovementTypeEnum getRevenueMovementType() {
            return revenueMovementType;
        }

        /**
         * Set revenueMovementType
         **/
        public void setRevenueMovementType(RevenueMovementTypeEnum revenueMovementType) {
            this.revenueMovementType = revenueMovementType;
        }

        public GetPaymentsResponseAllOfDataInnerQueryParam revenueMovementType(RevenueMovementTypeEnum revenueMovementType) {
            this.revenueMovementType = revenueMovementType;
            return this;
        }

        /**
        * The type of the payment. Possible values are: `Recurring` - payments occur over fixed intervals of time, `Additional` - extra payment not the recurring payment of the recurring subscription, `Installment` - payment of the installment subscription.
        * @return paymentType
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("payment_type")
        public PaymentTypeEnum getPaymentType() {
            return paymentType;
        }

        /**
         * Set paymentType
         **/
        public void setPaymentType(PaymentTypeEnum paymentType) {
            this.paymentType = paymentType;
        }

        public GetPaymentsResponseAllOfDataInnerQueryParam paymentType(PaymentTypeEnum paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
        * The description of the payment
        * @return description
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        public String getDescription() {
            return description;
        }

        /**
         * Set description
         **/
        public void setDescription(String description) {
            this.description = description;
        }

        public GetPaymentsResponseAllOfDataInnerQueryParam description(String description) {
            this.description = description;
            return this;
        }

        /**
        * The creation time of the payment
        * @return addTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("add_time")
        public OffsetDateTime getAddTime() {
            return addTime;
        }

        /**
         * Set addTime
         **/
        public void setAddTime(OffsetDateTime addTime) {
            this.addTime = addTime;
        }

        public GetPaymentsResponseAllOfDataInnerQueryParam addTime(OffsetDateTime addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The update time of the payment
        * @return updateTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("update_time")
        public OffsetDateTime getUpdateTime() {
            return updateTime;
        }

        /**
         * Set updateTime
         **/
        public void setUpdateTime(OffsetDateTime updateTime) {
            this.updateTime = updateTime;
        }

        public GetPaymentsResponseAllOfDataInnerQueryParam updateTime(OffsetDateTime updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetPaymentsResponseAllOfDataInnerQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
            sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
            sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
            sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
            sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
            sb.append("    changeAmount: ").append(toIndentedString(changeAmount)).append("\n");
            sb.append("    dueAt: ").append(toIndentedString(dueAt)).append("\n");
            sb.append("    revenueMovementType: ").append(toIndentedString(revenueMovementType)).append("\n");
            sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
