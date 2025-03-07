package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetUserAssignmentsToPermissionSetResponseAllOfDataInner  {

    /**
      * The ID of the user in the permission set
     **/
    private Integer userId;
    /**
      * The ID of the permission set
     **/
    private String permissionSetId;
    /**
      * The name of the permission set
     **/
    private String name;

    /**
    * The ID of the user in the permission set
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

    public GetUserAssignmentsToPermissionSetResponseAllOfDataInner userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
    * The ID of the permission set
    * @return permissionSetId
    **/
    @JsonProperty("permission_set_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPermissionSetId() {
        return permissionSetId;
    }

    /**
     * Set permissionSetId
     **/
    public void setPermissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
    }

    public GetUserAssignmentsToPermissionSetResponseAllOfDataInner permissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
        return this;
    }

    /**
    * The name of the permission set
    * @return name
    **/
    @JsonProperty("name")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public GetUserAssignmentsToPermissionSetResponseAllOfDataInner name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetUserAssignmentsToPermissionSetResponseAllOfDataInner {\n");

        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    permissionSetId: ").append(toIndentedString(permissionSetId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetUserAssignmentsToPermissionSetResponseAllOfDataInner} object that
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

        GetUserAssignmentsToPermissionSetResponseAllOfDataInner model = (GetUserAssignmentsToPermissionSetResponseAllOfDataInner) obj;

        return java.util.Objects.equals(userId, model.userId) &&
        java.util.Objects.equals(permissionSetId, model.permissionSetId) &&
        java.util.Objects.equals(name, model.name);
    }

    /**
     * Returns a hash code for a {@code GetUserAssignmentsToPermissionSetResponseAllOfDataInner}.
     *
     * @return a hash code value for a {@code GetUserAssignmentsToPermissionSetResponseAllOfDataInner}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(userId,
        permissionSetId,
        name);
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
    public static class GetUserAssignmentsToPermissionSetResponseAllOfDataInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("userId")
        private Integer userId;
        @jakarta.ws.rs.QueryParam("permissionSetId")
        private String permissionSetId;
        @jakarta.ws.rs.QueryParam("name")
        private String name;

        /**
        * The ID of the user in the permission set
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

        public GetUserAssignmentsToPermissionSetResponseAllOfDataInnerQueryParam userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        /**
        * The ID of the permission set
        * @return permissionSetId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("permission_set_id")
        public String getPermissionSetId() {
            return permissionSetId;
        }

        /**
         * Set permissionSetId
         **/
        public void setPermissionSetId(String permissionSetId) {
            this.permissionSetId = permissionSetId;
        }

        public GetUserAssignmentsToPermissionSetResponseAllOfDataInnerQueryParam permissionSetId(String permissionSetId) {
            this.permissionSetId = permissionSetId;
            return this;
        }

        /**
        * The name of the permission set
        * @return name
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public GetUserAssignmentsToPermissionSetResponseAllOfDataInnerQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetUserAssignmentsToPermissionSetResponseAllOfDataInnerQueryParam {\n");

            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
            sb.append("    permissionSetId: ").append(toIndentedString(permissionSetId)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
