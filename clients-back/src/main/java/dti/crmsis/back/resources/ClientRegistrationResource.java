package dti.crmsis.back.resources;

import dti.crmsis.back.LoggingFilter;
import dti.crmsis.back.services.ClientRegistrationService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.jboss.logging.Logger;

@Path("/clients")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClientRegistrationResource {

    private static final Logger logger = Logger.getLogger(ClientRegistrationResource.class);

    @Inject
    ClientRegistrationService clientRegistrationService;

    @POST
    @Path("/register")
    public Response registerClient(ClientRegistrationRequest request) {
        try {
            clientRegistrationService.registerClient(
                    request.name,
                    request.token,
                    request.url
            );
            return Response.ok().entity("Client successfully registered").build();
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
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
