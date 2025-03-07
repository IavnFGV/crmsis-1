package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetProductSearchResponseAllOfDataItemsInnerItemOwner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetProductSearchResponseAllOfDataItemsInnerItem  {

    /**
      * The ID of the product
     **/
    private Integer id;
    /**
      * The type of the item
     **/
    private String type;
    /**
      * The name of the product
     **/
    private String name;
    /**
      * The code of the product
     **/
    private Integer code;
    /**
      * The visibility of the product
     **/
    private Integer visibleTo;
    private GetProductSearchResponseAllOfDataItemsInnerItemOwner owner;
    /**
      * The custom fields
     **/
    private List<String> customFields;

    /**
    * The ID of the product
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

    public GetProductSearchResponseAllOfDataItemsInnerItem id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The type of the item
    * @return type
    **/
    @JsonProperty("type")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(String type) {
        this.type = type;
    }

    public GetProductSearchResponseAllOfDataItemsInnerItem type(String type) {
        this.type = type;
        return this;
    }

    /**
    * The name of the product
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

    public GetProductSearchResponseAllOfDataItemsInnerItem name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The code of the product
    * @return code
    **/
    @JsonProperty("code")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getCode() {
        return code;
    }

    /**
     * Set code
     **/
    public void setCode(Integer code) {
        this.code = code;
    }

    public GetProductSearchResponseAllOfDataItemsInnerItem code(Integer code) {
        this.code = code;
        return this;
    }

    /**
    * The visibility of the product
    * @return visibleTo
    **/
    @JsonProperty("visible_to")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getVisibleTo() {
        return visibleTo;
    }

    /**
     * Set visibleTo
     **/
    public void setVisibleTo(Integer visibleTo) {
        this.visibleTo = visibleTo;
    }

    public GetProductSearchResponseAllOfDataItemsInnerItem visibleTo(Integer visibleTo) {
        this.visibleTo = visibleTo;
        return this;
    }

    /**
    * Get owner
    * @return owner
    **/
    @JsonProperty("owner")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetProductSearchResponseAllOfDataItemsInnerItemOwner getOwner() {
        return owner;
    }

    /**
     * Set owner
     **/
    public void setOwner(GetProductSearchResponseAllOfDataItemsInnerItemOwner owner) {
        this.owner = owner;
    }

    public GetProductSearchResponseAllOfDataItemsInnerItem owner(GetProductSearchResponseAllOfDataItemsInnerItemOwner owner) {
        this.owner = owner;
        return this;
    }

    /**
    * The custom fields
    * @return customFields
    **/
    @JsonProperty("custom_fields")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getCustomFields() {
        return customFields;
    }

    /**
     * Set customFields
     **/
    public void setCustomFields(List<String> customFields) {
        this.customFields = customFields;
    }

    public GetProductSearchResponseAllOfDataItemsInnerItem customFields(List<String> customFields) {
        this.customFields = customFields;
        return this;
    }
    public GetProductSearchResponseAllOfDataItemsInnerItem addCustomFieldsItem(String customFieldsItem) {
        if (this.customFields == null){
            customFields = new ArrayList<>();
        }
        this.customFields.add(customFieldsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetProductSearchResponseAllOfDataItemsInnerItem {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetProductSearchResponseAllOfDataItemsInnerItem} object that
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

        GetProductSearchResponseAllOfDataItemsInnerItem model = (GetProductSearchResponseAllOfDataItemsInnerItem) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(type, model.type) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(code, model.code) &&
        java.util.Objects.equals(visibleTo, model.visibleTo) &&
        java.util.Objects.equals(owner, model.owner) &&
        java.util.Objects.equals(customFields, model.customFields);
    }

    /**
     * Returns a hash code for a {@code GetProductSearchResponseAllOfDataItemsInnerItem}.
     *
     * @return a hash code value for a {@code GetProductSearchResponseAllOfDataItemsInnerItem}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        type,
        name,
        code,
        visibleTo,
        owner,
        customFields);
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
    public static class GetProductSearchResponseAllOfDataItemsInnerItemQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("type")
        private String type;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("code")
        private Integer code;
        @jakarta.ws.rs.QueryParam("visibleTo")
        private Integer visibleTo;
        @jakarta.ws.rs.QueryParam("owner")
        private GetProductSearchResponseAllOfDataItemsInnerItemOwner owner;
        @jakarta.ws.rs.QueryParam("customFields")
        private List<String> customFields = null;

        /**
        * The ID of the product
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

        public GetProductSearchResponseAllOfDataItemsInnerItemQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The type of the item
        * @return type
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        public String getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(String type) {
            this.type = type;
        }

        public GetProductSearchResponseAllOfDataItemsInnerItemQueryParam type(String type) {
            this.type = type;
            return this;
        }

        /**
        * The name of the product
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

        public GetProductSearchResponseAllOfDataItemsInnerItemQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The code of the product
        * @return code
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("code")
        public Integer getCode() {
            return code;
        }

        /**
         * Set code
         **/
        public void setCode(Integer code) {
            this.code = code;
        }

        public GetProductSearchResponseAllOfDataItemsInnerItemQueryParam code(Integer code) {
            this.code = code;
            return this;
        }

        /**
        * The visibility of the product
        * @return visibleTo
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("visible_to")
        public Integer getVisibleTo() {
            return visibleTo;
        }

        /**
         * Set visibleTo
         **/
        public void setVisibleTo(Integer visibleTo) {
            this.visibleTo = visibleTo;
        }

        public GetProductSearchResponseAllOfDataItemsInnerItemQueryParam visibleTo(Integer visibleTo) {
            this.visibleTo = visibleTo;
            return this;
        }

        /**
        * Get owner
        * @return owner
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        public GetProductSearchResponseAllOfDataItemsInnerItemOwner getOwner() {
            return owner;
        }

        /**
         * Set owner
         **/
        public void setOwner(GetProductSearchResponseAllOfDataItemsInnerItemOwner owner) {
            this.owner = owner;
        }

        public GetProductSearchResponseAllOfDataItemsInnerItemQueryParam owner(GetProductSearchResponseAllOfDataItemsInnerItemOwner owner) {
            this.owner = owner;
            return this;
        }

        /**
        * The custom fields
        * @return customFields
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("custom_fields")
        public List<String> getCustomFields() {
            return customFields;
        }

        /**
         * Set customFields
         **/
        public void setCustomFields(List<String> customFields) {
            this.customFields = customFields;
        }

        public GetProductSearchResponseAllOfDataItemsInnerItemQueryParam customFields(List<String> customFields) {
            this.customFields = customFields;
            return this;
        }
        public GetProductSearchResponseAllOfDataItemsInnerItemQueryParam addCustomFieldsItem(String customFieldsItem) {
            this.customFields.add(customFieldsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetProductSearchResponseAllOfDataItemsInnerItemQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    code: ").append(toIndentedString(code)).append("\n");
            sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
            sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
            sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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
