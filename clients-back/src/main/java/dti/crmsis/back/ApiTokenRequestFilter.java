package dti.crmsis.back;

import jakarta.annotation.Priority;
import jakarta.ws.rs.client.ClientRequestContext;
import jakarta.ws.rs.client.ClientRequestFilter;
import jakarta.ws.rs.ext.Provider;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@Provider
@ApplicationScoped
@Priority(1000)
public class ApiTokenRequestFilter implements ClientRequestFilter {

    @ConfigProperty(name = "app.token")
    public String apiToken;

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    @Override
    public void filter(ClientRequestContext requestContext) throws IOException {
        if(apiToken == null){
            throw new IOException("api_token is not set");
        }
        try {
            URI originalUri = requestContext.getUri();
            String newQuery = originalUri.getQuery();
            newQuery = (newQuery == null ? "" : newQuery + "&") + "api_token=" + apiToken;
            URI newUri = new URI(originalUri.getScheme(), originalUri.getAuthority(), originalUri.getPath(), newQuery, originalUri.getFragment());
            requestContext.setUri(newUri);
        } catch (URISyntaxException e) {
            throw new IOException("Error adding api_token to request", e);
        }
    }
}