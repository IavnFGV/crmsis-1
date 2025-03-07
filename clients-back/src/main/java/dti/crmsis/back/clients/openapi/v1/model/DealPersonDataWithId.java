package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.DealPersonDataWithIdAllOfEmailInner;
import dti.crmsis.back.clients.openapi.v1.model.DealPersonDataWithIdAllOfPhoneInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class DealPersonDataWithId  {

    /**
      * Whether the associated person is active or not
     **/
    private Boolean activeFlag;
    /**
      * The name of the person associated with the deal
     **/
    private String name;
    /**
      * The emails of the person associated with the deal
     **/
    private List<DealPersonDataWithIdAllOfEmailInner> email;
    /**
      * The phone numbers of the person associated with the deal
     **/
    private List<DealPersonDataWithIdAllOfPhoneInner> phone;
    /**
      * The ID of the owner of the person that is associated with the deal
     **/
    private Integer ownerId;
    /**
      * The ID of the person associated with the deal
     **/
    private Integer value;

    /**
    * Whether the associated person is active or not
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

    public DealPersonDataWithId activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * The name of the person associated with the deal
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

    public DealPersonDataWithId name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The emails of the person associated with the deal
    * @return email
    **/
    @JsonProperty("email")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<DealPersonDataWithIdAllOfEmailInner> getEmail() {
        return email;
    }

    /**
     * Set email
     **/
    public void setEmail(List<DealPersonDataWithIdAllOfEmailInner> email) {
        this.email = email;
    }

    public DealPersonDataWithId email(List<DealPersonDataWithIdAllOfEmailInner> email) {
        this.email = email;
        return this;
    }
    public DealPersonDataWithId addEmailItem(DealPersonDataWithIdAllOfEmailInner emailItem) {
        if (this.email == null){
            email = new ArrayList<>();
        }
        this.email.add(emailItem);
        return this;
    }

    /**
    * The phone numbers of the person associated with the deal
    * @return phone
    **/
    @JsonProperty("phone")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<DealPersonDataWithIdAllOfPhoneInner> getPhone() {
        return phone;
    }

    /**
     * Set phone
     **/
    public void setPhone(List<DealPersonDataWithIdAllOfPhoneInner> phone) {
        this.phone = phone;
    }

    public DealPersonDataWithId phone(List<DealPersonDataWithIdAllOfPhoneInner> phone) {
        this.phone = phone;
        return this;
    }
    public DealPersonDataWithId addPhoneItem(DealPersonDataWithIdAllOfPhoneInner phoneItem) {
        if (this.phone == null){
            phone = new ArrayList<>();
        }
        this.phone.add(phoneItem);
        return this;
    }

    /**
    * The ID of the owner of the person that is associated with the deal
    * @return ownerId
    **/
    @JsonProperty("owner_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     * Set ownerId
     **/
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public DealPersonDataWithId ownerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
    * The ID of the person associated with the deal
    * @return value
    **/
    @JsonProperty("value")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getValue() {
        return value;
    }

    /**
     * Set value
     **/
    public void setValue(Integer value) {
        this.value = value;
    }

    public DealPersonDataWithId value(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DealPersonDataWithId {\n");

        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code DealPersonDataWithId} object that
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

        DealPersonDataWithId model = (DealPersonDataWithId) obj;

        return java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(email, model.email) &&
        java.util.Objects.equals(phone, model.phone) &&
        java.util.Objects.equals(ownerId, model.ownerId) &&
        java.util.Objects.equals(value, model.value);
    }

    /**
     * Returns a hash code for a {@code DealPersonDataWithId}.
     *
     * @return a hash code value for a {@code DealPersonDataWithId}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(activeFlag,
        name,
        email,
        phone,
        ownerId,
        value);
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
    public static class DealPersonDataWithIdQueryParam  {

        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("email")
        private List<DealPersonDataWithIdAllOfEmailInner> email = null;
        @jakarta.ws.rs.QueryParam("phone")
        private List<DealPersonDataWithIdAllOfPhoneInner> phone = null;
        @jakarta.ws.rs.QueryParam("ownerId")
        private Integer ownerId;
        @jakarta.ws.rs.QueryParam("value")
        private Integer value;

        /**
        * Whether the associated person is active or not
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

        public DealPersonDataWithIdQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * The name of the person associated with the deal
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

        public DealPersonDataWithIdQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The emails of the person associated with the deal
        * @return email
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("email")
        public List<DealPersonDataWithIdAllOfEmailInner> getEmail() {
            return email;
        }

        /**
         * Set email
         **/
        public void setEmail(List<DealPersonDataWithIdAllOfEmailInner> email) {
            this.email = email;
        }

        public DealPersonDataWithIdQueryParam email(List<DealPersonDataWithIdAllOfEmailInner> email) {
            this.email = email;
            return this;
        }
        public DealPersonDataWithIdQueryParam addEmailItem(DealPersonDataWithIdAllOfEmailInner emailItem) {
            this.email.add(emailItem);
            return this;
        }

        /**
        * The phone numbers of the person associated with the deal
        * @return phone
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("phone")
        public List<DealPersonDataWithIdAllOfPhoneInner> getPhone() {
            return phone;
        }

        /**
         * Set phone
         **/
        public void setPhone(List<DealPersonDataWithIdAllOfPhoneInner> phone) {
            this.phone = phone;
        }

        public DealPersonDataWithIdQueryParam phone(List<DealPersonDataWithIdAllOfPhoneInner> phone) {
            this.phone = phone;
            return this;
        }
        public DealPersonDataWithIdQueryParam addPhoneItem(DealPersonDataWithIdAllOfPhoneInner phoneItem) {
            this.phone.add(phoneItem);
            return this;
        }

        /**
        * The ID of the owner of the person that is associated with the deal
        * @return ownerId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("owner_id")
        public Integer getOwnerId() {
            return ownerId;
        }

        /**
         * Set ownerId
         **/
        public void setOwnerId(Integer ownerId) {
            this.ownerId = ownerId;
        }

        public DealPersonDataWithIdQueryParam ownerId(Integer ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
        * The ID of the person associated with the deal
        * @return value
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        public Integer getValue() {
            return value;
        }

        /**
         * Set value
         **/
        public void setValue(Integer value) {
            this.value = value;
        }

        public DealPersonDataWithIdQueryParam value(Integer value) {
            this.value = value;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DealPersonDataWithIdQueryParam {\n");

            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    email: ").append(toIndentedString(email)).append("\n");
            sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
            sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
            sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
