package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class AddRecurringSubscriptionRequest  {

    /**
      * The ID of the deal this recurring subscription is associated with
     **/
    private Integer dealId;
    /**
      * The currency of the recurring subscription. Accepts a 3-character currency code.
     **/
    private String currency;
    /**
      * The description of the recurring subscription
     **/
    private String description;

    public enum CadenceTypeEnum {
        WEEKLY(String.valueOf("weekly")), MONTHLY(String.valueOf("monthly")), QUARTERLY(String.valueOf("quarterly")), YEARLY(String.valueOf("yearly"));

        // caching enum access
        private static final java.util.EnumSet<CadenceTypeEnum> values = java.util.EnumSet.allOf(CadenceTypeEnum.class);

        String value;

        CadenceTypeEnum (String v) {
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
        public static CadenceTypeEnum fromString(String v) {
            for (CadenceTypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    /**
      * The interval between payments
     **/
    private CadenceTypeEnum cadenceType;
    /**
      * Shows how many payments the subscription has. Note that one field must be set: `cycles_count` or `infinite`. If `cycles_count` is set, then `cycle_amount` and `start_date` are also required.
     **/
    private Integer cyclesCount;
    /**
      * The amount of each payment
     **/
    private Integer cycleAmount;
    /**
      * The start date of the recurring subscription. Format: YYYY-MM-DD
     **/
    private LocalDate startDate;
    /**
      * This indicates that the recurring subscription will last until it's manually canceled or deleted. Note that only one field must be set: `cycles_count` or `infinite`.
     **/
    private Boolean infinite;
    /**
      * Array of additional payments. It requires a minimum structure as follows: [{ amount:SUM, description:DESCRIPTION, due_at:PAYMENT_DATE }]. Replace SUM with a payment amount, DESCRIPTION with an explanation string, PAYMENT_DATE with a date (format YYYY-MM-DD).
     **/
    private List<Object> payments;
    /**
      * Indicates that the deal value must be set to recurring subscription's MRR value
     **/
    private Boolean updateDealValue;

    /**
    * The ID of the deal this recurring subscription is associated with
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

    public AddRecurringSubscriptionRequest dealId(Integer dealId) {
        this.dealId = dealId;
        return this;
    }

    /**
    * The currency of the recurring subscription. Accepts a 3-character currency code.
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

    public AddRecurringSubscriptionRequest currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
    * The description of the recurring subscription
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

    public AddRecurringSubscriptionRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
    * The interval between payments
    * @return cadenceType
    **/
    @JsonProperty("cadence_type")
    public CadenceTypeEnum getCadenceType() {
        return cadenceType;
    }

    /**
     * Set cadenceType
     **/
    public void setCadenceType(CadenceTypeEnum cadenceType) {
        this.cadenceType = cadenceType;
    }

    public AddRecurringSubscriptionRequest cadenceType(CadenceTypeEnum cadenceType) {
        this.cadenceType = cadenceType;
        return this;
    }

    /**
    * Shows how many payments the subscription has. Note that one field must be set: `cycles_count` or `infinite`. If `cycles_count` is set, then `cycle_amount` and `start_date` are also required.
    * @return cyclesCount
    **/
    @JsonProperty("cycles_count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getCyclesCount() {
        return cyclesCount;
    }

    /**
     * Set cyclesCount
     **/
    public void setCyclesCount(Integer cyclesCount) {
        this.cyclesCount = cyclesCount;
    }

    public AddRecurringSubscriptionRequest cyclesCount(Integer cyclesCount) {
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

    public AddRecurringSubscriptionRequest cycleAmount(Integer cycleAmount) {
        this.cycleAmount = cycleAmount;
        return this;
    }

    /**
    * The start date of the recurring subscription. Format: YYYY-MM-DD
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

    public AddRecurringSubscriptionRequest startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
    * This indicates that the recurring subscription will last until it's manually canceled or deleted. Note that only one field must be set: `cycles_count` or `infinite`.
    * @return infinite
    **/
    @JsonProperty("infinite")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getInfinite() {
        return infinite;
    }

    /**
     * Set infinite
     **/
    public void setInfinite(Boolean infinite) {
        this.infinite = infinite;
    }

    public AddRecurringSubscriptionRequest infinite(Boolean infinite) {
        this.infinite = infinite;
        return this;
    }

    /**
    * Array of additional payments. It requires a minimum structure as follows: [{ amount:SUM, description:DESCRIPTION, due_at:PAYMENT_DATE }]. Replace SUM with a payment amount, DESCRIPTION with an explanation string, PAYMENT_DATE with a date (format YYYY-MM-DD).
    * @return payments
    **/
    @JsonProperty("payments")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Object> getPayments() {
        return payments;
    }

    /**
     * Set payments
     **/
    public void setPayments(List<Object> payments) {
        this.payments = payments;
    }

    public AddRecurringSubscriptionRequest payments(List<Object> payments) {
        this.payments = payments;
        return this;
    }
    public AddRecurringSubscriptionRequest addPaymentsItem(Object paymentsItem) {
        if (this.payments == null){
            payments = new ArrayList<>();
        }
        this.payments.add(paymentsItem);
        return this;
    }

    /**
    * Indicates that the deal value must be set to recurring subscription's MRR value
    * @return updateDealValue
    **/
    @JsonProperty("update_deal_value")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getUpdateDealValue() {
        return updateDealValue;
    }

    /**
     * Set updateDealValue
     **/
    public void setUpdateDealValue(Boolean updateDealValue) {
        this.updateDealValue = updateDealValue;
    }

    public AddRecurringSubscriptionRequest updateDealValue(Boolean updateDealValue) {
        this.updateDealValue = updateDealValue;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddRecurringSubscriptionRequest {\n");

        sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    cadenceType: ").append(toIndentedString(cadenceType)).append("\n");
        sb.append("    cyclesCount: ").append(toIndentedString(cyclesCount)).append("\n");
        sb.append("    cycleAmount: ").append(toIndentedString(cycleAmount)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    infinite: ").append(toIndentedString(infinite)).append("\n");
        sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
        sb.append("    updateDealValue: ").append(toIndentedString(updateDealValue)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddRecurringSubscriptionRequest} object that
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

        AddRecurringSubscriptionRequest model = (AddRecurringSubscriptionRequest) obj;

        return java.util.Objects.equals(dealId, model.dealId) &&
        java.util.Objects.equals(currency, model.currency) &&
        java.util.Objects.equals(description, model.description) &&
        java.util.Objects.equals(cadenceType, model.cadenceType) &&
        java.util.Objects.equals(cyclesCount, model.cyclesCount) &&
        java.util.Objects.equals(cycleAmount, model.cycleAmount) &&
        java.util.Objects.equals(startDate, model.startDate) &&
        java.util.Objects.equals(infinite, model.infinite) &&
        java.util.Objects.equals(payments, model.payments) &&
        java.util.Objects.equals(updateDealValue, model.updateDealValue);
    }

    /**
     * Returns a hash code for a {@code AddRecurringSubscriptionRequest}.
     *
     * @return a hash code value for a {@code AddRecurringSubscriptionRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(dealId,
        currency,
        description,
        cadenceType,
        cyclesCount,
        cycleAmount,
        startDate,
        infinite,
        payments,
        updateDealValue);
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
    public static class AddRecurringSubscriptionRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("dealId")
        private Integer dealId;
        @jakarta.ws.rs.QueryParam("currency")
        private String currency;
        @jakarta.ws.rs.QueryParam("description")
        private String description;

    public enum CadenceTypeEnum {
        WEEKLY(String.valueOf("weekly")), MONTHLY(String.valueOf("monthly")), QUARTERLY(String.valueOf("quarterly")), YEARLY(String.valueOf("yearly"));

        // caching enum access
        private static final java.util.EnumSet<CadenceTypeEnum> values = java.util.EnumSet.allOf(CadenceTypeEnum.class);

        String value;

        CadenceTypeEnum (String v) {
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
        public static CadenceTypeEnum fromString(String v) {
            for (CadenceTypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private CadenceTypeEnum cadenceType;
        @jakarta.ws.rs.QueryParam("cyclesCount")
        private Integer cyclesCount;
        @jakarta.ws.rs.QueryParam("cycleAmount")
        private Integer cycleAmount;
        @jakarta.ws.rs.QueryParam("startDate")
        private LocalDate startDate;
        @jakarta.ws.rs.QueryParam("infinite")
        private Boolean infinite;
        @jakarta.ws.rs.QueryParam("payments")
        private List<Object> payments = null;
        @jakarta.ws.rs.QueryParam("updateDealValue")
        private Boolean updateDealValue;

        /**
        * The ID of the deal this recurring subscription is associated with
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

        public AddRecurringSubscriptionRequestQueryParam dealId(Integer dealId) {
            this.dealId = dealId;
            return this;
        }

        /**
        * The currency of the recurring subscription. Accepts a 3-character currency code.
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

        public AddRecurringSubscriptionRequestQueryParam currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
        * The description of the recurring subscription
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

        public AddRecurringSubscriptionRequestQueryParam description(String description) {
            this.description = description;
            return this;
        }

        /**
        * The interval between payments
        * @return cadenceType
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("cadence_type")
        public CadenceTypeEnum getCadenceType() {
            return cadenceType;
        }

        /**
         * Set cadenceType
         **/
        public void setCadenceType(CadenceTypeEnum cadenceType) {
            this.cadenceType = cadenceType;
        }

        public AddRecurringSubscriptionRequestQueryParam cadenceType(CadenceTypeEnum cadenceType) {
            this.cadenceType = cadenceType;
            return this;
        }

        /**
        * Shows how many payments the subscription has. Note that one field must be set: `cycles_count` or `infinite`. If `cycles_count` is set, then `cycle_amount` and `start_date` are also required.
        * @return cyclesCount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("cycles_count")
        public Integer getCyclesCount() {
            return cyclesCount;
        }

        /**
         * Set cyclesCount
         **/
        public void setCyclesCount(Integer cyclesCount) {
            this.cyclesCount = cyclesCount;
        }

        public AddRecurringSubscriptionRequestQueryParam cyclesCount(Integer cyclesCount) {
            this.cyclesCount = cyclesCount;
            return this;
        }

        /**
        * The amount of each payment
        * @return cycleAmount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("cycle_amount")
        public Integer getCycleAmount() {
            return cycleAmount;
        }

        /**
         * Set cycleAmount
         **/
        public void setCycleAmount(Integer cycleAmount) {
            this.cycleAmount = cycleAmount;
        }

        public AddRecurringSubscriptionRequestQueryParam cycleAmount(Integer cycleAmount) {
            this.cycleAmount = cycleAmount;
            return this;
        }

        /**
        * The start date of the recurring subscription. Format: YYYY-MM-DD
        * @return startDate
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("start_date")
        public LocalDate getStartDate() {
            return startDate;
        }

        /**
         * Set startDate
         **/
        public void setStartDate(LocalDate startDate) {
            this.startDate = startDate;
        }

        public AddRecurringSubscriptionRequestQueryParam startDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
        * This indicates that the recurring subscription will last until it's manually canceled or deleted. Note that only one field must be set: `cycles_count` or `infinite`.
        * @return infinite
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("infinite")
        public Boolean getInfinite() {
            return infinite;
        }

        /**
         * Set infinite
         **/
        public void setInfinite(Boolean infinite) {
            this.infinite = infinite;
        }

        public AddRecurringSubscriptionRequestQueryParam infinite(Boolean infinite) {
            this.infinite = infinite;
            return this;
        }

        /**
        * Array of additional payments. It requires a minimum structure as follows: [{ amount:SUM, description:DESCRIPTION, due_at:PAYMENT_DATE }]. Replace SUM with a payment amount, DESCRIPTION with an explanation string, PAYMENT_DATE with a date (format YYYY-MM-DD).
        * @return payments
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("payments")
        public List<Object> getPayments() {
            return payments;
        }

        /**
         * Set payments
         **/
        public void setPayments(List<Object> payments) {
            this.payments = payments;
        }

        public AddRecurringSubscriptionRequestQueryParam payments(List<Object> payments) {
            this.payments = payments;
            return this;
        }
        public AddRecurringSubscriptionRequestQueryParam addPaymentsItem(Object paymentsItem) {
            this.payments.add(paymentsItem);
            return this;
        }

        /**
        * Indicates that the deal value must be set to recurring subscription's MRR value
        * @return updateDealValue
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("update_deal_value")
        public Boolean getUpdateDealValue() {
            return updateDealValue;
        }

        /**
         * Set updateDealValue
         **/
        public void setUpdateDealValue(Boolean updateDealValue) {
            this.updateDealValue = updateDealValue;
        }

        public AddRecurringSubscriptionRequestQueryParam updateDealValue(Boolean updateDealValue) {
            this.updateDealValue = updateDealValue;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddRecurringSubscriptionRequestQueryParam {\n");

            sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
            sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    cadenceType: ").append(toIndentedString(cadenceType)).append("\n");
            sb.append("    cyclesCount: ").append(toIndentedString(cyclesCount)).append("\n");
            sb.append("    cycleAmount: ").append(toIndentedString(cycleAmount)).append("\n");
            sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
            sb.append("    infinite: ").append(toIndentedString(infinite)).append("\n");
            sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
            sb.append("    updateDealValue: ").append(toIndentedString(updateDealValue)).append("\n");
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
