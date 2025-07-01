package dti.crmsis.back.taskassignment.dslexecutors;

import dti.crmsis.back.taskassignment.TaskAssignmentContext;
import dti.crmsis.back.taskassignment.dsl.DslRefActionBlock;
import dti.crmsis.back.taskassignment.utils.ContextIsCompletedException;
import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.Dependent;

import java.util.Map;

@Unremovable
@Dependent
@BlockType("refAction")
public class DslRefActionBlockExecutor implements DslBlockExecutor<DslRefActionBlock>{
    @Override
    public void init(DslRefActionBlock block, Map<String, DslBlockExecutor<?>> allBlockExecutors, String flowId) {

    }

    @Override
    public void receive(TaskAssignmentContext context)throws ContextIsCompletedException {

    }

    @Override
    public void stop(TaskAssignmentContext context) {
        throw new UnsupportedOperationException("Should be called on not ref block" );
    }
}
