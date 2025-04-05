package dti.crmsis.back.dao.clientsback;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
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

    public static LocalDateTime getDateTime(String propertyName) {
        ExtraInfoEntity extraInfoEntity = find("name", propertyName).firstResult();
        if (extraInfoEntity == null || extraInfoEntity.value == null || extraInfoEntity.value.isBlank()) {
            return null;
        }

        try {
            // Поддерживает Z и смещения
            Instant instant = Instant.parse(extraInfoEntity.value);
            return LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
        } catch (DateTimeParseException e1) {
            try {
                // Если сохранено без смещения — считаем, что это UTC
                LocalDateTime local = LocalDateTime.parse(extraInfoEntity.value, DateTimeFormatter.ISO_DATE_TIME);
                return local;
            } catch (DateTimeParseException e2) {
                throw new IllegalArgumentException("Invalid date format for property '" + propertyName + "': " + extraInfoEntity.value, e2);
            }
        }
    }

    public static synchronized void saveDateTime(String propertyName, LocalDateTime dateTime) {
        ExtraInfoEntity extraInfoEntity = find("name", propertyName).firstResult();
        if (extraInfoEntity == null) {
            extraInfoEntity = new ExtraInfoEntity();
            extraInfoEntity.name = propertyName;
        }

        if (dateTime == null) {
            extraInfoEntity.value = null;
        } else {
            // Сохраняем как UTC ISO-8601 с Z
            extraInfoEntity.value = dateTime.atOffset(ZoneOffset.UTC).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        extraInfoEntity.persist();
    }


}
