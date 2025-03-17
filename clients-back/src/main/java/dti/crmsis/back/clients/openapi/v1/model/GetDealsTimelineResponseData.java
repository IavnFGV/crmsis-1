package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.DealStrict;
import dti.crmsis.back.clients.openapi.v1.model.GetDealsTimelineResponseDataTotals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Open and won deals grouped into periods by defined interval, amount and date-type dealField (`field_key`)
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetDealsTimelineResponseData  {

    /**
      * The start date and time of the period
     **/
    private String periodStart;
    /**
      * The end date and time of the period
     **/
    private String periodEnd;
    private List<DealStrict> deals;
    private GetDealsTimelineResponseDataTotals totals;

    /**
    * The start date and time of the period
    * @return periodStart
    **/
    @JsonProperty("period_start")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPeriodStart() {
        return periodStart;
    }

    /**
     * Set periodStart
     **/
    public void setPeriodStart(String periodStart) {
        this.periodStart = periodStart;
    }

    public GetDealsTimelineResponseData periodStart(String periodStart) {
        this.periodStart = periodStart;
        return this;
    }

    /**
    * The end date and time of the period
    * @return periodEnd
    **/
    @JsonProperty("period_end")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPeriodEnd() {
        return periodEnd;
    }

    /**
     * Set periodEnd
     **/
    public void setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
    }

    public GetDealsTimelineResponseData periodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
        return this;
    }

    /**
    * Get deals
    * @return deals
    **/
    @JsonProperty("deals")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<DealStrict> getDeals() {
        return deals;
    }

    /**
     * Set deals
     **/
    public void setDeals(List<DealStrict> deals) {
        this.deals = deals;
    }

    public GetDealsTimelineResponseData deals(List<DealStrict> deals) {
        this.deals = deals;
        return this;
    }
    public GetDealsTimelineResponseData addDealsItem(DealStrict dealsItem) {
        if (this.deals == null){
            deals = new ArrayList<>();
        }
        this.deals.add(dealsItem);
        return this;
    }

    /**
    * Get totals
    * @return totals
    **/
    @JsonProperty("totals")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetDealsTimelineResponseDataTotals getTotals() {
        return totals;
    }

    /**
     * Set totals
     **/
    public void setTotals(GetDealsTimelineResponseDataTotals totals) {
        this.totals = totals;
    }

    public GetDealsTimelineResponseData totals(GetDealsTimelineResponseDataTotals totals) {
        this.totals = totals;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetDealsTimelineResponseData {\n");

        sb.append("    periodStart: ").append(toIndentedString(periodStart)).append("\n");
        sb.append("    periodEnd: ").append(toIndentedString(periodEnd)).append("\n");
        sb.append("    deals: ").append(toIndentedString(deals)).append("\n");
        sb.append("    totals: ").append(toIndentedString(totals)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetDealsTimelineResponseData} object that
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

        GetDealsTimelineResponseData model = (GetDealsTimelineResponseData) obj;

        return java.util.Objects.equals(periodStart, model.periodStart) &&
        java.util.Objects.equals(periodEnd, model.periodEnd) &&
        java.util.Objects.equals(deals, model.deals) &&
        java.util.Objects.equals(totals, model.totals);
    }

    /**
     * Returns a hash code for a {@code GetDealsTimelineResponseData}.
     *
     * @return a hash code value for a {@code GetDealsTimelineResponseData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(periodStart,
        periodEnd,
        deals,
        totals);
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
      * Open and won deals grouped into periods by defined interval, amount and date-type dealField (`field_key`)
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetDealsTimelineResponseDataQueryParam  {

        /**
          * Open and won deals grouped into periods by defined interval, amount and date-type dealField (`field_key`)
         **/
        @jakarta.ws.rs.QueryParam("periodStart")
        private String periodStart;
        /**
          * Open and won deals grouped into periods by defined interval, amount and date-type dealField (`field_key`)
         **/
        @jakarta.ws.rs.QueryParam("periodEnd")
        private String periodEnd;
        /**
          * Open and won deals grouped into periods by defined interval, amount and date-type dealField (`field_key`)
         **/
        @jakarta.ws.rs.QueryParam("deals")
        private List<DealStrict> deals = null;
        /**
          * Open and won deals grouped into periods by defined interval, amount and date-type dealField (`field_key`)
         **/
        @jakarta.ws.rs.QueryParam("totals")
        private GetDealsTimelineResponseDataTotals totals;

        /**
        * The start date and time of the period
        * @return periodStart
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("period_start")
        public String getPeriodStart() {
            return periodStart;
        }

        /**
         * Set periodStart
         **/
        public void setPeriodStart(String periodStart) {
            this.periodStart = periodStart;
        }

        public GetDealsTimelineResponseDataQueryParam periodStart(String periodStart) {
            this.periodStart = periodStart;
            return this;
        }

        /**
        * The end date and time of the period
        * @return periodEnd
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("period_end")
        public String getPeriodEnd() {
            return periodEnd;
        }

        /**
         * Set periodEnd
         **/
        public void setPeriodEnd(String periodEnd) {
            this.periodEnd = periodEnd;
        }

        public GetDealsTimelineResponseDataQueryParam periodEnd(String periodEnd) {
            this.periodEnd = periodEnd;
            return this;
        }

        /**
        * Get deals
        * @return deals
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("deals")
        public List<DealStrict> getDeals() {
            return deals;
        }

        /**
         * Set deals
         **/
        public void setDeals(List<DealStrict> deals) {
            this.deals = deals;
        }

        public GetDealsTimelineResponseDataQueryParam deals(List<DealStrict> deals) {
            this.deals = deals;
            return this;
        }
        public GetDealsTimelineResponseDataQueryParam addDealsItem(DealStrict dealsItem) {
            this.deals.add(dealsItem);
            return this;
        }

        /**
        * Get totals
        * @return totals
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("totals")
        public GetDealsTimelineResponseDataTotals getTotals() {
            return totals;
        }

        /**
         * Set totals
         **/
        public void setTotals(GetDealsTimelineResponseDataTotals totals) {
            this.totals = totals;
        }

        public GetDealsTimelineResponseDataQueryParam totals(GetDealsTimelineResponseDataTotals totals) {
            this.totals = totals;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetDealsTimelineResponseDataQueryParam {\n");

            sb.append("    periodStart: ").append(toIndentedString(periodStart)).append("\n");
            sb.append("    periodEnd: ").append(toIndentedString(periodEnd)).append("\n");
            sb.append("    deals: ").append(toIndentedString(deals)).append("\n");
            sb.append("    totals: ").append(toIndentedString(totals)).append("\n");
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
