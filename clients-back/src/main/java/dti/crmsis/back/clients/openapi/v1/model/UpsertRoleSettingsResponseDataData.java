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
  * The response data
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class UpsertRoleSettingsResponseDataData  {

    /**
      * The ID of the role
     **/
    private Integer id;

    public enum DealDefaultVisibilityEnum {
        NUMBER_1(new BigDecimal("1")), NUMBER_3(new BigDecimal("3")), NUMBER_5(new BigDecimal("5")), NUMBER_7(new BigDecimal("7"));

        // caching enum access
        private static final java.util.EnumSet<DealDefaultVisibilityEnum> values = java.util.EnumSet.allOf(DealDefaultVisibilityEnum.class);

        BigDecimal value;

        DealDefaultVisibilityEnum (BigDecimal v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DealDefaultVisibilityEnum fromString(String v) {
            for (DealDefaultVisibilityEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    /**
      * The setting
     **/
    private DealDefaultVisibilityEnum dealDefaultVisibility;

    /**
    * The ID of the role
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

    public UpsertRoleSettingsResponseDataData id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The setting
    * @return dealDefaultVisibility
    **/
    @JsonProperty("deal_default_visibility")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public DealDefaultVisibilityEnum getDealDefaultVisibility() {
        return dealDefaultVisibility;
    }

    /**
     * Set dealDefaultVisibility
     **/
    public void setDealDefaultVisibility(DealDefaultVisibilityEnum dealDefaultVisibility) {
        this.dealDefaultVisibility = dealDefaultVisibility;
    }

    public UpsertRoleSettingsResponseDataData dealDefaultVisibility(DealDefaultVisibilityEnum dealDefaultVisibility) {
        this.dealDefaultVisibility = dealDefaultVisibility;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpsertRoleSettingsResponseDataData {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    dealDefaultVisibility: ").append(toIndentedString(dealDefaultVisibility)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code UpsertRoleSettingsResponseDataData} object that
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

        UpsertRoleSettingsResponseDataData model = (UpsertRoleSettingsResponseDataData) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(dealDefaultVisibility, model.dealDefaultVisibility);
    }

    /**
     * Returns a hash code for a {@code UpsertRoleSettingsResponseDataData}.
     *
     * @return a hash code value for a {@code UpsertRoleSettingsResponseDataData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        dealDefaultVisibility);
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
      * The response data
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class UpsertRoleSettingsResponseDataDataQueryParam  {

        /**
          * The response data
         **/
        @jakarta.ws.rs.QueryParam("id")
        private Integer id;

    public enum DealDefaultVisibilityEnum {
        NUMBER_1(new BigDecimal("1")), NUMBER_3(new BigDecimal("3")), NUMBER_5(new BigDecimal("5")), NUMBER_7(new BigDecimal("7"));

        // caching enum access
        private static final java.util.EnumSet<DealDefaultVisibilityEnum> values = java.util.EnumSet.allOf(DealDefaultVisibilityEnum.class);

        BigDecimal value;

        DealDefaultVisibilityEnum (BigDecimal v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DealDefaultVisibilityEnum fromString(String v) {
            for (DealDefaultVisibilityEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        /**
          * The response data
         **/
        private DealDefaultVisibilityEnum dealDefaultVisibility;

        /**
        * The ID of the role
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

        public UpsertRoleSettingsResponseDataDataQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The setting
        * @return dealDefaultVisibility
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("deal_default_visibility")
        public DealDefaultVisibilityEnum getDealDefaultVisibility() {
            return dealDefaultVisibility;
        }

        /**
         * Set dealDefaultVisibility
         **/
        public void setDealDefaultVisibility(DealDefaultVisibilityEnum dealDefaultVisibility) {
            this.dealDefaultVisibility = dealDefaultVisibility;
        }

        public UpsertRoleSettingsResponseDataDataQueryParam dealDefaultVisibility(DealDefaultVisibilityEnum dealDefaultVisibility) {
            this.dealDefaultVisibility = dealDefaultVisibility;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class UpsertRoleSettingsResponseDataDataQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    dealDefaultVisibility: ").append(toIndentedString(dealDefaultVisibility)).append("\n");
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
