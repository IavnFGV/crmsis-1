package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetPersonProductsResponseAllOfDataInnerDEALIDDeal;
import dti.crmsis.back.clients.openapi.v1.model.GetPersonProductsResponseAllOfDataInnerDEALIDProduct;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetPersonProductsResponseAllOfDataInnerDEALID  {

    private GetPersonProductsResponseAllOfDataInnerDEALIDDeal deal;
    private GetPersonProductsResponseAllOfDataInnerDEALIDProduct product;

    /**
    * Get deal
    * @return deal
    **/
    @JsonProperty("deal")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal getDeal() {
        return deal;
    }

    /**
     * Set deal
     **/
    public void setDeal(GetPersonProductsResponseAllOfDataInnerDEALIDDeal deal) {
        this.deal = deal;
    }

    public GetPersonProductsResponseAllOfDataInnerDEALID deal(GetPersonProductsResponseAllOfDataInnerDEALIDDeal deal) {
        this.deal = deal;
        return this;
    }

    /**
    * Get product
    * @return product
    **/
    @JsonProperty("product")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetPersonProductsResponseAllOfDataInnerDEALIDProduct getProduct() {
        return product;
    }

    /**
     * Set product
     **/
    public void setProduct(GetPersonProductsResponseAllOfDataInnerDEALIDProduct product) {
        this.product = product;
    }

    public GetPersonProductsResponseAllOfDataInnerDEALID product(GetPersonProductsResponseAllOfDataInnerDEALIDProduct product) {
        this.product = product;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPersonProductsResponseAllOfDataInnerDEALID {\n");

        sb.append("    deal: ").append(toIndentedString(deal)).append("\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetPersonProductsResponseAllOfDataInnerDEALID} object that
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

        GetPersonProductsResponseAllOfDataInnerDEALID model = (GetPersonProductsResponseAllOfDataInnerDEALID) obj;

        return java.util.Objects.equals(deal, model.deal) &&
        java.util.Objects.equals(product, model.product);
    }

    /**
     * Returns a hash code for a {@code GetPersonProductsResponseAllOfDataInnerDEALID}.
     *
     * @return a hash code value for a {@code GetPersonProductsResponseAllOfDataInnerDEALID}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(deal,
        product);
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
    public static class GetPersonProductsResponseAllOfDataInnerDEALIDQueryParam  {

        @jakarta.ws.rs.QueryParam("deal")
        private GetPersonProductsResponseAllOfDataInnerDEALIDDeal deal;
        @jakarta.ws.rs.QueryParam("product")
        private GetPersonProductsResponseAllOfDataInnerDEALIDProduct product;

        /**
        * Get deal
        * @return deal
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("deal")
        public GetPersonProductsResponseAllOfDataInnerDEALIDDeal getDeal() {
            return deal;
        }

        /**
         * Set deal
         **/
        public void setDeal(GetPersonProductsResponseAllOfDataInnerDEALIDDeal deal) {
            this.deal = deal;
        }

        public GetPersonProductsResponseAllOfDataInnerDEALIDQueryParam deal(GetPersonProductsResponseAllOfDataInnerDEALIDDeal deal) {
            this.deal = deal;
            return this;
        }

        /**
        * Get product
        * @return product
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("product")
        public GetPersonProductsResponseAllOfDataInnerDEALIDProduct getProduct() {
            return product;
        }

        /**
         * Set product
         **/
        public void setProduct(GetPersonProductsResponseAllOfDataInnerDEALIDProduct product) {
            this.product = product;
        }

        public GetPersonProductsResponseAllOfDataInnerDEALIDQueryParam product(GetPersonProductsResponseAllOfDataInnerDEALIDProduct product) {
            this.product = product;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetPersonProductsResponseAllOfDataInnerDEALIDQueryParam {\n");

            sb.append("    deal: ").append(toIndentedString(deal)).append("\n");
            sb.append("    product: ").append(toIndentedString(product)).append("\n");
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
