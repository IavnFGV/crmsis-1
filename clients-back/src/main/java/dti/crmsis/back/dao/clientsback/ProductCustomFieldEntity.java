package dti.crmsis.back.dao.clientsback;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "PRODUCT_CUSTOM_FIELDS")
public class ProductCustomFieldEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "MAIN_ENTITY_PIPEDRIVE_ID")
    public Long mainEntityId;

    @Column(name = "PIPEDRIVE_KEY")
    public String key;

    @Column(name = "TYPE")
    public String type;

    @Column(columnDefinition = "VARCHAR(512)" , name = "STRING_VALUE")
    public String value;

    @Column(name = "CORRELATION_ID")
    public UUID correlationId;
}
