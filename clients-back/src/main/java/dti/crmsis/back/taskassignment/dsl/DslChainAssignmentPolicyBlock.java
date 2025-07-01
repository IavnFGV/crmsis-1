package dti.crmsis.back.taskassignment.dsl;

import java.util.List;

public final class DslChainAssignmentPolicyBlock implements DslAssignmentPolicyBlock, DslBlock {
    private String type;
    private List<String> policies;

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getPolicies() {
        return policies;
    }

    public void setPolicies(List<String> policies) {
        this.policies = policies;
    }
}