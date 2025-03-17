package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class DealOrganizationDataWithId  {

    /**
      * The name of the organization associated with the deal
     **/
    private String name;
    /**
      * The number of people connected with the organization that is associated with the deal
     **/
    private Integer peopleCount;
    /**
      * The ID of the owner of the organization that is associated with the deal
     **/
    private Integer ownerId;
    /**
      * The address of the organization that is associated with the deal
     **/
    private String address;
    /**
      * Whether the associated organization is active or not
     **/
    private Boolean activeFlag;
    /**
      * The BCC email of the organization associated with the deal
     **/
    private String ccEmail;
    /**
      * The ID of the organization associated with the deal
     **/
    private Integer value;

    /**
    * The name of the organization associated with the deal
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

    public DealOrganizationDataWithId name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The number of people connected with the organization that is associated with the deal
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

    public DealOrganizationDataWithId peopleCount(Integer peopleCount) {
        this.peopleCount = peopleCount;
        return this;
    }

    /**
    * The ID of the owner of the organization that is associated with the deal
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

    public DealOrganizationDataWithId ownerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
    * The address of the organization that is associated with the deal
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

    public DealOrganizationDataWithId address(String address) {
        this.address = address;
        return this;
    }

    /**
    * Whether the associated organization is active or not
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

    public DealOrganizationDataWithId activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * The BCC email of the organization associated with the deal
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

    public DealOrganizationDataWithId ccEmail(String ccEmail) {
        this.ccEmail = ccEmail;
        return this;
    }

    /**
    * The ID of the organization associated with the deal
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

    public DealOrganizationDataWithId value(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DealOrganizationDataWithId {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    peopleCount: ").append(toIndentedString(peopleCount)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    ccEmail: ").append(toIndentedString(ccEmail)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code DealOrganizationDataWithId} object that
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

        DealOrganizationDataWithId model = (DealOrganizationDataWithId) obj;

        return java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(peopleCount, model.peopleCount) &&
        java.util.Objects.equals(ownerId, model.ownerId) &&
        java.util.Objects.equals(address, model.address) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(ccEmail, model.ccEmail) &&
        java.util.Objects.equals(value, model.value);
    }

    /**
     * Returns a hash code for a {@code DealOrganizationDataWithId}.
     *
     * @return a hash code value for a {@code DealOrganizationDataWithId}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,
        peopleCount,
        ownerId,
        address,
        activeFlag,
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
    public static class DealOrganizationDataWithIdQueryParam  {

        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("peopleCount")
        private Integer peopleCount;
        @jakarta.ws.rs.QueryParam("ownerId")
        private Integer ownerId;
        @jakarta.ws.rs.QueryParam("address")
        private String address;
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        @jakarta.ws.rs.QueryParam("ccEmail")
        private String ccEmail;
        @jakarta.ws.rs.QueryParam("value")
        private Integer value;

        /**
        * The name of the organization associated with the deal
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

        public DealOrganizationDataWithIdQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The number of people connected with the organization that is associated with the deal
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

        public DealOrganizationDataWithIdQueryParam peopleCount(Integer peopleCount) {
            this.peopleCount = peopleCount;
            return this;
        }

        /**
        * The ID of the owner of the organization that is associated with the deal
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

        public DealOrganizationDataWithIdQueryParam ownerId(Integer ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
        * The address of the organization that is associated with the deal
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

        public DealOrganizationDataWithIdQueryParam address(String address) {
            this.address = address;
            return this;
        }

        /**
        * Whether the associated organization is active or not
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

        public DealOrganizationDataWithIdQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * The BCC email of the organization associated with the deal
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

        public DealOrganizationDataWithIdQueryParam ccEmail(String ccEmail) {
            this.ccEmail = ccEmail;
            return this;
        }

        /**
        * The ID of the organization associated with the deal
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

        public DealOrganizationDataWithIdQueryParam value(Integer value) {
            this.value = value;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DealOrganizationDataWithIdQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    peopleCount: ").append(toIndentedString(peopleCount)).append("\n");
            sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
            sb.append("    address: ").append(toIndentedString(address)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
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
