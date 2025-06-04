package dti.crmsis.back.taskassignment;

import dti.crmsis.back.taskassignment.dsl.DslBlock;
import dti.crmsis.back.taskassignment.dsl.DslConfig;
import dti.crmsis.back.taskassignment.dsl.DslFlowBlock;
import dti.crmsis.back.taskassignment.dsl.DslRefBlock;
import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

import java.util.HashMap;
import java.util.Map;

@Unremovable
@Dependent
public class DslEngine {

    @Inject
    DslBlockExecutorFactory factory;

    Map<String, DslBlockExecutor<?>> blockInstances = new HashMap<>();

    public void init(DslFlowBlock dslFlowBlock, String flowId) {
        for (var entry : dslFlowBlock.getBlocks().entrySet()) {
            blockInstances.put(entry.getKey(), createBlock(entry.getValue()));
        }
        for (var entry : dslFlowBlock.getBlocks().entrySet()) {
            @SuppressWarnings("unchecked")
            var executor = (DslBlockExecutor<DslBlock>) blockInstances.get(entry.getKey());
            if(!(entry.getValue() instanceof DslRefBlock)){
                executor.init(entry.getValue(), blockInstances, flowId);
            }
        }
    }

    private DslBlockExecutor createBlock(DslBlock block) {
        return factory.getBlockExecutorFor(block);
    }

    public void execute(String sourceBlockName, TaskAssignmentContext payload) {
        var block = blockInstances.get(sourceBlockName);
        if (block != null) block.receive(payload);
    }

    public void stop() {
        blockInstances.values().forEach(DslBlockExecutor::stop);
    }
}