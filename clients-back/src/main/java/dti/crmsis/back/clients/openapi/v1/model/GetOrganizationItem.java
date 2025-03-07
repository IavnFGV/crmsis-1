package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.BaseOrganizationItemAllOfPictureId;
import dti.crmsis.back.clients.openapi.v1.model.Owner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetOrganizationItem  {

    /**
      * The ID of the organization
     **/
    private Integer id;
    /**
      * The ID of the company related to the organization
     **/
    private Integer companyId;
    private Owner ownerId;
    /**
      * The name of the organization
     **/
    private String name;
    /**
      * Whether the organization is active or not
     **/
    private Boolean activeFlag;
    private BaseOrganizationItemAllOfPictureId pictureId;
    /**
      * The country code of the organization
     **/
    private String countryCode;
    /**
      * The first character of the organization name
     **/
    private String firstChar;
    /**
      * The creation date and time of the organization
     **/
    private String addTime;
    /**
      * The last updated date and time of the organization
     **/
    private String updateTime;
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
      * The name of the organization owner
     **/
    private String ownerName;
    /**
      * The BCC email associated with the organization
     **/
    private String ccEmail;
    /**
      * The count of email messages related to the organization
     **/
    private Integer emailMessagesCount;
    /**
      * The count of persons related to the organization
     **/
    private Integer peopleCount;
    /**
      * The count of activities related to the organization
     **/
    private Integer activitiesCount;
    /**
      * The count of done activities related to the organization
     **/
    private Integer doneActivitiesCount;
    /**
      * The count of undone activities related to the organization
     **/
    private Integer undoneActivitiesCount;
    /**
      * The count of files related to the organization
     **/
    private Integer filesCount;
    /**
      * The count of notes related to the organization
     **/
    private Integer notesCount;
    /**
      * The count of followers related to the organization
     **/
    private Integer followersCount;
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
      * The count of open deals related with the item
     **/
    private Integer openDealsCount;
    /**
      * The count of related open deals related with the item
     **/
    private Integer relatedOpenDealsCount;
    /**
      * The count of closed deals related with the item
     **/
    private Integer closedDealsCount;
    /**
      * The count of related closed deals related with the item
     **/
    private Integer relatedClosedDealsCount;
    /**
      * The count of won deals related with the item
     **/
    private Integer wonDealsCount;
    /**
      * The count of related won deals related with the item
     **/
    private Integer relatedWonDealsCount;
    /**
      * The count of lost deals related with the item
     **/
    private Integer lostDealsCount;
    /**
      * The count of related lost deals related with the item
     **/
    private Integer relatedLostDealsCount;
    /**
      * The date of the next activity associated with the deal
     **/
    private String nextActivityDate;
    /**
      * The time of the next activity associated with the deal
     **/
    private String nextActivityTime;
    /**
      * The ID of the next activity associated with the deal
     **/
    private Integer nextActivityId;
    /**
      * The ID of the last activity associated with the deal
     **/
    private Integer lastActivityId;
    /**
      * The date of the last activity associated with the deal
     **/
    private String lastActivityDate;
    /**
      * If the company ID of the organization and company ID of the request is same or not
     **/
    private Boolean editName;
    /**
      * Please refer to response schema of <a href=\"https://developers.pipedrive.com/docs/api/v1/Activities#getActivity\">Activity</a>
     **/
    private Object lastActivity;
    /**
      * Please refer to response schema of <a href=\"https://developers.pipedrive.com/docs/api/v1/Activities#getActivity\">Activity</a>
     **/
    private Object nextActivity;

    /**
    * The ID of the organization
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

    public GetOrganizationItem id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The ID of the company related to the organization
    * @return companyId
    **/
    @JsonProperty("company_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * Set companyId
     **/
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public GetOrganizationItem companyId(Integer companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
    * Get ownerId
    * @return ownerId
    **/
    @JsonProperty("owner_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Owner getOwnerId() {
        return ownerId;
    }

    /**
     * Set ownerId
     **/
    public void setOwnerId(Owner ownerId) {
        this.ownerId = ownerId;
    }

    public GetOrganizationItem ownerId(Owner ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
    * The name of the organization
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

    public GetOrganizationItem name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Whether the organization is active or not
    * @return activeFlag
    **/
    @JsonProperty("active_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getActiveFlag() {
        return activeFlag;
    }

    /**
     * Set activeFlag
     **/
    public void setActiveFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
    }

    public GetOrganizationItem activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * Get pictureId
    * @return pictureId
    **/
    @JsonProperty("picture_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BaseOrganizationItemAllOfPictureId getPictureId() {
        return pictureId;
    }

    /**
     * Set pictureId
     **/
    public void setPictureId(BaseOrganizationItemAllOfPictureId pictureId) {
        this.pictureId = pictureId;
    }

    public GetOrganizationItem pictureId(BaseOrganizationItemAllOfPictureId pictureId) {
        this.pictureId = pictureId;
        return this;
    }

    /**
    * The country code of the organization
    * @return countryCode
    **/
    @JsonProperty("country_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Set countryCode
     **/
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public GetOrganizationItem countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
    * The first character of the organization name
    * @return firstChar
    **/
    @JsonProperty("first_char")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFirstChar() {
        return firstChar;
    }

    /**
     * Set firstChar
     **/
    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar;
    }

    public GetOrganizationItem firstChar(String firstChar) {
        this.firstChar = firstChar;
        return this;
    }

    /**
    * The creation date and time of the organization
    * @return addTime
    **/
    @JsonProperty("add_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddTime() {
        return addTime;
    }

    /**
     * Set addTime
     **/
    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public GetOrganizationItem addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The last updated date and time of the organization
    * @return updateTime
    **/
    @JsonProperty("update_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Set updateTime
     **/
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public GetOrganizationItem updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
    * The visibility group ID of who can see the organization
    * @return visibleTo
    **/
    @JsonProperty("visible_to")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVisibleTo() {
        return visibleTo;
    }

    /**
     * Set visibleTo
     **/
    public void setVisibleTo(String visibleTo) {
        this.visibleTo = visibleTo;
    }

    public GetOrganizationItem visibleTo(String visibleTo) {
        this.visibleTo = visibleTo;
        return this;
    }

    /**
    * The label assigned to the organization. When the `label` field is updated, the `label_ids` field value will be overwritten by the `label` field value.
    * @return label
    **/
    @JsonProperty("label")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getLabel() {
        return label;
    }

    /**
     * Set label
     **/
    public void setLabel(Integer label) {
        this.label = label;
    }

    public GetOrganizationItem label(Integer label) {
        this.label = label;
        return this;
    }

    /**
    * The IDs of labels assigned to the organization. When the `label_ids` field is updated, the `label` field value will be set to the first value of the `label_ids` field.
    * @return labelIds
    **/
    @JsonProperty("label_ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getLabelIds() {
        return labelIds;
    }

    /**
     * Set labelIds
     **/
    public void setLabelIds(List<Integer> labelIds) {
        this.labelIds = labelIds;
    }

    public GetOrganizationItem labelIds(List<Integer> labelIds) {
        this.labelIds = labelIds;
        return this;
    }
    public GetOrganizationItem addLabelIdsItem(Integer labelIdsItem) {
        if (this.labelIds == null){
            labelIds = new ArrayList<>();
        }
        this.labelIds.add(labelIdsItem);
        return this;
    }

    /**
    * The name of the organization owner
    * @return ownerName
    **/
    @JsonProperty("owner_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Set ownerName
     **/
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public GetOrganizationItem ownerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    /**
    * The BCC email associated with the organization
    * @return ccEmail
    **/
    @JsonProperty("cc_email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCcEmail() {
        return ccEmail;
    }

    /**
     * Set ccEmail
     **/
    public void setCcEmail(String ccEmail) {
        this.ccEmail = ccEmail;
    }

    public GetOrganizationItem ccEmail(String ccEmail) {
        this.ccEmail = ccEmail;
        return this;
    }

    /**
    * The count of email messages related to the organization
    * @return emailMessagesCount
    **/
    @JsonProperty("email_messages_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getEmailMessagesCount() {
        return emailMessagesCount;
    }

    /**
     * Set emailMessagesCount
     **/
    public void setEmailMessagesCount(Integer emailMessagesCount) {
        this.emailMessagesCount = emailMessagesCount;
    }

    public GetOrganizationItem emailMessagesCount(Integer emailMessagesCount) {
        this.emailMessagesCount = emailMessagesCount;
        return this;
    }

    /**
    * The count of persons related to the organization
    * @return peopleCount
    **/
    @JsonProperty("people_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPeopleCount() {
        return peopleCount;
    }

    /**
     * Set peopleCount
     **/
    public void setPeopleCount(Integer peopleCount) {
        this.peopleCount = peopleCount;
    }

    public GetOrganizationItem peopleCount(Integer peopleCount) {
        this.peopleCount = peopleCount;
        return this;
    }

    /**
    * The count of activities related to the organization
    * @return activitiesCount
    **/
    @JsonProperty("activities_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getActivitiesCount() {
        return activitiesCount;
    }

    /**
     * Set activitiesCount
     **/
    public void setActivitiesCount(Integer activitiesCount) {
        this.activitiesCount = activitiesCount;
    }

    public GetOrganizationItem activitiesCount(Integer activitiesCount) {
        this.activitiesCount = activitiesCount;
        return this;
    }

    /**
    * The count of done activities related to the organization
    * @return doneActivitiesCount
    **/
    @JsonProperty("done_activities_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getDoneActivitiesCount() {
        return doneActivitiesCount;
    }

    /**
     * Set doneActivitiesCount
     **/
    public void setDoneActivitiesCount(Integer doneActivitiesCount) {
        this.doneActivitiesCount = doneActivitiesCount;
    }

    public GetOrganizationItem doneActivitiesCount(Integer doneActivitiesCount) {
        this.doneActivitiesCount = doneActivitiesCount;
        return this;
    }

    /**
    * The count of undone activities related to the organization
    * @return undoneActivitiesCount
    **/
    @JsonProperty("undone_activities_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getUndoneActivitiesCount() {
        return undoneActivitiesCount;
    }

    /**
     * Set undoneActivitiesCount
     **/
    public void setUndoneActivitiesCount(Integer undoneActivitiesCount) {
        this.undoneActivitiesCount = undoneActivitiesCount;
    }

    public GetOrganizationItem undoneActivitiesCount(Integer undoneActivitiesCount) {
        this.undoneActivitiesCount = undoneActivitiesCount;
        return this;
    }

    /**
    * The count of files related to the organization
    * @return filesCount
    **/
    @JsonProperty("files_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getFilesCount() {
        return filesCount;
    }

    /**
     * Set filesCount
     **/
    public void setFilesCount(Integer filesCount) {
        this.filesCount = filesCount;
    }

    public GetOrganizationItem filesCount(Integer filesCount) {
        this.filesCount = filesCount;
        return this;
    }

    /**
    * The count of notes related to the organization
    * @return notesCount
    **/
    @JsonProperty("notes_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNotesCount() {
        return notesCount;
    }

    /**
     * Set notesCount
     **/
    public void setNotesCount(Integer notesCount) {
        this.notesCount = notesCount;
    }

    public GetOrganizationItem notesCount(Integer notesCount) {
        this.notesCount = notesCount;
        return this;
    }

    /**
    * The count of followers related to the organization
    * @return followersCount
    **/
    @JsonProperty("followers_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getFollowersCount() {
        return followersCount;
    }

    /**
     * Set followersCount
     **/
    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    public GetOrganizationItem followersCount(Integer followersCount) {
        this.followersCount = followersCount;
        return this;
    }

    /**
    * The full address of the organization
    * @return address
    **/
    @JsonProperty("address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddress() {
        return address;
    }

    /**
     * Set address
     **/
    public void setAddress(String address) {
        this.address = address;
    }

    public GetOrganizationItem address(String address) {
        this.address = address;
        return this;
    }

    /**
    * The sub-premise of the organization location
    * @return addressSubpremise
    **/
    @JsonProperty("address_subpremise")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressSubpremise() {
        return addressSubpremise;
    }

    /**
     * Set addressSubpremise
     **/
    public void setAddressSubpremise(String addressSubpremise) {
        this.addressSubpremise = addressSubpremise;
    }

    public GetOrganizationItem addressSubpremise(String addressSubpremise) {
        this.addressSubpremise = addressSubpremise;
        return this;
    }

    /**
    * The street number of the organization location
    * @return addressStreetNumber
    **/
    @JsonProperty("address_street_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressStreetNumber() {
        return addressStreetNumber;
    }

    /**
     * Set addressStreetNumber
     **/
    public void setAddressStreetNumber(String addressStreetNumber) {
        this.addressStreetNumber = addressStreetNumber;
    }

    public GetOrganizationItem addressStreetNumber(String addressStreetNumber) {
        this.addressStreetNumber = addressStreetNumber;
        return this;
    }

    /**
    * The route of the organization location
    * @return addressRoute
    **/
    @JsonProperty("address_route")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressRoute() {
        return addressRoute;
    }

    /**
     * Set addressRoute
     **/
    public void setAddressRoute(String addressRoute) {
        this.addressRoute = addressRoute;
    }

    public GetOrganizationItem addressRoute(String addressRoute) {
        this.addressRoute = addressRoute;
        return this;
    }

    /**
    * The sub-locality of the organization location
    * @return addressSublocality
    **/
    @JsonProperty("address_sublocality")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressSublocality() {
        return addressSublocality;
    }

    /**
     * Set addressSublocality
     **/
    public void setAddressSublocality(String addressSublocality) {
        this.addressSublocality = addressSublocality;
    }

    public GetOrganizationItem addressSublocality(String addressSublocality) {
        this.addressSublocality = addressSublocality;
        return this;
    }

    /**
    * The locality of the organization location
    * @return addressLocality
    **/
    @JsonProperty("address_locality")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressLocality() {
        return addressLocality;
    }

    /**
     * Set addressLocality
     **/
    public void setAddressLocality(String addressLocality) {
        this.addressLocality = addressLocality;
    }

    public GetOrganizationItem addressLocality(String addressLocality) {
        this.addressLocality = addressLocality;
        return this;
    }

    /**
    * The level 1 admin area of the organization location
    * @return addressAdminAreaLevel1
    **/
    @JsonProperty("address_admin_area_level_1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressAdminAreaLevel1() {
        return addressAdminAreaLevel1;
    }

    /**
     * Set addressAdminAreaLevel1
     **/
    public void setAddressAdminAreaLevel1(String addressAdminAreaLevel1) {
        this.addressAdminAreaLevel1 = addressAdminAreaLevel1;
    }

    public GetOrganizationItem addressAdminAreaLevel1(String addressAdminAreaLevel1) {
        this.addressAdminAreaLevel1 = addressAdminAreaLevel1;
        return this;
    }

    /**
    * The level 2 admin area of the organization location
    * @return addressAdminAreaLevel2
    **/
    @JsonProperty("address_admin_area_level_2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressAdminAreaLevel2() {
        return addressAdminAreaLevel2;
    }

    /**
     * Set addressAdminAreaLevel2
     **/
    public void setAddressAdminAreaLevel2(String addressAdminAreaLevel2) {
        this.addressAdminAreaLevel2 = addressAdminAreaLevel2;
    }

    public GetOrganizationItem addressAdminAreaLevel2(String addressAdminAreaLevel2) {
        this.addressAdminAreaLevel2 = addressAdminAreaLevel2;
        return this;
    }

    /**
    * The country of the organization location
    * @return addressCountry
    **/
    @JsonProperty("address_country")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressCountry() {
        return addressCountry;
    }

    /**
     * Set addressCountry
     **/
    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public GetOrganizationItem addressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
        return this;
    }

    /**
    * The postal code of the organization location
    * @return addressPostalCode
    **/
    @JsonProperty("address_postal_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressPostalCode() {
        return addressPostalCode;
    }

    /**
     * Set addressPostalCode
     **/
    public void setAddressPostalCode(String addressPostalCode) {
        this.addressPostalCode = addressPostalCode;
    }

    public GetOrganizationItem addressPostalCode(String addressPostalCode) {
        this.addressPostalCode = addressPostalCode;
        return this;
    }

    /**
    * The formatted organization location
    * @return addressFormattedAddress
    **/
    @JsonProperty("address_formatted_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressFormattedAddress() {
        return addressFormattedAddress;
    }

    /**
     * Set addressFormattedAddress
     **/
    public void setAddressFormattedAddress(String addressFormattedAddress) {
        this.addressFormattedAddress = addressFormattedAddress;
    }

    public GetOrganizationItem addressFormattedAddress(String addressFormattedAddress) {
        this.addressFormattedAddress = addressFormattedAddress;
        return this;
    }

    /**
    * The count of open deals related with the item
    * @return openDealsCount
    **/
    @JsonProperty("open_deals_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getOpenDealsCount() {
        return openDealsCount;
    }

    /**
     * Set openDealsCount
     **/
    public void setOpenDealsCount(Integer openDealsCount) {
        this.openDealsCount = openDealsCount;
    }

    public GetOrganizationItem openDealsCount(Integer openDealsCount) {
        this.openDealsCount = openDealsCount;
        return this;
    }

    /**
    * The count of related open deals related with the item
    * @return relatedOpenDealsCount
    **/
    @JsonProperty("related_open_deals_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getRelatedOpenDealsCount() {
        return relatedOpenDealsCount;
    }

    /**
     * Set relatedOpenDealsCount
     **/
    public void setRelatedOpenDealsCount(Integer relatedOpenDealsCount) {
        this.relatedOpenDealsCount = relatedOpenDealsCount;
    }

    public GetOrganizationItem relatedOpenDealsCount(Integer relatedOpenDealsCount) {
        this.relatedOpenDealsCount = relatedOpenDealsCount;
        return this;
    }

    /**
    * The count of closed deals related with the item
    * @return closedDealsCount
    **/
    @JsonProperty("closed_deals_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getClosedDealsCount() {
        return closedDealsCount;
    }

    /**
     * Set closedDealsCount
     **/
    public void setClosedDealsCount(Integer closedDealsCount) {
        this.closedDealsCount = closedDealsCount;
    }

    public GetOrganizationItem closedDealsCount(Integer closedDealsCount) {
        this.closedDealsCount = closedDealsCount;
        return this;
    }

    /**
    * The count of related closed deals related with the item
    * @return relatedClosedDealsCount
    **/
    @JsonProperty("related_closed_deals_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getRelatedClosedDealsCount() {
        return relatedClosedDealsCount;
    }

    /**
     * Set relatedClosedDealsCount
     **/
    public void setRelatedClosedDealsCount(Integer relatedClosedDealsCount) {
        this.relatedClosedDealsCount = relatedClosedDealsCount;
    }

    public GetOrganizationItem relatedClosedDealsCount(Integer relatedClosedDealsCount) {
        this.relatedClosedDealsCount = relatedClosedDealsCount;
        return this;
    }

    /**
    * The count of won deals related with the item
    * @return wonDealsCount
    **/
    @JsonProperty("won_deals_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getWonDealsCount() {
        return wonDealsCount;
    }

    /**
     * Set wonDealsCount
     **/
    public void setWonDealsCount(Integer wonDealsCount) {
        this.wonDealsCount = wonDealsCount;
    }

    public GetOrganizationItem wonDealsCount(Integer wonDealsCount) {
        this.wonDealsCount = wonDealsCount;
        return this;
    }

    /**
    * The count of related won deals related with the item
    * @return relatedWonDealsCount
    **/
    @JsonProperty("related_won_deals_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getRelatedWonDealsCount() {
        return relatedWonDealsCount;
    }

    /**
     * Set relatedWonDealsCount
     **/
    public void setRelatedWonDealsCount(Integer relatedWonDealsCount) {
        this.relatedWonDealsCount = relatedWonDealsCount;
    }

    public GetOrganizationItem relatedWonDealsCount(Integer relatedWonDealsCount) {
        this.relatedWonDealsCount = relatedWonDealsCount;
        return this;
    }

    /**
    * The count of lost deals related with the item
    * @return lostDealsCount
    **/
    @JsonProperty("lost_deals_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getLostDealsCount() {
        return lostDealsCount;
    }

    /**
     * Set lostDealsCount
     **/
    public void setLostDealsCount(Integer lostDealsCount) {
        this.lostDealsCount = lostDealsCount;
    }

    public GetOrganizationItem lostDealsCount(Integer lostDealsCount) {
        this.lostDealsCount = lostDealsCount;
        return this;
    }

    /**
    * The count of related lost deals related with the item
    * @return relatedLostDealsCount
    **/
    @JsonProperty("related_lost_deals_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getRelatedLostDealsCount() {
        return relatedLostDealsCount;
    }

    /**
     * Set relatedLostDealsCount
     **/
    public void setRelatedLostDealsCount(Integer relatedLostDealsCount) {
        this.relatedLostDealsCount = relatedLostDealsCount;
    }

    public GetOrganizationItem relatedLostDealsCount(Integer relatedLostDealsCount) {
        this.relatedLostDealsCount = relatedLostDealsCount;
        return this;
    }

    /**
    * The date of the next activity associated with the deal
    * @return nextActivityDate
    **/
    @JsonProperty("next_activity_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNextActivityDate() {
        return nextActivityDate;
    }

    /**
     * Set nextActivityDate
     **/
    public void setNextActivityDate(String nextActivityDate) {
        this.nextActivityDate = nextActivityDate;
    }

    public GetOrganizationItem nextActivityDate(String nextActivityDate) {
        this.nextActivityDate = nextActivityDate;
        return this;
    }

    /**
    * The time of the next activity associated with the deal
    * @return nextActivityTime
    **/
    @JsonProperty("next_activity_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNextActivityTime() {
        return nextActivityTime;
    }

    /**
     * Set nextActivityTime
     **/
    public void setNextActivityTime(String nextActivityTime) {
        this.nextActivityTime = nextActivityTime;
    }

    public GetOrganizationItem nextActivityTime(String nextActivityTime) {
        this.nextActivityTime = nextActivityTime;
        return this;
    }

    /**
    * The ID of the next activity associated with the deal
    * @return nextActivityId
    **/
    @JsonProperty("next_activity_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNextActivityId() {
        return nextActivityId;
    }

    /**
     * Set nextActivityId
     **/
    public void setNextActivityId(Integer nextActivityId) {
        this.nextActivityId = nextActivityId;
    }

    public GetOrganizationItem nextActivityId(Integer nextActivityId) {
        this.nextActivityId = nextActivityId;
        return this;
    }

    /**
    * The ID of the last activity associated with the deal
    * @return lastActivityId
    **/
    @JsonProperty("last_activity_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getLastActivityId() {
        return lastActivityId;
    }

    /**
     * Set lastActivityId
     **/
    public void setLastActivityId(Integer lastActivityId) {
        this.lastActivityId = lastActivityId;
    }

    public GetOrganizationItem lastActivityId(Integer lastActivityId) {
        this.lastActivityId = lastActivityId;
        return this;
    }

    /**
    * The date of the last activity associated with the deal
    * @return lastActivityDate
    **/
    @JsonProperty("last_activity_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastActivityDate() {
        return lastActivityDate;
    }

    /**
     * Set lastActivityDate
     **/
    public void setLastActivityDate(String lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    public GetOrganizationItem lastActivityDate(String lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
        return this;
    }

    /**
    * If the company ID of the organization and company ID of the request is same or not
    * @return editName
    **/
    @JsonProperty("edit_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getEditName() {
        return editName;
    }

    /**
     * Set editName
     **/
    public void setEditName(Boolean editName) {
        this.editName = editName;
    }

    public GetOrganizationItem editName(Boolean editName) {
        this.editName = editName;
        return this;
    }

    /**
    * Please refer to response schema of <a href=\"https://developers.pipedrive.com/docs/api/v1/Activities#getActivity\">Activity</a>
    * @return lastActivity
    **/
    @JsonProperty("last_activity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getLastActivity() {
        return lastActivity;
    }

    /**
     * Set lastActivity
     **/
    public void setLastActivity(Object lastActivity) {
        this.lastActivity = lastActivity;
    }

    public GetOrganizationItem lastActivity(Object lastActivity) {
        this.lastActivity = lastActivity;
        return this;
    }

    /**
    * Please refer to response schema of <a href=\"https://developers.pipedrive.com/docs/api/v1/Activities#getActivity\">Activity</a>
    * @return nextActivity
    **/
    @JsonProperty("next_activity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getNextActivity() {
        return nextActivity;
    }

    /**
     * Set nextActivity
     **/
    public void setNextActivity(Object nextActivity) {
        this.nextActivity = nextActivity;
    }

    public GetOrganizationItem nextActivity(Object nextActivity) {
        this.nextActivity = nextActivity;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOrganizationItem {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    pictureId: ").append(toIndentedString(pictureId)).append("\n");
        sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
        sb.append("    firstChar: ").append(toIndentedString(firstChar)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
        sb.append("    ccEmail: ").append(toIndentedString(ccEmail)).append("\n");
        sb.append("    emailMessagesCount: ").append(toIndentedString(emailMessagesCount)).append("\n");
        sb.append("    peopleCount: ").append(toIndentedString(peopleCount)).append("\n");
        sb.append("    activitiesCount: ").append(toIndentedString(activitiesCount)).append("\n");
        sb.append("    doneActivitiesCount: ").append(toIndentedString(doneActivitiesCount)).append("\n");
        sb.append("    undoneActivitiesCount: ").append(toIndentedString(undoneActivitiesCount)).append("\n");
        sb.append("    filesCount: ").append(toIndentedString(filesCount)).append("\n");
        sb.append("    notesCount: ").append(toIndentedString(notesCount)).append("\n");
        sb.append("    followersCount: ").append(toIndentedString(followersCount)).append("\n");
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
        sb.append("    openDealsCount: ").append(toIndentedString(openDealsCount)).append("\n");
        sb.append("    relatedOpenDealsCount: ").append(toIndentedString(relatedOpenDealsCount)).append("\n");
        sb.append("    closedDealsCount: ").append(toIndentedString(closedDealsCount)).append("\n");
        sb.append("    relatedClosedDealsCount: ").append(toIndentedString(relatedClosedDealsCount)).append("\n");
        sb.append("    wonDealsCount: ").append(toIndentedString(wonDealsCount)).append("\n");
        sb.append("    relatedWonDealsCount: ").append(toIndentedString(relatedWonDealsCount)).append("\n");
        sb.append("    lostDealsCount: ").append(toIndentedString(lostDealsCount)).append("\n");
        sb.append("    relatedLostDealsCount: ").append(toIndentedString(relatedLostDealsCount)).append("\n");
        sb.append("    nextActivityDate: ").append(toIndentedString(nextActivityDate)).append("\n");
        sb.append("    nextActivityTime: ").append(toIndentedString(nextActivityTime)).append("\n");
        sb.append("    nextActivityId: ").append(toIndentedString(nextActivityId)).append("\n");
        sb.append("    lastActivityId: ").append(toIndentedString(lastActivityId)).append("\n");
        sb.append("    lastActivityDate: ").append(toIndentedString(lastActivityDate)).append("\n");
        sb.append("    editName: ").append(toIndentedString(editName)).append("\n");
        sb.append("    lastActivity: ").append(toIndentedString(lastActivity)).append("\n");
        sb.append("    nextActivity: ").append(toIndentedString(nextActivity)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetOrganizationItem} object that
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

        GetOrganizationItem model = (GetOrganizationItem) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(companyId, model.companyId) &&
        java.util.Objects.equals(ownerId, model.ownerId) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(pictureId, model.pictureId) &&
        java.util.Objects.equals(countryCode, model.countryCode) &&
        java.util.Objects.equals(firstChar, model.firstChar) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime) &&
        java.util.Objects.equals(visibleTo, model.visibleTo) &&
        java.util.Objects.equals(label, model.label) &&
        java.util.Objects.equals(labelIds, model.labelIds) &&
        java.util.Objects.equals(ownerName, model.ownerName) &&
        java.util.Objects.equals(ccEmail, model.ccEmail) &&
        java.util.Objects.equals(emailMessagesCount, model.emailMessagesCount) &&
        java.util.Objects.equals(peopleCount, model.peopleCount) &&
        java.util.Objects.equals(activitiesCount, model.activitiesCount) &&
        java.util.Objects.equals(doneActivitiesCount, model.doneActivitiesCount) &&
        java.util.Objects.equals(undoneActivitiesCount, model.undoneActivitiesCount) &&
        java.util.Objects.equals(filesCount, model.filesCount) &&
        java.util.Objects.equals(notesCount, model.notesCount) &&
        java.util.Objects.equals(followersCount, model.followersCount) &&
        java.util.Objects.equals(address, model.address) &&
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
        java.util.Objects.equals(openDealsCount, model.openDealsCount) &&
        java.util.Objects.equals(relatedOpenDealsCount, model.relatedOpenDealsCount) &&
        java.util.Objects.equals(closedDealsCount, model.closedDealsCount) &&
        java.util.Objects.equals(relatedClosedDealsCount, model.relatedClosedDealsCount) &&
        java.util.Objects.equals(wonDealsCount, model.wonDealsCount) &&
        java.util.Objects.equals(relatedWonDealsCount, model.relatedWonDealsCount) &&
        java.util.Objects.equals(lostDealsCount, model.lostDealsCount) &&
        java.util.Objects.equals(relatedLostDealsCount, model.relatedLostDealsCount) &&
        java.util.Objects.equals(nextActivityDate, model.nextActivityDate) &&
        java.util.Objects.equals(nextActivityTime, model.nextActivityTime) &&
        java.util.Objects.equals(nextActivityId, model.nextActivityId) &&
        java.util.Objects.equals(lastActivityId, model.lastActivityId) &&
        java.util.Objects.equals(lastActivityDate, model.lastActivityDate) &&
        java.util.Objects.equals(editName, model.editName) &&
        java.util.Objects.equals(lastActivity, model.lastActivity) &&
        java.util.Objects.equals(nextActivity, model.nextActivity);
    }

    /**
     * Returns a hash code for a {@code GetOrganizationItem}.
     *
     * @return a hash code value for a {@code GetOrganizationItem}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        companyId,
        ownerId,
        name,
        activeFlag,
        pictureId,
        countryCode,
        firstChar,
        addTime,
        updateTime,
        visibleTo,
        label,
        labelIds,
        ownerName,
        ccEmail,
        emailMessagesCount,
        peopleCount,
        activitiesCount,
        doneActivitiesCount,
        undoneActivitiesCount,
        filesCount,
        notesCount,
        followersCount,
        address,
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
        openDealsCount,
        relatedOpenDealsCount,
        closedDealsCount,
        relatedClosedDealsCount,
        wonDealsCount,
        relatedWonDealsCount,
        lostDealsCount,
        relatedLostDealsCount,
        nextActivityDate,
        nextActivityTime,
        nextActivityId,
        lastActivityId,
        lastActivityDate,
        editName,
        lastActivity,
        nextActivity);
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
    public static class GetOrganizationItemQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("companyId")
        private Integer companyId;
        @jakarta.ws.rs.QueryParam("ownerId")
        private Owner ownerId;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        @jakarta.ws.rs.QueryParam("pictureId")
        private BaseOrganizationItemAllOfPictureId pictureId;
        @jakarta.ws.rs.QueryParam("countryCode")
        private String countryCode;
        @jakarta.ws.rs.QueryParam("firstChar")
        private String firstChar;
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        @jakarta.ws.rs.QueryParam("updateTime")
        private String updateTime;
        @jakarta.ws.rs.QueryParam("visibleTo")
        private String visibleTo;
        @jakarta.ws.rs.QueryParam("label")
        private Integer label;
        @jakarta.ws.rs.QueryParam("labelIds")
        private List<Integer> labelIds = null;
        @jakarta.ws.rs.QueryParam("ownerName")
        private String ownerName;
        @jakarta.ws.rs.QueryParam("ccEmail")
        private String ccEmail;
        @jakarta.ws.rs.QueryParam("emailMessagesCount")
        private Integer emailMessagesCount;
        @jakarta.ws.rs.QueryParam("peopleCount")
        private Integer peopleCount;
        @jakarta.ws.rs.QueryParam("activitiesCount")
        private Integer activitiesCount;
        @jakarta.ws.rs.QueryParam("doneActivitiesCount")
        private Integer doneActivitiesCount;
        @jakarta.ws.rs.QueryParam("undoneActivitiesCount")
        private Integer undoneActivitiesCount;
        @jakarta.ws.rs.QueryParam("filesCount")
        private Integer filesCount;
        @jakarta.ws.rs.QueryParam("notesCount")
        private Integer notesCount;
        @jakarta.ws.rs.QueryParam("followersCount")
        private Integer followersCount;
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
        @jakarta.ws.rs.QueryParam("openDealsCount")
        private Integer openDealsCount;
        @jakarta.ws.rs.QueryParam("relatedOpenDealsCount")
        private Integer relatedOpenDealsCount;
        @jakarta.ws.rs.QueryParam("closedDealsCount")
        private Integer closedDealsCount;
        @jakarta.ws.rs.QueryParam("relatedClosedDealsCount")
        private Integer relatedClosedDealsCount;
        @jakarta.ws.rs.QueryParam("wonDealsCount")
        private Integer wonDealsCount;
        @jakarta.ws.rs.QueryParam("relatedWonDealsCount")
        private Integer relatedWonDealsCount;
        @jakarta.ws.rs.QueryParam("lostDealsCount")
        private Integer lostDealsCount;
        @jakarta.ws.rs.QueryParam("relatedLostDealsCount")
        private Integer relatedLostDealsCount;
        @jakarta.ws.rs.QueryParam("nextActivityDate")
        private String nextActivityDate;
        @jakarta.ws.rs.QueryParam("nextActivityTime")
        private String nextActivityTime;
        @jakarta.ws.rs.QueryParam("nextActivityId")
        private Integer nextActivityId;
        @jakarta.ws.rs.QueryParam("lastActivityId")
        private Integer lastActivityId;
        @jakarta.ws.rs.QueryParam("lastActivityDate")
        private String lastActivityDate;
        @jakarta.ws.rs.QueryParam("editName")
        private Boolean editName;
        @jakarta.ws.rs.QueryParam("lastActivity")
        private Object lastActivity;
        @jakarta.ws.rs.QueryParam("nextActivity")
        private Object nextActivity;

        /**
        * The ID of the organization
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

        public GetOrganizationItemQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The ID of the company related to the organization
        * @return companyId
        **/
        @JsonProperty("company_id")
        public Integer getCompanyId() {
            return companyId;
        }

        /**
         * Set companyId
         **/
        public void setCompanyId(Integer companyId) {
            this.companyId = companyId;
        }

        public GetOrganizationItemQueryParam companyId(Integer companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
        * Get ownerId
        * @return ownerId
        **/
        @JsonProperty("owner_id")
        public Owner getOwnerId() {
            return ownerId;
        }

        /**
         * Set ownerId
         **/
        public void setOwnerId(Owner ownerId) {
            this.ownerId = ownerId;
        }

        public GetOrganizationItemQueryParam ownerId(Owner ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
        * The name of the organization
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

        public GetOrganizationItemQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Whether the organization is active or not
        * @return activeFlag
        **/
        @JsonProperty("active_flag")
        public Boolean getActiveFlag() {
            return activeFlag;
        }

        /**
         * Set activeFlag
         **/
        public void setActiveFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
        }

        public GetOrganizationItemQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * Get pictureId
        * @return pictureId
        **/
        @JsonProperty("picture_id")
        public BaseOrganizationItemAllOfPictureId getPictureId() {
            return pictureId;
        }

        /**
         * Set pictureId
         **/
        public void setPictureId(BaseOrganizationItemAllOfPictureId pictureId) {
            this.pictureId = pictureId;
        }

        public GetOrganizationItemQueryParam pictureId(BaseOrganizationItemAllOfPictureId pictureId) {
            this.pictureId = pictureId;
            return this;
        }

        /**
        * The country code of the organization
        * @return countryCode
        **/
        @JsonProperty("country_code")
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * Set countryCode
         **/
        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public GetOrganizationItemQueryParam countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        /**
        * The first character of the organization name
        * @return firstChar
        **/
        @JsonProperty("first_char")
        public String getFirstChar() {
            return firstChar;
        }

        /**
         * Set firstChar
         **/
        public void setFirstChar(String firstChar) {
            this.firstChar = firstChar;
        }

        public GetOrganizationItemQueryParam firstChar(String firstChar) {
            this.firstChar = firstChar;
            return this;
        }

        /**
        * The creation date and time of the organization
        * @return addTime
        **/
        @JsonProperty("add_time")
        public String getAddTime() {
            return addTime;
        }

        /**
         * Set addTime
         **/
        public void setAddTime(String addTime) {
            this.addTime = addTime;
        }

        public GetOrganizationItemQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The last updated date and time of the organization
        * @return updateTime
        **/
        @JsonProperty("update_time")
        public String getUpdateTime() {
            return updateTime;
        }

        /**
         * Set updateTime
         **/
        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public GetOrganizationItemQueryParam updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
        * The visibility group ID of who can see the organization
        * @return visibleTo
        **/
        @JsonProperty("visible_to")
        public String getVisibleTo() {
            return visibleTo;
        }

        /**
         * Set visibleTo
         **/
        public void setVisibleTo(String visibleTo) {
            this.visibleTo = visibleTo;
        }

        public GetOrganizationItemQueryParam visibleTo(String visibleTo) {
            this.visibleTo = visibleTo;
            return this;
        }

        /**
        * The label assigned to the organization. When the `label` field is updated, the `label_ids` field value will be overwritten by the `label` field value.
        * @return label
        **/
        @JsonProperty("label")
        public Integer getLabel() {
            return label;
        }

        /**
         * Set label
         **/
        public void setLabel(Integer label) {
            this.label = label;
        }

        public GetOrganizationItemQueryParam label(Integer label) {
            this.label = label;
            return this;
        }

        /**
        * The IDs of labels assigned to the organization. When the `label_ids` field is updated, the `label` field value will be set to the first value of the `label_ids` field.
        * @return labelIds
        **/
        @JsonProperty("label_ids")
        public List<Integer> getLabelIds() {
            return labelIds;
        }

        /**
         * Set labelIds
         **/
        public void setLabelIds(List<Integer> labelIds) {
            this.labelIds = labelIds;
        }

        public GetOrganizationItemQueryParam labelIds(List<Integer> labelIds) {
            this.labelIds = labelIds;
            return this;
        }
        public GetOrganizationItemQueryParam addLabelIdsItem(Integer labelIdsItem) {
            this.labelIds.add(labelIdsItem);
            return this;
        }

        /**
        * The name of the organization owner
        * @return ownerName
        **/
        @JsonProperty("owner_name")
        public String getOwnerName() {
            return ownerName;
        }

        /**
         * Set ownerName
         **/
        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }

        public GetOrganizationItemQueryParam ownerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }

        /**
        * The BCC email associated with the organization
        * @return ccEmail
        **/
        @JsonProperty("cc_email")
        public String getCcEmail() {
            return ccEmail;
        }

        /**
         * Set ccEmail
         **/
        public void setCcEmail(String ccEmail) {
            this.ccEmail = ccEmail;
        }

        public GetOrganizationItemQueryParam ccEmail(String ccEmail) {
            this.ccEmail = ccEmail;
            return this;
        }

        /**
        * The count of email messages related to the organization
        * @return emailMessagesCount
        **/
        @JsonProperty("email_messages_count")
        public Integer getEmailMessagesCount() {
            return emailMessagesCount;
        }

        /**
         * Set emailMessagesCount
         **/
        public void setEmailMessagesCount(Integer emailMessagesCount) {
            this.emailMessagesCount = emailMessagesCount;
        }

        public GetOrganizationItemQueryParam emailMessagesCount(Integer emailMessagesCount) {
            this.emailMessagesCount = emailMessagesCount;
            return this;
        }

        /**
        * The count of persons related to the organization
        * @return peopleCount
        **/
        @JsonProperty("people_count")
        public Integer getPeopleCount() {
            return peopleCount;
        }

        /**
         * Set peopleCount
         **/
        public void setPeopleCount(Integer peopleCount) {
            this.peopleCount = peopleCount;
        }

        public GetOrganizationItemQueryParam peopleCount(Integer peopleCount) {
            this.peopleCount = peopleCount;
            return this;
        }

        /**
        * The count of activities related to the organization
        * @return activitiesCount
        **/
        @JsonProperty("activities_count")
        public Integer getActivitiesCount() {
            return activitiesCount;
        }

        /**
         * Set activitiesCount
         **/
        public void setActivitiesCount(Integer activitiesCount) {
            this.activitiesCount = activitiesCount;
        }

        public GetOrganizationItemQueryParam activitiesCount(Integer activitiesCount) {
            this.activitiesCount = activitiesCount;
            return this;
        }

        /**
        * The count of done activities related to the organization
        * @return doneActivitiesCount
        **/
        @JsonProperty("done_activities_count")
        public Integer getDoneActivitiesCount() {
            return doneActivitiesCount;
        }

        /**
         * Set doneActivitiesCount
         **/
        public void setDoneActivitiesCount(Integer doneActivitiesCount) {
            this.doneActivitiesCount = doneActivitiesCount;
        }

        public GetOrganizationItemQueryParam doneActivitiesCount(Integer doneActivitiesCount) {
            this.doneActivitiesCount = doneActivitiesCount;
            return this;
        }

        /**
        * The count of undone activities related to the organization
        * @return undoneActivitiesCount
        **/
        @JsonProperty("undone_activities_count")
        public Integer getUndoneActivitiesCount() {
            return undoneActivitiesCount;
        }

        /**
         * Set undoneActivitiesCount
         **/
        public void setUndoneActivitiesCount(Integer undoneActivitiesCount) {
            this.undoneActivitiesCount = undoneActivitiesCount;
        }

        public GetOrganizationItemQueryParam undoneActivitiesCount(Integer undoneActivitiesCount) {
            this.undoneActivitiesCount = undoneActivitiesCount;
            return this;
        }

        /**
        * The count of files related to the organization
        * @return filesCount
        **/
        @JsonProperty("files_count")
        public Integer getFilesCount() {
            return filesCount;
        }

        /**
         * Set filesCount
         **/
        public void setFilesCount(Integer filesCount) {
            this.filesCount = filesCount;
        }

        public GetOrganizationItemQueryParam filesCount(Integer filesCount) {
            this.filesCount = filesCount;
            return this;
        }

        /**
        * The count of notes related to the organization
        * @return notesCount
        **/
        @JsonProperty("notes_count")
        public Integer getNotesCount() {
            return notesCount;
        }

        /**
         * Set notesCount
         **/
        public void setNotesCount(Integer notesCount) {
            this.notesCount = notesCount;
        }

        public GetOrganizationItemQueryParam notesCount(Integer notesCount) {
            this.notesCount = notesCount;
            return this;
        }

        /**
        * The count of followers related to the organization
        * @return followersCount
        **/
        @JsonProperty("followers_count")
        public Integer getFollowersCount() {
            return followersCount;
        }

        /**
         * Set followersCount
         **/
        public void setFollowersCount(Integer followersCount) {
            this.followersCount = followersCount;
        }

        public GetOrganizationItemQueryParam followersCount(Integer followersCount) {
            this.followersCount = followersCount;
            return this;
        }

        /**
        * The full address of the organization
        * @return address
        **/
        @JsonProperty("address")
        public String getAddress() {
            return address;
        }

        /**
         * Set address
         **/
        public void setAddress(String address) {
            this.address = address;
        }

        public GetOrganizationItemQueryParam address(String address) {
            this.address = address;
            return this;
        }

        /**
        * The sub-premise of the organization location
        * @return addressSubpremise
        **/
        @JsonProperty("address_subpremise")
        public String getAddressSubpremise() {
            return addressSubpremise;
        }

        /**
         * Set addressSubpremise
         **/
        public void setAddressSubpremise(String addressSubpremise) {
            this.addressSubpremise = addressSubpremise;
        }

        public GetOrganizationItemQueryParam addressSubpremise(String addressSubpremise) {
            this.addressSubpremise = addressSubpremise;
            return this;
        }

        /**
        * The street number of the organization location
        * @return addressStreetNumber
        **/
        @JsonProperty("address_street_number")
        public String getAddressStreetNumber() {
            return addressStreetNumber;
        }

        /**
         * Set addressStreetNumber
         **/
        public void setAddressStreetNumber(String addressStreetNumber) {
            this.addressStreetNumber = addressStreetNumber;
        }

        public GetOrganizationItemQueryParam addressStreetNumber(String addressStreetNumber) {
            this.addressStreetNumber = addressStreetNumber;
            return this;
        }

        /**
        * The route of the organization location
        * @return addressRoute
        **/
        @JsonProperty("address_route")
        public String getAddressRoute() {
            return addressRoute;
        }

        /**
         * Set addressRoute
         **/
        public void setAddressRoute(String addressRoute) {
            this.addressRoute = addressRoute;
        }

        public GetOrganizationItemQueryParam addressRoute(String addressRoute) {
            this.addressRoute = addressRoute;
            return this;
        }

        /**
        * The sub-locality of the organization location
        * @return addressSublocality
        **/
        @JsonProperty("address_sublocality")
        public String getAddressSublocality() {
            return addressSublocality;
        }

        /**
         * Set addressSublocality
         **/
        public void setAddressSublocality(String addressSublocality) {
            this.addressSublocality = addressSublocality;
        }

        public GetOrganizationItemQueryParam addressSublocality(String addressSublocality) {
            this.addressSublocality = addressSublocality;
            return this;
        }

        /**
        * The locality of the organization location
        * @return addressLocality
        **/
        @JsonProperty("address_locality")
        public String getAddressLocality() {
            return addressLocality;
        }

        /**
         * Set addressLocality
         **/
        public void setAddressLocality(String addressLocality) {
            this.addressLocality = addressLocality;
        }

        public GetOrganizationItemQueryParam addressLocality(String addressLocality) {
            this.addressLocality = addressLocality;
            return this;
        }

        /**
        * The level 1 admin area of the organization location
        * @return addressAdminAreaLevel1
        **/
        @JsonProperty("address_admin_area_level_1")
        public String getAddressAdminAreaLevel1() {
            return addressAdminAreaLevel1;
        }

        /**
         * Set addressAdminAreaLevel1
         **/
        public void setAddressAdminAreaLevel1(String addressAdminAreaLevel1) {
            this.addressAdminAreaLevel1 = addressAdminAreaLevel1;
        }

        public GetOrganizationItemQueryParam addressAdminAreaLevel1(String addressAdminAreaLevel1) {
            this.addressAdminAreaLevel1 = addressAdminAreaLevel1;
            return this;
        }

        /**
        * The level 2 admin area of the organization location
        * @return addressAdminAreaLevel2
        **/
        @JsonProperty("address_admin_area_level_2")
        public String getAddressAdminAreaLevel2() {
            return addressAdminAreaLevel2;
        }

        /**
         * Set addressAdminAreaLevel2
         **/
        public void setAddressAdminAreaLevel2(String addressAdminAreaLevel2) {
            this.addressAdminAreaLevel2 = addressAdminAreaLevel2;
        }

        public GetOrganizationItemQueryParam addressAdminAreaLevel2(String addressAdminAreaLevel2) {
            this.addressAdminAreaLevel2 = addressAdminAreaLevel2;
            return this;
        }

        /**
        * The country of the organization location
        * @return addressCountry
        **/
        @JsonProperty("address_country")
        public String getAddressCountry() {
            return addressCountry;
        }

        /**
         * Set addressCountry
         **/
        public void setAddressCountry(String addressCountry) {
            this.addressCountry = addressCountry;
        }

        public GetOrganizationItemQueryParam addressCountry(String addressCountry) {
            this.addressCountry = addressCountry;
            return this;
        }

        /**
        * The postal code of the organization location
        * @return addressPostalCode
        **/
        @JsonProperty("address_postal_code")
        public String getAddressPostalCode() {
            return addressPostalCode;
        }

        /**
         * Set addressPostalCode
         **/
        public void setAddressPostalCode(String addressPostalCode) {
            this.addressPostalCode = addressPostalCode;
        }

        public GetOrganizationItemQueryParam addressPostalCode(String addressPostalCode) {
            this.addressPostalCode = addressPostalCode;
            return this;
        }

        /**
        * The formatted organization location
        * @return addressFormattedAddress
        **/
        @JsonProperty("address_formatted_address")
        public String getAddressFormattedAddress() {
            return addressFormattedAddress;
        }

        /**
         * Set addressFormattedAddress
         **/
        public void setAddressFormattedAddress(String addressFormattedAddress) {
            this.addressFormattedAddress = addressFormattedAddress;
        }

        public GetOrganizationItemQueryParam addressFormattedAddress(String addressFormattedAddress) {
            this.addressFormattedAddress = addressFormattedAddress;
            return this;
        }

        /**
        * The count of open deals related with the item
        * @return openDealsCount
        **/
        @JsonProperty("open_deals_count")
        public Integer getOpenDealsCount() {
            return openDealsCount;
        }

        /**
         * Set openDealsCount
         **/
        public void setOpenDealsCount(Integer openDealsCount) {
            this.openDealsCount = openDealsCount;
        }

        public GetOrganizationItemQueryParam openDealsCount(Integer openDealsCount) {
            this.openDealsCount = openDealsCount;
            return this;
        }

        /**
        * The count of related open deals related with the item
        * @return relatedOpenDealsCount
        **/
        @JsonProperty("related_open_deals_count")
        public Integer getRelatedOpenDealsCount() {
            return relatedOpenDealsCount;
        }

        /**
         * Set relatedOpenDealsCount
         **/
        public void setRelatedOpenDealsCount(Integer relatedOpenDealsCount) {
            this.relatedOpenDealsCount = relatedOpenDealsCount;
        }

        public GetOrganizationItemQueryParam relatedOpenDealsCount(Integer relatedOpenDealsCount) {
            this.relatedOpenDealsCount = relatedOpenDealsCount;
            return this;
        }

        /**
        * The count of closed deals related with the item
        * @return closedDealsCount
        **/
        @JsonProperty("closed_deals_count")
        public Integer getClosedDealsCount() {
            return closedDealsCount;
        }

        /**
         * Set closedDealsCount
         **/
        public void setClosedDealsCount(Integer closedDealsCount) {
            this.closedDealsCount = closedDealsCount;
        }

        public GetOrganizationItemQueryParam closedDealsCount(Integer closedDealsCount) {
            this.closedDealsCount = closedDealsCount;
            return this;
        }

        /**
        * The count of related closed deals related with the item
        * @return relatedClosedDealsCount
        **/
        @JsonProperty("related_closed_deals_count")
        public Integer getRelatedClosedDealsCount() {
            return relatedClosedDealsCount;
        }

        /**
         * Set relatedClosedDealsCount
         **/
        public void setRelatedClosedDealsCount(Integer relatedClosedDealsCount) {
            this.relatedClosedDealsCount = relatedClosedDealsCount;
        }

        public GetOrganizationItemQueryParam relatedClosedDealsCount(Integer relatedClosedDealsCount) {
            this.relatedClosedDealsCount = relatedClosedDealsCount;
            return this;
        }

        /**
        * The count of won deals related with the item
        * @return wonDealsCount
        **/
        @JsonProperty("won_deals_count")
        public Integer getWonDealsCount() {
            return wonDealsCount;
        }

        /**
         * Set wonDealsCount
         **/
        public void setWonDealsCount(Integer wonDealsCount) {
            this.wonDealsCount = wonDealsCount;
        }

        public GetOrganizationItemQueryParam wonDealsCount(Integer wonDealsCount) {
            this.wonDealsCount = wonDealsCount;
            return this;
        }

        /**
        * The count of related won deals related with the item
        * @return relatedWonDealsCount
        **/
        @JsonProperty("related_won_deals_count")
        public Integer getRelatedWonDealsCount() {
            return relatedWonDealsCount;
        }

        /**
         * Set relatedWonDealsCount
         **/
        public void setRelatedWonDealsCount(Integer relatedWonDealsCount) {
            this.relatedWonDealsCount = relatedWonDealsCount;
        }

        public GetOrganizationItemQueryParam relatedWonDealsCount(Integer relatedWonDealsCount) {
            this.relatedWonDealsCount = relatedWonDealsCount;
            return this;
        }

        /**
        * The count of lost deals related with the item
        * @return lostDealsCount
        **/
        @JsonProperty("lost_deals_count")
        public Integer getLostDealsCount() {
            return lostDealsCount;
        }

        /**
         * Set lostDealsCount
         **/
        public void setLostDealsCount(Integer lostDealsCount) {
            this.lostDealsCount = lostDealsCount;
        }

        public GetOrganizationItemQueryParam lostDealsCount(Integer lostDealsCount) {
            this.lostDealsCount = lostDealsCount;
            return this;
        }

        /**
        * The count of related lost deals related with the item
        * @return relatedLostDealsCount
        **/
        @JsonProperty("related_lost_deals_count")
        public Integer getRelatedLostDealsCount() {
            return relatedLostDealsCount;
        }

        /**
         * Set relatedLostDealsCount
         **/
        public void setRelatedLostDealsCount(Integer relatedLostDealsCount) {
            this.relatedLostDealsCount = relatedLostDealsCount;
        }

        public GetOrganizationItemQueryParam relatedLostDealsCount(Integer relatedLostDealsCount) {
            this.relatedLostDealsCount = relatedLostDealsCount;
            return this;
        }

        /**
        * The date of the next activity associated with the deal
        * @return nextActivityDate
        **/
        @JsonProperty("next_activity_date")
        public String getNextActivityDate() {
            return nextActivityDate;
        }

        /**
         * Set nextActivityDate
         **/
        public void setNextActivityDate(String nextActivityDate) {
            this.nextActivityDate = nextActivityDate;
        }

        public GetOrganizationItemQueryParam nextActivityDate(String nextActivityDate) {
            this.nextActivityDate = nextActivityDate;
            return this;
        }

        /**
        * The time of the next activity associated with the deal
        * @return nextActivityTime
        **/
        @JsonProperty("next_activity_time")
        public String getNextActivityTime() {
            return nextActivityTime;
        }

        /**
         * Set nextActivityTime
         **/
        public void setNextActivityTime(String nextActivityTime) {
            this.nextActivityTime = nextActivityTime;
        }

        public GetOrganizationItemQueryParam nextActivityTime(String nextActivityTime) {
            this.nextActivityTime = nextActivityTime;
            return this;
        }

        /**
        * The ID of the next activity associated with the deal
        * @return nextActivityId
        **/
        @JsonProperty("next_activity_id")
        public Integer getNextActivityId() {
            return nextActivityId;
        }

        /**
         * Set nextActivityId
         **/
        public void setNextActivityId(Integer nextActivityId) {
            this.nextActivityId = nextActivityId;
        }

        public GetOrganizationItemQueryParam nextActivityId(Integer nextActivityId) {
            this.nextActivityId = nextActivityId;
            return this;
        }

        /**
        * The ID of the last activity associated with the deal
        * @return lastActivityId
        **/
        @JsonProperty("last_activity_id")
        public Integer getLastActivityId() {
            return lastActivityId;
        }

        /**
         * Set lastActivityId
         **/
        public void setLastActivityId(Integer lastActivityId) {
            this.lastActivityId = lastActivityId;
        }

        public GetOrganizationItemQueryParam lastActivityId(Integer lastActivityId) {
            this.lastActivityId = lastActivityId;
            return this;
        }

        /**
        * The date of the last activity associated with the deal
        * @return lastActivityDate
        **/
        @JsonProperty("last_activity_date")
        public String getLastActivityDate() {
            return lastActivityDate;
        }

        /**
         * Set lastActivityDate
         **/
        public void setLastActivityDate(String lastActivityDate) {
            this.lastActivityDate = lastActivityDate;
        }

        public GetOrganizationItemQueryParam lastActivityDate(String lastActivityDate) {
            this.lastActivityDate = lastActivityDate;
            return this;
        }

        /**
        * If the company ID of the organization and company ID of the request is same or not
        * @return editName
        **/
        @JsonProperty("edit_name")
        public Boolean getEditName() {
            return editName;
        }

        /**
         * Set editName
         **/
        public void setEditName(Boolean editName) {
            this.editName = editName;
        }

        public GetOrganizationItemQueryParam editName(Boolean editName) {
            this.editName = editName;
            return this;
        }

        /**
        * Please refer to response schema of <a href=\"https://developers.pipedrive.com/docs/api/v1/Activities#getActivity\">Activity</a>
        * @return lastActivity
        **/
        @JsonProperty("last_activity")
        public Object getLastActivity() {
            return lastActivity;
        }

        /**
         * Set lastActivity
         **/
        public void setLastActivity(Object lastActivity) {
            this.lastActivity = lastActivity;
        }

        public GetOrganizationItemQueryParam lastActivity(Object lastActivity) {
            this.lastActivity = lastActivity;
            return this;
        }

        /**
        * Please refer to response schema of <a href=\"https://developers.pipedrive.com/docs/api/v1/Activities#getActivity\">Activity</a>
        * @return nextActivity
        **/
        @JsonProperty("next_activity")
        public Object getNextActivity() {
            return nextActivity;
        }

        /**
         * Set nextActivity
         **/
        public void setNextActivity(Object nextActivity) {
            this.nextActivity = nextActivity;
        }

        public GetOrganizationItemQueryParam nextActivity(Object nextActivity) {
            this.nextActivity = nextActivity;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetOrganizationItemQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
            sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    pictureId: ").append(toIndentedString(pictureId)).append("\n");
            sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
            sb.append("    firstChar: ").append(toIndentedString(firstChar)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
            sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
            sb.append("    label: ").append(toIndentedString(label)).append("\n");
            sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
            sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
            sb.append("    ccEmail: ").append(toIndentedString(ccEmail)).append("\n");
            sb.append("    emailMessagesCount: ").append(toIndentedString(emailMessagesCount)).append("\n");
            sb.append("    peopleCount: ").append(toIndentedString(peopleCount)).append("\n");
            sb.append("    activitiesCount: ").append(toIndentedString(activitiesCount)).append("\n");
            sb.append("    doneActivitiesCount: ").append(toIndentedString(doneActivitiesCount)).append("\n");
            sb.append("    undoneActivitiesCount: ").append(toIndentedString(undoneActivitiesCount)).append("\n");
            sb.append("    filesCount: ").append(toIndentedString(filesCount)).append("\n");
            sb.append("    notesCount: ").append(toIndentedString(notesCount)).append("\n");
            sb.append("    followersCount: ").append(toIndentedString(followersCount)).append("\n");
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
            sb.append("    openDealsCount: ").append(toIndentedString(openDealsCount)).append("\n");
            sb.append("    relatedOpenDealsCount: ").append(toIndentedString(relatedOpenDealsCount)).append("\n");
            sb.append("    closedDealsCount: ").append(toIndentedString(closedDealsCount)).append("\n");
            sb.append("    relatedClosedDealsCount: ").append(toIndentedString(relatedClosedDealsCount)).append("\n");
            sb.append("    wonDealsCount: ").append(toIndentedString(wonDealsCount)).append("\n");
            sb.append("    relatedWonDealsCount: ").append(toIndentedString(relatedWonDealsCount)).append("\n");
            sb.append("    lostDealsCount: ").append(toIndentedString(lostDealsCount)).append("\n");
            sb.append("    relatedLostDealsCount: ").append(toIndentedString(relatedLostDealsCount)).append("\n");
            sb.append("    nextActivityDate: ").append(toIndentedString(nextActivityDate)).append("\n");
            sb.append("    nextActivityTime: ").append(toIndentedString(nextActivityTime)).append("\n");
            sb.append("    nextActivityId: ").append(toIndentedString(nextActivityId)).append("\n");
            sb.append("    lastActivityId: ").append(toIndentedString(lastActivityId)).append("\n");
            sb.append("    lastActivityDate: ").append(toIndentedString(lastActivityDate)).append("\n");
            sb.append("    editName: ").append(toIndentedString(editName)).append("\n");
            sb.append("    lastActivity: ").append(toIndentedString(lastActivity)).append("\n");
            sb.append("    nextActivity: ").append(toIndentedString(nextActivity)).append("\n");
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
