package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class AddActivityResponseAdditionalData  {

    /**
      * This field will be deprecated
     **/
    private Integer updatesStoryId;

    /**
    * This field will be deprecated
    * @return updatesStoryId
    **/
    @JsonProperty("updates_story_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getUpdatesStoryId() {
        return updatesStoryId;
    }

    /**
     * Set updatesStoryId
     **/
    public void setUpdatesStoryId(Integer updatesStoryId) {
        this.updatesStoryId = updatesStoryId;
    }

    public AddActivityResponseAdditionalData updatesStoryId(Integer updatesStoryId) {
        this.updatesStoryId = updatesStoryId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddActivityResponseAdditionalData {\n");

        sb.append("    updatesStoryId: ").append(toIndentedString(updatesStoryId)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddActivityResponseAdditionalData} object that
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

        AddActivityResponseAdditionalData model = (AddActivityResponseAdditionalData) obj;

        return java.util.Objects.equals(updatesStoryId, model.updatesStoryId);
    }

    /**
     * Returns a hash code for a {@code AddActivityResponseAdditionalData}.
     *
     * @return a hash code value for a {@code AddActivityResponseAdditionalData}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(updatesStoryId);
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
    public static class AddActivityResponseAdditionalDataQueryParam  {

        @jakarta.ws.rs.QueryParam("updatesStoryId")
        private Integer updatesStoryId;

        /**
        * This field will be deprecated
        * @return updatesStoryId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("updates_story_id")
        public Integer getUpdatesStoryId() {
            return updatesStoryId;
        }

        /**
         * Set updatesStoryId
         **/
        public void setUpdatesStoryId(Integer updatesStoryId) {
            this.updatesStoryId = updatesStoryId;
        }

        public AddActivityResponseAdditionalDataQueryParam updatesStoryId(Integer updatesStoryId) {
            this.updatesStoryId = updatesStoryId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddActivityResponseAdditionalDataQueryParam {\n");

            sb.append("    updatesStoryId: ").append(toIndentedString(updatesStoryId)).append("\n");
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
