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
public class GetPersonProductsResponseAllOfDataInnerDEALIDProduct  {

    /**
      * The ID of the product
     **/
    private Integer id;
    /**
      * The ID of the company
     **/
    private Integer companyId;
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
    private Boolean activeFlag = true;
    /**
      * Whether this product can be selected in deals or not
     **/
    private Boolean selectable = true;
    /**
      * The first letter of the product name
     **/
    private String firstChar;

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
      * The ID of the deal
     **/
    private Integer dealId;

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

    public GetPersonProductsResponseAllOfDataInnerDEALIDProduct id(Integer id) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDProduct companyId(Integer companyId) {
        this.companyId = companyId;
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDProduct name(String name) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDProduct code(String code) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDProduct description(String description) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDProduct unit(String unit) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDProduct tax(BigDecimal tax) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDProduct category(String category) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDProduct activeFlag(Boolean activeFlag) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDProduct selectable(Boolean selectable) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDProduct firstChar(String firstChar) {
        this.firstChar = firstChar;
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDProduct visibleTo(VisibleToEnum visibleTo) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDProduct ownerId(Integer ownerId) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDProduct filesCount(Integer filesCount) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDProduct addTime(String addTime) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDProduct updateTime(String updateTime) {
        this.updateTime = updateTime;
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDProduct dealId(Integer dealId) {
        this.dealId = dealId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPersonProductsResponseAllOfDataInnerDEALIDProduct {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
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
        sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetPersonProductsResponseAllOfDataInnerDEALIDProduct} object that
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

        GetPersonProductsResponseAllOfDataInnerDEALIDProduct model = (GetPersonProductsResponseAllOfDataInnerDEALIDProduct) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(companyId, model.companyId) &&
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
        java.util.Objects.equals(dealId, model.dealId);
    }

    /**
     * Returns a hash code for a {@code GetPersonProductsResponseAllOfDataInnerDEALIDProduct}.
     *
     * @return a hash code value for a {@code GetPersonProductsResponseAllOfDataInnerDEALIDProduct}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        companyId,
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
        dealId);
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
    public static class GetPersonProductsResponseAllOfDataInnerDEALIDProductQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("companyId")
        private Integer companyId;
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
        private Boolean activeFlag = true;
        @jakarta.ws.rs.QueryParam("selectable")
        private Boolean selectable = true;
        @jakarta.ws.rs.QueryParam("firstChar")
        private String firstChar;

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
        @jakarta.ws.rs.QueryParam("filesCount")
        private Integer filesCount;
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        @jakarta.ws.rs.QueryParam("updateTime")
        private String updateTime;
        @jakarta.ws.rs.QueryParam("dealId")
        private Integer dealId;

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

        public GetPersonProductsResponseAllOfDataInnerDEALIDProductQueryParam id(Integer id) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDProductQueryParam companyId(Integer companyId) {
            this.companyId = companyId;
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDProductQueryParam name(String name) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDProductQueryParam code(String code) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDProductQueryParam description(String description) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDProductQueryParam unit(String unit) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDProductQueryParam tax(BigDecimal tax) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDProductQueryParam category(String category) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDProductQueryParam activeFlag(Boolean activeFlag) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDProductQueryParam selectable(Boolean selectable) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDProductQueryParam firstChar(String firstChar) {
            this.firstChar = firstChar;
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDProductQueryParam visibleTo(VisibleToEnum visibleTo) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDProductQueryParam ownerId(Integer ownerId) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDProductQueryParam filesCount(Integer filesCount) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDProductQueryParam addTime(String addTime) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDProductQueryParam updateTime(String updateTime) {
            this.updateTime = updateTime;
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDProductQueryParam dealId(Integer dealId) {
            this.dealId = dealId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetPersonProductsResponseAllOfDataInnerDEALIDProductQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
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
            sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
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
