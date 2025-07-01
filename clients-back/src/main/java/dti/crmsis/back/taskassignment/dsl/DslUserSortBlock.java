package dti.crmsis.back.taskassignment.dsl;

public sealed interface DslUserSortBlock
        extends DslBlock
        permits DslUserSortByMinActiveDealsBlock,
        DslUserSortByRandomBlock {
}
