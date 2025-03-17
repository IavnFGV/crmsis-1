package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetItemSearchFieldResponseAllOfDataInner  {

    /**
      * The ID of the item
     **/
    private Integer id;
    /**
      * The value of the searched `field_key`
     **/
    private Object $fieldKey = null;

    /**
    * The ID of the item
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

    public GetItemSearchFieldResponseAllOfDataInner id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The value of the searched `field_key`
    * @return $fieldKey
    **/
    @JsonProperty("$field_key")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Object get$FieldKey() {
        return $fieldKey;
    }

    /**
     * Set $fieldKey
     **/
    public void set$FieldKey(Object $fieldKey) {
        this.$fieldKey = $fieldKey;
    }

    public GetItemSearchFieldResponseAllOfDataInner $fieldKey(Object $fieldKey) {
        this.$fieldKey = $fieldKey;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetItemSearchFieldResponseAllOfDataInner {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    $fieldKey: ").append(toIndentedString($fieldKey)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetItemSearchFieldResponseAllOfDataInner} object that
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

        GetItemSearchFieldResponseAllOfDataInner model = (GetItemSearchFieldResponseAllOfDataInner) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals($fieldKey, model.$fieldKey);
    }

    /**
     * Returns a hash code for a {@code GetItemSearchFieldResponseAllOfDataInner}.
     *
     * @return a hash code value for a {@code GetItemSearchFieldResponseAllOfDataInner}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        $fieldKey);
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
    public static class GetItemSearchFieldResponseAllOfDataInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("$fieldKey")
        private Object $fieldKey = null;

        /**
        * The ID of the item
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

        public GetItemSearchFieldResponseAllOfDataInnerQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The value of the searched `field_key`
        * @return $fieldKey
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("$field_key")
        public Object get$FieldKey() {
            return $fieldKey;
        }

        /**
         * Set $fieldKey
         **/
        public void set$FieldKey(Object $fieldKey) {
            this.$fieldKey = $fieldKey;
        }

        public GetItemSearchFieldResponseAllOfDataInnerQueryParam $fieldKey(Object $fieldKey) {
            this.$fieldKey = $fieldKey;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetItemSearchFieldResponseAllOfDataInnerQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    $fieldKey: ").append(toIndentedString($fieldKey)).append("\n");
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
