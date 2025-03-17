package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.BaseUser;
import dti.crmsis.back.clients.openapi.v1.model.RecentsDataInnerAnyOf;
import dti.crmsis.back.clients.openapi.v1.model.RecentsDataInnerAnyOf1;
import dti.crmsis.back.clients.openapi.v1.model.RecentsDataInnerAnyOf10;
import dti.crmsis.back.clients.openapi.v1.model.RecentsDataInnerAnyOf2;
import dti.crmsis.back.clients.openapi.v1.model.RecentsDataInnerAnyOf3;
import dti.crmsis.back.clients.openapi.v1.model.RecentsDataInnerAnyOf4;
import dti.crmsis.back.clients.openapi.v1.model.RecentsDataInnerAnyOf5;
import dti.crmsis.back.clients.openapi.v1.model.RecentsDataInnerAnyOf6;
import dti.crmsis.back.clients.openapi.v1.model.RecentsDataInnerAnyOf7;
import dti.crmsis.back.clients.openapi.v1.model.RecentsDataInnerAnyOf8;
import dti.crmsis.back.clients.openapi.v1.model.RecentsDataInnerAnyOf9;
import dti.crmsis.back.clients.openapi.v1.model.RecentsStage;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecentsDataInner  {


    public enum ItemEnum {
        USER(String.valueOf("user"));

        // caching enum access
        private static final java.util.EnumSet<ItemEnum> values = java.util.EnumSet.allOf(ItemEnum.class);

        String value;

        ItemEnum (String v) {
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
        public static ItemEnum fromString(String v) {
            for (ItemEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private ItemEnum item;
    private Integer id;
    private BaseUser data;

    /**
    * Get item
    * @return item
    **/
    @JsonProperty("item")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ItemEnum getItem() {
        return item;
    }

    /**
     * Set item
     **/
    public void setItem(ItemEnum item) {
        this.item = item;
    }

    public RecentsDataInner item(ItemEnum item) {
        this.item = item;
        return this;
    }

    /**
    * Get id
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

    public RecentsDataInner id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * Get data
    * @return data
    **/
    @JsonProperty("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BaseUser getData() {
        return data;
    }

    /**
     * Set data
     **/
    public void setData(BaseUser data) {
        this.data = data;
    }

    public RecentsDataInner data(BaseUser data) {
        this.data = data;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecentsDataInner {\n");

        sb.append("    item: ").append(toIndentedString(item)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code RecentsDataInner} object that
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

        RecentsDataInner model = (RecentsDataInner) obj;

        return java.util.Objects.equals(item, model.item) &&
        java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(data, model.data);
    }

    /**
     * Returns a hash code for a {@code RecentsDataInner}.
     *
     * @return a hash code value for a {@code RecentsDataInner}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(item,
        id,
        data);
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
    public static class RecentsDataInnerQueryParam  {


    public enum ItemEnum {
        USER(String.valueOf("user"));

        // caching enum access
        private static final java.util.EnumSet<ItemEnum> values = java.util.EnumSet.allOf(ItemEnum.class);

        String value;

        ItemEnum (String v) {
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
        public static ItemEnum fromString(String v) {
            for (ItemEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private ItemEnum item;
        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("data")
        private BaseUser data;

        /**
        * Get item
        * @return item
        **/
        @JsonProperty("item")
        public ItemEnum getItem() {
            return item;
        }

        /**
         * Set item
         **/
        public void setItem(ItemEnum item) {
            this.item = item;
        }

        public RecentsDataInnerQueryParam item(ItemEnum item) {
            this.item = item;
            return this;
        }

        /**
        * Get id
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

        public RecentsDataInnerQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * Get data
        * @return data
        **/
        @JsonProperty("data")
        public BaseUser getData() {
            return data;
        }

        /**
         * Set data
         **/
        public void setData(BaseUser data) {
            this.data = data;
        }

        public RecentsDataInnerQueryParam data(BaseUser data) {
            this.data = data;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class RecentsDataInnerQueryParam {\n");

            sb.append("    item: ").append(toIndentedString(item)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
