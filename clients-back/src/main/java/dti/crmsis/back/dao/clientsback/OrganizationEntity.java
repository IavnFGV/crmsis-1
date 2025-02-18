package dti.crmsis.back.dao.clientsback;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Map;

@Entity
@Table(name = "ORGANIZATIONS")
public class OrganizationEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE", unique = true, nullable = false)
    public Long idPipedrive;

    @Column(name = "NAME", nullable = false)
    public String name;

    @Column(name = "ADD_TIME")
    public LocalDateTime addTime;

    @Column(name = "UPDATE_TIME")
    public LocalDateTime updateTime;

    @Column(name = "VISIBLE_TO")
    public Integer visibleTo;

    @Column(name = "OWNER_ID")
    public Integer ownerId;

    @Column(name = "IS_DELETED")
    public Boolean isDeleted;

    @Column(name = "ADDRESS")
    public String address;

//    @ElementCollection
//    @CollectionTable(name = "ORGANIZATION_CUSTOM_FIELDS", joinColumns = @JoinColumn(name = "ORGANIZATION_ID"))
//    @MapKeyColumn(name = "FIELD_KEY")
//    @Column(name = "FIELD_VALUE")
//    public Map<String, String> customFields;

//    @Column(name = "LABEL_IDS")
//    public String labelIds;
}
