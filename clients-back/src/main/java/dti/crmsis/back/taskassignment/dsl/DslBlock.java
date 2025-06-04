package dti.crmsis.back.taskassignment.dsl;

@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@com.fasterxml.jackson.annotation.JsonSubTypes({
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = DslSourceBlock.class, name = "source"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = DslOneByOneAssignmentPolicyBlock.class, name = "oneByOneAssignmentPolicy"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = DslRefAssignmentPolicyBlock.class, name = "refAssignmentPolicy"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = DslRefActionBlock.class, name = "refAction"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = DslFlowBlock.class, name = "flow"),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = DslNotifyTelegramActionBlock.class, name = "notifyTelegramAction")
})
public sealed interface DslBlock permits DslAssignmentPolicyBlock, DslActionBlock, DslNotifyTelegramActionBlock, DslRefActionBlock, DslFlowBlock, DslRefAssignmentPolicyBlock, DslRefBlock, DslSourceBlock, DslOneByOneAssignmentPolicyBlock {
    String getType();
}


