package dti.crmsis.back.clients.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class StageResponse {

    @JsonProperty("success")
    private boolean success;

    @JsonProperty("data")
    private List<Stage> data;

    @JsonProperty("additional_data")
    private AdditionalData additionalData;

    public boolean isSuccess() {
        return success;
    }

    public List<Stage> getData() {
        return data;
    }

    public String getNextCursor() {
        return additionalData != null ? additionalData.nextCursor : null;
    }

    public static class AdditionalData {
        @JsonProperty("next_cursor")
        private String nextCursor;
    }

    public static class Stage {
        @JsonProperty("id")
        private Long id;

        @JsonProperty("order_nr")
        private Integer orderNr;

        @JsonProperty("name")
        private String name;

        @JsonProperty("is_deleted")
        private Boolean isDeleted;

        @JsonProperty("deal_probability")
        private Integer dealProbability;

        @JsonProperty("pipeline_id")
        private Long pipelineId;

        @JsonProperty("is_deal_rot_enabled")
        private Boolean isDealRotEnabled;

        @JsonProperty("days_to_rotten")
        private Integer daysToRotten;

        @JsonProperty("add_time")
        private String addTime;

        @JsonProperty("update_time")
        private String updateTime;

        public Long getId() {
            return id;
        }

        public Integer getOrderNr() {
            return orderNr;
        }

        public String getName() {
            return name;
        }

        public Boolean getDeleted() {
            return isDeleted;
        }

        public Integer getDealProbability() {
            return dealProbability;
        }

        public Long getPipelineId() {
            return pipelineId;
        }

        public Boolean getDealRotEnabled() {
            return isDealRotEnabled;
        }

        public Integer getDaysToRotten() {
            return daysToRotten;
        }

        public String getAddTime() {
            return addTime;
        }

        public String getUpdateTime() {
            return updateTime;
        }
    }
}
