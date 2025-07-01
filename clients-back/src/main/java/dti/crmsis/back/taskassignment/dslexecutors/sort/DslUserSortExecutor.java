package dti.crmsis.back.taskassignment.dslexecutors.sort;

import dti.crmsis.back.taskassignment.TaskAssignmentContext;
import dti.crmsis.back.taskassignment.dsl.DslUserFilterBlock;
import dti.crmsis.back.taskassignment.dsl.DslUserSortBlock;
import dti.crmsis.back.taskassignment.dslexecutors.DslBlockExecutor;
import dti.crmsis.back.taskassignment.utils.ContextIsCompletedException;

import java.util.List;
import java.util.Map;

public abstract class DslUserSortExecutor<T extends DslUserSortBlock>
        implements DslBlockExecutor<T> {
    private T block;
    private TaskAssignmentContext context;

    @Override
    public void init(T block, Map<String, DslBlockExecutor<?>> allBlockExecutors, String flowId) {
        this.block = block;
    }

    @Override
    public void receive(TaskAssignmentContext context) throws ContextIsCompletedException {
        this.context = context;
    }

    @Override
    public void stop(TaskAssignmentContext context) {
        // nothing to do
    }

    public abstract List<String> sortManagers(List<String> managers);
}
