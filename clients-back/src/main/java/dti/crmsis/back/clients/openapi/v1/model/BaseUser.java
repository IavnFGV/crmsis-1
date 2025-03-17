package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.UserAccess;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseUser  {

    /**
      * The user ID
     **/
    private Integer id;
    /**
      * The user name
     **/
    private String name;
    /**
      * The user default currency
     **/
    private String defaultCurrency;
    /**
      * The user locale
     **/
    private String locale;
    /**
      * The user language ID
     **/
    private Integer lang;
    /**
      * The user email
     **/
    private String email;
    /**
      * The user phone
     **/
    private String phone;
    /**
      * Boolean that indicates whether the user is activated
     **/
    private Boolean activated;
    /**
      * The last login date and time of the user. Format: YYYY-MM-DD HH:MM:SS
     **/
    private String lastLogin;
    /**
      * The creation date and time of the user. Format: YYYY-MM-DD HH:MM:SS
     **/
    private String created;
    /**
      * The last modification date and time of the user. Format: YYYY-MM-DD HH:MM:SS
     **/
    private String modified;
    /**
      * Boolean that indicates whether the user has created a company
     **/
    private Boolean hasCreatedCompany;
    private List<UserAccess> access;
    /**
      * Boolean that indicates whether the user is activated
     **/
    private Boolean activeFlag;
    /**
      * The user timezone name
     **/
    private String timezoneName;
    /**
      * The user timezone offset
     **/
    private String timezoneOffset;
    /**
      * The ID of the user role
     **/
    private Integer roleId;
    /**
      * The user icon URL
     **/
    private String iconUrl;
    /**
      * Boolean that indicates if the requested user is the same which is logged in (in this case, always true)
     **/
    private Boolean isYou;
    /**
      * Boolean that indicates whether the user is deleted from the company
     **/
    private Boolean isDeleted;

    /**
    * The user ID
    * @return id
    **/
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(Integer id) {
        this.id = id;
    }

    public BaseUser id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The user name
    * @return name
    **/
    @JsonProperty("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public BaseUser name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The user default currency
    * @return defaultCurrency
    **/
    @JsonProperty("default_currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDefaultCurrency() {
        return defaultCurrency;
    }

    /**
     * Set defaultCurrency
     **/
    public void setDefaultCurrency(String defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public BaseUser defaultCurrency(String defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
        return this;
    }

    /**
    * The user locale
    * @return locale
    **/
    @JsonProperty("locale")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocale() {
        return locale;
    }

    /**
     * Set locale
     **/
    public void setLocale(String locale) {
        this.locale = locale;
    }

    public BaseUser locale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
    * The user language ID
    * @return lang
    **/
    @JsonProperty("lang")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getLang() {
        return lang;
    }

    /**
     * Set lang
     **/
    public void setLang(Integer lang) {
        this.lang = lang;
    }

    public BaseUser lang(Integer lang) {
        this.lang = lang;
        return this;
    }

    /**
    * The user email
    * @return email
    **/
    @JsonProperty("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmail() {
        return email;
    }

    /**
     * Set email
     **/
    public void setEmail(String email) {
        this.email = email;
    }

    public BaseUser email(String email) {
        this.email = email;
        return this;
    }

    /**
    * The user phone
    * @return phone
    **/
    @JsonProperty("phone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPhone() {
        return phone;
    }

    /**
     * Set phone
     **/
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BaseUser phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
    * Boolean that indicates whether the user is activated
    * @return activated
    **/
    @JsonProperty("activated")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getActivated() {
        return activated;
    }

    /**
     * Set activated
     **/
    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    public BaseUser activated(Boolean activated) {
        this.activated = activated;
        return this;
    }

    /**
    * The last login date and time of the user. Format: YYYY-MM-DD HH:MM:SS
    * @return lastLogin
    **/
    @JsonProperty("last_login")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastLogin() {
        return lastLogin;
    }

    /**
     * Set lastLogin
     **/
    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public BaseUser lastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
        return this;
    }

    /**
    * The creation date and time of the user. Format: YYYY-MM-DD HH:MM:SS
    * @return created
    **/
    @JsonProperty("created")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreated() {
        return created;
    }

    /**
     * Set created
     **/
    public void setCreated(String created) {
        this.created = created;
    }

    public BaseUser created(String created) {
        this.created = created;
        return this;
    }

    /**
    * The last modification date and time of the user. Format: YYYY-MM-DD HH:MM:SS
    * @return modified
    **/
    @JsonProperty("modified")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getModified() {
        return modified;
    }

    /**
     * Set modified
     **/
    public void setModified(String modified) {
        this.modified = modified;
    }

    public BaseUser modified(String modified) {
        this.modified = modified;
        return this;
    }

    /**
    * Boolean that indicates whether the user has created a company
    * @return hasCreatedCompany
    **/
    @JsonProperty("has_created_company")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getHasCreatedCompany() {
        return hasCreatedCompany;
    }

    /**
     * Set hasCreatedCompany
     **/
    public void setHasCreatedCompany(Boolean hasCreatedCompany) {
        this.hasCreatedCompany = hasCreatedCompany;
    }

    public BaseUser hasCreatedCompany(Boolean hasCreatedCompany) {
        this.hasCreatedCompany = hasCreatedCompany;
        return this;
    }

    /**
    * Get access
    * @return access
    **/
    @JsonProperty("access")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<UserAccess> getAccess() {
        return access;
    }

    /**
     * Set access
     **/
    public void setAccess(List<UserAccess> access) {
        this.access = access;
    }

    public BaseUser access(List<UserAccess> access) {
        this.access = access;
        return this;
    }
    public BaseUser addAccessItem(UserAccess accessItem) {
        if (this.access == null){
            access = new ArrayList<>();
        }
        this.access.add(accessItem);
        return this;
    }

    /**
    * Boolean that indicates whether the user is activated
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

    public BaseUser activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * The user timezone name
    * @return timezoneName
    **/
    @JsonProperty("timezone_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTimezoneName() {
        return timezoneName;
    }

    /**
     * Set timezoneName
     **/
    public void setTimezoneName(String timezoneName) {
        this.timezoneName = timezoneName;
    }

    public BaseUser timezoneName(String timezoneName) {
        this.timezoneName = timezoneName;
        return this;
    }

    /**
    * The user timezone offset
    * @return timezoneOffset
    **/
    @JsonProperty("timezone_offset")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTimezoneOffset() {
        return timezoneOffset;
    }

    /**
     * Set timezoneOffset
     **/
    public void setTimezoneOffset(String timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    public BaseUser timezoneOffset(String timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
        return this;
    }

    /**
    * The ID of the user role
    * @return roleId
    **/
    @JsonProperty("role_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * Set roleId
     **/
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public BaseUser roleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
    * The user icon URL
    * @return iconUrl
    **/
    @JsonProperty("icon_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * Set iconUrl
     **/
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public BaseUser iconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    /**
    * Boolean that indicates if the requested user is the same which is logged in (in this case, always true)
    * @return isYou
    **/
    @JsonProperty("is_you")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsYou() {
        return isYou;
    }

    /**
     * Set isYou
     **/
    public void setIsYou(Boolean isYou) {
        this.isYou = isYou;
    }

    public BaseUser isYou(Boolean isYou) {
        this.isYou = isYou;
        return this;
    }

    /**
    * Boolean that indicates whether the user is deleted from the company
    * @return isDeleted
    **/
    @JsonProperty("is_deleted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * Set isDeleted
     **/
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public BaseUser isDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaseUser {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    activated: ").append(toIndentedString(activated)).append("\n");
        sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
        sb.append("    hasCreatedCompany: ").append(toIndentedString(hasCreatedCompany)).append("\n");
        sb.append("    access: ").append(toIndentedString(access)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    timezoneName: ").append(toIndentedString(timezoneName)).append("\n");
        sb.append("    timezoneOffset: ").append(toIndentedString(timezoneOffset)).append("\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
        sb.append("    isYou: ").append(toIndentedString(isYou)).append("\n");
        sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code BaseUser} object that
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

        BaseUser model = (BaseUser) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(defaultCurrency, model.defaultCurrency) &&
        java.util.Objects.equals(locale, model.locale) &&
        java.util.Objects.equals(lang, model.lang) &&
        java.util.Objects.equals(email, model.email) &&
        java.util.Objects.equals(phone, model.phone) &&
        java.util.Objects.equals(activated, model.activated) &&
        java.util.Objects.equals(lastLogin, model.lastLogin) &&
        java.util.Objects.equals(created, model.created) &&
        java.util.Objects.equals(modified, model.modified) &&
        java.util.Objects.equals(hasCreatedCompany, model.hasCreatedCompany) &&
        java.util.Objects.equals(access, model.access) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(timezoneName, model.timezoneName) &&
        java.util.Objects.equals(timezoneOffset, model.timezoneOffset) &&
        java.util.Objects.equals(roleId, model.roleId) &&
        java.util.Objects.equals(iconUrl, model.iconUrl) &&
        java.util.Objects.equals(isYou, model.isYou) &&
        java.util.Objects.equals(isDeleted, model.isDeleted);
    }

    /**
     * Returns a hash code for a {@code BaseUser}.
     *
     * @return a hash code value for a {@code BaseUser}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        name,
        defaultCurrency,
        locale,
        lang,
        email,
        phone,
        activated,
        lastLogin,
        created,
        modified,
        hasCreatedCompany,
        access,
        activeFlag,
        timezoneName,
        timezoneOffset,
        roleId,
        iconUrl,
        isYou,
        isDeleted);
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
    public static class BaseUserQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("defaultCurrency")
        private String defaultCurrency;
        @jakarta.ws.rs.QueryParam("locale")
        private String locale;
        @jakarta.ws.rs.QueryParam("lang")
        private Integer lang;
        @jakarta.ws.rs.QueryParam("email")
        private String email;
        @jakarta.ws.rs.QueryParam("phone")
        private String phone;
        @jakarta.ws.rs.QueryParam("activated")
        private Boolean activated;
        @jakarta.ws.rs.QueryParam("lastLogin")
        private String lastLogin;
        @jakarta.ws.rs.QueryParam("created")
        private String created;
        @jakarta.ws.rs.QueryParam("modified")
        private String modified;
        @jakarta.ws.rs.QueryParam("hasCreatedCompany")
        private Boolean hasCreatedCompany;
        @jakarta.ws.rs.QueryParam("access")
        private List<UserAccess> access = null;
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        @jakarta.ws.rs.QueryParam("timezoneName")
        private String timezoneName;
        @jakarta.ws.rs.QueryParam("timezoneOffset")
        private String timezoneOffset;
        @jakarta.ws.rs.QueryParam("roleId")
        private Integer roleId;
        @jakarta.ws.rs.QueryParam("iconUrl")
        private String iconUrl;
        @jakarta.ws.rs.QueryParam("isYou")
        private Boolean isYou;
        @jakarta.ws.rs.QueryParam("isDeleted")
        private Boolean isDeleted;

        /**
        * The user ID
        * @return id
        **/
        @JsonProperty("id")
        public Integer getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(Integer id) {
            this.id = id;
        }

        public BaseUserQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The user name
        * @return name
        **/
        @JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public BaseUserQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The user default currency
        * @return defaultCurrency
        **/
        @JsonProperty("default_currency")
        public String getDefaultCurrency() {
            return defaultCurrency;
        }

        /**
         * Set defaultCurrency
         **/
        public void setDefaultCurrency(String defaultCurrency) {
            this.defaultCurrency = defaultCurrency;
        }

        public BaseUserQueryParam defaultCurrency(String defaultCurrency) {
            this.defaultCurrency = defaultCurrency;
            return this;
        }

        /**
        * The user locale
        * @return locale
        **/
        @JsonProperty("locale")
        public String getLocale() {
            return locale;
        }

        /**
         * Set locale
         **/
        public void setLocale(String locale) {
            this.locale = locale;
        }

        public BaseUserQueryParam locale(String locale) {
            this.locale = locale;
            return this;
        }

        /**
        * The user language ID
        * @return lang
        **/
        @JsonProperty("lang")
        public Integer getLang() {
            return lang;
        }

        /**
         * Set lang
         **/
        public void setLang(Integer lang) {
            this.lang = lang;
        }

        public BaseUserQueryParam lang(Integer lang) {
            this.lang = lang;
            return this;
        }

        /**
        * The user email
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

        public BaseUserQueryParam email(String email) {
            this.email = email;
            return this;
        }

        /**
        * The user phone
        * @return phone
        **/
        @JsonProperty("phone")
        public String getPhone() {
            return phone;
        }

        /**
         * Set phone
         **/
        public void setPhone(String phone) {
            this.phone = phone;
        }

        public BaseUserQueryParam phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
        * Boolean that indicates whether the user is activated
        * @return activated
        **/
        @JsonProperty("activated")
        public Boolean getActivated() {
            return activated;
        }

        /**
         * Set activated
         **/
        public void setActivated(Boolean activated) {
            this.activated = activated;
        }

        public BaseUserQueryParam activated(Boolean activated) {
            this.activated = activated;
            return this;
        }

        /**
        * The last login date and time of the user. Format: YYYY-MM-DD HH:MM:SS
        * @return lastLogin
        **/
        @JsonProperty("last_login")
        public String getLastLogin() {
            return lastLogin;
        }

        /**
         * Set lastLogin
         **/
        public void setLastLogin(String lastLogin) {
            this.lastLogin = lastLogin;
        }

        public BaseUserQueryParam lastLogin(String lastLogin) {
            this.lastLogin = lastLogin;
            return this;
        }

        /**
        * The creation date and time of the user. Format: YYYY-MM-DD HH:MM:SS
        * @return created
        **/
        @JsonProperty("created")
        public String getCreated() {
            return created;
        }

        /**
         * Set created
         **/
        public void setCreated(String created) {
            this.created = created;
        }

        public BaseUserQueryParam created(String created) {
            this.created = created;
            return this;
        }

        /**
        * The last modification date and time of the user. Format: YYYY-MM-DD HH:MM:SS
        * @return modified
        **/
        @JsonProperty("modified")
        public String getModified() {
            return modified;
        }

        /**
         * Set modified
         **/
        public void setModified(String modified) {
            this.modified = modified;
        }

        public BaseUserQueryParam modified(String modified) {
            this.modified = modified;
            return this;
        }

        /**
        * Boolean that indicates whether the user has created a company
        * @return hasCreatedCompany
        **/
        @JsonProperty("has_created_company")
        public Boolean getHasCreatedCompany() {
            return hasCreatedCompany;
        }

        /**
         * Set hasCreatedCompany
         **/
        public void setHasCreatedCompany(Boolean hasCreatedCompany) {
            this.hasCreatedCompany = hasCreatedCompany;
        }

        public BaseUserQueryParam hasCreatedCompany(Boolean hasCreatedCompany) {
            this.hasCreatedCompany = hasCreatedCompany;
            return this;
        }

        /**
        * Get access
        * @return access
        **/
        @JsonProperty("access")
        public List<UserAccess> getAccess() {
            return access;
        }

        /**
         * Set access
         **/
        public void setAccess(List<UserAccess> access) {
            this.access = access;
        }

        public BaseUserQueryParam access(List<UserAccess> access) {
            this.access = access;
            return this;
        }
        public BaseUserQueryParam addAccessItem(UserAccess accessItem) {
            this.access.add(accessItem);
            return this;
        }

        /**
        * Boolean that indicates whether the user is activated
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

        public BaseUserQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * The user timezone name
        * @return timezoneName
        **/
        @JsonProperty("timezone_name")
        public String getTimezoneName() {
            return timezoneName;
        }

        /**
         * Set timezoneName
         **/
        public void setTimezoneName(String timezoneName) {
            this.timezoneName = timezoneName;
        }

        public BaseUserQueryParam timezoneName(String timezoneName) {
            this.timezoneName = timezoneName;
            return this;
        }

        /**
        * The user timezone offset
        * @return timezoneOffset
        **/
        @JsonProperty("timezone_offset")
        public String getTimezoneOffset() {
            return timezoneOffset;
        }

        /**
         * Set timezoneOffset
         **/
        public void setTimezoneOffset(String timezoneOffset) {
            this.timezoneOffset = timezoneOffset;
        }

        public BaseUserQueryParam timezoneOffset(String timezoneOffset) {
            this.timezoneOffset = timezoneOffset;
            return this;
        }

        /**
        * The ID of the user role
        * @return roleId
        **/
        @JsonProperty("role_id")
        public Integer getRoleId() {
            return roleId;
        }

        /**
         * Set roleId
         **/
        public void setRoleId(Integer roleId) {
            this.roleId = roleId;
        }

        public BaseUserQueryParam roleId(Integer roleId) {
            this.roleId = roleId;
            return this;
        }

        /**
        * The user icon URL
        * @return iconUrl
        **/
        @JsonProperty("icon_url")
        public String getIconUrl() {
            return iconUrl;
        }

        /**
         * Set iconUrl
         **/
        public void setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
        }

        public BaseUserQueryParam iconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }

        /**
        * Boolean that indicates if the requested user is the same which is logged in (in this case, always true)
        * @return isYou
        **/
        @JsonProperty("is_you")
        public Boolean getIsYou() {
            return isYou;
        }

        /**
         * Set isYou
         **/
        public void setIsYou(Boolean isYou) {
            this.isYou = isYou;
        }

        public BaseUserQueryParam isYou(Boolean isYou) {
            this.isYou = isYou;
            return this;
        }

        /**
        * Boolean that indicates whether the user is deleted from the company
        * @return isDeleted
        **/
        @JsonProperty("is_deleted")
        public Boolean getIsDeleted() {
            return isDeleted;
        }

        /**
         * Set isDeleted
         **/
        public void setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
        }

        public BaseUserQueryParam isDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class BaseUserQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
            sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
            sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
            sb.append("    email: ").append(toIndentedString(email)).append("\n");
            sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
            sb.append("    activated: ").append(toIndentedString(activated)).append("\n");
            sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
            sb.append("    created: ").append(toIndentedString(created)).append("\n");
            sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
            sb.append("    hasCreatedCompany: ").append(toIndentedString(hasCreatedCompany)).append("\n");
            sb.append("    access: ").append(toIndentedString(access)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    timezoneName: ").append(toIndentedString(timezoneName)).append("\n");
            sb.append("    timezoneOffset: ").append(toIndentedString(timezoneOffset)).append("\n");
            sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
            sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
            sb.append("    isYou: ").append(toIndentedString(isYou)).append("\n");
            sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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
