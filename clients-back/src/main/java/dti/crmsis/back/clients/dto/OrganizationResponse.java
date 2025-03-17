package dti.crmsis.back.clients.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

public class OrganizationResponse {

    @JsonProperty("success")
    private boolean success;

    @JsonProperty("data")
    private List<Organization> data;

    @JsonProperty("additional_data")
    private AdditionalData additionalData;

    public boolean isSuccess() { return success; }
    public List<Organization> getData() { return data; }
    public String getNextCursor() {
        return additionalData != null ? additionalData.nextCursor : null;
    }

    public static class AdditionalData {
        @JsonProperty("next_cursor")
        private String nextCursor;
    }

    public static class Organization {
        @JsonProperty("id")
        private Long id;

        @JsonProperty("name")
        private String name;

        @JsonProperty("owner_id")
        private Long ownerId;

        @JsonProperty("org_id")
        private Long orgId;

        @JsonProperty("add_time")
        private String addTime;

        @JsonProperty("update_time")
        private String updateTime;

        @JsonProperty("address")
        private Address address;

        @JsonProperty("is_deleted")
        private Boolean isDeleted;

        @JsonProperty("visible_to")
        private Integer visibleTo;

        @JsonProperty("label_ids")
        private List<Integer> labelIds;

        @JsonProperty("custom_fields")
        private Map<String, Object> customFields;

        public Long getId() { return id; }
        public String getName() { return name; }
        public Long getOwnerId() { return ownerId; }
        public Long getOrgId() { return orgId; }
        public String getAddTime() { return addTime; }
        public String getUpdateTime() { return updateTime; }
        public Address getAddress() { return address; }
        public Boolean getIsDeleted() { return isDeleted; }
        public Integer getVisibleTo() { return visibleTo; }
        public List<Integer> getLabelIds() { return labelIds; }
        public Map<String, Object> getCustomFields() { return customFields; }
    }

    public static class Address {
        @JsonProperty("value")
        private String value;

        @JsonProperty("country")
        private String country;

        @JsonProperty("admin_area_level_1")
        private String adminAreaLevel1;

        @JsonProperty("admin_area_level_2")
        private String adminAreaLevel2;

        @JsonProperty("locality")
        private String locality;

        @JsonProperty("sublocality")
        private String sublocality;

        @JsonProperty("route")
        private String route;

        @JsonProperty("street_number")
        private String streetNumber;

        @JsonProperty("postal_code")
        private String postalCode;

        public String getValue() { return value; }
        public String getCountry() { return country; }
        public String getAdminAreaLevel1() { return adminAreaLevel1; }
        public String getAdminAreaLevel2() { return adminAreaLevel2; }
        public String getLocality() { return locality; }
        public String getSublocality() { return sublocality; }
        public String getRoute() { return route; }
        public String getStreetNumber() { return streetNumber; }
        public String getPostalCode() { return postalCode; }
    }
}
