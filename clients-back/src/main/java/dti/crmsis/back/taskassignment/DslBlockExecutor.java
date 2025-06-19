package dti.crmsis.back.taskassignment;

import dti.crmsis.back.taskassignment.dsl.DslBlock;
import dti.crmsis.back.taskassignment.utils.ContextIsCompletedException;

import java.util.Map;

public interface DslBlockExecutor<T extends DslBlock> extends DslBlockMarker {
    void init(T block, Map<String, DslBlockExecutor<?>> allBlockExecutors,String flowId);
    void receive(TaskAssignmentContext context) throws ContextIsCompletedException;
    void stop(TaskAssignmentContext context);
}