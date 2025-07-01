package dti.crmsis.back.taskassignment.dsl;

public final class DslUserFilterByAvailabilityBlock
        implements DslUserFilterBlock {

    public static final String TYPE = "filterByAvailability";

    @Override
    public String getType() {
        return TYPE;
    }
}
