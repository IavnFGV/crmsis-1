package dti.crmsis.back.resources;

import dti.crmsis.back.services.AppVersion;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.Map;

@Path("/version")
public class VersionResource {

    @Inject
    AppVersion appVersion;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, String> getVersion() {
        return Map.of("version", appVersion.getVersion());
    }
}
