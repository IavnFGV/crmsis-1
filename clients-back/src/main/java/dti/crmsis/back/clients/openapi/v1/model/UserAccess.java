package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserAccess  {


    public enum AppEnum {
        SALES(String.valueOf("sales")), PROJECTS(String.valueOf("projects")), CAMPAIGNS(String.valueOf("campaigns")), GLOBAL(String.valueOf("global")), ACCOUNT_SETTINGS(String.valueOf("account_settings"));

        // caching enum access
        private static final java.util.EnumSet<AppEnum> values = java.util.EnumSet.allOf(AppEnum.class);

        String value;

        AppEnum (String v) {
            value = v;
        }

        @JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AppEnum fromString(String v) {
            for (AppEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private AppEnum app;
    private Boolean admin;
    private String permissionSetId;

    /**
    * Get app
    * @return app
    **/
    @JsonProperty("app")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AppEnum getApp() {
        return app;
    }

    /**
     * Set app
     **/
    public void setApp(AppEnum app) {
        this.app = app;
    }

    public UserAccess app(AppEnum app) {
        this.app = app;
        return this;
    }

    /**
    * Get admin
    * @return admin
    **/
    @JsonProperty("admin")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAdmin() {
        return admin;
    }

    /**
     * Set admin
     **/
    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public UserAccess admin(Boolean admin) {
        this.admin = admin;
        return this;
    }

    /**
    * Get permissionSetId
    * @return permissionSetId
    **/
    @JsonProperty("permission_set_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPermissionSetId() {
        return permissionSetId;
    }

    /**
     * Set permissionSetId
     **/
    public void setPermissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
    }

    public UserAccess permissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserAccess {\n");

        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
        sb.append("    permissionSetId: ").append(toIndentedString(permissionSetId)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code UserAccess} object that
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

        UserAccess model = (UserAccess) obj;

        return java.util.Objects.equals(app, model.app) &&
        java.util.Objects.equals(admin, model.admin) &&
        java.util.Objects.equals(permissionSetId, model.permissionSetId);
    }

    /**
     * Returns a hash code for a {@code UserAccess}.
     *
     * @return a hash code value for a {@code UserAccess}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(app,
        admin,
        permissionSetId);
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
    public static class UserAccessQueryParam  {


    public enum AppEnum {
        SALES(String.valueOf("sales")), PROJECTS(String.valueOf("projects")), CAMPAIGNS(String.valueOf("campaigns")), GLOBAL(String.valueOf("global")), ACCOUNT_SETTINGS(String.valueOf("account_settings"));

        // caching enum access
        private static final java.util.EnumSet<AppEnum> values = java.util.EnumSet.allOf(AppEnum.class);

        String value;

        AppEnum (String v) {
            value = v;
        }

        @JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AppEnum fromString(String v) {
            for (AppEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private AppEnum app;
        @jakarta.ws.rs.QueryParam("admin")
        private Boolean admin;
        @jakarta.ws.rs.QueryParam("permissionSetId")
        private String permissionSetId;

        /**
        * Get app
        * @return app
        **/
        @JsonProperty("app")
        public AppEnum getApp() {
            return app;
        }

        /**
         * Set app
         **/
        public void setApp(AppEnum app) {
            this.app = app;
        }

        public UserAccessQueryParam app(AppEnum app) {
            this.app = app;
            return this;
        }

        /**
        * Get admin
        * @return admin
        **/
        @JsonProperty("admin")
        public Boolean getAdmin() {
            return admin;
        }

        /**
         * Set admin
         **/
        public void setAdmin(Boolean admin) {
            this.admin = admin;
        }

        public UserAccessQueryParam admin(Boolean admin) {
            this.admin = admin;
            return this;
        }

        /**
        * Get permissionSetId
        * @return permissionSetId
        **/
        @JsonProperty("permission_set_id")
        public String getPermissionSetId() {
            return permissionSetId;
        }

        /**
         * Set permissionSetId
         **/
        public void setPermissionSetId(String permissionSetId) {
            this.permissionSetId = permissionSetId;
        }

        public UserAccessQueryParam permissionSetId(String permissionSetId) {
            this.permissionSetId = permissionSetId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class UserAccessQueryParam {\n");

            sb.append("    app: ").append(toIndentedString(app)).append("\n");
            sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
            sb.append("    permissionSetId: ").append(toIndentedString(permissionSetId)).append("\n");
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
