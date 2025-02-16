package dti.crmsis.back.clients.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import java.util.List;

public class PipelineResponse {

    @JsonProperty("success")
    private boolean success;

    @JsonProperty("data")
    private List<Pipeline> data;

    @JsonProperty("additional_data")
    private AdditionalData additionalData;

    public boolean isSuccess() {
        return success;
    }

    public List<Pipeline> getData() {
        return data;
    }

    public String getNextCursor() {
        return additionalData != null ? additionalData.nextCursor : null;
    }

    public static class Pipeline {
        @JsonProperty("id")
        private Long id;

        @JsonProperty("name")
        private String name;

        @JsonProperty("order_nr")
        private Integer orderNr;

        @JsonProperty("is_deleted")
        private Boolean isDeleted;

        @JsonProperty("is_deal_probability_enabled")
        private Boolean isDealProbabilityEnabled;

        @JsonProperty("add_time")
        private LocalDateTime addTime;

        @JsonProperty("update_time")
        private LocalDateTime updateTime;

        @JsonProperty("is_selected")
        private Boolean isSelected;

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public Integer getOrderNr() {
            return orderNr;
        }

        public Boolean getIsDeleted() {
            return isDeleted;
        }

        public Boolean getIsDealProbabilityEnabled() {
            return isDealProbabilityEnabled;
        }

        public LocalDateTime getAddTime() {
            return addTime;
        }

        public LocalDateTime getUpdateTime() {
            return updateTime;
        }

        public Boolean getIsSelected() {
            return isSelected;
        }
    }

    public static class AdditionalData {
        @JsonProperty("next_cursor")
        private String nextCursor;

        public String getNextCursor() {
            return nextCursor;
        }
    }
}

