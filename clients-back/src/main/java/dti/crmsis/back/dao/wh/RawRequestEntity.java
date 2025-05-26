package dti.crmsis.back.dao.wh;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.time.OffsetDateTime;
import java.util.List;

@Entity
@Table(name = "RAW_REQUESTS")
public class RawRequestEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
//    @Type(JsonType.class)
    @Column(name = "REQUEST_DATA", columnDefinition = "json")
    private String requestData; // Содержимое запроса
    @Column(name = "CUSTOMER_NAME")
    private String customerName;
    /**
     * Timestamp of when the row was inserted.
     * This value is generated automatically by the database.
     *
     * Stored in MySQL as DATETIME or TIMESTAMP.
     * Use OffsetDateTime to correctly handle time zone issues.
     */
    @Column(name = "CREATED_AT", insertable = false, updatable = false)
    private OffsetDateTime createdAt;

    public static List<RawRequestEntity> findByCustomerName(String customerName) {
        return list("customerName", customerName);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRequestData() {
        return requestData;
    }

    public String getCustomerName() {
        return customerName;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setRequestData(String requestData) {
        this.requestData = requestData;
    }

    public void setCustomerName(String customerId) {
        this.customerName = customerId;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public static List<RawRequestEntity> findByIdGreaterThan(Long idSelector) {
        return list("id>?1 ",idSelector);
    }


}