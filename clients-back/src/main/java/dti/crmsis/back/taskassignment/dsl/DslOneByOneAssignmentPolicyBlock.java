package dti.crmsis.back.taskassignment.dsl;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.LinkedHashMap;

public final class DslOneByOneAssignmentPolicyBlock implements DslAssignmentPolicyBlock,
        DslBlock {
    private String type;
    private int retryCount;
    private int waitMinutes;
    private String successCheck;
    private DslRefActionBlock failAction;
    @JsonDeserialize(as = LinkedHashMap.class)
    private LinkedHashMap<String, MemberConfig> members;

    private java.util.List<WaitRuleDto> waitRules;

    @Override
    public String getType() {
        return type;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public String getSuccessCheck() {
        return successCheck;
    }

    public DslRefActionBlock getFailAction() {
        return failAction;
    }

    public LinkedHashMap<String, MemberConfig> getMembers() {
        return members;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    public void setSuccessCheck(String successCheck) {
        this.successCheck = successCheck;
    }

    public void setFailAction(DslRefActionBlock failAction) {
        this.failAction = failAction;
    }

    public void setMembers(LinkedHashMap<String, MemberConfig> members) {
        this.members = members;
    }

    public int getWaitMinutes() {
        return waitMinutes;
    }

    public void setWaitMinutes(int waitMinutes) {
        this.waitMinutes = waitMinutes;
    }


    public java.util.List<WaitRuleDto> getWaitRules() {
        return waitRules;
    }

    public void setWaitRules(java.util.List<WaitRuleDto> waitRules) {
        this.waitRules = waitRules;
    }
}
