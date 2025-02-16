package dti.crmsis.back.dao.crmsis;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "CUSTOMERS")
public class CustomerEntity extends PanacheEntity {

    @Column(name = "FULL_NAME", nullable = false)
    public String fullName;

    @Column(name = "CUSTOMER_NAME", length = 50)
    public String customerName;

    @Column(name = "CREATED_AT", updatable = false, insertable = false)
    public LocalDateTime createdAt;

    @Column(name = "DELETED")
    public LocalDateTime deletedAt;

    @Column(name = "API_TOKEN")
    public String apiToken;

    @Column(name = "URL")
    public String url;

    public static CustomerEntity findByCustomerName(String customerName) {
        return find("customerName", customerName).firstResult();
    }
}