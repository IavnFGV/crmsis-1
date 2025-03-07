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

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddProjectRequest  {

    /**
      * The title of the project
     **/
    private String title;
    /**
      * The ID of a project board
     **/
    private BigDecimal boardId;
    /**
      * The ID of a phase on a project board
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
      * The ID of the template the project will be based on
     **/
    private BigDecimal templateId;

    /**
    * The title of the project
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

    public AddProjectRequest title(String title) {
        this.title = title;
        return this;
    }

    /**
    * The ID of a project board
    * @return boardId
    **/
    @JsonProperty("board_id")
    public BigDecimal getBoardId() {
        return boardId;
    }

    /**
     * Set boardId
     **/
    public void setBoardId(BigDecimal boardId) {
        this.boardId = boardId;
    }

    public AddProjectRequest boardId(BigDecimal boardId) {
        this.boardId = boardId;
        return this;
    }

    /**
    * The ID of a phase on a project board
    * @return phaseId
    **/
    @JsonProperty("phase_id")
    public BigDecimal getPhaseId() {
        return phaseId;
    }

    /**
     * Set phaseId
     **/
    public void setPhaseId(BigDecimal phaseId) {
        this.phaseId = phaseId;
    }

    public AddProjectRequest phaseId(BigDecimal phaseId) {
        this.phaseId = phaseId;
        return this;
    }

    /**
    * The description of the project
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

    public AddProjectRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
    * The status of the project
    * @return status
    **/
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Set status
     **/
    public void setStatus(String status) {
        this.status = status;
    }

    public AddProjectRequest status(String status) {
        this.status = status;
        return this;
    }

    /**
    * The ID of a project owner
    * @return ownerId
    **/
    @JsonProperty("owner_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getOwnerId() {
        return ownerId;
    }

    /**
     * Set ownerId
     **/
    public void setOwnerId(BigDecimal ownerId) {
        this.ownerId = ownerId;
    }

    public AddProjectRequest ownerId(BigDecimal ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
    * The start date of the project. Format: YYYY-MM-DD.
    * @return startDate
    **/
    @JsonProperty("start_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * Set startDate
     **/
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public AddProjectRequest startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
    * The end date of the project. Format: YYYY-MM-DD.
    * @return endDate
    **/
    @JsonProperty("end_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * Set endDate
     **/
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public AddProjectRequest endDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
    * An array of IDs of the deals this project is associated with
    * @return dealIds
    **/
    @JsonProperty("deal_ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getDealIds() {
        return dealIds;
    }

    /**
     * Set dealIds
     **/
    public void setDealIds(List<Integer> dealIds) {
        this.dealIds = dealIds;
    }

    public AddProjectRequest dealIds(List<Integer> dealIds) {
        this.dealIds = dealIds;
        return this;
    }
    public AddProjectRequest addDealIdsItem(Integer dealIdsItem) {
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getOrgId() {
        return orgId;
    }

    /**
     * Set orgId
     **/
    public void setOrgId(BigDecimal orgId) {
        this.orgId = orgId;
    }

    public AddProjectRequest orgId(BigDecimal orgId) {
        this.orgId = orgId;
        return this;
    }

    /**
    * The ID of the person this project is associated with
    * @return personId
    **/
    @JsonProperty("person_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getPersonId() {
        return personId;
    }

    /**
     * Set personId
     **/
    public void setPersonId(BigDecimal personId) {
        this.personId = personId;
    }

    public AddProjectRequest personId(BigDecimal personId) {
        this.personId = personId;
        return this;
    }

    /**
    * An array of IDs of the labels this project has
    * @return labels
    **/
    @JsonProperty("labels")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getLabels() {
        return labels;
    }

    /**
     * Set labels
     **/
    public void setLabels(List<Integer> labels) {
        this.labels = labels;
    }

    public AddProjectRequest labels(List<Integer> labels) {
        this.labels = labels;
        return this;
    }
    public AddProjectRequest addLabelsItem(Integer labelsItem) {
        if (this.labels == null){
            labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
    * The ID of the template the project will be based on
    * @return templateId
    **/
    @JsonProperty("template_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getTemplateId() {
        return templateId;
    }

    /**
     * Set templateId
     **/
    public void setTemplateId(BigDecimal templateId) {
        this.templateId = templateId;
    }

    public AddProjectRequest templateId(BigDecimal templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddProjectRequest {\n");

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
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddProjectRequest} object that
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

        AddProjectRequest model = (AddProjectRequest) obj;

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
        java.util.Objects.equals(labels, model.labels) &&
        java.util.Objects.equals(templateId, model.templateId);
    }

    /**
     * Returns a hash code for a {@code AddProjectRequest}.
     *
     * @return a hash code value for a {@code AddProjectRequest}.
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
        labels,
        templateId);
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
    public static class AddProjectRequestQueryParam  {

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
        @jakarta.ws.rs.QueryParam("templateId")
        private BigDecimal templateId;

        /**
        * The title of the project
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

        public AddProjectRequestQueryParam title(String title) {
            this.title = title;
            return this;
        }

        /**
        * The ID of a project board
        * @return boardId
        **/
        @JsonProperty("board_id")
        public BigDecimal getBoardId() {
            return boardId;
        }

        /**
         * Set boardId
         **/
        public void setBoardId(BigDecimal boardId) {
            this.boardId = boardId;
        }

        public AddProjectRequestQueryParam boardId(BigDecimal boardId) {
            this.boardId = boardId;
            return this;
        }

        /**
        * The ID of a phase on a project board
        * @return phaseId
        **/
        @JsonProperty("phase_id")
        public BigDecimal getPhaseId() {
            return phaseId;
        }

        /**
         * Set phaseId
         **/
        public void setPhaseId(BigDecimal phaseId) {
            this.phaseId = phaseId;
        }

        public AddProjectRequestQueryParam phaseId(BigDecimal phaseId) {
            this.phaseId = phaseId;
            return this;
        }

        /**
        * The description of the project
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

        public AddProjectRequestQueryParam description(String description) {
            this.description = description;
            return this;
        }

        /**
        * The status of the project
        * @return status
        **/
        @JsonProperty("status")
        public String getStatus() {
            return status;
        }

        /**
         * Set status
         **/
        public void setStatus(String status) {
            this.status = status;
        }

        public AddProjectRequestQueryParam status(String status) {
            this.status = status;
            return this;
        }

        /**
        * The ID of a project owner
        * @return ownerId
        **/
        @JsonProperty("owner_id")
        public BigDecimal getOwnerId() {
            return ownerId;
        }

        /**
         * Set ownerId
         **/
        public void setOwnerId(BigDecimal ownerId) {
            this.ownerId = ownerId;
        }

        public AddProjectRequestQueryParam ownerId(BigDecimal ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
        * The start date of the project. Format: YYYY-MM-DD.
        * @return startDate
        **/
        @JsonProperty("start_date")
        public LocalDate getStartDate() {
            return startDate;
        }

        /**
         * Set startDate
         **/
        public void setStartDate(LocalDate startDate) {
            this.startDate = startDate;
        }

        public AddProjectRequestQueryParam startDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
        * The end date of the project. Format: YYYY-MM-DD.
        * @return endDate
        **/
        @JsonProperty("end_date")
        public LocalDate getEndDate() {
            return endDate;
        }

        /**
         * Set endDate
         **/
        public void setEndDate(LocalDate endDate) {
            this.endDate = endDate;
        }

        public AddProjectRequestQueryParam endDate(LocalDate endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
        * An array of IDs of the deals this project is associated with
        * @return dealIds
        **/
        @JsonProperty("deal_ids")
        public List<Integer> getDealIds() {
            return dealIds;
        }

        /**
         * Set dealIds
         **/
        public void setDealIds(List<Integer> dealIds) {
            this.dealIds = dealIds;
        }

        public AddProjectRequestQueryParam dealIds(List<Integer> dealIds) {
            this.dealIds = dealIds;
            return this;
        }
        public AddProjectRequestQueryParam addDealIdsItem(Integer dealIdsItem) {
            this.dealIds.add(dealIdsItem);
            return this;
        }

        /**
        * The ID of the organization this project is associated with
        * @return orgId
        **/
        @JsonProperty("org_id")
        public BigDecimal getOrgId() {
            return orgId;
        }

        /**
         * Set orgId
         **/
        public void setOrgId(BigDecimal orgId) {
            this.orgId = orgId;
        }

        public AddProjectRequestQueryParam orgId(BigDecimal orgId) {
            this.orgId = orgId;
            return this;
        }

        /**
        * The ID of the person this project is associated with
        * @return personId
        **/
        @JsonProperty("person_id")
        public BigDecimal getPersonId() {
            return personId;
        }

        /**
         * Set personId
         **/
        public void setPersonId(BigDecimal personId) {
            this.personId = personId;
        }

        public AddProjectRequestQueryParam personId(BigDecimal personId) {
            this.personId = personId;
            return this;
        }

        /**
        * An array of IDs of the labels this project has
        * @return labels
        **/
        @JsonProperty("labels")
        public List<Integer> getLabels() {
            return labels;
        }

        /**
         * Set labels
         **/
        public void setLabels(List<Integer> labels) {
            this.labels = labels;
        }

        public AddProjectRequestQueryParam labels(List<Integer> labels) {
            this.labels = labels;
            return this;
        }
        public AddProjectRequestQueryParam addLabelsItem(Integer labelsItem) {
            this.labels.add(labelsItem);
            return this;
        }

        /**
        * The ID of the template the project will be based on
        * @return templateId
        **/
        @JsonProperty("template_id")
        public BigDecimal getTemplateId() {
            return templateId;
        }

        /**
         * Set templateId
         **/
        public void setTemplateId(BigDecimal templateId) {
            this.templateId = templateId;
        }

        public AddProjectRequestQueryParam templateId(BigDecimal templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddProjectRequestQueryParam {\n");

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
            sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
