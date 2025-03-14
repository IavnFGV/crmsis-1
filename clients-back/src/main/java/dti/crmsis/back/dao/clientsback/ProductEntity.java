package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import java.time.LocalDateTime;




@Entity
@Table(name = "PRODUCTS")
public class ProductEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE")
    public Integer idPipedrive;


@Column(columnDefinition="VARCHAR(255)", name="NAME")
public String name;
@Column(columnDefinition="TEXT", name="CODE")
public String code;
@Column(columnDefinition="TEXT", name="DESCRIPTION")
public String description;
@Column(columnDefinition="TEXT", name="UNIT")
public String unit;
@Column(columnDefinition="BIGINT", name="TAX")
public Long tax;
@Column(columnDefinition="TEXT", name="CATEGORY")
public String category;
@Column(columnDefinition="BOOLEAN", name="ACTIVE_FLAG")
public Boolean activeFlag;
@Column(columnDefinition="BOOLEAN", name="SELECTABLE")
public Boolean selectable;
@Column(columnDefinition="VARCHAR(255)", name="FIRST_CHAR")
public String firstChar;
@Column(columnDefinition="VARCHAR(255)", name="VISIBLE_TO")
public String visibleTo;
@Column(columnDefinition="JSON", name="OWNER_ID")
public String ownerId;
@Column(columnDefinition="TEXT", name="FILES_COUNT")
public String filesCount;
@Column(columnDefinition="DATETIME", name="ADD_TIME")
public LocalDateTime addTime;
@Column(columnDefinition="DATETIME", name="UPDATE_TIME")
public LocalDateTime updateTime;
@Column(columnDefinition="JSON", name="PRICES")
public String prices;
@Column(columnDefinition="JSON", name="PRODUCT_VARIATIONS")
public String productVariations;

    @Type(JsonType.class)
    @Column(columnDefinition = "json", name = "JSON")
    public String json;

    


} //close class