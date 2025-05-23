package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GetOrganizationSearchResponseAllOfDataItemsInnerItem;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetOrganizationSearchResponseAllOfDataItemsInner  {

    /**
      * Search result relevancy
     **/
    private BigDecimal resultScore;
    private GetOrganizationSearchResponseAllOfDataItemsInnerItem item;

    /**
    * Search result relevancy
    * @return resultScore
    **/
    @JsonProperty("result_score")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getResultScore() {
        return resultScore;
    }

    /**
     * Set resultScore
     **/
    public void setResultScore(BigDecimal resultScore) {
        this.resultScore = resultScore;
    }

    public GetOrganizationSearchResponseAllOfDataItemsInner resultScore(BigDecimal resultScore) {
        this.resultScore = resultScore;
        return this;
    }

    /**
    * Get item
    * @return item
    **/
    @JsonProperty("item")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public GetOrganizationSearchResponseAllOfDataItemsInnerItem getItem() {
        return item;
    }

    /**
     * Set item
     **/
    public void setItem(GetOrganizationSearchResponseAllOfDataItemsInnerItem item) {
        this.item = item;
    }

    public GetOrganizationSearchResponseAllOfDataItemsInner item(GetOrganizationSearchResponseAllOfDataItemsInnerItem item) {
        this.item = item;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOrganizationSearchResponseAllOfDataItemsInner {\n");

        sb.append("    resultScore: ").append(toIndentedString(resultScore)).append("\n");
        sb.append("    item: ").append(toIndentedString(item)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetOrganizationSearchResponseAllOfDataItemsInner} object that
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

        GetOrganizationSearchResponseAllOfDataItemsInner model = (GetOrganizationSearchResponseAllOfDataItemsInner) obj;

        return java.util.Objects.equals(resultScore, model.resultScore) &&
        java.util.Objects.equals(item, model.item);
    }

    /**
     * Returns a hash code for a {@code GetOrganizationSearchResponseAllOfDataItemsInner}.
     *
     * @return a hash code value for a {@code GetOrganizationSearchResponseAllOfDataItemsInner}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(resultScore,
        item);
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
    public static class GetOrganizationSearchResponseAllOfDataItemsInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("resultScore")
        private BigDecimal resultScore;
        @jakarta.ws.rs.QueryParam("item")
        private GetOrganizationSearchResponseAllOfDataItemsInnerItem item;

        /**
        * Search result relevancy
        * @return resultScore
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("result_score")
        public BigDecimal getResultScore() {
            return resultScore;
        }

        /**
         * Set resultScore
         **/
        public void setResultScore(BigDecimal resultScore) {
            this.resultScore = resultScore;
        }

        public GetOrganizationSearchResponseAllOfDataItemsInnerQueryParam resultScore(BigDecimal resultScore) {
            this.resultScore = resultScore;
            return this;
        }

        /**
        * Get item
        * @return item
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("item")
        public GetOrganizationSearchResponseAllOfDataItemsInnerItem getItem() {
            return item;
        }

        /**
         * Set item
         **/
        public void setItem(GetOrganizationSearchResponseAllOfDataItemsInnerItem item) {
            this.item = item;
        }

        public GetOrganizationSearchResponseAllOfDataItemsInnerQueryParam item(GetOrganizationSearchResponseAllOfDataItemsInnerItem item) {
            this.item = item;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetOrganizationSearchResponseAllOfDataItemsInnerQueryParam {\n");

            sb.append("    resultScore: ").append(toIndentedString(resultScore)).append("\n");
            sb.append("    item: ").append(toIndentedString(item)).append("\n");
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
