package dti.crmsis.back.clients.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

public class DealResponse {

    @JsonProperty("success")
    private boolean success;

    @JsonProperty("data")
    private List<Deal> data;

    @JsonProperty("additional_data")
    private AdditionalData additionalData;

    public boolean isSuccess() { return success; }
    public List<Deal> getData() { return data; }
    public String getNextCursor() {
        return additionalData != null ? additionalData.nextCursor : null;
    }

    public static class AdditionalData {
        @JsonProperty("next_cursor")
        private String nextCursor;
    }

    public static class Deal {
        @JsonProperty("id")
        private Long id;

        @JsonProperty("title")
        private String title;

        @JsonProperty("creator_user_id")
        private Long creatorUserId;

        @JsonProperty("owner_id")
        private Long ownerId;

        @JsonProperty("value")
        private Double value;

        @JsonProperty("person_id")
        private Long personId;

        @JsonProperty("org_id")
        private Long organizationId;

        @JsonProperty("stage_id")
        private Long stageId;

        @JsonProperty("pipeline_id")
        private Long pipelineId;

        @JsonProperty("currency")
        private String currency;

        @JsonProperty("add_time")
        private String addTime;

        @JsonProperty("update_time")
        private String updateTime;

        @JsonProperty("stage_change_time")
        private String stageChangeTime;

        @JsonProperty("status")
        private String status;

        @JsonProperty("is_deleted")
        private Boolean isDeleted;

        @JsonProperty("probability")
        private Integer probability;

        @JsonProperty("lost_reason")
        private String lostReason;

        @JsonProperty("visible_to")
        private Integer visibleTo;

        @JsonProperty("close_time")
        private String closeTime;

        @JsonProperty("won_time")
        private String wonTime;

        @JsonProperty("lost_time")
        private String lostTime;

        @JsonProperty("local_won_date")
        private String localWonDate;

        @JsonProperty("local_lost_date")
        private String localLostDate;

        @JsonProperty("local_close_date")
        private String localCloseDate;

        @JsonProperty("expected_close_date")
        private String expectedCloseDate;

        @JsonProperty("label_ids")
        private List<String> labelIds;

        @JsonProperty("origin")
        private String origin;

        @JsonProperty("origin_id")
        private String originId;

        @JsonProperty("channel")
        private Integer channel;

        @JsonProperty("channel_id")
        private String channelId;

        @JsonProperty("acv")
        private Integer acv;

        @JsonProperty("arr")
        private Integer arr;

        @JsonProperty("mrr")
        private Integer mrr;

        @JsonProperty("custom_fields")
        private Map<String, Object> customFields;

        public Long getId() { return id; }
        public String getTitle() { return title; }
        public Long getCreatorUserId() { return creatorUserId; }
        public Long getOwnerId() { return ownerId; }
        public Double getValue() { return value; }
        public Long getPersonId() { return personId; }
        public Long getOrganizationId() { return organizationId; }
        public Long getStageId() { return stageId; }
        public Long getPipelineId() { return pipelineId; }
        public String getCurrency() { return currency; }
        public String getAddTime() { return addTime; }
        public String getUpdateTime() { return updateTime; }
        public String getStageChangeTime() { return stageChangeTime; }
        public String getStatus() { return status; }
        public Boolean getIsDeleted() { return isDeleted; }
        public Integer getProbability() { return probability; }
        public String getLostReason() { return lostReason; }
        public Integer getVisibleTo() { return visibleTo; }
        public String getCloseTime() { return closeTime; }
        public String getWonTime() { return wonTime; }
        public String getLostTime() { return lostTime; }
        public String getLocalWonDate() { return localWonDate; }
        public String getLocalLostDate() { return localLostDate; }
        public String getLocalCloseDate() { return localCloseDate; }
        public String getExpectedCloseDate() { return expectedCloseDate; }
        public List<String> getLabelIds() { return labelIds; }
        public String getOrigin() { return origin; }
        public String getOriginId() { return originId; }
        public Integer getChannel() { return channel; }
        public String getChannelId() { return channelId; }
        public Integer getAcv() { return acv; }
        public Integer getArr() { return arr; }
        public Integer getMrr() { return mrr; }
        public Map<String, Object> getCustomFields() {
            return customFields;
        }
    }
}
