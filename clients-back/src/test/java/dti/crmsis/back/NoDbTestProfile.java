package dti.crmsis.back;

import io.quarkus.test.junit.QuarkusTestProfile;
import java.util.Map;

public class NoDbTestProfile implements QuarkusTestProfile {
    @Override
    public Map<String, String> getConfigOverrides() {
        return Map.of(
                "quarkus.datasource.devservices.enabled", "false",
                "quarkus.datasource.webhooks.enabled", "false",
                "quarkus.datasource.app.enabled", "false",
                "quarkus.datasource.enabled", "false",
                "quarkus.hibernate-orm.enabled", "false"
        );
    }
}