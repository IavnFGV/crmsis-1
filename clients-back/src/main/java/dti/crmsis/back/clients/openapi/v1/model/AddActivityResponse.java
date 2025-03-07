package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.Activity;
import dti.crmsis.back.clients.openapi.v1.model.AddActivityResponseAdditionalData;
import dti.crmsis.back.clients.openapi.v1.model.AddActivityResponseRelatedObjects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddActivityResponse  {

    private Boolean success;
    private Activity data;
    private AddActivityResponseAdditionalData additionalData;
    private AddActivityResponseRelatedObjects relatedObjects;

    /**
    * Get success
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

    public AddActivityResponse success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
    * Get data
    * @return data
    **/
    @JsonProperty("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Activity getData() {
        return data;
    }

    /**
     * Set data
     **/
    public void setData(Activity data) {
        this.data = data;
    }

    public AddActivityResponse data(Activity data) {
        this.data = data;
        return this;
    }

    /**
    * Get additionalData
    * @return additionalData
    **/
    @JsonProperty("additional_data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AddActivityResponseAdditionalData getAdditionalData() {
        return additionalData;
    }

    /**
     * Set additionalData
     **/
    public void setAdditionalData(AddActivityResponseAdditionalData additionalData) {
        this.additionalData = additionalData;
    }

    public AddActivityResponse additionalData(AddActivityResponseAdditionalData additionalData) {
        this.additionalData = additionalData;
        return this;
    }

    /**
    * Get relatedObjects
    * @return relatedObjects
    **/
    @JsonProperty("related_objects")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AddActivityResponseRelatedObjects getRelatedObjects() {
        return relatedObjects;
    }

    /**
     * Set relatedObjects
     **/
    public void setRelatedObjects(AddActivityResponseRelatedObjects relatedObjects) {
        this.relatedObjects = relatedObjects;
    }

    public AddActivityResponse relatedObjects(AddActivityResponseRelatedObjects relatedObjects) {
        this.relatedObjects = relatedObjects;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddActivityResponse {\n");

        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
        sb.append("    relatedObjects: ").append(toIndentedString(relatedObjects)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddActivityResponse} object that
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

        AddActivityResponse model = (AddActivityResponse) obj;

        return java.util.Objects.equals(success, model.success) &&
        java.util.Objects.equals(data, model.data) &&
        java.util.Objects.equals(additionalData, model.additionalData) &&
        java.util.Objects.equals(relatedObjects, model.relatedObjects);
    }

    /**
     * Returns a hash code for a {@code AddActivityResponse}.
     *
     * @return a hash code value for a {@code AddActivityResponse}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(success,
        data,
        additionalData,
        relatedObjects);
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
    public static class AddActivityResponseQueryParam  {

        @jakarta.ws.rs.QueryParam("success")
        private Boolean success;
        @jakarta.ws.rs.QueryParam("data")
        private Activity data;
        @jakarta.ws.rs.QueryParam("additionalData")
        private AddActivityResponseAdditionalData additionalData;
        @jakarta.ws.rs.QueryParam("relatedObjects")
        private AddActivityResponseRelatedObjects relatedObjects;

        /**
        * Get success
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

        public AddActivityResponseQueryParam success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
        * Get data
        * @return data
        **/
        @JsonProperty("data")
        public Activity getData() {
            return data;
        }

        /**
         * Set data
         **/
        public void setData(Activity data) {
            this.data = data;
        }

        public AddActivityResponseQueryParam data(Activity data) {
            this.data = data;
            return this;
        }

        /**
        * Get additionalData
        * @return additionalData
        **/
        @JsonProperty("additional_data")
        public AddActivityResponseAdditionalData getAdditionalData() {
            return additionalData;
        }

        /**
         * Set additionalData
         **/
        public void setAdditionalData(AddActivityResponseAdditionalData additionalData) {
            this.additionalData = additionalData;
        }

        public AddActivityResponseQueryParam additionalData(AddActivityResponseAdditionalData additionalData) {
            this.additionalData = additionalData;
            return this;
        }

        /**
        * Get relatedObjects
        * @return relatedObjects
        **/
        @JsonProperty("related_objects")
        public AddActivityResponseRelatedObjects getRelatedObjects() {
            return relatedObjects;
        }

        /**
         * Set relatedObjects
         **/
        public void setRelatedObjects(AddActivityResponseRelatedObjects relatedObjects) {
            this.relatedObjects = relatedObjects;
        }

        public AddActivityResponseQueryParam relatedObjects(AddActivityResponseRelatedObjects relatedObjects) {
            this.relatedObjects = relatedObjects;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddActivityResponseQueryParam {\n");

            sb.append("    success: ").append(toIndentedString(success)).append("\n");
            sb.append("    data: ").append(toIndentedString(data)).append("\n");
            sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
            sb.append("    relatedObjects: ").append(toIndentedString(relatedObjects)).append("\n");
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
