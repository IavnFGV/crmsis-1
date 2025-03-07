package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Who the goal is assigned to
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class GoalAssignee  {

    /**
      * The ID of the goal assignee
     **/
    private Integer id;
    /**
      * The type of the assignee
     **/
    private String type;

    /**
    * The ID of the goal assignee
    * @return id
    **/
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(Integer id) {
        this.id = id;
    }

    public GoalAssignee id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The type of the assignee
    * @return type
    **/
    @JsonProperty("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(String type) {
        this.type = type;
    }

    public GoalAssignee type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GoalAssignee {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GoalAssignee} object that
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

        GoalAssignee model = (GoalAssignee) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(type, model.type);
    }

    /**
     * Returns a hash code for a {@code GoalAssignee}.
     *
     * @return a hash code value for a {@code GoalAssignee}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        type);
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
      * Who the goal is assigned to
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GoalAssigneeQueryParam  {

        /**
          * Who the goal is assigned to
         **/
        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        /**
          * Who the goal is assigned to
         **/
        @jakarta.ws.rs.QueryParam("type")
        private String type;

        /**
        * The ID of the goal assignee
        * @return id
        **/
        @JsonProperty("id")
        public Integer getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(Integer id) {
            this.id = id;
        }

        public GoalAssigneeQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The type of the assignee
        * @return type
        **/
        @JsonProperty("type")
        public String getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(String type) {
            this.type = type;
        }

        public GoalAssigneeQueryParam type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GoalAssigneeQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
