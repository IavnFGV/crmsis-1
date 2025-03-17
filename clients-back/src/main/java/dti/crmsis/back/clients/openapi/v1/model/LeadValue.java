package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The potential value of the lead represented by a JSON object: `{ \"amount\": 200, \"currency\": \"EUR\" }`. Both amount and currency are required.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class LeadValue  {

    private BigDecimal amount;
    private String currency;

    /**
    * Get amount
    * @return amount
    **/
    @JsonProperty("amount")
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Set amount
     **/
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LeadValue amount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
    * Get currency
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

    public LeadValue currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LeadValue {\n");

        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code LeadValue} object that
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

        LeadValue model = (LeadValue) obj;

        return java.util.Objects.equals(amount, model.amount) &&
        java.util.Objects.equals(currency, model.currency);
    }

    /**
     * Returns a hash code for a {@code LeadValue}.
     *
     * @return a hash code value for a {@code LeadValue}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(amount,
        currency);
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

    /**
      * The potential value of the lead represented by a JSON object: `{ \"amount\": 200, \"currency\": \"EUR\" }`. Both amount and currency are required.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class LeadValueQueryParam  {

        /**
          * The potential value of the lead represented by a JSON object: `{ \"amount\": 200, \"currency\": \"EUR\" }`. Both amount and currency are required.
         **/
        @jakarta.ws.rs.QueryParam("amount")
        private BigDecimal amount;
        /**
          * The potential value of the lead represented by a JSON object: `{ \"amount\": 200, \"currency\": \"EUR\" }`. Both amount and currency are required.
         **/
        @jakarta.ws.rs.QueryParam("currency")
        private String currency;

        /**
        * Get amount
        * @return amount
        **/
        @JsonProperty("amount")
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Set amount
         **/
        public void setAmount(BigDecimal amount) {
            this.amount = amount;
        }

        public LeadValueQueryParam amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        /**
        * Get currency
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

        public LeadValueQueryParam currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LeadValueQueryParam {\n");

            sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
            sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
