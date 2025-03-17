package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class UnathorizedResponse  {

    /**
      * If the response is successful or not
     **/
    private Boolean success;
    /**
      * The error message
     **/
    private String error;
    /**
      * The response error code
     **/
    private Integer errorCode;

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

    public UnathorizedResponse success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
    * The error message
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

    public UnathorizedResponse error(String error) {
        this.error = error;
        return this;
    }

    /**
    * The response error code
    * @return errorCode
    **/
    @JsonProperty("errorCode")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * Set errorCode
     **/
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public UnathorizedResponse errorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnathorizedResponse {\n");

        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code UnathorizedResponse} object that
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

        UnathorizedResponse model = (UnathorizedResponse) obj;

        return java.util.Objects.equals(success, model.success) &&
        java.util.Objects.equals(error, model.error) &&
        java.util.Objects.equals(errorCode, model.errorCode);
    }

    /**
     * Returns a hash code for a {@code UnathorizedResponse}.
     *
     * @return a hash code value for a {@code UnathorizedResponse}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(success,
        error,
        errorCode);
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
    public static class UnathorizedResponseQueryParam  {

        @jakarta.ws.rs.QueryParam("success")
        private Boolean success;
        @jakarta.ws.rs.QueryParam("error")
        private String error;
        @jakarta.ws.rs.QueryParam("errorCode")
        private Integer errorCode;

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

        public UnathorizedResponseQueryParam success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
        * The error message
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

        public UnathorizedResponseQueryParam error(String error) {
            this.error = error;
            return this;
        }

        /**
        * The response error code
        * @return errorCode
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
        public Integer getErrorCode() {
            return errorCode;
        }

        /**
         * Set errorCode
         **/
        public void setErrorCode(Integer errorCode) {
            this.errorCode = errorCode;
        }

        public UnathorizedResponseQueryParam errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class UnathorizedResponseQueryParam {\n");

            sb.append("    success: ").append(toIndentedString(success)).append("\n");
            sb.append("    error: ").append(toIndentedString(error)).append("\n");
            sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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
