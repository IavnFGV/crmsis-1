package dti.crmsis.back.messaging;

import dti.crmsis.back.BusMessagesPool;
import dti.crmsis.back.MdcExecutorWrapper;
import dti.crmsis.back.services.webhooks.WebhookRequestService;
import dti.crmsis.back.taskassignment.TaskAssignmentContext;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.eventbus.MessageConsumer;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.jboss.logging.Logger;

import java.util.function.Consumer;

@ApplicationScoped
public class BusMessageProcessor {
    private static final Logger LOG = Logger.getLogger(BusMessageProcessor.class);
    @Inject
    EventBus eventBus;
    @Inject
    @BusMessagesPool
    MdcExecutorWrapper executor;

    public void submit(String name, Runnable task) {
        executor.runAsync(name, task);
    }

    public <T> MessageConsumer<T> consumer(String topic, Consumer<T> messageConsumer) {
        return eventBus.consumer(topic, message -> {
            var payload = (T) message.body();
            submit(constructTaskName(topic, payload), () -> messageConsumer.accept(payload));
        });
    }

    public <T> String constructTaskName(String topic, T payload) {
        if (TopicUtils.DEAL_RECEIVED_API.equals(topic)) {
            if (payload instanceof WebhookRequestService.JsonProxy proxy) {
                Long entityIdPipedrive = proxy.entityIdPipedrive;
                return TopicUtils.DEAL_RECEIVED_API + "_" + entityIdPipedrive;
            }
            if (payload instanceof TaskAssignmentContext taskAssignmentContext) {
                String flowId = taskAssignmentContext.getFlowId();
                return TopicUtils.DEAL_RECEIVED_API + "_" + flowId;
            }
        }
        return topic;
    }


    public <T> void publish(String topic, T messageObject) {
        eventBus.publish(topic, messageObject);
    }
}