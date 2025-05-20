package dti.crmsis.back.services.webhooks;

import dti.crmsis.back.dao.RawRequest;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;
import io.quarkus.test.common.QuarkusTestResource;
import io.restassured.RestAssured;
import org.junit.jupiter.api.*;

import org.testcontainers.containers.MySQLContainer;

import javax.inject.Inject;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@QuarkusTestResource(WebhookRawRequestServiceIT.MySQLTestResource.class)
public class WebhookRawRequestServiceIT {

    @Inject
    WebhookRawRequestService service;

    @BeforeAll
    public static void initDb() throws Exception {
        // Загружаем тестовый SQL
        String sql = Files.readString(Path.of("src/test/resources/db-schema.sql"));

        try (Connection conn = DriverManager.getConnection(
                MySQLTestResource.mysql.getJdbcUrl(),
                MySQLTestResource.mysql.getUsername(),
                MySQLTestResource.mysql.getPassword()
        )) {
            for (String statement : sql.split(";")) {
                if (!statement.isBlank()) {
                    try (Statement st = conn.createStatement()) {
                        st.execute(statement.trim());
                    }
                }
            }
        }
    }

    @Test
    @Order(1)
    public void testProcessingWebhookStoresRequest() {
        // Тут должен быть вызов, который инициирует запись в RawRequest
        // Например: service.processIncomingWebhook(...) или REST-запрос

        // Проверка — появился ли новый RawRequest?
        List<RawRequest> requests = RawRequest.listAll();
        assertFalse(requests.isEmpty(), "Expected at least one RawRequest entry");
        RawRequest req = requests.get(0);
        assertNotNull(req.getRequestData(), "Request data must not be null");
    }

    // Встроенный Testcontainers ресурс
    public static class MySQLTestResource implements io.quarkus.test.common.QuarkusTestResourceLifecycleManager {
        static MySQLContainer<?> mysql = new MySQLContainer<>("mysql:8")
                .withDatabaseName("testdb")
                .withUsername("test")
                .withPassword("test");

        @Override
        public java.util.Map<String, String> start() {
            mysql.start();
            return java.util.Map.of(
                    "quarkus.datasource.db-kind", "mysql",
                    "quarkus.datasource.username", mysql.getUsername(),
                    "quarkus.datasource.password", mysql.getPassword(),
                    "quarkus.datasource.jdbc.url", mysql.getJdbcUrl(),
                    "quarkus.hibernate-orm.database.generation", "none"
            );
        }

        @Override
        public void stop() {
            mysql.stop();
        }
    }
}
