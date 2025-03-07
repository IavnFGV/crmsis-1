package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetChangelogResponseAllOfDataInner  {

    /**
      * The key of the field that was changed
     **/
    private String fieldKey;
    /**
      * The value of the field before the change
     **/
    private String oldValue;
    /**
      * The value of the field after the change
     **/
    private String newValue;
    /**
      * The ID of the user who made the change
     **/
    private Integer actorUserId;
    /**
      * The date and time of the change
     **/
    private String time;
    /**
      * The source of change, for example 'app', 'mobile', 'api', etc.
     **/
    private String changeSource;
    /**
      * The user agent from which the change was made
     **/
    private String changeSourceUserAgent;
    /**
      * Whether the change was made as part of a bulk update
     **/
    private Boolean isBulkUpdateFlag;

    /**
    * The key of the field that was changed
    * @return fieldKey
    **/
    @JsonProperty("field_key")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getFieldKey() {
        return fieldKey;
    }

    /**
     * Set fieldKey
     **/
    public void setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
    }

    public GetChangelogResponseAllOfDataInner fieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
        return this;
    }

    /**
    * The value of the field before the change
    * @return oldValue
    **/
    @JsonProperty("old_value")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getOldValue() {
        return oldValue;
    }

    /**
     * Set oldValue
     **/
    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public GetChangelogResponseAllOfDataInner oldValue(String oldValue) {
        this.oldValue = oldValue;
        return this;
    }

    /**
    * The value of the field after the change
    * @return newValue
    **/
    @JsonProperty("new_value")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getNewValue() {
        return newValue;
    }

    /**
     * Set newValue
     **/
    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public GetChangelogResponseAllOfDataInner newValue(String newValue) {
        this.newValue = newValue;
        return this;
    }

    /**
    * The ID of the user who made the change
    * @return actorUserId
    **/
    @JsonProperty("actor_user_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getActorUserId() {
        return actorUserId;
    }

    /**
     * Set actorUserId
     **/
    public void setActorUserId(Integer actorUserId) {
        this.actorUserId = actorUserId;
    }

    public GetChangelogResponseAllOfDataInner actorUserId(Integer actorUserId) {
        this.actorUserId = actorUserId;
        return this;
    }

    /**
    * The date and time of the change
    * @return time
    **/
    @JsonProperty("time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTime() {
        return time;
    }

    /**
     * Set time
     **/
    public void setTime(String time) {
        this.time = time;
    }

    public GetChangelogResponseAllOfDataInner time(String time) {
        this.time = time;
        return this;
    }

    /**
    * The source of change, for example 'app', 'mobile', 'api', etc.
    * @return changeSource
    **/
    @JsonProperty("change_source")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getChangeSource() {
        return changeSource;
    }

    /**
     * Set changeSource
     **/
    public void setChangeSource(String changeSource) {
        this.changeSource = changeSource;
    }

    public GetChangelogResponseAllOfDataInner changeSource(String changeSource) {
        this.changeSource = changeSource;
        return this;
    }

    /**
    * The user agent from which the change was made
    * @return changeSourceUserAgent
    **/
    @JsonProperty("change_source_user_agent")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getChangeSourceUserAgent() {
        return changeSourceUserAgent;
    }

    /**
     * Set changeSourceUserAgent
     **/
    public void setChangeSourceUserAgent(String changeSourceUserAgent) {
        this.changeSourceUserAgent = changeSourceUserAgent;
    }

    public GetChangelogResponseAllOfDataInner changeSourceUserAgent(String changeSourceUserAgent) {
        this.changeSourceUserAgent = changeSourceUserAgent;
        return this;
    }

    /**
    * Whether the change was made as part of a bulk update
    * @return isBulkUpdateFlag
    **/
    @JsonProperty("is_bulk_update_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getIsBulkUpdateFlag() {
        return isBulkUpdateFlag;
    }

    /**
     * Set isBulkUpdateFlag
     **/
    public void setIsBulkUpdateFlag(Boolean isBulkUpdateFlag) {
        this.isBulkUpdateFlag = isBulkUpdateFlag;
    }

    public GetChangelogResponseAllOfDataInner isBulkUpdateFlag(Boolean isBulkUpdateFlag) {
        this.isBulkUpdateFlag = isBulkUpdateFlag;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetChangelogResponseAllOfDataInner {\n");

        sb.append("    fieldKey: ").append(toIndentedString(fieldKey)).append("\n");
        sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
        sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
        sb.append("    actorUserId: ").append(toIndentedString(actorUserId)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    changeSource: ").append(toIndentedString(changeSource)).append("\n");
        sb.append("    changeSourceUserAgent: ").append(toIndentedString(changeSourceUserAgent)).append("\n");
        sb.append("    isBulkUpdateFlag: ").append(toIndentedString(isBulkUpdateFlag)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetChangelogResponseAllOfDataInner} object that
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

        GetChangelogResponseAllOfDataInner model = (GetChangelogResponseAllOfDataInner) obj;

        return java.util.Objects.equals(fieldKey, model.fieldKey) &&
        java.util.Objects.equals(oldValue, model.oldValue) &&
        java.util.Objects.equals(newValue, model.newValue) &&
        java.util.Objects.equals(actorUserId, model.actorUserId) &&
        java.util.Objects.equals(time, model.time) &&
        java.util.Objects.equals(changeSource, model.changeSource) &&
        java.util.Objects.equals(changeSourceUserAgent, model.changeSourceUserAgent) &&
        java.util.Objects.equals(isBulkUpdateFlag, model.isBulkUpdateFlag);
    }

    /**
     * Returns a hash code for a {@code GetChangelogResponseAllOfDataInner}.
     *
     * @return a hash code value for a {@code GetChangelogResponseAllOfDataInner}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(fieldKey,
        oldValue,
        newValue,
        actorUserId,
        time,
        changeSource,
        changeSourceUserAgent,
        isBulkUpdateFlag);
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
    public static class GetChangelogResponseAllOfDataInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("fieldKey")
        private String fieldKey;
        @jakarta.ws.rs.QueryParam("oldValue")
        private String oldValue;
        @jakarta.ws.rs.QueryParam("newValue")
        private String newValue;
        @jakarta.ws.rs.QueryParam("actorUserId")
        private Integer actorUserId;
        @jakarta.ws.rs.QueryParam("time")
        private String time;
        @jakarta.ws.rs.QueryParam("changeSource")
        private String changeSource;
        @jakarta.ws.rs.QueryParam("changeSourceUserAgent")
        private String changeSourceUserAgent;
        @jakarta.ws.rs.QueryParam("isBulkUpdateFlag")
        private Boolean isBulkUpdateFlag;

        /**
        * The key of the field that was changed
        * @return fieldKey
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("field_key")
        public String getFieldKey() {
            return fieldKey;
        }

        /**
         * Set fieldKey
         **/
        public void setFieldKey(String fieldKey) {
            this.fieldKey = fieldKey;
        }

        public GetChangelogResponseAllOfDataInnerQueryParam fieldKey(String fieldKey) {
            this.fieldKey = fieldKey;
            return this;
        }

        /**
        * The value of the field before the change
        * @return oldValue
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("old_value")
        public String getOldValue() {
            return oldValue;
        }

        /**
         * Set oldValue
         **/
        public void setOldValue(String oldValue) {
            this.oldValue = oldValue;
        }

        public GetChangelogResponseAllOfDataInnerQueryParam oldValue(String oldValue) {
            this.oldValue = oldValue;
            return this;
        }

        /**
        * The value of the field after the change
        * @return newValue
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("new_value")
        public String getNewValue() {
            return newValue;
        }

        /**
         * Set newValue
         **/
        public void setNewValue(String newValue) {
            this.newValue = newValue;
        }

        public GetChangelogResponseAllOfDataInnerQueryParam newValue(String newValue) {
            this.newValue = newValue;
            return this;
        }

        /**
        * The ID of the user who made the change
        * @return actorUserId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("actor_user_id")
        public Integer getActorUserId() {
            return actorUserId;
        }

        /**
         * Set actorUserId
         **/
        public void setActorUserId(Integer actorUserId) {
            this.actorUserId = actorUserId;
        }

        public GetChangelogResponseAllOfDataInnerQueryParam actorUserId(Integer actorUserId) {
            this.actorUserId = actorUserId;
            return this;
        }

        /**
        * The date and time of the change
        * @return time
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("time")
        public String getTime() {
            return time;
        }

        /**
         * Set time
         **/
        public void setTime(String time) {
            this.time = time;
        }

        public GetChangelogResponseAllOfDataInnerQueryParam time(String time) {
            this.time = time;
            return this;
        }

        /**
        * The source of change, for example 'app', 'mobile', 'api', etc.
        * @return changeSource
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("change_source")
        public String getChangeSource() {
            return changeSource;
        }

        /**
         * Set changeSource
         **/
        public void setChangeSource(String changeSource) {
            this.changeSource = changeSource;
        }

        public GetChangelogResponseAllOfDataInnerQueryParam changeSource(String changeSource) {
            this.changeSource = changeSource;
            return this;
        }

        /**
        * The user agent from which the change was made
        * @return changeSourceUserAgent
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("change_source_user_agent")
        public String getChangeSourceUserAgent() {
            return changeSourceUserAgent;
        }

        /**
         * Set changeSourceUserAgent
         **/
        public void setChangeSourceUserAgent(String changeSourceUserAgent) {
            this.changeSourceUserAgent = changeSourceUserAgent;
        }

        public GetChangelogResponseAllOfDataInnerQueryParam changeSourceUserAgent(String changeSourceUserAgent) {
            this.changeSourceUserAgent = changeSourceUserAgent;
            return this;
        }

        /**
        * Whether the change was made as part of a bulk update
        * @return isBulkUpdateFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("is_bulk_update_flag")
        public Boolean getIsBulkUpdateFlag() {
            return isBulkUpdateFlag;
        }

        /**
         * Set isBulkUpdateFlag
         **/
        public void setIsBulkUpdateFlag(Boolean isBulkUpdateFlag) {
            this.isBulkUpdateFlag = isBulkUpdateFlag;
        }

        public GetChangelogResponseAllOfDataInnerQueryParam isBulkUpdateFlag(Boolean isBulkUpdateFlag) {
            this.isBulkUpdateFlag = isBulkUpdateFlag;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetChangelogResponseAllOfDataInnerQueryParam {\n");

            sb.append("    fieldKey: ").append(toIndentedString(fieldKey)).append("\n");
            sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
            sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
            sb.append("    actorUserId: ").append(toIndentedString(actorUserId)).append("\n");
            sb.append("    time: ").append(toIndentedString(time)).append("\n");
            sb.append("    changeSource: ").append(toIndentedString(changeSource)).append("\n");
            sb.append("    changeSourceUserAgent: ").append(toIndentedString(changeSourceUserAgent)).append("\n");
            sb.append("    isBulkUpdateFlag: ").append(toIndentedString(isBulkUpdateFlag)).append("\n");
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
