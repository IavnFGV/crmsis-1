package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.BasePipeline;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class RecentsDataInnerAnyOf8  {


    public enum ItemEnum {
        PIPELINE(String.valueOf("pipeline"));

        // caching enum access
        private static final java.util.EnumSet<ItemEnum> values = java.util.EnumSet.allOf(ItemEnum.class);

        String value;

        ItemEnum (String v) {
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
    private BasePipeline data;

    /**
    * Get item
    * @return item
    **/
    @JsonProperty("item")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ItemEnum getItem() {
        return item;
    }

    /**
     * Set item
     **/
    public void setItem(ItemEnum item) {
        this.item = item;
    }

    public RecentsDataInnerAnyOf8 item(ItemEnum item) {
        this.item = item;
        return this;
    }

    /**
    * Get id
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

    public RecentsDataInnerAnyOf8 id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * Get data
    * @return data
    **/
    @JsonProperty("data")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BasePipeline getData() {
        return data;
    }

    /**
     * Set data
     **/
    public void setData(BasePipeline data) {
        this.data = data;
    }

    public RecentsDataInnerAnyOf8 data(BasePipeline data) {
        this.data = data;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecentsDataInnerAnyOf8 {\n");

        sb.append("    item: ").append(toIndentedString(item)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code RecentsDataInnerAnyOf8} object that
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

        RecentsDataInnerAnyOf8 model = (RecentsDataInnerAnyOf8) obj;

        return java.util.Objects.equals(item, model.item) &&
        java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(data, model.data);
    }

    /**
     * Returns a hash code for a {@code RecentsDataInnerAnyOf8}.
     *
     * @return a hash code value for a {@code RecentsDataInnerAnyOf8}.
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

    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class RecentsDataInnerAnyOf8QueryParam  {


    public enum ItemEnum {
        PIPELINE(String.valueOf("pipeline"));

        // caching enum access
        private static final java.util.EnumSet<ItemEnum> values = java.util.EnumSet.allOf(ItemEnum.class);

        String value;

        ItemEnum (String v) {
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
        private BasePipeline data;

        /**
        * Get item
        * @return item
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("item")
        public ItemEnum getItem() {
            return item;
        }

        /**
         * Set item
         **/
        public void setItem(ItemEnum item) {
            this.item = item;
        }

        public RecentsDataInnerAnyOf8QueryParam item(ItemEnum item) {
            this.item = item;
            return this;
        }

        /**
        * Get id
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

        public RecentsDataInnerAnyOf8QueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * Get data
        * @return data
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("data")
        public BasePipeline getData() {
            return data;
        }

        /**
         * Set data
         **/
        public void setData(BasePipeline data) {
            this.data = data;
        }

        public RecentsDataInnerAnyOf8QueryParam data(BasePipeline data) {
            this.data = data;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class RecentsDataInnerAnyOf8QueryParam {\n");

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
