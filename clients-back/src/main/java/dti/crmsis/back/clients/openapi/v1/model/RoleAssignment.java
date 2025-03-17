package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The assignment data of the role
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class RoleAssignment  {

    /**
      * The ID of the parent role
     **/
    private Integer parentRoleId;
    /**
      * The name of the role
     **/
    private String name;
    /**
      * The user ID
     **/
    private Integer userId;
    /**
      * The role ID
     **/
    private Integer roleId;
    /**
      * Whether the role is active or not
     **/
    private Boolean activeFlag;
    /**
      * The assignment type
     **/
    private String type;

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

    public RoleAssignment parentRoleId(Integer parentRoleId) {
        this.parentRoleId = parentRoleId;
        return this;
    }

    /**
    * The name of the role
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

    public RoleAssignment name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The user ID
    * @return userId
    **/
    @JsonProperty("user_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getUserId() {
        return userId;
    }

    /**
     * Set userId
     **/
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public RoleAssignment userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
    * The role ID
    * @return roleId
    **/
    @JsonProperty("role_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * Set roleId
     **/
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public RoleAssignment roleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
    * Whether the role is active or not
    * @return activeFlag
    **/
    @JsonProperty("active_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getActiveFlag() {
        return activeFlag;
    }

    /**
     * Set activeFlag
     **/
    public void setActiveFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
    }

    public RoleAssignment activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * The assignment type
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

    public RoleAssignment type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoleAssignment {\n");

        sb.append("    parentRoleId: ").append(toIndentedString(parentRoleId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code RoleAssignment} object that
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

        RoleAssignment model = (RoleAssignment) obj;

        return java.util.Objects.equals(parentRoleId, model.parentRoleId) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(userId, model.userId) &&
        java.util.Objects.equals(roleId, model.roleId) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(type, model.type);
    }

    /**
     * Returns a hash code for a {@code RoleAssignment}.
     *
     * @return a hash code value for a {@code RoleAssignment}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(parentRoleId,
        name,
        userId,
        roleId,
        activeFlag,
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
      * The assignment data of the role
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RoleAssignmentQueryParam  {

        /**
          * The assignment data of the role
         **/
        @jakarta.ws.rs.QueryParam("parentRoleId")
        private Integer parentRoleId;
        /**
          * The assignment data of the role
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * The assignment data of the role
         **/
        @jakarta.ws.rs.QueryParam("userId")
        private Integer userId;
        /**
          * The assignment data of the role
         **/
        @jakarta.ws.rs.QueryParam("roleId")
        private Integer roleId;
        /**
          * The assignment data of the role
         **/
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        /**
          * The assignment data of the role
         **/
        @jakarta.ws.rs.QueryParam("type")
        private String type;

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

        public RoleAssignmentQueryParam parentRoleId(Integer parentRoleId) {
            this.parentRoleId = parentRoleId;
            return this;
        }

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

        public RoleAssignmentQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The user ID
        * @return userId
        **/
        @JsonProperty("user_id")
        public Integer getUserId() {
            return userId;
        }

        /**
         * Set userId
         **/
        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public RoleAssignmentQueryParam userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        /**
        * The role ID
        * @return roleId
        **/
        @JsonProperty("role_id")
        public Integer getRoleId() {
            return roleId;
        }

        /**
         * Set roleId
         **/
        public void setRoleId(Integer roleId) {
            this.roleId = roleId;
        }

        public RoleAssignmentQueryParam roleId(Integer roleId) {
            this.roleId = roleId;
            return this;
        }

        /**
        * Whether the role is active or not
        * @return activeFlag
        **/
        @JsonProperty("active_flag")
        public Boolean getActiveFlag() {
            return activeFlag;
        }

        /**
         * Set activeFlag
         **/
        public void setActiveFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
        }

        public RoleAssignmentQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * The assignment type
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

        public RoleAssignmentQueryParam type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class RoleAssignmentQueryParam {\n");

            sb.append("    parentRoleId: ").append(toIndentedString(parentRoleId)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
            sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
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
