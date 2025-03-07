package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetDealsSummaryResponseDataValuesTotal;
import dti.crmsis.back.clients.openapi.v1.model.GetDealsSummaryResponseDataWeightedValuesTotal;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The summary of deals
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetDealsSummaryResponseData  {

    private GetDealsSummaryResponseDataValuesTotal valuesTotal;
    private GetDealsSummaryResponseDataWeightedValuesTotal weightedValuesTotal;
    /**
      * The total number of deals
     **/
    private Integer totalCount;
    /**
      * The total value of deals converted into the company default currency
     **/
    private BigDecimal totalCurrencyConvertedValue;
    /**
      * The total weighted value of deals converted into the company default currency
     **/
    private BigDecimal totalWeightedCurrencyConvertedValue;
    /**
      * The total converted value of deals formatted with the company default currency. E.g. US$5,100.96
     **/
    private String totalCurrencyConvertedValueFormatted;
    /**
      * The total weighted value of deals formatted with the company default currency. E.g. US$5,100.96
     **/
    private String totalWeightedCurrencyConvertedValueFormatted;

    /**
    * Get valuesTotal
    * @return valuesTotal
    **/
    @JsonProperty("values_total")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetDealsSummaryResponseDataValuesTotal getValuesTotal() {
        return valuesTotal;
    }

    /**
     * Set valuesTotal
     **/
    public void setValuesTotal(GetDealsSummaryResponseDataValuesTotal valuesTotal) {
        this.valuesTotal = valuesTotal;
    }

    public GetDealsSummaryResponseData valuesTotal(GetDealsSummaryResponseDataValuesTotal valuesTotal) {
        this.valuesTotal = valuesTotal;
        return this;
    }

    /**
    * Get weightedValuesTotal
    * @return weightedValuesTotal
    **/
    @JsonProperty("weighted_values_total")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetDealsSummaryResponseDataWeightedValuesTotal getWeightedValuesTotal() {
        return weightedValuesTotal;
    }

    /**
     * Set weightedValuesTotal
     **/
    public void setWeightedValuesTotal(GetDealsSummaryResponseDataWeightedValuesTotal weightedValuesTotal) {
        this.weightedValuesTotal = weightedValuesTotal;
    }

    public GetDealsSummaryResponseData weightedValuesTotal(GetDealsSummaryResponseDataWeightedValuesTotal weightedValuesTotal) {
        this.weightedValuesTotal = weightedValuesTotal;
        return this;
    }

    /**
    * The total number of deals
    * @return totalCount
    **/
    @JsonProperty("total_count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * Set totalCount
     **/
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public GetDealsSummaryResponseData totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
    * The total value of deals converted into the company default currency
    * @return totalCurrencyConvertedValue
    **/
    @JsonProperty("total_currency_converted_value")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getTotalCurrencyConvertedValue() {
        return totalCurrencyConvertedValue;
    }

    /**
     * Set totalCurrencyConvertedValue
     **/
    public void setTotalCurrencyConvertedValue(BigDecimal totalCurrencyConvertedValue) {
        this.totalCurrencyConvertedValue = totalCurrencyConvertedValue;
    }

    public GetDealsSummaryResponseData totalCurrencyConvertedValue(BigDecimal totalCurrencyConvertedValue) {
        this.totalCurrencyConvertedValue = totalCurrencyConvertedValue;
        return this;
    }

    /**
    * The total weighted value of deals converted into the company default currency
    * @return totalWeightedCurrencyConvertedValue
    **/
    @JsonProperty("total_weighted_currency_converted_value")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getTotalWeightedCurrencyConvertedValue() {
        return totalWeightedCurrencyConvertedValue;
    }

    /**
     * Set totalWeightedCurrencyConvertedValue
     **/
    public void setTotalWeightedCurrencyConvertedValue(BigDecimal totalWeightedCurrencyConvertedValue) {
        this.totalWeightedCurrencyConvertedValue = totalWeightedCurrencyConvertedValue;
    }

    public GetDealsSummaryResponseData totalWeightedCurrencyConvertedValue(BigDecimal totalWeightedCurrencyConvertedValue) {
        this.totalWeightedCurrencyConvertedValue = totalWeightedCurrencyConvertedValue;
        return this;
    }

    /**
    * The total converted value of deals formatted with the company default currency. E.g. US$5,100.96
    * @return totalCurrencyConvertedValueFormatted
    **/
    @JsonProperty("total_currency_converted_value_formatted")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTotalCurrencyConvertedValueFormatted() {
        return totalCurrencyConvertedValueFormatted;
    }

    /**
     * Set totalCurrencyConvertedValueFormatted
     **/
    public void setTotalCurrencyConvertedValueFormatted(String totalCurrencyConvertedValueFormatted) {
        this.totalCurrencyConvertedValueFormatted = totalCurrencyConvertedValueFormatted;
    }

    public GetDealsSummaryResponseData totalCurrencyConvertedValueFormatted(String totalCurrencyConvertedValueFormatted) {
        this.totalCurrencyConvertedValueFormatted = totalCurrencyConvertedValueFormatted;
        return this;
    }

    /**
    * The total weighted value of deals formatted with the company default currency. E.g. US$5,100.96
    * @return totalWeightedCurrencyConvertedValueFormatted
    **/
    @JsonProperty("total_weighted_currency_converted_value_formatted")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTotalWeightedCurrencyConvertedValueFormatted() {
        return totalWeightedCurrencyConvertedValueFormatted;
    }

    /**
     * Set totalWeightedCurrencyConvertedValueFormatted
     **/
    public void setTotalWeightedCurrencyConvertedValueFormatted(String totalWeightedCurrencyConvertedValueFormatted) {
        this.totalWeightedCurrencyConvertedValueFormatted = totalWeightedCurrencyConvertedValueFormatted;
    }

    public GetDealsSummaryResponseData totalWeightedCurrencyConvertedValueFormatted(String totalWeightedCurrencyConvertedValueFormatted) {
        this.totalWeightedCurrencyConvertedValueFormatted = totalWeightedCurrencyConvertedValueFormatted;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetDealsSummaryResponseData {\n");

        sb.append("    valuesTotal: ").append(toIndentedString(valuesTotal)).append("\n");
        sb.append("    weightedValuesTotal: ").append(toIndentedString(weightedValuesTotal)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    totalCurrencyConvertedValue: ").append(toIndentedString(totalCurrencyConvertedValue)).append("\n");
        sb.append("    totalWeightedCurrencyConvertedValue: ").append(toIndentedString(totalWeightedCurrencyConvertedValue)).append("\n");
        sb.append("    totalCurrencyConvertedValueFormatted: ").append(toIndentedString(totalCurrencyConvertedValueFormatted)).append("\n");
        sb.append("    totalWeightedCurrencyConvertedValueFormatted: ").append(toIndentedString(totalWeightedCurrencyConvertedValueFormatted)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetDealsSummaryResponseData} object that
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

        GetDealsSummaryResponseData model = (GetDealsSummaryResponseData) obj;

        return java.util.Objects.equals(valuesTotal, model.valuesTotal) &&
        java.util.Objects.equals(weightedValuesTotal, model.weightedValuesTotal) &&
        java.util.Objects.equals(totalCount, model.totalCount) &&
        java.util.Objects.equals(totalCurrencyConvertedValue, model.totalCurrencyConvertedValue) &&
        java.util.Objects.equals(totalWeightedCurrencyConvertedValue, model.totalWeightedCurrencyConvertedValue) &&
        java.util.Objects.equals(totalCurrencyConvertedValueFormatted, model.totalCurrencyConvertedValueFormatted) &&
        java.util.Objects.equals(totalWeightedCurrencyConvertedValueFormatted, model.totalWeightedCurrencyConvertedValueFormatted);
    }

    /**
     * Returns a hash code for a {@code GetDealsSummaryResponseData}.
     *
     * @return a hash code value for a {@code GetDealsSummaryResponseData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(valuesTotal,
        weightedValuesTotal,
        totalCount,
        totalCurrencyConvertedValue,
        totalWeightedCurrencyConvertedValue,
        totalCurrencyConvertedValueFormatted,
        totalWeightedCurrencyConvertedValueFormatted);
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
      * The summary of deals
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetDealsSummaryResponseDataQueryParam  {

        /**
          * The summary of deals
         **/
        @jakarta.ws.rs.QueryParam("valuesTotal")
        private GetDealsSummaryResponseDataValuesTotal valuesTotal;
        /**
          * The summary of deals
         **/
        @jakarta.ws.rs.QueryParam("weightedValuesTotal")
        private GetDealsSummaryResponseDataWeightedValuesTotal weightedValuesTotal;
        /**
          * The summary of deals
         **/
        @jakarta.ws.rs.QueryParam("totalCount")
        private Integer totalCount;
        /**
          * The summary of deals
         **/
        @jakarta.ws.rs.QueryParam("totalCurrencyConvertedValue")
        private BigDecimal totalCurrencyConvertedValue;
        /**
          * The summary of deals
         **/
        @jakarta.ws.rs.QueryParam("totalWeightedCurrencyConvertedValue")
        private BigDecimal totalWeightedCurrencyConvertedValue;
        /**
          * The summary of deals
         **/
        @jakarta.ws.rs.QueryParam("totalCurrencyConvertedValueFormatted")
        private String totalCurrencyConvertedValueFormatted;
        /**
          * The summary of deals
         **/
        @jakarta.ws.rs.QueryParam("totalWeightedCurrencyConvertedValueFormatted")
        private String totalWeightedCurrencyConvertedValueFormatted;

        /**
        * Get valuesTotal
        * @return valuesTotal
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("values_total")
        public GetDealsSummaryResponseDataValuesTotal getValuesTotal() {
            return valuesTotal;
        }

        /**
         * Set valuesTotal
         **/
        public void setValuesTotal(GetDealsSummaryResponseDataValuesTotal valuesTotal) {
            this.valuesTotal = valuesTotal;
        }

        public GetDealsSummaryResponseDataQueryParam valuesTotal(GetDealsSummaryResponseDataValuesTotal valuesTotal) {
            this.valuesTotal = valuesTotal;
            return this;
        }

        /**
        * Get weightedValuesTotal
        * @return weightedValuesTotal
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("weighted_values_total")
        public GetDealsSummaryResponseDataWeightedValuesTotal getWeightedValuesTotal() {
            return weightedValuesTotal;
        }

        /**
         * Set weightedValuesTotal
         **/
        public void setWeightedValuesTotal(GetDealsSummaryResponseDataWeightedValuesTotal weightedValuesTotal) {
            this.weightedValuesTotal = weightedValuesTotal;
        }

        public GetDealsSummaryResponseDataQueryParam weightedValuesTotal(GetDealsSummaryResponseDataWeightedValuesTotal weightedValuesTotal) {
            this.weightedValuesTotal = weightedValuesTotal;
            return this;
        }

        /**
        * The total number of deals
        * @return totalCount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("total_count")
        public Integer getTotalCount() {
            return totalCount;
        }

        /**
         * Set totalCount
         **/
        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }

        public GetDealsSummaryResponseDataQueryParam totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
        * The total value of deals converted into the company default currency
        * @return totalCurrencyConvertedValue
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("total_currency_converted_value")
        public BigDecimal getTotalCurrencyConvertedValue() {
            return totalCurrencyConvertedValue;
        }

        /**
         * Set totalCurrencyConvertedValue
         **/
        public void setTotalCurrencyConvertedValue(BigDecimal totalCurrencyConvertedValue) {
            this.totalCurrencyConvertedValue = totalCurrencyConvertedValue;
        }

        public GetDealsSummaryResponseDataQueryParam totalCurrencyConvertedValue(BigDecimal totalCurrencyConvertedValue) {
            this.totalCurrencyConvertedValue = totalCurrencyConvertedValue;
            return this;
        }

        /**
        * The total weighted value of deals converted into the company default currency
        * @return totalWeightedCurrencyConvertedValue
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("total_weighted_currency_converted_value")
        public BigDecimal getTotalWeightedCurrencyConvertedValue() {
            return totalWeightedCurrencyConvertedValue;
        }

        /**
         * Set totalWeightedCurrencyConvertedValue
         **/
        public void setTotalWeightedCurrencyConvertedValue(BigDecimal totalWeightedCurrencyConvertedValue) {
            this.totalWeightedCurrencyConvertedValue = totalWeightedCurrencyConvertedValue;
        }

        public GetDealsSummaryResponseDataQueryParam totalWeightedCurrencyConvertedValue(BigDecimal totalWeightedCurrencyConvertedValue) {
            this.totalWeightedCurrencyConvertedValue = totalWeightedCurrencyConvertedValue;
            return this;
        }

        /**
        * The total converted value of deals formatted with the company default currency. E.g. US$5,100.96
        * @return totalCurrencyConvertedValueFormatted
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("total_currency_converted_value_formatted")
        public String getTotalCurrencyConvertedValueFormatted() {
            return totalCurrencyConvertedValueFormatted;
        }

        /**
         * Set totalCurrencyConvertedValueFormatted
         **/
        public void setTotalCurrencyConvertedValueFormatted(String totalCurrencyConvertedValueFormatted) {
            this.totalCurrencyConvertedValueFormatted = totalCurrencyConvertedValueFormatted;
        }

        public GetDealsSummaryResponseDataQueryParam totalCurrencyConvertedValueFormatted(String totalCurrencyConvertedValueFormatted) {
            this.totalCurrencyConvertedValueFormatted = totalCurrencyConvertedValueFormatted;
            return this;
        }

        /**
        * The total weighted value of deals formatted with the company default currency. E.g. US$5,100.96
        * @return totalWeightedCurrencyConvertedValueFormatted
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("total_weighted_currency_converted_value_formatted")
        public String getTotalWeightedCurrencyConvertedValueFormatted() {
            return totalWeightedCurrencyConvertedValueFormatted;
        }

        /**
         * Set totalWeightedCurrencyConvertedValueFormatted
         **/
        public void setTotalWeightedCurrencyConvertedValueFormatted(String totalWeightedCurrencyConvertedValueFormatted) {
            this.totalWeightedCurrencyConvertedValueFormatted = totalWeightedCurrencyConvertedValueFormatted;
        }

        public GetDealsSummaryResponseDataQueryParam totalWeightedCurrencyConvertedValueFormatted(String totalWeightedCurrencyConvertedValueFormatted) {
            this.totalWeightedCurrencyConvertedValueFormatted = totalWeightedCurrencyConvertedValueFormatted;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetDealsSummaryResponseDataQueryParam {\n");

            sb.append("    valuesTotal: ").append(toIndentedString(valuesTotal)).append("\n");
            sb.append("    weightedValuesTotal: ").append(toIndentedString(weightedValuesTotal)).append("\n");
            sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
            sb.append("    totalCurrencyConvertedValue: ").append(toIndentedString(totalCurrencyConvertedValue)).append("\n");
            sb.append("    totalWeightedCurrencyConvertedValue: ").append(toIndentedString(totalWeightedCurrencyConvertedValue)).append("\n");
            sb.append("    totalCurrencyConvertedValueFormatted: ").append(toIndentedString(totalCurrencyConvertedValueFormatted)).append("\n");
            sb.append("    totalWeightedCurrencyConvertedValueFormatted: ").append(toIndentedString(totalWeightedCurrencyConvertedValueFormatted)).append("\n");
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
