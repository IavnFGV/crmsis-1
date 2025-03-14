package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import java.time.LocalDateTime;


import java.util.UUID;

@Entity
@Table(name = "LEAD_LABELS")
public class LeadLabelEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE")
    public UUID idPipedrive;

@Column(columnDefinition="VARCHAR(255)", name="NAME")
public String name;
@Column(columnDefinition="VARCHAR(255)", name="COLOR")
public String color;
@Column(columnDefinition="VARCHAR(255)", name="ADD_TIME")
public String addTime;
@Column(columnDefinition="VARCHAR(255)", name="UPDATE_TIME")
public String updateTime;

    @Type(JsonType.class)
    @Column(columnDefinition = "json", name = "JSON")
    public String json;

    


} //close class