package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.Goal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class UpsertGoalResponseData  {

    private Goal goal;

    /**
    * Get goal
    * @return goal
    **/
    @JsonProperty("goal")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Goal getGoal() {
        return goal;
    }

    /**
     * Set goal
     **/
    public void setGoal(Goal goal) {
        this.goal = goal;
    }

    public UpsertGoalResponseData goal(Goal goal) {
        this.goal = goal;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpsertGoalResponseData {\n");

        sb.append("    goal: ").append(toIndentedString(goal)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code UpsertGoalResponseData} object that
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

        UpsertGoalResponseData model = (UpsertGoalResponseData) obj;

        return java.util.Objects.equals(goal, model.goal);
    }

    /**
     * Returns a hash code for a {@code UpsertGoalResponseData}.
     *
     * @return a hash code value for a {@code UpsertGoalResponseData}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(goal);
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
    public static class UpsertGoalResponseDataQueryParam  {

        @jakarta.ws.rs.QueryParam("goal")
        private Goal goal;

        /**
        * Get goal
        * @return goal
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("goal")
        public Goal getGoal() {
            return goal;
        }

        /**
         * Set goal
         **/
        public void setGoal(Goal goal) {
            this.goal = goal;
        }

        public UpsertGoalResponseDataQueryParam goal(Goal goal) {
            this.goal = goal;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class UpsertGoalResponseDataQueryParam {\n");

            sb.append("    goal: ").append(toIndentedString(goal)).append("\n");
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
