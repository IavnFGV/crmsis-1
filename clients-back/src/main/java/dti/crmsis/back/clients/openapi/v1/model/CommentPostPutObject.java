package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class CommentPostPutObject  {

    /**
      * The content of the comment in HTML format. Subject to sanitization on the back-end.
     **/
    private String content;

    /**
    * The content of the comment in HTML format. Subject to sanitization on the back-end.
    * @return content
    **/
    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    /**
     * Set content
     **/
    public void setContent(String content) {
        this.content = content;
    }

    public CommentPostPutObject content(String content) {
        this.content = content;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommentPostPutObject {\n");

        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code CommentPostPutObject} object that
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

        CommentPostPutObject model = (CommentPostPutObject) obj;

        return java.util.Objects.equals(content, model.content);
    }

    /**
     * Returns a hash code for a {@code CommentPostPutObject}.
     *
     * @return a hash code value for a {@code CommentPostPutObject}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(content);
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
    public static class CommentPostPutObjectQueryParam  {

        @jakarta.ws.rs.QueryParam("content")
        private String content;

        /**
        * The content of the comment in HTML format. Subject to sanitization on the back-end.
        * @return content
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("content")
        public String getContent() {
            return content;
        }

        /**
         * Set content
         **/
        public void setContent(String content) {
            this.content = content;
        }

        public CommentPostPutObjectQueryParam content(String content) {
            this.content = content;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CommentPostPutObjectQueryParam {\n");

            sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
