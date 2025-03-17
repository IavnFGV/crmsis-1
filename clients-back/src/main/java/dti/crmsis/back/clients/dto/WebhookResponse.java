package dti.crmsis.back.clients.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class WebhookResponse {

    private String status;
    private boolean success;
    private List<WebhookData> data;

    // Getters and Setters
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<WebhookData> getData() {
        return data;
    }

    public void setData(List<WebhookData> data) {
        this.data = data;
    }

    public static class WebhookData {

        private long id;
        @JsonProperty("company_id")
        private long companyId;
        @JsonProperty("owner_id")
        private long ownerId;
        @JsonProperty("user_id")
        private long userId;
        @JsonProperty("event_action")
        private String eventAction;
        @JsonProperty("event_object")
        private String eventObject;
        @JsonProperty("subscription_url")
        private String subscriptionUrl;
        @JsonProperty("is_active")
        private int isActive;
        @JsonProperty("add_time")
        private String addTime;
        @JsonProperty("remove_time")
        private String removeTime;
        private String type;
        @JsonProperty("http_auth_user")
        private String httpAuthUser;
        @JsonProperty("http_auth_password")
        private String httpAuthPassword;
        @JsonProperty("remove_reason")
        private String removeReason;
        private String version;
        private String name;
        @JsonProperty("last_delivery_time")
        private String lastDeliveryTime;
        @JsonProperty("last_http_status")
        private String lastHttpStatus;
        @JsonProperty("admin_id")
        private long adminId;

        // Getters and Setters
        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public long getCompanyId() {
            return companyId;
        }

        public void setCompanyId(long companyId) {
            this.companyId = companyId;
        }

        public long getOwnerId() {
            return ownerId;
        }

        public void setOwnerId(long ownerId) {
            this.ownerId = ownerId;
        }

        public long getUserId() {
            return userId;
        }

        public void setUserId(long userId) {
            this.userId = userId;
        }

        public String getEventAction() {
            return eventAction;
        }

        public void setEventAction(String eventAction) {
            this.eventAction = eventAction;
        }

        public String getEventObject() {
            return eventObject;
        }

        public void setEventObject(String eventObject) {
            this.eventObject = eventObject;
        }

        public String getSubscriptionUrl() {
            return subscriptionUrl;
        }

        public void setSubscriptionUrl(String subscriptionUrl) {
            this.subscriptionUrl = subscriptionUrl;
        }

        public int getIsActive() {
            return isActive;
        }

        public void setIsActive(int isActive) {
            this.isActive = isActive;
        }

        public String getAddTime() {
            return addTime;
        }

        public void setAddTime(String addTime) {
            this.addTime = addTime;
        }

        public String getRemoveTime() {
            return removeTime;
        }

        public void setRemoveTime(String removeTime) {
            this.removeTime = removeTime;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getHttpAuthUser() {
            return httpAuthUser;
        }

        public void setHttpAuthUser(String httpAuthUser) {
            this.httpAuthUser = httpAuthUser;
        }

        public String getHttpAuthPassword() {
            return httpAuthPassword;
        }

        public void setHttpAuthPassword(String httpAuthPassword) {
            this.httpAuthPassword = httpAuthPassword;
        }

        public String getRemoveReason() {
            return removeReason;
        }

        public void setRemoveReason(String removeReason) {
            this.removeReason = removeReason;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastDeliveryTime() {
            return lastDeliveryTime;
        }

        public void setLastDeliveryTime(String lastDeliveryTime) {
            this.lastDeliveryTime = lastDeliveryTime;
        }

        public String getLastHttpStatus() {
            return lastHttpStatus;
        }

        public void setLastHttpStatus(String lastHttpStatus) {
            this.lastHttpStatus = lastHttpStatus;
        }

        public long getAdminId() {
            return adminId;
        }

        public void setAdminId(long adminId) {
            this.adminId = adminId;
        }
    }
}
