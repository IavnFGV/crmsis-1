package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateDealProductRequest  {

    /**
      * The ID of the product to use
     **/
    private Integer productId;
    /**
      * The price at which this product will be added to the deal
     **/
    private BigDecimal itemPrice;
    /**
      * How many items of this product will be added to the deal
     **/
    private Integer quantity;
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

        @com.fasterxml.jackson.annotation.JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
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
      * The ID of the product variation to use. When omitted, no variation will be used
     **/
    private Integer productVariationId;
    /**
      * A textual comment associated with this product-deal attachment
     **/
    private String comments;
    /**
      * The tax percentage
     **/
    private BigDecimal tax = new BigDecimal("0");

    public enum TaxMethodEnum {
        EXCLUSIVE(String.valueOf("exclusive")), INCLUSIVE(String.valueOf("inclusive")), NONE(String.valueOf("none"));

        // caching enum access
        private static final java.util.EnumSet<TaxMethodEnum> values = java.util.EnumSet.allOf(TaxMethodEnum.class);

        String value;

        TaxMethodEnum (String v) {
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
      * The tax option to be applied to the products. When using `inclusive`, the tax percentage will already be included in the price. When using `exclusive`, the tax will not be included in the price. When using `none`, no tax will be added. Use the `tax` field for defining the tax percentage amount
     **/
    private TaxMethodEnum taxMethod;
    /**
      * Whether the product is enabled for a deal or not  This makes it possible to add products to a deal with a specific price and discount criteria, but keep them disabled, which refrains them from being included in the deal value calculation. When omitted, the product will be marked as enabled by default  Not possible to disable the product if the deal has installments associated and the product is the last one enabled  Not possible to enable the product if the deal has installments associated and the product is recurring 
     **/
    private Boolean enabledFlag = true;

    public enum BillingFrequencyEnum {
        ONE_MINUS_TIME(String.valueOf("one-time")), ANNUALLY(String.valueOf("annually")), SEMI_MINUS_ANNUALLY(String.valueOf("semi-annually")), QUARTERLY(String.valueOf("quarterly")), MONTHLY(String.valueOf("monthly")), WEEKLY(String.valueOf("weekly"));

        // caching enum access
        private static final java.util.EnumSet<BillingFrequencyEnum> values = java.util.EnumSet.allOf(BillingFrequencyEnum.class);

        String value;

        BillingFrequencyEnum (String v) {
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
        public static BillingFrequencyEnum fromString(String v) {
            for (BillingFrequencyEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    /**
      * Only available in Advanced and above plans  How often a customer is billed for access to a service or product  To set `billing_frequency` different than `one-time`, the deal must not have installments associated  A deal can have up to 20 products attached with `billing_frequency` different than `one-time` 
     **/
    private BillingFrequencyEnum billingFrequency;
    /**
      * Only available in Advanced and above plans  The number of times the billing frequency repeats for a product in a deal  When `billing_frequency` is set to `one-time`, this field must be `null`  When `billing_frequency` is set to `weekly`, this field cannot be `null`  For all the other values of `billing_frequency`, `null` represents a product billed indefinitely  Must be a positive integer less or equal to 208 
     **/
    private Integer billingFrequencyCycles;
    /**
      * Only available in Advanced and above plans  The billing start date. Must be between 10 years in the past and 10 years in the future 
     **/
    private String billingStartDate;

    /**
    * The ID of the product to use
    * @return productId
    **/
    @JsonProperty("product_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getProductId() {
        return productId;
    }

    /**
     * Set productId
     **/
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public UpdateDealProductRequest productId(Integer productId) {
        this.productId = productId;
        return this;
    }

    /**
    * The price at which this product will be added to the deal
    * @return itemPrice
    **/
    @JsonProperty("item_price")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    /**
     * Set itemPrice
     **/
    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public UpdateDealProductRequest itemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
        return this;
    }

    /**
    * How many items of this product will be added to the deal
    * @return quantity
    **/
    @JsonProperty("quantity")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Set quantity
     **/
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public UpdateDealProductRequest quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
    * The value of the discount. The `discount_type` field can be used to specify whether the value is an amount or a percentage
    * @return discount
    **/
    @JsonProperty("discount")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Set discount
     **/
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public UpdateDealProductRequest discount(BigDecimal discount) {
        this.discount = discount;
        return this;
    }

    /**
    * The type of the discount's value
    * @return discountType
    **/
    @JsonProperty("discount_type")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public DiscountTypeEnum getDiscountType() {
        return discountType;
    }

    /**
     * Set discountType
     **/
    public void setDiscountType(DiscountTypeEnum discountType) {
        this.discountType = discountType;
    }

    public UpdateDealProductRequest discountType(DiscountTypeEnum discountType) {
        this.discountType = discountType;
        return this;
    }

    /**
    * The ID of the product variation to use. When omitted, no variation will be used
    * @return productVariationId
    **/
    @JsonProperty("product_variation_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getProductVariationId() {
        return productVariationId;
    }

    /**
     * Set productVariationId
     **/
    public void setProductVariationId(Integer productVariationId) {
        this.productVariationId = productVariationId;
    }

    public UpdateDealProductRequest productVariationId(Integer productVariationId) {
        this.productVariationId = productVariationId;
        return this;
    }

    /**
    * A textual comment associated with this product-deal attachment
    * @return comments
    **/
    @JsonProperty("comments")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getComments() {
        return comments;
    }

    /**
     * Set comments
     **/
    public void setComments(String comments) {
        this.comments = comments;
    }

    public UpdateDealProductRequest comments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
    * The tax percentage
    * @return tax
    **/
    @JsonProperty("tax")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * Set tax
     **/
    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public UpdateDealProductRequest tax(BigDecimal tax) {
        this.tax = tax;
        return this;
    }

    /**
    * The tax option to be applied to the products. When using `inclusive`, the tax percentage will already be included in the price. When using `exclusive`, the tax will not be included in the price. When using `none`, no tax will be added. Use the `tax` field for defining the tax percentage amount
    * @return taxMethod
    **/
    @JsonProperty("tax_method")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public TaxMethodEnum getTaxMethod() {
        return taxMethod;
    }

    /**
     * Set taxMethod
     **/
    public void setTaxMethod(TaxMethodEnum taxMethod) {
        this.taxMethod = taxMethod;
    }

    public UpdateDealProductRequest taxMethod(TaxMethodEnum taxMethod) {
        this.taxMethod = taxMethod;
        return this;
    }

    /**
    * Whether the product is enabled for a deal or not  This makes it possible to add products to a deal with a specific price and discount criteria, but keep them disabled, which refrains them from being included in the deal value calculation. When omitted, the product will be marked as enabled by default  Not possible to disable the product if the deal has installments associated and the product is the last one enabled  Not possible to enable the product if the deal has installments associated and the product is recurring 
    * @return enabledFlag
    **/
    @JsonProperty("enabled_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getEnabledFlag() {
        return enabledFlag;
    }

    /**
     * Set enabledFlag
     **/
    public void setEnabledFlag(Boolean enabledFlag) {
        this.enabledFlag = enabledFlag;
    }

    public UpdateDealProductRequest enabledFlag(Boolean enabledFlag) {
        this.enabledFlag = enabledFlag;
        return this;
    }

    /**
    * Only available in Advanced and above plans  How often a customer is billed for access to a service or product  To set `billing_frequency` different than `one-time`, the deal must not have installments associated  A deal can have up to 20 products attached with `billing_frequency` different than `one-time` 
    * @return billingFrequency
    **/
    @JsonProperty("billing_frequency")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BillingFrequencyEnum getBillingFrequency() {
        return billingFrequency;
    }

    /**
     * Set billingFrequency
     **/
    public void setBillingFrequency(BillingFrequencyEnum billingFrequency) {
        this.billingFrequency = billingFrequency;
    }

    public UpdateDealProductRequest billingFrequency(BillingFrequencyEnum billingFrequency) {
        this.billingFrequency = billingFrequency;
        return this;
    }

    /**
    * Only available in Advanced and above plans  The number of times the billing frequency repeats for a product in a deal  When `billing_frequency` is set to `one-time`, this field must be `null`  When `billing_frequency` is set to `weekly`, this field cannot be `null`  For all the other values of `billing_frequency`, `null` represents a product billed indefinitely  Must be a positive integer less or equal to 208 
    * @return billingFrequencyCycles
    **/
    @JsonProperty("billing_frequency_cycles")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getBillingFrequencyCycles() {
        return billingFrequencyCycles;
    }

    /**
     * Set billingFrequencyCycles
     **/
    public void setBillingFrequencyCycles(Integer billingFrequencyCycles) {
        this.billingFrequencyCycles = billingFrequencyCycles;
    }

    public UpdateDealProductRequest billingFrequencyCycles(Integer billingFrequencyCycles) {
        this.billingFrequencyCycles = billingFrequencyCycles;
        return this;
    }

    /**
    * Only available in Advanced and above plans  The billing start date. Must be between 10 years in the past and 10 years in the future 
    * @return billingStartDate
    **/
    @JsonProperty("billing_start_date")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getBillingStartDate() {
        return billingStartDate;
    }

    /**
     * Set billingStartDate
     **/
    public void setBillingStartDate(String billingStartDate) {
        this.billingStartDate = billingStartDate;
    }

    public UpdateDealProductRequest billingStartDate(String billingStartDate) {
        this.billingStartDate = billingStartDate;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDealProductRequest {\n");

        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
        sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
        sb.append("    productVariationId: ").append(toIndentedString(productVariationId)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
        sb.append("    taxMethod: ").append(toIndentedString(taxMethod)).append("\n");
        sb.append("    enabledFlag: ").append(toIndentedString(enabledFlag)).append("\n");
        sb.append("    billingFrequency: ").append(toIndentedString(billingFrequency)).append("\n");
        sb.append("    billingFrequencyCycles: ").append(toIndentedString(billingFrequencyCycles)).append("\n");
        sb.append("    billingStartDate: ").append(toIndentedString(billingStartDate)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code UpdateDealProductRequest} object that
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

        UpdateDealProductRequest model = (UpdateDealProductRequest) obj;

        return java.util.Objects.equals(productId, model.productId) &&
        java.util.Objects.equals(itemPrice, model.itemPrice) &&
        java.util.Objects.equals(quantity, model.quantity) &&
        java.util.Objects.equals(discount, model.discount) &&
        java.util.Objects.equals(discountType, model.discountType) &&
        java.util.Objects.equals(productVariationId, model.productVariationId) &&
        java.util.Objects.equals(comments, model.comments) &&
        java.util.Objects.equals(tax, model.tax) &&
        java.util.Objects.equals(taxMethod, model.taxMethod) &&
        java.util.Objects.equals(enabledFlag, model.enabledFlag) &&
        java.util.Objects.equals(billingFrequency, model.billingFrequency) &&
        java.util.Objects.equals(billingFrequencyCycles, model.billingFrequencyCycles) &&
        java.util.Objects.equals(billingStartDate, model.billingStartDate);
    }

    /**
     * Returns a hash code for a {@code UpdateDealProductRequest}.
     *
     * @return a hash code value for a {@code UpdateDealProductRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(productId,
        itemPrice,
        quantity,
        discount,
        discountType,
        productVariationId,
        comments,
        tax,
        taxMethod,
        enabledFlag,
        billingFrequency,
        billingFrequencyCycles,
        billingStartDate);
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
    public static class UpdateDealProductRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("productId")
        private Integer productId;
        @jakarta.ws.rs.QueryParam("itemPrice")
        private BigDecimal itemPrice;
        @jakarta.ws.rs.QueryParam("quantity")
        private Integer quantity;
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

        @com.fasterxml.jackson.annotation.JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
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
        @jakarta.ws.rs.QueryParam("productVariationId")
        private Integer productVariationId;
        @jakarta.ws.rs.QueryParam("comments")
        private String comments;
        @jakarta.ws.rs.QueryParam("tax")
        private BigDecimal tax = new BigDecimal("0");

    public enum TaxMethodEnum {
        EXCLUSIVE(String.valueOf("exclusive")), INCLUSIVE(String.valueOf("inclusive")), NONE(String.valueOf("none"));

        // caching enum access
        private static final java.util.EnumSet<TaxMethodEnum> values = java.util.EnumSet.allOf(TaxMethodEnum.class);

        String value;

        TaxMethodEnum (String v) {
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
        @jakarta.ws.rs.QueryParam("enabledFlag")
        private Boolean enabledFlag = true;

    public enum BillingFrequencyEnum {
        ONE_MINUS_TIME(String.valueOf("one-time")), ANNUALLY(String.valueOf("annually")), SEMI_MINUS_ANNUALLY(String.valueOf("semi-annually")), QUARTERLY(String.valueOf("quarterly")), MONTHLY(String.valueOf("monthly")), WEEKLY(String.valueOf("weekly"));

        // caching enum access
        private static final java.util.EnumSet<BillingFrequencyEnum> values = java.util.EnumSet.allOf(BillingFrequencyEnum.class);

        String value;

        BillingFrequencyEnum (String v) {
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
        public static BillingFrequencyEnum fromString(String v) {
            for (BillingFrequencyEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private BillingFrequencyEnum billingFrequency;
        @jakarta.ws.rs.QueryParam("billingFrequencyCycles")
        private Integer billingFrequencyCycles;
        @jakarta.ws.rs.QueryParam("billingStartDate")
        private String billingStartDate;

        /**
        * The ID of the product to use
        * @return productId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("product_id")
        public Integer getProductId() {
            return productId;
        }

        /**
         * Set productId
         **/
        public void setProductId(Integer productId) {
            this.productId = productId;
        }

        public UpdateDealProductRequestQueryParam productId(Integer productId) {
            this.productId = productId;
            return this;
        }

        /**
        * The price at which this product will be added to the deal
        * @return itemPrice
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("item_price")
        public BigDecimal getItemPrice() {
            return itemPrice;
        }

        /**
         * Set itemPrice
         **/
        public void setItemPrice(BigDecimal itemPrice) {
            this.itemPrice = itemPrice;
        }

        public UpdateDealProductRequestQueryParam itemPrice(BigDecimal itemPrice) {
            this.itemPrice = itemPrice;
            return this;
        }

        /**
        * How many items of this product will be added to the deal
        * @return quantity
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("quantity")
        public Integer getQuantity() {
            return quantity;
        }

        /**
         * Set quantity
         **/
        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public UpdateDealProductRequestQueryParam quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
        * The value of the discount. The `discount_type` field can be used to specify whether the value is an amount or a percentage
        * @return discount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("discount")
        public BigDecimal getDiscount() {
            return discount;
        }

        /**
         * Set discount
         **/
        public void setDiscount(BigDecimal discount) {
            this.discount = discount;
        }

        public UpdateDealProductRequestQueryParam discount(BigDecimal discount) {
            this.discount = discount;
            return this;
        }

        /**
        * The type of the discount's value
        * @return discountType
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("discount_type")
        public DiscountTypeEnum getDiscountType() {
            return discountType;
        }

        /**
         * Set discountType
         **/
        public void setDiscountType(DiscountTypeEnum discountType) {
            this.discountType = discountType;
        }

        public UpdateDealProductRequestQueryParam discountType(DiscountTypeEnum discountType) {
            this.discountType = discountType;
            return this;
        }

        /**
        * The ID of the product variation to use. When omitted, no variation will be used
        * @return productVariationId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("product_variation_id")
        public Integer getProductVariationId() {
            return productVariationId;
        }

        /**
         * Set productVariationId
         **/
        public void setProductVariationId(Integer productVariationId) {
            this.productVariationId = productVariationId;
        }

        public UpdateDealProductRequestQueryParam productVariationId(Integer productVariationId) {
            this.productVariationId = productVariationId;
            return this;
        }

        /**
        * A textual comment associated with this product-deal attachment
        * @return comments
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("comments")
        public String getComments() {
            return comments;
        }

        /**
         * Set comments
         **/
        public void setComments(String comments) {
            this.comments = comments;
        }

        public UpdateDealProductRequestQueryParam comments(String comments) {
            this.comments = comments;
            return this;
        }

        /**
        * The tax percentage
        * @return tax
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("tax")
        public BigDecimal getTax() {
            return tax;
        }

        /**
         * Set tax
         **/
        public void setTax(BigDecimal tax) {
            this.tax = tax;
        }

        public UpdateDealProductRequestQueryParam tax(BigDecimal tax) {
            this.tax = tax;
            return this;
        }

        /**
        * The tax option to be applied to the products. When using `inclusive`, the tax percentage will already be included in the price. When using `exclusive`, the tax will not be included in the price. When using `none`, no tax will be added. Use the `tax` field for defining the tax percentage amount
        * @return taxMethod
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("tax_method")
        public TaxMethodEnum getTaxMethod() {
            return taxMethod;
        }

        /**
         * Set taxMethod
         **/
        public void setTaxMethod(TaxMethodEnum taxMethod) {
            this.taxMethod = taxMethod;
        }

        public UpdateDealProductRequestQueryParam taxMethod(TaxMethodEnum taxMethod) {
            this.taxMethod = taxMethod;
            return this;
        }

        /**
        * Whether the product is enabled for a deal or not  This makes it possible to add products to a deal with a specific price and discount criteria, but keep them disabled, which refrains them from being included in the deal value calculation. When omitted, the product will be marked as enabled by default  Not possible to disable the product if the deal has installments associated and the product is the last one enabled  Not possible to enable the product if the deal has installments associated and the product is recurring 
        * @return enabledFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("enabled_flag")
        public Boolean getEnabledFlag() {
            return enabledFlag;
        }

        /**
         * Set enabledFlag
         **/
        public void setEnabledFlag(Boolean enabledFlag) {
            this.enabledFlag = enabledFlag;
        }

        public UpdateDealProductRequestQueryParam enabledFlag(Boolean enabledFlag) {
            this.enabledFlag = enabledFlag;
            return this;
        }

        /**
        * Only available in Advanced and above plans  How often a customer is billed for access to a service or product  To set `billing_frequency` different than `one-time`, the deal must not have installments associated  A deal can have up to 20 products attached with `billing_frequency` different than `one-time` 
        * @return billingFrequency
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("billing_frequency")
        public BillingFrequencyEnum getBillingFrequency() {
            return billingFrequency;
        }

        /**
         * Set billingFrequency
         **/
        public void setBillingFrequency(BillingFrequencyEnum billingFrequency) {
            this.billingFrequency = billingFrequency;
        }

        public UpdateDealProductRequestQueryParam billingFrequency(BillingFrequencyEnum billingFrequency) {
            this.billingFrequency = billingFrequency;
            return this;
        }

        /**
        * Only available in Advanced and above plans  The number of times the billing frequency repeats for a product in a deal  When `billing_frequency` is set to `one-time`, this field must be `null`  When `billing_frequency` is set to `weekly`, this field cannot be `null`  For all the other values of `billing_frequency`, `null` represents a product billed indefinitely  Must be a positive integer less or equal to 208 
        * @return billingFrequencyCycles
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("billing_frequency_cycles")
        public Integer getBillingFrequencyCycles() {
            return billingFrequencyCycles;
        }

        /**
         * Set billingFrequencyCycles
         **/
        public void setBillingFrequencyCycles(Integer billingFrequencyCycles) {
            this.billingFrequencyCycles = billingFrequencyCycles;
        }

        public UpdateDealProductRequestQueryParam billingFrequencyCycles(Integer billingFrequencyCycles) {
            this.billingFrequencyCycles = billingFrequencyCycles;
            return this;
        }

        /**
        * Only available in Advanced and above plans  The billing start date. Must be between 10 years in the past and 10 years in the future 
        * @return billingStartDate
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("billing_start_date")
        public String getBillingStartDate() {
            return billingStartDate;
        }

        /**
         * Set billingStartDate
         **/
        public void setBillingStartDate(String billingStartDate) {
            this.billingStartDate = billingStartDate;
        }

        public UpdateDealProductRequestQueryParam billingStartDate(String billingStartDate) {
            this.billingStartDate = billingStartDate;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class UpdateDealProductRequestQueryParam {\n");

            sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
            sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
            sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
            sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
            sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
            sb.append("    productVariationId: ").append(toIndentedString(productVariationId)).append("\n");
            sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
            sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
            sb.append("    taxMethod: ").append(toIndentedString(taxMethod)).append("\n");
            sb.append("    enabledFlag: ").append(toIndentedString(enabledFlag)).append("\n");
            sb.append("    billingFrequency: ").append(toIndentedString(billingFrequency)).append("\n");
            sb.append("    billingFrequencyCycles: ").append(toIndentedString(billingFrequencyCycles)).append("\n");
            sb.append("    billingStartDate: ").append(toIndentedString(billingStartDate)).append("\n");
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
