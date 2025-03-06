package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.time.ZonedDateTime;
import java.util.List;

@Entity
@Table(name = "STAGES")
public class StageEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "ID_PIPEDRIVE", unique = true, nullable = false)
    public Long idPipedrive;

    @Type(JsonType.class)
    @Column(columnDefinition = "json",name = "JSON")
    public String json;

    @Column(name = "ORDER_NR", nullable = false)
    public Integer orderNr;

    @Column(nullable = false, name = "NAME")
    public String name;

    @Column(name = "IS_DELETED")
    public Boolean isDeleted;

    @Column(name = "DEAL_PROBABILITY")
    public Integer dealProbability;

    @Column(name = "PIPELINE_ID")
    public Long pipelineId;

    @Column(name = "IS_DEAL_ROT_ENABLED")
    public Boolean isDealRotEnabled;

    @Column(name = "DAYS_TO_ROTTEN")
    public Integer daysToRotten;

    @Column(name = "ADD_TIME")
    public ZonedDateTime addTime;

    @Column(name = "UPDATE_TIME")
    public ZonedDateTime updateTime;

    // Panache Query Methods
    public static StageEntity findByName(String name) {
        return find("name", name).firstResult();
    }

    public static List<StageEntity> findByPipelineId(Long pipelineId) {
        return list("pipelineId", pipelineId);
    }

    public static void deleteByName(String name) {
        delete("name", name);
    }
}
