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
public class UpdateProjectRequest  {

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

    public UpdateProjectRequest title(String title) {
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

    public UpdateProjectRequest boardId(BigDecimal boardId) {
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

    public UpdateProjectRequest phaseId(BigDecimal phaseId) {
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

    public UpdateProjectRequest description(String description) {
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

    public UpdateProjectRequest status(String status) {
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

    public UpdateProjectRequest ownerId(BigDecimal ownerId) {
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

    public UpdateProjectRequest startDate(LocalDate startDate) {
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

    public UpdateProjectRequest endDate(LocalDate endDate) {
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

    public UpdateProjectRequest dealIds(List<Integer> dealIds) {
        this.dealIds = dealIds;
        return this;
    }
    public UpdateProjectRequest addDealIdsItem(Integer dealIdsItem) {
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

    public UpdateProjectRequest orgId(BigDecimal orgId) {
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

    public UpdateProjectRequest personId(BigDecimal personId) {
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

    public UpdateProjectRequest labels(List<Integer> labels) {
        this.labels = labels;
        return this;
    }
    public UpdateProjectRequest addLabelsItem(Integer labelsItem) {
        if (this.labels == null){
            labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateProjectRequest {\n");

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
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code UpdateProjectRequest} object that
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

        UpdateProjectRequest model = (UpdateProjectRequest) obj;

        return java.util.Objects.equals(title, model.title) &&
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
        java.util.Objects.equals(labels, model.labels);
    }

    /**
     * Returns a hash code for a {@code UpdateProjectRequest}.
     *
     * @return a hash code value for a {@code UpdateProjectRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(title,
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
        labels);
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
    public static class UpdateProjectRequestQueryParam  {

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

        public UpdateProjectRequestQueryParam title(String title) {
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

        public UpdateProjectRequestQueryParam boardId(BigDecimal boardId) {
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

        public UpdateProjectRequestQueryParam phaseId(BigDecimal phaseId) {
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

        public UpdateProjectRequestQueryParam description(String description) {
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

        public UpdateProjectRequestQueryParam status(String status) {
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

        public UpdateProjectRequestQueryParam ownerId(BigDecimal ownerId) {
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

        public UpdateProjectRequestQueryParam startDate(LocalDate startDate) {
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

        public UpdateProjectRequestQueryParam endDate(LocalDate endDate) {
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

        public UpdateProjectRequestQueryParam dealIds(List<Integer> dealIds) {
            this.dealIds = dealIds;
            return this;
        }
        public UpdateProjectRequestQueryParam addDealIdsItem(Integer dealIdsItem) {
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

        public UpdateProjectRequestQueryParam orgId(BigDecimal orgId) {
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

        public UpdateProjectRequestQueryParam personId(BigDecimal personId) {
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

        public UpdateProjectRequestQueryParam labels(List<Integer> labels) {
            this.labels = labels;
            return this;
        }
        public UpdateProjectRequestQueryParam addLabelsItem(Integer labelsItem) {
            this.labels.add(labelsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class UpdateProjectRequestQueryParam {\n");

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
