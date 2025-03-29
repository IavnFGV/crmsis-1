package dti.crmsis.back.services.webhooks;

public class NotEnoughFieldsException extends RuntimeException {

    public NotEnoughFieldsException(String message) {
        super(message);
    }

}
