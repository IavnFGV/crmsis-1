package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetDealSearchResponseAllOfDataItemsInnerItemOwner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetOrganizationSearchResponseAllOfDataItemsInnerItem  {

    /**
      * The ID of the organization
     **/
    private Integer id;
    /**
      * The type of the item
     **/
    private String type;
    /**
      * The name of the organization
     **/
    private String name;
    /**
      * The address of the organization
     **/
    private String address;
    /**
      * The visibility of the organization
     **/
    private Integer visibleTo;
    private GetDealSearchResponseAllOfDataItemsInnerItemOwner owner;
    /**
      * Custom fields
     **/
    private List<String> customFields;
    /**
      * An array of notes
     **/
    private List<String> notes;

    /**
    * The ID of the organization
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

    public GetOrganizationSearchResponseAllOfDataItemsInnerItem id(Integer id) {
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

    public GetOrganizationSearchResponseAllOfDataItemsInnerItem type(String type) {
        this.type = type;
        return this;
    }

    /**
    * The name of the organization
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

    public GetOrganizationSearchResponseAllOfDataItemsInnerItem name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The address of the organization
    * @return address
    **/
    @JsonProperty("address")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getAddress() {
        return address;
    }

    /**
     * Set address
     **/
    public void setAddress(String address) {
        this.address = address;
    }

    public GetOrganizationSearchResponseAllOfDataItemsInnerItem address(String address) {
        this.address = address;
        return this;
    }

    /**
    * The visibility of the organization
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

    public GetOrganizationSearchResponseAllOfDataItemsInnerItem visibleTo(Integer visibleTo) {
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

    public GetOrganizationSearchResponseAllOfDataItemsInnerItem owner(GetDealSearchResponseAllOfDataItemsInnerItemOwner owner) {
        this.owner = owner;
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

    public GetOrganizationSearchResponseAllOfDataItemsInnerItem customFields(List<String> customFields) {
        this.customFields = customFields;
        return this;
    }
    public GetOrganizationSearchResponseAllOfDataItemsInnerItem addCustomFieldsItem(String customFieldsItem) {
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

    public GetOrganizationSearchResponseAllOfDataItemsInnerItem notes(List<String> notes) {
        this.notes = notes;
        return this;
    }
    public GetOrganizationSearchResponseAllOfDataItemsInnerItem addNotesItem(String notesItem) {
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
        sb.append("class GetOrganizationSearchResponseAllOfDataItemsInnerItem {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetOrganizationSearchResponseAllOfDataItemsInnerItem} object that
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

        GetOrganizationSearchResponseAllOfDataItemsInnerItem model = (GetOrganizationSearchResponseAllOfDataItemsInnerItem) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(type, model.type) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(address, model.address) &&
        java.util.Objects.equals(visibleTo, model.visibleTo) &&
        java.util.Objects.equals(owner, model.owner) &&
        java.util.Objects.equals(customFields, model.customFields) &&
        java.util.Objects.equals(notes, model.notes);
    }

    /**
     * Returns a hash code for a {@code GetOrganizationSearchResponseAllOfDataItemsInnerItem}.
     *
     * @return a hash code value for a {@code GetOrganizationSearchResponseAllOfDataItemsInnerItem}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        type,
        name,
        address,
        visibleTo,
        owner,
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
    public static class GetOrganizationSearchResponseAllOfDataItemsInnerItemQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("type")
        private String type;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("address")
        private String address;
        @jakarta.ws.rs.QueryParam("visibleTo")
        private Integer visibleTo;
        @jakarta.ws.rs.QueryParam("owner")
        private GetDealSearchResponseAllOfDataItemsInnerItemOwner owner;
        @jakarta.ws.rs.QueryParam("customFields")
        private List<String> customFields = null;
        @jakarta.ws.rs.QueryParam("notes")
        private List<String> notes = null;

        /**
        * The ID of the organization
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

        public GetOrganizationSearchResponseAllOfDataItemsInnerItemQueryParam id(Integer id) {
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

        public GetOrganizationSearchResponseAllOfDataItemsInnerItemQueryParam type(String type) {
            this.type = type;
            return this;
        }

        /**
        * The name of the organization
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

        public GetOrganizationSearchResponseAllOfDataItemsInnerItemQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The address of the organization
        * @return address
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("address")
        public String getAddress() {
            return address;
        }

        /**
         * Set address
         **/
        public void setAddress(String address) {
            this.address = address;
        }

        public GetOrganizationSearchResponseAllOfDataItemsInnerItemQueryParam address(String address) {
            this.address = address;
            return this;
        }

        /**
        * The visibility of the organization
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

        public GetOrganizationSearchResponseAllOfDataItemsInnerItemQueryParam visibleTo(Integer visibleTo) {
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

        public GetOrganizationSearchResponseAllOfDataItemsInnerItemQueryParam owner(GetDealSearchResponseAllOfDataItemsInnerItemOwner owner) {
            this.owner = owner;
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

        public GetOrganizationSearchResponseAllOfDataItemsInnerItemQueryParam customFields(List<String> customFields) {
            this.customFields = customFields;
            return this;
        }
        public GetOrganizationSearchResponseAllOfDataItemsInnerItemQueryParam addCustomFieldsItem(String customFieldsItem) {
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

        public GetOrganizationSearchResponseAllOfDataItemsInnerItemQueryParam notes(List<String> notes) {
            this.notes = notes;
            return this;
        }
        public GetOrganizationSearchResponseAllOfDataItemsInnerItemQueryParam addNotesItem(String notesItem) {
            this.notes.add(notesItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetOrganizationSearchResponseAllOfDataItemsInnerItemQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    address: ").append(toIndentedString(address)).append("\n");
            sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
            sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
