package dti.crmsis.back;

import dti.crmsis.back.messaging.TopicUtils;
import dti.crmsis.back.services.webhooks.WebhookRequestService;
import dti.crmsis.back.services.webhooks.WebhookRequestsHandler;
import dti.crmsis.back.taskassignment.TaskAssignmentsManager;
import io.quarkus.test.junit.QuarkusTest;
import io.vertx.core.eventbus.EventBus;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class FullAssignmentCycleTest {
    @Inject
    WebhookRequestsHandler webhookRequestsHandler;

    @Inject
    EventBus eventBus;
    @Inject
    TaskAssignmentsManager taskAssignmentsManager;

    int countDealReceived = 0;

    @BeforeEach
    public void prepare() {
        eventBus.consumer(TopicUtils.DEAL_RECEIVED_API,
                event -> this.countDealReceived((WebhookRequestService.JsonProxy) event.body()));
    }

    private void countDealReceived(WebhookRequestService.JsonProxy body) {
        countDealReceived++;
    }


    @Test
    public void shouldAssign() throws InterruptedException {
        webhookRequestsHandler.processNew();
        Thread.currentThread().sleep(10_000);
    }

}
