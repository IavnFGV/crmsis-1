package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The details of the duration of the deal being in each stage of the pipeline
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class DealNonStrictWithDetailsAllOfStayInPipelineStages  {

    /**
      * The number of seconds a deal has been in each stage of the pipeline
     **/
    private Object timesInStages;
    /**
      * The order of the deal progression through the pipeline stages
     **/
    private List<Integer> orderOfStages;

    /**
    * The number of seconds a deal has been in each stage of the pipeline
    * @return timesInStages
    **/
    @JsonProperty("times_in_stages")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Object getTimesInStages() {
        return timesInStages;
    }

    /**
     * Set timesInStages
     **/
    public void setTimesInStages(Object timesInStages) {
        this.timesInStages = timesInStages;
    }

    public DealNonStrictWithDetailsAllOfStayInPipelineStages timesInStages(Object timesInStages) {
        this.timesInStages = timesInStages;
        return this;
    }

    /**
    * The order of the deal progression through the pipeline stages
    * @return orderOfStages
    **/
    @JsonProperty("order_of_stages")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Integer> getOrderOfStages() {
        return orderOfStages;
    }

    /**
     * Set orderOfStages
     **/
    public void setOrderOfStages(List<Integer> orderOfStages) {
        this.orderOfStages = orderOfStages;
    }

    public DealNonStrictWithDetailsAllOfStayInPipelineStages orderOfStages(List<Integer> orderOfStages) {
        this.orderOfStages = orderOfStages;
        return this;
    }
    public DealNonStrictWithDetailsAllOfStayInPipelineStages addOrderOfStagesItem(Integer orderOfStagesItem) {
        if (this.orderOfStages == null){
            orderOfStages = new ArrayList<>();
        }
        this.orderOfStages.add(orderOfStagesItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DealNonStrictWithDetailsAllOfStayInPipelineStages {\n");

        sb.append("    timesInStages: ").append(toIndentedString(timesInStages)).append("\n");
        sb.append("    orderOfStages: ").append(toIndentedString(orderOfStages)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code DealNonStrictWithDetailsAllOfStayInPipelineStages} object that
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

        DealNonStrictWithDetailsAllOfStayInPipelineStages model = (DealNonStrictWithDetailsAllOfStayInPipelineStages) obj;

        return java.util.Objects.equals(timesInStages, model.timesInStages) &&
        java.util.Objects.equals(orderOfStages, model.orderOfStages);
    }

    /**
     * Returns a hash code for a {@code DealNonStrictWithDetailsAllOfStayInPipelineStages}.
     *
     * @return a hash code value for a {@code DealNonStrictWithDetailsAllOfStayInPipelineStages}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(timesInStages,
        orderOfStages);
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
      * The details of the duration of the deal being in each stage of the pipeline
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class DealNonStrictWithDetailsAllOfStayInPipelineStagesQueryParam  {

        /**
          * The details of the duration of the deal being in each stage of the pipeline
         **/
        @jakarta.ws.rs.QueryParam("timesInStages")
        private Object timesInStages;
        /**
          * The details of the duration of the deal being in each stage of the pipeline
         **/
        @jakarta.ws.rs.QueryParam("orderOfStages")
        private List<Integer> orderOfStages = null;

        /**
        * The number of seconds a deal has been in each stage of the pipeline
        * @return timesInStages
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("times_in_stages")
        public Object getTimesInStages() {
            return timesInStages;
        }

        /**
         * Set timesInStages
         **/
        public void setTimesInStages(Object timesInStages) {
            this.timesInStages = timesInStages;
        }

        public DealNonStrictWithDetailsAllOfStayInPipelineStagesQueryParam timesInStages(Object timesInStages) {
            this.timesInStages = timesInStages;
            return this;
        }

        /**
        * The order of the deal progression through the pipeline stages
        * @return orderOfStages
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("order_of_stages")
        public List<Integer> getOrderOfStages() {
            return orderOfStages;
        }

        /**
         * Set orderOfStages
         **/
        public void setOrderOfStages(List<Integer> orderOfStages) {
            this.orderOfStages = orderOfStages;
        }

        public DealNonStrictWithDetailsAllOfStayInPipelineStagesQueryParam orderOfStages(List<Integer> orderOfStages) {
            this.orderOfStages = orderOfStages;
            return this;
        }
        public DealNonStrictWithDetailsAllOfStayInPipelineStagesQueryParam addOrderOfStagesItem(Integer orderOfStagesItem) {
            this.orderOfStages.add(orderOfStagesItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DealNonStrictWithDetailsAllOfStayInPipelineStagesQueryParam {\n");

            sb.append("    timesInStages: ").append(toIndentedString(timesInStages)).append("\n");
            sb.append("    orderOfStages: ").append(toIndentedString(orderOfStages)).append("\n");
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
