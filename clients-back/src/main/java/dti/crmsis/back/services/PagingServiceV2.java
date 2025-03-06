package dti.crmsis.back.services;

import jakarta.enterprise.context.ApplicationScoped;
import org.jboss.logging.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

import static dti.crmsis.back.services.Constants.PAGE_LIMIT;

@ApplicationScoped
public class PagingServiceV2 {
    private static final Logger logger = Logger.getLogger(PagingServiceV2.class);


    public <T, R> List<R> fetchAllPages(BiFunction<String, Integer, T> apiCall,
                                        Function<T, List<R>> extractor,
                                        Function<T, String> nextCursorExtractor,
                                        Consumer<R> persistAction) {
        List<R> allItems = new ArrayList<>();
        String cursor = null;
        T response;

        do {
            response = apiCall.apply(cursor, PAGE_LIMIT);
            if (response == null) break;

            List<R> extractedData = extractor.apply(response);
            if (persistAction != null) {
                extractedData.forEach(persistAction);
            }
            if (extractedData != null && !extractedData.isEmpty()) {
                allItems.addAll(extractedData);
                cursor = nextCursorExtractor.apply(response);
            } else {
                break;
            }
        } while (cursor != null);

        return allItems;
    }

    public void fetchAllData(String apiToken, Long rootEvent,
                             BiFunction<String, String, String> apiCallFunction,
                             BiFunction<String, Long, Long> function) {
        String cursor = null;

        Long eventId = rootEvent;

        try {
            do {
                String jsonResponse = apiCallFunction.apply(cursor, apiToken);
                eventId = function.apply(jsonResponse, eventId);
                cursor = extractNextCursor(jsonResponse);
            } while (cursor != null && !cursor.isEmpty());
        } catch (Exception e) {
            throw new RuntimeException("Failed to fetch data", e);
        }
    }


    public void fetchAllDataNew(Long rootEvent,
                             Function<String,String> apiCallFunction,
                             BiFunction<String, Long, Long> function) {
        String cursor = null;
        Long eventId = rootEvent;
        try {
            do {
                String jsonResponse = null;
                try {
                    jsonResponse = apiCallFunction.apply(cursor);
                } catch (Exception e) {
                    logger.error("Failed to fetch data "+ e.getMessage(), e);
                    jsonResponse = "{'error': '"+e.getMessage()+"'}";
                }
                eventId = function.apply(jsonResponse, eventId);
                cursor = extractNextCursor(jsonResponse);
            } while (cursor != null && !cursor.isEmpty());
        } catch (Exception e) {
            throw new RuntimeException("Failed to fetch data", e);
        }
    }


    private String extractNextCursor(String jsonResponse) {
        try {
            return new com.fasterxml.jackson.databind.ObjectMapper()
                    .readTree(jsonResponse)
                    .path("additional_data")
                    .path("next_cursor")
                    .asText(null);
        } catch (Exception e) {
            return null;
        }
    }


}
