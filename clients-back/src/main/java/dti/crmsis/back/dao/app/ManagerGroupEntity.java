package dti.crmsis.back.dao.app;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "MANAGER_GROUPS")
public class ManagerGroupEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "GROUP_CODE", nullable = false)
    public String groupCode;

    @Column(name = "MANAGER_EMAIL", nullable = false)
    public String managerEmail;
}