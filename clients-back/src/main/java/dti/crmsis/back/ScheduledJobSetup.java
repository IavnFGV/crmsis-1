package dti.crmsis.back;

import dti.crmsis.back.dao.pd.ExtraInfoEntity;
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

    public void deactivate() {
        isActive.set(false);
    }

    @Inject
    @SchedulerPool
    ExecutorService executor;

    @Scheduled(every = "1m")
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
        executor.execute(() -> {
            boolean wasException = false;
            long start = System.currentTimeMillis();
            try {
                if(needDoRetryForNoHandlers()){
                    LOG.info("Executing processWebhookRequests.retry job at " + start);
                    webhookRequestsHandler.processRetry();
                }else{
                    LOG.info("Executing processWebhookRequests.new job at " + start);
                    webhookRequestsHandler.processNew();
                }
            } catch (Throwable ex) {
                wasException = true;
                LOG.error(ex.getMessage(), ex);
            } finally {
                long end = System.currentTimeMillis();
                if (wasException) {
                    LOG.info("Executing processWebhookRequests job finished WITH_EXCEPTION in  " + (end - start) + "ms");
                } else {
                    LOG.info("Executing processWebhookRequests job finished SUCCESS in  " + (end - start) + "ms");
                }
                if(needDoRetryForNoHandlers()){
                    retryDoneForNoHandlers();
                }
                isRunning.set(false);
            }
        });
    }

    private final AtomicBoolean initialInitCall = new AtomicBoolean(false);

    @Scheduled(delayed = "10s", every = "PT10000H")// 416 days
    void  initialInit() {
        if (initialInitCall.compareAndSet(false, true)) {
            executor.execute(() -> {
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
        ExtraInfoEntity.saveBoolean(Constants.RETRY_NO_HANDLER,false);
    }



}
