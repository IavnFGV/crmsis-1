package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import jakarta.persistence.*;

import org.hibernate.annotations.Type;

import java.time.LocalDateTime;

@Entity
@Table(name = "USERS")
public class UserEntity extends PanacheEntityBase implements HasSourceRequestId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE")
    public Long idPipedrive;

    @Column(columnDefinition = "TEXT", name = "ACCESS")
    public String access;

    @Column(columnDefinition = "BOOLEAN", name = "ACTIVE_FLAG")
    public Boolean activeFlag;

    @Column(columnDefinition = "DATETIME", name = "CREATED")
    public LocalDateTime created;

    @Column(columnDefinition = "TEXT", name = "DEFAULT_CURRENCY")
    public String defaultCurrency;

    @Column(columnDefinition = "VARCHAR(255)", name = "EMAIL")
    public String email;

    @Column(columnDefinition = "TEXT", name = "ICON_URL")
    public String iconUrl;

    @Column(columnDefinition = "VARCHAR(255)", name = "LANG")
    public String lang;

    @Column(columnDefinition = "DATETIME", name = "LAST_LOGIN")
    public LocalDateTime lastLogin;

    @Column(columnDefinition = "VARCHAR(255)", name = "LOCALE")
    public String locale;

    @Column(columnDefinition = "DATETIME", name = "MODIFIED")
    public LocalDateTime modified;

    @Column(columnDefinition = "VARCHAR(255)", name = "NAME")
    public String name;

    @Column(columnDefinition = "VARCHAR(255)", name = "PHONE")
    public String phone;

    @Column(columnDefinition = "VARCHAR(255)", name = "TIMEZONE_NAME")
    public String timezoneName;

    @Type(JsonType.class)
    @Column(columnDefinition = "json", name = "JSON")
    public String json;

    @Column(name = "SOURCE_REQUEST_ID")
    public Long sourceRequestId;

    @Override
    public void setSourceRequestId(Long sourceRequestId) {
        this.sourceRequestId = sourceRequestId;
    }

    @Override
    public Long getSourceRequestId() {
        return this.sourceRequestId;
    }
} // close class
