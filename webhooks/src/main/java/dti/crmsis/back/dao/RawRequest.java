package dti.crmsis.back.dao;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "RAW_REQUESTS")
public class RawRequest extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(name = "REQUEST_DATA")
    private String requestData; // Содержимое запроса
    @Column(name = "CUSTOMER_NAME")
    private String urlPath;
    @Column(insertable = false, updatable = false, name = "CREATED_AT") // created_at не должен обновляться
    private java.time.LocalDateTime createdAt; // Время вставки


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRequestData() {
        return requestData;
    }

    public String getUrlPath() {
        return urlPath;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setRequestData(String requestData) {
        this.requestData = requestData;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

}