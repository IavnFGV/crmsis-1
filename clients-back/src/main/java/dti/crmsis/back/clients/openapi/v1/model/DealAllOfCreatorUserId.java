package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The creator of the deal
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class DealAllOfCreatorUserId  {

    /**
      * The ID of the deal creator
     **/
    private Integer id;
    /**
      * The name of the deal creator
     **/
    private String name;
    /**
      * The email of the deal creator
     **/
    private String email;
    /**
      * If the creator has a picture or not
     **/
    private Boolean hasPic;
    /**
      * The creator picture hash
     **/
    private String picHash;
    /**
      * Whether the creator is active or not
     **/
    private Boolean activeFlag;
    /**
      * The ID of the deal creator
     **/
    private Integer value;

    /**
    * The ID of the deal creator
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

    public DealAllOfCreatorUserId id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The name of the deal creator
    * @return name
    **/
    @JsonProperty("name")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public DealAllOfCreatorUserId name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The email of the deal creator
    * @return email
    **/
    @JsonProperty("email")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getEmail() {
        return email;
    }

    /**
     * Set email
     **/
    public void setEmail(String email) {
        this.email = email;
    }

    public DealAllOfCreatorUserId email(String email) {
        this.email = email;
        return this;
    }

    /**
    * If the creator has a picture or not
    * @return hasPic
    **/
    @JsonProperty("has_pic")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getHasPic() {
        return hasPic;
    }

    /**
     * Set hasPic
     **/
    public void setHasPic(Boolean hasPic) {
        this.hasPic = hasPic;
    }

    public DealAllOfCreatorUserId hasPic(Boolean hasPic) {
        this.hasPic = hasPic;
        return this;
    }

    /**
    * The creator picture hash
    * @return picHash
    **/
    @JsonProperty("pic_hash")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPicHash() {
        return picHash;
    }

    /**
     * Set picHash
     **/
    public void setPicHash(String picHash) {
        this.picHash = picHash;
    }

    public DealAllOfCreatorUserId picHash(String picHash) {
        this.picHash = picHash;
        return this;
    }

    /**
    * Whether the creator is active or not
    * @return activeFlag
    **/
    @JsonProperty("active_flag")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getActiveFlag() {
        return activeFlag;
    }

    /**
     * Set activeFlag
     **/
    public void setActiveFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
    }

    public DealAllOfCreatorUserId activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * The ID of the deal creator
    * @return value
    **/
    @JsonProperty("value")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getValue() {
        return value;
    }

    /**
     * Set value
     **/
    public void setValue(Integer value) {
        this.value = value;
    }

    public DealAllOfCreatorUserId value(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DealAllOfCreatorUserId {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    hasPic: ").append(toIndentedString(hasPic)).append("\n");
        sb.append("    picHash: ").append(toIndentedString(picHash)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code DealAllOfCreatorUserId} object that
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

        DealAllOfCreatorUserId model = (DealAllOfCreatorUserId) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(email, model.email) &&
        java.util.Objects.equals(hasPic, model.hasPic) &&
        java.util.Objects.equals(picHash, model.picHash) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(value, model.value);
    }

    /**
     * Returns a hash code for a {@code DealAllOfCreatorUserId}.
     *
     * @return a hash code value for a {@code DealAllOfCreatorUserId}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        name,
        email,
        hasPic,
        picHash,
        activeFlag,
        value);
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
      * The creator of the deal
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class DealAllOfCreatorUserIdQueryParam  {

        /**
          * The creator of the deal
         **/
        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        /**
          * The creator of the deal
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * The creator of the deal
         **/
        @jakarta.ws.rs.QueryParam("email")
        private String email;
        /**
          * The creator of the deal
         **/
        @jakarta.ws.rs.QueryParam("hasPic")
        private Boolean hasPic;
        /**
          * The creator of the deal
         **/
        @jakarta.ws.rs.QueryParam("picHash")
        private String picHash;
        /**
          * The creator of the deal
         **/
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        /**
          * The creator of the deal
         **/
        @jakarta.ws.rs.QueryParam("value")
        private Integer value;

        /**
        * The ID of the deal creator
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

        public DealAllOfCreatorUserIdQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The name of the deal creator
        * @return name
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public DealAllOfCreatorUserIdQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The email of the deal creator
        * @return email
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("email")
        public String getEmail() {
            return email;
        }

        /**
         * Set email
         **/
        public void setEmail(String email) {
            this.email = email;
        }

        public DealAllOfCreatorUserIdQueryParam email(String email) {
            this.email = email;
            return this;
        }

        /**
        * If the creator has a picture or not
        * @return hasPic
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("has_pic")
        public Boolean getHasPic() {
            return hasPic;
        }

        /**
         * Set hasPic
         **/
        public void setHasPic(Boolean hasPic) {
            this.hasPic = hasPic;
        }

        public DealAllOfCreatorUserIdQueryParam hasPic(Boolean hasPic) {
            this.hasPic = hasPic;
            return this;
        }

        /**
        * The creator picture hash
        * @return picHash
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("pic_hash")
        public String getPicHash() {
            return picHash;
        }

        /**
         * Set picHash
         **/
        public void setPicHash(String picHash) {
            this.picHash = picHash;
        }

        public DealAllOfCreatorUserIdQueryParam picHash(String picHash) {
            this.picHash = picHash;
            return this;
        }

        /**
        * Whether the creator is active or not
        * @return activeFlag
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("active_flag")
        public Boolean getActiveFlag() {
            return activeFlag;
        }

        /**
         * Set activeFlag
         **/
        public void setActiveFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
        }

        public DealAllOfCreatorUserIdQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * The ID of the deal creator
        * @return value
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        public Integer getValue() {
            return value;
        }

        /**
         * Set value
         **/
        public void setValue(Integer value) {
            this.value = value;
        }

        public DealAllOfCreatorUserIdQueryParam value(Integer value) {
            this.value = value;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DealAllOfCreatorUserIdQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    email: ").append(toIndentedString(email)).append("\n");
            sb.append("    hasPic: ").append(toIndentedString(hasPic)).append("\n");
            sb.append("    picHash: ").append(toIndentedString(picHash)).append("\n");
            sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
            sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
