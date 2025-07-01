package dti.crmsis.back.taskassignment.dslexecutors;

import dti.crmsis.back.taskassignment.DslEngine;
import dti.crmsis.back.taskassignment.dsl.DslFlowBlock;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

@ApplicationScoped
public class DslEngineFactory {
    @Inject
    Instance<DslEngine> engineProvider;

    public DslEngine createEngine(DslFlowBlock dslFlowBlock, String flowId) {
        DslEngine dslEngine = engineProvider.get();
        dslEngine.init(dslFlowBlock, flowId);
        return dslEngine;
    }
}
