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
public class GetActivitiesCollectionResponseAdditionalData  {

    /**
      * The first item on the next page. The value of the `next_cursor` field will be `null` if you have reached the end of the dataset and there’s no more pages to be returned.
     **/
    private String nextCursor;

    /**
    * The first item on the next page. The value of the `next_cursor` field will be `null` if you have reached the end of the dataset and there’s no more pages to be returned.
    * @return nextCursor
    **/
    @JsonProperty("next_cursor")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getNextCursor() {
        return nextCursor;
    }

    /**
     * Set nextCursor
     **/
    public void setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
    }

    public GetActivitiesCollectionResponseAdditionalData nextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetActivitiesCollectionResponseAdditionalData {\n");

        sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetActivitiesCollectionResponseAdditionalData} object that
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

        GetActivitiesCollectionResponseAdditionalData model = (GetActivitiesCollectionResponseAdditionalData) obj;

        return java.util.Objects.equals(nextCursor, model.nextCursor);
    }

    /**
     * Returns a hash code for a {@code GetActivitiesCollectionResponseAdditionalData}.
     *
     * @return a hash code value for a {@code GetActivitiesCollectionResponseAdditionalData}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(nextCursor);
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
    public static class GetActivitiesCollectionResponseAdditionalDataQueryParam  {

        /**
          * The additional data of the list
         **/
        @jakarta.ws.rs.QueryParam("nextCursor")
        private String nextCursor;

        /**
        * The first item on the next page. The value of the `next_cursor` field will be `null` if you have reached the end of the dataset and there’s no more pages to be returned.
        * @return nextCursor
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("next_cursor")
        public String getNextCursor() {
            return nextCursor;
        }

        /**
         * Set nextCursor
         **/
        public void setNextCursor(String nextCursor) {
            this.nextCursor = nextCursor;
        }

        public GetActivitiesCollectionResponseAdditionalDataQueryParam nextCursor(String nextCursor) {
            this.nextCursor = nextCursor;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetActivitiesCollectionResponseAdditionalDataQueryParam {\n");

            sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
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
