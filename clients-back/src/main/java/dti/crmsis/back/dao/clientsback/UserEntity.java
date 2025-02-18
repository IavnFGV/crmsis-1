package dti.crmsis.back.dao.clientsback;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "USERS")
public class UserEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "ID_PIPEDRIVE", unique = true, nullable = false)
    public Long idPipedrive;

    @Column(name = "NAME", nullable = false)
    public String name;

    @Column(name = "EMAIL", nullable = false, unique = true)
    public String email;

    @Column(name = "LANG")
    public Integer lang;

    @Column(name = "LOCALE")
    public String locale;

    @Column(name = "TIMEZONE_NAME")
    public String timezoneName;

    @Column(name = "TIMEZONE_OFFSET")
    public String timezoneOffset;

    @Column(name = "DEFAULT_CURRENCY")
    public String defaultCurrency;

    @Column(name = "ICON_URL")
    public String iconUrl;

    @Column(name = "ACTIVE_FLAG")
    public Boolean activeFlag;

    @Column(name = "IS_DELETED")
    public Boolean isDeleted;

    @Column(name = "IS_ADMIN")
    public Integer isAdmin;

    @Column(name = "ROLE_ID")
    public Integer roleId;

    @Column(name = "CREATED")
    public LocalDateTime created;

    @Column(name = "HAS_CREATED_COMPANY")
    public Boolean hasCreatedCompany;

    @Column(name = "IS_YOU")
    public Boolean isYou;

//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    public List<UserAccessEntity> access;

    @Column(name = "PHONE")
    public String phone;

    @Column(name = "MODIFIED")
    public LocalDateTime modified;

    @Column(name = "LAST_LOGIN")
    public LocalDateTime lastLogin;
}
