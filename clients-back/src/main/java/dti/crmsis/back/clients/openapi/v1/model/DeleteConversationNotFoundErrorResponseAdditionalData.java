package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteConversationNotFoundErrorResponseAdditionalData  {

    /**
      * An error code sent by the API
     **/
    private String code;

    /**
    * An error code sent by the API
    * @return code
    **/
    @JsonProperty("code")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getCode() {
        return code;
    }

    /**
     * Set code
     **/
    public void setCode(String code) {
        this.code = code;
    }

    public DeleteConversationNotFoundErrorResponseAdditionalData code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteConversationNotFoundErrorResponseAdditionalData {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code DeleteConversationNotFoundErrorResponseAdditionalData} object that
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

        DeleteConversationNotFoundErrorResponseAdditionalData model = (DeleteConversationNotFoundErrorResponseAdditionalData) obj;

        return java.util.Objects.equals(code, model.code);
    }

    /**
     * Returns a hash code for a {@code DeleteConversationNotFoundErrorResponseAdditionalData}.
     *
     * @return a hash code value for a {@code DeleteConversationNotFoundErrorResponseAdditionalData}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(code);
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
    public static class DeleteConversationNotFoundErrorResponseAdditionalDataQueryParam  {

        @jakarta.ws.rs.QueryParam("code")
        private String code;

        /**
        * An error code sent by the API
        * @return code
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("code")
        public String getCode() {
            return code;
        }

        /**
         * Set code
         **/
        public void setCode(String code) {
            this.code = code;
        }

        public DeleteConversationNotFoundErrorResponseAdditionalDataQueryParam code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DeleteConversationNotFoundErrorResponseAdditionalDataQueryParam {\n");

            sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
