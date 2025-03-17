package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The currency count summary
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class PipelineDetailsAllOfDealsSummaryPerCurrency  {

    /**
      * Deals count per currency. This parameter is dynamic and changes according to `currency_id` value.
     **/
    private Integer CURRENCY_ID;

    /**
    * Deals count per currency. This parameter is dynamic and changes according to `currency_id` value.
    * @return CURRENCY_ID
    **/
    @JsonProperty("CURRENCY_ID")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getCURRENCYID() {
        return CURRENCY_ID;
    }

    /**
     * Set CURRENCY_ID
     **/
    public void setCURRENCYID(Integer CURRENCY_ID) {
        this.CURRENCY_ID = CURRENCY_ID;
    }

    public PipelineDetailsAllOfDealsSummaryPerCurrency CURRENCY_ID(Integer CURRENCY_ID) {
        this.CURRENCY_ID = CURRENCY_ID;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineDetailsAllOfDealsSummaryPerCurrency {\n");

        sb.append("    CURRENCY_ID: ").append(toIndentedString(CURRENCY_ID)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code PipelineDetailsAllOfDealsSummaryPerCurrency} object that
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

        PipelineDetailsAllOfDealsSummaryPerCurrency model = (PipelineDetailsAllOfDealsSummaryPerCurrency) obj;

        return java.util.Objects.equals(CURRENCY_ID, model.CURRENCY_ID);
    }

    /**
     * Returns a hash code for a {@code PipelineDetailsAllOfDealsSummaryPerCurrency}.
     *
     * @return a hash code value for a {@code PipelineDetailsAllOfDealsSummaryPerCurrency}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(CURRENCY_ID);
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
      * The currency count summary
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class PipelineDetailsAllOfDealsSummaryPerCurrencyQueryParam  {

        /**
          * The currency count summary
         **/
        @jakarta.ws.rs.QueryParam("CURRENCY_ID")
        private Integer CURRENCY_ID;

        /**
        * Deals count per currency. This parameter is dynamic and changes according to `currency_id` value.
        * @return CURRENCY_ID
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("CURRENCY_ID")
        public Integer getCURRENCYID() {
            return CURRENCY_ID;
        }

        /**
         * Set CURRENCY_ID
         **/
        public void setCURRENCYID(Integer CURRENCY_ID) {
            this.CURRENCY_ID = CURRENCY_ID;
        }

        public PipelineDetailsAllOfDealsSummaryPerCurrencyQueryParam CURRENCY_ID(Integer CURRENCY_ID) {
            this.CURRENCY_ID = CURRENCY_ID;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PipelineDetailsAllOfDealsSummaryPerCurrencyQueryParam {\n");

            sb.append("    CURRENCY_ID: ").append(toIndentedString(CURRENCY_ID)).append("\n");
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
