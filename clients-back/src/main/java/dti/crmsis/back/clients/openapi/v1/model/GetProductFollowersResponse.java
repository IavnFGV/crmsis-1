package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetFieldsResponseAllOfAdditionalData;
import dti.crmsis.back.clients.openapi.v1.model.GetProductFollowersResponseAllOfDataInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetProductFollowersResponse  {

    /**
      * If the response is successful or not
     **/
    private Boolean success;
    /**
      * The list of followers
     **/
    private List<GetProductFollowersResponseAllOfDataInner> data;
    private GetFieldsResponseAllOfAdditionalData additionalData;

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

    public GetProductFollowersResponse success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
    * The list of followers
    * @return data
    **/
    @JsonProperty("data")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<GetProductFollowersResponseAllOfDataInner> getData() {
        return data;
    }

    /**
     * Set data
     **/
    public void setData(List<GetProductFollowersResponseAllOfDataInner> data) {
        this.data = data;
    }

    public GetProductFollowersResponse data(List<GetProductFollowersResponseAllOfDataInner> data) {
        this.data = data;
        return this;
    }
    public GetProductFollowersResponse addDataItem(GetProductFollowersResponseAllOfDataInner dataItem) {
        if (this.data == null){
            data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
    * Get additionalData
    * @return additionalData
    **/
    @JsonProperty("additional_data")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetFieldsResponseAllOfAdditionalData getAdditionalData() {
        return additionalData;
    }

    /**
     * Set additionalData
     **/
    public void setAdditionalData(GetFieldsResponseAllOfAdditionalData additionalData) {
        this.additionalData = additionalData;
    }

    public GetProductFollowersResponse additionalData(GetFieldsResponseAllOfAdditionalData additionalData) {
        this.additionalData = additionalData;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetProductFollowersResponse {\n");

        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetProductFollowersResponse} object that
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

        GetProductFollowersResponse model = (GetProductFollowersResponse) obj;

        return java.util.Objects.equals(success, model.success) &&
        java.util.Objects.equals(data, model.data) &&
        java.util.Objects.equals(additionalData, model.additionalData);
    }

    /**
     * Returns a hash code for a {@code GetProductFollowersResponse}.
     *
     * @return a hash code value for a {@code GetProductFollowersResponse}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(success,
        data,
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
    public static class GetProductFollowersResponseQueryParam  {

        @jakarta.ws.rs.QueryParam("success")
        private Boolean success;
        @jakarta.ws.rs.QueryParam("data")
        private List<GetProductFollowersResponseAllOfDataInner> data = null;
        @jakarta.ws.rs.QueryParam("additionalData")
        private GetFieldsResponseAllOfAdditionalData additionalData;

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

        public GetProductFollowersResponseQueryParam success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
        * The list of followers
        * @return data
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("data")
        public List<GetProductFollowersResponseAllOfDataInner> getData() {
            return data;
        }

        /**
         * Set data
         **/
        public void setData(List<GetProductFollowersResponseAllOfDataInner> data) {
            this.data = data;
        }

        public GetProductFollowersResponseQueryParam data(List<GetProductFollowersResponseAllOfDataInner> data) {
            this.data = data;
            return this;
        }
        public GetProductFollowersResponseQueryParam addDataItem(GetProductFollowersResponseAllOfDataInner dataItem) {
            this.data.add(dataItem);
            return this;
        }

        /**
        * Get additionalData
        * @return additionalData
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("additional_data")
        public GetFieldsResponseAllOfAdditionalData getAdditionalData() {
            return additionalData;
        }

        /**
         * Set additionalData
         **/
        public void setAdditionalData(GetFieldsResponseAllOfAdditionalData additionalData) {
            this.additionalData = additionalData;
        }

        public GetProductFollowersResponseQueryParam additionalData(GetFieldsResponseAllOfAdditionalData additionalData) {
            this.additionalData = additionalData;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetProductFollowersResponseQueryParam {\n");

            sb.append("    success: ").append(toIndentedString(success)).append("\n");
            sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
