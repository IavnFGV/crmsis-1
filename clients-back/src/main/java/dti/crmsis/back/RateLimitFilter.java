package dti.crmsis.back;

import jakarta.annotation.Priority;
import jakarta.ws.rs.client.ClientRequestContext;
import jakarta.ws.rs.client.ClientRequestFilter;
import jakarta.ws.rs.client.ClientResponseContext;
import jakarta.ws.rs.client.ClientResponseFilter;
import org.jboss.logging.Logger;

import java.io.IOException;

import static dti.crmsis.back.services.Constants.MAX_REQUESTS_PER_SECOND;

@Priority(5000)
public class RateLimitFilter implements ClientResponseFilter , ClientRequestFilter {

    private static final Logger log = Logger.getLogger(RateLimitFilter.class);
    private static TokenBucket tokenBucket;


    public void init() {
        log.info("Rate limit filter initialized.");
        tokenBucket = new TokenBucket(MAX_REQUESTS_PER_SECOND);
    }

    @Override
    public void filter(ClientRequestContext requestContext) throws IOException {
        try {
            tokenBucket.consume(); // блокирует, если нет токенов
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Interrupted while waiting for token", e);
        }
    }

    @Override
    public void filter(ClientRequestContext requestContext, ClientResponseContext responseContext) {
        // nothing to do
    }


}
