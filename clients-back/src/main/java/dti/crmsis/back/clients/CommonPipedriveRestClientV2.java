package dti.crmsis.back.clients;


import dti.crmsis.back.ApiTokenRequestFilter;
import dti.crmsis.back.RateLimitFilter;
import dti.crmsis.back.services.Constants;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.Map;

@RegisterRestClient(baseUri = Constants.API_PIPEDRIVE_COM + Constants.V_2)
@RegisterProvider(ApiTokenRequestFilter.class)
@RegisterProvider(RateLimitFilter.class)
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface CommonPipedriveRestClientV2 {
    @PATCH
    @Path("/deals/{dealId}")
    Map<String, Object> updateDeal(@PathParam("dealId") long dealId, Map<String, Object> body);

}
