package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import java.time.LocalDateTime;
import java.time.LocalDate;




@Entity
@Table(name = "DEALS")
public class DealEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE")
    public Integer idPipedrive;


@Column(columnDefinition="BIGINT", name="CREATOR_USER_ID")
public Long creatorUserId;
@Column(columnDefinition="BIGINT", name="USER_ID")
public Long userId;
@Column(columnDefinition="BIGINT", name="PERSON_ID")
public Long personId;
@Column(columnDefinition="BIGINT", name="ORG_ID")
public Long orgId;
@Column(columnDefinition="BIGINT", name="STAGE_ID")
public Long stageId;
@Column(columnDefinition="VARCHAR(255)", name="TITLE")
public String title;
@Column(columnDefinition="DOUBLE", name="VALUE")
public Double value;
@Column(columnDefinition="VARCHAR(255)", name="CURRENCY")
public String currency;
@Column(columnDefinition="DATETIME", name="ADD_TIME")
public LocalDateTime addTime;
@Column(columnDefinition="DATETIME", name="UPDATE_TIME")
public LocalDateTime updateTime;
@Column(columnDefinition="VARCHAR(255)", name="STATUS")
public String status;
@Column(columnDefinition="TEXT", name="PROBABILITY")
public String probability;
@Column(columnDefinition="VARCHAR(255)", name="LOST_REASON")
public String lostReason;
@Column(columnDefinition="VARCHAR(255)", name="VISIBLE_TO")
public String visibleTo;
@Column(columnDefinition="DATETIME", name="CLOSE_TIME")
public LocalDateTime closeTime;
@Column(columnDefinition="BIGINT", name="PIPELINE_ID")
public Long pipelineId;
@Column(columnDefinition="DATETIME", name="WON_TIME")
public LocalDateTime wonTime;
@Column(columnDefinition="DATETIME", name="LOST_TIME")
public LocalDateTime lostTime;
@Column(columnDefinition="DATE", name="EXPECTED_CLOSE_DATE")
public LocalDate expectedCloseDate;
@Column(columnDefinition="VARCHAR(255)", name="LABEL")
public String label;

    @Type(JsonType.class)
    @Column(columnDefinition = "json", name = "JSON")
    public String json;

    


} //close class