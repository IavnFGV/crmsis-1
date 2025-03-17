package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.LeadSearchItemItemOrganization;
import dti.crmsis.back.clients.openapi.v1.model.LeadSearchItemItemOwner;
import dti.crmsis.back.clients.openapi.v1.model.LeadSearchItemItemPerson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LeadSearchItemItem  {

    /**
      * The ID of the lead
     **/
    private String id;
    /**
      * The type of the item
     **/
    private String type;
    /**
      * The title of the lead
     **/
    private String title;
    private LeadSearchItemItemOwner owner;
    private LeadSearchItemItemPerson person;
    private LeadSearchItemItemOrganization organization;
    private List<String> phones;
    private List<String> emails;
    /**
      * Custom fields
     **/
    private List<String> customFields;
    /**
      * An array of notes
     **/
    private List<String> notes;
    /**
      * The value of the lead
     **/
    private Integer value;
    /**
      * The currency of the lead
     **/
    private String currency;
    /**
      * The visibility of the lead
     **/
    private Integer visibleTo;
    /**
      * A flag indicating whether the lead is archived or not
     **/
    private Boolean isArchived;

    /**
    * The ID of the lead
    * @return id
    **/
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(String id) {
        this.id = id;
    }

    public LeadSearchItemItem id(String id) {
        this.id = id;
        return this;
    }

    /**
    * The type of the item
    * @return type
    **/
    @JsonProperty("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(String type) {
        this.type = type;
    }

    public LeadSearchItemItem type(String type) {
        this.type = type;
        return this;
    }

    /**
    * The title of the lead
    * @return title
    **/
    @JsonProperty("title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTitle() {
        return title;
    }

    /**
     * Set title
     **/
    public void setTitle(String title) {
        this.title = title;
    }

    public LeadSearchItemItem title(String title) {
        this.title = title;
        return this;
    }

    /**
    * Get owner
    * @return owner
    **/
    @JsonProperty("owner")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LeadSearchItemItemOwner getOwner() {
        return owner;
    }

    /**
     * Set owner
     **/
    public void setOwner(LeadSearchItemItemOwner owner) {
        this.owner = owner;
    }

    public LeadSearchItemItem owner(LeadSearchItemItemOwner owner) {
        this.owner = owner;
        return this;
    }

    /**
    * Get person
    * @return person
    **/
    @JsonProperty("person")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LeadSearchItemItemPerson getPerson() {
        return person;
    }

    /**
     * Set person
     **/
    public void setPerson(LeadSearchItemItemPerson person) {
        this.person = person;
    }

    public LeadSearchItemItem person(LeadSearchItemItemPerson person) {
        this.person = person;
        return this;
    }

    /**
    * Get organization
    * @return organization
    **/
    @JsonProperty("organization")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LeadSearchItemItemOrganization getOrganization() {
        return organization;
    }

    /**
     * Set organization
     **/
    public void setOrganization(LeadSearchItemItemOrganization organization) {
        this.organization = organization;
    }

    public LeadSearchItemItem organization(LeadSearchItemItemOrganization organization) {
        this.organization = organization;
        return this;
    }

    /**
    * Get phones
    * @return phones
    **/
    @JsonProperty("phones")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getPhones() {
        return phones;
    }

    /**
     * Set phones
     **/
    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public LeadSearchItemItem phones(List<String> phones) {
        this.phones = phones;
        return this;
    }
    public LeadSearchItemItem addPhonesItem(String phonesItem) {
        if (this.phones == null){
            phones = new ArrayList<>();
        }
        this.phones.add(phonesItem);
        return this;
    }

    /**
    * Get emails
    * @return emails
    **/
    @JsonProperty("emails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getEmails() {
        return emails;
    }

    /**
     * Set emails
     **/
    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public LeadSearchItemItem emails(List<String> emails) {
        this.emails = emails;
        return this;
    }
    public LeadSearchItemItem addEmailsItem(String emailsItem) {
        if (this.emails == null){
            emails = new ArrayList<>();
        }
        this.emails.add(emailsItem);
        return this;
    }

    /**
    * Custom fields
    * @return customFields
    **/
    @JsonProperty("custom_fields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getCustomFields() {
        return customFields;
    }

    /**
     * Set customFields
     **/
    public void setCustomFields(List<String> customFields) {
        this.customFields = customFields;
    }

    public LeadSearchItemItem customFields(List<String> customFields) {
        this.customFields = customFields;
        return this;
    }
    public LeadSearchItemItem addCustomFieldsItem(String customFieldsItem) {
        if (this.customFields == null){
            customFields = new ArrayList<>();
        }
        this.customFields.add(customFieldsItem);
        return this;
    }

    /**
    * An array of notes
    * @return notes
    **/
    @JsonProperty("notes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getNotes() {
        return notes;
    }

    /**
     * Set notes
     **/
    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public LeadSearchItemItem notes(List<String> notes) {
        this.notes = notes;
        return this;
    }
    public LeadSearchItemItem addNotesItem(String notesItem) {
        if (this.notes == null){
            notes = new ArrayList<>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
    * The value of the lead
    * @return value
    **/
    @JsonProperty("value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getValue() {
        return value;
    }

    /**
     * Set value
     **/
    public void setValue(Integer value) {
        this.value = value;
    }

    public LeadSearchItemItem value(Integer value) {
        this.value = value;
        return this;
    }

    /**
    * The currency of the lead
    * @return currency
    **/
    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Set currency
     **/
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public LeadSearchItemItem currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
    * The visibility of the lead
    * @return visibleTo
    **/
    @JsonProperty("visible_to")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getVisibleTo() {
        return visibleTo;
    }

    /**
     * Set visibleTo
     **/
    public void setVisibleTo(Integer visibleTo) {
        this.visibleTo = visibleTo;
    }

    public LeadSearchItemItem visibleTo(Integer visibleTo) {
        this.visibleTo = visibleTo;
        return this;
    }

    /**
    * A flag indicating whether the lead is archived or not
    * @return isArchived
    **/
    @JsonProperty("is_archived")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsArchived() {
        return isArchived;
    }

    /**
     * Set isArchived
     **/
    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    public LeadSearchItemItem isArchived(Boolean isArchived) {
        this.isArchived = isArchived;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LeadSearchItemItem {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    person: ").append(toIndentedString(person)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
        sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
        sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code LeadSearchItemItem} object that
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

        LeadSearchItemItem model = (LeadSearchItemItem) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(type, model.type) &&
        java.util.Objects.equals(title, model.title) &&
        java.util.Objects.equals(owner, model.owner) &&
        java.util.Objects.equals(person, model.person) &&
        java.util.Objects.equals(organization, model.organization) &&
        java.util.Objects.equals(phones, model.phones) &&
        java.util.Objects.equals(emails, model.emails) &&
        java.util.Objects.equals(customFields, model.customFields) &&
        java.util.Objects.equals(notes, model.notes) &&
        java.util.Objects.equals(value, model.value) &&
        java.util.Objects.equals(currency, model.currency) &&
        java.util.Objects.equals(visibleTo, model.visibleTo) &&
        java.util.Objects.equals(isArchived, model.isArchived);
    }

    /**
     * Returns a hash code for a {@code LeadSearchItemItem}.
     *
     * @return a hash code value for a {@code LeadSearchItemItem}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        type,
        title,
        owner,
        person,
        organization,
        phones,
        emails,
        customFields,
        notes,
        value,
        currency,
        visibleTo,
        isArchived);
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
    public static class LeadSearchItemItemQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private String id;
        @jakarta.ws.rs.QueryParam("type")
        private String type;
        @jakarta.ws.rs.QueryParam("title")
        private String title;
        @jakarta.ws.rs.QueryParam("owner")
        private LeadSearchItemItemOwner owner;
        @jakarta.ws.rs.QueryParam("person")
        private LeadSearchItemItemPerson person;
        @jakarta.ws.rs.QueryParam("organization")
        private LeadSearchItemItemOrganization organization;
        @jakarta.ws.rs.QueryParam("phones")
        private List<String> phones = null;
        @jakarta.ws.rs.QueryParam("emails")
        private List<String> emails = null;
        @jakarta.ws.rs.QueryParam("customFields")
        private List<String> customFields = null;
        @jakarta.ws.rs.QueryParam("notes")
        private List<String> notes = null;
        @jakarta.ws.rs.QueryParam("value")
        private Integer value;
        @jakarta.ws.rs.QueryParam("currency")
        private String currency;
        @jakarta.ws.rs.QueryParam("visibleTo")
        private Integer visibleTo;
        @jakarta.ws.rs.QueryParam("isArchived")
        private Boolean isArchived;

        /**
        * The ID of the lead
        * @return id
        **/
        @JsonProperty("id")
        public String getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(String id) {
            this.id = id;
        }

        public LeadSearchItemItemQueryParam id(String id) {
            this.id = id;
            return this;
        }

        /**
        * The type of the item
        * @return type
        **/
        @JsonProperty("type")
        public String getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(String type) {
            this.type = type;
        }

        public LeadSearchItemItemQueryParam type(String type) {
            this.type = type;
            return this;
        }

        /**
        * The title of the lead
        * @return title
        **/
        @JsonProperty("title")
        public String getTitle() {
            return title;
        }

        /**
         * Set title
         **/
        public void setTitle(String title) {
            this.title = title;
        }

        public LeadSearchItemItemQueryParam title(String title) {
            this.title = title;
            return this;
        }

        /**
        * Get owner
        * @return owner
        **/
        @JsonProperty("owner")
        public LeadSearchItemItemOwner getOwner() {
            return owner;
        }

        /**
         * Set owner
         **/
        public void setOwner(LeadSearchItemItemOwner owner) {
            this.owner = owner;
        }

        public LeadSearchItemItemQueryParam owner(LeadSearchItemItemOwner owner) {
            this.owner = owner;
            return this;
        }

        /**
        * Get person
        * @return person
        **/
        @JsonProperty("person")
        public LeadSearchItemItemPerson getPerson() {
            return person;
        }

        /**
         * Set person
         **/
        public void setPerson(LeadSearchItemItemPerson person) {
            this.person = person;
        }

        public LeadSearchItemItemQueryParam person(LeadSearchItemItemPerson person) {
            this.person = person;
            return this;
        }

        /**
        * Get organization
        * @return organization
        **/
        @JsonProperty("organization")
        public LeadSearchItemItemOrganization getOrganization() {
            return organization;
        }

        /**
         * Set organization
         **/
        public void setOrganization(LeadSearchItemItemOrganization organization) {
            this.organization = organization;
        }

        public LeadSearchItemItemQueryParam organization(LeadSearchItemItemOrganization organization) {
            this.organization = organization;
            return this;
        }

        /**
        * Get phones
        * @return phones
        **/
        @JsonProperty("phones")
        public List<String> getPhones() {
            return phones;
        }

        /**
         * Set phones
         **/
        public void setPhones(List<String> phones) {
            this.phones = phones;
        }

        public LeadSearchItemItemQueryParam phones(List<String> phones) {
            this.phones = phones;
            return this;
        }
        public LeadSearchItemItemQueryParam addPhonesItem(String phonesItem) {
            this.phones.add(phonesItem);
            return this;
        }

        /**
        * Get emails
        * @return emails
        **/
        @JsonProperty("emails")
        public List<String> getEmails() {
            return emails;
        }

        /**
         * Set emails
         **/
        public void setEmails(List<String> emails) {
            this.emails = emails;
        }

        public LeadSearchItemItemQueryParam emails(List<String> emails) {
            this.emails = emails;
            return this;
        }
        public LeadSearchItemItemQueryParam addEmailsItem(String emailsItem) {
            this.emails.add(emailsItem);
            return this;
        }

        /**
        * Custom fields
        * @return customFields
        **/
        @JsonProperty("custom_fields")
        public List<String> getCustomFields() {
            return customFields;
        }

        /**
         * Set customFields
         **/
        public void setCustomFields(List<String> customFields) {
            this.customFields = customFields;
        }

        public LeadSearchItemItemQueryParam customFields(List<String> customFields) {
            this.customFields = customFields;
            return this;
        }
        public LeadSearchItemItemQueryParam addCustomFieldsItem(String customFieldsItem) {
            this.customFields.add(customFieldsItem);
            return this;
        }

        /**
        * An array of notes
        * @return notes
        **/
        @JsonProperty("notes")
        public List<String> getNotes() {
            return notes;
        }

        /**
         * Set notes
         **/
        public void setNotes(List<String> notes) {
            this.notes = notes;
        }

        public LeadSearchItemItemQueryParam notes(List<String> notes) {
            this.notes = notes;
            return this;
        }
        public LeadSearchItemItemQueryParam addNotesItem(String notesItem) {
            this.notes.add(notesItem);
            return this;
        }

        /**
        * The value of the lead
        * @return value
        **/
        @JsonProperty("value")
        public Integer getValue() {
            return value;
        }

        /**
         * Set value
         **/
        public void setValue(Integer value) {
            this.value = value;
        }

        public LeadSearchItemItemQueryParam value(Integer value) {
            this.value = value;
            return this;
        }

        /**
        * The currency of the lead
        * @return currency
        **/
        @JsonProperty("currency")
        public String getCurrency() {
            return currency;
        }

        /**
         * Set currency
         **/
        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public LeadSearchItemItemQueryParam currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
        * The visibility of the lead
        * @return visibleTo
        **/
        @JsonProperty("visible_to")
        public Integer getVisibleTo() {
            return visibleTo;
        }

        /**
         * Set visibleTo
         **/
        public void setVisibleTo(Integer visibleTo) {
            this.visibleTo = visibleTo;
        }

        public LeadSearchItemItemQueryParam visibleTo(Integer visibleTo) {
            this.visibleTo = visibleTo;
            return this;
        }

        /**
        * A flag indicating whether the lead is archived or not
        * @return isArchived
        **/
        @JsonProperty("is_archived")
        public Boolean getIsArchived() {
            return isArchived;
        }

        /**
         * Set isArchived
         **/
        public void setIsArchived(Boolean isArchived) {
            this.isArchived = isArchived;
        }

        public LeadSearchItemItemQueryParam isArchived(Boolean isArchived) {
            this.isArchived = isArchived;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LeadSearchItemItemQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    title: ").append(toIndentedString(title)).append("\n");
            sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
            sb.append("    person: ").append(toIndentedString(person)).append("\n");
            sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
            sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
            sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
            sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
            sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
            sb.append("    value: ").append(toIndentedString(value)).append("\n");
            sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
            sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
            sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
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
