package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import java.time.LocalDateTime;
import java.time.LocalDate;

import java.util.UUID;





@Entity
@Table(name = "PIPELINES")
public class PipelineEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE")
    public Long idPipedrive;


@Column(columnDefinition="VARCHAR(255)", name="NAME")
public String name;
@Column(columnDefinition="VARCHAR(255)", name="URL_TITLE")
public String urlTitle;
@Column(columnDefinition="BIGINT", name="ORDER_NR")
public Long orderNr;
@Column(columnDefinition="BOOLEAN", name="ACTIVE")
public Boolean active;
@Column(columnDefinition="BOOLEAN", name="DEAL_PROBABILITY")
public Boolean dealProbability;
@Column(columnDefinition="DATETIME", name="ADD_TIME")
public LocalDateTime addTime;
@Column(columnDefinition="DATETIME", name="UPDATE_TIME")
public LocalDateTime updateTime;
@Column(columnDefinition="BOOLEAN", name="SELECTED")
public Boolean selected;

    @Type(JsonType.class)
    @Column(columnDefinition = "json", name = "JSON")
    public String json;

    @Column(name = "CORRELATION_ID")
    public UUID correlationId;

    


} //close class