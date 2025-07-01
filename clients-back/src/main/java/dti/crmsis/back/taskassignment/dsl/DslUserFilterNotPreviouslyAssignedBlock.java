package dti.crmsis.back.taskassignment.dsl;

public final class DslUserFilterNotPreviouslyAssignedBlock
        implements DslUserFilterBlock {
    public static final String TYPE = "filterNotPreviouslyAssigned";

    @Override
    public String getType() {
        return TYPE;
    }
}
