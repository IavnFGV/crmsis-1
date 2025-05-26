package dti.crmsis.back.taskassignment;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
public class DslEngine {
    Map<String, DslBlockExecutor> blockInstances = new HashMap<>();

    public void load(DslConfig config) {
        for (var entry : config.blocks().entrySet()) {
            blockInstances.put(entry.getKey(), createBlock(entry.getValue()));
        }
        for (var entry : config.blocks().entrySet()) {
            blockInstances.get(entry.getKey()).init(entry.getValue(), blockInstances);
        }
    }

    private DslBlockExecutor createBlock(DslBlock block) {
        return switch (block.type()) {
            case "source" -> new SourceBlock();
            case "receiver" -> new ReceiverBlock();
            case "fairReceiver" -> new FairRoundRobinReceiverBlock();
            default -> throw new IllegalArgumentException("Unknown block: " + block.type());
        };
    }

    public void receive(String sourceBlockName, LeadPayload payload) {
        var block = blockInstances.get(sourceBlockName);
        if (block != null) block.receive(payload);
    }
}