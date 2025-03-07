package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetActivitiesResponseRelatedObjectsUser;
import dti.crmsis.back.clients.openapi.v1.model.RelatedOrganizationDataWithActiveFlag;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetPersonsResponseAllOfRelatedObjects  {

    private RelatedOrganizationDataWithActiveFlag organization;
    private GetActivitiesResponseRelatedObjectsUser user;

    /**
    * Get organization
    * @return organization
    **/
    @JsonProperty("organization")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public RelatedOrganizationDataWithActiveFlag getOrganization() {
        return organization;
    }

    /**
     * Set organization
     **/
    public void setOrganization(RelatedOrganizationDataWithActiveFlag organization) {
        this.organization = organization;
    }

    public GetPersonsResponseAllOfRelatedObjects organization(RelatedOrganizationDataWithActiveFlag organization) {
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

    public GetPersonsResponseAllOfRelatedObjects user(GetActivitiesResponseRelatedObjectsUser user) {
        this.user = user;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPersonsResponseAllOfRelatedObjects {\n");

        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetPersonsResponseAllOfRelatedObjects} object that
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

        GetPersonsResponseAllOfRelatedObjects model = (GetPersonsResponseAllOfRelatedObjects) obj;

        return java.util.Objects.equals(organization, model.organization) &&
        java.util.Objects.equals(user, model.user);
    }

    /**
     * Returns a hash code for a {@code GetPersonsResponseAllOfRelatedObjects}.
     *
     * @return a hash code value for a {@code GetPersonsResponseAllOfRelatedObjects}.
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
    public static class GetPersonsResponseAllOfRelatedObjectsQueryParam  {

        @jakarta.ws.rs.QueryParam("organization")
        private RelatedOrganizationDataWithActiveFlag organization;
        @jakarta.ws.rs.QueryParam("user")
        private GetActivitiesResponseRelatedObjectsUser user;

        /**
        * Get organization
        * @return organization
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("organization")
        public RelatedOrganizationDataWithActiveFlag getOrganization() {
            return organization;
        }

        /**
         * Set organization
         **/
        public void setOrganization(RelatedOrganizationDataWithActiveFlag organization) {
            this.organization = organization;
        }

        public GetPersonsResponseAllOfRelatedObjectsQueryParam organization(RelatedOrganizationDataWithActiveFlag organization) {
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

        public GetPersonsResponseAllOfRelatedObjectsQueryParam user(GetActivitiesResponseRelatedObjectsUser user) {
            this.user = user;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetPersonsResponseAllOfRelatedObjectsQueryParam {\n");

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
