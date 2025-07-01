package dti.crmsis.back.taskassignment;

import dti.crmsis.back.dao.app.DslConfigEntity;
import dti.crmsis.back.taskassignment.dsl.DslBlock;
import dti.crmsis.back.taskassignment.dsl.DslParser;
import dti.crmsis.back.taskassignment.dslexecutors.DslBlockExecutor;
import dti.crmsis.back.taskassignment.dslexecutors.DslBlockExecutorFactory;
import dti.crmsis.back.taskassignment.dslexecutors.DslExecutorRegistry;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.Map;

import static dti.crmsis.back.dao.app.DslConfigEntityType.GLOBAL;

@ApplicationScoped
public class TaskAssignmentInitializer {

    @Inject
    DslParser dslParser;

    @Inject
    DslExecutorRegistry dslExecutorRegistry;

    @Inject
    DslBlockExecutorFactory dslBlockExecutorFactory;

    public void init() {
        initGlobalBeans();
//        initGlobalActions();
    }

    private void initGlobalBeans() {
        List<DslConfigEntity> configsWithMaxVersion = DslConfigEntity.findConfigsWithMaxVersion(GLOBAL);
        for (var config : configsWithMaxVersion) {
            Map<String, DslBlock> assignmentPolicyMap = dslParser.parseString(config.definition);
            for (var entry : assignmentPolicyMap.entrySet()) {
                dslExecutorRegistry.register(entry.getKey(), createBlock(entry.getValue()));
            }
        }
    }

    private DslBlockExecutor<DslBlock> createBlock(DslBlock value) {
        DslBlockExecutor<DslBlock> executor = dslBlockExecutorFactory.getBlockExecutorFor(value);
        executor.init(value, null, null);
        return executor;
    }

}
