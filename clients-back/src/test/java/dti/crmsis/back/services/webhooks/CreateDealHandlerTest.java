package dti.crmsis.back.services.webhooks;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

@QuarkusTest
@TestProfile(dti.crmsis.back.TestProfile.class)
public class CreateDealHandlerTest {

    @Inject
    WebhookRequestsHandler webhookRequestsHandler;

    @Inject
    ObjectMapper objectMapper;

    @Test
    public void testRun() throws JsonProcessingException {
        webhookRequestsHandler.processNew();
        System.out.println(objectMapper.writeValueAsString(webhookRequestsHandler.processed));
    }

}