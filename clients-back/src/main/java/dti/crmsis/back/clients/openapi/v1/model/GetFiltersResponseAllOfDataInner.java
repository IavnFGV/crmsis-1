package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The filter object
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetFiltersResponseAllOfDataInner  {

    /**
      * The ID of the filter
     **/
    private Integer id;
    /**
      * The name of the filter
     **/
    private String name;
    /**
      * The active flag of the filter
     **/
    private Boolean activeFlag;
    /**
      * The type of the item
     **/
    private String type;
    /**
      * The owner of the filter
     **/
    private Integer userId;
    /**
      * The date and time when the filter was added
     **/
    private String addTime;
    /**
      * The date and time when the filter was updated
     **/
    private String updateTime;
    /**
      * The visibility group ID of who can see then filter
     **/
    private Integer visibleTo;
    /**
      * Used by Pipedrive webapp
     **/
    private Integer customViewId;

    /**
    * The ID of the filter
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

    public GetFiltersResponseAllOfDataInner id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The name of the filter
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

    public GetFiltersResponseAllOfDataInner name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The active flag of the filter
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

    public GetFiltersResponseAllOfDataInner activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * The type of the item
    * @return type
    **/
    @JsonProperty("type")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(String type) {
        this.type = type;
    }

    public GetFiltersResponseAllOfDataInner type(String type) {
        this.type = type;
        return this;
    }

    /**
    * The owner of the filter
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

    public GetFiltersResponseAllOfDataInner userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
    * The date and time when the filter was added
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

    public GetFiltersResponseAllOfDataInner addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The date and time when the filter was updated
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

    public GetFiltersResponseAllOfDataInner updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
    * The visibility group ID of who can see then filter
    * @return visibleTo
    **/
    @JsonProperty("visible_to")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getVisibleTo() {
        return visibleTo;
    }

    /**
     * Set visibleTo
     **/
    public void setVisibleTo(Integer visibleTo) {
        this.visibleTo = visibleTo;
    }

    public GetFiltersResponseAllOfDataInner visibleTo(Integer visibleTo) {
        this.visibleTo = visibleTo;
        return this;
    }

    /**
    * Used by Pipedrive webapp
    * @return customViewId
    **/
    @JsonProperty("custom_view_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getCustomViewId() {
        return customViewId;
    }

    /**
     * Set customViewId
     **/
    public void setCustomViewId(Integer customViewId) {
        this.customViewId = customViewId;
    }

    public GetFiltersResponseAllOfDataInner customViewId(Integer customViewId) {
        this.customViewId = customViewId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetFiltersResponseAllOfDataInner {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
        sb.append("    customViewId: ").append(toIndentedString(customViewId)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetFiltersResponseAllOfDataInner} object that
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

        GetFiltersResponseAllOfDataInner model = (GetFiltersResponseAllOfDataInner) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(type, model.type) &&
        java.util.Objects.equals(userId, model.userId) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime) &&
        java.util.Objects.equals(visibleTo, model.visibleTo) &&
        java.util.Objects.equals(customViewId, model.customViewId);
    }

    /**
     * Returns a hash code for a {@code GetFiltersResponseAllOfDataInner}.
     *
     * @return a hash code value for a {@code GetFiltersResponseAllOfDataInner}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        name,
        activeFlag,
        type,
        userId,
        addTime,
        updateTime,
        visibleTo,
        customViewId);
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
      * The filter object
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetFiltersResponseAllOfDataInnerQueryParam  {

        /**
          * The filter object
         **/
        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        /**
          * The filter object
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * The filter object
         **/
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        /**
          * The filter object
         **/
        @jakarta.ws.rs.QueryParam("type")
        private String type;
        /**
          * The filter object
         **/
        @jakarta.ws.rs.QueryParam("userId")
        private Integer userId;
        /**
          * The filter object
         **/
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        /**
          * The filter object
         **/
        @jakarta.ws.rs.QueryParam("updateTime")
        private String updateTime;
        /**
          * The filter object
         **/
        @jakarta.ws.rs.QueryParam("visibleTo")
        private Integer visibleTo;
        /**
          * The filter object
         **/
        @jakarta.ws.rs.QueryParam("customViewId")
        private Integer customViewId;

        /**
        * The ID of the filter
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

        public GetFiltersResponseAllOfDataInnerQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The name of the filter
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

        public GetFiltersResponseAllOfDataInnerQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The active flag of the filter
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

        public GetFiltersResponseAllOfDataInnerQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * The type of the item
        * @return type
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        public String getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(String type) {
            this.type = type;
        }

        public GetFiltersResponseAllOfDataInnerQueryParam type(String type) {
            this.type = type;
            return this;
        }

        /**
        * The owner of the filter
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

        public GetFiltersResponseAllOfDataInnerQueryParam userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        /**
        * The date and time when the filter was added
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

        public GetFiltersResponseAllOfDataInnerQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The date and time when the filter was updated
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

        public GetFiltersResponseAllOfDataInnerQueryParam updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
        * The visibility group ID of who can see then filter
        * @return visibleTo
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("visible_to")
        public Integer getVisibleTo() {
            return visibleTo;
        }

        /**
         * Set visibleTo
         **/
        public void setVisibleTo(Integer visibleTo) {
            this.visibleTo = visibleTo;
        }

        public GetFiltersResponseAllOfDataInnerQueryParam visibleTo(Integer visibleTo) {
            this.visibleTo = visibleTo;
            return this;
        }

        /**
        * Used by Pipedrive webapp
        * @return customViewId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("custom_view_id")
        public Integer getCustomViewId() {
            return customViewId;
        }

        /**
         * Set customViewId
         **/
        public void setCustomViewId(Integer customViewId) {
            this.customViewId = customViewId;
        }

        public GetFiltersResponseAllOfDataInnerQueryParam customViewId(Integer customViewId) {
            this.customViewId = customViewId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetFiltersResponseAllOfDataInnerQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
            sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
            sb.append("    customViewId: ").append(toIndentedString(customViewId)).append("\n");
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
