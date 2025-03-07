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
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonDataWithID  {

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
    * The ID of the person associated with the item
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

    public PersonDataWithID id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The name of the person associated with the item
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

    public PersonDataWithID name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The emails of the person associated with the item
    * @return email
    **/
    @JsonProperty("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PersonDataWithIDAllOfEmailInner> getEmail() {
        return email;
    }

    /**
     * Set email
     **/
    public void setEmail(List<PersonDataWithIDAllOfEmailInner> email) {
        this.email = email;
    }

    public PersonDataWithID email(List<PersonDataWithIDAllOfEmailInner> email) {
        this.email = email;
        return this;
    }
    public PersonDataWithID addEmailItem(PersonDataWithIDAllOfEmailInner emailItem) {
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PhoneData> getPhone() {
        return phone;
    }

    /**
     * Set phone
     **/
    public void setPhone(List<PhoneData> phone) {
        this.phone = phone;
    }

    public PersonDataWithID phone(List<PhoneData> phone) {
        this.phone = phone;
        return this;
    }
    public PersonDataWithID addPhoneItem(PhoneData phoneItem) {
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     * Set ownerId
     **/
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public PersonDataWithID ownerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersonDataWithID {\n");

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
     * {@code null} and is a {@code PersonDataWithID} object that
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

        PersonDataWithID model = (PersonDataWithID) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(email, model.email) &&
        java.util.Objects.equals(phone, model.phone) &&
        java.util.Objects.equals(ownerId, model.ownerId);
    }

    /**
     * Returns a hash code for a {@code PersonDataWithID}.
     *
     * @return a hash code value for a {@code PersonDataWithID}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
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
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PersonDataWithIDQueryParam  {

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
        * The ID of the person associated with the item
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

        public PersonDataWithIDQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The name of the person associated with the item
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

        public PersonDataWithIDQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The emails of the person associated with the item
        * @return email
        **/
        @JsonProperty("email")
        public List<PersonDataWithIDAllOfEmailInner> getEmail() {
            return email;
        }

        /**
         * Set email
         **/
        public void setEmail(List<PersonDataWithIDAllOfEmailInner> email) {
            this.email = email;
        }

        public PersonDataWithIDQueryParam email(List<PersonDataWithIDAllOfEmailInner> email) {
            this.email = email;
            return this;
        }
        public PersonDataWithIDQueryParam addEmailItem(PersonDataWithIDAllOfEmailInner emailItem) {
            this.email.add(emailItem);
            return this;
        }

        /**
        * The phone numbers of the person associated with the item
        * @return phone
        **/
        @JsonProperty("phone")
        public List<PhoneData> getPhone() {
            return phone;
        }

        /**
         * Set phone
         **/
        public void setPhone(List<PhoneData> phone) {
            this.phone = phone;
        }

        public PersonDataWithIDQueryParam phone(List<PhoneData> phone) {
            this.phone = phone;
            return this;
        }
        public PersonDataWithIDQueryParam addPhoneItem(PhoneData phoneItem) {
            this.phone.add(phoneItem);
            return this;
        }

        /**
        * The ID of the owner of the person that is associated with the item
        * @return ownerId
        **/
        @JsonProperty("owner_id")
        public Integer getOwnerId() {
            return ownerId;
        }

        /**
         * Set ownerId
         **/
        public void setOwnerId(Integer ownerId) {
            this.ownerId = ownerId;
        }

        public PersonDataWithIDQueryParam ownerId(Integer ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PersonDataWithIDQueryParam {\n");

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
