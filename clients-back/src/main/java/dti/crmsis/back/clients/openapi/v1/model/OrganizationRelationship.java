package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class OrganizationRelationship  {

    /**
      * The ID of the base organization for the returned calculated values
     **/
    private Integer orgId;

    public enum TypeEnum {
        PARENT(String.valueOf("parent")), RELATED(String.valueOf("related"));

        // caching enum access
        private static final java.util.EnumSet<TypeEnum> values = java.util.EnumSet.allOf(TypeEnum.class);

        String value;

        TypeEnum (String v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TypeEnum fromString(String v) {
            for (TypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    /**
      * The type of organization relationship
     **/
    private TypeEnum type;
    /**
      * The owner of this relationship. If type is `parent`, then the owner is the parent and the linked organization is the daughter.
     **/
    private Integer relOwnerOrgId;
    /**
      * The linked organization in this relationship. If type is `parent`, then the linked organization is the daughter.
     **/
    private Integer relLinkedOrgId;

    /**
    * The ID of the base organization for the returned calculated values
    * @return orgId
    **/
    @JsonProperty("org_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * Set orgId
     **/
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public OrganizationRelationship orgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }

    /**
    * The type of organization relationship
    * @return type
    **/
    @JsonProperty("type")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public TypeEnum getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(TypeEnum type) {
        this.type = type;
    }

    public OrganizationRelationship type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
    * The owner of this relationship. If type is `parent`, then the owner is the parent and the linked organization is the daughter.
    * @return relOwnerOrgId
    **/
    @JsonProperty("rel_owner_org_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getRelOwnerOrgId() {
        return relOwnerOrgId;
    }

    /**
     * Set relOwnerOrgId
     **/
    public void setRelOwnerOrgId(Integer relOwnerOrgId) {
        this.relOwnerOrgId = relOwnerOrgId;
    }

    public OrganizationRelationship relOwnerOrgId(Integer relOwnerOrgId) {
        this.relOwnerOrgId = relOwnerOrgId;
        return this;
    }

    /**
    * The linked organization in this relationship. If type is `parent`, then the linked organization is the daughter.
    * @return relLinkedOrgId
    **/
    @JsonProperty("rel_linked_org_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getRelLinkedOrgId() {
        return relLinkedOrgId;
    }

    /**
     * Set relLinkedOrgId
     **/
    public void setRelLinkedOrgId(Integer relLinkedOrgId) {
        this.relLinkedOrgId = relLinkedOrgId;
    }

    public OrganizationRelationship relLinkedOrgId(Integer relLinkedOrgId) {
        this.relLinkedOrgId = relLinkedOrgId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationRelationship {\n");

        sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    relOwnerOrgId: ").append(toIndentedString(relOwnerOrgId)).append("\n");
        sb.append("    relLinkedOrgId: ").append(toIndentedString(relLinkedOrgId)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code OrganizationRelationship} object that
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

        OrganizationRelationship model = (OrganizationRelationship) obj;

        return java.util.Objects.equals(orgId, model.orgId) &&
        java.util.Objects.equals(type, model.type) &&
        java.util.Objects.equals(relOwnerOrgId, model.relOwnerOrgId) &&
        java.util.Objects.equals(relLinkedOrgId, model.relLinkedOrgId);
    }

    /**
     * Returns a hash code for a {@code OrganizationRelationship}.
     *
     * @return a hash code value for a {@code OrganizationRelationship}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(orgId,
        type,
        relOwnerOrgId,
        relLinkedOrgId);
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
    public static class OrganizationRelationshipQueryParam  {

        @jakarta.ws.rs.QueryParam("orgId")
        private Integer orgId;

    public enum TypeEnum {
        PARENT(String.valueOf("parent")), RELATED(String.valueOf("related"));

        // caching enum access
        private static final java.util.EnumSet<TypeEnum> values = java.util.EnumSet.allOf(TypeEnum.class);

        String value;

        TypeEnum (String v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TypeEnum fromString(String v) {
            for (TypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private TypeEnum type;
        @jakarta.ws.rs.QueryParam("relOwnerOrgId")
        private Integer relOwnerOrgId;
        @jakarta.ws.rs.QueryParam("relLinkedOrgId")
        private Integer relLinkedOrgId;

        /**
        * The ID of the base organization for the returned calculated values
        * @return orgId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("org_id")
        public Integer getOrgId() {
            return orgId;
        }

        /**
         * Set orgId
         **/
        public void setOrgId(Integer orgId) {
            this.orgId = orgId;
        }

        public OrganizationRelationshipQueryParam orgId(Integer orgId) {
            this.orgId = orgId;
            return this;
        }

        /**
        * The type of organization relationship
        * @return type
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        public TypeEnum getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(TypeEnum type) {
            this.type = type;
        }

        public OrganizationRelationshipQueryParam type(TypeEnum type) {
            this.type = type;
            return this;
        }

        /**
        * The owner of this relationship. If type is `parent`, then the owner is the parent and the linked organization is the daughter.
        * @return relOwnerOrgId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("rel_owner_org_id")
        public Integer getRelOwnerOrgId() {
            return relOwnerOrgId;
        }

        /**
         * Set relOwnerOrgId
         **/
        public void setRelOwnerOrgId(Integer relOwnerOrgId) {
            this.relOwnerOrgId = relOwnerOrgId;
        }

        public OrganizationRelationshipQueryParam relOwnerOrgId(Integer relOwnerOrgId) {
            this.relOwnerOrgId = relOwnerOrgId;
            return this;
        }

        /**
        * The linked organization in this relationship. If type is `parent`, then the linked organization is the daughter.
        * @return relLinkedOrgId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("rel_linked_org_id")
        public Integer getRelLinkedOrgId() {
            return relLinkedOrgId;
        }

        /**
         * Set relLinkedOrgId
         **/
        public void setRelLinkedOrgId(Integer relLinkedOrgId) {
            this.relLinkedOrgId = relLinkedOrgId;
        }

        public OrganizationRelationshipQueryParam relLinkedOrgId(Integer relLinkedOrgId) {
            this.relLinkedOrgId = relLinkedOrgId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class OrganizationRelationshipQueryParam {\n");

            sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    relOwnerOrgId: ").append(toIndentedString(relOwnerOrgId)).append("\n");
            sb.append("    relLinkedOrgId: ").append(toIndentedString(relLinkedOrgId)).append("\n");
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
