package dti.crmsis.back.taskassignment.utils;

public class ContextIsCompletedException extends Exception {

    public ContextIsCompletedException() {
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
