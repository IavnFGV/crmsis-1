package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class AddSubscriptionInstallmentRequest  {

    /**
      * The ID of the deal this installment subscription is associated with
     **/
    private Integer dealId;
    /**
      * The currency of the installment subscription. Accepts a 3-character currency code.
     **/
    private String currency;
    /**
      * Array of payments. It requires a minimum structure as follows: [{ amount:SUM, description:DESCRIPTION, due_at:PAYMENT_DATE }]. Replace SUM with a payment amount, DESCRIPTION with an explanation string, PAYMENT_DATE with a date (format YYYY-MM-DD).
     **/
    private List<Object> payments = new ArrayList<>();
    /**
      * Indicates that the deal value must be set to the installment subscription's total value
     **/
    private Boolean updateDealValue;

    /**
    * The ID of the deal this installment subscription is associated with
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

    public AddSubscriptionInstallmentRequest dealId(Integer dealId) {
        this.dealId = dealId;
        return this;
    }

    /**
    * The currency of the installment subscription. Accepts a 3-character currency code.
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

    public AddSubscriptionInstallmentRequest currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
    * Array of payments. It requires a minimum structure as follows: [{ amount:SUM, description:DESCRIPTION, due_at:PAYMENT_DATE }]. Replace SUM with a payment amount, DESCRIPTION with an explanation string, PAYMENT_DATE with a date (format YYYY-MM-DD).
    * @return payments
    **/
    @JsonProperty("payments")
    public List<Object> getPayments() {
        return payments;
    }

    /**
     * Set payments
     **/
    public void setPayments(List<Object> payments) {
        this.payments = payments;
    }

    public AddSubscriptionInstallmentRequest payments(List<Object> payments) {
        this.payments = payments;
        return this;
    }
    public AddSubscriptionInstallmentRequest addPaymentsItem(Object paymentsItem) {
        if (this.payments == null){
            payments = new ArrayList<>();
        }
        this.payments.add(paymentsItem);
        return this;
    }

    /**
    * Indicates that the deal value must be set to the installment subscription's total value
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

    public AddSubscriptionInstallmentRequest updateDealValue(Boolean updateDealValue) {
        this.updateDealValue = updateDealValue;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddSubscriptionInstallmentRequest {\n");

        sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
        sb.append("    updateDealValue: ").append(toIndentedString(updateDealValue)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddSubscriptionInstallmentRequest} object that
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

        AddSubscriptionInstallmentRequest model = (AddSubscriptionInstallmentRequest) obj;

        return java.util.Objects.equals(dealId, model.dealId) &&
        java.util.Objects.equals(currency, model.currency) &&
        java.util.Objects.equals(payments, model.payments) &&
        java.util.Objects.equals(updateDealValue, model.updateDealValue);
    }

    /**
     * Returns a hash code for a {@code AddSubscriptionInstallmentRequest}.
     *
     * @return a hash code value for a {@code AddSubscriptionInstallmentRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(dealId,
        currency,
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
    public static class AddSubscriptionInstallmentRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("dealId")
        private Integer dealId;
        @jakarta.ws.rs.QueryParam("currency")
        private String currency;
        @jakarta.ws.rs.QueryParam("payments")
        private List<Object> payments = new ArrayList<>();
        @jakarta.ws.rs.QueryParam("updateDealValue")
        private Boolean updateDealValue;

        /**
        * The ID of the deal this installment subscription is associated with
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

        public AddSubscriptionInstallmentRequestQueryParam dealId(Integer dealId) {
            this.dealId = dealId;
            return this;
        }

        /**
        * The currency of the installment subscription. Accepts a 3-character currency code.
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

        public AddSubscriptionInstallmentRequestQueryParam currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
        * Array of payments. It requires a minimum structure as follows: [{ amount:SUM, description:DESCRIPTION, due_at:PAYMENT_DATE }]. Replace SUM with a payment amount, DESCRIPTION with an explanation string, PAYMENT_DATE with a date (format YYYY-MM-DD).
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

        public AddSubscriptionInstallmentRequestQueryParam payments(List<Object> payments) {
            this.payments = payments;
            return this;
        }
        public AddSubscriptionInstallmentRequestQueryParam addPaymentsItem(Object paymentsItem) {
            this.payments.add(paymentsItem);
            return this;
        }

        /**
        * Indicates that the deal value must be set to the installment subscription's total value
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

        public AddSubscriptionInstallmentRequestQueryParam updateDealValue(Boolean updateDealValue) {
            this.updateDealValue = updateDealValue;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddSubscriptionInstallmentRequestQueryParam {\n");

            sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
            sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
