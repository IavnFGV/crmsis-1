package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.UserAccess1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddUserRequest  {

    /**
      * The email of the user
     **/
    private String email;
    /**
      * The access given to the user. Each item in the array represents access to a specific app. Optionally may include either admin flag or permission set ID to specify which access to give within the app. If both are omitted, the default access for the corresponding app will be used. It requires structure as follows: `[{ app: 'sales', permission_set_id: '62cc4d7f-4038-4352-abf3-a8c1c822b631' }, { app: 'global', admin: true }, { app: 'account_settings' }]` 
     **/
    private List<UserAccess1> access;
    /**
      * Whether the user is active or not. `false` = Not activated, `true` = Activated
     **/
    private Boolean activeFlag = true;

    /**
    * The email of the user
    * @return email
    **/
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * Set email
     **/
    public void setEmail(String email) {
        this.email = email;
    }

    public AddUserRequest email(String email) {
        this.email = email;
        return this;
    }

    /**
    * The access given to the user. Each item in the array represents access to a specific app. Optionally may include either admin flag or permission set ID to specify which access to give within the app. If both are omitted, the default access for the corresponding app will be used. It requires structure as follows: `[{ app: 'sales', permission_set_id: '62cc4d7f-4038-4352-abf3-a8c1c822b631' }, { app: 'global', admin: true }, { app: 'account_settings' }]` 
    * @return access
    **/
    @JsonProperty("access")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<UserAccess1> getAccess() {
        return access;
    }

    /**
     * Set access
     **/
    public void setAccess(List<UserAccess1> access) {
        this.access = access;
    }

    public AddUserRequest access(List<UserAccess1> access) {
        this.access = access;
        return this;
    }
    public AddUserRequest addAccessItem(UserAccess1 accessItem) {
        if (this.access == null){
            access = new ArrayList<>();
        }
        this.access.add(accessItem);
        return this;
    }

    /**
    * Whether the user is active or not. `false` = Not activated, `true` = Activated
    * @return activeFlag
    **/
    @JsonProperty("active_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getActiveFlag() {
        return activeFlag;
    }

    /**
     * Set activeFlag
     **/
    public void setActiveFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
    }

    public AddUserRequest activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddUserRequest {\n");

        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    access: ").append(toIndentedString(access)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddUserRequest} object that
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

        AddUserRequest model = (AddUserRequest) obj;

        return java.util.Objects.equals(email, model.email) &&
        java.util.Objects.equals(access, model.access) &&
        java.util.Objects.equals(activeFlag, model.activeFlag);
    }

    /**
     * Returns a hash code for a {@code AddUserRequest}.
     *
     * @return a hash code value for a {@code AddUserRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(email,
        access,
        activeFlag);
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
    public static class AddUserRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("email")
        private String email;
        @jakarta.ws.rs.QueryParam("access")
        private List<UserAccess1> access = null;
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag = true;

        /**
        * The email of the user
        * @return email
        **/
        @JsonProperty("email")
        public String getEmail() {
            return email;
        }

        /**
         * Set email
         **/
        public void setEmail(String email) {
            this.email = email;
        }

        public AddUserRequestQueryParam email(String email) {
            this.email = email;
            return this;
        }

        /**
        * The access given to the user. Each item in the array represents access to a specific app. Optionally may include either admin flag or permission set ID to specify which access to give within the app. If both are omitted, the default access for the corresponding app will be used. It requires structure as follows: `[{ app: 'sales', permission_set_id: '62cc4d7f-4038-4352-abf3-a8c1c822b631' }, { app: 'global', admin: true }, { app: 'account_settings' }]` 
        * @return access
        **/
        @JsonProperty("access")
        public List<UserAccess1> getAccess() {
            return access;
        }

        /**
         * Set access
         **/
        public void setAccess(List<UserAccess1> access) {
            this.access = access;
        }

        public AddUserRequestQueryParam access(List<UserAccess1> access) {
            this.access = access;
            return this;
        }
        public AddUserRequestQueryParam addAccessItem(UserAccess1 accessItem) {
            this.access.add(accessItem);
            return this;
        }

        /**
        * Whether the user is active or not. `false` = Not activated, `true` = Activated
        * @return activeFlag
        **/
        @JsonProperty("active_flag")
        public Boolean getActiveFlag() {
            return activeFlag;
        }

        /**
         * Set activeFlag
         **/
        public void setActiveFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
        }

        public AddUserRequestQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddUserRequestQueryParam {\n");

            sb.append("    email: ").append(toIndentedString(email)).append("\n");
            sb.append("    access: ").append(toIndentedString(access)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
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
