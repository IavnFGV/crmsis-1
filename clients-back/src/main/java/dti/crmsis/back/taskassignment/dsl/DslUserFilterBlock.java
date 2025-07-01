package dti.crmsis.back.taskassignment.dsl;

public sealed interface DslUserFilterBlock extends DslBlock
        permits DslUserFilterByPermissionBlock,
        DslUserFilterByAvailabilityBlock,
        DslUserFilterNotPreviouslyAssignedBlock {
}
