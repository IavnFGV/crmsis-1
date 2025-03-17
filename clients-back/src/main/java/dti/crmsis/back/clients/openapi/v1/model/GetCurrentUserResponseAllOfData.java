package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetCurrentUserResponseAllOfDataAllOfLanguage;
import dti.crmsis.back.clients.openapi.v1.model.UserAccess;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetCurrentUserResponseAllOfData  {

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
      * The user company ID
     **/
    private Integer companyId;
    /**
      * The user company name
     **/
    private String companyName;
    /**
      * The user company domain
     **/
    private String companyDomain;
    /**
      * The user company country
     **/
    private String companyCountry;
    /**
      * The user company industry
     **/
    private String companyIndustry;
    private GetCurrentUserResponseAllOfDataAllOfLanguage language;

    /**
    * The user ID
    * @return id
    **/
    @JsonProperty("id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(Integer id) {
        this.id = id;
    }

    public GetCurrentUserResponseAllOfData id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The user name
    * @return name
    **/
    @JsonProperty("name")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public GetCurrentUserResponseAllOfData name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The user default currency
    * @return defaultCurrency
    **/
    @JsonProperty("default_currency")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDefaultCurrency() {
        return defaultCurrency;
    }

    /**
     * Set defaultCurrency
     **/
    public void setDefaultCurrency(String defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public GetCurrentUserResponseAllOfData defaultCurrency(String defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
        return this;
    }

    /**
    * The user locale
    * @return locale
    **/
    @JsonProperty("locale")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLocale() {
        return locale;
    }

    /**
     * Set locale
     **/
    public void setLocale(String locale) {
        this.locale = locale;
    }

    public GetCurrentUserResponseAllOfData locale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
    * The user language ID
    * @return lang
    **/
    @JsonProperty("lang")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getLang() {
        return lang;
    }

    /**
     * Set lang
     **/
    public void setLang(Integer lang) {
        this.lang = lang;
    }

    public GetCurrentUserResponseAllOfData lang(Integer lang) {
        this.lang = lang;
        return this;
    }

    /**
    * The user email
    * @return email
    **/
    @JsonProperty("email")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getEmail() {
        return email;
    }

    /**
     * Set email
     **/
    public void setEmail(String email) {
        this.email = email;
    }

    public GetCurrentUserResponseAllOfData email(String email) {
        this.email = email;
        return this;
    }

    /**
    * The user phone
    * @return phone
    **/
    @JsonProperty("phone")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPhone() {
        return phone;
    }

    /**
     * Set phone
     **/
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public GetCurrentUserResponseAllOfData phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
    * Boolean that indicates whether the user is activated
    * @return activated
    **/
    @JsonProperty("activated")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getActivated() {
        return activated;
    }

    /**
     * Set activated
     **/
    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    public GetCurrentUserResponseAllOfData activated(Boolean activated) {
        this.activated = activated;
        return this;
    }

    /**
    * The last login date and time of the user. Format: YYYY-MM-DD HH:MM:SS
    * @return lastLogin
    **/
    @JsonProperty("last_login")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLastLogin() {
        return lastLogin;
    }

    /**
     * Set lastLogin
     **/
    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public GetCurrentUserResponseAllOfData lastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
        return this;
    }

    /**
    * The creation date and time of the user. Format: YYYY-MM-DD HH:MM:SS
    * @return created
    **/
    @JsonProperty("created")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getCreated() {
        return created;
    }

    /**
     * Set created
     **/
    public void setCreated(String created) {
        this.created = created;
    }

    public GetCurrentUserResponseAllOfData created(String created) {
        this.created = created;
        return this;
    }

    /**
    * The last modification date and time of the user. Format: YYYY-MM-DD HH:MM:SS
    * @return modified
    **/
    @JsonProperty("modified")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getModified() {
        return modified;
    }

    /**
     * Set modified
     **/
    public void setModified(String modified) {
        this.modified = modified;
    }

    public GetCurrentUserResponseAllOfData modified(String modified) {
        this.modified = modified;
        return this;
    }

    /**
    * Boolean that indicates whether the user has created a company
    * @return hasCreatedCompany
    **/
    @JsonProperty("has_created_company")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getHasCreatedCompany() {
        return hasCreatedCompany;
    }

    /**
     * Set hasCreatedCompany
     **/
    public void setHasCreatedCompany(Boolean hasCreatedCompany) {
        this.hasCreatedCompany = hasCreatedCompany;
    }

    public GetCurrentUserResponseAllOfData hasCreatedCompany(Boolean hasCreatedCompany) {
        this.hasCreatedCompany = hasCreatedCompany;
        return this;
    }

    /**
    * Get access
    * @return access
    **/
    @JsonProperty("access")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<UserAccess> getAccess() {
        return access;
    }

    /**
     * Set access
     **/
    public void setAccess(List<UserAccess> access) {
        this.access = access;
    }

    public GetCurrentUserResponseAllOfData access(List<UserAccess> access) {
        this.access = access;
        return this;
    }
    public GetCurrentUserResponseAllOfData addAccessItem(UserAccess accessItem) {
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
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getActiveFlag() {
        return activeFlag;
    }

    /**
     * Set activeFlag
     **/
    public void setActiveFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
    }

    public GetCurrentUserResponseAllOfData activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * The user timezone name
    * @return timezoneName
    **/
    @JsonProperty("timezone_name")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTimezoneName() {
        return timezoneName;
    }

    /**
     * Set timezoneName
     **/
    public void setTimezoneName(String timezoneName) {
        this.timezoneName = timezoneName;
    }

    public GetCurrentUserResponseAllOfData timezoneName(String timezoneName) {
        this.timezoneName = timezoneName;
        return this;
    }

    /**
    * The user timezone offset
    * @return timezoneOffset
    **/
    @JsonProperty("timezone_offset")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTimezoneOffset() {
        return timezoneOffset;
    }

    /**
     * Set timezoneOffset
     **/
    public void setTimezoneOffset(String timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    public GetCurrentUserResponseAllOfData timezoneOffset(String timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
        return this;
    }

    /**
    * The ID of the user role
    * @return roleId
    **/
    @JsonProperty("role_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * Set roleId
     **/
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public GetCurrentUserResponseAllOfData roleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
    * The user icon URL
    * @return iconUrl
    **/
    @JsonProperty("icon_url")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * Set iconUrl
     **/
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public GetCurrentUserResponseAllOfData iconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    /**
    * Boolean that indicates if the requested user is the same which is logged in (in this case, always true)
    * @return isYou
    **/
    @JsonProperty("is_you")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getIsYou() {
        return isYou;
    }

    /**
     * Set isYou
     **/
    public void setIsYou(Boolean isYou) {
        this.isYou = isYou;
    }

    public GetCurrentUserResponseAllOfData isYou(Boolean isYou) {
        this.isYou = isYou;
        return this;
    }

    /**
    * Boolean that indicates whether the user is deleted from the company
    * @return isDeleted
    **/
    @JsonProperty("is_deleted")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * Set isDeleted
     **/
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public GetCurrentUserResponseAllOfData isDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    /**
    * The user company ID
    * @return companyId
    **/
    @JsonProperty("company_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * Set companyId
     **/
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public GetCurrentUserResponseAllOfData companyId(Integer companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
    * The user company name
    * @return companyName
    **/
    @JsonProperty("company_name")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Set companyName
     **/
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public GetCurrentUserResponseAllOfData companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
    * The user company domain
    * @return companyDomain
    **/
    @JsonProperty("company_domain")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getCompanyDomain() {
        return companyDomain;
    }

    /**
     * Set companyDomain
     **/
    public void setCompanyDomain(String companyDomain) {
        this.companyDomain = companyDomain;
    }

    public GetCurrentUserResponseAllOfData companyDomain(String companyDomain) {
        this.companyDomain = companyDomain;
        return this;
    }

    /**
    * The user company country
    * @return companyCountry
    **/
    @JsonProperty("company_country")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getCompanyCountry() {
        return companyCountry;
    }

    /**
     * Set companyCountry
     **/
    public void setCompanyCountry(String companyCountry) {
        this.companyCountry = companyCountry;
    }

    public GetCurrentUserResponseAllOfData companyCountry(String companyCountry) {
        this.companyCountry = companyCountry;
        return this;
    }

    /**
    * The user company industry
    * @return companyIndustry
    **/
    @JsonProperty("company_industry")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getCompanyIndustry() {
        return companyIndustry;
    }

    /**
     * Set companyIndustry
     **/
    public void setCompanyIndustry(String companyIndustry) {
        this.companyIndustry = companyIndustry;
    }

    public GetCurrentUserResponseAllOfData companyIndustry(String companyIndustry) {
        this.companyIndustry = companyIndustry;
        return this;
    }

    /**
    * Get language
    * @return language
    **/
    @JsonProperty("language")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetCurrentUserResponseAllOfDataAllOfLanguage getLanguage() {
        return language;
    }

    /**
     * Set language
     **/
    public void setLanguage(GetCurrentUserResponseAllOfDataAllOfLanguage language) {
        this.language = language;
    }

    public GetCurrentUserResponseAllOfData language(GetCurrentUserResponseAllOfDataAllOfLanguage language) {
        this.language = language;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetCurrentUserResponseAllOfData {\n");

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
        sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
        sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
        sb.append("    companyDomain: ").append(toIndentedString(companyDomain)).append("\n");
        sb.append("    companyCountry: ").append(toIndentedString(companyCountry)).append("\n");
        sb.append("    companyIndustry: ").append(toIndentedString(companyIndustry)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetCurrentUserResponseAllOfData} object that
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

        GetCurrentUserResponseAllOfData model = (GetCurrentUserResponseAllOfData) obj;

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
        java.util.Objects.equals(isDeleted, model.isDeleted) &&
        java.util.Objects.equals(companyId, model.companyId) &&
        java.util.Objects.equals(companyName, model.companyName) &&
        java.util.Objects.equals(companyDomain, model.companyDomain) &&
        java.util.Objects.equals(companyCountry, model.companyCountry) &&
        java.util.Objects.equals(companyIndustry, model.companyIndustry) &&
        java.util.Objects.equals(language, model.language);
    }

    /**
     * Returns a hash code for a {@code GetCurrentUserResponseAllOfData}.
     *
     * @return a hash code value for a {@code GetCurrentUserResponseAllOfData}.
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
        isDeleted,
        companyId,
        companyName,
        companyDomain,
        companyCountry,
        companyIndustry,
        language);
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
    public static class GetCurrentUserResponseAllOfDataQueryParam  {

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
        @jakarta.ws.rs.QueryParam("companyId")
        private Integer companyId;
        @jakarta.ws.rs.QueryParam("companyName")
        private String companyName;
        @jakarta.ws.rs.QueryParam("companyDomain")
        private String companyDomain;
        @jakarta.ws.rs.QueryParam("companyCountry")
        private String companyCountry;
        @jakarta.ws.rs.QueryParam("companyIndustry")
        private String companyIndustry;
        @jakarta.ws.rs.QueryParam("language")
        private GetCurrentUserResponseAllOfDataAllOfLanguage language;

        /**
        * The user ID
        * @return id
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        public Integer getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(Integer id) {
            this.id = id;
        }

        public GetCurrentUserResponseAllOfDataQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The user name
        * @return name
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public GetCurrentUserResponseAllOfDataQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The user default currency
        * @return defaultCurrency
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("default_currency")
        public String getDefaultCurrency() {
            return defaultCurrency;
        }

        /**
         * Set defaultCurrency
         **/
        public void setDefaultCurrency(String defaultCurrency) {
            this.defaultCurrency = defaultCurrency;
        }

        public GetCurrentUserResponseAllOfDataQueryParam defaultCurrency(String defaultCurrency) {
            this.defaultCurrency = defaultCurrency;
            return this;
        }

        /**
        * The user locale
        * @return locale
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("locale")
        public String getLocale() {
            return locale;
        }

        /**
         * Set locale
         **/
        public void setLocale(String locale) {
            this.locale = locale;
        }

        public GetCurrentUserResponseAllOfDataQueryParam locale(String locale) {
            this.locale = locale;
            return this;
        }

        /**
        * The user language ID
        * @return lang
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("lang")
        public Integer getLang() {
            return lang;
        }

        /**
         * Set lang
         **/
        public void setLang(Integer lang) {
            this.lang = lang;
        }

        public GetCurrentUserResponseAllOfDataQueryParam lang(Integer lang) {
            this.lang = lang;
            return this;
        }

        /**
        * The user email
        * @return email
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("email")
        public String getEmail() {
            return email;
        }

        /**
         * Set email
         **/
        public void setEmail(String email) {
            this.email = email;
        }

        public GetCurrentUserResponseAllOfDataQueryParam email(String email) {
            this.email = email;
            return this;
        }

        /**
        * The user phone
        * @return phone
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("phone")
        public String getPhone() {
            return phone;
        }

        /**
         * Set phone
         **/
        public void setPhone(String phone) {
            this.phone = phone;
        }

        public GetCurrentUserResponseAllOfDataQueryParam phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
        * Boolean that indicates whether the user is activated
        * @return activated
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("activated")
        public Boolean getActivated() {
            return activated;
        }

        /**
         * Set activated
         **/
        public void setActivated(Boolean activated) {
            this.activated = activated;
        }

        public GetCurrentUserResponseAllOfDataQueryParam activated(Boolean activated) {
            this.activated = activated;
            return this;
        }

        /**
        * The last login date and time of the user. Format: YYYY-MM-DD HH:MM:SS
        * @return lastLogin
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("last_login")
        public String getLastLogin() {
            return lastLogin;
        }

        /**
         * Set lastLogin
         **/
        public void setLastLogin(String lastLogin) {
            this.lastLogin = lastLogin;
        }

        public GetCurrentUserResponseAllOfDataQueryParam lastLogin(String lastLogin) {
            this.lastLogin = lastLogin;
            return this;
        }

        /**
        * The creation date and time of the user. Format: YYYY-MM-DD HH:MM:SS
        * @return created
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("created")
        public String getCreated() {
            return created;
        }

        /**
         * Set created
         **/
        public void setCreated(String created) {
            this.created = created;
        }

        public GetCurrentUserResponseAllOfDataQueryParam created(String created) {
            this.created = created;
            return this;
        }

        /**
        * The last modification date and time of the user. Format: YYYY-MM-DD HH:MM:SS
        * @return modified
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("modified")
        public String getModified() {
            return modified;
        }

        /**
         * Set modified
         **/
        public void setModified(String modified) {
            this.modified = modified;
        }

        public GetCurrentUserResponseAllOfDataQueryParam modified(String modified) {
            this.modified = modified;
            return this;
        }

        /**
        * Boolean that indicates whether the user has created a company
        * @return hasCreatedCompany
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("has_created_company")
        public Boolean getHasCreatedCompany() {
            return hasCreatedCompany;
        }

        /**
         * Set hasCreatedCompany
         **/
        public void setHasCreatedCompany(Boolean hasCreatedCompany) {
            this.hasCreatedCompany = hasCreatedCompany;
        }

        public GetCurrentUserResponseAllOfDataQueryParam hasCreatedCompany(Boolean hasCreatedCompany) {
            this.hasCreatedCompany = hasCreatedCompany;
            return this;
        }

        /**
        * Get access
        * @return access
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("access")
        public List<UserAccess> getAccess() {
            return access;
        }

        /**
         * Set access
         **/
        public void setAccess(List<UserAccess> access) {
            this.access = access;
        }

        public GetCurrentUserResponseAllOfDataQueryParam access(List<UserAccess> access) {
            this.access = access;
            return this;
        }
        public GetCurrentUserResponseAllOfDataQueryParam addAccessItem(UserAccess accessItem) {
            this.access.add(accessItem);
            return this;
        }

        /**
        * Boolean that indicates whether the user is activated
        * @return activeFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("active_flag")
        public Boolean getActiveFlag() {
            return activeFlag;
        }

        /**
         * Set activeFlag
         **/
        public void setActiveFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
        }

        public GetCurrentUserResponseAllOfDataQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * The user timezone name
        * @return timezoneName
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("timezone_name")
        public String getTimezoneName() {
            return timezoneName;
        }

        /**
         * Set timezoneName
         **/
        public void setTimezoneName(String timezoneName) {
            this.timezoneName = timezoneName;
        }

        public GetCurrentUserResponseAllOfDataQueryParam timezoneName(String timezoneName) {
            this.timezoneName = timezoneName;
            return this;
        }

        /**
        * The user timezone offset
        * @return timezoneOffset
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("timezone_offset")
        public String getTimezoneOffset() {
            return timezoneOffset;
        }

        /**
         * Set timezoneOffset
         **/
        public void setTimezoneOffset(String timezoneOffset) {
            this.timezoneOffset = timezoneOffset;
        }

        public GetCurrentUserResponseAllOfDataQueryParam timezoneOffset(String timezoneOffset) {
            this.timezoneOffset = timezoneOffset;
            return this;
        }

        /**
        * The ID of the user role
        * @return roleId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("role_id")
        public Integer getRoleId() {
            return roleId;
        }

        /**
         * Set roleId
         **/
        public void setRoleId(Integer roleId) {
            this.roleId = roleId;
        }

        public GetCurrentUserResponseAllOfDataQueryParam roleId(Integer roleId) {
            this.roleId = roleId;
            return this;
        }

        /**
        * The user icon URL
        * @return iconUrl
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("icon_url")
        public String getIconUrl() {
            return iconUrl;
        }

        /**
         * Set iconUrl
         **/
        public void setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
        }

        public GetCurrentUserResponseAllOfDataQueryParam iconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }

        /**
        * Boolean that indicates if the requested user is the same which is logged in (in this case, always true)
        * @return isYou
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("is_you")
        public Boolean getIsYou() {
            return isYou;
        }

        /**
         * Set isYou
         **/
        public void setIsYou(Boolean isYou) {
            this.isYou = isYou;
        }

        public GetCurrentUserResponseAllOfDataQueryParam isYou(Boolean isYou) {
            this.isYou = isYou;
            return this;
        }

        /**
        * Boolean that indicates whether the user is deleted from the company
        * @return isDeleted
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("is_deleted")
        public Boolean getIsDeleted() {
            return isDeleted;
        }

        /**
         * Set isDeleted
         **/
        public void setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
        }

        public GetCurrentUserResponseAllOfDataQueryParam isDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }

        /**
        * The user company ID
        * @return companyId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("company_id")
        public Integer getCompanyId() {
            return companyId;
        }

        /**
         * Set companyId
         **/
        public void setCompanyId(Integer companyId) {
            this.companyId = companyId;
        }

        public GetCurrentUserResponseAllOfDataQueryParam companyId(Integer companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
        * The user company name
        * @return companyName
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("company_name")
        public String getCompanyName() {
            return companyName;
        }

        /**
         * Set companyName
         **/
        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public GetCurrentUserResponseAllOfDataQueryParam companyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        /**
        * The user company domain
        * @return companyDomain
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("company_domain")
        public String getCompanyDomain() {
            return companyDomain;
        }

        /**
         * Set companyDomain
         **/
        public void setCompanyDomain(String companyDomain) {
            this.companyDomain = companyDomain;
        }

        public GetCurrentUserResponseAllOfDataQueryParam companyDomain(String companyDomain) {
            this.companyDomain = companyDomain;
            return this;
        }

        /**
        * The user company country
        * @return companyCountry
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("company_country")
        public String getCompanyCountry() {
            return companyCountry;
        }

        /**
         * Set companyCountry
         **/
        public void setCompanyCountry(String companyCountry) {
            this.companyCountry = companyCountry;
        }

        public GetCurrentUserResponseAllOfDataQueryParam companyCountry(String companyCountry) {
            this.companyCountry = companyCountry;
            return this;
        }

        /**
        * The user company industry
        * @return companyIndustry
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("company_industry")
        public String getCompanyIndustry() {
            return companyIndustry;
        }

        /**
         * Set companyIndustry
         **/
        public void setCompanyIndustry(String companyIndustry) {
            this.companyIndustry = companyIndustry;
        }

        public GetCurrentUserResponseAllOfDataQueryParam companyIndustry(String companyIndustry) {
            this.companyIndustry = companyIndustry;
            return this;
        }

        /**
        * Get language
        * @return language
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("language")
        public GetCurrentUserResponseAllOfDataAllOfLanguage getLanguage() {
            return language;
        }

        /**
         * Set language
         **/
        public void setLanguage(GetCurrentUserResponseAllOfDataAllOfLanguage language) {
            this.language = language;
        }

        public GetCurrentUserResponseAllOfDataQueryParam language(GetCurrentUserResponseAllOfDataAllOfLanguage language) {
            this.language = language;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetCurrentUserResponseAllOfDataQueryParam {\n");

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
            sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
            sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
            sb.append("    companyDomain: ").append(toIndentedString(companyDomain)).append("\n");
            sb.append("    companyCountry: ").append(toIndentedString(companyCountry)).append("\n");
            sb.append("    companyIndustry: ").append(toIndentedString(companyIndustry)).append("\n");
            sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
