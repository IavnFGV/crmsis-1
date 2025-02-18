package dti.crmsis.back.clients;

import dti.crmsis.back.clients.dto.DealFieldsResponse;
import dti.crmsis.back.clients.dto.OrganizationFieldsResponse;
import dti.crmsis.back.clients.dto.PipelineResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetPipelinesResponse;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = Constants.API_PIPEDRIVE_COM + Constants.V_1)
public interface PipedriveRestClientV1 {

    @GET
    @Path("/dealFields")
    DealFieldsResponse getDealFields(@QueryParam("start") Integer start,
                                     @QueryParam("limit") Integer limit,
                                     @QueryParam("api_token") String token);

    @GET
    @Path("/dealFields")
    String getDealFieldsAsJson(@QueryParam("start") Integer start,
                               @QueryParam("limit") Integer limit,
                               @QueryParam("api_token") String token);

    @GET
    @Path("/organizationFields")
    OrganizationFieldsResponse getOrganizationFields(@QueryParam("start") Integer start,
                                                     @QueryParam("limit") Integer limit,
                                                     @QueryParam("api_token") String token);

    @GET
    @Path("/organizationFields")
    String getOrganizationFieldsAsJson(@QueryParam("start") Integer start,
                                       @QueryParam("limit") Integer limit,
                                       @QueryParam("api_token") String token);

    @GET
    @Path("/personFields")
    String getPersonFieldsAsJson(@QueryParam("start") Integer start,
                                 @QueryParam("limit") Integer limit,
                                 @QueryParam("api_token") String token);

    @GET
    @Path("/users")
    String getUsersAsJson(@QueryParam("api_token") String token);

    @GET
    @Path("/leadLabels")
    String getLeadLabelsAsJson(@QueryParam("api_token") String apiToken);

    @GET
    @Path("/leads")
    String getLeadsAsJson(@QueryParam("start") Integer start,
                          @QueryParam("limit") Integer limit,
                          @QueryParam("archived_status") String archivedStatus,
                          @QueryParam("owner_id") Integer ownerId,
                          @QueryParam("person_id") Integer personId,
                          @QueryParam("organization_id") Integer organizationId,
                          @QueryParam("filter_id") Integer filterId,
                          @QueryParam("sort") String sort,
                          @QueryParam("api_token") String token);


    @GET
    @Path("/pipelines")
    GetPipelinesResponse getPipelines(@QueryParam("start") Integer start,
                                      @QueryParam("limit") Integer limit,
                                      @QueryParam("api_token") String token);

}
