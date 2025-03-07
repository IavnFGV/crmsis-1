package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.util.UUID;

@Entity
@Table(name = "LEADS")
public class LeadEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE", unique = true, nullable = false)
    public UUID idPipedrive;

    @Type(JsonType.class)
    @Column(columnDefinition = "json", name = "JSON")
    public String json;
}