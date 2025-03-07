package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.BaseWebhook;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetWebhookResponse  {

    /**
      * If the response is successful or not
     **/
    private Boolean success;
    /**
      * The status of the response
     **/
    private String status;
    private BaseWebhook data;

    /**
    * If the response is successful or not
    * @return success
    **/
    @JsonProperty("success")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getSuccess() {
        return success;
    }

    /**
     * Set success
     **/
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public GetWebhookResponse success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
    * The status of the response
    * @return status
    **/
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Set status
     **/
    public void setStatus(String status) {
        this.status = status;
    }

    public GetWebhookResponse status(String status) {
        this.status = status;
        return this;
    }

    /**
    * Get data
    * @return data
    **/
    @JsonProperty("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BaseWebhook getData() {
        return data;
    }

    /**
     * Set data
     **/
    public void setData(BaseWebhook data) {
        this.data = data;
    }

    public GetWebhookResponse data(BaseWebhook data) {
        this.data = data;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetWebhookResponse {\n");

        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetWebhookResponse} object that
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

        GetWebhookResponse model = (GetWebhookResponse) obj;

        return java.util.Objects.equals(success, model.success) &&
        java.util.Objects.equals(status, model.status) &&
        java.util.Objects.equals(data, model.data);
    }

    /**
     * Returns a hash code for a {@code GetWebhookResponse}.
     *
     * @return a hash code value for a {@code GetWebhookResponse}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(success,
        status,
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetWebhookResponseQueryParam  {

        @jakarta.ws.rs.QueryParam("success")
        private Boolean success;
        @jakarta.ws.rs.QueryParam("status")
        private String status;
        @jakarta.ws.rs.QueryParam("data")
        private BaseWebhook data;

        /**
        * If the response is successful or not
        * @return success
        **/
        @JsonProperty("success")
        public Boolean getSuccess() {
            return success;
        }

        /**
         * Set success
         **/
        public void setSuccess(Boolean success) {
            this.success = success;
        }

        public GetWebhookResponseQueryParam success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
        * The status of the response
        * @return status
        **/
        @JsonProperty("status")
        public String getStatus() {
            return status;
        }

        /**
         * Set status
         **/
        public void setStatus(String status) {
            this.status = status;
        }

        public GetWebhookResponseQueryParam status(String status) {
            this.status = status;
            return this;
        }

        /**
        * Get data
        * @return data
        **/
        @JsonProperty("data")
        public BaseWebhook getData() {
            return data;
        }

        /**
         * Set data
         **/
        public void setData(BaseWebhook data) {
            this.data = data;
        }

        public GetWebhookResponseQueryParam data(BaseWebhook data) {
            this.data = data;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetWebhookResponseQueryParam {\n");

            sb.append("    success: ").append(toIndentedString(success)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
