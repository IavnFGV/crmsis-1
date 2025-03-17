package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.GoalAssignee;
import dti.crmsis.back.clients.openapi.v1.model.GoalDuration;
import dti.crmsis.back.clients.openapi.v1.model.GoalExpectedOutcome;
import dti.crmsis.back.clients.openapi.v1.model.GoalType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Goal  {

    /**
      * The ID of the goal
     **/
    private String id;
    /**
      * The ID of the creator of the goal
     **/
    private Integer ownerId;
    /**
      * The title of the goal
     **/
    private String title;
    private GoalType type;
    private GoalAssignee assignee;
    /**
      * The interval of the goal
     **/
    private String interval;
    private GoalDuration duration;
    private GoalExpectedOutcome expectedOutcome;
    /**
      * Whether the goal is currently active or not
     **/
    private Boolean isActive;
    /**
      * The IDs of the reports that belong to the goal
     **/
    private List<String> reportIds;

    /**
    * The ID of the goal
    * @return id
    **/
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(String id) {
        this.id = id;
    }

    public Goal id(String id) {
        this.id = id;
        return this;
    }

    /**
    * The ID of the creator of the goal
    * @return ownerId
    **/
    @JsonProperty("owner_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     * Set ownerId
     **/
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Goal ownerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
    * The title of the goal
    * @return title
    **/
    @JsonProperty("title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTitle() {
        return title;
    }

    /**
     * Set title
     **/
    public void setTitle(String title) {
        this.title = title;
    }

    public Goal title(String title) {
        this.title = title;
        return this;
    }

    /**
    * Get type
    * @return type
    **/
    @JsonProperty("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GoalType getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(GoalType type) {
        this.type = type;
    }

    public Goal type(GoalType type) {
        this.type = type;
        return this;
    }

    /**
    * Get assignee
    * @return assignee
    **/
    @JsonProperty("assignee")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GoalAssignee getAssignee() {
        return assignee;
    }

    /**
     * Set assignee
     **/
    public void setAssignee(GoalAssignee assignee) {
        this.assignee = assignee;
    }

    public Goal assignee(GoalAssignee assignee) {
        this.assignee = assignee;
        return this;
    }

    /**
    * The interval of the goal
    * @return interval
    **/
    @JsonProperty("interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInterval() {
        return interval;
    }

    /**
     * Set interval
     **/
    public void setInterval(String interval) {
        this.interval = interval;
    }

    public Goal interval(String interval) {
        this.interval = interval;
        return this;
    }

    /**
    * Get duration
    * @return duration
    **/
    @JsonProperty("duration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GoalDuration getDuration() {
        return duration;
    }

    /**
     * Set duration
     **/
    public void setDuration(GoalDuration duration) {
        this.duration = duration;
    }

    public Goal duration(GoalDuration duration) {
        this.duration = duration;
        return this;
    }

    /**
    * Get expectedOutcome
    * @return expectedOutcome
    **/
    @JsonProperty("expected_outcome")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GoalExpectedOutcome getExpectedOutcome() {
        return expectedOutcome;
    }

    /**
     * Set expectedOutcome
     **/
    public void setExpectedOutcome(GoalExpectedOutcome expectedOutcome) {
        this.expectedOutcome = expectedOutcome;
    }

    public Goal expectedOutcome(GoalExpectedOutcome expectedOutcome) {
        this.expectedOutcome = expectedOutcome;
        return this;
    }

    /**
    * Whether the goal is currently active or not
    * @return isActive
    **/
    @JsonProperty("is_active")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * Set isActive
     **/
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Goal isActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
    * The IDs of the reports that belong to the goal
    * @return reportIds
    **/
    @JsonProperty("report_ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getReportIds() {
        return reportIds;
    }

    /**
     * Set reportIds
     **/
    public void setReportIds(List<String> reportIds) {
        this.reportIds = reportIds;
    }

    public Goal reportIds(List<String> reportIds) {
        this.reportIds = reportIds;
        return this;
    }
    public Goal addReportIdsItem(String reportIdsItem) {
        if (this.reportIds == null){
            reportIds = new ArrayList<>();
        }
        this.reportIds.add(reportIdsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Goal {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    expectedOutcome: ").append(toIndentedString(expectedOutcome)).append("\n");
        sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
        sb.append("    reportIds: ").append(toIndentedString(reportIds)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code Goal} object that
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

        Goal model = (Goal) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(ownerId, model.ownerId) &&
        java.util.Objects.equals(title, model.title) &&
        java.util.Objects.equals(type, model.type) &&
        java.util.Objects.equals(assignee, model.assignee) &&
        java.util.Objects.equals(interval, model.interval) &&
        java.util.Objects.equals(duration, model.duration) &&
        java.util.Objects.equals(expectedOutcome, model.expectedOutcome) &&
        java.util.Objects.equals(isActive, model.isActive) &&
        java.util.Objects.equals(reportIds, model.reportIds);
    }

    /**
     * Returns a hash code for a {@code Goal}.
     *
     * @return a hash code value for a {@code Goal}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        ownerId,
        title,
        type,
        assignee,
        interval,
        duration,
        expectedOutcome,
        isActive,
        reportIds);
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
    public static class GoalQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private String id;
        @jakarta.ws.rs.QueryParam("ownerId")
        private Integer ownerId;
        @jakarta.ws.rs.QueryParam("title")
        private String title;
        @jakarta.ws.rs.QueryParam("type")
        private GoalType type;
        @jakarta.ws.rs.QueryParam("assignee")
        private GoalAssignee assignee;
        @jakarta.ws.rs.QueryParam("interval")
        private String interval;
        @jakarta.ws.rs.QueryParam("duration")
        private GoalDuration duration;
        @jakarta.ws.rs.QueryParam("expectedOutcome")
        private GoalExpectedOutcome expectedOutcome;
        @jakarta.ws.rs.QueryParam("isActive")
        private Boolean isActive;
        @jakarta.ws.rs.QueryParam("reportIds")
        private List<String> reportIds = null;

        /**
        * The ID of the goal
        * @return id
        **/
        @JsonProperty("id")
        public String getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(String id) {
            this.id = id;
        }

        public GoalQueryParam id(String id) {
            this.id = id;
            return this;
        }

        /**
        * The ID of the creator of the goal
        * @return ownerId
        **/
        @JsonProperty("owner_id")
        public Integer getOwnerId() {
            return ownerId;
        }

        /**
         * Set ownerId
         **/
        public void setOwnerId(Integer ownerId) {
            this.ownerId = ownerId;
        }

        public GoalQueryParam ownerId(Integer ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
        * The title of the goal
        * @return title
        **/
        @JsonProperty("title")
        public String getTitle() {
            return title;
        }

        /**
         * Set title
         **/
        public void setTitle(String title) {
            this.title = title;
        }

        public GoalQueryParam title(String title) {
            this.title = title;
            return this;
        }

        /**
        * Get type
        * @return type
        **/
        @JsonProperty("type")
        public GoalType getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(GoalType type) {
            this.type = type;
        }

        public GoalQueryParam type(GoalType type) {
            this.type = type;
            return this;
        }

        /**
        * Get assignee
        * @return assignee
        **/
        @JsonProperty("assignee")
        public GoalAssignee getAssignee() {
            return assignee;
        }

        /**
         * Set assignee
         **/
        public void setAssignee(GoalAssignee assignee) {
            this.assignee = assignee;
        }

        public GoalQueryParam assignee(GoalAssignee assignee) {
            this.assignee = assignee;
            return this;
        }

        /**
        * The interval of the goal
        * @return interval
        **/
        @JsonProperty("interval")
        public String getInterval() {
            return interval;
        }

        /**
         * Set interval
         **/
        public void setInterval(String interval) {
            this.interval = interval;
        }

        public GoalQueryParam interval(String interval) {
            this.interval = interval;
            return this;
        }

        /**
        * Get duration
        * @return duration
        **/
        @JsonProperty("duration")
        public GoalDuration getDuration() {
            return duration;
        }

        /**
         * Set duration
         **/
        public void setDuration(GoalDuration duration) {
            this.duration = duration;
        }

        public GoalQueryParam duration(GoalDuration duration) {
            this.duration = duration;
            return this;
        }

        /**
        * Get expectedOutcome
        * @return expectedOutcome
        **/
        @JsonProperty("expected_outcome")
        public GoalExpectedOutcome getExpectedOutcome() {
            return expectedOutcome;
        }

        /**
         * Set expectedOutcome
         **/
        public void setExpectedOutcome(GoalExpectedOutcome expectedOutcome) {
            this.expectedOutcome = expectedOutcome;
        }

        public GoalQueryParam expectedOutcome(GoalExpectedOutcome expectedOutcome) {
            this.expectedOutcome = expectedOutcome;
            return this;
        }

        /**
        * Whether the goal is currently active or not
        * @return isActive
        **/
        @JsonProperty("is_active")
        public Boolean getIsActive() {
            return isActive;
        }

        /**
         * Set isActive
         **/
        public void setIsActive(Boolean isActive) {
            this.isActive = isActive;
        }

        public GoalQueryParam isActive(Boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        /**
        * The IDs of the reports that belong to the goal
        * @return reportIds
        **/
        @JsonProperty("report_ids")
        public List<String> getReportIds() {
            return reportIds;
        }

        /**
         * Set reportIds
         **/
        public void setReportIds(List<String> reportIds) {
            this.reportIds = reportIds;
        }

        public GoalQueryParam reportIds(List<String> reportIds) {
            this.reportIds = reportIds;
            return this;
        }
        public GoalQueryParam addReportIdsItem(String reportIdsItem) {
            this.reportIds.add(reportIdsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GoalQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
            sb.append("    title: ").append(toIndentedString(title)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
            sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
            sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
            sb.append("    expectedOutcome: ").append(toIndentedString(expectedOutcome)).append("\n");
            sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
            sb.append("    reportIds: ").append(toIndentedString(reportIds)).append("\n");
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
