package dti.crmsis.back.dao.clientsback;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "PERSONS")
public class PersonEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE", unique = true, nullable = false)
    public Long idPipedrive;

    @Column(name = "NAME", nullable = false)
    public String name;

    @Column(name = "FIRST_NAME")
    public String firstName;

    @Column(name = "LAST_NAME")
    public String lastName;

    @Column(name = "ADD_TIME")
    public LocalDateTime addTime;

    @Column(name = "UPDATE_TIME")
    public LocalDateTime updateTime;

    @Column(name = "VISIBLE_TO")
    public Integer visibleTo;

    @Column(name = "OWNER_ID")
    public Integer ownerId;

    @Column(name = "ORG_ID")
    public Integer orgId;

    @Column(name = "IS_DELETED")
    public Boolean isDeleted;

    @Column(name = "PICTURE_ID")
    public Integer pictureId;

    @ElementCollection
    @CollectionTable(name = "PERSON_CUSTOM_FIELDS", joinColumns = @JoinColumn(name = "PERSON_ID"))
    @MapKeyColumn(name = "FIELD_KEY")
    @Column(name = "FIELD_VALUE")
    public Map<String, String> customFields;

}
