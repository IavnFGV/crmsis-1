package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddLeadLabelRequest  {

    /**
      * The name of the lead label
     **/
    private String name;

    public enum ColorEnum {
        BLUE(String.valueOf("blue")), BROWN(String.valueOf("brown")), DARK_MINUS_GRAY(String.valueOf("dark-gray")), GRAY(String.valueOf("gray")), GREEN(String.valueOf("green")), ORANGE(String.valueOf("orange")), PINK(String.valueOf("pink")), PURPLE(String.valueOf("purple")), RED(String.valueOf("red")), YELLOW(String.valueOf("yellow"));

        // caching enum access
        private static final java.util.EnumSet<ColorEnum> values = java.util.EnumSet.allOf(ColorEnum.class);

        String value;

        ColorEnum (String v) {
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
        public static ColorEnum fromString(String v) {
            for (ColorEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    /**
      * The color of the label. Only a subset of colors can be used.
     **/
    private ColorEnum color;

    /**
    * The name of the lead label
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

    public AddLeadLabelRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The color of the label. Only a subset of colors can be used.
    * @return color
    **/
    @JsonProperty("color")
    public ColorEnum getColor() {
        return color;
    }

    /**
     * Set color
     **/
    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public AddLeadLabelRequest color(ColorEnum color) {
        this.color = color;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddLeadLabelRequest {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddLeadLabelRequest} object that
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

        AddLeadLabelRequest model = (AddLeadLabelRequest) obj;

        return java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(color, model.color);
    }

    /**
     * Returns a hash code for a {@code AddLeadLabelRequest}.
     *
     * @return a hash code value for a {@code AddLeadLabelRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,
        color);
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
    public static class AddLeadLabelRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("name")
        private String name;

    public enum ColorEnum {
        BLUE(String.valueOf("blue")), BROWN(String.valueOf("brown")), DARK_MINUS_GRAY(String.valueOf("dark-gray")), GRAY(String.valueOf("gray")), GREEN(String.valueOf("green")), ORANGE(String.valueOf("orange")), PINK(String.valueOf("pink")), PURPLE(String.valueOf("purple")), RED(String.valueOf("red")), YELLOW(String.valueOf("yellow"));

        // caching enum access
        private static final java.util.EnumSet<ColorEnum> values = java.util.EnumSet.allOf(ColorEnum.class);

        String value;

        ColorEnum (String v) {
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
        public static ColorEnum fromString(String v) {
            for (ColorEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private ColorEnum color;

        /**
        * The name of the lead label
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

        public AddLeadLabelRequestQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The color of the label. Only a subset of colors can be used.
        * @return color
        **/
        @JsonProperty("color")
        public ColorEnum getColor() {
            return color;
        }

        /**
         * Set color
         **/
        public void setColor(ColorEnum color) {
            this.color = color;
        }

        public AddLeadLabelRequestQueryParam color(ColorEnum color) {
            this.color = color;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddLeadLabelRequestQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    color: ").append(toIndentedString(color)).append("\n");
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
