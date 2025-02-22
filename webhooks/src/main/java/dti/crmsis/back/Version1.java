package dti.crmsis.back;


import dti.crmsis.back.dao.RawRequest;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/v1")
public class Version1 {

    @Inject
    MeterRegistry meterRegistry;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response hello() {
        return Response.ok(Version1.class.getSimpleName() + " says hello ").build();
    }

    @POST
    @Path("/webhook/{url_path}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response processRawRequest(@PathParam("url_path") String urlPath, String jsonBody) {
        String methodName = Utils.getCallerMethodName();
        Timer.Sample timer = Timer.start(meterRegistry);
        meterRegistry.counter(Version1.class.getSimpleName() + "." + methodName).increment();
        this.save(urlPath, jsonBody);
        timer.stop(meterRegistry.timer("timer-" + Version1.class.getSimpleName() + "." + methodName));
        return Response.ok("saved", MediaType.APPLICATION_JSON).build();
    }

    @Transactional
    void save(String urlPath, String jsonBody) {
        RawRequest rawRequest = new RawRequest();
        rawRequest.setRequestData(jsonBody);
        rawRequest.setUrlPath(urlPath);
        rawRequest.persist();
    }

}
