package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TaskResponseObject  {

    /**
      * The ID of the task, generated when the task was created
     **/
    private Integer id;
    /**
      * The title of the task
     **/
    private String title;
    /**
      * The ID of the project this task is associated with
     **/
    private BigDecimal projectId;
    /**
      * The description of the task
     **/
    private String description;
    /**
      * The ID of a parent task. Can not be ID of a task which is already a subtask.
     **/
    private BigDecimal parentTaskId;
    /**
      * The ID of the user who will be the assignee of the task
     **/
    private BigDecimal assigneeId;

    public enum DoneEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<DoneEnum> values = java.util.EnumSet.allOf(DoneEnum.class);

        BigDecimal value;

        DoneEnum (BigDecimal v) {
            value = v;
        }

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DoneEnum fromString(String v) {
            for (DoneEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private DoneEnum done;
    /**
      * The due date of the task. Format: YYYY-MM-DD.
     **/
    private LocalDate dueDate;
    /**
      * The creator of a task
     **/
    private BigDecimal creatorId;
    /**
      * The creation date and time of the task in UTC. Format: YYYY-MM-DD HH:MM:SS.
     **/
    private String addTime;
    /**
      * The update date and time of the task in UTC. Format: YYYY-MM-DD HH:MM:SS.
     **/
    private String updateTime;
    /**
      * The marked as done date and time of the task in UTC. Format: YYYY-MM-DD HH:MM:SS.
     **/
    private String markedAsDoneTime;

    /**
    * The ID of the task, generated when the task was created
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

    public TaskResponseObject id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The title of the task
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

    public TaskResponseObject title(String title) {
        this.title = title;
        return this;
    }

    /**
    * The ID of the project this task is associated with
    * @return projectId
    **/
    @JsonProperty("project_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getProjectId() {
        return projectId;
    }

    /**
     * Set projectId
     **/
    public void setProjectId(BigDecimal projectId) {
        this.projectId = projectId;
    }

    public TaskResponseObject projectId(BigDecimal projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
    * The description of the task
    * @return description
    **/
    @JsonProperty("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Set description
     **/
    public void setDescription(String description) {
        this.description = description;
    }

    public TaskResponseObject description(String description) {
        this.description = description;
        return this;
    }

    /**
    * The ID of a parent task. Can not be ID of a task which is already a subtask.
    * @return parentTaskId
    **/
    @JsonProperty("parent_task_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getParentTaskId() {
        return parentTaskId;
    }

    /**
     * Set parentTaskId
     **/
    public void setParentTaskId(BigDecimal parentTaskId) {
        this.parentTaskId = parentTaskId;
    }

    public TaskResponseObject parentTaskId(BigDecimal parentTaskId) {
        this.parentTaskId = parentTaskId;
        return this;
    }

    /**
    * The ID of the user who will be the assignee of the task
    * @return assigneeId
    **/
    @JsonProperty("assignee_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getAssigneeId() {
        return assigneeId;
    }

    /**
     * Set assigneeId
     **/
    public void setAssigneeId(BigDecimal assigneeId) {
        this.assigneeId = assigneeId;
    }

    public TaskResponseObject assigneeId(BigDecimal assigneeId) {
        this.assigneeId = assigneeId;
        return this;
    }

    /**
    * Get done
    * @return done
    **/
    @JsonProperty("done")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DoneEnum getDone() {
        return done;
    }

    /**
     * Set done
     **/
    public void setDone(DoneEnum done) {
        this.done = done;
    }

    public TaskResponseObject done(DoneEnum done) {
        this.done = done;
        return this;
    }

    /**
    * The due date of the task. Format: YYYY-MM-DD.
    * @return dueDate
    **/
    @JsonProperty("due_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LocalDate getDueDate() {
        return dueDate;
    }

    /**
     * Set dueDate
     **/
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public TaskResponseObject dueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
    * The creator of a task
    * @return creatorId
    **/
    @JsonProperty("creator_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getCreatorId() {
        return creatorId;
    }

    /**
     * Set creatorId
     **/
    public void setCreatorId(BigDecimal creatorId) {
        this.creatorId = creatorId;
    }

    public TaskResponseObject creatorId(BigDecimal creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
    * The creation date and time of the task in UTC. Format: YYYY-MM-DD HH:MM:SS.
    * @return addTime
    **/
    @JsonProperty("add_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddTime() {
        return addTime;
    }

    /**
     * Set addTime
     **/
    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public TaskResponseObject addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The update date and time of the task in UTC. Format: YYYY-MM-DD HH:MM:SS.
    * @return updateTime
    **/
    @JsonProperty("update_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Set updateTime
     **/
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public TaskResponseObject updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
    * The marked as done date and time of the task in UTC. Format: YYYY-MM-DD HH:MM:SS.
    * @return markedAsDoneTime
    **/
    @JsonProperty("marked_as_done_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMarkedAsDoneTime() {
        return markedAsDoneTime;
    }

    /**
     * Set markedAsDoneTime
     **/
    public void setMarkedAsDoneTime(String markedAsDoneTime) {
        this.markedAsDoneTime = markedAsDoneTime;
    }

    public TaskResponseObject markedAsDoneTime(String markedAsDoneTime) {
        this.markedAsDoneTime = markedAsDoneTime;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskResponseObject {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    parentTaskId: ").append(toIndentedString(parentTaskId)).append("\n");
        sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
        sb.append("    done: ").append(toIndentedString(done)).append("\n");
        sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    markedAsDoneTime: ").append(toIndentedString(markedAsDoneTime)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code TaskResponseObject} object that
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

        TaskResponseObject model = (TaskResponseObject) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(title, model.title) &&
        java.util.Objects.equals(projectId, model.projectId) &&
        java.util.Objects.equals(description, model.description) &&
        java.util.Objects.equals(parentTaskId, model.parentTaskId) &&
        java.util.Objects.equals(assigneeId, model.assigneeId) &&
        java.util.Objects.equals(done, model.done) &&
        java.util.Objects.equals(dueDate, model.dueDate) &&
        java.util.Objects.equals(creatorId, model.creatorId) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime) &&
        java.util.Objects.equals(markedAsDoneTime, model.markedAsDoneTime);
    }

    /**
     * Returns a hash code for a {@code TaskResponseObject}.
     *
     * @return a hash code value for a {@code TaskResponseObject}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        title,
        projectId,
        description,
        parentTaskId,
        assigneeId,
        done,
        dueDate,
        creatorId,
        addTime,
        updateTime,
        markedAsDoneTime);
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
    public static class TaskResponseObjectQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("title")
        private String title;
        @jakarta.ws.rs.QueryParam("projectId")
        private BigDecimal projectId;
        @jakarta.ws.rs.QueryParam("description")
        private String description;
        @jakarta.ws.rs.QueryParam("parentTaskId")
        private BigDecimal parentTaskId;
        @jakarta.ws.rs.QueryParam("assigneeId")
        private BigDecimal assigneeId;

    public enum DoneEnum {
        NUMBER_0(new BigDecimal("0")), NUMBER_1(new BigDecimal("1"));

        // caching enum access
        private static final java.util.EnumSet<DoneEnum> values = java.util.EnumSet.allOf(DoneEnum.class);

        BigDecimal value;

        DoneEnum (BigDecimal v) {
            value = v;
        }

        @JsonValue
        public BigDecimal value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DoneEnum fromString(String v) {
            for (DoneEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private DoneEnum done;
        @jakarta.ws.rs.QueryParam("dueDate")
        private LocalDate dueDate;
        @jakarta.ws.rs.QueryParam("creatorId")
        private BigDecimal creatorId;
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        @jakarta.ws.rs.QueryParam("updateTime")
        private String updateTime;
        @jakarta.ws.rs.QueryParam("markedAsDoneTime")
        private String markedAsDoneTime;

        /**
        * The ID of the task, generated when the task was created
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

        public TaskResponseObjectQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The title of the task
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

        public TaskResponseObjectQueryParam title(String title) {
            this.title = title;
            return this;
        }

        /**
        * The ID of the project this task is associated with
        * @return projectId
        **/
        @JsonProperty("project_id")
        public BigDecimal getProjectId() {
            return projectId;
        }

        /**
         * Set projectId
         **/
        public void setProjectId(BigDecimal projectId) {
            this.projectId = projectId;
        }

        public TaskResponseObjectQueryParam projectId(BigDecimal projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
        * The description of the task
        * @return description
        **/
        @JsonProperty("description")
        public String getDescription() {
            return description;
        }

        /**
         * Set description
         **/
        public void setDescription(String description) {
            this.description = description;
        }

        public TaskResponseObjectQueryParam description(String description) {
            this.description = description;
            return this;
        }

        /**
        * The ID of a parent task. Can not be ID of a task which is already a subtask.
        * @return parentTaskId
        **/
        @JsonProperty("parent_task_id")
        public BigDecimal getParentTaskId() {
            return parentTaskId;
        }

        /**
         * Set parentTaskId
         **/
        public void setParentTaskId(BigDecimal parentTaskId) {
            this.parentTaskId = parentTaskId;
        }

        public TaskResponseObjectQueryParam parentTaskId(BigDecimal parentTaskId) {
            this.parentTaskId = parentTaskId;
            return this;
        }

        /**
        * The ID of the user who will be the assignee of the task
        * @return assigneeId
        **/
        @JsonProperty("assignee_id")
        public BigDecimal getAssigneeId() {
            return assigneeId;
        }

        /**
         * Set assigneeId
         **/
        public void setAssigneeId(BigDecimal assigneeId) {
            this.assigneeId = assigneeId;
        }

        public TaskResponseObjectQueryParam assigneeId(BigDecimal assigneeId) {
            this.assigneeId = assigneeId;
            return this;
        }

        /**
        * Get done
        * @return done
        **/
        @JsonProperty("done")
        public DoneEnum getDone() {
            return done;
        }

        /**
         * Set done
         **/
        public void setDone(DoneEnum done) {
            this.done = done;
        }

        public TaskResponseObjectQueryParam done(DoneEnum done) {
            this.done = done;
            return this;
        }

        /**
        * The due date of the task. Format: YYYY-MM-DD.
        * @return dueDate
        **/
        @JsonProperty("due_date")
        public LocalDate getDueDate() {
            return dueDate;
        }

        /**
         * Set dueDate
         **/
        public void setDueDate(LocalDate dueDate) {
            this.dueDate = dueDate;
        }

        public TaskResponseObjectQueryParam dueDate(LocalDate dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        /**
        * The creator of a task
        * @return creatorId
        **/
        @JsonProperty("creator_id")
        public BigDecimal getCreatorId() {
            return creatorId;
        }

        /**
         * Set creatorId
         **/
        public void setCreatorId(BigDecimal creatorId) {
            this.creatorId = creatorId;
        }

        public TaskResponseObjectQueryParam creatorId(BigDecimal creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
        * The creation date and time of the task in UTC. Format: YYYY-MM-DD HH:MM:SS.
        * @return addTime
        **/
        @JsonProperty("add_time")
        public String getAddTime() {
            return addTime;
        }

        /**
         * Set addTime
         **/
        public void setAddTime(String addTime) {
            this.addTime = addTime;
        }

        public TaskResponseObjectQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The update date and time of the task in UTC. Format: YYYY-MM-DD HH:MM:SS.
        * @return updateTime
        **/
        @JsonProperty("update_time")
        public String getUpdateTime() {
            return updateTime;
        }

        /**
         * Set updateTime
         **/
        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public TaskResponseObjectQueryParam updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
        * The marked as done date and time of the task in UTC. Format: YYYY-MM-DD HH:MM:SS.
        * @return markedAsDoneTime
        **/
        @JsonProperty("marked_as_done_time")
        public String getMarkedAsDoneTime() {
            return markedAsDoneTime;
        }

        /**
         * Set markedAsDoneTime
         **/
        public void setMarkedAsDoneTime(String markedAsDoneTime) {
            this.markedAsDoneTime = markedAsDoneTime;
        }

        public TaskResponseObjectQueryParam markedAsDoneTime(String markedAsDoneTime) {
            this.markedAsDoneTime = markedAsDoneTime;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TaskResponseObjectQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    title: ").append(toIndentedString(title)).append("\n");
            sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    parentTaskId: ").append(toIndentedString(parentTaskId)).append("\n");
            sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
            sb.append("    done: ").append(toIndentedString(done)).append("\n");
            sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
            sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
            sb.append("    markedAsDoneTime: ").append(toIndentedString(markedAsDoneTime)).append("\n");
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
