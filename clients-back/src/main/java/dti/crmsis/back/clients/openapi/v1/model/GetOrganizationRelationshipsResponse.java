package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetFieldsResponseAllOfAdditionalData;
import dti.crmsis.back.clients.openapi.v1.model.GetOrganizationRelationshipsResponseAllOfRelatedObjects;
import dti.crmsis.back.clients.openapi.v1.model.OrganizationRelationshipDetails;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetOrganizationRelationshipsResponse  {

    /**
      * If the response is successful or not
     **/
    private Boolean success;
    /**
      * The array of organization relationships
     **/
    private List<OrganizationRelationshipDetails> data;
    private GetFieldsResponseAllOfAdditionalData additionalData;
    private GetOrganizationRelationshipsResponseAllOfRelatedObjects relatedObjects;

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

    public GetOrganizationRelationshipsResponse success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
    * The array of organization relationships
    * @return data
    **/
    @JsonProperty("data")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<OrganizationRelationshipDetails> getData() {
        return data;
    }

    /**
     * Set data
     **/
    public void setData(List<OrganizationRelationshipDetails> data) {
        this.data = data;
    }

    public GetOrganizationRelationshipsResponse data(List<OrganizationRelationshipDetails> data) {
        this.data = data;
        return this;
    }
    public GetOrganizationRelationshipsResponse addDataItem(OrganizationRelationshipDetails dataItem) {
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

    public GetOrganizationRelationshipsResponse additionalData(GetFieldsResponseAllOfAdditionalData additionalData) {
        this.additionalData = additionalData;
        return this;
    }

    /**
    * Get relatedObjects
    * @return relatedObjects
    **/
    @JsonProperty("related_objects")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetOrganizationRelationshipsResponseAllOfRelatedObjects getRelatedObjects() {
        return relatedObjects;
    }

    /**
     * Set relatedObjects
     **/
    public void setRelatedObjects(GetOrganizationRelationshipsResponseAllOfRelatedObjects relatedObjects) {
        this.relatedObjects = relatedObjects;
    }

    public GetOrganizationRelationshipsResponse relatedObjects(GetOrganizationRelationshipsResponseAllOfRelatedObjects relatedObjects) {
        this.relatedObjects = relatedObjects;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOrganizationRelationshipsResponse {\n");

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
     * {@code null} and is a {@code GetOrganizationRelationshipsResponse} object that
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

        GetOrganizationRelationshipsResponse model = (GetOrganizationRelationshipsResponse) obj;

        return java.util.Objects.equals(success, model.success) &&
        java.util.Objects.equals(data, model.data) &&
        java.util.Objects.equals(additionalData, model.additionalData) &&
        java.util.Objects.equals(relatedObjects, model.relatedObjects);
    }

    /**
     * Returns a hash code for a {@code GetOrganizationRelationshipsResponse}.
     *
     * @return a hash code value for a {@code GetOrganizationRelationshipsResponse}.
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
    public static class GetOrganizationRelationshipsResponseQueryParam  {

        @jakarta.ws.rs.QueryParam("success")
        private Boolean success;
        @jakarta.ws.rs.QueryParam("data")
        private List<OrganizationRelationshipDetails> data = null;
        @jakarta.ws.rs.QueryParam("additionalData")
        private GetFieldsResponseAllOfAdditionalData additionalData;
        @jakarta.ws.rs.QueryParam("relatedObjects")
        private GetOrganizationRelationshipsResponseAllOfRelatedObjects relatedObjects;

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

        public GetOrganizationRelationshipsResponseQueryParam success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
        * The array of organization relationships
        * @return data
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("data")
        public List<OrganizationRelationshipDetails> getData() {
            return data;
        }

        /**
         * Set data
         **/
        public void setData(List<OrganizationRelationshipDetails> data) {
            this.data = data;
        }

        public GetOrganizationRelationshipsResponseQueryParam data(List<OrganizationRelationshipDetails> data) {
            this.data = data;
            return this;
        }
        public GetOrganizationRelationshipsResponseQueryParam addDataItem(OrganizationRelationshipDetails dataItem) {
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

        public GetOrganizationRelationshipsResponseQueryParam additionalData(GetFieldsResponseAllOfAdditionalData additionalData) {
            this.additionalData = additionalData;
            return this;
        }

        /**
        * Get relatedObjects
        * @return relatedObjects
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("related_objects")
        public GetOrganizationRelationshipsResponseAllOfRelatedObjects getRelatedObjects() {
            return relatedObjects;
        }

        /**
         * Set relatedObjects
         **/
        public void setRelatedObjects(GetOrganizationRelationshipsResponseAllOfRelatedObjects relatedObjects) {
            this.relatedObjects = relatedObjects;
        }

        public GetOrganizationRelationshipsResponseQueryParam relatedObjects(GetOrganizationRelationshipsResponseAllOfRelatedObjects relatedObjects) {
            this.relatedObjects = relatedObjects;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetOrganizationRelationshipsResponseQueryParam {\n");

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
