package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Movements between stages
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetPipelineDealsMovementsStatisticsResponseAllOfDataMovementsBetweenStages  {

    /**
      * The count of the deals that have been moved between stages
     **/
    private Integer count;

    /**
    * The count of the deals that have been moved between stages
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

    public GetPipelineDealsMovementsStatisticsResponseAllOfDataMovementsBetweenStages count(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPipelineDealsMovementsStatisticsResponseAllOfDataMovementsBetweenStages {\n");

        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetPipelineDealsMovementsStatisticsResponseAllOfDataMovementsBetweenStages} object that
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

        GetPipelineDealsMovementsStatisticsResponseAllOfDataMovementsBetweenStages model = (GetPipelineDealsMovementsStatisticsResponseAllOfDataMovementsBetweenStages) obj;

        return java.util.Objects.equals(count, model.count);
    }

    /**
     * Returns a hash code for a {@code GetPipelineDealsMovementsStatisticsResponseAllOfDataMovementsBetweenStages}.
     *
     * @return a hash code value for a {@code GetPipelineDealsMovementsStatisticsResponseAllOfDataMovementsBetweenStages}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(count);
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
      * Movements between stages
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetPipelineDealsMovementsStatisticsResponseAllOfDataMovementsBetweenStagesQueryParam  {

        /**
          * Movements between stages
         **/
        @jakarta.ws.rs.QueryParam("count")
        private Integer count;

        /**
        * The count of the deals that have been moved between stages
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

        public GetPipelineDealsMovementsStatisticsResponseAllOfDataMovementsBetweenStagesQueryParam count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetPipelineDealsMovementsStatisticsResponseAllOfDataMovementsBetweenStagesQueryParam {\n");

            sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
