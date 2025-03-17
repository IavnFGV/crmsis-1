package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.PipelineDetailsAllOfDealsSummaryPerCurrency;
import dti.crmsis.back.clients.openapi.v1.model.PipelineDetailsAllOfDealsSummaryPerCurrencyFull;
import dti.crmsis.back.clients.openapi.v1.model.PipelineDetailsAllOfDealsSummaryPerStages;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Deals summary
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class PipelineDetailsAllOfDealsSummary  {

    private PipelineDetailsAllOfDealsSummaryPerStages perStages;
    private PipelineDetailsAllOfDealsSummaryPerCurrency perCurrency;
    /**
      * Deals count
     **/
    private Integer totalCount;
    private PipelineDetailsAllOfDealsSummaryPerCurrencyFull perCurrencyFull;

    /**
    * Get perStages
    * @return perStages
    **/
    @JsonProperty("per_stages")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PipelineDetailsAllOfDealsSummaryPerStages getPerStages() {
        return perStages;
    }

    /**
     * Set perStages
     **/
    public void setPerStages(PipelineDetailsAllOfDealsSummaryPerStages perStages) {
        this.perStages = perStages;
    }

    public PipelineDetailsAllOfDealsSummary perStages(PipelineDetailsAllOfDealsSummaryPerStages perStages) {
        this.perStages = perStages;
        return this;
    }

    /**
    * Get perCurrency
    * @return perCurrency
    **/
    @JsonProperty("per_currency")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PipelineDetailsAllOfDealsSummaryPerCurrency getPerCurrency() {
        return perCurrency;
    }

    /**
     * Set perCurrency
     **/
    public void setPerCurrency(PipelineDetailsAllOfDealsSummaryPerCurrency perCurrency) {
        this.perCurrency = perCurrency;
    }

    public PipelineDetailsAllOfDealsSummary perCurrency(PipelineDetailsAllOfDealsSummaryPerCurrency perCurrency) {
        this.perCurrency = perCurrency;
        return this;
    }

    /**
    * Deals count
    * @return totalCount
    **/
    @JsonProperty("total_count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * Set totalCount
     **/
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public PipelineDetailsAllOfDealsSummary totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
    * Get perCurrencyFull
    * @return perCurrencyFull
    **/
    @JsonProperty("per_currency_full")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PipelineDetailsAllOfDealsSummaryPerCurrencyFull getPerCurrencyFull() {
        return perCurrencyFull;
    }

    /**
     * Set perCurrencyFull
     **/
    public void setPerCurrencyFull(PipelineDetailsAllOfDealsSummaryPerCurrencyFull perCurrencyFull) {
        this.perCurrencyFull = perCurrencyFull;
    }

    public PipelineDetailsAllOfDealsSummary perCurrencyFull(PipelineDetailsAllOfDealsSummaryPerCurrencyFull perCurrencyFull) {
        this.perCurrencyFull = perCurrencyFull;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineDetailsAllOfDealsSummary {\n");

        sb.append("    perStages: ").append(toIndentedString(perStages)).append("\n");
        sb.append("    perCurrency: ").append(toIndentedString(perCurrency)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    perCurrencyFull: ").append(toIndentedString(perCurrencyFull)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code PipelineDetailsAllOfDealsSummary} object that
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

        PipelineDetailsAllOfDealsSummary model = (PipelineDetailsAllOfDealsSummary) obj;

        return java.util.Objects.equals(perStages, model.perStages) &&
        java.util.Objects.equals(perCurrency, model.perCurrency) &&
        java.util.Objects.equals(totalCount, model.totalCount) &&
        java.util.Objects.equals(perCurrencyFull, model.perCurrencyFull);
    }

    /**
     * Returns a hash code for a {@code PipelineDetailsAllOfDealsSummary}.
     *
     * @return a hash code value for a {@code PipelineDetailsAllOfDealsSummary}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(perStages,
        perCurrency,
        totalCount,
        perCurrencyFull);
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
      * Deals summary
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class PipelineDetailsAllOfDealsSummaryQueryParam  {

        /**
          * Deals summary
         **/
        @jakarta.ws.rs.QueryParam("perStages")
        private PipelineDetailsAllOfDealsSummaryPerStages perStages;
        /**
          * Deals summary
         **/
        @jakarta.ws.rs.QueryParam("perCurrency")
        private PipelineDetailsAllOfDealsSummaryPerCurrency perCurrency;
        /**
          * Deals summary
         **/
        @jakarta.ws.rs.QueryParam("totalCount")
        private Integer totalCount;
        /**
          * Deals summary
         **/
        @jakarta.ws.rs.QueryParam("perCurrencyFull")
        private PipelineDetailsAllOfDealsSummaryPerCurrencyFull perCurrencyFull;

        /**
        * Get perStages
        * @return perStages
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("per_stages")
        public PipelineDetailsAllOfDealsSummaryPerStages getPerStages() {
            return perStages;
        }

        /**
         * Set perStages
         **/
        public void setPerStages(PipelineDetailsAllOfDealsSummaryPerStages perStages) {
            this.perStages = perStages;
        }

        public PipelineDetailsAllOfDealsSummaryQueryParam perStages(PipelineDetailsAllOfDealsSummaryPerStages perStages) {
            this.perStages = perStages;
            return this;
        }

        /**
        * Get perCurrency
        * @return perCurrency
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("per_currency")
        public PipelineDetailsAllOfDealsSummaryPerCurrency getPerCurrency() {
            return perCurrency;
        }

        /**
         * Set perCurrency
         **/
        public void setPerCurrency(PipelineDetailsAllOfDealsSummaryPerCurrency perCurrency) {
            this.perCurrency = perCurrency;
        }

        public PipelineDetailsAllOfDealsSummaryQueryParam perCurrency(PipelineDetailsAllOfDealsSummaryPerCurrency perCurrency) {
            this.perCurrency = perCurrency;
            return this;
        }

        /**
        * Deals count
        * @return totalCount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("total_count")
        public Integer getTotalCount() {
            return totalCount;
        }

        /**
         * Set totalCount
         **/
        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }

        public PipelineDetailsAllOfDealsSummaryQueryParam totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
        * Get perCurrencyFull
        * @return perCurrencyFull
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("per_currency_full")
        public PipelineDetailsAllOfDealsSummaryPerCurrencyFull getPerCurrencyFull() {
            return perCurrencyFull;
        }

        /**
         * Set perCurrencyFull
         **/
        public void setPerCurrencyFull(PipelineDetailsAllOfDealsSummaryPerCurrencyFull perCurrencyFull) {
            this.perCurrencyFull = perCurrencyFull;
        }

        public PipelineDetailsAllOfDealsSummaryQueryParam perCurrencyFull(PipelineDetailsAllOfDealsSummaryPerCurrencyFull perCurrencyFull) {
            this.perCurrencyFull = perCurrencyFull;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PipelineDetailsAllOfDealsSummaryQueryParam {\n");

            sb.append("    perStages: ").append(toIndentedString(perStages)).append("\n");
            sb.append("    perCurrency: ").append(toIndentedString(perCurrency)).append("\n");
            sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
            sb.append("    perCurrencyFull: ").append(toIndentedString(perCurrencyFull)).append("\n");
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
