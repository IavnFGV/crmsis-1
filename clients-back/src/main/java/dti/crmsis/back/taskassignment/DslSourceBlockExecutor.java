package dti.crmsis.back.taskassignment;

import dti.crmsis.back.messaging.BusMessageProcessor;
import dti.crmsis.back.messaging.TopicUtils;
import dti.crmsis.back.taskassignment.dsl.DslSourceBlock;
import dti.crmsis.back.taskassignment.utils.WithContextLock;
import io.quarkus.arc.Unremovable;
import io.vertx.core.eventbus.MessageConsumer;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

import java.util.Map;

@Unremovable
@Dependent
@BlockType("source")
public class DslSourceBlockExecutor implements DslBlockExecutor<DslSourceBlock> {
    private DslSourceBlock block;
    private DslBlockExecutor next;
    private MessageConsumer<TaskAssignmentContext> retryEventConsumer;
    private MessageConsumer<TaskAssignmentContext> successEventConsumer;
    private String flowId;
    @Inject
    BusMessageProcessor busMessageProcessor;

    @Override
    public void init(DslSourceBlock block, Map<String, DslBlockExecutor<?>> allBlocks, String flowId) {
        this.block = block;
        this.next = allBlocks.get(block.getPass_to());
        this.flowId = flowId;
        retryEventConsumer = busMessageProcessor.consumer( TopicUtils.retryTopic(flowId), context -> {

            Object retryCount = context.get("retry");
            if (retryCount instanceof Integer) {
                context.put("retry", (Integer) retryCount + 1);
            } else {
                context.put("retry", 1);
            }
            this.receive(context);
        });
    }

    @WithContextLock
    @Override
    public void receive(TaskAssignmentContext context) {
        if (next != null) {
            next.receive(context);
        }
    }

    @Override
    public void stop(TaskAssignmentContext context) {
        retryEventConsumer.unregister();
    }
}