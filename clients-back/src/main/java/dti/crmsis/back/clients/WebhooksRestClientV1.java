package dti.crmsis.back.clients;

import dti.crmsis.back.LoggingFilter;
import dti.crmsis.back.clients.dto.NewWebhookRequest;
import dti.crmsis.back.clients.dto.WebhookRegistrationResponse;
import dti.crmsis.back.clients.dto.WebhookResponse;
import dti.crmsis.back.services.Constants;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = Constants.API_PIPEDRIVE_COM + Constants.V_1)
@RegisterProvider(LoggingFilter.class)
public interface WebhooksRestClientV1 {

    @GET
    @Path("/webhooks")
    WebhookResponse getAll(@QueryParam("api_token") String token);

    @POST
    @Path("/webhooks")
    WebhookRegistrationResponse registerNewWebhook(@QueryParam("api_token") String token, NewWebhookRequest request);

}
