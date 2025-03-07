package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The updated product object attached to the deal
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetProductAttachmentDetailsResponseData  {

    /**
      * The ID of the product
     **/
    private Integer productId;
    /**
      * The price at which this product will be added to the deal
     **/
    private BigDecimal itemPrice;
    /**
      * Quantity – e.g. how many items of this product will be added to the deal
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
      * The tax option to be applied to the products. When using `inclusive`, the tax percentage will already be included in the price. When using `exclusive`, the tax will not be included in the price. When using `none`, no tax will be added. Use the `tax` field for defining the tax percentage amount. By default, the user setting value for tax options will be used. Changing this in one product affects the rest of the products attached to the deal
     **/
    private TaxMethodEnum taxMethod;
    /**
      * Whether the product is enabled for a deal or not. This makes it possible to add products to a deal with a specific price and discount criteria, but keep them disabled, which refrains them from being included in the deal value calculation. When omitted, the product will be marked as enabled by default
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
    private BillingFrequencyEnum billingFrequency = BillingFrequencyEnum.ONE_MINUS_TIME;
    /**
      * Only available in Advanced and above plans  The number of times the billing frequency repeats for a product in a deal  When `billing_frequency` is set to `one-time`, this field must be `null`  When `billing_frequency` is set to `weekly`, this field cannot be `null`  For all the other values of `billing_frequency`, `null` represents a product billed indefinitely  Must be a positive integer less or equal to 208 
     **/
    private Integer billingFrequencyCycles;
    /**
      * Only available in Advanced and above plans  The billing start date. Must be between 10 years in the past and 10 years in the future 
     **/
    private String billingStartDate;
    /**
      * The ID of the deal-product (the ID of the product attached to the deal)
     **/
    private Integer id;
    /**
      * The ID of the company
     **/
    private Integer companyId;
    /**
      * The ID of the deal
     **/
    private Integer dealId;
    /**
      * The sum of all the products attached to the deal
     **/
    private BigDecimal sum;
    /**
      * The currency associated with the deal product
     **/
    private String currency;
    /**
      * The date and time when the product was added to the deal
     **/
    private String addTime;
    /**
      * The date and time when the deal product was last edited
     **/
    private String lastEdit;
    /**
      * Whether the product is active or not
     **/
    private Boolean activeFlag;
    /**
      * The product name
     **/
    private String name;

    /**
    * The ID of the product
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

    public GetProductAttachmentDetailsResponseData productId(Integer productId) {
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

    public GetProductAttachmentDetailsResponseData itemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
        return this;
    }

    /**
    * Quantity – e.g. how many items of this product will be added to the deal
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

    public GetProductAttachmentDetailsResponseData quantity(Integer quantity) {
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

    public GetProductAttachmentDetailsResponseData discount(BigDecimal discount) {
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

    public GetProductAttachmentDetailsResponseData discountType(DiscountTypeEnum discountType) {
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

    public GetProductAttachmentDetailsResponseData productVariationId(Integer productVariationId) {
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

    public GetProductAttachmentDetailsResponseData comments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
    * The product tax
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

    public GetProductAttachmentDetailsResponseData tax(BigDecimal tax) {
        this.tax = tax;
        return this;
    }

    /**
    * The tax option to be applied to the products. When using `inclusive`, the tax percentage will already be included in the price. When using `exclusive`, the tax will not be included in the price. When using `none`, no tax will be added. Use the `tax` field for defining the tax percentage amount. By default, the user setting value for tax options will be used. Changing this in one product affects the rest of the products attached to the deal
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

    public GetProductAttachmentDetailsResponseData taxMethod(TaxMethodEnum taxMethod) {
        this.taxMethod = taxMethod;
        return this;
    }

    /**
    * Whether the product is enabled for a deal or not. This makes it possible to add products to a deal with a specific price and discount criteria, but keep them disabled, which refrains them from being included in the deal value calculation. When omitted, the product will be marked as enabled by default
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

    public GetProductAttachmentDetailsResponseData enabledFlag(Boolean enabledFlag) {
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

    public GetProductAttachmentDetailsResponseData billingFrequency(BillingFrequencyEnum billingFrequency) {
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

    public GetProductAttachmentDetailsResponseData billingFrequencyCycles(Integer billingFrequencyCycles) {
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

    public GetProductAttachmentDetailsResponseData billingStartDate(String billingStartDate) {
        this.billingStartDate = billingStartDate;
        return this;
    }

    /**
    * The ID of the deal-product (the ID of the product attached to the deal)
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

    public GetProductAttachmentDetailsResponseData id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The ID of the company
    * @return companyId
    **/
    @JsonProperty("company_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * Set companyId
     **/
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public GetProductAttachmentDetailsResponseData companyId(Integer companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
    * The ID of the deal
    * @return dealId
    **/
    @JsonProperty("deal_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getDealId() {
        return dealId;
    }

    /**
     * Set dealId
     **/
    public void setDealId(Integer dealId) {
        this.dealId = dealId;
    }

    public GetProductAttachmentDetailsResponseData dealId(Integer dealId) {
        this.dealId = dealId;
        return this;
    }

    /**
    * The sum of all the products attached to the deal
    * @return sum
    **/
    @JsonProperty("sum")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getSum() {
        return sum;
    }

    /**
     * Set sum
     **/
    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public GetProductAttachmentDetailsResponseData sum(BigDecimal sum) {
        this.sum = sum;
        return this;
    }

    /**
    * The currency associated with the deal product
    * @return currency
    **/
    @JsonProperty("currency")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Set currency
     **/
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public GetProductAttachmentDetailsResponseData currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
    * The date and time when the product was added to the deal
    * @return addTime
    **/
    @JsonProperty("add_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getAddTime() {
        return addTime;
    }

    /**
     * Set addTime
     **/
    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public GetProductAttachmentDetailsResponseData addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The date and time when the deal product was last edited
    * @return lastEdit
    **/
    @JsonProperty("last_edit")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLastEdit() {
        return lastEdit;
    }

    /**
     * Set lastEdit
     **/
    public void setLastEdit(String lastEdit) {
        this.lastEdit = lastEdit;
    }

    public GetProductAttachmentDetailsResponseData lastEdit(String lastEdit) {
        this.lastEdit = lastEdit;
        return this;
    }

    /**
    * Whether the product is active or not
    * @return activeFlag
    **/
    @JsonProperty("active_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getActiveFlag() {
        return activeFlag;
    }

    /**
     * Set activeFlag
     **/
    public void setActiveFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
    }

    public GetProductAttachmentDetailsResponseData activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * The product name
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

    public GetProductAttachmentDetailsResponseData name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetProductAttachmentDetailsResponseData {\n");

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
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
        sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
        sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    lastEdit: ").append(toIndentedString(lastEdit)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetProductAttachmentDetailsResponseData} object that
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

        GetProductAttachmentDetailsResponseData model = (GetProductAttachmentDetailsResponseData) obj;

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
        java.util.Objects.equals(billingStartDate, model.billingStartDate) &&
        java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(companyId, model.companyId) &&
        java.util.Objects.equals(dealId, model.dealId) &&
        java.util.Objects.equals(sum, model.sum) &&
        java.util.Objects.equals(currency, model.currency) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(lastEdit, model.lastEdit) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(name, model.name);
    }

    /**
     * Returns a hash code for a {@code GetProductAttachmentDetailsResponseData}.
     *
     * @return a hash code value for a {@code GetProductAttachmentDetailsResponseData}.
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
        billingStartDate,
        id,
        companyId,
        dealId,
        sum,
        currency,
        addTime,
        lastEdit,
        activeFlag,
        name);
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

    /**
      * The updated product object attached to the deal
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetProductAttachmentDetailsResponseDataQueryParam  {

        /**
          * The updated product object attached to the deal
         **/
        @jakarta.ws.rs.QueryParam("productId")
        private Integer productId;
        /**
          * The updated product object attached to the deal
         **/
        @jakarta.ws.rs.QueryParam("itemPrice")
        private BigDecimal itemPrice;
        /**
          * The updated product object attached to the deal
         **/
        @jakarta.ws.rs.QueryParam("quantity")
        private Integer quantity;
        /**
          * The updated product object attached to the deal
         **/
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
        /**
          * The updated product object attached to the deal
         **/
        private DiscountTypeEnum discountType = DiscountTypeEnum.PERCENTAGE;
        /**
          * The updated product object attached to the deal
         **/
        @jakarta.ws.rs.QueryParam("productVariationId")
        private Integer productVariationId;
        /**
          * The updated product object attached to the deal
         **/
        @jakarta.ws.rs.QueryParam("comments")
        private String comments;
        /**
          * The updated product object attached to the deal
         **/
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
          * The updated product object attached to the deal
         **/
        private TaxMethodEnum taxMethod;
        /**
          * The updated product object attached to the deal
         **/
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
        /**
          * The updated product object attached to the deal
         **/
        private BillingFrequencyEnum billingFrequency = BillingFrequencyEnum.ONE_MINUS_TIME;
        /**
          * The updated product object attached to the deal
         **/
        @jakarta.ws.rs.QueryParam("billingFrequencyCycles")
        private Integer billingFrequencyCycles;
        /**
          * The updated product object attached to the deal
         **/
        @jakarta.ws.rs.QueryParam("billingStartDate")
        private String billingStartDate;
        /**
          * The updated product object attached to the deal
         **/
        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        /**
          * The updated product object attached to the deal
         **/
        @jakarta.ws.rs.QueryParam("companyId")
        private Integer companyId;
        /**
          * The updated product object attached to the deal
         **/
        @jakarta.ws.rs.QueryParam("dealId")
        private Integer dealId;
        /**
          * The updated product object attached to the deal
         **/
        @jakarta.ws.rs.QueryParam("sum")
        private BigDecimal sum;
        /**
          * The updated product object attached to the deal
         **/
        @jakarta.ws.rs.QueryParam("currency")
        private String currency;
        /**
          * The updated product object attached to the deal
         **/
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        /**
          * The updated product object attached to the deal
         **/
        @jakarta.ws.rs.QueryParam("lastEdit")
        private String lastEdit;
        /**
          * The updated product object attached to the deal
         **/
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        /**
          * The updated product object attached to the deal
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;

        /**
        * The ID of the product
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

        public GetProductAttachmentDetailsResponseDataQueryParam productId(Integer productId) {
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

        public GetProductAttachmentDetailsResponseDataQueryParam itemPrice(BigDecimal itemPrice) {
            this.itemPrice = itemPrice;
            return this;
        }

        /**
        * Quantity – e.g. how many items of this product will be added to the deal
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

        public GetProductAttachmentDetailsResponseDataQueryParam quantity(Integer quantity) {
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

        public GetProductAttachmentDetailsResponseDataQueryParam discount(BigDecimal discount) {
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

        public GetProductAttachmentDetailsResponseDataQueryParam discountType(DiscountTypeEnum discountType) {
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

        public GetProductAttachmentDetailsResponseDataQueryParam productVariationId(Integer productVariationId) {
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

        public GetProductAttachmentDetailsResponseDataQueryParam comments(String comments) {
            this.comments = comments;
            return this;
        }

        /**
        * The product tax
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

        public GetProductAttachmentDetailsResponseDataQueryParam tax(BigDecimal tax) {
            this.tax = tax;
            return this;
        }

        /**
        * The tax option to be applied to the products. When using `inclusive`, the tax percentage will already be included in the price. When using `exclusive`, the tax will not be included in the price. When using `none`, no tax will be added. Use the `tax` field for defining the tax percentage amount. By default, the user setting value for tax options will be used. Changing this in one product affects the rest of the products attached to the deal
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

        public GetProductAttachmentDetailsResponseDataQueryParam taxMethod(TaxMethodEnum taxMethod) {
            this.taxMethod = taxMethod;
            return this;
        }

        /**
        * Whether the product is enabled for a deal or not. This makes it possible to add products to a deal with a specific price and discount criteria, but keep them disabled, which refrains them from being included in the deal value calculation. When omitted, the product will be marked as enabled by default
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

        public GetProductAttachmentDetailsResponseDataQueryParam enabledFlag(Boolean enabledFlag) {
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

        public GetProductAttachmentDetailsResponseDataQueryParam billingFrequency(BillingFrequencyEnum billingFrequency) {
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

        public GetProductAttachmentDetailsResponseDataQueryParam billingFrequencyCycles(Integer billingFrequencyCycles) {
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

        public GetProductAttachmentDetailsResponseDataQueryParam billingStartDate(String billingStartDate) {
            this.billingStartDate = billingStartDate;
            return this;
        }

        /**
        * The ID of the deal-product (the ID of the product attached to the deal)
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

        public GetProductAttachmentDetailsResponseDataQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The ID of the company
        * @return companyId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("company_id")
        public Integer getCompanyId() {
            return companyId;
        }

        /**
         * Set companyId
         **/
        public void setCompanyId(Integer companyId) {
            this.companyId = companyId;
        }

        public GetProductAttachmentDetailsResponseDataQueryParam companyId(Integer companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
        * The ID of the deal
        * @return dealId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("deal_id")
        public Integer getDealId() {
            return dealId;
        }

        /**
         * Set dealId
         **/
        public void setDealId(Integer dealId) {
            this.dealId = dealId;
        }

        public GetProductAttachmentDetailsResponseDataQueryParam dealId(Integer dealId) {
            this.dealId = dealId;
            return this;
        }

        /**
        * The sum of all the products attached to the deal
        * @return sum
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("sum")
        public BigDecimal getSum() {
            return sum;
        }

        /**
         * Set sum
         **/
        public void setSum(BigDecimal sum) {
            this.sum = sum;
        }

        public GetProductAttachmentDetailsResponseDataQueryParam sum(BigDecimal sum) {
            this.sum = sum;
            return this;
        }

        /**
        * The currency associated with the deal product
        * @return currency
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("currency")
        public String getCurrency() {
            return currency;
        }

        /**
         * Set currency
         **/
        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public GetProductAttachmentDetailsResponseDataQueryParam currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
        * The date and time when the product was added to the deal
        * @return addTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("add_time")
        public String getAddTime() {
            return addTime;
        }

        /**
         * Set addTime
         **/
        public void setAddTime(String addTime) {
            this.addTime = addTime;
        }

        public GetProductAttachmentDetailsResponseDataQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The date and time when the deal product was last edited
        * @return lastEdit
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("last_edit")
        public String getLastEdit() {
            return lastEdit;
        }

        /**
         * Set lastEdit
         **/
        public void setLastEdit(String lastEdit) {
            this.lastEdit = lastEdit;
        }

        public GetProductAttachmentDetailsResponseDataQueryParam lastEdit(String lastEdit) {
            this.lastEdit = lastEdit;
            return this;
        }

        /**
        * Whether the product is active or not
        * @return activeFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("active_flag")
        public Boolean getActiveFlag() {
            return activeFlag;
        }

        /**
         * Set activeFlag
         **/
        public void setActiveFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
        }

        public GetProductAttachmentDetailsResponseDataQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * The product name
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

        public GetProductAttachmentDetailsResponseDataQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetProductAttachmentDetailsResponseDataQueryParam {\n");

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
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
            sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
            sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
            sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    lastEdit: ").append(toIndentedString(lastEdit)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
