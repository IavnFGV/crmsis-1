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
public class GetProjectPlanResponseDataInner  {

    /**
      * ID of plan item (either activity or task ID)
     **/
    private BigDecimal itemId;
    /**
      * Type of a plan item (task / activity)
     **/
    private String itemType;
    /**
      * The ID of the board this project is associated with. If null then plan item is not in any phase.
     **/
    private BigDecimal phaseId;
    /**
      * The ID of the board this project is associated with. If null then plan item is not in any group.
     **/
    private BigDecimal groupId;

    /**
    * ID of plan item (either activity or task ID)
    * @return itemId
    **/
    @JsonProperty("item_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public BigDecimal getItemId() {
        return itemId;
    }

    /**
     * Set itemId
     **/
    public void setItemId(BigDecimal itemId) {
        this.itemId = itemId;
    }

    public GetProjectPlanResponseDataInner itemId(BigDecimal itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
    * Type of a plan item (task / activity)
    * @return itemType
    **/
    @JsonProperty("item_type")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getItemType() {
        return itemType;
    }

    /**
     * Set itemType
     **/
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public GetProjectPlanResponseDataInner itemType(String itemType) {
        this.itemType = itemType;
        return this;
    }

    /**
    * The ID of the board this project is associated with. If null then plan item is not in any phase.
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

    public GetProjectPlanResponseDataInner phaseId(BigDecimal phaseId) {
        this.phaseId = phaseId;
        return this;
    }

    /**
    * The ID of the board this project is associated with. If null then plan item is not in any group.
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

    public GetProjectPlanResponseDataInner groupId(BigDecimal groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetProjectPlanResponseDataInner {\n");

        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
        sb.append("    phaseId: ").append(toIndentedString(phaseId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GetProjectPlanResponseDataInner} object that
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

        GetProjectPlanResponseDataInner model = (GetProjectPlanResponseDataInner) obj;

        return java.util.Objects.equals(itemId, model.itemId) &&
        java.util.Objects.equals(itemType, model.itemType) &&
        java.util.Objects.equals(phaseId, model.phaseId) &&
        java.util.Objects.equals(groupId, model.groupId);
    }

    /**
     * Returns a hash code for a {@code GetProjectPlanResponseDataInner}.
     *
     * @return a hash code value for a {@code GetProjectPlanResponseDataInner}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(itemId,
        itemType,
        phaseId,
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
    public static class GetProjectPlanResponseDataInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("itemId")
        private BigDecimal itemId;
        @jakarta.ws.rs.QueryParam("itemType")
        private String itemType;
        @jakarta.ws.rs.QueryParam("phaseId")
        private BigDecimal phaseId;
        @jakarta.ws.rs.QueryParam("groupId")
        private BigDecimal groupId;

        /**
        * ID of plan item (either activity or task ID)
        * @return itemId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("item_id")
        public BigDecimal getItemId() {
            return itemId;
        }

        /**
         * Set itemId
         **/
        public void setItemId(BigDecimal itemId) {
            this.itemId = itemId;
        }

        public GetProjectPlanResponseDataInnerQueryParam itemId(BigDecimal itemId) {
            this.itemId = itemId;
            return this;
        }

        /**
        * Type of a plan item (task / activity)
        * @return itemType
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("item_type")
        public String getItemType() {
            return itemType;
        }

        /**
         * Set itemType
         **/
        public void setItemType(String itemType) {
            this.itemType = itemType;
        }

        public GetProjectPlanResponseDataInnerQueryParam itemType(String itemType) {
            this.itemType = itemType;
            return this;
        }

        /**
        * The ID of the board this project is associated with. If null then plan item is not in any phase.
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

        public GetProjectPlanResponseDataInnerQueryParam phaseId(BigDecimal phaseId) {
            this.phaseId = phaseId;
            return this;
        }

        /**
        * The ID of the board this project is associated with. If null then plan item is not in any group.
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

        public GetProjectPlanResponseDataInnerQueryParam groupId(BigDecimal groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetProjectPlanResponseDataInnerQueryParam {\n");

            sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
            sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
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
