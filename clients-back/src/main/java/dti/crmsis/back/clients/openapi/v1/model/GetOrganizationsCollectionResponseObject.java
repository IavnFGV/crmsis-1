package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetOrganizationsCollectionResponseObject  {

    /**
      * The full address of the organization
     **/
    private String address;
    /**
      * The sub-premise of the organization location
     **/
    private String addressSubpremise;
    /**
      * The street number of the organization location
     **/
    private String addressStreetNumber;
    /**
      * The route of the organization location
     **/
    private String addressRoute;
    /**
      * The sub-locality of the organization location
     **/
    private String addressSublocality;
    /**
      * The locality of the organization location
     **/
    private String addressLocality;
    /**
      * The level 1 admin area of the organization location
     **/
    private String addressAdminAreaLevel1;
    /**
      * The level 2 admin area of the organization location
     **/
    private String addressAdminAreaLevel2;
    /**
      * The country of the organization location
     **/
    private String addressCountry;
    /**
      * The postal code of the organization location
     **/
    private String addressPostalCode;
    /**
      * The formatted organization location
     **/
    private String addressFormattedAddress;
    /**
      * The ID of the organization
     **/
    private Integer id;
    /**
      * Whether the organization is active or not
     **/
    private Boolean activeFlag;
    /**
      * The ID of the owner
     **/
    private Integer ownerId;
    /**
      * The name of the organization
     **/
    private String name;
    /**
      * The last updated date and time of the organization. Format: YYYY-MM-DD HH:MM:SS
     **/
    private String updateTime;
    /**
      * The date and time this organization was deleted. Format: YYYY-MM-DD HH:MM:SS
     **/
    private String deleteTime;
    /**
      * The date and time when the organization was added/created. Format: YYYY-MM-DD HH:MM:SS
     **/
    private String addTime;
    /**
      * The visibility group ID of who can see the organization
     **/
    private String visibleTo;
    /**
      * The label assigned to the organization. When the `label` field is updated, the `label_ids` field value will be overwritten by the `label` field value.
     **/
    private Integer label;
    /**
      * The IDs of labels assigned to the organization. When the `label_ids` field is updated, the `label` field value will be set to the first value of the `label_ids` field.
     **/
    private List<Integer> labelIds;
    /**
      * The BCC email associated with the organization
     **/
    private String ccEmail;

    /**
    * The full address of the organization
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

    public GetOrganizationsCollectionResponseObject address(String address) {
        this.address = address;
        return this;
    }

    /**
    * The sub-premise of the organization location
    * @return addressSubpremise
    **/
    @JsonProperty("address_subpremise")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getAddressSubpremise() {
        return addressSubpremise;
    }

    /**
     * Set addressSubpremise
     **/
    public void setAddressSubpremise(String addressSubpremise) {
        this.addressSubpremise = addressSubpremise;
    }

    public GetOrganizationsCollectionResponseObject addressSubpremise(String addressSubpremise) {
        this.addressSubpremise = addressSubpremise;
        return this;
    }

    /**
    * The street number of the organization location
    * @return addressStreetNumber
    **/
    @JsonProperty("address_street_number")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getAddressStreetNumber() {
        return addressStreetNumber;
    }

    /**
     * Set addressStreetNumber
     **/
    public void setAddressStreetNumber(String addressStreetNumber) {
        this.addressStreetNumber = addressStreetNumber;
    }

    public GetOrganizationsCollectionResponseObject addressStreetNumber(String addressStreetNumber) {
        this.addressStreetNumber = addressStreetNumber;
        return this;
    }

    /**
    * The route of the organization location
    * @return addressRoute
    **/
    @JsonProperty("address_route")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getAddressRoute() {
        return addressRoute;
    }

    /**
     * Set addressRoute
     **/
    public void setAddressRoute(String addressRoute) {
        this.addressRoute = addressRoute;
    }

    public GetOrganizationsCollectionResponseObject addressRoute(String addressRoute) {
        this.addressRoute = addressRoute;
        return this;
    }

    /**
    * The sub-locality of the organization location
    * @return addressSublocality
    **/
    @JsonProperty("address_sublocality")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getAddressSublocality() {
        return addressSublocality;
    }

    /**
     * Set addressSublocality
     **/
    public void setAddressSublocality(String addressSublocality) {
        this.addressSublocality = addressSublocality;
    }

    public GetOrganizationsCollectionResponseObject addressSublocality(String addressSublocality) {
        this.addressSublocality = addressSublocality;
        return this;
    }

    /**
    * The locality of the organization location
    * @return addressLocality
    **/
    @JsonProperty("address_locality")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getAddressLocality() {
        return addressLocality;
    }

    /**
     * Set addressLocality
     **/
    public void setAddressLocality(String addressLocality) {
        this.addressLocality = addressLocality;
    }

    public GetOrganizationsCollectionResponseObject addressLocality(String addressLocality) {
        this.addressLocality = addressLocality;
        return this;
    }

    /**
    * The level 1 admin area of the organization location
    * @return addressAdminAreaLevel1
    **/
    @JsonProperty("address_admin_area_level_1")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getAddressAdminAreaLevel1() {
        return addressAdminAreaLevel1;
    }

    /**
     * Set addressAdminAreaLevel1
     **/
    public void setAddressAdminAreaLevel1(String addressAdminAreaLevel1) {
        this.addressAdminAreaLevel1 = addressAdminAreaLevel1;
    }

    public GetOrganizationsCollectionResponseObject addressAdminAreaLevel1(String addressAdminAreaLevel1) {
        this.addressAdminAreaLevel1 = addressAdminAreaLevel1;
        return this;
    }

    /**
    * The level 2 admin area of the organization location
    * @return addressAdminAreaLevel2
    **/
    @JsonProperty("address_admin_area_level_2")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getAddressAdminAreaLevel2() {
        return addressAdminAreaLevel2;
    }

    /**
     * Set addressAdminAreaLevel2
     **/
    public void setAddressAdminAreaLevel2(String addressAdminAreaLevel2) {
        this.addressAdminAreaLevel2 = addressAdminAreaLevel2;
    }

    public GetOrganizationsCollectionResponseObject addressAdminAreaLevel2(String addressAdminAreaLevel2) {
        this.addressAdminAreaLevel2 = addressAdminAreaLevel2;
        return this;
    }

    /**
    * The country of the organization location
    * @return addressCountry
    **/
    @JsonProperty("address_country")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getAddressCountry() {
        return addressCountry;
    }

    /**
     * Set addressCountry
     **/
    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public GetOrganizationsCollectionResponseObject addressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
        return this;
    }

    /**
    * The postal code of the organization location
    * @return addressPostalCode
    **/
    @JsonProperty("address_postal_code")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getAddressPostalCode() {
        return addressPostalCode;
    }

    /**
     * Set addressPostalCode
     **/
    public void setAddressPostalCode(String addressPostalCode) {
        this.addressPostalCode = addressPostalCode;
    }

    public GetOrganizationsCollectionResponseObject addressPostalCode(String addressPostalCode) {
        this.addressPostalCode = addressPostalCode;
        return this;
    }

    /**
    * The formatted organization location
    * @return addressFormattedAddress
    **/
    @JsonProperty("address_formatted_address")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getAddressFormattedAddress() {
        return addressFormattedAddress;
    }

    /**
     * Set addressFormattedAddress
     **/
    public void setAddressFormattedAddress(String addressFormattedAddress) {
        this.addressFormattedAddress = addressFormattedAddress;
    }

    public GetOrganizationsCollectionResponseObject addressFormattedAddress(String addressFormattedAddress) {
        this.addressFormattedAddress = addressFormattedAddress;
        return this;
    }

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

    public GetOrganizationsCollectionResponseObject id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * Whether the organization is active or not
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

    public GetOrganizationsCollectionResponseObject activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * The ID of the owner
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

    public GetOrganizationsCollectionResponseObject ownerId(Integer ownerId) {
        this.ownerId = ownerId;
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

    public GetOrganizationsCollectionResponseObject name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The last updated date and time of the organization. Format: YYYY-MM-DD HH:MM:SS
    * @return updateTime
    **/
    @JsonProperty("update_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Set updateTime
     **/
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public GetOrganizationsCollectionResponseObject updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
    * The date and time this organization was deleted. Format: YYYY-MM-DD HH:MM:SS
    * @return deleteTime
    **/
    @JsonProperty("delete_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDeleteTime() {
        return deleteTime;
    }

    /**
     * Set deleteTime
     **/
    public void setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
    }

    public GetOrganizationsCollectionResponseObject deleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    /**
    * The date and time when the organization was added/created. Format: YYYY-MM-DD HH:MM:SS
    * @return addTime
    **/
    @JsonProperty("add_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getAddTime() {
        return addTime;
    }

    /**
     * Set addTime
     **/
    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public GetOrganizationsCollectionResponseObject addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The visibility group ID of who can see the organization
    * @return visibleTo
    **/
    @JsonProperty("visible_to")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getVisibleTo() {
        return visibleTo;
    }

    /**
     * Set visibleTo
     **/
    public void setVisibleTo(String visibleTo) {
        this.visibleTo = visibleTo;
    }

    public GetOrganizationsCollectionResponseObject visibleTo(String visibleTo) {
        this.visibleTo = visibleTo;
        return this;
    }

    /**
    * The label assigned to the organization. When the `label` field is updated, the `label_ids` field value will be overwritten by the `label` field value.
    * @return label
    **/
    @JsonProperty("label")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getLabel() {
        return label;
    }

    /**
     * Set label
     **/
    public void setLabel(Integer label) {
        this.label = label;
    }

    public GetOrganizationsCollectionResponseObject label(Integer label) {
        this.label = label;
        return this;
    }

    /**
    * The IDs of labels assigned to the organization. When the `label_ids` field is updated, the `label` field value will be set to the first value of the `label_ids` field.
    * @return labelIds
    **/
    @JsonProperty("label_ids")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Integer> getLabelIds() {
        return labelIds;
    }

    /**
     * Set labelIds
     **/
    public void setLabelIds(List<Integer> labelIds) {
        this.labelIds = labelIds;
    }

    public GetOrganizationsCollectionResponseObject labelIds(List<Integer> labelIds) {
        this.labelIds = labelIds;
        return this;
    }
    public GetOrganizationsCollectionResponseObject addLabelIdsItem(Integer labelIdsItem) {
        if (this.labelIds == null){
            labelIds = new ArrayList<>();
        }
        this.labelIds.add(labelIdsItem);
        return this;
    }

    /**
    * The BCC email associated with the organization
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

    public GetOrganizationsCollectionResponseObject ccEmail(String ccEmail) {
        this.ccEmail = ccEmail;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOrganizationsCollectionResponseObject {\n");

        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    addressSubpremise: ").append(toIndentedString(addressSubpremise)).append("\n");
        sb.append("    addressStreetNumber: ").append(toIndentedString(addressStreetNumber)).append("\n");
        sb.append("    addressRoute: ").append(toIndentedString(addressRoute)).append("\n");
        sb.append("    addressSublocality: ").append(toIndentedString(addressSublocality)).append("\n");
        sb.append("    addressLocality: ").append(toIndentedString(addressLocality)).append("\n");
        sb.append("    addressAdminAreaLevel1: ").append(toIndentedString(addressAdminAreaLevel1)).append("\n");
        sb.append("    addressAdminAreaLevel2: ").append(toIndentedString(addressAdminAreaLevel2)).append("\n");
        sb.append("    addressCountry: ").append(toIndentedString(addressCountry)).append("\n");
        sb.append("    addressPostalCode: ").append(toIndentedString(addressPostalCode)).append("\n");
        sb.append("    addressFormattedAddress: ").append(toIndentedString(addressFormattedAddress)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    deleteTime: ").append(toIndentedString(deleteTime)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
        sb.append("    ccEmail: ").append(toIndentedString(ccEmail)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetOrganizationsCollectionResponseObject} object that
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

        GetOrganizationsCollectionResponseObject model = (GetOrganizationsCollectionResponseObject) obj;

        return java.util.Objects.equals(address, model.address) &&
        java.util.Objects.equals(addressSubpremise, model.addressSubpremise) &&
        java.util.Objects.equals(addressStreetNumber, model.addressStreetNumber) &&
        java.util.Objects.equals(addressRoute, model.addressRoute) &&
        java.util.Objects.equals(addressSublocality, model.addressSublocality) &&
        java.util.Objects.equals(addressLocality, model.addressLocality) &&
        java.util.Objects.equals(addressAdminAreaLevel1, model.addressAdminAreaLevel1) &&
        java.util.Objects.equals(addressAdminAreaLevel2, model.addressAdminAreaLevel2) &&
        java.util.Objects.equals(addressCountry, model.addressCountry) &&
        java.util.Objects.equals(addressPostalCode, model.addressPostalCode) &&
        java.util.Objects.equals(addressFormattedAddress, model.addressFormattedAddress) &&
        java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(ownerId, model.ownerId) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(updateTime, model.updateTime) &&
        java.util.Objects.equals(deleteTime, model.deleteTime) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(visibleTo, model.visibleTo) &&
        java.util.Objects.equals(label, model.label) &&
        java.util.Objects.equals(labelIds, model.labelIds) &&
        java.util.Objects.equals(ccEmail, model.ccEmail);
    }

    /**
     * Returns a hash code for a {@code GetOrganizationsCollectionResponseObject}.
     *
     * @return a hash code value for a {@code GetOrganizationsCollectionResponseObject}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(address,
        addressSubpremise,
        addressStreetNumber,
        addressRoute,
        addressSublocality,
        addressLocality,
        addressAdminAreaLevel1,
        addressAdminAreaLevel2,
        addressCountry,
        addressPostalCode,
        addressFormattedAddress,
        id,
        activeFlag,
        ownerId,
        name,
        updateTime,
        deleteTime,
        addTime,
        visibleTo,
        label,
        labelIds,
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

    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetOrganizationsCollectionResponseObjectQueryParam  {

        @jakarta.ws.rs.QueryParam("address")
        private String address;
        @jakarta.ws.rs.QueryParam("addressSubpremise")
        private String addressSubpremise;
        @jakarta.ws.rs.QueryParam("addressStreetNumber")
        private String addressStreetNumber;
        @jakarta.ws.rs.QueryParam("addressRoute")
        private String addressRoute;
        @jakarta.ws.rs.QueryParam("addressSublocality")
        private String addressSublocality;
        @jakarta.ws.rs.QueryParam("addressLocality")
        private String addressLocality;
        @jakarta.ws.rs.QueryParam("addressAdminAreaLevel1")
        private String addressAdminAreaLevel1;
        @jakarta.ws.rs.QueryParam("addressAdminAreaLevel2")
        private String addressAdminAreaLevel2;
        @jakarta.ws.rs.QueryParam("addressCountry")
        private String addressCountry;
        @jakarta.ws.rs.QueryParam("addressPostalCode")
        private String addressPostalCode;
        @jakarta.ws.rs.QueryParam("addressFormattedAddress")
        private String addressFormattedAddress;
        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        @jakarta.ws.rs.QueryParam("ownerId")
        private Integer ownerId;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("updateTime")
        private String updateTime;
        @jakarta.ws.rs.QueryParam("deleteTime")
        private String deleteTime;
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        @jakarta.ws.rs.QueryParam("visibleTo")
        private String visibleTo;
        @jakarta.ws.rs.QueryParam("label")
        private Integer label;
        @jakarta.ws.rs.QueryParam("labelIds")
        private List<Integer> labelIds = null;
        @jakarta.ws.rs.QueryParam("ccEmail")
        private String ccEmail;

        /**
        * The full address of the organization
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

        public GetOrganizationsCollectionResponseObjectQueryParam address(String address) {
            this.address = address;
            return this;
        }

        /**
        * The sub-premise of the organization location
        * @return addressSubpremise
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("address_subpremise")
        public String getAddressSubpremise() {
            return addressSubpremise;
        }

        /**
         * Set addressSubpremise
         **/
        public void setAddressSubpremise(String addressSubpremise) {
            this.addressSubpremise = addressSubpremise;
        }

        public GetOrganizationsCollectionResponseObjectQueryParam addressSubpremise(String addressSubpremise) {
            this.addressSubpremise = addressSubpremise;
            return this;
        }

        /**
        * The street number of the organization location
        * @return addressStreetNumber
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("address_street_number")
        public String getAddressStreetNumber() {
            return addressStreetNumber;
        }

        /**
         * Set addressStreetNumber
         **/
        public void setAddressStreetNumber(String addressStreetNumber) {
            this.addressStreetNumber = addressStreetNumber;
        }

        public GetOrganizationsCollectionResponseObjectQueryParam addressStreetNumber(String addressStreetNumber) {
            this.addressStreetNumber = addressStreetNumber;
            return this;
        }

        /**
        * The route of the organization location
        * @return addressRoute
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("address_route")
        public String getAddressRoute() {
            return addressRoute;
        }

        /**
         * Set addressRoute
         **/
        public void setAddressRoute(String addressRoute) {
            this.addressRoute = addressRoute;
        }

        public GetOrganizationsCollectionResponseObjectQueryParam addressRoute(String addressRoute) {
            this.addressRoute = addressRoute;
            return this;
        }

        /**
        * The sub-locality of the organization location
        * @return addressSublocality
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("address_sublocality")
        public String getAddressSublocality() {
            return addressSublocality;
        }

        /**
         * Set addressSublocality
         **/
        public void setAddressSublocality(String addressSublocality) {
            this.addressSublocality = addressSublocality;
        }

        public GetOrganizationsCollectionResponseObjectQueryParam addressSublocality(String addressSublocality) {
            this.addressSublocality = addressSublocality;
            return this;
        }

        /**
        * The locality of the organization location
        * @return addressLocality
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("address_locality")
        public String getAddressLocality() {
            return addressLocality;
        }

        /**
         * Set addressLocality
         **/
        public void setAddressLocality(String addressLocality) {
            this.addressLocality = addressLocality;
        }

        public GetOrganizationsCollectionResponseObjectQueryParam addressLocality(String addressLocality) {
            this.addressLocality = addressLocality;
            return this;
        }

        /**
        * The level 1 admin area of the organization location
        * @return addressAdminAreaLevel1
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("address_admin_area_level_1")
        public String getAddressAdminAreaLevel1() {
            return addressAdminAreaLevel1;
        }

        /**
         * Set addressAdminAreaLevel1
         **/
        public void setAddressAdminAreaLevel1(String addressAdminAreaLevel1) {
            this.addressAdminAreaLevel1 = addressAdminAreaLevel1;
        }

        public GetOrganizationsCollectionResponseObjectQueryParam addressAdminAreaLevel1(String addressAdminAreaLevel1) {
            this.addressAdminAreaLevel1 = addressAdminAreaLevel1;
            return this;
        }

        /**
        * The level 2 admin area of the organization location
        * @return addressAdminAreaLevel2
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("address_admin_area_level_2")
        public String getAddressAdminAreaLevel2() {
            return addressAdminAreaLevel2;
        }

        /**
         * Set addressAdminAreaLevel2
         **/
        public void setAddressAdminAreaLevel2(String addressAdminAreaLevel2) {
            this.addressAdminAreaLevel2 = addressAdminAreaLevel2;
        }

        public GetOrganizationsCollectionResponseObjectQueryParam addressAdminAreaLevel2(String addressAdminAreaLevel2) {
            this.addressAdminAreaLevel2 = addressAdminAreaLevel2;
            return this;
        }

        /**
        * The country of the organization location
        * @return addressCountry
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("address_country")
        public String getAddressCountry() {
            return addressCountry;
        }

        /**
         * Set addressCountry
         **/
        public void setAddressCountry(String addressCountry) {
            this.addressCountry = addressCountry;
        }

        public GetOrganizationsCollectionResponseObjectQueryParam addressCountry(String addressCountry) {
            this.addressCountry = addressCountry;
            return this;
        }

        /**
        * The postal code of the organization location
        * @return addressPostalCode
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("address_postal_code")
        public String getAddressPostalCode() {
            return addressPostalCode;
        }

        /**
         * Set addressPostalCode
         **/
        public void setAddressPostalCode(String addressPostalCode) {
            this.addressPostalCode = addressPostalCode;
        }

        public GetOrganizationsCollectionResponseObjectQueryParam addressPostalCode(String addressPostalCode) {
            this.addressPostalCode = addressPostalCode;
            return this;
        }

        /**
        * The formatted organization location
        * @return addressFormattedAddress
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("address_formatted_address")
        public String getAddressFormattedAddress() {
            return addressFormattedAddress;
        }

        /**
         * Set addressFormattedAddress
         **/
        public void setAddressFormattedAddress(String addressFormattedAddress) {
            this.addressFormattedAddress = addressFormattedAddress;
        }

        public GetOrganizationsCollectionResponseObjectQueryParam addressFormattedAddress(String addressFormattedAddress) {
            this.addressFormattedAddress = addressFormattedAddress;
            return this;
        }

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

        public GetOrganizationsCollectionResponseObjectQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * Whether the organization is active or not
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

        public GetOrganizationsCollectionResponseObjectQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * The ID of the owner
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

        public GetOrganizationsCollectionResponseObjectQueryParam ownerId(Integer ownerId) {
            this.ownerId = ownerId;
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

        public GetOrganizationsCollectionResponseObjectQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The last updated date and time of the organization. Format: YYYY-MM-DD HH:MM:SS
        * @return updateTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("update_time")
        public String getUpdateTime() {
            return updateTime;
        }

        /**
         * Set updateTime
         **/
        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public GetOrganizationsCollectionResponseObjectQueryParam updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
        * The date and time this organization was deleted. Format: YYYY-MM-DD HH:MM:SS
        * @return deleteTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("delete_time")
        public String getDeleteTime() {
            return deleteTime;
        }

        /**
         * Set deleteTime
         **/
        public void setDeleteTime(String deleteTime) {
            this.deleteTime = deleteTime;
        }

        public GetOrganizationsCollectionResponseObjectQueryParam deleteTime(String deleteTime) {
            this.deleteTime = deleteTime;
            return this;
        }

        /**
        * The date and time when the organization was added/created. Format: YYYY-MM-DD HH:MM:SS
        * @return addTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("add_time")
        public String getAddTime() {
            return addTime;
        }

        /**
         * Set addTime
         **/
        public void setAddTime(String addTime) {
            this.addTime = addTime;
        }

        public GetOrganizationsCollectionResponseObjectQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The visibility group ID of who can see the organization
        * @return visibleTo
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("visible_to")
        public String getVisibleTo() {
            return visibleTo;
        }

        /**
         * Set visibleTo
         **/
        public void setVisibleTo(String visibleTo) {
            this.visibleTo = visibleTo;
        }

        public GetOrganizationsCollectionResponseObjectQueryParam visibleTo(String visibleTo) {
            this.visibleTo = visibleTo;
            return this;
        }

        /**
        * The label assigned to the organization. When the `label` field is updated, the `label_ids` field value will be overwritten by the `label` field value.
        * @return label
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("label")
        public Integer getLabel() {
            return label;
        }

        /**
         * Set label
         **/
        public void setLabel(Integer label) {
            this.label = label;
        }

        public GetOrganizationsCollectionResponseObjectQueryParam label(Integer label) {
            this.label = label;
            return this;
        }

        /**
        * The IDs of labels assigned to the organization. When the `label_ids` field is updated, the `label` field value will be set to the first value of the `label_ids` field.
        * @return labelIds
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("label_ids")
        public List<Integer> getLabelIds() {
            return labelIds;
        }

        /**
         * Set labelIds
         **/
        public void setLabelIds(List<Integer> labelIds) {
            this.labelIds = labelIds;
        }

        public GetOrganizationsCollectionResponseObjectQueryParam labelIds(List<Integer> labelIds) {
            this.labelIds = labelIds;
            return this;
        }
        public GetOrganizationsCollectionResponseObjectQueryParam addLabelIdsItem(Integer labelIdsItem) {
            this.labelIds.add(labelIdsItem);
            return this;
        }

        /**
        * The BCC email associated with the organization
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

        public GetOrganizationsCollectionResponseObjectQueryParam ccEmail(String ccEmail) {
            this.ccEmail = ccEmail;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetOrganizationsCollectionResponseObjectQueryParam {\n");

            sb.append("    address: ").append(toIndentedString(address)).append("\n");
            sb.append("    addressSubpremise: ").append(toIndentedString(addressSubpremise)).append("\n");
            sb.append("    addressStreetNumber: ").append(toIndentedString(addressStreetNumber)).append("\n");
            sb.append("    addressRoute: ").append(toIndentedString(addressRoute)).append("\n");
            sb.append("    addressSublocality: ").append(toIndentedString(addressSublocality)).append("\n");
            sb.append("    addressLocality: ").append(toIndentedString(addressLocality)).append("\n");
            sb.append("    addressAdminAreaLevel1: ").append(toIndentedString(addressAdminAreaLevel1)).append("\n");
            sb.append("    addressAdminAreaLevel2: ").append(toIndentedString(addressAdminAreaLevel2)).append("\n");
            sb.append("    addressCountry: ").append(toIndentedString(addressCountry)).append("\n");
            sb.append("    addressPostalCode: ").append(toIndentedString(addressPostalCode)).append("\n");
            sb.append("    addressFormattedAddress: ").append(toIndentedString(addressFormattedAddress)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
            sb.append("    deleteTime: ").append(toIndentedString(deleteTime)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
            sb.append("    label: ").append(toIndentedString(label)).append("\n");
            sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
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
