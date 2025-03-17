package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddFilterRequest  {

    /**
      * The name of the filter
     **/
    private String name;
    /**
      * The conditions of the filter as a JSON object. Please note that a maximum of 16 conditions is allowed per filter and `date` values must be supplied in the `YYYY-MM-DD` format. It requires a minimum structure as follows: `{\"glue\":\"and\",\"conditions\":[{\"glue\":\"and\",\"conditions\": [CONDITION_OBJECTS]},{\"glue\":\"or\",\"conditions\":[CONDITION_OBJECTS]}]}`. Replace `CONDITION_OBJECTS` with JSON objects of the following structure: `{\"object\":\"\",\"field_id\":\"\", \"operator\":\"\",\"value\":\"\", \"extra_value\":\"\"}` or leave the array empty. Depending on the object type you should use another API endpoint to get `field_id`. There are five types of objects you can choose from: `\"person\"`, `\"deal\"`, `\"organization\"`, `\"product\"`, `\"activity\"` and you can use these types of operators depending on what type of a field you have: `\"IS NOT NULL\"`, `\"IS NULL\"`, `\"<=\"`, `\">=\"`, `\"<\"`, `\">\"`, `\"!=\"`, `\"=\"`, `\"LIKE '$%'\"`, `\"LIKE '%$%'\"`, `\"NOT LIKE '$%'\"`. To get a better understanding of how filters work try creating them directly from the Pipedrive application.
     **/
    private Object conditions;

    public enum TypeEnum {
        DEALS(String.valueOf("deals")), LEADS(String.valueOf("leads")), ORG(String.valueOf("org")), PEOPLE(String.valueOf("people")), PRODUCTS(String.valueOf("products")), ACTIVITY(String.valueOf("activity")), PROJECTS(String.valueOf("projects"));

        // caching enum access
        private static final java.util.EnumSet<TypeEnum> values = java.util.EnumSet.allOf(TypeEnum.class);

        String value;

        TypeEnum (String v) {
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
        public static TypeEnum fromString(String v) {
            for (TypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private TypeEnum type;

    /**
    * The name of the filter
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

    public AddFilterRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The conditions of the filter as a JSON object. Please note that a maximum of 16 conditions is allowed per filter and `date` values must be supplied in the `YYYY-MM-DD` format. It requires a minimum structure as follows: `{\"glue\":\"and\",\"conditions\":[{\"glue\":\"and\",\"conditions\": [CONDITION_OBJECTS]},{\"glue\":\"or\",\"conditions\":[CONDITION_OBJECTS]}]}`. Replace `CONDITION_OBJECTS` with JSON objects of the following structure: `{\"object\":\"\",\"field_id\":\"\", \"operator\":\"\",\"value\":\"\", \"extra_value\":\"\"}` or leave the array empty. Depending on the object type you should use another API endpoint to get `field_id`. There are five types of objects you can choose from: `\"person\"`, `\"deal\"`, `\"organization\"`, `\"product\"`, `\"activity\"` and you can use these types of operators depending on what type of a field you have: `\"IS NOT NULL\"`, `\"IS NULL\"`, `\"<=\"`, `\">=\"`, `\"<\"`, `\">\"`, `\"!=\"`, `\"=\"`, `\"LIKE '$%'\"`, `\"LIKE '%$%'\"`, `\"NOT LIKE '$%'\"`. To get a better understanding of how filters work try creating them directly from the Pipedrive application.
    * @return conditions
    **/
    @JsonProperty("conditions")
    public Object getConditions() {
        return conditions;
    }

    /**
     * Set conditions
     **/
    public void setConditions(Object conditions) {
        this.conditions = conditions;
    }

    public AddFilterRequest conditions(Object conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
    * Get type
    * @return type
    **/
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(TypeEnum type) {
        this.type = type;
    }

    public AddFilterRequest type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddFilterRequest {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddFilterRequest} object that
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

        AddFilterRequest model = (AddFilterRequest) obj;

        return java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(conditions, model.conditions) &&
        java.util.Objects.equals(type, model.type);
    }

    /**
     * Returns a hash code for a {@code AddFilterRequest}.
     *
     * @return a hash code value for a {@code AddFilterRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,
        conditions,
        type);
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
    public static class AddFilterRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("conditions")
        private Object conditions;

    public enum TypeEnum {
        DEALS(String.valueOf("deals")), LEADS(String.valueOf("leads")), ORG(String.valueOf("org")), PEOPLE(String.valueOf("people")), PRODUCTS(String.valueOf("products")), ACTIVITY(String.valueOf("activity")), PROJECTS(String.valueOf("projects"));

        // caching enum access
        private static final java.util.EnumSet<TypeEnum> values = java.util.EnumSet.allOf(TypeEnum.class);

        String value;

        TypeEnum (String v) {
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
        public static TypeEnum fromString(String v) {
            for (TypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private TypeEnum type;

        /**
        * The name of the filter
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

        public AddFilterRequestQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The conditions of the filter as a JSON object. Please note that a maximum of 16 conditions is allowed per filter and `date` values must be supplied in the `YYYY-MM-DD` format. It requires a minimum structure as follows: `{\"glue\":\"and\",\"conditions\":[{\"glue\":\"and\",\"conditions\": [CONDITION_OBJECTS]},{\"glue\":\"or\",\"conditions\":[CONDITION_OBJECTS]}]}`. Replace `CONDITION_OBJECTS` with JSON objects of the following structure: `{\"object\":\"\",\"field_id\":\"\", \"operator\":\"\",\"value\":\"\", \"extra_value\":\"\"}` or leave the array empty. Depending on the object type you should use another API endpoint to get `field_id`. There are five types of objects you can choose from: `\"person\"`, `\"deal\"`, `\"organization\"`, `\"product\"`, `\"activity\"` and you can use these types of operators depending on what type of a field you have: `\"IS NOT NULL\"`, `\"IS NULL\"`, `\"<=\"`, `\">=\"`, `\"<\"`, `\">\"`, `\"!=\"`, `\"=\"`, `\"LIKE '$%'\"`, `\"LIKE '%$%'\"`, `\"NOT LIKE '$%'\"`. To get a better understanding of how filters work try creating them directly from the Pipedrive application.
        * @return conditions
        **/
        @JsonProperty("conditions")
        public Object getConditions() {
            return conditions;
        }

        /**
         * Set conditions
         **/
        public void setConditions(Object conditions) {
            this.conditions = conditions;
        }

        public AddFilterRequestQueryParam conditions(Object conditions) {
            this.conditions = conditions;
            return this;
        }

        /**
        * Get type
        * @return type
        **/
        @JsonProperty("type")
        public TypeEnum getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(TypeEnum type) {
            this.type = type;
        }

        public AddFilterRequestQueryParam type(TypeEnum type) {
            this.type = type;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddFilterRequestQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
