package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetDealSearchResponseAllOfDataItemsInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetDealSearchResponseAllOfData  {

    /**
      * The array of deals
     **/
    private List<GetDealSearchResponseAllOfDataItemsInner> items;

    /**
    * The array of deals
    * @return items
    **/
    @JsonProperty("items")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<GetDealSearchResponseAllOfDataItemsInner> getItems() {
        return items;
    }

    /**
     * Set items
     **/
    public void setItems(List<GetDealSearchResponseAllOfDataItemsInner> items) {
        this.items = items;
    }

    public GetDealSearchResponseAllOfData items(List<GetDealSearchResponseAllOfDataItemsInner> items) {
        this.items = items;
        return this;
    }
    public GetDealSearchResponseAllOfData addItemsItem(GetDealSearchResponseAllOfDataItemsInner itemsItem) {
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
        sb.append("class GetDealSearchResponseAllOfData {\n");

        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetDealSearchResponseAllOfData} object that
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

        GetDealSearchResponseAllOfData model = (GetDealSearchResponseAllOfData) obj;

        return java.util.Objects.equals(items, model.items);
    }

    /**
     * Returns a hash code for a {@code GetDealSearchResponseAllOfData}.
     *
     * @return a hash code value for a {@code GetDealSearchResponseAllOfData}.
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
    public static class GetDealSearchResponseAllOfDataQueryParam  {

        @jakarta.ws.rs.QueryParam("items")
        private List<GetDealSearchResponseAllOfDataItemsInner> items = null;

        /**
        * The array of deals
        * @return items
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        public List<GetDealSearchResponseAllOfDataItemsInner> getItems() {
            return items;
        }

        /**
         * Set items
         **/
        public void setItems(List<GetDealSearchResponseAllOfDataItemsInner> items) {
            this.items = items;
        }

        public GetDealSearchResponseAllOfDataQueryParam items(List<GetDealSearchResponseAllOfDataItemsInner> items) {
            this.items = items;
            return this;
        }
        public GetDealSearchResponseAllOfDataQueryParam addItemsItem(GetDealSearchResponseAllOfDataItemsInner itemsItem) {
            this.items.add(itemsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetDealSearchResponseAllOfDataQueryParam {\n");

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
