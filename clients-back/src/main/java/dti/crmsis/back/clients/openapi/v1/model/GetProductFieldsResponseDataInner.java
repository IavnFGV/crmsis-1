package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetProductFieldsResponseDataInner  {

    /**
      * The name of the field
     **/
    private String name;
    /**
      * When `field_type` is either `set` or `enum`, possible options must be supplied as a JSON-encoded sequential array, for example:</br>`[{\"label\":\"red\"}, {\"label\":\"blue\"}, {\"label\":\"lilac\"}]`
     **/
    private List<Object> options;

    public enum FieldTypeEnum {
        BOOLEAN(String.valueOf("boolean")), DOUBLE(String.valueOf("double")), INT(String.valueOf("int")), JSON(String.valueOf("json")), DATE(String.valueOf("date")), DATERANGE(String.valueOf("daterange")), TIME(String.valueOf("time")), TIMERANGE(String.valueOf("timerange")), TEXT(String.valueOf("text")), VARCHAR(String.valueOf("varchar")), VARCHAR_AUTO(String.valueOf("varchar_auto")), VARCHAR_OPTIONS(String.valueOf("varchar_options")), ADDRESS(String.valueOf("address")), ENUM(String.valueOf("enum")), MONETARY(String.valueOf("monetary")), PHONE(String.valueOf("phone")), SET(String.valueOf("set")), ACTIVITY(String.valueOf("activity")), DEAL(String.valueOf("deal")), LEAD(String.valueOf("lead")), ORG(String.valueOf("org")), PEOPLE(String.valueOf("people")), PIPELINE(String.valueOf("pipeline")), PRODUCT(String.valueOf("product")), PROJECT(String.valueOf("project")), STAGE(String.valueOf("stage")), USER(String.valueOf("user")), BILLING_FREQUENCY(String.valueOf("billing_frequency")), PICTURE(String.valueOf("picture")), PRICE_LIST(String.valueOf("price_list")), PROJECTS_BOARD(String.valueOf("projects_board")), PROJECTS_PHASE(String.valueOf("projects_phase")), STATUS(String.valueOf("status")), VISIBLE_TO(String.valueOf("visible_to"));

        // caching enum access
        private static final java.util.EnumSet<FieldTypeEnum> values = java.util.EnumSet.allOf(FieldTypeEnum.class);

        String value;

        FieldTypeEnum (String v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FieldTypeEnum fromString(String v) {
            for (FieldTypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    /**
      * List of all possible field types
     **/
    private FieldTypeEnum fieldType;
    /**
      * The ID of the product field
     **/
    private Integer id;
    /**
      * The key of the product field
     **/
    private String key;
    /**
      * The position (index) of the product field in the detail view
     **/
    private Integer orderNr;
    /**
      * The product field creation time. Format: YYYY-MM-DD HH:MM:SS
     **/
    private String addTime;
    /**
      * The product field last update time. Format: YYYY-MM-DD HH:MM:SS
     **/
    private String updateTime;
    /**
      * The ID of the last user to update the product field
     **/
    private Integer lastUpdatedByUserId;
    /**
      * The ID of the user who created the product field
     **/
    private Integer createdByUserId;
    /**
      * Whether or not the product field is currently active
     **/
    private Boolean activeFlag;
    /**
      * Whether or not the product field name and metadata is editable
     **/
    private Boolean editFlag;
    /**
      * Whether or not the product field is visible in the Add Product Modal
     **/
    private Boolean addVisibleFlag;
    /**
      * Whether or not the product field is marked as important
     **/
    private Boolean importantFlag;
    /**
      * Whether or not the product field data can be edited
     **/
    private Boolean bulkEditAllowed;
    /**
      * Whether or not the product field is searchable
     **/
    private Boolean searchableFlag;
    /**
      * Whether or not the product field value can be used when filtering searches
     **/
    private Boolean filteringAllowed;
    /**
      * Whether or not the product field is sortable
     **/
    private Boolean sortableFlag;
    /**
      * Whether or not the product field is mandatory when creating products
     **/
    private Boolean mandatoryFlag;

    /**
    * The name of the field
    * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public GetProductFieldsResponseDataInner name(String name) {
        this.name = name;
        return this;
    }

    /**
    * When `field_type` is either `set` or `enum`, possible options must be supplied as a JSON-encoded sequential array, for example:</br>`[{\"label\":\"red\"}, {\"label\":\"blue\"}, {\"label\":\"lilac\"}]`
    * @return options
    **/
    @JsonProperty("options")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Object> getOptions() {
        return options;
    }

    /**
     * Set options
     **/
    public void setOptions(List<Object> options) {
        this.options = options;
    }

    public GetProductFieldsResponseDataInner options(List<Object> options) {
        this.options = options;
        return this;
    }
    public GetProductFieldsResponseDataInner addOptionsItem(Object optionsItem) {
        if (this.options == null){
            options = new ArrayList<>();
        }
        this.options.add(optionsItem);
        return this;
    }

    /**
    * List of all possible field types
    * @return fieldType
    **/
    @JsonProperty("field_type")
    public FieldTypeEnum getFieldType() {
        return fieldType;
    }

    /**
     * Set fieldType
     **/
    public void setFieldType(FieldTypeEnum fieldType) {
        this.fieldType = fieldType;
    }

    public GetProductFieldsResponseDataInner fieldType(FieldTypeEnum fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
    * The ID of the product field
    * @return id
    **/
    @JsonProperty("id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(Integer id) {
        this.id = id;
    }

    public GetProductFieldsResponseDataInner id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The key of the product field
    * @return key
    **/
    @JsonProperty("key")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getKey() {
        return key;
    }

    /**
     * Set key
     **/
    public void setKey(String key) {
        this.key = key;
    }

    public GetProductFieldsResponseDataInner key(String key) {
        this.key = key;
        return this;
    }

    /**
    * The position (index) of the product field in the detail view
    * @return orderNr
    **/
    @JsonProperty("order_nr")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getOrderNr() {
        return orderNr;
    }

    /**
     * Set orderNr
     **/
    public void setOrderNr(Integer orderNr) {
        this.orderNr = orderNr;
    }

    public GetProductFieldsResponseDataInner orderNr(Integer orderNr) {
        this.orderNr = orderNr;
        return this;
    }

    /**
    * The product field creation time. Format: YYYY-MM-DD HH:MM:SS
    * @return addTime
    **/
    @JsonProperty("add_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getAddTime() {
        return addTime;
    }

    /**
     * Set addTime
     **/
    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public GetProductFieldsResponseDataInner addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The product field last update time. Format: YYYY-MM-DD HH:MM:SS
    * @return updateTime
    **/
    @JsonProperty("update_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Set updateTime
     **/
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public GetProductFieldsResponseDataInner updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
    * The ID of the last user to update the product field
    * @return lastUpdatedByUserId
    **/
    @JsonProperty("last_updated_by_user_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getLastUpdatedByUserId() {
        return lastUpdatedByUserId;
    }

    /**
     * Set lastUpdatedByUserId
     **/
    public void setLastUpdatedByUserId(Integer lastUpdatedByUserId) {
        this.lastUpdatedByUserId = lastUpdatedByUserId;
    }

    public GetProductFieldsResponseDataInner lastUpdatedByUserId(Integer lastUpdatedByUserId) {
        this.lastUpdatedByUserId = lastUpdatedByUserId;
        return this;
    }

    /**
    * The ID of the user who created the product field
    * @return createdByUserId
    **/
    @JsonProperty("created_by_user_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getCreatedByUserId() {
        return createdByUserId;
    }

    /**
     * Set createdByUserId
     **/
    public void setCreatedByUserId(Integer createdByUserId) {
        this.createdByUserId = createdByUserId;
    }

    public GetProductFieldsResponseDataInner createdByUserId(Integer createdByUserId) {
        this.createdByUserId = createdByUserId;
        return this;
    }

    /**
    * Whether or not the product field is currently active
    * @return activeFlag
    **/
    @JsonProperty("active_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getActiveFlag() {
        return activeFlag;
    }

    /**
     * Set activeFlag
     **/
    public void setActiveFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
    }

    public GetProductFieldsResponseDataInner activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * Whether or not the product field name and metadata is editable
    * @return editFlag
    **/
    @JsonProperty("edit_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getEditFlag() {
        return editFlag;
    }

    /**
     * Set editFlag
     **/
    public void setEditFlag(Boolean editFlag) {
        this.editFlag = editFlag;
    }

    public GetProductFieldsResponseDataInner editFlag(Boolean editFlag) {
        this.editFlag = editFlag;
        return this;
    }

    /**
    * Whether or not the product field is visible in the Add Product Modal
    * @return addVisibleFlag
    **/
    @JsonProperty("add_visible_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getAddVisibleFlag() {
        return addVisibleFlag;
    }

    /**
     * Set addVisibleFlag
     **/
    public void setAddVisibleFlag(Boolean addVisibleFlag) {
        this.addVisibleFlag = addVisibleFlag;
    }

    public GetProductFieldsResponseDataInner addVisibleFlag(Boolean addVisibleFlag) {
        this.addVisibleFlag = addVisibleFlag;
        return this;
    }

    /**
    * Whether or not the product field is marked as important
    * @return importantFlag
    **/
    @JsonProperty("important_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getImportantFlag() {
        return importantFlag;
    }

    /**
     * Set importantFlag
     **/
    public void setImportantFlag(Boolean importantFlag) {
        this.importantFlag = importantFlag;
    }

    public GetProductFieldsResponseDataInner importantFlag(Boolean importantFlag) {
        this.importantFlag = importantFlag;
        return this;
    }

    /**
    * Whether or not the product field data can be edited
    * @return bulkEditAllowed
    **/
    @JsonProperty("bulk_edit_allowed")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getBulkEditAllowed() {
        return bulkEditAllowed;
    }

    /**
     * Set bulkEditAllowed
     **/
    public void setBulkEditAllowed(Boolean bulkEditAllowed) {
        this.bulkEditAllowed = bulkEditAllowed;
    }

    public GetProductFieldsResponseDataInner bulkEditAllowed(Boolean bulkEditAllowed) {
        this.bulkEditAllowed = bulkEditAllowed;
        return this;
    }

    /**
    * Whether or not the product field is searchable
    * @return searchableFlag
    **/
    @JsonProperty("searchable_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getSearchableFlag() {
        return searchableFlag;
    }

    /**
     * Set searchableFlag
     **/
    public void setSearchableFlag(Boolean searchableFlag) {
        this.searchableFlag = searchableFlag;
    }

    public GetProductFieldsResponseDataInner searchableFlag(Boolean searchableFlag) {
        this.searchableFlag = searchableFlag;
        return this;
    }

    /**
    * Whether or not the product field value can be used when filtering searches
    * @return filteringAllowed
    **/
    @JsonProperty("filtering_allowed")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getFilteringAllowed() {
        return filteringAllowed;
    }

    /**
     * Set filteringAllowed
     **/
    public void setFilteringAllowed(Boolean filteringAllowed) {
        this.filteringAllowed = filteringAllowed;
    }

    public GetProductFieldsResponseDataInner filteringAllowed(Boolean filteringAllowed) {
        this.filteringAllowed = filteringAllowed;
        return this;
    }

    /**
    * Whether or not the product field is sortable
    * @return sortableFlag
    **/
    @JsonProperty("sortable_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getSortableFlag() {
        return sortableFlag;
    }

    /**
     * Set sortableFlag
     **/
    public void setSortableFlag(Boolean sortableFlag) {
        this.sortableFlag = sortableFlag;
    }

    public GetProductFieldsResponseDataInner sortableFlag(Boolean sortableFlag) {
        this.sortableFlag = sortableFlag;
        return this;
    }

    /**
    * Whether or not the product field is mandatory when creating products
    * @return mandatoryFlag
    **/
    @JsonProperty("mandatory_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getMandatoryFlag() {
        return mandatoryFlag;
    }

    /**
     * Set mandatoryFlag
     **/
    public void setMandatoryFlag(Boolean mandatoryFlag) {
        this.mandatoryFlag = mandatoryFlag;
    }

    public GetProductFieldsResponseDataInner mandatoryFlag(Boolean mandatoryFlag) {
        this.mandatoryFlag = mandatoryFlag;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetProductFieldsResponseDataInner {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    orderNr: ").append(toIndentedString(orderNr)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    lastUpdatedByUserId: ").append(toIndentedString(lastUpdatedByUserId)).append("\n");
        sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    editFlag: ").append(toIndentedString(editFlag)).append("\n");
        sb.append("    addVisibleFlag: ").append(toIndentedString(addVisibleFlag)).append("\n");
        sb.append("    importantFlag: ").append(toIndentedString(importantFlag)).append("\n");
        sb.append("    bulkEditAllowed: ").append(toIndentedString(bulkEditAllowed)).append("\n");
        sb.append("    searchableFlag: ").append(toIndentedString(searchableFlag)).append("\n");
        sb.append("    filteringAllowed: ").append(toIndentedString(filteringAllowed)).append("\n");
        sb.append("    sortableFlag: ").append(toIndentedString(sortableFlag)).append("\n");
        sb.append("    mandatoryFlag: ").append(toIndentedString(mandatoryFlag)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetProductFieldsResponseDataInner} object that
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

        GetProductFieldsResponseDataInner model = (GetProductFieldsResponseDataInner) obj;

        return java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(options, model.options) &&
        java.util.Objects.equals(fieldType, model.fieldType) &&
        java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(key, model.key) &&
        java.util.Objects.equals(orderNr, model.orderNr) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime) &&
        java.util.Objects.equals(lastUpdatedByUserId, model.lastUpdatedByUserId) &&
        java.util.Objects.equals(createdByUserId, model.createdByUserId) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(editFlag, model.editFlag) &&
        java.util.Objects.equals(addVisibleFlag, model.addVisibleFlag) &&
        java.util.Objects.equals(importantFlag, model.importantFlag) &&
        java.util.Objects.equals(bulkEditAllowed, model.bulkEditAllowed) &&
        java.util.Objects.equals(searchableFlag, model.searchableFlag) &&
        java.util.Objects.equals(filteringAllowed, model.filteringAllowed) &&
        java.util.Objects.equals(sortableFlag, model.sortableFlag) &&
        java.util.Objects.equals(mandatoryFlag, model.mandatoryFlag);
    }

    /**
     * Returns a hash code for a {@code GetProductFieldsResponseDataInner}.
     *
     * @return a hash code value for a {@code GetProductFieldsResponseDataInner}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,
        options,
        fieldType,
        id,
        key,
        orderNr,
        addTime,
        updateTime,
        lastUpdatedByUserId,
        createdByUserId,
        activeFlag,
        editFlag,
        addVisibleFlag,
        importantFlag,
        bulkEditAllowed,
        searchableFlag,
        filteringAllowed,
        sortableFlag,
        mandatoryFlag);
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

    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetProductFieldsResponseDataInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("options")
        private List<Object> options = null;

    public enum FieldTypeEnum {
        BOOLEAN(String.valueOf("boolean")), DOUBLE(String.valueOf("double")), INT(String.valueOf("int")), JSON(String.valueOf("json")), DATE(String.valueOf("date")), DATERANGE(String.valueOf("daterange")), TIME(String.valueOf("time")), TIMERANGE(String.valueOf("timerange")), TEXT(String.valueOf("text")), VARCHAR(String.valueOf("varchar")), VARCHAR_AUTO(String.valueOf("varchar_auto")), VARCHAR_OPTIONS(String.valueOf("varchar_options")), ADDRESS(String.valueOf("address")), ENUM(String.valueOf("enum")), MONETARY(String.valueOf("monetary")), PHONE(String.valueOf("phone")), SET(String.valueOf("set")), ACTIVITY(String.valueOf("activity")), DEAL(String.valueOf("deal")), LEAD(String.valueOf("lead")), ORG(String.valueOf("org")), PEOPLE(String.valueOf("people")), PIPELINE(String.valueOf("pipeline")), PRODUCT(String.valueOf("product")), PROJECT(String.valueOf("project")), STAGE(String.valueOf("stage")), USER(String.valueOf("user")), BILLING_FREQUENCY(String.valueOf("billing_frequency")), PICTURE(String.valueOf("picture")), PRICE_LIST(String.valueOf("price_list")), PROJECTS_BOARD(String.valueOf("projects_board")), PROJECTS_PHASE(String.valueOf("projects_phase")), STATUS(String.valueOf("status")), VISIBLE_TO(String.valueOf("visible_to"));

        // caching enum access
        private static final java.util.EnumSet<FieldTypeEnum> values = java.util.EnumSet.allOf(FieldTypeEnum.class);

        String value;

        FieldTypeEnum (String v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FieldTypeEnum fromString(String v) {
            for (FieldTypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private FieldTypeEnum fieldType;
        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("key")
        private String key;
        @jakarta.ws.rs.QueryParam("orderNr")
        private Integer orderNr;
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        @jakarta.ws.rs.QueryParam("updateTime")
        private String updateTime;
        @jakarta.ws.rs.QueryParam("lastUpdatedByUserId")
        private Integer lastUpdatedByUserId;
        @jakarta.ws.rs.QueryParam("createdByUserId")
        private Integer createdByUserId;
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        @jakarta.ws.rs.QueryParam("editFlag")
        private Boolean editFlag;
        @jakarta.ws.rs.QueryParam("addVisibleFlag")
        private Boolean addVisibleFlag;
        @jakarta.ws.rs.QueryParam("importantFlag")
        private Boolean importantFlag;
        @jakarta.ws.rs.QueryParam("bulkEditAllowed")
        private Boolean bulkEditAllowed;
        @jakarta.ws.rs.QueryParam("searchableFlag")
        private Boolean searchableFlag;
        @jakarta.ws.rs.QueryParam("filteringAllowed")
        private Boolean filteringAllowed;
        @jakarta.ws.rs.QueryParam("sortableFlag")
        private Boolean sortableFlag;
        @jakarta.ws.rs.QueryParam("mandatoryFlag")
        private Boolean mandatoryFlag;

        /**
        * The name of the field
        * @return name
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public GetProductFieldsResponseDataInnerQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * When `field_type` is either `set` or `enum`, possible options must be supplied as a JSON-encoded sequential array, for example:</br>`[{\"label\":\"red\"}, {\"label\":\"blue\"}, {\"label\":\"lilac\"}]`
        * @return options
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("options")
        public List<Object> getOptions() {
            return options;
        }

        /**
         * Set options
         **/
        public void setOptions(List<Object> options) {
            this.options = options;
        }

        public GetProductFieldsResponseDataInnerQueryParam options(List<Object> options) {
            this.options = options;
            return this;
        }
        public GetProductFieldsResponseDataInnerQueryParam addOptionsItem(Object optionsItem) {
            this.options.add(optionsItem);
            return this;
        }

        /**
        * List of all possible field types
        * @return fieldType
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("field_type")
        public FieldTypeEnum getFieldType() {
            return fieldType;
        }

        /**
         * Set fieldType
         **/
        public void setFieldType(FieldTypeEnum fieldType) {
            this.fieldType = fieldType;
        }

        public GetProductFieldsResponseDataInnerQueryParam fieldType(FieldTypeEnum fieldType) {
            this.fieldType = fieldType;
            return this;
        }

        /**
        * The ID of the product field
        * @return id
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        public Integer getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(Integer id) {
            this.id = id;
        }

        public GetProductFieldsResponseDataInnerQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The key of the product field
        * @return key
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        public String getKey() {
            return key;
        }

        /**
         * Set key
         **/
        public void setKey(String key) {
            this.key = key;
        }

        public GetProductFieldsResponseDataInnerQueryParam key(String key) {
            this.key = key;
            return this;
        }

        /**
        * The position (index) of the product field in the detail view
        * @return orderNr
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("order_nr")
        public Integer getOrderNr() {
            return orderNr;
        }

        /**
         * Set orderNr
         **/
        public void setOrderNr(Integer orderNr) {
            this.orderNr = orderNr;
        }

        public GetProductFieldsResponseDataInnerQueryParam orderNr(Integer orderNr) {
            this.orderNr = orderNr;
            return this;
        }

        /**
        * The product field creation time. Format: YYYY-MM-DD HH:MM:SS
        * @return addTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("add_time")
        public String getAddTime() {
            return addTime;
        }

        /**
         * Set addTime
         **/
        public void setAddTime(String addTime) {
            this.addTime = addTime;
        }

        public GetProductFieldsResponseDataInnerQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The product field last update time. Format: YYYY-MM-DD HH:MM:SS
        * @return updateTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("update_time")
        public String getUpdateTime() {
            return updateTime;
        }

        /**
         * Set updateTime
         **/
        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public GetProductFieldsResponseDataInnerQueryParam updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
        * The ID of the last user to update the product field
        * @return lastUpdatedByUserId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("last_updated_by_user_id")
        public Integer getLastUpdatedByUserId() {
            return lastUpdatedByUserId;
        }

        /**
         * Set lastUpdatedByUserId
         **/
        public void setLastUpdatedByUserId(Integer lastUpdatedByUserId) {
            this.lastUpdatedByUserId = lastUpdatedByUserId;
        }

        public GetProductFieldsResponseDataInnerQueryParam lastUpdatedByUserId(Integer lastUpdatedByUserId) {
            this.lastUpdatedByUserId = lastUpdatedByUserId;
            return this;
        }

        /**
        * The ID of the user who created the product field
        * @return createdByUserId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("created_by_user_id")
        public Integer getCreatedByUserId() {
            return createdByUserId;
        }

        /**
         * Set createdByUserId
         **/
        public void setCreatedByUserId(Integer createdByUserId) {
            this.createdByUserId = createdByUserId;
        }

        public GetProductFieldsResponseDataInnerQueryParam createdByUserId(Integer createdByUserId) {
            this.createdByUserId = createdByUserId;
            return this;
        }

        /**
        * Whether or not the product field is currently active
        * @return activeFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("active_flag")
        public Boolean getActiveFlag() {
            return activeFlag;
        }

        /**
         * Set activeFlag
         **/
        public void setActiveFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
        }

        public GetProductFieldsResponseDataInnerQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * Whether or not the product field name and metadata is editable
        * @return editFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("edit_flag")
        public Boolean getEditFlag() {
            return editFlag;
        }

        /**
         * Set editFlag
         **/
        public void setEditFlag(Boolean editFlag) {
            this.editFlag = editFlag;
        }

        public GetProductFieldsResponseDataInnerQueryParam editFlag(Boolean editFlag) {
            this.editFlag = editFlag;
            return this;
        }

        /**
        * Whether or not the product field is visible in the Add Product Modal
        * @return addVisibleFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("add_visible_flag")
        public Boolean getAddVisibleFlag() {
            return addVisibleFlag;
        }

        /**
         * Set addVisibleFlag
         **/
        public void setAddVisibleFlag(Boolean addVisibleFlag) {
            this.addVisibleFlag = addVisibleFlag;
        }

        public GetProductFieldsResponseDataInnerQueryParam addVisibleFlag(Boolean addVisibleFlag) {
            this.addVisibleFlag = addVisibleFlag;
            return this;
        }

        /**
        * Whether or not the product field is marked as important
        * @return importantFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("important_flag")
        public Boolean getImportantFlag() {
            return importantFlag;
        }

        /**
         * Set importantFlag
         **/
        public void setImportantFlag(Boolean importantFlag) {
            this.importantFlag = importantFlag;
        }

        public GetProductFieldsResponseDataInnerQueryParam importantFlag(Boolean importantFlag) {
            this.importantFlag = importantFlag;
            return this;
        }

        /**
        * Whether or not the product field data can be edited
        * @return bulkEditAllowed
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("bulk_edit_allowed")
        public Boolean getBulkEditAllowed() {
            return bulkEditAllowed;
        }

        /**
         * Set bulkEditAllowed
         **/
        public void setBulkEditAllowed(Boolean bulkEditAllowed) {
            this.bulkEditAllowed = bulkEditAllowed;
        }

        public GetProductFieldsResponseDataInnerQueryParam bulkEditAllowed(Boolean bulkEditAllowed) {
            this.bulkEditAllowed = bulkEditAllowed;
            return this;
        }

        /**
        * Whether or not the product field is searchable
        * @return searchableFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("searchable_flag")
        public Boolean getSearchableFlag() {
            return searchableFlag;
        }

        /**
         * Set searchableFlag
         **/
        public void setSearchableFlag(Boolean searchableFlag) {
            this.searchableFlag = searchableFlag;
        }

        public GetProductFieldsResponseDataInnerQueryParam searchableFlag(Boolean searchableFlag) {
            this.searchableFlag = searchableFlag;
            return this;
        }

        /**
        * Whether or not the product field value can be used when filtering searches
        * @return filteringAllowed
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("filtering_allowed")
        public Boolean getFilteringAllowed() {
            return filteringAllowed;
        }

        /**
         * Set filteringAllowed
         **/
        public void setFilteringAllowed(Boolean filteringAllowed) {
            this.filteringAllowed = filteringAllowed;
        }

        public GetProductFieldsResponseDataInnerQueryParam filteringAllowed(Boolean filteringAllowed) {
            this.filteringAllowed = filteringAllowed;
            return this;
        }

        /**
        * Whether or not the product field is sortable
        * @return sortableFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("sortable_flag")
        public Boolean getSortableFlag() {
            return sortableFlag;
        }

        /**
         * Set sortableFlag
         **/
        public void setSortableFlag(Boolean sortableFlag) {
            this.sortableFlag = sortableFlag;
        }

        public GetProductFieldsResponseDataInnerQueryParam sortableFlag(Boolean sortableFlag) {
            this.sortableFlag = sortableFlag;
            return this;
        }

        /**
        * Whether or not the product field is mandatory when creating products
        * @return mandatoryFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("mandatory_flag")
        public Boolean getMandatoryFlag() {
            return mandatoryFlag;
        }

        /**
         * Set mandatoryFlag
         **/
        public void setMandatoryFlag(Boolean mandatoryFlag) {
            this.mandatoryFlag = mandatoryFlag;
        }

        public GetProductFieldsResponseDataInnerQueryParam mandatoryFlag(Boolean mandatoryFlag) {
            this.mandatoryFlag = mandatoryFlag;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetProductFieldsResponseDataInnerQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    options: ").append(toIndentedString(options)).append("\n");
            sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    key: ").append(toIndentedString(key)).append("\n");
            sb.append("    orderNr: ").append(toIndentedString(orderNr)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
            sb.append("    lastUpdatedByUserId: ").append(toIndentedString(lastUpdatedByUserId)).append("\n");
            sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    editFlag: ").append(toIndentedString(editFlag)).append("\n");
            sb.append("    addVisibleFlag: ").append(toIndentedString(addVisibleFlag)).append("\n");
            sb.append("    importantFlag: ").append(toIndentedString(importantFlag)).append("\n");
            sb.append("    bulkEditAllowed: ").append(toIndentedString(bulkEditAllowed)).append("\n");
            sb.append("    searchableFlag: ").append(toIndentedString(searchableFlag)).append("\n");
            sb.append("    filteringAllowed: ").append(toIndentedString(filteringAllowed)).append("\n");
            sb.append("    sortableFlag: ").append(toIndentedString(sortableFlag)).append("\n");
            sb.append("    mandatoryFlag: ").append(toIndentedString(mandatoryFlag)).append("\n");
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
