package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.Deal;
import dti.crmsis.back.clients.openapi.v1.model.GetDealsResponseRelatedObjects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetAddedDealResponse  {

    /**
      * If the response is successful or not
     **/
    private Boolean success;
    private Deal data;
    private GetDealsResponseRelatedObjects relatedObjects;

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

    public GetAddedDealResponse success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
    * Get data
    * @return data
    **/
    @JsonProperty("data")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Deal getData() {
        return data;
    }

    /**
     * Set data
     **/
    public void setData(Deal data) {
        this.data = data;
    }

    public GetAddedDealResponse data(Deal data) {
        this.data = data;
        return this;
    }

    /**
    * Get relatedObjects
    * @return relatedObjects
    **/
    @JsonProperty("related_objects")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetDealsResponseRelatedObjects getRelatedObjects() {
        return relatedObjects;
    }

    /**
     * Set relatedObjects
     **/
    public void setRelatedObjects(GetDealsResponseRelatedObjects relatedObjects) {
        this.relatedObjects = relatedObjects;
    }

    public GetAddedDealResponse relatedObjects(GetDealsResponseRelatedObjects relatedObjects) {
        this.relatedObjects = relatedObjects;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAddedDealResponse {\n");

        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    relatedObjects: ").append(toIndentedString(relatedObjects)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetAddedDealResponse} object that
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

        GetAddedDealResponse model = (GetAddedDealResponse) obj;

        return java.util.Objects.equals(success, model.success) &&
        java.util.Objects.equals(data, model.data) &&
        java.util.Objects.equals(relatedObjects, model.relatedObjects);
    }

    /**
     * Returns a hash code for a {@code GetAddedDealResponse}.
     *
     * @return a hash code value for a {@code GetAddedDealResponse}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(success,
        data,
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
    public static class GetAddedDealResponseQueryParam  {

        @jakarta.ws.rs.QueryParam("success")
        private Boolean success;
        @jakarta.ws.rs.QueryParam("data")
        private Deal data;
        @jakarta.ws.rs.QueryParam("relatedObjects")
        private GetDealsResponseRelatedObjects relatedObjects;

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

        public GetAddedDealResponseQueryParam success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
        * Get data
        * @return data
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("data")
        public Deal getData() {
            return data;
        }

        /**
         * Set data
         **/
        public void setData(Deal data) {
            this.data = data;
        }

        public GetAddedDealResponseQueryParam data(Deal data) {
            this.data = data;
            return this;
        }

        /**
        * Get relatedObjects
        * @return relatedObjects
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("related_objects")
        public GetDealsResponseRelatedObjects getRelatedObjects() {
            return relatedObjects;
        }

        /**
         * Set relatedObjects
         **/
        public void setRelatedObjects(GetDealsResponseRelatedObjects relatedObjects) {
            this.relatedObjects = relatedObjects;
        }

        public GetAddedDealResponseQueryParam relatedObjects(GetDealsResponseRelatedObjects relatedObjects) {
            this.relatedObjects = relatedObjects;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetAddedDealResponseQueryParam {\n");

            sb.append("    success: ").append(toIndentedString(success)).append("\n");
            sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
