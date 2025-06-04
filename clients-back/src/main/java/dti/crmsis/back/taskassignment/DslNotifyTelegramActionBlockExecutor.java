package dti.crmsis.back.taskassignment;

import dti.crmsis.back.taskassignment.dsl.DslNotifyTelegramActionBlock;
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

    @Override
    public void receive(TaskAssignmentContext context) {

    }

    @Override
    public void stop() {

    }
}
