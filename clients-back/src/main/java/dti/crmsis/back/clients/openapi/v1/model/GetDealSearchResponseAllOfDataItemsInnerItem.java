package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetDealSearchResponseAllOfDataItemsInnerItemOrganization;
import dti.crmsis.back.clients.openapi.v1.model.GetDealSearchResponseAllOfDataItemsInnerItemOwner;
import dti.crmsis.back.clients.openapi.v1.model.GetDealSearchResponseAllOfDataItemsInnerItemPerson;
import dti.crmsis.back.clients.openapi.v1.model.GetDealSearchResponseAllOfDataItemsInnerItemStage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetDealSearchResponseAllOfDataItemsInnerItem  {

    /**
      * The ID of the deal
     **/
    private Integer id;
    /**
      * The type of the item
     **/
    private String type;
    /**
      * The title of the deal
     **/
    private String title;
    /**
      * The value of the deal
     **/
    private Integer value;
    /**
      * The currency of the deal
     **/
    private String currency;
    /**
      * The status of the deal
     **/
    private String status;
    /**
      * The visibility of the deal
     **/
    private Integer visibleTo;
    private GetDealSearchResponseAllOfDataItemsInnerItemOwner owner;
    private GetDealSearchResponseAllOfDataItemsInnerItemStage stage;
    private GetDealSearchResponseAllOfDataItemsInnerItemPerson person;
    private GetDealSearchResponseAllOfDataItemsInnerItemOrganization organization;
    /**
      * Custom fields
     **/
    private List<String> customFields;
    /**
      * An array of notes
     **/
    private List<String> notes;

    /**
    * The ID of the deal
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

    public GetDealSearchResponseAllOfDataItemsInnerItem id(Integer id) {
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

    public GetDealSearchResponseAllOfDataItemsInnerItem type(String type) {
        this.type = type;
        return this;
    }

    /**
    * The title of the deal
    * @return title
    **/
    @JsonProperty("title")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTitle() {
        return title;
    }

    /**
     * Set title
     **/
    public void setTitle(String title) {
        this.title = title;
    }

    public GetDealSearchResponseAllOfDataItemsInnerItem title(String title) {
        this.title = title;
        return this;
    }

    /**
    * The value of the deal
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

    public GetDealSearchResponseAllOfDataItemsInnerItem value(Integer value) {
        this.value = value;
        return this;
    }

    /**
    * The currency of the deal
    * @return currency
    **/
    @JsonProperty("currency")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Set currency
     **/
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public GetDealSearchResponseAllOfDataItemsInnerItem currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
    * The status of the deal
    * @return status
    **/
    @JsonProperty("status")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Set status
     **/
    public void setStatus(String status) {
        this.status = status;
    }

    public GetDealSearchResponseAllOfDataItemsInnerItem status(String status) {
        this.status = status;
        return this;
    }

    /**
    * The visibility of the deal
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

    public GetDealSearchResponseAllOfDataItemsInnerItem visibleTo(Integer visibleTo) {
        this.visibleTo = visibleTo;
        return this;
    }

    /**
    * Get owner
    * @return owner
    **/
    @JsonProperty("owner")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetDealSearchResponseAllOfDataItemsInnerItemOwner getOwner() {
        return owner;
    }

    /**
     * Set owner
     **/
    public void setOwner(GetDealSearchResponseAllOfDataItemsInnerItemOwner owner) {
        this.owner = owner;
    }

    public GetDealSearchResponseAllOfDataItemsInnerItem owner(GetDealSearchResponseAllOfDataItemsInnerItemOwner owner) {
        this.owner = owner;
        return this;
    }

    /**
    * Get stage
    * @return stage
    **/
    @JsonProperty("stage")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetDealSearchResponseAllOfDataItemsInnerItemStage getStage() {
        return stage;
    }

    /**
     * Set stage
     **/
    public void setStage(GetDealSearchResponseAllOfDataItemsInnerItemStage stage) {
        this.stage = stage;
    }

    public GetDealSearchResponseAllOfDataItemsInnerItem stage(GetDealSearchResponseAllOfDataItemsInnerItemStage stage) {
        this.stage = stage;
        return this;
    }

    /**
    * Get person
    * @return person
    **/
    @JsonProperty("person")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetDealSearchResponseAllOfDataItemsInnerItemPerson getPerson() {
        return person;
    }

    /**
     * Set person
     **/
    public void setPerson(GetDealSearchResponseAllOfDataItemsInnerItemPerson person) {
        this.person = person;
    }

    public GetDealSearchResponseAllOfDataItemsInnerItem person(GetDealSearchResponseAllOfDataItemsInnerItemPerson person) {
        this.person = person;
        return this;
    }

    /**
    * Get organization
    * @return organization
    **/
    @JsonProperty("organization")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetDealSearchResponseAllOfDataItemsInnerItemOrganization getOrganization() {
        return organization;
    }

    /**
     * Set organization
     **/
    public void setOrganization(GetDealSearchResponseAllOfDataItemsInnerItemOrganization organization) {
        this.organization = organization;
    }

    public GetDealSearchResponseAllOfDataItemsInnerItem organization(GetDealSearchResponseAllOfDataItemsInnerItemOrganization organization) {
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

    public GetDealSearchResponseAllOfDataItemsInnerItem customFields(List<String> customFields) {
        this.customFields = customFields;
        return this;
    }
    public GetDealSearchResponseAllOfDataItemsInnerItem addCustomFieldsItem(String customFieldsItem) {
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

    public GetDealSearchResponseAllOfDataItemsInnerItem notes(List<String> notes) {
        this.notes = notes;
        return this;
    }
    public GetDealSearchResponseAllOfDataItemsInnerItem addNotesItem(String notesItem) {
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
        sb.append("class GetDealSearchResponseAllOfDataItemsInnerItem {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    person: ").append(toIndentedString(person)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetDealSearchResponseAllOfDataItemsInnerItem} object that
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

        GetDealSearchResponseAllOfDataItemsInnerItem model = (GetDealSearchResponseAllOfDataItemsInnerItem) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(type, model.type) &&
        java.util.Objects.equals(title, model.title) &&
        java.util.Objects.equals(value, model.value) &&
        java.util.Objects.equals(currency, model.currency) &&
        java.util.Objects.equals(status, model.status) &&
        java.util.Objects.equals(visibleTo, model.visibleTo) &&
        java.util.Objects.equals(owner, model.owner) &&
        java.util.Objects.equals(stage, model.stage) &&
        java.util.Objects.equals(person, model.person) &&
        java.util.Objects.equals(organization, model.organization) &&
        java.util.Objects.equals(customFields, model.customFields) &&
        java.util.Objects.equals(notes, model.notes);
    }

    /**
     * Returns a hash code for a {@code GetDealSearchResponseAllOfDataItemsInnerItem}.
     *
     * @return a hash code value for a {@code GetDealSearchResponseAllOfDataItemsInnerItem}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        type,
        title,
        value,
        currency,
        status,
        visibleTo,
        owner,
        stage,
        person,
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
    public static class GetDealSearchResponseAllOfDataItemsInnerItemQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("type")
        private String type;
        @jakarta.ws.rs.QueryParam("title")
        private String title;
        @jakarta.ws.rs.QueryParam("value")
        private Integer value;
        @jakarta.ws.rs.QueryParam("currency")
        private String currency;
        @jakarta.ws.rs.QueryParam("status")
        private String status;
        @jakarta.ws.rs.QueryParam("visibleTo")
        private Integer visibleTo;
        @jakarta.ws.rs.QueryParam("owner")
        private GetDealSearchResponseAllOfDataItemsInnerItemOwner owner;
        @jakarta.ws.rs.QueryParam("stage")
        private GetDealSearchResponseAllOfDataItemsInnerItemStage stage;
        @jakarta.ws.rs.QueryParam("person")
        private GetDealSearchResponseAllOfDataItemsInnerItemPerson person;
        @jakarta.ws.rs.QueryParam("organization")
        private GetDealSearchResponseAllOfDataItemsInnerItemOrganization organization;
        @jakarta.ws.rs.QueryParam("customFields")
        private List<String> customFields = null;
        @jakarta.ws.rs.QueryParam("notes")
        private List<String> notes = null;

        /**
        * The ID of the deal
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

        public GetDealSearchResponseAllOfDataItemsInnerItemQueryParam id(Integer id) {
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

        public GetDealSearchResponseAllOfDataItemsInnerItemQueryParam type(String type) {
            this.type = type;
            return this;
        }

        /**
        * The title of the deal
        * @return title
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("title")
        public String getTitle() {
            return title;
        }

        /**
         * Set title
         **/
        public void setTitle(String title) {
            this.title = title;
        }

        public GetDealSearchResponseAllOfDataItemsInnerItemQueryParam title(String title) {
            this.title = title;
            return this;
        }

        /**
        * The value of the deal
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

        public GetDealSearchResponseAllOfDataItemsInnerItemQueryParam value(Integer value) {
            this.value = value;
            return this;
        }

        /**
        * The currency of the deal
        * @return currency
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("currency")
        public String getCurrency() {
            return currency;
        }

        /**
         * Set currency
         **/
        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public GetDealSearchResponseAllOfDataItemsInnerItemQueryParam currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
        * The status of the deal
        * @return status
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        public String getStatus() {
            return status;
        }

        /**
         * Set status
         **/
        public void setStatus(String status) {
            this.status = status;
        }

        public GetDealSearchResponseAllOfDataItemsInnerItemQueryParam status(String status) {
            this.status = status;
            return this;
        }

        /**
        * The visibility of the deal
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

        public GetDealSearchResponseAllOfDataItemsInnerItemQueryParam visibleTo(Integer visibleTo) {
            this.visibleTo = visibleTo;
            return this;
        }

        /**
        * Get owner
        * @return owner
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        public GetDealSearchResponseAllOfDataItemsInnerItemOwner getOwner() {
            return owner;
        }

        /**
         * Set owner
         **/
        public void setOwner(GetDealSearchResponseAllOfDataItemsInnerItemOwner owner) {
            this.owner = owner;
        }

        public GetDealSearchResponseAllOfDataItemsInnerItemQueryParam owner(GetDealSearchResponseAllOfDataItemsInnerItemOwner owner) {
            this.owner = owner;
            return this;
        }

        /**
        * Get stage
        * @return stage
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("stage")
        public GetDealSearchResponseAllOfDataItemsInnerItemStage getStage() {
            return stage;
        }

        /**
         * Set stage
         **/
        public void setStage(GetDealSearchResponseAllOfDataItemsInnerItemStage stage) {
            this.stage = stage;
        }

        public GetDealSearchResponseAllOfDataItemsInnerItemQueryParam stage(GetDealSearchResponseAllOfDataItemsInnerItemStage stage) {
            this.stage = stage;
            return this;
        }

        /**
        * Get person
        * @return person
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("person")
        public GetDealSearchResponseAllOfDataItemsInnerItemPerson getPerson() {
            return person;
        }

        /**
         * Set person
         **/
        public void setPerson(GetDealSearchResponseAllOfDataItemsInnerItemPerson person) {
            this.person = person;
        }

        public GetDealSearchResponseAllOfDataItemsInnerItemQueryParam person(GetDealSearchResponseAllOfDataItemsInnerItemPerson person) {
            this.person = person;
            return this;
        }

        /**
        * Get organization
        * @return organization
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("organization")
        public GetDealSearchResponseAllOfDataItemsInnerItemOrganization getOrganization() {
            return organization;
        }

        /**
         * Set organization
         **/
        public void setOrganization(GetDealSearchResponseAllOfDataItemsInnerItemOrganization organization) {
            this.organization = organization;
        }

        public GetDealSearchResponseAllOfDataItemsInnerItemQueryParam organization(GetDealSearchResponseAllOfDataItemsInnerItemOrganization organization) {
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

        public GetDealSearchResponseAllOfDataItemsInnerItemQueryParam customFields(List<String> customFields) {
            this.customFields = customFields;
            return this;
        }
        public GetDealSearchResponseAllOfDataItemsInnerItemQueryParam addCustomFieldsItem(String customFieldsItem) {
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

        public GetDealSearchResponseAllOfDataItemsInnerItemQueryParam notes(List<String> notes) {
            this.notes = notes;
            return this;
        }
        public GetDealSearchResponseAllOfDataItemsInnerItemQueryParam addNotesItem(String notesItem) {
            this.notes.add(notesItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetDealSearchResponseAllOfDataItemsInnerItemQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    title: ").append(toIndentedString(title)).append("\n");
            sb.append("    value: ").append(toIndentedString(value)).append("\n");
            sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
            sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
            sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
            sb.append("    person: ").append(toIndentedString(person)).append("\n");
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
