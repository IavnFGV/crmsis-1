package dti.crmsis.back.clients.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import java.util.List;

public class OrganizationFieldsResponse {

    @JsonProperty("success")
    private boolean success;

    @JsonProperty("data")
    private List<OrganizationField> data;

    @JsonProperty("additional_data")
    private AdditionalData additionalData;

    public boolean isSuccess() {
        return success;
    }

    public List<OrganizationField> getData() {
        return data;
    }

    public AdditionalData getAdditionalData() {
        return additionalData;
    }

    public static class OrganizationField {
        @JsonProperty("id")
        private Long id;

        @JsonProperty("key")
        private String key;

        @JsonProperty("name")
        private String name;

        @JsonProperty("order_nr")
        private Integer orderNr;

        @JsonProperty("field_type")
        private String fieldType;

        @JsonProperty("add_time")
        private LocalDateTime addTime;

        @JsonProperty("update_time")
        private LocalDateTime updateTime;

        @JsonProperty("last_updated_by_user_id")
        private Long lastUpdatedByUserId;

        @JsonProperty("created_by_user_id")
        private Long createdByUserId;

        @JsonProperty("active_flag")
        private Boolean activeFlag;

        @JsonProperty("edit_flag")
        private Boolean editFlag;

        @JsonProperty("index_visible_flag")
        private Boolean indexVisibleFlag;

        @JsonProperty("details_visible_flag")
        private Boolean detailsVisibleFlag;

        @JsonProperty("add_visible_flag")
        private Boolean addVisibleFlag;

        @JsonProperty("important_flag")
        private Boolean importantFlag;

        @JsonProperty("bulk_edit_allowed")
        private Boolean bulkEditAllowed;

        @JsonProperty("searchable_flag")
        private Boolean searchableFlag;

        @JsonProperty("filtering_allowed")
        private Boolean filteringAllowed;

        @JsonProperty("sortable_flag")
        private Boolean sortableFlag;

        @JsonProperty("options")
        private List<FieldOption> options;

        @JsonProperty("mandatory_flag")
        private Boolean mandatoryFlag;

        public Long getId() {
            return id;
        }

        public String getKey() {
            return key;
        }

        public String getName() {
            return name;
        }

        public Integer getOrderNr() {
            return orderNr;
        }

        public String getFieldType() {
            return fieldType;
        }

        public LocalDateTime getAddTime() {
            return addTime;
        }

        public LocalDateTime getUpdateTime() {
            return updateTime;
        }

        public Long getLastUpdatedByUserId() {
            return lastUpdatedByUserId;
        }

        public Long getCreatedByUserId() {
            return createdByUserId;
        }

        public Boolean getActiveFlag() {
            return activeFlag;
        }

        public Boolean getEditFlag() {
            return editFlag;
        }

        public Boolean getIndexVisibleFlag() {
            return indexVisibleFlag;
        }

        public Boolean getDetailsVisibleFlag() {
            return detailsVisibleFlag;
        }

        public Boolean getAddVisibleFlag() {
            return addVisibleFlag;
        }

        public Boolean getImportantFlag() {
            return importantFlag;
        }

        public Boolean getBulkEditAllowed() {
            return bulkEditAllowed;
        }

        public Boolean getSearchableFlag() {
            return searchableFlag;
        }

        public Boolean getFilteringAllowed() {
            return filteringAllowed;
        }

        public Boolean getSortableFlag() {
            return sortableFlag;
        }

        public List<FieldOption> getOptions() {
            return options;
        }

        public Boolean getMandatoryFlag() {
            return mandatoryFlag;
        }
    }

    public static class FieldOption {
        @JsonProperty("id")
        private Long id;

        @JsonProperty("label")
        private String label;

        public Long getId() {
            return id;
        }

        public String getLabel() {
            return label;
        }
    }

    public static class AdditionalData {
        @JsonProperty("pagination")
        private Pagination pagination;

        public Pagination getPagination() {
            return pagination;
        }
    }

    public static class Pagination {
        @JsonProperty("start")
        private Integer start;

        @JsonProperty("limit")
        private Integer limit;

        @JsonProperty("more_items_in_collection")
        private Boolean moreItemsInCollection;

        public Integer getStart() {
            return start;
        }

        public Integer getLimit() {
            return limit;
        }

        public Boolean getMoreItemsInCollection() {
            return moreItemsInCollection;
        }
    }
}
