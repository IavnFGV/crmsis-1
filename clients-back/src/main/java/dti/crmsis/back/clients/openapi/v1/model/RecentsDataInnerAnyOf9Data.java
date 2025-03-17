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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class RecentsDataInnerAnyOf9Data  {

    /**
      * The ID of the product
     **/
    private Integer id;
    /**
      * The name of the product
     **/
    private String name;
    /**
      * The product code
     **/
    private String code;
    /**
      * The description of the product
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
      * The category of the product
     **/
    private String category;
    /**
      * Whether this product will be made active or not
     **/
    private Boolean activeFlag;
    /**
      * Whether this product can be selected in deals or not
     **/
    private Boolean selectable;
    /**
      * The first letter of the product name
     **/
    private String firstChar;
    /**
      * The visibility of the product. If omitted, the visibility will be set to the default visibility setting of this item type for the authorized user.
     **/
    private Integer visibleTo;
    /**
      * The ID of the user who will be marked as the owner of this product. When omitted, authorized user ID will be used.
     **/
    private Integer ownerId;
    /**
      * The count of files
     **/
    private Integer filesCount;
    /**
      * The date and time when the product was added to the deal
     **/
    private String addTime;
    /**
      * The date and time when the product was updated to the deal
     **/
    private String updateTime;
    /**
      * Array of objects, each containing: `currency` (string), `price` (number), `cost` (number, optional), `overhead_cost` (number, optional). Note that there can only be one price per product per currency. When `prices` is omitted altogether, a default price of 0 and a default currency based on the company's currency will be assigned.
     **/
    private List<Object> prices;

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

    public RecentsDataInnerAnyOf9Data id(Integer id) {
        this.id = id;
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

    public RecentsDataInnerAnyOf9Data name(String name) {
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

    public RecentsDataInnerAnyOf9Data code(String code) {
        this.code = code;
        return this;
    }

    /**
    * The description of the product
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

    public RecentsDataInnerAnyOf9Data description(String description) {
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

    public RecentsDataInnerAnyOf9Data unit(String unit) {
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

    public RecentsDataInnerAnyOf9Data tax(BigDecimal tax) {
        this.tax = tax;
        return this;
    }

    /**
    * The category of the product
    * @return category
    **/
    @JsonProperty("category")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getCategory() {
        return category;
    }

    /**
     * Set category
     **/
    public void setCategory(String category) {
        this.category = category;
    }

    public RecentsDataInnerAnyOf9Data category(String category) {
        this.category = category;
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

    public RecentsDataInnerAnyOf9Data activeFlag(Boolean activeFlag) {
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

    public RecentsDataInnerAnyOf9Data selectable(Boolean selectable) {
        this.selectable = selectable;
        return this;
    }

    /**
    * The first letter of the product name
    * @return firstChar
    **/
    @JsonProperty("first_char")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getFirstChar() {
        return firstChar;
    }

    /**
     * Set firstChar
     **/
    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar;
    }

    public RecentsDataInnerAnyOf9Data firstChar(String firstChar) {
        this.firstChar = firstChar;
        return this;
    }

    /**
    * The visibility of the product. If omitted, the visibility will be set to the default visibility setting of this item type for the authorized user.
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

    public RecentsDataInnerAnyOf9Data visibleTo(Integer visibleTo) {
        this.visibleTo = visibleTo;
        return this;
    }

    /**
    * The ID of the user who will be marked as the owner of this product. When omitted, authorized user ID will be used.
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

    public RecentsDataInnerAnyOf9Data ownerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
    * The count of files
    * @return filesCount
    **/
    @JsonProperty("files_count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getFilesCount() {
        return filesCount;
    }

    /**
     * Set filesCount
     **/
    public void setFilesCount(Integer filesCount) {
        this.filesCount = filesCount;
    }

    public RecentsDataInnerAnyOf9Data filesCount(Integer filesCount) {
        this.filesCount = filesCount;
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

    public RecentsDataInnerAnyOf9Data addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The date and time when the product was updated to the deal
    * @return updateTime
    **/
    @JsonProperty("update_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Set updateTime
     **/
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public RecentsDataInnerAnyOf9Data updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
    * Array of objects, each containing: `currency` (string), `price` (number), `cost` (number, optional), `overhead_cost` (number, optional). Note that there can only be one price per product per currency. When `prices` is omitted altogether, a default price of 0 and a default currency based on the company's currency will be assigned.
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

    public RecentsDataInnerAnyOf9Data prices(List<Object> prices) {
        this.prices = prices;
        return this;
    }
    public RecentsDataInnerAnyOf9Data addPricesItem(Object pricesItem) {
        if (this.prices == null){
            prices = new ArrayList<>();
        }
        this.prices.add(pricesItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecentsDataInnerAnyOf9Data {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    selectable: ").append(toIndentedString(selectable)).append("\n");
        sb.append("    firstChar: ").append(toIndentedString(firstChar)).append("\n");
        sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    filesCount: ").append(toIndentedString(filesCount)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code RecentsDataInnerAnyOf9Data} object that
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

        RecentsDataInnerAnyOf9Data model = (RecentsDataInnerAnyOf9Data) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(code, model.code) &&
        java.util.Objects.equals(description, model.description) &&
        java.util.Objects.equals(unit, model.unit) &&
        java.util.Objects.equals(tax, model.tax) &&
        java.util.Objects.equals(category, model.category) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(selectable, model.selectable) &&
        java.util.Objects.equals(firstChar, model.firstChar) &&
        java.util.Objects.equals(visibleTo, model.visibleTo) &&
        java.util.Objects.equals(ownerId, model.ownerId) &&
        java.util.Objects.equals(filesCount, model.filesCount) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime) &&
        java.util.Objects.equals(prices, model.prices);
    }

    /**
     * Returns a hash code for a {@code RecentsDataInnerAnyOf9Data}.
     *
     * @return a hash code value for a {@code RecentsDataInnerAnyOf9Data}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        name,
        code,
        description,
        unit,
        tax,
        category,
        activeFlag,
        selectable,
        firstChar,
        visibleTo,
        ownerId,
        filesCount,
        addTime,
        updateTime,
        prices);
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
    public static class RecentsDataInnerAnyOf9DataQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
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
        @jakarta.ws.rs.QueryParam("category")
        private String category;
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        @jakarta.ws.rs.QueryParam("selectable")
        private Boolean selectable;
        @jakarta.ws.rs.QueryParam("firstChar")
        private String firstChar;
        @jakarta.ws.rs.QueryParam("visibleTo")
        private Integer visibleTo;
        @jakarta.ws.rs.QueryParam("ownerId")
        private Integer ownerId;
        @jakarta.ws.rs.QueryParam("filesCount")
        private Integer filesCount;
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        @jakarta.ws.rs.QueryParam("updateTime")
        private String updateTime;
        @jakarta.ws.rs.QueryParam("prices")
        private List<Object> prices = null;

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

        public RecentsDataInnerAnyOf9DataQueryParam id(Integer id) {
            this.id = id;
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

        public RecentsDataInnerAnyOf9DataQueryParam name(String name) {
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

        public RecentsDataInnerAnyOf9DataQueryParam code(String code) {
            this.code = code;
            return this;
        }

        /**
        * The description of the product
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

        public RecentsDataInnerAnyOf9DataQueryParam description(String description) {
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

        public RecentsDataInnerAnyOf9DataQueryParam unit(String unit) {
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

        public RecentsDataInnerAnyOf9DataQueryParam tax(BigDecimal tax) {
            this.tax = tax;
            return this;
        }

        /**
        * The category of the product
        * @return category
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        public String getCategory() {
            return category;
        }

        /**
         * Set category
         **/
        public void setCategory(String category) {
            this.category = category;
        }

        public RecentsDataInnerAnyOf9DataQueryParam category(String category) {
            this.category = category;
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

        public RecentsDataInnerAnyOf9DataQueryParam activeFlag(Boolean activeFlag) {
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

        public RecentsDataInnerAnyOf9DataQueryParam selectable(Boolean selectable) {
            this.selectable = selectable;
            return this;
        }

        /**
        * The first letter of the product name
        * @return firstChar
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("first_char")
        public String getFirstChar() {
            return firstChar;
        }

        /**
         * Set firstChar
         **/
        public void setFirstChar(String firstChar) {
            this.firstChar = firstChar;
        }

        public RecentsDataInnerAnyOf9DataQueryParam firstChar(String firstChar) {
            this.firstChar = firstChar;
            return this;
        }

        /**
        * The visibility of the product. If omitted, the visibility will be set to the default visibility setting of this item type for the authorized user.
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

        public RecentsDataInnerAnyOf9DataQueryParam visibleTo(Integer visibleTo) {
            this.visibleTo = visibleTo;
            return this;
        }

        /**
        * The ID of the user who will be marked as the owner of this product. When omitted, authorized user ID will be used.
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

        public RecentsDataInnerAnyOf9DataQueryParam ownerId(Integer ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
        * The count of files
        * @return filesCount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("files_count")
        public Integer getFilesCount() {
            return filesCount;
        }

        /**
         * Set filesCount
         **/
        public void setFilesCount(Integer filesCount) {
            this.filesCount = filesCount;
        }

        public RecentsDataInnerAnyOf9DataQueryParam filesCount(Integer filesCount) {
            this.filesCount = filesCount;
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

        public RecentsDataInnerAnyOf9DataQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The date and time when the product was updated to the deal
        * @return updateTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("update_time")
        public String getUpdateTime() {
            return updateTime;
        }

        /**
         * Set updateTime
         **/
        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public RecentsDataInnerAnyOf9DataQueryParam updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
        * Array of objects, each containing: `currency` (string), `price` (number), `cost` (number, optional), `overhead_cost` (number, optional). Note that there can only be one price per product per currency. When `prices` is omitted altogether, a default price of 0 and a default currency based on the company's currency will be assigned.
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

        public RecentsDataInnerAnyOf9DataQueryParam prices(List<Object> prices) {
            this.prices = prices;
            return this;
        }
        public RecentsDataInnerAnyOf9DataQueryParam addPricesItem(Object pricesItem) {
            this.prices.add(pricesItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class RecentsDataInnerAnyOf9DataQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    code: ").append(toIndentedString(code)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
            sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
            sb.append("    category: ").append(toIndentedString(category)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    selectable: ").append(toIndentedString(selectable)).append("\n");
            sb.append("    firstChar: ").append(toIndentedString(firstChar)).append("\n");
            sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
            sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
            sb.append("    filesCount: ").append(toIndentedString(filesCount)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
            sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
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
