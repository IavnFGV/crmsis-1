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

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateFieldRequest  {

    /**
      * The name of the field
     **/
    private String name;
    /**
      * When `field_type` is either set or enum, possible options must be supplied as a JSON-encoded sequential array of objects. Example: `[{\"label\":\"New Item\"}]`
     **/
    private List<Object> options;
    /**
      * Whether the field is available in the 'add new' modal or not (both in the web and mobile app)
     **/
    private Boolean addVisibleFlag = true;

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

    public CreateFieldRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * When `field_type` is either set or enum, possible options must be supplied as a JSON-encoded sequential array of objects. Example: `[{\"label\":\"New Item\"}]`
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

    public CreateFieldRequest options(List<Object> options) {
        this.options = options;
        return this;
    }
    public CreateFieldRequest addOptionsItem(Object optionsItem) {
        if (this.options == null){
            options = new ArrayList<>();
        }
        this.options.add(optionsItem);
        return this;
    }

    /**
    * Whether the field is available in the 'add new' modal or not (both in the web and mobile app)
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

    public CreateFieldRequest addVisibleFlag(Boolean addVisibleFlag) {
        this.addVisibleFlag = addVisibleFlag;
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

    public CreateFieldRequest fieldType(FieldTypeEnum fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFieldRequest {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    addVisibleFlag: ").append(toIndentedString(addVisibleFlag)).append("\n");
        sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code CreateFieldRequest} object that
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

        CreateFieldRequest model = (CreateFieldRequest) obj;

        return java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(options, model.options) &&
        java.util.Objects.equals(addVisibleFlag, model.addVisibleFlag) &&
        java.util.Objects.equals(fieldType, model.fieldType);
    }

    /**
     * Returns a hash code for a {@code CreateFieldRequest}.
     *
     * @return a hash code value for a {@code CreateFieldRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,
        options,
        addVisibleFlag,
        fieldType);
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
    public static class CreateFieldRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("options")
        private List<Object> options = null;
        @jakarta.ws.rs.QueryParam("addVisibleFlag")
        private Boolean addVisibleFlag = true;

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

        public CreateFieldRequestQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * When `field_type` is either set or enum, possible options must be supplied as a JSON-encoded sequential array of objects. Example: `[{\"label\":\"New Item\"}]`
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

        public CreateFieldRequestQueryParam options(List<Object> options) {
            this.options = options;
            return this;
        }
        public CreateFieldRequestQueryParam addOptionsItem(Object optionsItem) {
            this.options.add(optionsItem);
            return this;
        }

        /**
        * Whether the field is available in the 'add new' modal or not (both in the web and mobile app)
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

        public CreateFieldRequestQueryParam addVisibleFlag(Boolean addVisibleFlag) {
            this.addVisibleFlag = addVisibleFlag;
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

        public CreateFieldRequestQueryParam fieldType(FieldTypeEnum fieldType) {
            this.fieldType = fieldType;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CreateFieldRequestQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    options: ").append(toIndentedString(options)).append("\n");
            sb.append("    addVisibleFlag: ").append(toIndentedString(addVisibleFlag)).append("\n");
            sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
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
