package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.DeleteConversationForbiddenErrorResponseAdditionalData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteConversationForbiddenErrorResponse  {

    private Boolean success;
    /**
      * The error description
     **/
    private String error;
    private String errorInfo;
    private DeleteConversationForbiddenErrorResponseAdditionalData additionalData;

    /**
    * Get success
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

    public DeleteConversationForbiddenErrorResponse success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
    * The error description
    * @return error
    **/
    @JsonProperty("error")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getError() {
        return error;
    }

    /**
     * Set error
     **/
    public void setError(String error) {
        this.error = error;
    }

    public DeleteConversationForbiddenErrorResponse error(String error) {
        this.error = error;
        return this;
    }

    /**
    * Get errorInfo
    * @return errorInfo
    **/
    @JsonProperty("error_info")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getErrorInfo() {
        return errorInfo;
    }

    /**
     * Set errorInfo
     **/
    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public DeleteConversationForbiddenErrorResponse errorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }

    /**
    * Get additionalData
    * @return additionalData
    **/
    @JsonProperty("additional_data")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public DeleteConversationForbiddenErrorResponseAdditionalData getAdditionalData() {
        return additionalData;
    }

    /**
     * Set additionalData
     **/
    public void setAdditionalData(DeleteConversationForbiddenErrorResponseAdditionalData additionalData) {
        this.additionalData = additionalData;
    }

    public DeleteConversationForbiddenErrorResponse additionalData(DeleteConversationForbiddenErrorResponseAdditionalData additionalData) {
        this.additionalData = additionalData;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteConversationForbiddenErrorResponse {\n");

        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
        sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code DeleteConversationForbiddenErrorResponse} object that
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

        DeleteConversationForbiddenErrorResponse model = (DeleteConversationForbiddenErrorResponse) obj;

        return java.util.Objects.equals(success, model.success) &&
        java.util.Objects.equals(error, model.error) &&
        java.util.Objects.equals(errorInfo, model.errorInfo) &&
        java.util.Objects.equals(additionalData, model.additionalData);
    }

    /**
     * Returns a hash code for a {@code DeleteConversationForbiddenErrorResponse}.
     *
     * @return a hash code value for a {@code DeleteConversationForbiddenErrorResponse}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(success,
        error,
        errorInfo,
        additionalData);
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
    public static class DeleteConversationForbiddenErrorResponseQueryParam  {

        @jakarta.ws.rs.QueryParam("success")
        private Boolean success;
        @jakarta.ws.rs.QueryParam("error")
        private String error;
        @jakarta.ws.rs.QueryParam("errorInfo")
        private String errorInfo;
        @jakarta.ws.rs.QueryParam("additionalData")
        private DeleteConversationForbiddenErrorResponseAdditionalData additionalData;

        /**
        * Get success
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

        public DeleteConversationForbiddenErrorResponseQueryParam success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
        * The error description
        * @return error
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("error")
        public String getError() {
            return error;
        }

        /**
         * Set error
         **/
        public void setError(String error) {
            this.error = error;
        }

        public DeleteConversationForbiddenErrorResponseQueryParam error(String error) {
            this.error = error;
            return this;
        }

        /**
        * Get errorInfo
        * @return errorInfo
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("error_info")
        public String getErrorInfo() {
            return errorInfo;
        }

        /**
         * Set errorInfo
         **/
        public void setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
        }

        public DeleteConversationForbiddenErrorResponseQueryParam errorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }

        /**
        * Get additionalData
        * @return additionalData
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("additional_data")
        public DeleteConversationForbiddenErrorResponseAdditionalData getAdditionalData() {
            return additionalData;
        }

        /**
         * Set additionalData
         **/
        public void setAdditionalData(DeleteConversationForbiddenErrorResponseAdditionalData additionalData) {
            this.additionalData = additionalData;
        }

        public DeleteConversationForbiddenErrorResponseQueryParam additionalData(DeleteConversationForbiddenErrorResponseAdditionalData additionalData) {
            this.additionalData = additionalData;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DeleteConversationForbiddenErrorResponseQueryParam {\n");

            sb.append("    success: ").append(toIndentedString(success)).append("\n");
            sb.append("    error: ").append(toIndentedString(error)).append("\n");
            sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
            sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
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
