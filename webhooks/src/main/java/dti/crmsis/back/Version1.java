package dti.crmsis.back;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import dti.crmsis.back.dao.crmsis.RawRequestEntityWebhook;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.jboss.logging.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.time.Instant;

@Path("/v1")
public class Version1 {

    private static final Logger log = Logger.getLogger(Version1.class);

    @Inject
    MeterRegistry meterRegistry;

    @Inject
    ObjectMapper mapper;

    private static final String FALLBACK_PATH = "/tmp/webhook-fallback.dump";


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

        try {
            saveToDatabase(customerName, jsonBody);
        } catch (Exception dbEx) {
            fallbackToFile(customerName, jsonBody, dbEx);
        }

        timer.stop(meterRegistry.timer("timer-" + Version1.class.getSimpleName() + "." + methodName));
        return Response.ok("{\"status\":\"saved\"}", MediaType.APPLICATION_JSON).build();
    }

    @Transactional
    void saveToDatabase(String customerName, String jsonBody) {
        RawRequestEntityWebhook rawRequest = new RawRequestEntityWebhook();
        rawRequest.setCustomerName(customerName);
        rawRequest.setRequestData(jsonBody);
        rawRequest.persist();
    }

    void fallbackToFile(String customerName, String jsonBody, Exception ex) {
        ObjectNode entry = mapper.createObjectNode();
        entry.put("timestamp", Instant.now().toString());
        entry.put("customer", customerName);
        entry.put("error", ex.getClass().getSimpleName() + ": " + ex.getMessage());
        entry.put("body", jsonBody);

        try (PrintWriter writer = new PrintWriter(new FileWriter(FALLBACK_PATH, StandardCharsets.UTF_8, true))) {
            writer.println(mapper.writeValueAsString(entry));
            writer.flush();
        } catch (JsonProcessingException e) {
            log.error("Unable to write fallback webhook to file", e);
            log.error(jsonBody);
        } catch (IOException ioEx) {
            log.fatal("Unable to write fallback webhook to file", ioEx);
            log.fatal(jsonBody);
        }
    }
}
