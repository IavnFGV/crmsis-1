package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.ActivityTypeCount;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The ID of the user
 **/
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class ActivityDistributionItem  {

    private ActivityTypeCount activities;
    /**
      * The name of the user
     **/
    private String name;
    /**
      * The overall count of activities for the user
     **/
    private Integer activityCount;
    /**
      * The percentage of activities belongs to the user
     **/
    private Integer share;

    /**
    * Get activities
    * @return activities
    **/
    @JsonProperty("activities")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public ActivityTypeCount getActivities() {
        return activities;
    }

    /**
     * Set activities
     **/
    public void setActivities(ActivityTypeCount activities) {
        this.activities = activities;
    }

    public ActivityDistributionItem activities(ActivityTypeCount activities) {
        this.activities = activities;
        return this;
    }

    /**
    * The name of the user
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

    public ActivityDistributionItem name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The overall count of activities for the user
    * @return activityCount
    **/
    @JsonProperty("activity_count")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getActivityCount() {
        return activityCount;
    }

    /**
     * Set activityCount
     **/
    public void setActivityCount(Integer activityCount) {
        this.activityCount = activityCount;
    }

    public ActivityDistributionItem activityCount(Integer activityCount) {
        this.activityCount = activityCount;
        return this;
    }

    /**
    * The percentage of activities belongs to the user
    * @return share
    **/
    @JsonProperty("share")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getShare() {
        return share;
    }

    /**
     * Set share
     **/
    public void setShare(Integer share) {
        this.share = share;
    }

    public ActivityDistributionItem share(Integer share) {
        this.share = share;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActivityDistributionItem {\n");

        sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    activityCount: ").append(toIndentedString(activityCount)).append("\n");
        sb.append("    share: ").append(toIndentedString(share)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code ActivityDistributionItem} object that
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

        ActivityDistributionItem model = (ActivityDistributionItem) obj;

        return java.util.Objects.equals(activities, model.activities) &&
        java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(activityCount, model.activityCount) &&
        java.util.Objects.equals(share, model.share);
    }

    /**
     * Returns a hash code for a {@code ActivityDistributionItem}.
     *
     * @return a hash code value for a {@code ActivityDistributionItem}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(activities,
        name,
        activityCount,
        share);
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
      * The ID of the user
     **/
    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class ActivityDistributionItemQueryParam  {

        /**
          * The ID of the user
         **/
        @jakarta.ws.rs.QueryParam("activities")
        private ActivityTypeCount activities;
        /**
          * The ID of the user
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * The ID of the user
         **/
        @jakarta.ws.rs.QueryParam("activityCount")
        private Integer activityCount;
        /**
          * The ID of the user
         **/
        @jakarta.ws.rs.QueryParam("share")
        private Integer share;

        /**
        * Get activities
        * @return activities
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("activities")
        public ActivityTypeCount getActivities() {
            return activities;
        }

        /**
         * Set activities
         **/
        public void setActivities(ActivityTypeCount activities) {
            this.activities = activities;
        }

        public ActivityDistributionItemQueryParam activities(ActivityTypeCount activities) {
            this.activities = activities;
            return this;
        }

        /**
        * The name of the user
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

        public ActivityDistributionItemQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The overall count of activities for the user
        * @return activityCount
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("activity_count")
        public Integer getActivityCount() {
            return activityCount;
        }

        /**
         * Set activityCount
         **/
        public void setActivityCount(Integer activityCount) {
            this.activityCount = activityCount;
        }

        public ActivityDistributionItemQueryParam activityCount(Integer activityCount) {
            this.activityCount = activityCount;
            return this;
        }

        /**
        * The percentage of activities belongs to the user
        * @return share
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("share")
        public Integer getShare() {
            return share;
        }

        /**
         * Set share
         **/
        public void setShare(Integer share) {
            this.share = share;
        }

        public ActivityDistributionItemQueryParam share(Integer share) {
            this.share = share;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ActivityDistributionItemQueryParam {\n");

            sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    activityCount: ").append(toIndentedString(activityCount)).append("\n");
            sb.append("    share: ").append(toIndentedString(share)).append("\n");
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
