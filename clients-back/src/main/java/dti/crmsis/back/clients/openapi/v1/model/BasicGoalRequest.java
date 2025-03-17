package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BasicGoalRequest  {

    /**
      * The title of the goal
     **/
    private String title;
    /**
      * Who this goal is assigned to. It requires the following JSON structure: `{ \"id\": \"1\", \"type\": \"person\" }`. `type` can be either `person`, `company` or `team`. ID of the assignee person, company or team.
     **/
    private Object assignee;
    /**
      * The type of the goal. It requires the following JSON structure: `{ \"name\": \"deals_started\", \"params\": { \"pipeline_id\": [1, 2], \"activity_type_id\": [9] } }`. Type can be one of: `deals_won`, `deals_progressed`, `activities_completed`, `activities_added`, `deals_started` or `revenue_forecast`. `params` can include `pipeline_id`, `stage_id` or `activity_type_id`. `stage_id` is related to only `deals_progressed` type of goals and `activity_type_id` to `activities_completed` or `activities_added` types of goals. The `pipeline_id` and `activity_type_id` need to be given as an array of integers. To track the goal in all pipelines, set `pipeline_id` as `null` and similarly, to track the goal for all activities, set `activity_type_id` as `null`.”
     **/
    private Object type;
    /**
      * The expected outcome of the goal. Expected outcome can be tracked either by `quantity` or by `sum`. It requires the following JSON structure: `{ \"target\": \"50\", \"tracking_metric\": \"quantity\" }` or `{ \"target\": \"50\", \"tracking_metric\": \"sum\", \"currency_id\": 1 }`. `currency_id` should only be added to `sum` type of goals.
     **/
    private Object expectedOutcome;
    /**
      * The date when the goal starts and ends. It requires the following JSON structure: `{ \"start\": \"2019-01-01\", \"end\": \"2022-12-31\" }`. Date in format of YYYY-MM-DD. \"end\" can be set to `null` for an infinite, open-ended goal.
     **/
    private Object duration;

    public enum IntervalEnum {
        WEEKLY(String.valueOf("weekly")), MONTHLY(String.valueOf("monthly")), QUARTERLY(String.valueOf("quarterly")), YEARLY(String.valueOf("yearly"));

        // caching enum access
        private static final java.util.EnumSet<IntervalEnum> values = java.util.EnumSet.allOf(IntervalEnum.class);

        String value;

        IntervalEnum (String v) {
            value = v;
        }

        @JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IntervalEnum fromString(String v) {
            for (IntervalEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    /**
      * The interval of the goal
     **/
    private IntervalEnum interval;

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

    public BasicGoalRequest title(String title) {
        this.title = title;
        return this;
    }

    /**
    * Who this goal is assigned to. It requires the following JSON structure: `{ \"id\": \"1\", \"type\": \"person\" }`. `type` can be either `person`, `company` or `team`. ID of the assignee person, company or team.
    * @return assignee
    **/
    @JsonProperty("assignee")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getAssignee() {
        return assignee;
    }

    /**
     * Set assignee
     **/
    public void setAssignee(Object assignee) {
        this.assignee = assignee;
    }

    public BasicGoalRequest assignee(Object assignee) {
        this.assignee = assignee;
        return this;
    }

    /**
    * The type of the goal. It requires the following JSON structure: `{ \"name\": \"deals_started\", \"params\": { \"pipeline_id\": [1, 2], \"activity_type_id\": [9] } }`. Type can be one of: `deals_won`, `deals_progressed`, `activities_completed`, `activities_added`, `deals_started` or `revenue_forecast`. `params` can include `pipeline_id`, `stage_id` or `activity_type_id`. `stage_id` is related to only `deals_progressed` type of goals and `activity_type_id` to `activities_completed` or `activities_added` types of goals. The `pipeline_id` and `activity_type_id` need to be given as an array of integers. To track the goal in all pipelines, set `pipeline_id` as `null` and similarly, to track the goal for all activities, set `activity_type_id` as `null`.”
    * @return type
    **/
    @JsonProperty("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(Object type) {
        this.type = type;
    }

    public BasicGoalRequest type(Object type) {
        this.type = type;
        return this;
    }

    /**
    * The expected outcome of the goal. Expected outcome can be tracked either by `quantity` or by `sum`. It requires the following JSON structure: `{ \"target\": \"50\", \"tracking_metric\": \"quantity\" }` or `{ \"target\": \"50\", \"tracking_metric\": \"sum\", \"currency_id\": 1 }`. `currency_id` should only be added to `sum` type of goals.
    * @return expectedOutcome
    **/
    @JsonProperty("expected_outcome")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getExpectedOutcome() {
        return expectedOutcome;
    }

    /**
     * Set expectedOutcome
     **/
    public void setExpectedOutcome(Object expectedOutcome) {
        this.expectedOutcome = expectedOutcome;
    }

    public BasicGoalRequest expectedOutcome(Object expectedOutcome) {
        this.expectedOutcome = expectedOutcome;
        return this;
    }

    /**
    * The date when the goal starts and ends. It requires the following JSON structure: `{ \"start\": \"2019-01-01\", \"end\": \"2022-12-31\" }`. Date in format of YYYY-MM-DD. \"end\" can be set to `null` for an infinite, open-ended goal.
    * @return duration
    **/
    @JsonProperty("duration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getDuration() {
        return duration;
    }

    /**
     * Set duration
     **/
    public void setDuration(Object duration) {
        this.duration = duration;
    }

    public BasicGoalRequest duration(Object duration) {
        this.duration = duration;
        return this;
    }

    /**
    * The interval of the goal
    * @return interval
    **/
    @JsonProperty("interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IntervalEnum getInterval() {
        return interval;
    }

    /**
     * Set interval
     **/
    public void setInterval(IntervalEnum interval) {
        this.interval = interval;
    }

    public BasicGoalRequest interval(IntervalEnum interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BasicGoalRequest {\n");

        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    expectedOutcome: ").append(toIndentedString(expectedOutcome)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code BasicGoalRequest} object that
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

        BasicGoalRequest model = (BasicGoalRequest) obj;

        return java.util.Objects.equals(title, model.title) &&
        java.util.Objects.equals(assignee, model.assignee) &&
        java.util.Objects.equals(type, model.type) &&
        java.util.Objects.equals(expectedOutcome, model.expectedOutcome) &&
        java.util.Objects.equals(duration, model.duration) &&
        java.util.Objects.equals(interval, model.interval);
    }

    /**
     * Returns a hash code for a {@code BasicGoalRequest}.
     *
     * @return a hash code value for a {@code BasicGoalRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(title,
        assignee,
        type,
        expectedOutcome,
        duration,
        interval);
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
    public static class BasicGoalRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("title")
        private String title;
        @jakarta.ws.rs.QueryParam("assignee")
        private Object assignee;
        @jakarta.ws.rs.QueryParam("type")
        private Object type;
        @jakarta.ws.rs.QueryParam("expectedOutcome")
        private Object expectedOutcome;
        @jakarta.ws.rs.QueryParam("duration")
        private Object duration;

    public enum IntervalEnum {
        WEEKLY(String.valueOf("weekly")), MONTHLY(String.valueOf("monthly")), QUARTERLY(String.valueOf("quarterly")), YEARLY(String.valueOf("yearly"));

        // caching enum access
        private static final java.util.EnumSet<IntervalEnum> values = java.util.EnumSet.allOf(IntervalEnum.class);

        String value;

        IntervalEnum (String v) {
            value = v;
        }

        @JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IntervalEnum fromString(String v) {
            for (IntervalEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private IntervalEnum interval;

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

        public BasicGoalRequestQueryParam title(String title) {
            this.title = title;
            return this;
        }

        /**
        * Who this goal is assigned to. It requires the following JSON structure: `{ \"id\": \"1\", \"type\": \"person\" }`. `type` can be either `person`, `company` or `team`. ID of the assignee person, company or team.
        * @return assignee
        **/
        @JsonProperty("assignee")
        public Object getAssignee() {
            return assignee;
        }

        /**
         * Set assignee
         **/
        public void setAssignee(Object assignee) {
            this.assignee = assignee;
        }

        public BasicGoalRequestQueryParam assignee(Object assignee) {
            this.assignee = assignee;
            return this;
        }

        /**
        * The type of the goal. It requires the following JSON structure: `{ \"name\": \"deals_started\", \"params\": { \"pipeline_id\": [1, 2], \"activity_type_id\": [9] } }`. Type can be one of: `deals_won`, `deals_progressed`, `activities_completed`, `activities_added`, `deals_started` or `revenue_forecast`. `params` can include `pipeline_id`, `stage_id` or `activity_type_id`. `stage_id` is related to only `deals_progressed` type of goals and `activity_type_id` to `activities_completed` or `activities_added` types of goals. The `pipeline_id` and `activity_type_id` need to be given as an array of integers. To track the goal in all pipelines, set `pipeline_id` as `null` and similarly, to track the goal for all activities, set `activity_type_id` as `null`.”
        * @return type
        **/
        @JsonProperty("type")
        public Object getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(Object type) {
            this.type = type;
        }

        public BasicGoalRequestQueryParam type(Object type) {
            this.type = type;
            return this;
        }

        /**
        * The expected outcome of the goal. Expected outcome can be tracked either by `quantity` or by `sum`. It requires the following JSON structure: `{ \"target\": \"50\", \"tracking_metric\": \"quantity\" }` or `{ \"target\": \"50\", \"tracking_metric\": \"sum\", \"currency_id\": 1 }`. `currency_id` should only be added to `sum` type of goals.
        * @return expectedOutcome
        **/
        @JsonProperty("expected_outcome")
        public Object getExpectedOutcome() {
            return expectedOutcome;
        }

        /**
         * Set expectedOutcome
         **/
        public void setExpectedOutcome(Object expectedOutcome) {
            this.expectedOutcome = expectedOutcome;
        }

        public BasicGoalRequestQueryParam expectedOutcome(Object expectedOutcome) {
            this.expectedOutcome = expectedOutcome;
            return this;
        }

        /**
        * The date when the goal starts and ends. It requires the following JSON structure: `{ \"start\": \"2019-01-01\", \"end\": \"2022-12-31\" }`. Date in format of YYYY-MM-DD. \"end\" can be set to `null` for an infinite, open-ended goal.
        * @return duration
        **/
        @JsonProperty("duration")
        public Object getDuration() {
            return duration;
        }

        /**
         * Set duration
         **/
        public void setDuration(Object duration) {
            this.duration = duration;
        }

        public BasicGoalRequestQueryParam duration(Object duration) {
            this.duration = duration;
            return this;
        }

        /**
        * The interval of the goal
        * @return interval
        **/
        @JsonProperty("interval")
        public IntervalEnum getInterval() {
            return interval;
        }

        /**
         * Set interval
         **/
        public void setInterval(IntervalEnum interval) {
            this.interval = interval;
        }

        public BasicGoalRequestQueryParam interval(IntervalEnum interval) {
            this.interval = interval;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class BasicGoalRequestQueryParam {\n");

            sb.append("    title: ").append(toIndentedString(title)).append("\n");
            sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    expectedOutcome: ").append(toIndentedString(expectedOutcome)).append("\n");
            sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
            sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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
