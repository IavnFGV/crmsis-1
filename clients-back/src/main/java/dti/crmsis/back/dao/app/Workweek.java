package dti.crmsis.back.dao.app;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "WORK_WEEKS")
public class Workweek extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "TITLE", nullable = false, length = 100, unique = true)
    public String title_cyrillic;

    @Column(name = "TITLE_FOR_FLOW", nullable = false, length = 100, unique = true)
    public String title;

    @Column(nullable = false)
    public String type; // individual / shared

    @Column(name = "config_json", columnDefinition = "TEXT")
    public String configJson;

    @Column(name = "created_at")
    public LocalDateTime createdAt = LocalDateTime.now();
}
