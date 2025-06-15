package dti.crmsis.back.taskassignment;

import dti.crmsis.back.messaging.BusMessageProcessor;
import dti.crmsis.back.messaging.TopicUtils;
import dti.crmsis.back.taskassignment.dsl.DslSourceBlock;
import dti.crmsis.back.taskassignment.utils.WithContextLock;
import io.quarkus.arc.Unremovable;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.MessageConsumer;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import org.jboss.logging.Logger;

import java.util.Map;

@Unremovable
@Dependent
@BlockType("source")
public class DslSourceBlockExecutor implements DslBlockExecutor<DslSourceBlock> {
    private static final Logger LOG = Logger.getLogger(DslSourceBlockExecutor.class);
    private DslSourceBlock block;
    private DslBlockExecutor next;
    private MessageConsumer<TaskAssignmentContext> retryEventConsumer;
    private MessageConsumer<TaskAssignmentContext> successEventConsumer;
    private String flowId;
    @Inject
    BusMessageProcessor busMessageProcessor;
    @Inject
    Vertx vertx;

    @Override
    public void init(DslSourceBlock block, Map<String, DslBlockExecutor<?>> allBlocks, String flowId) {
        this.block = block;
        this.next = allBlocks.get(block.getPassTo());
        this.flowId = flowId;
        retryEventConsumer = busMessageProcessor.consumer(TopicUtils.retryTopic(flowId), context -> {
            context.incrementRetry();
            this.receive(context);
        });
    }

    @WithContextLock
    @Override
    public void receive(TaskAssignmentContext context) {
        if (next != null) {
            if (context.getRetry() == 0 && block.getDelaySecs() > 0) {
                LOG.info("Scheduling for delay of " + block.getDelaySecs() + " seconds for first flow execution");
                vertx.setTimer(block.getDelaySecs() * 1000L, id -> {
                    busMessageProcessor.submit(busMessageProcessor.constructTaskName(TopicUtils.DEAL_RECEIVED_API, context), () -> {
                        next.receive(context);
                    });
                });
            } else {
                next.receive(context);
            }
        }
    }

    @Override
    public void stop(TaskAssignmentContext context) {
        retryEventConsumer.unregister();
    }
}