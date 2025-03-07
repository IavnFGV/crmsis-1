package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.Comment;
import dti.crmsis.back.clients.openapi.v1.model.GetNotesResponseAdditionalData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetCommentsResponse  {

    /**
      * If the request was successful or not
     **/
    private Boolean success;
    /**
      * The array of comments
     **/
    private List<Comment> data;
    private GetNotesResponseAdditionalData additionalData;

    /**
    * If the request was successful or not
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

    public GetCommentsResponse success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
    * The array of comments
    * @return data
    **/
    @JsonProperty("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Comment> getData() {
        return data;
    }

    /**
     * Set data
     **/
    public void setData(List<Comment> data) {
        this.data = data;
    }

    public GetCommentsResponse data(List<Comment> data) {
        this.data = data;
        return this;
    }
    public GetCommentsResponse addDataItem(Comment dataItem) {
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GetNotesResponseAdditionalData getAdditionalData() {
        return additionalData;
    }

    /**
     * Set additionalData
     **/
    public void setAdditionalData(GetNotesResponseAdditionalData additionalData) {
        this.additionalData = additionalData;
    }

    public GetCommentsResponse additionalData(GetNotesResponseAdditionalData additionalData) {
        this.additionalData = additionalData;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetCommentsResponse {\n");

        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetCommentsResponse} object that
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

        GetCommentsResponse model = (GetCommentsResponse) obj;

        return java.util.Objects.equals(success, model.success) &&
        java.util.Objects.equals(data, model.data) &&
        java.util.Objects.equals(additionalData, model.additionalData);
    }

    /**
     * Returns a hash code for a {@code GetCommentsResponse}.
     *
     * @return a hash code value for a {@code GetCommentsResponse}.
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetCommentsResponseQueryParam  {

        @jakarta.ws.rs.QueryParam("success")
        private Boolean success;
        @jakarta.ws.rs.QueryParam("data")
        private List<Comment> data = null;
        @jakarta.ws.rs.QueryParam("additionalData")
        private GetNotesResponseAdditionalData additionalData;

        /**
        * If the request was successful or not
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

        public GetCommentsResponseQueryParam success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
        * The array of comments
        * @return data
        **/
        @JsonProperty("data")
        public List<Comment> getData() {
            return data;
        }

        /**
         * Set data
         **/
        public void setData(List<Comment> data) {
            this.data = data;
        }

        public GetCommentsResponseQueryParam data(List<Comment> data) {
            this.data = data;
            return this;
        }
        public GetCommentsResponseQueryParam addDataItem(Comment dataItem) {
            this.data.add(dataItem);
            return this;
        }

        /**
        * Get additionalData
        * @return additionalData
        **/
        @JsonProperty("additional_data")
        public GetNotesResponseAdditionalData getAdditionalData() {
            return additionalData;
        }

        /**
         * Set additionalData
         **/
        public void setAdditionalData(GetNotesResponseAdditionalData additionalData) {
            this.additionalData = additionalData;
        }

        public GetCommentsResponseQueryParam additionalData(GetNotesResponseAdditionalData additionalData) {
            this.additionalData = additionalData;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetCommentsResponseQueryParam {\n");

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
