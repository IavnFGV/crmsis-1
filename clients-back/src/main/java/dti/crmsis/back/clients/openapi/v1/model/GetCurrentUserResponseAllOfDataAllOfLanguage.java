package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The user language details
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetCurrentUserResponseAllOfDataAllOfLanguage  {

    /**
      * The language code. E.g. en
     **/
    private String languageCode;
    /**
      * The country code. E.g. US
     **/
    private String countryCode;

    /**
    * The language code. E.g. en
    * @return languageCode
    **/
    @JsonProperty("language_code")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Set languageCode
     **/
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public GetCurrentUserResponseAllOfDataAllOfLanguage languageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
    * The country code. E.g. US
    * @return countryCode
    **/
    @JsonProperty("country_code")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Set countryCode
     **/
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public GetCurrentUserResponseAllOfDataAllOfLanguage countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetCurrentUserResponseAllOfDataAllOfLanguage {\n");

        sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
        sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetCurrentUserResponseAllOfDataAllOfLanguage} object that
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

        GetCurrentUserResponseAllOfDataAllOfLanguage model = (GetCurrentUserResponseAllOfDataAllOfLanguage) obj;

        return java.util.Objects.equals(languageCode, model.languageCode) &&
        java.util.Objects.equals(countryCode, model.countryCode);
    }

    /**
     * Returns a hash code for a {@code GetCurrentUserResponseAllOfDataAllOfLanguage}.
     *
     * @return a hash code value for a {@code GetCurrentUserResponseAllOfDataAllOfLanguage}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(languageCode,
        countryCode);
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
      * The user language details
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetCurrentUserResponseAllOfDataAllOfLanguageQueryParam  {

        /**
          * The user language details
         **/
        @jakarta.ws.rs.QueryParam("languageCode")
        private String languageCode;
        /**
          * The user language details
         **/
        @jakarta.ws.rs.QueryParam("countryCode")
        private String countryCode;

        /**
        * The language code. E.g. en
        * @return languageCode
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("language_code")
        public String getLanguageCode() {
            return languageCode;
        }

        /**
         * Set languageCode
         **/
        public void setLanguageCode(String languageCode) {
            this.languageCode = languageCode;
        }

        public GetCurrentUserResponseAllOfDataAllOfLanguageQueryParam languageCode(String languageCode) {
            this.languageCode = languageCode;
            return this;
        }

        /**
        * The country code. E.g. US
        * @return countryCode
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("country_code")
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * Set countryCode
         **/
        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public GetCurrentUserResponseAllOfDataAllOfLanguageQueryParam countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetCurrentUserResponseAllOfDataAllOfLanguageQueryParam {\n");

            sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
            sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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
