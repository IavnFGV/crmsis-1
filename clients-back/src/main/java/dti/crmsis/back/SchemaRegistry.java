package dti.crmsis.back;

import dti.crmsis.back.utils.JdbcUrlParser;
import io.quarkus.hibernate.orm.PersistenceUnit;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@ApplicationScoped
public class SchemaRegistry {

    @Inject
    @PersistenceUnit("default")
    EntityManager emDefault;

    @Inject
    @PersistenceUnit("app")
    EntityManager emApp;

    @Inject
    @PersistenceUnit("webhooks")
    EntityManager emWebhooks;

    private final Map<String, String> unitToSchema = new HashMap<>();

    void init() {
        unitToSchema.put("default", extractSchema(emDefault));
        unitToSchema.put("app", extractSchema(emApp));
        unitToSchema.put("webhooks", extractSchema(emWebhooks));
    }

    private String extractSchema(EntityManager em) {
        return em.unwrap(Session.class).doReturningWork(connection -> {
            String url = connection.getMetaData().getURL();
            return new JdbcUrlParser(url).getDatabase();
        });
    }

    public String getSchema(String unitName) {
        return Optional.ofNullable(unitToSchema.get(unitName))
                .orElseThrow(() -> new IllegalArgumentException("No schema registered for unit: " + unitName));
    }
}

