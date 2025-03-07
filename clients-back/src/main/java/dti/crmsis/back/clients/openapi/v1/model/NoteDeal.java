package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The deal this note is attached to
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class NoteDeal  {

    /**
      * The title of the deal this note is attached to
     **/
    private String title;

    /**
    * The title of the deal this note is attached to
    * @return title
    **/
    @JsonProperty("title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTitle() {
        return title;
    }

    /**
     * Set title
     **/
    public void setTitle(String title) {
        this.title = title;
    }

    public NoteDeal title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NoteDeal {\n");

        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code NoteDeal} object that
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

        NoteDeal model = (NoteDeal) obj;

        return java.util.Objects.equals(title, model.title);
    }

    /**
     * Returns a hash code for a {@code NoteDeal}.
     *
     * @return a hash code value for a {@code NoteDeal}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(title);
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
      * The deal this note is attached to
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class NoteDealQueryParam  {

        /**
          * The deal this note is attached to
         **/
        @jakarta.ws.rs.QueryParam("title")
        private String title;

        /**
        * The title of the deal this note is attached to
        * @return title
        **/
        @JsonProperty("title")
        public String getTitle() {
            return title;
        }

        /**
         * Set title
         **/
        public void setTitle(String title) {
            this.title = title;
        }

        public NoteDealQueryParam title(String title) {
            this.title = title;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class NoteDealQueryParam {\n");

            sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
