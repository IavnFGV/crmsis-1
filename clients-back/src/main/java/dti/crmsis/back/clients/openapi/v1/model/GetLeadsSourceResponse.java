package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.LeadSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetLeadsSourceResponse  {

    private Boolean success;
    private List<LeadSource> data;

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

    public GetLeadsSourceResponse success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
    * Get data
    * @return data
    **/
    @JsonProperty("data")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<LeadSource> getData() {
        return data;
    }

    /**
     * Set data
     **/
    public void setData(List<LeadSource> data) {
        this.data = data;
    }

    public GetLeadsSourceResponse data(List<LeadSource> data) {
        this.data = data;
        return this;
    }
    public GetLeadsSourceResponse addDataItem(LeadSource dataItem) {
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
        sb.append("class GetLeadsSourceResponse {\n");

        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetLeadsSourceResponse} object that
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

        GetLeadsSourceResponse model = (GetLeadsSourceResponse) obj;

        return java.util.Objects.equals(success, model.success) &&
        java.util.Objects.equals(data, model.data);
    }

    /**
     * Returns a hash code for a {@code GetLeadsSourceResponse}.
     *
     * @return a hash code value for a {@code GetLeadsSourceResponse}.
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
    public static class GetLeadsSourceResponseQueryParam  {

        @jakarta.ws.rs.QueryParam("success")
        private Boolean success;
        @jakarta.ws.rs.QueryParam("data")
        private List<LeadSource> data = null;

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

        public GetLeadsSourceResponseQueryParam success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
        * Get data
        * @return data
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("data")
        public List<LeadSource> getData() {
            return data;
        }

        /**
         * Set data
         **/
        public void setData(List<LeadSource> data) {
            this.data = data;
        }

        public GetLeadsSourceResponseQueryParam data(List<LeadSource> data) {
            this.data = data;
            return this;
        }
        public GetLeadsSourceResponseQueryParam addDataItem(LeadSource dataItem) {
            this.data.add(dataItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetLeadsSourceResponseQueryParam {\n");

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
