package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The average time to win the deal
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class DealNonStrictWithDetailsAllOfAverageTimeToWon  {

    /**
      * Years
     **/
    private Integer y;
    /**
      * Months
     **/
    private Integer m;
    /**
      * Days
     **/
    private Integer d;
    /**
      * Hours
     **/
    private Integer h;
    /**
      * Minutes
     **/
    private Integer i;
    /**
      * Seconds
     **/
    private Integer s;
    /**
      * The total time in seconds
     **/
    private Integer totalSeconds;

    /**
    * Years
    * @return y
    **/
    @JsonProperty("y")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getY() {
        return y;
    }

    /**
     * Set y
     **/
    public void setY(Integer y) {
        this.y = y;
    }

    public DealNonStrictWithDetailsAllOfAverageTimeToWon y(Integer y) {
        this.y = y;
        return this;
    }

    /**
    * Months
    * @return m
    **/
    @JsonProperty("m")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getM() {
        return m;
    }

    /**
     * Set m
     **/
    public void setM(Integer m) {
        this.m = m;
    }

    public DealNonStrictWithDetailsAllOfAverageTimeToWon m(Integer m) {
        this.m = m;
        return this;
    }

    /**
    * Days
    * @return d
    **/
    @JsonProperty("d")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getD() {
        return d;
    }

    /**
     * Set d
     **/
    public void setD(Integer d) {
        this.d = d;
    }

    public DealNonStrictWithDetailsAllOfAverageTimeToWon d(Integer d) {
        this.d = d;
        return this;
    }

    /**
    * Hours
    * @return h
    **/
    @JsonProperty("h")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getH() {
        return h;
    }

    /**
     * Set h
     **/
    public void setH(Integer h) {
        this.h = h;
    }

    public DealNonStrictWithDetailsAllOfAverageTimeToWon h(Integer h) {
        this.h = h;
        return this;
    }

    /**
    * Minutes
    * @return i
    **/
    @JsonProperty("i")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getI() {
        return i;
    }

    /**
     * Set i
     **/
    public void setI(Integer i) {
        this.i = i;
    }

    public DealNonStrictWithDetailsAllOfAverageTimeToWon i(Integer i) {
        this.i = i;
        return this;
    }

    /**
    * Seconds
    * @return s
    **/
    @JsonProperty("s")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getS() {
        return s;
    }

    /**
     * Set s
     **/
    public void setS(Integer s) {
        this.s = s;
    }

    public DealNonStrictWithDetailsAllOfAverageTimeToWon s(Integer s) {
        this.s = s;
        return this;
    }

    /**
    * The total time in seconds
    * @return totalSeconds
    **/
    @JsonProperty("total_seconds")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getTotalSeconds() {
        return totalSeconds;
    }

    /**
     * Set totalSeconds
     **/
    public void setTotalSeconds(Integer totalSeconds) {
        this.totalSeconds = totalSeconds;
    }

    public DealNonStrictWithDetailsAllOfAverageTimeToWon totalSeconds(Integer totalSeconds) {
        this.totalSeconds = totalSeconds;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DealNonStrictWithDetailsAllOfAverageTimeToWon {\n");

        sb.append("    y: ").append(toIndentedString(y)).append("\n");
        sb.append("    m: ").append(toIndentedString(m)).append("\n");
        sb.append("    d: ").append(toIndentedString(d)).append("\n");
        sb.append("    h: ").append(toIndentedString(h)).append("\n");
        sb.append("    i: ").append(toIndentedString(i)).append("\n");
        sb.append("    s: ").append(toIndentedString(s)).append("\n");
        sb.append("    totalSeconds: ").append(toIndentedString(totalSeconds)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code DealNonStrictWithDetailsAllOfAverageTimeToWon} object that
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

        DealNonStrictWithDetailsAllOfAverageTimeToWon model = (DealNonStrictWithDetailsAllOfAverageTimeToWon) obj;

        return java.util.Objects.equals(y, model.y) &&
        java.util.Objects.equals(m, model.m) &&
        java.util.Objects.equals(d, model.d) &&
        java.util.Objects.equals(h, model.h) &&
        java.util.Objects.equals(i, model.i) &&
        java.util.Objects.equals(s, model.s) &&
        java.util.Objects.equals(totalSeconds, model.totalSeconds);
    }

    /**
     * Returns a hash code for a {@code DealNonStrictWithDetailsAllOfAverageTimeToWon}.
     *
     * @return a hash code value for a {@code DealNonStrictWithDetailsAllOfAverageTimeToWon}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(y,
        m,
        d,
        h,
        i,
        s,
        totalSeconds);
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
      * The average time to win the deal
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class DealNonStrictWithDetailsAllOfAverageTimeToWonQueryParam  {

        /**
          * The average time to win the deal
         **/
        @jakarta.ws.rs.QueryParam("y")
        private Integer y;
        /**
          * The average time to win the deal
         **/
        @jakarta.ws.rs.QueryParam("m")
        private Integer m;
        /**
          * The average time to win the deal
         **/
        @jakarta.ws.rs.QueryParam("d")
        private Integer d;
        /**
          * The average time to win the deal
         **/
        @jakarta.ws.rs.QueryParam("h")
        private Integer h;
        /**
          * The average time to win the deal
         **/
        @jakarta.ws.rs.QueryParam("i")
        private Integer i;
        /**
          * The average time to win the deal
         **/
        @jakarta.ws.rs.QueryParam("s")
        private Integer s;
        /**
          * The average time to win the deal
         **/
        @jakarta.ws.rs.QueryParam("totalSeconds")
        private Integer totalSeconds;

        /**
        * Years
        * @return y
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("y")
        public Integer getY() {
            return y;
        }

        /**
         * Set y
         **/
        public void setY(Integer y) {
            this.y = y;
        }

        public DealNonStrictWithDetailsAllOfAverageTimeToWonQueryParam y(Integer y) {
            this.y = y;
            return this;
        }

        /**
        * Months
        * @return m
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("m")
        public Integer getM() {
            return m;
        }

        /**
         * Set m
         **/
        public void setM(Integer m) {
            this.m = m;
        }

        public DealNonStrictWithDetailsAllOfAverageTimeToWonQueryParam m(Integer m) {
            this.m = m;
            return this;
        }

        /**
        * Days
        * @return d
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("d")
        public Integer getD() {
            return d;
        }

        /**
         * Set d
         **/
        public void setD(Integer d) {
            this.d = d;
        }

        public DealNonStrictWithDetailsAllOfAverageTimeToWonQueryParam d(Integer d) {
            this.d = d;
            return this;
        }

        /**
        * Hours
        * @return h
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("h")
        public Integer getH() {
            return h;
        }

        /**
         * Set h
         **/
        public void setH(Integer h) {
            this.h = h;
        }

        public DealNonStrictWithDetailsAllOfAverageTimeToWonQueryParam h(Integer h) {
            this.h = h;
            return this;
        }

        /**
        * Minutes
        * @return i
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("i")
        public Integer getI() {
            return i;
        }

        /**
         * Set i
         **/
        public void setI(Integer i) {
            this.i = i;
        }

        public DealNonStrictWithDetailsAllOfAverageTimeToWonQueryParam i(Integer i) {
            this.i = i;
            return this;
        }

        /**
        * Seconds
        * @return s
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("s")
        public Integer getS() {
            return s;
        }

        /**
         * Set s
         **/
        public void setS(Integer s) {
            this.s = s;
        }

        public DealNonStrictWithDetailsAllOfAverageTimeToWonQueryParam s(Integer s) {
            this.s = s;
            return this;
        }

        /**
        * The total time in seconds
        * @return totalSeconds
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("total_seconds")
        public Integer getTotalSeconds() {
            return totalSeconds;
        }

        /**
         * Set totalSeconds
         **/
        public void setTotalSeconds(Integer totalSeconds) {
            this.totalSeconds = totalSeconds;
        }

        public DealNonStrictWithDetailsAllOfAverageTimeToWonQueryParam totalSeconds(Integer totalSeconds) {
            this.totalSeconds = totalSeconds;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DealNonStrictWithDetailsAllOfAverageTimeToWonQueryParam {\n");

            sb.append("    y: ").append(toIndentedString(y)).append("\n");
            sb.append("    m: ").append(toIndentedString(m)).append("\n");
            sb.append("    d: ").append(toIndentedString(d)).append("\n");
            sb.append("    h: ").append(toIndentedString(h)).append("\n");
            sb.append("    i: ").append(toIndentedString(i)).append("\n");
            sb.append("    s: ").append(toIndentedString(s)).append("\n");
            sb.append("    totalSeconds: ").append(toIndentedString(totalSeconds)).append("\n");
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
