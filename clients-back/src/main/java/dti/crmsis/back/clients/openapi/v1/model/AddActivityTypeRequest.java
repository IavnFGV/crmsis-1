package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class AddActivityTypeRequest  {

    /**
      * The name of the activity type
     **/
    private String name;

    public enum IconKeyEnum {
        TASK(String.valueOf("task")), EMAIL(String.valueOf("email")), MEETING(String.valueOf("meeting")), DEADLINE(String.valueOf("deadline")), CALL(String.valueOf("call")), LUNCH(String.valueOf("lunch")), CALENDAR(String.valueOf("calendar")), DOWNARROW(String.valueOf("downarrow")), DOCUMENT(String.valueOf("document")), SMARTPHONE(String.valueOf("smartphone")), CAMERA(String.valueOf("camera")), SCISSORS(String.valueOf("scissors")), COGS(String.valueOf("cogs")), BUBBLE(String.valueOf("bubble")), UPARROW(String.valueOf("uparrow")), CHECKBOX(String.valueOf("checkbox")), SIGNPOST(String.valueOf("signpost")), SHUFFLE(String.valueOf("shuffle")), ADDRESSBOOK(String.valueOf("addressbook")), LINEGRAPH(String.valueOf("linegraph")), PICTURE(String.valueOf("picture")), CAR(String.valueOf("car")), WORLD(String.valueOf("world")), SEARCH(String.valueOf("search")), CLIP(String.valueOf("clip")), SOUND(String.valueOf("sound")), BRUSH(String.valueOf("brush")), KEY(String.valueOf("key")), PADLOCK(String.valueOf("padlock")), PRICETAG(String.valueOf("pricetag")), SUITCASE(String.valueOf("suitcase")), FINISH(String.valueOf("finish")), PLANE(String.valueOf("plane")), LOOP(String.valueOf("loop")), WIFI(String.valueOf("wifi")), TRUCK(String.valueOf("truck")), CART(String.valueOf("cart")), BULB(String.valueOf("bulb")), BELL(String.valueOf("bell")), PRESENTATION(String.valueOf("presentation"));

        // caching enum access
        private static final java.util.EnumSet<IconKeyEnum> values = java.util.EnumSet.allOf(IconKeyEnum.class);

        String value;

        IconKeyEnum (String v) {
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
        public static IconKeyEnum fromString(String v) {
            for (IconKeyEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    /**
      * Icon graphic to use for representing this activity type
     **/
    private IconKeyEnum iconKey;
    /**
      * A designated color for the activity type in 6-character HEX format (e.g. `FFFFFF` for white, `000000` for black)
     **/
    private String color;

    /**
    * The name of the activity type
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

    public AddActivityTypeRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Icon graphic to use for representing this activity type
    * @return iconKey
    **/
    @JsonProperty("icon_key")
    public IconKeyEnum getIconKey() {
        return iconKey;
    }

    /**
     * Set iconKey
     **/
    public void setIconKey(IconKeyEnum iconKey) {
        this.iconKey = iconKey;
    }

    public AddActivityTypeRequest iconKey(IconKeyEnum iconKey) {
        this.iconKey = iconKey;
        return this;
    }

    /**
    * A designated color for the activity type in 6-character HEX format (e.g. `FFFFFF` for white, `000000` for black)
    * @return color
    **/
    @JsonProperty("color")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getColor() {
        return color;
    }

    /**
     * Set color
     **/
    public void setColor(String color) {
        this.color = color;
    }

    public AddActivityTypeRequest color(String color) {
        this.color = color;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddActivityTypeRequest {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    iconKey: ").append(toIndentedString(iconKey)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddActivityTypeRequest} object that
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

        AddActivityTypeRequest model = (AddActivityTypeRequest) obj;

        return java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(iconKey, model.iconKey) &&
        java.util.Objects.equals(color, model.color);
    }

    /**
     * Returns a hash code for a {@code AddActivityTypeRequest}.
     *
     * @return a hash code value for a {@code AddActivityTypeRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,
        iconKey,
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

    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class AddActivityTypeRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("name")
        private String name;

    public enum IconKeyEnum {
        TASK(String.valueOf("task")), EMAIL(String.valueOf("email")), MEETING(String.valueOf("meeting")), DEADLINE(String.valueOf("deadline")), CALL(String.valueOf("call")), LUNCH(String.valueOf("lunch")), CALENDAR(String.valueOf("calendar")), DOWNARROW(String.valueOf("downarrow")), DOCUMENT(String.valueOf("document")), SMARTPHONE(String.valueOf("smartphone")), CAMERA(String.valueOf("camera")), SCISSORS(String.valueOf("scissors")), COGS(String.valueOf("cogs")), BUBBLE(String.valueOf("bubble")), UPARROW(String.valueOf("uparrow")), CHECKBOX(String.valueOf("checkbox")), SIGNPOST(String.valueOf("signpost")), SHUFFLE(String.valueOf("shuffle")), ADDRESSBOOK(String.valueOf("addressbook")), LINEGRAPH(String.valueOf("linegraph")), PICTURE(String.valueOf("picture")), CAR(String.valueOf("car")), WORLD(String.valueOf("world")), SEARCH(String.valueOf("search")), CLIP(String.valueOf("clip")), SOUND(String.valueOf("sound")), BRUSH(String.valueOf("brush")), KEY(String.valueOf("key")), PADLOCK(String.valueOf("padlock")), PRICETAG(String.valueOf("pricetag")), SUITCASE(String.valueOf("suitcase")), FINISH(String.valueOf("finish")), PLANE(String.valueOf("plane")), LOOP(String.valueOf("loop")), WIFI(String.valueOf("wifi")), TRUCK(String.valueOf("truck")), CART(String.valueOf("cart")), BULB(String.valueOf("bulb")), BELL(String.valueOf("bell")), PRESENTATION(String.valueOf("presentation"));

        // caching enum access
        private static final java.util.EnumSet<IconKeyEnum> values = java.util.EnumSet.allOf(IconKeyEnum.class);

        String value;

        IconKeyEnum (String v) {
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
        public static IconKeyEnum fromString(String v) {
            for (IconKeyEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private IconKeyEnum iconKey;
        @jakarta.ws.rs.QueryParam("color")
        private String color;

        /**
        * The name of the activity type
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

        public AddActivityTypeRequestQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Icon graphic to use for representing this activity type
        * @return iconKey
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("icon_key")
        public IconKeyEnum getIconKey() {
            return iconKey;
        }

        /**
         * Set iconKey
         **/
        public void setIconKey(IconKeyEnum iconKey) {
            this.iconKey = iconKey;
        }

        public AddActivityTypeRequestQueryParam iconKey(IconKeyEnum iconKey) {
            this.iconKey = iconKey;
            return this;
        }

        /**
        * A designated color for the activity type in 6-character HEX format (e.g. `FFFFFF` for white, `000000` for black)
        * @return color
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("color")
        public String getColor() {
            return color;
        }

        /**
         * Set color
         **/
        public void setColor(String color) {
            this.color = color;
        }

        public AddActivityTypeRequestQueryParam color(String color) {
            this.color = color;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddActivityTypeRequestQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    iconKey: ").append(toIndentedString(iconKey)).append("\n");
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
