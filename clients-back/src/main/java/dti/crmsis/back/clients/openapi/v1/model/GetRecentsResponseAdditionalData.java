package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetFieldsResponseAllOfAdditionalData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetRecentsResponseAdditionalData  {

    /**
      * The timestamp in UTC. Format: YYYY-MM-DD HH:MM:SS
     **/
    private String sinceTimestamp;
    /**
      * The timestamp in UTC. Format: YYYY-MM-DD HH:MM:SS
     **/
    private String lastTimestampOnPage;
    private GetFieldsResponseAllOfAdditionalData pagination;

    /**
    * The timestamp in UTC. Format: YYYY-MM-DD HH:MM:SS
    * @return sinceTimestamp
    **/
    @JsonProperty("since_timestamp")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getSinceTimestamp() {
        return sinceTimestamp;
    }

    /**
     * Set sinceTimestamp
     **/
    public void setSinceTimestamp(String sinceTimestamp) {
        this.sinceTimestamp = sinceTimestamp;
    }

    public GetRecentsResponseAdditionalData sinceTimestamp(String sinceTimestamp) {
        this.sinceTimestamp = sinceTimestamp;
        return this;
    }

    /**
    * The timestamp in UTC. Format: YYYY-MM-DD HH:MM:SS
    * @return lastTimestampOnPage
    **/
    @JsonProperty("last_timestamp_on_page")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLastTimestampOnPage() {
        return lastTimestampOnPage;
    }

    /**
     * Set lastTimestampOnPage
     **/
    public void setLastTimestampOnPage(String lastTimestampOnPage) {
        this.lastTimestampOnPage = lastTimestampOnPage;
    }

    public GetRecentsResponseAdditionalData lastTimestampOnPage(String lastTimestampOnPage) {
        this.lastTimestampOnPage = lastTimestampOnPage;
        return this;
    }

    /**
    * Get pagination
    * @return pagination
    **/
    @JsonProperty("pagination")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetFieldsResponseAllOfAdditionalData getPagination() {
        return pagination;
    }

    /**
     * Set pagination
     **/
    public void setPagination(GetFieldsResponseAllOfAdditionalData pagination) {
        this.pagination = pagination;
    }

    public GetRecentsResponseAdditionalData pagination(GetFieldsResponseAllOfAdditionalData pagination) {
        this.pagination = pagination;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetRecentsResponseAdditionalData {\n");

        sb.append("    sinceTimestamp: ").append(toIndentedString(sinceTimestamp)).append("\n");
        sb.append("    lastTimestampOnPage: ").append(toIndentedString(lastTimestampOnPage)).append("\n");
        sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetRecentsResponseAdditionalData} object that
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

        GetRecentsResponseAdditionalData model = (GetRecentsResponseAdditionalData) obj;

        return java.util.Objects.equals(sinceTimestamp, model.sinceTimestamp) &&
        java.util.Objects.equals(lastTimestampOnPage, model.lastTimestampOnPage) &&
        java.util.Objects.equals(pagination, model.pagination);
    }

    /**
     * Returns a hash code for a {@code GetRecentsResponseAdditionalData}.
     *
     * @return a hash code value for a {@code GetRecentsResponseAdditionalData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(sinceTimestamp,
        lastTimestampOnPage,
        pagination);
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
    public static class GetRecentsResponseAdditionalDataQueryParam  {

        @jakarta.ws.rs.QueryParam("sinceTimestamp")
        private String sinceTimestamp;
        @jakarta.ws.rs.QueryParam("lastTimestampOnPage")
        private String lastTimestampOnPage;
        @jakarta.ws.rs.QueryParam("pagination")
        private GetFieldsResponseAllOfAdditionalData pagination;

        /**
        * The timestamp in UTC. Format: YYYY-MM-DD HH:MM:SS
        * @return sinceTimestamp
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("since_timestamp")
        public String getSinceTimestamp() {
            return sinceTimestamp;
        }

        /**
         * Set sinceTimestamp
         **/
        public void setSinceTimestamp(String sinceTimestamp) {
            this.sinceTimestamp = sinceTimestamp;
        }

        public GetRecentsResponseAdditionalDataQueryParam sinceTimestamp(String sinceTimestamp) {
            this.sinceTimestamp = sinceTimestamp;
            return this;
        }

        /**
        * The timestamp in UTC. Format: YYYY-MM-DD HH:MM:SS
        * @return lastTimestampOnPage
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("last_timestamp_on_page")
        public String getLastTimestampOnPage() {
            return lastTimestampOnPage;
        }

        /**
         * Set lastTimestampOnPage
         **/
        public void setLastTimestampOnPage(String lastTimestampOnPage) {
            this.lastTimestampOnPage = lastTimestampOnPage;
        }

        public GetRecentsResponseAdditionalDataQueryParam lastTimestampOnPage(String lastTimestampOnPage) {
            this.lastTimestampOnPage = lastTimestampOnPage;
            return this;
        }

        /**
        * Get pagination
        * @return pagination
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("pagination")
        public GetFieldsResponseAllOfAdditionalData getPagination() {
            return pagination;
        }

        /**
         * Set pagination
         **/
        public void setPagination(GetFieldsResponseAllOfAdditionalData pagination) {
            this.pagination = pagination;
        }

        public GetRecentsResponseAdditionalDataQueryParam pagination(GetFieldsResponseAllOfAdditionalData pagination) {
            this.pagination = pagination;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetRecentsResponseAdditionalDataQueryParam {\n");

            sb.append("    sinceTimestamp: ").append(toIndentedString(sinceTimestamp)).append("\n");
            sb.append("    lastTimestampOnPage: ").append(toIndentedString(lastTimestampOnPage)).append("\n");
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
