package dti.crmsis.back.messaging;

import dti.crmsis.back.BusMessagesPool;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.eventbus.Message;
import io.vertx.core.eventbus.MessageConsumer;
import io.vertx.core.eventbus.MessageProducer;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.context.ManagedExecutor;
import org.jboss.logging.Logger;

import java.util.function.Consumer;

@ApplicationScoped
public class BusMessageProcessor {
    private static final Logger LOG = Logger.getLogger(BusMessageProcessor.class);
    @Inject
    EventBus eventBus;
    @Inject
    @BusMessagesPool
    ManagedExecutor executor;

    public void submit(String name, Runnable task) {
        executor.runAsync(() -> {
            try {
                LOG.infof("Start task [%s]", name);
                task.run();
                LOG.infof("Finish task [%s]", name);
            } catch (Exception e) {
                LOG.errorf(e, "Error in async task [%s]", name);
            }
        });
    }

    public <T> MessageConsumer<T> consumer(String topic, Consumer<T> messageConsumer) {
        return eventBus.consumer(topic, message -> {
            var payload = (T) message.body();
            submit(topic, () -> messageConsumer.accept(payload));
        });
    }

    public <T> void publish(String topic, T messageObject) {
        eventBus.publish(topic, messageObject);
    }
}