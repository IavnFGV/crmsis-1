package dti.crmsis.back;

import dti.crmsis.back.dao.clientsback.ExtraInfoEntity;
import dti.crmsis.back.services.Constants;
import dti.crmsis.back.services.webhooks.WebhookRequestsHandler;
import io.quarkus.scheduler.Scheduled;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.jboss.logging.Logger;

@ApplicationScoped
public class ScheduledJobSetup {
    private static final Logger LOG = Logger.getLogger(ScheduledJobSetup.class);


    @Inject
    WebhookRequestsHandler webhookRequestsHandler;

    boolean isRunning = false;


    @Scheduled(every = "1m")
    void processNewWebhookRequests() {
        if (!canProcessWebhooks()) {
            LOG.info("Data is not ready yet, skipping processNewWebhookRequests");
            return;
        }
        if (isRunning) {
            LOG.info("processNewWebhookRequests is already running, skipping");
            return;
        }
        isRunning = true;
        long start = System.currentTimeMillis();
        LOG.info("Executing processNewWebhookRequests job at " + start);
        webhookRequestsHandler.processNew();
        long end = System.currentTimeMillis();
        LOG.info("Executing processNewWebhookRequests job finished in  " + (end - start) + "ms");
        isRunning = false;
    }


    @Transactional
    protected boolean canProcessWebhooks() {
        return ExtraInfoEntity.getBooleanByName(Constants.INITIAL_EVENTS_PROCESSED);
    }

}
