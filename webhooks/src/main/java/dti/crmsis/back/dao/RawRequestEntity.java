package dti.crmsis.back.dao.crmsis;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "RAW_REQUESTS")
public class RawRequestEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(name = "REQUEST_DATA")
    private String requestData; // Содержимое запроса
    @Column(name = "CUSTOMER_NAME")
    private String customerName;
    @Column(insertable = false, updatable = false, name = "CREATED_AT") // created_at не должен обновляться
    private java.time.LocalDateTime createdAt; // Время вставки

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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setRequestData(String requestData) {
        this.requestData = requestData;
    }

    public void setCustomerName(String customerId) {
        this.customerName = customerId;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public static List<RawRequestEntity> findByIdGreaterThan(Long idSelector) {
        return list("id>?1 ",idSelector);
    }


}