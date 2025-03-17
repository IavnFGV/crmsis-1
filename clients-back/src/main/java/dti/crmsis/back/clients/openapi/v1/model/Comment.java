package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Comment  {

    /**
      * The ID of the note
     **/
    private UUID uuid;
    /**
      * Whether the note is active or deleted
     **/
    private Boolean activeFlag;
    /**
      * The creation date and time of the note
     **/
    private String addTime;
    /**
      * The creation date and time of the note
     **/
    private String updateTime;
    /**
      * The content of the note in HTML format. Subject to sanitization on the back-end.
     **/
    private String content;
    /**
      * The ID of the object that the comment is attached to, will be the id of the note
     **/
    private String objectId;
    /**
      * The type of object that the comment is attached to, will be \"note\"
     **/
    private String objectType;
    /**
      * The ID of the user who created the comment
     **/
    private Integer userId;
    /**
      * The ID of the user who last updated the comment
     **/
    private Integer updaterId;
    /**
      * The ID of the company
     **/
    private Integer companyId;

    /**
    * The ID of the note
    * @return uuid
    **/
    @JsonProperty("uuid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getUuid() {
        return uuid;
    }

    /**
     * Set uuid
     **/
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Comment uuid(UUID uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
    * Whether the note is active or deleted
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

    public Comment activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * The creation date and time of the note
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

    public Comment addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The creation date and time of the note
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

    public Comment updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
    * The content of the note in HTML format. Subject to sanitization on the back-end.
    * @return content
    **/
    @JsonProperty("content")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getContent() {
        return content;
    }

    /**
     * Set content
     **/
    public void setContent(String content) {
        this.content = content;
    }

    public Comment content(String content) {
        this.content = content;
        return this;
    }

    /**
    * The ID of the object that the comment is attached to, will be the id of the note
    * @return objectId
    **/
    @JsonProperty("object_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getObjectId() {
        return objectId;
    }

    /**
     * Set objectId
     **/
    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public Comment objectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
    * The type of object that the comment is attached to, will be \"note\"
    * @return objectType
    **/
    @JsonProperty("object_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getObjectType() {
        return objectType;
    }

    /**
     * Set objectType
     **/
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public Comment objectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
    * The ID of the user who created the comment
    * @return userId
    **/
    @JsonProperty("user_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getUserId() {
        return userId;
    }

    /**
     * Set userId
     **/
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Comment userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
    * The ID of the user who last updated the comment
    * @return updaterId
    **/
    @JsonProperty("updater_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getUpdaterId() {
        return updaterId;
    }

    /**
     * Set updaterId
     **/
    public void setUpdaterId(Integer updaterId) {
        this.updaterId = updaterId;
    }

    public Comment updaterId(Integer updaterId) {
        this.updaterId = updaterId;
        return this;
    }

    /**
    * The ID of the company
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

    public Comment companyId(Integer companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Comment {\n");

        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    updaterId: ").append(toIndentedString(updaterId)).append("\n");
        sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code Comment} object that
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

        Comment model = (Comment) obj;

        return java.util.Objects.equals(uuid, model.uuid) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime) &&
        java.util.Objects.equals(content, model.content) &&
        java.util.Objects.equals(objectId, model.objectId) &&
        java.util.Objects.equals(objectType, model.objectType) &&
        java.util.Objects.equals(userId, model.userId) &&
        java.util.Objects.equals(updaterId, model.updaterId) &&
        java.util.Objects.equals(companyId, model.companyId);
    }

    /**
     * Returns a hash code for a {@code Comment}.
     *
     * @return a hash code value for a {@code Comment}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(uuid,
        activeFlag,
        addTime,
        updateTime,
        content,
        objectId,
        objectType,
        userId,
        updaterId,
        companyId);
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
    public static class CommentQueryParam  {

        @jakarta.ws.rs.QueryParam("uuid")
        private UUID uuid;
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        @jakarta.ws.rs.QueryParam("updateTime")
        private String updateTime;
        @jakarta.ws.rs.QueryParam("content")
        private String content;
        @jakarta.ws.rs.QueryParam("objectId")
        private String objectId;
        @jakarta.ws.rs.QueryParam("objectType")
        private String objectType;
        @jakarta.ws.rs.QueryParam("userId")
        private Integer userId;
        @jakarta.ws.rs.QueryParam("updaterId")
        private Integer updaterId;
        @jakarta.ws.rs.QueryParam("companyId")
        private Integer companyId;

        /**
        * The ID of the note
        * @return uuid
        **/
        @JsonProperty("uuid")
        public UUID getUuid() {
            return uuid;
        }

        /**
         * Set uuid
         **/
        public void setUuid(UUID uuid) {
            this.uuid = uuid;
        }

        public CommentQueryParam uuid(UUID uuid) {
            this.uuid = uuid;
            return this;
        }

        /**
        * Whether the note is active or deleted
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

        public CommentQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * The creation date and time of the note
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

        public CommentQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The creation date and time of the note
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

        public CommentQueryParam updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
        * The content of the note in HTML format. Subject to sanitization on the back-end.
        * @return content
        **/
        @JsonProperty("content")
        public String getContent() {
            return content;
        }

        /**
         * Set content
         **/
        public void setContent(String content) {
            this.content = content;
        }

        public CommentQueryParam content(String content) {
            this.content = content;
            return this;
        }

        /**
        * The ID of the object that the comment is attached to, will be the id of the note
        * @return objectId
        **/
        @JsonProperty("object_id")
        public String getObjectId() {
            return objectId;
        }

        /**
         * Set objectId
         **/
        public void setObjectId(String objectId) {
            this.objectId = objectId;
        }

        public CommentQueryParam objectId(String objectId) {
            this.objectId = objectId;
            return this;
        }

        /**
        * The type of object that the comment is attached to, will be \"note\"
        * @return objectType
        **/
        @JsonProperty("object_type")
        public String getObjectType() {
            return objectType;
        }

        /**
         * Set objectType
         **/
        public void setObjectType(String objectType) {
            this.objectType = objectType;
        }

        public CommentQueryParam objectType(String objectType) {
            this.objectType = objectType;
            return this;
        }

        /**
        * The ID of the user who created the comment
        * @return userId
        **/
        @JsonProperty("user_id")
        public Integer getUserId() {
            return userId;
        }

        /**
         * Set userId
         **/
        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public CommentQueryParam userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        /**
        * The ID of the user who last updated the comment
        * @return updaterId
        **/
        @JsonProperty("updater_id")
        public Integer getUpdaterId() {
            return updaterId;
        }

        /**
         * Set updaterId
         **/
        public void setUpdaterId(Integer updaterId) {
            this.updaterId = updaterId;
        }

        public CommentQueryParam updaterId(Integer updaterId) {
            this.updaterId = updaterId;
            return this;
        }

        /**
        * The ID of the company
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

        public CommentQueryParam companyId(Integer companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CommentQueryParam {\n");

            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
            sb.append("    content: ").append(toIndentedString(content)).append("\n");
            sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
            sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
            sb.append("    updaterId: ").append(toIndentedString(updaterId)).append("\n");
            sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
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
