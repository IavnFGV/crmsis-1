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
public class GetPersonProductsResponseAllOfDataInnerDEALIDDeal  {

    /**
      * The ID of the deal
     **/
    private Integer id;
    /**
      * The ID of the company
     **/
    private Integer companyId;
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
      * The first creation date and time of the deal
     **/
    private String firstAddTime;
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The ID of the company
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal companyId(Integer companyId) {
        this.companyId = companyId;
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal creatorUserId(Integer creatorUserId) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal userId(Integer userId) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal personId(Integer personId) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal orgId(Integer orgId) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal stageId(Integer stageId) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal title(String title) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal value(BigDecimal value) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal currency(String currency) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The first creation date and time of the deal
    * @return firstAddTime
    **/
    @JsonProperty("first_add_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getFirstAddTime() {
        return firstAddTime;
    }

    /**
     * Set firstAddTime
     **/
    public void setFirstAddTime(String firstAddTime) {
        this.firstAddTime = firstAddTime;
    }

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal firstAddTime(String firstAddTime) {
        this.firstAddTime = firstAddTime;
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal updateTime(String updateTime) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal stageChangeTime(String stageChangeTime) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal active(Boolean active) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal deleted(Boolean deleted) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal status(String status) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal probability(BigDecimal probability) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal nextActivityDate(String nextActivityDate) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal nextActivityTime(String nextActivityTime) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal nextActivityId(Integer nextActivityId) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal lastActivityId(Integer lastActivityId) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal lastActivityDate(String lastActivityDate) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal lostReason(String lostReason) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal visibleTo(String visibleTo) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal closeTime(String closeTime) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal pipelineId(Integer pipelineId) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal wonTime(String wonTime) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal firstWonTime(String firstWonTime) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal lostTime(String lostTime) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal productsCount(Integer productsCount) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal filesCount(Integer filesCount) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal notesCount(Integer notesCount) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal followersCount(Integer followersCount) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal emailMessagesCount(Integer emailMessagesCount) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal activitiesCount(Integer activitiesCount) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal doneActivitiesCount(Integer doneActivitiesCount) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal undoneActivitiesCount(Integer undoneActivitiesCount) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal participantsCount(Integer participantsCount) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal expectedCloseDate(LocalDate expectedCloseDate) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal lastIncomingMailTime(String lastIncomingMailTime) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal lastOutgoingMailTime(String lastOutgoingMailTime) {
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

    public GetPersonProductsResponseAllOfDataInnerDEALIDDeal label(String label) {
        this.label = label;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPersonProductsResponseAllOfDataInnerDEALIDDeal {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
        sb.append("    creatorUserId: ").append(toIndentedString(creatorUserId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
        sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
        sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    firstAddTime: ").append(toIndentedString(firstAddTime)).append("\n");
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
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetPersonProductsResponseAllOfDataInnerDEALIDDeal} object that
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

        GetPersonProductsResponseAllOfDataInnerDEALIDDeal model = (GetPersonProductsResponseAllOfDataInnerDEALIDDeal) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(companyId, model.companyId) &&
        java.util.Objects.equals(creatorUserId, model.creatorUserId) &&
        java.util.Objects.equals(userId, model.userId) &&
        java.util.Objects.equals(personId, model.personId) &&
        java.util.Objects.equals(orgId, model.orgId) &&
        java.util.Objects.equals(stageId, model.stageId) &&
        java.util.Objects.equals(title, model.title) &&
        java.util.Objects.equals(value, model.value) &&
        java.util.Objects.equals(currency, model.currency) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(firstAddTime, model.firstAddTime) &&
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
        java.util.Objects.equals(label, model.label);
    }

    /**
     * Returns a hash code for a {@code GetPersonProductsResponseAllOfDataInnerDEALIDDeal}.
     *
     * @return a hash code value for a {@code GetPersonProductsResponseAllOfDataInnerDEALIDDeal}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        companyId,
        creatorUserId,
        userId,
        personId,
        orgId,
        stageId,
        title,
        value,
        currency,
        addTime,
        firstAddTime,
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
        label);
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
    public static class GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("companyId")
        private Integer companyId;
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
        @jakarta.ws.rs.QueryParam("firstAddTime")
        private String firstAddTime;
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The ID of the company
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam companyId(Integer companyId) {
            this.companyId = companyId;
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam creatorUserId(Integer creatorUserId) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam userId(Integer userId) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam personId(Integer personId) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam orgId(Integer orgId) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam stageId(Integer stageId) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam title(String title) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam value(BigDecimal value) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam currency(String currency) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The first creation date and time of the deal
        * @return firstAddTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("first_add_time")
        public String getFirstAddTime() {
            return firstAddTime;
        }

        /**
         * Set firstAddTime
         **/
        public void setFirstAddTime(String firstAddTime) {
            this.firstAddTime = firstAddTime;
        }

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam firstAddTime(String firstAddTime) {
            this.firstAddTime = firstAddTime;
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam updateTime(String updateTime) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam stageChangeTime(String stageChangeTime) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam active(Boolean active) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam deleted(Boolean deleted) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam status(String status) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam probability(BigDecimal probability) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam nextActivityDate(String nextActivityDate) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam nextActivityTime(String nextActivityTime) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam nextActivityId(Integer nextActivityId) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam lastActivityId(Integer lastActivityId) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam lastActivityDate(String lastActivityDate) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam lostReason(String lostReason) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam visibleTo(String visibleTo) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam closeTime(String closeTime) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam pipelineId(Integer pipelineId) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam wonTime(String wonTime) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam firstWonTime(String firstWonTime) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam lostTime(String lostTime) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam productsCount(Integer productsCount) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam filesCount(Integer filesCount) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam notesCount(Integer notesCount) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam followersCount(Integer followersCount) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam emailMessagesCount(Integer emailMessagesCount) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam activitiesCount(Integer activitiesCount) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam doneActivitiesCount(Integer doneActivitiesCount) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam undoneActivitiesCount(Integer undoneActivitiesCount) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam participantsCount(Integer participantsCount) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam expectedCloseDate(LocalDate expectedCloseDate) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam lastIncomingMailTime(String lastIncomingMailTime) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam lastOutgoingMailTime(String lastOutgoingMailTime) {
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

        public GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam label(String label) {
            this.label = label;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetPersonProductsResponseAllOfDataInnerDEALIDDealQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
            sb.append("    creatorUserId: ").append(toIndentedString(creatorUserId)).append("\n");
            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
            sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
            sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
            sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
            sb.append("    title: ").append(toIndentedString(title)).append("\n");
            sb.append("    value: ").append(toIndentedString(value)).append("\n");
            sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    firstAddTime: ").append(toIndentedString(firstAddTime)).append("\n");
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
