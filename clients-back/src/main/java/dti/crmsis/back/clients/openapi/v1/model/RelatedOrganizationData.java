package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.OrganizationDataWithId;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class RelatedOrganizationData  {

    private OrganizationDataWithId ORGANIZATION_ID;

    /**
    * Get ORGANIZATION_ID
    * @return ORGANIZATION_ID
    **/
    @JsonProperty("ORGANIZATION_ID")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public OrganizationDataWithId getORGANIZATIONID() {
        return ORGANIZATION_ID;
    }

    /**
     * Set ORGANIZATION_ID
     **/
    public void setORGANIZATIONID(OrganizationDataWithId ORGANIZATION_ID) {
        this.ORGANIZATION_ID = ORGANIZATION_ID;
    }

    public RelatedOrganizationData ORGANIZATION_ID(OrganizationDataWithId ORGANIZATION_ID) {
        this.ORGANIZATION_ID = ORGANIZATION_ID;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelatedOrganizationData {\n");

        sb.append("    ORGANIZATION_ID: ").append(toIndentedString(ORGANIZATION_ID)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code RelatedOrganizationData} object that
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

        RelatedOrganizationData model = (RelatedOrganizationData) obj;

        return java.util.Objects.equals(ORGANIZATION_ID, model.ORGANIZATION_ID);
    }

    /**
     * Returns a hash code for a {@code RelatedOrganizationData}.
     *
     * @return a hash code value for a {@code RelatedOrganizationData}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(ORGANIZATION_ID);
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
    public static class RelatedOrganizationDataQueryParam  {

        @jakarta.ws.rs.QueryParam("ORGANIZATION_ID")
        private OrganizationDataWithId ORGANIZATION_ID;

        /**
        * Get ORGANIZATION_ID
        * @return ORGANIZATION_ID
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("ORGANIZATION_ID")
        public OrganizationDataWithId getORGANIZATIONID() {
            return ORGANIZATION_ID;
        }

        /**
         * Set ORGANIZATION_ID
         **/
        public void setORGANIZATIONID(OrganizationDataWithId ORGANIZATION_ID) {
            this.ORGANIZATION_ID = ORGANIZATION_ID;
        }

        public RelatedOrganizationDataQueryParam ORGANIZATION_ID(OrganizationDataWithId ORGANIZATION_ID) {
            this.ORGANIZATION_ID = ORGANIZATION_ID;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class RelatedOrganizationDataQueryParam {\n");

            sb.append("    ORGANIZATION_ID: ").append(toIndentedString(ORGANIZATION_ID)).append("\n");
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
