package dti.crmsis.back.clients.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

public class PersonResponse {

    @JsonProperty("success")
    private boolean success;

    @JsonProperty("data")
    private List<Person> data;

    @JsonProperty("additional_data")
    private AdditionalData additionalData;

    public boolean isSuccess() { return success; }
    public List<Person> getData() { return data; }
    public String getNextCursor() {
        return additionalData != null ? additionalData.nextCursor : null;
    }

    public static class AdditionalData {
        @JsonProperty("next_cursor")
        private String nextCursor;
    }

    public static class Person {
        @JsonProperty("id")
        private Long id;

        @JsonProperty("name")
        private String name;

        @JsonProperty("first_name")
        private String firstName;

        @JsonProperty("last_name")
        private String lastName;

        @JsonProperty("owner_id")
        private Long ownerId;

        @JsonProperty("org_id")
        private Long orgId;

        @JsonProperty("add_time")
        private String addTime;

        @JsonProperty("update_time")
        private String updateTime;

        @JsonProperty("emails")
        private List<Email> emails;

        @JsonProperty("phones")
        private List<Phone> phones;

        @JsonProperty("is_deleted")
        private Boolean isDeleted;

        @JsonProperty("visible_to")
        private Integer visibleTo;

        @JsonProperty("label_ids")
        private List<Integer> labelIds;

        @JsonProperty("picture_id")
        private Long pictureId;

        @JsonProperty("custom_fields")
        private Map<String, Object> customFields;

        @JsonProperty("notes")
        private String notes;

        @JsonProperty("im")
        private List<InstantMessaging> instantMessaging;

        @JsonProperty("birthday")
        private String birthday;

        @JsonProperty("job_title")
        private String jobTitle;

        @JsonProperty("postal_address")
        private Address postalAddress;
    }

    public static class Email {
        @JsonProperty("value")
        private String value;

        @JsonProperty("primary")
        private Boolean primary;

        @JsonProperty("label")
        private String label;
    }

    public static class Phone {
        @JsonProperty("value")
        private String value;

        @JsonProperty("primary")
        private Boolean primary;

        @JsonProperty("label")
        private String label;
    }

    public static class InstantMessaging {
        @JsonProperty("value")
        private String value;

        @JsonProperty("primary")
        private Boolean primary;

        @JsonProperty("label")
        private String label;
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
    }
}
