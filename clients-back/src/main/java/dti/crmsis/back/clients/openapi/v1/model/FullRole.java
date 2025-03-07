package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FullRole  {

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
      * The level of role in the role hierarchy
     **/
    private Integer level;

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

    public FullRole parentRoleId(Integer parentRoleId) {
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

    public FullRole name(String name) {
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

    public FullRole id(Integer id) {
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

    public FullRole activeFlag(Boolean activeFlag) {
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

    public FullRole assignmentCount(String assignmentCount) {
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

    public FullRole subRoleCount(String subRoleCount) {
        this.subRoleCount = subRoleCount;
        return this;
    }

    /**
    * The level of role in the role hierarchy
    * @return level
    **/
    @JsonProperty("level")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getLevel() {
        return level;
    }

    /**
     * Set level
     **/
    public void setLevel(Integer level) {
        this.level = level;
    }

    public FullRole level(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FullRole {\n");

        sb.append("    parentRoleId: ").append(toIndentedString(parentRoleId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    assignmentCount: ").append(toIndentedString(assignmentCount)).append("\n");
        sb.append("    subRoleCount: ").append(toIndentedString(subRoleCount)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code FullRole} object that
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

        FullRole model = (FullRole) obj;

        return java.util.Objects.equals(parentRoleId, model.parentRoleId) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(assignmentCount, model.assignmentCount) &&
        java.util.Objects.equals(subRoleCount, model.subRoleCount) &&
        java.util.Objects.equals(level, model.level);
    }

    /**
     * Returns a hash code for a {@code FullRole}.
     *
     * @return a hash code value for a {@code FullRole}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(parentRoleId,
        name,
        id,
        activeFlag,
        assignmentCount,
        subRoleCount,
        level);
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class FullRoleQueryParam  {

        @jakarta.ws.rs.QueryParam("parentRoleId")
        private Integer parentRoleId;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        @jakarta.ws.rs.QueryParam("assignmentCount")
        private String assignmentCount;
        @jakarta.ws.rs.QueryParam("subRoleCount")
        private String subRoleCount;
        @jakarta.ws.rs.QueryParam("level")
        private Integer level;

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

        public FullRoleQueryParam parentRoleId(Integer parentRoleId) {
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

        public FullRoleQueryParam name(String name) {
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

        public FullRoleQueryParam id(Integer id) {
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

        public FullRoleQueryParam activeFlag(Boolean activeFlag) {
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

        public FullRoleQueryParam assignmentCount(String assignmentCount) {
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

        public FullRoleQueryParam subRoleCount(String subRoleCount) {
            this.subRoleCount = subRoleCount;
            return this;
        }

        /**
        * The level of role in the role hierarchy
        * @return level
        **/
        @JsonProperty("level")
        public Integer getLevel() {
            return level;
        }

        /**
         * Set level
         **/
        public void setLevel(Integer level) {
            this.level = level;
        }

        public FullRoleQueryParam level(Integer level) {
            this.level = level;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class FullRoleQueryParam {\n");

            sb.append("    parentRoleId: ").append(toIndentedString(parentRoleId)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    assignmentCount: ").append(toIndentedString(assignmentCount)).append("\n");
            sb.append("    subRoleCount: ").append(toIndentedString(subRoleCount)).append("\n");
            sb.append("    level: ").append(toIndentedString(level)).append("\n");
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
