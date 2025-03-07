package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.PipelineDetailsAllOfDealsSummaryPerStagesSTAGEID;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The stage objects containing deals currency information
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class PipelineDetailsAllOfDealsSummaryPerStages  {

    private PipelineDetailsAllOfDealsSummaryPerStagesSTAGEID STAGE_ID;

    /**
    * Get STAGE_ID
    * @return STAGE_ID
    **/
    @JsonProperty("STAGE_ID")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PipelineDetailsAllOfDealsSummaryPerStagesSTAGEID getSTAGEID() {
        return STAGE_ID;
    }

    /**
     * Set STAGE_ID
     **/
    public void setSTAGEID(PipelineDetailsAllOfDealsSummaryPerStagesSTAGEID STAGE_ID) {
        this.STAGE_ID = STAGE_ID;
    }

    public PipelineDetailsAllOfDealsSummaryPerStages STAGE_ID(PipelineDetailsAllOfDealsSummaryPerStagesSTAGEID STAGE_ID) {
        this.STAGE_ID = STAGE_ID;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineDetailsAllOfDealsSummaryPerStages {\n");

        sb.append("    STAGE_ID: ").append(toIndentedString(STAGE_ID)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code PipelineDetailsAllOfDealsSummaryPerStages} object that
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

        PipelineDetailsAllOfDealsSummaryPerStages model = (PipelineDetailsAllOfDealsSummaryPerStages) obj;

        return java.util.Objects.equals(STAGE_ID, model.STAGE_ID);
    }

    /**
     * Returns a hash code for a {@code PipelineDetailsAllOfDealsSummaryPerStages}.
     *
     * @return a hash code value for a {@code PipelineDetailsAllOfDealsSummaryPerStages}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(STAGE_ID);
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
      * The stage objects containing deals currency information
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class PipelineDetailsAllOfDealsSummaryPerStagesQueryParam  {

        /**
          * The stage objects containing deals currency information
         **/
        @jakarta.ws.rs.QueryParam("STAGE_ID")
        private PipelineDetailsAllOfDealsSummaryPerStagesSTAGEID STAGE_ID;

        /**
        * Get STAGE_ID
        * @return STAGE_ID
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("STAGE_ID")
        public PipelineDetailsAllOfDealsSummaryPerStagesSTAGEID getSTAGEID() {
            return STAGE_ID;
        }

        /**
         * Set STAGE_ID
         **/
        public void setSTAGEID(PipelineDetailsAllOfDealsSummaryPerStagesSTAGEID STAGE_ID) {
            this.STAGE_ID = STAGE_ID;
        }

        public PipelineDetailsAllOfDealsSummaryPerStagesQueryParam STAGE_ID(PipelineDetailsAllOfDealsSummaryPerStagesSTAGEID STAGE_ID) {
            this.STAGE_ID = STAGE_ID;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PipelineDetailsAllOfDealsSummaryPerStagesQueryParam {\n");

            sb.append("    STAGE_ID: ").append(toIndentedString(STAGE_ID)).append("\n");
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
