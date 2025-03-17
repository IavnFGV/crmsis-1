package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The response data
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class AddRoleAssignmentResponseDataData  {

    /**
      * The ID of the user that was added to the role
     **/
    private Integer userId;
    /**
      * The ID of the role the user was added to
     **/
    private Integer roleId;

    /**
    * The ID of the user that was added to the role
    * @return userId
    **/
    @JsonProperty("user_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getUserId() {
        return userId;
    }

    /**
     * Set userId
     **/
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public AddRoleAssignmentResponseDataData userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
    * The ID of the role the user was added to
    * @return roleId
    **/
    @JsonProperty("role_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * Set roleId
     **/
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public AddRoleAssignmentResponseDataData roleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddRoleAssignmentResponseDataData {\n");

        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddRoleAssignmentResponseDataData} object that
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

        AddRoleAssignmentResponseDataData model = (AddRoleAssignmentResponseDataData) obj;

        return java.util.Objects.equals(userId, model.userId) &&
        java.util.Objects.equals(roleId, model.roleId);
    }

    /**
     * Returns a hash code for a {@code AddRoleAssignmentResponseDataData}.
     *
     * @return a hash code value for a {@code AddRoleAssignmentResponseDataData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(userId,
        roleId);
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
      * The response data
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class AddRoleAssignmentResponseDataDataQueryParam  {

        /**
          * The response data
         **/
        @jakarta.ws.rs.QueryParam("userId")
        private Integer userId;
        /**
          * The response data
         **/
        @jakarta.ws.rs.QueryParam("roleId")
        private Integer roleId;

        /**
        * The ID of the user that was added to the role
        * @return userId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("user_id")
        public Integer getUserId() {
            return userId;
        }

        /**
         * Set userId
         **/
        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public AddRoleAssignmentResponseDataDataQueryParam userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        /**
        * The ID of the role the user was added to
        * @return roleId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("role_id")
        public Integer getRoleId() {
            return roleId;
        }

        /**
         * Set roleId
         **/
        public void setRoleId(Integer roleId) {
            this.roleId = roleId;
        }

        public AddRoleAssignmentResponseDataDataQueryParam roleId(Integer roleId) {
            this.roleId = roleId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddRoleAssignmentResponseDataDataQueryParam {\n");

            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
            sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
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
