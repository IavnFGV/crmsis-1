package dti.crmsis.back.taskassignment.dsl;

public final class DslUserSortByRandomBlock
        implements DslUserSortBlock {
    public static final String TYPE = "sortByRandom";

    @Override
    public String getType() {
        return TYPE;
    }
}
