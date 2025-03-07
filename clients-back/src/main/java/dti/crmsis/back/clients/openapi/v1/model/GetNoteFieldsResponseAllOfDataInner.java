package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetNoteFieldsResponseAllOfDataInnerAllOfOptionsInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetNoteFieldsResponseAllOfDataInner  {

    /**
      * The ID of the field
     **/
    private Integer id;
    /**
      * The key of the field
     **/
    private String key;
    /**
      * The name of the field
     **/
    private String name;

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
    private Boolean bulkEditAllowed;
    /**
      * Whether or not the field is mandatory
     **/
    private Boolean mandatoryFlag;
    /**
      * The options of the field. When there are no options, `null` is returned.
     **/
    private List<GetNoteFieldsResponseAllOfDataInnerAllOfOptionsInner> options;

    /**
    * The ID of the field
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

    public GetNoteFieldsResponseAllOfDataInner id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The key of the field
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

    public GetNoteFieldsResponseAllOfDataInner key(String key) {
        this.key = key;
        return this;
    }

    /**
    * The name of the field
    * @return name
    **/
    @JsonProperty("name")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public GetNoteFieldsResponseAllOfDataInner name(String name) {
        this.name = name;
        return this;
    }

    /**
    * List of all possible field types
    * @return fieldType
    **/
    @JsonProperty("field_type")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public FieldTypeEnum getFieldType() {
        return fieldType;
    }

    /**
     * Set fieldType
     **/
    public void setFieldType(FieldTypeEnum fieldType) {
        this.fieldType = fieldType;
    }

    public GetNoteFieldsResponseAllOfDataInner fieldType(FieldTypeEnum fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
    * The active flag of the field
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

    public GetNoteFieldsResponseAllOfDataInner activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * The edit flag of the field
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

    public GetNoteFieldsResponseAllOfDataInner editFlag(Boolean editFlag) {
        this.editFlag = editFlag;
        return this;
    }

    /**
    * Not used
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

    public GetNoteFieldsResponseAllOfDataInner bulkEditAllowed(Boolean bulkEditAllowed) {
        this.bulkEditAllowed = bulkEditAllowed;
        return this;
    }

    /**
    * Whether or not the field is mandatory
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

    public GetNoteFieldsResponseAllOfDataInner mandatoryFlag(Boolean mandatoryFlag) {
        this.mandatoryFlag = mandatoryFlag;
        return this;
    }

    /**
    * The options of the field. When there are no options, `null` is returned.
    * @return options
    **/
    @JsonProperty("options")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<GetNoteFieldsResponseAllOfDataInnerAllOfOptionsInner> getOptions() {
        return options;
    }

    /**
     * Set options
     **/
    public void setOptions(List<GetNoteFieldsResponseAllOfDataInnerAllOfOptionsInner> options) {
        this.options = options;
    }

    public GetNoteFieldsResponseAllOfDataInner options(List<GetNoteFieldsResponseAllOfDataInnerAllOfOptionsInner> options) {
        this.options = options;
        return this;
    }
    public GetNoteFieldsResponseAllOfDataInner addOptionsItem(GetNoteFieldsResponseAllOfDataInnerAllOfOptionsInner optionsItem) {
        if (this.options == null){
            options = new ArrayList<>();
        }
        this.options.add(optionsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetNoteFieldsResponseAllOfDataInner {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    editFlag: ").append(toIndentedString(editFlag)).append("\n");
        sb.append("    bulkEditAllowed: ").append(toIndentedString(bulkEditAllowed)).append("\n");
        sb.append("    mandatoryFlag: ").append(toIndentedString(mandatoryFlag)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetNoteFieldsResponseAllOfDataInner} object that
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

        GetNoteFieldsResponseAllOfDataInner model = (GetNoteFieldsResponseAllOfDataInner) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(key, model.key) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(fieldType, model.fieldType) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(editFlag, model.editFlag) &&
        java.util.Objects.equals(bulkEditAllowed, model.bulkEditAllowed) &&
        java.util.Objects.equals(mandatoryFlag, model.mandatoryFlag) &&
        java.util.Objects.equals(options, model.options);
    }

    /**
     * Returns a hash code for a {@code GetNoteFieldsResponseAllOfDataInner}.
     *
     * @return a hash code value for a {@code GetNoteFieldsResponseAllOfDataInner}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        key,
        name,
        fieldType,
        activeFlag,
        editFlag,
        bulkEditAllowed,
        mandatoryFlag,
        options);
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
    public static class GetNoteFieldsResponseAllOfDataInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("key")
        private String key;
        @jakarta.ws.rs.QueryParam("name")
        private String name;

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
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        @jakarta.ws.rs.QueryParam("editFlag")
        private Boolean editFlag;
        @jakarta.ws.rs.QueryParam("bulkEditAllowed")
        private Boolean bulkEditAllowed;
        @jakarta.ws.rs.QueryParam("mandatoryFlag")
        private Boolean mandatoryFlag;
        @jakarta.ws.rs.QueryParam("options")
        private List<GetNoteFieldsResponseAllOfDataInnerAllOfOptionsInner> options = null;

        /**
        * The ID of the field
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

        public GetNoteFieldsResponseAllOfDataInnerQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The key of the field
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

        public GetNoteFieldsResponseAllOfDataInnerQueryParam key(String key) {
            this.key = key;
            return this;
        }

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

        public GetNoteFieldsResponseAllOfDataInnerQueryParam name(String name) {
            this.name = name;
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

        public GetNoteFieldsResponseAllOfDataInnerQueryParam fieldType(FieldTypeEnum fieldType) {
            this.fieldType = fieldType;
            return this;
        }

        /**
        * The active flag of the field
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

        public GetNoteFieldsResponseAllOfDataInnerQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * The edit flag of the field
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

        public GetNoteFieldsResponseAllOfDataInnerQueryParam editFlag(Boolean editFlag) {
            this.editFlag = editFlag;
            return this;
        }

        /**
        * Not used
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

        public GetNoteFieldsResponseAllOfDataInnerQueryParam bulkEditAllowed(Boolean bulkEditAllowed) {
            this.bulkEditAllowed = bulkEditAllowed;
            return this;
        }

        /**
        * Whether or not the field is mandatory
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

        public GetNoteFieldsResponseAllOfDataInnerQueryParam mandatoryFlag(Boolean mandatoryFlag) {
            this.mandatoryFlag = mandatoryFlag;
            return this;
        }

        /**
        * The options of the field. When there are no options, `null` is returned.
        * @return options
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("options")
        public List<GetNoteFieldsResponseAllOfDataInnerAllOfOptionsInner> getOptions() {
            return options;
        }

        /**
         * Set options
         **/
        public void setOptions(List<GetNoteFieldsResponseAllOfDataInnerAllOfOptionsInner> options) {
            this.options = options;
        }

        public GetNoteFieldsResponseAllOfDataInnerQueryParam options(List<GetNoteFieldsResponseAllOfDataInnerAllOfOptionsInner> options) {
            this.options = options;
            return this;
        }
        public GetNoteFieldsResponseAllOfDataInnerQueryParam addOptionsItem(GetNoteFieldsResponseAllOfDataInnerAllOfOptionsInner optionsItem) {
            this.options.add(optionsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetNoteFieldsResponseAllOfDataInnerQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    key: ").append(toIndentedString(key)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    editFlag: ").append(toIndentedString(editFlag)).append("\n");
            sb.append("    bulkEditAllowed: ").append(toIndentedString(bulkEditAllowed)).append("\n");
            sb.append("    mandatoryFlag: ").append(toIndentedString(mandatoryFlag)).append("\n");
            sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
