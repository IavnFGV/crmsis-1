package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import java.time.LocalDateTime;
import java.time.LocalDate;




@Entity
@Table(name = "ACTIVITY_TYPES")
public class ActivityTypeEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE")
    public Integer idPipedrive;


@Column(columnDefinition="BIGINT", name="ORDER_NR")
public Long orderNr;
@Column(columnDefinition="VARCHAR(255)", name="NAME")
public String name;
@Column(columnDefinition="VARCHAR(255)", name="KEY_STRING")
public String keyString;
@Column(columnDefinition="VARCHAR(255)", name="ICON_KEY")
public String iconKey;
@Column(columnDefinition="BOOLEAN", name="ACTIVE_FLAG")
public Boolean activeFlag;
@Column(columnDefinition="TEXT", name="COLOR")
public String color;
@Column(columnDefinition="BOOLEAN", name="IS_CUSTOM_FLAG")
public Boolean isCustomFlag;
@Column(columnDefinition="DATETIME", name="ADD_TIME")
public LocalDateTime addTime;
@Column(columnDefinition="DATETIME", name="UPDATE_TIME")
public LocalDateTime updateTime;

    @Type(JsonType.class)
    @Column(columnDefinition = "json", name = "JSON")
    public String json;

    


} //close class