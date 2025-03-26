package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import jakarta.persistence.*;

import org.hibernate.annotations.Type;

import java.time.LocalDateTime;

@Entity
@Table(name = "USERS")
public class UserEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE")
    public Long idPipedrive;

    @Column(columnDefinition = "VARCHAR(255)", name = "NAME")
    public String name;

    @Column(columnDefinition = "VARCHAR(255)", name = "EMAIL")
    public String email;

    @Column(columnDefinition = "TEXT", name = "LANG")
    public String lang;

    @Column(columnDefinition = "VARCHAR(255)", name = "LOCALE")
    public String locale;

    @Column(columnDefinition = "VARCHAR(255)", name = "TIMEZONE_NAME")
    public String timezoneName;

    @Column(columnDefinition = "VARCHAR(255)", name = "TIMEZONE_OFFSET")
    public String timezoneOffset;

    @Column(columnDefinition = "VARCHAR(255)", name = "DEFAULT_CURRENCY")
    public String defaultCurrency;

    @Column(columnDefinition = "TEXT", name = "ICON_URL")
    public String iconUrl;

    @Column(columnDefinition = "BOOLEAN", name = "ACTIVE_FLAG")
    public Boolean activeFlag;

    @Column(columnDefinition = "BOOLEAN", name = "IS_DELETED")
    public Boolean isDeleted;

    @Column(columnDefinition = "BIGINT", name = "IS_ADMIN")
    public Long isAdmin;

    @Column(columnDefinition = "BIGINT", name = "ROLE_ID")
    public Long roleId;

    @Column(columnDefinition = "DATETIME", name = "CREATED")
    public LocalDateTime created;

    @Column(columnDefinition = "BOOLEAN", name = "HAS_CREATED_COMPANY")
    public Boolean hasCreatedCompany;

    @Column(columnDefinition = "BOOLEAN", name = "IS_YOU")
    public Boolean isYou;

    @Column(columnDefinition = "JSON", name = "ACCESS")
    public String access;

    @Column(columnDefinition = "DATETIME", name = "MODIFIED")
    public LocalDateTime modified;

    @Column(columnDefinition = "DATETIME", name = "LAST_LOGIN")
    public LocalDateTime lastLogin;

    @Column(columnDefinition = "VARCHAR(255)", name = "PHONE")
    public String phone;

    @Type(JsonType.class)
    @Column(columnDefinition = "json", name = "JSON")
    public String json;

    @Column(name = "PROCESS_REPORT_ID")
    public Long processReportId;
} // close class
