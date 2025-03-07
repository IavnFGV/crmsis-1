package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The moved deals average age by the stage
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysByStagesInner  {

    /**
      * The stage ID
     **/
    private Integer stageId;
    /**
      * The average deals age in specific stage
     **/
    private Integer value;

    /**
    * The stage ID
    * @return stageId
    **/
    @JsonProperty("stage_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getStageId() {
        return stageId;
    }

    /**
     * Set stageId
     **/
    public void setStageId(Integer stageId) {
        this.stageId = stageId;
    }

    public GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysByStagesInner stageId(Integer stageId) {
        this.stageId = stageId;
        return this;
    }

    /**
    * The average deals age in specific stage
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

    public GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysByStagesInner value(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysByStagesInner {\n");

        sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysByStagesInner} object that
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

        GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysByStagesInner model = (GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysByStagesInner) obj;

        return java.util.Objects.equals(stageId, model.stageId) &&
        java.util.Objects.equals(value, model.value);
    }

    /**
     * Returns a hash code for a {@code GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysByStagesInner}.
     *
     * @return a hash code value for a {@code GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysByStagesInner}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(stageId,
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
      * The moved deals average age by the stage
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysByStagesInnerQueryParam  {

        /**
          * The moved deals average age by the stage
         **/
        @jakarta.ws.rs.QueryParam("stageId")
        private Integer stageId;
        /**
          * The moved deals average age by the stage
         **/
        @jakarta.ws.rs.QueryParam("value")
        private Integer value;

        /**
        * The stage ID
        * @return stageId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("stage_id")
        public Integer getStageId() {
            return stageId;
        }

        /**
         * Set stageId
         **/
        public void setStageId(Integer stageId) {
            this.stageId = stageId;
        }

        public GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysByStagesInnerQueryParam stageId(Integer stageId) {
            this.stageId = stageId;
            return this;
        }

        /**
        * The average deals age in specific stage
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

        public GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysByStagesInnerQueryParam value(Integer value) {
            this.value = value;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysByStagesInnerQueryParam {\n");

            sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
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
