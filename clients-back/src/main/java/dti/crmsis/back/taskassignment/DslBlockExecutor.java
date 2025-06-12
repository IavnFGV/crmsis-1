package dti.crmsis.back.taskassignment;

import dti.crmsis.back.taskassignment.dsl.DslBlock;

import java.util.Map;

public interface DslBlockExecutor<T extends DslBlock> extends DslBlockMarker {
    void init(T block, Map<String, DslBlockExecutor<?>> allBlockExecutors,String flowId);
    void receive(TaskAssignmentContext context);
    void stop(TaskAssignmentContext context);
}