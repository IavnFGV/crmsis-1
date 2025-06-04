package dti.crmsis.back.taskassignment;

import dti.crmsis.back.messaging.TopicUtils;
import dti.crmsis.back.taskassignment.dsl.DslSourceBlock;
import io.quarkus.arc.Unremovable;
import io.vertx.core.eventbus.EventBus;
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

    @Inject
    EventBus eventBus;
    private MessageConsumer<TaskAssignmentContext> retryEventConsumer;
    private MessageConsumer<TaskAssignmentContext> successEventConsumer;
    private String flowId;

    @Override
    public void init(DslSourceBlock block, Map<String, DslBlockExecutor<?>> allBlocks, String flowId) {
        this.block = block;
        this.next = allBlocks.get(block.getPass_to());
        this.flowId = flowId;
        retryEventConsumer = eventBus.consumer( TopicUtils.retryTopic(flowId), message -> {
            TaskAssignmentContext context = message.body();

            Object retryCount = context.get("retry");
            if (retryCount instanceof Integer) {
                context.put("retry", (Integer) retryCount + 1);
            } else {
                context.put("retry", 1);
            }
            this.receive(context);
        });
    }

    @Override
    public void receive(TaskAssignmentContext context) {
        if (next != null) {
            next.receive(context);
        }
    }

    @Override
    public void stop() {
        retryEventConsumer.unregister();
    }
}