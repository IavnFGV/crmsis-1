package dti.crmsis.back;

import dti.crmsis.back.services.*;
import dti.crmsis.back.services.webhooks.WebhookRequestsHandler;
import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import org.jboss.logging.Logger;

@ApplicationScoped
public class ApplicationLifecycleManager {

    private static final Logger LOG = Logger.getLogger(ApplicationLifecycleManager.class);

    @Inject
    Constants constants;
    @Inject
    RateLimitFilter rateLimitFilter;
    @Inject
    WebhookRequestsHandler webhookRequestsHandler;
    @Inject
    KnownFieldService knownFieldService;
    @Inject
    TimeZoneService timeZoneService;
    @Inject
    ScheduledJobSetup scheduledJobSetup;


    void onStart(@Observes StartupEvent event) {
        LOG.info("Application is starting...");
        doSomethingOnStartup();
    }

    void onStop(@Observes ShutdownEvent event) {
        LOG.info("Application is stopping...");
        cleanupOnShutdown();
    }

    private void doSomethingOnStartup() {
        constants.init();
        rateLimitFilter.init();
//        webhookRequestsHandler.init();
//        knownFieldService.init();
//        timeZoneService.init(timeZoneService);
//        scheduledJobSetup.activate();
    }

    private void cleanupOnShutdown() {
        LOG.info("Cleaning up resources...");
    }
}
