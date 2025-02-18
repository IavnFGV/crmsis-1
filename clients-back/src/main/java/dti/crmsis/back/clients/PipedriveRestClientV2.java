package dti.crmsis.back.clients;

import dti.crmsis.back.LoggingFilter;
import dti.crmsis.back.RateLimitFilter;
import dti.crmsis.back.clients.dto.*;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.reactive.RestStreamElementType;

@RegisterRestClient(baseUri = Constants.API_PIPEDRIVE_COM + Constants.V_2)
@RestStreamElementType(MediaType.APPLICATION_JSON)
@RegisterProvider(LoggingFilter.class)
@RegisterProvider(RateLimitFilter.class)
public interface PipedriveRestClientV2 {

    @GET
    @Path("/deals")
    DealResponse getDeals(@QueryParam("filter_id") Integer filterId,
                          @QueryParam("ids") String ids,
                          @QueryParam("owner_id") Integer ownerId,
                          @QueryParam("person_id") Integer personId,
                          @QueryParam("org_id") Integer orgId,
                          @QueryParam("pipeline_id") Integer pipelineId,
                          @QueryParam("stage_id") Integer stageId,
                          @QueryParam("status") String status,
                          @QueryParam("updated_since") String updatedSince,
                          @QueryParam("updated_until") String updatedUntil,
                          @QueryParam("sort_by") String sortBy,
                          @QueryParam("sort_direction") String sortDirection,
                          @QueryParam("include_fields") String includeFields,
                          @QueryParam("custom_fields") String customFields,
                          @QueryParam("limit") Integer limit,
                          @QueryParam("cursor") String cursor,
                          @QueryParam("api_token") String token);

    @GET
    @Path("/deals")
    String getDealsAsJson(@QueryParam("filter_id") Integer filterId,
                                @QueryParam("ids") String ids,
                                @QueryParam("owner_id") Integer ownerId,
                                @QueryParam("person_id") Integer personId,
                                @QueryParam("org_id") Integer orgId,
                                @QueryParam("pipeline_id") Integer pipelineId,
                                @QueryParam("stage_id") Integer stageId,
                                @QueryParam("status") String status,
                                @QueryParam("updated_since") String updatedSince,
                                @QueryParam("updated_until") String updatedUntil,
                                @QueryParam("sort_by") String sortBy,
                                @QueryParam("sort_direction") String sortDirection,
                                @QueryParam("include_fields") String includeFields,
                                @QueryParam("custom_fields") String customFields,
                                @QueryParam("limit") Integer limit,
                                @QueryParam("cursor") String cursor,
                                @QueryParam("api_token") String token);


    @GET
    @Path("/persons")
    PersonResponse getPersons(@QueryParam("filter_id") Integer filterId,
                              @QueryParam("ids") String ids,
                              @QueryParam("owner_id") Integer ownerId,
                              @QueryParam("org_id") Integer orgId,
                              @QueryParam("updated_since") String updatedSince,
                              @QueryParam("updated_until") String updatedUntil,
                              @QueryParam("sort_by") String sortBy,
                              @QueryParam("sort_direction") String sortDirection,
                              @QueryParam("include_fields") String includeFields,
                              @QueryParam("custom_fields") String customFields,
                              @QueryParam("limit") Integer limit,
                              @QueryParam("cursor") String cursor,
                              @QueryParam("api_token") String token);

    @GET
    @Path("/persons")
    String getPersonsAsJson(@QueryParam("filter_id") Integer filterId,
                              @QueryParam("ids") String ids,
                              @QueryParam("owner_id") Integer ownerId,
                              @QueryParam("org_id") Integer orgId,
                              @QueryParam("updated_since") String updatedSince,
                              @QueryParam("updated_until") String updatedUntil,
                              @QueryParam("sort_by") String sortBy,
                              @QueryParam("sort_direction") String sortDirection,
                              @QueryParam("include_fields") String includeFields,
                              @QueryParam("custom_fields") String customFields,
                              @QueryParam("limit") Integer limit,
                              @QueryParam("cursor") String cursor,
                              @QueryParam("api_token") String token);

    @GET
    @Path("/organizations")
    OrganizationResponse getOrganizations(@QueryParam("filter_id") Integer filterId,
                                          @QueryParam("ids") String ids,
                                          @QueryParam("owner_id") Integer ownerId,
                                          @QueryParam("updated_since") String updatedSince,
                                          @QueryParam("updated_until") String updatedUntil,
                                          @QueryParam("sort_by") String sortBy,
                                          @QueryParam("sort_direction") String sortDirection,
                                          @QueryParam("include_fields") String includeFields,
                                          @QueryParam("custom_fields") String customFields,
                                          @QueryParam("limit") Integer limit,
                                          @QueryParam("cursor") String cursor,
                                          @QueryParam("api_token") String token);


    @GET
    @Path("/products")
    ProductResponse getProducts(@QueryParam("owner_id") Integer ownerId,
                                @QueryParam("ids") String ids,
                                @QueryParam("filter_id") Integer filterId,
                                @QueryParam("cursor") String cursor,
                                @QueryParam("limit") Integer limit,
                                @QueryParam("sort_by") String sortBy,
                                @QueryParam("sort_direction") String sortDirection,
                                @QueryParam("custom_fields") String customFields,
                                @QueryParam("api_token") String token);
    @GET
    @Path("/pipelines")
    PipelineResponse getPipelines(@QueryParam("sort_by") String sortBy,
                                  @QueryParam("sort_direction") String sortDirection,
                                  @QueryParam("limit") Integer limit,
                                  @QueryParam("cursor") String cursor,
                                  @QueryParam("api_token") String token);
    @GET
    @Path("/pipelines")
    String getPipelinesAsJson(@QueryParam("sort_by") String sortBy,
                                  @QueryParam("sort_direction") String sortDirection,
                                  @QueryParam("limit") Integer limit,
                                  @QueryParam("cursor") String cursor,
                                  @QueryParam("api_token") String token);

    @GET
    @Path("/stages")
    StageResponse getStages(@QueryParam("pipeline_id") Integer pipelineId,
                            @QueryParam("sort_by") String sortBy,
                            @QueryParam("sort_direction") String sortDirection,
                            @QueryParam("limit") Integer limit,
                            @QueryParam("cursor") String cursor,
                            @QueryParam("api_token") String token);

    @GET
    @Path("/stages")
    String getStagesAsJson(@QueryParam("pipeline_id") Integer pipelineId,
                            @QueryParam("sort_by") String sortBy,
                            @QueryParam("sort_direction") String sortDirection,
                            @QueryParam("limit") Integer limit,
                            @QueryParam("cursor") String cursor,
                            @QueryParam("api_token") String token);

    @GET
    @Path("/activities")
    ActivityResponse getActivities(@QueryParam("filter_id") Integer filterId,
                                   @QueryParam("ids") String ids,
                                   @QueryParam("owner_id") Integer ownerId,
                                   @QueryParam("updated_since") String updatedSince,
                                   @QueryParam("updated_until") String updatedUntil,
                                   @QueryParam("sort_by") String sortBy,
                                   @QueryParam("sort_direction") String sortDirection,
                                   @QueryParam("include_fields") String includeFields,
                                   @QueryParam("limit") Integer limit,
                                   @QueryParam("cursor") String cursor,
                                   @QueryParam("api_token") String token);

    @GET
    @Path("/organizations")
    String getOrganizationsAsJson(@QueryParam("filter_id") Integer filterId,
                                          @QueryParam("ids") String ids,
                                          @QueryParam("owner_id") Integer ownerId,
                                          @QueryParam("updated_since") String updatedSince,
                                          @QueryParam("updated_until") String updatedUntil,
                                          @QueryParam("sort_by") String sortBy,
                                          @QueryParam("sort_direction") String sortDirection,
                                          @QueryParam("include_fields") String includeFields,
                                          @QueryParam("custom_fields") String customFields,
                                          @QueryParam("limit") Integer limit,
                                          @QueryParam("cursor") String cursor,
                                          @QueryParam("api_token") String token);


}
