package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateProductRequest  {

    /**
      * The name of the product
     **/
    private String name;
    /**
      * The product code
     **/
    private String code;
    /**
      * The product description
     **/
    private String description;
    /**
      * The unit in which this product is sold
     **/
    private String unit;
    /**
      * The tax percentage
     **/
    private BigDecimal tax = new BigDecimal("0");
    /**
      * Whether this product will be made active or not
     **/
    private Boolean activeFlag = true;
    /**
      * Whether this product can be selected in deals or not
     **/
    private Boolean selectable = true;

    public enum VisibleToEnum {
        _1(String.valueOf("1")), _3(String.valueOf("3")), _5(String.valueOf("5")), _7(String.valueOf("7"));

        // caching enum access
        private static final java.util.EnumSet<VisibleToEnum> values = java.util.EnumSet.allOf(VisibleToEnum.class);

        String value;

        VisibleToEnum (String v) {
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
        public static VisibleToEnum fromString(String v) {
            for (VisibleToEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private VisibleToEnum visibleTo;
    /**
      * The ID of the user who will be marked as the owner of this product. When omitted, the authorized user ID will be used
     **/
    private Integer ownerId;
    /**
      * An array of objects, each containing: `currency` (string), `price` (number), `cost` (number, optional), `overhead_cost` (number, optional), `notes` (string, optional). Note that there can only be one price per product per currency. When `prices` is omitted altogether, a default price of 0 and a default currency based on the company's currency will be assigned.
     **/
    private List<Object> prices;

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
      * Only available in Advanced and above plans  How often a customer is billed for access to a service or product 
     **/
    private BillingFrequencyEnum billingFrequency;
    /**
      * Only available in Advanced and above plans  The number of times the billing frequency repeats for a product in a deal  When `billing_frequency` is set to `one-time`, this field must be `null`  For all the other values of `billing_frequency`, `null` represents a product billed indefinitely  Must be a positive integer less or equal to 208 
     **/
    private Integer billingFrequencyCycles;

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

    public UpdateProductRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The product code
    * @return code
    **/
    @JsonProperty("code")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getCode() {
        return code;
    }

    /**
     * Set code
     **/
    public void setCode(String code) {
        this.code = code;
    }

    public UpdateProductRequest code(String code) {
        this.code = code;
        return this;
    }

    /**
    * The product description
    * @return description
    **/
    @JsonProperty("description")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Set description
     **/
    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateProductRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
    * The unit in which this product is sold
    * @return unit
    **/
    @JsonProperty("unit")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getUnit() {
        return unit;
    }

    /**
     * Set unit
     **/
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public UpdateProductRequest unit(String unit) {
        this.unit = unit;
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

    public UpdateProductRequest tax(BigDecimal tax) {
        this.tax = tax;
        return this;
    }

    /**
    * Whether this product will be made active or not
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

    public UpdateProductRequest activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * Whether this product can be selected in deals or not
    * @return selectable
    **/
    @JsonProperty("selectable")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getSelectable() {
        return selectable;
    }

    /**
     * Set selectable
     **/
    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }

    public UpdateProductRequest selectable(Boolean selectable) {
        this.selectable = selectable;
        return this;
    }

    /**
    * Get visibleTo
    * @return visibleTo
    **/
    @JsonProperty("visible_to")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public VisibleToEnum getVisibleTo() {
        return visibleTo;
    }

    /**
     * Set visibleTo
     **/
    public void setVisibleTo(VisibleToEnum visibleTo) {
        this.visibleTo = visibleTo;
    }

    public UpdateProductRequest visibleTo(VisibleToEnum visibleTo) {
        this.visibleTo = visibleTo;
        return this;
    }

    /**
    * The ID of the user who will be marked as the owner of this product. When omitted, the authorized user ID will be used
    * @return ownerId
    **/
    @JsonProperty("owner_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     * Set ownerId
     **/
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public UpdateProductRequest ownerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
    * An array of objects, each containing: `currency` (string), `price` (number), `cost` (number, optional), `overhead_cost` (number, optional), `notes` (string, optional). Note that there can only be one price per product per currency. When `prices` is omitted altogether, a default price of 0 and a default currency based on the company's currency will be assigned.
    * @return prices
    **/
    @JsonProperty("prices")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Object> getPrices() {
        return prices;
    }

    /**
     * Set prices
     **/
    public void setPrices(List<Object> prices) {
        this.prices = prices;
    }

    public UpdateProductRequest prices(List<Object> prices) {
        this.prices = prices;
        return this;
    }
    public UpdateProductRequest addPricesItem(Object pricesItem) {
        if (this.prices == null){
            prices = new ArrayList<>();
        }
        this.prices.add(pricesItem);
        return this;
    }

    /**
    * Only available in Advanced and above plans  How often a customer is billed for access to a service or product 
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

    public UpdateProductRequest billingFrequency(BillingFrequencyEnum billingFrequency) {
        this.billingFrequency = billingFrequency;
        return this;
    }

    /**
    * Only available in Advanced and above plans  The number of times the billing frequency repeats for a product in a deal  When `billing_frequency` is set to `one-time`, this field must be `null`  For all the other values of `billing_frequency`, `null` represents a product billed indefinitely  Must be a positive integer less or equal to 208 
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

    public UpdateProductRequest billingFrequencyCycles(Integer billingFrequencyCycles) {
        this.billingFrequencyCycles = billingFrequencyCycles;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateProductRequest {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    selectable: ").append(toIndentedString(selectable)).append("\n");
        sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
        sb.append("    billingFrequency: ").append(toIndentedString(billingFrequency)).append("\n");
        sb.append("    billingFrequencyCycles: ").append(toIndentedString(billingFrequencyCycles)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code UpdateProductRequest} object that
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

        UpdateProductRequest model = (UpdateProductRequest) obj;

        return java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(code, model.code) &&
        java.util.Objects.equals(description, model.description) &&
        java.util.Objects.equals(unit, model.unit) &&
        java.util.Objects.equals(tax, model.tax) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(selectable, model.selectable) &&
        java.util.Objects.equals(visibleTo, model.visibleTo) &&
        java.util.Objects.equals(ownerId, model.ownerId) &&
        java.util.Objects.equals(prices, model.prices) &&
        java.util.Objects.equals(billingFrequency, model.billingFrequency) &&
        java.util.Objects.equals(billingFrequencyCycles, model.billingFrequencyCycles);
    }

    /**
     * Returns a hash code for a {@code UpdateProductRequest}.
     *
     * @return a hash code value for a {@code UpdateProductRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,
        code,
        description,
        unit,
        tax,
        activeFlag,
        selectable,
        visibleTo,
        ownerId,
        prices,
        billingFrequency,
        billingFrequencyCycles);
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
    public static class UpdateProductRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("code")
        private String code;
        @jakarta.ws.rs.QueryParam("description")
        private String description;
        @jakarta.ws.rs.QueryParam("unit")
        private String unit;
        @jakarta.ws.rs.QueryParam("tax")
        private BigDecimal tax = new BigDecimal("0");
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag = true;
        @jakarta.ws.rs.QueryParam("selectable")
        private Boolean selectable = true;

    public enum VisibleToEnum {
        _1(String.valueOf("1")), _3(String.valueOf("3")), _5(String.valueOf("5")), _7(String.valueOf("7"));

        // caching enum access
        private static final java.util.EnumSet<VisibleToEnum> values = java.util.EnumSet.allOf(VisibleToEnum.class);

        String value;

        VisibleToEnum (String v) {
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
        public static VisibleToEnum fromString(String v) {
            for (VisibleToEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private VisibleToEnum visibleTo;
        @jakarta.ws.rs.QueryParam("ownerId")
        private Integer ownerId;
        @jakarta.ws.rs.QueryParam("prices")
        private List<Object> prices = null;

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

        public UpdateProductRequestQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The product code
        * @return code
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("code")
        public String getCode() {
            return code;
        }

        /**
         * Set code
         **/
        public void setCode(String code) {
            this.code = code;
        }

        public UpdateProductRequestQueryParam code(String code) {
            this.code = code;
            return this;
        }

        /**
        * The product description
        * @return description
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        public String getDescription() {
            return description;
        }

        /**
         * Set description
         **/
        public void setDescription(String description) {
            this.description = description;
        }

        public UpdateProductRequestQueryParam description(String description) {
            this.description = description;
            return this;
        }

        /**
        * The unit in which this product is sold
        * @return unit
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        public String getUnit() {
            return unit;
        }

        /**
         * Set unit
         **/
        public void setUnit(String unit) {
            this.unit = unit;
        }

        public UpdateProductRequestQueryParam unit(String unit) {
            this.unit = unit;
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

        public UpdateProductRequestQueryParam tax(BigDecimal tax) {
            this.tax = tax;
            return this;
        }

        /**
        * Whether this product will be made active or not
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

        public UpdateProductRequestQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * Whether this product can be selected in deals or not
        * @return selectable
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("selectable")
        public Boolean getSelectable() {
            return selectable;
        }

        /**
         * Set selectable
         **/
        public void setSelectable(Boolean selectable) {
            this.selectable = selectable;
        }

        public UpdateProductRequestQueryParam selectable(Boolean selectable) {
            this.selectable = selectable;
            return this;
        }

        /**
        * Get visibleTo
        * @return visibleTo
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("visible_to")
        public VisibleToEnum getVisibleTo() {
            return visibleTo;
        }

        /**
         * Set visibleTo
         **/
        public void setVisibleTo(VisibleToEnum visibleTo) {
            this.visibleTo = visibleTo;
        }

        public UpdateProductRequestQueryParam visibleTo(VisibleToEnum visibleTo) {
            this.visibleTo = visibleTo;
            return this;
        }

        /**
        * The ID of the user who will be marked as the owner of this product. When omitted, the authorized user ID will be used
        * @return ownerId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("owner_id")
        public Integer getOwnerId() {
            return ownerId;
        }

        /**
         * Set ownerId
         **/
        public void setOwnerId(Integer ownerId) {
            this.ownerId = ownerId;
        }

        public UpdateProductRequestQueryParam ownerId(Integer ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
        * An array of objects, each containing: `currency` (string), `price` (number), `cost` (number, optional), `overhead_cost` (number, optional), `notes` (string, optional). Note that there can only be one price per product per currency. When `prices` is omitted altogether, a default price of 0 and a default currency based on the company's currency will be assigned.
        * @return prices
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("prices")
        public List<Object> getPrices() {
            return prices;
        }

        /**
         * Set prices
         **/
        public void setPrices(List<Object> prices) {
            this.prices = prices;
        }

        public UpdateProductRequestQueryParam prices(List<Object> prices) {
            this.prices = prices;
            return this;
        }
        public UpdateProductRequestQueryParam addPricesItem(Object pricesItem) {
            this.prices.add(pricesItem);
            return this;
        }

        /**
        * Only available in Advanced and above plans  How often a customer is billed for access to a service or product 
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

        public UpdateProductRequestQueryParam billingFrequency(BillingFrequencyEnum billingFrequency) {
            this.billingFrequency = billingFrequency;
            return this;
        }

        /**
        * Only available in Advanced and above plans  The number of times the billing frequency repeats for a product in a deal  When `billing_frequency` is set to `one-time`, this field must be `null`  For all the other values of `billing_frequency`, `null` represents a product billed indefinitely  Must be a positive integer less or equal to 208 
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

        public UpdateProductRequestQueryParam billingFrequencyCycles(Integer billingFrequencyCycles) {
            this.billingFrequencyCycles = billingFrequencyCycles;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class UpdateProductRequestQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    code: ").append(toIndentedString(code)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
            sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    selectable: ").append(toIndentedString(selectable)).append("\n");
            sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
            sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
            sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
            sb.append("    billingFrequency: ").append(toIndentedString(billingFrequency)).append("\n");
            sb.append("    billingFrequencyCycles: ").append(toIndentedString(billingFrequencyCycles)).append("\n");
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
