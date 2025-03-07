package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Filter  {

    /**
      * The ID of the created filter
     **/
    private Integer id;
    /**
      * The name of the created filter
     **/
    private String name;
    /**
      * The activity flag of the created filter
     **/
    private Boolean activeFlag;

    public enum TypeEnum {
        DEALS(String.valueOf("deals")), LEADS(String.valueOf("leads")), ORG(String.valueOf("org")), PEOPLE(String.valueOf("people")), PRODUCTS(String.valueOf("products")), ACTIVITY(String.valueOf("activity")), PROJECTS(String.valueOf("projects"));

        // caching enum access
        private static final java.util.EnumSet<TypeEnum> values = java.util.EnumSet.allOf(TypeEnum.class);

        String value;

        TypeEnum (String v) {
            value = v;
        }

        @JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromString(String v) {
            for (TypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private TypeEnum type;
    /**
      * If the created filter is temporary or not
     **/
    private Boolean temporaryFlag;
    /**
      * The user ID of the created filter
     **/
    private Integer userId;
    /**
      * The add time of the created filter
     **/
    private String addTime;
    /**
      * The update time of the created filter
     **/
    private String updateTime;
    /**
      * The visibility group ID of the created filter
     **/
    private Integer visibleTo;
    /**
      * The custom view ID of the created filter
     **/
    private Integer customViewId;
    /**
      * The created filter conditions object
     **/
    private Object conditions;

    /**
    * The ID of the created filter
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

    public Filter id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The name of the created filter
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

    public Filter name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The activity flag of the created filter
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

    public Filter activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * Get type
    * @return type
    **/
    @JsonProperty("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TypeEnum getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Filter type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
    * If the created filter is temporary or not
    * @return temporaryFlag
    **/
    @JsonProperty("temporary_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTemporaryFlag() {
        return temporaryFlag;
    }

    /**
     * Set temporaryFlag
     **/
    public void setTemporaryFlag(Boolean temporaryFlag) {
        this.temporaryFlag = temporaryFlag;
    }

    public Filter temporaryFlag(Boolean temporaryFlag) {
        this.temporaryFlag = temporaryFlag;
        return this;
    }

    /**
    * The user ID of the created filter
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

    public Filter userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
    * The add time of the created filter
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

    public Filter addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The update time of the created filter
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

    public Filter updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
    * The visibility group ID of the created filter
    * @return visibleTo
    **/
    @JsonProperty("visible_to")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getVisibleTo() {
        return visibleTo;
    }

    /**
     * Set visibleTo
     **/
    public void setVisibleTo(Integer visibleTo) {
        this.visibleTo = visibleTo;
    }

    public Filter visibleTo(Integer visibleTo) {
        this.visibleTo = visibleTo;
        return this;
    }

    /**
    * The custom view ID of the created filter
    * @return customViewId
    **/
    @JsonProperty("custom_view_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCustomViewId() {
        return customViewId;
    }

    /**
     * Set customViewId
     **/
    public void setCustomViewId(Integer customViewId) {
        this.customViewId = customViewId;
    }

    public Filter customViewId(Integer customViewId) {
        this.customViewId = customViewId;
        return this;
    }

    /**
    * The created filter conditions object
    * @return conditions
    **/
    @JsonProperty("conditions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getConditions() {
        return conditions;
    }

    /**
     * Set conditions
     **/
    public void setConditions(Object conditions) {
        this.conditions = conditions;
    }

    public Filter conditions(Object conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Filter {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    temporaryFlag: ").append(toIndentedString(temporaryFlag)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
        sb.append("    customViewId: ").append(toIndentedString(customViewId)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code Filter} object that
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

        Filter model = (Filter) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(type, model.type) &&
        java.util.Objects.equals(temporaryFlag, model.temporaryFlag) &&
        java.util.Objects.equals(userId, model.userId) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime) &&
        java.util.Objects.equals(visibleTo, model.visibleTo) &&
        java.util.Objects.equals(customViewId, model.customViewId) &&
        java.util.Objects.equals(conditions, model.conditions);
    }

    /**
     * Returns a hash code for a {@code Filter}.
     *
     * @return a hash code value for a {@code Filter}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        name,
        activeFlag,
        type,
        temporaryFlag,
        userId,
        addTime,
        updateTime,
        visibleTo,
        customViewId,
        conditions);
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
    public static class FilterQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;

    public enum TypeEnum {
        DEALS(String.valueOf("deals")), LEADS(String.valueOf("leads")), ORG(String.valueOf("org")), PEOPLE(String.valueOf("people")), PRODUCTS(String.valueOf("products")), ACTIVITY(String.valueOf("activity")), PROJECTS(String.valueOf("projects"));

        // caching enum access
        private static final java.util.EnumSet<TypeEnum> values = java.util.EnumSet.allOf(TypeEnum.class);

        String value;

        TypeEnum (String v) {
            value = v;
        }

        @JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromString(String v) {
            for (TypeEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private TypeEnum type;
        @jakarta.ws.rs.QueryParam("temporaryFlag")
        private Boolean temporaryFlag;
        @jakarta.ws.rs.QueryParam("userId")
        private Integer userId;
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        @jakarta.ws.rs.QueryParam("updateTime")
        private String updateTime;
        @jakarta.ws.rs.QueryParam("visibleTo")
        private Integer visibleTo;
        @jakarta.ws.rs.QueryParam("customViewId")
        private Integer customViewId;
        @jakarta.ws.rs.QueryParam("conditions")
        private Object conditions;

        /**
        * The ID of the created filter
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

        public FilterQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The name of the created filter
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

        public FilterQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The activity flag of the created filter
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

        public FilterQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * Get type
        * @return type
        **/
        @JsonProperty("type")
        public TypeEnum getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(TypeEnum type) {
            this.type = type;
        }

        public FilterQueryParam type(TypeEnum type) {
            this.type = type;
            return this;
        }

        /**
        * If the created filter is temporary or not
        * @return temporaryFlag
        **/
        @JsonProperty("temporary_flag")
        public Boolean getTemporaryFlag() {
            return temporaryFlag;
        }

        /**
         * Set temporaryFlag
         **/
        public void setTemporaryFlag(Boolean temporaryFlag) {
            this.temporaryFlag = temporaryFlag;
        }

        public FilterQueryParam temporaryFlag(Boolean temporaryFlag) {
            this.temporaryFlag = temporaryFlag;
            return this;
        }

        /**
        * The user ID of the created filter
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

        public FilterQueryParam userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        /**
        * The add time of the created filter
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

        public FilterQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The update time of the created filter
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

        public FilterQueryParam updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
        * The visibility group ID of the created filter
        * @return visibleTo
        **/
        @JsonProperty("visible_to")
        public Integer getVisibleTo() {
            return visibleTo;
        }

        /**
         * Set visibleTo
         **/
        public void setVisibleTo(Integer visibleTo) {
            this.visibleTo = visibleTo;
        }

        public FilterQueryParam visibleTo(Integer visibleTo) {
            this.visibleTo = visibleTo;
            return this;
        }

        /**
        * The custom view ID of the created filter
        * @return customViewId
        **/
        @JsonProperty("custom_view_id")
        public Integer getCustomViewId() {
            return customViewId;
        }

        /**
         * Set customViewId
         **/
        public void setCustomViewId(Integer customViewId) {
            this.customViewId = customViewId;
        }

        public FilterQueryParam customViewId(Integer customViewId) {
            this.customViewId = customViewId;
            return this;
        }

        /**
        * The created filter conditions object
        * @return conditions
        **/
        @JsonProperty("conditions")
        public Object getConditions() {
            return conditions;
        }

        /**
         * Set conditions
         **/
        public void setConditions(Object conditions) {
            this.conditions = conditions;
        }

        public FilterQueryParam conditions(Object conditions) {
            this.conditions = conditions;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class FilterQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    temporaryFlag: ").append(toIndentedString(temporaryFlag)).append("\n");
            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
            sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
            sb.append("    customViewId: ").append(toIndentedString(customViewId)).append("\n");
            sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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
