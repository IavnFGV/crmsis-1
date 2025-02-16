package dti.crmsis.back.services;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import static dti.crmsis.back.clients.Constants.PAGE_LIMIT;

@ApplicationScoped
public class PagingServiceV1 {


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
}
