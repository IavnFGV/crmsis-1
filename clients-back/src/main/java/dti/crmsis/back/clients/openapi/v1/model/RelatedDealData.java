package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.RelatedDealDataDEALID;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RelatedDealData  {

    private RelatedDealDataDEALID DEAL_ID;

    /**
    * Get DEAL_ID
    * @return DEAL_ID
    **/
    @JsonProperty("DEAL_ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RelatedDealDataDEALID getDEALID() {
        return DEAL_ID;
    }

    /**
     * Set DEAL_ID
     **/
    public void setDEALID(RelatedDealDataDEALID DEAL_ID) {
        this.DEAL_ID = DEAL_ID;
    }

    public RelatedDealData DEAL_ID(RelatedDealDataDEALID DEAL_ID) {
        this.DEAL_ID = DEAL_ID;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelatedDealData {\n");

        sb.append("    DEAL_ID: ").append(toIndentedString(DEAL_ID)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code RelatedDealData} object that
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

        RelatedDealData model = (RelatedDealData) obj;

        return java.util.Objects.equals(DEAL_ID, model.DEAL_ID);
    }

    /**
     * Returns a hash code for a {@code RelatedDealData}.
     *
     * @return a hash code value for a {@code RelatedDealData}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(DEAL_ID);
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
    public static class RelatedDealDataQueryParam  {

        @jakarta.ws.rs.QueryParam("DEAL_ID")
        private RelatedDealDataDEALID DEAL_ID;

        /**
        * Get DEAL_ID
        * @return DEAL_ID
        **/
        @JsonProperty("DEAL_ID")
        public RelatedDealDataDEALID getDEALID() {
            return DEAL_ID;
        }

        /**
         * Set DEAL_ID
         **/
        public void setDEALID(RelatedDealDataDEALID DEAL_ID) {
            this.DEAL_ID = DEAL_ID;
        }

        public RelatedDealDataQueryParam DEAL_ID(RelatedDealDataDEALID DEAL_ID) {
            this.DEAL_ID = DEAL_ID;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class RelatedDealDataQueryParam {\n");

            sb.append("    DEAL_ID: ").append(toIndentedString(DEAL_ID)).append("\n");
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
