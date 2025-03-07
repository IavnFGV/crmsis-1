package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The user ID of the follower
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERID  {

    /**
      * The ID of the follower associated with the item
     **/
    private Integer id;
    /**
      * The name of the follower
     **/
    private String name;
    /**
      * The email of the follower
     **/
    private String email;
    /**
      * The user ID of the follower
     **/
    private Integer userId;
    /**
      * The follower picture hash
     **/
    private String picHash;

    /**
    * The ID of the follower associated with the item
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

    public GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERID id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The name of the follower
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

    public GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERID name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The email of the follower
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

    public GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERID email(String email) {
        this.email = email;
        return this;
    }

    /**
    * The user ID of the follower
    * @return userId
    **/
    @JsonProperty("user_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getUserId() {
        return userId;
    }

    /**
     * Set userId
     **/
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERID userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
    * The follower picture hash
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

    public GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERID picHash(String picHash) {
        this.picHash = picHash;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERID {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    picHash: ").append(toIndentedString(picHash)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERID} object that
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

        GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERID model = (GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERID) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(email, model.email) &&
        java.util.Objects.equals(userId, model.userId) &&
        java.util.Objects.equals(picHash, model.picHash);
    }

    /**
     * Returns a hash code for a {@code GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERID}.
     *
     * @return a hash code value for a {@code GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERID}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        name,
        email,
        userId,
        picHash);
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
      * The user ID of the follower
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERIDQueryParam  {

        /**
          * The user ID of the follower
         **/
        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        /**
          * The user ID of the follower
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * The user ID of the follower
         **/
        @jakarta.ws.rs.QueryParam("email")
        private String email;
        /**
          * The user ID of the follower
         **/
        @jakarta.ws.rs.QueryParam("userId")
        private Integer userId;
        /**
          * The user ID of the follower
         **/
        @jakarta.ws.rs.QueryParam("picHash")
        private String picHash;

        /**
        * The ID of the follower associated with the item
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

        public GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERIDQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The name of the follower
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

        public GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERIDQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The email of the follower
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

        public GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERIDQueryParam email(String email) {
            this.email = email;
            return this;
        }

        /**
        * The user ID of the follower
        * @return userId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("user_id")
        public Integer getUserId() {
            return userId;
        }

        /**
         * Set userId
         **/
        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERIDQueryParam userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        /**
        * The follower picture hash
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

        public GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERIDQueryParam picHash(String picHash) {
            this.picHash = picHash;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetOrganizationResponseAllOfAdditionalDataFollowersFOLLOWERUSERIDQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    email: ").append(toIndentedString(email)).append("\n");
            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
            sb.append("    picHash: ").append(toIndentedString(picHash)).append("\n");
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
