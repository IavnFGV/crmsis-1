package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import java.time.LocalDateTime;
import java.time.LocalDate;

import java.util.UUID;





@Entity
@Table(name = "PRODUCTS")
public class ProductEntity extends PanacheEntityBase  implements HasSourceRequestId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE")
    public Long idPipedrive;


@Column(columnDefinition="BOOLEAN", name="ACTIVE_FLAG")
public Boolean activeFlag;
@Column(columnDefinition="DATETIME", name="ADD_TIME")
public LocalDateTime addTime;
@Column(columnDefinition="TEXT", name="CATEGORY")
public String category;
@Column(columnDefinition="TEXT", name="CODE")
public String code;
@Column(columnDefinition="TEXT", name="DESCRIPTION")
public String description;
@Column(columnDefinition="TEXT", name="FILES_COUNT")
public String filesCount;
@Column(columnDefinition="VARCHAR(255)", name="FIRST_CHAR")
public String firstChar;
@Column(columnDefinition="VARCHAR(255)", name="NAME")
public String name;
@Column(columnDefinition="JSON", name="OWNER_ID")
public String ownerId;
@Column(columnDefinition="JSON", name="PRICES")
public String prices;
@Column(columnDefinition="JSON", name="PRODUCT_VARIATIONS")
public String productVariations;
@Column(columnDefinition="BOOLEAN", name="SELECTABLE")
public Boolean selectable;
@Column(columnDefinition="BIGINT", name="TAX")
public Long tax;
@Column(columnDefinition="TEXT", name="UNIT")
public String unit;
@Column(columnDefinition="DATETIME", name="UPDATE_TIME")
public LocalDateTime updateTime;
@Column(columnDefinition="VARCHAR(255)", name="VISIBLE_TO")
public String visibleTo;

    @Type(JsonType.class)
    @Column(columnDefinition = "json", name = "JSON")
    public String json;

    @Column(name = "SOURCE_REQUEST_ID")
    public Long sourceRequestId;

    @Override
    public void setSourceRequestId(Long sourceRequestId){
        this.sourceRequestId = sourceRequestId;
    }

    @Override
    public Long getSourceRequestId(){
        return this.sourceRequestId;
    }

    @Column(name = "IS_DELETED")
    public Boolean isDeleted = false;

    


} //close class