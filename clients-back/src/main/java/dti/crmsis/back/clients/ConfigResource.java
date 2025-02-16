package dti.crmsis.back.clients;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api/config")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ConfigResource {

    private String url;
    private String token;

    @POST
    public Response saveConfig(Config config) {
        this.url = config.url;
        this.token = config.token;
        return Response.ok().build();
    }

    public static class Config {
        public String url;
        public String token;
    }
}
