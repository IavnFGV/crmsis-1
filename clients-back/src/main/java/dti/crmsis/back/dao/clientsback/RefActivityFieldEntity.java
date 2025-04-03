package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import jakarta.persistence.*;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "REF_ACTIVITY_FIELDS")
public class RefActivityFieldEntity extends PanacheEntityBase
        implements RefField, HasSourceRequestId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE")
    public Long idPipedrive;

    @Override
    public String getKey() {
        return key;
    }

    @Column(columnDefinition = "VARCHAR(100)", name = "KEY_PIPEDRIVE")
    public String key;

    @Column(columnDefinition = "VARCHAR(255)", name = "NAME_PIPEDRIVE")
    public String name;

    @Column(columnDefinition = "VARCHAR(50)", name = "FIELD_TYPE")
    public String fieldType;

    @Type(JsonType.class)
    @Column(columnDefinition = "json", name = "JSON")
    public String json;

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
} // close class
