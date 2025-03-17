package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.MailMessageData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetMailMessageResponse  {

    /**
      * If the response is successful or not
     **/
    private Boolean success;
    /**
      * The email service specific status code and it is returned through the response body.
     **/
    private Integer statusCode;
    /**
      * The status text of the response.
     **/
    private String statusText;
    /**
      * The service name of the response.
     **/
    private String service;
    private MailMessageData data;

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

    public GetMailMessageResponse success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
    * The email service specific status code and it is returned through the response body.
    * @return statusCode
    **/
    @JsonProperty("statusCode")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * Set statusCode
     **/
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public GetMailMessageResponse statusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
    * The status text of the response.
    * @return statusText
    **/
    @JsonProperty("statusText")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getStatusText() {
        return statusText;
    }

    /**
     * Set statusText
     **/
    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public GetMailMessageResponse statusText(String statusText) {
        this.statusText = statusText;
        return this;
    }

    /**
    * The service name of the response.
    * @return service
    **/
    @JsonProperty("service")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getService() {
        return service;
    }

    /**
     * Set service
     **/
    public void setService(String service) {
        this.service = service;
    }

    public GetMailMessageResponse service(String service) {
        this.service = service;
        return this;
    }

    /**
    * Get data
    * @return data
    **/
    @JsonProperty("data")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public MailMessageData getData() {
        return data;
    }

    /**
     * Set data
     **/
    public void setData(MailMessageData data) {
        this.data = data;
    }

    public GetMailMessageResponse data(MailMessageData data) {
        this.data = data;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetMailMessageResponse {\n");

        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    statusText: ").append(toIndentedString(statusText)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetMailMessageResponse} object that
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

        GetMailMessageResponse model = (GetMailMessageResponse) obj;

        return java.util.Objects.equals(success, model.success) &&
        java.util.Objects.equals(statusCode, model.statusCode) &&
        java.util.Objects.equals(statusText, model.statusText) &&
        java.util.Objects.equals(service, model.service) &&
        java.util.Objects.equals(data, model.data);
    }

    /**
     * Returns a hash code for a {@code GetMailMessageResponse}.
     *
     * @return a hash code value for a {@code GetMailMessageResponse}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(success,
        statusCode,
        statusText,
        service,
        data);
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
    public static class GetMailMessageResponseQueryParam  {

        @jakarta.ws.rs.QueryParam("success")
        private Boolean success;
        @jakarta.ws.rs.QueryParam("statusCode")
        private Integer statusCode;
        @jakarta.ws.rs.QueryParam("statusText")
        private String statusText;
        @jakarta.ws.rs.QueryParam("service")
        private String service;
        @jakarta.ws.rs.QueryParam("data")
        private MailMessageData data;

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

        public GetMailMessageResponseQueryParam success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
        * The email service specific status code and it is returned through the response body.
        * @return statusCode
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("statusCode")
        public Integer getStatusCode() {
            return statusCode;
        }

        /**
         * Set statusCode
         **/
        public void setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
        }

        public GetMailMessageResponseQueryParam statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
        * The status text of the response.
        * @return statusText
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("statusText")
        public String getStatusText() {
            return statusText;
        }

        /**
         * Set statusText
         **/
        public void setStatusText(String statusText) {
            this.statusText = statusText;
        }

        public GetMailMessageResponseQueryParam statusText(String statusText) {
            this.statusText = statusText;
            return this;
        }

        /**
        * The service name of the response.
        * @return service
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("service")
        public String getService() {
            return service;
        }

        /**
         * Set service
         **/
        public void setService(String service) {
            this.service = service;
        }

        public GetMailMessageResponseQueryParam service(String service) {
            this.service = service;
            return this;
        }

        /**
        * Get data
        * @return data
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("data")
        public MailMessageData getData() {
            return data;
        }

        /**
         * Set data
         **/
        public void setData(MailMessageData data) {
            this.data = data;
        }

        public GetMailMessageResponseQueryParam data(MailMessageData data) {
            this.data = data;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetMailMessageResponseQueryParam {\n");

            sb.append("    success: ").append(toIndentedString(success)).append("\n");
            sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
            sb.append("    statusText: ").append(toIndentedString(statusText)).append("\n");
            sb.append("    service: ").append(toIndentedString(service)).append("\n");
            sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
