package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The currency summary. This parameter is dynamic and changes according to `currency_id` value.
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class PipelineDetailsAllOfDealsSummaryPerCurrencyFullCURRENCYID  {

    /**
      * Deals count per currency
     **/
    private Integer count;
    /**
      * Deals value per currency
     **/
    private Integer value;

    /**
    * Deals count per currency
    * @return count
    **/
    @JsonProperty("count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getCount() {
        return count;
    }

    /**
     * Set count
     **/
    public void setCount(Integer count) {
        this.count = count;
    }

    public PipelineDetailsAllOfDealsSummaryPerCurrencyFullCURRENCYID count(Integer count) {
        this.count = count;
        return this;
    }

    /**
    * Deals value per currency
    * @return value
    **/
    @JsonProperty("value")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getValue() {
        return value;
    }

    /**
     * Set value
     **/
    public void setValue(Integer value) {
        this.value = value;
    }

    public PipelineDetailsAllOfDealsSummaryPerCurrencyFullCURRENCYID value(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineDetailsAllOfDealsSummaryPerCurrencyFullCURRENCYID {\n");

        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code PipelineDetailsAllOfDealsSummaryPerCurrencyFullCURRENCYID} object that
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

        PipelineDetailsAllOfDealsSummaryPerCurrencyFullCURRENCYID model = (PipelineDetailsAllOfDealsSummaryPerCurrencyFullCURRENCYID) obj;

        return java.util.Objects.equals(count, model.count) &&
        java.util.Objects.equals(value, model.value);
    }

    /**
     * Returns a hash code for a {@code PipelineDetailsAllOfDealsSummaryPerCurrencyFullCURRENCYID}.
     *
     * @return a hash code value for a {@code PipelineDetailsAllOfDealsSummaryPerCurrencyFullCURRENCYID}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(count,
        value);
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
      * The currency summary. This parameter is dynamic and changes according to `currency_id` value.
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class PipelineDetailsAllOfDealsSummaryPerCurrencyFullCURRENCYIDQueryParam  {

        /**
          * The currency summary. This parameter is dynamic and changes according to `currency_id` value.
         **/
        @jakarta.ws.rs.QueryParam("count")
        private Integer count;
        /**
          * The currency summary. This parameter is dynamic and changes according to `currency_id` value.
         **/
        @jakarta.ws.rs.QueryParam("value")
        private Integer value;

        /**
        * Deals count per currency
        * @return count
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        public Integer getCount() {
            return count;
        }

        /**
         * Set count
         **/
        public void setCount(Integer count) {
            this.count = count;
        }

        public PipelineDetailsAllOfDealsSummaryPerCurrencyFullCURRENCYIDQueryParam count(Integer count) {
            this.count = count;
            return this;
        }

        /**
        * Deals value per currency
        * @return value
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        public Integer getValue() {
            return value;
        }

        /**
         * Set value
         **/
        public void setValue(Integer value) {
            this.value = value;
        }

        public PipelineDetailsAllOfDealsSummaryPerCurrencyFullCURRENCYIDQueryParam value(Integer value) {
            this.value = value;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PipelineDetailsAllOfDealsSummaryPerCurrencyFullCURRENCYIDQueryParam {\n");

            sb.append("    count: ").append(toIndentedString(count)).append("\n");
            sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
