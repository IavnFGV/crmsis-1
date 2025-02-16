package dti.crmsis.back.services;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

import static dti.crmsis.back.clients.Constants.PAGE_LIMIT;

@ApplicationScoped
public class PagingServiceV2 {


    public <T, R> List<R> fetchAllPages(BiFunction<String, Integer, T> apiCall,
                                        Function<T, List<R>> extractor,
                                        Function<T, String> nextCursorExtractor,
                                        Consumer<R> persistAction ) {
        List<R> allItems = new ArrayList<>();
        String cursor = null;
        T response;

        do {
            response = apiCall.apply(cursor, PAGE_LIMIT);
            if (response == null) break;

            List<R> extractedData = extractor.apply(response);
            if(persistAction != null) {
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
}
