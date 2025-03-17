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
public class UpdateRecurringSubscriptionRequest  {

    /**
      * The description of the recurring subscription
     **/
    private String description;
    /**
      * The amount of each payment
     **/
    private Integer cycleAmount;
    /**
      * Array of additional payments. It requires a minimum structure as follows: [{ amount:SUM, description:DESCRIPTION, due_at:PAYMENT_DATE }]. Replace SUM with a payment amount, DESCRIPTION with an explanation string, PAYMENT_DATE with a date (format YYYY-MM-DD).
     **/
    private List<Object> payments;
    /**
      * Indicates that the deal value must be set to recurring subscription's MRR value
     **/
    private Boolean updateDealValue;
    /**
      * All payments after that date will be affected. Format: YYYY-MM-DD
     **/
    private LocalDate effectiveDate;

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

    public UpdateRecurringSubscriptionRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
    * The amount of each payment
    * @return cycleAmount
    **/
    @JsonProperty("cycle_amount")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getCycleAmount() {
        return cycleAmount;
    }

    /**
     * Set cycleAmount
     **/
    public void setCycleAmount(Integer cycleAmount) {
        this.cycleAmount = cycleAmount;
    }

    public UpdateRecurringSubscriptionRequest cycleAmount(Integer cycleAmount) {
        this.cycleAmount = cycleAmount;
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

    public UpdateRecurringSubscriptionRequest payments(List<Object> payments) {
        this.payments = payments;
        return this;
    }
    public UpdateRecurringSubscriptionRequest addPaymentsItem(Object paymentsItem) {
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

    public UpdateRecurringSubscriptionRequest updateDealValue(Boolean updateDealValue) {
        this.updateDealValue = updateDealValue;
        return this;
    }

    /**
    * All payments after that date will be affected. Format: YYYY-MM-DD
    * @return effectiveDate
    **/
    @JsonProperty("effective_date")
    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Set effectiveDate
     **/
    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public UpdateRecurringSubscriptionRequest effectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRecurringSubscriptionRequest {\n");

        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    cycleAmount: ").append(toIndentedString(cycleAmount)).append("\n");
        sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
        sb.append("    updateDealValue: ").append(toIndentedString(updateDealValue)).append("\n");
        sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code UpdateRecurringSubscriptionRequest} object that
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

        UpdateRecurringSubscriptionRequest model = (UpdateRecurringSubscriptionRequest) obj;

        return java.util.Objects.equals(description, model.description) &&
        java.util.Objects.equals(cycleAmount, model.cycleAmount) &&
        java.util.Objects.equals(payments, model.payments) &&
        java.util.Objects.equals(updateDealValue, model.updateDealValue) &&
        java.util.Objects.equals(effectiveDate, model.effectiveDate);
    }

    /**
     * Returns a hash code for a {@code UpdateRecurringSubscriptionRequest}.
     *
     * @return a hash code value for a {@code UpdateRecurringSubscriptionRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(description,
        cycleAmount,
        payments,
        updateDealValue,
        effectiveDate);
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
    public static class UpdateRecurringSubscriptionRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("description")
        private String description;
        @jakarta.ws.rs.QueryParam("cycleAmount")
        private Integer cycleAmount;
        @jakarta.ws.rs.QueryParam("payments")
        private List<Object> payments = null;
        @jakarta.ws.rs.QueryParam("updateDealValue")
        private Boolean updateDealValue;
        @jakarta.ws.rs.QueryParam("effectiveDate")
        private LocalDate effectiveDate;

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

        public UpdateRecurringSubscriptionRequestQueryParam description(String description) {
            this.description = description;
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

        public UpdateRecurringSubscriptionRequestQueryParam cycleAmount(Integer cycleAmount) {
            this.cycleAmount = cycleAmount;
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

        public UpdateRecurringSubscriptionRequestQueryParam payments(List<Object> payments) {
            this.payments = payments;
            return this;
        }
        public UpdateRecurringSubscriptionRequestQueryParam addPaymentsItem(Object paymentsItem) {
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

        public UpdateRecurringSubscriptionRequestQueryParam updateDealValue(Boolean updateDealValue) {
            this.updateDealValue = updateDealValue;
            return this;
        }

        /**
        * All payments after that date will be affected. Format: YYYY-MM-DD
        * @return effectiveDate
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("effective_date")
        public LocalDate getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * Set effectiveDate
         **/
        public void setEffectiveDate(LocalDate effectiveDate) {
            this.effectiveDate = effectiveDate;
        }

        public UpdateRecurringSubscriptionRequestQueryParam effectiveDate(LocalDate effectiveDate) {
            this.effectiveDate = effectiveDate;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class UpdateRecurringSubscriptionRequestQueryParam {\n");

            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    cycleAmount: ").append(toIndentedString(cycleAmount)).append("\n");
            sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
            sb.append("    updateDealValue: ").append(toIndentedString(updateDealValue)).append("\n");
            sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
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
