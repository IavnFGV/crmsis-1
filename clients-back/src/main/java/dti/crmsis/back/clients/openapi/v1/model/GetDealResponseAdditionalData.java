package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetDealResponseAdditionalData  {

    /**
      * The BCC email of the deal
     **/
    private String dropboxEmail;

    /**
    * The BCC email of the deal
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

    public GetDealResponseAdditionalData dropboxEmail(String dropboxEmail) {
        this.dropboxEmail = dropboxEmail;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetDealResponseAdditionalData {\n");

        sb.append("    dropboxEmail: ").append(toIndentedString(dropboxEmail)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetDealResponseAdditionalData} object that
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

        GetDealResponseAdditionalData model = (GetDealResponseAdditionalData) obj;

        return java.util.Objects.equals(dropboxEmail, model.dropboxEmail);
    }

    /**
     * Returns a hash code for a {@code GetDealResponseAdditionalData}.
     *
     * @return a hash code value for a {@code GetDealResponseAdditionalData}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(dropboxEmail);
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
    public static class GetDealResponseAdditionalDataQueryParam  {

        @jakarta.ws.rs.QueryParam("dropboxEmail")
        private String dropboxEmail;

        /**
        * The BCC email of the deal
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

        public GetDealResponseAdditionalDataQueryParam dropboxEmail(String dropboxEmail) {
            this.dropboxEmail = dropboxEmail;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetDealResponseAdditionalDataQueryParam {\n");

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
