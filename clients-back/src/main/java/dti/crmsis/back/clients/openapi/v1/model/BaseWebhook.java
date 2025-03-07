package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseWebhook  {

    /**
      * The ID of the Webhook
     **/
    private Integer id;
    /**
      * The ID of the company related to the Webhook
     **/
    private Integer companyId;
    /**
      * The ID of the user who owns the Webhook
     **/
    private Integer ownerId;
    /**
      * The ID of the user related to the Webhook
     **/
    private Integer userId;
    /**
      * The Webhook action
     **/
    private String eventAction;
    /**
      * The Webhook object
     **/
    private String eventObject;
    /**
      * The subscription URL of the Webhook
     **/
    private String subscriptionUrl;

    public enum IsActiveEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<IsActiveEnum> values = java.util.EnumSet.allOf(IsActiveEnum.class);

        BigDecimal value;

        IsActiveEnum (BigDecimal v) {
            value = v;
        }

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IsActiveEnum fromString(String v) {
            for (IsActiveEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private IsActiveEnum isActive = IsActiveEnum.NUMBER_1;
    /**
      * The date when the Webhook was added
     **/
    private OffsetDateTime addTime;
    /**
      * The date when the Webhook was removed (if removed)
     **/
    private OffsetDateTime removeTime;

    public enum TypeEnum {
        GENERAL(String.valueOf("general")), APPLICATION(String.valueOf("application")), AUTOMATION(String.valueOf("automation"));

        // caching enum access
        private static final java.util.EnumSet<TypeEnum> values = java.util.EnumSet.allOf(TypeEnum.class);

        String value;

        TypeEnum (String v) {
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
        public static TypeEnum fromString(String v) {
            for (TypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    /**
      * The type of the Webhook
     **/
    private TypeEnum type;
    /**
      * The username of the `subscription_url` of the Webhook
     **/
    private String httpAuthUser;
    /**
      * The password of the `subscription_url` of the Webhook
     **/
    private String httpAuthPassword;
    /**
      * Any additional data related to the Webhook
     **/
    private Object additionalData;
    /**
      * The removal reason of the Webhook (if removed)
     **/
    private String removeReason;
    /**
      * The last delivery time of the Webhook
     **/
    private OffsetDateTime lastDeliveryTime;
    /**
      * The last delivery HTTP status of the Webhook
     **/
    private Integer lastHttpStatus;
    /**
      * The ID of the admin of the Webhook
     **/
    private Integer adminId;

    /**
    * The ID of the Webhook
    * @return id
    **/
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(Integer id) {
        this.id = id;
    }

    public BaseWebhook id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The ID of the company related to the Webhook
    * @return companyId
    **/
    @JsonProperty("company_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * Set companyId
     **/
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public BaseWebhook companyId(Integer companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
    * The ID of the user who owns the Webhook
    * @return ownerId
    **/
    @JsonProperty("owner_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     * Set ownerId
     **/
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public BaseWebhook ownerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
    * The ID of the user related to the Webhook
    * @return userId
    **/
    @JsonProperty("user_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getUserId() {
        return userId;
    }

    /**
     * Set userId
     **/
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BaseWebhook userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
    * The Webhook action
    * @return eventAction
    **/
    @JsonProperty("event_action")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEventAction() {
        return eventAction;
    }

    /**
     * Set eventAction
     **/
    public void setEventAction(String eventAction) {
        this.eventAction = eventAction;
    }

    public BaseWebhook eventAction(String eventAction) {
        this.eventAction = eventAction;
        return this;
    }

    /**
    * The Webhook object
    * @return eventObject
    **/
    @JsonProperty("event_object")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEventObject() {
        return eventObject;
    }

    /**
     * Set eventObject
     **/
    public void setEventObject(String eventObject) {
        this.eventObject = eventObject;
    }

    public BaseWebhook eventObject(String eventObject) {
        this.eventObject = eventObject;
        return this;
    }

    /**
    * The subscription URL of the Webhook
    * @return subscriptionUrl
    **/
    @JsonProperty("subscription_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    /**
     * Set subscriptionUrl
     **/
    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    public BaseWebhook subscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
        return this;
    }

    /**
    * Get isActive
    * @return isActive
    **/
    @JsonProperty("is_active")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IsActiveEnum getIsActive() {
        return isActive;
    }

    /**
     * Set isActive
     **/
    public void setIsActive(IsActiveEnum isActive) {
        this.isActive = isActive;
    }

    public BaseWebhook isActive(IsActiveEnum isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
    * The date when the Webhook was added
    * @return addTime
    **/
    @JsonProperty("add_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OffsetDateTime getAddTime() {
        return addTime;
    }

    /**
     * Set addTime
     **/
    public void setAddTime(OffsetDateTime addTime) {
        this.addTime = addTime;
    }

    public BaseWebhook addTime(OffsetDateTime addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The date when the Webhook was removed (if removed)
    * @return removeTime
    **/
    @JsonProperty("remove_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OffsetDateTime getRemoveTime() {
        return removeTime;
    }

    /**
     * Set removeTime
     **/
    public void setRemoveTime(OffsetDateTime removeTime) {
        this.removeTime = removeTime;
    }

    public BaseWebhook removeTime(OffsetDateTime removeTime) {
        this.removeTime = removeTime;
        return this;
    }

    /**
    * The type of the Webhook
    * @return type
    **/
    @JsonProperty("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TypeEnum getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(TypeEnum type) {
        this.type = type;
    }

    public BaseWebhook type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
    * The username of the `subscription_url` of the Webhook
    * @return httpAuthUser
    **/
    @JsonProperty("http_auth_user")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHttpAuthUser() {
        return httpAuthUser;
    }

    /**
     * Set httpAuthUser
     **/
    public void setHttpAuthUser(String httpAuthUser) {
        this.httpAuthUser = httpAuthUser;
    }

    public BaseWebhook httpAuthUser(String httpAuthUser) {
        this.httpAuthUser = httpAuthUser;
        return this;
    }

    /**
    * The password of the `subscription_url` of the Webhook
    * @return httpAuthPassword
    **/
    @JsonProperty("http_auth_password")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHttpAuthPassword() {
        return httpAuthPassword;
    }

    /**
     * Set httpAuthPassword
     **/
    public void setHttpAuthPassword(String httpAuthPassword) {
        this.httpAuthPassword = httpAuthPassword;
    }

    public BaseWebhook httpAuthPassword(String httpAuthPassword) {
        this.httpAuthPassword = httpAuthPassword;
        return this;
    }

    /**
    * Any additional data related to the Webhook
    * @return additionalData
    **/
    @JsonProperty("additional_data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getAdditionalData() {
        return additionalData;
    }

    /**
     * Set additionalData
     **/
    public void setAdditionalData(Object additionalData) {
        this.additionalData = additionalData;
    }

    public BaseWebhook additionalData(Object additionalData) {
        this.additionalData = additionalData;
        return this;
    }

    /**
    * The removal reason of the Webhook (if removed)
    * @return removeReason
    **/
    @JsonProperty("remove_reason")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRemoveReason() {
        return removeReason;
    }

    /**
     * Set removeReason
     **/
    public void setRemoveReason(String removeReason) {
        this.removeReason = removeReason;
    }

    public BaseWebhook removeReason(String removeReason) {
        this.removeReason = removeReason;
        return this;
    }

    /**
    * The last delivery time of the Webhook
    * @return lastDeliveryTime
    **/
    @JsonProperty("last_delivery_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OffsetDateTime getLastDeliveryTime() {
        return lastDeliveryTime;
    }

    /**
     * Set lastDeliveryTime
     **/
    public void setLastDeliveryTime(OffsetDateTime lastDeliveryTime) {
        this.lastDeliveryTime = lastDeliveryTime;
    }

    public BaseWebhook lastDeliveryTime(OffsetDateTime lastDeliveryTime) {
        this.lastDeliveryTime = lastDeliveryTime;
        return this;
    }

    /**
    * The last delivery HTTP status of the Webhook
    * @return lastHttpStatus
    **/
    @JsonProperty("last_http_status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getLastHttpStatus() {
        return lastHttpStatus;
    }

    /**
     * Set lastHttpStatus
     **/
    public void setLastHttpStatus(Integer lastHttpStatus) {
        this.lastHttpStatus = lastHttpStatus;
    }

    public BaseWebhook lastHttpStatus(Integer lastHttpStatus) {
        this.lastHttpStatus = lastHttpStatus;
        return this;
    }

    /**
    * The ID of the admin of the Webhook
    * @return adminId
    **/
    @JsonProperty("admin_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * Set adminId
     **/
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public BaseWebhook adminId(Integer adminId) {
        this.adminId = adminId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaseWebhook {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    eventAction: ").append(toIndentedString(eventAction)).append("\n");
        sb.append("    eventObject: ").append(toIndentedString(eventObject)).append("\n");
        sb.append("    subscriptionUrl: ").append(toIndentedString(subscriptionUrl)).append("\n");
        sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    removeTime: ").append(toIndentedString(removeTime)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    httpAuthUser: ").append(toIndentedString(httpAuthUser)).append("\n");
        sb.append("    httpAuthPassword: ").append(toIndentedString(httpAuthPassword)).append("\n");
        sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
        sb.append("    removeReason: ").append(toIndentedString(removeReason)).append("\n");
        sb.append("    lastDeliveryTime: ").append(toIndentedString(lastDeliveryTime)).append("\n");
        sb.append("    lastHttpStatus: ").append(toIndentedString(lastHttpStatus)).append("\n");
        sb.append("    adminId: ").append(toIndentedString(adminId)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code BaseWebhook} object that
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

        BaseWebhook model = (BaseWebhook) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(companyId, model.companyId) &&
        java.util.Objects.equals(ownerId, model.ownerId) &&
        java.util.Objects.equals(userId, model.userId) &&
        java.util.Objects.equals(eventAction, model.eventAction) &&
        java.util.Objects.equals(eventObject, model.eventObject) &&
        java.util.Objects.equals(subscriptionUrl, model.subscriptionUrl) &&
        java.util.Objects.equals(isActive, model.isActive) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(removeTime, model.removeTime) &&
        java.util.Objects.equals(type, model.type) &&
        java.util.Objects.equals(httpAuthUser, model.httpAuthUser) &&
        java.util.Objects.equals(httpAuthPassword, model.httpAuthPassword) &&
        java.util.Objects.equals(additionalData, model.additionalData) &&
        java.util.Objects.equals(removeReason, model.removeReason) &&
        java.util.Objects.equals(lastDeliveryTime, model.lastDeliveryTime) &&
        java.util.Objects.equals(lastHttpStatus, model.lastHttpStatus) &&
        java.util.Objects.equals(adminId, model.adminId);
    }

    /**
     * Returns a hash code for a {@code BaseWebhook}.
     *
     * @return a hash code value for a {@code BaseWebhook}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        companyId,
        ownerId,
        userId,
        eventAction,
        eventObject,
        subscriptionUrl,
        isActive,
        addTime,
        removeTime,
        type,
        httpAuthUser,
        httpAuthPassword,
        additionalData,
        removeReason,
        lastDeliveryTime,
        lastHttpStatus,
        adminId);
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
    public static class BaseWebhookQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("companyId")
        private Integer companyId;
        @jakarta.ws.rs.QueryParam("ownerId")
        private Integer ownerId;
        @jakarta.ws.rs.QueryParam("userId")
        private Integer userId;
        @jakarta.ws.rs.QueryParam("eventAction")
        private String eventAction;
        @jakarta.ws.rs.QueryParam("eventObject")
        private String eventObject;
        @jakarta.ws.rs.QueryParam("subscriptionUrl")
        private String subscriptionUrl;

    public enum IsActiveEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<IsActiveEnum> values = java.util.EnumSet.allOf(IsActiveEnum.class);

        BigDecimal value;

        IsActiveEnum (BigDecimal v) {
            value = v;
        }

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IsActiveEnum fromString(String v) {
            for (IsActiveEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private IsActiveEnum isActive = IsActiveEnum.NUMBER_1;
        @jakarta.ws.rs.QueryParam("addTime")
        private OffsetDateTime addTime;
        @jakarta.ws.rs.QueryParam("removeTime")
        private OffsetDateTime removeTime;

    public enum TypeEnum {
        GENERAL(String.valueOf("general")), APPLICATION(String.valueOf("application")), AUTOMATION(String.valueOf("automation"));

        // caching enum access
        private static final java.util.EnumSet<TypeEnum> values = java.util.EnumSet.allOf(TypeEnum.class);

        String value;

        TypeEnum (String v) {
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
        public static TypeEnum fromString(String v) {
            for (TypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private TypeEnum type;
        @jakarta.ws.rs.QueryParam("httpAuthUser")
        private String httpAuthUser;
        @jakarta.ws.rs.QueryParam("httpAuthPassword")
        private String httpAuthPassword;
        @jakarta.ws.rs.QueryParam("additionalData")
        private Object additionalData;
        @jakarta.ws.rs.QueryParam("removeReason")
        private String removeReason;
        @jakarta.ws.rs.QueryParam("lastDeliveryTime")
        private OffsetDateTime lastDeliveryTime;
        @jakarta.ws.rs.QueryParam("lastHttpStatus")
        private Integer lastHttpStatus;
        @jakarta.ws.rs.QueryParam("adminId")
        private Integer adminId;

        /**
        * The ID of the Webhook
        * @return id
        **/
        @JsonProperty("id")
        public Integer getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(Integer id) {
            this.id = id;
        }

        public BaseWebhookQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The ID of the company related to the Webhook
        * @return companyId
        **/
        @JsonProperty("company_id")
        public Integer getCompanyId() {
            return companyId;
        }

        /**
         * Set companyId
         **/
        public void setCompanyId(Integer companyId) {
            this.companyId = companyId;
        }

        public BaseWebhookQueryParam companyId(Integer companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
        * The ID of the user who owns the Webhook
        * @return ownerId
        **/
        @JsonProperty("owner_id")
        public Integer getOwnerId() {
            return ownerId;
        }

        /**
         * Set ownerId
         **/
        public void setOwnerId(Integer ownerId) {
            this.ownerId = ownerId;
        }

        public BaseWebhookQueryParam ownerId(Integer ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
        * The ID of the user related to the Webhook
        * @return userId
        **/
        @JsonProperty("user_id")
        public Integer getUserId() {
            return userId;
        }

        /**
         * Set userId
         **/
        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public BaseWebhookQueryParam userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        /**
        * The Webhook action
        * @return eventAction
        **/
        @JsonProperty("event_action")
        public String getEventAction() {
            return eventAction;
        }

        /**
         * Set eventAction
         **/
        public void setEventAction(String eventAction) {
            this.eventAction = eventAction;
        }

        public BaseWebhookQueryParam eventAction(String eventAction) {
            this.eventAction = eventAction;
            return this;
        }

        /**
        * The Webhook object
        * @return eventObject
        **/
        @JsonProperty("event_object")
        public String getEventObject() {
            return eventObject;
        }

        /**
         * Set eventObject
         **/
        public void setEventObject(String eventObject) {
            this.eventObject = eventObject;
        }

        public BaseWebhookQueryParam eventObject(String eventObject) {
            this.eventObject = eventObject;
            return this;
        }

        /**
        * The subscription URL of the Webhook
        * @return subscriptionUrl
        **/
        @JsonProperty("subscription_url")
        public String getSubscriptionUrl() {
            return subscriptionUrl;
        }

        /**
         * Set subscriptionUrl
         **/
        public void setSubscriptionUrl(String subscriptionUrl) {
            this.subscriptionUrl = subscriptionUrl;
        }

        public BaseWebhookQueryParam subscriptionUrl(String subscriptionUrl) {
            this.subscriptionUrl = subscriptionUrl;
            return this;
        }

        /**
        * Get isActive
        * @return isActive
        **/
        @JsonProperty("is_active")
        public IsActiveEnum getIsActive() {
            return isActive;
        }

        /**
         * Set isActive
         **/
        public void setIsActive(IsActiveEnum isActive) {
            this.isActive = isActive;
        }

        public BaseWebhookQueryParam isActive(IsActiveEnum isActive) {
            this.isActive = isActive;
            return this;
        }

        /**
        * The date when the Webhook was added
        * @return addTime
        **/
        @JsonProperty("add_time")
        public OffsetDateTime getAddTime() {
            return addTime;
        }

        /**
         * Set addTime
         **/
        public void setAddTime(OffsetDateTime addTime) {
            this.addTime = addTime;
        }

        public BaseWebhookQueryParam addTime(OffsetDateTime addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The date when the Webhook was removed (if removed)
        * @return removeTime
        **/
        @JsonProperty("remove_time")
        public OffsetDateTime getRemoveTime() {
            return removeTime;
        }

        /**
         * Set removeTime
         **/
        public void setRemoveTime(OffsetDateTime removeTime) {
            this.removeTime = removeTime;
        }

        public BaseWebhookQueryParam removeTime(OffsetDateTime removeTime) {
            this.removeTime = removeTime;
            return this;
        }

        /**
        * The type of the Webhook
        * @return type
        **/
        @JsonProperty("type")
        public TypeEnum getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(TypeEnum type) {
            this.type = type;
        }

        public BaseWebhookQueryParam type(TypeEnum type) {
            this.type = type;
            return this;
        }

        /**
        * The username of the `subscription_url` of the Webhook
        * @return httpAuthUser
        **/
        @JsonProperty("http_auth_user")
        public String getHttpAuthUser() {
            return httpAuthUser;
        }

        /**
         * Set httpAuthUser
         **/
        public void setHttpAuthUser(String httpAuthUser) {
            this.httpAuthUser = httpAuthUser;
        }

        public BaseWebhookQueryParam httpAuthUser(String httpAuthUser) {
            this.httpAuthUser = httpAuthUser;
            return this;
        }

        /**
        * The password of the `subscription_url` of the Webhook
        * @return httpAuthPassword
        **/
        @JsonProperty("http_auth_password")
        public String getHttpAuthPassword() {
            return httpAuthPassword;
        }

        /**
         * Set httpAuthPassword
         **/
        public void setHttpAuthPassword(String httpAuthPassword) {
            this.httpAuthPassword = httpAuthPassword;
        }

        public BaseWebhookQueryParam httpAuthPassword(String httpAuthPassword) {
            this.httpAuthPassword = httpAuthPassword;
            return this;
        }

        /**
        * Any additional data related to the Webhook
        * @return additionalData
        **/
        @JsonProperty("additional_data")
        public Object getAdditionalData() {
            return additionalData;
        }

        /**
         * Set additionalData
         **/
        public void setAdditionalData(Object additionalData) {
            this.additionalData = additionalData;
        }

        public BaseWebhookQueryParam additionalData(Object additionalData) {
            this.additionalData = additionalData;
            return this;
        }

        /**
        * The removal reason of the Webhook (if removed)
        * @return removeReason
        **/
        @JsonProperty("remove_reason")
        public String getRemoveReason() {
            return removeReason;
        }

        /**
         * Set removeReason
         **/
        public void setRemoveReason(String removeReason) {
            this.removeReason = removeReason;
        }

        public BaseWebhookQueryParam removeReason(String removeReason) {
            this.removeReason = removeReason;
            return this;
        }

        /**
        * The last delivery time of the Webhook
        * @return lastDeliveryTime
        **/
        @JsonProperty("last_delivery_time")
        public OffsetDateTime getLastDeliveryTime() {
            return lastDeliveryTime;
        }

        /**
         * Set lastDeliveryTime
         **/
        public void setLastDeliveryTime(OffsetDateTime lastDeliveryTime) {
            this.lastDeliveryTime = lastDeliveryTime;
        }

        public BaseWebhookQueryParam lastDeliveryTime(OffsetDateTime lastDeliveryTime) {
            this.lastDeliveryTime = lastDeliveryTime;
            return this;
        }

        /**
        * The last delivery HTTP status of the Webhook
        * @return lastHttpStatus
        **/
        @JsonProperty("last_http_status")
        public Integer getLastHttpStatus() {
            return lastHttpStatus;
        }

        /**
         * Set lastHttpStatus
         **/
        public void setLastHttpStatus(Integer lastHttpStatus) {
            this.lastHttpStatus = lastHttpStatus;
        }

        public BaseWebhookQueryParam lastHttpStatus(Integer lastHttpStatus) {
            this.lastHttpStatus = lastHttpStatus;
            return this;
        }

        /**
        * The ID of the admin of the Webhook
        * @return adminId
        **/
        @JsonProperty("admin_id")
        public Integer getAdminId() {
            return adminId;
        }

        /**
         * Set adminId
         **/
        public void setAdminId(Integer adminId) {
            this.adminId = adminId;
        }

        public BaseWebhookQueryParam adminId(Integer adminId) {
            this.adminId = adminId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class BaseWebhookQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
            sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
            sb.append("    eventAction: ").append(toIndentedString(eventAction)).append("\n");
            sb.append("    eventObject: ").append(toIndentedString(eventObject)).append("\n");
            sb.append("    subscriptionUrl: ").append(toIndentedString(subscriptionUrl)).append("\n");
            sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    removeTime: ").append(toIndentedString(removeTime)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    httpAuthUser: ").append(toIndentedString(httpAuthUser)).append("\n");
            sb.append("    httpAuthPassword: ").append(toIndentedString(httpAuthPassword)).append("\n");
            sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
            sb.append("    removeReason: ").append(toIndentedString(removeReason)).append("\n");
            sb.append("    lastDeliveryTime: ").append(toIndentedString(lastDeliveryTime)).append("\n");
            sb.append("    lastHttpStatus: ").append(toIndentedString(lastHttpStatus)).append("\n");
            sb.append("    adminId: ").append(toIndentedString(adminId)).append("\n");
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
