package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The user who created the note
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class NoteUser  {

    /**
      * The email of the note creator
     **/
    private String email;
    /**
      * The URL of the note creator avatar picture
     **/
    private String iconUrl;
    /**
      * Whether the note is created by you or not
     **/
    private Boolean isYou;
    /**
      * The name of the note creator
     **/
    private String name;

    /**
    * The email of the note creator
    * @return email
    **/
    @JsonProperty("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmail() {
        return email;
    }

    /**
     * Set email
     **/
    public void setEmail(String email) {
        this.email = email;
    }

    public NoteUser email(String email) {
        this.email = email;
        return this;
    }

    /**
    * The URL of the note creator avatar picture
    * @return iconUrl
    **/
    @JsonProperty("icon_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * Set iconUrl
     **/
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public NoteUser iconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    /**
    * Whether the note is created by you or not
    * @return isYou
    **/
    @JsonProperty("is_you")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsYou() {
        return isYou;
    }

    /**
     * Set isYou
     **/
    public void setIsYou(Boolean isYou) {
        this.isYou = isYou;
    }

    public NoteUser isYou(Boolean isYou) {
        this.isYou = isYou;
        return this;
    }

    /**
    * The name of the note creator
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

    public NoteUser name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NoteUser {\n");

        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
        sb.append("    isYou: ").append(toIndentedString(isYou)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code NoteUser} object that
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

        NoteUser model = (NoteUser) obj;

        return java.util.Objects.equals(email, model.email) &&
        java.util.Objects.equals(iconUrl, model.iconUrl) &&
        java.util.Objects.equals(isYou, model.isYou) &&
        java.util.Objects.equals(name, model.name);
    }

    /**
     * Returns a hash code for a {@code NoteUser}.
     *
     * @return a hash code value for a {@code NoteUser}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(email,
        iconUrl,
        isYou,
        name);
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
      * The user who created the note
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class NoteUserQueryParam  {

        /**
          * The user who created the note
         **/
        @jakarta.ws.rs.QueryParam("email")
        private String email;
        /**
          * The user who created the note
         **/
        @jakarta.ws.rs.QueryParam("iconUrl")
        private String iconUrl;
        /**
          * The user who created the note
         **/
        @jakarta.ws.rs.QueryParam("isYou")
        private Boolean isYou;
        /**
          * The user who created the note
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;

        /**
        * The email of the note creator
        * @return email
        **/
        @JsonProperty("email")
        public String getEmail() {
            return email;
        }

        /**
         * Set email
         **/
        public void setEmail(String email) {
            this.email = email;
        }

        public NoteUserQueryParam email(String email) {
            this.email = email;
            return this;
        }

        /**
        * The URL of the note creator avatar picture
        * @return iconUrl
        **/
        @JsonProperty("icon_url")
        public String getIconUrl() {
            return iconUrl;
        }

        /**
         * Set iconUrl
         **/
        public void setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
        }

        public NoteUserQueryParam iconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }

        /**
        * Whether the note is created by you or not
        * @return isYou
        **/
        @JsonProperty("is_you")
        public Boolean getIsYou() {
            return isYou;
        }

        /**
         * Set isYou
         **/
        public void setIsYou(Boolean isYou) {
            this.isYou = isYou;
        }

        public NoteUserQueryParam isYou(Boolean isYou) {
            this.isYou = isYou;
            return this;
        }

        /**
        * The name of the note creator
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

        public NoteUserQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class NoteUserQueryParam {\n");

            sb.append("    email: ").append(toIndentedString(email)).append("\n");
            sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
            sb.append("    isYou: ").append(toIndentedString(isYou)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
