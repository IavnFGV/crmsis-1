package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetActivitiesResponseAdditionalData;
import dti.crmsis.back.clients.openapi.v1.model.GetOrganizationsResponseAllOfRelatedObjects;
import dti.crmsis.back.clients.openapi.v1.model.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetPersonsResponse1  {

    /**
      * If the response is successful or not
     **/
    private Boolean success;
    /**
      * The array of persons
     **/
    private List<Person> data;
    private GetActivitiesResponseAdditionalData additionalData;
    private GetOrganizationsResponseAllOfRelatedObjects relatedObjects;

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

    public GetPersonsResponse1 success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
    * The array of persons
    * @return data
    **/
    @JsonProperty("data")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Person> getData() {
        return data;
    }

    /**
     * Set data
     **/
    public void setData(List<Person> data) {
        this.data = data;
    }

    public GetPersonsResponse1 data(List<Person> data) {
        this.data = data;
        return this;
    }
    public GetPersonsResponse1 addDataItem(Person dataItem) {
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

    public GetPersonsResponse1 additionalData(GetActivitiesResponseAdditionalData additionalData) {
        this.additionalData = additionalData;
        return this;
    }

    /**
    * Get relatedObjects
    * @return relatedObjects
    **/
    @JsonProperty("related_objects")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetOrganizationsResponseAllOfRelatedObjects getRelatedObjects() {
        return relatedObjects;
    }

    /**
     * Set relatedObjects
     **/
    public void setRelatedObjects(GetOrganizationsResponseAllOfRelatedObjects relatedObjects) {
        this.relatedObjects = relatedObjects;
    }

    public GetPersonsResponse1 relatedObjects(GetOrganizationsResponseAllOfRelatedObjects relatedObjects) {
        this.relatedObjects = relatedObjects;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPersonsResponse1 {\n");

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
     * {@code null} and is a {@code GetPersonsResponse1} object that
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

        GetPersonsResponse1 model = (GetPersonsResponse1) obj;

        return java.util.Objects.equals(success, model.success) &&
        java.util.Objects.equals(data, model.data) &&
        java.util.Objects.equals(additionalData, model.additionalData) &&
        java.util.Objects.equals(relatedObjects, model.relatedObjects);
    }

    /**
     * Returns a hash code for a {@code GetPersonsResponse1}.
     *
     * @return a hash code value for a {@code GetPersonsResponse1}.
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

    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetPersonsResponse1QueryParam  {

        @jakarta.ws.rs.QueryParam("success")
        private Boolean success;
        @jakarta.ws.rs.QueryParam("data")
        private List<Person> data = null;
        @jakarta.ws.rs.QueryParam("additionalData")
        private GetActivitiesResponseAdditionalData additionalData;
        @jakarta.ws.rs.QueryParam("relatedObjects")
        private GetOrganizationsResponseAllOfRelatedObjects relatedObjects;

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

        public GetPersonsResponse1QueryParam success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
        * The array of persons
        * @return data
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("data")
        public List<Person> getData() {
            return data;
        }

        /**
         * Set data
         **/
        public void setData(List<Person> data) {
            this.data = data;
        }

        public GetPersonsResponse1QueryParam data(List<Person> data) {
            this.data = data;
            return this;
        }
        public GetPersonsResponse1QueryParam addDataItem(Person dataItem) {
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

        public GetPersonsResponse1QueryParam additionalData(GetActivitiesResponseAdditionalData additionalData) {
            this.additionalData = additionalData;
            return this;
        }

        /**
        * Get relatedObjects
        * @return relatedObjects
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("related_objects")
        public GetOrganizationsResponseAllOfRelatedObjects getRelatedObjects() {
            return relatedObjects;
        }

        /**
         * Set relatedObjects
         **/
        public void setRelatedObjects(GetOrganizationsResponseAllOfRelatedObjects relatedObjects) {
            this.relatedObjects = relatedObjects;
        }

        public GetPersonsResponse1QueryParam relatedObjects(GetOrganizationsResponseAllOfRelatedObjects relatedObjects) {
            this.relatedObjects = relatedObjects;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetPersonsResponse1QueryParam {\n");

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
