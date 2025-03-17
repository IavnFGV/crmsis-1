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
public class UserSettingsItem  {

    /**
      * If the vendors are allowed to be part of the Marketplace team or not
     **/
    private Boolean marketplaceTeam;
    /**
      * The number of results shown in list by default
     **/
    private BigDecimal listLimit;
    /**
      * Whether beta app is enabled
     **/
    private Boolean betaApp;
    /**
      * Prevent salesphone call to override
     **/
    private Boolean preventSalesphoneCalltoOverride;
    /**
      * The destination of file upload
     **/
    private String fileUploadDestination;
    /**
      * The call to link syntax
     **/
    private String calltoLinkSyntax;
    /**
      * Whether the expected close date of the deal is filled automatically or not
     **/
    private Boolean autofillDealExpectedCloseDate;
    /**
      * Allow the vendors to duplicate a person
     **/
    private String personDuplicateCondition;

    /**
    * If the vendors are allowed to be part of the Marketplace team or not
    * @return marketplaceTeam
    **/
    @JsonProperty("marketplace_team")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getMarketplaceTeam() {
        return marketplaceTeam;
    }

    /**
     * Set marketplaceTeam
     **/
    public void setMarketplaceTeam(Boolean marketplaceTeam) {
        this.marketplaceTeam = marketplaceTeam;
    }

    public UserSettingsItem marketplaceTeam(Boolean marketplaceTeam) {
        this.marketplaceTeam = marketplaceTeam;
        return this;
    }

    /**
    * The number of results shown in list by default
    * @return listLimit
    **/
    @JsonProperty("list_limit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getListLimit() {
        return listLimit;
    }

    /**
     * Set listLimit
     **/
    public void setListLimit(BigDecimal listLimit) {
        this.listLimit = listLimit;
    }

    public UserSettingsItem listLimit(BigDecimal listLimit) {
        this.listLimit = listLimit;
        return this;
    }

    /**
    * Whether beta app is enabled
    * @return betaApp
    **/
    @JsonProperty("beta_app")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getBetaApp() {
        return betaApp;
    }

    /**
     * Set betaApp
     **/
    public void setBetaApp(Boolean betaApp) {
        this.betaApp = betaApp;
    }

    public UserSettingsItem betaApp(Boolean betaApp) {
        this.betaApp = betaApp;
        return this;
    }

    /**
    * Prevent salesphone call to override
    * @return preventSalesphoneCalltoOverride
    **/
    @JsonProperty("prevent_salesphone_callto_override")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPreventSalesphoneCalltoOverride() {
        return preventSalesphoneCalltoOverride;
    }

    /**
     * Set preventSalesphoneCalltoOverride
     **/
    public void setPreventSalesphoneCalltoOverride(Boolean preventSalesphoneCalltoOverride) {
        this.preventSalesphoneCalltoOverride = preventSalesphoneCalltoOverride;
    }

    public UserSettingsItem preventSalesphoneCalltoOverride(Boolean preventSalesphoneCalltoOverride) {
        this.preventSalesphoneCalltoOverride = preventSalesphoneCalltoOverride;
        return this;
    }

    /**
    * The destination of file upload
    * @return fileUploadDestination
    **/
    @JsonProperty("file_upload_destination")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFileUploadDestination() {
        return fileUploadDestination;
    }

    /**
     * Set fileUploadDestination
     **/
    public void setFileUploadDestination(String fileUploadDestination) {
        this.fileUploadDestination = fileUploadDestination;
    }

    public UserSettingsItem fileUploadDestination(String fileUploadDestination) {
        this.fileUploadDestination = fileUploadDestination;
        return this;
    }

    /**
    * The call to link syntax
    * @return calltoLinkSyntax
    **/
    @JsonProperty("callto_link_syntax")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCalltoLinkSyntax() {
        return calltoLinkSyntax;
    }

    /**
     * Set calltoLinkSyntax
     **/
    public void setCalltoLinkSyntax(String calltoLinkSyntax) {
        this.calltoLinkSyntax = calltoLinkSyntax;
    }

    public UserSettingsItem calltoLinkSyntax(String calltoLinkSyntax) {
        this.calltoLinkSyntax = calltoLinkSyntax;
        return this;
    }

    /**
    * Whether the expected close date of the deal is filled automatically or not
    * @return autofillDealExpectedCloseDate
    **/
    @JsonProperty("autofill_deal_expected_close_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAutofillDealExpectedCloseDate() {
        return autofillDealExpectedCloseDate;
    }

    /**
     * Set autofillDealExpectedCloseDate
     **/
    public void setAutofillDealExpectedCloseDate(Boolean autofillDealExpectedCloseDate) {
        this.autofillDealExpectedCloseDate = autofillDealExpectedCloseDate;
    }

    public UserSettingsItem autofillDealExpectedCloseDate(Boolean autofillDealExpectedCloseDate) {
        this.autofillDealExpectedCloseDate = autofillDealExpectedCloseDate;
        return this;
    }

    /**
    * Allow the vendors to duplicate a person
    * @return personDuplicateCondition
    **/
    @JsonProperty("person_duplicate_condition")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPersonDuplicateCondition() {
        return personDuplicateCondition;
    }

    /**
     * Set personDuplicateCondition
     **/
    public void setPersonDuplicateCondition(String personDuplicateCondition) {
        this.personDuplicateCondition = personDuplicateCondition;
    }

    public UserSettingsItem personDuplicateCondition(String personDuplicateCondition) {
        this.personDuplicateCondition = personDuplicateCondition;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserSettingsItem {\n");

        sb.append("    marketplaceTeam: ").append(toIndentedString(marketplaceTeam)).append("\n");
        sb.append("    listLimit: ").append(toIndentedString(listLimit)).append("\n");
        sb.append("    betaApp: ").append(toIndentedString(betaApp)).append("\n");
        sb.append("    preventSalesphoneCalltoOverride: ").append(toIndentedString(preventSalesphoneCalltoOverride)).append("\n");
        sb.append("    fileUploadDestination: ").append(toIndentedString(fileUploadDestination)).append("\n");
        sb.append("    calltoLinkSyntax: ").append(toIndentedString(calltoLinkSyntax)).append("\n");
        sb.append("    autofillDealExpectedCloseDate: ").append(toIndentedString(autofillDealExpectedCloseDate)).append("\n");
        sb.append("    personDuplicateCondition: ").append(toIndentedString(personDuplicateCondition)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code UserSettingsItem} object that
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

        UserSettingsItem model = (UserSettingsItem) obj;

        return java.util.Objects.equals(marketplaceTeam, model.marketplaceTeam) &&
        java.util.Objects.equals(listLimit, model.listLimit) &&
        java.util.Objects.equals(betaApp, model.betaApp) &&
        java.util.Objects.equals(preventSalesphoneCalltoOverride, model.preventSalesphoneCalltoOverride) &&
        java.util.Objects.equals(fileUploadDestination, model.fileUploadDestination) &&
        java.util.Objects.equals(calltoLinkSyntax, model.calltoLinkSyntax) &&
        java.util.Objects.equals(autofillDealExpectedCloseDate, model.autofillDealExpectedCloseDate) &&
        java.util.Objects.equals(personDuplicateCondition, model.personDuplicateCondition);
    }

    /**
     * Returns a hash code for a {@code UserSettingsItem}.
     *
     * @return a hash code value for a {@code UserSettingsItem}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(marketplaceTeam,
        listLimit,
        betaApp,
        preventSalesphoneCalltoOverride,
        fileUploadDestination,
        calltoLinkSyntax,
        autofillDealExpectedCloseDate,
        personDuplicateCondition);
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
    public static class UserSettingsItemQueryParam  {

        @jakarta.ws.rs.QueryParam("marketplaceTeam")
        private Boolean marketplaceTeam;
        @jakarta.ws.rs.QueryParam("listLimit")
        private BigDecimal listLimit;
        @jakarta.ws.rs.QueryParam("betaApp")
        private Boolean betaApp;
        @jakarta.ws.rs.QueryParam("preventSalesphoneCalltoOverride")
        private Boolean preventSalesphoneCalltoOverride;
        @jakarta.ws.rs.QueryParam("fileUploadDestination")
        private String fileUploadDestination;
        @jakarta.ws.rs.QueryParam("calltoLinkSyntax")
        private String calltoLinkSyntax;
        @jakarta.ws.rs.QueryParam("autofillDealExpectedCloseDate")
        private Boolean autofillDealExpectedCloseDate;
        @jakarta.ws.rs.QueryParam("personDuplicateCondition")
        private String personDuplicateCondition;

        /**
        * If the vendors are allowed to be part of the Marketplace team or not
        * @return marketplaceTeam
        **/
        @JsonProperty("marketplace_team")
        public Boolean getMarketplaceTeam() {
            return marketplaceTeam;
        }

        /**
         * Set marketplaceTeam
         **/
        public void setMarketplaceTeam(Boolean marketplaceTeam) {
            this.marketplaceTeam = marketplaceTeam;
        }

        public UserSettingsItemQueryParam marketplaceTeam(Boolean marketplaceTeam) {
            this.marketplaceTeam = marketplaceTeam;
            return this;
        }

        /**
        * The number of results shown in list by default
        * @return listLimit
        **/
        @JsonProperty("list_limit")
        public BigDecimal getListLimit() {
            return listLimit;
        }

        /**
         * Set listLimit
         **/
        public void setListLimit(BigDecimal listLimit) {
            this.listLimit = listLimit;
        }

        public UserSettingsItemQueryParam listLimit(BigDecimal listLimit) {
            this.listLimit = listLimit;
            return this;
        }

        /**
        * Whether beta app is enabled
        * @return betaApp
        **/
        @JsonProperty("beta_app")
        public Boolean getBetaApp() {
            return betaApp;
        }

        /**
         * Set betaApp
         **/
        public void setBetaApp(Boolean betaApp) {
            this.betaApp = betaApp;
        }

        public UserSettingsItemQueryParam betaApp(Boolean betaApp) {
            this.betaApp = betaApp;
            return this;
        }

        /**
        * Prevent salesphone call to override
        * @return preventSalesphoneCalltoOverride
        **/
        @JsonProperty("prevent_salesphone_callto_override")
        public Boolean getPreventSalesphoneCalltoOverride() {
            return preventSalesphoneCalltoOverride;
        }

        /**
         * Set preventSalesphoneCalltoOverride
         **/
        public void setPreventSalesphoneCalltoOverride(Boolean preventSalesphoneCalltoOverride) {
            this.preventSalesphoneCalltoOverride = preventSalesphoneCalltoOverride;
        }

        public UserSettingsItemQueryParam preventSalesphoneCalltoOverride(Boolean preventSalesphoneCalltoOverride) {
            this.preventSalesphoneCalltoOverride = preventSalesphoneCalltoOverride;
            return this;
        }

        /**
        * The destination of file upload
        * @return fileUploadDestination
        **/
        @JsonProperty("file_upload_destination")
        public String getFileUploadDestination() {
            return fileUploadDestination;
        }

        /**
         * Set fileUploadDestination
         **/
        public void setFileUploadDestination(String fileUploadDestination) {
            this.fileUploadDestination = fileUploadDestination;
        }

        public UserSettingsItemQueryParam fileUploadDestination(String fileUploadDestination) {
            this.fileUploadDestination = fileUploadDestination;
            return this;
        }

        /**
        * The call to link syntax
        * @return calltoLinkSyntax
        **/
        @JsonProperty("callto_link_syntax")
        public String getCalltoLinkSyntax() {
            return calltoLinkSyntax;
        }

        /**
         * Set calltoLinkSyntax
         **/
        public void setCalltoLinkSyntax(String calltoLinkSyntax) {
            this.calltoLinkSyntax = calltoLinkSyntax;
        }

        public UserSettingsItemQueryParam calltoLinkSyntax(String calltoLinkSyntax) {
            this.calltoLinkSyntax = calltoLinkSyntax;
            return this;
        }

        /**
        * Whether the expected close date of the deal is filled automatically or not
        * @return autofillDealExpectedCloseDate
        **/
        @JsonProperty("autofill_deal_expected_close_date")
        public Boolean getAutofillDealExpectedCloseDate() {
            return autofillDealExpectedCloseDate;
        }

        /**
         * Set autofillDealExpectedCloseDate
         **/
        public void setAutofillDealExpectedCloseDate(Boolean autofillDealExpectedCloseDate) {
            this.autofillDealExpectedCloseDate = autofillDealExpectedCloseDate;
        }

        public UserSettingsItemQueryParam autofillDealExpectedCloseDate(Boolean autofillDealExpectedCloseDate) {
            this.autofillDealExpectedCloseDate = autofillDealExpectedCloseDate;
            return this;
        }

        /**
        * Allow the vendors to duplicate a person
        * @return personDuplicateCondition
        **/
        @JsonProperty("person_duplicate_condition")
        public String getPersonDuplicateCondition() {
            return personDuplicateCondition;
        }

        /**
         * Set personDuplicateCondition
         **/
        public void setPersonDuplicateCondition(String personDuplicateCondition) {
            this.personDuplicateCondition = personDuplicateCondition;
        }

        public UserSettingsItemQueryParam personDuplicateCondition(String personDuplicateCondition) {
            this.personDuplicateCondition = personDuplicateCondition;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class UserSettingsItemQueryParam {\n");

            sb.append("    marketplaceTeam: ").append(toIndentedString(marketplaceTeam)).append("\n");
            sb.append("    listLimit: ").append(toIndentedString(listLimit)).append("\n");
            sb.append("    betaApp: ").append(toIndentedString(betaApp)).append("\n");
            sb.append("    preventSalesphoneCalltoOverride: ").append(toIndentedString(preventSalesphoneCalltoOverride)).append("\n");
            sb.append("    fileUploadDestination: ").append(toIndentedString(fileUploadDestination)).append("\n");
            sb.append("    calltoLinkSyntax: ").append(toIndentedString(calltoLinkSyntax)).append("\n");
            sb.append("    autofillDealExpectedCloseDate: ").append(toIndentedString(autofillDealExpectedCloseDate)).append("\n");
            sb.append("    personDuplicateCondition: ").append(toIndentedString(personDuplicateCondition)).append("\n");
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
