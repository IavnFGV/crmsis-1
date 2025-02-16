package dti.crmsis.back.services;

import dti.crmsis.back.dao.crmsis.RawRequestEntity;
import dti.crmsis.back.dao.clientsback.ProcessedEventsEntity;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@ApplicationScoped
public class WebhookProcessingService {

    @Transactional
    public void processRequestsForCustomer(String customerName) {
        // Получаем вебхуки из RAW_REQUESTS
        List<RawRequestEntity> rawRequests = RawRequestEntity.findByCustomerName(customerName);
        if (rawRequests.isEmpty()) return;

        // Обрабатываем каждый вебхук
        for (RawRequestEntity rawRequest : rawRequests) {
            String processedData = processWebhookData(rawRequest.getRequestData());

            // Сохраняем обработанные данные в CLIENTS_BACK
            ProcessedEventsEntity processed = new ProcessedEventsEntity();
            processed.customerName = rawRequest.getCustomerName();
            processed.processedData = processedData;
            processed.processedAt = LocalDateTime.now();
            processed.comments = "{status: done}";
            processed.persist();
        }
    }

    private String processWebhookData(String requestData) {
        return "Processed: " + requestData; // Здесь будет реальная логика обработки
    }
}
