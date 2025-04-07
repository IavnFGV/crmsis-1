package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import jakarta.persistence.*;

import org.hibernate.annotations.Type;

import java.time.LocalDateTime;

@Entity
@Table(name = "WEBHOOKS")
public class WebhookEntity extends PanacheEntityBase implements HasSourceRequestId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE")
    public Long idPipedrive;

    @Column(columnDefinition = "DATETIME", name = "ADD_TIME")
    public LocalDateTime addTime;

    @Column(columnDefinition = "BIGINT", name = "ADMIN_ID")
    public Long adminId;

    @Column(columnDefinition = "BIGINT", name = "COMPANY_ID")
    public Long companyId;

    @Column(columnDefinition = "VARCHAR(255)", name = "EVENT_ACTION")
    public String eventAction;

    @Column(columnDefinition = "VARCHAR(255)", name = "EVENT_OBJECT")
    public String eventObject;

    @Column(columnDefinition = "TEXT", name = "HTTP_AUTH_PASSWORD")
    public String httpAuthPassword;

    @Column(columnDefinition = "TEXT", name = "HTTP_AUTH_USER")
    public String httpAuthUser;

    @Column(columnDefinition = "BIGINT", name = "IS_ACTIVE")
    public Long isActive;

    @Column(columnDefinition = "DATETIME", name = "LAST_DELIVERY_TIME")
    public LocalDateTime lastDeliveryTime;

    @Column(columnDefinition = "VARCHAR(255)", name = "LAST_HTTP_STATUS")
    public String lastHttpStatus;

    @Column(columnDefinition = "TEXT", name = "NAME")
    public String name;

    @Column(columnDefinition = "BIGINT", name = "OWNER_ID")
    public Long ownerId;

    @Column(columnDefinition = "TEXT", name = "REMOVE_REASON")
    public String removeReason;

    @Column(columnDefinition = "DATETIME", name = "REMOVE_TIME")
    public LocalDateTime removeTime;

    @Column(columnDefinition = "VARCHAR(255)", name = "SUBSCRIPTION_URL")
    public String subscriptionUrl;

    @Column(columnDefinition = "VARCHAR(255)", name = "TYPE")
    public String type;

    @Column(columnDefinition = "BIGINT", name = "USER_ID")
    public Long userId;

    @Column(columnDefinition = "VARCHAR(255)", name = "VERSION")
    public String version;

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
