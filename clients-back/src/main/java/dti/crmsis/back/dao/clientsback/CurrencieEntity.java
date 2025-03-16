package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import java.time.LocalDateTime;
import java.time.LocalDate;




@Entity
@Table(name = "CURRENCIES")
public class CurrencieEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE")
    public Integer idPipedrive;


@Column(columnDefinition="VARCHAR(255)", name="CODE")
public String code;
@Column(columnDefinition="VARCHAR(255)", name="NAME")
public String name;
@Column(columnDefinition="VARCHAR(255)", name="SYMBOL")
public String symbol;
@Column(columnDefinition="BIGINT", name="DECIMAL_POINTS")
public Long decimalPoints;
@Column(columnDefinition="BOOLEAN", name="ACTIVE_FLAG")
public Boolean activeFlag;
@Column(columnDefinition="BOOLEAN", name="IS_CUSTOM_FLAG")
public Boolean isCustomFlag;

    @Type(JsonType.class)
    @Column(columnDefinition = "json", name = "JSON")
    public String json;

    


} //close class