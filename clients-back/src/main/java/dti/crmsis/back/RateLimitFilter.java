package dti.crmsis.back;

import dti.crmsis.back.clients.Constants;
import jakarta.annotation.Priority;
import jakarta.ws.rs.client.ClientRequestContext;
import jakarta.ws.rs.client.ClientRequestFilter;
import jakarta.ws.rs.client.ClientResponseContext;
import jakarta.ws.rs.client.ClientResponseFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

@Priority(5000)
public class RateLimitFilter implements ClientResponseFilter , ClientRequestFilter {

    private static final Semaphore semaphore = new Semaphore(Constants.MAX_REQUESTS_PER_SECOND);
    private static final Logger log = LoggerFactory.getLogger(RateLimitFilter.class);

    @Override
    public void filter(ClientRequestContext clientRequestContext) throws IOException {
        try {
            while (!semaphore.tryAcquire(1, TimeUnit.SECONDS)) {
                log.warn("Rate limit exceeded. Waiting for semaphore.");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Request interrupted while waiting for semaphore.", e);
        }
    }

    @Override
    public void filter(ClientRequestContext clientRequestContext, ClientResponseContext clientResponseContext) throws IOException {
        semaphore.release();
    }
}
