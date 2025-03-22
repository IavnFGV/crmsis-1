package dti.crmsis.back.dao.clientsback;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Table(name = "WEBHOOK_REQUEST_PROCESS_STATUS")
@Entity
public class WebhookRequestProcessStatus extends PanacheEntityBase {
    @Id
    @Column(name = "ID")
    public UUID idPipedrive;

    @Id
    @Column(name = "CORRELATION_ID")
    public UUID correlationId;

    @Column(name = "LOCAL_ID")
    public Long localId;

    @Column(columnDefinition = "VARCHAR(20)", name = "STATUS")
    public String status;

    @Column(columnDefinition = "TEXT", name = "COMMENT")
    public String comment = "";

}
