package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class ProjectResponseObject  {

    /**
      * The ID of the project, generated when the task was created
     **/
    private Integer id;
    /**
      * The title of the project
     **/
    private String title;
    /**
      * The ID of the board this project is associated with
     **/
    private BigDecimal boardId;
    /**
      * The ID of the phase this project is associated with
     **/
    private BigDecimal phaseId;
    /**
      * The description of the project
     **/
    private String description;
    /**
      * The status of the project
     **/
    private String status;
    /**
      * The ID of a project owner
     **/
    private BigDecimal ownerId;
    /**
      * The start date of the project. Format: YYYY-MM-DD.
     **/
    private LocalDate startDate;
    /**
      * The end date of the project. Format: YYYY-MM-DD.
     **/
    private LocalDate endDate;
    /**
      * An array of IDs of the deals this project is associated with
     **/
    private List<Integer> dealIds;
    /**
      * The ID of the organization this project is associated with
     **/
    private BigDecimal orgId;
    /**
      * The ID of the person this project is associated with
     **/
    private BigDecimal personId;
    /**
      * An array of IDs of the labels this project has
     **/
    private List<Integer> labels;
    /**
      * The creation date and time of the project in UTC. Format: YYYY-MM-DD HH:MM:SS.
     **/
    private String addTime;
    /**
      * The update date and time of the project in UTC. Format: YYYY-MM-DD HH:MM:SS.
     **/
    private String updateTime;
    /**
      * The status changed date and time of the project in UTC. Format: YYYY-MM-DD HH:MM:SS.
     **/
    private String statusChangeTime;
    /**
      * The archived date and time of the project in UTC. Format: YYYY-MM-DD HH:MM:SS. If not archived then 'null'.
     **/
    private String archiveTime;

    /**
    * The ID of the project, generated when the task was created
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

    public ProjectResponseObject id(Integer id) {
        this.id = id;
        return this;
    }

    /**
    * The title of the project
    * @return title
    **/
    @JsonProperty("title")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTitle() {
        return title;
    }

    /**
     * Set title
     **/
    public void setTitle(String title) {
        this.title = title;
    }

    public ProjectResponseObject title(String title) {
        this.title = title;
        return this;
    }

    /**
    * The ID of the board this project is associated with
    * @return boardId
    **/
    @JsonProperty("board_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getBoardId() {
        return boardId;
    }

    /**
     * Set boardId
     **/
    public void setBoardId(BigDecimal boardId) {
        this.boardId = boardId;
    }

    public ProjectResponseObject boardId(BigDecimal boardId) {
        this.boardId = boardId;
        return this;
    }

    /**
    * The ID of the phase this project is associated with
    * @return phaseId
    **/
    @JsonProperty("phase_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getPhaseId() {
        return phaseId;
    }

    /**
     * Set phaseId
     **/
    public void setPhaseId(BigDecimal phaseId) {
        this.phaseId = phaseId;
    }

    public ProjectResponseObject phaseId(BigDecimal phaseId) {
        this.phaseId = phaseId;
        return this;
    }

    /**
    * The description of the project
    * @return description
    **/
    @JsonProperty("description")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Set description
     **/
    public void setDescription(String description) {
        this.description = description;
    }

    public ProjectResponseObject description(String description) {
        this.description = description;
        return this;
    }

    /**
    * The status of the project
    * @return status
    **/
    @JsonProperty("status")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Set status
     **/
    public void setStatus(String status) {
        this.status = status;
    }

    public ProjectResponseObject status(String status) {
        this.status = status;
        return this;
    }

    /**
    * The ID of a project owner
    * @return ownerId
    **/
    @JsonProperty("owner_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getOwnerId() {
        return ownerId;
    }

    /**
     * Set ownerId
     **/
    public void setOwnerId(BigDecimal ownerId) {
        this.ownerId = ownerId;
    }

    public ProjectResponseObject ownerId(BigDecimal ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
    * The start date of the project. Format: YYYY-MM-DD.
    * @return startDate
    **/
    @JsonProperty("start_date")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * Set startDate
     **/
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public ProjectResponseObject startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
    * The end date of the project. Format: YYYY-MM-DD.
    * @return endDate
    **/
    @JsonProperty("end_date")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * Set endDate
     **/
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public ProjectResponseObject endDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
    * An array of IDs of the deals this project is associated with
    * @return dealIds
    **/
    @JsonProperty("deal_ids")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Integer> getDealIds() {
        return dealIds;
    }

    /**
     * Set dealIds
     **/
    public void setDealIds(List<Integer> dealIds) {
        this.dealIds = dealIds;
    }

    public ProjectResponseObject dealIds(List<Integer> dealIds) {
        this.dealIds = dealIds;
        return this;
    }
    public ProjectResponseObject addDealIdsItem(Integer dealIdsItem) {
        if (this.dealIds == null){
            dealIds = new ArrayList<>();
        }
        this.dealIds.add(dealIdsItem);
        return this;
    }

    /**
    * The ID of the organization this project is associated with
    * @return orgId
    **/
    @JsonProperty("org_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getOrgId() {
        return orgId;
    }

    /**
     * Set orgId
     **/
    public void setOrgId(BigDecimal orgId) {
        this.orgId = orgId;
    }

    public ProjectResponseObject orgId(BigDecimal orgId) {
        this.orgId = orgId;
        return this;
    }

    /**
    * The ID of the person this project is associated with
    * @return personId
    **/
    @JsonProperty("person_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getPersonId() {
        return personId;
    }

    /**
     * Set personId
     **/
    public void setPersonId(BigDecimal personId) {
        this.personId = personId;
    }

    public ProjectResponseObject personId(BigDecimal personId) {
        this.personId = personId;
        return this;
    }

    /**
    * An array of IDs of the labels this project has
    * @return labels
    **/
    @JsonProperty("labels")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Integer> getLabels() {
        return labels;
    }

    /**
     * Set labels
     **/
    public void setLabels(List<Integer> labels) {
        this.labels = labels;
    }

    public ProjectResponseObject labels(List<Integer> labels) {
        this.labels = labels;
        return this;
    }
    public ProjectResponseObject addLabelsItem(Integer labelsItem) {
        if (this.labels == null){
            labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
    * The creation date and time of the project in UTC. Format: YYYY-MM-DD HH:MM:SS.
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

    public ProjectResponseObject addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The update date and time of the project in UTC. Format: YYYY-MM-DD HH:MM:SS.
    * @return updateTime
    **/
    @JsonProperty("update_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Set updateTime
     **/
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ProjectResponseObject updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
    * The status changed date and time of the project in UTC. Format: YYYY-MM-DD HH:MM:SS.
    * @return statusChangeTime
    **/
    @JsonProperty("status_change_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getStatusChangeTime() {
        return statusChangeTime;
    }

    /**
     * Set statusChangeTime
     **/
    public void setStatusChangeTime(String statusChangeTime) {
        this.statusChangeTime = statusChangeTime;
    }

    public ProjectResponseObject statusChangeTime(String statusChangeTime) {
        this.statusChangeTime = statusChangeTime;
        return this;
    }

    /**
    * The archived date and time of the project in UTC. Format: YYYY-MM-DD HH:MM:SS. If not archived then 'null'.
    * @return archiveTime
    **/
    @JsonProperty("archive_time")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getArchiveTime() {
        return archiveTime;
    }

    /**
     * Set archiveTime
     **/
    public void setArchiveTime(String archiveTime) {
        this.archiveTime = archiveTime;
    }

    public ProjectResponseObject archiveTime(String archiveTime) {
        this.archiveTime = archiveTime;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectResponseObject {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
        sb.append("    phaseId: ").append(toIndentedString(phaseId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    dealIds: ").append(toIndentedString(dealIds)).append("\n");
        sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
        sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    statusChangeTime: ").append(toIndentedString(statusChangeTime)).append("\n");
        sb.append("    archiveTime: ").append(toIndentedString(archiveTime)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code ProjectResponseObject} object that
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

        ProjectResponseObject model = (ProjectResponseObject) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(title, model.title) &&
        java.util.Objects.equals(boardId, model.boardId) &&
        java.util.Objects.equals(phaseId, model.phaseId) &&
        java.util.Objects.equals(description, model.description) &&
        java.util.Objects.equals(status, model.status) &&
        java.util.Objects.equals(ownerId, model.ownerId) &&
        java.util.Objects.equals(startDate, model.startDate) &&
        java.util.Objects.equals(endDate, model.endDate) &&
        java.util.Objects.equals(dealIds, model.dealIds) &&
        java.util.Objects.equals(orgId, model.orgId) &&
        java.util.Objects.equals(personId, model.personId) &&
        java.util.Objects.equals(labels, model.labels) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime) &&
        java.util.Objects.equals(statusChangeTime, model.statusChangeTime) &&
        java.util.Objects.equals(archiveTime, model.archiveTime);
    }

    /**
     * Returns a hash code for a {@code ProjectResponseObject}.
     *
     * @return a hash code value for a {@code ProjectResponseObject}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        title,
        boardId,
        phaseId,
        description,
        status,
        ownerId,
        startDate,
        endDate,
        dealIds,
        orgId,
        personId,
        labels,
        addTime,
        updateTime,
        statusChangeTime,
        archiveTime);
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
    public static class ProjectResponseObjectQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("title")
        private String title;
        @jakarta.ws.rs.QueryParam("boardId")
        private BigDecimal boardId;
        @jakarta.ws.rs.QueryParam("phaseId")
        private BigDecimal phaseId;
        @jakarta.ws.rs.QueryParam("description")
        private String description;
        @jakarta.ws.rs.QueryParam("status")
        private String status;
        @jakarta.ws.rs.QueryParam("ownerId")
        private BigDecimal ownerId;
        @jakarta.ws.rs.QueryParam("startDate")
        private LocalDate startDate;
        @jakarta.ws.rs.QueryParam("endDate")
        private LocalDate endDate;
        @jakarta.ws.rs.QueryParam("dealIds")
        private List<Integer> dealIds = null;
        @jakarta.ws.rs.QueryParam("orgId")
        private BigDecimal orgId;
        @jakarta.ws.rs.QueryParam("personId")
        private BigDecimal personId;
        @jakarta.ws.rs.QueryParam("labels")
        private List<Integer> labels = null;
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        @jakarta.ws.rs.QueryParam("updateTime")
        private String updateTime;
        @jakarta.ws.rs.QueryParam("statusChangeTime")
        private String statusChangeTime;
        @jakarta.ws.rs.QueryParam("archiveTime")
        private String archiveTime;

        /**
        * The ID of the project, generated when the task was created
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

        public ProjectResponseObjectQueryParam id(Integer id) {
            this.id = id;
            return this;
        }

        /**
        * The title of the project
        * @return title
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("title")
        public String getTitle() {
            return title;
        }

        /**
         * Set title
         **/
        public void setTitle(String title) {
            this.title = title;
        }

        public ProjectResponseObjectQueryParam title(String title) {
            this.title = title;
            return this;
        }

        /**
        * The ID of the board this project is associated with
        * @return boardId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("board_id")
        public BigDecimal getBoardId() {
            return boardId;
        }

        /**
         * Set boardId
         **/
        public void setBoardId(BigDecimal boardId) {
            this.boardId = boardId;
        }

        public ProjectResponseObjectQueryParam boardId(BigDecimal boardId) {
            this.boardId = boardId;
            return this;
        }

        /**
        * The ID of the phase this project is associated with
        * @return phaseId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("phase_id")
        public BigDecimal getPhaseId() {
            return phaseId;
        }

        /**
         * Set phaseId
         **/
        public void setPhaseId(BigDecimal phaseId) {
            this.phaseId = phaseId;
        }

        public ProjectResponseObjectQueryParam phaseId(BigDecimal phaseId) {
            this.phaseId = phaseId;
            return this;
        }

        /**
        * The description of the project
        * @return description
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        public String getDescription() {
            return description;
        }

        /**
         * Set description
         **/
        public void setDescription(String description) {
            this.description = description;
        }

        public ProjectResponseObjectQueryParam description(String description) {
            this.description = description;
            return this;
        }

        /**
        * The status of the project
        * @return status
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        public String getStatus() {
            return status;
        }

        /**
         * Set status
         **/
        public void setStatus(String status) {
            this.status = status;
        }

        public ProjectResponseObjectQueryParam status(String status) {
            this.status = status;
            return this;
        }

        /**
        * The ID of a project owner
        * @return ownerId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("owner_id")
        public BigDecimal getOwnerId() {
            return ownerId;
        }

        /**
         * Set ownerId
         **/
        public void setOwnerId(BigDecimal ownerId) {
            this.ownerId = ownerId;
        }

        public ProjectResponseObjectQueryParam ownerId(BigDecimal ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
        * The start date of the project. Format: YYYY-MM-DD.
        * @return startDate
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("start_date")
        public LocalDate getStartDate() {
            return startDate;
        }

        /**
         * Set startDate
         **/
        public void setStartDate(LocalDate startDate) {
            this.startDate = startDate;
        }

        public ProjectResponseObjectQueryParam startDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
        * The end date of the project. Format: YYYY-MM-DD.
        * @return endDate
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("end_date")
        public LocalDate getEndDate() {
            return endDate;
        }

        /**
         * Set endDate
         **/
        public void setEndDate(LocalDate endDate) {
            this.endDate = endDate;
        }

        public ProjectResponseObjectQueryParam endDate(LocalDate endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
        * An array of IDs of the deals this project is associated with
        * @return dealIds
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("deal_ids")
        public List<Integer> getDealIds() {
            return dealIds;
        }

        /**
         * Set dealIds
         **/
        public void setDealIds(List<Integer> dealIds) {
            this.dealIds = dealIds;
        }

        public ProjectResponseObjectQueryParam dealIds(List<Integer> dealIds) {
            this.dealIds = dealIds;
            return this;
        }
        public ProjectResponseObjectQueryParam addDealIdsItem(Integer dealIdsItem) {
            this.dealIds.add(dealIdsItem);
            return this;
        }

        /**
        * The ID of the organization this project is associated with
        * @return orgId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("org_id")
        public BigDecimal getOrgId() {
            return orgId;
        }

        /**
         * Set orgId
         **/
        public void setOrgId(BigDecimal orgId) {
            this.orgId = orgId;
        }

        public ProjectResponseObjectQueryParam orgId(BigDecimal orgId) {
            this.orgId = orgId;
            return this;
        }

        /**
        * The ID of the person this project is associated with
        * @return personId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("person_id")
        public BigDecimal getPersonId() {
            return personId;
        }

        /**
         * Set personId
         **/
        public void setPersonId(BigDecimal personId) {
            this.personId = personId;
        }

        public ProjectResponseObjectQueryParam personId(BigDecimal personId) {
            this.personId = personId;
            return this;
        }

        /**
        * An array of IDs of the labels this project has
        * @return labels
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        public List<Integer> getLabels() {
            return labels;
        }

        /**
         * Set labels
         **/
        public void setLabels(List<Integer> labels) {
            this.labels = labels;
        }

        public ProjectResponseObjectQueryParam labels(List<Integer> labels) {
            this.labels = labels;
            return this;
        }
        public ProjectResponseObjectQueryParam addLabelsItem(Integer labelsItem) {
            this.labels.add(labelsItem);
            return this;
        }

        /**
        * The creation date and time of the project in UTC. Format: YYYY-MM-DD HH:MM:SS.
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

        public ProjectResponseObjectQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The update date and time of the project in UTC. Format: YYYY-MM-DD HH:MM:SS.
        * @return updateTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("update_time")
        public String getUpdateTime() {
            return updateTime;
        }

        /**
         * Set updateTime
         **/
        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public ProjectResponseObjectQueryParam updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
        * The status changed date and time of the project in UTC. Format: YYYY-MM-DD HH:MM:SS.
        * @return statusChangeTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("status_change_time")
        public String getStatusChangeTime() {
            return statusChangeTime;
        }

        /**
         * Set statusChangeTime
         **/
        public void setStatusChangeTime(String statusChangeTime) {
            this.statusChangeTime = statusChangeTime;
        }

        public ProjectResponseObjectQueryParam statusChangeTime(String statusChangeTime) {
            this.statusChangeTime = statusChangeTime;
            return this;
        }

        /**
        * The archived date and time of the project in UTC. Format: YYYY-MM-DD HH:MM:SS. If not archived then 'null'.
        * @return archiveTime
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("archive_time")
        public String getArchiveTime() {
            return archiveTime;
        }

        /**
         * Set archiveTime
         **/
        public void setArchiveTime(String archiveTime) {
            this.archiveTime = archiveTime;
        }

        public ProjectResponseObjectQueryParam archiveTime(String archiveTime) {
            this.archiveTime = archiveTime;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ProjectResponseObjectQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    title: ").append(toIndentedString(title)).append("\n");
            sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
            sb.append("    phaseId: ").append(toIndentedString(phaseId)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
            sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
            sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
            sb.append("    dealIds: ").append(toIndentedString(dealIds)).append("\n");
            sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
            sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
            sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
            sb.append("    statusChangeTime: ").append(toIndentedString(statusChangeTime)).append("\n");
            sb.append("    archiveTime: ").append(toIndentedString(archiveTime)).append("\n");
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
