package dti.crmsis.back.taskassignment;

import java.util.Map;

public class SourceBlock implements DslBlockExecutor {
    private DslBlock block;
    private DslBlockExecutor next;

    @Override
    public void init(DslBlock block, Map<String, DslBlockExecutor> allBlocks) {
        this.block = block;
        this.next = allBlocks.get(block.pass_to());
    }

    @Override
    public void receive(LeadPayload lead) {
        if (next != null) next.receive(lead);
    }
}