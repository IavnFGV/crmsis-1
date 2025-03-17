package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERID;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The follower that is associated with the item
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetOrganizationResponseAllOfAdditionalDataFollowers  {

    private GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERID FOLLOWER_USER_ID;

    /**
    * Get FOLLOWER_USER_ID
    * @return FOLLOWER_USER_ID
    **/
    @JsonProperty("FOLLOWER_USER_ID")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERID getFOLLOWERUSERID() {
        return FOLLOWER_USER_ID;
    }

    /**
     * Set FOLLOWER_USER_ID
     **/
    public void setFOLLOWERUSERID(GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERID FOLLOWER_USER_ID) {
        this.FOLLOWER_USER_ID = FOLLOWER_USER_ID;
    }

    public GetOrganizationResponseAllOfAdditionalDataFollowers FOLLOWER_USER_ID(GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERID FOLLOWER_USER_ID) {
        this.FOLLOWER_USER_ID = FOLLOWER_USER_ID;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOrganizationResponseAllOfAdditionalDataFollowers {\n");

        sb.append("    FOLLOWER_USER_ID: ").append(toIndentedString(FOLLOWER_USER_ID)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetOrganizationResponseAllOfAdditionalDataFollowers} object that
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

        GetOrganizationResponseAllOfAdditionalDataFollowers model = (GetOrganizationResponseAllOfAdditionalDataFollowers) obj;

        return java.util.Objects.equals(FOLLOWER_USER_ID, model.FOLLOWER_USER_ID);
    }

    /**
     * Returns a hash code for a {@code GetOrganizationResponseAllOfAdditionalDataFollowers}.
     *
     * @return a hash code value for a {@code GetOrganizationResponseAllOfAdditionalDataFollowers}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(FOLLOWER_USER_ID);
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
      * The follower that is associated with the item
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetOrganizationResponseAllOfAdditionalDataFollowersQueryParam  {

        /**
          * The follower that is associated with the item
         **/
        @jakarta.ws.rs.QueryParam("FOLLOWER_USER_ID")
        private GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERID FOLLOWER_USER_ID;

        /**
        * Get FOLLOWER_USER_ID
        * @return FOLLOWER_USER_ID
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("FOLLOWER_USER_ID")
        public GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERID getFOLLOWERUSERID() {
            return FOLLOWER_USER_ID;
        }

        /**
         * Set FOLLOWER_USER_ID
         **/
        public void setFOLLOWERUSERID(GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERID FOLLOWER_USER_ID) {
            this.FOLLOWER_USER_ID = FOLLOWER_USER_ID;
        }

        public GetOrganizationResponseAllOfAdditionalDataFollowersQueryParam FOLLOWER_USER_ID(GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERID FOLLOWER_USER_ID) {
            this.FOLLOWER_USER_ID = FOLLOWER_USER_ID;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetOrganizationResponseAllOfAdditionalDataFollowersQueryParam {\n");

            sb.append("    FOLLOWER_USER_ID: ").append(toIndentedString(FOLLOWER_USER_ID)).append("\n");
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
