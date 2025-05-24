package dti.crmsis.back.dao.app;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "WORK_WEEKS")
public class Workweek extends PanacheEntity {

    @Column(nullable = false)
    public String type; // individual / shared

    @Column(name = "config_json", columnDefinition = "TEXT")
    public String configJson;

    @Column(name = "created_at")
    public LocalDateTime createdAt = LocalDateTime.now();
}
