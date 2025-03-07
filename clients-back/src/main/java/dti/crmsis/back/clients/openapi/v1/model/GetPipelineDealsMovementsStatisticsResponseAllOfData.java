package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDays;
import dti.crmsis.back.clients.openapi.v1.model.GetPipelineDealsMovementsStatisticsResponseAllOfDataMovementsBetweenStages;
import dti.crmsis.back.clients.openapi.v1.model.GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The pipeline object
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetPipelineDealsMovementsStatisticsResponseAllOfData  {

    private GetPipelineDealsMovementsStatisticsResponseAllOfDataMovementsBetweenStages movementsBetweenStages;
    private GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals newDeals;
    private GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals dealsLeftOpen;
    private GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals wonDeals;
    private GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals lostDeals;
    private GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDays averageAgeInDays;

    /**
    * Get movementsBetweenStages
    * @return movementsBetweenStages
    **/
    @JsonProperty("movements_between_stages")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetPipelineDealsMovementsStatisticsResponseAllOfDataMovementsBetweenStages getMovementsBetweenStages() {
        return movementsBetweenStages;
    }

    /**
     * Set movementsBetweenStages
     **/
    public void setMovementsBetweenStages(GetPipelineDealsMovementsStatisticsResponseAllOfDataMovementsBetweenStages movementsBetweenStages) {
        this.movementsBetweenStages = movementsBetweenStages;
    }

    public GetPipelineDealsMovementsStatisticsResponseAllOfData movementsBetweenStages(GetPipelineDealsMovementsStatisticsResponseAllOfDataMovementsBetweenStages movementsBetweenStages) {
        this.movementsBetweenStages = movementsBetweenStages;
        return this;
    }

    /**
    * Get newDeals
    * @return newDeals
    **/
    @JsonProperty("new_deals")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals getNewDeals() {
        return newDeals;
    }

    /**
     * Set newDeals
     **/
    public void setNewDeals(GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals newDeals) {
        this.newDeals = newDeals;
    }

    public GetPipelineDealsMovementsStatisticsResponseAllOfData newDeals(GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals newDeals) {
        this.newDeals = newDeals;
        return this;
    }

    /**
    * Get dealsLeftOpen
    * @return dealsLeftOpen
    **/
    @JsonProperty("deals_left_open")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals getDealsLeftOpen() {
        return dealsLeftOpen;
    }

    /**
     * Set dealsLeftOpen
     **/
    public void setDealsLeftOpen(GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals dealsLeftOpen) {
        this.dealsLeftOpen = dealsLeftOpen;
    }

    public GetPipelineDealsMovementsStatisticsResponseAllOfData dealsLeftOpen(GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals dealsLeftOpen) {
        this.dealsLeftOpen = dealsLeftOpen;
        return this;
    }

    /**
    * Get wonDeals
    * @return wonDeals
    **/
    @JsonProperty("won_deals")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals getWonDeals() {
        return wonDeals;
    }

    /**
     * Set wonDeals
     **/
    public void setWonDeals(GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals wonDeals) {
        this.wonDeals = wonDeals;
    }

    public GetPipelineDealsMovementsStatisticsResponseAllOfData wonDeals(GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals wonDeals) {
        this.wonDeals = wonDeals;
        return this;
    }

    /**
    * Get lostDeals
    * @return lostDeals
    **/
    @JsonProperty("lost_deals")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals getLostDeals() {
        return lostDeals;
    }

    /**
     * Set lostDeals
     **/
    public void setLostDeals(GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals lostDeals) {
        this.lostDeals = lostDeals;
    }

    public GetPipelineDealsMovementsStatisticsResponseAllOfData lostDeals(GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals lostDeals) {
        this.lostDeals = lostDeals;
        return this;
    }

    /**
    * Get averageAgeInDays
    * @return averageAgeInDays
    **/
    @JsonProperty("average_age_in_days")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDays getAverageAgeInDays() {
        return averageAgeInDays;
    }

    /**
     * Set averageAgeInDays
     **/
    public void setAverageAgeInDays(GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDays averageAgeInDays) {
        this.averageAgeInDays = averageAgeInDays;
    }

    public GetPipelineDealsMovementsStatisticsResponseAllOfData averageAgeInDays(GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDays averageAgeInDays) {
        this.averageAgeInDays = averageAgeInDays;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPipelineDealsMovementsStatisticsResponseAllOfData {\n");

        sb.append("    movementsBetweenStages: ").append(toIndentedString(movementsBetweenStages)).append("\n");
        sb.append("    newDeals: ").append(toIndentedString(newDeals)).append("\n");
        sb.append("    dealsLeftOpen: ").append(toIndentedString(dealsLeftOpen)).append("\n");
        sb.append("    wonDeals: ").append(toIndentedString(wonDeals)).append("\n");
        sb.append("    lostDeals: ").append(toIndentedString(lostDeals)).append("\n");
        sb.append("    averageAgeInDays: ").append(toIndentedString(averageAgeInDays)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetPipelineDealsMovementsStatisticsResponseAllOfData} object that
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

        GetPipelineDealsMovementsStatisticsResponseAllOfData model = (GetPipelineDealsMovementsStatisticsResponseAllOfData) obj;

        return java.util.Objects.equals(movementsBetweenStages, model.movementsBetweenStages) &&
        java.util.Objects.equals(newDeals, model.newDeals) &&
        java.util.Objects.equals(dealsLeftOpen, model.dealsLeftOpen) &&
        java.util.Objects.equals(wonDeals, model.wonDeals) &&
        java.util.Objects.equals(lostDeals, model.lostDeals) &&
        java.util.Objects.equals(averageAgeInDays, model.averageAgeInDays);
    }

    /**
     * Returns a hash code for a {@code GetPipelineDealsMovementsStatisticsResponseAllOfData}.
     *
     * @return a hash code value for a {@code GetPipelineDealsMovementsStatisticsResponseAllOfData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(movementsBetweenStages,
        newDeals,
        dealsLeftOpen,
        wonDeals,
        lostDeals,
        averageAgeInDays);
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
      * The pipeline object
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetPipelineDealsMovementsStatisticsResponseAllOfDataQueryParam  {

        /**
          * The pipeline object
         **/
        @jakarta.ws.rs.QueryParam("movementsBetweenStages")
        private GetPipelineDealsMovementsStatisticsResponseAllOfDataMovementsBetweenStages movementsBetweenStages;
        /**
          * The pipeline object
         **/
        @jakarta.ws.rs.QueryParam("newDeals")
        private GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals newDeals;
        /**
          * The pipeline object
         **/
        @jakarta.ws.rs.QueryParam("dealsLeftOpen")
        private GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals dealsLeftOpen;
        /**
          * The pipeline object
         **/
        @jakarta.ws.rs.QueryParam("wonDeals")
        private GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals wonDeals;
        /**
          * The pipeline object
         **/
        @jakarta.ws.rs.QueryParam("lostDeals")
        private GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals lostDeals;
        /**
          * The pipeline object
         **/
        @jakarta.ws.rs.QueryParam("averageAgeInDays")
        private GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDays averageAgeInDays;

        /**
        * Get movementsBetweenStages
        * @return movementsBetweenStages
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("movements_between_stages")
        public GetPipelineDealsMovementsStatisticsResponseAllOfDataMovementsBetweenStages getMovementsBetweenStages() {
            return movementsBetweenStages;
        }

        /**
         * Set movementsBetweenStages
         **/
        public void setMovementsBetweenStages(GetPipelineDealsMovementsStatisticsResponseAllOfDataMovementsBetweenStages movementsBetweenStages) {
            this.movementsBetweenStages = movementsBetweenStages;
        }

        public GetPipelineDealsMovementsStatisticsResponseAllOfDataQueryParam movementsBetweenStages(GetPipelineDealsMovementsStatisticsResponseAllOfDataMovementsBetweenStages movementsBetweenStages) {
            this.movementsBetweenStages = movementsBetweenStages;
            return this;
        }

        /**
        * Get newDeals
        * @return newDeals
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("new_deals")
        public GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals getNewDeals() {
            return newDeals;
        }

        /**
         * Set newDeals
         **/
        public void setNewDeals(GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals newDeals) {
            this.newDeals = newDeals;
        }

        public GetPipelineDealsMovementsStatisticsResponseAllOfDataQueryParam newDeals(GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals newDeals) {
            this.newDeals = newDeals;
            return this;
        }

        /**
        * Get dealsLeftOpen
        * @return dealsLeftOpen
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("deals_left_open")
        public GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals getDealsLeftOpen() {
            return dealsLeftOpen;
        }

        /**
         * Set dealsLeftOpen
         **/
        public void setDealsLeftOpen(GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals dealsLeftOpen) {
            this.dealsLeftOpen = dealsLeftOpen;
        }

        public GetPipelineDealsMovementsStatisticsResponseAllOfDataQueryParam dealsLeftOpen(GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals dealsLeftOpen) {
            this.dealsLeftOpen = dealsLeftOpen;
            return this;
        }

        /**
        * Get wonDeals
        * @return wonDeals
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("won_deals")
        public GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals getWonDeals() {
            return wonDeals;
        }

        /**
         * Set wonDeals
         **/
        public void setWonDeals(GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals wonDeals) {
            this.wonDeals = wonDeals;
        }

        public GetPipelineDealsMovementsStatisticsResponseAllOfDataQueryParam wonDeals(GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals wonDeals) {
            this.wonDeals = wonDeals;
            return this;
        }

        /**
        * Get lostDeals
        * @return lostDeals
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("lost_deals")
        public GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals getLostDeals() {
            return lostDeals;
        }

        /**
         * Set lostDeals
         **/
        public void setLostDeals(GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals lostDeals) {
            this.lostDeals = lostDeals;
        }

        public GetPipelineDealsMovementsStatisticsResponseAllOfDataQueryParam lostDeals(GetPipelineDealsMovementsStatisticsResponseAllOfDataNewDeals lostDeals) {
            this.lostDeals = lostDeals;
            return this;
        }

        /**
        * Get averageAgeInDays
        * @return averageAgeInDays
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("average_age_in_days")
        public GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDays getAverageAgeInDays() {
            return averageAgeInDays;
        }

        /**
         * Set averageAgeInDays
         **/
        public void setAverageAgeInDays(GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDays averageAgeInDays) {
            this.averageAgeInDays = averageAgeInDays;
        }

        public GetPipelineDealsMovementsStatisticsResponseAllOfDataQueryParam averageAgeInDays(GetPipelineDealsMovementsStatisticsResponseAllOfDataAverageAgeInDays averageAgeInDays) {
            this.averageAgeInDays = averageAgeInDays;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetPipelineDealsMovementsStatisticsResponseAllOfDataQueryParam {\n");

            sb.append("    movementsBetweenStages: ").append(toIndentedString(movementsBetweenStages)).append("\n");
            sb.append("    newDeals: ").append(toIndentedString(newDeals)).append("\n");
            sb.append("    dealsLeftOpen: ").append(toIndentedString(dealsLeftOpen)).append("\n");
            sb.append("    wonDeals: ").append(toIndentedString(wonDeals)).append("\n");
            sb.append("    lostDeals: ").append(toIndentedString(lostDeals)).append("\n");
            sb.append("    averageAgeInDays: ").append(toIndentedString(averageAgeInDays)).append("\n");
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
