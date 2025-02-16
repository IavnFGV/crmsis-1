package dti.crmsis.back.clients;

import dti.crmsis.back.clients.dto.CustomFieldResponse;
import dti.crmsis.back.clients.dto.DealFieldsResponse;
import dti.crmsis.back.clients.dto.OrganizationFieldsResponse;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = Constants.API_PIPEDRIVE_COM + Constants.V_1)
public interface PipedriveRestClientV1 {

    @GET
    @Path("/{endpoint}")
    CustomFieldResponse getCustomFields(@PathParam("endpoint") String endpoint, @QueryParam("api_token") String token);

    @GET
    @Path("/dealFields")
    DealFieldsResponse getDealFields(@QueryParam("start") Integer start,
                                     @QueryParam("limit") Integer limit,
                                     @QueryParam("api_token") String token);

    @GET
    @Path("/organizationFields")
    OrganizationFieldsResponse getOrganizationFields(@QueryParam("start") Integer start,
                                                     @QueryParam("limit") Integer limit,
                                                     @QueryParam("api_token") String token);


}
