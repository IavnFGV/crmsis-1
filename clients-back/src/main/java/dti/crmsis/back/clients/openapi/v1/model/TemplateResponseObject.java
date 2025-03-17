package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class TemplateResponseObject  {

    /**
      * The ID of a template
     **/
    private BigDecimal id;
    /**
      * The title of a template
     **/
    private String title;
    /**
      * The description of a template
     **/
    private String description;
    /**
      * The ID of the project board this template is associated with
     **/
    private BigDecimal projectsBoardId;
    /**
      * The ID of a template owner
     **/
    private BigDecimal ownerId;
    /**
      * The creation date and time of the template in UTC. Format: YYYY-MM-DD HH:MM:SS.
     **/
    private String addTime;
    /**
      * The update date and time of the template in UTC. Format: YYYY-MM-DD HH:MM:SS.
     **/
    private String updateTime;

    /**
    * The ID of a template
    * @return id
    **/
    @JsonProperty("id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(BigDecimal id) {
        this.id = id;
    }

    public TemplateResponseObject id(BigDecimal id) {
        this.id = id;
        return this;
    }

    /**
    * The title of a template
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

    public TemplateResponseObject title(String title) {
        this.title = title;
        return this;
    }

    /**
    * The description of a template
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

    public TemplateResponseObject description(String description) {
        this.description = description;
        return this;
    }

    /**
    * The ID of the project board this template is associated with
    * @return projectsBoardId
    **/
    @JsonProperty("projects_board_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getProjectsBoardId() {
        return projectsBoardId;
    }

    /**
     * Set projectsBoardId
     **/
    public void setProjectsBoardId(BigDecimal projectsBoardId) {
        this.projectsBoardId = projectsBoardId;
    }

    public TemplateResponseObject projectsBoardId(BigDecimal projectsBoardId) {
        this.projectsBoardId = projectsBoardId;
        return this;
    }

    /**
    * The ID of a template owner
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

    public TemplateResponseObject ownerId(BigDecimal ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
    * The creation date and time of the template in UTC. Format: YYYY-MM-DD HH:MM:SS.
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

    public TemplateResponseObject addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The update date and time of the template in UTC. Format: YYYY-MM-DD HH:MM:SS.
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

    public TemplateResponseObject updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateResponseObject {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    projectsBoardId: ").append(toIndentedString(projectsBoardId)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code TemplateResponseObject} object that
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

        TemplateResponseObject model = (TemplateResponseObject) obj;

        return java.util.Objects.equals(id, model.id) &&
        java.util.Objects.equals(title, model.title) &&
        java.util.Objects.equals(description, model.description) &&
        java.util.Objects.equals(projectsBoardId, model.projectsBoardId) &&
        java.util.Objects.equals(ownerId, model.ownerId) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(updateTime, model.updateTime);
    }

    /**
     * Returns a hash code for a {@code TemplateResponseObject}.
     *
     * @return a hash code value for a {@code TemplateResponseObject}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id,
        title,
        description,
        projectsBoardId,
        ownerId,
        addTime,
        updateTime);
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
    public static class TemplateResponseObjectQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private BigDecimal id;
        @jakarta.ws.rs.QueryParam("title")
        private String title;
        @jakarta.ws.rs.QueryParam("description")
        private String description;
        @jakarta.ws.rs.QueryParam("projectsBoardId")
        private BigDecimal projectsBoardId;
        @jakarta.ws.rs.QueryParam("ownerId")
        private BigDecimal ownerId;
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        @jakarta.ws.rs.QueryParam("updateTime")
        private String updateTime;

        /**
        * The ID of a template
        * @return id
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        public BigDecimal getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(BigDecimal id) {
            this.id = id;
        }

        public TemplateResponseObjectQueryParam id(BigDecimal id) {
            this.id = id;
            return this;
        }

        /**
        * The title of a template
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

        public TemplateResponseObjectQueryParam title(String title) {
            this.title = title;
            return this;
        }

        /**
        * The description of a template
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

        public TemplateResponseObjectQueryParam description(String description) {
            this.description = description;
            return this;
        }

        /**
        * The ID of the project board this template is associated with
        * @return projectsBoardId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("projects_board_id")
        public BigDecimal getProjectsBoardId() {
            return projectsBoardId;
        }

        /**
         * Set projectsBoardId
         **/
        public void setProjectsBoardId(BigDecimal projectsBoardId) {
            this.projectsBoardId = projectsBoardId;
        }

        public TemplateResponseObjectQueryParam projectsBoardId(BigDecimal projectsBoardId) {
            this.projectsBoardId = projectsBoardId;
            return this;
        }

        /**
        * The ID of a template owner
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

        public TemplateResponseObjectQueryParam ownerId(BigDecimal ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
        * The creation date and time of the template in UTC. Format: YYYY-MM-DD HH:MM:SS.
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

        public TemplateResponseObjectQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The update date and time of the template in UTC. Format: YYYY-MM-DD HH:MM:SS.
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

        public TemplateResponseObjectQueryParam updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TemplateResponseObjectQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    title: ").append(toIndentedString(title)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    projectsBoardId: ").append(toIndentedString(projectsBoardId)).append("\n");
            sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
