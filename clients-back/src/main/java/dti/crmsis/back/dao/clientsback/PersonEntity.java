package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import jakarta.persistence.*;

import org.hibernate.annotations.Type;

import java.time.LocalDateTime;

@Entity
@Table(name = "PERSONS")
public class PersonEntity extends PanacheEntityBase implements HasSourceRequestId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE")
    public Long idPipedrive;

    @Column(columnDefinition = "BOOLEAN", name = "ACTIVE_FLAG")
    public Boolean activeFlag;

    @Column(columnDefinition = "DATETIME", name = "ADD_TIME")
    public LocalDateTime addTime;

    @Column(columnDefinition = "VARCHAR(255)", name = "CC_EMAIL")
    public String ccEmail;

    @Column(columnDefinition = "DATETIME", name = "DELETE_TIME")
    public LocalDateTime deleteTime;

    @Column(columnDefinition = "JSON", name = "EMAIL")
    public String email;

    @Column(columnDefinition = "JSON", name = "EMAILS")
    public String emails;

    @Column(columnDefinition = "VARCHAR(255)", name = "FIRST_NAME")
    public String firstName;

    @Column(columnDefinition = "TEXT", name = "LABEL")
    public String label;

    @Column(columnDefinition = "VARCHAR(255)", name = "LAST_NAME")
    public String lastName;

    @Column(columnDefinition = "VARCHAR(255)", name = "NAME")
    public String name;

    @Column(columnDefinition = "BIGINT", name = "ORG_ID")
    public Long orgId;

    @Column(columnDefinition = "BIGINT", name = "OWNER_ID")
    public Long ownerId;

    @Column(columnDefinition = "JSON", name = "PHONE")
    public String phone;

    @Column(columnDefinition = "JSON", name = "PHONES")
    public String phones;

    @Column(columnDefinition = "BIGINT", name = "PICTURE_ID")
    public Long pictureId;

    @Column(columnDefinition = "DATETIME", name = "UPDATE_TIME")
    public LocalDateTime updateTime;

    @Column(columnDefinition = "VARCHAR(255)", name = "VISIBLE_TO")
    public String visibleTo;

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

    @Column(name = "IS_DELETED")
    public Boolean isDeleted = false;
} // close class
