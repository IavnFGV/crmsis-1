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
  * The total weighted values of the deals grouped by deal currency. The weighted value is calculated as probability times deal value.
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetDealsSummaryResponseDataWeightedValuesTotal  {

    /**
      * The total weighted value of the deals in the deal currency group
     **/
    private BigDecimal value;
    /**
      * The number of deals in the deal currency group
     **/
    private Integer count;
    /**
      * The total weighted value of the deals formatted with deal currency. E.g. €50
     **/
    private String valueFormatted;

    /**
    * The total weighted value of the deals in the deal currency group
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

    public GetDealsSummaryResponseDataWeightedValuesTotal value(BigDecimal value) {
        this.value = value;
        return this;
    }

    /**
    * The number of deals in the deal currency group
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

    public GetDealsSummaryResponseDataWeightedValuesTotal count(Integer count) {
        this.count = count;
        return this;
    }

    /**
    * The total weighted value of the deals formatted with deal currency. E.g. €50
    * @return valueFormatted
    **/
    @JsonProperty("value_formatted")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getValueFormatted() {
        return valueFormatted;
    }

    /**
     * Set valueFormatted
     **/
    public void setValueFormatted(String valueFormatted) {
        this.valueFormatted = valueFormatted;
    }

    public GetDealsSummaryResponseDataWeightedValuesTotal valueFormatted(String valueFormatted) {
        this.valueFormatted = valueFormatted;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetDealsSummaryResponseDataWeightedValuesTotal {\n");

        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    valueFormatted: ").append(toIndentedString(valueFormatted)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetDealsSummaryResponseDataWeightedValuesTotal} object that
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

        GetDealsSummaryResponseDataWeightedValuesTotal model = (GetDealsSummaryResponseDataWeightedValuesTotal) obj;

        return java.util.Objects.equals(value, model.value) &&
        java.util.Objects.equals(count, model.count) &&
        java.util.Objects.equals(valueFormatted, model.valueFormatted);
    }

    /**
     * Returns a hash code for a {@code GetDealsSummaryResponseDataWeightedValuesTotal}.
     *
     * @return a hash code value for a {@code GetDealsSummaryResponseDataWeightedValuesTotal}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value,
        count,
        valueFormatted);
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
      * The total weighted values of the deals grouped by deal currency. The weighted value is calculated as probability times deal value.
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetDealsSummaryResponseDataWeightedValuesTotalQueryParam  {

        /**
          * The total weighted values of the deals grouped by deal currency. The weighted value is calculated as probability times deal value.
         **/
        @jakarta.ws.rs.QueryParam("value")
        private BigDecimal value;
        /**
          * The total weighted values of the deals grouped by deal currency. The weighted value is calculated as probability times deal value.
         **/
        @jakarta.ws.rs.QueryParam("count")
        private Integer count;
        /**
          * The total weighted values of the deals grouped by deal currency. The weighted value is calculated as probability times deal value.
         **/
        @jakarta.ws.rs.QueryParam("valueFormatted")
        private String valueFormatted;

        /**
        * The total weighted value of the deals in the deal currency group
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

        public GetDealsSummaryResponseDataWeightedValuesTotalQueryParam value(BigDecimal value) {
            this.value = value;
            return this;
        }

        /**
        * The number of deals in the deal currency group
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

        public GetDealsSummaryResponseDataWeightedValuesTotalQueryParam count(Integer count) {
            this.count = count;
            return this;
        }

        /**
        * The total weighted value of the deals formatted with deal currency. E.g. €50
        * @return valueFormatted
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("value_formatted")
        public String getValueFormatted() {
            return valueFormatted;
        }

        /**
         * Set valueFormatted
         **/
        public void setValueFormatted(String valueFormatted) {
            this.valueFormatted = valueFormatted;
        }

        public GetDealsSummaryResponseDataWeightedValuesTotalQueryParam valueFormatted(String valueFormatted) {
            this.valueFormatted = valueFormatted;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetDealsSummaryResponseDataWeightedValuesTotalQueryParam {\n");

            sb.append("    value: ").append(toIndentedString(value)).append("\n");
            sb.append("    count: ").append(toIndentedString(count)).append("\n");
            sb.append("    valueFormatted: ").append(toIndentedString(valueFormatted)).append("\n");
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
