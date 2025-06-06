package dti.crmsis.back.dao.pd;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import jakarta.persistence.*;

import org.hibernate.annotations.Type;

import java.time.LocalDateTime;

@Entity
@Table(name = "NOTES")
public class NoteEntity extends PanacheEntityBase implements HasSourceRequestId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE")
    public Long idPipedrive;

    @Column(columnDefinition = "BOOLEAN", name = "ACTIVE_FLAG")
    public Boolean activeFlag;

    @Column(columnDefinition = "DATETIME", name = "ADD_TIME")
    public LocalDateTime addTime;

    @Column(columnDefinition = "TEXT", name = "CONTENT")
    public String content;

    @Column(columnDefinition = "JSON", name = "DEAL")
    public String deal;

    @Column(columnDefinition = "BIGINT", name = "DEAL_ID")
    public Long dealId;

    @Column(columnDefinition = "BIGINT", name = "LAST_UPDATE_USER_ID")
    public Long lastUpdateUserId;

    @Column(columnDefinition = "TEXT", name = "LEAD_TEXT")
    public String lead;

    @Column(columnDefinition = "BIGINT", name = "LEAD_ID")
    public Long leadId;

    @Column(columnDefinition = "BIGINT", name = "ORG_ID")
    public Long orgId;

    @Column(columnDefinition = "TEXT", name = "ORGANIZATION")
    public String organization;

    @Column(columnDefinition = "JSON", name = "PERSON")
    public String person;

    @Column(columnDefinition = "BIGINT", name = "PERSON_ID")
    public Long personId;

    @Column(columnDefinition = "BOOLEAN", name = "PINNED_TO_DEAL_FLAG")
    public Boolean pinnedToDealFlag;

    @Column(columnDefinition = "BOOLEAN", name = "PINNED_TO_LEAD_FLAG")
    public Boolean pinnedToLeadFlag;

    @Column(columnDefinition = "BOOLEAN", name = "PINNED_TO_ORGANIZATION_FLAG")
    public Boolean pinnedToOrganizationFlag;

    @Column(columnDefinition = "BOOLEAN", name = "PINNED_TO_PERSON_FLAG")
    public Boolean pinnedToPersonFlag;

    @Column(columnDefinition = "BIGINT", name = "PROJECT_ID")
    public Long projectId;

    @Column(columnDefinition = "DATETIME", name = "UPDATE_TIME")
    public LocalDateTime updateTime;

    @Column(columnDefinition = "JSON", name = "USER")
    public String user;

    @Column(columnDefinition = "BIGINT", name = "USER_ID")
    public Long userId;

    @Type(JsonType.class)
    @Column(columnDefinition = "json", name = "JSON")
    public String json;

    @Column(name = "SOURCE_REQUEST_ID")
    public Long sourceRequestId;

    @Override
    public void setSourceRequestId(Long sourceRequestId) {
        this.sourceRequestId = sourceRequestId;
    }

    @Override
    public Long getSourceRequestId() {
        return this.sourceRequestId;
    }

    @Column(name = "IS_DELETED")
    public Boolean isDeleted = false;
} // close class
