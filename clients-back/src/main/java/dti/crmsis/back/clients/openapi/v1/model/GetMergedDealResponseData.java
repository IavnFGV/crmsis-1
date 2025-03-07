package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetMergedDealResponseData  {

    /**
      * The ID of the deal
     **/
    private Integer id;
    /**
      * The ID of the deal creator
     **/
    private Integer creatorUserId;
    /**
      * The ID of the user
     **/
    private Integer userId;
    /**
      * The ID of the person associated with the deal
     **/
    private Integer personId;
    /**
      * The ID of the organization associated with the deal
     **/
    private Integer orgId;
    /**
      * The ID of the deal stage
     **/
    private Integer stageId;
    /**
      * The title of the deal
     **/
    private String title;
    /**
      * The value of the deal
     **/
    private BigDecimal value;
    /**
      * The currency associated with the deal
     **/
    private String currency;
    /**
      * The creation date and time of the deal
     **/
    private String addTime;
    /**
      * The last updated date and time of the deal
     **/
    private String updateTime;
    /**
      * The last updated date and time of the deal stage
     **/
    private String stageChangeTime;
    /**
      * Whether the deal is active or not
     **/
    private Boolean active;
    /**
      * Whether the deal is deleted or not
     **/
    private Boolean deleted;
    /**
      * The status of the deal
     **/
    private String status;
    /**
      * The success probability percentage of the deal
     **/
    private BigDecimal probability;
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
      * The reason for losing the deal
     **/
    private String lostReason;
    /**
      * The visibility of the deal
     **/
    private String visibleTo;
    /**
      * The date and time of closing the deal
     **/
    private String closeTime;
    /**
      * The ID of the pipeline associated with the deal
     **/
    private Integer pipelineId;
    /**
      * The date and time of changing the deal status as won
     **/
    private String wonTime;
    /**
      * The date and time of the first time changing the deal status as won
     **/
    private String firstWonTime;
    /**
      * The date and time of changing the deal status as lost
     **/
    private String lostTime;
    /**
      * The number of products associated with the deal
     **/
    private Integer productsCount;
    /**
      * The number of files associated with the deal
     **/
    private Integer filesCount;
    /**
      * The number of notes associated with the deal
     **/
    private Integer notesCount;
    /**
      * The number of followers associated with the deal
     **/
    private Integer followersCount;
    /**
      * The number of emails associated with the deal
     **/
    private Integer emailMessagesCount;
    /**
      * The number of activities associated with the deal
     **/
    private Integer activitiesCount;
    /**
      * The number of completed activities associated with the deal
     **/
    private Integer doneActivitiesCount;
    /**
      * The number of incomplete activities associated with the deal
     **/
    private Integer undoneActivitiesCount;
    /**
      * The number of participants associated with the deal
     **/
    private Integer participantsCount;
    /**
      * The expected close date of the deal
     **/
    private LocalDate expectedCloseDate;
    /**
      * The date and time of the last incoming email associated with the deal
     **/
    private String lastIncomingMailTime;
    /**
      * The date and time of the last outgoing email associated with the deal
     **/
    private String lastOutgoingMailTime;
    /**
      * The label or multiple labels assigned to the deal
     **/
    private String label;
    /**
      * The order number of the deal stage associated with the deal
     **/
    private Integer stageOrderNr;
    /**
      * The name of the person associated with the deal
     **/
    private String personName;
    /**
      * The name of the organization associated with the deal
     **/
    private String orgName;
    /**
      * The subject of the next activity associated with the deal
     **/
    private String nextActivitySubject;
    /**
      * The type of the next activity associated with the deal
     **/
    private String nextActivityType;
    /**
      * The duration of the next activity associated with the deal
     **/
    private String nextActivityDuration;
    /**
      * The note of the next activity associated with the deal
     **/
    private String nextActivityNote;
    /**
      * The deal value formatted with selected currency. E.g. US$500
     **/
    private String formattedValue;
    /**
      * Probability times deal value. Probability can either be deal probability or if not set, then stage probability.
     **/
    private BigDecimal weightedValue;
    /**
      * The weighted_value formatted with selected currency. E.g. US$500
     **/
    private String formattedWeightedValue;
    /**
      * The currency associated with the deal
     **/
    private String weightedValueCurrency;
    /**
      * The date and time of changing the deal status as rotten
     **/
    private String rottenTime;
    /**
      * The name of the deal owner
     **/
    private String ownerName;
    /**
      * The BCC email of the deal
     **/
    private String ccEmail;
    /**
      * If the organization that is associated with the deal is hidden or not
     **/
    private Boolean orgHidden;
    /**
      * If the person that is associated with the deal is hidden or not
     **/
    private Boolean personHidden;
    /**
      * The way this Deal was created. `origin` field is set by Pipedrive when Deal is created and cannot be changed.
     **/
    private String origin;
    /**
      * The optional ID to further distinguish the origin of the deal - e.g. Which API integration created this Deal.
     **/
    private String originId;
    /**
      * The ID of your Marketing channel this Deal was created from. Recognized Marketing channels can be configured in your <a href=\"https://app.pipedrive.com/settings/fields\" target=\"_blank\" rel=\"noopener noreferrer\">Company settings</a>.
     **/
    private Integer channel;
    /**
      * The optional ID to further distinguish the Marketing channel.
     **/
    private String channelId;
    /**
      * Only available in Advanced and above plans  The Annual Recurring Revenue of the deal  Null if there are no products attached to the deal 
     **/
    private BigDecimal arr;
    /**
      * Only available in Advanced and above plans  The Monthly Recurring Revenue of the deal  Null if there are no products attached to the deal 
     **/
    private BigDecimal mrr;
    /**
      * Only available in Advanced and above plans  The Annual Contract Value of the deal  Null if there are no products attached to the deal 
     **/
    private BigDecimal acv;
    /**
      * Only available in Advanced and above plans  The Currency for Annual Recurring Revenue of the deal  If the `arr` is null, this will also be null 
     **/
    private String arrCurrency;
    /**
      * Only available in Advanced and above plans  The Currency for Monthly Recurring Revenue of the deal  If the `mrr` is null, this will also be null 
     **/
    private String mrrCurrency;
    /**
      * Only available in Advanced and above plans  The Currency for Annual Contract Value of the deal  If the `acv` is null, this will also be null 
     **/
    private String acvCurrency;
    /**
      * The deal ID of the deal which the original deal was merged with
     **/
    private Integer mergeWhatId;

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

    public GetMergedDealResponseData id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The ID of the deal creator
    * @return creatorUserId
    **/
    @JsonProperty("creator_user_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getCreatorUserId() {
        return creatorUserId;
    }

    /**
     * Set creatorUserId
     **/
    public void setCreatorUserId(Integer creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public GetMergedDealResponseData creatorUserId(Integer creatorUserId) {
        this.creatorUserId = creatorUserId;
        return this;
    }

    /**
    * The ID of the user
    * @return userId
    **/
    @JsonProperty("user_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getUserId() {
        return userId;
    }

    /**
     * Set userId
     **/
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public GetMergedDealResponseData userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
    * The ID of the person associated with the deal
    * @return personId
    **/
    @JsonProperty("person_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getPersonId() {
        return personId;
    }

    /**
     * Set personId
     **/
    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public GetMergedDealResponseData personId(Integer personId) {
        this.personId = personId;
        return this;
    }

    /**
    * The ID of the organization associated with the deal
    * @return orgId
    **/
    @JsonProperty("org_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * Set orgId
     **/
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public GetMergedDealResponseData orgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }

    /**
    * The ID of the deal stage
    * @return stageId
    **/
    @JsonProperty("stage_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getStageId() {
        return stageId;
    }

    /**
     * Set stageId
     **/
    public void setStageId(Integer stageId) {
        this.stageId = stageId;
    }

    public GetMergedDealResponseData stageId(Integer stageId) {
        this.stageId = stageId;
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

    public GetMergedDealResponseData title(String title) {
        this.title = title;
        return this;
    }

    /**
    * The value of the deal
    * @return value
    **/
    @JsonProperty("value")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Set value
     **/
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public GetMergedDealResponseData value(BigDecimal value) {
        this.value = value;
        return this;
    }

    /**
    * The currency associated with the deal
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

    public GetMergedDealResponseData currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
    * The creation date and time of the deal
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

    public GetMergedDealResponseData addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The last updated date and time of the deal
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

    public GetMergedDealResponseData updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
    * The last updated date and time of the deal stage
    * @return stageChangeTime
    **/
    @JsonProperty("stage_change_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getStageChangeTime() {
        return stageChangeTime;
    }

    /**
     * Set stageChangeTime
     **/
    public void setStageChangeTime(String stageChangeTime) {
        this.stageChangeTime = stageChangeTime;
    }

    public GetMergedDealResponseData stageChangeTime(String stageChangeTime) {
        this.stageChangeTime = stageChangeTime;
        return this;
    }

    /**
    * Whether the deal is active or not
    * @return active
    **/
    @JsonProperty("active")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getActive() {
        return active;
    }

    /**
     * Set active
     **/
    public void setActive(Boolean active) {
        this.active = active;
    }

    public GetMergedDealResponseData active(Boolean active) {
        this.active = active;
        return this;
    }

    /**
    * Whether the deal is deleted or not
    * @return deleted
    **/
    @JsonProperty("deleted")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * Set deleted
     **/
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public GetMergedDealResponseData deleted(Boolean deleted) {
        this.deleted = deleted;
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

    public GetMergedDealResponseData status(String status) {
        this.status = status;
        return this;
    }

    /**
    * The success probability percentage of the deal
    * @return probability
    **/
    @JsonProperty("probability")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getProbability() {
        return probability;
    }

    /**
     * Set probability
     **/
    public void setProbability(BigDecimal probability) {
        this.probability = probability;
    }

    public GetMergedDealResponseData probability(BigDecimal probability) {
        this.probability = probability;
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

    public GetMergedDealResponseData nextActivityDate(String nextActivityDate) {
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

    public GetMergedDealResponseData nextActivityTime(String nextActivityTime) {
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

    public GetMergedDealResponseData nextActivityId(Integer nextActivityId) {
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

    public GetMergedDealResponseData lastActivityId(Integer lastActivityId) {
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

    public GetMergedDealResponseData lastActivityDate(String lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
        return this;
    }

    /**
    * The reason for losing the deal
    * @return lostReason
    **/
    @JsonProperty("lost_reason")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLostReason() {
        return lostReason;
    }

    /**
     * Set lostReason
     **/
    public void setLostReason(String lostReason) {
        this.lostReason = lostReason;
    }

    public GetMergedDealResponseData lostReason(String lostReason) {
        this.lostReason = lostReason;
        return this;
    }

    /**
    * The visibility of the deal
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

    public GetMergedDealResponseData visibleTo(String visibleTo) {
        this.visibleTo = visibleTo;
        return this;
    }

    /**
    * The date and time of closing the deal
    * @return closeTime
    **/
    @JsonProperty("close_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getCloseTime() {
        return closeTime;
    }

    /**
     * Set closeTime
     **/
    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public GetMergedDealResponseData closeTime(String closeTime) {
        this.closeTime = closeTime;
        return this;
    }

    /**
    * The ID of the pipeline associated with the deal
    * @return pipelineId
    **/
    @JsonProperty("pipeline_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getPipelineId() {
        return pipelineId;
    }

    /**
     * Set pipelineId
     **/
    public void setPipelineId(Integer pipelineId) {
        this.pipelineId = pipelineId;
    }

    public GetMergedDealResponseData pipelineId(Integer pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
    * The date and time of changing the deal status as won
    * @return wonTime
    **/
    @JsonProperty("won_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getWonTime() {
        return wonTime;
    }

    /**
     * Set wonTime
     **/
    public void setWonTime(String wonTime) {
        this.wonTime = wonTime;
    }

    public GetMergedDealResponseData wonTime(String wonTime) {
        this.wonTime = wonTime;
        return this;
    }

    /**
    * The date and time of the first time changing the deal status as won
    * @return firstWonTime
    **/
    @JsonProperty("first_won_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getFirstWonTime() {
        return firstWonTime;
    }

    /**
     * Set firstWonTime
     **/
    public void setFirstWonTime(String firstWonTime) {
        this.firstWonTime = firstWonTime;
    }

    public GetMergedDealResponseData firstWonTime(String firstWonTime) {
        this.firstWonTime = firstWonTime;
        return this;
    }

    /**
    * The date and time of changing the deal status as lost
    * @return lostTime
    **/
    @JsonProperty("lost_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLostTime() {
        return lostTime;
    }

    /**
     * Set lostTime
     **/
    public void setLostTime(String lostTime) {
        this.lostTime = lostTime;
    }

    public GetMergedDealResponseData lostTime(String lostTime) {
        this.lostTime = lostTime;
        return this;
    }

    /**
    * The number of products associated with the deal
    * @return productsCount
    **/
    @JsonProperty("products_count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getProductsCount() {
        return productsCount;
    }

    /**
     * Set productsCount
     **/
    public void setProductsCount(Integer productsCount) {
        this.productsCount = productsCount;
    }

    public GetMergedDealResponseData productsCount(Integer productsCount) {
        this.productsCount = productsCount;
        return this;
    }

    /**
    * The number of files associated with the deal
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

    public GetMergedDealResponseData filesCount(Integer filesCount) {
        this.filesCount = filesCount;
        return this;
    }

    /**
    * The number of notes associated with the deal
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

    public GetMergedDealResponseData notesCount(Integer notesCount) {
        this.notesCount = notesCount;
        return this;
    }

    /**
    * The number of followers associated with the deal
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

    public GetMergedDealResponseData followersCount(Integer followersCount) {
        this.followersCount = followersCount;
        return this;
    }

    /**
    * The number of emails associated with the deal
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

    public GetMergedDealResponseData emailMessagesCount(Integer emailMessagesCount) {
        this.emailMessagesCount = emailMessagesCount;
        return this;
    }

    /**
    * The number of activities associated with the deal
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

    public GetMergedDealResponseData activitiesCount(Integer activitiesCount) {
        this.activitiesCount = activitiesCount;
        return this;
    }

    /**
    * The number of completed activities associated with the deal
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

    public GetMergedDealResponseData doneActivitiesCount(Integer doneActivitiesCount) {
        this.doneActivitiesCount = doneActivitiesCount;
        return this;
    }

    /**
    * The number of incomplete activities associated with the deal
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

    public GetMergedDealResponseData undoneActivitiesCount(Integer undoneActivitiesCount) {
        this.undoneActivitiesCount = undoneActivitiesCount;
        return this;
    }

    /**
    * The number of participants associated with the deal
    * @return participantsCount
    **/
    @JsonProperty("participants_count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getParticipantsCount() {
        return participantsCount;
    }

    /**
     * Set participantsCount
     **/
    public void setParticipantsCount(Integer participantsCount) {
        this.participantsCount = participantsCount;
    }

    public GetMergedDealResponseData participantsCount(Integer participantsCount) {
        this.participantsCount = participantsCount;
        return this;
    }

    /**
    * The expected close date of the deal
    * @return expectedCloseDate
    **/
    @JsonProperty("expected_close_date")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public LocalDate getExpectedCloseDate() {
        return expectedCloseDate;
    }

    /**
     * Set expectedCloseDate
     **/
    public void setExpectedCloseDate(LocalDate expectedCloseDate) {
        this.expectedCloseDate = expectedCloseDate;
    }

    public GetMergedDealResponseData expectedCloseDate(LocalDate expectedCloseDate) {
        this.expectedCloseDate = expectedCloseDate;
        return this;
    }

    /**
    * The date and time of the last incoming email associated with the deal
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

    public GetMergedDealResponseData lastIncomingMailTime(String lastIncomingMailTime) {
        this.lastIncomingMailTime = lastIncomingMailTime;
        return this;
    }

    /**
    * The date and time of the last outgoing email associated with the deal
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

    public GetMergedDealResponseData lastOutgoingMailTime(String lastOutgoingMailTime) {
        this.lastOutgoingMailTime = lastOutgoingMailTime;
        return this;
    }

    /**
    * The label or multiple labels assigned to the deal
    * @return label
    **/
    @JsonProperty("label")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLabel() {
        return label;
    }

    /**
     * Set label
     **/
    public void setLabel(String label) {
        this.label = label;
    }

    public GetMergedDealResponseData label(String label) {
        this.label = label;
        return this;
    }

    /**
    * The order number of the deal stage associated with the deal
    * @return stageOrderNr
    **/
    @JsonProperty("stage_order_nr")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getStageOrderNr() {
        return stageOrderNr;
    }

    /**
     * Set stageOrderNr
     **/
    public void setStageOrderNr(Integer stageOrderNr) {
        this.stageOrderNr = stageOrderNr;
    }

    public GetMergedDealResponseData stageOrderNr(Integer stageOrderNr) {
        this.stageOrderNr = stageOrderNr;
        return this;
    }

    /**
    * The name of the person associated with the deal
    * @return personName
    **/
    @JsonProperty("person_name")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPersonName() {
        return personName;
    }

    /**
     * Set personName
     **/
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public GetMergedDealResponseData personName(String personName) {
        this.personName = personName;
        return this;
    }

    /**
    * The name of the organization associated with the deal
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

    public GetMergedDealResponseData orgName(String orgName) {
        this.orgName = orgName;
        return this;
    }

    /**
    * The subject of the next activity associated with the deal
    * @return nextActivitySubject
    **/
    @JsonProperty("next_activity_subject")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getNextActivitySubject() {
        return nextActivitySubject;
    }

    /**
     * Set nextActivitySubject
     **/
    public void setNextActivitySubject(String nextActivitySubject) {
        this.nextActivitySubject = nextActivitySubject;
    }

    public GetMergedDealResponseData nextActivitySubject(String nextActivitySubject) {
        this.nextActivitySubject = nextActivitySubject;
        return this;
    }

    /**
    * The type of the next activity associated with the deal
    * @return nextActivityType
    **/
    @JsonProperty("next_activity_type")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getNextActivityType() {
        return nextActivityType;
    }

    /**
     * Set nextActivityType
     **/
    public void setNextActivityType(String nextActivityType) {
        this.nextActivityType = nextActivityType;
    }

    public GetMergedDealResponseData nextActivityType(String nextActivityType) {
        this.nextActivityType = nextActivityType;
        return this;
    }

    /**
    * The duration of the next activity associated with the deal
    * @return nextActivityDuration
    **/
    @JsonProperty("next_activity_duration")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getNextActivityDuration() {
        return nextActivityDuration;
    }

    /**
     * Set nextActivityDuration
     **/
    public void setNextActivityDuration(String nextActivityDuration) {
        this.nextActivityDuration = nextActivityDuration;
    }

    public GetMergedDealResponseData nextActivityDuration(String nextActivityDuration) {
        this.nextActivityDuration = nextActivityDuration;
        return this;
    }

    /**
    * The note of the next activity associated with the deal
    * @return nextActivityNote
    **/
    @JsonProperty("next_activity_note")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getNextActivityNote() {
        return nextActivityNote;
    }

    /**
     * Set nextActivityNote
     **/
    public void setNextActivityNote(String nextActivityNote) {
        this.nextActivityNote = nextActivityNote;
    }

    public GetMergedDealResponseData nextActivityNote(String nextActivityNote) {
        this.nextActivityNote = nextActivityNote;
        return this;
    }

    /**
    * The deal value formatted with selected currency. E.g. US$500
    * @return formattedValue
    **/
    @JsonProperty("formatted_value")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getFormattedValue() {
        return formattedValue;
    }

    /**
     * Set formattedValue
     **/
    public void setFormattedValue(String formattedValue) {
        this.formattedValue = formattedValue;
    }

    public GetMergedDealResponseData formattedValue(String formattedValue) {
        this.formattedValue = formattedValue;
        return this;
    }

    /**
    * Probability times deal value. Probability can either be deal probability or if not set, then stage probability.
    * @return weightedValue
    **/
    @JsonProperty("weighted_value")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getWeightedValue() {
        return weightedValue;
    }

    /**
     * Set weightedValue
     **/
    public void setWeightedValue(BigDecimal weightedValue) {
        this.weightedValue = weightedValue;
    }

    public GetMergedDealResponseData weightedValue(BigDecimal weightedValue) {
        this.weightedValue = weightedValue;
        return this;
    }

    /**
    * The weighted_value formatted with selected currency. E.g. US$500
    * @return formattedWeightedValue
    **/
    @JsonProperty("formatted_weighted_value")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getFormattedWeightedValue() {
        return formattedWeightedValue;
    }

    /**
     * Set formattedWeightedValue
     **/
    public void setFormattedWeightedValue(String formattedWeightedValue) {
        this.formattedWeightedValue = formattedWeightedValue;
    }

    public GetMergedDealResponseData formattedWeightedValue(String formattedWeightedValue) {
        this.formattedWeightedValue = formattedWeightedValue;
        return this;
    }

    /**
    * The currency associated with the deal
    * @return weightedValueCurrency
    **/
    @JsonProperty("weighted_value_currency")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getWeightedValueCurrency() {
        return weightedValueCurrency;
    }

    /**
     * Set weightedValueCurrency
     **/
    public void setWeightedValueCurrency(String weightedValueCurrency) {
        this.weightedValueCurrency = weightedValueCurrency;
    }

    public GetMergedDealResponseData weightedValueCurrency(String weightedValueCurrency) {
        this.weightedValueCurrency = weightedValueCurrency;
        return this;
    }

    /**
    * The date and time of changing the deal status as rotten
    * @return rottenTime
    **/
    @JsonProperty("rotten_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getRottenTime() {
        return rottenTime;
    }

    /**
     * Set rottenTime
     **/
    public void setRottenTime(String rottenTime) {
        this.rottenTime = rottenTime;
    }

    public GetMergedDealResponseData rottenTime(String rottenTime) {
        this.rottenTime = rottenTime;
        return this;
    }

    /**
    * The name of the deal owner
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

    public GetMergedDealResponseData ownerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    /**
    * The BCC email of the deal
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

    public GetMergedDealResponseData ccEmail(String ccEmail) {
        this.ccEmail = ccEmail;
        return this;
    }

    /**
    * If the organization that is associated with the deal is hidden or not
    * @return orgHidden
    **/
    @JsonProperty("org_hidden")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getOrgHidden() {
        return orgHidden;
    }

    /**
     * Set orgHidden
     **/
    public void setOrgHidden(Boolean orgHidden) {
        this.orgHidden = orgHidden;
    }

    public GetMergedDealResponseData orgHidden(Boolean orgHidden) {
        this.orgHidden = orgHidden;
        return this;
    }

    /**
    * If the person that is associated with the deal is hidden or not
    * @return personHidden
    **/
    @JsonProperty("person_hidden")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getPersonHidden() {
        return personHidden;
    }

    /**
     * Set personHidden
     **/
    public void setPersonHidden(Boolean personHidden) {
        this.personHidden = personHidden;
    }

    public GetMergedDealResponseData personHidden(Boolean personHidden) {
        this.personHidden = personHidden;
        return this;
    }

    /**
    * The way this Deal was created. `origin` field is set by Pipedrive when Deal is created and cannot be changed.
    * @return origin
    **/
    @JsonProperty("origin")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getOrigin() {
        return origin;
    }

    /**
     * Set origin
     **/
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public GetMergedDealResponseData origin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
    * The optional ID to further distinguish the origin of the deal - e.g. Which API integration created this Deal.
    * @return originId
    **/
    @JsonProperty("origin_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getOriginId() {
        return originId;
    }

    /**
     * Set originId
     **/
    public void setOriginId(String originId) {
        this.originId = originId;
    }

    public GetMergedDealResponseData originId(String originId) {
        this.originId = originId;
        return this;
    }

    /**
    * The ID of your Marketing channel this Deal was created from. Recognized Marketing channels can be configured in your <a href=\"https://app.pipedrive.com/settings/fields\" target=\"_blank\" rel=\"noopener noreferrer\">Company settings</a>.
    * @return channel
    **/
    @JsonProperty("channel")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getChannel() {
        return channel;
    }

    /**
     * Set channel
     **/
    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public GetMergedDealResponseData channel(Integer channel) {
        this.channel = channel;
        return this;
    }

    /**
    * The optional ID to further distinguish the Marketing channel.
    * @return channelId
    **/
    @JsonProperty("channel_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getChannelId() {
        return channelId;
    }

    /**
     * Set channelId
     **/
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public GetMergedDealResponseData channelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
    * Only available in Advanced and above plans  The Annual Recurring Revenue of the deal  Null if there are no products attached to the deal 
    * @return arr
    **/
    @JsonProperty("arr")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getArr() {
        return arr;
    }

    /**
     * Set arr
     **/
    public void setArr(BigDecimal arr) {
        this.arr = arr;
    }

    public GetMergedDealResponseData arr(BigDecimal arr) {
        this.arr = arr;
        return this;
    }

    /**
    * Only available in Advanced and above plans  The Monthly Recurring Revenue of the deal  Null if there are no products attached to the deal 
    * @return mrr
    **/
    @JsonProperty("mrr")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getMrr() {
        return mrr;
    }

    /**
     * Set mrr
     **/
    public void setMrr(BigDecimal mrr) {
        this.mrr = mrr;
    }

    public GetMergedDealResponseData mrr(BigDecimal mrr) {
        this.mrr = mrr;
        return this;
    }

    /**
    * Only available in Advanced and above plans  The Annual Contract Value of the deal  Null if there are no products attached to the deal 
    * @return acv
    **/
    @JsonProperty("acv")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getAcv() {
        return acv;
    }

    /**
     * Set acv
     **/
    public void setAcv(BigDecimal acv) {
        this.acv = acv;
    }

    public GetMergedDealResponseData acv(BigDecimal acv) {
        this.acv = acv;
        return this;
    }

    /**
    * Only available in Advanced and above plans  The Currency for Annual Recurring Revenue of the deal  If the `arr` is null, this will also be null 
    * @return arrCurrency
    **/
    @JsonProperty("arr_currency")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getArrCurrency() {
        return arrCurrency;
    }

    /**
     * Set arrCurrency
     **/
    public void setArrCurrency(String arrCurrency) {
        this.arrCurrency = arrCurrency;
    }

    public GetMergedDealResponseData arrCurrency(String arrCurrency) {
        this.arrCurrency = arrCurrency;
        return this;
    }

    /**
    * Only available in Advanced and above plans  The Currency for Monthly Recurring Revenue of the deal  If the `mrr` is null, this will also be null 
    * @return mrrCurrency
    **/
    @JsonProperty("mrr_currency")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getMrrCurrency() {
        return mrrCurrency;
    }

    /**
     * Set mrrCurrency
     **/
    public void setMrrCurrency(String mrrCurrency) {
        this.mrrCurrency = mrrCurrency;
    }

    public GetMergedDealResponseData mrrCurrency(String mrrCurrency) {
        this.mrrCurrency = mrrCurrency;
        return this;
    }

    /**
    * Only available in Advanced and above plans  The Currency for Annual Contract Value of the deal  If the `acv` is null, this will also be null 
    * @return acvCurrency
    **/
    @JsonProperty("acv_currency")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getAcvCurrency() {
        return acvCurrency;
    }

    /**
     * Set acvCurrency
     **/
    public void setAcvCurrency(String acvCurrency) {
        this.acvCurrency = acvCurrency;
    }

    public GetMergedDealResponseData acvCurrency(String acvCurrency) {
        this.acvCurrency = acvCurrency;
        return this;
    }

    /**
    * The deal ID of the deal which the original deal was merged with
    * @return mergeWhatId
    **/
    @JsonProperty("merge_what_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getMergeWhatId() {
        return mergeWhatId;
    }

    /**
     * Set mergeWhatId
     **/
    public void setMergeWhatId(Integer mergeWhatId) {
        this.mergeWhatId = mergeWhatId;
    }

    public GetMergedDealResponseData mergeWhatId(Integer mergeWhatId) {
        this.mergeWhatId = mergeWhatId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetMergedDealResponseData {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    creatorUserId: ").append(toIndentedString(creatorUserId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
        sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
        sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    stageChangeTime: ").append(toIndentedString(stageChangeTime)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
        sb.append("    nextActivityDate: ").append(toIndentedString(nextActivityDate)).append("\n");
        sb.append("    nextActivityTime: ").append(toIndentedString(nextActivityTime)).append("\n");
        sb.append("    nextActivityId: ").append(toIndentedString(nextActivityId)).append("\n");
        sb.append("    lastActivityId: ").append(toIndentedString(lastActivityId)).append("\n");
        sb.append("    lastActivityDate: ").append(toIndentedString(lastActivityDate)).append("\n");
        sb.append("    lostReason: ").append(toIndentedString(lostReason)).append("\n");
        sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
        sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    wonTime: ").append(toIndentedString(wonTime)).append("\n");
        sb.append("    firstWonTime: ").append(toIndentedString(firstWonTime)).append("\n");
        sb.append("    lostTime: ").append(toIndentedString(lostTime)).append("\n");
        sb.append("    productsCount: ").append(toIndentedString(productsCount)).append("\n");
        sb.append("    filesCount: ").append(toIndentedString(filesCount)).append("\n");
        sb.append("    notesCount: ").append(toIndentedString(notesCount)).append("\n");
        sb.append("    followersCount: ").append(toIndentedString(followersCount)).append("\n");
        sb.append("    emailMessagesCount: ").append(toIndentedString(emailMessagesCount)).append("\n");
        sb.append("    activitiesCount: ").append(toIndentedString(activitiesCount)).append("\n");
        sb.append("    doneActivitiesCount: ").append(toIndentedString(doneActivitiesCount)).append("\n");
        sb.append("    undoneActivitiesCount: ").append(toIndentedString(undoneActivitiesCount)).append("\n");
        sb.append("    participantsCount: ").append(toIndentedString(participantsCount)).append("\n");
        sb.append("    expectedCloseDate: ").append(toIndentedString(expectedCloseDate)).append("\n");
        sb.append("    lastIncomingMailTime: ").append(toIndentedString(lastIncomingMailTime)).append("\n");
        sb.append("    lastOutgoingMailTime: ").append(toIndentedString(lastOutgoingMailTime)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    stageOrderNr: ").append(toIndentedString(stageOrderNr)).append("\n");
        sb.append("    personName: ").append(toIndentedString(personName)).append("\n");
        sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
        sb.append("    nextActivitySubject: ").append(toIndentedString(nextActivitySubject)).append("\n");
        sb.append("    nextActivityType: ").append(toIndentedString(nextActivityType)).append("\n");
        sb.append("    nextActivityDuration: ").append(toIndentedString(nextActivityDuration)).append("\n");
        sb.append("    nextActivityNote: ").append(toIndentedString(nextActivityNote)).append("\n");
        sb.append("    formattedValue: ").append(toIndentedString(formattedValue)).append("\n");
        sb.append("    weightedValue: ").append(toIndentedString(weightedValue)).append("\n");
        sb.append("    formattedWeightedValue: ").append(toIndentedString(formattedWeightedValue)).append("\n");
        sb.append("    weightedValueCurrency: ").append(toIndentedString(weightedValueCurrency)).append("\n");
        sb.append("    rottenTime: ").append(toIndentedString(rottenTime)).append("\n");
        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
        sb.append("    ccEmail: ").append(toIndentedString(ccEmail)).append("\n");
        sb.append("    orgHidden: ").append(toIndentedString(orgHidden)).append("\n");
        sb.append("    personHidden: ").append(toIndentedString(personHidden)).append("\n");
        sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
        sb.append("    originId: ").append(toIndentedString(originId)).append("\n");
        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
        sb.append("    arr: ").append(toIndentedString(arr)).append("\n");
        sb.append("    mrr: ").append(toIndentedString(mrr)).append("\n");
        sb.append("    acv: ").append(toIndentedString(acv)).append("\n");
        sb.append("    arrCurrency: ").append(toIndentedString(arrCurrency)).append("\n");
        sb.append("    mrrCurrency: ").append(toIndentedString(mrrCurrency)).append("\n");
        sb.append("    acvCurrency: ").append(toIndentedString(acvCurrency)).append("\n");
        sb.append("    mergeWhatId: ").append(toIndentedString(mergeWhatId)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetMergedDealResponseData} object that
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

        GetMergedDealResponseData model = (GetMergedDealResponseData) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(creatorUserId, model.creatorUserId) &&
        java.util.Objects.equals(userId, model.userId) &&
        java.util.Objects.equals(personId, model.personId) &&
        java.util.Objects.equals(orgId, model.orgId) &&
        java.util.Objects.equals(stageId, model.stageId) &&
        java.util.Objects.equals(title, model.title) &&
        java.util.Objects.equals(value, model.value) &&
        java.util.Objects.equals(currency, model.currency) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime) &&
        java.util.Objects.equals(stageChangeTime, model.stageChangeTime) &&
        java.util.Objects.equals(active, model.active) &&
        java.util.Objects.equals(deleted, model.deleted) &&
        java.util.Objects.equals(status, model.status) &&
        java.util.Objects.equals(probability, model.probability) &&
        java.util.Objects.equals(nextActivityDate, model.nextActivityDate) &&
        java.util.Objects.equals(nextActivityTime, model.nextActivityTime) &&
        java.util.Objects.equals(nextActivityId, model.nextActivityId) &&
        java.util.Objects.equals(lastActivityId, model.lastActivityId) &&
        java.util.Objects.equals(lastActivityDate, model.lastActivityDate) &&
        java.util.Objects.equals(lostReason, model.lostReason) &&
        java.util.Objects.equals(visibleTo, model.visibleTo) &&
        java.util.Objects.equals(closeTime, model.closeTime) &&
        java.util.Objects.equals(pipelineId, model.pipelineId) &&
        java.util.Objects.equals(wonTime, model.wonTime) &&
        java.util.Objects.equals(firstWonTime, model.firstWonTime) &&
        java.util.Objects.equals(lostTime, model.lostTime) &&
        java.util.Objects.equals(productsCount, model.productsCount) &&
        java.util.Objects.equals(filesCount, model.filesCount) &&
        java.util.Objects.equals(notesCount, model.notesCount) &&
        java.util.Objects.equals(followersCount, model.followersCount) &&
        java.util.Objects.equals(emailMessagesCount, model.emailMessagesCount) &&
        java.util.Objects.equals(activitiesCount, model.activitiesCount) &&
        java.util.Objects.equals(doneActivitiesCount, model.doneActivitiesCount) &&
        java.util.Objects.equals(undoneActivitiesCount, model.undoneActivitiesCount) &&
        java.util.Objects.equals(participantsCount, model.participantsCount) &&
        java.util.Objects.equals(expectedCloseDate, model.expectedCloseDate) &&
        java.util.Objects.equals(lastIncomingMailTime, model.lastIncomingMailTime) &&
        java.util.Objects.equals(lastOutgoingMailTime, model.lastOutgoingMailTime) &&
        java.util.Objects.equals(label, model.label) &&
        java.util.Objects.equals(stageOrderNr, model.stageOrderNr) &&
        java.util.Objects.equals(personName, model.personName) &&
        java.util.Objects.equals(orgName, model.orgName) &&
        java.util.Objects.equals(nextActivitySubject, model.nextActivitySubject) &&
        java.util.Objects.equals(nextActivityType, model.nextActivityType) &&
        java.util.Objects.equals(nextActivityDuration, model.nextActivityDuration) &&
        java.util.Objects.equals(nextActivityNote, model.nextActivityNote) &&
        java.util.Objects.equals(formattedValue, model.formattedValue) &&
        java.util.Objects.equals(weightedValue, model.weightedValue) &&
        java.util.Objects.equals(formattedWeightedValue, model.formattedWeightedValue) &&
        java.util.Objects.equals(weightedValueCurrency, model.weightedValueCurrency) &&
        java.util.Objects.equals(rottenTime, model.rottenTime) &&
        java.util.Objects.equals(ownerName, model.ownerName) &&
        java.util.Objects.equals(ccEmail, model.ccEmail) &&
        java.util.Objects.equals(orgHidden, model.orgHidden) &&
        java.util.Objects.equals(personHidden, model.personHidden) &&
        java.util.Objects.equals(origin, model.origin) &&
        java.util.Objects.equals(originId, model.originId) &&
        java.util.Objects.equals(channel, model.channel) &&
        java.util.Objects.equals(channelId, model.channelId) &&
        java.util.Objects.equals(arr, model.arr) &&
        java.util.Objects.equals(mrr, model.mrr) &&
        java.util.Objects.equals(acv, model.acv) &&
        java.util.Objects.equals(arrCurrency, model.arrCurrency) &&
        java.util.Objects.equals(mrrCurrency, model.mrrCurrency) &&
        java.util.Objects.equals(acvCurrency, model.acvCurrency) &&
        java.util.Objects.equals(mergeWhatId, model.mergeWhatId);
    }

    /**
     * Returns a hash code for a {@code GetMergedDealResponseData}.
     *
     * @return a hash code value for a {@code GetMergedDealResponseData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        creatorUserId,
        userId,
        personId,
        orgId,
        stageId,
        title,
        value,
        currency,
        addTime,
        updateTime,
        stageChangeTime,
        active,
        deleted,
        status,
        probability,
        nextActivityDate,
        nextActivityTime,
        nextActivityId,
        lastActivityId,
        lastActivityDate,
        lostReason,
        visibleTo,
        closeTime,
        pipelineId,
        wonTime,
        firstWonTime,
        lostTime,
        productsCount,
        filesCount,
        notesCount,
        followersCount,
        emailMessagesCount,
        activitiesCount,
        doneActivitiesCount,
        undoneActivitiesCount,
        participantsCount,
        expectedCloseDate,
        lastIncomingMailTime,
        lastOutgoingMailTime,
        label,
        stageOrderNr,
        personName,
        orgName,
        nextActivitySubject,
        nextActivityType,
        nextActivityDuration,
        nextActivityNote,
        formattedValue,
        weightedValue,
        formattedWeightedValue,
        weightedValueCurrency,
        rottenTime,
        ownerName,
        ccEmail,
        orgHidden,
        personHidden,
        origin,
        originId,
        channel,
        channelId,
        arr,
        mrr,
        acv,
        arrCurrency,
        mrrCurrency,
        acvCurrency,
        mergeWhatId);
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
    public static class GetMergedDealResponseDataQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("creatorUserId")
        private Integer creatorUserId;
        @jakarta.ws.rs.QueryParam("userId")
        private Integer userId;
        @jakarta.ws.rs.QueryParam("personId")
        private Integer personId;
        @jakarta.ws.rs.QueryParam("orgId")
        private Integer orgId;
        @jakarta.ws.rs.QueryParam("stageId")
        private Integer stageId;
        @jakarta.ws.rs.QueryParam("title")
        private String title;
        @jakarta.ws.rs.QueryParam("value")
        private BigDecimal value;
        @jakarta.ws.rs.QueryParam("currency")
        private String currency;
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        @jakarta.ws.rs.QueryParam("updateTime")
        private String updateTime;
        @jakarta.ws.rs.QueryParam("stageChangeTime")
        private String stageChangeTime;
        @jakarta.ws.rs.QueryParam("active")
        private Boolean active;
        @jakarta.ws.rs.QueryParam("deleted")
        private Boolean deleted;
        @jakarta.ws.rs.QueryParam("status")
        private String status;
        @jakarta.ws.rs.QueryParam("probability")
        private BigDecimal probability;
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
        @jakarta.ws.rs.QueryParam("lostReason")
        private String lostReason;
        @jakarta.ws.rs.QueryParam("visibleTo")
        private String visibleTo;
        @jakarta.ws.rs.QueryParam("closeTime")
        private String closeTime;
        @jakarta.ws.rs.QueryParam("pipelineId")
        private Integer pipelineId;
        @jakarta.ws.rs.QueryParam("wonTime")
        private String wonTime;
        @jakarta.ws.rs.QueryParam("firstWonTime")
        private String firstWonTime;
        @jakarta.ws.rs.QueryParam("lostTime")
        private String lostTime;
        @jakarta.ws.rs.QueryParam("productsCount")
        private Integer productsCount;
        @jakarta.ws.rs.QueryParam("filesCount")
        private Integer filesCount;
        @jakarta.ws.rs.QueryParam("notesCount")
        private Integer notesCount;
        @jakarta.ws.rs.QueryParam("followersCount")
        private Integer followersCount;
        @jakarta.ws.rs.QueryParam("emailMessagesCount")
        private Integer emailMessagesCount;
        @jakarta.ws.rs.QueryParam("activitiesCount")
        private Integer activitiesCount;
        @jakarta.ws.rs.QueryParam("doneActivitiesCount")
        private Integer doneActivitiesCount;
        @jakarta.ws.rs.QueryParam("undoneActivitiesCount")
        private Integer undoneActivitiesCount;
        @jakarta.ws.rs.QueryParam("participantsCount")
        private Integer participantsCount;
        @jakarta.ws.rs.QueryParam("expectedCloseDate")
        private LocalDate expectedCloseDate;
        @jakarta.ws.rs.QueryParam("lastIncomingMailTime")
        private String lastIncomingMailTime;
        @jakarta.ws.rs.QueryParam("lastOutgoingMailTime")
        private String lastOutgoingMailTime;
        @jakarta.ws.rs.QueryParam("label")
        private String label;
        @jakarta.ws.rs.QueryParam("stageOrderNr")
        private Integer stageOrderNr;
        @jakarta.ws.rs.QueryParam("personName")
        private String personName;
        @jakarta.ws.rs.QueryParam("orgName")
        private String orgName;
        @jakarta.ws.rs.QueryParam("nextActivitySubject")
        private String nextActivitySubject;
        @jakarta.ws.rs.QueryParam("nextActivityType")
        private String nextActivityType;
        @jakarta.ws.rs.QueryParam("nextActivityDuration")
        private String nextActivityDuration;
        @jakarta.ws.rs.QueryParam("nextActivityNote")
        private String nextActivityNote;
        @jakarta.ws.rs.QueryParam("formattedValue")
        private String formattedValue;
        @jakarta.ws.rs.QueryParam("weightedValue")
        private BigDecimal weightedValue;
        @jakarta.ws.rs.QueryParam("formattedWeightedValue")
        private String formattedWeightedValue;
        @jakarta.ws.rs.QueryParam("weightedValueCurrency")
        private String weightedValueCurrency;
        @jakarta.ws.rs.QueryParam("rottenTime")
        private String rottenTime;
        @jakarta.ws.rs.QueryParam("ownerName")
        private String ownerName;
        @jakarta.ws.rs.QueryParam("ccEmail")
        private String ccEmail;
        @jakarta.ws.rs.QueryParam("orgHidden")
        private Boolean orgHidden;
        @jakarta.ws.rs.QueryParam("personHidden")
        private Boolean personHidden;
        @jakarta.ws.rs.QueryParam("origin")
        private String origin;
        @jakarta.ws.rs.QueryParam("originId")
        private String originId;
        @jakarta.ws.rs.QueryParam("channel")
        private Integer channel;
        @jakarta.ws.rs.QueryParam("channelId")
        private String channelId;
        @jakarta.ws.rs.QueryParam("arr")
        private BigDecimal arr;
        @jakarta.ws.rs.QueryParam("mrr")
        private BigDecimal mrr;
        @jakarta.ws.rs.QueryParam("acv")
        private BigDecimal acv;
        @jakarta.ws.rs.QueryParam("arrCurrency")
        private String arrCurrency;
        @jakarta.ws.rs.QueryParam("mrrCurrency")
        private String mrrCurrency;
        @jakarta.ws.rs.QueryParam("acvCurrency")
        private String acvCurrency;
        @jakarta.ws.rs.QueryParam("mergeWhatId")
        private Integer mergeWhatId;

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

        public GetMergedDealResponseDataQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The ID of the deal creator
        * @return creatorUserId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("creator_user_id")
        public Integer getCreatorUserId() {
            return creatorUserId;
        }

        /**
         * Set creatorUserId
         **/
        public void setCreatorUserId(Integer creatorUserId) {
            this.creatorUserId = creatorUserId;
        }

        public GetMergedDealResponseDataQueryParam creatorUserId(Integer creatorUserId) {
            this.creatorUserId = creatorUserId;
            return this;
        }

        /**
        * The ID of the user
        * @return userId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("user_id")
        public Integer getUserId() {
            return userId;
        }

        /**
         * Set userId
         **/
        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public GetMergedDealResponseDataQueryParam userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        /**
        * The ID of the person associated with the deal
        * @return personId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("person_id")
        public Integer getPersonId() {
            return personId;
        }

        /**
         * Set personId
         **/
        public void setPersonId(Integer personId) {
            this.personId = personId;
        }

        public GetMergedDealResponseDataQueryParam personId(Integer personId) {
            this.personId = personId;
            return this;
        }

        /**
        * The ID of the organization associated with the deal
        * @return orgId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("org_id")
        public Integer getOrgId() {
            return orgId;
        }

        /**
         * Set orgId
         **/
        public void setOrgId(Integer orgId) {
            this.orgId = orgId;
        }

        public GetMergedDealResponseDataQueryParam orgId(Integer orgId) {
            this.orgId = orgId;
            return this;
        }

        /**
        * The ID of the deal stage
        * @return stageId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("stage_id")
        public Integer getStageId() {
            return stageId;
        }

        /**
         * Set stageId
         **/
        public void setStageId(Integer stageId) {
            this.stageId = stageId;
        }

        public GetMergedDealResponseDataQueryParam stageId(Integer stageId) {
            this.stageId = stageId;
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

        public GetMergedDealResponseDataQueryParam title(String title) {
            this.title = title;
            return this;
        }

        /**
        * The value of the deal
        * @return value
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Set value
         **/
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        public GetMergedDealResponseDataQueryParam value(BigDecimal value) {
            this.value = value;
            return this;
        }

        /**
        * The currency associated with the deal
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

        public GetMergedDealResponseDataQueryParam currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
        * The creation date and time of the deal
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

        public GetMergedDealResponseDataQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The last updated date and time of the deal
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

        public GetMergedDealResponseDataQueryParam updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
        * The last updated date and time of the deal stage
        * @return stageChangeTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("stage_change_time")
        public String getStageChangeTime() {
            return stageChangeTime;
        }

        /**
         * Set stageChangeTime
         **/
        public void setStageChangeTime(String stageChangeTime) {
            this.stageChangeTime = stageChangeTime;
        }

        public GetMergedDealResponseDataQueryParam stageChangeTime(String stageChangeTime) {
            this.stageChangeTime = stageChangeTime;
            return this;
        }

        /**
        * Whether the deal is active or not
        * @return active
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("active")
        public Boolean getActive() {
            return active;
        }

        /**
         * Set active
         **/
        public void setActive(Boolean active) {
            this.active = active;
        }

        public GetMergedDealResponseDataQueryParam active(Boolean active) {
            this.active = active;
            return this;
        }

        /**
        * Whether the deal is deleted or not
        * @return deleted
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("deleted")
        public Boolean getDeleted() {
            return deleted;
        }

        /**
         * Set deleted
         **/
        public void setDeleted(Boolean deleted) {
            this.deleted = deleted;
        }

        public GetMergedDealResponseDataQueryParam deleted(Boolean deleted) {
            this.deleted = deleted;
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

        public GetMergedDealResponseDataQueryParam status(String status) {
            this.status = status;
            return this;
        }

        /**
        * The success probability percentage of the deal
        * @return probability
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("probability")
        public BigDecimal getProbability() {
            return probability;
        }

        /**
         * Set probability
         **/
        public void setProbability(BigDecimal probability) {
            this.probability = probability;
        }

        public GetMergedDealResponseDataQueryParam probability(BigDecimal probability) {
            this.probability = probability;
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

        public GetMergedDealResponseDataQueryParam nextActivityDate(String nextActivityDate) {
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

        public GetMergedDealResponseDataQueryParam nextActivityTime(String nextActivityTime) {
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

        public GetMergedDealResponseDataQueryParam nextActivityId(Integer nextActivityId) {
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

        public GetMergedDealResponseDataQueryParam lastActivityId(Integer lastActivityId) {
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

        public GetMergedDealResponseDataQueryParam lastActivityDate(String lastActivityDate) {
            this.lastActivityDate = lastActivityDate;
            return this;
        }

        /**
        * The reason for losing the deal
        * @return lostReason
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("lost_reason")
        public String getLostReason() {
            return lostReason;
        }

        /**
         * Set lostReason
         **/
        public void setLostReason(String lostReason) {
            this.lostReason = lostReason;
        }

        public GetMergedDealResponseDataQueryParam lostReason(String lostReason) {
            this.lostReason = lostReason;
            return this;
        }

        /**
        * The visibility of the deal
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

        public GetMergedDealResponseDataQueryParam visibleTo(String visibleTo) {
            this.visibleTo = visibleTo;
            return this;
        }

        /**
        * The date and time of closing the deal
        * @return closeTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("close_time")
        public String getCloseTime() {
            return closeTime;
        }

        /**
         * Set closeTime
         **/
        public void setCloseTime(String closeTime) {
            this.closeTime = closeTime;
        }

        public GetMergedDealResponseDataQueryParam closeTime(String closeTime) {
            this.closeTime = closeTime;
            return this;
        }

        /**
        * The ID of the pipeline associated with the deal
        * @return pipelineId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("pipeline_id")
        public Integer getPipelineId() {
            return pipelineId;
        }

        /**
         * Set pipelineId
         **/
        public void setPipelineId(Integer pipelineId) {
            this.pipelineId = pipelineId;
        }

        public GetMergedDealResponseDataQueryParam pipelineId(Integer pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }

        /**
        * The date and time of changing the deal status as won
        * @return wonTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("won_time")
        public String getWonTime() {
            return wonTime;
        }

        /**
         * Set wonTime
         **/
        public void setWonTime(String wonTime) {
            this.wonTime = wonTime;
        }

        public GetMergedDealResponseDataQueryParam wonTime(String wonTime) {
            this.wonTime = wonTime;
            return this;
        }

        /**
        * The date and time of the first time changing the deal status as won
        * @return firstWonTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("first_won_time")
        public String getFirstWonTime() {
            return firstWonTime;
        }

        /**
         * Set firstWonTime
         **/
        public void setFirstWonTime(String firstWonTime) {
            this.firstWonTime = firstWonTime;
        }

        public GetMergedDealResponseDataQueryParam firstWonTime(String firstWonTime) {
            this.firstWonTime = firstWonTime;
            return this;
        }

        /**
        * The date and time of changing the deal status as lost
        * @return lostTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("lost_time")
        public String getLostTime() {
            return lostTime;
        }

        /**
         * Set lostTime
         **/
        public void setLostTime(String lostTime) {
            this.lostTime = lostTime;
        }

        public GetMergedDealResponseDataQueryParam lostTime(String lostTime) {
            this.lostTime = lostTime;
            return this;
        }

        /**
        * The number of products associated with the deal
        * @return productsCount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("products_count")
        public Integer getProductsCount() {
            return productsCount;
        }

        /**
         * Set productsCount
         **/
        public void setProductsCount(Integer productsCount) {
            this.productsCount = productsCount;
        }

        public GetMergedDealResponseDataQueryParam productsCount(Integer productsCount) {
            this.productsCount = productsCount;
            return this;
        }

        /**
        * The number of files associated with the deal
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

        public GetMergedDealResponseDataQueryParam filesCount(Integer filesCount) {
            this.filesCount = filesCount;
            return this;
        }

        /**
        * The number of notes associated with the deal
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

        public GetMergedDealResponseDataQueryParam notesCount(Integer notesCount) {
            this.notesCount = notesCount;
            return this;
        }

        /**
        * The number of followers associated with the deal
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

        public GetMergedDealResponseDataQueryParam followersCount(Integer followersCount) {
            this.followersCount = followersCount;
            return this;
        }

        /**
        * The number of emails associated with the deal
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

        public GetMergedDealResponseDataQueryParam emailMessagesCount(Integer emailMessagesCount) {
            this.emailMessagesCount = emailMessagesCount;
            return this;
        }

        /**
        * The number of activities associated with the deal
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

        public GetMergedDealResponseDataQueryParam activitiesCount(Integer activitiesCount) {
            this.activitiesCount = activitiesCount;
            return this;
        }

        /**
        * The number of completed activities associated with the deal
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

        public GetMergedDealResponseDataQueryParam doneActivitiesCount(Integer doneActivitiesCount) {
            this.doneActivitiesCount = doneActivitiesCount;
            return this;
        }

        /**
        * The number of incomplete activities associated with the deal
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

        public GetMergedDealResponseDataQueryParam undoneActivitiesCount(Integer undoneActivitiesCount) {
            this.undoneActivitiesCount = undoneActivitiesCount;
            return this;
        }

        /**
        * The number of participants associated with the deal
        * @return participantsCount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("participants_count")
        public Integer getParticipantsCount() {
            return participantsCount;
        }

        /**
         * Set participantsCount
         **/
        public void setParticipantsCount(Integer participantsCount) {
            this.participantsCount = participantsCount;
        }

        public GetMergedDealResponseDataQueryParam participantsCount(Integer participantsCount) {
            this.participantsCount = participantsCount;
            return this;
        }

        /**
        * The expected close date of the deal
        * @return expectedCloseDate
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("expected_close_date")
        public LocalDate getExpectedCloseDate() {
            return expectedCloseDate;
        }

        /**
         * Set expectedCloseDate
         **/
        public void setExpectedCloseDate(LocalDate expectedCloseDate) {
            this.expectedCloseDate = expectedCloseDate;
        }

        public GetMergedDealResponseDataQueryParam expectedCloseDate(LocalDate expectedCloseDate) {
            this.expectedCloseDate = expectedCloseDate;
            return this;
        }

        /**
        * The date and time of the last incoming email associated with the deal
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

        public GetMergedDealResponseDataQueryParam lastIncomingMailTime(String lastIncomingMailTime) {
            this.lastIncomingMailTime = lastIncomingMailTime;
            return this;
        }

        /**
        * The date and time of the last outgoing email associated with the deal
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

        public GetMergedDealResponseDataQueryParam lastOutgoingMailTime(String lastOutgoingMailTime) {
            this.lastOutgoingMailTime = lastOutgoingMailTime;
            return this;
        }

        /**
        * The label or multiple labels assigned to the deal
        * @return label
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("label")
        public String getLabel() {
            return label;
        }

        /**
         * Set label
         **/
        public void setLabel(String label) {
            this.label = label;
        }

        public GetMergedDealResponseDataQueryParam label(String label) {
            this.label = label;
            return this;
        }

        /**
        * The order number of the deal stage associated with the deal
        * @return stageOrderNr
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("stage_order_nr")
        public Integer getStageOrderNr() {
            return stageOrderNr;
        }

        /**
         * Set stageOrderNr
         **/
        public void setStageOrderNr(Integer stageOrderNr) {
            this.stageOrderNr = stageOrderNr;
        }

        public GetMergedDealResponseDataQueryParam stageOrderNr(Integer stageOrderNr) {
            this.stageOrderNr = stageOrderNr;
            return this;
        }

        /**
        * The name of the person associated with the deal
        * @return personName
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("person_name")
        public String getPersonName() {
            return personName;
        }

        /**
         * Set personName
         **/
        public void setPersonName(String personName) {
            this.personName = personName;
        }

        public GetMergedDealResponseDataQueryParam personName(String personName) {
            this.personName = personName;
            return this;
        }

        /**
        * The name of the organization associated with the deal
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

        public GetMergedDealResponseDataQueryParam orgName(String orgName) {
            this.orgName = orgName;
            return this;
        }

        /**
        * The subject of the next activity associated with the deal
        * @return nextActivitySubject
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("next_activity_subject")
        public String getNextActivitySubject() {
            return nextActivitySubject;
        }

        /**
         * Set nextActivitySubject
         **/
        public void setNextActivitySubject(String nextActivitySubject) {
            this.nextActivitySubject = nextActivitySubject;
        }

        public GetMergedDealResponseDataQueryParam nextActivitySubject(String nextActivitySubject) {
            this.nextActivitySubject = nextActivitySubject;
            return this;
        }

        /**
        * The type of the next activity associated with the deal
        * @return nextActivityType
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("next_activity_type")
        public String getNextActivityType() {
            return nextActivityType;
        }

        /**
         * Set nextActivityType
         **/
        public void setNextActivityType(String nextActivityType) {
            this.nextActivityType = nextActivityType;
        }

        public GetMergedDealResponseDataQueryParam nextActivityType(String nextActivityType) {
            this.nextActivityType = nextActivityType;
            return this;
        }

        /**
        * The duration of the next activity associated with the deal
        * @return nextActivityDuration
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("next_activity_duration")
        public String getNextActivityDuration() {
            return nextActivityDuration;
        }

        /**
         * Set nextActivityDuration
         **/
        public void setNextActivityDuration(String nextActivityDuration) {
            this.nextActivityDuration = nextActivityDuration;
        }

        public GetMergedDealResponseDataQueryParam nextActivityDuration(String nextActivityDuration) {
            this.nextActivityDuration = nextActivityDuration;
            return this;
        }

        /**
        * The note of the next activity associated with the deal
        * @return nextActivityNote
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("next_activity_note")
        public String getNextActivityNote() {
            return nextActivityNote;
        }

        /**
         * Set nextActivityNote
         **/
        public void setNextActivityNote(String nextActivityNote) {
            this.nextActivityNote = nextActivityNote;
        }

        public GetMergedDealResponseDataQueryParam nextActivityNote(String nextActivityNote) {
            this.nextActivityNote = nextActivityNote;
            return this;
        }

        /**
        * The deal value formatted with selected currency. E.g. US$500
        * @return formattedValue
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("formatted_value")
        public String getFormattedValue() {
            return formattedValue;
        }

        /**
         * Set formattedValue
         **/
        public void setFormattedValue(String formattedValue) {
            this.formattedValue = formattedValue;
        }

        public GetMergedDealResponseDataQueryParam formattedValue(String formattedValue) {
            this.formattedValue = formattedValue;
            return this;
        }

        /**
        * Probability times deal value. Probability can either be deal probability or if not set, then stage probability.
        * @return weightedValue
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("weighted_value")
        public BigDecimal getWeightedValue() {
            return weightedValue;
        }

        /**
         * Set weightedValue
         **/
        public void setWeightedValue(BigDecimal weightedValue) {
            this.weightedValue = weightedValue;
        }

        public GetMergedDealResponseDataQueryParam weightedValue(BigDecimal weightedValue) {
            this.weightedValue = weightedValue;
            return this;
        }

        /**
        * The weighted_value formatted with selected currency. E.g. US$500
        * @return formattedWeightedValue
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("formatted_weighted_value")
        public String getFormattedWeightedValue() {
            return formattedWeightedValue;
        }

        /**
         * Set formattedWeightedValue
         **/
        public void setFormattedWeightedValue(String formattedWeightedValue) {
            this.formattedWeightedValue = formattedWeightedValue;
        }

        public GetMergedDealResponseDataQueryParam formattedWeightedValue(String formattedWeightedValue) {
            this.formattedWeightedValue = formattedWeightedValue;
            return this;
        }

        /**
        * The currency associated with the deal
        * @return weightedValueCurrency
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("weighted_value_currency")
        public String getWeightedValueCurrency() {
            return weightedValueCurrency;
        }

        /**
         * Set weightedValueCurrency
         **/
        public void setWeightedValueCurrency(String weightedValueCurrency) {
            this.weightedValueCurrency = weightedValueCurrency;
        }

        public GetMergedDealResponseDataQueryParam weightedValueCurrency(String weightedValueCurrency) {
            this.weightedValueCurrency = weightedValueCurrency;
            return this;
        }

        /**
        * The date and time of changing the deal status as rotten
        * @return rottenTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("rotten_time")
        public String getRottenTime() {
            return rottenTime;
        }

        /**
         * Set rottenTime
         **/
        public void setRottenTime(String rottenTime) {
            this.rottenTime = rottenTime;
        }

        public GetMergedDealResponseDataQueryParam rottenTime(String rottenTime) {
            this.rottenTime = rottenTime;
            return this;
        }

        /**
        * The name of the deal owner
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

        public GetMergedDealResponseDataQueryParam ownerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }

        /**
        * The BCC email of the deal
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

        public GetMergedDealResponseDataQueryParam ccEmail(String ccEmail) {
            this.ccEmail = ccEmail;
            return this;
        }

        /**
        * If the organization that is associated with the deal is hidden or not
        * @return orgHidden
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("org_hidden")
        public Boolean getOrgHidden() {
            return orgHidden;
        }

        /**
         * Set orgHidden
         **/
        public void setOrgHidden(Boolean orgHidden) {
            this.orgHidden = orgHidden;
        }

        public GetMergedDealResponseDataQueryParam orgHidden(Boolean orgHidden) {
            this.orgHidden = orgHidden;
            return this;
        }

        /**
        * If the person that is associated with the deal is hidden or not
        * @return personHidden
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("person_hidden")
        public Boolean getPersonHidden() {
            return personHidden;
        }

        /**
         * Set personHidden
         **/
        public void setPersonHidden(Boolean personHidden) {
            this.personHidden = personHidden;
        }

        public GetMergedDealResponseDataQueryParam personHidden(Boolean personHidden) {
            this.personHidden = personHidden;
            return this;
        }

        /**
        * The way this Deal was created. `origin` field is set by Pipedrive when Deal is created and cannot be changed.
        * @return origin
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("origin")
        public String getOrigin() {
            return origin;
        }

        /**
         * Set origin
         **/
        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public GetMergedDealResponseDataQueryParam origin(String origin) {
            this.origin = origin;
            return this;
        }

        /**
        * The optional ID to further distinguish the origin of the deal - e.g. Which API integration created this Deal.
        * @return originId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("origin_id")
        public String getOriginId() {
            return originId;
        }

        /**
         * Set originId
         **/
        public void setOriginId(String originId) {
            this.originId = originId;
        }

        public GetMergedDealResponseDataQueryParam originId(String originId) {
            this.originId = originId;
            return this;
        }

        /**
        * The ID of your Marketing channel this Deal was created from. Recognized Marketing channels can be configured in your <a href=\"https://app.pipedrive.com/settings/fields\" target=\"_blank\" rel=\"noopener noreferrer\">Company settings</a>.
        * @return channel
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("channel")
        public Integer getChannel() {
            return channel;
        }

        /**
         * Set channel
         **/
        public void setChannel(Integer channel) {
            this.channel = channel;
        }

        public GetMergedDealResponseDataQueryParam channel(Integer channel) {
            this.channel = channel;
            return this;
        }

        /**
        * The optional ID to further distinguish the Marketing channel.
        * @return channelId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("channel_id")
        public String getChannelId() {
            return channelId;
        }

        /**
         * Set channelId
         **/
        public void setChannelId(String channelId) {
            this.channelId = channelId;
        }

        public GetMergedDealResponseDataQueryParam channelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        /**
        * Only available in Advanced and above plans  The Annual Recurring Revenue of the deal  Null if there are no products attached to the deal 
        * @return arr
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("arr")
        public BigDecimal getArr() {
            return arr;
        }

        /**
         * Set arr
         **/
        public void setArr(BigDecimal arr) {
            this.arr = arr;
        }

        public GetMergedDealResponseDataQueryParam arr(BigDecimal arr) {
            this.arr = arr;
            return this;
        }

        /**
        * Only available in Advanced and above plans  The Monthly Recurring Revenue of the deal  Null if there are no products attached to the deal 
        * @return mrr
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("mrr")
        public BigDecimal getMrr() {
            return mrr;
        }

        /**
         * Set mrr
         **/
        public void setMrr(BigDecimal mrr) {
            this.mrr = mrr;
        }

        public GetMergedDealResponseDataQueryParam mrr(BigDecimal mrr) {
            this.mrr = mrr;
            return this;
        }

        /**
        * Only available in Advanced and above plans  The Annual Contract Value of the deal  Null if there are no products attached to the deal 
        * @return acv
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("acv")
        public BigDecimal getAcv() {
            return acv;
        }

        /**
         * Set acv
         **/
        public void setAcv(BigDecimal acv) {
            this.acv = acv;
        }

        public GetMergedDealResponseDataQueryParam acv(BigDecimal acv) {
            this.acv = acv;
            return this;
        }

        /**
        * Only available in Advanced and above plans  The Currency for Annual Recurring Revenue of the deal  If the `arr` is null, this will also be null 
        * @return arrCurrency
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("arr_currency")
        public String getArrCurrency() {
            return arrCurrency;
        }

        /**
         * Set arrCurrency
         **/
        public void setArrCurrency(String arrCurrency) {
            this.arrCurrency = arrCurrency;
        }

        public GetMergedDealResponseDataQueryParam arrCurrency(String arrCurrency) {
            this.arrCurrency = arrCurrency;
            return this;
        }

        /**
        * Only available in Advanced and above plans  The Currency for Monthly Recurring Revenue of the deal  If the `mrr` is null, this will also be null 
        * @return mrrCurrency
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("mrr_currency")
        public String getMrrCurrency() {
            return mrrCurrency;
        }

        /**
         * Set mrrCurrency
         **/
        public void setMrrCurrency(String mrrCurrency) {
            this.mrrCurrency = mrrCurrency;
        }

        public GetMergedDealResponseDataQueryParam mrrCurrency(String mrrCurrency) {
            this.mrrCurrency = mrrCurrency;
            return this;
        }

        /**
        * Only available in Advanced and above plans  The Currency for Annual Contract Value of the deal  If the `acv` is null, this will also be null 
        * @return acvCurrency
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("acv_currency")
        public String getAcvCurrency() {
            return acvCurrency;
        }

        /**
         * Set acvCurrency
         **/
        public void setAcvCurrency(String acvCurrency) {
            this.acvCurrency = acvCurrency;
        }

        public GetMergedDealResponseDataQueryParam acvCurrency(String acvCurrency) {
            this.acvCurrency = acvCurrency;
            return this;
        }

        /**
        * The deal ID of the deal which the original deal was merged with
        * @return mergeWhatId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("merge_what_id")
        public Integer getMergeWhatId() {
            return mergeWhatId;
        }

        /**
         * Set mergeWhatId
         **/
        public void setMergeWhatId(Integer mergeWhatId) {
            this.mergeWhatId = mergeWhatId;
        }

        public GetMergedDealResponseDataQueryParam mergeWhatId(Integer mergeWhatId) {
            this.mergeWhatId = mergeWhatId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetMergedDealResponseDataQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    creatorUserId: ").append(toIndentedString(creatorUserId)).append("\n");
            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
            sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
            sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
            sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
            sb.append("    title: ").append(toIndentedString(title)).append("\n");
            sb.append("    value: ").append(toIndentedString(value)).append("\n");
            sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
            sb.append("    stageChangeTime: ").append(toIndentedString(stageChangeTime)).append("\n");
            sb.append("    active: ").append(toIndentedString(active)).append("\n");
            sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
            sb.append("    nextActivityDate: ").append(toIndentedString(nextActivityDate)).append("\n");
            sb.append("    nextActivityTime: ").append(toIndentedString(nextActivityTime)).append("\n");
            sb.append("    nextActivityId: ").append(toIndentedString(nextActivityId)).append("\n");
            sb.append("    lastActivityId: ").append(toIndentedString(lastActivityId)).append("\n");
            sb.append("    lastActivityDate: ").append(toIndentedString(lastActivityDate)).append("\n");
            sb.append("    lostReason: ").append(toIndentedString(lostReason)).append("\n");
            sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
            sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
            sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
            sb.append("    wonTime: ").append(toIndentedString(wonTime)).append("\n");
            sb.append("    firstWonTime: ").append(toIndentedString(firstWonTime)).append("\n");
            sb.append("    lostTime: ").append(toIndentedString(lostTime)).append("\n");
            sb.append("    productsCount: ").append(toIndentedString(productsCount)).append("\n");
            sb.append("    filesCount: ").append(toIndentedString(filesCount)).append("\n");
            sb.append("    notesCount: ").append(toIndentedString(notesCount)).append("\n");
            sb.append("    followersCount: ").append(toIndentedString(followersCount)).append("\n");
            sb.append("    emailMessagesCount: ").append(toIndentedString(emailMessagesCount)).append("\n");
            sb.append("    activitiesCount: ").append(toIndentedString(activitiesCount)).append("\n");
            sb.append("    doneActivitiesCount: ").append(toIndentedString(doneActivitiesCount)).append("\n");
            sb.append("    undoneActivitiesCount: ").append(toIndentedString(undoneActivitiesCount)).append("\n");
            sb.append("    participantsCount: ").append(toIndentedString(participantsCount)).append("\n");
            sb.append("    expectedCloseDate: ").append(toIndentedString(expectedCloseDate)).append("\n");
            sb.append("    lastIncomingMailTime: ").append(toIndentedString(lastIncomingMailTime)).append("\n");
            sb.append("    lastOutgoingMailTime: ").append(toIndentedString(lastOutgoingMailTime)).append("\n");
            sb.append("    label: ").append(toIndentedString(label)).append("\n");
            sb.append("    stageOrderNr: ").append(toIndentedString(stageOrderNr)).append("\n");
            sb.append("    personName: ").append(toIndentedString(personName)).append("\n");
            sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
            sb.append("    nextActivitySubject: ").append(toIndentedString(nextActivitySubject)).append("\n");
            sb.append("    nextActivityType: ").append(toIndentedString(nextActivityType)).append("\n");
            sb.append("    nextActivityDuration: ").append(toIndentedString(nextActivityDuration)).append("\n");
            sb.append("    nextActivityNote: ").append(toIndentedString(nextActivityNote)).append("\n");
            sb.append("    formattedValue: ").append(toIndentedString(formattedValue)).append("\n");
            sb.append("    weightedValue: ").append(toIndentedString(weightedValue)).append("\n");
            sb.append("    formattedWeightedValue: ").append(toIndentedString(formattedWeightedValue)).append("\n");
            sb.append("    weightedValueCurrency: ").append(toIndentedString(weightedValueCurrency)).append("\n");
            sb.append("    rottenTime: ").append(toIndentedString(rottenTime)).append("\n");
            sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
            sb.append("    ccEmail: ").append(toIndentedString(ccEmail)).append("\n");
            sb.append("    orgHidden: ").append(toIndentedString(orgHidden)).append("\n");
            sb.append("    personHidden: ").append(toIndentedString(personHidden)).append("\n");
            sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
            sb.append("    originId: ").append(toIndentedString(originId)).append("\n");
            sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
            sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
            sb.append("    arr: ").append(toIndentedString(arr)).append("\n");
            sb.append("    mrr: ").append(toIndentedString(mrr)).append("\n");
            sb.append("    acv: ").append(toIndentedString(acv)).append("\n");
            sb.append("    arrCurrency: ").append(toIndentedString(arrCurrency)).append("\n");
            sb.append("    mrrCurrency: ").append(toIndentedString(mrrCurrency)).append("\n");
            sb.append("    acvCurrency: ").append(toIndentedString(acvCurrency)).append("\n");
            sb.append("    mergeWhatId: ").append(toIndentedString(mergeWhatId)).append("\n");
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
