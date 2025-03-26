package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import jakarta.persistence.*;

import org.hibernate.annotations.Type;

import java.time.LocalDateTime;

@Entity
@Table(name = "NOTES")
public class NoteEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE")
    public Long idPipedrive;

    @Column(columnDefinition = "BIGINT", name = "ORG_ID")
    public Long orgId;

    @Column(columnDefinition = "TEXT", name = "CONTENT")
    public String content;

    @Column(columnDefinition = "BIGINT", name = "DEAL_ID")
    public Long dealId;

    @Column(columnDefinition = "BIGINT", name = "LEAD_ID")
    public Long leadId;

    @Column(columnDefinition = "BIGINT", name = "USER_ID")
    public Long userId;

    @Column(columnDefinition = "DATETIME", name = "ADD_TIME")
    public LocalDateTime addTime;

    @Column(columnDefinition = "BIGINT", name = "PERSON_ID")
    public Long personId;

    @Column(columnDefinition = "BIGINT", name = "PROJECT_ID")
    public Long projectId;

    @Column(columnDefinition = "BOOLEAN", name = "ACTIVE_FLAG")
    public Boolean activeFlag;

    @Column(columnDefinition = "DATETIME", name = "UPDATE_TIME")
    public LocalDateTime updateTime;

    @Column(columnDefinition = "BOOLEAN", name = "PINNED_TO_DEAL_FLAG")
    public Boolean pinnedToDealFlag;

    @Column(columnDefinition = "BOOLEAN", name = "PINNED_TO_PERSON_FLAG")
    public Boolean pinnedToPersonFlag;

    @Column(columnDefinition = "BOOLEAN", name = "PINNED_TO_ORGANIZATION_FLAG")
    public Boolean pinnedToOrganizationFlag;

    @Type(JsonType.class)
    @Column(columnDefinition = "json", name = "JSON")
    public String json;

    @Column(name = "PROCESS_REPORT_ID")
    public Long processReportId;
} // close class
