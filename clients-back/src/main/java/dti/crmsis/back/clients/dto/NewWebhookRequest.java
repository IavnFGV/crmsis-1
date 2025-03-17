package dti.crmsis.back.clients.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record NewWebhookRequest(
        @JsonProperty("subscription_url") String subscriptionUrl,
        @JsonProperty("event_action") String eventAction,
        @JsonProperty("event_object") String eventObject,
        @JsonProperty("user_id") Integer userId,
        @JsonProperty("http_auth_user") String httpAuthUser,
        @JsonProperty("http_auth_password") String httpAuthPassword,
        @JsonProperty("version") String version
) {
    public NewWebhookRequest(String subscriptionUrl) {
        this(subscriptionUrl, "*", "*", null, null, null, "2.0");
    }
}