package dti.crmsis.back.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import jakarta.ws.rs.WebApplicationException;
import org.jboss.logging.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

@Singleton
public class RetryWrapper {

    private static final Logger logger = Logger.getLogger(RetryWrapper.class);


    @Inject
    ObjectMapper objectMapper;

    private static final int MAX_RETRIES = 5;
    private static final long RETRY_DELAY_MS = 3000;

    public String wrapToRetry(Supplier<String> apiCall) {
        int retry = 0;
        List<Map<String, String>> errorList = new ArrayList<>();

        while (true) {
            try {
                return apiCall.get();
            } catch (Exception e) {
                retry++;

                Map<String, String> error = new HashMap<>();
                error.put("error", e.getClass().getSimpleName() + ": " + e.getMessage());
                errorList.add(error);


                if (e instanceof WebApplicationException webEx && webEx.getResponse().getStatus() == 402) {
                    logger.error("Received HTTP 402. Will not retry.");
                    break;
                }

                if (e instanceof WebApplicationException webEx && webEx.getResponse().getStatus() == 429) {
                    logger.warn("Rate limit hit (429). Waiting before retry...");
                    try {
                        TimeUnit.MILLISECONDS.sleep(RETRY_DELAY_MS);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                        errorList.add(Map.of("error", "Interrupted during retry delay"));
                        break;
                    }
                }

                if (retry >= MAX_RETRIES) {
                    logger.error("Maximum retry attempts reached.");
                    break;
                }
            }
        }

        try {
            return objectMapper.writeValueAsString(errorList);
        } catch (Exception jsonException) {
            logger.error("Failed to serialize error list to JSON", jsonException);
            return "[{\"error\":\"Failed to serialize error list\"}]";
        }
    }
}

