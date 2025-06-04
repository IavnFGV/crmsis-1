package dti.crmsis.back.taskassignment.dsl;

public final class DslRefAssignmentPolicyBlock implements DslRefBlock, DslBlock {
    private String ref;

    @Override
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    @Override
    public String getType() {
        return "refAssignmentPolicy";
    }
}
