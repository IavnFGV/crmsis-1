package dti.crmsis.back.dao.clientsback;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "EXTRA_INFO")
public class ExtraInfoEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "NAME",unique = true, nullable = false)
    public String name;

    @Column(name = "VALUE")
    public String value;

    public static boolean getBooleanByName(String propertyName) {
        ExtraInfoEntity extraInfoEntity = find("name", propertyName).firstResult();
        if (extraInfoEntity == null) {
            return false;
        }
        return Boolean.parseBoolean(extraInfoEntity.value);
    }

    public static Long getLongByName(String propertyName) {
        ExtraInfoEntity extraInfoEntity = find("name", propertyName).firstResult();
        if (extraInfoEntity == null) {
            return null;
        }
        return Long.parseLong(extraInfoEntity.value);
    }

    public static void saveBoolean(String propertyName, Boolean value) {
        ExtraInfoEntity extraInfoEntity = find("name", propertyName).firstResult();
        if (extraInfoEntity == null) {
            extraInfoEntity = new ExtraInfoEntity();
            extraInfoEntity.name = propertyName;
        }
        extraInfoEntity.value = value.toString();
        extraInfoEntity.persist();
    }


    public static synchronized void saveLong(String propertyName, Long value) {
        ExtraInfoEntity extraInfoEntity = find("name", propertyName).firstResult();
        if (extraInfoEntity == null) {
            extraInfoEntity = new ExtraInfoEntity();
            extraInfoEntity.name = propertyName;
        }
        extraInfoEntity.value = value.toString();
        extraInfoEntity.persist();
    }

}
