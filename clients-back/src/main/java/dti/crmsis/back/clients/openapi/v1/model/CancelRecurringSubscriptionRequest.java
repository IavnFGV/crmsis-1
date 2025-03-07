package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class CancelRecurringSubscriptionRequest  {

    /**
      * The subscription termination date. All payments after the specified date will be deleted. The end_date of the subscription will be set to the due date of the payment to follow the specified date. Default value is the current date.
     **/
    private LocalDate endDate;

    /**
    * The subscription termination date. All payments after the specified date will be deleted. The end_date of the subscription will be set to the due date of the payment to follow the specified date. Default value is the current date.
    * @return endDate
    **/
    @JsonProperty("end_date")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * Set endDate
     **/
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public CancelRecurringSubscriptionRequest endDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelRecurringSubscriptionRequest {\n");

        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code CancelRecurringSubscriptionRequest} object that
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

        CancelRecurringSubscriptionRequest model = (CancelRecurringSubscriptionRequest) obj;

        return java.util.Objects.equals(endDate, model.endDate);
    }

    /**
     * Returns a hash code for a {@code CancelRecurringSubscriptionRequest}.
     *
     * @return a hash code value for a {@code CancelRecurringSubscriptionRequest}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(endDate);
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

    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class CancelRecurringSubscriptionRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("endDate")
        private LocalDate endDate;

        /**
        * The subscription termination date. All payments after the specified date will be deleted. The end_date of the subscription will be set to the due date of the payment to follow the specified date. Default value is the current date.
        * @return endDate
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("end_date")
        public LocalDate getEndDate() {
            return endDate;
        }

        /**
         * Set endDate
         **/
        public void setEndDate(LocalDate endDate) {
            this.endDate = endDate;
        }

        public CancelRecurringSubscriptionRequestQueryParam endDate(LocalDate endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CancelRecurringSubscriptionRequestQueryParam {\n");

            sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
