package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetPersonProductsResponseAllOfDataInnerDEALID;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetPersonProductsResponseAllOfDataInner  {

    private GetPersonProductsResponseAllOfDataInnerDEALID DEAL_ID;

    /**
    * Get DEAL_ID
    * @return DEAL_ID
    **/
    @JsonProperty("DEAL_ID")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetPersonProductsResponseAllOfDataInnerDEALID getDEALID() {
        return DEAL_ID;
    }

    /**
     * Set DEAL_ID
     **/
    public void setDEALID(GetPersonProductsResponseAllOfDataInnerDEALID DEAL_ID) {
        this.DEAL_ID = DEAL_ID;
    }

    public GetPersonProductsResponseAllOfDataInner DEAL_ID(GetPersonProductsResponseAllOfDataInnerDEALID DEAL_ID) {
        this.DEAL_ID = DEAL_ID;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPersonProductsResponseAllOfDataInner {\n");

        sb.append("    DEAL_ID: ").append(toIndentedString(DEAL_ID)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetPersonProductsResponseAllOfDataInner} object that
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

        GetPersonProductsResponseAllOfDataInner model = (GetPersonProductsResponseAllOfDataInner) obj;

        return java.util.Objects.equals(DEAL_ID, model.DEAL_ID);
    }

    /**
     * Returns a hash code for a {@code GetPersonProductsResponseAllOfDataInner}.
     *
     * @return a hash code value for a {@code GetPersonProductsResponseAllOfDataInner}.
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

    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetPersonProductsResponseAllOfDataInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("DEAL_ID")
        private GetPersonProductsResponseAllOfDataInnerDEALID DEAL_ID;

        /**
        * Get DEAL_ID
        * @return DEAL_ID
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("DEAL_ID")
        public GetPersonProductsResponseAllOfDataInnerDEALID getDEALID() {
            return DEAL_ID;
        }

        /**
         * Set DEAL_ID
         **/
        public void setDEALID(GetPersonProductsResponseAllOfDataInnerDEALID DEAL_ID) {
            this.DEAL_ID = DEAL_ID;
        }

        public GetPersonProductsResponseAllOfDataInnerQueryParam DEAL_ID(GetPersonProductsResponseAllOfDataInnerDEALID DEAL_ID) {
            this.DEAL_ID = DEAL_ID;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetPersonProductsResponseAllOfDataInnerQueryParam {\n");

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
