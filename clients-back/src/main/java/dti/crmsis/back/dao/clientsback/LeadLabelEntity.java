package dti.crmsis.back.dao.clientsback;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "LEAD_LABELS")
public class LeadLabelEntity extends PanacheEntityBase {

    @Id
    @Column(name = "ID", nullable = false, unique = true)
    public UUID id;

    @Column(name = "NAME", nullable = false)
    public String name;

    @Column(name = "COLOR", nullable = false)
    public String color;

    @Column(name = "ADD_TIME")
    public LocalDateTime addTime;

    @Column(name = "UPDATE_TIME")
    public LocalDateTime updateTime;
}
