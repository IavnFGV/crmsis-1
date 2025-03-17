package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The pagination details in the role list
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetRolesResponseAllOfAdditionalDataPagination  {

    /**
      * Pagination start
     **/
    private Integer start;
    /**
      * Items shown per page
     **/
    private Integer limit;
    /**
      * Whether there are more list items in the collection than displayed
     **/
    private Boolean moreItemsInCollection;

    /**
    * Pagination start
    * @return start
    **/
    @JsonProperty("start")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getStart() {
        return start;
    }

    /**
     * Set start
     **/
    public void setStart(Integer start) {
        this.start = start;
    }

    public GetRolesResponseAllOfAdditionalDataPagination start(Integer start) {
        this.start = start;
        return this;
    }

    /**
    * Items shown per page
    * @return limit
    **/
    @JsonProperty("limit")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getLimit() {
        return limit;
    }

    /**
     * Set limit
     **/
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public GetRolesResponseAllOfAdditionalDataPagination limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
    * Whether there are more list items in the collection than displayed
    * @return moreItemsInCollection
    **/
    @JsonProperty("more_items_in_collection")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getMoreItemsInCollection() {
        return moreItemsInCollection;
    }

    /**
     * Set moreItemsInCollection
     **/
    public void setMoreItemsInCollection(Boolean moreItemsInCollection) {
        this.moreItemsInCollection = moreItemsInCollection;
    }

    public GetRolesResponseAllOfAdditionalDataPagination moreItemsInCollection(Boolean moreItemsInCollection) {
        this.moreItemsInCollection = moreItemsInCollection;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetRolesResponseAllOfAdditionalDataPagination {\n");

        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    moreItemsInCollection: ").append(toIndentedString(moreItemsInCollection)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetRolesResponseAllOfAdditionalDataPagination} object that
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

        GetRolesResponseAllOfAdditionalDataPagination model = (GetRolesResponseAllOfAdditionalDataPagination) obj;

        return java.util.Objects.equals(start, model.start) &&
        java.util.Objects.equals(limit, model.limit) &&
        java.util.Objects.equals(moreItemsInCollection, model.moreItemsInCollection);
    }

    /**
     * Returns a hash code for a {@code GetRolesResponseAllOfAdditionalDataPagination}.
     *
     * @return a hash code value for a {@code GetRolesResponseAllOfAdditionalDataPagination}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(start,
        limit,
        moreItemsInCollection);
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
      * The pagination details in the role list
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetRolesResponseAllOfAdditionalDataPaginationQueryParam  {

        /**
          * The pagination details in the role list
         **/
        @jakarta.ws.rs.QueryParam("start")
        private Integer start;
        /**
          * The pagination details in the role list
         **/
        @jakarta.ws.rs.QueryParam("limit")
        private Integer limit;
        /**
          * The pagination details in the role list
         **/
        @jakarta.ws.rs.QueryParam("moreItemsInCollection")
        private Boolean moreItemsInCollection;

        /**
        * Pagination start
        * @return start
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("start")
        public Integer getStart() {
            return start;
        }

        /**
         * Set start
         **/
        public void setStart(Integer start) {
            this.start = start;
        }

        public GetRolesResponseAllOfAdditionalDataPaginationQueryParam start(Integer start) {
            this.start = start;
            return this;
        }

        /**
        * Items shown per page
        * @return limit
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("limit")
        public Integer getLimit() {
            return limit;
        }

        /**
         * Set limit
         **/
        public void setLimit(Integer limit) {
            this.limit = limit;
        }

        public GetRolesResponseAllOfAdditionalDataPaginationQueryParam limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
        * Whether there are more list items in the collection than displayed
        * @return moreItemsInCollection
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("more_items_in_collection")
        public Boolean getMoreItemsInCollection() {
            return moreItemsInCollection;
        }

        /**
         * Set moreItemsInCollection
         **/
        public void setMoreItemsInCollection(Boolean moreItemsInCollection) {
            this.moreItemsInCollection = moreItemsInCollection;
        }

        public GetRolesResponseAllOfAdditionalDataPaginationQueryParam moreItemsInCollection(Boolean moreItemsInCollection) {
            this.moreItemsInCollection = moreItemsInCollection;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetRolesResponseAllOfAdditionalDataPaginationQueryParam {\n");

            sb.append("    start: ").append(toIndentedString(start)).append("\n");
            sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
            sb.append("    moreItemsInCollection: ").append(toIndentedString(moreItemsInCollection)).append("\n");
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
