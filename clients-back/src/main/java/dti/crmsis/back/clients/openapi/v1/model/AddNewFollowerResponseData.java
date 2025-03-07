package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class AddNewFollowerResponseData  {

    /**
      * The ID of the user that was added as follower
     **/
    private Integer userId;
    /**
      * The ID of the follower
     **/
    private Integer id;
    /**
      * The ID of the product
     **/
    private Integer productId;
    /**
      * The follower creation time. Format: YYYY-MM-DD HH:MM:SS
     **/
    private String addTime;

    /**
    * The ID of the user that was added as follower
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

    public AddNewFollowerResponseData userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
    * The ID of the follower
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

    public AddNewFollowerResponseData id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The ID of the product
    * @return productId
    **/
    @JsonProperty("product_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getProductId() {
        return productId;
    }

    /**
     * Set productId
     **/
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public AddNewFollowerResponseData productId(Integer productId) {
        this.productId = productId;
        return this;
    }

    /**
    * The follower creation time. Format: YYYY-MM-DD HH:MM:SS
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

    public AddNewFollowerResponseData addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddNewFollowerResponseData {\n");

        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddNewFollowerResponseData} object that
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

        AddNewFollowerResponseData model = (AddNewFollowerResponseData) obj;

        return java.util.Objects.equals(userId, model.userId) &&
        java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(productId, model.productId) &&
        java.util.Objects.equals(addTime, model.addTime);
    }

    /**
     * Returns a hash code for a {@code AddNewFollowerResponseData}.
     *
     * @return a hash code value for a {@code AddNewFollowerResponseData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(userId,
        id,
        productId,
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
    public static class AddNewFollowerResponseDataQueryParam  {

        @jakarta.ws.rs.QueryParam("userId")
        private Integer userId;
        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("productId")
        private Integer productId;
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;

        /**
        * The ID of the user that was added as follower
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

        public AddNewFollowerResponseDataQueryParam userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        /**
        * The ID of the follower
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

        public AddNewFollowerResponseDataQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The ID of the product
        * @return productId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("product_id")
        public Integer getProductId() {
            return productId;
        }

        /**
         * Set productId
         **/
        public void setProductId(Integer productId) {
            this.productId = productId;
        }

        public AddNewFollowerResponseDataQueryParam productId(Integer productId) {
            this.productId = productId;
            return this;
        }

        /**
        * The follower creation time. Format: YYYY-MM-DD HH:MM:SS
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

        public AddNewFollowerResponseDataQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddNewFollowerResponseDataQueryParam {\n");

            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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
