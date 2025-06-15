package dti.crmsis.back.taskassignment.dsl;

import java.util.List;

public final class DslSourceBlock implements DslBlock {
    private String type;
    private List<String> subscribe;
    private String passTo;
    private int delaySecs = 0;

    @Override
    public String getType() {
        return type;
    }

    public List<String> getSubscribe() {
        return subscribe;
    }

    public String getPassTo() {
        return passTo;
    }

    public int getDelaySecs() {
        return delaySecs;
    }
}
