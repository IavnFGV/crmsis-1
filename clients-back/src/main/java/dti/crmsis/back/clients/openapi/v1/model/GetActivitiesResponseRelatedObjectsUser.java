package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.UserDataWithId;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetActivitiesResponseRelatedObjectsUser  {

    private UserDataWithId USER_ID;

    /**
    * Get USER_ID
    * @return USER_ID
    **/
    @JsonProperty("USER_ID")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public UserDataWithId getUSERID() {
        return USER_ID;
    }

    /**
     * Set USER_ID
     **/
    public void setUSERID(UserDataWithId USER_ID) {
        this.USER_ID = USER_ID;
    }

    public GetActivitiesResponseRelatedObjectsUser USER_ID(UserDataWithId USER_ID) {
        this.USER_ID = USER_ID;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetActivitiesResponseRelatedObjectsUser {\n");

        sb.append("    USER_ID: ").append(toIndentedString(USER_ID)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetActivitiesResponseRelatedObjectsUser} object that
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

        GetActivitiesResponseRelatedObjectsUser model = (GetActivitiesResponseRelatedObjectsUser) obj;

        return java.util.Objects.equals(USER_ID, model.USER_ID);
    }

    /**
     * Returns a hash code for a {@code GetActivitiesResponseRelatedObjectsUser}.
     *
     * @return a hash code value for a {@code GetActivitiesResponseRelatedObjectsUser}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(USER_ID);
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
    public static class GetActivitiesResponseRelatedObjectsUserQueryParam  {

        @jakarta.ws.rs.QueryParam("USER_ID")
        private UserDataWithId USER_ID;

        /**
        * Get USER_ID
        * @return USER_ID
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("USER_ID")
        public UserDataWithId getUSERID() {
            return USER_ID;
        }

        /**
         * Set USER_ID
         **/
        public void setUSERID(UserDataWithId USER_ID) {
            this.USER_ID = USER_ID;
        }

        public GetActivitiesResponseRelatedObjectsUserQueryParam USER_ID(UserDataWithId USER_ID) {
            this.USER_ID = USER_ID;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetActivitiesResponseRelatedObjectsUserQueryParam {\n");

            sb.append("    USER_ID: ").append(toIndentedString(USER_ID)).append("\n");
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
