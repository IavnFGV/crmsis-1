package dti.crmsis.back.dao.app;


import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "CALENDAR_ASSIGNMENTS")
public class CalendarAssignmentEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @ManyToOne
    @JoinColumn(name = "CALENDAR_ID", nullable = false)
    public WorkDayEntity calendar;

    @Column(name = "OWNER_TYPE", nullable = false)
    public String ownerType; // USER, PRODUCT, ROLE, GROUP

    @Column(name = "OWNER_ID", nullable = false)
    public String ownerId; // email или groupCode
}


