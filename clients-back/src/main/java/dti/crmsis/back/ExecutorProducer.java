package dti.crmsis.back;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import org.eclipse.microprofile.context.ManagedExecutor;

@ApplicationScoped
public class ExecutorProducer {

    @Produces
    @SchedulerPool
    public ManagedExecutor produceExecutor() {
        return ManagedExecutor.builder()
                .maxAsync(2)
                .maxQueued(10)
                .propagated() // передаёт CDI контексты
                .cleared()    // очищает всё остальное
                .build();
    }

}
