package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import jakarta.persistence.*;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "ROLES")
public class RoleEntity extends PanacheEntityBase implements HasSourceRequestId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE")
    public Long idPipedrive;

    @Column(columnDefinition = "BOOLEAN", name = "ACTIVE_FLAG")
    public Boolean activeFlag;

    @Column(columnDefinition = "VARCHAR(255)", name = "ASSIGNMENT_COUNT")
    public String assignmentCount;

    @Column(columnDefinition = "VARCHAR(255)", name = "DESCRIPTION")
    public String description;

    @Column(columnDefinition = "BIGINT", name = "LEVEL")
    public Long level;

    @Column(columnDefinition = "VARCHAR(255)", name = "NAME")
    public String name;

    @Column(columnDefinition = "BIGINT", name = "PARENT_ROLE_ID")
    public Long parentRoleId;

    @Column(columnDefinition = "VARCHAR(255)", name = "SUB_ROLE_COUNT")
    public String subRoleCount;

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
