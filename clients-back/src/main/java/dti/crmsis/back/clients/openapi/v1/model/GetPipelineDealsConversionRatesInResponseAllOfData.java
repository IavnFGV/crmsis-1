package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetPipelineDealsConversionRatesInResponseAllOfDataStageConversionsInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The pipeline object
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetPipelineDealsConversionRatesInResponseAllOfData  {

    /**
      * The stage conversions
     **/
    private List<GetPipelineDealsConversionRatesInResponseAllOfDataStageConversionsInner> stageConversions;
    /**
      * The won conversion
     **/
    private Integer wonConversion;
    /**
      * The lost conversion
     **/
    private Integer lostConversion;

    /**
    * The stage conversions
    * @return stageConversions
    **/
    @JsonProperty("stage_conversions")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<GetPipelineDealsConversionRatesInResponseAllOfDataStageConversionsInner> getStageConversions() {
        return stageConversions;
    }

    /**
     * Set stageConversions
     **/
    public void setStageConversions(List<GetPipelineDealsConversionRatesInResponseAllOfDataStageConversionsInner> stageConversions) {
        this.stageConversions = stageConversions;
    }

    public GetPipelineDealsConversionRatesInResponseAllOfData stageConversions(List<GetPipelineDealsConversionRatesInResponseAllOfDataStageConversionsInner> stageConversions) {
        this.stageConversions = stageConversions;
        return this;
    }
    public GetPipelineDealsConversionRatesInResponseAllOfData addStageConversionsItem(GetPipelineDealsConversionRatesInResponseAllOfDataStageConversionsInner stageConversionsItem) {
        if (this.stageConversions == null){
            stageConversions = new ArrayList<>();
        }
        this.stageConversions.add(stageConversionsItem);
        return this;
    }

    /**
    * The won conversion
    * @return wonConversion
    **/
    @JsonProperty("won_conversion")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getWonConversion() {
        return wonConversion;
    }

    /**
     * Set wonConversion
     **/
    public void setWonConversion(Integer wonConversion) {
        this.wonConversion = wonConversion;
    }

    public GetPipelineDealsConversionRatesInResponseAllOfData wonConversion(Integer wonConversion) {
        this.wonConversion = wonConversion;
        return this;
    }

    /**
    * The lost conversion
    * @return lostConversion
    **/
    @JsonProperty("lost_conversion")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getLostConversion() {
        return lostConversion;
    }

    /**
     * Set lostConversion
     **/
    public void setLostConversion(Integer lostConversion) {
        this.lostConversion = lostConversion;
    }

    public GetPipelineDealsConversionRatesInResponseAllOfData lostConversion(Integer lostConversion) {
        this.lostConversion = lostConversion;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPipelineDealsConversionRatesInResponseAllOfData {\n");

        sb.append("    stageConversions: ").append(toIndentedString(stageConversions)).append("\n");
        sb.append("    wonConversion: ").append(toIndentedString(wonConversion)).append("\n");
        sb.append("    lostConversion: ").append(toIndentedString(lostConversion)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetPipelineDealsConversionRatesInResponseAllOfData} object that
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

        GetPipelineDealsConversionRatesInResponseAllOfData model = (GetPipelineDealsConversionRatesInResponseAllOfData) obj;

        return java.util.Objects.equals(stageConversions, model.stageConversions) &&
        java.util.Objects.equals(wonConversion, model.wonConversion) &&
        java.util.Objects.equals(lostConversion, model.lostConversion);
    }

    /**
     * Returns a hash code for a {@code GetPipelineDealsConversionRatesInResponseAllOfData}.
     *
     * @return a hash code value for a {@code GetPipelineDealsConversionRatesInResponseAllOfData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(stageConversions,
        wonConversion,
        lostConversion);
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
      * The pipeline object
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetPipelineDealsConversionRatesInResponseAllOfDataQueryParam  {

        /**
          * The pipeline object
         **/
        @jakarta.ws.rs.QueryParam("stageConversions")
        private List<GetPipelineDealsConversionRatesInResponseAllOfDataStageConversionsInner> stageConversions = null;
        /**
          * The pipeline object
         **/
        @jakarta.ws.rs.QueryParam("wonConversion")
        private Integer wonConversion;
        /**
          * The pipeline object
         **/
        @jakarta.ws.rs.QueryParam("lostConversion")
        private Integer lostConversion;

        /**
        * The stage conversions
        * @return stageConversions
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("stage_conversions")
        public List<GetPipelineDealsConversionRatesInResponseAllOfDataStageConversionsInner> getStageConversions() {
            return stageConversions;
        }

        /**
         * Set stageConversions
         **/
        public void setStageConversions(List<GetPipelineDealsConversionRatesInResponseAllOfDataStageConversionsInner> stageConversions) {
            this.stageConversions = stageConversions;
        }

        public GetPipelineDealsConversionRatesInResponseAllOfDataQueryParam stageConversions(List<GetPipelineDealsConversionRatesInResponseAllOfDataStageConversionsInner> stageConversions) {
            this.stageConversions = stageConversions;
            return this;
        }
        public GetPipelineDealsConversionRatesInResponseAllOfDataQueryParam addStageConversionsItem(GetPipelineDealsConversionRatesInResponseAllOfDataStageConversionsInner stageConversionsItem) {
            this.stageConversions.add(stageConversionsItem);
            return this;
        }

        /**
        * The won conversion
        * @return wonConversion
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("won_conversion")
        public Integer getWonConversion() {
            return wonConversion;
        }

        /**
         * Set wonConversion
         **/
        public void setWonConversion(Integer wonConversion) {
            this.wonConversion = wonConversion;
        }

        public GetPipelineDealsConversionRatesInResponseAllOfDataQueryParam wonConversion(Integer wonConversion) {
            this.wonConversion = wonConversion;
            return this;
        }

        /**
        * The lost conversion
        * @return lostConversion
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("lost_conversion")
        public Integer getLostConversion() {
            return lostConversion;
        }

        /**
         * Set lostConversion
         **/
        public void setLostConversion(Integer lostConversion) {
            this.lostConversion = lostConversion;
        }

        public GetPipelineDealsConversionRatesInResponseAllOfDataQueryParam lostConversion(Integer lostConversion) {
            this.lostConversion = lostConversion;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetPipelineDealsConversionRatesInResponseAllOfDataQueryParam {\n");

            sb.append("    stageConversions: ").append(toIndentedString(stageConversions)).append("\n");
            sb.append("    wonConversion: ").append(toIndentedString(wonConversion)).append("\n");
            sb.append("    lostConversion: ").append(toIndentedString(lostConversion)).append("\n");
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
