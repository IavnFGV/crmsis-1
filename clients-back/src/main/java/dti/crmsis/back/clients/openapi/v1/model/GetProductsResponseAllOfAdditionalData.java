package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetActivitiesResponseAdditionalDataPagination;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetProductsResponseAllOfAdditionalData  {

    /**
      * The total quantity of the products
     **/
    private Integer productsQuantityTotal;
    /**
      * The total sum of the products
     **/
    private Integer productsSumTotal;
    /**
      * The total formatted quantity of the products
     **/
    private String productsQuantityTotalFormatted;
    /**
      * The total formatted sum of the products
     **/
    private String productsSumTotalFormatted;
    private GetActivitiesResponseAdditionalDataPagination pagination;

    /**
    * The total quantity of the products
    * @return productsQuantityTotal
    **/
    @JsonProperty("products_quantity_total")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getProductsQuantityTotal() {
        return productsQuantityTotal;
    }

    /**
     * Set productsQuantityTotal
     **/
    public void setProductsQuantityTotal(Integer productsQuantityTotal) {
        this.productsQuantityTotal = productsQuantityTotal;
    }

    public GetProductsResponseAllOfAdditionalData productsQuantityTotal(Integer productsQuantityTotal) {
        this.productsQuantityTotal = productsQuantityTotal;
        return this;
    }

    /**
    * The total sum of the products
    * @return productsSumTotal
    **/
    @JsonProperty("products_sum_total")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getProductsSumTotal() {
        return productsSumTotal;
    }

    /**
     * Set productsSumTotal
     **/
    public void setProductsSumTotal(Integer productsSumTotal) {
        this.productsSumTotal = productsSumTotal;
    }

    public GetProductsResponseAllOfAdditionalData productsSumTotal(Integer productsSumTotal) {
        this.productsSumTotal = productsSumTotal;
        return this;
    }

    /**
    * The total formatted quantity of the products
    * @return productsQuantityTotalFormatted
    **/
    @JsonProperty("products_quantity_total_formatted")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getProductsQuantityTotalFormatted() {
        return productsQuantityTotalFormatted;
    }

    /**
     * Set productsQuantityTotalFormatted
     **/
    public void setProductsQuantityTotalFormatted(String productsQuantityTotalFormatted) {
        this.productsQuantityTotalFormatted = productsQuantityTotalFormatted;
    }

    public GetProductsResponseAllOfAdditionalData productsQuantityTotalFormatted(String productsQuantityTotalFormatted) {
        this.productsQuantityTotalFormatted = productsQuantityTotalFormatted;
        return this;
    }

    /**
    * The total formatted sum of the products
    * @return productsSumTotalFormatted
    **/
    @JsonProperty("products_sum_total_formatted")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getProductsSumTotalFormatted() {
        return productsSumTotalFormatted;
    }

    /**
     * Set productsSumTotalFormatted
     **/
    public void setProductsSumTotalFormatted(String productsSumTotalFormatted) {
        this.productsSumTotalFormatted = productsSumTotalFormatted;
    }

    public GetProductsResponseAllOfAdditionalData productsSumTotalFormatted(String productsSumTotalFormatted) {
        this.productsSumTotalFormatted = productsSumTotalFormatted;
        return this;
    }

    /**
    * Get pagination
    * @return pagination
    **/
    @JsonProperty("pagination")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetActivitiesResponseAdditionalDataPagination getPagination() {
        return pagination;
    }

    /**
     * Set pagination
     **/
    public void setPagination(GetActivitiesResponseAdditionalDataPagination pagination) {
        this.pagination = pagination;
    }

    public GetProductsResponseAllOfAdditionalData pagination(GetActivitiesResponseAdditionalDataPagination pagination) {
        this.pagination = pagination;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetProductsResponseAllOfAdditionalData {\n");

        sb.append("    productsQuantityTotal: ").append(toIndentedString(productsQuantityTotal)).append("\n");
        sb.append("    productsSumTotal: ").append(toIndentedString(productsSumTotal)).append("\n");
        sb.append("    productsQuantityTotalFormatted: ").append(toIndentedString(productsQuantityTotalFormatted)).append("\n");
        sb.append("    productsSumTotalFormatted: ").append(toIndentedString(productsSumTotalFormatted)).append("\n");
        sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetProductsResponseAllOfAdditionalData} object that
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

        GetProductsResponseAllOfAdditionalData model = (GetProductsResponseAllOfAdditionalData) obj;

        return java.util.Objects.equals(productsQuantityTotal, model.productsQuantityTotal) &&
        java.util.Objects.equals(productsSumTotal, model.productsSumTotal) &&
        java.util.Objects.equals(productsQuantityTotalFormatted, model.productsQuantityTotalFormatted) &&
        java.util.Objects.equals(productsSumTotalFormatted, model.productsSumTotalFormatted) &&
        java.util.Objects.equals(pagination, model.pagination);
    }

    /**
     * Returns a hash code for a {@code GetProductsResponseAllOfAdditionalData}.
     *
     * @return a hash code value for a {@code GetProductsResponseAllOfAdditionalData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(productsQuantityTotal,
        productsSumTotal,
        productsQuantityTotalFormatted,
        productsSumTotalFormatted,
        pagination);
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
    public static class GetProductsResponseAllOfAdditionalDataQueryParam  {

        @jakarta.ws.rs.QueryParam("productsQuantityTotal")
        private Integer productsQuantityTotal;
        @jakarta.ws.rs.QueryParam("productsSumTotal")
        private Integer productsSumTotal;
        @jakarta.ws.rs.QueryParam("productsQuantityTotalFormatted")
        private String productsQuantityTotalFormatted;
        @jakarta.ws.rs.QueryParam("productsSumTotalFormatted")
        private String productsSumTotalFormatted;
        @jakarta.ws.rs.QueryParam("pagination")
        private GetActivitiesResponseAdditionalDataPagination pagination;

        /**
        * The total quantity of the products
        * @return productsQuantityTotal
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("products_quantity_total")
        public Integer getProductsQuantityTotal() {
            return productsQuantityTotal;
        }

        /**
         * Set productsQuantityTotal
         **/
        public void setProductsQuantityTotal(Integer productsQuantityTotal) {
            this.productsQuantityTotal = productsQuantityTotal;
        }

        public GetProductsResponseAllOfAdditionalDataQueryParam productsQuantityTotal(Integer productsQuantityTotal) {
            this.productsQuantityTotal = productsQuantityTotal;
            return this;
        }

        /**
        * The total sum of the products
        * @return productsSumTotal
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("products_sum_total")
        public Integer getProductsSumTotal() {
            return productsSumTotal;
        }

        /**
         * Set productsSumTotal
         **/
        public void setProductsSumTotal(Integer productsSumTotal) {
            this.productsSumTotal = productsSumTotal;
        }

        public GetProductsResponseAllOfAdditionalDataQueryParam productsSumTotal(Integer productsSumTotal) {
            this.productsSumTotal = productsSumTotal;
            return this;
        }

        /**
        * The total formatted quantity of the products
        * @return productsQuantityTotalFormatted
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("products_quantity_total_formatted")
        public String getProductsQuantityTotalFormatted() {
            return productsQuantityTotalFormatted;
        }

        /**
         * Set productsQuantityTotalFormatted
         **/
        public void setProductsQuantityTotalFormatted(String productsQuantityTotalFormatted) {
            this.productsQuantityTotalFormatted = productsQuantityTotalFormatted;
        }

        public GetProductsResponseAllOfAdditionalDataQueryParam productsQuantityTotalFormatted(String productsQuantityTotalFormatted) {
            this.productsQuantityTotalFormatted = productsQuantityTotalFormatted;
            return this;
        }

        /**
        * The total formatted sum of the products
        * @return productsSumTotalFormatted
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("products_sum_total_formatted")
        public String getProductsSumTotalFormatted() {
            return productsSumTotalFormatted;
        }

        /**
         * Set productsSumTotalFormatted
         **/
        public void setProductsSumTotalFormatted(String productsSumTotalFormatted) {
            this.productsSumTotalFormatted = productsSumTotalFormatted;
        }

        public GetProductsResponseAllOfAdditionalDataQueryParam productsSumTotalFormatted(String productsSumTotalFormatted) {
            this.productsSumTotalFormatted = productsSumTotalFormatted;
            return this;
        }

        /**
        * Get pagination
        * @return pagination
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("pagination")
        public GetActivitiesResponseAdditionalDataPagination getPagination() {
            return pagination;
        }

        /**
         * Set pagination
         **/
        public void setPagination(GetActivitiesResponseAdditionalDataPagination pagination) {
            this.pagination = pagination;
        }

        public GetProductsResponseAllOfAdditionalDataQueryParam pagination(GetActivitiesResponseAdditionalDataPagination pagination) {
            this.pagination = pagination;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetProductsResponseAllOfAdditionalDataQueryParam {\n");

            sb.append("    productsQuantityTotal: ").append(toIndentedString(productsQuantityTotal)).append("\n");
            sb.append("    productsSumTotal: ").append(toIndentedString(productsSumTotal)).append("\n");
            sb.append("    productsQuantityTotalFormatted: ").append(toIndentedString(productsQuantityTotalFormatted)).append("\n");
            sb.append("    productsSumTotalFormatted: ").append(toIndentedString(productsSumTotalFormatted)).append("\n");
            sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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
