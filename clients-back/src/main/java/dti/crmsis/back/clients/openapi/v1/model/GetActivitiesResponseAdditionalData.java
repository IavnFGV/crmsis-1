package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetActivitiesResponseAdditionalDataPagination;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetActivitiesResponseAdditionalData  {

    private GetActivitiesResponseAdditionalDataPagination pagination;

    /**
    * Get pagination
    * @return pagination
    **/
    @JsonProperty("pagination")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetActivitiesResponseAdditionalDataPagination getPagination() {
        return pagination;
    }

    /**
     * Set pagination
     **/
    public void setPagination(GetActivitiesResponseAdditionalDataPagination pagination) {
        this.pagination = pagination;
    }

    public GetActivitiesResponseAdditionalData pagination(GetActivitiesResponseAdditionalDataPagination pagination) {
        this.pagination = pagination;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetActivitiesResponseAdditionalData {\n");

        sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetActivitiesResponseAdditionalData} object that
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

        GetActivitiesResponseAdditionalData model = (GetActivitiesResponseAdditionalData) obj;

        return java.util.Objects.equals(pagination, model.pagination);
    }

    /**
     * Returns a hash code for a {@code GetActivitiesResponseAdditionalData}.
     *
     * @return a hash code value for a {@code GetActivitiesResponseAdditionalData}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(pagination);
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
    public static class GetActivitiesResponseAdditionalDataQueryParam  {

        @jakarta.ws.rs.QueryParam("pagination")
        private GetActivitiesResponseAdditionalDataPagination pagination;

        /**
        * Get pagination
        * @return pagination
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("pagination")
        public GetActivitiesResponseAdditionalDataPagination getPagination() {
            return pagination;
        }

        /**
         * Set pagination
         **/
        public void setPagination(GetActivitiesResponseAdditionalDataPagination pagination) {
            this.pagination = pagination;
        }

        public GetActivitiesResponseAdditionalDataQueryParam pagination(GetActivitiesResponseAdditionalDataPagination pagination) {
            this.pagination = pagination;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetActivitiesResponseAdditionalDataQueryParam {\n");

            sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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
