package dti.crmsis.back.clients.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class ActivityResponse {

    @JsonProperty("success")
    private boolean success;

    @JsonProperty("data")
    private List<Activity> data;

    @JsonProperty("additional_data")
    private AdditionalData additionalData;

    public boolean isSuccess() {
        return success;
    }

    public List<Activity> getData() {
        return data;
    }

    public String getNextCursor() {
        return additionalData != null ? additionalData.nextCursor : null;
    }

    public static class Activity {
        @JsonProperty("id")
        private Long id;

        @JsonProperty("subject")
        private String subject;

        @JsonProperty("type")
        private String type;

        @JsonProperty("owner_id")
        private Long ownerId;

        @JsonProperty("is_deleted")
        private Boolean isDeleted;

        @JsonProperty("add_time")
        private LocalDateTime addTime;

        @JsonProperty("update_time")
        private LocalDateTime updateTime;

        @JsonProperty("deal_id")
        private Long dealId;

        @JsonProperty("lead_id")
        private String leadId;

        @JsonProperty("person_id")
        private Long personId;

        @JsonProperty("org_id")
        private Long orgId;

        @JsonProperty("project_id")
        private Long projectId;

        @JsonProperty("due_date")
        private LocalDate dueDate;

        @JsonProperty("due_time")
        private String dueTime;

        @JsonProperty("duration")
        private String duration;

        @JsonProperty("busy")
        private Boolean busy;

        @JsonProperty("done")
        private Boolean done;

        @JsonProperty("marked_as_done_time")
        private LocalDateTime markedAsDoneTime;

        @JsonProperty("location")
        private Location location;

        @JsonProperty("participants")
        private List<Participant> participants;

        @JsonProperty("attendees")
        private List<Attendee> attendees;

        @JsonProperty("conference_meeting_client")
        private String conferenceMeetingClient;

        @JsonProperty("conference_meeting_url")
        private String conferenceMeetingUrl;

        @JsonProperty("conference_meeting_id")
        private String conferenceMeetingId;

        @JsonProperty("public_description")
        private String publicDescription;

        @JsonProperty("priority")
        private Integer priority;

        @JsonProperty("note")
        private String note;

        public Long getId() {
            return id;
        }

        public String getSubject() {
            return subject;
        }

        public String getType() {
            return type;
        }

        public Long getOwnerId() {
            return ownerId;
        }

        public Boolean getIsDeleted() {
            return isDeleted;
        }

        public LocalDateTime getAddTime() {
            return addTime;
        }

        public LocalDateTime getUpdateTime() {
            return updateTime;
        }

        public Long getDealId() {
            return dealId;
        }

        public String getLeadId() {
            return leadId;
        }

        public Long getPersonId() {
            return personId;
        }

        public Long getOrgId() {
            return orgId;
        }

        public Long getProjectId() {
            return projectId;
        }

        public LocalDate getDueDate() {
            return dueDate;
        }

        public String getDueTime() {
            return dueTime;
        }

        public String getDuration() {
            return duration;
        }

        public Boolean getBusy() {
            return busy;
        }

        public Boolean getDone() {
            return done;
        }

        public LocalDateTime getMarkedAsDoneTime() {
            return markedAsDoneTime;
        }

        public Location getLocation() {
            return location;
        }

        public List<Participant> getParticipants() {
            return participants;
        }

        public List<Attendee> getAttendees() {
            return attendees;
        }

        public String getConferenceMeetingClient() {
            return conferenceMeetingClient;
        }

        public String getConferenceMeetingUrl() {
            return conferenceMeetingUrl;
        }

        public String getConferenceMeetingId() {
            return conferenceMeetingId;
        }

        public String getPublicDescription() {
            return publicDescription;
        }

        public Integer getPriority() {
            return priority;
        }

        public String getNote() {
            return note;
        }
    }

    public static class Location {
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

        public String getValue() {
            return value;
        }

        public String getCountry() {
            return country;
        }

        public String getAdminAreaLevel1() {
            return adminAreaLevel1;
        }

        public String getAdminAreaLevel2() {
            return adminAreaLevel2;
        }

        public String getLocality() {
            return locality;
        }

        public String getSublocality() {
            return sublocality;
        }

        public String getRoute() {
            return route;
        }

        public String getStreetNumber() {
            return streetNumber;
        }

        public String getPostalCode() {
            return postalCode;
        }
    }

    public static class Participant {
        @JsonProperty("person_id")
        private Long personId;

        @JsonProperty("primary")
        private Boolean primary;

        public Long getPersonId() {
            return personId;
        }

        public Boolean getPrimary() {
            return primary;
        }
    }

    public static class Attendee {
        @JsonProperty("email")
        private String email;

        @JsonProperty("name")
        private String name;

        @JsonProperty("status")
        private String status;

        @JsonProperty("is_organizer")
        private Boolean isOrganizer;

        @JsonProperty("person_id")
        private Long personId;

        @JsonProperty("user_id")
        private Long userId;

        public String getEmail() {
            return email;
        }

        public String getName() {
            return name;
        }

        public String getStatus() {
            return status;
        }

        public Boolean getIsOrganizer() {
            return isOrganizer;
        }

        public Long getPersonId() {
            return personId;
        }

        public Long getUserId() {
            return userId;
        }
    }

    public static class AdditionalData {
        @JsonProperty("next_cursor")
        private String nextCursor;

        public String getNextCursor() {
            return nextCursor;
        }
    }
}
