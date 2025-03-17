package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.PersonDataWithIDAllOfEmailInner;
import dti.crmsis.back.clients.openapi.v1.model.PhoneData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The ID of the person associated with the item
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class PersonDataWithActiveFlag  {

    /**
      * Whether the associated person is active or not
     **/
    private Boolean activeFlag;
    /**
      * The ID of the person associated with the item
     **/
    private Integer id;
    /**
      * The name of the person associated with the item
     **/
    private String name;
    /**
      * The emails of the person associated with the item
     **/
    private List<PersonDataWithIDAllOfEmailInner> email;
    /**
      * The phone numbers of the person associated with the item
     **/
    private List<PhoneData> phone;
    /**
      * The ID of the owner of the person that is associated with the item
     **/
    private Integer ownerId;

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

    public PersonDataWithActiveFlag activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * The ID of the person associated with the item
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

    public PersonDataWithActiveFlag id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The name of the person associated with the item
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

    public PersonDataWithActiveFlag name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The emails of the person associated with the item
    * @return email
    **/
    @JsonProperty("email")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<PersonDataWithIDAllOfEmailInner> getEmail() {
        return email;
    }

    /**
     * Set email
     **/
    public void setEmail(List<PersonDataWithIDAllOfEmailInner> email) {
        this.email = email;
    }

    public PersonDataWithActiveFlag email(List<PersonDataWithIDAllOfEmailInner> email) {
        this.email = email;
        return this;
    }
    public PersonDataWithActiveFlag addEmailItem(PersonDataWithIDAllOfEmailInner emailItem) {
        if (this.email == null){
            email = new ArrayList<>();
        }
        this.email.add(emailItem);
        return this;
    }

    /**
    * The phone numbers of the person associated with the item
    * @return phone
    **/
    @JsonProperty("phone")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<PhoneData> getPhone() {
        return phone;
    }

    /**
     * Set phone
     **/
    public void setPhone(List<PhoneData> phone) {
        this.phone = phone;
    }

    public PersonDataWithActiveFlag phone(List<PhoneData> phone) {
        this.phone = phone;
        return this;
    }
    public PersonDataWithActiveFlag addPhoneItem(PhoneData phoneItem) {
        if (this.phone == null){
            phone = new ArrayList<>();
        }
        this.phone.add(phoneItem);
        return this;
    }

    /**
    * The ID of the owner of the person that is associated with the item
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

    public PersonDataWithActiveFlag ownerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersonDataWithActiveFlag {\n");

        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code PersonDataWithActiveFlag} object that
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

        PersonDataWithActiveFlag model = (PersonDataWithActiveFlag) obj;

        return java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(email, model.email) &&
        java.util.Objects.equals(phone, model.phone) &&
        java.util.Objects.equals(ownerId, model.ownerId);
    }

    /**
     * Returns a hash code for a {@code PersonDataWithActiveFlag}.
     *
     * @return a hash code value for a {@code PersonDataWithActiveFlag}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(activeFlag,
        id,
        name,
        email,
        phone,
        ownerId);
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
      * The ID of the person associated with the item
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class PersonDataWithActiveFlagQueryParam  {

        /**
          * The ID of the person associated with the item
         **/
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        /**
          * The ID of the person associated with the item
         **/
        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        /**
          * The ID of the person associated with the item
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * The ID of the person associated with the item
         **/
        @jakarta.ws.rs.QueryParam("email")
        private List<PersonDataWithIDAllOfEmailInner> email = null;
        /**
          * The ID of the person associated with the item
         **/
        @jakarta.ws.rs.QueryParam("phone")
        private List<PhoneData> phone = null;
        /**
          * The ID of the person associated with the item
         **/
        @jakarta.ws.rs.QueryParam("ownerId")
        private Integer ownerId;

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

        public PersonDataWithActiveFlagQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * The ID of the person associated with the item
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

        public PersonDataWithActiveFlagQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The name of the person associated with the item
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

        public PersonDataWithActiveFlagQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The emails of the person associated with the item
        * @return email
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("email")
        public List<PersonDataWithIDAllOfEmailInner> getEmail() {
            return email;
        }

        /**
         * Set email
         **/
        public void setEmail(List<PersonDataWithIDAllOfEmailInner> email) {
            this.email = email;
        }

        public PersonDataWithActiveFlagQueryParam email(List<PersonDataWithIDAllOfEmailInner> email) {
            this.email = email;
            return this;
        }
        public PersonDataWithActiveFlagQueryParam addEmailItem(PersonDataWithIDAllOfEmailInner emailItem) {
            this.email.add(emailItem);
            return this;
        }

        /**
        * The phone numbers of the person associated with the item
        * @return phone
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("phone")
        public List<PhoneData> getPhone() {
            return phone;
        }

        /**
         * Set phone
         **/
        public void setPhone(List<PhoneData> phone) {
            this.phone = phone;
        }

        public PersonDataWithActiveFlagQueryParam phone(List<PhoneData> phone) {
            this.phone = phone;
            return this;
        }
        public PersonDataWithActiveFlagQueryParam addPhoneItem(PhoneData phoneItem) {
            this.phone.add(phoneItem);
            return this;
        }

        /**
        * The ID of the owner of the person that is associated with the item
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

        public PersonDataWithActiveFlagQueryParam ownerId(Integer ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PersonDataWithActiveFlagQueryParam {\n");

            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    email: ").append(toIndentedString(email)).append("\n");
            sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
            sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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
