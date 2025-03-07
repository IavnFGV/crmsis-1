package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The parameters that accompany the goal type
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class GoalTypeParams  {

    /**
      * The IDs of pipelines of the goal
     **/
    private List<Integer> pipelineId;
    /**
      * The IDs of activity types of the goal
     **/
    private List<Integer> activityTypeId;

    /**
    * The IDs of pipelines of the goal
    * @return pipelineId
    **/
    @JsonProperty("pipeline_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getPipelineId() {
        return pipelineId;
    }

    /**
     * Set pipelineId
     **/
    public void setPipelineId(List<Integer> pipelineId) {
        this.pipelineId = pipelineId;
    }

    public GoalTypeParams pipelineId(List<Integer> pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public GoalTypeParams addPipelineIdItem(Integer pipelineIdItem) {
        if (this.pipelineId == null){
            pipelineId = new ArrayList<>();
        }
        this.pipelineId.add(pipelineIdItem);
        return this;
    }

    /**
    * The IDs of activity types of the goal
    * @return activityTypeId
    **/
    @JsonProperty("activity_type_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getActivityTypeId() {
        return activityTypeId;
    }

    /**
     * Set activityTypeId
     **/
    public void setActivityTypeId(List<Integer> activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public GoalTypeParams activityTypeId(List<Integer> activityTypeId) {
        this.activityTypeId = activityTypeId;
        return this;
    }
    public GoalTypeParams addActivityTypeIdItem(Integer activityTypeIdItem) {
        if (this.activityTypeId == null){
            activityTypeId = new ArrayList<>();
        }
        this.activityTypeId.add(activityTypeIdItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GoalTypeParams {\n");

        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    activityTypeId: ").append(toIndentedString(activityTypeId)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GoalTypeParams} object that
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

        GoalTypeParams model = (GoalTypeParams) obj;

        return java.util.Objects.equals(pipelineId, model.pipelineId) &&
        java.util.Objects.equals(activityTypeId, model.activityTypeId);
    }

    /**
     * Returns a hash code for a {@code GoalTypeParams}.
     *
     * @return a hash code value for a {@code GoalTypeParams}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(pipelineId,
        activityTypeId);
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
      * The parameters that accompany the goal type
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GoalTypeParamsQueryParam  {

        /**
          * The parameters that accompany the goal type
         **/
        @jakarta.ws.rs.QueryParam("pipelineId")
        private List<Integer> pipelineId = null;
        /**
          * The parameters that accompany the goal type
         **/
        @jakarta.ws.rs.QueryParam("activityTypeId")
        private List<Integer> activityTypeId = null;

        /**
        * The IDs of pipelines of the goal
        * @return pipelineId
        **/
        @JsonProperty("pipeline_id")
        public List<Integer> getPipelineId() {
            return pipelineId;
        }

        /**
         * Set pipelineId
         **/
        public void setPipelineId(List<Integer> pipelineId) {
            this.pipelineId = pipelineId;
        }

        public GoalTypeParamsQueryParam pipelineId(List<Integer> pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public GoalTypeParamsQueryParam addPipelineIdItem(Integer pipelineIdItem) {
            this.pipelineId.add(pipelineIdItem);
            return this;
        }

        /**
        * The IDs of activity types of the goal
        * @return activityTypeId
        **/
        @JsonProperty("activity_type_id")
        public List<Integer> getActivityTypeId() {
            return activityTypeId;
        }

        /**
         * Set activityTypeId
         **/
        public void setActivityTypeId(List<Integer> activityTypeId) {
            this.activityTypeId = activityTypeId;
        }

        public GoalTypeParamsQueryParam activityTypeId(List<Integer> activityTypeId) {
            this.activityTypeId = activityTypeId;
            return this;
        }
        public GoalTypeParamsQueryParam addActivityTypeIdItem(Integer activityTypeIdItem) {
            this.activityTypeId.add(activityTypeIdItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GoalTypeParamsQueryParam {\n");

            sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
            sb.append("    activityTypeId: ").append(toIndentedString(activityTypeId)).append("\n");
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
