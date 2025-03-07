package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.ActivityDistributionItem;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The distribution of activities related to the organization grouped by the user ID
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class ActivityDistribution  {

    private ActivityDistributionItem ASSIGNED_TO_USER_ID;

    /**
    * Get ASSIGNED_TO_USER_ID
    * @return ASSIGNED_TO_USER_ID
    **/
    @JsonProperty("ASSIGNED_TO_USER_ID")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ActivityDistributionItem getASSIGNEDTOUSERID() {
        return ASSIGNED_TO_USER_ID;
    }

    /**
     * Set ASSIGNED_TO_USER_ID
     **/
    public void setASSIGNEDTOUSERID(ActivityDistributionItem ASSIGNED_TO_USER_ID) {
        this.ASSIGNED_TO_USER_ID = ASSIGNED_TO_USER_ID;
    }

    public ActivityDistribution ASSIGNED_TO_USER_ID(ActivityDistributionItem ASSIGNED_TO_USER_ID) {
        this.ASSIGNED_TO_USER_ID = ASSIGNED_TO_USER_ID;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActivityDistribution {\n");

        sb.append("    ASSIGNED_TO_USER_ID: ").append(toIndentedString(ASSIGNED_TO_USER_ID)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code ActivityDistribution} object that
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

        ActivityDistribution model = (ActivityDistribution) obj;

        return java.util.Objects.equals(ASSIGNED_TO_USER_ID, model.ASSIGNED_TO_USER_ID);
    }

    /**
     * Returns a hash code for a {@code ActivityDistribution}.
     *
     * @return a hash code value for a {@code ActivityDistribution}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(ASSIGNED_TO_USER_ID);
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
      * The distribution of activities related to the organization grouped by the user ID
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class ActivityDistributionQueryParam  {

        /**
          * The distribution of activities related to the organization grouped by the user ID
         **/
        @jakarta.ws.rs.QueryParam("ASSIGNED_TO_USER_ID")
        private ActivityDistributionItem ASSIGNED_TO_USER_ID;

        /**
        * Get ASSIGNED_TO_USER_ID
        * @return ASSIGNED_TO_USER_ID
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("ASSIGNED_TO_USER_ID")
        public ActivityDistributionItem getASSIGNEDTOUSERID() {
            return ASSIGNED_TO_USER_ID;
        }

        /**
         * Set ASSIGNED_TO_USER_ID
         **/
        public void setASSIGNEDTOUSERID(ActivityDistributionItem ASSIGNED_TO_USER_ID) {
            this.ASSIGNED_TO_USER_ID = ASSIGNED_TO_USER_ID;
        }

        public ActivityDistributionQueryParam ASSIGNED_TO_USER_ID(ActivityDistributionItem ASSIGNED_TO_USER_ID) {
            this.ASSIGNED_TO_USER_ID = ASSIGNED_TO_USER_ID;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ActivityDistributionQueryParam {\n");

            sb.append("    ASSIGNED_TO_USER_ID: ").append(toIndentedString(ASSIGNED_TO_USER_ID)).append("\n");
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
