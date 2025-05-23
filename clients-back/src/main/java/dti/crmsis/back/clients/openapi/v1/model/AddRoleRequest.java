package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The details of the role
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddRoleRequest  {

    /**
      * The name of the role
     **/
    private String name;
    /**
      * The ID of the parent role
     **/
    private Integer parentRoleId;

    /**
    * The name of the role
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

    public AddRoleRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The ID of the parent role
    * @return parentRoleId
    **/
    @JsonProperty("parent_role_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getParentRoleId() {
        return parentRoleId;
    }

    /**
     * Set parentRoleId
     **/
    public void setParentRoleId(Integer parentRoleId) {
        this.parentRoleId = parentRoleId;
    }

    public AddRoleRequest parentRoleId(Integer parentRoleId) {
        this.parentRoleId = parentRoleId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddRoleRequest {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parentRoleId: ").append(toIndentedString(parentRoleId)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddRoleRequest} object that
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

        AddRoleRequest model = (AddRoleRequest) obj;

        return java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(parentRoleId, model.parentRoleId);
    }

    /**
     * Returns a hash code for a {@code AddRoleRequest}.
     *
     * @return a hash code value for a {@code AddRoleRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,
        parentRoleId);
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
      * The details of the role
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AddRoleRequestQueryParam  {

        /**
          * The details of the role
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * The details of the role
         **/
        @jakarta.ws.rs.QueryParam("parentRoleId")
        private Integer parentRoleId;

        /**
        * The name of the role
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

        public AddRoleRequestQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The ID of the parent role
        * @return parentRoleId
        **/
        @JsonProperty("parent_role_id")
        public Integer getParentRoleId() {
            return parentRoleId;
        }

        /**
         * Set parentRoleId
         **/
        public void setParentRoleId(Integer parentRoleId) {
            this.parentRoleId = parentRoleId;
        }

        public AddRoleRequestQueryParam parentRoleId(Integer parentRoleId) {
            this.parentRoleId = parentRoleId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddRoleRequestQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    parentRoleId: ").append(toIndentedString(parentRoleId)).append("\n");
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
