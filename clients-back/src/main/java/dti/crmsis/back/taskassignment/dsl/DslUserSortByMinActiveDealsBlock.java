package dti.crmsis.back.taskassignment.dsl;

public final class DslUserSortByMinActiveDealsBlock
        implements DslUserSortBlock {
    public static final String TYPE = "sortByMinActiveDeals";

    @Override
    public String getType() {
        return TYPE;
    }
}
