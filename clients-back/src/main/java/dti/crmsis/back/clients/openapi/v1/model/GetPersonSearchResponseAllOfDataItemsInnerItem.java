package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetPersonSearchResponseAllOfDataItemsInnerItemOrganization;
import dti.crmsis.back.clients.openapi.v1.model.GetPersonSearchResponseAllOfDataItemsInnerItemOwner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetPersonSearchResponseAllOfDataItemsInnerItem  {

    /**
      * The ID of the person
     **/
    private Integer id;
    /**
      * The type of the item
     **/
    private String type;
    /**
      * The name of the person
     **/
    private String name;
    /**
      * An array of phone numbers
     **/
    private List<String> phones;
    /**
      * An array of email addresses
     **/
    private List<String> emails;
    /**
      * The visibility of the person
     **/
    private Integer visibleTo;
    private GetPersonSearchResponseAllOfDataItemsInnerItemOwner owner;
    private GetPersonSearchResponseAllOfDataItemsInnerItemOrganization organization;
    /**
      * Custom fields
     **/
    private List<String> customFields;
    /**
      * An array of notes
     **/
    private List<String> notes;

    /**
    * The ID of the person
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

    public GetPersonSearchResponseAllOfDataItemsInnerItem id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The type of the item
    * @return type
    **/
    @JsonProperty("type")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(String type) {
        this.type = type;
    }

    public GetPersonSearchResponseAllOfDataItemsInnerItem type(String type) {
        this.type = type;
        return this;
    }

    /**
    * The name of the person
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

    public GetPersonSearchResponseAllOfDataItemsInnerItem name(String name) {
        this.name = name;
        return this;
    }

    /**
    * An array of phone numbers
    * @return phones
    **/
    @JsonProperty("phones")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getPhones() {
        return phones;
    }

    /**
     * Set phones
     **/
    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public GetPersonSearchResponseAllOfDataItemsInnerItem phones(List<String> phones) {
        this.phones = phones;
        return this;
    }
    public GetPersonSearchResponseAllOfDataItemsInnerItem addPhonesItem(String phonesItem) {
        if (this.phones == null){
            phones = new ArrayList<>();
        }
        this.phones.add(phonesItem);
        return this;
    }

    /**
    * An array of email addresses
    * @return emails
    **/
    @JsonProperty("emails")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getEmails() {
        return emails;
    }

    /**
     * Set emails
     **/
    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public GetPersonSearchResponseAllOfDataItemsInnerItem emails(List<String> emails) {
        this.emails = emails;
        return this;
    }
    public GetPersonSearchResponseAllOfDataItemsInnerItem addEmailsItem(String emailsItem) {
        if (this.emails == null){
            emails = new ArrayList<>();
        }
        this.emails.add(emailsItem);
        return this;
    }

    /**
    * The visibility of the person
    * @return visibleTo
    **/
    @JsonProperty("visible_to")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getVisibleTo() {
        return visibleTo;
    }

    /**
     * Set visibleTo
     **/
    public void setVisibleTo(Integer visibleTo) {
        this.visibleTo = visibleTo;
    }

    public GetPersonSearchResponseAllOfDataItemsInnerItem visibleTo(Integer visibleTo) {
        this.visibleTo = visibleTo;
        return this;
    }

    /**
    * Get owner
    * @return owner
    **/
    @JsonProperty("owner")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetPersonSearchResponseAllOfDataItemsInnerItemOwner getOwner() {
        return owner;
    }

    /**
     * Set owner
     **/
    public void setOwner(GetPersonSearchResponseAllOfDataItemsInnerItemOwner owner) {
        this.owner = owner;
    }

    public GetPersonSearchResponseAllOfDataItemsInnerItem owner(GetPersonSearchResponseAllOfDataItemsInnerItemOwner owner) {
        this.owner = owner;
        return this;
    }

    /**
    * Get organization
    * @return organization
    **/
    @JsonProperty("organization")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetPersonSearchResponseAllOfDataItemsInnerItemOrganization getOrganization() {
        return organization;
    }

    /**
     * Set organization
     **/
    public void setOrganization(GetPersonSearchResponseAllOfDataItemsInnerItemOrganization organization) {
        this.organization = organization;
    }

    public GetPersonSearchResponseAllOfDataItemsInnerItem organization(GetPersonSearchResponseAllOfDataItemsInnerItemOrganization organization) {
        this.organization = organization;
        return this;
    }

    /**
    * Custom fields
    * @return customFields
    **/
    @JsonProperty("custom_fields")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getCustomFields() {
        return customFields;
    }

    /**
     * Set customFields
     **/
    public void setCustomFields(List<String> customFields) {
        this.customFields = customFields;
    }

    public GetPersonSearchResponseAllOfDataItemsInnerItem customFields(List<String> customFields) {
        this.customFields = customFields;
        return this;
    }
    public GetPersonSearchResponseAllOfDataItemsInnerItem addCustomFieldsItem(String customFieldsItem) {
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
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getNotes() {
        return notes;
    }

    /**
     * Set notes
     **/
    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public GetPersonSearchResponseAllOfDataItemsInnerItem notes(List<String> notes) {
        this.notes = notes;
        return this;
    }
    public GetPersonSearchResponseAllOfDataItemsInnerItem addNotesItem(String notesItem) {
        if (this.notes == null){
            notes = new ArrayList<>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPersonSearchResponseAllOfDataItemsInnerItem {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
        sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
        sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetPersonSearchResponseAllOfDataItemsInnerItem} object that
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

        GetPersonSearchResponseAllOfDataItemsInnerItem model = (GetPersonSearchResponseAllOfDataItemsInnerItem) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(type, model.type) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(phones, model.phones) &&
        java.util.Objects.equals(emails, model.emails) &&
        java.util.Objects.equals(visibleTo, model.visibleTo) &&
        java.util.Objects.equals(owner, model.owner) &&
        java.util.Objects.equals(organization, model.organization) &&
        java.util.Objects.equals(customFields, model.customFields) &&
        java.util.Objects.equals(notes, model.notes);
    }

    /**
     * Returns a hash code for a {@code GetPersonSearchResponseAllOfDataItemsInnerItem}.
     *
     * @return a hash code value for a {@code GetPersonSearchResponseAllOfDataItemsInnerItem}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        type,
        name,
        phones,
        emails,
        visibleTo,
        owner,
        organization,
        customFields,
        notes);
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
    public static class GetPersonSearchResponseAllOfDataItemsInnerItemQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("type")
        private String type;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("phones")
        private List<String> phones = null;
        @jakarta.ws.rs.QueryParam("emails")
        private List<String> emails = null;
        @jakarta.ws.rs.QueryParam("visibleTo")
        private Integer visibleTo;
        @jakarta.ws.rs.QueryParam("owner")
        private GetPersonSearchResponseAllOfDataItemsInnerItemOwner owner;
        @jakarta.ws.rs.QueryParam("organization")
        private GetPersonSearchResponseAllOfDataItemsInnerItemOrganization organization;
        @jakarta.ws.rs.QueryParam("customFields")
        private List<String> customFields = null;
        @jakarta.ws.rs.QueryParam("notes")
        private List<String> notes = null;

        /**
        * The ID of the person
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

        public GetPersonSearchResponseAllOfDataItemsInnerItemQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The type of the item
        * @return type
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        public String getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(String type) {
            this.type = type;
        }

        public GetPersonSearchResponseAllOfDataItemsInnerItemQueryParam type(String type) {
            this.type = type;
            return this;
        }

        /**
        * The name of the person
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

        public GetPersonSearchResponseAllOfDataItemsInnerItemQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * An array of phone numbers
        * @return phones
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("phones")
        public List<String> getPhones() {
            return phones;
        }

        /**
         * Set phones
         **/
        public void setPhones(List<String> phones) {
            this.phones = phones;
        }

        public GetPersonSearchResponseAllOfDataItemsInnerItemQueryParam phones(List<String> phones) {
            this.phones = phones;
            return this;
        }
        public GetPersonSearchResponseAllOfDataItemsInnerItemQueryParam addPhonesItem(String phonesItem) {
            this.phones.add(phonesItem);
            return this;
        }

        /**
        * An array of email addresses
        * @return emails
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("emails")
        public List<String> getEmails() {
            return emails;
        }

        /**
         * Set emails
         **/
        public void setEmails(List<String> emails) {
            this.emails = emails;
        }

        public GetPersonSearchResponseAllOfDataItemsInnerItemQueryParam emails(List<String> emails) {
            this.emails = emails;
            return this;
        }
        public GetPersonSearchResponseAllOfDataItemsInnerItemQueryParam addEmailsItem(String emailsItem) {
            this.emails.add(emailsItem);
            return this;
        }

        /**
        * The visibility of the person
        * @return visibleTo
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("visible_to")
        public Integer getVisibleTo() {
            return visibleTo;
        }

        /**
         * Set visibleTo
         **/
        public void setVisibleTo(Integer visibleTo) {
            this.visibleTo = visibleTo;
        }

        public GetPersonSearchResponseAllOfDataItemsInnerItemQueryParam visibleTo(Integer visibleTo) {
            this.visibleTo = visibleTo;
            return this;
        }

        /**
        * Get owner
        * @return owner
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        public GetPersonSearchResponseAllOfDataItemsInnerItemOwner getOwner() {
            return owner;
        }

        /**
         * Set owner
         **/
        public void setOwner(GetPersonSearchResponseAllOfDataItemsInnerItemOwner owner) {
            this.owner = owner;
        }

        public GetPersonSearchResponseAllOfDataItemsInnerItemQueryParam owner(GetPersonSearchResponseAllOfDataItemsInnerItemOwner owner) {
            this.owner = owner;
            return this;
        }

        /**
        * Get organization
        * @return organization
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("organization")
        public GetPersonSearchResponseAllOfDataItemsInnerItemOrganization getOrganization() {
            return organization;
        }

        /**
         * Set organization
         **/
        public void setOrganization(GetPersonSearchResponseAllOfDataItemsInnerItemOrganization organization) {
            this.organization = organization;
        }

        public GetPersonSearchResponseAllOfDataItemsInnerItemQueryParam organization(GetPersonSearchResponseAllOfDataItemsInnerItemOrganization organization) {
            this.organization = organization;
            return this;
        }

        /**
        * Custom fields
        * @return customFields
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("custom_fields")
        public List<String> getCustomFields() {
            return customFields;
        }

        /**
         * Set customFields
         **/
        public void setCustomFields(List<String> customFields) {
            this.customFields = customFields;
        }

        public GetPersonSearchResponseAllOfDataItemsInnerItemQueryParam customFields(List<String> customFields) {
            this.customFields = customFields;
            return this;
        }
        public GetPersonSearchResponseAllOfDataItemsInnerItemQueryParam addCustomFieldsItem(String customFieldsItem) {
            this.customFields.add(customFieldsItem);
            return this;
        }

        /**
        * An array of notes
        * @return notes
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("notes")
        public List<String> getNotes() {
            return notes;
        }

        /**
         * Set notes
         **/
        public void setNotes(List<String> notes) {
            this.notes = notes;
        }

        public GetPersonSearchResponseAllOfDataItemsInnerItemQueryParam notes(List<String> notes) {
            this.notes = notes;
            return this;
        }
        public GetPersonSearchResponseAllOfDataItemsInnerItemQueryParam addNotesItem(String notesItem) {
            this.notes.add(notesItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetPersonSearchResponseAllOfDataItemsInnerItemQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
            sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
            sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
            sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
            sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
            sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
            sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
