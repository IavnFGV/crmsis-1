package dti.crmsis.back.dao.clientsback;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "PIPELINES")
public class PipelineEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "ID_PIPEDRIVE", unique = true, nullable = false)
    public Long idPipedrive;

    @Column(nullable = false)
    public String name;

    @Column(name = "ORDER_NR")
    public Integer orderNr;

    @Column(name = "IS_DELETED")
    public Boolean isDeleted;

    @Column(name = "IS_DEAL_PROBABILITY_ENABLED")
    public Boolean isDealProbabilityEnabled;

    @Column(name = "ADD_TIME")
    public LocalDateTime addTime;

    @Column(name = "UPDATE_TIME")
    public LocalDateTime updateTime;

    @Column(name = "IS_SELECTED")
    public Boolean isSelected;

    // Panache Query Methods
    public static PipelineEntity findByName(String name) {
        return find("name", name).firstResult();
    }

    public static PipelineEntity findByOrderNr(Integer orderNr) {
        return find("orderNr", orderNr).firstResult();
    }

    public static void deleteByName(String name) {
        delete("name", name);
    }
}
