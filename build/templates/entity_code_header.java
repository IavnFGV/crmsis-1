package dti.crmsis.back.dao.pd;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import java.time.LocalDateTime;
import java.time.LocalDate;

import java.util.UUID;



$SPECIFIC_IMPORTS

@Entity
@Table(name = "$TABLE_NAME")
public class $ENTITY_NAME extends PanacheEntityBase $IMPLEMENTS_INTERFACE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;
