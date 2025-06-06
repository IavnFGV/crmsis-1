package dti.crmsis.back.dao.pd;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

@Entity
@Table(name="KNOWN_FIELDS")
public class KnownFieldEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "PIPEDRIVE_NAME_IN_JSON")
    public String nameInJson;

    @Column(name = "MAIN_ENTITY_TYPE_NAME")
    public String mainEntityTypeName;

    @Column(columnDefinition = "BOOLEAN", name = "IN_BASE_TABLE")
    public Boolean inBaseTable = false;

    @Column(name = "SOURCE_REQUEST_ID")
    public Long sourceRequestId;

}
