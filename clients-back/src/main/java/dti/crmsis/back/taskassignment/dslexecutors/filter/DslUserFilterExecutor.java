package dti.crmsis.back.taskassignment.dslexecutors.filter;

import dti.crmsis.back.taskassignment.TaskAssignmentContext;
import dti.crmsis.back.taskassignment.dsl.DslUserFilterBlock;
import dti.crmsis.back.taskassignment.dslexecutors.DslBlockExecutor;
import dti.crmsis.back.taskassignment.utils.ContextIsCompletedException;

import java.util.List;
import java.util.Map;

public abstract class DslUserFilterExecutor<T extends DslUserFilterBlock>
        implements DslBlockExecutor<T> {
    protected T block;
    protected TaskAssignmentContext context;

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
        //empty for now
    }

    abstract public List<String> calculateUsers(TaskAssignmentContext context,List<String> prevList);

    abstract public List<String> calculateInitialUsers(TaskAssignmentContext context);
}
