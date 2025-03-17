package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetMailThreadMessagesResponseAllOfDataInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetMailThreadMessagesResponse  {

    /**
      * If the response is successful or not
     **/
    private Boolean success;
    /**
      * The array of the mail messages of the mail thread
     **/
    private List<GetMailThreadMessagesResponseAllOfDataInner> data;

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

    public GetMailThreadMessagesResponse success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
    * The array of the mail messages of the mail thread
    * @return data
    **/
    @JsonProperty("data")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<GetMailThreadMessagesResponseAllOfDataInner> getData() {
        return data;
    }

    /**
     * Set data
     **/
    public void setData(List<GetMailThreadMessagesResponseAllOfDataInner> data) {
        this.data = data;
    }

    public GetMailThreadMessagesResponse data(List<GetMailThreadMessagesResponseAllOfDataInner> data) {
        this.data = data;
        return this;
    }
    public GetMailThreadMessagesResponse addDataItem(GetMailThreadMessagesResponseAllOfDataInner dataItem) {
        if (this.data == null){
            data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetMailThreadMessagesResponse {\n");

        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetMailThreadMessagesResponse} object that
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

        GetMailThreadMessagesResponse model = (GetMailThreadMessagesResponse) obj;

        return java.util.Objects.equals(success, model.success) &&
        java.util.Objects.equals(data, model.data);
    }

    /**
     * Returns a hash code for a {@code GetMailThreadMessagesResponse}.
     *
     * @return a hash code value for a {@code GetMailThreadMessagesResponse}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(success,
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
    public static class GetMailThreadMessagesResponseQueryParam  {

        @jakarta.ws.rs.QueryParam("success")
        private Boolean success;
        @jakarta.ws.rs.QueryParam("data")
        private List<GetMailThreadMessagesResponseAllOfDataInner> data = null;

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

        public GetMailThreadMessagesResponseQueryParam success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
        * The array of the mail messages of the mail thread
        * @return data
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("data")
        public List<GetMailThreadMessagesResponseAllOfDataInner> getData() {
            return data;
        }

        /**
         * Set data
         **/
        public void setData(List<GetMailThreadMessagesResponseAllOfDataInner> data) {
            this.data = data;
        }

        public GetMailThreadMessagesResponseQueryParam data(List<GetMailThreadMessagesResponseAllOfDataInner> data) {
            this.data = data;
            return this;
        }
        public GetMailThreadMessagesResponseQueryParam addDataItem(GetMailThreadMessagesResponseAllOfDataInner dataItem) {
            this.data.add(dataItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetMailThreadMessagesResponseQueryParam {\n");

            sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
