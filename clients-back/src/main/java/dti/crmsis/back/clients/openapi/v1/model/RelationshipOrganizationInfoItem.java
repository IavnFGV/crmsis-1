package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class RelationshipOrganizationInfoItem  {

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
      * The ID of the organization
     **/
    private Integer value;

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

    public RelationshipOrganizationInfoItem name(String name) {
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

    public RelationshipOrganizationInfoItem peopleCount(Integer peopleCount) {
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

    public RelationshipOrganizationInfoItem ownerId(Integer ownerId) {
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

    public RelationshipOrganizationInfoItem address(String address) {
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

    public RelationshipOrganizationInfoItem ccEmail(String ccEmail) {
        this.ccEmail = ccEmail;
        return this;
    }

    /**
    * The ID of the organization
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

    public RelationshipOrganizationInfoItem value(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelationshipOrganizationInfoItem {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    peopleCount: ").append(toIndentedString(peopleCount)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    ccEmail: ").append(toIndentedString(ccEmail)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code RelationshipOrganizationInfoItem} object that
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

        RelationshipOrganizationInfoItem model = (RelationshipOrganizationInfoItem) obj;

        return java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(peopleCount, model.peopleCount) &&
        java.util.Objects.equals(ownerId, model.ownerId) &&
        java.util.Objects.equals(address, model.address) &&
        java.util.Objects.equals(ccEmail, model.ccEmail) &&
        java.util.Objects.equals(value, model.value);
    }

    /**
     * Returns a hash code for a {@code RelationshipOrganizationInfoItem}.
     *
     * @return a hash code value for a {@code RelationshipOrganizationInfoItem}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,
        peopleCount,
        ownerId,
        address,
        ccEmail,
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
    public static class RelationshipOrganizationInfoItemQueryParam  {

        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("peopleCount")
        private Integer peopleCount;
        @jakarta.ws.rs.QueryParam("ownerId")
        private Integer ownerId;
        @jakarta.ws.rs.QueryParam("address")
        private String address;
        @jakarta.ws.rs.QueryParam("ccEmail")
        private String ccEmail;
        @jakarta.ws.rs.QueryParam("value")
        private Integer value;

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

        public RelationshipOrganizationInfoItemQueryParam name(String name) {
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

        public RelationshipOrganizationInfoItemQueryParam peopleCount(Integer peopleCount) {
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

        public RelationshipOrganizationInfoItemQueryParam ownerId(Integer ownerId) {
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

        public RelationshipOrganizationInfoItemQueryParam address(String address) {
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

        public RelationshipOrganizationInfoItemQueryParam ccEmail(String ccEmail) {
            this.ccEmail = ccEmail;
            return this;
        }

        /**
        * The ID of the organization
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

        public RelationshipOrganizationInfoItemQueryParam value(Integer value) {
            this.value = value;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class RelationshipOrganizationInfoItemQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    peopleCount: ").append(toIndentedString(peopleCount)).append("\n");
            sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
            sb.append("    address: ").append(toIndentedString(address)).append("\n");
            sb.append("    ccEmail: ").append(toIndentedString(ccEmail)).append("\n");
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
