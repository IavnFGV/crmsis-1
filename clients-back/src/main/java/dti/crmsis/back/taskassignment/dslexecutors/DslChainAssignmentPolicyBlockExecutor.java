package dti.crmsis.back.taskassignment.dslexecutors;

import dti.crmsis.back.taskassignment.TaskAssignmentContext;
import dti.crmsis.back.taskassignment.dsl.DslChainAssignmentPolicyBlock;
import dti.crmsis.back.taskassignment.utils.ContextIsCompletedException;
import dti.crmsis.back.taskassignment.utils.WithContextLock;
import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Unremovable
@Dependent
@BlockType("chainAssignmentPolicy")
public class DslChainAssignmentPolicyBlockExecutor implements DslBlockExecutor<DslChainAssignmentPolicyBlock> {

    private static final String INDEX_KEY = "chainPolicyIndex";
    private static final String RETRY_KEY = "chainPolicyRetry";

    @Inject
    DslExecutorRegistry registry;

    private final List<DslBlockExecutor<?>> executors = new ArrayList<>();
    private final List<Integer> retryLimits = new ArrayList<>();
    private DslChainAssignmentPolicyBlock block;

    @Override
    public void init(DslChainAssignmentPolicyBlock block, Map<String, DslBlockExecutor<?>> allBlocks, String flowId) {
        this.block = block;
        executors.clear();
        retryLimits.clear();
        for (String ref : block.getPolicies()) {
            DslBlockExecutor<?> exec = registry.get(ref);
            if (exec == null) {
                throw new IllegalStateException("Unknown policy ref: " + ref);
            }
            executors.add(exec);
            int limit = 1;
//            if (exec instanceof DslOneByOneAssignmentPolicyBlockExecutor one) {
//                limit = one.getRetryCount();
//            }
            retryLimits.add(limit);
        }
    }

    @WithContextLock
    @Override
    public void receive(TaskAssignmentContext context) throws ContextIsCompletedException {
        Integer index = (Integer) context.get(INDEX_KEY);
        Integer retry = (Integer) context.get(RETRY_KEY);
        if (index == null) index = 0;
        if (retry == null) retry = 0;

        if (index >= executors.size()) {
            return;
        }

        DslBlockExecutor<?> current = executors.get(index);
        current.receive(context);

        retry++;
        int limit = retryLimits.get(index);
        if (retry >= limit) {
            index++;
            retry = 0;
        }

        context.put(INDEX_KEY, index);
        context.put(RETRY_KEY, retry);
    }

    @Override
    public void stop(TaskAssignmentContext context) {
        executors.forEach(exec -> exec.stop(context));
    }
}
