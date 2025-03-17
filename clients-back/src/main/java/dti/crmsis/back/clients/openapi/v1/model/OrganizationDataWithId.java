package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The ID of the organization associated with the item
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class OrganizationDataWithId  {

    /**
      * The ID of the organization associated with the item
     **/
    private Integer id;
    /**
      * The name of the organization associated with the item
     **/
    private String name;
    /**
      * The number of people connected with the organization that is associated with the item
     **/
    private Integer peopleCount;
    /**
      * The ID of the owner of the organization that is associated with the item
     **/
    private Integer ownerId;
    /**
      * The address of the organization
     **/
    private String address;
    /**
      * The BCC email of the organization associated with the item
     **/
    private String ccEmail;

    /**
    * The ID of the organization associated with the item
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

    public OrganizationDataWithId id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The name of the organization associated with the item
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

    public OrganizationDataWithId name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The number of people connected with the organization that is associated with the item
    * @return peopleCount
    **/
    @JsonProperty("people_count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getPeopleCount() {
        return peopleCount;
    }

    /**
     * Set peopleCount
     **/
    public void setPeopleCount(Integer peopleCount) {
        this.peopleCount = peopleCount;
    }

    public OrganizationDataWithId peopleCount(Integer peopleCount) {
        this.peopleCount = peopleCount;
        return this;
    }

    /**
    * The ID of the owner of the organization that is associated with the item
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

    public OrganizationDataWithId ownerId(Integer ownerId) {
        this.ownerId = ownerId;
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

    public OrganizationDataWithId address(String address) {
        this.address = address;
        return this;
    }

    /**
    * The BCC email of the organization associated with the item
    * @return ccEmail
    **/
    @JsonProperty("cc_email")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getCcEmail() {
        return ccEmail;
    }

    /**
     * Set ccEmail
     **/
    public void setCcEmail(String ccEmail) {
        this.ccEmail = ccEmail;
    }

    public OrganizationDataWithId ccEmail(String ccEmail) {
        this.ccEmail = ccEmail;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationDataWithId {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    peopleCount: ").append(toIndentedString(peopleCount)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    ccEmail: ").append(toIndentedString(ccEmail)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code OrganizationDataWithId} object that
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

        OrganizationDataWithId model = (OrganizationDataWithId) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(peopleCount, model.peopleCount) &&
        java.util.Objects.equals(ownerId, model.ownerId) &&
        java.util.Objects.equals(address, model.address) &&
        java.util.Objects.equals(ccEmail, model.ccEmail);
    }

    /**
     * Returns a hash code for a {@code OrganizationDataWithId}.
     *
     * @return a hash code value for a {@code OrganizationDataWithId}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        name,
        peopleCount,
        ownerId,
        address,
        ccEmail);
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
      * The ID of the organization associated with the item
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class OrganizationDataWithIdQueryParam  {

        /**
          * The ID of the organization associated with the item
         **/
        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        /**
          * The ID of the organization associated with the item
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * The ID of the organization associated with the item
         **/
        @jakarta.ws.rs.QueryParam("peopleCount")
        private Integer peopleCount;
        /**
          * The ID of the organization associated with the item
         **/
        @jakarta.ws.rs.QueryParam("ownerId")
        private Integer ownerId;
        /**
          * The ID of the organization associated with the item
         **/
        @jakarta.ws.rs.QueryParam("address")
        private String address;
        /**
          * The ID of the organization associated with the item
         **/
        @jakarta.ws.rs.QueryParam("ccEmail")
        private String ccEmail;

        /**
        * The ID of the organization associated with the item
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

        public OrganizationDataWithIdQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The name of the organization associated with the item
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

        public OrganizationDataWithIdQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The number of people connected with the organization that is associated with the item
        * @return peopleCount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("people_count")
        public Integer getPeopleCount() {
            return peopleCount;
        }

        /**
         * Set peopleCount
         **/
        public void setPeopleCount(Integer peopleCount) {
            this.peopleCount = peopleCount;
        }

        public OrganizationDataWithIdQueryParam peopleCount(Integer peopleCount) {
            this.peopleCount = peopleCount;
            return this;
        }

        /**
        * The ID of the owner of the organization that is associated with the item
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

        public OrganizationDataWithIdQueryParam ownerId(Integer ownerId) {
            this.ownerId = ownerId;
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

        public OrganizationDataWithIdQueryParam address(String address) {
            this.address = address;
            return this;
        }

        /**
        * The BCC email of the organization associated with the item
        * @return ccEmail
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("cc_email")
        public String getCcEmail() {
            return ccEmail;
        }

        /**
         * Set ccEmail
         **/
        public void setCcEmail(String ccEmail) {
            this.ccEmail = ccEmail;
        }

        public OrganizationDataWithIdQueryParam ccEmail(String ccEmail) {
            this.ccEmail = ccEmail;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class OrganizationDataWithIdQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    peopleCount: ").append(toIndentedString(peopleCount)).append("\n");
            sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
            sb.append("    address: ").append(toIndentedString(address)).append("\n");
            sb.append("    ccEmail: ").append(toIndentedString(ccEmail)).append("\n");
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
