package dti.crmsis.back;

import dti.crmsis.back.messaging.JsonProxyCodec;
import dti.crmsis.back.messaging.TaskAssignmentContextCodec;
import dti.crmsis.back.services.Constants;
import dti.crmsis.back.services.KnownFieldService;
import dti.crmsis.back.services.TimeZoneService;
import dti.crmsis.back.services.webhooks.WebhookRequestService;
import dti.crmsis.back.services.webhooks.WebhookRequestsHandler;
import dti.crmsis.back.taskassignment.dslexecutors.DslBlockExecutorFactory;
import dti.crmsis.back.taskassignment.TaskAssignmentContext;
import dti.crmsis.back.taskassignment.TaskAssignmentInitializer;
import dti.crmsis.back.taskassignment.TaskAssignmentsManager;
import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import io.vertx.core.eventbus.EventBus;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;

@ApplicationScoped
public class ApplicationLifecycleManager {

    private static final Logger LOG = Logger.getLogger(ApplicationLifecycleManager.class);

    @ConfigProperty(name = "scheduled.jobs.enabled", defaultValue = "true")
    boolean scheduledJobsEnabled;

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
    @Inject
    TaskAssignmentInitializer taskAssignmentInitializer;
    @Inject
    DslBlockExecutorFactory dslBlockExecutorFactory;
    @Inject
    EventBus eventBus;
    @Inject
    TaskAssignmentsManager taskAssignmentsManager;
    @Inject
    SchemaRegistry schemaRegistry;

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
        webhookRequestsHandler.init();
        knownFieldService.init();
        timeZoneService.init(timeZoneService);
        dslBlockExecutorFactory.initializeBlockExecutors();
        taskAssignmentInitializer.init();
        eventBus.registerDefaultCodec(WebhookRequestService.JsonProxy.class, new JsonProxyCodec());
        eventBus.registerDefaultCodec(TaskAssignmentContext.class, new TaskAssignmentContextCodec());
        taskAssignmentsManager.init();
        if (scheduledJobsEnabled) {
            scheduledJobSetup.activate();
        }
        schemaRegistry.init();
    }

    private void cleanupOnShutdown() {
        LOG.info("Cleaning up resources...");
    }
}
