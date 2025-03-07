package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetNotesResponseAdditionalData;
import dti.crmsis.back.clients.openapi.v1.model.Note;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetNotesResponse  {

    /**
      * If the request was successful or not
     **/
    private Boolean success;
    /**
      * The array of notes
     **/
    private List<Note> data;
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

    public GetNotesResponse success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
    * The array of notes
    * @return data
    **/
    @JsonProperty("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Note> getData() {
        return data;
    }

    /**
     * Set data
     **/
    public void setData(List<Note> data) {
        this.data = data;
    }

    public GetNotesResponse data(List<Note> data) {
        this.data = data;
        return this;
    }
    public GetNotesResponse addDataItem(Note dataItem) {
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

    public GetNotesResponse additionalData(GetNotesResponseAdditionalData additionalData) {
        this.additionalData = additionalData;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetNotesResponse {\n");

        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetNotesResponse} object that
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

        GetNotesResponse model = (GetNotesResponse) obj;

        return java.util.Objects.equals(success, model.success) &&
        java.util.Objects.equals(data, model.data) &&
        java.util.Objects.equals(additionalData, model.additionalData);
    }

    /**
     * Returns a hash code for a {@code GetNotesResponse}.
     *
     * @return a hash code value for a {@code GetNotesResponse}.
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
    public static class GetNotesResponseQueryParam  {

        @jakarta.ws.rs.QueryParam("success")
        private Boolean success;
        @jakarta.ws.rs.QueryParam("data")
        private List<Note> data = null;
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

        public GetNotesResponseQueryParam success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
        * The array of notes
        * @return data
        **/
        @JsonProperty("data")
        public List<Note> getData() {
            return data;
        }

        /**
         * Set data
         **/
        public void setData(List<Note> data) {
            this.data = data;
        }

        public GetNotesResponseQueryParam data(List<Note> data) {
            this.data = data;
            return this;
        }
        public GetNotesResponseQueryParam addDataItem(Note dataItem) {
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

        public GetNotesResponseQueryParam additionalData(GetNotesResponseAdditionalData additionalData) {
            this.additionalData = additionalData;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetNotesResponseQueryParam {\n");

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
