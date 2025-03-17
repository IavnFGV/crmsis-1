package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class PutRolePipelinesBody  {

    /**
      * The pipeline IDs to make the pipelines visible (add) and/or hidden (remove) for the specified role. It requires the following JSON structure: `{ \"add\": \"[1]\", \"remove\": \"[3, 4]\" }`.
     **/
    private Object visiblePipelineIds;

    /**
    * The pipeline IDs to make the pipelines visible (add) and/or hidden (remove) for the specified role. It requires the following JSON structure: `{ \"add\": \"[1]\", \"remove\": \"[3, 4]\" }`.
    * @return visiblePipelineIds
    **/
    @JsonProperty("visible_pipeline_ids")
    public Object getVisiblePipelineIds() {
        return visiblePipelineIds;
    }

    /**
     * Set visiblePipelineIds
     **/
    public void setVisiblePipelineIds(Object visiblePipelineIds) {
        this.visiblePipelineIds = visiblePipelineIds;
    }

    public PutRolePipelinesBody visiblePipelineIds(Object visiblePipelineIds) {
        this.visiblePipelineIds = visiblePipelineIds;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutRolePipelinesBody {\n");

        sb.append("    visiblePipelineIds: ").append(toIndentedString(visiblePipelineIds)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code PutRolePipelinesBody} object that
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

        PutRolePipelinesBody model = (PutRolePipelinesBody) obj;

        return java.util.Objects.equals(visiblePipelineIds, model.visiblePipelineIds);
    }

    /**
     * Returns a hash code for a {@code PutRolePipelinesBody}.
     *
     * @return a hash code value for a {@code PutRolePipelinesBody}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(visiblePipelineIds);
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
    public static class PutRolePipelinesBodyQueryParam  {

        @jakarta.ws.rs.QueryParam("visiblePipelineIds")
        private Object visiblePipelineIds;

        /**
        * The pipeline IDs to make the pipelines visible (add) and/or hidden (remove) for the specified role. It requires the following JSON structure: `{ \"add\": \"[1]\", \"remove\": \"[3, 4]\" }`.
        * @return visiblePipelineIds
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("visible_pipeline_ids")
        public Object getVisiblePipelineIds() {
            return visiblePipelineIds;
        }

        /**
         * Set visiblePipelineIds
         **/
        public void setVisiblePipelineIds(Object visiblePipelineIds) {
            this.visiblePipelineIds = visiblePipelineIds;
        }

        public PutRolePipelinesBodyQueryParam visiblePipelineIds(Object visiblePipelineIds) {
            this.visiblePipelineIds = visiblePipelineIds;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PutRolePipelinesBodyQueryParam {\n");

            sb.append("    visiblePipelineIds: ").append(toIndentedString(visiblePipelineIds)).append("\n");
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
