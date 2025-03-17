package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.PictureDataPictures;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class PersonAllOfPictureId  {

    /**
      * The ID of the picture associated with the item
     **/
    private Integer id;
    /**
      * The type of item the picture is related to
     **/
    private String itemType;
    /**
      * The ID of related item
     **/
    private Integer itemId;
    /**
      * Whether the associated picture is active or not
     **/
    private Boolean activeFlag;
    /**
      * The add time of the picture
     **/
    private String addTime;
    /**
      * The update time of the picture
     **/
    private String updateTime;
    /**
      * The ID of the user who added the picture
     **/
    private Integer addedByUserId;
    private PictureDataPictures pictures;

    /**
    * The ID of the picture associated with the item
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

    public PersonAllOfPictureId id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The type of item the picture is related to
    * @return itemType
    **/
    @JsonProperty("item_type")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getItemType() {
        return itemType;
    }

    /**
     * Set itemType
     **/
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public PersonAllOfPictureId itemType(String itemType) {
        this.itemType = itemType;
        return this;
    }

    /**
    * The ID of related item
    * @return itemId
    **/
    @JsonProperty("item_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getItemId() {
        return itemId;
    }

    /**
     * Set itemId
     **/
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public PersonAllOfPictureId itemId(Integer itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
    * Whether the associated picture is active or not
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

    public PersonAllOfPictureId activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * The add time of the picture
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

    public PersonAllOfPictureId addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The update time of the picture
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

    public PersonAllOfPictureId updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
    * The ID of the user who added the picture
    * @return addedByUserId
    **/
    @JsonProperty("added_by_user_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getAddedByUserId() {
        return addedByUserId;
    }

    /**
     * Set addedByUserId
     **/
    public void setAddedByUserId(Integer addedByUserId) {
        this.addedByUserId = addedByUserId;
    }

    public PersonAllOfPictureId addedByUserId(Integer addedByUserId) {
        this.addedByUserId = addedByUserId;
        return this;
    }

    /**
    * Get pictures
    * @return pictures
    **/
    @JsonProperty("pictures")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PictureDataPictures getPictures() {
        return pictures;
    }

    /**
     * Set pictures
     **/
    public void setPictures(PictureDataPictures pictures) {
        this.pictures = pictures;
    }

    public PersonAllOfPictureId pictures(PictureDataPictures pictures) {
        this.pictures = pictures;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersonAllOfPictureId {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    addedByUserId: ").append(toIndentedString(addedByUserId)).append("\n");
        sb.append("    pictures: ").append(toIndentedString(pictures)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code PersonAllOfPictureId} object that
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

        PersonAllOfPictureId model = (PersonAllOfPictureId) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(itemType, model.itemType) &&
        java.util.Objects.equals(itemId, model.itemId) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime) &&
        java.util.Objects.equals(addedByUserId, model.addedByUserId) &&
        java.util.Objects.equals(pictures, model.pictures);
    }

    /**
     * Returns a hash code for a {@code PersonAllOfPictureId}.
     *
     * @return a hash code value for a {@code PersonAllOfPictureId}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        itemType,
        itemId,
        activeFlag,
        addTime,
        updateTime,
        addedByUserId,
        pictures);
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
    public static class PersonAllOfPictureIdQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("itemType")
        private String itemType;
        @jakarta.ws.rs.QueryParam("itemId")
        private Integer itemId;
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        @jakarta.ws.rs.QueryParam("updateTime")
        private String updateTime;
        @jakarta.ws.rs.QueryParam("addedByUserId")
        private Integer addedByUserId;
        @jakarta.ws.rs.QueryParam("pictures")
        private PictureDataPictures pictures;

        /**
        * The ID of the picture associated with the item
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

        public PersonAllOfPictureIdQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The type of item the picture is related to
        * @return itemType
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("item_type")
        public String getItemType() {
            return itemType;
        }

        /**
         * Set itemType
         **/
        public void setItemType(String itemType) {
            this.itemType = itemType;
        }

        public PersonAllOfPictureIdQueryParam itemType(String itemType) {
            this.itemType = itemType;
            return this;
        }

        /**
        * The ID of related item
        * @return itemId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("item_id")
        public Integer getItemId() {
            return itemId;
        }

        /**
         * Set itemId
         **/
        public void setItemId(Integer itemId) {
            this.itemId = itemId;
        }

        public PersonAllOfPictureIdQueryParam itemId(Integer itemId) {
            this.itemId = itemId;
            return this;
        }

        /**
        * Whether the associated picture is active or not
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

        public PersonAllOfPictureIdQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * The add time of the picture
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

        public PersonAllOfPictureIdQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The update time of the picture
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

        public PersonAllOfPictureIdQueryParam updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
        * The ID of the user who added the picture
        * @return addedByUserId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("added_by_user_id")
        public Integer getAddedByUserId() {
            return addedByUserId;
        }

        /**
         * Set addedByUserId
         **/
        public void setAddedByUserId(Integer addedByUserId) {
            this.addedByUserId = addedByUserId;
        }

        public PersonAllOfPictureIdQueryParam addedByUserId(Integer addedByUserId) {
            this.addedByUserId = addedByUserId;
            return this;
        }

        /**
        * Get pictures
        * @return pictures
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("pictures")
        public PictureDataPictures getPictures() {
            return pictures;
        }

        /**
         * Set pictures
         **/
        public void setPictures(PictureDataPictures pictures) {
            this.pictures = pictures;
        }

        public PersonAllOfPictureIdQueryParam pictures(PictureDataPictures pictures) {
            this.pictures = pictures;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PersonAllOfPictureIdQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
            sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
            sb.append("    addedByUserId: ").append(toIndentedString(addedByUserId)).append("\n");
            sb.append("    pictures: ").append(toIndentedString(pictures)).append("\n");
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
