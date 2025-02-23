package dti.crmsis.back.dao.clientsback;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "EXTRA_INFO")
public class ExtraInfoEntity extends PanacheEntityBase {

    @Id
    @Column(name = "ID", nullable = false, unique = true)
    public UUID id;

    @Column(name = "NAME")
    public String name;

    @Column(name = "VALUE")
    public String value;

    public static boolean getBooleanByName(String propertyName) {
        ExtraInfoEntity extraInfoEntity =  find("name", propertyName).firstResult();
        if(extraInfoEntity == null) {
            return false;
        }
        return Boolean.parseBoolean(extraInfoEntity.value);
    }

    public static void saveBoolean(String propertyName, Boolean value) {
        ExtraInfoEntity extraInfoEntity = find("name", propertyName).firstResult();
        if (extraInfoEntity == null) {
            extraInfoEntity = new ExtraInfoEntity();
            extraInfoEntity.id = UUID.randomUUID();
            extraInfoEntity.name = propertyName;
        }
        extraInfoEntity.value = value.toString();
        extraInfoEntity.persist();
    }
}
