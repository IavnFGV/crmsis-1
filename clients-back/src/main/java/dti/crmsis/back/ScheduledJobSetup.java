package dti.crmsis.back;

import dti.crmsis.back.dao.pd.ExtraInfoEntity;
import dti.crmsis.back.services.Constants;
import dti.crmsis.back.services.InitDataService;
import dti.crmsis.back.services.webhooks.WebhookRequestsHandler;
import io.quarkus.scheduler.Scheduled;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.eclipse.microprofile.context.ManagedExecutor;
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

    public void deactivate() {
        isActive.set(false);
    }

    @Inject
    @SchedulerPool
    MdcExecutorWrapper executor;

    //    @Scheduled(every = "1m")
    @Scheduled(every = "5s")
    void processWebhookRequests() {
        if (!isActive.get()) {
            LOG.info("App is not ready yet, skipping processWebhookRequests");
            return;
        }
        if (isRunning.get()) {
            LOG.info("processWebhookRequests is already running, skipping");
            return;
        }
        if (!canProcessWebhooks()) {
            LOG.info("Data is not ready yet, skipping processWebhookRequests");
            return;
        }
        isRunning.set(true);
        executor.runAsync("processWebhookRequests", () -> {
            try {
                if (needDoRetryForNoHandlers()) {
                    webhookRequestsHandler.processRetry();
                } else {
                    webhookRequestsHandler.processNew();
                }
            } finally {
                if (needDoRetryForNoHandlers()) {
                    retryDoneForNoHandlers();
                }
                isRunning.set(false);
            }
        });
    }

    private final AtomicBoolean initialInitCall = new AtomicBoolean(false);

    @Scheduled(delayed = "10s", every = "PT10000H")
// 416 days
    void initialInit() {
        if (initialInitCall.compareAndSet(false, true)) {
            executor.runAsync("initialInit", () -> {
                initDataService.start();
            });
        } else {
            LOG.warn("Initial sync already triggered. Skipping.");
        }
    }


    @Transactional
    protected boolean canProcessWebhooks() {
        return ExtraInfoEntity.getBooleanByName(Constants.INITIAL_EVENTS_PROCESSED);
    }

    @Transactional
    protected boolean needDoRetryForNoHandlers() {
        return ExtraInfoEntity.getBooleanByName(Constants.RETRY_NO_HANDLER);
    }

    @Transactional
    protected void retryDoneForNoHandlers() {
        ExtraInfoEntity.saveBoolean(Constants.RETRY_NO_HANDLER, false);
    }


}
