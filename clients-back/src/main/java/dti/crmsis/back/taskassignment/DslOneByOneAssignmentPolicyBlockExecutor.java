package dti.crmsis.back.taskassignment;

import dti.crmsis.back.dao.pd.UserEntity;
import dti.crmsis.back.messaging.TopicUtils;
import dti.crmsis.back.services.PipedriveService;
import dti.crmsis.back.taskassignment.dsl.DslOneByOneAssignmentPolicyBlock;
import dti.crmsis.back.taskassignment.framework.TaskAssignmentApi;
import io.quarkus.arc.Unremovable;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.EventBus;
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
    EventBus eventBus;

    @Inject
    TaskAssignmentApi taskAssignmentApi;

    @Inject
    Vertx vertx;

    private DslOneByOneAssignmentPolicyBlock block;
    private final AtomicInteger currentIndex = new AtomicInteger(0);
    private final List<String> memberEmails = new ArrayList<>();

    @Override
    public void init(DslOneByOneAssignmentPolicyBlock block, Map<String, DslBlockExecutor<?>> allBlocks, String flowId) {
        this.block = block;
        this.memberEmails.clear();
        this.memberEmails.addAll(block.getMembers().keySet());
    }

    public void scheduleRetry(TaskAssignmentContext context, long waitMinutes) {
        long delayMillis = waitMinutes * 60_000;
        vertx.setTimer(delayMillis, id -> {
            eventBus.publish(TopicUtils.retryTopic(context.getFlowId()), context);
        });
    }


    @Override
    public void receive(TaskAssignmentContext context) {
        String flowId = context.getFlowId();
        Integer retry = Integer.parseInt((String) context.get("retry"));

        String selected;
        synchronized (this) {
            int index = currentIndex.getAndUpdate(i -> (i + 1) % memberEmails.size());
            selected = memberEmails.get(index);
        }
        try {
            taskAssignmentApi.assign(Long.valueOf(flowId), selected);
        }catch (Exception e){
            LOG.error(e);
            LOG.info("Assignment failed. Waiting for next Iteration");
        }
        scheduleRetry(context, block.getWaitMinutes());
    }

    @Override
    public void stop() {

    }
}
