package dti.crmsis.back.dao.clientsback;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;

@Entity
@Table(name = "DEALS")
public class DealEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "ID_PIPEDRIVE", unique = true, nullable = false)
    public Long idPipedrive;

    @Column(nullable = false, name = "TITLE")
    public String title;

    @Column(name = "CREATOR_USER_ID")
    public Long creatorUserId;

    @Column(name = "OWNER_ID")
    public Long ownerId;

    @Column(name = "VALUE")
    public Double value;

    @Column(name = "PERSON_ID")
    public Long personId;

    @Column(name = "ORG_ID")
    public Long organizationId;

    @Column(name = "STAGE_ID")
    public Long stageId;

    @Column(name = "PIPELINE_ID")
    public Long pipelineId;

    @Column(name = "CURRENCY")
    public String currency;

    @Column(name = "ADD_TIME")
    public ZonedDateTime addTime;

    @Column(name = "UPDATE_TIME")
    public ZonedDateTime updateTime;

    @Column(name = "STAGE_CHANGE_TIME")
    public ZonedDateTime stageChangeTime;

    @Column(name = "STATUS")
    public String status;

    @Column(name = "IS_DELETED")
    public Boolean isDeleted;

    @Column(name = "PROBABILITY")
    public Integer probability;

    @Column(name = "LOST_REASON")
    public String lostReason;

    @Column(name = "VISIBLE_TO")
    public Integer visibleTo;

    @Column(name = "CLOSE_TIME")
    public ZonedDateTime closeTime;

    @Column(name = "WON_TIME")
    public ZonedDateTime wonTime;

    @Column(name = "LOST_TIME")
    public ZonedDateTime lostTime;

    @Column(name = "LOCAL_WON_DATE")
    public LocalDate localWonDate;

    @Column(name = "LOCAL_LOST_DATE")
    public LocalDate localLostDate;

    @Column(name = "LOCAL_CLOSE_DATE")
    public LocalDate localCloseDate;

    @Column(name = "EXPECTED_CLOSE_DATE")
    public LocalDate expectedCloseDate;

//    @ElementCollection
//    @CollectionTable(name = "DEAL_LABELS", joinColumns = @JoinColumn(name = "DEAL_ID"))
    @Column(name = "LABEL_IDS_STR")
    public String labelIds;

    @Column(name = "ORIGIN")
    public String origin;

    @Column(name = "ORIGIN_ID")
    public String originId;

    @Column(name = "CHANNEL_ID")
    public String channelId;

    @Column(name = "ACV")
    public Integer acv;

    @Column(name = "ARR")
    public Integer arr;

    @Column(name = "MRR")
    public Integer mrr;

//    @OneToMany(mappedBy = "deal", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @MapKey(name = "key")
//    public Map<String, DealFieldEntity> customFields;

    @Column(name = "custom_fields")
    public String customFields;

    // Panache Helper Methods

    public static DealEntity findByTitle(String title) {
        return find("title", title).firstResult();
    }

    public static List<DealEntity> findByStatus(String status) {
        return list("status", status);
    }

    public static List<DealEntity> findAllDeals() {
        return listAll();
    }

    public static void deleteByTitle(String title) {
        delete("title", title);
    }
}
