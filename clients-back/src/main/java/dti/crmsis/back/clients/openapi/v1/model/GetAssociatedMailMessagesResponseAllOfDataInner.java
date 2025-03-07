package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.MailMessageItemForList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetAssociatedMailMessagesResponseAllOfDataInner  {

    /**
      * The type of the data item
     **/
    private String _object;
    /**
      * The date and time when the item was created
     **/
    private String timestamp;
    private MailMessageItemForList data;

    /**
    * The type of the data item
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

    public GetAssociatedMailMessagesResponseAllOfDataInner _object(String _object) {
        this._object = _object;
        return this;
    }

    /**
    * The date and time when the item was created
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

    public GetAssociatedMailMessagesResponseAllOfDataInner timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
    * Get data
    * @return data
    **/
    @JsonProperty("data")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public MailMessageItemForList getData() {
        return data;
    }

    /**
     * Set data
     **/
    public void setData(MailMessageItemForList data) {
        this.data = data;
    }

    public GetAssociatedMailMessagesResponseAllOfDataInner data(MailMessageItemForList data) {
        this.data = data;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAssociatedMailMessagesResponseAllOfDataInner {\n");

        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetAssociatedMailMessagesResponseAllOfDataInner} object that
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

        GetAssociatedMailMessagesResponseAllOfDataInner model = (GetAssociatedMailMessagesResponseAllOfDataInner) obj;

        return java.util.Objects.equals(_object, model._object) &&
        java.util.Objects.equals(timestamp, model.timestamp) &&
        java.util.Objects.equals(data, model.data);
    }

    /**
     * Returns a hash code for a {@code GetAssociatedMailMessagesResponseAllOfDataInner}.
     *
     * @return a hash code value for a {@code GetAssociatedMailMessagesResponseAllOfDataInner}.
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
    public static class GetAssociatedMailMessagesResponseAllOfDataInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("_object")
        private String _object;
        @jakarta.ws.rs.QueryParam("timestamp")
        private String timestamp;
        @jakarta.ws.rs.QueryParam("data")
        private MailMessageItemForList data;

        /**
        * The type of the data item
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

        public GetAssociatedMailMessagesResponseAllOfDataInnerQueryParam _object(String _object) {
            this._object = _object;
            return this;
        }

        /**
        * The date and time when the item was created
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

        public GetAssociatedMailMessagesResponseAllOfDataInnerQueryParam timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
        * Get data
        * @return data
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("data")
        public MailMessageItemForList getData() {
            return data;
        }

        /**
         * Set data
         **/
        public void setData(MailMessageItemForList data) {
            this.data = data;
        }

        public GetAssociatedMailMessagesResponseAllOfDataInnerQueryParam data(MailMessageItemForList data) {
            this.data = data;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetAssociatedMailMessagesResponseAllOfDataInnerQueryParam {\n");

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
