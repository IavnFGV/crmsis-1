package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import java.time.LocalDateTime;




@Entity
@Table(name = "PERSONS")
public class PersonEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE")
    public Integer idPipedrive;


@Column(columnDefinition="BOOLEAN", name="ACTIVE_FLAG")
public Boolean activeFlag;
@Column(columnDefinition="BIGINT", name="OWNER_ID")
public Long ownerId;
@Column(columnDefinition="BIGINT", name="ORG_ID")
public Long orgId;
@Column(columnDefinition="VARCHAR(255)", name="NAME")
public String name;
@Column(columnDefinition="JSON", name="PHONE")
public String phone;
@Column(columnDefinition="JSON", name="EMAIL")
public String email;
@Column(columnDefinition="DATETIME", name="UPDATE_TIME")
public LocalDateTime updateTime;
@Column(columnDefinition="TEXT", name="DELETE_TIME")
public String deleteTime;
@Column(columnDefinition="DATETIME", name="ADD_TIME")
public LocalDateTime addTime;
@Column(columnDefinition="VARCHAR(255)", name="VISIBLE_TO")
public String visibleTo;
@Column(columnDefinition="BIGINT", name="PICTURE_ID")
public Long pictureId;
@Column(columnDefinition="TEXT", name="LABEL")
public String label;
@Column(columnDefinition="VARCHAR(255)", name="CC_EMAIL")
public String ccEmail;
@Column(columnDefinition="VARCHAR(255)", name="43BFE2A67561E910F73E802F02E641DC2BE77F8B")
public String 43bfe2a67561e910f73e802f02e641dc2be77f8b;

    @Type(JsonType.class)
    @Column(columnDefinition = "json", name = "JSON")
    public String json;

    


} //close class