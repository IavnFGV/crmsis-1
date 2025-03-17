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
  * The total values of the deals grouped by deal currency
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetDealsSummaryResponseDataValuesTotal  {

    /**
      * The total value of deals in the deal currency group
     **/
    private BigDecimal value;
    /**
      * The number of deals in the deal currency group
     **/
    private Integer count;
    /**
      * The total value of deals converted into the company default currency
     **/
    private BigDecimal valueConverted;
    /**
      * The total value of deals formatted with deal currency. E.g. €50
     **/
    private String valueFormatted;
    /**
      * The value_converted formatted with deal currency. E.g. US$50.10
     **/
    private String valueConvertedFormatted;

    /**
    * The total value of deals in the deal currency group
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

    public GetDealsSummaryResponseDataValuesTotal value(BigDecimal value) {
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

    public GetDealsSummaryResponseDataValuesTotal count(Integer count) {
        this.count = count;
        return this;
    }

    /**
    * The total value of deals converted into the company default currency
    * @return valueConverted
    **/
    @JsonProperty("value_converted")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getValueConverted() {
        return valueConverted;
    }

    /**
     * Set valueConverted
     **/
    public void setValueConverted(BigDecimal valueConverted) {
        this.valueConverted = valueConverted;
    }

    public GetDealsSummaryResponseDataValuesTotal valueConverted(BigDecimal valueConverted) {
        this.valueConverted = valueConverted;
        return this;
    }

    /**
    * The total value of deals formatted with deal currency. E.g. €50
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

    public GetDealsSummaryResponseDataValuesTotal valueFormatted(String valueFormatted) {
        this.valueFormatted = valueFormatted;
        return this;
    }

    /**
    * The value_converted formatted with deal currency. E.g. US$50.10
    * @return valueConvertedFormatted
    **/
    @JsonProperty("value_converted_formatted")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getValueConvertedFormatted() {
        return valueConvertedFormatted;
    }

    /**
     * Set valueConvertedFormatted
     **/
    public void setValueConvertedFormatted(String valueConvertedFormatted) {
        this.valueConvertedFormatted = valueConvertedFormatted;
    }

    public GetDealsSummaryResponseDataValuesTotal valueConvertedFormatted(String valueConvertedFormatted) {
        this.valueConvertedFormatted = valueConvertedFormatted;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetDealsSummaryResponseDataValuesTotal {\n");

        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    valueConverted: ").append(toIndentedString(valueConverted)).append("\n");
        sb.append("    valueFormatted: ").append(toIndentedString(valueFormatted)).append("\n");
        sb.append("    valueConvertedFormatted: ").append(toIndentedString(valueConvertedFormatted)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetDealsSummaryResponseDataValuesTotal} object that
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

        GetDealsSummaryResponseDataValuesTotal model = (GetDealsSummaryResponseDataValuesTotal) obj;

        return java.util.Objects.equals(value, model.value) &&
        java.util.Objects.equals(count, model.count) &&
        java.util.Objects.equals(valueConverted, model.valueConverted) &&
        java.util.Objects.equals(valueFormatted, model.valueFormatted) &&
        java.util.Objects.equals(valueConvertedFormatted, model.valueConvertedFormatted);
    }

    /**
     * Returns a hash code for a {@code GetDealsSummaryResponseDataValuesTotal}.
     *
     * @return a hash code value for a {@code GetDealsSummaryResponseDataValuesTotal}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value,
        count,
        valueConverted,
        valueFormatted,
        valueConvertedFormatted);
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
      * The total values of the deals grouped by deal currency
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetDealsSummaryResponseDataValuesTotalQueryParam  {

        /**
          * The total values of the deals grouped by deal currency
         **/
        @jakarta.ws.rs.QueryParam("value")
        private BigDecimal value;
        /**
          * The total values of the deals grouped by deal currency
         **/
        @jakarta.ws.rs.QueryParam("count")
        private Integer count;
        /**
          * The total values of the deals grouped by deal currency
         **/
        @jakarta.ws.rs.QueryParam("valueConverted")
        private BigDecimal valueConverted;
        /**
          * The total values of the deals grouped by deal currency
         **/
        @jakarta.ws.rs.QueryParam("valueFormatted")
        private String valueFormatted;
        /**
          * The total values of the deals grouped by deal currency
         **/
        @jakarta.ws.rs.QueryParam("valueConvertedFormatted")
        private String valueConvertedFormatted;

        /**
        * The total value of deals in the deal currency group
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

        public GetDealsSummaryResponseDataValuesTotalQueryParam value(BigDecimal value) {
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

        public GetDealsSummaryResponseDataValuesTotalQueryParam count(Integer count) {
            this.count = count;
            return this;
        }

        /**
        * The total value of deals converted into the company default currency
        * @return valueConverted
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("value_converted")
        public BigDecimal getValueConverted() {
            return valueConverted;
        }

        /**
         * Set valueConverted
         **/
        public void setValueConverted(BigDecimal valueConverted) {
            this.valueConverted = valueConverted;
        }

        public GetDealsSummaryResponseDataValuesTotalQueryParam valueConverted(BigDecimal valueConverted) {
            this.valueConverted = valueConverted;
            return this;
        }

        /**
        * The total value of deals formatted with deal currency. E.g. €50
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

        public GetDealsSummaryResponseDataValuesTotalQueryParam valueFormatted(String valueFormatted) {
            this.valueFormatted = valueFormatted;
            return this;
        }

        /**
        * The value_converted formatted with deal currency. E.g. US$50.10
        * @return valueConvertedFormatted
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("value_converted_formatted")
        public String getValueConvertedFormatted() {
            return valueConvertedFormatted;
        }

        /**
         * Set valueConvertedFormatted
         **/
        public void setValueConvertedFormatted(String valueConvertedFormatted) {
            this.valueConvertedFormatted = valueConvertedFormatted;
        }

        public GetDealsSummaryResponseDataValuesTotalQueryParam valueConvertedFormatted(String valueConvertedFormatted) {
            this.valueConvertedFormatted = valueConvertedFormatted;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetDealsSummaryResponseDataValuesTotalQueryParam {\n");

            sb.append("    value: ").append(toIndentedString(value)).append("\n");
            sb.append("    count: ").append(toIndentedString(count)).append("\n");
            sb.append("    valueConverted: ").append(toIndentedString(valueConverted)).append("\n");
            sb.append("    valueFormatted: ").append(toIndentedString(valueFormatted)).append("\n");
            sb.append("    valueConvertedFormatted: ").append(toIndentedString(valueConvertedFormatted)).append("\n");
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
