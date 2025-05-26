package dti.crmsis.back.taskassignment;

import java.util.Map;
import java.util.Random;

public class ReceiverBlock implements DslBlockExecutor {
    private DslBlock block;
    private final Random random = new Random();

    @Override
    public void init(DslBlock block, Map<String, DslBlockExecutor> allBlocks) {
        this.block = block;
    }

    @Override
    public void receive(LeadPayload lead) {
        // Simple fair selection simulation
        double total = block.weights().values().stream().mapToDouble(Double::doubleValue).sum();
        double pick = random.nextDouble() * total;
        double cumulative = 0;
        for (var entry : block.weights().entrySet()) {
            cumulative += entry.getValue();
            if (pick <= cumulative) {
                System.out.println("Assigned to: " + entry.getKey());
                return;
            }
        }
    }
}