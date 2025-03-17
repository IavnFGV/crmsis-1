package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddChannelRequest  {

    /**
      * The name of the channel
     **/
    private String name;
    /**
      * The channel ID
     **/
    private String providerChannelId;
    /**
      * The URL for an icon that represents your channel
     **/
    private String avatarUrl;
    /**
      * If true, enables templates logic on UI. Requires getTemplates endpoint implemented. Find out more [here](https://pipedrive.readme.io/docs/implementing-messaging-app-extension).
     **/
    private Boolean templateSupport = false;

    public enum ProviderTypeEnum {
        FACEBOOK(String.valueOf("facebook")), WHATSAPP(String.valueOf("whatsapp")), OTHER(String.valueOf("other"));

        // caching enum access
        private static final java.util.EnumSet<ProviderTypeEnum> values = java.util.EnumSet.allOf(ProviderTypeEnum.class);

        String value;

        ProviderTypeEnum (String v) {
            value = v;
        }

        @JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProviderTypeEnum fromString(String v) {
            for (ProviderTypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    /**
      * It controls the icons (like the icon next to the conversation)
     **/
    private ProviderTypeEnum providerType = ProviderTypeEnum.OTHER;

    /**
    * The name of the channel
    * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public AddChannelRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The channel ID
    * @return providerChannelId
    **/
    @JsonProperty("provider_channel_id")
    public String getProviderChannelId() {
        return providerChannelId;
    }

    /**
     * Set providerChannelId
     **/
    public void setProviderChannelId(String providerChannelId) {
        this.providerChannelId = providerChannelId;
    }

    public AddChannelRequest providerChannelId(String providerChannelId) {
        this.providerChannelId = providerChannelId;
        return this;
    }

    /**
    * The URL for an icon that represents your channel
    * @return avatarUrl
    **/
    @JsonProperty("avatar_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * Set avatarUrl
     **/
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public AddChannelRequest avatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    /**
    * If true, enables templates logic on UI. Requires getTemplates endpoint implemented. Find out more [here](https://pipedrive.readme.io/docs/implementing-messaging-app-extension).
    * @return templateSupport
    **/
    @JsonProperty("template_support")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTemplateSupport() {
        return templateSupport;
    }

    /**
     * Set templateSupport
     **/
    public void setTemplateSupport(Boolean templateSupport) {
        this.templateSupport = templateSupport;
    }

    public AddChannelRequest templateSupport(Boolean templateSupport) {
        this.templateSupport = templateSupport;
        return this;
    }

    /**
    * It controls the icons (like the icon next to the conversation)
    * @return providerType
    **/
    @JsonProperty("provider_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ProviderTypeEnum getProviderType() {
        return providerType;
    }

    /**
     * Set providerType
     **/
    public void setProviderType(ProviderTypeEnum providerType) {
        this.providerType = providerType;
    }

    public AddChannelRequest providerType(ProviderTypeEnum providerType) {
        this.providerType = providerType;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddChannelRequest {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    providerChannelId: ").append(toIndentedString(providerChannelId)).append("\n");
        sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
        sb.append("    templateSupport: ").append(toIndentedString(templateSupport)).append("\n");
        sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddChannelRequest} object that
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

        AddChannelRequest model = (AddChannelRequest) obj;

        return java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(providerChannelId, model.providerChannelId) &&
        java.util.Objects.equals(avatarUrl, model.avatarUrl) &&
        java.util.Objects.equals(templateSupport, model.templateSupport) &&
        java.util.Objects.equals(providerType, model.providerType);
    }

    /**
     * Returns a hash code for a {@code AddChannelRequest}.
     *
     * @return a hash code value for a {@code AddChannelRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,
        providerChannelId,
        avatarUrl,
        templateSupport,
        providerType);
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AddChannelRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("providerChannelId")
        private String providerChannelId;
        @jakarta.ws.rs.QueryParam("avatarUrl")
        private String avatarUrl;
        @jakarta.ws.rs.QueryParam("templateSupport")
        private Boolean templateSupport = false;

    public enum ProviderTypeEnum {
        FACEBOOK(String.valueOf("facebook")), WHATSAPP(String.valueOf("whatsapp")), OTHER(String.valueOf("other"));

        // caching enum access
        private static final java.util.EnumSet<ProviderTypeEnum> values = java.util.EnumSet.allOf(ProviderTypeEnum.class);

        String value;

        ProviderTypeEnum (String v) {
            value = v;
        }

        @JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProviderTypeEnum fromString(String v) {
            for (ProviderTypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private ProviderTypeEnum providerType = ProviderTypeEnum.OTHER;

        /**
        * The name of the channel
        * @return name
        **/
        @JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public AddChannelRequestQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The channel ID
        * @return providerChannelId
        **/
        @JsonProperty("provider_channel_id")
        public String getProviderChannelId() {
            return providerChannelId;
        }

        /**
         * Set providerChannelId
         **/
        public void setProviderChannelId(String providerChannelId) {
            this.providerChannelId = providerChannelId;
        }

        public AddChannelRequestQueryParam providerChannelId(String providerChannelId) {
            this.providerChannelId = providerChannelId;
            return this;
        }

        /**
        * The URL for an icon that represents your channel
        * @return avatarUrl
        **/
        @JsonProperty("avatar_url")
        public String getAvatarUrl() {
            return avatarUrl;
        }

        /**
         * Set avatarUrl
         **/
        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public AddChannelRequestQueryParam avatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }

        /**
        * If true, enables templates logic on UI. Requires getTemplates endpoint implemented. Find out more [here](https://pipedrive.readme.io/docs/implementing-messaging-app-extension).
        * @return templateSupport
        **/
        @JsonProperty("template_support")
        public Boolean getTemplateSupport() {
            return templateSupport;
        }

        /**
         * Set templateSupport
         **/
        public void setTemplateSupport(Boolean templateSupport) {
            this.templateSupport = templateSupport;
        }

        public AddChannelRequestQueryParam templateSupport(Boolean templateSupport) {
            this.templateSupport = templateSupport;
            return this;
        }

        /**
        * It controls the icons (like the icon next to the conversation)
        * @return providerType
        **/
        @JsonProperty("provider_type")
        public ProviderTypeEnum getProviderType() {
            return providerType;
        }

        /**
         * Set providerType
         **/
        public void setProviderType(ProviderTypeEnum providerType) {
            this.providerType = providerType;
        }

        public AddChannelRequestQueryParam providerType(ProviderTypeEnum providerType) {
            this.providerType = providerType;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddChannelRequestQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    providerChannelId: ").append(toIndentedString(providerChannelId)).append("\n");
            sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
            sb.append("    templateSupport: ").append(toIndentedString(templateSupport)).append("\n");
            sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
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
