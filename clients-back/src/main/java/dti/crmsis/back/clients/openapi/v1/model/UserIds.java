package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserIds  {

    /**
      * If the response is successful or not
     **/
    private Boolean success;
    /**
      * The list of user IDs
     **/
    private List<Integer> data;

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

    public UserIds success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
    * The list of user IDs
    * @return data
    **/
    @JsonProperty("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getData() {
        return data;
    }

    /**
     * Set data
     **/
    public void setData(List<Integer> data) {
        this.data = data;
    }

    public UserIds data(List<Integer> data) {
        this.data = data;
        return this;
    }
    public UserIds addDataItem(Integer dataItem) {
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
        sb.append("class UserIds {\n");

        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code UserIds} object that
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

        UserIds model = (UserIds) obj;

        return java.util.Objects.equals(success, model.success) &&
        java.util.Objects.equals(data, model.data);
    }

    /**
     * Returns a hash code for a {@code UserIds}.
     *
     * @return a hash code value for a {@code UserIds}.
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class UserIdsQueryParam  {

        @jakarta.ws.rs.QueryParam("success")
        private Boolean success;
        @jakarta.ws.rs.QueryParam("data")
        private List<Integer> data = null;

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

        public UserIdsQueryParam success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
        * The list of user IDs
        * @return data
        **/
        @JsonProperty("data")
        public List<Integer> getData() {
            return data;
        }

        /**
         * Set data
         **/
        public void setData(List<Integer> data) {
            this.data = data;
        }

        public UserIdsQueryParam data(List<Integer> data) {
            this.data = data;
            return this;
        }
        public UserIdsQueryParam addDataItem(Integer dataItem) {
            this.data.add(dataItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class UserIdsQueryParam {\n");

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
