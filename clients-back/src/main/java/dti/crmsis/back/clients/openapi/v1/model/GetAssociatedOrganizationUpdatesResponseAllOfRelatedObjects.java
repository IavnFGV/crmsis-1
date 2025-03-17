package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetActivitiesResponseRelatedObjectsUser;
import dti.crmsis.back.clients.openapi.v1.model.RelatedOrganizationData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetAssociatedOrganizationUpdatesResponseAllOfRelatedObjects  {

    private RelatedOrganizationData organization;
    private GetActivitiesResponseRelatedObjectsUser user;

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

    public GetAssociatedOrganizationUpdatesResponseAllOfRelatedObjects organization(RelatedOrganizationData organization) {
        this.organization = organization;
        return this;
    }

    /**
    * Get user
    * @return user
    **/
    @JsonProperty("user")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetActivitiesResponseRelatedObjectsUser getUser() {
        return user;
    }

    /**
     * Set user
     **/
    public void setUser(GetActivitiesResponseRelatedObjectsUser user) {
        this.user = user;
    }

    public GetAssociatedOrganizationUpdatesResponseAllOfRelatedObjects user(GetActivitiesResponseRelatedObjectsUser user) {
        this.user = user;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAssociatedOrganizationUpdatesResponseAllOfRelatedObjects {\n");

        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetAssociatedOrganizationUpdatesResponseAllOfRelatedObjects} object that
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

        GetAssociatedOrganizationUpdatesResponseAllOfRelatedObjects model = (GetAssociatedOrganizationUpdatesResponseAllOfRelatedObjects) obj;

        return java.util.Objects.equals(organization, model.organization) &&
        java.util.Objects.equals(user, model.user);
    }

    /**
     * Returns a hash code for a {@code GetAssociatedOrganizationUpdatesResponseAllOfRelatedObjects}.
     *
     * @return a hash code value for a {@code GetAssociatedOrganizationUpdatesResponseAllOfRelatedObjects}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(organization,
        user);
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
    public static class GetAssociatedOrganizationUpdatesResponseAllOfRelatedObjectsQueryParam  {

        @jakarta.ws.rs.QueryParam("organization")
        private RelatedOrganizationData organization;
        @jakarta.ws.rs.QueryParam("user")
        private GetActivitiesResponseRelatedObjectsUser user;

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

        public GetAssociatedOrganizationUpdatesResponseAllOfRelatedObjectsQueryParam organization(RelatedOrganizationData organization) {
            this.organization = organization;
            return this;
        }

        /**
        * Get user
        * @return user
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("user")
        public GetActivitiesResponseRelatedObjectsUser getUser() {
            return user;
        }

        /**
         * Set user
         **/
        public void setUser(GetActivitiesResponseRelatedObjectsUser user) {
            this.user = user;
        }

        public GetAssociatedOrganizationUpdatesResponseAllOfRelatedObjectsQueryParam user(GetActivitiesResponseRelatedObjectsUser user) {
            this.user = user;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetAssociatedOrganizationUpdatesResponseAllOfRelatedObjectsQueryParam {\n");

            sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
            sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
