package dti.crmsis.back.services.webhooks;

public class JsonProblemException extends RuntimeException {

    public JsonProblemException(String message, Exception e) {
        super(message, e);
    }
}
