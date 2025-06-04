package dti.crmsis.back.taskassignment.dsl;

public final class DslNotifyTelegramActionBlock implements DslActionBlock, DslBlock {

    private String token;

    @Override
    public String getType() {
        return "notifyTelegramAction";
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
