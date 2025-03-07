package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class ReceiveMessageRequestAttachmentsInner  {

    /**
      * The ID of the attachment
     **/
    private String id;
    /**
      * The mime-type of the attachment
     **/
    private String type;
    /**
      * The name of the attachment
     **/
    private String name;
    /**
      * The size of the attachment
     **/
    private BigDecimal size;
    /**
      * A URL to the file
     **/
    private String url;
    /**
      * A URL to a preview picture of the file
     **/
    private String previewUrl;
    /**
      * If true, it will use the getMessageById endpoint for fetching updated attachment's urls. Find out more [here](https://pipedrive.readme.io/docs/implementing-messaging-app-extension)
     **/
    private Boolean linkExpires = false;

    /**
    * The ID of the attachment
    * @return id
    **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(String id) {
        this.id = id;
    }

    public ReceiveMessageRequestAttachmentsInner id(String id) {
        this.id = id;
        return this;
    }

    /**
    * The mime-type of the attachment
    * @return type
    **/
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(String type) {
        this.type = type;
    }

    public ReceiveMessageRequestAttachmentsInner type(String type) {
        this.type = type;
        return this;
    }

    /**
    * The name of the attachment
    * @return name
    **/
    @JsonProperty("name")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public ReceiveMessageRequestAttachmentsInner name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The size of the attachment
    * @return size
    **/
    @JsonProperty("size")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getSize() {
        return size;
    }

    /**
     * Set size
     **/
    public void setSize(BigDecimal size) {
        this.size = size;
    }

    public ReceiveMessageRequestAttachmentsInner size(BigDecimal size) {
        this.size = size;
        return this;
    }

    /**
    * A URL to the file
    * @return url
    **/
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * Set url
     **/
    public void setUrl(String url) {
        this.url = url;
    }

    public ReceiveMessageRequestAttachmentsInner url(String url) {
        this.url = url;
        return this;
    }

    /**
    * A URL to a preview picture of the file
    * @return previewUrl
    **/
    @JsonProperty("preview_url")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPreviewUrl() {
        return previewUrl;
    }

    /**
     * Set previewUrl
     **/
    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public ReceiveMessageRequestAttachmentsInner previewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
        return this;
    }

    /**
    * If true, it will use the getMessageById endpoint for fetching updated attachment's urls. Find out more [here](https://pipedrive.readme.io/docs/implementing-messaging-app-extension)
    * @return linkExpires
    **/
    @JsonProperty("link_expires")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getLinkExpires() {
        return linkExpires;
    }

    /**
     * Set linkExpires
     **/
    public void setLinkExpires(Boolean linkExpires) {
        this.linkExpires = linkExpires;
    }

    public ReceiveMessageRequestAttachmentsInner linkExpires(Boolean linkExpires) {
        this.linkExpires = linkExpires;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReceiveMessageRequestAttachmentsInner {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    previewUrl: ").append(toIndentedString(previewUrl)).append("\n");
        sb.append("    linkExpires: ").append(toIndentedString(linkExpires)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code ReceiveMessageRequestAttachmentsInner} object that
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

        ReceiveMessageRequestAttachmentsInner model = (ReceiveMessageRequestAttachmentsInner) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(type, model.type) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(size, model.size) &&
        java.util.Objects.equals(url, model.url) &&
        java.util.Objects.equals(previewUrl, model.previewUrl) &&
        java.util.Objects.equals(linkExpires, model.linkExpires);
    }

    /**
     * Returns a hash code for a {@code ReceiveMessageRequestAttachmentsInner}.
     *
     * @return a hash code value for a {@code ReceiveMessageRequestAttachmentsInner}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        type,
        name,
        size,
        url,
        previewUrl,
        linkExpires);
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
    public static class ReceiveMessageRequestAttachmentsInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private String id;
        @jakarta.ws.rs.QueryParam("type")
        private String type;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("size")
        private BigDecimal size;
        @jakarta.ws.rs.QueryParam("url")
        private String url;
        @jakarta.ws.rs.QueryParam("previewUrl")
        private String previewUrl;
        @jakarta.ws.rs.QueryParam("linkExpires")
        private Boolean linkExpires = false;

        /**
        * The ID of the attachment
        * @return id
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        public String getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(String id) {
            this.id = id;
        }

        public ReceiveMessageRequestAttachmentsInnerQueryParam id(String id) {
            this.id = id;
            return this;
        }

        /**
        * The mime-type of the attachment
        * @return type
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        public String getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(String type) {
            this.type = type;
        }

        public ReceiveMessageRequestAttachmentsInnerQueryParam type(String type) {
            this.type = type;
            return this;
        }

        /**
        * The name of the attachment
        * @return name
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public ReceiveMessageRequestAttachmentsInnerQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The size of the attachment
        * @return size
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("size")
        public BigDecimal getSize() {
            return size;
        }

        /**
         * Set size
         **/
        public void setSize(BigDecimal size) {
            this.size = size;
        }

        public ReceiveMessageRequestAttachmentsInnerQueryParam size(BigDecimal size) {
            this.size = size;
            return this;
        }

        /**
        * A URL to the file
        * @return url
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        public String getUrl() {
            return url;
        }

        /**
         * Set url
         **/
        public void setUrl(String url) {
            this.url = url;
        }

        public ReceiveMessageRequestAttachmentsInnerQueryParam url(String url) {
            this.url = url;
            return this;
        }

        /**
        * A URL to a preview picture of the file
        * @return previewUrl
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("preview_url")
        public String getPreviewUrl() {
            return previewUrl;
        }

        /**
         * Set previewUrl
         **/
        public void setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
        }

        public ReceiveMessageRequestAttachmentsInnerQueryParam previewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }

        /**
        * If true, it will use the getMessageById endpoint for fetching updated attachment's urls. Find out more [here](https://pipedrive.readme.io/docs/implementing-messaging-app-extension)
        * @return linkExpires
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("link_expires")
        public Boolean getLinkExpires() {
            return linkExpires;
        }

        /**
         * Set linkExpires
         **/
        public void setLinkExpires(Boolean linkExpires) {
            this.linkExpires = linkExpires;
        }

        public ReceiveMessageRequestAttachmentsInnerQueryParam linkExpires(Boolean linkExpires) {
            this.linkExpires = linkExpires;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ReceiveMessageRequestAttachmentsInnerQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    size: ").append(toIndentedString(size)).append("\n");
            sb.append("    url: ").append(toIndentedString(url)).append("\n");
            sb.append("    previewUrl: ").append(toIndentedString(previewUrl)).append("\n");
            sb.append("    linkExpires: ").append(toIndentedString(linkExpires)).append("\n");
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
