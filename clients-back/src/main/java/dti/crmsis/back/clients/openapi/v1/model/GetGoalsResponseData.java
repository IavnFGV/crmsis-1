package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.Goal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetGoalsResponseData  {

    private List<Goal> goals;

    /**
    * Get goals
    * @return goals
    **/
    @JsonProperty("goals")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Goal> getGoals() {
        return goals;
    }

    /**
     * Set goals
     **/
    public void setGoals(List<Goal> goals) {
        this.goals = goals;
    }

    public GetGoalsResponseData goals(List<Goal> goals) {
        this.goals = goals;
        return this;
    }
    public GetGoalsResponseData addGoalsItem(Goal goalsItem) {
        if (this.goals == null){
            goals = new ArrayList<>();
        }
        this.goals.add(goalsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetGoalsResponseData {\n");

        sb.append("    goals: ").append(toIndentedString(goals)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetGoalsResponseData} object that
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

        GetGoalsResponseData model = (GetGoalsResponseData) obj;

        return java.util.Objects.equals(goals, model.goals);
    }

    /**
     * Returns a hash code for a {@code GetGoalsResponseData}.
     *
     * @return a hash code value for a {@code GetGoalsResponseData}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(goals);
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
    public static class GetGoalsResponseDataQueryParam  {

        @jakarta.ws.rs.QueryParam("goals")
        private List<Goal> goals = null;

        /**
        * Get goals
        * @return goals
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("goals")
        public List<Goal> getGoals() {
            return goals;
        }

        /**
         * Set goals
         **/
        public void setGoals(List<Goal> goals) {
            this.goals = goals;
        }

        public GetGoalsResponseDataQueryParam goals(List<Goal> goals) {
            this.goals = goals;
            return this;
        }
        public GetGoalsResponseDataQueryParam addGoalsItem(Goal goalsItem) {
            this.goals.add(goalsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetGoalsResponseDataQueryParam {\n");

            sb.append("    goals: ").append(toIndentedString(goals)).append("\n");
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
