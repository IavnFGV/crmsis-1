package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Field  {

    /**
      * The ID of the field. Value is `null` in case of subfields.
     **/
    private Integer id;
    /**
      * The key of the field. For custom fields this is generated upon creation.
     **/
    private String key;
    /**
      * The name of the field
     **/
    private String name;
    /**
      * The order number of the field
     **/
    private Integer orderNr;

    public enum FieldTypeEnum {
        ADDRESS(String.valueOf("address")), DATE(String.valueOf("date")), DATERANGE(String.valueOf("daterange")), DOUBLE(String.valueOf("double")), ENUM(String.valueOf("enum")), MONETARY(String.valueOf("monetary")), ORG(String.valueOf("org")), PEOPLE(String.valueOf("people")), PHONE(String.valueOf("phone")), SET(String.valueOf("set")), TEXT(String.valueOf("text")), TIME(String.valueOf("time")), TIMERANGE(String.valueOf("timerange")), USER(String.valueOf("user")), VARCHAR(String.valueOf("varchar")), VARCHAR_AUTO(String.valueOf("varchar_auto")), VISIBLE_TO(String.valueOf("visible_to"));

        // caching enum access
        private static final java.util.EnumSet<FieldTypeEnum> values = java.util.EnumSet.allOf(FieldTypeEnum.class);

        String value;

        FieldTypeEnum (String v) {
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
      * The type of the field<table><tr><th>Value</th><th>Description</th></tr><tr><td>`address`</td><td>Address field</td></tr><tr><td>`date`</td><td>Date (format YYYY-MM-DD)</td></tr><tr><td>`daterange`</td><td>Date-range field (has a start date and end date value, both YYYY-MM-DD)</td></tr><tr><td>`double`</td><td>Numeric value</td></tr><tr><td>`enum`</td><td>Options field with a single possible chosen option</td></tr><tr></tr><tr><td>`monetary`</td><td>Monetary field (has a numeric value and a currency value)</td></tr><tr><td>`org`</td><td>Organization field (contains an organization ID which is stored on the same account)</td></tr><tr><td>`people`</td><td>Person field (contains a person ID which is stored on the same account)</td></tr><tr><td>`phone`</td><td>Phone field (up to 255 numbers and/or characters)</td></tr><tr><td>`set`</td><td>Options field with a possibility of having multiple chosen options</td></tr><tr><td>`text`</td><td>Long text (up to 65k characters)</td></tr><tr><td>`time`</td><td>Time field (format HH:MM:SS)</td></tr><tr><td>`timerange`</td><td>Time-range field (has a start time and end time value, both HH:MM:SS)</td></tr><tr><td>`user`</td><td>User field (contains a user ID of another Pipedrive user)</td></tr><tr><td>`varchar`</td><td>Text (up to 255 characters)</td></tr><tr><td>`varchar_auto`</td><td>Autocomplete text (up to 255 characters)</td></tr><tr><td>`visible_to`</td><td>System field that keeps item's visibility setting</td></tr></table>
     **/
    private FieldTypeEnum fieldType;
    /**
      * The creation time of the field
     **/
    private OffsetDateTime addTime;
    /**
      * The update time of the field
     **/
    private OffsetDateTime updateTime;
    /**
      * The ID of the user who created or most recently updated the field, only applicable for custom fields
     **/
    private Integer lastUpdatedByUserId;
    /**
      * The ID of the user who created the field
     **/
    private Integer createdByUserId;
    /**
      * The active flag of the field
     **/
    private Boolean activeFlag;
    /**
      * The edit flag of the field
     **/
    private Boolean editFlag;
    /**
      * Not used
     **/
    private Boolean indexVisibleFlag;
    /**
      * Not used
     **/
    private Boolean detailsVisibleFlag;
    /**
      * Not used
     **/
    private Boolean addVisibleFlag;
    /**
      * Not used
     **/
    private Boolean importantFlag;
    /**
      * Whether or not the field of an item can be edited in bulk
     **/
    private Boolean bulkEditAllowed;
    /**
      * Whether or not items can be searched by this field
     **/
    private Boolean searchableFlag;
    /**
      * Whether or not items can be filtered by this field
     **/
    private Boolean filteringAllowed;
    /**
      * Whether or not items can be sorted by this field
     **/
    private Boolean sortableFlag;
    /**
      * Whether or not the field is mandatory
     **/
    private Boolean mandatoryFlag;
    /**
      * The options of the field. When there are no options, `null` is returned.
     **/
    private List<Object> options;
    /**
      * The deleted options of the field. Only present when there is at least 1 deleted option.
     **/
    private List<Object> optionsDeleted;
    /**
      * Whether or not the field is a subfield of another field. Only present if field is subfield.
     **/
    private Boolean isSubfield;
    /**
      * The subfields of the field. Only present when the field has subfields.
     **/
    private List<Object> subfields;

    /**
    * The ID of the field. Value is `null` in case of subfields.
    * @return id
    **/
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(Integer id) {
        this.id = id;
    }

    public Field id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The key of the field. For custom fields this is generated upon creation.
    * @return key
    **/
    @JsonProperty("key")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getKey() {
        return key;
    }

    /**
     * Set key
     **/
    public void setKey(String key) {
        this.key = key;
    }

    public Field key(String key) {
        this.key = key;
        return this;
    }

    /**
    * The name of the field
    * @return name
    **/
    @JsonProperty("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public Field name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The order number of the field
    * @return orderNr
    **/
    @JsonProperty("order_nr")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getOrderNr() {
        return orderNr;
    }

    /**
     * Set orderNr
     **/
    public void setOrderNr(Integer orderNr) {
        this.orderNr = orderNr;
    }

    public Field orderNr(Integer orderNr) {
        this.orderNr = orderNr;
        return this;
    }

    /**
    * The type of the field<table><tr><th>Value</th><th>Description</th></tr><tr><td>`address`</td><td>Address field</td></tr><tr><td>`date`</td><td>Date (format YYYY-MM-DD)</td></tr><tr><td>`daterange`</td><td>Date-range field (has a start date and end date value, both YYYY-MM-DD)</td></tr><tr><td>`double`</td><td>Numeric value</td></tr><tr><td>`enum`</td><td>Options field with a single possible chosen option</td></tr><tr></tr><tr><td>`monetary`</td><td>Monetary field (has a numeric value and a currency value)</td></tr><tr><td>`org`</td><td>Organization field (contains an organization ID which is stored on the same account)</td></tr><tr><td>`people`</td><td>Person field (contains a person ID which is stored on the same account)</td></tr><tr><td>`phone`</td><td>Phone field (up to 255 numbers and/or characters)</td></tr><tr><td>`set`</td><td>Options field with a possibility of having multiple chosen options</td></tr><tr><td>`text`</td><td>Long text (up to 65k characters)</td></tr><tr><td>`time`</td><td>Time field (format HH:MM:SS)</td></tr><tr><td>`timerange`</td><td>Time-range field (has a start time and end time value, both HH:MM:SS)</td></tr><tr><td>`user`</td><td>User field (contains a user ID of another Pipedrive user)</td></tr><tr><td>`varchar`</td><td>Text (up to 255 characters)</td></tr><tr><td>`varchar_auto`</td><td>Autocomplete text (up to 255 characters)</td></tr><tr><td>`visible_to`</td><td>System field that keeps item's visibility setting</td></tr></table>
    * @return fieldType
    **/
    @JsonProperty("field_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FieldTypeEnum getFieldType() {
        return fieldType;
    }

    /**
     * Set fieldType
     **/
    public void setFieldType(FieldTypeEnum fieldType) {
        this.fieldType = fieldType;
    }

    public Field fieldType(FieldTypeEnum fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
    * The creation time of the field
    * @return addTime
    **/
    @JsonProperty("add_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OffsetDateTime getAddTime() {
        return addTime;
    }

    /**
     * Set addTime
     **/
    public void setAddTime(OffsetDateTime addTime) {
        this.addTime = addTime;
    }

    public Field addTime(OffsetDateTime addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The update time of the field
    * @return updateTime
    **/
    @JsonProperty("update_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * Set updateTime
     **/
    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Field updateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
    * The ID of the user who created or most recently updated the field, only applicable for custom fields
    * @return lastUpdatedByUserId
    **/
    @JsonProperty("last_updated_by_user_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getLastUpdatedByUserId() {
        return lastUpdatedByUserId;
    }

    /**
     * Set lastUpdatedByUserId
     **/
    public void setLastUpdatedByUserId(Integer lastUpdatedByUserId) {
        this.lastUpdatedByUserId = lastUpdatedByUserId;
    }

    public Field lastUpdatedByUserId(Integer lastUpdatedByUserId) {
        this.lastUpdatedByUserId = lastUpdatedByUserId;
        return this;
    }

    /**
    * The ID of the user who created the field
    * @return createdByUserId
    **/
    @JsonProperty("created_by_user_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCreatedByUserId() {
        return createdByUserId;
    }

    /**
     * Set createdByUserId
     **/
    public void setCreatedByUserId(Integer createdByUserId) {
        this.createdByUserId = createdByUserId;
    }

    public Field createdByUserId(Integer createdByUserId) {
        this.createdByUserId = createdByUserId;
        return this;
    }

    /**
    * The active flag of the field
    * @return activeFlag
    **/
    @JsonProperty("active_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getActiveFlag() {
        return activeFlag;
    }

    /**
     * Set activeFlag
     **/
    public void setActiveFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
    }

    public Field activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * The edit flag of the field
    * @return editFlag
    **/
    @JsonProperty("edit_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getEditFlag() {
        return editFlag;
    }

    /**
     * Set editFlag
     **/
    public void setEditFlag(Boolean editFlag) {
        this.editFlag = editFlag;
    }

    public Field editFlag(Boolean editFlag) {
        this.editFlag = editFlag;
        return this;
    }

    /**
    * Not used
    * @return indexVisibleFlag
    **/
    @JsonProperty("index_visible_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIndexVisibleFlag() {
        return indexVisibleFlag;
    }

    /**
     * Set indexVisibleFlag
     **/
    public void setIndexVisibleFlag(Boolean indexVisibleFlag) {
        this.indexVisibleFlag = indexVisibleFlag;
    }

    public Field indexVisibleFlag(Boolean indexVisibleFlag) {
        this.indexVisibleFlag = indexVisibleFlag;
        return this;
    }

    /**
    * Not used
    * @return detailsVisibleFlag
    **/
    @JsonProperty("details_visible_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDetailsVisibleFlag() {
        return detailsVisibleFlag;
    }

    /**
     * Set detailsVisibleFlag
     **/
    public void setDetailsVisibleFlag(Boolean detailsVisibleFlag) {
        this.detailsVisibleFlag = detailsVisibleFlag;
    }

    public Field detailsVisibleFlag(Boolean detailsVisibleFlag) {
        this.detailsVisibleFlag = detailsVisibleFlag;
        return this;
    }

    /**
    * Not used
    * @return addVisibleFlag
    **/
    @JsonProperty("add_visible_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAddVisibleFlag() {
        return addVisibleFlag;
    }

    /**
     * Set addVisibleFlag
     **/
    public void setAddVisibleFlag(Boolean addVisibleFlag) {
        this.addVisibleFlag = addVisibleFlag;
    }

    public Field addVisibleFlag(Boolean addVisibleFlag) {
        this.addVisibleFlag = addVisibleFlag;
        return this;
    }

    /**
    * Not used
    * @return importantFlag
    **/
    @JsonProperty("important_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getImportantFlag() {
        return importantFlag;
    }

    /**
     * Set importantFlag
     **/
    public void setImportantFlag(Boolean importantFlag) {
        this.importantFlag = importantFlag;
    }

    public Field importantFlag(Boolean importantFlag) {
        this.importantFlag = importantFlag;
        return this;
    }

    /**
    * Whether or not the field of an item can be edited in bulk
    * @return bulkEditAllowed
    **/
    @JsonProperty("bulk_edit_allowed")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getBulkEditAllowed() {
        return bulkEditAllowed;
    }

    /**
     * Set bulkEditAllowed
     **/
    public void setBulkEditAllowed(Boolean bulkEditAllowed) {
        this.bulkEditAllowed = bulkEditAllowed;
    }

    public Field bulkEditAllowed(Boolean bulkEditAllowed) {
        this.bulkEditAllowed = bulkEditAllowed;
        return this;
    }

    /**
    * Whether or not items can be searched by this field
    * @return searchableFlag
    **/
    @JsonProperty("searchable_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getSearchableFlag() {
        return searchableFlag;
    }

    /**
     * Set searchableFlag
     **/
    public void setSearchableFlag(Boolean searchableFlag) {
        this.searchableFlag = searchableFlag;
    }

    public Field searchableFlag(Boolean searchableFlag) {
        this.searchableFlag = searchableFlag;
        return this;
    }

    /**
    * Whether or not items can be filtered by this field
    * @return filteringAllowed
    **/
    @JsonProperty("filtering_allowed")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getFilteringAllowed() {
        return filteringAllowed;
    }

    /**
     * Set filteringAllowed
     **/
    public void setFilteringAllowed(Boolean filteringAllowed) {
        this.filteringAllowed = filteringAllowed;
    }

    public Field filteringAllowed(Boolean filteringAllowed) {
        this.filteringAllowed = filteringAllowed;
        return this;
    }

    /**
    * Whether or not items can be sorted by this field
    * @return sortableFlag
    **/
    @JsonProperty("sortable_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getSortableFlag() {
        return sortableFlag;
    }

    /**
     * Set sortableFlag
     **/
    public void setSortableFlag(Boolean sortableFlag) {
        this.sortableFlag = sortableFlag;
    }

    public Field sortableFlag(Boolean sortableFlag) {
        this.sortableFlag = sortableFlag;
        return this;
    }

    /**
    * Whether or not the field is mandatory
    * @return mandatoryFlag
    **/
    @JsonProperty("mandatory_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getMandatoryFlag() {
        return mandatoryFlag;
    }

    /**
     * Set mandatoryFlag
     **/
    public void setMandatoryFlag(Boolean mandatoryFlag) {
        this.mandatoryFlag = mandatoryFlag;
    }

    public Field mandatoryFlag(Boolean mandatoryFlag) {
        this.mandatoryFlag = mandatoryFlag;
        return this;
    }

    /**
    * The options of the field. When there are no options, `null` is returned.
    * @return options
    **/
    @JsonProperty("options")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Object> getOptions() {
        return options;
    }

    /**
     * Set options
     **/
    public void setOptions(List<Object> options) {
        this.options = options;
    }

    public Field options(List<Object> options) {
        this.options = options;
        return this;
    }
    public Field addOptionsItem(Object optionsItem) {
        if (this.options == null){
            options = new ArrayList<>();
        }
        this.options.add(optionsItem);
        return this;
    }

    /**
    * The deleted options of the field. Only present when there is at least 1 deleted option.
    * @return optionsDeleted
    **/
    @JsonProperty("options_deleted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Object> getOptionsDeleted() {
        return optionsDeleted;
    }

    /**
     * Set optionsDeleted
     **/
    public void setOptionsDeleted(List<Object> optionsDeleted) {
        this.optionsDeleted = optionsDeleted;
    }

    public Field optionsDeleted(List<Object> optionsDeleted) {
        this.optionsDeleted = optionsDeleted;
        return this;
    }
    public Field addOptionsDeletedItem(Object optionsDeletedItem) {
        if (this.optionsDeleted == null){
            optionsDeleted = new ArrayList<>();
        }
        this.optionsDeleted.add(optionsDeletedItem);
        return this;
    }

    /**
    * Whether or not the field is a subfield of another field. Only present if field is subfield.
    * @return isSubfield
    **/
    @JsonProperty("is_subfield")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsSubfield() {
        return isSubfield;
    }

    /**
     * Set isSubfield
     **/
    public void setIsSubfield(Boolean isSubfield) {
        this.isSubfield = isSubfield;
    }

    public Field isSubfield(Boolean isSubfield) {
        this.isSubfield = isSubfield;
        return this;
    }

    /**
    * The subfields of the field. Only present when the field has subfields.
    * @return subfields
    **/
    @JsonProperty("subfields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Object> getSubfields() {
        return subfields;
    }

    /**
     * Set subfields
     **/
    public void setSubfields(List<Object> subfields) {
        this.subfields = subfields;
    }

    public Field subfields(List<Object> subfields) {
        this.subfields = subfields;
        return this;
    }
    public Field addSubfieldsItem(Object subfieldsItem) {
        if (this.subfields == null){
            subfields = new ArrayList<>();
        }
        this.subfields.add(subfieldsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Field {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    orderNr: ").append(toIndentedString(orderNr)).append("\n");
        sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    lastUpdatedByUserId: ").append(toIndentedString(lastUpdatedByUserId)).append("\n");
        sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    editFlag: ").append(toIndentedString(editFlag)).append("\n");
        sb.append("    indexVisibleFlag: ").append(toIndentedString(indexVisibleFlag)).append("\n");
        sb.append("    detailsVisibleFlag: ").append(toIndentedString(detailsVisibleFlag)).append("\n");
        sb.append("    addVisibleFlag: ").append(toIndentedString(addVisibleFlag)).append("\n");
        sb.append("    importantFlag: ").append(toIndentedString(importantFlag)).append("\n");
        sb.append("    bulkEditAllowed: ").append(toIndentedString(bulkEditAllowed)).append("\n");
        sb.append("    searchableFlag: ").append(toIndentedString(searchableFlag)).append("\n");
        sb.append("    filteringAllowed: ").append(toIndentedString(filteringAllowed)).append("\n");
        sb.append("    sortableFlag: ").append(toIndentedString(sortableFlag)).append("\n");
        sb.append("    mandatoryFlag: ").append(toIndentedString(mandatoryFlag)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    optionsDeleted: ").append(toIndentedString(optionsDeleted)).append("\n");
        sb.append("    isSubfield: ").append(toIndentedString(isSubfield)).append("\n");
        sb.append("    subfields: ").append(toIndentedString(subfields)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code Field} object that
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

        Field model = (Field) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(key, model.key) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(orderNr, model.orderNr) &&
        java.util.Objects.equals(fieldType, model.fieldType) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime) &&
        java.util.Objects.equals(lastUpdatedByUserId, model.lastUpdatedByUserId) &&
        java.util.Objects.equals(createdByUserId, model.createdByUserId) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(editFlag, model.editFlag) &&
        java.util.Objects.equals(indexVisibleFlag, model.indexVisibleFlag) &&
        java.util.Objects.equals(detailsVisibleFlag, model.detailsVisibleFlag) &&
        java.util.Objects.equals(addVisibleFlag, model.addVisibleFlag) &&
        java.util.Objects.equals(importantFlag, model.importantFlag) &&
        java.util.Objects.equals(bulkEditAllowed, model.bulkEditAllowed) &&
        java.util.Objects.equals(searchableFlag, model.searchableFlag) &&
        java.util.Objects.equals(filteringAllowed, model.filteringAllowed) &&
        java.util.Objects.equals(sortableFlag, model.sortableFlag) &&
        java.util.Objects.equals(mandatoryFlag, model.mandatoryFlag) &&
        java.util.Objects.equals(options, model.options) &&
        java.util.Objects.equals(optionsDeleted, model.optionsDeleted) &&
        java.util.Objects.equals(isSubfield, model.isSubfield) &&
        java.util.Objects.equals(subfields, model.subfields);
    }

    /**
     * Returns a hash code for a {@code Field}.
     *
     * @return a hash code value for a {@code Field}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        key,
        name,
        orderNr,
        fieldType,
        addTime,
        updateTime,
        lastUpdatedByUserId,
        createdByUserId,
        activeFlag,
        editFlag,
        indexVisibleFlag,
        detailsVisibleFlag,
        addVisibleFlag,
        importantFlag,
        bulkEditAllowed,
        searchableFlag,
        filteringAllowed,
        sortableFlag,
        mandatoryFlag,
        options,
        optionsDeleted,
        isSubfield,
        subfields);
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
    public static class FieldQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("key")
        private String key;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("orderNr")
        private Integer orderNr;

    public enum FieldTypeEnum {
        ADDRESS(String.valueOf("address")), DATE(String.valueOf("date")), DATERANGE(String.valueOf("daterange")), DOUBLE(String.valueOf("double")), ENUM(String.valueOf("enum")), MONETARY(String.valueOf("monetary")), ORG(String.valueOf("org")), PEOPLE(String.valueOf("people")), PHONE(String.valueOf("phone")), SET(String.valueOf("set")), TEXT(String.valueOf("text")), TIME(String.valueOf("time")), TIMERANGE(String.valueOf("timerange")), USER(String.valueOf("user")), VARCHAR(String.valueOf("varchar")), VARCHAR_AUTO(String.valueOf("varchar_auto")), VISIBLE_TO(String.valueOf("visible_to"));

        // caching enum access
        private static final java.util.EnumSet<FieldTypeEnum> values = java.util.EnumSet.allOf(FieldTypeEnum.class);

        String value;

        FieldTypeEnum (String v) {
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
        @jakarta.ws.rs.QueryParam("addTime")
        private OffsetDateTime addTime;
        @jakarta.ws.rs.QueryParam("updateTime")
        private OffsetDateTime updateTime;
        @jakarta.ws.rs.QueryParam("lastUpdatedByUserId")
        private Integer lastUpdatedByUserId;
        @jakarta.ws.rs.QueryParam("createdByUserId")
        private Integer createdByUserId;
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        @jakarta.ws.rs.QueryParam("editFlag")
        private Boolean editFlag;
        @jakarta.ws.rs.QueryParam("indexVisibleFlag")
        private Boolean indexVisibleFlag;
        @jakarta.ws.rs.QueryParam("detailsVisibleFlag")
        private Boolean detailsVisibleFlag;
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
        @jakarta.ws.rs.QueryParam("options")
        private List<Object> options = null;
        @jakarta.ws.rs.QueryParam("optionsDeleted")
        private List<Object> optionsDeleted = null;
        @jakarta.ws.rs.QueryParam("isSubfield")
        private Boolean isSubfield;
        @jakarta.ws.rs.QueryParam("subfields")
        private List<Object> subfields = null;

        /**
        * The ID of the field. Value is `null` in case of subfields.
        * @return id
        **/
        @JsonProperty("id")
        public Integer getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(Integer id) {
            this.id = id;
        }

        public FieldQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The key of the field. For custom fields this is generated upon creation.
        * @return key
        **/
        @JsonProperty("key")
        public String getKey() {
            return key;
        }

        /**
         * Set key
         **/
        public void setKey(String key) {
            this.key = key;
        }

        public FieldQueryParam key(String key) {
            this.key = key;
            return this;
        }

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

        public FieldQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The order number of the field
        * @return orderNr
        **/
        @JsonProperty("order_nr")
        public Integer getOrderNr() {
            return orderNr;
        }

        /**
         * Set orderNr
         **/
        public void setOrderNr(Integer orderNr) {
            this.orderNr = orderNr;
        }

        public FieldQueryParam orderNr(Integer orderNr) {
            this.orderNr = orderNr;
            return this;
        }

        /**
        * The type of the field<table><tr><th>Value</th><th>Description</th></tr><tr><td>`address`</td><td>Address field</td></tr><tr><td>`date`</td><td>Date (format YYYY-MM-DD)</td></tr><tr><td>`daterange`</td><td>Date-range field (has a start date and end date value, both YYYY-MM-DD)</td></tr><tr><td>`double`</td><td>Numeric value</td></tr><tr><td>`enum`</td><td>Options field with a single possible chosen option</td></tr><tr></tr><tr><td>`monetary`</td><td>Monetary field (has a numeric value and a currency value)</td></tr><tr><td>`org`</td><td>Organization field (contains an organization ID which is stored on the same account)</td></tr><tr><td>`people`</td><td>Person field (contains a person ID which is stored on the same account)</td></tr><tr><td>`phone`</td><td>Phone field (up to 255 numbers and/or characters)</td></tr><tr><td>`set`</td><td>Options field with a possibility of having multiple chosen options</td></tr><tr><td>`text`</td><td>Long text (up to 65k characters)</td></tr><tr><td>`time`</td><td>Time field (format HH:MM:SS)</td></tr><tr><td>`timerange`</td><td>Time-range field (has a start time and end time value, both HH:MM:SS)</td></tr><tr><td>`user`</td><td>User field (contains a user ID of another Pipedrive user)</td></tr><tr><td>`varchar`</td><td>Text (up to 255 characters)</td></tr><tr><td>`varchar_auto`</td><td>Autocomplete text (up to 255 characters)</td></tr><tr><td>`visible_to`</td><td>System field that keeps item's visibility setting</td></tr></table>
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

        public FieldQueryParam fieldType(FieldTypeEnum fieldType) {
            this.fieldType = fieldType;
            return this;
        }

        /**
        * The creation time of the field
        * @return addTime
        **/
        @JsonProperty("add_time")
        public OffsetDateTime getAddTime() {
            return addTime;
        }

        /**
         * Set addTime
         **/
        public void setAddTime(OffsetDateTime addTime) {
            this.addTime = addTime;
        }

        public FieldQueryParam addTime(OffsetDateTime addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The update time of the field
        * @return updateTime
        **/
        @JsonProperty("update_time")
        public OffsetDateTime getUpdateTime() {
            return updateTime;
        }

        /**
         * Set updateTime
         **/
        public void setUpdateTime(OffsetDateTime updateTime) {
            this.updateTime = updateTime;
        }

        public FieldQueryParam updateTime(OffsetDateTime updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
        * The ID of the user who created or most recently updated the field, only applicable for custom fields
        * @return lastUpdatedByUserId
        **/
        @JsonProperty("last_updated_by_user_id")
        public Integer getLastUpdatedByUserId() {
            return lastUpdatedByUserId;
        }

        /**
         * Set lastUpdatedByUserId
         **/
        public void setLastUpdatedByUserId(Integer lastUpdatedByUserId) {
            this.lastUpdatedByUserId = lastUpdatedByUserId;
        }

        public FieldQueryParam lastUpdatedByUserId(Integer lastUpdatedByUserId) {
            this.lastUpdatedByUserId = lastUpdatedByUserId;
            return this;
        }

        /**
        * The ID of the user who created the field
        * @return createdByUserId
        **/
        @JsonProperty("created_by_user_id")
        public Integer getCreatedByUserId() {
            return createdByUserId;
        }

        /**
         * Set createdByUserId
         **/
        public void setCreatedByUserId(Integer createdByUserId) {
            this.createdByUserId = createdByUserId;
        }

        public FieldQueryParam createdByUserId(Integer createdByUserId) {
            this.createdByUserId = createdByUserId;
            return this;
        }

        /**
        * The active flag of the field
        * @return activeFlag
        **/
        @JsonProperty("active_flag")
        public Boolean getActiveFlag() {
            return activeFlag;
        }

        /**
         * Set activeFlag
         **/
        public void setActiveFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
        }

        public FieldQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * The edit flag of the field
        * @return editFlag
        **/
        @JsonProperty("edit_flag")
        public Boolean getEditFlag() {
            return editFlag;
        }

        /**
         * Set editFlag
         **/
        public void setEditFlag(Boolean editFlag) {
            this.editFlag = editFlag;
        }

        public FieldQueryParam editFlag(Boolean editFlag) {
            this.editFlag = editFlag;
            return this;
        }

        /**
        * Not used
        * @return indexVisibleFlag
        **/
        @JsonProperty("index_visible_flag")
        public Boolean getIndexVisibleFlag() {
            return indexVisibleFlag;
        }

        /**
         * Set indexVisibleFlag
         **/
        public void setIndexVisibleFlag(Boolean indexVisibleFlag) {
            this.indexVisibleFlag = indexVisibleFlag;
        }

        public FieldQueryParam indexVisibleFlag(Boolean indexVisibleFlag) {
            this.indexVisibleFlag = indexVisibleFlag;
            return this;
        }

        /**
        * Not used
        * @return detailsVisibleFlag
        **/
        @JsonProperty("details_visible_flag")
        public Boolean getDetailsVisibleFlag() {
            return detailsVisibleFlag;
        }

        /**
         * Set detailsVisibleFlag
         **/
        public void setDetailsVisibleFlag(Boolean detailsVisibleFlag) {
            this.detailsVisibleFlag = detailsVisibleFlag;
        }

        public FieldQueryParam detailsVisibleFlag(Boolean detailsVisibleFlag) {
            this.detailsVisibleFlag = detailsVisibleFlag;
            return this;
        }

        /**
        * Not used
        * @return addVisibleFlag
        **/
        @JsonProperty("add_visible_flag")
        public Boolean getAddVisibleFlag() {
            return addVisibleFlag;
        }

        /**
         * Set addVisibleFlag
         **/
        public void setAddVisibleFlag(Boolean addVisibleFlag) {
            this.addVisibleFlag = addVisibleFlag;
        }

        public FieldQueryParam addVisibleFlag(Boolean addVisibleFlag) {
            this.addVisibleFlag = addVisibleFlag;
            return this;
        }

        /**
        * Not used
        * @return importantFlag
        **/
        @JsonProperty("important_flag")
        public Boolean getImportantFlag() {
            return importantFlag;
        }

        /**
         * Set importantFlag
         **/
        public void setImportantFlag(Boolean importantFlag) {
            this.importantFlag = importantFlag;
        }

        public FieldQueryParam importantFlag(Boolean importantFlag) {
            this.importantFlag = importantFlag;
            return this;
        }

        /**
        * Whether or not the field of an item can be edited in bulk
        * @return bulkEditAllowed
        **/
        @JsonProperty("bulk_edit_allowed")
        public Boolean getBulkEditAllowed() {
            return bulkEditAllowed;
        }

        /**
         * Set bulkEditAllowed
         **/
        public void setBulkEditAllowed(Boolean bulkEditAllowed) {
            this.bulkEditAllowed = bulkEditAllowed;
        }

        public FieldQueryParam bulkEditAllowed(Boolean bulkEditAllowed) {
            this.bulkEditAllowed = bulkEditAllowed;
            return this;
        }

        /**
        * Whether or not items can be searched by this field
        * @return searchableFlag
        **/
        @JsonProperty("searchable_flag")
        public Boolean getSearchableFlag() {
            return searchableFlag;
        }

        /**
         * Set searchableFlag
         **/
        public void setSearchableFlag(Boolean searchableFlag) {
            this.searchableFlag = searchableFlag;
        }

        public FieldQueryParam searchableFlag(Boolean searchableFlag) {
            this.searchableFlag = searchableFlag;
            return this;
        }

        /**
        * Whether or not items can be filtered by this field
        * @return filteringAllowed
        **/
        @JsonProperty("filtering_allowed")
        public Boolean getFilteringAllowed() {
            return filteringAllowed;
        }

        /**
         * Set filteringAllowed
         **/
        public void setFilteringAllowed(Boolean filteringAllowed) {
            this.filteringAllowed = filteringAllowed;
        }

        public FieldQueryParam filteringAllowed(Boolean filteringAllowed) {
            this.filteringAllowed = filteringAllowed;
            return this;
        }

        /**
        * Whether or not items can be sorted by this field
        * @return sortableFlag
        **/
        @JsonProperty("sortable_flag")
        public Boolean getSortableFlag() {
            return sortableFlag;
        }

        /**
         * Set sortableFlag
         **/
        public void setSortableFlag(Boolean sortableFlag) {
            this.sortableFlag = sortableFlag;
        }

        public FieldQueryParam sortableFlag(Boolean sortableFlag) {
            this.sortableFlag = sortableFlag;
            return this;
        }

        /**
        * Whether or not the field is mandatory
        * @return mandatoryFlag
        **/
        @JsonProperty("mandatory_flag")
        public Boolean getMandatoryFlag() {
            return mandatoryFlag;
        }

        /**
         * Set mandatoryFlag
         **/
        public void setMandatoryFlag(Boolean mandatoryFlag) {
            this.mandatoryFlag = mandatoryFlag;
        }

        public FieldQueryParam mandatoryFlag(Boolean mandatoryFlag) {
            this.mandatoryFlag = mandatoryFlag;
            return this;
        }

        /**
        * The options of the field. When there are no options, `null` is returned.
        * @return options
        **/
        @JsonProperty("options")
        public List<Object> getOptions() {
            return options;
        }

        /**
         * Set options
         **/
        public void setOptions(List<Object> options) {
            this.options = options;
        }

        public FieldQueryParam options(List<Object> options) {
            this.options = options;
            return this;
        }
        public FieldQueryParam addOptionsItem(Object optionsItem) {
            this.options.add(optionsItem);
            return this;
        }

        /**
        * The deleted options of the field. Only present when there is at least 1 deleted option.
        * @return optionsDeleted
        **/
        @JsonProperty("options_deleted")
        public List<Object> getOptionsDeleted() {
            return optionsDeleted;
        }

        /**
         * Set optionsDeleted
         **/
        public void setOptionsDeleted(List<Object> optionsDeleted) {
            this.optionsDeleted = optionsDeleted;
        }

        public FieldQueryParam optionsDeleted(List<Object> optionsDeleted) {
            this.optionsDeleted = optionsDeleted;
            return this;
        }
        public FieldQueryParam addOptionsDeletedItem(Object optionsDeletedItem) {
            this.optionsDeleted.add(optionsDeletedItem);
            return this;
        }

        /**
        * Whether or not the field is a subfield of another field. Only present if field is subfield.
        * @return isSubfield
        **/
        @JsonProperty("is_subfield")
        public Boolean getIsSubfield() {
            return isSubfield;
        }

        /**
         * Set isSubfield
         **/
        public void setIsSubfield(Boolean isSubfield) {
            this.isSubfield = isSubfield;
        }

        public FieldQueryParam isSubfield(Boolean isSubfield) {
            this.isSubfield = isSubfield;
            return this;
        }

        /**
        * The subfields of the field. Only present when the field has subfields.
        * @return subfields
        **/
        @JsonProperty("subfields")
        public List<Object> getSubfields() {
            return subfields;
        }

        /**
         * Set subfields
         **/
        public void setSubfields(List<Object> subfields) {
            this.subfields = subfields;
        }

        public FieldQueryParam subfields(List<Object> subfields) {
            this.subfields = subfields;
            return this;
        }
        public FieldQueryParam addSubfieldsItem(Object subfieldsItem) {
            this.subfields.add(subfieldsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class FieldQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    key: ").append(toIndentedString(key)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    orderNr: ").append(toIndentedString(orderNr)).append("\n");
            sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
            sb.append("    lastUpdatedByUserId: ").append(toIndentedString(lastUpdatedByUserId)).append("\n");
            sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    editFlag: ").append(toIndentedString(editFlag)).append("\n");
            sb.append("    indexVisibleFlag: ").append(toIndentedString(indexVisibleFlag)).append("\n");
            sb.append("    detailsVisibleFlag: ").append(toIndentedString(detailsVisibleFlag)).append("\n");
            sb.append("    addVisibleFlag: ").append(toIndentedString(addVisibleFlag)).append("\n");
            sb.append("    importantFlag: ").append(toIndentedString(importantFlag)).append("\n");
            sb.append("    bulkEditAllowed: ").append(toIndentedString(bulkEditAllowed)).append("\n");
            sb.append("    searchableFlag: ").append(toIndentedString(searchableFlag)).append("\n");
            sb.append("    filteringAllowed: ").append(toIndentedString(filteringAllowed)).append("\n");
            sb.append("    sortableFlag: ").append(toIndentedString(sortableFlag)).append("\n");
            sb.append("    mandatoryFlag: ").append(toIndentedString(mandatoryFlag)).append("\n");
            sb.append("    options: ").append(toIndentedString(options)).append("\n");
            sb.append("    optionsDeleted: ").append(toIndentedString(optionsDeleted)).append("\n");
            sb.append("    isSubfield: ").append(toIndentedString(isSubfield)).append("\n");
            sb.append("    subfields: ").append(toIndentedString(subfields)).append("\n");
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
