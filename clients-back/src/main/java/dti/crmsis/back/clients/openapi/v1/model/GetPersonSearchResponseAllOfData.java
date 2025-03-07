package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetPersonSearchResponseAllOfDataItemsInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetPersonSearchResponseAllOfData  {

    /**
      * The array of found items
     **/
    private List<GetPersonSearchResponseAllOfDataItemsInner> items;

    /**
    * The array of found items
    * @return items
    **/
    @JsonProperty("items")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<GetPersonSearchResponseAllOfDataItemsInner> getItems() {
        return items;
    }

    /**
     * Set items
     **/
    public void setItems(List<GetPersonSearchResponseAllOfDataItemsInner> items) {
        this.items = items;
    }

    public GetPersonSearchResponseAllOfData items(List<GetPersonSearchResponseAllOfDataItemsInner> items) {
        this.items = items;
        return this;
    }
    public GetPersonSearchResponseAllOfData addItemsItem(GetPersonSearchResponseAllOfDataItemsInner itemsItem) {
        if (this.items == null){
            items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPersonSearchResponseAllOfData {\n");

        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetPersonSearchResponseAllOfData} object that
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

        GetPersonSearchResponseAllOfData model = (GetPersonSearchResponseAllOfData) obj;

        return java.util.Objects.equals(items, model.items);
    }

    /**
     * Returns a hash code for a {@code GetPersonSearchResponseAllOfData}.
     *
     * @return a hash code value for a {@code GetPersonSearchResponseAllOfData}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(items);
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
    public static class GetPersonSearchResponseAllOfDataQueryParam  {

        @jakarta.ws.rs.QueryParam("items")
        private List<GetPersonSearchResponseAllOfDataItemsInner> items = null;

        /**
        * The array of found items
        * @return items
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        public List<GetPersonSearchResponseAllOfDataItemsInner> getItems() {
            return items;
        }

        /**
         * Set items
         **/
        public void setItems(List<GetPersonSearchResponseAllOfDataItemsInner> items) {
            this.items = items;
        }

        public GetPersonSearchResponseAllOfDataQueryParam items(List<GetPersonSearchResponseAllOfDataItemsInner> items) {
            this.items = items;
            return this;
        }
        public GetPersonSearchResponseAllOfDataQueryParam addItemsItem(GetPersonSearchResponseAllOfDataItemsInner itemsItem) {
            this.items.add(itemsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetPersonSearchResponseAllOfDataQueryParam {\n");

            sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
