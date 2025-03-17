package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The duration of the goal
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class GoalDuration  {

    /**
      * The start date of the goal
     **/
    private String start;
    /**
      * The end date of the goal
     **/
    private String end;

    /**
    * The start date of the goal
    * @return start
    **/
    @JsonProperty("start")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStart() {
        return start;
    }

    /**
     * Set start
     **/
    public void setStart(String start) {
        this.start = start;
    }

    public GoalDuration start(String start) {
        this.start = start;
        return this;
    }

    /**
    * The end date of the goal
    * @return end
    **/
    @JsonProperty("end")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEnd() {
        return end;
    }

    /**
     * Set end
     **/
    public void setEnd(String end) {
        this.end = end;
    }

    public GoalDuration end(String end) {
        this.end = end;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GoalDuration {\n");

        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GoalDuration} object that
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

        GoalDuration model = (GoalDuration) obj;

        return java.util.Objects.equals(start, model.start) &&
        java.util.Objects.equals(end, model.end);
    }

    /**
     * Returns a hash code for a {@code GoalDuration}.
     *
     * @return a hash code value for a {@code GoalDuration}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(start,
        end);
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
      * The duration of the goal
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GoalDurationQueryParam  {

        /**
          * The duration of the goal
         **/
        @jakarta.ws.rs.QueryParam("start")
        private String start;
        /**
          * The duration of the goal
         **/
        @jakarta.ws.rs.QueryParam("end")
        private String end;

        /**
        * The start date of the goal
        * @return start
        **/
        @JsonProperty("start")
        public String getStart() {
            return start;
        }

        /**
         * Set start
         **/
        public void setStart(String start) {
            this.start = start;
        }

        public GoalDurationQueryParam start(String start) {
            this.start = start;
            return this;
        }

        /**
        * The end date of the goal
        * @return end
        **/
        @JsonProperty("end")
        public String getEnd() {
            return end;
        }

        /**
         * Set end
         **/
        public void setEnd(String end) {
            this.end = end;
        }

        public GoalDurationQueryParam end(String end) {
            this.end = end;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GoalDurationQueryParam {\n");

            sb.append("    start: ").append(toIndentedString(start)).append("\n");
            sb.append("    end: ").append(toIndentedString(end)).append("\n");
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
