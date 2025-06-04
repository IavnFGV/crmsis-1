package dti.crmsis.back.taskassignment.framework;

public class CantFindUserByEmailException extends RuntimeException {
    public CantFindUserByEmailException(String message) {
        super(message);
    }
}
