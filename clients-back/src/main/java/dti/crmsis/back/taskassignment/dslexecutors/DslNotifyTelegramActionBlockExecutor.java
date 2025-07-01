package dti.crmsis.back.taskassignment.dslexecutors;

import dti.crmsis.back.taskassignment.TaskAssignmentContext;
import dti.crmsis.back.taskassignment.dsl.DslNotifyTelegramActionBlock;
import dti.crmsis.back.taskassignment.utils.ContextIsCompletedException;
import dti.crmsis.back.taskassignment.utils.WithContextLock;
import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.Dependent;

import java.util.Map;

@Unremovable
@BlockType("notifyTelegramAction")
@Dependent
public class DslNotifyTelegramActionBlockExecutor  implements DslBlockExecutor<DslNotifyTelegramActionBlock>{
    private DslNotifyTelegramActionBlock block;

    @Override
    public void init(DslNotifyTelegramActionBlock block, Map<String, DslBlockExecutor<?>> allBlockExecutors, String flowId) {
        this.block = block;
    }

    @WithContextLock
    @Override
    public void receive(TaskAssignmentContext context) throws ContextIsCompletedException {

    }

    @Override
    public void stop(TaskAssignmentContext context) {

    }
}
