package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import java.time.LocalDateTime;




@Entity
@Table(name = "PERSON_FIELDS")
public class PersonFieldEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE")
    public Integer idPipedrive;

    @Column(columnDefinition = "VARCHAR(100)", name = "KEY_PIPEDRIVE")
    public String key;

    @Column(columnDefinition = "VARCHAR(255)", name = "NAME_PIPEDRIVE")
    public String name;

    @Column(columnDefinition = "VARCHAR(50)", name = "FIELD_TYPE")
    public String fieldType;

@Column(columnDefinition="BIGINT", name="GROUP_ID")
public Long groupId;
@Column(columnDefinition="BIGINT", name="ORDER_NR")
public Long orderNr;
@Column(columnDefinition="BOOLEAN", name="JSON_COLUMN_FLAG")
public Boolean jsonColumnFlag;
@Column(columnDefinition="DATETIME", name="ADD_TIME")
public LocalDateTime addTime;
@Column(columnDefinition="DATETIME", name="UPDATE_TIME")
public LocalDateTime updateTime;
@Column(columnDefinition="BIGINT", name="LAST_UPDATED_BY_USER_ID")
public Long lastUpdatedByUserId;
@Column(columnDefinition="BOOLEAN", name="EDIT_FLAG")
public Boolean editFlag;
@Column(columnDefinition="BOOLEAN", name="DETAILS_VISIBLE_FLAG")
public Boolean detailsVisibleFlag;
@Column(columnDefinition="BOOLEAN", name="ADD_VISIBLE_FLAG")
public Boolean addVisibleFlag;
@Column(columnDefinition="BOOLEAN", name="IMPORTANT_FLAG")
public Boolean importantFlag;
@Column(columnDefinition="BOOLEAN", name="BULK_EDIT_ALLOWED")
public Boolean bulkEditAllowed;
@Column(columnDefinition="BOOLEAN", name="FILTERING_ALLOWED")
public Boolean filteringAllowed;
@Column(columnDefinition="BOOLEAN", name="SORTABLE_FLAG")
public Boolean sortableFlag;
@Column(columnDefinition="BOOLEAN", name="MANDATORY_FLAG")
public Boolean mandatoryFlag;
@Column(columnDefinition="BOOLEAN", name="SEARCHABLE_FLAG")
public Boolean searchableFlag;
@Column(columnDefinition="TEXT", name="DESCRIPTION")
public String description;
@Column(columnDefinition="BIGINT", name="CREATED_BY_USER_ID")
public Long createdByUserId;
@Column(columnDefinition="BOOLEAN", name="ACTIVE_FLAG")
public Boolean activeFlag;
@Column(columnDefinition="VARCHAR(255)", name="USE_FIELD")
public String useField;
@Column(columnDefinition="VARCHAR(255)", name="LINK")
public String link;
@Column(columnDefinition="JSON", name="OPTIONS")
public String options;
@Column(columnDefinition="VARCHAR(255)", name="AUTOCOMPLETE")
public String autocomplete;
@Column(columnDefinition="VARCHAR(255)", name="DISPLAY_FIELD")
public String displayField;

    @Type(JsonType.class)
    @Column(columnDefinition = "json", name = "JSON")
    public String json;

    


} //close class