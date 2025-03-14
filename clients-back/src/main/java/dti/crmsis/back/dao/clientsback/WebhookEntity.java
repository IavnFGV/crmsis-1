package dti.crmsis.back.dao.clientsback;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import java.time.LocalDateTime;




@Entity
@Table(name = "WEBHOOKS")
public class WebhookEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "ID_PIPEDRIVE")
    public Integer idPipedrive;


@Column(columnDefinition="BIGINT", name="COMPANY_ID")
public Long companyId;
@Column(columnDefinition="BIGINT", name="OWNER_ID")
public Long ownerId;
@Column(columnDefinition="BIGINT", name="USER_ID")
public Long userId;
@Column(columnDefinition="VARCHAR(255)", name="EVENT_ACTION")
public String eventAction;
@Column(columnDefinition="VARCHAR(255)", name="EVENT_OBJECT")
public String eventObject;
@Column(columnDefinition="VARCHAR(255)", name="SUBSCRIPTION_URL")
public String subscriptionUrl;
@Column(columnDefinition="BIGINT", name="IS_ACTIVE")
public Long isActive;
@Column(columnDefinition="VARCHAR(255)", name="ADD_TIME")
public String addTime;
@Column(columnDefinition="TEXT", name="REMOVE_TIME")
public String removeTime;
@Column(columnDefinition="VARCHAR(255)", name="TYPE")
public String type;
@Column(columnDefinition="TEXT", name="HTTP_AUTH_USER")
public String httpAuthUser;
@Column(columnDefinition="TEXT", name="HTTP_AUTH_PASSWORD")
public String httpAuthPassword;
@Column(columnDefinition="TEXT", name="REMOVE_REASON")
public String removeReason;
@Column(columnDefinition="VARCHAR(255)", name="VERSION")
public String version;
@Column(columnDefinition="TEXT", name="NAME")
public String name;
@Column(columnDefinition="VARCHAR(255)", name="LAST_DELIVERY_TIME")
public String lastDeliveryTime;
@Column(columnDefinition="VARCHAR(255)", name="LAST_HTTP_STATUS")
public String lastHttpStatus;
@Column(columnDefinition="BIGINT", name="ADMIN_ID")
public Long adminId;

    @Type(JsonType.class)
    @Column(columnDefinition = "json", name = "JSON")
    public String json;

    


} //close class