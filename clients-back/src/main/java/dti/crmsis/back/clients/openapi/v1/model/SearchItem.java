package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchItem  {

    /**
      * Search result relevancy
     **/
    private BigDecimal resultScore;
    /**
      * Item
     **/
    private Object item;

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

    public SearchItem resultScore(BigDecimal resultScore) {
        this.resultScore = resultScore;
        return this;
    }

    /**
    * Item
    * @return item
    **/
    @JsonProperty("item")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getItem() {
        return item;
    }

    /**
     * Set item
     **/
    public void setItem(Object item) {
        this.item = item;
    }

    public SearchItem item(Object item) {
        this.item = item;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchItem {\n");

        sb.append("    resultScore: ").append(toIndentedString(resultScore)).append("\n");
        sb.append("    item: ").append(toIndentedString(item)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code SearchItem} object that
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

        SearchItem model = (SearchItem) obj;

        return java.util.Objects.equals(resultScore, model.resultScore) &&
        java.util.Objects.equals(item, model.item);
    }

    /**
     * Returns a hash code for a {@code SearchItem}.
     *
     * @return a hash code value for a {@code SearchItem}.
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
    public static class SearchItemQueryParam  {

        @jakarta.ws.rs.QueryParam("resultScore")
        private BigDecimal resultScore;
        @jakarta.ws.rs.QueryParam("item")
        private Object item;

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

        public SearchItemQueryParam resultScore(BigDecimal resultScore) {
            this.resultScore = resultScore;
            return this;
        }

        /**
        * Item
        * @return item
        **/
        @JsonProperty("item")
        public Object getItem() {
            return item;
        }

        /**
         * Set item
         **/
        public void setItem(Object item) {
            this.item = item;
        }

        public SearchItemQueryParam item(Object item) {
            this.item = item;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SearchItemQueryParam {\n");

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
