package dti.crmsis.back;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import org.eclipse.microprofile.context.ManagedExecutor;

@ApplicationScoped
public class ExecutorProducer {

    @Produces
    @SchedulerPool
    public MdcExecutorWrapper produceSchedulerExecutor(@SchedulerPool ManagedExecutor executor) {
        return new MdcExecutorWrapper(executor, "scheduler");
    }

    @Produces
    @BusMessagesPool
    public MdcExecutorWrapper produceBusExecutor(@BusMessagesPool ManagedExecutor executor) {
        return new MdcExecutorWrapper(executor, "bus");
    }


    @Produces
    @SchedulerPool
    public ManagedExecutor produceExecutor() {
        return ManagedExecutor.builder()
                .maxAsync(2)
                .maxQueued(10)
                .propagated()
                .cleared()
                .build();
    }

    @Produces
    @BusMessagesPool
    public ManagedExecutor produceBusEventsPoolExecutor() {
        return ManagedExecutor.builder()
                .maxAsync(2)
                .maxQueued(10)
                .propagated()
                .cleared()
                .build();
    }


}
