package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The pagination details of the list
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetNotesResponseAdditionalDataPagination  {

    /**
      * Pagination start
     **/
    private Integer start;
    /**
      * Items shown per page
     **/
    private Integer limit;
    /**
      * If there are more list items in the collection than displayed or not
     **/
    private Boolean moreItemsInCollection;
    /**
      * Next pagination start
     **/
    private Integer nextStart;

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

    public GetNotesResponseAdditionalDataPagination start(Integer start) {
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

    public GetNotesResponseAdditionalDataPagination limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
    * If there are more list items in the collection than displayed or not
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

    public GetNotesResponseAdditionalDataPagination moreItemsInCollection(Boolean moreItemsInCollection) {
        this.moreItemsInCollection = moreItemsInCollection;
        return this;
    }

    /**
    * Next pagination start
    * @return nextStart
    **/
    @JsonProperty("next_start")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getNextStart() {
        return nextStart;
    }

    /**
     * Set nextStart
     **/
    public void setNextStart(Integer nextStart) {
        this.nextStart = nextStart;
    }

    public GetNotesResponseAdditionalDataPagination nextStart(Integer nextStart) {
        this.nextStart = nextStart;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetNotesResponseAdditionalDataPagination {\n");

        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    moreItemsInCollection: ").append(toIndentedString(moreItemsInCollection)).append("\n");
        sb.append("    nextStart: ").append(toIndentedString(nextStart)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetNotesResponseAdditionalDataPagination} object that
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

        GetNotesResponseAdditionalDataPagination model = (GetNotesResponseAdditionalDataPagination) obj;

        return java.util.Objects.equals(start, model.start) &&
        java.util.Objects.equals(limit, model.limit) &&
        java.util.Objects.equals(moreItemsInCollection, model.moreItemsInCollection) &&
        java.util.Objects.equals(nextStart, model.nextStart);
    }

    /**
     * Returns a hash code for a {@code GetNotesResponseAdditionalDataPagination}.
     *
     * @return a hash code value for a {@code GetNotesResponseAdditionalDataPagination}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(start,
        limit,
        moreItemsInCollection,
        nextStart);
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
      * The pagination details of the list
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetNotesResponseAdditionalDataPaginationQueryParam  {

        /**
          * The pagination details of the list
         **/
        @jakarta.ws.rs.QueryParam("start")
        private Integer start;
        /**
          * The pagination details of the list
         **/
        @jakarta.ws.rs.QueryParam("limit")
        private Integer limit;
        /**
          * The pagination details of the list
         **/
        @jakarta.ws.rs.QueryParam("moreItemsInCollection")
        private Boolean moreItemsInCollection;
        /**
          * The pagination details of the list
         **/
        @jakarta.ws.rs.QueryParam("nextStart")
        private Integer nextStart;

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

        public GetNotesResponseAdditionalDataPaginationQueryParam start(Integer start) {
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

        public GetNotesResponseAdditionalDataPaginationQueryParam limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
        * If there are more list items in the collection than displayed or not
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

        public GetNotesResponseAdditionalDataPaginationQueryParam moreItemsInCollection(Boolean moreItemsInCollection) {
            this.moreItemsInCollection = moreItemsInCollection;
            return this;
        }

        /**
        * Next pagination start
        * @return nextStart
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("next_start")
        public Integer getNextStart() {
            return nextStart;
        }

        /**
         * Set nextStart
         **/
        public void setNextStart(Integer nextStart) {
            this.nextStart = nextStart;
        }

        public GetNotesResponseAdditionalDataPaginationQueryParam nextStart(Integer nextStart) {
            this.nextStart = nextStart;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetNotesResponseAdditionalDataPaginationQueryParam {\n");

            sb.append("    start: ").append(toIndentedString(start)).append("\n");
            sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
            sb.append("    moreItemsInCollection: ").append(toIndentedString(moreItemsInCollection)).append("\n");
            sb.append("    nextStart: ").append(toIndentedString(nextStart)).append("\n");
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
