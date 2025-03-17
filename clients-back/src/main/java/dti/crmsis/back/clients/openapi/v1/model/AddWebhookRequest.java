package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddWebhookRequest  {

    /**
      * A full, valid, publicly accessible URL which determines where to send the notifications. Please note that you cannot use Pipedrive API endpoints as the `subscription_url` and the chosen URL must not redirect to another link.
     **/
    private String subscriptionUrl;

    public enum EventActionEnum {
        ADDED(String.valueOf("added")), UPDATED(String.valueOf("updated")), MERGED(String.valueOf("merged")), DELETED(String.valueOf("deleted")), STAR_SYMBOL(String.valueOf("*"));

        // caching enum access
        private static final java.util.EnumSet<EventActionEnum> values = java.util.EnumSet.allOf(EventActionEnum.class);

        String value;

        EventActionEnum (String v) {
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
        public static EventActionEnum fromString(String v) {
            for (EventActionEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    /**
      * The type of action to receive notifications about. Wildcard will match all supported actions.
     **/
    private EventActionEnum eventAction;

    public enum EventObjectEnum {
        ACTIVITY(String.valueOf("activity")), ACTIVITYTYPE(String.valueOf("activityType")), DEAL(String.valueOf("deal")), NOTE(String.valueOf("note")), ORGANIZATION(String.valueOf("organization")), PERSON(String.valueOf("person")), PIPELINE(String.valueOf("pipeline")), PRODUCT(String.valueOf("product")), STAGE(String.valueOf("stage")), USER(String.valueOf("user")), STAR_SYMBOL(String.valueOf("*"));

        // caching enum access
        private static final java.util.EnumSet<EventObjectEnum> values = java.util.EnumSet.allOf(EventObjectEnum.class);

        String value;

        EventObjectEnum (String v) {
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
        public static EventObjectEnum fromString(String v) {
            for (EventObjectEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    /**
      * The type of object to receive notifications about. Wildcard will match all supported objects.
     **/
    private EventObjectEnum eventObject;
    /**
      * The ID of the user that this webhook will be authorized with. You have the option to use a different user's `user_id`. If it is not set, the current user's `user_id` will be used. As each webhook event is checked against a user's permissions, the webhook will only be sent if the user has access to the specified object(s). If you want to receive notifications for all events, please use a top-level admin user’s `user_id`.
     **/
    private Integer userId;
    /**
      * The HTTP basic auth username of the subscription URL endpoint (if required)
     **/
    private String httpAuthUser;
    /**
      * The HTTP basic auth password of the subscription URL endpoint (if required)
     **/
    private String httpAuthPassword;

    public enum VersionEnum {
        PERIOD_1_0(String.valueOf("1.0")), PERIOD_2_0(String.valueOf("2.0"));

        // caching enum access
        private static final java.util.EnumSet<VersionEnum> values = java.util.EnumSet.allOf(VersionEnum.class);

        String value;

        VersionEnum (String v) {
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
        public static VersionEnum fromString(String v) {
            for (VersionEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    /**
      * The webhook's version. NB! Webhooks v2 will become the default from March 17th, 2025. See <a href=\"https://developers.pipedrive.com/changelog/post/breaking-change-webhooks-v2-will-become-the-new-default-version\" target=\"_blank\" rel=\"noopener noreferrer\">this Changelog post</a> for more details.
     **/
    private VersionEnum version = VersionEnum.PERIOD_1_0;

    /**
    * A full, valid, publicly accessible URL which determines where to send the notifications. Please note that you cannot use Pipedrive API endpoints as the `subscription_url` and the chosen URL must not redirect to another link.
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

    public AddWebhookRequest subscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
        return this;
    }

    /**
    * The type of action to receive notifications about. Wildcard will match all supported actions.
    * @return eventAction
    **/
    @JsonProperty("event_action")
    public EventActionEnum getEventAction() {
        return eventAction;
    }

    /**
     * Set eventAction
     **/
    public void setEventAction(EventActionEnum eventAction) {
        this.eventAction = eventAction;
    }

    public AddWebhookRequest eventAction(EventActionEnum eventAction) {
        this.eventAction = eventAction;
        return this;
    }

    /**
    * The type of object to receive notifications about. Wildcard will match all supported objects.
    * @return eventObject
    **/
    @JsonProperty("event_object")
    public EventObjectEnum getEventObject() {
        return eventObject;
    }

    /**
     * Set eventObject
     **/
    public void setEventObject(EventObjectEnum eventObject) {
        this.eventObject = eventObject;
    }

    public AddWebhookRequest eventObject(EventObjectEnum eventObject) {
        this.eventObject = eventObject;
        return this;
    }

    /**
    * The ID of the user that this webhook will be authorized with. You have the option to use a different user's `user_id`. If it is not set, the current user's `user_id` will be used. As each webhook event is checked against a user's permissions, the webhook will only be sent if the user has access to the specified object(s). If you want to receive notifications for all events, please use a top-level admin user’s `user_id`.
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

    public AddWebhookRequest userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
    * The HTTP basic auth username of the subscription URL endpoint (if required)
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

    public AddWebhookRequest httpAuthUser(String httpAuthUser) {
        this.httpAuthUser = httpAuthUser;
        return this;
    }

    /**
    * The HTTP basic auth password of the subscription URL endpoint (if required)
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

    public AddWebhookRequest httpAuthPassword(String httpAuthPassword) {
        this.httpAuthPassword = httpAuthPassword;
        return this;
    }

    /**
    * The webhook's version. NB! Webhooks v2 will become the default from March 17th, 2025. See <a href=\"https://developers.pipedrive.com/changelog/post/breaking-change-webhooks-v2-will-become-the-new-default-version\" target=\"_blank\" rel=\"noopener noreferrer\">this Changelog post</a> for more details.
    * @return version
    **/
    @JsonProperty("version")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VersionEnum getVersion() {
        return version;
    }

    /**
     * Set version
     **/
    public void setVersion(VersionEnum version) {
        this.version = version;
    }

    public AddWebhookRequest version(VersionEnum version) {
        this.version = version;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddWebhookRequest {\n");

        sb.append("    subscriptionUrl: ").append(toIndentedString(subscriptionUrl)).append("\n");
        sb.append("    eventAction: ").append(toIndentedString(eventAction)).append("\n");
        sb.append("    eventObject: ").append(toIndentedString(eventObject)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    httpAuthUser: ").append(toIndentedString(httpAuthUser)).append("\n");
        sb.append("    httpAuthPassword: ").append(toIndentedString(httpAuthPassword)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddWebhookRequest} object that
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

        AddWebhookRequest model = (AddWebhookRequest) obj;

        return java.util.Objects.equals(subscriptionUrl, model.subscriptionUrl) &&
        java.util.Objects.equals(eventAction, model.eventAction) &&
        java.util.Objects.equals(eventObject, model.eventObject) &&
        java.util.Objects.equals(userId, model.userId) &&
        java.util.Objects.equals(httpAuthUser, model.httpAuthUser) &&
        java.util.Objects.equals(httpAuthPassword, model.httpAuthPassword) &&
        java.util.Objects.equals(version, model.version);
    }

    /**
     * Returns a hash code for a {@code AddWebhookRequest}.
     *
     * @return a hash code value for a {@code AddWebhookRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(subscriptionUrl,
        eventAction,
        eventObject,
        userId,
        httpAuthUser,
        httpAuthPassword,
        version);
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
    public static class AddWebhookRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("subscriptionUrl")
        private String subscriptionUrl;

    public enum EventActionEnum {
        ADDED(String.valueOf("added")), UPDATED(String.valueOf("updated")), MERGED(String.valueOf("merged")), DELETED(String.valueOf("deleted")), STAR_SYMBOL(String.valueOf("*"));

        // caching enum access
        private static final java.util.EnumSet<EventActionEnum> values = java.util.EnumSet.allOf(EventActionEnum.class);

        String value;

        EventActionEnum (String v) {
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
        public static EventActionEnum fromString(String v) {
            for (EventActionEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private EventActionEnum eventAction;

    public enum EventObjectEnum {
        ACTIVITY(String.valueOf("activity")), ACTIVITYTYPE(String.valueOf("activityType")), DEAL(String.valueOf("deal")), NOTE(String.valueOf("note")), ORGANIZATION(String.valueOf("organization")), PERSON(String.valueOf("person")), PIPELINE(String.valueOf("pipeline")), PRODUCT(String.valueOf("product")), STAGE(String.valueOf("stage")), USER(String.valueOf("user")), STAR_SYMBOL(String.valueOf("*"));

        // caching enum access
        private static final java.util.EnumSet<EventObjectEnum> values = java.util.EnumSet.allOf(EventObjectEnum.class);

        String value;

        EventObjectEnum (String v) {
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
        public static EventObjectEnum fromString(String v) {
            for (EventObjectEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private EventObjectEnum eventObject;
        @jakarta.ws.rs.QueryParam("userId")
        private Integer userId;
        @jakarta.ws.rs.QueryParam("httpAuthUser")
        private String httpAuthUser;
        @jakarta.ws.rs.QueryParam("httpAuthPassword")
        private String httpAuthPassword;

    public enum VersionEnum {
        PERIOD_1_0(String.valueOf("1.0")), PERIOD_2_0(String.valueOf("2.0"));

        // caching enum access
        private static final java.util.EnumSet<VersionEnum> values = java.util.EnumSet.allOf(VersionEnum.class);

        String value;

        VersionEnum (String v) {
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
        public static VersionEnum fromString(String v) {
            for (VersionEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private VersionEnum version = VersionEnum.PERIOD_1_0;

        /**
        * A full, valid, publicly accessible URL which determines where to send the notifications. Please note that you cannot use Pipedrive API endpoints as the `subscription_url` and the chosen URL must not redirect to another link.
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

        public AddWebhookRequestQueryParam subscriptionUrl(String subscriptionUrl) {
            this.subscriptionUrl = subscriptionUrl;
            return this;
        }

        /**
        * The type of action to receive notifications about. Wildcard will match all supported actions.
        * @return eventAction
        **/
        @JsonProperty("event_action")
        public EventActionEnum getEventAction() {
            return eventAction;
        }

        /**
         * Set eventAction
         **/
        public void setEventAction(EventActionEnum eventAction) {
            this.eventAction = eventAction;
        }

        public AddWebhookRequestQueryParam eventAction(EventActionEnum eventAction) {
            this.eventAction = eventAction;
            return this;
        }

        /**
        * The type of object to receive notifications about. Wildcard will match all supported objects.
        * @return eventObject
        **/
        @JsonProperty("event_object")
        public EventObjectEnum getEventObject() {
            return eventObject;
        }

        /**
         * Set eventObject
         **/
        public void setEventObject(EventObjectEnum eventObject) {
            this.eventObject = eventObject;
        }

        public AddWebhookRequestQueryParam eventObject(EventObjectEnum eventObject) {
            this.eventObject = eventObject;
            return this;
        }

        /**
        * The ID of the user that this webhook will be authorized with. You have the option to use a different user's `user_id`. If it is not set, the current user's `user_id` will be used. As each webhook event is checked against a user's permissions, the webhook will only be sent if the user has access to the specified object(s). If you want to receive notifications for all events, please use a top-level admin user’s `user_id`.
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

        public AddWebhookRequestQueryParam userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        /**
        * The HTTP basic auth username of the subscription URL endpoint (if required)
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

        public AddWebhookRequestQueryParam httpAuthUser(String httpAuthUser) {
            this.httpAuthUser = httpAuthUser;
            return this;
        }

        /**
        * The HTTP basic auth password of the subscription URL endpoint (if required)
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

        public AddWebhookRequestQueryParam httpAuthPassword(String httpAuthPassword) {
            this.httpAuthPassword = httpAuthPassword;
            return this;
        }

        /**
        * The webhook's version. NB! Webhooks v2 will become the default from March 17th, 2025. See <a href=\"https://developers.pipedrive.com/changelog/post/breaking-change-webhooks-v2-will-become-the-new-default-version\" target=\"_blank\" rel=\"noopener noreferrer\">this Changelog post</a> for more details.
        * @return version
        **/
        @JsonProperty("version")
        public VersionEnum getVersion() {
            return version;
        }

        /**
         * Set version
         **/
        public void setVersion(VersionEnum version) {
            this.version = version;
        }

        public AddWebhookRequestQueryParam version(VersionEnum version) {
            this.version = version;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddWebhookRequestQueryParam {\n");

            sb.append("    subscriptionUrl: ").append(toIndentedString(subscriptionUrl)).append("\n");
            sb.append("    eventAction: ").append(toIndentedString(eventAction)).append("\n");
            sb.append("    eventObject: ").append(toIndentedString(eventObject)).append("\n");
            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
            sb.append("    httpAuthUser: ").append(toIndentedString(httpAuthUser)).append("\n");
            sb.append("    httpAuthPassword: ").append(toIndentedString(httpAuthPassword)).append("\n");
            sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
