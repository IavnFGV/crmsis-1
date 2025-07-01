package dti.crmsis.back.dao.app;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "DSL_CONFIGS")
public class DslConfigEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "VERSION", nullable = false)
    public Integer version = 1;

    @Column(columnDefinition = "TINYTEXT", name = "NAME")
    public String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "TYPE", nullable = false)
    public DslConfigEntityType type;

    @Column(columnDefinition = "JSON", name = "DEFINITION")
    public String definition;


    public static List<DslConfigEntity> findConfigsWithMaxVersion(DslConfigEntityType type) {
        return getEntityManager()
                .createNativeQuery(
                        "SELECT t.ID, t.VERSION, t.NAME, t.TYPE, t.DEFINITION FROM DSL_CONFIGS t " +
                        "JOIN ( " +
                        "  SELECT NAME, MAX(VERSION) AS max_version " +
                        "  FROM DSL_CONFIGS " +
                        "  WHERE TYPE = :type " +
                        "  GROUP BY NAME " +
                        ") max_t " +
                        "ON t.NAME = max_t.NAME AND t.VERSION = max_t.max_version " +
                        "WHERE t.TYPE = :type",
                        DslConfigEntity.class
                )
                .setParameter("type", type.name())
                .getResultList();
    }
}
