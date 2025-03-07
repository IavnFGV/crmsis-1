package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetActivitiesResponseRelatedObjectsUser;
import dti.crmsis.back.clients.openapi.v1.model.RelatedOrganizationData;
import dti.crmsis.back.clients.openapi.v1.model.RelatedPictureData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetOrganizationsResponseAllOfRelatedObjects  {

    private RelatedOrganizationData organization;
    private GetActivitiesResponseRelatedObjectsUser user;
    private RelatedPictureData picture;

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

    public GetOrganizationsResponseAllOfRelatedObjects organization(RelatedOrganizationData organization) {
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

    public GetOrganizationsResponseAllOfRelatedObjects user(GetActivitiesResponseRelatedObjectsUser user) {
        this.user = user;
        return this;
    }

    /**
    * Get picture
    * @return picture
    **/
    @JsonProperty("picture")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public RelatedPictureData getPicture() {
        return picture;
    }

    /**
     * Set picture
     **/
    public void setPicture(RelatedPictureData picture) {
        this.picture = picture;
    }

    public GetOrganizationsResponseAllOfRelatedObjects picture(RelatedPictureData picture) {
        this.picture = picture;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOrganizationsResponseAllOfRelatedObjects {\n");

        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetOrganizationsResponseAllOfRelatedObjects} object that
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

        GetOrganizationsResponseAllOfRelatedObjects model = (GetOrganizationsResponseAllOfRelatedObjects) obj;

        return java.util.Objects.equals(organization, model.organization) &&
        java.util.Objects.equals(user, model.user) &&
        java.util.Objects.equals(picture, model.picture);
    }

    /**
     * Returns a hash code for a {@code GetOrganizationsResponseAllOfRelatedObjects}.
     *
     * @return a hash code value for a {@code GetOrganizationsResponseAllOfRelatedObjects}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(organization,
        user,
        picture);
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
    public static class GetOrganizationsResponseAllOfRelatedObjectsQueryParam  {

        @jakarta.ws.rs.QueryParam("organization")
        private RelatedOrganizationData organization;
        @jakarta.ws.rs.QueryParam("user")
        private GetActivitiesResponseRelatedObjectsUser user;
        @jakarta.ws.rs.QueryParam("picture")
        private RelatedPictureData picture;

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

        public GetOrganizationsResponseAllOfRelatedObjectsQueryParam organization(RelatedOrganizationData organization) {
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

        public GetOrganizationsResponseAllOfRelatedObjectsQueryParam user(GetActivitiesResponseRelatedObjectsUser user) {
            this.user = user;
            return this;
        }

        /**
        * Get picture
        * @return picture
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("picture")
        public RelatedPictureData getPicture() {
            return picture;
        }

        /**
         * Set picture
         **/
        public void setPicture(RelatedPictureData picture) {
            this.picture = picture;
        }

        public GetOrganizationsResponseAllOfRelatedObjectsQueryParam picture(RelatedPictureData picture) {
            this.picture = picture;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetOrganizationsResponseAllOfRelatedObjectsQueryParam {\n");

            sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
            sb.append("    user: ").append(toIndentedString(user)).append("\n");
            sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
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
