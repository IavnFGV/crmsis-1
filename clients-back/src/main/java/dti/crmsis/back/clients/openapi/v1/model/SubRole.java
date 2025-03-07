package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The details of the sub-role
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubRole  {

    /**
      * The ID of the parent role
     **/
    private Integer parentRoleId;
    /**
      * The name of the role
     **/
    private String name;
    /**
      * The ID of the role
     **/
    private Integer id;
    /**
      * Whether the role is active or not
     **/
    private Boolean activeFlag;
    /**
      * The number of users assigned to this role
     **/
    private String assignmentCount;
    /**
      * The number of sub-roles
     **/
    private String subRoleCount;

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

    public SubRole parentRoleId(Integer parentRoleId) {
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

    public SubRole name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The ID of the role
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

    public SubRole id(Integer id) {
        this.id = id;
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

    public SubRole activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * The number of users assigned to this role
    * @return assignmentCount
    **/
    @JsonProperty("assignment_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAssignmentCount() {
        return assignmentCount;
    }

    /**
     * Set assignmentCount
     **/
    public void setAssignmentCount(String assignmentCount) {
        this.assignmentCount = assignmentCount;
    }

    public SubRole assignmentCount(String assignmentCount) {
        this.assignmentCount = assignmentCount;
        return this;
    }

    /**
    * The number of sub-roles
    * @return subRoleCount
    **/
    @JsonProperty("sub_role_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSubRoleCount() {
        return subRoleCount;
    }

    /**
     * Set subRoleCount
     **/
    public void setSubRoleCount(String subRoleCount) {
        this.subRoleCount = subRoleCount;
    }

    public SubRole subRoleCount(String subRoleCount) {
        this.subRoleCount = subRoleCount;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubRole {\n");

        sb.append("    parentRoleId: ").append(toIndentedString(parentRoleId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    assignmentCount: ").append(toIndentedString(assignmentCount)).append("\n");
        sb.append("    subRoleCount: ").append(toIndentedString(subRoleCount)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code SubRole} object that
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

        SubRole model = (SubRole) obj;

        return java.util.Objects.equals(parentRoleId, model.parentRoleId) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(assignmentCount, model.assignmentCount) &&
        java.util.Objects.equals(subRoleCount, model.subRoleCount);
    }

    /**
     * Returns a hash code for a {@code SubRole}.
     *
     * @return a hash code value for a {@code SubRole}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(parentRoleId,
        name,
        id,
        activeFlag,
        assignmentCount,
        subRoleCount);
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
      * The details of the sub-role
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SubRoleQueryParam  {

        /**
          * The details of the sub-role
         **/
        @jakarta.ws.rs.QueryParam("parentRoleId")
        private Integer parentRoleId;
        /**
          * The details of the sub-role
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * The details of the sub-role
         **/
        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        /**
          * The details of the sub-role
         **/
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        /**
          * The details of the sub-role
         **/
        @jakarta.ws.rs.QueryParam("assignmentCount")
        private String assignmentCount;
        /**
          * The details of the sub-role
         **/
        @jakarta.ws.rs.QueryParam("subRoleCount")
        private String subRoleCount;

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

        public SubRoleQueryParam parentRoleId(Integer parentRoleId) {
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

        public SubRoleQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The ID of the role
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

        public SubRoleQueryParam id(Integer id) {
            this.id = id;
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

        public SubRoleQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * The number of users assigned to this role
        * @return assignmentCount
        **/
        @JsonProperty("assignment_count")
        public String getAssignmentCount() {
            return assignmentCount;
        }

        /**
         * Set assignmentCount
         **/
        public void setAssignmentCount(String assignmentCount) {
            this.assignmentCount = assignmentCount;
        }

        public SubRoleQueryParam assignmentCount(String assignmentCount) {
            this.assignmentCount = assignmentCount;
            return this;
        }

        /**
        * The number of sub-roles
        * @return subRoleCount
        **/
        @JsonProperty("sub_role_count")
        public String getSubRoleCount() {
            return subRoleCount;
        }

        /**
         * Set subRoleCount
         **/
        public void setSubRoleCount(String subRoleCount) {
            this.subRoleCount = subRoleCount;
        }

        public SubRoleQueryParam subRoleCount(String subRoleCount) {
            this.subRoleCount = subRoleCount;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SubRoleQueryParam {\n");

            sb.append("    parentRoleId: ").append(toIndentedString(parentRoleId)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    assignmentCount: ").append(toIndentedString(assignmentCount)).append("\n");
            sb.append("    subRoleCount: ").append(toIndentedString(subRoleCount)).append("\n");
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
