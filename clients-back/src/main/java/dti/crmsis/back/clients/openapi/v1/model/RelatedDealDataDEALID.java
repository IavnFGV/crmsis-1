package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The ID of the deal which is associated with the item
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class RelatedDealDataDEALID  {

    /**
      * The ID of the deal associated with the item
     **/
    private Integer id;
    /**
      * The title of the deal associated with the item
     **/
    private String title;
    /**
      * The status of the deal associated with the item
     **/
    private String status;
    /**
      * The value of the deal that is associated with the item
     **/
    private BigDecimal value;
    /**
      * The currency of the deal value
     **/
    private String currency;
    /**
      * The ID of the stage the deal is currently at
     **/
    private Integer stageId;
    /**
      * The ID of the pipeline the deal is in
     **/
    private Integer pipelineId;

    /**
    * The ID of the deal associated with the item
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

    public RelatedDealDataDEALID id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The title of the deal associated with the item
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

    public RelatedDealDataDEALID title(String title) {
        this.title = title;
        return this;
    }

    /**
    * The status of the deal associated with the item
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

    public RelatedDealDataDEALID status(String status) {
        this.status = status;
        return this;
    }

    /**
    * The value of the deal that is associated with the item
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

    public RelatedDealDataDEALID value(BigDecimal value) {
        this.value = value;
        return this;
    }

    /**
    * The currency of the deal value
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

    public RelatedDealDataDEALID currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
    * The ID of the stage the deal is currently at
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

    public RelatedDealDataDEALID stageId(Integer stageId) {
        this.stageId = stageId;
        return this;
    }

    /**
    * The ID of the pipeline the deal is in
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

    public RelatedDealDataDEALID pipelineId(Integer pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelatedDealDataDEALID {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code RelatedDealDataDEALID} object that
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

        RelatedDealDataDEALID model = (RelatedDealDataDEALID) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(title, model.title) &&
        java.util.Objects.equals(status, model.status) &&
        java.util.Objects.equals(value, model.value) &&
        java.util.Objects.equals(currency, model.currency) &&
        java.util.Objects.equals(stageId, model.stageId) &&
        java.util.Objects.equals(pipelineId, model.pipelineId);
    }

    /**
     * Returns a hash code for a {@code RelatedDealDataDEALID}.
     *
     * @return a hash code value for a {@code RelatedDealDataDEALID}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        title,
        status,
        value,
        currency,
        stageId,
        pipelineId);
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
      * The ID of the deal which is associated with the item
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class RelatedDealDataDEALIDQueryParam  {

        /**
          * The ID of the deal which is associated with the item
         **/
        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        /**
          * The ID of the deal which is associated with the item
         **/
        @jakarta.ws.rs.QueryParam("title")
        private String title;
        /**
          * The ID of the deal which is associated with the item
         **/
        @jakarta.ws.rs.QueryParam("status")
        private String status;
        /**
          * The ID of the deal which is associated with the item
         **/
        @jakarta.ws.rs.QueryParam("value")
        private BigDecimal value;
        /**
          * The ID of the deal which is associated with the item
         **/
        @jakarta.ws.rs.QueryParam("currency")
        private String currency;
        /**
          * The ID of the deal which is associated with the item
         **/
        @jakarta.ws.rs.QueryParam("stageId")
        private Integer stageId;
        /**
          * The ID of the deal which is associated with the item
         **/
        @jakarta.ws.rs.QueryParam("pipelineId")
        private Integer pipelineId;

        /**
        * The ID of the deal associated with the item
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

        public RelatedDealDataDEALIDQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The title of the deal associated with the item
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

        public RelatedDealDataDEALIDQueryParam title(String title) {
            this.title = title;
            return this;
        }

        /**
        * The status of the deal associated with the item
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

        public RelatedDealDataDEALIDQueryParam status(String status) {
            this.status = status;
            return this;
        }

        /**
        * The value of the deal that is associated with the item
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

        public RelatedDealDataDEALIDQueryParam value(BigDecimal value) {
            this.value = value;
            return this;
        }

        /**
        * The currency of the deal value
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

        public RelatedDealDataDEALIDQueryParam currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
        * The ID of the stage the deal is currently at
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

        public RelatedDealDataDEALIDQueryParam stageId(Integer stageId) {
            this.stageId = stageId;
            return this;
        }

        /**
        * The ID of the pipeline the deal is in
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

        public RelatedDealDataDEALIDQueryParam pipelineId(Integer pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class RelatedDealDataDEALIDQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    title: ").append(toIndentedString(title)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    value: ").append(toIndentedString(value)).append("\n");
            sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
            sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
            sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
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
