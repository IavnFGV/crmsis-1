package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The file data
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetFilesResponseDataInner  {

    /**
      * The ID of the file
     **/
    private Integer id;
    /**
      * The ID of the user to associate the file with
     **/
    private Integer userId;
    /**
      * The ID of the deal to associate the file with
     **/
    private Integer dealId;
    /**
      * The ID of the person to associate the file with
     **/
    private Integer personId;
    /**
      * The ID of the organization to associate the file with
     **/
    private Integer orgId;
    /**
      * The ID of the product to associate the file with
     **/
    private Integer productId;
    /**
      * The ID of the activity to associate the file with
     **/
    private Integer activityId;
    /**
      * The ID of the lead to associate the file with
     **/
    private UUID leadId;
    /**
      * The date and time when the file was added/created. Format: YYYY-MM-DD HH:MM:SS
     **/
    private String addTime;
    /**
      * The last updated date and time of the file. Format: YYYY-MM-DD HH:MM:SS
     **/
    private String updateTime;
    /**
      * The original name of the file
     **/
    private String fileName;
    /**
      * The size of the file
     **/
    private Integer fileSize;
    /**
      * Whether the user is active or not. false = Not activated, true = Activated
     **/
    private Boolean activeFlag;
    /**
      * Whether the file was uploaded as inline or not
     **/
    private Boolean inlineFlag;
    /**
      * The location type to send the file to. Only googledrive is supported at the moment.
     **/
    private String remoteLocation;
    /**
      * The ID of the remote item
     **/
    private String remoteId;
    /**
      * The ID of the inline attachment
     **/
    private String cid;
    /**
      * The location of the cloud storage
     **/
    private String s3Bucket;
    /**
      * The ID of the mail message to associate the file with
     **/
    private String mailMessageId;
    /**
      * The ID of the mail template to associate the file with
     **/
    private String mailTemplateId;
    /**
      * The name of the deal associated with the file
     **/
    private String dealName;
    /**
      * The name of the person associated with the file
     **/
    private String personName;
    /**
      * The name of the organization associated with the file
     **/
    private String orgName;
    /**
      * The name of the product associated with the file
     **/
    private String productName;
    /**
      * The name of the lead associated with the file
     **/
    private String leadName;
    /**
      * The URL of the download file
     **/
    private String url;
    /**
      * The visible name of the file
     **/
    private String name;
    /**
      * The description of the file
     **/
    private String description;

    /**
    * The ID of the file
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

    public GetFilesResponseDataInner id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The ID of the user to associate the file with
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

    public GetFilesResponseDataInner userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
    * The ID of the deal to associate the file with
    * @return dealId
    **/
    @JsonProperty("deal_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getDealId() {
        return dealId;
    }

    /**
     * Set dealId
     **/
    public void setDealId(Integer dealId) {
        this.dealId = dealId;
    }

    public GetFilesResponseDataInner dealId(Integer dealId) {
        this.dealId = dealId;
        return this;
    }

    /**
    * The ID of the person to associate the file with
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

    public GetFilesResponseDataInner personId(Integer personId) {
        this.personId = personId;
        return this;
    }

    /**
    * The ID of the organization to associate the file with
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

    public GetFilesResponseDataInner orgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }

    /**
    * The ID of the product to associate the file with
    * @return productId
    **/
    @JsonProperty("product_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getProductId() {
        return productId;
    }

    /**
     * Set productId
     **/
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public GetFilesResponseDataInner productId(Integer productId) {
        this.productId = productId;
        return this;
    }

    /**
    * The ID of the activity to associate the file with
    * @return activityId
    **/
    @JsonProperty("activity_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getActivityId() {
        return activityId;
    }

    /**
     * Set activityId
     **/
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public GetFilesResponseDataInner activityId(Integer activityId) {
        this.activityId = activityId;
        return this;
    }

    /**
    * The ID of the lead to associate the file with
    * @return leadId
    **/
    @JsonProperty("lead_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public UUID getLeadId() {
        return leadId;
    }

    /**
     * Set leadId
     **/
    public void setLeadId(UUID leadId) {
        this.leadId = leadId;
    }

    public GetFilesResponseDataInner leadId(UUID leadId) {
        this.leadId = leadId;
        return this;
    }

    /**
    * The date and time when the file was added/created. Format: YYYY-MM-DD HH:MM:SS
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

    public GetFilesResponseDataInner addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The last updated date and time of the file. Format: YYYY-MM-DD HH:MM:SS
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

    public GetFilesResponseDataInner updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
    * The original name of the file
    * @return fileName
    **/
    @JsonProperty("file_name")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getFileName() {
        return fileName;
    }

    /**
     * Set fileName
     **/
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public GetFilesResponseDataInner fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
    * The size of the file
    * @return fileSize
    **/
    @JsonProperty("file_size")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getFileSize() {
        return fileSize;
    }

    /**
     * Set fileSize
     **/
    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public GetFilesResponseDataInner fileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
    * Whether the user is active or not. false = Not activated, true = Activated
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

    public GetFilesResponseDataInner activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * Whether the file was uploaded as inline or not
    * @return inlineFlag
    **/
    @JsonProperty("inline_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getInlineFlag() {
        return inlineFlag;
    }

    /**
     * Set inlineFlag
     **/
    public void setInlineFlag(Boolean inlineFlag) {
        this.inlineFlag = inlineFlag;
    }

    public GetFilesResponseDataInner inlineFlag(Boolean inlineFlag) {
        this.inlineFlag = inlineFlag;
        return this;
    }

    /**
    * The location type to send the file to. Only googledrive is supported at the moment.
    * @return remoteLocation
    **/
    @JsonProperty("remote_location")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getRemoteLocation() {
        return remoteLocation;
    }

    /**
     * Set remoteLocation
     **/
    public void setRemoteLocation(String remoteLocation) {
        this.remoteLocation = remoteLocation;
    }

    public GetFilesResponseDataInner remoteLocation(String remoteLocation) {
        this.remoteLocation = remoteLocation;
        return this;
    }

    /**
    * The ID of the remote item
    * @return remoteId
    **/
    @JsonProperty("remote_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getRemoteId() {
        return remoteId;
    }

    /**
     * Set remoteId
     **/
    public void setRemoteId(String remoteId) {
        this.remoteId = remoteId;
    }

    public GetFilesResponseDataInner remoteId(String remoteId) {
        this.remoteId = remoteId;
        return this;
    }

    /**
    * The ID of the inline attachment
    * @return cid
    **/
    @JsonProperty("cid")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getCid() {
        return cid;
    }

    /**
     * Set cid
     **/
    public void setCid(String cid) {
        this.cid = cid;
    }

    public GetFilesResponseDataInner cid(String cid) {
        this.cid = cid;
        return this;
    }

    /**
    * The location of the cloud storage
    * @return s3Bucket
    **/
    @JsonProperty("s3_bucket")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getS3Bucket() {
        return s3Bucket;
    }

    /**
     * Set s3Bucket
     **/
    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    public GetFilesResponseDataInner s3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
        return this;
    }

    /**
    * The ID of the mail message to associate the file with
    * @return mailMessageId
    **/
    @JsonProperty("mail_message_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getMailMessageId() {
        return mailMessageId;
    }

    /**
     * Set mailMessageId
     **/
    public void setMailMessageId(String mailMessageId) {
        this.mailMessageId = mailMessageId;
    }

    public GetFilesResponseDataInner mailMessageId(String mailMessageId) {
        this.mailMessageId = mailMessageId;
        return this;
    }

    /**
    * The ID of the mail template to associate the file with
    * @return mailTemplateId
    **/
    @JsonProperty("mail_template_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getMailTemplateId() {
        return mailTemplateId;
    }

    /**
     * Set mailTemplateId
     **/
    public void setMailTemplateId(String mailTemplateId) {
        this.mailTemplateId = mailTemplateId;
    }

    public GetFilesResponseDataInner mailTemplateId(String mailTemplateId) {
        this.mailTemplateId = mailTemplateId;
        return this;
    }

    /**
    * The name of the deal associated with the file
    * @return dealName
    **/
    @JsonProperty("deal_name")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDealName() {
        return dealName;
    }

    /**
     * Set dealName
     **/
    public void setDealName(String dealName) {
        this.dealName = dealName;
    }

    public GetFilesResponseDataInner dealName(String dealName) {
        this.dealName = dealName;
        return this;
    }

    /**
    * The name of the person associated with the file
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

    public GetFilesResponseDataInner personName(String personName) {
        this.personName = personName;
        return this;
    }

    /**
    * The name of the organization associated with the file
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

    public GetFilesResponseDataInner orgName(String orgName) {
        this.orgName = orgName;
        return this;
    }

    /**
    * The name of the product associated with the file
    * @return productName
    **/
    @JsonProperty("product_name")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getProductName() {
        return productName;
    }

    /**
     * Set productName
     **/
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public GetFilesResponseDataInner productName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
    * The name of the lead associated with the file
    * @return leadName
    **/
    @JsonProperty("lead_name")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLeadName() {
        return leadName;
    }

    /**
     * Set leadName
     **/
    public void setLeadName(String leadName) {
        this.leadName = leadName;
    }

    public GetFilesResponseDataInner leadName(String leadName) {
        this.leadName = leadName;
        return this;
    }

    /**
    * The URL of the download file
    * @return url
    **/
    @JsonProperty("url")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getUrl() {
        return url;
    }

    /**
     * Set url
     **/
    public void setUrl(String url) {
        this.url = url;
    }

    public GetFilesResponseDataInner url(String url) {
        this.url = url;
        return this;
    }

    /**
    * The visible name of the file
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

    public GetFilesResponseDataInner name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The description of the file
    * @return description
    **/
    @JsonProperty("description")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Set description
     **/
    public void setDescription(String description) {
        this.description = description;
    }

    public GetFilesResponseDataInner description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetFilesResponseDataInner {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
        sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
        sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
        sb.append("    leadId: ").append(toIndentedString(leadId)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    inlineFlag: ").append(toIndentedString(inlineFlag)).append("\n");
        sb.append("    remoteLocation: ").append(toIndentedString(remoteLocation)).append("\n");
        sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
        sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
        sb.append("    s3Bucket: ").append(toIndentedString(s3Bucket)).append("\n");
        sb.append("    mailMessageId: ").append(toIndentedString(mailMessageId)).append("\n");
        sb.append("    mailTemplateId: ").append(toIndentedString(mailTemplateId)).append("\n");
        sb.append("    dealName: ").append(toIndentedString(dealName)).append("\n");
        sb.append("    personName: ").append(toIndentedString(personName)).append("\n");
        sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    leadName: ").append(toIndentedString(leadName)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetFilesResponseDataInner} object that
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

        GetFilesResponseDataInner model = (GetFilesResponseDataInner) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(userId, model.userId) &&
        java.util.Objects.equals(dealId, model.dealId) &&
        java.util.Objects.equals(personId, model.personId) &&
        java.util.Objects.equals(orgId, model.orgId) &&
        java.util.Objects.equals(productId, model.productId) &&
        java.util.Objects.equals(activityId, model.activityId) &&
        java.util.Objects.equals(leadId, model.leadId) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime) &&
        java.util.Objects.equals(fileName, model.fileName) &&
        java.util.Objects.equals(fileSize, model.fileSize) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(inlineFlag, model.inlineFlag) &&
        java.util.Objects.equals(remoteLocation, model.remoteLocation) &&
        java.util.Objects.equals(remoteId, model.remoteId) &&
        java.util.Objects.equals(cid, model.cid) &&
        java.util.Objects.equals(s3Bucket, model.s3Bucket) &&
        java.util.Objects.equals(mailMessageId, model.mailMessageId) &&
        java.util.Objects.equals(mailTemplateId, model.mailTemplateId) &&
        java.util.Objects.equals(dealName, model.dealName) &&
        java.util.Objects.equals(personName, model.personName) &&
        java.util.Objects.equals(orgName, model.orgName) &&
        java.util.Objects.equals(productName, model.productName) &&
        java.util.Objects.equals(leadName, model.leadName) &&
        java.util.Objects.equals(url, model.url) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(description, model.description);
    }

    /**
     * Returns a hash code for a {@code GetFilesResponseDataInner}.
     *
     * @return a hash code value for a {@code GetFilesResponseDataInner}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        userId,
        dealId,
        personId,
        orgId,
        productId,
        activityId,
        leadId,
        addTime,
        updateTime,
        fileName,
        fileSize,
        activeFlag,
        inlineFlag,
        remoteLocation,
        remoteId,
        cid,
        s3Bucket,
        mailMessageId,
        mailTemplateId,
        dealName,
        personName,
        orgName,
        productName,
        leadName,
        url,
        name,
        description);
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
      * The file data
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetFilesResponseDataInnerQueryParam  {

        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("userId")
        private Integer userId;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("dealId")
        private Integer dealId;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("personId")
        private Integer personId;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("orgId")
        private Integer orgId;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("productId")
        private Integer productId;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("activityId")
        private Integer activityId;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("leadId")
        private UUID leadId;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("updateTime")
        private String updateTime;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("fileName")
        private String fileName;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("fileSize")
        private Integer fileSize;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("inlineFlag")
        private Boolean inlineFlag;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("remoteLocation")
        private String remoteLocation;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("remoteId")
        private String remoteId;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("cid")
        private String cid;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("s3Bucket")
        private String s3Bucket;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("mailMessageId")
        private String mailMessageId;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("mailTemplateId")
        private String mailTemplateId;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("dealName")
        private String dealName;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("personName")
        private String personName;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("orgName")
        private String orgName;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("productName")
        private String productName;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("leadName")
        private String leadName;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("url")
        private String url;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * The file data
         **/
        @jakarta.ws.rs.QueryParam("description")
        private String description;

        /**
        * The ID of the file
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

        public GetFilesResponseDataInnerQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The ID of the user to associate the file with
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

        public GetFilesResponseDataInnerQueryParam userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        /**
        * The ID of the deal to associate the file with
        * @return dealId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("deal_id")
        public Integer getDealId() {
            return dealId;
        }

        /**
         * Set dealId
         **/
        public void setDealId(Integer dealId) {
            this.dealId = dealId;
        }

        public GetFilesResponseDataInnerQueryParam dealId(Integer dealId) {
            this.dealId = dealId;
            return this;
        }

        /**
        * The ID of the person to associate the file with
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

        public GetFilesResponseDataInnerQueryParam personId(Integer personId) {
            this.personId = personId;
            return this;
        }

        /**
        * The ID of the organization to associate the file with
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

        public GetFilesResponseDataInnerQueryParam orgId(Integer orgId) {
            this.orgId = orgId;
            return this;
        }

        /**
        * The ID of the product to associate the file with
        * @return productId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("product_id")
        public Integer getProductId() {
            return productId;
        }

        /**
         * Set productId
         **/
        public void setProductId(Integer productId) {
            this.productId = productId;
        }

        public GetFilesResponseDataInnerQueryParam productId(Integer productId) {
            this.productId = productId;
            return this;
        }

        /**
        * The ID of the activity to associate the file with
        * @return activityId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("activity_id")
        public Integer getActivityId() {
            return activityId;
        }

        /**
         * Set activityId
         **/
        public void setActivityId(Integer activityId) {
            this.activityId = activityId;
        }

        public GetFilesResponseDataInnerQueryParam activityId(Integer activityId) {
            this.activityId = activityId;
            return this;
        }

        /**
        * The ID of the lead to associate the file with
        * @return leadId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("lead_id")
        public UUID getLeadId() {
            return leadId;
        }

        /**
         * Set leadId
         **/
        public void setLeadId(UUID leadId) {
            this.leadId = leadId;
        }

        public GetFilesResponseDataInnerQueryParam leadId(UUID leadId) {
            this.leadId = leadId;
            return this;
        }

        /**
        * The date and time when the file was added/created. Format: YYYY-MM-DD HH:MM:SS
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

        public GetFilesResponseDataInnerQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The last updated date and time of the file. Format: YYYY-MM-DD HH:MM:SS
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

        public GetFilesResponseDataInnerQueryParam updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
        * The original name of the file
        * @return fileName
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("file_name")
        public String getFileName() {
            return fileName;
        }

        /**
         * Set fileName
         **/
        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public GetFilesResponseDataInnerQueryParam fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
        * The size of the file
        * @return fileSize
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("file_size")
        public Integer getFileSize() {
            return fileSize;
        }

        /**
         * Set fileSize
         **/
        public void setFileSize(Integer fileSize) {
            this.fileSize = fileSize;
        }

        public GetFilesResponseDataInnerQueryParam fileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        /**
        * Whether the user is active or not. false = Not activated, true = Activated
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

        public GetFilesResponseDataInnerQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * Whether the file was uploaded as inline or not
        * @return inlineFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("inline_flag")
        public Boolean getInlineFlag() {
            return inlineFlag;
        }

        /**
         * Set inlineFlag
         **/
        public void setInlineFlag(Boolean inlineFlag) {
            this.inlineFlag = inlineFlag;
        }

        public GetFilesResponseDataInnerQueryParam inlineFlag(Boolean inlineFlag) {
            this.inlineFlag = inlineFlag;
            return this;
        }

        /**
        * The location type to send the file to. Only googledrive is supported at the moment.
        * @return remoteLocation
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("remote_location")
        public String getRemoteLocation() {
            return remoteLocation;
        }

        /**
         * Set remoteLocation
         **/
        public void setRemoteLocation(String remoteLocation) {
            this.remoteLocation = remoteLocation;
        }

        public GetFilesResponseDataInnerQueryParam remoteLocation(String remoteLocation) {
            this.remoteLocation = remoteLocation;
            return this;
        }

        /**
        * The ID of the remote item
        * @return remoteId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("remote_id")
        public String getRemoteId() {
            return remoteId;
        }

        /**
         * Set remoteId
         **/
        public void setRemoteId(String remoteId) {
            this.remoteId = remoteId;
        }

        public GetFilesResponseDataInnerQueryParam remoteId(String remoteId) {
            this.remoteId = remoteId;
            return this;
        }

        /**
        * The ID of the inline attachment
        * @return cid
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("cid")
        public String getCid() {
            return cid;
        }

        /**
         * Set cid
         **/
        public void setCid(String cid) {
            this.cid = cid;
        }

        public GetFilesResponseDataInnerQueryParam cid(String cid) {
            this.cid = cid;
            return this;
        }

        /**
        * The location of the cloud storage
        * @return s3Bucket
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("s3_bucket")
        public String getS3Bucket() {
            return s3Bucket;
        }

        /**
         * Set s3Bucket
         **/
        public void setS3Bucket(String s3Bucket) {
            this.s3Bucket = s3Bucket;
        }

        public GetFilesResponseDataInnerQueryParam s3Bucket(String s3Bucket) {
            this.s3Bucket = s3Bucket;
            return this;
        }

        /**
        * The ID of the mail message to associate the file with
        * @return mailMessageId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("mail_message_id")
        public String getMailMessageId() {
            return mailMessageId;
        }

        /**
         * Set mailMessageId
         **/
        public void setMailMessageId(String mailMessageId) {
            this.mailMessageId = mailMessageId;
        }

        public GetFilesResponseDataInnerQueryParam mailMessageId(String mailMessageId) {
            this.mailMessageId = mailMessageId;
            return this;
        }

        /**
        * The ID of the mail template to associate the file with
        * @return mailTemplateId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("mail_template_id")
        public String getMailTemplateId() {
            return mailTemplateId;
        }

        /**
         * Set mailTemplateId
         **/
        public void setMailTemplateId(String mailTemplateId) {
            this.mailTemplateId = mailTemplateId;
        }

        public GetFilesResponseDataInnerQueryParam mailTemplateId(String mailTemplateId) {
            this.mailTemplateId = mailTemplateId;
            return this;
        }

        /**
        * The name of the deal associated with the file
        * @return dealName
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("deal_name")
        public String getDealName() {
            return dealName;
        }

        /**
         * Set dealName
         **/
        public void setDealName(String dealName) {
            this.dealName = dealName;
        }

        public GetFilesResponseDataInnerQueryParam dealName(String dealName) {
            this.dealName = dealName;
            return this;
        }

        /**
        * The name of the person associated with the file
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

        public GetFilesResponseDataInnerQueryParam personName(String personName) {
            this.personName = personName;
            return this;
        }

        /**
        * The name of the organization associated with the file
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

        public GetFilesResponseDataInnerQueryParam orgName(String orgName) {
            this.orgName = orgName;
            return this;
        }

        /**
        * The name of the product associated with the file
        * @return productName
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("product_name")
        public String getProductName() {
            return productName;
        }

        /**
         * Set productName
         **/
        public void setProductName(String productName) {
            this.productName = productName;
        }

        public GetFilesResponseDataInnerQueryParam productName(String productName) {
            this.productName = productName;
            return this;
        }

        /**
        * The name of the lead associated with the file
        * @return leadName
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("lead_name")
        public String getLeadName() {
            return leadName;
        }

        /**
         * Set leadName
         **/
        public void setLeadName(String leadName) {
            this.leadName = leadName;
        }

        public GetFilesResponseDataInnerQueryParam leadName(String leadName) {
            this.leadName = leadName;
            return this;
        }

        /**
        * The URL of the download file
        * @return url
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        public String getUrl() {
            return url;
        }

        /**
         * Set url
         **/
        public void setUrl(String url) {
            this.url = url;
        }

        public GetFilesResponseDataInnerQueryParam url(String url) {
            this.url = url;
            return this;
        }

        /**
        * The visible name of the file
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

        public GetFilesResponseDataInnerQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The description of the file
        * @return description
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        public String getDescription() {
            return description;
        }

        /**
         * Set description
         **/
        public void setDescription(String description) {
            this.description = description;
        }

        public GetFilesResponseDataInnerQueryParam description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetFilesResponseDataInnerQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
            sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
            sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
            sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
            sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
            sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
            sb.append("    leadId: ").append(toIndentedString(leadId)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
            sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
            sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    inlineFlag: ").append(toIndentedString(inlineFlag)).append("\n");
            sb.append("    remoteLocation: ").append(toIndentedString(remoteLocation)).append("\n");
            sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
            sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
            sb.append("    s3Bucket: ").append(toIndentedString(s3Bucket)).append("\n");
            sb.append("    mailMessageId: ").append(toIndentedString(mailMessageId)).append("\n");
            sb.append("    mailTemplateId: ").append(toIndentedString(mailTemplateId)).append("\n");
            sb.append("    dealName: ").append(toIndentedString(dealName)).append("\n");
            sb.append("    personName: ").append(toIndentedString(personName)).append("\n");
            sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
            sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
            sb.append("    leadName: ").append(toIndentedString(leadName)).append("\n");
            sb.append("    url: ").append(toIndentedString(url)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
