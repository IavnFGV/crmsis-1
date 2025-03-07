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
  * The settings for the role
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class RoleSettings  {

    /**
      * The default visibility level of the deals for the role
     **/
    private BigDecimal dealDefaultVisibility;
    /**
      * The default visibility level of the leads for the role
     **/
    private BigDecimal leadDefaultVisibility;
    /**
      * The default visibility level of the organizations for the role
     **/
    private BigDecimal orgDefaultVisibility;
    /**
      * The default visibility level of the people for the role
     **/
    private BigDecimal personDefaultVisibility;
    /**
      * The default visibility level of the products for the role
     **/
    private BigDecimal productDefaultVisibility;
    /**
      * The access level of the deals for the role (only for default role)
     **/
    private BigDecimal dealAccessLevel;
    /**
      * The access level of the organizations for the role (only for default role)
     **/
    private BigDecimal orgAccessLevel;
    /**
      * The access level of the people for the role (only for default role)
     **/
    private BigDecimal personAccessLevel;
    /**
      * The access level of the products for the role (only for default role)
     **/
    private BigDecimal productAccessLevel;

    /**
    * The default visibility level of the deals for the role
    * @return dealDefaultVisibility
    **/
    @JsonProperty("deal_default_visibility")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getDealDefaultVisibility() {
        return dealDefaultVisibility;
    }

    /**
     * Set dealDefaultVisibility
     **/
    public void setDealDefaultVisibility(BigDecimal dealDefaultVisibility) {
        this.dealDefaultVisibility = dealDefaultVisibility;
    }

    public RoleSettings dealDefaultVisibility(BigDecimal dealDefaultVisibility) {
        this.dealDefaultVisibility = dealDefaultVisibility;
        return this;
    }

    /**
    * The default visibility level of the leads for the role
    * @return leadDefaultVisibility
    **/
    @JsonProperty("lead_default_visibility")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getLeadDefaultVisibility() {
        return leadDefaultVisibility;
    }

    /**
     * Set leadDefaultVisibility
     **/
    public void setLeadDefaultVisibility(BigDecimal leadDefaultVisibility) {
        this.leadDefaultVisibility = leadDefaultVisibility;
    }

    public RoleSettings leadDefaultVisibility(BigDecimal leadDefaultVisibility) {
        this.leadDefaultVisibility = leadDefaultVisibility;
        return this;
    }

    /**
    * The default visibility level of the organizations for the role
    * @return orgDefaultVisibility
    **/
    @JsonProperty("org_default_visibility")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getOrgDefaultVisibility() {
        return orgDefaultVisibility;
    }

    /**
     * Set orgDefaultVisibility
     **/
    public void setOrgDefaultVisibility(BigDecimal orgDefaultVisibility) {
        this.orgDefaultVisibility = orgDefaultVisibility;
    }

    public RoleSettings orgDefaultVisibility(BigDecimal orgDefaultVisibility) {
        this.orgDefaultVisibility = orgDefaultVisibility;
        return this;
    }

    /**
    * The default visibility level of the people for the role
    * @return personDefaultVisibility
    **/
    @JsonProperty("person_default_visibility")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getPersonDefaultVisibility() {
        return personDefaultVisibility;
    }

    /**
     * Set personDefaultVisibility
     **/
    public void setPersonDefaultVisibility(BigDecimal personDefaultVisibility) {
        this.personDefaultVisibility = personDefaultVisibility;
    }

    public RoleSettings personDefaultVisibility(BigDecimal personDefaultVisibility) {
        this.personDefaultVisibility = personDefaultVisibility;
        return this;
    }

    /**
    * The default visibility level of the products for the role
    * @return productDefaultVisibility
    **/
    @JsonProperty("product_default_visibility")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getProductDefaultVisibility() {
        return productDefaultVisibility;
    }

    /**
     * Set productDefaultVisibility
     **/
    public void setProductDefaultVisibility(BigDecimal productDefaultVisibility) {
        this.productDefaultVisibility = productDefaultVisibility;
    }

    public RoleSettings productDefaultVisibility(BigDecimal productDefaultVisibility) {
        this.productDefaultVisibility = productDefaultVisibility;
        return this;
    }

    /**
    * The access level of the deals for the role (only for default role)
    * @return dealAccessLevel
    **/
    @JsonProperty("deal_access_level")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getDealAccessLevel() {
        return dealAccessLevel;
    }

    /**
     * Set dealAccessLevel
     **/
    public void setDealAccessLevel(BigDecimal dealAccessLevel) {
        this.dealAccessLevel = dealAccessLevel;
    }

    public RoleSettings dealAccessLevel(BigDecimal dealAccessLevel) {
        this.dealAccessLevel = dealAccessLevel;
        return this;
    }

    /**
    * The access level of the organizations for the role (only for default role)
    * @return orgAccessLevel
    **/
    @JsonProperty("org_access_level")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getOrgAccessLevel() {
        return orgAccessLevel;
    }

    /**
     * Set orgAccessLevel
     **/
    public void setOrgAccessLevel(BigDecimal orgAccessLevel) {
        this.orgAccessLevel = orgAccessLevel;
    }

    public RoleSettings orgAccessLevel(BigDecimal orgAccessLevel) {
        this.orgAccessLevel = orgAccessLevel;
        return this;
    }

    /**
    * The access level of the people for the role (only for default role)
    * @return personAccessLevel
    **/
    @JsonProperty("person_access_level")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getPersonAccessLevel() {
        return personAccessLevel;
    }

    /**
     * Set personAccessLevel
     **/
    public void setPersonAccessLevel(BigDecimal personAccessLevel) {
        this.personAccessLevel = personAccessLevel;
    }

    public RoleSettings personAccessLevel(BigDecimal personAccessLevel) {
        this.personAccessLevel = personAccessLevel;
        return this;
    }

    /**
    * The access level of the products for the role (only for default role)
    * @return productAccessLevel
    **/
    @JsonProperty("product_access_level")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getProductAccessLevel() {
        return productAccessLevel;
    }

    /**
     * Set productAccessLevel
     **/
    public void setProductAccessLevel(BigDecimal productAccessLevel) {
        this.productAccessLevel = productAccessLevel;
    }

    public RoleSettings productAccessLevel(BigDecimal productAccessLevel) {
        this.productAccessLevel = productAccessLevel;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoleSettings {\n");

        sb.append("    dealDefaultVisibility: ").append(toIndentedString(dealDefaultVisibility)).append("\n");
        sb.append("    leadDefaultVisibility: ").append(toIndentedString(leadDefaultVisibility)).append("\n");
        sb.append("    orgDefaultVisibility: ").append(toIndentedString(orgDefaultVisibility)).append("\n");
        sb.append("    personDefaultVisibility: ").append(toIndentedString(personDefaultVisibility)).append("\n");
        sb.append("    productDefaultVisibility: ").append(toIndentedString(productDefaultVisibility)).append("\n");
        sb.append("    dealAccessLevel: ").append(toIndentedString(dealAccessLevel)).append("\n");
        sb.append("    orgAccessLevel: ").append(toIndentedString(orgAccessLevel)).append("\n");
        sb.append("    personAccessLevel: ").append(toIndentedString(personAccessLevel)).append("\n");
        sb.append("    productAccessLevel: ").append(toIndentedString(productAccessLevel)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code RoleSettings} object that
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

        RoleSettings model = (RoleSettings) obj;

        return java.util.Objects.equals(dealDefaultVisibility, model.dealDefaultVisibility) &&
        java.util.Objects.equals(leadDefaultVisibility, model.leadDefaultVisibility) &&
        java.util.Objects.equals(orgDefaultVisibility, model.orgDefaultVisibility) &&
        java.util.Objects.equals(personDefaultVisibility, model.personDefaultVisibility) &&
        java.util.Objects.equals(productDefaultVisibility, model.productDefaultVisibility) &&
        java.util.Objects.equals(dealAccessLevel, model.dealAccessLevel) &&
        java.util.Objects.equals(orgAccessLevel, model.orgAccessLevel) &&
        java.util.Objects.equals(personAccessLevel, model.personAccessLevel) &&
        java.util.Objects.equals(productAccessLevel, model.productAccessLevel);
    }

    /**
     * Returns a hash code for a {@code RoleSettings}.
     *
     * @return a hash code value for a {@code RoleSettings}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(dealDefaultVisibility,
        leadDefaultVisibility,
        orgDefaultVisibility,
        personDefaultVisibility,
        productDefaultVisibility,
        dealAccessLevel,
        orgAccessLevel,
        personAccessLevel,
        productAccessLevel);
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
      * The settings for the role
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RoleSettingsQueryParam  {

        /**
          * The settings for the role
         **/
        @jakarta.ws.rs.QueryParam("dealDefaultVisibility")
        private BigDecimal dealDefaultVisibility;
        /**
          * The settings for the role
         **/
        @jakarta.ws.rs.QueryParam("leadDefaultVisibility")
        private BigDecimal leadDefaultVisibility;
        /**
          * The settings for the role
         **/
        @jakarta.ws.rs.QueryParam("orgDefaultVisibility")
        private BigDecimal orgDefaultVisibility;
        /**
          * The settings for the role
         **/
        @jakarta.ws.rs.QueryParam("personDefaultVisibility")
        private BigDecimal personDefaultVisibility;
        /**
          * The settings for the role
         **/
        @jakarta.ws.rs.QueryParam("productDefaultVisibility")
        private BigDecimal productDefaultVisibility;
        /**
          * The settings for the role
         **/
        @jakarta.ws.rs.QueryParam("dealAccessLevel")
        private BigDecimal dealAccessLevel;
        /**
          * The settings for the role
         **/
        @jakarta.ws.rs.QueryParam("orgAccessLevel")
        private BigDecimal orgAccessLevel;
        /**
          * The settings for the role
         **/
        @jakarta.ws.rs.QueryParam("personAccessLevel")
        private BigDecimal personAccessLevel;
        /**
          * The settings for the role
         **/
        @jakarta.ws.rs.QueryParam("productAccessLevel")
        private BigDecimal productAccessLevel;

        /**
        * The default visibility level of the deals for the role
        * @return dealDefaultVisibility
        **/
        @JsonProperty("deal_default_visibility")
        public BigDecimal getDealDefaultVisibility() {
            return dealDefaultVisibility;
        }

        /**
         * Set dealDefaultVisibility
         **/
        public void setDealDefaultVisibility(BigDecimal dealDefaultVisibility) {
            this.dealDefaultVisibility = dealDefaultVisibility;
        }

        public RoleSettingsQueryParam dealDefaultVisibility(BigDecimal dealDefaultVisibility) {
            this.dealDefaultVisibility = dealDefaultVisibility;
            return this;
        }

        /**
        * The default visibility level of the leads for the role
        * @return leadDefaultVisibility
        **/
        @JsonProperty("lead_default_visibility")
        public BigDecimal getLeadDefaultVisibility() {
            return leadDefaultVisibility;
        }

        /**
         * Set leadDefaultVisibility
         **/
        public void setLeadDefaultVisibility(BigDecimal leadDefaultVisibility) {
            this.leadDefaultVisibility = leadDefaultVisibility;
        }

        public RoleSettingsQueryParam leadDefaultVisibility(BigDecimal leadDefaultVisibility) {
            this.leadDefaultVisibility = leadDefaultVisibility;
            return this;
        }

        /**
        * The default visibility level of the organizations for the role
        * @return orgDefaultVisibility
        **/
        @JsonProperty("org_default_visibility")
        public BigDecimal getOrgDefaultVisibility() {
            return orgDefaultVisibility;
        }

        /**
         * Set orgDefaultVisibility
         **/
        public void setOrgDefaultVisibility(BigDecimal orgDefaultVisibility) {
            this.orgDefaultVisibility = orgDefaultVisibility;
        }

        public RoleSettingsQueryParam orgDefaultVisibility(BigDecimal orgDefaultVisibility) {
            this.orgDefaultVisibility = orgDefaultVisibility;
            return this;
        }

        /**
        * The default visibility level of the people for the role
        * @return personDefaultVisibility
        **/
        @JsonProperty("person_default_visibility")
        public BigDecimal getPersonDefaultVisibility() {
            return personDefaultVisibility;
        }

        /**
         * Set personDefaultVisibility
         **/
        public void setPersonDefaultVisibility(BigDecimal personDefaultVisibility) {
            this.personDefaultVisibility = personDefaultVisibility;
        }

        public RoleSettingsQueryParam personDefaultVisibility(BigDecimal personDefaultVisibility) {
            this.personDefaultVisibility = personDefaultVisibility;
            return this;
        }

        /**
        * The default visibility level of the products for the role
        * @return productDefaultVisibility
        **/
        @JsonProperty("product_default_visibility")
        public BigDecimal getProductDefaultVisibility() {
            return productDefaultVisibility;
        }

        /**
         * Set productDefaultVisibility
         **/
        public void setProductDefaultVisibility(BigDecimal productDefaultVisibility) {
            this.productDefaultVisibility = productDefaultVisibility;
        }

        public RoleSettingsQueryParam productDefaultVisibility(BigDecimal productDefaultVisibility) {
            this.productDefaultVisibility = productDefaultVisibility;
            return this;
        }

        /**
        * The access level of the deals for the role (only for default role)
        * @return dealAccessLevel
        **/
        @JsonProperty("deal_access_level")
        public BigDecimal getDealAccessLevel() {
            return dealAccessLevel;
        }

        /**
         * Set dealAccessLevel
         **/
        public void setDealAccessLevel(BigDecimal dealAccessLevel) {
            this.dealAccessLevel = dealAccessLevel;
        }

        public RoleSettingsQueryParam dealAccessLevel(BigDecimal dealAccessLevel) {
            this.dealAccessLevel = dealAccessLevel;
            return this;
        }

        /**
        * The access level of the organizations for the role (only for default role)
        * @return orgAccessLevel
        **/
        @JsonProperty("org_access_level")
        public BigDecimal getOrgAccessLevel() {
            return orgAccessLevel;
        }

        /**
         * Set orgAccessLevel
         **/
        public void setOrgAccessLevel(BigDecimal orgAccessLevel) {
            this.orgAccessLevel = orgAccessLevel;
        }

        public RoleSettingsQueryParam orgAccessLevel(BigDecimal orgAccessLevel) {
            this.orgAccessLevel = orgAccessLevel;
            return this;
        }

        /**
        * The access level of the people for the role (only for default role)
        * @return personAccessLevel
        **/
        @JsonProperty("person_access_level")
        public BigDecimal getPersonAccessLevel() {
            return personAccessLevel;
        }

        /**
         * Set personAccessLevel
         **/
        public void setPersonAccessLevel(BigDecimal personAccessLevel) {
            this.personAccessLevel = personAccessLevel;
        }

        public RoleSettingsQueryParam personAccessLevel(BigDecimal personAccessLevel) {
            this.personAccessLevel = personAccessLevel;
            return this;
        }

        /**
        * The access level of the products for the role (only for default role)
        * @return productAccessLevel
        **/
        @JsonProperty("product_access_level")
        public BigDecimal getProductAccessLevel() {
            return productAccessLevel;
        }

        /**
         * Set productAccessLevel
         **/
        public void setProductAccessLevel(BigDecimal productAccessLevel) {
            this.productAccessLevel = productAccessLevel;
        }

        public RoleSettingsQueryParam productAccessLevel(BigDecimal productAccessLevel) {
            this.productAccessLevel = productAccessLevel;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class RoleSettingsQueryParam {\n");

            sb.append("    dealDefaultVisibility: ").append(toIndentedString(dealDefaultVisibility)).append("\n");
            sb.append("    leadDefaultVisibility: ").append(toIndentedString(leadDefaultVisibility)).append("\n");
            sb.append("    orgDefaultVisibility: ").append(toIndentedString(orgDefaultVisibility)).append("\n");
            sb.append("    personDefaultVisibility: ").append(toIndentedString(personDefaultVisibility)).append("\n");
            sb.append("    productDefaultVisibility: ").append(toIndentedString(productDefaultVisibility)).append("\n");
            sb.append("    dealAccessLevel: ").append(toIndentedString(dealAccessLevel)).append("\n");
            sb.append("    orgAccessLevel: ").append(toIndentedString(orgAccessLevel)).append("\n");
            sb.append("    personAccessLevel: ").append(toIndentedString(personAccessLevel)).append("\n");
            sb.append("    productAccessLevel: ").append(toIndentedString(productAccessLevel)).append("\n");
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
