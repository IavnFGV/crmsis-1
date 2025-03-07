package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.SearchItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetItemSearchResponseAllOfData  {

    /**
      * The array of found items
     **/
    private List<SearchItem> items;
    /**
      * The array of related items if `search_for_related_items` was enabled
     **/
    private List<SearchItem> relatedItems;

    /**
    * The array of found items
    * @return items
    **/
    @JsonProperty("items")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<SearchItem> getItems() {
        return items;
    }

    /**
     * Set items
     **/
    public void setItems(List<SearchItem> items) {
        this.items = items;
    }

    public GetItemSearchResponseAllOfData items(List<SearchItem> items) {
        this.items = items;
        return this;
    }
    public GetItemSearchResponseAllOfData addItemsItem(SearchItem itemsItem) {
        if (this.items == null){
            items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
    * The array of related items if `search_for_related_items` was enabled
    * @return relatedItems
    **/
    @JsonProperty("related_items")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<SearchItem> getRelatedItems() {
        return relatedItems;
    }

    /**
     * Set relatedItems
     **/
    public void setRelatedItems(List<SearchItem> relatedItems) {
        this.relatedItems = relatedItems;
    }

    public GetItemSearchResponseAllOfData relatedItems(List<SearchItem> relatedItems) {
        this.relatedItems = relatedItems;
        return this;
    }
    public GetItemSearchResponseAllOfData addRelatedItemsItem(SearchItem relatedItemsItem) {
        if (this.relatedItems == null){
            relatedItems = new ArrayList<>();
        }
        this.relatedItems.add(relatedItemsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetItemSearchResponseAllOfData {\n");

        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    relatedItems: ").append(toIndentedString(relatedItems)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetItemSearchResponseAllOfData} object that
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

        GetItemSearchResponseAllOfData model = (GetItemSearchResponseAllOfData) obj;

        return java.util.Objects.equals(items, model.items) &&
        java.util.Objects.equals(relatedItems, model.relatedItems);
    }

    /**
     * Returns a hash code for a {@code GetItemSearchResponseAllOfData}.
     *
     * @return a hash code value for a {@code GetItemSearchResponseAllOfData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(items,
        relatedItems);
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
    public static class GetItemSearchResponseAllOfDataQueryParam  {

        @jakarta.ws.rs.QueryParam("items")
        private List<SearchItem> items = null;
        @jakarta.ws.rs.QueryParam("relatedItems")
        private List<SearchItem> relatedItems = null;

        /**
        * The array of found items
        * @return items
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        public List<SearchItem> getItems() {
            return items;
        }

        /**
         * Set items
         **/
        public void setItems(List<SearchItem> items) {
            this.items = items;
        }

        public GetItemSearchResponseAllOfDataQueryParam items(List<SearchItem> items) {
            this.items = items;
            return this;
        }
        public GetItemSearchResponseAllOfDataQueryParam addItemsItem(SearchItem itemsItem) {
            this.items.add(itemsItem);
            return this;
        }

        /**
        * The array of related items if `search_for_related_items` was enabled
        * @return relatedItems
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("related_items")
        public List<SearchItem> getRelatedItems() {
            return relatedItems;
        }

        /**
         * Set relatedItems
         **/
        public void setRelatedItems(List<SearchItem> relatedItems) {
            this.relatedItems = relatedItems;
        }

        public GetItemSearchResponseAllOfDataQueryParam relatedItems(List<SearchItem> relatedItems) {
            this.relatedItems = relatedItems;
            return this;
        }
        public GetItemSearchResponseAllOfDataQueryParam addRelatedItemsItem(SearchItem relatedItemsItem) {
            this.relatedItems.add(relatedItemsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetItemSearchResponseAllOfDataQueryParam {\n");

            sb.append("    items: ").append(toIndentedString(items)).append("\n");
            sb.append("    relatedItems: ").append(toIndentedString(relatedItems)).append("\n");
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
