package dti.crmsis.back.dao.app;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "DSL_FLOW_CONFIGS")
public class DslFlowConfigEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(columnDefinition = "TINYTEXT", name = "VERSION")
    public String version;

    @Column(columnDefinition = "TEXT", name = "DEFINITION")
    public String definition;

}
