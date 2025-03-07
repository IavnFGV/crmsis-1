package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.PipelineDetailsAllOfDealsSummary;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The stage object
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetStageResponseData  {

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
    private PipelineDetailsAllOfDealsSummary dealsSummary;

    /**
    * The ID of the stage
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

    public GetStageResponseData id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * Defines the order of the stage
    * @return orderNr
    **/
    @JsonProperty("order_nr")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getOrderNr() {
        return orderNr;
    }

    /**
     * Set orderNr
     **/
    public void setOrderNr(Integer orderNr) {
        this.orderNr = orderNr;
    }

    public GetStageResponseData orderNr(Integer orderNr) {
        this.orderNr = orderNr;
        return this;
    }

    /**
    * The name of the stage
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

    public GetStageResponseData name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Whether the stage is active or deleted
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

    public GetStageResponseData activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * The success probability percentage of the deal. Used/shown when the deal weighted values are used.
    * @return dealProbability
    **/
    @JsonProperty("deal_probability")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getDealProbability() {
        return dealProbability;
    }

    /**
     * Set dealProbability
     **/
    public void setDealProbability(Integer dealProbability) {
        this.dealProbability = dealProbability;
    }

    public GetStageResponseData dealProbability(Integer dealProbability) {
        this.dealProbability = dealProbability;
        return this;
    }

    /**
    * The ID of the pipeline to add the stage to
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

    public GetStageResponseData pipelineId(Integer pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
    * Whether deals in this stage can become rotten
    * @return rottenFlag
    **/
    @JsonProperty("rotten_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getRottenFlag() {
        return rottenFlag;
    }

    /**
     * Set rottenFlag
     **/
    public void setRottenFlag(Boolean rottenFlag) {
        this.rottenFlag = rottenFlag;
    }

    public GetStageResponseData rottenFlag(Boolean rottenFlag) {
        this.rottenFlag = rottenFlag;
        return this;
    }

    /**
    * The number of days the deals not updated in this stage would become rotten. Applies only if the `rotten_flag` is set.
    * @return rottenDays
    **/
    @JsonProperty("rotten_days")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getRottenDays() {
        return rottenDays;
    }

    /**
     * Set rottenDays
     **/
    public void setRottenDays(Integer rottenDays) {
        this.rottenDays = rottenDays;
    }

    public GetStageResponseData rottenDays(Integer rottenDays) {
        this.rottenDays = rottenDays;
        return this;
    }

    /**
    * The stage creation time. Format: YYYY-MM-DD HH:MM:SS.
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

    public GetStageResponseData addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The stage update time. Format: YYYY-MM-DD HH:MM:SS.
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

    public GetStageResponseData updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
    * Get dealsSummary
    * @return dealsSummary
    **/
    @JsonProperty("deals_summary")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PipelineDetailsAllOfDealsSummary getDealsSummary() {
        return dealsSummary;
    }

    /**
     * Set dealsSummary
     **/
    public void setDealsSummary(PipelineDetailsAllOfDealsSummary dealsSummary) {
        this.dealsSummary = dealsSummary;
    }

    public GetStageResponseData dealsSummary(PipelineDetailsAllOfDealsSummary dealsSummary) {
        this.dealsSummary = dealsSummary;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetStageResponseData {\n");

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
        sb.append("    dealsSummary: ").append(toIndentedString(dealsSummary)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetStageResponseData} object that
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

        GetStageResponseData model = (GetStageResponseData) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(orderNr, model.orderNr) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(dealProbability, model.dealProbability) &&
        java.util.Objects.equals(pipelineId, model.pipelineId) &&
        java.util.Objects.equals(rottenFlag, model.rottenFlag) &&
        java.util.Objects.equals(rottenDays, model.rottenDays) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime) &&
        java.util.Objects.equals(dealsSummary, model.dealsSummary);
    }

    /**
     * Returns a hash code for a {@code GetStageResponseData}.
     *
     * @return a hash code value for a {@code GetStageResponseData}.
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
        updateTime,
        dealsSummary);
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
      * The stage object
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetStageResponseDataQueryParam  {

        /**
          * The stage object
         **/
        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        /**
          * The stage object
         **/
        @jakarta.ws.rs.QueryParam("orderNr")
        private Integer orderNr;
        /**
          * The stage object
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * The stage object
         **/
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        /**
          * The stage object
         **/
        @jakarta.ws.rs.QueryParam("dealProbability")
        private Integer dealProbability;
        /**
          * The stage object
         **/
        @jakarta.ws.rs.QueryParam("pipelineId")
        private Integer pipelineId;
        /**
          * The stage object
         **/
        @jakarta.ws.rs.QueryParam("rottenFlag")
        private Boolean rottenFlag;
        /**
          * The stage object
         **/
        @jakarta.ws.rs.QueryParam("rottenDays")
        private Integer rottenDays;
        /**
          * The stage object
         **/
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        /**
          * The stage object
         **/
        @jakarta.ws.rs.QueryParam("updateTime")
        private String updateTime;
        /**
          * The stage object
         **/
        @jakarta.ws.rs.QueryParam("dealsSummary")
        private PipelineDetailsAllOfDealsSummary dealsSummary;

        /**
        * The ID of the stage
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

        public GetStageResponseDataQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * Defines the order of the stage
        * @return orderNr
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("order_nr")
        public Integer getOrderNr() {
            return orderNr;
        }

        /**
         * Set orderNr
         **/
        public void setOrderNr(Integer orderNr) {
            this.orderNr = orderNr;
        }

        public GetStageResponseDataQueryParam orderNr(Integer orderNr) {
            this.orderNr = orderNr;
            return this;
        }

        /**
        * The name of the stage
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

        public GetStageResponseDataQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Whether the stage is active or deleted
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

        public GetStageResponseDataQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * The success probability percentage of the deal. Used/shown when the deal weighted values are used.
        * @return dealProbability
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("deal_probability")
        public Integer getDealProbability() {
            return dealProbability;
        }

        /**
         * Set dealProbability
         **/
        public void setDealProbability(Integer dealProbability) {
            this.dealProbability = dealProbability;
        }

        public GetStageResponseDataQueryParam dealProbability(Integer dealProbability) {
            this.dealProbability = dealProbability;
            return this;
        }

        /**
        * The ID of the pipeline to add the stage to
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

        public GetStageResponseDataQueryParam pipelineId(Integer pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }

        /**
        * Whether deals in this stage can become rotten
        * @return rottenFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("rotten_flag")
        public Boolean getRottenFlag() {
            return rottenFlag;
        }

        /**
         * Set rottenFlag
         **/
        public void setRottenFlag(Boolean rottenFlag) {
            this.rottenFlag = rottenFlag;
        }

        public GetStageResponseDataQueryParam rottenFlag(Boolean rottenFlag) {
            this.rottenFlag = rottenFlag;
            return this;
        }

        /**
        * The number of days the deals not updated in this stage would become rotten. Applies only if the `rotten_flag` is set.
        * @return rottenDays
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("rotten_days")
        public Integer getRottenDays() {
            return rottenDays;
        }

        /**
         * Set rottenDays
         **/
        public void setRottenDays(Integer rottenDays) {
            this.rottenDays = rottenDays;
        }

        public GetStageResponseDataQueryParam rottenDays(Integer rottenDays) {
            this.rottenDays = rottenDays;
            return this;
        }

        /**
        * The stage creation time. Format: YYYY-MM-DD HH:MM:SS.
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

        public GetStageResponseDataQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The stage update time. Format: YYYY-MM-DD HH:MM:SS.
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

        public GetStageResponseDataQueryParam updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
        * Get dealsSummary
        * @return dealsSummary
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("deals_summary")
        public PipelineDetailsAllOfDealsSummary getDealsSummary() {
            return dealsSummary;
        }

        /**
         * Set dealsSummary
         **/
        public void setDealsSummary(PipelineDetailsAllOfDealsSummary dealsSummary) {
            this.dealsSummary = dealsSummary;
        }

        public GetStageResponseDataQueryParam dealsSummary(PipelineDetailsAllOfDealsSummary dealsSummary) {
            this.dealsSummary = dealsSummary;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetStageResponseDataQueryParam {\n");

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
            sb.append("    dealsSummary: ").append(toIndentedString(dealsSummary)).append("\n");
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
