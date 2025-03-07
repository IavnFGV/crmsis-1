package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The count of activities related to the user grouped by activity type
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActivityTypeCount  {

    /**
      * The count of activities related to a specific type
     **/
    private Integer ACTIVITY_TYPE_NAME;

    /**
    * The count of activities related to a specific type
    * @return ACTIVITY_TYPE_NAME
    **/
    @JsonProperty("ACTIVITY_TYPE_NAME")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getACTIVITYTYPENAME() {
        return ACTIVITY_TYPE_NAME;
    }

    /**
     * Set ACTIVITY_TYPE_NAME
     **/
    public void setACTIVITYTYPENAME(Integer ACTIVITY_TYPE_NAME) {
        this.ACTIVITY_TYPE_NAME = ACTIVITY_TYPE_NAME;
    }

    public ActivityTypeCount ACTIVITY_TYPE_NAME(Integer ACTIVITY_TYPE_NAME) {
        this.ACTIVITY_TYPE_NAME = ACTIVITY_TYPE_NAME;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActivityTypeCount {\n");

        sb.append("    ACTIVITY_TYPE_NAME: ").append(toIndentedString(ACTIVITY_TYPE_NAME)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code ActivityTypeCount} object that
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

        ActivityTypeCount model = (ActivityTypeCount) obj;

        return java.util.Objects.equals(ACTIVITY_TYPE_NAME, model.ACTIVITY_TYPE_NAME);
    }

    /**
     * Returns a hash code for a {@code ActivityTypeCount}.
     *
     * @return a hash code value for a {@code ActivityTypeCount}.
     **/
    @Override
    public int hashCode() {
    return java.util.Objects.hash(ACTIVITY_TYPE_NAME);
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
      * The count of activities related to the user grouped by activity type
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ActivityTypeCountQueryParam  {

        /**
          * The count of activities related to the user grouped by activity type
         **/
        @jakarta.ws.rs.QueryParam("ACTIVITY_TYPE_NAME")
        private Integer ACTIVITY_TYPE_NAME;

        /**
        * The count of activities related to a specific type
        * @return ACTIVITY_TYPE_NAME
        **/
        @JsonProperty("ACTIVITY_TYPE_NAME")
        public Integer getACTIVITYTYPENAME() {
            return ACTIVITY_TYPE_NAME;
        }

        /**
         * Set ACTIVITY_TYPE_NAME
         **/
        public void setACTIVITYTYPENAME(Integer ACTIVITY_TYPE_NAME) {
            this.ACTIVITY_TYPE_NAME = ACTIVITY_TYPE_NAME;
        }

        public ActivityTypeCountQueryParam ACTIVITY_TYPE_NAME(Integer ACTIVITY_TYPE_NAME) {
            this.ACTIVITY_TYPE_NAME = ACTIVITY_TYPE_NAME;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ActivityTypeCountQueryParam {\n");

            sb.append("    ACTIVITY_TYPE_NAME: ").append(toIndentedString(ACTIVITY_TYPE_NAME)).append("\n");
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
