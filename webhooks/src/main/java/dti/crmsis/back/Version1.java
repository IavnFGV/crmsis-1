package dti.crmsis.back;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import dti.crmsis.back.dao.crmsis.RawRequestEntityWebhook;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import jakarta.annotation.PostConstruct;
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
import java.util.concurrent.*;

@Path("/v1")
public class Version1 {

    private static final Logger log = Logger.getLogger(Version1.class);

    private static final String FALLBACK_PATH = "/tmp/webhook-fallback.dump";

    private static final int QUEUE_CAPACITY = 500;
    private static final int WORKER_THREADS = 4;

    private static final BlockingQueue<WebhookTask> taskQueue = new LinkedBlockingQueue<>(QUEUE_CAPACITY);
    private static final ExecutorService taskExecutor = Executors.newFixedThreadPool(WORKER_THREADS);

    @Inject
    MeterRegistry meterRegistry;

    @Inject
    ObjectMapper mapper;

    @PostConstruct
    void initWorkerThreads() {
        for (int i = 0; i < WORKER_THREADS; i++) {
            taskExecutor.execute(() -> {
                while (true) {
                    try {
                        WebhookTask task = taskQueue.take();
                        try {
                            saveToDatabase(task.customerName, task.jsonBody);
                        } catch (Exception ex) {
                            fallbackToFile(task.customerName, task.jsonBody, ex);
                        }
                    } catch (Exception e) {
                        log.error("Worker thread crashed", e);
                    }
                }
            });
        }
    }

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

        boolean accepted = taskQueue.offer(new WebhookTask(customerName, jsonBody));
        if (!accepted) {
            log.error("Queue is full — saving directly to file.");
            fallbackToFile(customerName, jsonBody, new RuntimeException("Queue overflow"));
        }

        timer.stop(meterRegistry.timer("timer-" + Version1.class.getSimpleName() + "." + methodName));
        return Response.ok("{\"status\":\"queued\"}", MediaType.APPLICATION_JSON).build();
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
            log.error("Failed to serialize fallback JSON", e);
            log.error(jsonBody);
        } catch (IOException ioEx) {
            log.fatal("Failed to write to fallback file", ioEx);
            log.fatal(jsonBody);
        }
    }

    public record WebhookTask(String customerName, String jsonBody) {}
}
