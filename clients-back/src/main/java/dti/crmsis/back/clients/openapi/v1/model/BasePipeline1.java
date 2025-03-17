package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The pipeline object
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class BasePipeline1  {

    /**
      * The ID of the pipeline
     **/
    private Integer id;
    /**
      * The name of the pipeline
     **/
    private String name;
    /**
      * The pipeline title displayed in the URL
     **/
    private String urlTitle;
    /**
      * Defines the order of pipelines. First order (`order_nr=0`) is the default pipeline.
     **/
    private Integer orderNr;
    /**
      * Whether this pipeline will be made inactive (hidden) or active
     **/
    private Boolean active;
    /**
      * Whether deal probability is disabled or enabled for this pipeline
     **/
    private Boolean dealProbability;
    /**
      * The pipeline creation time. Format: YYYY-MM-DD HH:MM:SS.
     **/
    private String addTime;
    /**
      * The pipeline update time. Format: YYYY-MM-DD HH:MM:SS.
     **/
    private String updateTime;

    /**
    * The ID of the pipeline
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

    public BasePipeline1 id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The name of the pipeline
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

    public BasePipeline1 name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The pipeline title displayed in the URL
    * @return urlTitle
    **/
    @JsonProperty("url_title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUrlTitle() {
        return urlTitle;
    }

    /**
     * Set urlTitle
     **/
    public void setUrlTitle(String urlTitle) {
        this.urlTitle = urlTitle;
    }

    public BasePipeline1 urlTitle(String urlTitle) {
        this.urlTitle = urlTitle;
        return this;
    }

    /**
    * Defines the order of pipelines. First order (`order_nr=0`) is the default pipeline.
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

    public BasePipeline1 orderNr(Integer orderNr) {
        this.orderNr = orderNr;
        return this;
    }

    /**
    * Whether this pipeline will be made inactive (hidden) or active
    * @return active
    **/
    @JsonProperty("active")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getActive() {
        return active;
    }

    /**
     * Set active
     **/
    public void setActive(Boolean active) {
        this.active = active;
    }

    public BasePipeline1 active(Boolean active) {
        this.active = active;
        return this;
    }

    /**
    * Whether deal probability is disabled or enabled for this pipeline
    * @return dealProbability
    **/
    @JsonProperty("deal_probability")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDealProbability() {
        return dealProbability;
    }

    /**
     * Set dealProbability
     **/
    public void setDealProbability(Boolean dealProbability) {
        this.dealProbability = dealProbability;
    }

    public BasePipeline1 dealProbability(Boolean dealProbability) {
        this.dealProbability = dealProbability;
        return this;
    }

    /**
    * The pipeline creation time. Format: YYYY-MM-DD HH:MM:SS.
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

    public BasePipeline1 addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The pipeline update time. Format: YYYY-MM-DD HH:MM:SS.
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

    public BasePipeline1 updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BasePipeline1 {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    urlTitle: ").append(toIndentedString(urlTitle)).append("\n");
        sb.append("    orderNr: ").append(toIndentedString(orderNr)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    dealProbability: ").append(toIndentedString(dealProbability)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code BasePipeline1} object that
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

        BasePipeline1 model = (BasePipeline1) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(urlTitle, model.urlTitle) &&
        java.util.Objects.equals(orderNr, model.orderNr) &&
        java.util.Objects.equals(active, model.active) &&
        java.util.Objects.equals(dealProbability, model.dealProbability) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime);
    }

    /**
     * Returns a hash code for a {@code BasePipeline1}.
     *
     * @return a hash code value for a {@code BasePipeline1}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        name,
        urlTitle,
        orderNr,
        active,
        dealProbability,
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
      * The pipeline object
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class BasePipeline1QueryParam  {

        /**
          * The pipeline object
         **/
        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        /**
          * The pipeline object
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * The pipeline object
         **/
        @jakarta.ws.rs.QueryParam("urlTitle")
        private String urlTitle;
        /**
          * The pipeline object
         **/
        @jakarta.ws.rs.QueryParam("orderNr")
        private Integer orderNr;
        /**
          * The pipeline object
         **/
        @jakarta.ws.rs.QueryParam("active")
        private Boolean active;
        /**
          * The pipeline object
         **/
        @jakarta.ws.rs.QueryParam("dealProbability")
        private Boolean dealProbability;
        /**
          * The pipeline object
         **/
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        /**
          * The pipeline object
         **/
        @jakarta.ws.rs.QueryParam("updateTime")
        private String updateTime;

        /**
        * The ID of the pipeline
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

        public BasePipeline1QueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The name of the pipeline
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

        public BasePipeline1QueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The pipeline title displayed in the URL
        * @return urlTitle
        **/
        @JsonProperty("url_title")
        public String getUrlTitle() {
            return urlTitle;
        }

        /**
         * Set urlTitle
         **/
        public void setUrlTitle(String urlTitle) {
            this.urlTitle = urlTitle;
        }

        public BasePipeline1QueryParam urlTitle(String urlTitle) {
            this.urlTitle = urlTitle;
            return this;
        }

        /**
        * Defines the order of pipelines. First order (`order_nr=0`) is the default pipeline.
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

        public BasePipeline1QueryParam orderNr(Integer orderNr) {
            this.orderNr = orderNr;
            return this;
        }

        /**
        * Whether this pipeline will be made inactive (hidden) or active
        * @return active
        **/
        @JsonProperty("active")
        public Boolean getActive() {
            return active;
        }

        /**
         * Set active
         **/
        public void setActive(Boolean active) {
            this.active = active;
        }

        public BasePipeline1QueryParam active(Boolean active) {
            this.active = active;
            return this;
        }

        /**
        * Whether deal probability is disabled or enabled for this pipeline
        * @return dealProbability
        **/
        @JsonProperty("deal_probability")
        public Boolean getDealProbability() {
            return dealProbability;
        }

        /**
         * Set dealProbability
         **/
        public void setDealProbability(Boolean dealProbability) {
            this.dealProbability = dealProbability;
        }

        public BasePipeline1QueryParam dealProbability(Boolean dealProbability) {
            this.dealProbability = dealProbability;
            return this;
        }

        /**
        * The pipeline creation time. Format: YYYY-MM-DD HH:MM:SS.
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

        public BasePipeline1QueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The pipeline update time. Format: YYYY-MM-DD HH:MM:SS.
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

        public BasePipeline1QueryParam updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class BasePipeline1QueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    urlTitle: ").append(toIndentedString(urlTitle)).append("\n");
            sb.append("    orderNr: ").append(toIndentedString(orderNr)).append("\n");
            sb.append("    active: ").append(toIndentedString(active)).append("\n");
            sb.append("    dealProbability: ").append(toIndentedString(dealProbability)).append("\n");
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
