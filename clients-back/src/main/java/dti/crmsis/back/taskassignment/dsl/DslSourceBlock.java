package dti.crmsis.back.taskassignment.dsl;

import java.util.List;

public final class DslSourceBlock implements DslBlock {
    private String type;
    private List<String> subscribe;
    private String pass_to;

    @Override
    public String getType() { return type; }
    public List<String> getSubscribe() { return subscribe; }
    public String getPass_to() { return pass_to; }
}
