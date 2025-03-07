package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetUserProviderLinkSuccessResponseData  {

    /**
      * The success message of the request
     **/
    private String message;

    /**
    * The success message of the request
    * @return message
    **/
    @JsonProperty("message")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getMessage() {
        return message;
    }

    /**
     * Set message
     **/
    public void setMessage(String message) {
        this.message = message;
    }

    public GetUserProviderLinkSuccessResponseData message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetUserProviderLinkSuccessResponseData {\n");

        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetUserProviderLinkSuccessResponseData} object that
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

        GetUserProviderLinkSuccessResponseData model = (GetUserProviderLinkSuccessResponseData) obj;

        return java.util.Objects.equals(message, model.message);
    }

    /**
     * Returns a hash code for a {@code GetUserProviderLinkSuccessResponseData}.
     *
     * @return a hash code value for a {@code GetUserProviderLinkSuccessResponseData}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(message);
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
    public static class GetUserProviderLinkSuccessResponseDataQueryParam  {

        @jakarta.ws.rs.QueryParam("message")
        private String message;

        /**
        * The success message of the request
        * @return message
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        public String getMessage() {
            return message;
        }

        /**
         * Set message
         **/
        public void setMessage(String message) {
            this.message = message;
        }

        public GetUserProviderLinkSuccessResponseDataQueryParam message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetUserProviderLinkSuccessResponseDataQueryParam {\n");

            sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
