package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class AddDealFollowerResponseData  {

    /**
      * The user ID who added the follower
     **/
    private Integer userId;
    /**
      * The follower ID
     **/
    private Integer id;
    /**
      * The ID of the deal which the follower was added to
     **/
    private Integer dealId;
    /**
      * The date and time when the deal follower was added
     **/
    private String addTime;

    /**
    * The user ID who added the follower
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

    public AddDealFollowerResponseData userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
    * The follower ID
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

    public AddDealFollowerResponseData id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The ID of the deal which the follower was added to
    * @return dealId
    **/
    @JsonProperty("deal_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getDealId() {
        return dealId;
    }

    /**
     * Set dealId
     **/
    public void setDealId(Integer dealId) {
        this.dealId = dealId;
    }

    public AddDealFollowerResponseData dealId(Integer dealId) {
        this.dealId = dealId;
        return this;
    }

    /**
    * The date and time when the deal follower was added
    * @return addTime
    **/
    @JsonProperty("add_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getAddTime() {
        return addTime;
    }

    /**
     * Set addTime
     **/
    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public AddDealFollowerResponseData addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDealFollowerResponseData {\n");

        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddDealFollowerResponseData} object that
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

        AddDealFollowerResponseData model = (AddDealFollowerResponseData) obj;

        return java.util.Objects.equals(userId, model.userId) &&
        java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(dealId, model.dealId) &&
        java.util.Objects.equals(addTime, model.addTime);
    }

    /**
     * Returns a hash code for a {@code AddDealFollowerResponseData}.
     *
     * @return a hash code value for a {@code AddDealFollowerResponseData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(userId,
        id,
        dealId,
        addTime);
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
    public static class AddDealFollowerResponseDataQueryParam  {

        @jakarta.ws.rs.QueryParam("userId")
        private Integer userId;
        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("dealId")
        private Integer dealId;
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;

        /**
        * The user ID who added the follower
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

        public AddDealFollowerResponseDataQueryParam userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        /**
        * The follower ID
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

        public AddDealFollowerResponseDataQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The ID of the deal which the follower was added to
        * @return dealId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("deal_id")
        public Integer getDealId() {
            return dealId;
        }

        /**
         * Set dealId
         **/
        public void setDealId(Integer dealId) {
            this.dealId = dealId;
        }

        public AddDealFollowerResponseDataQueryParam dealId(Integer dealId) {
            this.dealId = dealId;
            return this;
        }

        /**
        * The date and time when the deal follower was added
        * @return addTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("add_time")
        public String getAddTime() {
            return addTime;
        }

        /**
         * Set addTime
         **/
        public void setAddTime(String addTime) {
            this.addTime = addTime;
        }

        public AddDealFollowerResponseDataQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddDealFollowerResponseDataQueryParam {\n");

            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
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
