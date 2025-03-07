package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class PersonAllOfPhoneInner  {

    /**
      * The phone number
     **/
    private String value;
    /**
      * Boolean that indicates if phone number is primary for the person or not
     **/
    private Boolean primary;
    /**
      * The label that indicates the type of the phone number. (Possible values - work, home, mobile or other)
     **/
    private String label;

    /**
    * The phone number
    * @return value
    **/
    @JsonProperty("value")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getValue() {
        return value;
    }

    /**
     * Set value
     **/
    public void setValue(String value) {
        this.value = value;
    }

    public PersonAllOfPhoneInner value(String value) {
        this.value = value;
        return this;
    }

    /**
    * Boolean that indicates if phone number is primary for the person or not
    * @return primary
    **/
    @JsonProperty("primary")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getPrimary() {
        return primary;
    }

    /**
     * Set primary
     **/
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    public PersonAllOfPhoneInner primary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
    * The label that indicates the type of the phone number. (Possible values - work, home, mobile or other)
    * @return label
    **/
    @JsonProperty("label")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLabel() {
        return label;
    }

    /**
     * Set label
     **/
    public void setLabel(String label) {
        this.label = label;
    }

    public PersonAllOfPhoneInner label(String label) {
        this.label = label;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersonAllOfPhoneInner {\n");

        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code PersonAllOfPhoneInner} object that
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

        PersonAllOfPhoneInner model = (PersonAllOfPhoneInner) obj;

        return java.util.Objects.equals(value, model.value) &&
        java.util.Objects.equals(primary, model.primary) &&
        java.util.Objects.equals(label, model.label);
    }

    /**
     * Returns a hash code for a {@code PersonAllOfPhoneInner}.
     *
     * @return a hash code value for a {@code PersonAllOfPhoneInner}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value,
        primary,
        label);
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
    public static class PersonAllOfPhoneInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("value")
        private String value;
        @jakarta.ws.rs.QueryParam("primary")
        private Boolean primary;
        @jakarta.ws.rs.QueryParam("label")
        private String label;

        /**
        * The phone number
        * @return value
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        public String getValue() {
            return value;
        }

        /**
         * Set value
         **/
        public void setValue(String value) {
            this.value = value;
        }

        public PersonAllOfPhoneInnerQueryParam value(String value) {
            this.value = value;
            return this;
        }

        /**
        * Boolean that indicates if phone number is primary for the person or not
        * @return primary
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("primary")
        public Boolean getPrimary() {
            return primary;
        }

        /**
         * Set primary
         **/
        public void setPrimary(Boolean primary) {
            this.primary = primary;
        }

        public PersonAllOfPhoneInnerQueryParam primary(Boolean primary) {
            this.primary = primary;
            return this;
        }

        /**
        * The label that indicates the type of the phone number. (Possible values - work, home, mobile or other)
        * @return label
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("label")
        public String getLabel() {
            return label;
        }

        /**
         * Set label
         **/
        public void setLabel(String label) {
            this.label = label;
        }

        public PersonAllOfPhoneInnerQueryParam label(String label) {
            this.label = label;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PersonAllOfPhoneInnerQueryParam {\n");

            sb.append("    value: ").append(toIndentedString(value)).append("\n");
            sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
            sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
