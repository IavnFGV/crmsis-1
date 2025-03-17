package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDealsFormattedValues;
import dti.crmsis.back.clients.openapi.v1.model.GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDealsValues;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Deals summary
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals  {

    /**
      * The count of the deals
     **/
    private Integer count;
    /**
      * The IDs of the deals that have been moved
     **/
    private List<Integer> dealsIds;
    private GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDealsValues values;
    private GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDealsFormattedValues formattedValues;

    /**
    * The count of the deals
    * @return count
    **/
    @JsonProperty("count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getCount() {
        return count;
    }

    /**
     * Set count
     **/
    public void setCount(Integer count) {
        this.count = count;
    }

    public GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals count(Integer count) {
        this.count = count;
        return this;
    }

    /**
    * The IDs of the deals that have been moved
    * @return dealsIds
    **/
    @JsonProperty("deals_ids")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Integer> getDealsIds() {
        return dealsIds;
    }

    /**
     * Set dealsIds
     **/
    public void setDealsIds(List<Integer> dealsIds) {
        this.dealsIds = dealsIds;
    }

    public GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals dealsIds(List<Integer> dealsIds) {
        this.dealsIds = dealsIds;
        return this;
    }
    public GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals addDealsIdsItem(Integer dealsIdsItem) {
        if (this.dealsIds == null){
            dealsIds = new ArrayList<>();
        }
        this.dealsIds.add(dealsIdsItem);
        return this;
    }

    /**
    * Get values
    * @return values
    **/
    @JsonProperty("values")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDealsValues getValues() {
        return values;
    }

    /**
     * Set values
     **/
    public void setValues(GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDealsValues values) {
        this.values = values;
    }

    public GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals values(GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDealsValues values) {
        this.values = values;
        return this;
    }

    /**
    * Get formattedValues
    * @return formattedValues
    **/
    @JsonProperty("formatted_values")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDealsFormattedValues getFormattedValues() {
        return formattedValues;
    }

    /**
     * Set formattedValues
     **/
    public void setFormattedValues(GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDealsFormattedValues formattedValues) {
        this.formattedValues = formattedValues;
    }

    public GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals formattedValues(GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDealsFormattedValues formattedValues) {
        this.formattedValues = formattedValues;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals {\n");

        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    dealsIds: ").append(toIndentedString(dealsIds)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
        sb.append("    formattedValues: ").append(toIndentedString(formattedValues)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals} object that
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

        GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals model = (GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals) obj;

        return java.util.Objects.equals(count, model.count) &&
        java.util.Objects.equals(dealsIds, model.dealsIds) &&
        java.util.Objects.equals(values, model.values) &&
        java.util.Objects.equals(formattedValues, model.formattedValues);
    }

    /**
     * Returns a hash code for a {@code GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals}.
     *
     * @return a hash code value for a {@code GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(count,
        dealsIds,
        values,
        formattedValues);
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
    public static class GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDealsQueryParam  {

        /**
          * Deals summary
         **/
        @jakarta.ws.rs.QueryParam("count")
        private Integer count;
        /**
          * Deals summary
         **/
        @jakarta.ws.rs.QueryParam("dealsIds")
        private List<Integer> dealsIds = null;
        /**
          * Deals summary
         **/
        @jakarta.ws.rs.QueryParam("values")
        private GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDealsValues values;
        /**
          * Deals summary
         **/
        @jakarta.ws.rs.QueryParam("formattedValues")
        private GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDealsFormattedValues formattedValues;

        /**
        * The count of the deals
        * @return count
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        public Integer getCount() {
            return count;
        }

        /**
         * Set count
         **/
        public void setCount(Integer count) {
            this.count = count;
        }

        public GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDealsQueryParam count(Integer count) {
            this.count = count;
            return this;
        }

        /**
        * The IDs of the deals that have been moved
        * @return dealsIds
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("deals_ids")
        public List<Integer> getDealsIds() {
            return dealsIds;
        }

        /**
         * Set dealsIds
         **/
        public void setDealsIds(List<Integer> dealsIds) {
            this.dealsIds = dealsIds;
        }

        public GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDealsQueryParam dealsIds(List<Integer> dealsIds) {
            this.dealsIds = dealsIds;
            return this;
        }
        public GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDealsQueryParam addDealsIdsItem(Integer dealsIdsItem) {
            this.dealsIds.add(dealsIdsItem);
            return this;
        }

        /**
        * Get values
        * @return values
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("values")
        public GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDealsValues getValues() {
            return values;
        }

        /**
         * Set values
         **/
        public void setValues(GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDealsValues values) {
            this.values = values;
        }

        public GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDealsQueryParam values(GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDealsValues values) {
            this.values = values;
            return this;
        }

        /**
        * Get formattedValues
        * @return formattedValues
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("formatted_values")
        public GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDealsFormattedValues getFormattedValues() {
            return formattedValues;
        }

        /**
         * Set formattedValues
         **/
        public void setFormattedValues(GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDealsFormattedValues formattedValues) {
            this.formattedValues = formattedValues;
        }

        public GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDealsQueryParam formattedValues(GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDealsFormattedValues formattedValues) {
            this.formattedValues = formattedValues;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDealsQueryParam {\n");

            sb.append("    count: ").append(toIndentedString(count)).append("\n");
            sb.append("    dealsIds: ").append(toIndentedString(dealsIds)).append("\n");
            sb.append("    values: ").append(toIndentedString(values)).append("\n");
            sb.append("    formattedValues: ").append(toIndentedString(formattedValues)).append("\n");
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
