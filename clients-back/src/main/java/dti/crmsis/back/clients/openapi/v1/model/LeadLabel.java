package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LeadLabel  {

    /**
      * The unique ID of the lead label
     **/
    private UUID id;
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
      * The date and time of when the lead label was created. In ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
     **/
    private OffsetDateTime addTime;
    /**
      * The date and time of when the lead label was last updated. In ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
     **/
    private OffsetDateTime updateTime;

    /**
    * The unique ID of the lead label
    * @return id
    **/
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(UUID id) {
        this.id = id;
    }

    public LeadLabel id(UUID id) {
        this.id = id;
        return this;
    }

    /**
    * The name of the lead label
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

    public LeadLabel name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The color of the label. Only a subset of colors can be used.
    * @return color
    **/
    @JsonProperty("color")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ColorEnum getColor() {
        return color;
    }

    /**
     * Set color
     **/
    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public LeadLabel color(ColorEnum color) {
        this.color = color;
        return this;
    }

    /**
    * The date and time of when the lead label was created. In ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
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

    public LeadLabel addTime(OffsetDateTime addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The date and time of when the lead label was last updated. In ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
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

    public LeadLabel updateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LeadLabel {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code LeadLabel} object that
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

        LeadLabel model = (LeadLabel) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(color, model.color) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime);
    }

    /**
     * Returns a hash code for a {@code LeadLabel}.
     *
     * @return a hash code value for a {@code LeadLabel}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        name,
        color,
        addTime,
        updateTime);
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
    public static class LeadLabelQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private UUID id;
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
        @jakarta.ws.rs.QueryParam("addTime")
        private OffsetDateTime addTime;
        @jakarta.ws.rs.QueryParam("updateTime")
        private OffsetDateTime updateTime;

        /**
        * The unique ID of the lead label
        * @return id
        **/
        @JsonProperty("id")
        public UUID getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(UUID id) {
            this.id = id;
        }

        public LeadLabelQueryParam id(UUID id) {
            this.id = id;
            return this;
        }

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

        public LeadLabelQueryParam name(String name) {
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

        public LeadLabelQueryParam color(ColorEnum color) {
            this.color = color;
            return this;
        }

        /**
        * The date and time of when the lead label was created. In ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
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

        public LeadLabelQueryParam addTime(OffsetDateTime addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The date and time of when the lead label was last updated. In ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
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

        public LeadLabelQueryParam updateTime(OffsetDateTime updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LeadLabelQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    color: ").append(toIndentedString(color)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
