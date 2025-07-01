package dti.crmsis.back.taskassignment.dsl;

public final class DslUserFilterByPermissionBlock
        implements DslUserFilterBlock {
    public static final String TYPE = "filterByPermission";

    @Override
    public String getType() {
        return TYPE;
    }
}
