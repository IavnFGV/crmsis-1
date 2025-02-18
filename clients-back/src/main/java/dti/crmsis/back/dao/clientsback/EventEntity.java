package dti.crmsis.back.dao.clientsback;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "EVENTS")
public class EventEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "CUSTOMER_NAME", length = 50)
    public String customerName;

    @Column(name = "REQUEST_ID")
    public Long requestId;

    @Column(name = "PROCESSED_DATA", columnDefinition = "MEDIUMTEXT", nullable = false)
    public String processedData;

    @Column(name = "COMMENTS", columnDefinition = "MEDIUMTEXT", nullable = false)
    public String comments;

    @Column(name = "PARENT_ID")
    public Long parentId;

    @Column(name = "PROCESSED_AT")
    public LocalDateTime processedAt;

    @Column(insertable = false, updatable = false, name = "CREATED_AT",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    public LocalDateTime createdAt;
}
