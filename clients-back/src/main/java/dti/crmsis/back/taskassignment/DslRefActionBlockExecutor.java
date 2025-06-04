package dti.crmsis.back.taskassignment;

import dti.crmsis.back.taskassignment.dsl.DslRefActionBlock;
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
    public void receive(TaskAssignmentContext context) {

    }

    @Override
    public void stop() {

    }
}
