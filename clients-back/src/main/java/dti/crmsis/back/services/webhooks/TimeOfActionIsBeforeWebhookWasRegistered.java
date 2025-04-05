package dti.crmsis.back.services.webhooks;

import java.time.LocalDateTime;

public class TimeOfActionIsBeforeWebhookWasRegistered extends  RuntimeException{
    public LocalDateTime actionTime;
    public LocalDateTime webhookRegistered;

    public TimeOfActionIsBeforeWebhookWasRegistered(LocalDateTime actionTime, LocalDateTime webhookRegistered) {
        super();
        this.actionTime = actionTime;
        this.webhookRegistered = webhookRegistered;
    }
}
