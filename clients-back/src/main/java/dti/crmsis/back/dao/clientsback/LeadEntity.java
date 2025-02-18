package dti.crmsis.back.dao.clientsback;


import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "LEADS")
public class LeadEntity extends PanacheEntityBase {

    @Id
    @Column(name = "ID", nullable = false, unique = true)
    public UUID id;

    @Column(name = "TITLE", nullable = false)
    public String title;

    @Column(name = "OWNER_ID")
    public Integer ownerId;

    @Column(name = "CREATOR_ID")
    public Integer creatorId;

    @Column(name = "EXPECTED_CLOSE_DATE")
    public LocalDate expectedCloseDate;

    @Column(name = "PERSON_ID")
    public Integer personId;

    @Column(name = "ORGANIZATION_ID")
    public Integer organizationId;

    @Column(name = "IS_ARCHIVED")
    public Boolean isArchived;

    @Column(name = "ARCHIVE_TIME")
    public LocalDateTime archiveTime;

    @Column(name = "SOURCE_NAME")
    public String sourceName;

    @Column(name = "ORIGIN")
    public String origin;

    @Column(name = "ORIGIN_ID")
    public String originId;

    @Column(name = "CHANNEL")
    public String channel;

    @Column(name = "CHANNEL_ID")
    public String channelId;

    @Column(name = "WAS_SEEN")
    public Boolean wasSeen;

    @Column(name = "NEXT_ACTIVITY_ID")
    public Integer nextActivityId;

    @Column(name = "ADD_TIME")
    public LocalDateTime addTime;

    @Column(name = "UPDATE_TIME")
    public LocalDateTime updateTime;

    @Column(name = "VISIBLE_TO")
    public Integer visibleTo;

    @Column(name = "CC_EMAIL")
    public String ccEmail;

    @Column(name = "AMOUNT")
    public Double amount;

    @Column(name = "CURRENCY")
    public String currency;

    @Column(name = "LABEL_IDS")
    public String labelIds;
}

