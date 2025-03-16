package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import java.time.LocalDateTime;
import java.time.LocalDate;


$SPECIFIC_IMPORTS

@Entity
@Table(name = "$TABLE_NAME")
public class $ENTITY_NAME extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;
