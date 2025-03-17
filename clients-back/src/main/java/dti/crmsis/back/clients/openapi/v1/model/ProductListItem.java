package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.ProductListItemProduct;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductListItem  {

    /**
      * The ID of the deal-product (the ID of the product attached to the deal)
     **/
    private Integer id;
    /**
      * The ID of the deal
     **/
    private Integer dealId;
    /**
      * The order number of the product
     **/
    private Integer orderNr;
    /**
      * The ID of the product
     **/
    private Integer productId;
    /**
      * The ID of the product variation
     **/
    private Integer productVariationId;
    /**
      * The price value of the product
     **/
    private Integer itemPrice;
    /**
      * The value of the discount. The `discount_type` field can be used to specify whether the value is an amount or a percentage
     **/
    private BigDecimal discount = new BigDecimal("0");

    public enum DiscountTypeEnum {
        PERCENTAGE(String.valueOf("percentage")), AMOUNT(String.valueOf("amount"));

        // caching enum access
        private static final java.util.EnumSet<DiscountTypeEnum> values = java.util.EnumSet.allOf(DiscountTypeEnum.class);

        String value;

        DiscountTypeEnum (String v) {
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
        public static DiscountTypeEnum fromString(String v) {
            for (DiscountTypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    /**
      * The type of the discount's value
     **/
    private DiscountTypeEnum discountType = DiscountTypeEnum.PERCENTAGE;
    /**
      * The sum of all the products attached to the deal
     **/
    private BigDecimal sum;
    /**
      * The currency associated with the deal product
     **/
    private String currency;
    /**
      * Whether the product is enabled or not
     **/
    private Boolean enabledFlag;
    /**
      * The date and time when the product was added to the deal
     **/
    private String addTime;
    /**
      * The date and time when the deal product was last edited
     **/
    private String lastEdit;
    /**
      * The comments of the product
     **/
    private String comments;
    /**
      * Whether the product is active or not
     **/
    private Boolean activeFlag;
    /**
      * The product tax
     **/
    private BigDecimal tax;

    public enum TaxMethodEnum {
        EXCLUSIVE(String.valueOf("exclusive")), INCLUSIVE(String.valueOf("inclusive")), NONE(String.valueOf("none"));

        // caching enum access
        private static final java.util.EnumSet<TaxMethodEnum> values = java.util.EnumSet.allOf(TaxMethodEnum.class);

        String value;

        TaxMethodEnum (String v) {
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
        public static TaxMethodEnum fromString(String v) {
            for (TaxMethodEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    /**
      * The tax option to be applied to the products. When using `inclusive`, the tax percentage will already be included in the price. When using `exclusive`, the tax will not be included in the price. When using `none`, no tax will be added. Use the `tax` field for defining the tax percentage amount. By default, the user setting value for tax options will be used. Changing this in one product affects the rest of the products attached to the deal
     **/
    private TaxMethodEnum taxMethod;
    /**
      * The product name
     **/
    private String name;
    /**
      * The formatted sum of the product
     **/
    private String sumFormatted;
    /**
      * The formatted quantity of the product
     **/
    private String quantityFormatted;
    /**
      * The quantity of the product
     **/
    private Integer quantity;
    private ProductListItemProduct product;

    /**
    * The ID of the deal-product (the ID of the product attached to the deal)
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

    public ProductListItem id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The ID of the deal
    * @return dealId
    **/
    @JsonProperty("deal_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getDealId() {
        return dealId;
    }

    /**
     * Set dealId
     **/
    public void setDealId(Integer dealId) {
        this.dealId = dealId;
    }

    public ProductListItem dealId(Integer dealId) {
        this.dealId = dealId;
        return this;
    }

    /**
    * The order number of the product
    * @return orderNr
    **/
    @JsonProperty("order_nr")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getOrderNr() {
        return orderNr;
    }

    /**
     * Set orderNr
     **/
    public void setOrderNr(Integer orderNr) {
        this.orderNr = orderNr;
    }

    public ProductListItem orderNr(Integer orderNr) {
        this.orderNr = orderNr;
        return this;
    }

    /**
    * The ID of the product
    * @return productId
    **/
    @JsonProperty("product_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductId() {
        return productId;
    }

    /**
     * Set productId
     **/
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public ProductListItem productId(Integer productId) {
        this.productId = productId;
        return this;
    }

    /**
    * The ID of the product variation
    * @return productVariationId
    **/
    @JsonProperty("product_variation_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductVariationId() {
        return productVariationId;
    }

    /**
     * Set productVariationId
     **/
    public void setProductVariationId(Integer productVariationId) {
        this.productVariationId = productVariationId;
    }

    public ProductListItem productVariationId(Integer productVariationId) {
        this.productVariationId = productVariationId;
        return this;
    }

    /**
    * The price value of the product
    * @return itemPrice
    **/
    @JsonProperty("item_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getItemPrice() {
        return itemPrice;
    }

    /**
     * Set itemPrice
     **/
    public void setItemPrice(Integer itemPrice) {
        this.itemPrice = itemPrice;
    }

    public ProductListItem itemPrice(Integer itemPrice) {
        this.itemPrice = itemPrice;
        return this;
    }

    /**
    * The value of the discount. The `discount_type` field can be used to specify whether the value is an amount or a percentage
    * @return discount
    **/
    @JsonProperty("discount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Set discount
     **/
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public ProductListItem discount(BigDecimal discount) {
        this.discount = discount;
        return this;
    }

    /**
    * The type of the discount's value
    * @return discountType
    **/
    @JsonProperty("discount_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DiscountTypeEnum getDiscountType() {
        return discountType;
    }

    /**
     * Set discountType
     **/
    public void setDiscountType(DiscountTypeEnum discountType) {
        this.discountType = discountType;
    }

    public ProductListItem discountType(DiscountTypeEnum discountType) {
        this.discountType = discountType;
        return this;
    }

    /**
    * The sum of all the products attached to the deal
    * @return sum
    **/
    @JsonProperty("sum")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getSum() {
        return sum;
    }

    /**
     * Set sum
     **/
    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public ProductListItem sum(BigDecimal sum) {
        this.sum = sum;
        return this;
    }

    /**
    * The currency associated with the deal product
    * @return currency
    **/
    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Set currency
     **/
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ProductListItem currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
    * Whether the product is enabled or not
    * @return enabledFlag
    **/
    @JsonProperty("enabled_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getEnabledFlag() {
        return enabledFlag;
    }

    /**
     * Set enabledFlag
     **/
    public void setEnabledFlag(Boolean enabledFlag) {
        this.enabledFlag = enabledFlag;
    }

    public ProductListItem enabledFlag(Boolean enabledFlag) {
        this.enabledFlag = enabledFlag;
        return this;
    }

    /**
    * The date and time when the product was added to the deal
    * @return addTime
    **/
    @JsonProperty("add_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddTime() {
        return addTime;
    }

    /**
     * Set addTime
     **/
    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public ProductListItem addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The date and time when the deal product was last edited
    * @return lastEdit
    **/
    @JsonProperty("last_edit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastEdit() {
        return lastEdit;
    }

    /**
     * Set lastEdit
     **/
    public void setLastEdit(String lastEdit) {
        this.lastEdit = lastEdit;
    }

    public ProductListItem lastEdit(String lastEdit) {
        this.lastEdit = lastEdit;
        return this;
    }

    /**
    * The comments of the product
    * @return comments
    **/
    @JsonProperty("comments")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getComments() {
        return comments;
    }

    /**
     * Set comments
     **/
    public void setComments(String comments) {
        this.comments = comments;
    }

    public ProductListItem comments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
    * Whether the product is active or not
    * @return activeFlag
    **/
    @JsonProperty("active_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getActiveFlag() {
        return activeFlag;
    }

    /**
     * Set activeFlag
     **/
    public void setActiveFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
    }

    public ProductListItem activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * The product tax
    * @return tax
    **/
    @JsonProperty("tax")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * Set tax
     **/
    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public ProductListItem tax(BigDecimal tax) {
        this.tax = tax;
        return this;
    }

    /**
    * The tax option to be applied to the products. When using `inclusive`, the tax percentage will already be included in the price. When using `exclusive`, the tax will not be included in the price. When using `none`, no tax will be added. Use the `tax` field for defining the tax percentage amount. By default, the user setting value for tax options will be used. Changing this in one product affects the rest of the products attached to the deal
    * @return taxMethod
    **/
    @JsonProperty("tax_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TaxMethodEnum getTaxMethod() {
        return taxMethod;
    }

    /**
     * Set taxMethod
     **/
    public void setTaxMethod(TaxMethodEnum taxMethod) {
        this.taxMethod = taxMethod;
    }

    public ProductListItem taxMethod(TaxMethodEnum taxMethod) {
        this.taxMethod = taxMethod;
        return this;
    }

    /**
    * The product name
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

    public ProductListItem name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The formatted sum of the product
    * @return sumFormatted
    **/
    @JsonProperty("sum_formatted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSumFormatted() {
        return sumFormatted;
    }

    /**
     * Set sumFormatted
     **/
    public void setSumFormatted(String sumFormatted) {
        this.sumFormatted = sumFormatted;
    }

    public ProductListItem sumFormatted(String sumFormatted) {
        this.sumFormatted = sumFormatted;
        return this;
    }

    /**
    * The formatted quantity of the product
    * @return quantityFormatted
    **/
    @JsonProperty("quantity_formatted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getQuantityFormatted() {
        return quantityFormatted;
    }

    /**
     * Set quantityFormatted
     **/
    public void setQuantityFormatted(String quantityFormatted) {
        this.quantityFormatted = quantityFormatted;
    }

    public ProductListItem quantityFormatted(String quantityFormatted) {
        this.quantityFormatted = quantityFormatted;
        return this;
    }

    /**
    * The quantity of the product
    * @return quantity
    **/
    @JsonProperty("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Set quantity
     **/
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public ProductListItem quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
    * Get product
    * @return product
    **/
    @JsonProperty("product")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ProductListItemProduct getProduct() {
        return product;
    }

    /**
     * Set product
     **/
    public void setProduct(ProductListItemProduct product) {
        this.product = product;
    }

    public ProductListItem product(ProductListItemProduct product) {
        this.product = product;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductListItem {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
        sb.append("    orderNr: ").append(toIndentedString(orderNr)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productVariationId: ").append(toIndentedString(productVariationId)).append("\n");
        sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
        sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
        sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
        sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    enabledFlag: ").append(toIndentedString(enabledFlag)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    lastEdit: ").append(toIndentedString(lastEdit)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
        sb.append("    taxMethod: ").append(toIndentedString(taxMethod)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sumFormatted: ").append(toIndentedString(sumFormatted)).append("\n");
        sb.append("    quantityFormatted: ").append(toIndentedString(quantityFormatted)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code ProductListItem} object that
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

        ProductListItem model = (ProductListItem) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(dealId, model.dealId) &&
        java.util.Objects.equals(orderNr, model.orderNr) &&
        java.util.Objects.equals(productId, model.productId) &&
        java.util.Objects.equals(productVariationId, model.productVariationId) &&
        java.util.Objects.equals(itemPrice, model.itemPrice) &&
        java.util.Objects.equals(discount, model.discount) &&
        java.util.Objects.equals(discountType, model.discountType) &&
        java.util.Objects.equals(sum, model.sum) &&
        java.util.Objects.equals(currency, model.currency) &&
        java.util.Objects.equals(enabledFlag, model.enabledFlag) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(lastEdit, model.lastEdit) &&
        java.util.Objects.equals(comments, model.comments) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(tax, model.tax) &&
        java.util.Objects.equals(taxMethod, model.taxMethod) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(sumFormatted, model.sumFormatted) &&
        java.util.Objects.equals(quantityFormatted, model.quantityFormatted) &&
        java.util.Objects.equals(quantity, model.quantity) &&
        java.util.Objects.equals(product, model.product);
    }

    /**
     * Returns a hash code for a {@code ProductListItem}.
     *
     * @return a hash code value for a {@code ProductListItem}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        dealId,
        orderNr,
        productId,
        productVariationId,
        itemPrice,
        discount,
        discountType,
        sum,
        currency,
        enabledFlag,
        addTime,
        lastEdit,
        comments,
        activeFlag,
        tax,
        taxMethod,
        name,
        sumFormatted,
        quantityFormatted,
        quantity,
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ProductListItemQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("dealId")
        private Integer dealId;
        @jakarta.ws.rs.QueryParam("orderNr")
        private Integer orderNr;
        @jakarta.ws.rs.QueryParam("productId")
        private Integer productId;
        @jakarta.ws.rs.QueryParam("productVariationId")
        private Integer productVariationId;
        @jakarta.ws.rs.QueryParam("itemPrice")
        private Integer itemPrice;
        @jakarta.ws.rs.QueryParam("discount")
        private BigDecimal discount = new BigDecimal("0");

    public enum DiscountTypeEnum {
        PERCENTAGE(String.valueOf("percentage")), AMOUNT(String.valueOf("amount"));

        // caching enum access
        private static final java.util.EnumSet<DiscountTypeEnum> values = java.util.EnumSet.allOf(DiscountTypeEnum.class);

        String value;

        DiscountTypeEnum (String v) {
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
        public static DiscountTypeEnum fromString(String v) {
            for (DiscountTypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private DiscountTypeEnum discountType = DiscountTypeEnum.PERCENTAGE;
        @jakarta.ws.rs.QueryParam("sum")
        private BigDecimal sum;
        @jakarta.ws.rs.QueryParam("currency")
        private String currency;
        @jakarta.ws.rs.QueryParam("enabledFlag")
        private Boolean enabledFlag;
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        @jakarta.ws.rs.QueryParam("lastEdit")
        private String lastEdit;
        @jakarta.ws.rs.QueryParam("comments")
        private String comments;
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        @jakarta.ws.rs.QueryParam("tax")
        private BigDecimal tax;

    public enum TaxMethodEnum {
        EXCLUSIVE(String.valueOf("exclusive")), INCLUSIVE(String.valueOf("inclusive")), NONE(String.valueOf("none"));

        // caching enum access
        private static final java.util.EnumSet<TaxMethodEnum> values = java.util.EnumSet.allOf(TaxMethodEnum.class);

        String value;

        TaxMethodEnum (String v) {
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
        public static TaxMethodEnum fromString(String v) {
            for (TaxMethodEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private TaxMethodEnum taxMethod;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("sumFormatted")
        private String sumFormatted;
        @jakarta.ws.rs.QueryParam("quantityFormatted")
        private String quantityFormatted;
        @jakarta.ws.rs.QueryParam("quantity")
        private Integer quantity;
        @jakarta.ws.rs.QueryParam("product")
        private ProductListItemProduct product;

        /**
        * The ID of the deal-product (the ID of the product attached to the deal)
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

        public ProductListItemQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The ID of the deal
        * @return dealId
        **/
        @JsonProperty("deal_id")
        public Integer getDealId() {
            return dealId;
        }

        /**
         * Set dealId
         **/
        public void setDealId(Integer dealId) {
            this.dealId = dealId;
        }

        public ProductListItemQueryParam dealId(Integer dealId) {
            this.dealId = dealId;
            return this;
        }

        /**
        * The order number of the product
        * @return orderNr
        **/
        @JsonProperty("order_nr")
        public Integer getOrderNr() {
            return orderNr;
        }

        /**
         * Set orderNr
         **/
        public void setOrderNr(Integer orderNr) {
            this.orderNr = orderNr;
        }

        public ProductListItemQueryParam orderNr(Integer orderNr) {
            this.orderNr = orderNr;
            return this;
        }

        /**
        * The ID of the product
        * @return productId
        **/
        @JsonProperty("product_id")
        public Integer getProductId() {
            return productId;
        }

        /**
         * Set productId
         **/
        public void setProductId(Integer productId) {
            this.productId = productId;
        }

        public ProductListItemQueryParam productId(Integer productId) {
            this.productId = productId;
            return this;
        }

        /**
        * The ID of the product variation
        * @return productVariationId
        **/
        @JsonProperty("product_variation_id")
        public Integer getProductVariationId() {
            return productVariationId;
        }

        /**
         * Set productVariationId
         **/
        public void setProductVariationId(Integer productVariationId) {
            this.productVariationId = productVariationId;
        }

        public ProductListItemQueryParam productVariationId(Integer productVariationId) {
            this.productVariationId = productVariationId;
            return this;
        }

        /**
        * The price value of the product
        * @return itemPrice
        **/
        @JsonProperty("item_price")
        public Integer getItemPrice() {
            return itemPrice;
        }

        /**
         * Set itemPrice
         **/
        public void setItemPrice(Integer itemPrice) {
            this.itemPrice = itemPrice;
        }

        public ProductListItemQueryParam itemPrice(Integer itemPrice) {
            this.itemPrice = itemPrice;
            return this;
        }

        /**
        * The value of the discount. The `discount_type` field can be used to specify whether the value is an amount or a percentage
        * @return discount
        **/
        @JsonProperty("discount")
        public BigDecimal getDiscount() {
            return discount;
        }

        /**
         * Set discount
         **/
        public void setDiscount(BigDecimal discount) {
            this.discount = discount;
        }

        public ProductListItemQueryParam discount(BigDecimal discount) {
            this.discount = discount;
            return this;
        }

        /**
        * The type of the discount's value
        * @return discountType
        **/
        @JsonProperty("discount_type")
        public DiscountTypeEnum getDiscountType() {
            return discountType;
        }

        /**
         * Set discountType
         **/
        public void setDiscountType(DiscountTypeEnum discountType) {
            this.discountType = discountType;
        }

        public ProductListItemQueryParam discountType(DiscountTypeEnum discountType) {
            this.discountType = discountType;
            return this;
        }

        /**
        * The sum of all the products attached to the deal
        * @return sum
        **/
        @JsonProperty("sum")
        public BigDecimal getSum() {
            return sum;
        }

        /**
         * Set sum
         **/
        public void setSum(BigDecimal sum) {
            this.sum = sum;
        }

        public ProductListItemQueryParam sum(BigDecimal sum) {
            this.sum = sum;
            return this;
        }

        /**
        * The currency associated with the deal product
        * @return currency
        **/
        @JsonProperty("currency")
        public String getCurrency() {
            return currency;
        }

        /**
         * Set currency
         **/
        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public ProductListItemQueryParam currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
        * Whether the product is enabled or not
        * @return enabledFlag
        **/
        @JsonProperty("enabled_flag")
        public Boolean getEnabledFlag() {
            return enabledFlag;
        }

        /**
         * Set enabledFlag
         **/
        public void setEnabledFlag(Boolean enabledFlag) {
            this.enabledFlag = enabledFlag;
        }

        public ProductListItemQueryParam enabledFlag(Boolean enabledFlag) {
            this.enabledFlag = enabledFlag;
            return this;
        }

        /**
        * The date and time when the product was added to the deal
        * @return addTime
        **/
        @JsonProperty("add_time")
        public String getAddTime() {
            return addTime;
        }

        /**
         * Set addTime
         **/
        public void setAddTime(String addTime) {
            this.addTime = addTime;
        }

        public ProductListItemQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The date and time when the deal product was last edited
        * @return lastEdit
        **/
        @JsonProperty("last_edit")
        public String getLastEdit() {
            return lastEdit;
        }

        /**
         * Set lastEdit
         **/
        public void setLastEdit(String lastEdit) {
            this.lastEdit = lastEdit;
        }

        public ProductListItemQueryParam lastEdit(String lastEdit) {
            this.lastEdit = lastEdit;
            return this;
        }

        /**
        * The comments of the product
        * @return comments
        **/
        @JsonProperty("comments")
        public String getComments() {
            return comments;
        }

        /**
         * Set comments
         **/
        public void setComments(String comments) {
            this.comments = comments;
        }

        public ProductListItemQueryParam comments(String comments) {
            this.comments = comments;
            return this;
        }

        /**
        * Whether the product is active or not
        * @return activeFlag
        **/
        @JsonProperty("active_flag")
        public Boolean getActiveFlag() {
            return activeFlag;
        }

        /**
         * Set activeFlag
         **/
        public void setActiveFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
        }

        public ProductListItemQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * The product tax
        * @return tax
        **/
        @JsonProperty("tax")
        public BigDecimal getTax() {
            return tax;
        }

        /**
         * Set tax
         **/
        public void setTax(BigDecimal tax) {
            this.tax = tax;
        }

        public ProductListItemQueryParam tax(BigDecimal tax) {
            this.tax = tax;
            return this;
        }

        /**
        * The tax option to be applied to the products. When using `inclusive`, the tax percentage will already be included in the price. When using `exclusive`, the tax will not be included in the price. When using `none`, no tax will be added. Use the `tax` field for defining the tax percentage amount. By default, the user setting value for tax options will be used. Changing this in one product affects the rest of the products attached to the deal
        * @return taxMethod
        **/
        @JsonProperty("tax_method")
        public TaxMethodEnum getTaxMethod() {
            return taxMethod;
        }

        /**
         * Set taxMethod
         **/
        public void setTaxMethod(TaxMethodEnum taxMethod) {
            this.taxMethod = taxMethod;
        }

        public ProductListItemQueryParam taxMethod(TaxMethodEnum taxMethod) {
            this.taxMethod = taxMethod;
            return this;
        }

        /**
        * The product name
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

        public ProductListItemQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The formatted sum of the product
        * @return sumFormatted
        **/
        @JsonProperty("sum_formatted")
        public String getSumFormatted() {
            return sumFormatted;
        }

        /**
         * Set sumFormatted
         **/
        public void setSumFormatted(String sumFormatted) {
            this.sumFormatted = sumFormatted;
        }

        public ProductListItemQueryParam sumFormatted(String sumFormatted) {
            this.sumFormatted = sumFormatted;
            return this;
        }

        /**
        * The formatted quantity of the product
        * @return quantityFormatted
        **/
        @JsonProperty("quantity_formatted")
        public String getQuantityFormatted() {
            return quantityFormatted;
        }

        /**
         * Set quantityFormatted
         **/
        public void setQuantityFormatted(String quantityFormatted) {
            this.quantityFormatted = quantityFormatted;
        }

        public ProductListItemQueryParam quantityFormatted(String quantityFormatted) {
            this.quantityFormatted = quantityFormatted;
            return this;
        }

        /**
        * The quantity of the product
        * @return quantity
        **/
        @JsonProperty("quantity")
        public Integer getQuantity() {
            return quantity;
        }

        /**
         * Set quantity
         **/
        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public ProductListItemQueryParam quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
        * Get product
        * @return product
        **/
        @JsonProperty("product")
        public ProductListItemProduct getProduct() {
            return product;
        }

        /**
         * Set product
         **/
        public void setProduct(ProductListItemProduct product) {
            this.product = product;
        }

        public ProductListItemQueryParam product(ProductListItemProduct product) {
            this.product = product;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ProductListItemQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
            sb.append("    orderNr: ").append(toIndentedString(orderNr)).append("\n");
            sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
            sb.append("    productVariationId: ").append(toIndentedString(productVariationId)).append("\n");
            sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
            sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
            sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
            sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
            sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
            sb.append("    enabledFlag: ").append(toIndentedString(enabledFlag)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    lastEdit: ").append(toIndentedString(lastEdit)).append("\n");
            sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
            sb.append("    taxMethod: ").append(toIndentedString(taxMethod)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    sumFormatted: ").append(toIndentedString(sumFormatted)).append("\n");
            sb.append("    quantityFormatted: ").append(toIndentedString(quantityFormatted)).append("\n");
            sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
