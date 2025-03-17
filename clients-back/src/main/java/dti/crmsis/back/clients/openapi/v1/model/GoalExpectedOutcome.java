package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The expected outcome of the goal
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GoalExpectedOutcome  {

    /**
      * The numeric target of the goal
     **/
    private Integer target;
    /**
      * The tracking metric of the goal
     **/
    private String trackingMetric;

    /**
    * The numeric target of the goal
    * @return target
    **/
    @JsonProperty("target")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getTarget() {
        return target;
    }

    /**
     * Set target
     **/
    public void setTarget(Integer target) {
        this.target = target;
    }

    public GoalExpectedOutcome target(Integer target) {
        this.target = target;
        return this;
    }

    /**
    * The tracking metric of the goal
    * @return trackingMetric
    **/
    @JsonProperty("tracking_metric")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTrackingMetric() {
        return trackingMetric;
    }

    /**
     * Set trackingMetric
     **/
    public void setTrackingMetric(String trackingMetric) {
        this.trackingMetric = trackingMetric;
    }

    public GoalExpectedOutcome trackingMetric(String trackingMetric) {
        this.trackingMetric = trackingMetric;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GoalExpectedOutcome {\n");

        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    trackingMetric: ").append(toIndentedString(trackingMetric)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GoalExpectedOutcome} object that
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

        GoalExpectedOutcome model = (GoalExpectedOutcome) obj;

        return java.util.Objects.equals(target, model.target) &&
        java.util.Objects.equals(trackingMetric, model.trackingMetric);
    }

    /**
     * Returns a hash code for a {@code GoalExpectedOutcome}.
     *
     * @return a hash code value for a {@code GoalExpectedOutcome}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(target,
        trackingMetric);
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
      * The expected outcome of the goal
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GoalExpectedOutcomeQueryParam  {

        /**
          * The expected outcome of the goal
         **/
        @jakarta.ws.rs.QueryParam("target")
        private Integer target;
        /**
          * The expected outcome of the goal
         **/
        @jakarta.ws.rs.QueryParam("trackingMetric")
        private String trackingMetric;

        /**
        * The numeric target of the goal
        * @return target
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("target")
        public Integer getTarget() {
            return target;
        }

        /**
         * Set target
         **/
        public void setTarget(Integer target) {
            this.target = target;
        }

        public GoalExpectedOutcomeQueryParam target(Integer target) {
            this.target = target;
            return this;
        }

        /**
        * The tracking metric of the goal
        * @return trackingMetric
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("tracking_metric")
        public String getTrackingMetric() {
            return trackingMetric;
        }

        /**
         * Set trackingMetric
         **/
        public void setTrackingMetric(String trackingMetric) {
            this.trackingMetric = trackingMetric;
        }

        public GoalExpectedOutcomeQueryParam trackingMetric(String trackingMetric) {
            this.trackingMetric = trackingMetric;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GoalExpectedOutcomeQueryParam {\n");

            sb.append("    target: ").append(toIndentedString(target)).append("\n");
            sb.append("    trackingMetric: ").append(toIndentedString(trackingMetric)).append("\n");
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
