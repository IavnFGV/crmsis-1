package dti.crmsis.back.taskassignment.dsl;

public sealed interface DslRefBlock
        extends DslBlock
        permits DslRefAssignmentPolicyBlock,
        DslRefActionBlock {
    String getRef();
}
