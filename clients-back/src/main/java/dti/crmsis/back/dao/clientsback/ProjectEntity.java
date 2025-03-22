package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import java.time.LocalDateTime;
import java.time.LocalDate;

import java.util.UUID;





@Entity
@Table(name = "PROJECTS")
public class ProjectEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE")
    public Long idPipedrive;




    @Type(JsonType.class)
    @Column(columnDefinition = "json", name = "JSON")
    public String json;

    @Column(name = "CORRELATION_ID")
    public UUID correlationId;

    


} //close class