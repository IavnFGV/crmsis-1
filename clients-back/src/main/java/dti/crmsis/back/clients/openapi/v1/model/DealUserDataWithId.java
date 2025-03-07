package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DealUserDataWithId  {

    /**
      * The ID of the user
     **/
    private Integer id;
    /**
      * The name of the user
     **/
    private String name;
    /**
      * The email of the user
     **/
    private String email;
    /**
      * If the user has a picture or not
     **/
    private Boolean hasPic;
    /**
      * The user picture hash
     **/
    private String picHash;
    /**
      * Whether the user is active or not
     **/
    private Boolean activeFlag;
    /**
      * The ID of the user
     **/
    private Integer value;

    /**
    * The ID of the user
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

    public DealUserDataWithId id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The name of the user
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

    public DealUserDataWithId name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The email of the user
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

    public DealUserDataWithId email(String email) {
        this.email = email;
        return this;
    }

    /**
    * If the user has a picture or not
    * @return hasPic
    **/
    @JsonProperty("has_pic")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getHasPic() {
        return hasPic;
    }

    /**
     * Set hasPic
     **/
    public void setHasPic(Boolean hasPic) {
        this.hasPic = hasPic;
    }

    public DealUserDataWithId hasPic(Boolean hasPic) {
        this.hasPic = hasPic;
        return this;
    }

    /**
    * The user picture hash
    * @return picHash
    **/
    @JsonProperty("pic_hash")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPicHash() {
        return picHash;
    }

    /**
     * Set picHash
     **/
    public void setPicHash(String picHash) {
        this.picHash = picHash;
    }

    public DealUserDataWithId picHash(String picHash) {
        this.picHash = picHash;
        return this;
    }

    /**
    * Whether the user is active or not
    * @return activeFlag
    **/
    @JsonProperty("active_flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getActiveFlag() {
        return activeFlag;
    }

    /**
     * Set activeFlag
     **/
    public void setActiveFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
    }

    public DealUserDataWithId activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
    * The ID of the user
    * @return value
    **/
    @JsonProperty("value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getValue() {
        return value;
    }

    /**
     * Set value
     **/
    public void setValue(Integer value) {
        this.value = value;
    }

    public DealUserDataWithId value(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DealUserDataWithId {\n");

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
     * {@code null} and is a {@code DealUserDataWithId} object that
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

        DealUserDataWithId model = (DealUserDataWithId) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(email, model.email) &&
        java.util.Objects.equals(hasPic, model.hasPic) &&
        java.util.Objects.equals(picHash, model.picHash) &&
        java.util.Objects.equals(activeFlag, model.activeFlag) &&
        java.util.Objects.equals(value, model.value);
    }

    /**
     * Returns a hash code for a {@code DealUserDataWithId}.
     *
     * @return a hash code value for a {@code DealUserDataWithId}.
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DealUserDataWithIdQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("email")
        private String email;
        @jakarta.ws.rs.QueryParam("hasPic")
        private Boolean hasPic;
        @jakarta.ws.rs.QueryParam("picHash")
        private String picHash;
        @jakarta.ws.rs.QueryParam("activeFlag")
        private Boolean activeFlag;
        @jakarta.ws.rs.QueryParam("value")
        private Integer value;

        /**
        * The ID of the user
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

        public DealUserDataWithIdQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The name of the user
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

        public DealUserDataWithIdQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The email of the user
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

        public DealUserDataWithIdQueryParam email(String email) {
            this.email = email;
            return this;
        }

        /**
        * If the user has a picture or not
        * @return hasPic
        **/
        @JsonProperty("has_pic")
        public Boolean getHasPic() {
            return hasPic;
        }

        /**
         * Set hasPic
         **/
        public void setHasPic(Boolean hasPic) {
            this.hasPic = hasPic;
        }

        public DealUserDataWithIdQueryParam hasPic(Boolean hasPic) {
            this.hasPic = hasPic;
            return this;
        }

        /**
        * The user picture hash
        * @return picHash
        **/
        @JsonProperty("pic_hash")
        public String getPicHash() {
            return picHash;
        }

        /**
         * Set picHash
         **/
        public void setPicHash(String picHash) {
            this.picHash = picHash;
        }

        public DealUserDataWithIdQueryParam picHash(String picHash) {
            this.picHash = picHash;
            return this;
        }

        /**
        * Whether the user is active or not
        * @return activeFlag
        **/
        @JsonProperty("active_flag")
        public Boolean getActiveFlag() {
            return activeFlag;
        }

        /**
         * Set activeFlag
         **/
        public void setActiveFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
        }

        public DealUserDataWithIdQueryParam activeFlag(Boolean activeFlag) {
            this.activeFlag = activeFlag;
            return this;
        }

        /**
        * The ID of the user
        * @return value
        **/
        @JsonProperty("value")
        public Integer getValue() {
            return value;
        }

        /**
         * Set value
         **/
        public void setValue(Integer value) {
            this.value = value;
        }

        public DealUserDataWithIdQueryParam value(Integer value) {
            this.value = value;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DealUserDataWithIdQueryParam {\n");

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
