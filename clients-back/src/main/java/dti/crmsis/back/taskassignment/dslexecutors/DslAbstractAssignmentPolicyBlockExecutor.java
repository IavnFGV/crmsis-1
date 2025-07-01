package dti.crmsis.back.taskassignment.dslexecutors;

import dti.crmsis.back.messaging.BusMessageProcessor;
import dti.crmsis.back.messaging.TopicUtils;
import dti.crmsis.back.taskassignment.TaskAssignmentContext;
import dti.crmsis.back.taskassignment.dsl.DslBlock;
import dti.crmsis.back.taskassignment.utils.ContextIsCompletedException;
import dti.crmsis.back.taskassignment.utils.WithContextLock;
import io.vertx.core.Vertx;
import jakarta.inject.Inject;
import org.jboss.logging.Logger;

public abstract class DslAbstractAssignmentPolicyBlockExecutor<T extends DslBlock> implements DslBlockExecutor<T> {

    public static final String RETRY_TIMER_ID = "retryTimerId";
    @Inject
    protected BusMessageProcessor busMessageProcessor;

    @Inject
    protected Vertx vertx;

    @WithContextLock
    public void scheduleRetry(TaskAssignmentContext context, long waitMinutes) throws ContextIsCompletedException {
//        long delayMillis = waitMinutes * 60_000;
        long delayMillis = 10000;
        Long retryTimerId = vertx.setTimer(delayMillis, id -> {
            busMessageProcessor.publish(TopicUtils.retryTopic(context.getFlowId()), context);
        });
        context.put(RETRY_TIMER_ID, retryTimerId);
    }

    @Override
    public void stop(TaskAssignmentContext context) {
        Long retryTimerId = (Long) context.get(RETRY_TIMER_ID);
        if (retryTimerId != null) {
            vertx.cancelTimer(retryTimerId);
            return;
        }
        getLOG().info("No retry to stop");
    }

    public abstract Logger getLOG();

}
