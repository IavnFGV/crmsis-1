package dti.crmsis.back.clients.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import java.util.Map;

public class WebhookRegistrationResponse {

    @JsonProperty("status")
    private String status;

    @JsonProperty("success")
    private boolean success;

    @JsonProperty("data")
    private WebhookData data;

    public static class WebhookData {
        @JsonProperty("id")
        private Long id;

        @JsonProperty("company_id")
        private Long companyId;

        @JsonProperty("owner_id")
        private Long ownerId;

        @JsonProperty("user_id")
        private Long userId;

        @JsonProperty("event_action")
        private String eventAction;

        @JsonProperty("event_object")
        private String eventObject;

        @JsonProperty("subscription_url")
        private String subscriptionUrl;

        @JsonProperty("version")
        private String version;

        @JsonProperty("is_active")
        private Integer isActive;

        @JsonProperty("add_time")
        private LocalDateTime addTime;

        @JsonProperty("remove_time")
        private LocalDateTime removeTime;

        @JsonProperty("type")
        private String type;

        @JsonProperty("http_auth_user")
        private String httpAuthUser;

        @JsonProperty("http_auth_password")
        private String httpAuthPassword;

        @JsonProperty("additional_data")
        private Map<String, Object> additionalData;

        @JsonProperty("remove_reason")
        private String removeReason;

        @JsonProperty("last_delivery_time")
        private LocalDateTime lastDeliveryTime;

        @JsonProperty("last_http_status")
        private Integer lastHttpStatus;

        @JsonProperty("admin_id")
        private Long adminId;
    }
}
