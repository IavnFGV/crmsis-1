package dti.crmsis.back.dao.app;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "MANAGER_WORKWEEKS")
@IdClass(ManagerWorkweekId.class)
public class ManagerWorkweek extends PanacheEntityBase {

    @Id
    @Column(name = "manager_id")
    public String managerId;

    @Id
    @Column(name = "workweek_id")
    public Long workweekId;
}