package dti.crmsis.back.resources;

import dti.crmsis.back.services.ClientDataExtractorServiceGenerated;
import dti.crmsis.back.services.CustomerDetailsService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.jboss.logging.Logger;

import java.util.Objects;

@Path("/clients")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClientRegistrationResource {

    private static final Logger logger = Logger.getLogger(ClientRegistrationResource.class);

    @Inject
    CustomerDetailsService detailsService;

    @Inject
    ClientDataExtractorServiceGenerated clientDataExtractorServiceGenerated;

    @POST
    @Path("/force_init")
    public Response forceInit(@QueryParam("api_token") String apiToken) {

        if (apiToken == null || apiToken.isEmpty()) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Missing api_token")
                    .build();
        }

        try {
            if(!Objects.equals(apiToken, detailsService.getApiToken())) {
                return Response.status(Response.Status.BAD_REQUEST)
                        .entity("Wrong api_token")
                        .build();
            }
            clientDataExtractorServiceGenerated.initClient(detailsService.getCustomerInfo());
            return Response.ok().entity("Client successfully registered").build();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity("Error registering client: " + e.getMessage())
                    .build();
        }
    }

    public static class ClientRegistrationRequest {
        public String name;
        public String url;
        public String token;
        public String fullName;
    }
}
