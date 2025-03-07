package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.RoleSettings;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The additional data in the role
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetRoleResponseDataAdditionalData  {

    private RoleSettings settings;

    /**
    * Get settings
    * @return settings
    **/
    @JsonProperty("settings")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public RoleSettings getSettings() {
        return settings;
    }

    /**
     * Set settings
     **/
    public void setSettings(RoleSettings settings) {
        this.settings = settings;
    }

    public GetRoleResponseDataAdditionalData settings(RoleSettings settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetRoleResponseDataAdditionalData {\n");

        sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetRoleResponseDataAdditionalData} object that
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

        GetRoleResponseDataAdditionalData model = (GetRoleResponseDataAdditionalData) obj;

        return java.util.Objects.equals(settings, model.settings);
    }

    /**
     * Returns a hash code for a {@code GetRoleResponseDataAdditionalData}.
     *
     * @return a hash code value for a {@code GetRoleResponseDataAdditionalData}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(settings);
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
      * The additional data in the role
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetRoleResponseDataAdditionalDataQueryParam  {

        /**
          * The additional data in the role
         **/
        @jakarta.ws.rs.QueryParam("settings")
        private RoleSettings settings;

        /**
        * Get settings
        * @return settings
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("settings")
        public RoleSettings getSettings() {
            return settings;
        }

        /**
         * Set settings
         **/
        public void setSettings(RoleSettings settings) {
            this.settings = settings;
        }

        public GetRoleResponseDataAdditionalDataQueryParam settings(RoleSettings settings) {
            this.settings = settings;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetRoleResponseDataAdditionalDataQueryParam {\n");

            sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
