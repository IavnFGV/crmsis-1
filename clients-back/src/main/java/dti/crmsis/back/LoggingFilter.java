package dti.crmsis.back;

import jakarta.annotation.Priority;
import jakarta.ws.rs.client.ClientRequestContext;
import jakarta.ws.rs.client.ClientRequestFilter;
import jakarta.ws.rs.client.ClientResponseContext;
import jakarta.ws.rs.client.ClientResponseFilter;
import jakarta.ws.rs.ext.Provider;
import org.jboss.logging.Logger;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Provider
@Priority(10000)
public class LoggingFilter implements ClientRequestFilter, ClientResponseFilter {

    private static final Logger LOG = Logger.getLogger(LoggingFilter.class);

    @Override
    public void filter(ClientRequestContext requestContext) throws IOException {
        LOG.infof("REST Client Request: %s %s", requestContext.getMethod(), requestContext.getUri());

        if (requestContext.hasEntity()) {
            String entity = requestContext.getEntity().toString();
            LOG.infof("Request Body: %s", entity);
        }
    }

    @Override
    public void filter(ClientRequestContext clientRequestContext, ClientResponseContext responseContext) throws IOException {
        LOG.infof("REST Client Response: %d %s", responseContext.getStatus(), responseContext.getHeaders());

        if (responseContext.hasEntity()) {
            String responseBody = new String(responseContext.getEntityStream().readAllBytes(), StandardCharsets.UTF_8);
            LOG.infof("Response Body: %s", responseBody);
            responseContext.setEntityStream(new java.io.ByteArrayInputStream(responseBody.getBytes(StandardCharsets.UTF_8))); // Восстанавливаем поток
        }
    }
}
