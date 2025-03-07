package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetCurrenciesResponseDataInner  {

    /**
      * The ID of the currency
     **/
    private Integer id;
    /**
      * The code of the currency
     **/
    private String code;
    /**
      * The name of the currency
     **/
    private String name;
    /**
      * The amount of decimal points of the currency
     **/
    private Integer decimalPoints;
    /**
      * The symbol of the currency
     **/
    private String symbol;
    /**
      * Whether the currency is active or not
     **/
    private Boolean activeFlag;
    /**
      * Whether the currency is a custom one or not
     **/
    private Boolean isCustomFlag;

    /**
    * The ID of the currency
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

    public GetCurrenciesResponseDataInner id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The code of the currency
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

    public GetCurrenciesResponseDataInner code(String code) {
        this.code = code;
        return this;
    }

    /**
    * The name of the currency
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

    public GetCurrenciesResponseDataInner name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The amount of decimal points of the currency
    * @return decimalPoints
    **/
    @JsonProperty("decimal_points")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getDecimalPoints() {
        return decimalPoints;
    }

    /**
     * Set decimalPoints
     **/
    public void setDecimalPoints(Integer decimalPoints) {
        this.decimalPoints = decimalPoints;
    }

    public GetCurrenciesResponseDataInner decimalPoints(Integer decimalPoints) {
        this.decimalPoints = decimalPoints;
        return this;
    }

    /**
    * The symbol of the currency
    * @return symbol
    **/
    @JsonProperty("symbol")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getSymbol() {
        return symbol;
    }

    /**
     * Set symbol
     **/
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public GetCurrenciesResponseDataInner symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
    * Whether the currency is active or not
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

    public GetCurrenciesResponseDataInner activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * Whether the currency is a custom one or not
    * @return isCustomFlag
    **/
    @JsonProperty("is_custom_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getIsCustomFlag() {
        return isCustomFlag;
    }

    /**
     * Set isCustomFlag
     **/
    public void setIsCustomFlag(Boolean isCustomFlag) {
        this.isCustomFlag = isCustomFlag;
    }

    public GetCurrenciesResponseDataInner isCustomFlag(Boolean isCustomFlag) {
        this.isCustomFlag = isCustomFlag;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetCurrenciesResponseDataInner {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    decimalPoints: ").append(toIndentedString(decimalPoints)).append("\n");
        sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    isCustomFlag: ").append(toIndentedString(isCustomFlag)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetCurrenciesResponseDataInner} object that
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

        GetCurrenciesResponseDataInner model = (GetCurrenciesResponseDataInner) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(code, model.code) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(decimalPoints, model.decimalPoints) &&
        java.util.Objects.equals(symbol, model.symbol) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(isCustomFlag, model.isCustomFlag);
    }

    /**
     * Returns a hash code for a {@code GetCurrenciesResponseDataInner}.
     *
     * @return a hash code value for a {@code GetCurrenciesResponseDataInner}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        code,
        name,
        decimalPoints,
        symbol,
        activeFlag,
        isCustomFlag);
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
    public static class GetCurrenciesResponseDataInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("code")
        private String code;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("decimalPoints")
        private Integer decimalPoints;
        @jakarta.ws.rs.QueryParam("symbol")
        private String symbol;
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        @jakarta.ws.rs.QueryParam("isCustomFlag")
        private Boolean isCustomFlag;

        /**
        * The ID of the currency
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

        public GetCurrenciesResponseDataInnerQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The code of the currency
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

        public GetCurrenciesResponseDataInnerQueryParam code(String code) {
            this.code = code;
            return this;
        }

        /**
        * The name of the currency
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

        public GetCurrenciesResponseDataInnerQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The amount of decimal points of the currency
        * @return decimalPoints
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("decimal_points")
        public Integer getDecimalPoints() {
            return decimalPoints;
        }

        /**
         * Set decimalPoints
         **/
        public void setDecimalPoints(Integer decimalPoints) {
            this.decimalPoints = decimalPoints;
        }

        public GetCurrenciesResponseDataInnerQueryParam decimalPoints(Integer decimalPoints) {
            this.decimalPoints = decimalPoints;
            return this;
        }

        /**
        * The symbol of the currency
        * @return symbol
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("symbol")
        public String getSymbol() {
            return symbol;
        }

        /**
         * Set symbol
         **/
        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public GetCurrenciesResponseDataInnerQueryParam symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        /**
        * Whether the currency is active or not
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

        public GetCurrenciesResponseDataInnerQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * Whether the currency is a custom one or not
        * @return isCustomFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("is_custom_flag")
        public Boolean getIsCustomFlag() {
            return isCustomFlag;
        }

        /**
         * Set isCustomFlag
         **/
        public void setIsCustomFlag(Boolean isCustomFlag) {
            this.isCustomFlag = isCustomFlag;
        }

        public GetCurrenciesResponseDataInnerQueryParam isCustomFlag(Boolean isCustomFlag) {
            this.isCustomFlag = isCustomFlag;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetCurrenciesResponseDataInnerQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    code: ").append(toIndentedString(code)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    decimalPoints: ").append(toIndentedString(decimalPoints)).append("\n");
            sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    isCustomFlag: ").append(toIndentedString(isCustomFlag)).append("\n");
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
