package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Updated stage object
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseStage1  {

    /**
      * The ID of the stage
     **/
    private Integer id;
    /**
      * Defines the order of the stage
     **/
    private Integer orderNr;
    /**
      * The name of the stage
     **/
    private String name;
    /**
      * Whether the stage is active or deleted
     **/
    private Boolean activeFlag;
    /**
      * The success probability percentage of the deal. Used/shown when the deal weighted values are used.
     **/
    private Integer dealProbability;
    /**
      * The ID of the pipeline to add the stage to
     **/
    private Integer pipelineId;
    /**
      * Whether deals in this stage can become rotten
     **/
    private Boolean rottenFlag;
    /**
      * The number of days the deals not updated in this stage would become rotten. Applies only if the `rotten_flag` is set.
     **/
    private Integer rottenDays;
    /**
      * The stage creation time. Format: YYYY-MM-DD HH:MM:SS.
     **/
    private String addTime;
    /**
      * The stage update time. Format: YYYY-MM-DD HH:MM:SS.
     **/
    private String updateTime;

    /**
    * The ID of the stage
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

    public BaseStage1 id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * Defines the order of the stage
    * @return orderNr
    **/
    @JsonProperty("order_nr")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getOrderNr() {
        return orderNr;
    }

    /**
     * Set orderNr
     **/
    public void setOrderNr(Integer orderNr) {
        this.orderNr = orderNr;
    }

    public BaseStage1 orderNr(Integer orderNr) {
        this.orderNr = orderNr;
        return this;
    }

    /**
    * The name of the stage
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

    public BaseStage1 name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Whether the stage is active or deleted
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

    public BaseStage1 activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * The success probability percentage of the deal. Used/shown when the deal weighted values are used.
    * @return dealProbability
    **/
    @JsonProperty("deal_probability")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getDealProbability() {
        return dealProbability;
    }

    /**
     * Set dealProbability
     **/
    public void setDealProbability(Integer dealProbability) {
        this.dealProbability = dealProbability;
    }

    public BaseStage1 dealProbability(Integer dealProbability) {
        this.dealProbability = dealProbability;
        return this;
    }

    /**
    * The ID of the pipeline to add the stage to
    * @return pipelineId
    **/
    @JsonProperty("pipeline_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPipelineId() {
        return pipelineId;
    }

    /**
     * Set pipelineId
     **/
    public void setPipelineId(Integer pipelineId) {
        this.pipelineId = pipelineId;
    }

    public BaseStage1 pipelineId(Integer pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
    * Whether deals in this stage can become rotten
    * @return rottenFlag
    **/
    @JsonProperty("rotten_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRottenFlag() {
        return rottenFlag;
    }

    /**
     * Set rottenFlag
     **/
    public void setRottenFlag(Boolean rottenFlag) {
        this.rottenFlag = rottenFlag;
    }

    public BaseStage1 rottenFlag(Boolean rottenFlag) {
        this.rottenFlag = rottenFlag;
        return this;
    }

    /**
    * The number of days the deals not updated in this stage would become rotten. Applies only if the `rotten_flag` is set.
    * @return rottenDays
    **/
    @JsonProperty("rotten_days")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getRottenDays() {
        return rottenDays;
    }

    /**
     * Set rottenDays
     **/
    public void setRottenDays(Integer rottenDays) {
        this.rottenDays = rottenDays;
    }

    public BaseStage1 rottenDays(Integer rottenDays) {
        this.rottenDays = rottenDays;
        return this;
    }

    /**
    * The stage creation time. Format: YYYY-MM-DD HH:MM:SS.
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

    public BaseStage1 addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The stage update time. Format: YYYY-MM-DD HH:MM:SS.
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

    public BaseStage1 updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaseStage1 {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    orderNr: ").append(toIndentedString(orderNr)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    dealProbability: ").append(toIndentedString(dealProbability)).append("\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    rottenFlag: ").append(toIndentedString(rottenFlag)).append("\n");
        sb.append("    rottenDays: ").append(toIndentedString(rottenDays)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code BaseStage1} object that
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

        BaseStage1 model = (BaseStage1) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(orderNr, model.orderNr) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(dealProbability, model.dealProbability) &&
        java.util.Objects.equals(pipelineId, model.pipelineId) &&
        java.util.Objects.equals(rottenFlag, model.rottenFlag) &&
        java.util.Objects.equals(rottenDays, model.rottenDays) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime);
    }

    /**
     * Returns a hash code for a {@code BaseStage1}.
     *
     * @return a hash code value for a {@code BaseStage1}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        orderNr,
        name,
        activeFlag,
        dealProbability,
        pipelineId,
        rottenFlag,
        rottenDays,
        addTime,
        updateTime);
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
      * Updated stage object
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class BaseStage1QueryParam  {

        /**
          * Updated stage object
         **/
        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        /**
          * Updated stage object
         **/
        @jakarta.ws.rs.QueryParam("orderNr")
        private Integer orderNr;
        /**
          * Updated stage object
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * Updated stage object
         **/
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        /**
          * Updated stage object
         **/
        @jakarta.ws.rs.QueryParam("dealProbability")
        private Integer dealProbability;
        /**
          * Updated stage object
         **/
        @jakarta.ws.rs.QueryParam("pipelineId")
        private Integer pipelineId;
        /**
          * Updated stage object
         **/
        @jakarta.ws.rs.QueryParam("rottenFlag")
        private Boolean rottenFlag;
        /**
          * Updated stage object
         **/
        @jakarta.ws.rs.QueryParam("rottenDays")
        private Integer rottenDays;
        /**
          * Updated stage object
         **/
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        /**
          * Updated stage object
         **/
        @jakarta.ws.rs.QueryParam("updateTime")
        private String updateTime;

        /**
        * The ID of the stage
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

        public BaseStage1QueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * Defines the order of the stage
        * @return orderNr
        **/
        @JsonProperty("order_nr")
        public Integer getOrderNr() {
            return orderNr;
        }

        /**
         * Set orderNr
         **/
        public void setOrderNr(Integer orderNr) {
            this.orderNr = orderNr;
        }

        public BaseStage1QueryParam orderNr(Integer orderNr) {
            this.orderNr = orderNr;
            return this;
        }

        /**
        * The name of the stage
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

        public BaseStage1QueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Whether the stage is active or deleted
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

        public BaseStage1QueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * The success probability percentage of the deal. Used/shown when the deal weighted values are used.
        * @return dealProbability
        **/
        @JsonProperty("deal_probability")
        public Integer getDealProbability() {
            return dealProbability;
        }

        /**
         * Set dealProbability
         **/
        public void setDealProbability(Integer dealProbability) {
            this.dealProbability = dealProbability;
        }

        public BaseStage1QueryParam dealProbability(Integer dealProbability) {
            this.dealProbability = dealProbability;
            return this;
        }

        /**
        * The ID of the pipeline to add the stage to
        * @return pipelineId
        **/
        @JsonProperty("pipeline_id")
        public Integer getPipelineId() {
            return pipelineId;
        }

        /**
         * Set pipelineId
         **/
        public void setPipelineId(Integer pipelineId) {
            this.pipelineId = pipelineId;
        }

        public BaseStage1QueryParam pipelineId(Integer pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }

        /**
        * Whether deals in this stage can become rotten
        * @return rottenFlag
        **/
        @JsonProperty("rotten_flag")
        public Boolean getRottenFlag() {
            return rottenFlag;
        }

        /**
         * Set rottenFlag
         **/
        public void setRottenFlag(Boolean rottenFlag) {
            this.rottenFlag = rottenFlag;
        }

        public BaseStage1QueryParam rottenFlag(Boolean rottenFlag) {
            this.rottenFlag = rottenFlag;
            return this;
        }

        /**
        * The number of days the deals not updated in this stage would become rotten. Applies only if the `rotten_flag` is set.
        * @return rottenDays
        **/
        @JsonProperty("rotten_days")
        public Integer getRottenDays() {
            return rottenDays;
        }

        /**
         * Set rottenDays
         **/
        public void setRottenDays(Integer rottenDays) {
            this.rottenDays = rottenDays;
        }

        public BaseStage1QueryParam rottenDays(Integer rottenDays) {
            this.rottenDays = rottenDays;
            return this;
        }

        /**
        * The stage creation time. Format: YYYY-MM-DD HH:MM:SS.
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

        public BaseStage1QueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The stage update time. Format: YYYY-MM-DD HH:MM:SS.
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

        public BaseStage1QueryParam updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class BaseStage1QueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    orderNr: ").append(toIndentedString(orderNr)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    dealProbability: ").append(toIndentedString(dealProbability)).append("\n");
            sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
            sb.append("    rottenFlag: ").append(toIndentedString(rottenFlag)).append("\n");
            sb.append("    rottenDays: ").append(toIndentedString(rottenDays)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
