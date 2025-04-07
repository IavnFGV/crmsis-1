package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import jakarta.persistence.*;

import org.hibernate.annotations.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "DEALS")
public class DealEntity extends PanacheEntityBase implements HasSourceRequestId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE")
    public Long idPipedrive;

    @Column(columnDefinition = "DATETIME", name = "ADD_TIME")
    public LocalDateTime addTime;

    @Column(columnDefinition = "DATETIME", name = "ARCHIVE_TIME")
    public LocalDateTime archiveTime;

    @Column(columnDefinition = "TEXT", name = "CHANNEL")
    public String channel;

    @Column(columnDefinition = "BIGINT", name = "CHANNEL_ID")
    public Long channelId;

    @Column(columnDefinition = "DATETIME", name = "CLOSE_TIME")
    public LocalDateTime closeTime;

    @Column(columnDefinition = "BIGINT", name = "CREATOR_USER_ID")
    public Long creatorUserId;

    @Column(columnDefinition = "VARCHAR(255)", name = "CURRENCY")
    public String currency;

    @Column(columnDefinition = "DATE", name = "EXPECTED_CLOSE_DATE")
    public LocalDate expectedCloseDate;

    @Column(columnDefinition = "DATETIME", name = "FIRST_WON_TIME")
    public LocalDateTime firstWonTime;

    @Column(columnDefinition = "BOOLEAN", name = "IS_ARCHIVED")
    public Boolean isArchived;

    @Column(columnDefinition = "VARCHAR(255)", name = "LABEL")
    public String label;

    @Column(columnDefinition = "JSON", name = "LABEL_IDS")
    public String labelIds;

    @Column(columnDefinition = "VARCHAR(255)", name = "LOST_REASON")
    public String lostReason;

    @Column(columnDefinition = "DATETIME", name = "LOST_TIME")
    public LocalDateTime lostTime;

    @Column(columnDefinition = "BIGINT", name = "ORG_ID")
    public Long orgId;

    @Column(columnDefinition = "VARCHAR(255)", name = "ORIGIN")
    public String origin;

    @Column(columnDefinition = "BIGINT", name = "ORIGIN_ID")
    public Long originId;

    @Column(columnDefinition = "BIGINT", name = "OWNER_ID")
    public Long ownerId;

    @Column(columnDefinition = "BIGINT", name = "PERSON_ID")
    public Long personId;

    @Column(columnDefinition = "BIGINT", name = "PIPELINE_ID")
    public Long pipelineId;

    @Column(columnDefinition = "TEXT", name = "PROBABILITY")
    public String probability;

    @Column(columnDefinition = "DATETIME", name = "STAGE_CHANGE_TIME")
    public LocalDateTime stageChangeTime;

    @Column(columnDefinition = "BIGINT", name = "STAGE_ID")
    public Long stageId;

    @Column(columnDefinition = "VARCHAR(255)", name = "STATUS")
    public String status;

    @Column(columnDefinition = "VARCHAR(255)", name = "TITLE")
    public String title;

    @Column(columnDefinition = "DATETIME", name = "UPDATE_TIME")
    public LocalDateTime updateTime;

    @Column(columnDefinition = "BIGINT", name = "USER_ID")
    public Long userId;

    @Column(columnDefinition = "DOUBLE", name = "VALUE")
    public Double value;

    @Column(columnDefinition = "VARCHAR(255)", name = "VISIBLE_TO")
    public String visibleTo;

    @Column(columnDefinition = "DATETIME", name = "WON_TIME")
    public LocalDateTime wonTime;

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
