package dti.crmsis.back.resources.api.v1;

import dti.crmsis.back.taskassignment.DslConfig;
import dti.crmsis.back.taskassignment.DslEngine;
import dti.crmsis.back.taskassignment.LeadPayload;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.Map;

@Path("/api/v1/dsl")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.TEXT_PLAIN)
public class DslResource {

    @Inject
    DslEngine engine;

    @POST
    @Path("/load")
    public Response load(DslConfig config) {
        try {
            engine.load(config);
            return Response.ok("DSL loaded successfully").build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.serverError().entity("Error: " + e.getMessage()).build();
        }
    }

    @POST
    @Path("/send/{source}")
    public Response sendTest(@PathParam("source") String source, Map<String, Object> json) {
        engine.receive(source, new LeadPayload("test-id", json));
        return Response.ok("Lead sent to source block: " + source).build();
    }
}
