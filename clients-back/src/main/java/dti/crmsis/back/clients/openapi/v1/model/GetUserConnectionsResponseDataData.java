package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The object of UserConnections
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetUserConnectionsResponseDataData  {

    /**
      * The third party ID or false in case the ID is not found
     **/
    private String google;

    /**
    * The third party ID or false in case the ID is not found
    * @return google
    **/
    @JsonProperty("google")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getGoogle() {
        return google;
    }

    /**
     * Set google
     **/
    public void setGoogle(String google) {
        this.google = google;
    }

    public GetUserConnectionsResponseDataData google(String google) {
        this.google = google;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetUserConnectionsResponseDataData {\n");

        sb.append("    google: ").append(toIndentedString(google)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetUserConnectionsResponseDataData} object that
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

        GetUserConnectionsResponseDataData model = (GetUserConnectionsResponseDataData) obj;

        return java.util.Objects.equals(google, model.google);
    }

    /**
     * Returns a hash code for a {@code GetUserConnectionsResponseDataData}.
     *
     * @return a hash code value for a {@code GetUserConnectionsResponseDataData}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(google);
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
      * The object of UserConnections
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetUserConnectionsResponseDataDataQueryParam  {

        /**
          * The object of UserConnections
         **/
        @jakarta.ws.rs.QueryParam("google")
        private String google;

        /**
        * The third party ID or false in case the ID is not found
        * @return google
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("google")
        public String getGoogle() {
            return google;
        }

        /**
         * Set google
         **/
        public void setGoogle(String google) {
            this.google = google;
        }

        public GetUserConnectionsResponseDataDataQueryParam google(String google) {
            this.google = google;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetUserConnectionsResponseDataDataQueryParam {\n");

            sb.append("    google: ").append(toIndentedString(google)).append("\n");
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
