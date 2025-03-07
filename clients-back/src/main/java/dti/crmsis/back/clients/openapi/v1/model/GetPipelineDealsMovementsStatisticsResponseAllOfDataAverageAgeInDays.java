package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysByStagesInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The moved deals average age in days
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDays  {

    /**
      * The moved deals average age across all stages
     **/
    private Integer acrossAllStages;
    /**
      * The moved deals average age by stages
     **/
    private List<GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysByStagesInner> byStages;

    /**
    * The moved deals average age across all stages
    * @return acrossAllStages
    **/
    @JsonProperty("across_all_stages")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getAcrossAllStages() {
        return acrossAllStages;
    }

    /**
     * Set acrossAllStages
     **/
    public void setAcrossAllStages(Integer acrossAllStages) {
        this.acrossAllStages = acrossAllStages;
    }

    public GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDays acrossAllStages(Integer acrossAllStages) {
        this.acrossAllStages = acrossAllStages;
        return this;
    }

    /**
    * The moved deals average age by stages
    * @return byStages
    **/
    @JsonProperty("by_stages")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysByStagesInner> getByStages() {
        return byStages;
    }

    /**
     * Set byStages
     **/
    public void setByStages(List<GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysByStagesInner> byStages) {
        this.byStages = byStages;
    }

    public GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDays byStages(List<GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysByStagesInner> byStages) {
        this.byStages = byStages;
        return this;
    }
    public GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDays addByStagesItem(GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysByStagesInner byStagesItem) {
        if (this.byStages == null){
            byStages = new ArrayList<>();
        }
        this.byStages.add(byStagesItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDays {\n");

        sb.append("    acrossAllStages: ").append(toIndentedString(acrossAllStages)).append("\n");
        sb.append("    byStages: ").append(toIndentedString(byStages)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDays} object that
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

        GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDays model = (GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDays) obj;

        return java.util.Objects.equals(acrossAllStages, model.acrossAllStages) &&
        java.util.Objects.equals(byStages, model.byStages);
    }

    /**
     * Returns a hash code for a {@code GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDays}.
     *
     * @return a hash code value for a {@code GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDays}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(acrossAllStages,
        byStages);
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
      * The moved deals average age in days
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysQueryParam  {

        /**
          * The moved deals average age in days
         **/
        @jakarta.ws.rs.QueryParam("acrossAllStages")
        private Integer acrossAllStages;
        /**
          * The moved deals average age in days
         **/
        @jakarta.ws.rs.QueryParam("byStages")
        private List<GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysByStagesInner> byStages = null;

        /**
        * The moved deals average age across all stages
        * @return acrossAllStages
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("across_all_stages")
        public Integer getAcrossAllStages() {
            return acrossAllStages;
        }

        /**
         * Set acrossAllStages
         **/
        public void setAcrossAllStages(Integer acrossAllStages) {
            this.acrossAllStages = acrossAllStages;
        }

        public GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysQueryParam acrossAllStages(Integer acrossAllStages) {
            this.acrossAllStages = acrossAllStages;
            return this;
        }

        /**
        * The moved deals average age by stages
        * @return byStages
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("by_stages")
        public List<GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysByStagesInner> getByStages() {
            return byStages;
        }

        /**
         * Set byStages
         **/
        public void setByStages(List<GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysByStagesInner> byStages) {
            this.byStages = byStages;
        }

        public GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysQueryParam byStages(List<GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysByStagesInner> byStages) {
            this.byStages = byStages;
            return this;
        }
        public GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysQueryParam addByStagesItem(GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysByStagesInner byStagesItem) {
            this.byStages.add(byStagesItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDaysQueryParam {\n");

            sb.append("    acrossAllStages: ").append(toIndentedString(acrossAllStages)).append("\n");
            sb.append("    byStages: ").append(toIndentedString(byStages)).append("\n");
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
