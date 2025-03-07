package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class AddOrganizationRequest  {

    /**
      * The name of the organization
     **/
    private String name;
    /**
      * The optional creation date & time of the organization in UTC. Format: YYYY-MM-DD HH:MM:SS
     **/
    private String addTime;
    /**
      * The ID of the user who will be marked as the owner of this organization. When omitted, the authorized user ID will be used.
     **/
    private Integer ownerId;
    /**
      * The label assigned to the organization. When the `label` field is updated, the `label_ids` field value will be overwritten by the `label` field value.
     **/
    private Integer label;
    /**
      * The IDs of labels assigned to the organization. When the `label_ids` field is updated, the `label` field value will be set to the first value of the `label_ids` field.
     **/
    private List<Integer> labelIds;

    public enum VisibleToEnum {
        _1(String.valueOf("1")), _3(String.valueOf("3")), _5(String.valueOf("5")), _7(String.valueOf("7"));

        // caching enum access
        private static final java.util.EnumSet<VisibleToEnum> values = java.util.EnumSet.allOf(VisibleToEnum.class);

        String value;

        VisibleToEnum (String v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static VisibleToEnum fromString(String v) {
            for (VisibleToEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private VisibleToEnum visibleTo;

    /**
    * The name of the organization
    * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public AddOrganizationRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The optional creation date & time of the organization in UTC. Format: YYYY-MM-DD HH:MM:SS
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

    public AddOrganizationRequest addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
    * The ID of the user who will be marked as the owner of this organization. When omitted, the authorized user ID will be used.
    * @return ownerId
    **/
    @JsonProperty("owner_id")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     * Set ownerId
     **/
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public AddOrganizationRequest ownerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
    * The label assigned to the organization. When the `label` field is updated, the `label_ids` field value will be overwritten by the `label` field value.
    * @return label
    **/
    @JsonProperty("label")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getLabel() {
        return label;
    }

    /**
     * Set label
     **/
    public void setLabel(Integer label) {
        this.label = label;
    }

    public AddOrganizationRequest label(Integer label) {
        this.label = label;
        return this;
    }

    /**
    * The IDs of labels assigned to the organization. When the `label_ids` field is updated, the `label` field value will be set to the first value of the `label_ids` field.
    * @return labelIds
    **/
    @JsonProperty("label_ids")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Integer> getLabelIds() {
        return labelIds;
    }

    /**
     * Set labelIds
     **/
    public void setLabelIds(List<Integer> labelIds) {
        this.labelIds = labelIds;
    }

    public AddOrganizationRequest labelIds(List<Integer> labelIds) {
        this.labelIds = labelIds;
        return this;
    }
    public AddOrganizationRequest addLabelIdsItem(Integer labelIdsItem) {
        if (this.labelIds == null){
            labelIds = new ArrayList<>();
        }
        this.labelIds.add(labelIdsItem);
        return this;
    }

    /**
    * Get visibleTo
    * @return visibleTo
    **/
    @JsonProperty("visible_to")
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public VisibleToEnum getVisibleTo() {
        return visibleTo;
    }

    /**
     * Set visibleTo
     **/
    public void setVisibleTo(VisibleToEnum visibleTo) {
        this.visibleTo = visibleTo;
    }

    public AddOrganizationRequest visibleTo(VisibleToEnum visibleTo) {
        this.visibleTo = visibleTo;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddOrganizationRequest {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
        sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddOrganizationRequest} object that
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

        AddOrganizationRequest model = (AddOrganizationRequest) obj;

        return java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(addTime, model.addTime) &&
        java.util.Objects.equals(ownerId, model.ownerId) &&
        java.util.Objects.equals(label, model.label) &&
        java.util.Objects.equals(labelIds, model.labelIds) &&
        java.util.Objects.equals(visibleTo, model.visibleTo);
    }

    /**
     * Returns a hash code for a {@code AddOrganizationRequest}.
     *
     * @return a hash code value for a {@code AddOrganizationRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,
        addTime,
        ownerId,
        label,
        labelIds,
        visibleTo);
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
    public static class AddOrganizationRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;
        @jakarta.ws.rs.QueryParam("ownerId")
        private Integer ownerId;
        @jakarta.ws.rs.QueryParam("label")
        private Integer label;
        @jakarta.ws.rs.QueryParam("labelIds")
        private List<Integer> labelIds = null;

    public enum VisibleToEnum {
        _1(String.valueOf("1")), _3(String.valueOf("3")), _5(String.valueOf("5")), _7(String.valueOf("7"));

        // caching enum access
        private static final java.util.EnumSet<VisibleToEnum> values = java.util.EnumSet.allOf(VisibleToEnum.class);

        String value;

        VisibleToEnum (String v) {
            value = v;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static VisibleToEnum fromString(String v) {
            for (VisibleToEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private VisibleToEnum visibleTo;

        /**
        * The name of the organization
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

        public AddOrganizationRequestQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The optional creation date & time of the organization in UTC. Format: YYYY-MM-DD HH:MM:SS
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

        public AddOrganizationRequestQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
        * The ID of the user who will be marked as the owner of this organization. When omitted, the authorized user ID will be used.
        * @return ownerId
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("owner_id")
        public Integer getOwnerId() {
            return ownerId;
        }

        /**
         * Set ownerId
         **/
        public void setOwnerId(Integer ownerId) {
            this.ownerId = ownerId;
        }

        public AddOrganizationRequestQueryParam ownerId(Integer ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
        * The label assigned to the organization. When the `label` field is updated, the `label_ids` field value will be overwritten by the `label` field value.
        * @return label
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("label")
        public Integer getLabel() {
            return label;
        }

        /**
         * Set label
         **/
        public void setLabel(Integer label) {
            this.label = label;
        }

        public AddOrganizationRequestQueryParam label(Integer label) {
            this.label = label;
            return this;
        }

        /**
        * The IDs of labels assigned to the organization. When the `label_ids` field is updated, the `label` field value will be set to the first value of the `label_ids` field.
        * @return labelIds
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("label_ids")
        public List<Integer> getLabelIds() {
            return labelIds;
        }

        /**
         * Set labelIds
         **/
        public void setLabelIds(List<Integer> labelIds) {
            this.labelIds = labelIds;
        }

        public AddOrganizationRequestQueryParam labelIds(List<Integer> labelIds) {
            this.labelIds = labelIds;
            return this;
        }
        public AddOrganizationRequestQueryParam addLabelIdsItem(Integer labelIdsItem) {
            this.labelIds.add(labelIdsItem);
            return this;
        }

        /**
        * Get visibleTo
        * @return visibleTo
        **/
        @com.fasterxml.jackson.annotation.JsonProperty("visible_to")
        public VisibleToEnum getVisibleTo() {
            return visibleTo;
        }

        /**
         * Set visibleTo
         **/
        public void setVisibleTo(VisibleToEnum visibleTo) {
            this.visibleTo = visibleTo;
        }

        public AddOrganizationRequestQueryParam visibleTo(VisibleToEnum visibleTo) {
            this.visibleTo = visibleTo;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddOrganizationRequestQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
            sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
            sb.append("    label: ").append(toIndentedString(label)).append("\n");
            sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
            sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
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
