package dti.crmsis.back;

import dti.crmsis.back.dao.clientsback.ExtraInfoEntity;
import dti.crmsis.back.services.Constants;
import dti.crmsis.back.services.InitDataService;
import dti.crmsis.back.services.webhooks.WebhookRequestsHandler;
import io.quarkus.scheduler.Scheduled;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.jboss.logging.Logger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

@ApplicationScoped
public class ScheduledJobSetup {
    private static final Logger LOG = Logger.getLogger(ScheduledJobSetup.class);

    private final AtomicBoolean isRunning = new AtomicBoolean(false);
    private final AtomicBoolean isActive = new AtomicBoolean(false);

    @Inject
    WebhookRequestsHandler webhookRequestsHandler;

    @Inject
    InitDataService initDataService;

    public void activate() {
        isActive.set(true);
    }

    @Inject
    @SchedulerPool
    ExecutorService executor;

    @Scheduled(every = "1m")
    void processNewWebhookRequests() {
        if (!isActive.get()) {
            LOG.info("App is not ready yet, skipping processNewWebhookRequests");
            return;
        }
        if (isRunning.get()) {
            LOG.info("processNewWebhookRequests is already running, skipping");
            return;
        }
        if (!canProcessWebhooks()) {
            LOG.info("Data is not ready yet, skipping processNewWebhookRequests");
            return;
        }
        isRunning.set(true);
        executor.execute(() -> {
            boolean wasException = false;
            long start = System.currentTimeMillis();
            try {
                LOG.info("Executing processNewWebhookRequests job at " + start);
                webhookRequestsHandler.processNew();
            } catch (Throwable ex) {
                wasException = true;
                LOG.errorf(ex.getMessage(), ex);
            } finally {
                long end = System.currentTimeMillis();
                if (wasException) {
                    LOG.info("Executing processNewWebhookRequests job finished WITH_EXCEPTION in  " + (end - start) + "ms");
                } else {
                    LOG.info("Executing processNewWebhookRequests job finished SUCCESS in  " + (end - start) + "ms");
                }
                isRunning.set(false);
            }
        });
    }

    boolean initialInitCall = false;

    @Scheduled(delayed = "10s", every = "PT10000H")// 416 days
    void initialInit() {
        if (!initialInitCall) {
            initialInitCall = true;
            executor.execute(() -> {
                initDataService.start();
            });
        }
    }


    @Transactional
    protected boolean canProcessWebhooks() {
        return ExtraInfoEntity.getBooleanByName(Constants.INITIAL_EVENTS_PROCESSED);
    }

}
