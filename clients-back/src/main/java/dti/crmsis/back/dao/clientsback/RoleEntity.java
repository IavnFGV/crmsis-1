package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import java.time.LocalDateTime;




@Entity
@Table(name = "ROLES")
public class RoleEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE")
    public Integer idPipedrive;


@Column(columnDefinition="BIGINT", name="PARENT_ROLE_ID")
public Long parentRoleId;
@Column(columnDefinition="VARCHAR(255)", name="NAME")
public String name;
@Column(columnDefinition="BOOLEAN", name="ACTIVE_FLAG")
public Boolean activeFlag;
@Column(columnDefinition="VARCHAR(255)", name="ASSIGNMENT_COUNT")
public String assignmentCount;
@Column(columnDefinition="VARCHAR(255)", name="SUB_ROLE_COUNT")
public String subRoleCount;
@Column(columnDefinition="BIGINT", name="LEVEL")
public Long level;
@Column(columnDefinition="VARCHAR(255)", name="DESCRIPTION")
public String description;

    @Type(JsonType.class)
    @Column(columnDefinition = "json", name = "JSON")
    public String json;

    


} //close class