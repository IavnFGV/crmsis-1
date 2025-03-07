package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetDealUpdatesResponseAllOfDataInner  {

    /**
      * The type of the deal update. (Possible object types - dealChange, note, activity, mailMessage, invoice, document, file)
     **/
    private String _object;
    /**
      * The creation date and time of the update
     **/
    private String timestamp;
    /**
      * The data related to the update
     **/
    private Object data;

    /**
    * The type of the deal update. (Possible object types - dealChange, note, activity, mailMessage, invoice, document, file)
    * @return _object
    **/
    @JsonProperty("object")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getObject() {
        return _object;
    }

    /**
     * Set _object
     **/
    public void setObject(String _object) {
        this._object = _object;
    }

    public GetDealUpdatesResponseAllOfDataInner _object(String _object) {
        this._object = _object;
        return this;
    }

    /**
    * The creation date and time of the update
    * @return timestamp
    **/
    @JsonProperty("timestamp")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Set timestamp
     **/
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public GetDealUpdatesResponseAllOfDataInner timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
    * The data related to the update
    * @return data
    **/
    @JsonProperty("data")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Object getData() {
        return data;
    }

    /**
     * Set data
     **/
    public void setData(Object data) {
        this.data = data;
    }

    public GetDealUpdatesResponseAllOfDataInner data(Object data) {
        this.data = data;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetDealUpdatesResponseAllOfDataInner {\n");

        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetDealUpdatesResponseAllOfDataInner} object that
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

        GetDealUpdatesResponseAllOfDataInner model = (GetDealUpdatesResponseAllOfDataInner) obj;

        return java.util.Objects.equals(_object, model._object) &&
        java.util.Objects.equals(timestamp, model.timestamp) &&
        java.util.Objects.equals(data, model.data);
    }

    /**
     * Returns a hash code for a {@code GetDealUpdatesResponseAllOfDataInner}.
     *
     * @return a hash code value for a {@code GetDealUpdatesResponseAllOfDataInner}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(_object,
        timestamp,
        data);
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
    public static class GetDealUpdatesResponseAllOfDataInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("_object")
        private String _object;
        @jakarta.ws.rs.QueryParam("timestamp")
        private String timestamp;
        @jakarta.ws.rs.QueryParam("data")
        private Object data;

        /**
        * The type of the deal update. (Possible object types - dealChange, note, activity, mailMessage, invoice, document, file)
        * @return _object
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("object")
        public String getObject() {
            return _object;
        }

        /**
         * Set _object
         **/
        public void setObject(String _object) {
            this._object = _object;
        }

        public GetDealUpdatesResponseAllOfDataInnerQueryParam _object(String _object) {
            this._object = _object;
            return this;
        }

        /**
        * The creation date and time of the update
        * @return timestamp
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        public String getTimestamp() {
            return timestamp;
        }

        /**
         * Set timestamp
         **/
        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public GetDealUpdatesResponseAllOfDataInnerQueryParam timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
        * The data related to the update
        * @return data
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("data")
        public Object getData() {
            return data;
        }

        /**
         * Set data
         **/
        public void setData(Object data) {
            this.data = data;
        }

        public GetDealUpdatesResponseAllOfDataInnerQueryParam data(Object data) {
            this.data = data;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetDealUpdatesResponseAllOfDataInnerQueryParam {\n");

            sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
            sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
            sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
