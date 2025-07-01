package dti.crmsis.back.taskassignment.dslexecutors;


import dti.crmsis.back.taskassignment.TaskAssignmentContext;
import dti.crmsis.back.taskassignment.dsl.DslAssignmentPolicyDefaultBlock;
import dti.crmsis.back.taskassignment.dsl.DslUserFilterBlock;
import dti.crmsis.back.taskassignment.dslexecutors.filter.DslUserFilterExecutor;
import dti.crmsis.back.taskassignment.dslexecutors.filter.DslUserFilterNotPreviouslyAssignedExecutor;
import dti.crmsis.back.taskassignment.utils.ContextIsCompletedException;
import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.Dependent;
import org.jboss.logging.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Unremovable
@Dependent
@BlockType(DslAssignmentPolicyDefaultBlock.TYPE)
public class DslAssignmentPolicyDefaultBlockExecutor
        extends DslAbstractAssignmentPolicyBlockExecutor<DslAssignmentPolicyDefaultBlock> {
    private static final Logger LOG = Logger.getLogger(DslAssignmentPolicyDefaultBlockExecutor.class);
    private DslAssignmentPolicyDefaultBlock block;

    @Override
    public void init(DslAssignmentPolicyDefaultBlock block, Map<String, DslBlockExecutor<?>> allBlockExecutors, String flowId) {
        this.block = block;
    }

    @Override
    public void receive(TaskAssignmentContext context) throws ContextIsCompletedException {
        List<DslUserFilterBlock> filters = block.getFilters();
        List<String> emails = new ArrayList<>();
        DslUserFilterNotPreviouslyAssignedExecutor removePrevAssigned = null;
        for (DslUserFilterBlock filter : filters) {
            DslBlockExecutor<?> executor = context.getEngine().getExecutor(filter);
            if (executor instanceof DslUserFilterExecutor<?>) {
                if (executor instanceof DslUserFilterNotPreviouslyAssignedExecutor) {
                    removePrevAssigned = (DslUserFilterNotPreviouslyAssignedExecutor) executor;
                    continue;
                }
                emails = ((DslUserFilterExecutor) executor).calculateUsers(context, emails);
            }
        }
        if (removePrevAssigned != null) {
            emails = removePrevAssigned.calculateUsers(context, emails);
        }

    }

    @Override
    public Logger getLOG() {
        return LOG;
    }
}
