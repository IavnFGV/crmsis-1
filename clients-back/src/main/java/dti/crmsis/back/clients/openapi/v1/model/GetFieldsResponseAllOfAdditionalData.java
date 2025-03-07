package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The additional data of the list
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetFieldsResponseAllOfAdditionalData  {

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

    public GetFieldsResponseAllOfAdditionalData start(Integer start) {
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

    public GetFieldsResponseAllOfAdditionalData limit(Integer limit) {
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

    public GetFieldsResponseAllOfAdditionalData moreItemsInCollection(Boolean moreItemsInCollection) {
        this.moreItemsInCollection = moreItemsInCollection;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetFieldsResponseAllOfAdditionalData {\n");

        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    moreItemsInCollection: ").append(toIndentedString(moreItemsInCollection)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetFieldsResponseAllOfAdditionalData} object that
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

        GetFieldsResponseAllOfAdditionalData model = (GetFieldsResponseAllOfAdditionalData) obj;

        return java.util.Objects.equals(start, model.start) &&
        java.util.Objects.equals(limit, model.limit) &&
        java.util.Objects.equals(moreItemsInCollection, model.moreItemsInCollection);
    }

    /**
     * Returns a hash code for a {@code GetFieldsResponseAllOfAdditionalData}.
     *
     * @return a hash code value for a {@code GetFieldsResponseAllOfAdditionalData}.
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
      * The additional data of the list
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetFieldsResponseAllOfAdditionalDataQueryParam  {

        /**
          * The additional data of the list
         **/
        @jakarta.ws.rs.QueryParam("start")
        private Integer start;
        /**
          * The additional data of the list
         **/
        @jakarta.ws.rs.QueryParam("limit")
        private Integer limit;
        /**
          * The additional data of the list
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

        public GetFieldsResponseAllOfAdditionalDataQueryParam start(Integer start) {
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

        public GetFieldsResponseAllOfAdditionalDataQueryParam limit(Integer limit) {
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

        public GetFieldsResponseAllOfAdditionalDataQueryParam moreItemsInCollection(Boolean moreItemsInCollection) {
            this.moreItemsInCollection = moreItemsInCollection;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetFieldsResponseAllOfAdditionalDataQueryParam {\n");

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
