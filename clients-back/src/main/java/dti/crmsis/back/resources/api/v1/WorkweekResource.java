package dti.crmsis.back.resources.api.v1;

import dti.crmsis.back.dao.app.Workweek;
import dti.crmsis.back.dto.v1.WorkweekDto;
import dti.crmsis.back.services.WorkweekService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api/v1/workweek")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class WorkweekResource {

    @Inject
    WorkweekService service;

    @GET
    @Path("/{managerId}")
    public Response get(@PathParam("managerId") String managerId) {
        Workweek w = service.getByManagerId(managerId);
        if (w == null) return Response.status(Response.Status.NOT_FOUND).build();
        return Response.ok(w).build();
    }

    @POST
    public Response save(WorkweekDto payload) {
        service.saveOrUpdate(payload);
        return Response.ok().build();
    }

    @GET
    public Response getAll() {
        return Response.ok(service.getAll()).build();
    }

}