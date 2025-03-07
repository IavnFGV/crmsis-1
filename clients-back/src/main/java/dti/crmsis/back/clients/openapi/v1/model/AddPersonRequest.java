package dti.crmsis.back.clients.openapi.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dti.crmsis.back.clients.openapi.v1.model.BasicPersonRequestEmailInner;
import dti.crmsis.back.clients.openapi.v1.model.PersonAllOfPhoneInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddPersonRequest  {

    /**
      * The name of the person
     **/
    private String name;
    /**
      * The ID of the user who will be marked as the owner of this person. When omitted, the authorized user ID will be used.
     **/
    private Integer ownerId;
    /**
      * The ID of the organization this person will belong to
     **/
    private Integer orgId;
    /**
      * An email address as a string or an array of email objects related to the person. The structure of the array is as follows: `[{ \"value\": \"mail@example.com\", \"primary\": \"true\", \"label\": \"main\" }]`. Please note that only `value` is required.
     **/
    private List<BasicPersonRequestEmailInner> email;
    /**
      * A phone number supplied as a string or an array of phone objects related to the person. The structure of the array is as follows: `[{ \"value\": \"12345\", \"primary\": \"true\", \"label\": \"mobile\" }]`. Please note that only `value` is required.
     **/
    private List<PersonAllOfPhoneInner> phone;
    /**
      * The label assigned to the person. When the `label` field is updated, the `label_ids` field value will be overwritten by the `label` field value.
     **/
    private Integer label;
    /**
      * The IDs of labels assigned to the person. When the `label_ids` field is updated, the `label` field value will be set to the first value of the `label_ids` field.
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

        @JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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

    public enum MarketingStatusEnum {
        NO_CONSENT(String.valueOf("no_consent")), UNSUBSCRIBED(String.valueOf("unsubscribed")), SUBSCRIBED(String.valueOf("subscribed")), ARCHIVED(String.valueOf("archived"));

        // caching enum access
        private static final java.util.EnumSet<MarketingStatusEnum> values = java.util.EnumSet.allOf(MarketingStatusEnum.class);

        String value;

        MarketingStatusEnum (String v) {
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
        public static MarketingStatusEnum fromString(String v) {
            for (MarketingStatusEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    private MarketingStatusEnum marketingStatus;
    /**
      * The optional creation date & time of the person in UTC. Format: YYYY-MM-DD HH:MM:SS
     **/
    private String addTime;

    /**
    * The name of the person
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

    public AddPersonRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The ID of the user who will be marked as the owner of this person. When omitted, the authorized user ID will be used.
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

    public AddPersonRequest ownerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
    * The ID of the organization this person will belong to
    * @return orgId
    **/
    @JsonProperty("org_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * Set orgId
     **/
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public AddPersonRequest orgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }

    /**
    * An email address as a string or an array of email objects related to the person. The structure of the array is as follows: `[{ \"value\": \"mail@example.com\", \"primary\": \"true\", \"label\": \"main\" }]`. Please note that only `value` is required.
    * @return email
    **/
    @JsonProperty("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<BasicPersonRequestEmailInner> getEmail() {
        return email;
    }

    /**
     * Set email
     **/
    public void setEmail(List<BasicPersonRequestEmailInner> email) {
        this.email = email;
    }

    public AddPersonRequest email(List<BasicPersonRequestEmailInner> email) {
        this.email = email;
        return this;
    }
    public AddPersonRequest addEmailItem(BasicPersonRequestEmailInner emailItem) {
        if (this.email == null){
            email = new ArrayList<>();
        }
        this.email.add(emailItem);
        return this;
    }

    /**
    * A phone number supplied as a string or an array of phone objects related to the person. The structure of the array is as follows: `[{ \"value\": \"12345\", \"primary\": \"true\", \"label\": \"mobile\" }]`. Please note that only `value` is required.
    * @return phone
    **/
    @JsonProperty("phone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PersonAllOfPhoneInner> getPhone() {
        return phone;
    }

    /**
     * Set phone
     **/
    public void setPhone(List<PersonAllOfPhoneInner> phone) {
        this.phone = phone;
    }

    public AddPersonRequest phone(List<PersonAllOfPhoneInner> phone) {
        this.phone = phone;
        return this;
    }
    public AddPersonRequest addPhoneItem(PersonAllOfPhoneInner phoneItem) {
        if (this.phone == null){
            phone = new ArrayList<>();
        }
        this.phone.add(phoneItem);
        return this;
    }

    /**
    * The label assigned to the person. When the `label` field is updated, the `label_ids` field value will be overwritten by the `label` field value.
    * @return label
    **/
    @JsonProperty("label")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getLabel() {
        return label;
    }

    /**
     * Set label
     **/
    public void setLabel(Integer label) {
        this.label = label;
    }

    public AddPersonRequest label(Integer label) {
        this.label = label;
        return this;
    }

    /**
    * The IDs of labels assigned to the person. When the `label_ids` field is updated, the `label` field value will be set to the first value of the `label_ids` field.
    * @return labelIds
    **/
    @JsonProperty("label_ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getLabelIds() {
        return labelIds;
    }

    /**
     * Set labelIds
     **/
    public void setLabelIds(List<Integer> labelIds) {
        this.labelIds = labelIds;
    }

    public AddPersonRequest labelIds(List<Integer> labelIds) {
        this.labelIds = labelIds;
        return this;
    }
    public AddPersonRequest addLabelIdsItem(Integer labelIdsItem) {
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VisibleToEnum getVisibleTo() {
        return visibleTo;
    }

    /**
     * Set visibleTo
     **/
    public void setVisibleTo(VisibleToEnum visibleTo) {
        this.visibleTo = visibleTo;
    }

    public AddPersonRequest visibleTo(VisibleToEnum visibleTo) {
        this.visibleTo = visibleTo;
        return this;
    }

    /**
    * Get marketingStatus
    * @return marketingStatus
    **/
    @JsonProperty("marketing_status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MarketingStatusEnum getMarketingStatus() {
        return marketingStatus;
    }

    /**
     * Set marketingStatus
     **/
    public void setMarketingStatus(MarketingStatusEnum marketingStatus) {
        this.marketingStatus = marketingStatus;
    }

    public AddPersonRequest marketingStatus(MarketingStatusEnum marketingStatus) {
        this.marketingStatus = marketingStatus;
        return this;
    }

    /**
    * The optional creation date & time of the person in UTC. Format: YYYY-MM-DD HH:MM:SS
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

    public AddPersonRequest addTime(String addTime) {
        this.addTime = addTime;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddPersonRequest {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
        sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
        sb.append("    marketingStatus: ").append(toIndentedString(marketingStatus)).append("\n");
        sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code AddPersonRequest} object that
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

        AddPersonRequest model = (AddPersonRequest) obj;

        return java.util.Objects.equals(name, model.name) &&
        java.util.Objects.equals(ownerId, model.ownerId) &&
        java.util.Objects.equals(orgId, model.orgId) &&
        java.util.Objects.equals(email, model.email) &&
        java.util.Objects.equals(phone, model.phone) &&
        java.util.Objects.equals(label, model.label) &&
        java.util.Objects.equals(labelIds, model.labelIds) &&
        java.util.Objects.equals(visibleTo, model.visibleTo) &&
        java.util.Objects.equals(marketingStatus, model.marketingStatus) &&
        java.util.Objects.equals(addTime, model.addTime);
    }

    /**
     * Returns a hash code for a {@code AddPersonRequest}.
     *
     * @return a hash code value for a {@code AddPersonRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,
        ownerId,
        orgId,
        email,
        phone,
        label,
        labelIds,
        visibleTo,
        marketingStatus,
        addTime);
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
    public static class AddPersonRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("ownerId")
        private Integer ownerId;
        @jakarta.ws.rs.QueryParam("orgId")
        private Integer orgId;
        @jakarta.ws.rs.QueryParam("email")
        private List<BasicPersonRequestEmailInner> email = null;
        @jakarta.ws.rs.QueryParam("phone")
        private List<PersonAllOfPhoneInner> phone = null;
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

        @JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
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

    public enum MarketingStatusEnum {
        NO_CONSENT(String.valueOf("no_consent")), UNSUBSCRIBED(String.valueOf("unsubscribed")), SUBSCRIBED(String.valueOf("subscribed")), ARCHIVED(String.valueOf("archived"));

        // caching enum access
        private static final java.util.EnumSet<MarketingStatusEnum> values = java.util.EnumSet.allOf(MarketingStatusEnum.class);

        String value;

        MarketingStatusEnum (String v) {
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
        public static MarketingStatusEnum fromString(String v) {
            for (MarketingStatusEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
        private MarketingStatusEnum marketingStatus;
        @jakarta.ws.rs.QueryParam("addTime")
        private String addTime;

        /**
        * The name of the person
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

        public AddPersonRequestQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * The ID of the user who will be marked as the owner of this person. When omitted, the authorized user ID will be used.
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

        public AddPersonRequestQueryParam ownerId(Integer ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
        * The ID of the organization this person will belong to
        * @return orgId
        **/
        @JsonProperty("org_id")
        public Integer getOrgId() {
            return orgId;
        }

        /**
         * Set orgId
         **/
        public void setOrgId(Integer orgId) {
            this.orgId = orgId;
        }

        public AddPersonRequestQueryParam orgId(Integer orgId) {
            this.orgId = orgId;
            return this;
        }

        /**
        * An email address as a string or an array of email objects related to the person. The structure of the array is as follows: `[{ \"value\": \"mail@example.com\", \"primary\": \"true\", \"label\": \"main\" }]`. Please note that only `value` is required.
        * @return email
        **/
        @JsonProperty("email")
        public List<BasicPersonRequestEmailInner> getEmail() {
            return email;
        }

        /**
         * Set email
         **/
        public void setEmail(List<BasicPersonRequestEmailInner> email) {
            this.email = email;
        }

        public AddPersonRequestQueryParam email(List<BasicPersonRequestEmailInner> email) {
            this.email = email;
            return this;
        }
        public AddPersonRequestQueryParam addEmailItem(BasicPersonRequestEmailInner emailItem) {
            this.email.add(emailItem);
            return this;
        }

        /**
        * A phone number supplied as a string or an array of phone objects related to the person. The structure of the array is as follows: `[{ \"value\": \"12345\", \"primary\": \"true\", \"label\": \"mobile\" }]`. Please note that only `value` is required.
        * @return phone
        **/
        @JsonProperty("phone")
        public List<PersonAllOfPhoneInner> getPhone() {
            return phone;
        }

        /**
         * Set phone
         **/
        public void setPhone(List<PersonAllOfPhoneInner> phone) {
            this.phone = phone;
        }

        public AddPersonRequestQueryParam phone(List<PersonAllOfPhoneInner> phone) {
            this.phone = phone;
            return this;
        }
        public AddPersonRequestQueryParam addPhoneItem(PersonAllOfPhoneInner phoneItem) {
            this.phone.add(phoneItem);
            return this;
        }

        /**
        * The label assigned to the person. When the `label` field is updated, the `label_ids` field value will be overwritten by the `label` field value.
        * @return label
        **/
        @JsonProperty("label")
        public Integer getLabel() {
            return label;
        }

        /**
         * Set label
         **/
        public void setLabel(Integer label) {
            this.label = label;
        }

        public AddPersonRequestQueryParam label(Integer label) {
            this.label = label;
            return this;
        }

        /**
        * The IDs of labels assigned to the person. When the `label_ids` field is updated, the `label` field value will be set to the first value of the `label_ids` field.
        * @return labelIds
        **/
        @JsonProperty("label_ids")
        public List<Integer> getLabelIds() {
            return labelIds;
        }

        /**
         * Set labelIds
         **/
        public void setLabelIds(List<Integer> labelIds) {
            this.labelIds = labelIds;
        }

        public AddPersonRequestQueryParam labelIds(List<Integer> labelIds) {
            this.labelIds = labelIds;
            return this;
        }
        public AddPersonRequestQueryParam addLabelIdsItem(Integer labelIdsItem) {
            this.labelIds.add(labelIdsItem);
            return this;
        }

        /**
        * Get visibleTo
        * @return visibleTo
        **/
        @JsonProperty("visible_to")
        public VisibleToEnum getVisibleTo() {
            return visibleTo;
        }

        /**
         * Set visibleTo
         **/
        public void setVisibleTo(VisibleToEnum visibleTo) {
            this.visibleTo = visibleTo;
        }

        public AddPersonRequestQueryParam visibleTo(VisibleToEnum visibleTo) {
            this.visibleTo = visibleTo;
            return this;
        }

        /**
        * Get marketingStatus
        * @return marketingStatus
        **/
        @JsonProperty("marketing_status")
        public MarketingStatusEnum getMarketingStatus() {
            return marketingStatus;
        }

        /**
         * Set marketingStatus
         **/
        public void setMarketingStatus(MarketingStatusEnum marketingStatus) {
            this.marketingStatus = marketingStatus;
        }

        public AddPersonRequestQueryParam marketingStatus(MarketingStatusEnum marketingStatus) {
            this.marketingStatus = marketingStatus;
            return this;
        }

        /**
        * The optional creation date & time of the person in UTC. Format: YYYY-MM-DD HH:MM:SS
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

        public AddPersonRequestQueryParam addTime(String addTime) {
            this.addTime = addTime;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AddPersonRequestQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
            sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
            sb.append("    email: ").append(toIndentedString(email)).append("\n");
            sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
            sb.append("    label: ").append(toIndentedString(label)).append("\n");
            sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
            sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
            sb.append("    marketingStatus: ").append(toIndentedString(marketingStatus)).append("\n");
            sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
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
