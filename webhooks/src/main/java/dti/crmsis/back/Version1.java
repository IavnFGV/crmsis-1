package dti.crmsis.back;


import dti.crmsis.back.dao.crmsis.RawRequestEntity;
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
        return Response.ok(Version1.class.getSimpleName() + " says hello").build();
    }

    @POST
    @Path("/webhook/{customer_name}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response processRawRequest(@PathParam("customer_name") String customerName, String jsonBody) {
        String methodName = Utils.getCallerMethodName();
        Timer.Sample timer = Timer.start(meterRegistry);
        meterRegistry.counter(Version1.class.getSimpleName() + "." + methodName).increment();
        this.save(customerName, jsonBody);
        timer.stop(meterRegistry.timer("timer-" + Version1.class.getSimpleName() + "." + methodName));
        return Response.ok("saved", MediaType.APPLICATION_JSON).build();
    }

    @Transactional
    void save(String urlPath, String jsonBody) {
        RawRequestEntity rawRequest = new RawRequestEntity();
        rawRequest.setRequestData(jsonBody);
        rawRequest.setCustomerName(urlPath);
        rawRequest.persist();
    }

}
