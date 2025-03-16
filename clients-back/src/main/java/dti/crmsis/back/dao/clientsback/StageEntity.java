package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import java.time.LocalDateTime;
import java.time.LocalDate;




@Entity
@Table(name = "STAGES")
public class StageEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE")
    public Integer idPipedrive;


@Column(columnDefinition="BIGINT", name="ORDER_NR")
public Long orderNr;
@Column(columnDefinition="VARCHAR(255)", name="NAME")
public String name;
@Column(columnDefinition="BOOLEAN", name="ACTIVE_FLAG")
public Boolean activeFlag;
@Column(columnDefinition="BIGINT", name="DEAL_PROBABILITY")
public Long dealProbability;
@Column(columnDefinition="BIGINT", name="PIPELINE_ID")
public Long pipelineId;
@Column(columnDefinition="BOOLEAN", name="ROTTEN_FLAG")
public Boolean rottenFlag;
@Column(columnDefinition="TEXT", name="ROTTEN_DAYS")
public String rottenDays;
@Column(columnDefinition="DATETIME", name="ADD_TIME")
public LocalDateTime addTime;
@Column(columnDefinition="DATETIME", name="UPDATE_TIME")
public LocalDateTime updateTime;
@Column(columnDefinition="VARCHAR(255)", name="PIPELINE_NAME")
public String pipelineName;
@Column(columnDefinition="BOOLEAN", name="PIPELINE_DEAL_PROBABILITY")
public Boolean pipelineDealProbability;

    @Type(JsonType.class)
    @Column(columnDefinition = "json", name = "JSON")
    public String json;

    


} //close class