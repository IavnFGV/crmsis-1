package dti.crmsis.back.dao.app;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "USER_EMAIL_PRODUCT_BINDING")
public class ManagerProductBinding
        extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false, name = "USER_EMAIL")
    public String userEmail;

    @Column(nullable = false, name = "PRODUCT_NAME")
    public String productName;

    public ManagerProductBinding() {
    }

    public ManagerProductBinding(String userEmail, String productName) {
        this.userEmail = userEmail;
        this.productName = productName;
    }

    public static List<String> findProductsForManager(String manager) {
        return find("userEmail", manager)
                .<ManagerProductBinding>stream()
                .map(binding -> binding.productName)
                .distinct()
                .toList();
    }

    public static List<String> findManagersForProduct(String product) {
        return find("productName", product)
                .<ManagerProductBinding>stream()
                .map(binding -> binding.userEmail)
                .distinct()
                .toList();
    }

}
