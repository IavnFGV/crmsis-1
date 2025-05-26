package dti.crmsis.back;

import io.quarkus.test.junit.QuarkusTest;
import org.eclipse.microprofile.config.ConfigProvider;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class SimpleConfigTest {
    @Test
    public void testAppToken() {
        String token = ConfigProvider.getConfig().getValue("app.token", String.class);
        System.out.println(">>> [DEBUG] APP_TOKEN = " + token);
    }
}
