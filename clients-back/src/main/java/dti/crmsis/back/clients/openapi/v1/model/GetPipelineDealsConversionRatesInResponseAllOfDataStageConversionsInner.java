package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetPipelineDealsConversionRatesInResponseAllOfDataStageConversionsInner  {

    /**
      * The stage ID from where conversion starts
     **/
    private Integer fromStageId;
    /**
      * The stage ID to where conversion ends
     **/
    private Integer toStageId;
    /**
      * The conversion rate
     **/
    private Integer conversionRate;

    /**
    * The stage ID from where conversion starts
    * @return fromStageId
    **/
    @JsonProperty("from_stage_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getFromStageId() {
        return fromStageId;
    }

    /**
     * Set fromStageId
     **/
    public void setFromStageId(Integer fromStageId) {
        this.fromStageId = fromStageId;
    }

    public GetPipelineDealsConversionRatesInResponseAllOfDataStageConversionsInner fromStageId(Integer fromStageId) {
        this.fromStageId = fromStageId;
        return this;
    }

    /**
    * The stage ID to where conversion ends
    * @return toStageId
    **/
    @JsonProperty("to_stage_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getToStageId() {
        return toStageId;
    }

    /**
     * Set toStageId
     **/
    public void setToStageId(Integer toStageId) {
        this.toStageId = toStageId;
    }

    public GetPipelineDealsConversionRatesInResponseAllOfDataStageConversionsInner toStageId(Integer toStageId) {
        this.toStageId = toStageId;
        return this;
    }

    /**
    * The conversion rate
    * @return conversionRate
    **/
    @JsonProperty("conversion_rate")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getConversionRate() {
        return conversionRate;
    }

    /**
     * Set conversionRate
     **/
    public void setConversionRate(Integer conversionRate) {
        this.conversionRate = conversionRate;
    }

    public GetPipelineDealsConversionRatesInResponseAllOfDataStageConversionsInner conversionRate(Integer conversionRate) {
        this.conversionRate = conversionRate;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPipelineDealsConversionRatesInResponseAllOfDataStageConversionsInner {\n");

        sb.append("    fromStageId: ").append(toIndentedString(fromStageId)).append("\n");
        sb.append("    toStageId: ").append(toIndentedString(toStageId)).append("\n");
        sb.append("    conversionRate: ").append(toIndentedString(conversionRate)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetPipelineDealsConversionRatesInResponseAllOfDataStageConversionsInner} object that
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

        GetPipelineDealsConversionRatesInResponseAllOfDataStageConversionsInner model = (GetPipelineDealsConversionRatesInResponseAllOfDataStageConversionsInner) obj;

        return java.util.Objects.equals(fromStageId, model.fromStageId) &&
        java.util.Objects.equals(toStageId, model.toStageId) &&
        java.util.Objects.equals(conversionRate, model.conversionRate);
    }

    /**
     * Returns a hash code for a {@code GetPipelineDealsConversionRatesInResponseAllOfDataStageConversionsInner}.
     *
     * @return a hash code value for a {@code GetPipelineDealsConversionRatesInResponseAllOfDataStageConversionsInner}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(fromStageId,
        toStageId,
        conversionRate);
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
    public static class GetPipelineDealsConversionRatesInResponseAllOfDataStageConversionsInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("fromStageId")
        private Integer fromStageId;
        @jakarta.ws.rs.QueryParam("toStageId")
        private Integer toStageId;
        @jakarta.ws.rs.QueryParam("conversionRate")
        private Integer conversionRate;

        /**
        * The stage ID from where conversion starts
        * @return fromStageId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("from_stage_id")
        public Integer getFromStageId() {
            return fromStageId;
        }

        /**
         * Set fromStageId
         **/
        public void setFromStageId(Integer fromStageId) {
            this.fromStageId = fromStageId;
        }

        public GetPipelineDealsConversionRatesInResponseAllOfDataStageConversionsInnerQueryParam fromStageId(Integer fromStageId) {
            this.fromStageId = fromStageId;
            return this;
        }

        /**
        * The stage ID to where conversion ends
        * @return toStageId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("to_stage_id")
        public Integer getToStageId() {
            return toStageId;
        }

        /**
         * Set toStageId
         **/
        public void setToStageId(Integer toStageId) {
            this.toStageId = toStageId;
        }

        public GetPipelineDealsConversionRatesInResponseAllOfDataStageConversionsInnerQueryParam toStageId(Integer toStageId) {
            this.toStageId = toStageId;
            return this;
        }

        /**
        * The conversion rate
        * @return conversionRate
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("conversion_rate")
        public Integer getConversionRate() {
            return conversionRate;
        }

        /**
         * Set conversionRate
         **/
        public void setConversionRate(Integer conversionRate) {
            this.conversionRate = conversionRate;
        }

        public GetPipelineDealsConversionRatesInResponseAllOfDataStageConversionsInnerQueryParam conversionRate(Integer conversionRate) {
            this.conversionRate = conversionRate;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetPipelineDealsConversionRatesInResponseAllOfDataStageConversionsInnerQueryParam {\n");

            sb.append("    fromStageId: ").append(toIndentedString(fromStageId)).append("\n");
            sb.append("    toStageId: ").append(toIndentedString(toStageId)).append("\n");
            sb.append("    conversionRate: ").append(toIndentedString(conversionRate)).append("\n");
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
