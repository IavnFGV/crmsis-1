package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetActivitiesResponseAdditionalData;
import dti.crmsis.back.clients.openapi.v1.model.GetItemSearchFieldResponseAllOfDataInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetItemSearchFieldResponse  {

    /**
      * If the response is successful or not
     **/
    private Boolean success;
    /**
      * The array of results
     **/
    private List<GetItemSearchFieldResponseAllOfDataInner> data;
    private GetActivitiesResponseAdditionalData additionalData;

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

    public GetItemSearchFieldResponse success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
    * The array of results
    * @return data
    **/
    @JsonProperty("data")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<GetItemSearchFieldResponseAllOfDataInner> getData() {
        return data;
    }

    /**
     * Set data
     **/
    public void setData(List<GetItemSearchFieldResponseAllOfDataInner> data) {
        this.data = data;
    }

    public GetItemSearchFieldResponse data(List<GetItemSearchFieldResponseAllOfDataInner> data) {
        this.data = data;
        return this;
    }
    public GetItemSearchFieldResponse addDataItem(GetItemSearchFieldResponseAllOfDataInner dataItem) {
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
    public GetActivitiesResponseAdditionalData getAdditionalData() {
        return additionalData;
    }

    /**
     * Set additionalData
     **/
    public void setAdditionalData(GetActivitiesResponseAdditionalData additionalData) {
        this.additionalData = additionalData;
    }

    public GetItemSearchFieldResponse additionalData(GetActivitiesResponseAdditionalData additionalData) {
        this.additionalData = additionalData;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetItemSearchFieldResponse {\n");

        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetItemSearchFieldResponse} object that
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

        GetItemSearchFieldResponse model = (GetItemSearchFieldResponse) obj;

        return java.util.Objects.equals(success, model.success) &&
        java.util.Objects.equals(data, model.data) &&
        java.util.Objects.equals(additionalData, model.additionalData);
    }

    /**
     * Returns a hash code for a {@code GetItemSearchFieldResponse}.
     *
     * @return a hash code value for a {@code GetItemSearchFieldResponse}.
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
    public static class GetItemSearchFieldResponseQueryParam  {

        @jakarta.ws.rs.QueryParam("success")
        private Boolean success;
        @jakarta.ws.rs.QueryParam("data")
        private List<GetItemSearchFieldResponseAllOfDataInner> data = null;
        @jakarta.ws.rs.QueryParam("additionalData")
        private GetActivitiesResponseAdditionalData additionalData;

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

        public GetItemSearchFieldResponseQueryParam success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
        * The array of results
        * @return data
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("data")
        public List<GetItemSearchFieldResponseAllOfDataInner> getData() {
            return data;
        }

        /**
         * Set data
         **/
        public void setData(List<GetItemSearchFieldResponseAllOfDataInner> data) {
            this.data = data;
        }

        public GetItemSearchFieldResponseQueryParam data(List<GetItemSearchFieldResponseAllOfDataInner> data) {
            this.data = data;
            return this;
        }
        public GetItemSearchFieldResponseQueryParam addDataItem(GetItemSearchFieldResponseAllOfDataInner dataItem) {
            this.data.add(dataItem);
            return this;
        }

        /**
        * Get additionalData
        * @return additionalData
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("additional_data")
        public GetActivitiesResponseAdditionalData getAdditionalData() {
            return additionalData;
        }

        /**
         * Set additionalData
         **/
        public void setAdditionalData(GetActivitiesResponseAdditionalData additionalData) {
            this.additionalData = additionalData;
        }

        public GetItemSearchFieldResponseQueryParam additionalData(GetActivitiesResponseAdditionalData additionalData) {
            this.additionalData = additionalData;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetItemSearchFieldResponseQueryParam {\n");

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
