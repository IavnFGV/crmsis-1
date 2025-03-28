package dti.crmsis.back.dao.clientsback;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "DEAL_CUSTOM_FIELDS")
public class DealCustomFieldEntity extends PanacheEntityBase implements HasSourceRequestId{
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

    @Column(name = "SOURCE_REQUEST_ID")
    public Long sourceRequestId;

    @Override
    public void setSourceRequestId(Long sourceRequestId) {
        this.sourceRequestId = sourceRequestId;
    }

    @Override
    public Long getSourceRequestId() {
        return this.sourceRequestId;
    }
}
