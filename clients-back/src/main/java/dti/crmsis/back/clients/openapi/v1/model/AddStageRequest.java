package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddStageRequest  {

    /**
      * The name of the stage
     **/
    private String name;
    /**
      * The ID of the pipeline to add stage to
     **/
    private Integer pipelineId;
    /**
      * The success probability percentage of the deal. Used/shown when deal weighted values are used.
     **/
    private Integer dealProbability;
    /**
      * Whether deals in this stage can become rotten
     **/
    private Boolean rottenFlag;
    /**
      * The number of days the deals not updated in this stage would become rotten. Applies only if the `rotten_flag` is set.
     **/
    private Integer rottenDays;

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

    public AddStageRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The ID of the pipeline to add stage to
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

    public AddStageRequest pipelineId(Integer pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
    * The success probability percentage of the deal. Used/shown when deal weighted values are used.
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

    public AddStageRequest dealProbability(Integer dealProbability) {
        this.dealProbability = dealProbability;
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

    public AddStageRequest rottenFlag(Boolean rottenFlag) {
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

    public AddStageRequest rottenDays(Integer rottenDays) {
        this.rottenDays = rottenDays;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddStageRequest {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    dealProbability: ").append(toIndentedString(dealProbability)).append("\n");
        sb.append("    rottenFlag: ").append(toIndentedString(rottenFlag)).append("\n");
        sb.append("    rottenDays: ").append(toIndentedString(rottenDays)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddStageRequest} object that
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

        AddStageRequest model = (AddStageRequest) obj;

        return java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(pipelineId, model.pipelineId) &&
        java.util.Objects.equals(dealProbability, model.dealProbability) &&
        java.util.Objects.equals(rottenFlag, model.rottenFlag) &&
        java.util.Objects.equals(rottenDays, model.rottenDays);
    }

    /**
     * Returns a hash code for a {@code AddStageRequest}.
     *
     * @return a hash code value for a {@code AddStageRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,
        pipelineId,
        dealProbability,
        rottenFlag,
        rottenDays);
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
    public static class AddStageRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("pipelineId")
        private Integer pipelineId;
        @jakarta.ws.rs.QueryParam("dealProbability")
        private Integer dealProbability;
        @jakarta.ws.rs.QueryParam("rottenFlag")
        private Boolean rottenFlag;
        @jakarta.ws.rs.QueryParam("rottenDays")
        private Integer rottenDays;

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

        public AddStageRequestQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The ID of the pipeline to add stage to
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

        public AddStageRequestQueryParam pipelineId(Integer pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }

        /**
        * The success probability percentage of the deal. Used/shown when deal weighted values are used.
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

        public AddStageRequestQueryParam dealProbability(Integer dealProbability) {
            this.dealProbability = dealProbability;
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

        public AddStageRequestQueryParam rottenFlag(Boolean rottenFlag) {
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

        public AddStageRequestQueryParam rottenDays(Integer rottenDays) {
            this.rottenDays = rottenDays;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddStageRequestQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
            sb.append("    dealProbability: ").append(toIndentedString(dealProbability)).append("\n");
            sb.append("    rottenFlag: ").append(toIndentedString(rottenFlag)).append("\n");
            sb.append("    rottenDays: ").append(toIndentedString(rottenDays)).append("\n");
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
