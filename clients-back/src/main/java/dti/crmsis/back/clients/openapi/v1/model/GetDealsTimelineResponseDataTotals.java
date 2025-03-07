package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The total values of deals for the given period
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetDealsTimelineResponseDataTotals  {

    /**
      * The number of deals for the given period
     **/
    private Integer count;
    /**
      * The total values of deals grouped by deal currency
     **/
    private Object values;
    /**
      * The total weighted values of deals for the given period grouped by deal currency. The weighted value of a deal is calculated as probability times deal value.
     **/
    private Object weightedValues;
    /**
      * The number of open deals for the given period
     **/
    private Integer openCount;
    /**
      * The total values of open deals for the given period grouped by deal currency
     **/
    private Object openValues;
    /**
      * The total weighted values of open deals for the given period grouped by deal currency. The weighted value of a deal is calculated as probability times deal value.
     **/
    private Object weightedOpenValues;
    /**
      * The number of won deals for the given period
     **/
    private Integer wonCount;
    /**
      * The total values of won deals for the given period grouped by deal currency
     **/
    private Object wonValues;

    /**
    * The number of deals for the given period
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

    public GetDealsTimelineResponseDataTotals count(Integer count) {
        this.count = count;
        return this;
    }

    /**
    * The total values of deals grouped by deal currency
    * @return values
    **/
    @JsonProperty("values")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Object getValues() {
        return values;
    }

    /**
     * Set values
     **/
    public void setValues(Object values) {
        this.values = values;
    }

    public GetDealsTimelineResponseDataTotals values(Object values) {
        this.values = values;
        return this;
    }

    /**
    * The total weighted values of deals for the given period grouped by deal currency. The weighted value of a deal is calculated as probability times deal value.
    * @return weightedValues
    **/
    @JsonProperty("weighted_values")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Object getWeightedValues() {
        return weightedValues;
    }

    /**
     * Set weightedValues
     **/
    public void setWeightedValues(Object weightedValues) {
        this.weightedValues = weightedValues;
    }

    public GetDealsTimelineResponseDataTotals weightedValues(Object weightedValues) {
        this.weightedValues = weightedValues;
        return this;
    }

    /**
    * The number of open deals for the given period
    * @return openCount
    **/
    @JsonProperty("open_count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getOpenCount() {
        return openCount;
    }

    /**
     * Set openCount
     **/
    public void setOpenCount(Integer openCount) {
        this.openCount = openCount;
    }

    public GetDealsTimelineResponseDataTotals openCount(Integer openCount) {
        this.openCount = openCount;
        return this;
    }

    /**
    * The total values of open deals for the given period grouped by deal currency
    * @return openValues
    **/
    @JsonProperty("open_values")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Object getOpenValues() {
        return openValues;
    }

    /**
     * Set openValues
     **/
    public void setOpenValues(Object openValues) {
        this.openValues = openValues;
    }

    public GetDealsTimelineResponseDataTotals openValues(Object openValues) {
        this.openValues = openValues;
        return this;
    }

    /**
    * The total weighted values of open deals for the given period grouped by deal currency. The weighted value of a deal is calculated as probability times deal value.
    * @return weightedOpenValues
    **/
    @JsonProperty("weighted_open_values")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Object getWeightedOpenValues() {
        return weightedOpenValues;
    }

    /**
     * Set weightedOpenValues
     **/
    public void setWeightedOpenValues(Object weightedOpenValues) {
        this.weightedOpenValues = weightedOpenValues;
    }

    public GetDealsTimelineResponseDataTotals weightedOpenValues(Object weightedOpenValues) {
        this.weightedOpenValues = weightedOpenValues;
        return this;
    }

    /**
    * The number of won deals for the given period
    * @return wonCount
    **/
    @JsonProperty("won_count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getWonCount() {
        return wonCount;
    }

    /**
     * Set wonCount
     **/
    public void setWonCount(Integer wonCount) {
        this.wonCount = wonCount;
    }

    public GetDealsTimelineResponseDataTotals wonCount(Integer wonCount) {
        this.wonCount = wonCount;
        return this;
    }

    /**
    * The total values of won deals for the given period grouped by deal currency
    * @return wonValues
    **/
    @JsonProperty("won_values")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Object getWonValues() {
        return wonValues;
    }

    /**
     * Set wonValues
     **/
    public void setWonValues(Object wonValues) {
        this.wonValues = wonValues;
    }

    public GetDealsTimelineResponseDataTotals wonValues(Object wonValues) {
        this.wonValues = wonValues;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetDealsTimelineResponseDataTotals {\n");

        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
        sb.append("    weightedValues: ").append(toIndentedString(weightedValues)).append("\n");
        sb.append("    openCount: ").append(toIndentedString(openCount)).append("\n");
        sb.append("    openValues: ").append(toIndentedString(openValues)).append("\n");
        sb.append("    weightedOpenValues: ").append(toIndentedString(weightedOpenValues)).append("\n");
        sb.append("    wonCount: ").append(toIndentedString(wonCount)).append("\n");
        sb.append("    wonValues: ").append(toIndentedString(wonValues)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetDealsTimelineResponseDataTotals} object that
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

        GetDealsTimelineResponseDataTotals model = (GetDealsTimelineResponseDataTotals) obj;

        return java.util.Objects.equals(count, model.count) &&
        java.util.Objects.equals(values, model.values) &&
        java.util.Objects.equals(weightedValues, model.weightedValues) &&
        java.util.Objects.equals(openCount, model.openCount) &&
        java.util.Objects.equals(openValues, model.openValues) &&
        java.util.Objects.equals(weightedOpenValues, model.weightedOpenValues) &&
        java.util.Objects.equals(wonCount, model.wonCount) &&
        java.util.Objects.equals(wonValues, model.wonValues);
    }

    /**
     * Returns a hash code for a {@code GetDealsTimelineResponseDataTotals}.
     *
     * @return a hash code value for a {@code GetDealsTimelineResponseDataTotals}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(count,
        values,
        weightedValues,
        openCount,
        openValues,
        weightedOpenValues,
        wonCount,
        wonValues);
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
      * The total values of deals for the given period
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetDealsTimelineResponseDataTotalsQueryParam  {

        /**
          * The total values of deals for the given period
         **/
        @jakarta.ws.rs.QueryParam("count")
        private Integer count;
        /**
          * The total values of deals for the given period
         **/
        @jakarta.ws.rs.QueryParam("values")
        private Object values;
        /**
          * The total values of deals for the given period
         **/
        @jakarta.ws.rs.QueryParam("weightedValues")
        private Object weightedValues;
        /**
          * The total values of deals for the given period
         **/
        @jakarta.ws.rs.QueryParam("openCount")
        private Integer openCount;
        /**
          * The total values of deals for the given period
         **/
        @jakarta.ws.rs.QueryParam("openValues")
        private Object openValues;
        /**
          * The total values of deals for the given period
         **/
        @jakarta.ws.rs.QueryParam("weightedOpenValues")
        private Object weightedOpenValues;
        /**
          * The total values of deals for the given period
         **/
        @jakarta.ws.rs.QueryParam("wonCount")
        private Integer wonCount;
        /**
          * The total values of deals for the given period
         **/
        @jakarta.ws.rs.QueryParam("wonValues")
        private Object wonValues;

        /**
        * The number of deals for the given period
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

        public GetDealsTimelineResponseDataTotalsQueryParam count(Integer count) {
            this.count = count;
            return this;
        }

        /**
        * The total values of deals grouped by deal currency
        * @return values
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("values")
        public Object getValues() {
            return values;
        }

        /**
         * Set values
         **/
        public void setValues(Object values) {
            this.values = values;
        }

        public GetDealsTimelineResponseDataTotalsQueryParam values(Object values) {
            this.values = values;
            return this;
        }

        /**
        * The total weighted values of deals for the given period grouped by deal currency. The weighted value of a deal is calculated as probability times deal value.
        * @return weightedValues
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("weighted_values")
        public Object getWeightedValues() {
            return weightedValues;
        }

        /**
         * Set weightedValues
         **/
        public void setWeightedValues(Object weightedValues) {
            this.weightedValues = weightedValues;
        }

        public GetDealsTimelineResponseDataTotalsQueryParam weightedValues(Object weightedValues) {
            this.weightedValues = weightedValues;
            return this;
        }

        /**
        * The number of open deals for the given period
        * @return openCount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("open_count")
        public Integer getOpenCount() {
            return openCount;
        }

        /**
         * Set openCount
         **/
        public void setOpenCount(Integer openCount) {
            this.openCount = openCount;
        }

        public GetDealsTimelineResponseDataTotalsQueryParam openCount(Integer openCount) {
            this.openCount = openCount;
            return this;
        }

        /**
        * The total values of open deals for the given period grouped by deal currency
        * @return openValues
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("open_values")
        public Object getOpenValues() {
            return openValues;
        }

        /**
         * Set openValues
         **/
        public void setOpenValues(Object openValues) {
            this.openValues = openValues;
        }

        public GetDealsTimelineResponseDataTotalsQueryParam openValues(Object openValues) {
            this.openValues = openValues;
            return this;
        }

        /**
        * The total weighted values of open deals for the given period grouped by deal currency. The weighted value of a deal is calculated as probability times deal value.
        * @return weightedOpenValues
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("weighted_open_values")
        public Object getWeightedOpenValues() {
            return weightedOpenValues;
        }

        /**
         * Set weightedOpenValues
         **/
        public void setWeightedOpenValues(Object weightedOpenValues) {
            this.weightedOpenValues = weightedOpenValues;
        }

        public GetDealsTimelineResponseDataTotalsQueryParam weightedOpenValues(Object weightedOpenValues) {
            this.weightedOpenValues = weightedOpenValues;
            return this;
        }

        /**
        * The number of won deals for the given period
        * @return wonCount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("won_count")
        public Integer getWonCount() {
            return wonCount;
        }

        /**
         * Set wonCount
         **/
        public void setWonCount(Integer wonCount) {
            this.wonCount = wonCount;
        }

        public GetDealsTimelineResponseDataTotalsQueryParam wonCount(Integer wonCount) {
            this.wonCount = wonCount;
            return this;
        }

        /**
        * The total values of won deals for the given period grouped by deal currency
        * @return wonValues
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("won_values")
        public Object getWonValues() {
            return wonValues;
        }

        /**
         * Set wonValues
         **/
        public void setWonValues(Object wonValues) {
            this.wonValues = wonValues;
        }

        public GetDealsTimelineResponseDataTotalsQueryParam wonValues(Object wonValues) {
            this.wonValues = wonValues;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetDealsTimelineResponseDataTotalsQueryParam {\n");

            sb.append("    count: ").append(toIndentedString(count)).append("\n");
            sb.append("    values: ").append(toIndentedString(values)).append("\n");
            sb.append("    weightedValues: ").append(toIndentedString(weightedValues)).append("\n");
            sb.append("    openCount: ").append(toIndentedString(openCount)).append("\n");
            sb.append("    openValues: ").append(toIndentedString(openValues)).append("\n");
            sb.append("    weightedOpenValues: ").append(toIndentedString(weightedOpenValues)).append("\n");
            sb.append("    wonCount: ").append(toIndentedString(wonCount)).append("\n");
            sb.append("    wonValues: ").append(toIndentedString(wonValues)).append("\n");
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
