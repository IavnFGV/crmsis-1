package dti.crmsis.back.clients.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DealFieldsResponse {

    @JsonProperty("success")
    public boolean success;

    @JsonProperty("data")
    public List<DealField> data;

    public List<DealField> getData() {
        return data;
    }

    @JsonProperty("additional_data")
    public AdditionalData additionalData;


    public static class DealField {
        @JsonProperty("id")
        public Long id;

        public Long getId() {
            return id;
        }

        @JsonProperty("key")
        public String key;

        @JsonProperty("name")
        public String name;

        @JsonProperty("group_id")
        public Integer groupId;

        @JsonProperty("order_nr")
        public Integer orderNr;

        @JsonProperty("field_type")
        public String fieldType;

        @JsonProperty("json_column_flag")
        public boolean jsonColumnFlag;

        @JsonProperty("add_time")
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
        public LocalDateTime addTime;

        @JsonProperty("update_time")
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
        public LocalDateTime updateTime;

        @JsonProperty("last_updated_by_user_id")
        public Integer lastUpdatedByUserId;

        @JsonProperty("edit_flag")
        public boolean editFlag;

        @JsonProperty("details_visible_flag")
        public boolean detailsVisibleFlag;

        @JsonProperty("add_visible_flag")
        public boolean addVisibleFlag;

        @JsonProperty("important_flag")
        public boolean importantFlag;

        @JsonProperty("bulk_edit_allowed")
        public boolean bulkEditAllowed;

        @JsonProperty("filtering_allowed")
        public boolean filteringAllowed;

        @JsonProperty("sortable_flag")
        public boolean sortableFlag;

        @JsonProperty("mandatory_flag")
        public Object mandatoryFlag;

        @JsonProperty("searchable_flag")
        public boolean searchableFlag;

        @JsonProperty("description")
        public String description;

        @JsonProperty("created_by_user_id")
        public Integer createdByUserId;

        @JsonProperty("active_flag")
        public boolean activeFlag;

        @JsonProperty("projects_detail_visible_flag")
        public boolean projectsDetailVisibleFlag;

        @JsonProperty("show_in_pipelines")
        public ShowInPipelines showInPipelines;

        @JsonProperty("options")
        public List<Option> options;
    }

    public static class ShowInPipelines {
        @JsonProperty("show_in_all")
        public boolean showInAll;

        @JsonProperty("pipeline_ids")
        public List<Integer> pipelineIds;
    }

    public static class Option {
        @JsonProperty("id")
        public Object id;

        @JsonProperty("label")
        public String label;

        @JsonProperty("color")
        public String color;

        @JsonProperty("alt_id")
        public String altId;
    }

    public static class AdditionalData {
        @JsonProperty("pagination")
        public Pagination pagination;

        public Pagination getPagination() {
            return pagination;
        }
    }
    public AdditionalData getAdditionalData() {
        return additionalData;
    }


    public static class Pagination {
        @JsonProperty("start")
        public int start;

        @JsonProperty("limit")
        public int limit;

        @JsonProperty("more_items_in_collection")
        public boolean moreItemsInCollection;

        public boolean isMoreItemsInCollection() {
            return moreItemsInCollection;
        }
    }
}
