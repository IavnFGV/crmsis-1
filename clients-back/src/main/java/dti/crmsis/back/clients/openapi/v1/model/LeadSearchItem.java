package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.LeadSearchItemItem;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LeadSearchItem  {

    /**
      * Search result relevancy
     **/
    private BigDecimal resultScore;
    private LeadSearchItemItem item;

    /**
    * Search result relevancy
    * @return resultScore
    **/
    @JsonProperty("result_score")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getResultScore() {
        return resultScore;
    }

    /**
     * Set resultScore
     **/
    public void setResultScore(BigDecimal resultScore) {
        this.resultScore = resultScore;
    }

    public LeadSearchItem resultScore(BigDecimal resultScore) {
        this.resultScore = resultScore;
        return this;
    }

    /**
    * Get item
    * @return item
    **/
    @JsonProperty("item")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LeadSearchItemItem getItem() {
        return item;
    }

    /**
     * Set item
     **/
    public void setItem(LeadSearchItemItem item) {
        this.item = item;
    }

    public LeadSearchItem item(LeadSearchItemItem item) {
        this.item = item;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LeadSearchItem {\n");

        sb.append("    resultScore: ").append(toIndentedString(resultScore)).append("\n");
        sb.append("    item: ").append(toIndentedString(item)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code LeadSearchItem} object that
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

        LeadSearchItem model = (LeadSearchItem) obj;

        return java.util.Objects.equals(resultScore, model.resultScore) &&
        java.util.Objects.equals(item, model.item);
    }

    /**
     * Returns a hash code for a {@code LeadSearchItem}.
     *
     * @return a hash code value for a {@code LeadSearchItem}.
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class LeadSearchItemQueryParam  {

        @jakarta.ws.rs.QueryParam("resultScore")
        private BigDecimal resultScore;
        @jakarta.ws.rs.QueryParam("item")
        private LeadSearchItemItem item;

        /**
        * Search result relevancy
        * @return resultScore
        **/
        @JsonProperty("result_score")
        public BigDecimal getResultScore() {
            return resultScore;
        }

        /**
         * Set resultScore
         **/
        public void setResultScore(BigDecimal resultScore) {
            this.resultScore = resultScore;
        }

        public LeadSearchItemQueryParam resultScore(BigDecimal resultScore) {
            this.resultScore = resultScore;
            return this;
        }

        /**
        * Get item
        * @return item
        **/
        @JsonProperty("item")
        public LeadSearchItemItem getItem() {
            return item;
        }

        /**
         * Set item
         **/
        public void setItem(LeadSearchItemItem item) {
            this.item = item;
        }

        public LeadSearchItemQueryParam item(LeadSearchItemItem item) {
            this.item = item;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LeadSearchItemQueryParam {\n");

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
