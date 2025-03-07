package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.RelationshipOrganizationInfoItem;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class AddOrganizationRelationshipResponseAllOfData  {

    /**
      * The ID of the organization relationship
     **/
    private Integer id;
    /**
      * The type of the relationship
     **/
    private String type;
    private RelationshipOrganizationInfoItem relOwnerOrgId;
    private RelationshipOrganizationInfoItem relLinkedOrgId;
    /**
      * The creation date and time of the relationship
     **/
    private String addTime;
    /**
      * The last updated date and time of the relationship
     **/
    private String updateTime;
    /**
      * Whether the relationship is active or not
     **/
    private String activeFlag;

    /**
    * The ID of the organization relationship
    * @return id
    **/
    @JsonProperty("id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(Integer id) {
        this.id = id;
    }

    public AddOrganizationRelationshipResponseAllOfData id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The type of the relationship
    * @return type
    **/
    @JsonProperty("type")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(String type) {
        this.type = type;
    }

    public AddOrganizationRelationshipResponseAllOfData type(String type) {
        this.type = type;
        return this;
    }

    /**
    * Get relOwnerOrgId
    * @return relOwnerOrgId
    **/
    @JsonProperty("rel_owner_org_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public RelationshipOrganizationInfoItem getRelOwnerOrgId() {
        return relOwnerOrgId;
    }

    /**
     * Set relOwnerOrgId
     **/
    public void setRelOwnerOrgId(RelationshipOrganizationInfoItem relOwnerOrgId) {
        this.relOwnerOrgId = relOwnerOrgId;
    }

    public AddOrganizationRelationshipResponseAllOfData relOwnerOrgId(RelationshipOrganizationInfoItem relOwnerOrgId) {
        this.relOwnerOrgId = relOwnerOrgId;
        return this;
    }

    /**
    * Get relLinkedOrgId
    * @return relLinkedOrgId
    **/
    @JsonProperty("rel_linked_org_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public RelationshipOrganizationInfoItem getRelLinkedOrgId() {
        return relLinkedOrgId;
    }

    /**
     * Set relLinkedOrgId
     **/
    public void setRelLinkedOrgId(RelationshipOrganizationInfoItem relLinkedOrgId) {
        this.relLinkedOrgId = relLinkedOrgId;
    }

    public AddOrganizationRelationshipResponseAllOfData relLinkedOrgId(RelationshipOrganizationInfoItem relLinkedOrgId) {
        this.relLinkedOrgId = relLinkedOrgId;
        return this;
    }

    /**
    * The creation date and time of the relationship
    * @return addTime
    **/
    @JsonProperty("add_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getAddTime() {
        return addTime;
    }

    /**
     * Set addTime
     **/
    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public AddOrganizationRelationshipResponseAllOfData addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The last updated date and time of the relationship
    * @return updateTime
    **/
    @JsonProperty("update_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Set updateTime
     **/
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public AddOrganizationRelationshipResponseAllOfData updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
    * Whether the relationship is active or not
    * @return activeFlag
    **/
    @JsonProperty("active_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getActiveFlag() {
        return activeFlag;
    }

    /**
     * Set activeFlag
     **/
    public void setActiveFlag(String activeFlag) {
        this.activeFlag = activeFlag;
    }

    public AddOrganizationRelationshipResponseAllOfData activeFlag(String activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddOrganizationRelationshipResponseAllOfData {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    relOwnerOrgId: ").append(toIndentedString(relOwnerOrgId)).append("\n");
        sb.append("    relLinkedOrgId: ").append(toIndentedString(relLinkedOrgId)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddOrganizationRelationshipResponseAllOfData} object that
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

        AddOrganizationRelationshipResponseAllOfData model = (AddOrganizationRelationshipResponseAllOfData) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(type, model.type) &&
        java.util.Objects.equals(relOwnerOrgId, model.relOwnerOrgId) &&
        java.util.Objects.equals(relLinkedOrgId, model.relLinkedOrgId) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime) &&
        java.util.Objects.equals(activeFlag, model.activeFlag);
    }

    /**
     * Returns a hash code for a {@code AddOrganizationRelationshipResponseAllOfData}.
     *
     * @return a hash code value for a {@code AddOrganizationRelationshipResponseAllOfData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        type,
        relOwnerOrgId,
        relLinkedOrgId,
        addTime,
        updateTime,
        activeFlag);
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
    public static class AddOrganizationRelationshipResponseAllOfDataQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("type")
        private String type;
        @jakarta.ws.rs.QueryParam("relOwnerOrgId")
        private RelationshipOrganizationInfoItem relOwnerOrgId;
        @jakarta.ws.rs.QueryParam("relLinkedOrgId")
        private RelationshipOrganizationInfoItem relLinkedOrgId;
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        @jakarta.ws.rs.QueryParam("updateTime")
        private String updateTime;
        @jakarta.ws.rs.QueryParam("activeFlag")
        private String activeFlag;

        /**
        * The ID of the organization relationship
        * @return id
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        public Integer getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(Integer id) {
            this.id = id;
        }

        public AddOrganizationRelationshipResponseAllOfDataQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The type of the relationship
        * @return type
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        public String getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(String type) {
            this.type = type;
        }

        public AddOrganizationRelationshipResponseAllOfDataQueryParam type(String type) {
            this.type = type;
            return this;
        }

        /**
        * Get relOwnerOrgId
        * @return relOwnerOrgId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("rel_owner_org_id")
        public RelationshipOrganizationInfoItem getRelOwnerOrgId() {
            return relOwnerOrgId;
        }

        /**
         * Set relOwnerOrgId
         **/
        public void setRelOwnerOrgId(RelationshipOrganizationInfoItem relOwnerOrgId) {
            this.relOwnerOrgId = relOwnerOrgId;
        }

        public AddOrganizationRelationshipResponseAllOfDataQueryParam relOwnerOrgId(RelationshipOrganizationInfoItem relOwnerOrgId) {
            this.relOwnerOrgId = relOwnerOrgId;
            return this;
        }

        /**
        * Get relLinkedOrgId
        * @return relLinkedOrgId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("rel_linked_org_id")
        public RelationshipOrganizationInfoItem getRelLinkedOrgId() {
            return relLinkedOrgId;
        }

        /**
         * Set relLinkedOrgId
         **/
        public void setRelLinkedOrgId(RelationshipOrganizationInfoItem relLinkedOrgId) {
            this.relLinkedOrgId = relLinkedOrgId;
        }

        public AddOrganizationRelationshipResponseAllOfDataQueryParam relLinkedOrgId(RelationshipOrganizationInfoItem relLinkedOrgId) {
            this.relLinkedOrgId = relLinkedOrgId;
            return this;
        }

        /**
        * The creation date and time of the relationship
        * @return addTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("add_time")
        public String getAddTime() {
            return addTime;
        }

        /**
         * Set addTime
         **/
        public void setAddTime(String addTime) {
            this.addTime = addTime;
        }

        public AddOrganizationRelationshipResponseAllOfDataQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The last updated date and time of the relationship
        * @return updateTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("update_time")
        public String getUpdateTime() {
            return updateTime;
        }

        /**
         * Set updateTime
         **/
        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public AddOrganizationRelationshipResponseAllOfDataQueryParam updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
        * Whether the relationship is active or not
        * @return activeFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("active_flag")
        public String getActiveFlag() {
            return activeFlag;
        }

        /**
         * Set activeFlag
         **/
        public void setActiveFlag(String activeFlag) {
            this.activeFlag = activeFlag;
        }

        public AddOrganizationRelationshipResponseAllOfDataQueryParam activeFlag(String activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddOrganizationRelationshipResponseAllOfDataQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    relOwnerOrgId: ").append(toIndentedString(relOwnerOrgId)).append("\n");
            sb.append("    relLinkedOrgId: ").append(toIndentedString(relLinkedOrgId)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
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
