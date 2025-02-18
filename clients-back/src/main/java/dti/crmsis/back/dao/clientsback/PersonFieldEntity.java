package dti.crmsis.back.dao.clientsback;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "PERSON_FIELDS")
public class PersonFieldEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE", unique = true, nullable = false)
    public Long idPipedrive;

    @Column(name = "KEY", nullable = false)
    public String key;

    @Column(name = "NAME", nullable = false)
    public String name;

    @Column(name = "GROUP_ID")
    public Integer groupId;

    @Column(name = "ORDER_NR")
    public Integer orderNr;

    @Column(name = "FIELD_TYPE", nullable = false)
    public String fieldType;

    @Column(name = "JSON_COLUMN_FLAG")
    public Boolean jsonColumnFlag;

    @Column(name = "ADD_TIME")
    public LocalDateTime addTime;

    @Column(name = "UPDATE_TIME")
    public LocalDateTime updateTime;

    @Column(name = "LAST_UPDATED_BY_USER_ID")
    public Integer lastUpdatedByUserId;

    @Column(name = "EDIT_FLAG")
    public Boolean editFlag;

    @Column(name = "DETAILS_VISIBLE_FLAG")
    public Boolean detailsVisibleFlag;

    @Column(name = "ADD_VISIBLE_FLAG")
    public Boolean addVisibleFlag;

    @Column(name = "IMPORTANT_FLAG")
    public Boolean importantFlag;

    @Column(name = "BULK_EDIT_ALLOWED")
    public Boolean bulkEditAllowed;

    @Column(name = "FILTERING_ALLOWED")
    public Boolean filteringAllowed;

    @Column(name = "SORTABLE_FLAG")
    public Boolean sortableFlag;

    @Column(name = "MANDATORY_FLAG")
    public Boolean mandatoryFlag;

    @Column(name = "SEARCHABLE_FLAG")
    public Boolean searchableFlag;

    @Column(name = "DESCRIPTION")
    public String description;

    @Column(name = "CREATED_BY_USER_ID")
    public Integer createdByUserId;

    @Column(name = "ACTIVE_FLAG")
    public Boolean activeFlag;

//    @OneToMany(mappedBy = "personField", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    public List<PersonFieldOptionEntity> options;
}