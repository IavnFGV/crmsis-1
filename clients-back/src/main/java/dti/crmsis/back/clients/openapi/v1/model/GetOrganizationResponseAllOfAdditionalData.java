package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetOrganizationResponseAllOfAdditionalDataFollowers;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetOrganizationResponseAllOfAdditionalData  {

    private GetOrganizationResponseAllOfAdditionalDataFollowers followers;
    /**
      * Dropbox email for the organization
     **/
    private String dropboxEmail;

    /**
    * Get followers
    * @return followers
    **/
    @JsonProperty("followers")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetOrganizationResponseAllOfAdditionalDataFollowers getFollowers() {
        return followers;
    }

    /**
     * Set followers
     **/
    public void setFollowers(GetOrganizationResponseAllOfAdditionalDataFollowers followers) {
        this.followers = followers;
    }

    public GetOrganizationResponseAllOfAdditionalData followers(GetOrganizationResponseAllOfAdditionalDataFollowers followers) {
        this.followers = followers;
        return this;
    }

    /**
    * Dropbox email for the organization
    * @return dropboxEmail
    **/
    @JsonProperty("dropbox_email")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDropboxEmail() {
        return dropboxEmail;
    }

    /**
     * Set dropboxEmail
     **/
    public void setDropboxEmail(String dropboxEmail) {
        this.dropboxEmail = dropboxEmail;
    }

    public GetOrganizationResponseAllOfAdditionalData dropboxEmail(String dropboxEmail) {
        this.dropboxEmail = dropboxEmail;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOrganizationResponseAllOfAdditionalData {\n");

        sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
        sb.append("    dropboxEmail: ").append(toIndentedString(dropboxEmail)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetOrganizationResponseAllOfAdditionalData} object that
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

        GetOrganizationResponseAllOfAdditionalData model = (GetOrganizationResponseAllOfAdditionalData) obj;

        return java.util.Objects.equals(followers, model.followers) &&
        java.util.Objects.equals(dropboxEmail, model.dropboxEmail);
    }

    /**
     * Returns a hash code for a {@code GetOrganizationResponseAllOfAdditionalData}.
     *
     * @return a hash code value for a {@code GetOrganizationResponseAllOfAdditionalData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(followers,
        dropboxEmail);
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
    public static class GetOrganizationResponseAllOfAdditionalDataQueryParam  {

        @jakarta.ws.rs.QueryParam("followers")
        private GetOrganizationResponseAllOfAdditionalDataFollowers followers;
        @jakarta.ws.rs.QueryParam("dropboxEmail")
        private String dropboxEmail;

        /**
        * Get followers
        * @return followers
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("followers")
        public GetOrganizationResponseAllOfAdditionalDataFollowers getFollowers() {
            return followers;
        }

        /**
         * Set followers
         **/
        public void setFollowers(GetOrganizationResponseAllOfAdditionalDataFollowers followers) {
            this.followers = followers;
        }

        public GetOrganizationResponseAllOfAdditionalDataQueryParam followers(GetOrganizationResponseAllOfAdditionalDataFollowers followers) {
            this.followers = followers;
            return this;
        }

        /**
        * Dropbox email for the organization
        * @return dropboxEmail
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("dropbox_email")
        public String getDropboxEmail() {
            return dropboxEmail;
        }

        /**
         * Set dropboxEmail
         **/
        public void setDropboxEmail(String dropboxEmail) {
            this.dropboxEmail = dropboxEmail;
        }

        public GetOrganizationResponseAllOfAdditionalDataQueryParam dropboxEmail(String dropboxEmail) {
            this.dropboxEmail = dropboxEmail;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetOrganizationResponseAllOfAdditionalDataQueryParam {\n");

            sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
            sb.append("    dropboxEmail: ").append(toIndentedString(dropboxEmail)).append("\n");
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
