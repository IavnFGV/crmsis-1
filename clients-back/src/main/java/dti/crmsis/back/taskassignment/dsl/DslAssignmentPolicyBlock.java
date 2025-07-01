package dti.crmsis.back.taskassignment.dsl;

public sealed interface DslAssignmentPolicyBlock extends DslBlock
        permits DslAssignmentPolicyDefaultBlock,
        DslChainAssignmentPolicyBlock,
        DslOneByOneAssignmentPolicyBlock {
}

