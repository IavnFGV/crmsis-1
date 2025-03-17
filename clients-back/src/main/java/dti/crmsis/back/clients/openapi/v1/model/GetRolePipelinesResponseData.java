package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The response data
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetRolePipelinesResponseData  {

    /**
      * Either visible or hidden pipeline ids
     **/
    private List<BigDecimal> pipelineIds;
    /**
      * Whether visible or hidden pipeline ids were returned
     **/
    private Boolean visible;

    /**
    * Either visible or hidden pipeline ids
    * @return pipelineIds
    **/
    @JsonProperty("pipeline_ids")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<BigDecimal> getPipelineIds() {
        return pipelineIds;
    }

    /**
     * Set pipelineIds
     **/
    public void setPipelineIds(List<BigDecimal> pipelineIds) {
        this.pipelineIds = pipelineIds;
    }

    public GetRolePipelinesResponseData pipelineIds(List<BigDecimal> pipelineIds) {
        this.pipelineIds = pipelineIds;
        return this;
    }
    public GetRolePipelinesResponseData addPipelineIdsItem(BigDecimal pipelineIdsItem) {
        if (this.pipelineIds == null){
            pipelineIds = new ArrayList<>();
        }
        this.pipelineIds.add(pipelineIdsItem);
        return this;
    }

    /**
    * Whether visible or hidden pipeline ids were returned
    * @return visible
    **/
    @JsonProperty("visible")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getVisible() {
        return visible;
    }

    /**
     * Set visible
     **/
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public GetRolePipelinesResponseData visible(Boolean visible) {
        this.visible = visible;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetRolePipelinesResponseData {\n");

        sb.append("    pipelineIds: ").append(toIndentedString(pipelineIds)).append("\n");
        sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetRolePipelinesResponseData} object that
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

        GetRolePipelinesResponseData model = (GetRolePipelinesResponseData) obj;

        return java.util.Objects.equals(pipelineIds, model.pipelineIds) &&
        java.util.Objects.equals(visible, model.visible);
    }

    /**
     * Returns a hash code for a {@code GetRolePipelinesResponseData}.
     *
     * @return a hash code value for a {@code GetRolePipelinesResponseData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(pipelineIds,
        visible);
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
      * The response data
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetRolePipelinesResponseDataQueryParam  {

        /**
          * The response data
         **/
        @jakarta.ws.rs.QueryParam("pipelineIds")
        private List<BigDecimal> pipelineIds = null;
        /**
          * The response data
         **/
        @jakarta.ws.rs.QueryParam("visible")
        private Boolean visible;

        /**
        * Either visible or hidden pipeline ids
        * @return pipelineIds
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("pipeline_ids")
        public List<BigDecimal> getPipelineIds() {
            return pipelineIds;
        }

        /**
         * Set pipelineIds
         **/
        public void setPipelineIds(List<BigDecimal> pipelineIds) {
            this.pipelineIds = pipelineIds;
        }

        public GetRolePipelinesResponseDataQueryParam pipelineIds(List<BigDecimal> pipelineIds) {
            this.pipelineIds = pipelineIds;
            return this;
        }
        public GetRolePipelinesResponseDataQueryParam addPipelineIdsItem(BigDecimal pipelineIdsItem) {
            this.pipelineIds.add(pipelineIdsItem);
            return this;
        }

        /**
        * Whether visible or hidden pipeline ids were returned
        * @return visible
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("visible")
        public Boolean getVisible() {
            return visible;
        }

        /**
         * Set visible
         **/
        public void setVisible(Boolean visible) {
            this.visible = visible;
        }

        public GetRolePipelinesResponseDataQueryParam visible(Boolean visible) {
            this.visible = visible;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetRolePipelinesResponseDataQueryParam {\n");

            sb.append("    pipelineIds: ").append(toIndentedString(pipelineIds)).append("\n");
            sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
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
