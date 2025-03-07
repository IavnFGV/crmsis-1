package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.PersonDataWithActiveFlag;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class AddActivityResponseRelatedObjectsPerson  {

    private PersonDataWithActiveFlag PERSON_ID;

    /**
    * Get PERSON_ID
    * @return PERSON_ID
    **/
    @JsonProperty("PERSON_ID")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PersonDataWithActiveFlag getPERSONID() {
        return PERSON_ID;
    }

    /**
     * Set PERSON_ID
     **/
    public void setPERSONID(PersonDataWithActiveFlag PERSON_ID) {
        this.PERSON_ID = PERSON_ID;
    }

    public AddActivityResponseRelatedObjectsPerson PERSON_ID(PersonDataWithActiveFlag PERSON_ID) {
        this.PERSON_ID = PERSON_ID;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddActivityResponseRelatedObjectsPerson {\n");

        sb.append("    PERSON_ID: ").append(toIndentedString(PERSON_ID)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddActivityResponseRelatedObjectsPerson} object that
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

        AddActivityResponseRelatedObjectsPerson model = (AddActivityResponseRelatedObjectsPerson) obj;

        return java.util.Objects.equals(PERSON_ID, model.PERSON_ID);
    }

    /**
     * Returns a hash code for a {@code AddActivityResponseRelatedObjectsPerson}.
     *
     * @return a hash code value for a {@code AddActivityResponseRelatedObjectsPerson}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(PERSON_ID);
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
    public static class AddActivityResponseRelatedObjectsPersonQueryParam  {

        @jakarta.ws.rs.QueryParam("PERSON_ID")
        private PersonDataWithActiveFlag PERSON_ID;

        /**
        * Get PERSON_ID
        * @return PERSON_ID
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("PERSON_ID")
        public PersonDataWithActiveFlag getPERSONID() {
            return PERSON_ID;
        }

        /**
         * Set PERSON_ID
         **/
        public void setPERSONID(PersonDataWithActiveFlag PERSON_ID) {
            this.PERSON_ID = PERSON_ID;
        }

        public AddActivityResponseRelatedObjectsPersonQueryParam PERSON_ID(PersonDataWithActiveFlag PERSON_ID) {
            this.PERSON_ID = PERSON_ID;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddActivityResponseRelatedObjectsPersonQueryParam {\n");

            sb.append("    PERSON_ID: ").append(toIndentedString(PERSON_ID)).append("\n");
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
