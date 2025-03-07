package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PipelineRequest  {

    /**
      * The name of the pipeline
     **/
    private String name;

    public enum DealProbabilityEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<DealProbabilityEnum> values = java.util.EnumSet.allOf(DealProbabilityEnum.class);

        BigDecimal value;

        DealProbabilityEnum (BigDecimal v) {
            value = v;
        }

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DealProbabilityEnum fromString(String v) {
            for (DealProbabilityEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private DealProbabilityEnum dealProbability;
    /**
      * Defines the order of pipelines. First order (`order_nr=0`) is the default pipeline.
     **/
    private Integer orderNr;

    public enum ActiveEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<ActiveEnum> values = java.util.EnumSet.allOf(ActiveEnum.class);

        BigDecimal value;

        ActiveEnum (BigDecimal v) {
            value = v;
        }

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ActiveEnum fromString(String v) {
            for (ActiveEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private ActiveEnum active;

    /**
    * The name of the pipeline
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

    public PipelineRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get dealProbability
    * @return dealProbability
    **/
    @JsonProperty("deal_probability")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DealProbabilityEnum getDealProbability() {
        return dealProbability;
    }

    /**
     * Set dealProbability
     **/
    public void setDealProbability(DealProbabilityEnum dealProbability) {
        this.dealProbability = dealProbability;
    }

    public PipelineRequest dealProbability(DealProbabilityEnum dealProbability) {
        this.dealProbability = dealProbability;
        return this;
    }

    /**
    * Defines the order of pipelines. First order (`order_nr=0`) is the default pipeline.
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

    public PipelineRequest orderNr(Integer orderNr) {
        this.orderNr = orderNr;
        return this;
    }

    /**
    * Get active
    * @return active
    **/
    @JsonProperty("active")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ActiveEnum getActive() {
        return active;
    }

    /**
     * Set active
     **/
    public void setActive(ActiveEnum active) {
        this.active = active;
    }

    public PipelineRequest active(ActiveEnum active) {
        this.active = active;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineRequest {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dealProbability: ").append(toIndentedString(dealProbability)).append("\n");
        sb.append("    orderNr: ").append(toIndentedString(orderNr)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code PipelineRequest} object that
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

        PipelineRequest model = (PipelineRequest) obj;

        return java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(dealProbability, model.dealProbability) &&
        java.util.Objects.equals(orderNr, model.orderNr) &&
        java.util.Objects.equals(active, model.active);
    }

    /**
     * Returns a hash code for a {@code PipelineRequest}.
     *
     * @return a hash code value for a {@code PipelineRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,
        dealProbability,
        orderNr,
        active);
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
    public static class PipelineRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("name")
        private String name;

    public enum DealProbabilityEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<DealProbabilityEnum> values = java.util.EnumSet.allOf(DealProbabilityEnum.class);

        BigDecimal value;

        DealProbabilityEnum (BigDecimal v) {
            value = v;
        }

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DealProbabilityEnum fromString(String v) {
            for (DealProbabilityEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private DealProbabilityEnum dealProbability;
        @jakarta.ws.rs.QueryParam("orderNr")
        private Integer orderNr;

    public enum ActiveEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<ActiveEnum> values = java.util.EnumSet.allOf(ActiveEnum.class);

        BigDecimal value;

        ActiveEnum (BigDecimal v) {
            value = v;
        }

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ActiveEnum fromString(String v) {
            for (ActiveEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private ActiveEnum active;

        /**
        * The name of the pipeline
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

        public PipelineRequestQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get dealProbability
        * @return dealProbability
        **/
        @JsonProperty("deal_probability")
        public DealProbabilityEnum getDealProbability() {
            return dealProbability;
        }

        /**
         * Set dealProbability
         **/
        public void setDealProbability(DealProbabilityEnum dealProbability) {
            this.dealProbability = dealProbability;
        }

        public PipelineRequestQueryParam dealProbability(DealProbabilityEnum dealProbability) {
            this.dealProbability = dealProbability;
            return this;
        }

        /**
        * Defines the order of pipelines. First order (`order_nr=0`) is the default pipeline.
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

        public PipelineRequestQueryParam orderNr(Integer orderNr) {
            this.orderNr = orderNr;
            return this;
        }

        /**
        * Get active
        * @return active
        **/
        @JsonProperty("active")
        public ActiveEnum getActive() {
            return active;
        }

        /**
         * Set active
         **/
        public void setActive(ActiveEnum active) {
            this.active = active;
        }

        public PipelineRequestQueryParam active(ActiveEnum active) {
            this.active = active;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PipelineRequestQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    dealProbability: ").append(toIndentedString(dealProbability)).append("\n");
            sb.append("    orderNr: ").append(toIndentedString(orderNr)).append("\n");
            sb.append("    active: ").append(toIndentedString(active)).append("\n");
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
