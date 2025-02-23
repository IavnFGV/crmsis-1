package dti.crmsis.back.clients;

import dti.crmsis.back.ApiTokenRequestFilter;
import dti.crmsis.back.RateLimitFilter;
import dti.crmsis.back.clients.dto.DealFieldsResponse;
import dti.crmsis.back.clients.dto.OrganizationFieldsResponse;
import dti.crmsis.back.services.Constants;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = Constants.API_PIPEDRIVE_COM + Constants.V_1)
@RegisterProvider(ApiTokenRequestFilter.class)
@RegisterProvider(RateLimitFilter.class)
public interface PipedriveRestClientV1 {

    @GET
    @Path("/dealFields")
    DealFieldsResponse getDealFields(@QueryParam("start") Integer start,
                                     @QueryParam("limit") Integer limit,
                                     @QueryParam("api_token") String token);

    @GET
    @Path("/dealFields")
    String getDealFieldsAsJson(@QueryParam("start") Integer start,
                               @QueryParam("limit") Integer limit);

    @GET
    @Path("/deals")
    String getDealsAsJson(@QueryParam("start") Integer start,
                          @QueryParam("limit") Integer limit);


    @GET
    @Path("/organizationFields")
    OrganizationFieldsResponse getOrganizationFields(@QueryParam("start") Integer start,
                                                     @QueryParam("limit") Integer limit,
                                                     @QueryParam("api_token") String token);

    @GET
    @Path("/organizationFields")
    String getOrganizationFieldsAsJson(@QueryParam("start") Integer start,
                                       @QueryParam("limit") Integer limit);

    @GET
    @Path("/personFields")
    String getPersonFieldsAsJson(@QueryParam("start") Integer start,
                                 @QueryParam("limit") Integer limit);

    @GET
    @Path("/persons/collection")
    String getPersonsCollectionAsJson(
            @QueryParam("cursor") String cursor,
            @QueryParam("limit") Integer limit,
            @QueryParam("since") String since,
            @QueryParam("until") String until);


    @GET
    @Path("/users")
    String getUsersAsJson();

    @GET
    @Path("/leadLabels")
    String getLeadLabelsAsJson();

    @GET
    @Path("/leads")
    String getLeadsAsJson(@QueryParam("start") Integer start,
                          @QueryParam("limit") Integer limit,
                          @QueryParam("archived_status") String archivedStatus,
                          @QueryParam("owner_id") Integer ownerId,
                          @QueryParam("person_id") Integer personId,
                          @QueryParam("organization_id") Integer organizationId,
                          @QueryParam("filter_id") Integer filterId,
                          @QueryParam("sort") String sort);

    @GET
    @Path("/organizations/collection")
    String getOrganizationsCollectionAsJson(@QueryParam("cursor") String cursor,
                                            @QueryParam("limit") Integer limit,
                                            @QueryParam("since") String since,
                                            @QueryParam("until") String until,
                                            @QueryParam("owner_id") Integer ownerId,
                                            @QueryParam("first_char") String firstChar

    );

    @GET
    @Path("/pipelines")
    String getPipelinesAsJson(@QueryParam("start") Integer start,
                              @QueryParam("limit") Integer limit);

    @GET
    @Path("/stages")
    String getStagesAsJson(@QueryParam("start") Integer start,
                           @QueryParam("limit") Integer limit);


}
