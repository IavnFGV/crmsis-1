package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GoalTypeParams;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The type of the goal
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class GoalType  {

    /**
      * The name of the goal type
     **/
    private String name;
    private GoalTypeParams params;

    /**
    * The name of the goal type
    * @return name
    **/
    @JsonProperty("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public GoalType name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get params
    * @return params
    **/
    @JsonProperty("params")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GoalTypeParams getParams() {
        return params;
    }

    /**
     * Set params
     **/
    public void setParams(GoalTypeParams params) {
        this.params = params;
    }

    public GoalType params(GoalTypeParams params) {
        this.params = params;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GoalType {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GoalType} object that
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

        GoalType model = (GoalType) obj;

        return java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(params, model.params);
    }

    /**
     * Returns a hash code for a {@code GoalType}.
     *
     * @return a hash code value for a {@code GoalType}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,
        params);
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
      * The type of the goal
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GoalTypeQueryParam  {

        /**
          * The type of the goal
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * The type of the goal
         **/
        @jakarta.ws.rs.QueryParam("params")
        private GoalTypeParams params;

        /**
        * The name of the goal type
        * @return name
        **/
        @JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public GoalTypeQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get params
        * @return params
        **/
        @JsonProperty("params")
        public GoalTypeParams getParams() {
            return params;
        }

        /**
         * Set params
         **/
        public void setParams(GoalTypeParams params) {
            this.params = params;
        }

        public GoalTypeQueryParam params(GoalTypeParams params) {
            this.params = params;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GoalTypeQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
