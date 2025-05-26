package dti.crmsis.back.taskassignment;

import java.util.HashMap;
import java.util.Map;

public class FairRoundRobinReceiverBlock implements DslBlockExecutor {
    private DslBlock block;
    private final Map<String, Integer> assignedCount = new HashMap<>();

    @Override
    public void init(DslBlock block, Map<String, DslBlockExecutor> allBlocks) {
        this.block = block;
        for (String member : block.members()) {
            assignedCount.put(member, 0);
        }
    }

    @Override
    public void receive(LeadPayload lead) {
        double totalWeight = block.weights().values().stream().mapToDouble(Double::doubleValue).sum();
        String selected = null;
        double maxDelta = Double.NEGATIVE_INFINITY;

        int totalAssigned = assignedCount.values().stream().mapToInt(Integer::intValue).sum();

        for (String member : block.members()) {
            double expected = totalWeight == 0 ? 0 : block.weights().getOrDefault(member, 0.0) * totalAssigned / totalWeight;
            double actual = assignedCount.getOrDefault(member, 0);
            double delta = expected - actual;
            if (delta > maxDelta) {
                maxDelta = delta;
                selected = member;
            }
        }

        if (selected != null) {
            assignedCount.put(selected, assignedCount.get(selected) + 1);
            System.out.println("Fairly assigned to: " + selected);
        }
    }
}
