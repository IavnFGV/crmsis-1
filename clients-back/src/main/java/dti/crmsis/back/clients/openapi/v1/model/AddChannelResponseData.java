package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class AddChannelResponseData  {

    /**
      * The unique channel ID used internally in omnichannel-api and the frontend of the extension
     **/
    private String id;
    /**
      * The name of the channel
     **/
    private String name;
    /**
      * The URL for an icon that represents your channel
     **/
    private String avatarUrl;
    /**
      * The channel ID you specified while creating the channel
     **/
    private String providerChannelId;
    /**
      * The client_id of your app in Pipedrive marketplace
     **/
    private String marketplaceClientId;
    /**
      * The ID of the user's company in Pipedrive
     **/
    private Integer pdCompanyId;
    /**
      * The ID of the user in Pipedrive
     **/
    private Integer pdUserId;
    /**
      * The date and time when your channel was created in the API
     **/
    private OffsetDateTime createdAt;

    public enum ProviderTypeEnum {
        FACEBOOK(String.valueOf("facebook")), WHATSAPP(String.valueOf("whatsapp")), OTHER(String.valueOf("other"));

        // caching enum access
        private static final java.util.EnumSet<ProviderTypeEnum> values = java.util.EnumSet.allOf(ProviderTypeEnum.class);

        String value;

        ProviderTypeEnum (String v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
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
      * Value of the provider_type sent to this endpoint
     **/
    private ProviderTypeEnum providerType;
    /**
      * Value of the template_support sent to this endpoint
     **/
    private Boolean templateSupport;

    /**
    * The unique channel ID used internally in omnichannel-api and the frontend of the extension
    * @return id
    **/
    @JsonProperty("id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(String id) {
        this.id = id;
    }

    public AddChannelResponseData id(String id) {
        this.id = id;
        return this;
    }

    /**
    * The name of the channel
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

    public AddChannelResponseData name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The URL for an icon that represents your channel
    * @return avatarUrl
    **/
    @JsonProperty("avatar_url")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * Set avatarUrl
     **/
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public AddChannelResponseData avatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    /**
    * The channel ID you specified while creating the channel
    * @return providerChannelId
    **/
    @JsonProperty("provider_channel_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getProviderChannelId() {
        return providerChannelId;
    }

    /**
     * Set providerChannelId
     **/
    public void setProviderChannelId(String providerChannelId) {
        this.providerChannelId = providerChannelId;
    }

    public AddChannelResponseData providerChannelId(String providerChannelId) {
        this.providerChannelId = providerChannelId;
        return this;
    }

    /**
    * The client_id of your app in Pipedrive marketplace
    * @return marketplaceClientId
    **/
    @JsonProperty("marketplace_client_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getMarketplaceClientId() {
        return marketplaceClientId;
    }

    /**
     * Set marketplaceClientId
     **/
    public void setMarketplaceClientId(String marketplaceClientId) {
        this.marketplaceClientId = marketplaceClientId;
    }

    public AddChannelResponseData marketplaceClientId(String marketplaceClientId) {
        this.marketplaceClientId = marketplaceClientId;
        return this;
    }

    /**
    * The ID of the user's company in Pipedrive
    * @return pdCompanyId
    **/
    @JsonProperty("pd_company_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getPdCompanyId() {
        return pdCompanyId;
    }

    /**
     * Set pdCompanyId
     **/
    public void setPdCompanyId(Integer pdCompanyId) {
        this.pdCompanyId = pdCompanyId;
    }

    public AddChannelResponseData pdCompanyId(Integer pdCompanyId) {
        this.pdCompanyId = pdCompanyId;
        return this;
    }

    /**
    * The ID of the user in Pipedrive
    * @return pdUserId
    **/
    @JsonProperty("pd_user_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getPdUserId() {
        return pdUserId;
    }

    /**
     * Set pdUserId
     **/
    public void setPdUserId(Integer pdUserId) {
        this.pdUserId = pdUserId;
    }

    public AddChannelResponseData pdUserId(Integer pdUserId) {
        this.pdUserId = pdUserId;
        return this;
    }

    /**
    * The date and time when your channel was created in the API
    * @return createdAt
    **/
    @JsonProperty("created_at")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Set createdAt
     **/
    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public AddChannelResponseData createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
    * Value of the provider_type sent to this endpoint
    * @return providerType
    **/
    @JsonProperty("provider_type")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ProviderTypeEnum getProviderType() {
        return providerType;
    }

    /**
     * Set providerType
     **/
    public void setProviderType(ProviderTypeEnum providerType) {
        this.providerType = providerType;
    }

    public AddChannelResponseData providerType(ProviderTypeEnum providerType) {
        this.providerType = providerType;
        return this;
    }

    /**
    * Value of the template_support sent to this endpoint
    * @return templateSupport
    **/
    @JsonProperty("template_support")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getTemplateSupport() {
        return templateSupport;
    }

    /**
     * Set templateSupport
     **/
    public void setTemplateSupport(Boolean templateSupport) {
        this.templateSupport = templateSupport;
    }

    public AddChannelResponseData templateSupport(Boolean templateSupport) {
        this.templateSupport = templateSupport;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddChannelResponseData {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
        sb.append("    providerChannelId: ").append(toIndentedString(providerChannelId)).append("\n");
        sb.append("    marketplaceClientId: ").append(toIndentedString(marketplaceClientId)).append("\n");
        sb.append("    pdCompanyId: ").append(toIndentedString(pdCompanyId)).append("\n");
        sb.append("    pdUserId: ").append(toIndentedString(pdUserId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
        sb.append("    templateSupport: ").append(toIndentedString(templateSupport)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddChannelResponseData} object that
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

        AddChannelResponseData model = (AddChannelResponseData) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(avatarUrl, model.avatarUrl) &&
        java.util.Objects.equals(providerChannelId, model.providerChannelId) &&
        java.util.Objects.equals(marketplaceClientId, model.marketplaceClientId) &&
        java.util.Objects.equals(pdCompanyId, model.pdCompanyId) &&
        java.util.Objects.equals(pdUserId, model.pdUserId) &&
        java.util.Objects.equals(createdAt, model.createdAt) &&
        java.util.Objects.equals(providerType, model.providerType) &&
        java.util.Objects.equals(templateSupport, model.templateSupport);
    }

    /**
     * Returns a hash code for a {@code AddChannelResponseData}.
     *
     * @return a hash code value for a {@code AddChannelResponseData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        name,
        avatarUrl,
        providerChannelId,
        marketplaceClientId,
        pdCompanyId,
        pdUserId,
        createdAt,
        providerType,
        templateSupport);
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
    public static class AddChannelResponseDataQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private String id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("avatarUrl")
        private String avatarUrl;
        @jakarta.ws.rs.QueryParam("providerChannelId")
        private String providerChannelId;
        @jakarta.ws.rs.QueryParam("marketplaceClientId")
        private String marketplaceClientId;
        @jakarta.ws.rs.QueryParam("pdCompanyId")
        private Integer pdCompanyId;
        @jakarta.ws.rs.QueryParam("pdUserId")
        private Integer pdUserId;
        @jakarta.ws.rs.QueryParam("createdAt")
        private OffsetDateTime createdAt;

    public enum ProviderTypeEnum {
        FACEBOOK(String.valueOf("facebook")), WHATSAPP(String.valueOf("whatsapp")), OTHER(String.valueOf("other"));

        // caching enum access
        private static final java.util.EnumSet<ProviderTypeEnum> values = java.util.EnumSet.allOf(ProviderTypeEnum.class);

        String value;

        ProviderTypeEnum (String v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ProviderTypeEnum fromString(String v) {
            for (ProviderTypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private ProviderTypeEnum providerType;
        @jakarta.ws.rs.QueryParam("templateSupport")
        private Boolean templateSupport;

        /**
        * The unique channel ID used internally in omnichannel-api and the frontend of the extension
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

        public AddChannelResponseDataQueryParam id(String id) {
            this.id = id;
            return this;
        }

        /**
        * The name of the channel
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

        public AddChannelResponseDataQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The URL for an icon that represents your channel
        * @return avatarUrl
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("avatar_url")
        public String getAvatarUrl() {
            return avatarUrl;
        }

        /**
         * Set avatarUrl
         **/
        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public AddChannelResponseDataQueryParam avatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }

        /**
        * The channel ID you specified while creating the channel
        * @return providerChannelId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("provider_channel_id")
        public String getProviderChannelId() {
            return providerChannelId;
        }

        /**
         * Set providerChannelId
         **/
        public void setProviderChannelId(String providerChannelId) {
            this.providerChannelId = providerChannelId;
        }

        public AddChannelResponseDataQueryParam providerChannelId(String providerChannelId) {
            this.providerChannelId = providerChannelId;
            return this;
        }

        /**
        * The client_id of your app in Pipedrive marketplace
        * @return marketplaceClientId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("marketplace_client_id")
        public String getMarketplaceClientId() {
            return marketplaceClientId;
        }

        /**
         * Set marketplaceClientId
         **/
        public void setMarketplaceClientId(String marketplaceClientId) {
            this.marketplaceClientId = marketplaceClientId;
        }

        public AddChannelResponseDataQueryParam marketplaceClientId(String marketplaceClientId) {
            this.marketplaceClientId = marketplaceClientId;
            return this;
        }

        /**
        * The ID of the user's company in Pipedrive
        * @return pdCompanyId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("pd_company_id")
        public Integer getPdCompanyId() {
            return pdCompanyId;
        }

        /**
         * Set pdCompanyId
         **/
        public void setPdCompanyId(Integer pdCompanyId) {
            this.pdCompanyId = pdCompanyId;
        }

        public AddChannelResponseDataQueryParam pdCompanyId(Integer pdCompanyId) {
            this.pdCompanyId = pdCompanyId;
            return this;
        }

        /**
        * The ID of the user in Pipedrive
        * @return pdUserId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("pd_user_id")
        public Integer getPdUserId() {
            return pdUserId;
        }

        /**
         * Set pdUserId
         **/
        public void setPdUserId(Integer pdUserId) {
            this.pdUserId = pdUserId;
        }

        public AddChannelResponseDataQueryParam pdUserId(Integer pdUserId) {
            this.pdUserId = pdUserId;
            return this;
        }

        /**
        * The date and time when your channel was created in the API
        * @return createdAt
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("created_at")
        public OffsetDateTime getCreatedAt() {
            return createdAt;
        }

        /**
         * Set createdAt
         **/
        public void setCreatedAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
        }

        public AddChannelResponseDataQueryParam createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
        * Value of the provider_type sent to this endpoint
        * @return providerType
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("provider_type")
        public ProviderTypeEnum getProviderType() {
            return providerType;
        }

        /**
         * Set providerType
         **/
        public void setProviderType(ProviderTypeEnum providerType) {
            this.providerType = providerType;
        }

        public AddChannelResponseDataQueryParam providerType(ProviderTypeEnum providerType) {
            this.providerType = providerType;
            return this;
        }

        /**
        * Value of the template_support sent to this endpoint
        * @return templateSupport
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("template_support")
        public Boolean getTemplateSupport() {
            return templateSupport;
        }

        /**
         * Set templateSupport
         **/
        public void setTemplateSupport(Boolean templateSupport) {
            this.templateSupport = templateSupport;
        }

        public AddChannelResponseDataQueryParam templateSupport(Boolean templateSupport) {
            this.templateSupport = templateSupport;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddChannelResponseDataQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
            sb.append("    providerChannelId: ").append(toIndentedString(providerChannelId)).append("\n");
            sb.append("    marketplaceClientId: ").append(toIndentedString(marketplaceClientId)).append("\n");
            sb.append("    pdCompanyId: ").append(toIndentedString(pdCompanyId)).append("\n");
            sb.append("    pdUserId: ").append(toIndentedString(pdUserId)).append("\n");
            sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
            sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
            sb.append("    templateSupport: ").append(toIndentedString(templateSupport)).append("\n");
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
