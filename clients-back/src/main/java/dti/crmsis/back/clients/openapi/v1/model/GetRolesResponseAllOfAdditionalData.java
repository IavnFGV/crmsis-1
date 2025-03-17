package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetRolesResponseAllOfAdditionalDataPagination;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The additional data in the role list
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetRolesResponseAllOfAdditionalData  {

    private GetRolesResponseAllOfAdditionalDataPagination pagination;

    /**
    * Get pagination
    * @return pagination
    **/
    @JsonProperty("pagination")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetRolesResponseAllOfAdditionalDataPagination getPagination() {
        return pagination;
    }

    /**
     * Set pagination
     **/
    public void setPagination(GetRolesResponseAllOfAdditionalDataPagination pagination) {
        this.pagination = pagination;
    }

    public GetRolesResponseAllOfAdditionalData pagination(GetRolesResponseAllOfAdditionalDataPagination pagination) {
        this.pagination = pagination;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetRolesResponseAllOfAdditionalData {\n");

        sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetRolesResponseAllOfAdditionalData} object that
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

        GetRolesResponseAllOfAdditionalData model = (GetRolesResponseAllOfAdditionalData) obj;

        return java.util.Objects.equals(pagination, model.pagination);
    }

    /**
     * Returns a hash code for a {@code GetRolesResponseAllOfAdditionalData}.
     *
     * @return a hash code value for a {@code GetRolesResponseAllOfAdditionalData}.
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

    /**
      * The additional data in the role list
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetRolesResponseAllOfAdditionalDataQueryParam  {

        /**
          * The additional data in the role list
         **/
        @jakarta.ws.rs.QueryParam("pagination")
        private GetRolesResponseAllOfAdditionalDataPagination pagination;

        /**
        * Get pagination
        * @return pagination
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("pagination")
        public GetRolesResponseAllOfAdditionalDataPagination getPagination() {
            return pagination;
        }

        /**
         * Set pagination
         **/
        public void setPagination(GetRolesResponseAllOfAdditionalDataPagination pagination) {
            this.pagination = pagination;
        }

        public GetRolesResponseAllOfAdditionalDataQueryParam pagination(GetRolesResponseAllOfAdditionalDataPagination pagination) {
            this.pagination = pagination;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetRolesResponseAllOfAdditionalDataQueryParam {\n");

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
