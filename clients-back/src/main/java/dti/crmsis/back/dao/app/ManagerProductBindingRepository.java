package dti.crmsis.back.dao.app;

import dti.crmsis.back.SchemaRegistry;
import io.quarkus.hibernate.orm.PersistenceUnit;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

import java.util.List;

@ApplicationScoped
public class ManagerProductBindingRepository {

    @Inject
    @PersistenceUnit("default")
    EntityManager entityManager;

    @Inject
    SchemaRegistry schemaRegistry;

    public List<String> findActiveManagerEmailsByProduct(String productName) {
        String appSchema = schemaRegistry.getSchema("app");
        String pdSchema = schemaRegistry.getSchema("pd");

        String sql = """
                    SELECT b.USER_EMAIL
                    FROM %s.USER_EMAIL_PRODUCT_BINDING b
                    JOIN %s.USERS u ON u.EMAIL = b.USER_EMAIL
                    WHERE b.PRODUCT_NAME = :product
                      AND (u.IS_DELETED IS NULL OR u.IS_DELETED = 0)
                """.formatted(appSchema, pdSchema);

        @SuppressWarnings("unchecked")
        List<String> result = entityManager.createNativeQuery(sql)
                .setParameter("product", productName)
                .getResultList();

        return result;
    }


    public List<String> filterActiveManagerEmailsByProduct(List<String> emails, List<String> productNames) {
        if (emails == null || emails.isEmpty() || productNames == null || productNames.isEmpty()) {
            return List.of();
        }

        String appSchema = schemaRegistry.getSchema("app");
        String pdSchema = schemaRegistry.getSchema("pd");

        String sql = """
                    SELECT DISTINCT b.USER_EMAIL
                    FROM %s.USER_EMAIL_PRODUCT_BINDING b
                    JOIN %s.USERS u ON u.EMAIL = b.USER_EMAIL
                    WHERE b.USER_EMAIL IN (:emails)
                      AND b.PRODUCT_NAME IN (:products)
                      AND (u.IS_DELETED IS NULL OR u.IS_DELETED = 0)
                """.formatted(appSchema, pdSchema);

        @SuppressWarnings("unchecked")
        List<String> result = entityManager.createNativeQuery(sql)
                .setParameter("emails", emails)
                .setParameter("products", productNames)
                .getResultList();

        return result;
    }

}
