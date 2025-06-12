package dti.crmsis.back.taskassignment;

import dti.crmsis.back.messaging.BusMessageProcessor;
import dti.crmsis.back.messaging.TopicUtils;
import dti.crmsis.back.taskassignment.dsl.DslOneByOneAssignmentPolicyBlock;
import dti.crmsis.back.taskassignment.framework.TaskAssignmentApi;
import dti.crmsis.back.taskassignment.utils.WithContextLock;
import io.quarkus.arc.Unremovable;
import io.vertx.core.Vertx;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import org.jboss.logging.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Unremovable
@Dependent
@BlockType("oneByOneAssignmentPolicy")
public class DslOneByOneAssignmentPolicyBlockExecutor implements DslBlockExecutor<DslOneByOneAssignmentPolicyBlock> {
    private static final Logger LOG = Logger.getLogger(DslOneByOneAssignmentPolicyBlockExecutor.class);

    @Inject
    TaskAssignmentApi taskAssignmentApi;
    @Inject
    BusMessageProcessor busMessageProcessor;

    @Inject
    Vertx vertx;

    private DslOneByOneAssignmentPolicyBlock block;
    private final AtomicInteger currentIndex = new AtomicInteger(0);
    private final List<String> memberEmails = new ArrayList<>();
    private Long retryTimerId;

    @Override
    public void init(DslOneByOneAssignmentPolicyBlock block, Map<String, DslBlockExecutor<?>> allBlocks, String flowId) {
        this.block = block;
        this.memberEmails.clear();
        this.memberEmails.addAll(block.getMembers().keySet());
    }

    @WithContextLock
    public void scheduleRetry(TaskAssignmentContext context, long waitMinutes) {
//        long delayMillis = waitMinutes * 60_000;
        long delayMillis = 10000;
        Long retryTimerId = vertx.setTimer(delayMillis, id -> {
            busMessageProcessor.publish(TopicUtils.retryTopic(context.getFlowId()), context);
        });
        context.put("retryTimerId", retryTimerId);
    }

    @WithContextLock
    @Override
    public void receive(TaskAssignmentContext context) {
        String flowId = context.getFlowId();
        String selected;
        synchronized (this) {
            int index = currentIndex.getAndUpdate(i -> (i + 1) % memberEmails.size());
            selected = memberEmails.get(index);
        }
        try {
            taskAssignmentApi.assign(Long.valueOf(flowId), selected);
        } catch (Exception e) {
            LOG.error(e);
            LOG.info("Assignment failed. Waiting for next Iteration");
        }
        scheduleRetry(context, block.getWaitMinutes());
    }

    @Override
    public void stop(TaskAssignmentContext context) {
        Long retryTimerId = (Long) context.get("retryTimerId");
        if (retryTimerId != null) {
            vertx.cancelTimer(retryTimerId);
            return;
        }
        LOG.info("No retry to stop");
    }
}
