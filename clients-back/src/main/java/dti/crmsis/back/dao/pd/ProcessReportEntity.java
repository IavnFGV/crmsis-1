package dti.crmsis.back.dao.pd;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.UUID;

@Table(name = "PROCESS_REPORTS")
@Entity
public class ProcessReportEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long id;

    @Column(name = "CORRELATION_ID")
    public UUID correlationId;

    @Column(name="CORRELATION_ID_SUFFIX")
    public Integer correlationIdSuffix;

    @Column(name = "RAW_REQUEST_ID")
    public Long rawRequestId;

    @Column(name = "ENTITY_PIPEDRIVE_ID")
    public Long entityPipedriveId;

    @Column(columnDefinition = "VARCHAR(20)",name = "PIPEDRIVE_TYPE")
    public String entityPipedriveType;

    @Column(columnDefinition = "VARCHAR(20)",name = "PIPEDRIVE_ACTION")
    public String pipedriveAction;

    @Column(columnDefinition = "VARCHAR(20)", name = "STATUS")
    public String status;

    @Column(columnDefinition = "JSON", name = "COMMENT")
    public String comment = "";

}
