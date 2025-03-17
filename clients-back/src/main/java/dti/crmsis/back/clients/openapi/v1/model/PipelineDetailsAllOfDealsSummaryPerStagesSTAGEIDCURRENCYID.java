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
public class PipelineDetailsAllOfDealsSummaryPerStagesSTAGEIDCURRENCYID  {

    /**
      * Deals count per currency
     **/
    private Integer count;
    /**
      * Deals value per currency
     **/
    private Integer value;
    /**
      * Deals value formatted per currency
     **/
    private String valueFormatted;
    /**
      * Deals weighted value per currency
     **/
    private Integer weightedValue;
    /**
      * Deals weighted value formatted per currency
     **/
    private String weightedValueFormatted;

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

    public PipelineDetailsAllOfDealsSummaryPerStagesSTAGEIDCURRENCYID count(Integer count) {
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

    public PipelineDetailsAllOfDealsSummaryPerStagesSTAGEIDCURRENCYID value(Integer value) {
        this.value = value;
        return this;
    }

    /**
    * Deals value formatted per currency
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

    public PipelineDetailsAllOfDealsSummaryPerStagesSTAGEIDCURRENCYID valueFormatted(String valueFormatted) {
        this.valueFormatted = valueFormatted;
        return this;
    }

    /**
    * Deals weighted value per currency
    * @return weightedValue
    **/
    @JsonProperty("weighted_value")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getWeightedValue() {
        return weightedValue;
    }

    /**
     * Set weightedValue
     **/
    public void setWeightedValue(Integer weightedValue) {
        this.weightedValue = weightedValue;
    }

    public PipelineDetailsAllOfDealsSummaryPerStagesSTAGEIDCURRENCYID weightedValue(Integer weightedValue) {
        this.weightedValue = weightedValue;
        return this;
    }

    /**
    * Deals weighted value formatted per currency
    * @return weightedValueFormatted
    **/
    @JsonProperty("weighted_value_formatted")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getWeightedValueFormatted() {
        return weightedValueFormatted;
    }

    /**
     * Set weightedValueFormatted
     **/
    public void setWeightedValueFormatted(String weightedValueFormatted) {
        this.weightedValueFormatted = weightedValueFormatted;
    }

    public PipelineDetailsAllOfDealsSummaryPerStagesSTAGEIDCURRENCYID weightedValueFormatted(String weightedValueFormatted) {
        this.weightedValueFormatted = weightedValueFormatted;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineDetailsAllOfDealsSummaryPerStagesSTAGEIDCURRENCYID {\n");

        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    valueFormatted: ").append(toIndentedString(valueFormatted)).append("\n");
        sb.append("    weightedValue: ").append(toIndentedString(weightedValue)).append("\n");
        sb.append("    weightedValueFormatted: ").append(toIndentedString(weightedValueFormatted)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code PipelineDetailsAllOfDealsSummaryPerStagesSTAGEIDCURRENCYID} object that
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

        PipelineDetailsAllOfDealsSummaryPerStagesSTAGEIDCURRENCYID model = (PipelineDetailsAllOfDealsSummaryPerStagesSTAGEIDCURRENCYID) obj;

        return java.util.Objects.equals(count, model.count) &&
        java.util.Objects.equals(value, model.value) &&
        java.util.Objects.equals(valueFormatted, model.valueFormatted) &&
        java.util.Objects.equals(weightedValue, model.weightedValue) &&
        java.util.Objects.equals(weightedValueFormatted, model.weightedValueFormatted);
    }

    /**
     * Returns a hash code for a {@code PipelineDetailsAllOfDealsSummaryPerStagesSTAGEIDCURRENCYID}.
     *
     * @return a hash code value for a {@code PipelineDetailsAllOfDealsSummaryPerStagesSTAGEIDCURRENCYID}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(count,
        value,
        valueFormatted,
        weightedValue,
        weightedValueFormatted);
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
    public static class PipelineDetailsAllOfDealsSummaryPerStagesSTAGEIDCURRENCYIDQueryParam  {

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
          * The currency summary. This parameter is dynamic and changes according to `currency_id` value.
         **/
        @jakarta.ws.rs.QueryParam("valueFormatted")
        private String valueFormatted;
        /**
          * The currency summary. This parameter is dynamic and changes according to `currency_id` value.
         **/
        @jakarta.ws.rs.QueryParam("weightedValue")
        private Integer weightedValue;
        /**
          * The currency summary. This parameter is dynamic and changes according to `currency_id` value.
         **/
        @jakarta.ws.rs.QueryParam("weightedValueFormatted")
        private String weightedValueFormatted;

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

        public PipelineDetailsAllOfDealsSummaryPerStagesSTAGEIDCURRENCYIDQueryParam count(Integer count) {
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

        public PipelineDetailsAllOfDealsSummaryPerStagesSTAGEIDCURRENCYIDQueryParam value(Integer value) {
            this.value = value;
            return this;
        }

        /**
        * Deals value formatted per currency
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

        public PipelineDetailsAllOfDealsSummaryPerStagesSTAGEIDCURRENCYIDQueryParam valueFormatted(String valueFormatted) {
            this.valueFormatted = valueFormatted;
            return this;
        }

        /**
        * Deals weighted value per currency
        * @return weightedValue
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("weighted_value")
        public Integer getWeightedValue() {
            return weightedValue;
        }

        /**
         * Set weightedValue
         **/
        public void setWeightedValue(Integer weightedValue) {
            this.weightedValue = weightedValue;
        }

        public PipelineDetailsAllOfDealsSummaryPerStagesSTAGEIDCURRENCYIDQueryParam weightedValue(Integer weightedValue) {
            this.weightedValue = weightedValue;
            return this;
        }

        /**
        * Deals weighted value formatted per currency
        * @return weightedValueFormatted
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("weighted_value_formatted")
        public String getWeightedValueFormatted() {
            return weightedValueFormatted;
        }

        /**
         * Set weightedValueFormatted
         **/
        public void setWeightedValueFormatted(String weightedValueFormatted) {
            this.weightedValueFormatted = weightedValueFormatted;
        }

        public PipelineDetailsAllOfDealsSummaryPerStagesSTAGEIDCURRENCYIDQueryParam weightedValueFormatted(String weightedValueFormatted) {
            this.weightedValueFormatted = weightedValueFormatted;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PipelineDetailsAllOfDealsSummaryPerStagesSTAGEIDCURRENCYIDQueryParam {\n");

            sb.append("    count: ").append(toIndentedString(count)).append("\n");
            sb.append("    value: ").append(toIndentedString(value)).append("\n");
            sb.append("    valueFormatted: ").append(toIndentedString(valueFormatted)).append("\n");
            sb.append("    weightedValue: ").append(toIndentedString(weightedValue)).append("\n");
            sb.append("    weightedValueFormatted: ").append(toIndentedString(weightedValueFormatted)).append("\n");
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
