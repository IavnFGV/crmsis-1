package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;



@Entity
@Table(name = "DEAL_FIELDS")
public class DealFieldEntity extends PanacheEntityBase {
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


    @Type(JsonType.class)
    @Column(columnDefinition = "json", name = "JSON")
    public String json;

    


} //close class