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
public class ProjectPutPlanItemBodyObject  {

    /**
      * The ID of a phase on a project board
     **/
    private BigDecimal phaseId;
    /**
      * The ID of a group on a project board
     **/
    private BigDecimal groupId;

    /**
    * The ID of a phase on a project board
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

    public ProjectPutPlanItemBodyObject phaseId(BigDecimal phaseId) {
        this.phaseId = phaseId;
        return this;
    }

    /**
    * The ID of a group on a project board
    * @return groupId
    **/
    @JsonProperty("group_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getGroupId() {
        return groupId;
    }

    /**
     * Set groupId
     **/
    public void setGroupId(BigDecimal groupId) {
        this.groupId = groupId;
    }

    public ProjectPutPlanItemBodyObject groupId(BigDecimal groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectPutPlanItemBodyObject {\n");

        sb.append("    phaseId: ").append(toIndentedString(phaseId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code ProjectPutPlanItemBodyObject} object that
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

        ProjectPutPlanItemBodyObject model = (ProjectPutPlanItemBodyObject) obj;

        return java.util.Objects.equals(phaseId, model.phaseId) &&
        java.util.Objects.equals(groupId, model.groupId);
    }

    /**
     * Returns a hash code for a {@code ProjectPutPlanItemBodyObject}.
     *
     * @return a hash code value for a {@code ProjectPutPlanItemBodyObject}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(phaseId,
        groupId);
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
    public static class ProjectPutPlanItemBodyObjectQueryParam  {

        @jakarta.ws.rs.QueryParam("phaseId")
        private BigDecimal phaseId;
        @jakarta.ws.rs.QueryParam("groupId")
        private BigDecimal groupId;

        /**
        * The ID of a phase on a project board
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

        public ProjectPutPlanItemBodyObjectQueryParam phaseId(BigDecimal phaseId) {
            this.phaseId = phaseId;
            return this;
        }

        /**
        * The ID of a group on a project board
        * @return groupId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("group_id")
        public BigDecimal getGroupId() {
            return groupId;
        }

        /**
         * Set groupId
         **/
        public void setGroupId(BigDecimal groupId) {
            this.groupId = groupId;
        }

        public ProjectPutPlanItemBodyObjectQueryParam groupId(BigDecimal groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ProjectPutPlanItemBodyObjectQueryParam {\n");

            sb.append("    phaseId: ").append(toIndentedString(phaseId)).append("\n");
            sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
