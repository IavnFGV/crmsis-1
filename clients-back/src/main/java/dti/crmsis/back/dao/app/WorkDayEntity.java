package dti.crmsis.back.dao.app;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "WORK_DAYS")
public class WorkDayEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name="NAME",nullable = false, unique = true)
    public String name;

    @Enumerated(EnumType.STRING)
    @Column(name="TYPE",nullable = false)
    public WorkDayType type;

    @Column(name = "PRIORITY",nullable = false)
    public Integer priority;

    @Column(name = "TIMEZONE", nullable = false)
    public String timeZone = "Europe/Kyiv";

    @Column(name="CONFIG_JSON",nullable = false, columnDefinition = "json")
    public String configJson;
}
