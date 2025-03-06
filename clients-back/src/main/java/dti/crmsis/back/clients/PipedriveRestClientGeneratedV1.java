package dti.crmsis.back.clients;

import dti.crmsis.back.LoggingFilter;
import dti.crmsis.back.RateLimitFilter;
import dti.crmsis.back.services.Constants;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.reactive.RestStreamElementType;

import java.math.BigDecimal;
import java.util.List;


@RegisterRestClient(baseUri = Constants.API_PIPEDRIVE_COM + Constants.V_1)
@RestStreamElementType(MediaType.APPLICATION_JSON)
@RegisterProvider(LoggingFilter.class)
@RegisterProvider(RateLimitFilter.class)
public interface PipedriveRestClientGeneratedV1 {


    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "api_key", openApiSpecId = "openapi_yaml", operationId = "getActivitiesCollection", method = "GET", path = "/v1/activities/collection")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "oauth2", openApiSpecId = "openapi_yaml", operationId = "getActivitiesCollection", method = "GET", path = "/v1/activities/collection")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getActivitiesCollection")
    @jakarta.ws.rs.Path("/activities/collection")
    public String getActivitiesCollection(@jakarta.ws.rs.QueryParam("cursor") String cursor,
                                          @jakarta.ws.rs.QueryParam("limit") Integer limit,
                                          @jakarta.ws.rs.QueryParam("since") String since,
                                          @jakarta.ws.rs.QueryParam("until") String until,
                                          @jakarta.ws.rs.QueryParam("user_id") Integer userId,
                                          @jakarta.ws.rs.QueryParam("done") Boolean done,
                                          @jakarta.ws.rs.QueryParam("type") String type);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "api_key", openApiSpecId = "openapi_yaml", operationId = "getActivityFields", method = "GET", path = "/v1/activityFields")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "oauth2", openApiSpecId = "openapi_yaml", operationId = "getActivityFields", method = "GET", path = "/v1/activityFields")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getActivityFields")
    @jakarta.ws.rs.Path("/activityFields")
    public String getActivityFields();

    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "api_key", openApiSpecId = "openapi_yaml", operationId = "getActivityTypes", method = "GET", path = "/v1/activityTypes")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "oauth2", openApiSpecId = "openapi_yaml", operationId = "getActivityTypes", method = "GET", path = "/v1/activityTypes")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getActivityTypes")
    @jakarta.ws.rs.Path("/activityTypes")
    public String getActivityTypes();

    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "api_key", openApiSpecId = "openapi_yaml", operationId = "getCurrencies", method = "GET", path = "/v1/currencies")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "oauth2", openApiSpecId = "openapi_yaml", operationId = "getCurrencies", method = "GET", path = "/v1/currencies")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getCurrencies")
    @jakarta.ws.rs.Path("/currencies")
    public String getCurrencies(@jakarta.ws.rs.QueryParam("term") String term);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "api_key", openApiSpecId = "openapi_yaml", operationId = "getDealFields", method = "GET", path = "/v1/dealFields")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "oauth2", openApiSpecId = "openapi_yaml", operationId = "getDealFields", method = "GET", path = "/v1/dealFields")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getDealFields")
    @jakarta.ws.rs.Path("/dealFields")
    public String getDealFields(@jakarta.ws.rs.QueryParam("start") Integer start,
                                @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "api_key", openApiSpecId = "openapi_yaml", operationId = "getDealsCollection", method = "GET", path = "/v1/deals/collection")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "oauth2", openApiSpecId = "openapi_yaml", operationId = "getDealsCollection", method = "GET", path = "/v1/deals/collection")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getDealsCollection")
    @jakarta.ws.rs.Path("/deals/collection")
    public String getDealsCollection(@jakarta.ws.rs.QueryParam("cursor") String cursor,
                                     @jakarta.ws.rs.QueryParam("limit") Integer limit,
                                     @jakarta.ws.rs.QueryParam("since") String since,
                                     @jakarta.ws.rs.QueryParam("until") String until,
                                     @jakarta.ws.rs.QueryParam("user_id") Integer userId,
                                     @jakarta.ws.rs.QueryParam("stage_id") Integer stageId,
                                     @jakarta.ws.rs.QueryParam("status") String status);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "api_key", openApiSpecId = "openapi_yaml", operationId = "getLeadLabels", method = "GET", path = "/v1/leadLabels")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "oauth2", openApiSpecId = "openapi_yaml", operationId = "getLeadLabels", method = "GET", path = "/v1/leadLabels")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getLeadLabels")
    @jakarta.ws.rs.Path("/leadLabels")
    public String getLeadLabels();

    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "api_key", openApiSpecId = "openapi_yaml", operationId = "getLeads", method = "GET", path = "/v1/leads")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "oauth2", openApiSpecId = "openapi_yaml", operationId = "getLeads", method = "GET", path = "/v1/leads")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getLeads")
    @jakarta.ws.rs.Path("/leads")
    public String getLeads(@jakarta.ws.rs.QueryParam("limit") Integer limit,
                           @jakarta.ws.rs.QueryParam("start") Integer start,
                           @jakarta.ws.rs.QueryParam("archived_status") String archivedStatus,
                           @jakarta.ws.rs.QueryParam("owner_id") Integer ownerId,
                           @jakarta.ws.rs.QueryParam("person_id") Integer personId,
                           @jakarta.ws.rs.QueryParam("organization_id") Integer organizationId,
                           @jakarta.ws.rs.QueryParam("filter_id") Integer filterId,
                           @jakarta.ws.rs.QueryParam("sort") String sort);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "api_key", openApiSpecId = "openapi_yaml", operationId = "getOrganizationFields", method = "GET", path = "/v1/organizationFields")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "oauth2", openApiSpecId = "openapi_yaml", operationId = "getOrganizationFields", method = "GET", path = "/v1/organizationFields")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationFields")
    @jakarta.ws.rs.Path("/organizationFields")
    public String getOrganizationFields(@jakarta.ws.rs.QueryParam("start") Integer start,
                                        @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "api_key", openApiSpecId = "openapi_yaml", operationId = "getOrganizationsCollection", method = "GET", path = "/v1/organizations/collection")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "oauth2", openApiSpecId = "openapi_yaml", operationId = "getOrganizationsCollection", method = "GET", path = "/v1/organizations/collection")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationsCollection")
    @jakarta.ws.rs.Path("/organizations/collection")
    public String getOrganizationsCollection(@jakarta.ws.rs.QueryParam("cursor") String cursor,
                                             @jakarta.ws.rs.QueryParam("limit") Integer limit,
                                             @jakarta.ws.rs.QueryParam("since") String since,
                                             @jakarta.ws.rs.QueryParam("until") String until,
                                             @jakarta.ws.rs.QueryParam("owner_id") Integer ownerId,
                                             @jakarta.ws.rs.QueryParam("first_char") String firstChar);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "api_key", openApiSpecId = "openapi_yaml", operationId = "getPersonFields", method = "GET", path = "/v1/personFields")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "oauth2", openApiSpecId = "openapi_yaml", operationId = "getPersonFields", method = "GET", path = "/v1/personFields")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersonFields")
    @jakarta.ws.rs.Path("/personFields")
    public String getPersonFields(@jakarta.ws.rs.QueryParam("start") Integer start,
                                  @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "api_key", openApiSpecId = "openapi_yaml", operationId = "getPersonsCollection", method = "GET", path = "/v1/persons/collection")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "oauth2", openApiSpecId = "openapi_yaml", operationId = "getPersonsCollection", method = "GET", path = "/v1/persons/collection")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersonsCollection")
    @jakarta.ws.rs.Path("/persons/collection")
    public String getPersonsCollection(@jakarta.ws.rs.QueryParam("cursor") String cursor,
                                       @jakarta.ws.rs.QueryParam("limit") Integer limit,
                                       @jakarta.ws.rs.QueryParam("since") String since,
                                       @jakarta.ws.rs.QueryParam("until") String until,
                                       @jakarta.ws.rs.QueryParam("owner_id") Integer ownerId,
                                       @jakarta.ws.rs.QueryParam("first_char") String firstChar);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "api_key", openApiSpecId = "openapi_yaml", operationId = "getPipelines", method = "GET", path = "/v1/pipelines")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "oauth2", openApiSpecId = "openapi_yaml", operationId = "getPipelines", method = "GET", path = "/v1/pipelines")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPipelines")
    @jakarta.ws.rs.Path("/pipelines")
    public String getPipelines();

    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "api_key", openApiSpecId = "openapi_yaml", operationId = "getProductFields", method = "GET", path = "/v1/productFields")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "oauth2", openApiSpecId = "openapi_yaml", operationId = "getProductFields", method = "GET", path = "/v1/productFields")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getProductFields")
    @jakarta.ws.rs.Path("/productFields")
    public String getProductFields(@jakarta.ws.rs.QueryParam("start") Integer start,
                                   @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "api_key", openApiSpecId = "openapi_yaml", operationId = "getProducts", method = "GET", path = "/v1/products")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "oauth2", openApiSpecId = "openapi_yaml", operationId = "getProducts", method = "GET", path = "/v1/products")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getProducts")
    @jakarta.ws.rs.Path("/products")
    public String getProducts(@jakarta.ws.rs.QueryParam("user_id") Integer userId,
                              @jakarta.ws.rs.QueryParam("filter_id") Integer filterId,
                              @jakarta.ws.rs.QueryParam("ids") List<Integer> ids,
                              @jakarta.ws.rs.QueryParam("first_char") String firstChar,
                              @jakarta.ws.rs.QueryParam("get_summary") Boolean getSummary,
                              @jakarta.ws.rs.QueryParam("start") Integer start,
                              @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "api_key", openApiSpecId = "openapi_yaml", operationId = "getProjects", method = "GET", path = "/v1/projects")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "oauth2", openApiSpecId = "openapi_yaml", operationId = "getProjects", method = "GET", path = "/v1/projects")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getProjects")
    @jakarta.ws.rs.Path("/projects")
    public String getProjects(@jakarta.ws.rs.QueryParam("cursor") String cursor,
                              @jakarta.ws.rs.QueryParam("limit") Integer limit,
                              @jakarta.ws.rs.QueryParam("filter_id") Integer filterId,
                              @jakarta.ws.rs.QueryParam("status") String status,
                              @jakarta.ws.rs.QueryParam("phase_id") Integer phaseId,
                              @jakarta.ws.rs.QueryParam("include_archived") Boolean includeArchived);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "api_key", openApiSpecId = "openapi_yaml", operationId = "getRoles", method = "GET", path = "/v1/roles")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "oauth2", openApiSpecId = "openapi_yaml", operationId = "getRoles", method = "GET", path = "/v1/roles")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getRoles")
    @jakarta.ws.rs.Path("/roles")
    public String getRoles(@jakarta.ws.rs.QueryParam("start") Integer start,
                           @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "api_key", openApiSpecId = "openapi_yaml", operationId = "getStages", method = "GET", path = "/v1/stages")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "oauth2", openApiSpecId = "openapi_yaml", operationId = "getStages", method = "GET", path = "/v1/stages")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getStages")
    @jakarta.ws.rs.Path("/stages")
    public String getStages(@jakarta.ws.rs.QueryParam("pipeline_id") Integer pipelineId,
                            @jakarta.ws.rs.QueryParam("start") Integer start,
                            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "api_key", openApiSpecId = "openapi_yaml", operationId = "getTasks", method = "GET", path = "/v1/tasks")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "oauth2", openApiSpecId = "openapi_yaml", operationId = "getTasks", method = "GET", path = "/v1/tasks")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getTasks")
    @jakarta.ws.rs.Path("/tasks")
    public String getTasks(@jakarta.ws.rs.QueryParam("cursor") String cursor,
                           @jakarta.ws.rs.QueryParam("limit") Integer limit,
                           @jakarta.ws.rs.QueryParam("assignee_id") Integer assigneeId,
                           @jakarta.ws.rs.QueryParam("project_id") Integer projectId,
                           @jakarta.ws.rs.QueryParam("parent_task_id") Integer parentTaskId,
                           @jakarta.ws.rs.QueryParam("done") BigDecimal done);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "api_key", openApiSpecId = "openapi_yaml", operationId = "getUsers", method = "GET", path = "/v1/users")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "oauth2", openApiSpecId = "openapi_yaml", operationId = "getUsers", method = "GET", path = "/v1/users")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getUsers")
    @jakarta.ws.rs.Path("/users")
    public String getUsers();

    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "api_key", openApiSpecId = "openapi_yaml", operationId = "getWebhooks", method = "GET", path = "/v1/webhooks")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name = "oauth2", openApiSpecId = "openapi_yaml", operationId = "getWebhooks", method = "GET", path = "/v1/webhooks")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getWebhooks")
    @jakarta.ws.rs.Path("/webhooks")
    public String getWebhooks();

}