package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.RelatedOrganizationData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetOrganizationRelationshipsResponseAllOfRelatedObjects  {

    private RelatedOrganizationData organization;

    /**
    * Get organization
    * @return organization
    **/
    @JsonProperty("organization")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public RelatedOrganizationData getOrganization() {
        return organization;
    }

    /**
     * Set organization
     **/
    public void setOrganization(RelatedOrganizationData organization) {
        this.organization = organization;
    }

    public GetOrganizationRelationshipsResponseAllOfRelatedObjects organization(RelatedOrganizationData organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOrganizationRelationshipsResponseAllOfRelatedObjects {\n");

        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetOrganizationRelationshipsResponseAllOfRelatedObjects} object that
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

        GetOrganizationRelationshipsResponseAllOfRelatedObjects model = (GetOrganizationRelationshipsResponseAllOfRelatedObjects) obj;

        return java.util.Objects.equals(organization, model.organization);
    }

    /**
     * Returns a hash code for a {@code GetOrganizationRelationshipsResponseAllOfRelatedObjects}.
     *
     * @return a hash code value for a {@code GetOrganizationRelationshipsResponseAllOfRelatedObjects}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(organization);
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
    public static class GetOrganizationRelationshipsResponseAllOfRelatedObjectsQueryParam  {

        @jakarta.ws.rs.QueryParam("organization")
        private RelatedOrganizationData organization;

        /**
        * Get organization
        * @return organization
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("organization")
        public RelatedOrganizationData getOrganization() {
            return organization;
        }

        /**
         * Set organization
         **/
        public void setOrganization(RelatedOrganizationData organization) {
            this.organization = organization;
        }

        public GetOrganizationRelationshipsResponseAllOfRelatedObjectsQueryParam organization(RelatedOrganizationData organization) {
            this.organization = organization;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetOrganizationRelationshipsResponseAllOfRelatedObjectsQueryParam {\n");

            sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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
