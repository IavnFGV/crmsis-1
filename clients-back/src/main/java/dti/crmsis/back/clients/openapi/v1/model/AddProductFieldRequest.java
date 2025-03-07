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
public class AddProductFieldRequest  {

    /**
      * The name of the field
     **/
    private String name;
    /**
      * When `field_type` is either `set` or `enum`, possible options must be supplied as a JSON-encoded sequential array, for example:</br>`[{\"label\":\"red\"}, {\"label\":\"blue\"}, {\"label\":\"lilac\"}]`
     **/
    private List<Object> options;

    public enum FieldTypeEnum {
        VARCHAR(String.valueOf("varchar")), VARCHAR_AUTO(String.valueOf("varchar_auto")), TEXT(String.valueOf("text")), DOUBLE(String.valueOf("double")), MONETARY(String.valueOf("monetary")), DATE(String.valueOf("date")), SET(String.valueOf("set")), ENUM(String.valueOf("enum")), USER(String.valueOf("user")), ORG(String.valueOf("org")), PEOPLE(String.valueOf("people")), PHONE(String.valueOf("phone")), TIME(String.valueOf("time")), TIMERANGE(String.valueOf("timerange")), DATERANGE(String.valueOf("daterange")), ADDRESS(String.valueOf("address"));

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
      * The type of the field<table><tr><th>Value</th><th>Description</th></tr><tr><td>`varchar`</td><td>Text (up to 255 characters)</td><tr><td>`varchar_auto`</td><td>Autocomplete text (up to 255 characters)</td><tr><td>`text`</td><td>Long text (up to 65k characters)</td><tr><td>`double`</td><td>Numeric value</td><tr><td>`monetary`</td><td>Monetary field (has a numeric value and a currency value)</td><tr><td>`date`</td><td>Date (format YYYY-MM-DD)</td><tr><td>`set`</td><td>Options field with a possibility of having multiple chosen options</td><tr><td>`enum`</td><td>Options field with a single possible chosen option</td><tr><td>`user`</td><td>User field (contains a user ID of another Pipedrive user)</td><tr><td>`org`</td><td>Organization field (contains an organization ID which is stored on the same account)</td><tr><td>`people`</td><td>Person field (contains a product ID which is stored on the same account)</td><tr><td>`phone`</td><td>Phone field (up to 255 numbers and/or characters)</td><tr><td>`time`</td><td>Time field (format HH:MM:SS)</td><tr><td>`timerange`</td><td>Time-range field (has a start time and end time value, both HH:MM:SS)</td><tr><td>`daterange`</td><td>Date-range field (has a start date and end date value, both YYYY-MM-DD)</td><tr><td>`address`</td><td>Address field</dd></table>
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

    public AddProductFieldRequest name(String name) {
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

    public AddProductFieldRequest options(List<Object> options) {
        this.options = options;
        return this;
    }
    public AddProductFieldRequest addOptionsItem(Object optionsItem) {
        if (this.options == null){
            options = new ArrayList<>();
        }
        this.options.add(optionsItem);
        return this;
    }

    /**
    * The type of the field<table><tr><th>Value</th><th>Description</th></tr><tr><td>`varchar`</td><td>Text (up to 255 characters)</td><tr><td>`varchar_auto`</td><td>Autocomplete text (up to 255 characters)</td><tr><td>`text`</td><td>Long text (up to 65k characters)</td><tr><td>`double`</td><td>Numeric value</td><tr><td>`monetary`</td><td>Monetary field (has a numeric value and a currency value)</td><tr><td>`date`</td><td>Date (format YYYY-MM-DD)</td><tr><td>`set`</td><td>Options field with a possibility of having multiple chosen options</td><tr><td>`enum`</td><td>Options field with a single possible chosen option</td><tr><td>`user`</td><td>User field (contains a user ID of another Pipedrive user)</td><tr><td>`org`</td><td>Organization field (contains an organization ID which is stored on the same account)</td><tr><td>`people`</td><td>Person field (contains a product ID which is stored on the same account)</td><tr><td>`phone`</td><td>Phone field (up to 255 numbers and/or characters)</td><tr><td>`time`</td><td>Time field (format HH:MM:SS)</td><tr><td>`timerange`</td><td>Time-range field (has a start time and end time value, both HH:MM:SS)</td><tr><td>`daterange`</td><td>Date-range field (has a start date and end date value, both YYYY-MM-DD)</td><tr><td>`address`</td><td>Address field</dd></table>
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

    public AddProductFieldRequest fieldType(FieldTypeEnum fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddProductFieldRequest {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddProductFieldRequest} object that
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

        AddProductFieldRequest model = (AddProductFieldRequest) obj;

        return java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(options, model.options) &&
        java.util.Objects.equals(fieldType, model.fieldType);
    }

    /**
     * Returns a hash code for a {@code AddProductFieldRequest}.
     *
     * @return a hash code value for a {@code AddProductFieldRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,
        options,
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

    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class AddProductFieldRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("options")
        private List<Object> options = null;

    public enum FieldTypeEnum {
        VARCHAR(String.valueOf("varchar")), VARCHAR_AUTO(String.valueOf("varchar_auto")), TEXT(String.valueOf("text")), DOUBLE(String.valueOf("double")), MONETARY(String.valueOf("monetary")), DATE(String.valueOf("date")), SET(String.valueOf("set")), ENUM(String.valueOf("enum")), USER(String.valueOf("user")), ORG(String.valueOf("org")), PEOPLE(String.valueOf("people")), PHONE(String.valueOf("phone")), TIME(String.valueOf("time")), TIMERANGE(String.valueOf("timerange")), DATERANGE(String.valueOf("daterange")), ADDRESS(String.valueOf("address"));

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

        public AddProductFieldRequestQueryParam name(String name) {
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

        public AddProductFieldRequestQueryParam options(List<Object> options) {
            this.options = options;
            return this;
        }
        public AddProductFieldRequestQueryParam addOptionsItem(Object optionsItem) {
            this.options.add(optionsItem);
            return this;
        }

        /**
        * The type of the field<table><tr><th>Value</th><th>Description</th></tr><tr><td>`varchar`</td><td>Text (up to 255 characters)</td><tr><td>`varchar_auto`</td><td>Autocomplete text (up to 255 characters)</td><tr><td>`text`</td><td>Long text (up to 65k characters)</td><tr><td>`double`</td><td>Numeric value</td><tr><td>`monetary`</td><td>Monetary field (has a numeric value and a currency value)</td><tr><td>`date`</td><td>Date (format YYYY-MM-DD)</td><tr><td>`set`</td><td>Options field with a possibility of having multiple chosen options</td><tr><td>`enum`</td><td>Options field with a single possible chosen option</td><tr><td>`user`</td><td>User field (contains a user ID of another Pipedrive user)</td><tr><td>`org`</td><td>Organization field (contains an organization ID which is stored on the same account)</td><tr><td>`people`</td><td>Person field (contains a product ID which is stored on the same account)</td><tr><td>`phone`</td><td>Phone field (up to 255 numbers and/or characters)</td><tr><td>`time`</td><td>Time field (format HH:MM:SS)</td><tr><td>`timerange`</td><td>Time-range field (has a start time and end time value, both HH:MM:SS)</td><tr><td>`daterange`</td><td>Date-range field (has a start date and end date value, both YYYY-MM-DD)</td><tr><td>`address`</td><td>Address field</dd></table>
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

        public AddProductFieldRequestQueryParam fieldType(FieldTypeEnum fieldType) {
            this.fieldType = fieldType;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddProductFieldRequestQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
