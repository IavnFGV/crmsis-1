package dti.crmsis.back.taskassignment;

import dti.crmsis.back.taskassignment.dsl.DslBlock;
import dti.crmsis.back.taskassignment.dsl.DslBlockScanner;
import dti.crmsis.back.taskassignment.dsl.DslFlowBlock;
import dti.crmsis.back.taskassignment.dsl.DslRefBlock;
import dti.crmsis.back.taskassignment.dslexecutors.DslBlockExecutor;
import dti.crmsis.back.taskassignment.dslexecutors.DslBlockExecutorFactory;
import dti.crmsis.back.taskassignment.utils.ContextIsCompletedException;
import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Unremovable
@Dependent
public class DslEngine {

    @Inject
    DslBlockExecutorFactory factory;

    Map<String, DslBlockExecutor<?>> pathToExecutors = new HashMap<>();
    Map<DslBlock, DslBlockExecutor<? extends DslBlock>> blockToExecutors = new HashMap<>();
    Map<String, String> blockNameToPath = new HashMap<>();

    public void init(DslFlowBlock dslFlowBlock, String flowId) {
        blockNameToPath = DslBlockScanner.scanFlowWithPaths(dslFlowBlock, (block, path) -> {
            DslBlockExecutor<DslBlock> executor = createBlock(block);
            pathToExecutors.put(path, executor);
            blockToExecutors.put(block, executor);
            if (!(block instanceof DslRefBlock)) {
                executor.init(block, pathToExecutors, flowId);
            }
        });
    }

    private DslBlockExecutor createBlock(DslBlock block) {
        return factory.getBlockExecutorFor(block);
    }

    public void execute(String sourceBlockName, TaskAssignmentContext payload) throws ContextIsCompletedException {
        String path = blockNameToPath.get(sourceBlockName);
        if (path == null) {
            throw new IllegalStateException("Unknown block name: " + sourceBlockName);
        }

        DslBlockExecutor<?> executor = pathToExecutors.get(path);
        if (executor != null) {
            executor.receive(payload);
        }
    }

    public void stop(TaskAssignmentContext context) {
        pathToExecutors.values().forEach(dslBlockExecutor -> dslBlockExecutor.stop(context));
    }

    public <T extends DslBlock> DslBlockExecutor<?> getExecutor(T dslBlock) {
        DslBlockExecutor<?> dslBlockExecutor = blockToExecutors.get(dslBlock);
        Objects.requireNonNull(dslBlockExecutor);
        return dslBlockExecutor;
    }
}