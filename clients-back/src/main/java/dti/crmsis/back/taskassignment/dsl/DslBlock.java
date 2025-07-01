package dti.crmsis.back.taskassignment.dsl;

@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@com.fasterxml.jackson.annotation.JsonSubTypes({
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = DslSourceBlock.class, name = "source"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = DslOneByOneAssignmentPolicyBlock.class, name = "oneByOneAssignmentPolicy"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = DslRefAssignmentPolicyBlock.class, name = "refAssignmentPolicy"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = DslRefActionBlock.class, name = "refAction"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = DslFlowBlock.class, name = "flow"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = DslChainAssignmentPolicyBlock.class, name = "chainAssignmentPolicy"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = DslAssignmentPolicyDefaultBlock.class, name = DslAssignmentPolicyDefaultBlock.TYPE),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = DslNotifyTelegramActionBlock.class, name = "notifyTelegramAction"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = DslUserFilterByPermissionBlock.class, name = DslUserFilterByPermissionBlock.TYPE),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = DslUserFilterByAvailabilityBlock.class, name = DslUserFilterByAvailabilityBlock.TYPE),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = DslUserSortByMinActiveDealsBlock.class, name = DslUserSortByMinActiveDealsBlock.TYPE),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = DslUserSortByRandomBlock.class, name = DslUserSortByRandomBlock.TYPE),
})
public sealed interface DslBlock
        permits DslActionBlock,
        DslAssignmentPolicyBlock,
        DslAssignmentPolicyDefaultBlock,
        DslChainAssignmentPolicyBlock,
        DslFlowBlock,
        DslNotifyTelegramActionBlock,
        DslOneByOneAssignmentPolicyBlock,
        DslRefActionBlock,
        DslRefAssignmentPolicyBlock,
        DslRefBlock,
        DslSourceBlock,
        DslUserFilterBlock,
        DslUserSortBlock {
    String getType();
}


