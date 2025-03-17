package dti.crmsis.back.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import dti.crmsis.back.utils.TriFunction;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import static dti.crmsis.back.services.Constants.PAGE_LIMIT;

@Singleton
public class PagingServiceV1 {


    private final ObjectMapper objectMapper;

    @jakarta.inject.Inject
    public PagingServiceV1(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public <T, R> List<R> fetchAllPages(BiFunction<Integer, Integer, T> apiCall,
                                        Function<T, List<R>> extractor,
                                        Function<T, Boolean> hasMoreItems) {
        List<R> allItems = new ArrayList<>();
        int start = 0;
        T response;

        do {
            response = apiCall.apply(start, PAGE_LIMIT);
            if (response == null) break;

            List<R> extractedData = extractor.apply(response);
            if (extractedData != null && !extractedData.isEmpty()) {
                allItems.addAll(extractedData);
                start += PAGE_LIMIT;
            } else {
                break;
            }
        } while (hasMoreItems.apply(response));

        return allItems;
    }



    public void fetchAllData(String apiToken,Long rootEvent,
                             TriFunction<Integer, Integer, String, String> apiCallFunction,
                             BiFunction<String, Long, Long> function
    ) {
        int start = 0;
        Long eventId = rootEvent;

        try {
            String jsonResponse;
            do {
                jsonResponse = apiCallFunction.apply(start, PAGE_LIMIT, apiToken);
                eventId = function.apply(jsonResponse, eventId);
                start += PAGE_LIMIT;
            } while (hasMoreItems(jsonResponse));
        } catch (Exception e) {
            throw new RuntimeException("Failed to fetch data", e);
        }
    }

    public void fetchAllDataNew(Long rootEvent,
                                Function<Integer, String> apiCallFunction,
                                BiFunction<String, Long, Long> function
    ) {
        int start = 0;
        Long eventId = rootEvent;

        try {
            String jsonResponse;
            do {
                jsonResponse = apiCallFunction.apply(start);
                eventId = function.apply(jsonResponse, eventId);
                start += PAGE_LIMIT;
            } while (hasMoreItems(jsonResponse));
        } catch (Exception e) {
            throw new RuntimeException("Failed to fetch data", e);
        }
    }


    private boolean hasMoreItems(String jsonResponse) {
        try {
            return objectMapper
                    .readTree(jsonResponse)
                    .path("additional_data")
                    .path("pagination")
                    .path("more_items_in_collection")
                    .asBoolean(false);
        } catch (Exception e) {
            throw new RuntimeException("Failed to extract pagination info", e);
        }
    }



}
