package dti.crmsis.back.taskassignment.dsl;

import java.util.List;

public final class DslAssignmentPolicyDefaultBlock
        implements DslAssignmentPolicyBlock,
        DslBlock {

    public static final String TYPE = "assignmentPolicyDefault";
    private List<DslUserFilterBlock> filters;
    private List<DslUserSortBlock> sort;
    private java.util.List<WaitRuleDto> waitRules;
    private DslRefActionBlock failAction;

    public List<DslUserFilterBlock> getFilters() {
        return filters;
    }

    public void setFilters(List<DslUserFilterBlock> filters) {
        this.filters = filters;
    }

    public List<DslUserSortBlock> getSort() {
        return sort;
    }

    public void setSort(List<DslUserSortBlock> sort) {
        this.sort = sort;
    }

    public DslRefActionBlock getFailAction() {
        return failAction;
    }

    public void setFailAction(DslRefActionBlock failAction) {
        this.failAction = failAction;
    }

    private int waitMinutes;

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


    @Override
    public String getType() {
        return TYPE;
    }
}