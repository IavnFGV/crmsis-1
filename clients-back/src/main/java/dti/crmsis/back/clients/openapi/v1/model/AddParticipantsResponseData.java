package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.Owner;
import dti.crmsis.back.clients.openapi.v1.model.PersonAllOfEmailInner;
import dti.crmsis.back.clients.openapi.v1.model.PersonAllOfPhoneInner;
import dti.crmsis.back.clients.openapi.v1.model.PersonAllOfPictureId;
import dti.crmsis.back.clients.openapi.v1.model.RelationshipOrganizationInfoItemWithActiveFlag;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The object of participant
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class AddParticipantsResponseData  {

    /**
      * The ID of the person
     **/
    private Integer id;
    /**
      * The ID of the company related to the person
     **/
    private Integer companyId;
    /**
      * Whether the person is active or not
     **/
    private Boolean activeFlag;
    /**
      * A phone number supplied as a string or an array of phone objects related to the person. The structure of the array is as follows: `[{ \"value\": \"12345\", \"primary\": \"true\", \"label\": \"mobile\" }]`. Please note that only `value` is required.
     **/
    private List<PersonAllOfPhoneInner> phone;
    /**
      * An email address as a string or an array of email objects related to the person. The structure of the array is as follows: `[{ \"value\": \"mail@example.com\", \"primary\": \"true\", \"label\": \"main\" } ]`. Please note that only `value` is required.
     **/
    private List<PersonAllOfEmailInner> email;
    /**
      * The first letter of the name of the person
     **/
    private String firstChar;
    /**
      * The date and time when the person was added/created. Format: YYYY-MM-DD HH:MM:SS
     **/
    private String addTime;
    /**
      * The last updated date and time of the person. Format: YYYY-MM-DD HH:MM:SS
     **/
    private String updateTime;
    /**
      * The visibility group ID of who can see the person
     **/
    private String visibleTo;
    private PersonAllOfPictureId pictureId;
    /**
      * The label assigned to the person. When the `label` field is updated, the `label_ids` field value will be overwritten by the `label` field value.
     **/
    private Integer label;
    /**
      * The IDs of labels assigned to the person. When the `label_ids` field is updated, the `label` field value will be set to the first value of the `label_ids` field.
     **/
    private List<Integer> labelIds;
    /**
      * The name of the organization associated with the person
     **/
    private String orgName;
    /**
      * The name of the owner associated with the person
     **/
    private String ownerName;
    /**
      * The BCC email associated with the person
     **/
    private String ccEmail;
    private Owner ownerId;
    private RelationshipOrganizationInfoItemWithActiveFlag orgId;
    /**
      * The name of the person
     **/
    private String name;
    /**
      * The first name of the person
     **/
    private String firstName;
    /**
      * The last name of the person
     **/
    private String lastName;
    /**
      * The count of email messages related to the person
     **/
    private Integer emailMessagesCount;
    /**
      * The count of activities related to the person
     **/
    private Integer activitiesCount;
    /**
      * The count of done activities related to the person
     **/
    private Integer doneActivitiesCount;
    /**
      * The count of undone activities related to the person
     **/
    private Integer undoneActivitiesCount;
    /**
      * The count of files related to the person
     **/
    private Integer filesCount;
    /**
      * The count of notes related to the person
     **/
    private Integer notesCount;
    /**
      * The count of followers related to the person
     **/
    private Integer followersCount;
    /**
      * The date and time of the last incoming email associated with the person
     **/
    private String lastIncomingMailTime;
    /**
      * The date and time of the last outgoing email associated with the person
     **/
    private String lastOutgoingMailTime;
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

    public AddParticipantsResponseData id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The ID of the company related to the person
    * @return companyId
    **/
    @JsonProperty("company_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * Set companyId
     **/
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public AddParticipantsResponseData companyId(Integer companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
    * Whether the person is active or not
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

    public AddParticipantsResponseData activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * A phone number supplied as a string or an array of phone objects related to the person. The structure of the array is as follows: `[{ \"value\": \"12345\", \"primary\": \"true\", \"label\": \"mobile\" }]`. Please note that only `value` is required.
    * @return phone
    **/
    @JsonProperty("phone")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<PersonAllOfPhoneInner> getPhone() {
        return phone;
    }

    /**
     * Set phone
     **/
    public void setPhone(List<PersonAllOfPhoneInner> phone) {
        this.phone = phone;
    }

    public AddParticipantsResponseData phone(List<PersonAllOfPhoneInner> phone) {
        this.phone = phone;
        return this;
    }
    public AddParticipantsResponseData addPhoneItem(PersonAllOfPhoneInner phoneItem) {
        if (this.phone == null){
            phone = new ArrayList<>();
        }
        this.phone.add(phoneItem);
        return this;
    }

    /**
    * An email address as a string or an array of email objects related to the person. The structure of the array is as follows: `[{ \"value\": \"mail@example.com\", \"primary\": \"true\", \"label\": \"main\" } ]`. Please note that only `value` is required.
    * @return email
    **/
    @JsonProperty("email")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<PersonAllOfEmailInner> getEmail() {
        return email;
    }

    /**
     * Set email
     **/
    public void setEmail(List<PersonAllOfEmailInner> email) {
        this.email = email;
    }

    public AddParticipantsResponseData email(List<PersonAllOfEmailInner> email) {
        this.email = email;
        return this;
    }
    public AddParticipantsResponseData addEmailItem(PersonAllOfEmailInner emailItem) {
        if (this.email == null){
            email = new ArrayList<>();
        }
        this.email.add(emailItem);
        return this;
    }

    /**
    * The first letter of the name of the person
    * @return firstChar
    **/
    @JsonProperty("first_char")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getFirstChar() {
        return firstChar;
    }

    /**
     * Set firstChar
     **/
    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar;
    }

    public AddParticipantsResponseData firstChar(String firstChar) {
        this.firstChar = firstChar;
        return this;
    }

    /**
    * The date and time when the person was added/created. Format: YYYY-MM-DD HH:MM:SS
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

    public AddParticipantsResponseData addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The last updated date and time of the person. Format: YYYY-MM-DD HH:MM:SS
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

    public AddParticipantsResponseData updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
    * The visibility group ID of who can see the person
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

    public AddParticipantsResponseData visibleTo(String visibleTo) {
        this.visibleTo = visibleTo;
        return this;
    }

    /**
    * Get pictureId
    * @return pictureId
    **/
    @JsonProperty("picture_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PersonAllOfPictureId getPictureId() {
        return pictureId;
    }

    /**
     * Set pictureId
     **/
    public void setPictureId(PersonAllOfPictureId pictureId) {
        this.pictureId = pictureId;
    }

    public AddParticipantsResponseData pictureId(PersonAllOfPictureId pictureId) {
        this.pictureId = pictureId;
        return this;
    }

    /**
    * The label assigned to the person. When the `label` field is updated, the `label_ids` field value will be overwritten by the `label` field value.
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

    public AddParticipantsResponseData label(Integer label) {
        this.label = label;
        return this;
    }

    /**
    * The IDs of labels assigned to the person. When the `label_ids` field is updated, the `label` field value will be set to the first value of the `label_ids` field.
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

    public AddParticipantsResponseData labelIds(List<Integer> labelIds) {
        this.labelIds = labelIds;
        return this;
    }
    public AddParticipantsResponseData addLabelIdsItem(Integer labelIdsItem) {
        if (this.labelIds == null){
            labelIds = new ArrayList<>();
        }
        this.labelIds.add(labelIdsItem);
        return this;
    }

    /**
    * The name of the organization associated with the person
    * @return orgName
    **/
    @JsonProperty("org_name")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getOrgName() {
        return orgName;
    }

    /**
     * Set orgName
     **/
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public AddParticipantsResponseData orgName(String orgName) {
        this.orgName = orgName;
        return this;
    }

    /**
    * The name of the owner associated with the person
    * @return ownerName
    **/
    @JsonProperty("owner_name")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Set ownerName
     **/
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public AddParticipantsResponseData ownerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    /**
    * The BCC email associated with the person
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

    public AddParticipantsResponseData ccEmail(String ccEmail) {
        this.ccEmail = ccEmail;
        return this;
    }

    /**
    * Get ownerId
    * @return ownerId
    **/
    @JsonProperty("owner_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Owner getOwnerId() {
        return ownerId;
    }

    /**
     * Set ownerId
     **/
    public void setOwnerId(Owner ownerId) {
        this.ownerId = ownerId;
    }

    public AddParticipantsResponseData ownerId(Owner ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
    * Get orgId
    * @return orgId
    **/
    @JsonProperty("org_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public RelationshipOrganizationInfoItemWithActiveFlag getOrgId() {
        return orgId;
    }

    /**
     * Set orgId
     **/
    public void setOrgId(RelationshipOrganizationInfoItemWithActiveFlag orgId) {
        this.orgId = orgId;
    }

    public AddParticipantsResponseData orgId(RelationshipOrganizationInfoItemWithActiveFlag orgId) {
        this.orgId = orgId;
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

    public AddParticipantsResponseData name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The first name of the person
    * @return firstName
    **/
    @JsonProperty("first_name")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set firstName
     **/
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public AddParticipantsResponseData firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
    * The last name of the person
    * @return lastName
    **/
    @JsonProperty("last_name")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLastName() {
        return lastName;
    }

    /**
     * Set lastName
     **/
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public AddParticipantsResponseData lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
    * The count of email messages related to the person
    * @return emailMessagesCount
    **/
    @JsonProperty("email_messages_count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getEmailMessagesCount() {
        return emailMessagesCount;
    }

    /**
     * Set emailMessagesCount
     **/
    public void setEmailMessagesCount(Integer emailMessagesCount) {
        this.emailMessagesCount = emailMessagesCount;
    }

    public AddParticipantsResponseData emailMessagesCount(Integer emailMessagesCount) {
        this.emailMessagesCount = emailMessagesCount;
        return this;
    }

    /**
    * The count of activities related to the person
    * @return activitiesCount
    **/
    @JsonProperty("activities_count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getActivitiesCount() {
        return activitiesCount;
    }

    /**
     * Set activitiesCount
     **/
    public void setActivitiesCount(Integer activitiesCount) {
        this.activitiesCount = activitiesCount;
    }

    public AddParticipantsResponseData activitiesCount(Integer activitiesCount) {
        this.activitiesCount = activitiesCount;
        return this;
    }

    /**
    * The count of done activities related to the person
    * @return doneActivitiesCount
    **/
    @JsonProperty("done_activities_count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getDoneActivitiesCount() {
        return doneActivitiesCount;
    }

    /**
     * Set doneActivitiesCount
     **/
    public void setDoneActivitiesCount(Integer doneActivitiesCount) {
        this.doneActivitiesCount = doneActivitiesCount;
    }

    public AddParticipantsResponseData doneActivitiesCount(Integer doneActivitiesCount) {
        this.doneActivitiesCount = doneActivitiesCount;
        return this;
    }

    /**
    * The count of undone activities related to the person
    * @return undoneActivitiesCount
    **/
    @JsonProperty("undone_activities_count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getUndoneActivitiesCount() {
        return undoneActivitiesCount;
    }

    /**
     * Set undoneActivitiesCount
     **/
    public void setUndoneActivitiesCount(Integer undoneActivitiesCount) {
        this.undoneActivitiesCount = undoneActivitiesCount;
    }

    public AddParticipantsResponseData undoneActivitiesCount(Integer undoneActivitiesCount) {
        this.undoneActivitiesCount = undoneActivitiesCount;
        return this;
    }

    /**
    * The count of files related to the person
    * @return filesCount
    **/
    @JsonProperty("files_count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getFilesCount() {
        return filesCount;
    }

    /**
     * Set filesCount
     **/
    public void setFilesCount(Integer filesCount) {
        this.filesCount = filesCount;
    }

    public AddParticipantsResponseData filesCount(Integer filesCount) {
        this.filesCount = filesCount;
        return this;
    }

    /**
    * The count of notes related to the person
    * @return notesCount
    **/
    @JsonProperty("notes_count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getNotesCount() {
        return notesCount;
    }

    /**
     * Set notesCount
     **/
    public void setNotesCount(Integer notesCount) {
        this.notesCount = notesCount;
    }

    public AddParticipantsResponseData notesCount(Integer notesCount) {
        this.notesCount = notesCount;
        return this;
    }

    /**
    * The count of followers related to the person
    * @return followersCount
    **/
    @JsonProperty("followers_count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getFollowersCount() {
        return followersCount;
    }

    /**
     * Set followersCount
     **/
    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    public AddParticipantsResponseData followersCount(Integer followersCount) {
        this.followersCount = followersCount;
        return this;
    }

    /**
    * The date and time of the last incoming email associated with the person
    * @return lastIncomingMailTime
    **/
    @JsonProperty("last_incoming_mail_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLastIncomingMailTime() {
        return lastIncomingMailTime;
    }

    /**
     * Set lastIncomingMailTime
     **/
    public void setLastIncomingMailTime(String lastIncomingMailTime) {
        this.lastIncomingMailTime = lastIncomingMailTime;
    }

    public AddParticipantsResponseData lastIncomingMailTime(String lastIncomingMailTime) {
        this.lastIncomingMailTime = lastIncomingMailTime;
        return this;
    }

    /**
    * The date and time of the last outgoing email associated with the person
    * @return lastOutgoingMailTime
    **/
    @JsonProperty("last_outgoing_mail_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLastOutgoingMailTime() {
        return lastOutgoingMailTime;
    }

    /**
     * Set lastOutgoingMailTime
     **/
    public void setLastOutgoingMailTime(String lastOutgoingMailTime) {
        this.lastOutgoingMailTime = lastOutgoingMailTime;
    }

    public AddParticipantsResponseData lastOutgoingMailTime(String lastOutgoingMailTime) {
        this.lastOutgoingMailTime = lastOutgoingMailTime;
        return this;
    }

    /**
    * The count of open deals related with the item
    * @return openDealsCount
    **/
    @JsonProperty("open_deals_count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getOpenDealsCount() {
        return openDealsCount;
    }

    /**
     * Set openDealsCount
     **/
    public void setOpenDealsCount(Integer openDealsCount) {
        this.openDealsCount = openDealsCount;
    }

    public AddParticipantsResponseData openDealsCount(Integer openDealsCount) {
        this.openDealsCount = openDealsCount;
        return this;
    }

    /**
    * The count of related open deals related with the item
    * @return relatedOpenDealsCount
    **/
    @JsonProperty("related_open_deals_count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getRelatedOpenDealsCount() {
        return relatedOpenDealsCount;
    }

    /**
     * Set relatedOpenDealsCount
     **/
    public void setRelatedOpenDealsCount(Integer relatedOpenDealsCount) {
        this.relatedOpenDealsCount = relatedOpenDealsCount;
    }

    public AddParticipantsResponseData relatedOpenDealsCount(Integer relatedOpenDealsCount) {
        this.relatedOpenDealsCount = relatedOpenDealsCount;
        return this;
    }

    /**
    * The count of closed deals related with the item
    * @return closedDealsCount
    **/
    @JsonProperty("closed_deals_count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getClosedDealsCount() {
        return closedDealsCount;
    }

    /**
     * Set closedDealsCount
     **/
    public void setClosedDealsCount(Integer closedDealsCount) {
        this.closedDealsCount = closedDealsCount;
    }

    public AddParticipantsResponseData closedDealsCount(Integer closedDealsCount) {
        this.closedDealsCount = closedDealsCount;
        return this;
    }

    /**
    * The count of related closed deals related with the item
    * @return relatedClosedDealsCount
    **/
    @JsonProperty("related_closed_deals_count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getRelatedClosedDealsCount() {
        return relatedClosedDealsCount;
    }

    /**
     * Set relatedClosedDealsCount
     **/
    public void setRelatedClosedDealsCount(Integer relatedClosedDealsCount) {
        this.relatedClosedDealsCount = relatedClosedDealsCount;
    }

    public AddParticipantsResponseData relatedClosedDealsCount(Integer relatedClosedDealsCount) {
        this.relatedClosedDealsCount = relatedClosedDealsCount;
        return this;
    }

    /**
    * The count of won deals related with the item
    * @return wonDealsCount
    **/
    @JsonProperty("won_deals_count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getWonDealsCount() {
        return wonDealsCount;
    }

    /**
     * Set wonDealsCount
     **/
    public void setWonDealsCount(Integer wonDealsCount) {
        this.wonDealsCount = wonDealsCount;
    }

    public AddParticipantsResponseData wonDealsCount(Integer wonDealsCount) {
        this.wonDealsCount = wonDealsCount;
        return this;
    }

    /**
    * The count of related won deals related with the item
    * @return relatedWonDealsCount
    **/
    @JsonProperty("related_won_deals_count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getRelatedWonDealsCount() {
        return relatedWonDealsCount;
    }

    /**
     * Set relatedWonDealsCount
     **/
    public void setRelatedWonDealsCount(Integer relatedWonDealsCount) {
        this.relatedWonDealsCount = relatedWonDealsCount;
    }

    public AddParticipantsResponseData relatedWonDealsCount(Integer relatedWonDealsCount) {
        this.relatedWonDealsCount = relatedWonDealsCount;
        return this;
    }

    /**
    * The count of lost deals related with the item
    * @return lostDealsCount
    **/
    @JsonProperty("lost_deals_count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getLostDealsCount() {
        return lostDealsCount;
    }

    /**
     * Set lostDealsCount
     **/
    public void setLostDealsCount(Integer lostDealsCount) {
        this.lostDealsCount = lostDealsCount;
    }

    public AddParticipantsResponseData lostDealsCount(Integer lostDealsCount) {
        this.lostDealsCount = lostDealsCount;
        return this;
    }

    /**
    * The count of related lost deals related with the item
    * @return relatedLostDealsCount
    **/
    @JsonProperty("related_lost_deals_count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getRelatedLostDealsCount() {
        return relatedLostDealsCount;
    }

    /**
     * Set relatedLostDealsCount
     **/
    public void setRelatedLostDealsCount(Integer relatedLostDealsCount) {
        this.relatedLostDealsCount = relatedLostDealsCount;
    }

    public AddParticipantsResponseData relatedLostDealsCount(Integer relatedLostDealsCount) {
        this.relatedLostDealsCount = relatedLostDealsCount;
        return this;
    }

    /**
    * The date of the next activity associated with the deal
    * @return nextActivityDate
    **/
    @JsonProperty("next_activity_date")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getNextActivityDate() {
        return nextActivityDate;
    }

    /**
     * Set nextActivityDate
     **/
    public void setNextActivityDate(String nextActivityDate) {
        this.nextActivityDate = nextActivityDate;
    }

    public AddParticipantsResponseData nextActivityDate(String nextActivityDate) {
        this.nextActivityDate = nextActivityDate;
        return this;
    }

    /**
    * The time of the next activity associated with the deal
    * @return nextActivityTime
    **/
    @JsonProperty("next_activity_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getNextActivityTime() {
        return nextActivityTime;
    }

    /**
     * Set nextActivityTime
     **/
    public void setNextActivityTime(String nextActivityTime) {
        this.nextActivityTime = nextActivityTime;
    }

    public AddParticipantsResponseData nextActivityTime(String nextActivityTime) {
        this.nextActivityTime = nextActivityTime;
        return this;
    }

    /**
    * The ID of the next activity associated with the deal
    * @return nextActivityId
    **/
    @JsonProperty("next_activity_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getNextActivityId() {
        return nextActivityId;
    }

    /**
     * Set nextActivityId
     **/
    public void setNextActivityId(Integer nextActivityId) {
        this.nextActivityId = nextActivityId;
    }

    public AddParticipantsResponseData nextActivityId(Integer nextActivityId) {
        this.nextActivityId = nextActivityId;
        return this;
    }

    /**
    * The ID of the last activity associated with the deal
    * @return lastActivityId
    **/
    @JsonProperty("last_activity_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getLastActivityId() {
        return lastActivityId;
    }

    /**
     * Set lastActivityId
     **/
    public void setLastActivityId(Integer lastActivityId) {
        this.lastActivityId = lastActivityId;
    }

    public AddParticipantsResponseData lastActivityId(Integer lastActivityId) {
        this.lastActivityId = lastActivityId;
        return this;
    }

    /**
    * The date of the last activity associated with the deal
    * @return lastActivityDate
    **/
    @JsonProperty("last_activity_date")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLastActivityDate() {
        return lastActivityDate;
    }

    /**
     * Set lastActivityDate
     **/
    public void setLastActivityDate(String lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    public AddParticipantsResponseData lastActivityDate(String lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddParticipantsResponseData {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    firstChar: ").append(toIndentedString(firstChar)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
        sb.append("    pictureId: ").append(toIndentedString(pictureId)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
        sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
        sb.append("    ccEmail: ").append(toIndentedString(ccEmail)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    emailMessagesCount: ").append(toIndentedString(emailMessagesCount)).append("\n");
        sb.append("    activitiesCount: ").append(toIndentedString(activitiesCount)).append("\n");
        sb.append("    doneActivitiesCount: ").append(toIndentedString(doneActivitiesCount)).append("\n");
        sb.append("    undoneActivitiesCount: ").append(toIndentedString(undoneActivitiesCount)).append("\n");
        sb.append("    filesCount: ").append(toIndentedString(filesCount)).append("\n");
        sb.append("    notesCount: ").append(toIndentedString(notesCount)).append("\n");
        sb.append("    followersCount: ").append(toIndentedString(followersCount)).append("\n");
        sb.append("    lastIncomingMailTime: ").append(toIndentedString(lastIncomingMailTime)).append("\n");
        sb.append("    lastOutgoingMailTime: ").append(toIndentedString(lastOutgoingMailTime)).append("\n");
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
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddParticipantsResponseData} object that
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

        AddParticipantsResponseData model = (AddParticipantsResponseData) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(companyId, model.companyId) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(phone, model.phone) &&
        java.util.Objects.equals(email, model.email) &&
        java.util.Objects.equals(firstChar, model.firstChar) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime) &&
        java.util.Objects.equals(visibleTo, model.visibleTo) &&
        java.util.Objects.equals(pictureId, model.pictureId) &&
        java.util.Objects.equals(label, model.label) &&
        java.util.Objects.equals(labelIds, model.labelIds) &&
        java.util.Objects.equals(orgName, model.orgName) &&
        java.util.Objects.equals(ownerName, model.ownerName) &&
        java.util.Objects.equals(ccEmail, model.ccEmail) &&
        java.util.Objects.equals(ownerId, model.ownerId) &&
        java.util.Objects.equals(orgId, model.orgId) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(firstName, model.firstName) &&
        java.util.Objects.equals(lastName, model.lastName) &&
        java.util.Objects.equals(emailMessagesCount, model.emailMessagesCount) &&
        java.util.Objects.equals(activitiesCount, model.activitiesCount) &&
        java.util.Objects.equals(doneActivitiesCount, model.doneActivitiesCount) &&
        java.util.Objects.equals(undoneActivitiesCount, model.undoneActivitiesCount) &&
        java.util.Objects.equals(filesCount, model.filesCount) &&
        java.util.Objects.equals(notesCount, model.notesCount) &&
        java.util.Objects.equals(followersCount, model.followersCount) &&
        java.util.Objects.equals(lastIncomingMailTime, model.lastIncomingMailTime) &&
        java.util.Objects.equals(lastOutgoingMailTime, model.lastOutgoingMailTime) &&
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
        java.util.Objects.equals(lastActivityDate, model.lastActivityDate);
    }

    /**
     * Returns a hash code for a {@code AddParticipantsResponseData}.
     *
     * @return a hash code value for a {@code AddParticipantsResponseData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        companyId,
        activeFlag,
        phone,
        email,
        firstChar,
        addTime,
        updateTime,
        visibleTo,
        pictureId,
        label,
        labelIds,
        orgName,
        ownerName,
        ccEmail,
        ownerId,
        orgId,
        name,
        firstName,
        lastName,
        emailMessagesCount,
        activitiesCount,
        doneActivitiesCount,
        undoneActivitiesCount,
        filesCount,
        notesCount,
        followersCount,
        lastIncomingMailTime,
        lastOutgoingMailTime,
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
        lastActivityDate);
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
      * The object of participant
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class AddParticipantsResponseDataQueryParam  {

        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("companyId")
        private Integer companyId;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("phone")
        private List<PersonAllOfPhoneInner> phone = null;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("email")
        private List<PersonAllOfEmailInner> email = null;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("firstChar")
        private String firstChar;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("updateTime")
        private String updateTime;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("visibleTo")
        private String visibleTo;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("pictureId")
        private PersonAllOfPictureId pictureId;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("label")
        private Integer label;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("labelIds")
        private List<Integer> labelIds = null;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("orgName")
        private String orgName;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("ownerName")
        private String ownerName;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("ccEmail")
        private String ccEmail;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("ownerId")
        private Owner ownerId;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("orgId")
        private RelationshipOrganizationInfoItemWithActiveFlag orgId;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("firstName")
        private String firstName;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("lastName")
        private String lastName;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("emailMessagesCount")
        private Integer emailMessagesCount;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("activitiesCount")
        private Integer activitiesCount;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("doneActivitiesCount")
        private Integer doneActivitiesCount;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("undoneActivitiesCount")
        private Integer undoneActivitiesCount;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("filesCount")
        private Integer filesCount;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("notesCount")
        private Integer notesCount;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("followersCount")
        private Integer followersCount;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("lastIncomingMailTime")
        private String lastIncomingMailTime;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("lastOutgoingMailTime")
        private String lastOutgoingMailTime;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("openDealsCount")
        private Integer openDealsCount;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("relatedOpenDealsCount")
        private Integer relatedOpenDealsCount;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("closedDealsCount")
        private Integer closedDealsCount;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("relatedClosedDealsCount")
        private Integer relatedClosedDealsCount;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("wonDealsCount")
        private Integer wonDealsCount;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("relatedWonDealsCount")
        private Integer relatedWonDealsCount;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("lostDealsCount")
        private Integer lostDealsCount;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("relatedLostDealsCount")
        private Integer relatedLostDealsCount;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("nextActivityDate")
        private String nextActivityDate;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("nextActivityTime")
        private String nextActivityTime;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("nextActivityId")
        private Integer nextActivityId;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("lastActivityId")
        private Integer lastActivityId;
        /**
          * The object of participant
         **/
        @jakarta.ws.rs.QueryParam("lastActivityDate")
        private String lastActivityDate;

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

        public AddParticipantsResponseDataQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The ID of the company related to the person
        * @return companyId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("company_id")
        public Integer getCompanyId() {
            return companyId;
        }

        /**
         * Set companyId
         **/
        public void setCompanyId(Integer companyId) {
            this.companyId = companyId;
        }

        public AddParticipantsResponseDataQueryParam companyId(Integer companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
        * Whether the person is active or not
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

        public AddParticipantsResponseDataQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * A phone number supplied as a string or an array of phone objects related to the person. The structure of the array is as follows: `[{ \"value\": \"12345\", \"primary\": \"true\", \"label\": \"mobile\" }]`. Please note that only `value` is required.
        * @return phone
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("phone")
        public List<PersonAllOfPhoneInner> getPhone() {
            return phone;
        }

        /**
         * Set phone
         **/
        public void setPhone(List<PersonAllOfPhoneInner> phone) {
            this.phone = phone;
        }

        public AddParticipantsResponseDataQueryParam phone(List<PersonAllOfPhoneInner> phone) {
            this.phone = phone;
            return this;
        }
        public AddParticipantsResponseDataQueryParam addPhoneItem(PersonAllOfPhoneInner phoneItem) {
            this.phone.add(phoneItem);
            return this;
        }

        /**
        * An email address as a string or an array of email objects related to the person. The structure of the array is as follows: `[{ \"value\": \"mail@example.com\", \"primary\": \"true\", \"label\": \"main\" } ]`. Please note that only `value` is required.
        * @return email
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("email")
        public List<PersonAllOfEmailInner> getEmail() {
            return email;
        }

        /**
         * Set email
         **/
        public void setEmail(List<PersonAllOfEmailInner> email) {
            this.email = email;
        }

        public AddParticipantsResponseDataQueryParam email(List<PersonAllOfEmailInner> email) {
            this.email = email;
            return this;
        }
        public AddParticipantsResponseDataQueryParam addEmailItem(PersonAllOfEmailInner emailItem) {
            this.email.add(emailItem);
            return this;
        }

        /**
        * The first letter of the name of the person
        * @return firstChar
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("first_char")
        public String getFirstChar() {
            return firstChar;
        }

        /**
         * Set firstChar
         **/
        public void setFirstChar(String firstChar) {
            this.firstChar = firstChar;
        }

        public AddParticipantsResponseDataQueryParam firstChar(String firstChar) {
            this.firstChar = firstChar;
            return this;
        }

        /**
        * The date and time when the person was added/created. Format: YYYY-MM-DD HH:MM:SS
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

        public AddParticipantsResponseDataQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The last updated date and time of the person. Format: YYYY-MM-DD HH:MM:SS
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

        public AddParticipantsResponseDataQueryParam updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
        * The visibility group ID of who can see the person
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

        public AddParticipantsResponseDataQueryParam visibleTo(String visibleTo) {
            this.visibleTo = visibleTo;
            return this;
        }

        /**
        * Get pictureId
        * @return pictureId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("picture_id")
        public PersonAllOfPictureId getPictureId() {
            return pictureId;
        }

        /**
         * Set pictureId
         **/
        public void setPictureId(PersonAllOfPictureId pictureId) {
            this.pictureId = pictureId;
        }

        public AddParticipantsResponseDataQueryParam pictureId(PersonAllOfPictureId pictureId) {
            this.pictureId = pictureId;
            return this;
        }

        /**
        * The label assigned to the person. When the `label` field is updated, the `label_ids` field value will be overwritten by the `label` field value.
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

        public AddParticipantsResponseDataQueryParam label(Integer label) {
            this.label = label;
            return this;
        }

        /**
        * The IDs of labels assigned to the person. When the `label_ids` field is updated, the `label` field value will be set to the first value of the `label_ids` field.
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

        public AddParticipantsResponseDataQueryParam labelIds(List<Integer> labelIds) {
            this.labelIds = labelIds;
            return this;
        }
        public AddParticipantsResponseDataQueryParam addLabelIdsItem(Integer labelIdsItem) {
            this.labelIds.add(labelIdsItem);
            return this;
        }

        /**
        * The name of the organization associated with the person
        * @return orgName
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("org_name")
        public String getOrgName() {
            return orgName;
        }

        /**
         * Set orgName
         **/
        public void setOrgName(String orgName) {
            this.orgName = orgName;
        }

        public AddParticipantsResponseDataQueryParam orgName(String orgName) {
            this.orgName = orgName;
            return this;
        }

        /**
        * The name of the owner associated with the person
        * @return ownerName
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("owner_name")
        public String getOwnerName() {
            return ownerName;
        }

        /**
         * Set ownerName
         **/
        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }

        public AddParticipantsResponseDataQueryParam ownerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }

        /**
        * The BCC email associated with the person
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

        public AddParticipantsResponseDataQueryParam ccEmail(String ccEmail) {
            this.ccEmail = ccEmail;
            return this;
        }

        /**
        * Get ownerId
        * @return ownerId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("owner_id")
        public Owner getOwnerId() {
            return ownerId;
        }

        /**
         * Set ownerId
         **/
        public void setOwnerId(Owner ownerId) {
            this.ownerId = ownerId;
        }

        public AddParticipantsResponseDataQueryParam ownerId(Owner ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
        * Get orgId
        * @return orgId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("org_id")
        public RelationshipOrganizationInfoItemWithActiveFlag getOrgId() {
            return orgId;
        }

        /**
         * Set orgId
         **/
        public void setOrgId(RelationshipOrganizationInfoItemWithActiveFlag orgId) {
            this.orgId = orgId;
        }

        public AddParticipantsResponseDataQueryParam orgId(RelationshipOrganizationInfoItemWithActiveFlag orgId) {
            this.orgId = orgId;
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

        public AddParticipantsResponseDataQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The first name of the person
        * @return firstName
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("first_name")
        public String getFirstName() {
            return firstName;
        }

        /**
         * Set firstName
         **/
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public AddParticipantsResponseDataQueryParam firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
        * The last name of the person
        * @return lastName
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("last_name")
        public String getLastName() {
            return lastName;
        }

        /**
         * Set lastName
         **/
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public AddParticipantsResponseDataQueryParam lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
        * The count of email messages related to the person
        * @return emailMessagesCount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("email_messages_count")
        public Integer getEmailMessagesCount() {
            return emailMessagesCount;
        }

        /**
         * Set emailMessagesCount
         **/
        public void setEmailMessagesCount(Integer emailMessagesCount) {
            this.emailMessagesCount = emailMessagesCount;
        }

        public AddParticipantsResponseDataQueryParam emailMessagesCount(Integer emailMessagesCount) {
            this.emailMessagesCount = emailMessagesCount;
            return this;
        }

        /**
        * The count of activities related to the person
        * @return activitiesCount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("activities_count")
        public Integer getActivitiesCount() {
            return activitiesCount;
        }

        /**
         * Set activitiesCount
         **/
        public void setActivitiesCount(Integer activitiesCount) {
            this.activitiesCount = activitiesCount;
        }

        public AddParticipantsResponseDataQueryParam activitiesCount(Integer activitiesCount) {
            this.activitiesCount = activitiesCount;
            return this;
        }

        /**
        * The count of done activities related to the person
        * @return doneActivitiesCount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("done_activities_count")
        public Integer getDoneActivitiesCount() {
            return doneActivitiesCount;
        }

        /**
         * Set doneActivitiesCount
         **/
        public void setDoneActivitiesCount(Integer doneActivitiesCount) {
            this.doneActivitiesCount = doneActivitiesCount;
        }

        public AddParticipantsResponseDataQueryParam doneActivitiesCount(Integer doneActivitiesCount) {
            this.doneActivitiesCount = doneActivitiesCount;
            return this;
        }

        /**
        * The count of undone activities related to the person
        * @return undoneActivitiesCount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("undone_activities_count")
        public Integer getUndoneActivitiesCount() {
            return undoneActivitiesCount;
        }

        /**
         * Set undoneActivitiesCount
         **/
        public void setUndoneActivitiesCount(Integer undoneActivitiesCount) {
            this.undoneActivitiesCount = undoneActivitiesCount;
        }

        public AddParticipantsResponseDataQueryParam undoneActivitiesCount(Integer undoneActivitiesCount) {
            this.undoneActivitiesCount = undoneActivitiesCount;
            return this;
        }

        /**
        * The count of files related to the person
        * @return filesCount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("files_count")
        public Integer getFilesCount() {
            return filesCount;
        }

        /**
         * Set filesCount
         **/
        public void setFilesCount(Integer filesCount) {
            this.filesCount = filesCount;
        }

        public AddParticipantsResponseDataQueryParam filesCount(Integer filesCount) {
            this.filesCount = filesCount;
            return this;
        }

        /**
        * The count of notes related to the person
        * @return notesCount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("notes_count")
        public Integer getNotesCount() {
            return notesCount;
        }

        /**
         * Set notesCount
         **/
        public void setNotesCount(Integer notesCount) {
            this.notesCount = notesCount;
        }

        public AddParticipantsResponseDataQueryParam notesCount(Integer notesCount) {
            this.notesCount = notesCount;
            return this;
        }

        /**
        * The count of followers related to the person
        * @return followersCount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("followers_count")
        public Integer getFollowersCount() {
            return followersCount;
        }

        /**
         * Set followersCount
         **/
        public void setFollowersCount(Integer followersCount) {
            this.followersCount = followersCount;
        }

        public AddParticipantsResponseDataQueryParam followersCount(Integer followersCount) {
            this.followersCount = followersCount;
            return this;
        }

        /**
        * The date and time of the last incoming email associated with the person
        * @return lastIncomingMailTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("last_incoming_mail_time")
        public String getLastIncomingMailTime() {
            return lastIncomingMailTime;
        }

        /**
         * Set lastIncomingMailTime
         **/
        public void setLastIncomingMailTime(String lastIncomingMailTime) {
            this.lastIncomingMailTime = lastIncomingMailTime;
        }

        public AddParticipantsResponseDataQueryParam lastIncomingMailTime(String lastIncomingMailTime) {
            this.lastIncomingMailTime = lastIncomingMailTime;
            return this;
        }

        /**
        * The date and time of the last outgoing email associated with the person
        * @return lastOutgoingMailTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("last_outgoing_mail_time")
        public String getLastOutgoingMailTime() {
            return lastOutgoingMailTime;
        }

        /**
         * Set lastOutgoingMailTime
         **/
        public void setLastOutgoingMailTime(String lastOutgoingMailTime) {
            this.lastOutgoingMailTime = lastOutgoingMailTime;
        }

        public AddParticipantsResponseDataQueryParam lastOutgoingMailTime(String lastOutgoingMailTime) {
            this.lastOutgoingMailTime = lastOutgoingMailTime;
            return this;
        }

        /**
        * The count of open deals related with the item
        * @return openDealsCount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("open_deals_count")
        public Integer getOpenDealsCount() {
            return openDealsCount;
        }

        /**
         * Set openDealsCount
         **/
        public void setOpenDealsCount(Integer openDealsCount) {
            this.openDealsCount = openDealsCount;
        }

        public AddParticipantsResponseDataQueryParam openDealsCount(Integer openDealsCount) {
            this.openDealsCount = openDealsCount;
            return this;
        }

        /**
        * The count of related open deals related with the item
        * @return relatedOpenDealsCount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("related_open_deals_count")
        public Integer getRelatedOpenDealsCount() {
            return relatedOpenDealsCount;
        }

        /**
         * Set relatedOpenDealsCount
         **/
        public void setRelatedOpenDealsCount(Integer relatedOpenDealsCount) {
            this.relatedOpenDealsCount = relatedOpenDealsCount;
        }

        public AddParticipantsResponseDataQueryParam relatedOpenDealsCount(Integer relatedOpenDealsCount) {
            this.relatedOpenDealsCount = relatedOpenDealsCount;
            return this;
        }

        /**
        * The count of closed deals related with the item
        * @return closedDealsCount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("closed_deals_count")
        public Integer getClosedDealsCount() {
            return closedDealsCount;
        }

        /**
         * Set closedDealsCount
         **/
        public void setClosedDealsCount(Integer closedDealsCount) {
            this.closedDealsCount = closedDealsCount;
        }

        public AddParticipantsResponseDataQueryParam closedDealsCount(Integer closedDealsCount) {
            this.closedDealsCount = closedDealsCount;
            return this;
        }

        /**
        * The count of related closed deals related with the item
        * @return relatedClosedDealsCount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("related_closed_deals_count")
        public Integer getRelatedClosedDealsCount() {
            return relatedClosedDealsCount;
        }

        /**
         * Set relatedClosedDealsCount
         **/
        public void setRelatedClosedDealsCount(Integer relatedClosedDealsCount) {
            this.relatedClosedDealsCount = relatedClosedDealsCount;
        }

        public AddParticipantsResponseDataQueryParam relatedClosedDealsCount(Integer relatedClosedDealsCount) {
            this.relatedClosedDealsCount = relatedClosedDealsCount;
            return this;
        }

        /**
        * The count of won deals related with the item
        * @return wonDealsCount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("won_deals_count")
        public Integer getWonDealsCount() {
            return wonDealsCount;
        }

        /**
         * Set wonDealsCount
         **/
        public void setWonDealsCount(Integer wonDealsCount) {
            this.wonDealsCount = wonDealsCount;
        }

        public AddParticipantsResponseDataQueryParam wonDealsCount(Integer wonDealsCount) {
            this.wonDealsCount = wonDealsCount;
            return this;
        }

        /**
        * The count of related won deals related with the item
        * @return relatedWonDealsCount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("related_won_deals_count")
        public Integer getRelatedWonDealsCount() {
            return relatedWonDealsCount;
        }

        /**
         * Set relatedWonDealsCount
         **/
        public void setRelatedWonDealsCount(Integer relatedWonDealsCount) {
            this.relatedWonDealsCount = relatedWonDealsCount;
        }

        public AddParticipantsResponseDataQueryParam relatedWonDealsCount(Integer relatedWonDealsCount) {
            this.relatedWonDealsCount = relatedWonDealsCount;
            return this;
        }

        /**
        * The count of lost deals related with the item
        * @return lostDealsCount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("lost_deals_count")
        public Integer getLostDealsCount() {
            return lostDealsCount;
        }

        /**
         * Set lostDealsCount
         **/
        public void setLostDealsCount(Integer lostDealsCount) {
            this.lostDealsCount = lostDealsCount;
        }

        public AddParticipantsResponseDataQueryParam lostDealsCount(Integer lostDealsCount) {
            this.lostDealsCount = lostDealsCount;
            return this;
        }

        /**
        * The count of related lost deals related with the item
        * @return relatedLostDealsCount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("related_lost_deals_count")
        public Integer getRelatedLostDealsCount() {
            return relatedLostDealsCount;
        }

        /**
         * Set relatedLostDealsCount
         **/
        public void setRelatedLostDealsCount(Integer relatedLostDealsCount) {
            this.relatedLostDealsCount = relatedLostDealsCount;
        }

        public AddParticipantsResponseDataQueryParam relatedLostDealsCount(Integer relatedLostDealsCount) {
            this.relatedLostDealsCount = relatedLostDealsCount;
            return this;
        }

        /**
        * The date of the next activity associated with the deal
        * @return nextActivityDate
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("next_activity_date")
        public String getNextActivityDate() {
            return nextActivityDate;
        }

        /**
         * Set nextActivityDate
         **/
        public void setNextActivityDate(String nextActivityDate) {
            this.nextActivityDate = nextActivityDate;
        }

        public AddParticipantsResponseDataQueryParam nextActivityDate(String nextActivityDate) {
            this.nextActivityDate = nextActivityDate;
            return this;
        }

        /**
        * The time of the next activity associated with the deal
        * @return nextActivityTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("next_activity_time")
        public String getNextActivityTime() {
            return nextActivityTime;
        }

        /**
         * Set nextActivityTime
         **/
        public void setNextActivityTime(String nextActivityTime) {
            this.nextActivityTime = nextActivityTime;
        }

        public AddParticipantsResponseDataQueryParam nextActivityTime(String nextActivityTime) {
            this.nextActivityTime = nextActivityTime;
            return this;
        }

        /**
        * The ID of the next activity associated with the deal
        * @return nextActivityId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("next_activity_id")
        public Integer getNextActivityId() {
            return nextActivityId;
        }

        /**
         * Set nextActivityId
         **/
        public void setNextActivityId(Integer nextActivityId) {
            this.nextActivityId = nextActivityId;
        }

        public AddParticipantsResponseDataQueryParam nextActivityId(Integer nextActivityId) {
            this.nextActivityId = nextActivityId;
            return this;
        }

        /**
        * The ID of the last activity associated with the deal
        * @return lastActivityId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("last_activity_id")
        public Integer getLastActivityId() {
            return lastActivityId;
        }

        /**
         * Set lastActivityId
         **/
        public void setLastActivityId(Integer lastActivityId) {
            this.lastActivityId = lastActivityId;
        }

        public AddParticipantsResponseDataQueryParam lastActivityId(Integer lastActivityId) {
            this.lastActivityId = lastActivityId;
            return this;
        }

        /**
        * The date of the last activity associated with the deal
        * @return lastActivityDate
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("last_activity_date")
        public String getLastActivityDate() {
            return lastActivityDate;
        }

        /**
         * Set lastActivityDate
         **/
        public void setLastActivityDate(String lastActivityDate) {
            this.lastActivityDate = lastActivityDate;
        }

        public AddParticipantsResponseDataQueryParam lastActivityDate(String lastActivityDate) {
            this.lastActivityDate = lastActivityDate;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddParticipantsResponseDataQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
            sb.append("    email: ").append(toIndentedString(email)).append("\n");
            sb.append("    firstChar: ").append(toIndentedString(firstChar)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
            sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
            sb.append("    pictureId: ").append(toIndentedString(pictureId)).append("\n");
            sb.append("    label: ").append(toIndentedString(label)).append("\n");
            sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
            sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
            sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
            sb.append("    ccEmail: ").append(toIndentedString(ccEmail)).append("\n");
            sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
            sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
            sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
            sb.append("    emailMessagesCount: ").append(toIndentedString(emailMessagesCount)).append("\n");
            sb.append("    activitiesCount: ").append(toIndentedString(activitiesCount)).append("\n");
            sb.append("    doneActivitiesCount: ").append(toIndentedString(doneActivitiesCount)).append("\n");
            sb.append("    undoneActivitiesCount: ").append(toIndentedString(undoneActivitiesCount)).append("\n");
            sb.append("    filesCount: ").append(toIndentedString(filesCount)).append("\n");
            sb.append("    notesCount: ").append(toIndentedString(notesCount)).append("\n");
            sb.append("    followersCount: ").append(toIndentedString(followersCount)).append("\n");
            sb.append("    lastIncomingMailTime: ").append(toIndentedString(lastIncomingMailTime)).append("\n");
            sb.append("    lastOutgoingMailTime: ").append(toIndentedString(lastOutgoingMailTime)).append("\n");
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
