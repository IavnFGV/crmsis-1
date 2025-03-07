package dti.crmsis.back.resources;

import dti.crmsis.back.dao.crmsis.CustomerEntity;
import dti.crmsis.back.services.ClientDataExtractorServiceGenerated;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;

@Path("/clients")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClientRegistrationResource {

    private static final Logger logger = Logger.getLogger(ClientRegistrationResource.class);

    @ConfigProperty(name = "APP_TOKEN")
    public String apiToken;

    @Inject
    ClientDataExtractorServiceGenerated clientDataExtractorServiceGenerated;

    @POST
    @Path("/force_init")
    public Response forceInit() {
        try {
            CustomerEntity customerEntity = CustomerEntity.find("apiToken", apiToken).firstResult();
            if (customerEntity == null) {
                return Response.status(Response.Status.NO_CONTENT)
                        .entity("THERE IS NO CUSTOMER ENTITY WITH THIS TOKEN. PLEASE REGISTER A CUSTOMER FIRST")
                        .build();
            }

            clientDataExtractorServiceGenerated.initClient(customerEntity);
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
