package dti.crmsis.back.taskassignment;

import java.util.Map;

public interface DslBlockExecutor {
    void init(DslBlock block, Map<String, DslBlockExecutor> allBlocks);
    void receive(LeadPayload lead);
}