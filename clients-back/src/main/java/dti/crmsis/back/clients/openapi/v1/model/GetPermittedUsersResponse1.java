package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetPermittedUsersResponse1  {

    /**
      * If the response is successful or not
     **/
    private Boolean success;
    /**
      * The list of permitted user IDs
     **/
    private List<BigDecimal> data;

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

    public GetPermittedUsersResponse1 success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
    * The list of permitted user IDs
    * @return data
    **/
    @JsonProperty("data")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<BigDecimal> getData() {
        return data;
    }

    /**
     * Set data
     **/
    public void setData(List<BigDecimal> data) {
        this.data = data;
    }

    public GetPermittedUsersResponse1 data(List<BigDecimal> data) {
        this.data = data;
        return this;
    }
    public GetPermittedUsersResponse1 addDataItem(BigDecimal dataItem) {
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
        sb.append("class GetPermittedUsersResponse1 {\n");

        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetPermittedUsersResponse1} object that
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

        GetPermittedUsersResponse1 model = (GetPermittedUsersResponse1) obj;

        return java.util.Objects.equals(success, model.success) &&
        java.util.Objects.equals(data, model.data);
    }

    /**
     * Returns a hash code for a {@code GetPermittedUsersResponse1}.
     *
     * @return a hash code value for a {@code GetPermittedUsersResponse1}.
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
    public static class GetPermittedUsersResponse1QueryParam  {

        @jakarta.ws.rs.QueryParam("success")
        private Boolean success;
        @jakarta.ws.rs.QueryParam("data")
        private List<BigDecimal> data = null;

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

        public GetPermittedUsersResponse1QueryParam success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
        * The list of permitted user IDs
        * @return data
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("data")
        public List<BigDecimal> getData() {
            return data;
        }

        /**
         * Set data
         **/
        public void setData(List<BigDecimal> data) {
            this.data = data;
        }

        public GetPermittedUsersResponse1QueryParam data(List<BigDecimal> data) {
            this.data = data;
            return this;
        }
        public GetPermittedUsersResponse1QueryParam addDataItem(BigDecimal dataItem) {
            this.data.add(dataItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetPermittedUsersResponse1QueryParam {\n");

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
