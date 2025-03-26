package dti.crmsis.back.services.webhooks;

public class NoHandlerFoundException extends RuntimeException {
    @Override
    public StackTraceElement[] getStackTrace() {
        return super.getStackTrace();
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
