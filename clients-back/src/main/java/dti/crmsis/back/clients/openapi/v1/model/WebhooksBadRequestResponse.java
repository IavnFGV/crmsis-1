package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class WebhooksBadRequestResponse  {

    /**
      * If the response is successful or not
     **/
    private Boolean success;
    /**
      * The status of the response
     **/
    private String status;
    /**
      * List of errors
     **/
    private Object errors;

    /**
    * If the response is successful or not
    * @return success
    **/
    @JsonProperty("success")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getSuccess() {
        return success;
    }

    /**
     * Set success
     **/
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public WebhooksBadRequestResponse success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
    * The status of the response
    * @return status
    **/
    @JsonProperty("status")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Set status
     **/
    public void setStatus(String status) {
        this.status = status;
    }

    public WebhooksBadRequestResponse status(String status) {
        this.status = status;
        return this;
    }

    /**
    * List of errors
    * @return errors
    **/
    @JsonProperty("errors")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Object getErrors() {
        return errors;
    }

    /**
     * Set errors
     **/
    public void setErrors(Object errors) {
        this.errors = errors;
    }

    public WebhooksBadRequestResponse errors(Object errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksBadRequestResponse {\n");

        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code WebhooksBadRequestResponse} object that
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

        WebhooksBadRequestResponse model = (WebhooksBadRequestResponse) obj;

        return java.util.Objects.equals(success, model.success) &&
        java.util.Objects.equals(status, model.status) &&
        java.util.Objects.equals(errors, model.errors);
    }

    /**
     * Returns a hash code for a {@code WebhooksBadRequestResponse}.
     *
     * @return a hash code value for a {@code WebhooksBadRequestResponse}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(success,
        status,
        errors);
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
    public static class WebhooksBadRequestResponseQueryParam  {

        @jakarta.ws.rs.QueryParam("success")
        private Boolean success;
        @jakarta.ws.rs.QueryParam("status")
        private String status;
        @jakarta.ws.rs.QueryParam("errors")
        private Object errors;

        /**
        * If the response is successful or not
        * @return success
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("success")
        public Boolean getSuccess() {
            return success;
        }

        /**
         * Set success
         **/
        public void setSuccess(Boolean success) {
            this.success = success;
        }

        public WebhooksBadRequestResponseQueryParam success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
        * The status of the response
        * @return status
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        public String getStatus() {
            return status;
        }

        /**
         * Set status
         **/
        public void setStatus(String status) {
            this.status = status;
        }

        public WebhooksBadRequestResponseQueryParam status(String status) {
            this.status = status;
            return this;
        }

        /**
        * List of errors
        * @return errors
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("errors")
        public Object getErrors() {
            return errors;
        }

        /**
         * Set errors
         **/
        public void setErrors(Object errors) {
            this.errors = errors;
        }

        public WebhooksBadRequestResponseQueryParam errors(Object errors) {
            this.errors = errors;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class WebhooksBadRequestResponseQueryParam {\n");

            sb.append("    success: ").append(toIndentedString(success)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
