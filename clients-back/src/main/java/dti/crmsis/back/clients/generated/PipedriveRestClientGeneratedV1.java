package dti.crmsis.back.clients.generated;

import static dti.crmsis.back.clients.openapi.v1.api.CallLogsApi.AddCallLogAudioFileMultipartForm;
import static dti.crmsis.back.clients.openapi.v1.api.FilesApi.*;
import static dti.crmsis.back.clients.openapi.v1.api.MailboxApi.UpdateMailThreadDetailsMultipartForm;
import static dti.crmsis.back.clients.openapi.v1.api.PersonsApi.AddPersonPictureMultipartForm;

import dti.crmsis.back.LoggingFilter;
import dti.crmsis.back.RateLimitFilter;
import dti.crmsis.back.clients.openapi.v1.model.*;
import dti.crmsis.back.services.Constants;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.reactive.RestStreamElementType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@RegisterRestClient(baseUri = Constants.API_PIPEDRIVE_COM + Constants.V_1)
@RestStreamElementType(MediaType.APPLICATION_JSON)
@RegisterProvider(LoggingFilter.class)
@RegisterProvider(RateLimitFilter.class)
public interface PipedriveRestClientGeneratedV1 {

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addActivity",
            method = "POST",
            path = "/v1/activities")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addActivity",
            method = "POST",
            path = "/v1/activities")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addActivity")
    @jakarta.ws.rs.Path("/activities")
    public AddActivityResponse addActivity(AddActivityRequest addActivityRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteActivities",
            method = "DELETE",
            path = "/v1/activities")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteActivities",
            method = "DELETE",
            path = "/v1/activities")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteActivities")
    @jakarta.ws.rs.Path("/activities")
    public DeleteActivitiesResponse deleteActivities(@jakarta.ws.rs.QueryParam("ids") String ids);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteActivity",
            method = "DELETE",
            path = "/v1/activities/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteActivity",
            method = "DELETE",
            path = "/v1/activities/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteActivity")
    @jakarta.ws.rs.Path("/activities/{id}")
    public DeleteActivityResponse deleteActivity(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getActivities",
            method = "GET",
            path = "/v1/activities")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getActivities",
            method = "GET",
            path = "/v1/activities")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getActivities")
    @jakarta.ws.rs.Path("/activities")
    public GetActivitiesResponse getActivities(
            @jakarta.ws.rs.QueryParam("user_id") Integer userId,
            @jakarta.ws.rs.QueryParam("filter_id") Integer filterId,
            @jakarta.ws.rs.QueryParam("type") String type,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("start_date") LocalDate startDate,
            @jakarta.ws.rs.QueryParam("end_date") LocalDate endDate,
            @jakarta.ws.rs.QueryParam("done") BigDecimal done);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getActivities",
            method = "GET",
            path = "/v1/activities")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getActivities",
            method = "GET",
            path = "/v1/activities")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getActivities")
    @jakarta.ws.rs.Path("/activities")
    public String getActivitiesAsJson(
            @jakarta.ws.rs.QueryParam("user_id") Integer userId,
            @jakarta.ws.rs.QueryParam("filter_id") Integer filterId,
            @jakarta.ws.rs.QueryParam("type") String type,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("start_date") LocalDate startDate,
            @jakarta.ws.rs.QueryParam("end_date") LocalDate endDate,
            @jakarta.ws.rs.QueryParam("done") BigDecimal done);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getActivitiesCollection",
            method = "GET",
            path = "/v1/activities/collection")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getActivitiesCollection",
            method = "GET",
            path = "/v1/activities/collection")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getActivitiesCollection")
    @jakarta.ws.rs.Path("/activities/collection")
    public GetActivitiesCollectionResponse getActivitiesCollection(
            @jakarta.ws.rs.QueryParam("cursor") String cursor,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("since") String since,
            @jakarta.ws.rs.QueryParam("until") String until,
            @jakarta.ws.rs.QueryParam("user_id") Integer userId,
            @jakarta.ws.rs.QueryParam("done") Boolean done,
            @jakarta.ws.rs.QueryParam("type") String type);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getActivity",
            method = "GET",
            path = "/v1/activities/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getActivity",
            method = "GET",
            path = "/v1/activities/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getActivity")
    @jakarta.ws.rs.Path("/activities/{id}")
    public GetActivityResponse getActivity(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updateActivity",
            method = "PUT",
            path = "/v1/activities/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updateActivity",
            method = "PUT",
            path = "/v1/activities/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateActivity")
    @jakarta.ws.rs.Path("/activities/{id}")
    public UpdateActivityResponse updateActivity(
            @jakarta.ws.rs.PathParam("id") Integer id, UpdateActivityRequest updateActivityRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getActivityFields",
            method = "GET",
            path = "/v1/activityFields")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getActivityFields",
            method = "GET",
            path = "/v1/activityFields")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getActivityFields")
    @jakarta.ws.rs.Path("/activityFields")
    public GetFieldsResponse getActivityFields();

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getActivityFields",
            method = "GET",
            path = "/v1/activityFields")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getActivityFields",
            method = "GET",
            path = "/v1/activityFields")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getActivityFields")
    @jakarta.ws.rs.Path("/activityFields")
    public String getActivityFieldsAsJson();

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addActivityType",
            method = "POST",
            path = "/v1/activityTypes")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addActivityType",
            method = "POST",
            path = "/v1/activityTypes")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addActivityType")
    @jakarta.ws.rs.Path("/activityTypes")
    public UpsertActivityTypeResponse addActivityType(
            AddActivityTypeRequest addActivityTypeRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteActivityType",
            method = "DELETE",
            path = "/v1/activityTypes/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteActivityType",
            method = "DELETE",
            path = "/v1/activityTypes/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteActivityType")
    @jakarta.ws.rs.Path("/activityTypes/{id}")
    public UpsertActivityTypeResponse deleteActivityType(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteActivityTypes",
            method = "DELETE",
            path = "/v1/activityTypes")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteActivityTypes",
            method = "DELETE",
            path = "/v1/activityTypes")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteActivityTypes")
    @jakarta.ws.rs.Path("/activityTypes")
    public DeleteActivityTypesResponse deleteActivityTypes(
            @jakarta.ws.rs.QueryParam("ids") String ids);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getActivityTypes",
            method = "GET",
            path = "/v1/activityTypes")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getActivityTypes",
            method = "GET",
            path = "/v1/activityTypes")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getActivityTypes")
    @jakarta.ws.rs.Path("/activityTypes")
    public GetActivityTypesResponse getActivityTypes();

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getActivityTypes",
            method = "GET",
            path = "/v1/activityTypes")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getActivityTypes",
            method = "GET",
            path = "/v1/activityTypes")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getActivityTypes")
    @jakarta.ws.rs.Path("/activityTypes")
    public String getActivityTypesAsJson();

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updateActivityType",
            method = "PUT",
            path = "/v1/activityTypes/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updateActivityType",
            method = "PUT",
            path = "/v1/activityTypes/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateActivityType")
    @jakarta.ws.rs.Path("/activityTypes/{id}")
    public UpsertActivityTypeResponse updateActivityType(
            @jakarta.ws.rs.PathParam("id") Integer id,
            UpdateActivityTypeRequest updateActivityTypeRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getCompanyAddons",
            method = "GET",
            path = "/v1/billing/subscriptions/addons")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getCompanyAddons",
            method = "GET",
            path = "/v1/billing/subscriptions/addons")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getCompanyAddons")
    @jakarta.ws.rs.Path("/billing/subscriptions/addons")
    public GetSubscriptionAddonsResponse getCompanyAddons();

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addCallLog",
            method = "POST",
            path = "/v1/callLogs")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addCallLog",
            method = "POST",
            path = "/v1/callLogs")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addCallLog")
    @jakarta.ws.rs.Path("/callLogs")
    public GetCallLogResponse addCallLog(AddCallLogRequest addCallLogRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addCallLogAudioFile",
            method = "POST",
            path = "/v1/callLogs/{id}/recordings")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addCallLogAudioFile",
            method = "POST",
            path = "/v1/callLogs/{id}/recordings")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"multipart/form-data"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addCallLogAudioFile")
    @jakarta.ws.rs.Path("/callLogs/{id}/recordings")
    public BaseResponse addCallLogAudioFile(
            @jakarta.ws.rs.BeanParam AddCallLogAudioFileMultipartForm multipartForm,
            @jakarta.ws.rs.PathParam("id") String id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteCallLog",
            method = "DELETE",
            path = "/v1/callLogs/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteCallLog",
            method = "DELETE",
            path = "/v1/callLogs/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteCallLog")
    @jakarta.ws.rs.Path("/callLogs/{id}")
    public BaseResponse deleteCallLog(@jakarta.ws.rs.PathParam("id") String id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getCallLog",
            method = "GET",
            path = "/v1/callLogs/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getCallLog",
            method = "GET",
            path = "/v1/callLogs/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getCallLog")
    @jakarta.ws.rs.Path("/callLogs/{id}")
    public GetCallLogResponse getCallLog(@jakarta.ws.rs.PathParam("id") String id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getUserCallLogs",
            method = "GET",
            path = "/v1/callLogs")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getUserCallLogs",
            method = "GET",
            path = "/v1/callLogs")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getUserCallLogs")
    @jakarta.ws.rs.Path("/callLogs")
    public GetCallLogsResponse getUserCallLogs(
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addChannel",
            method = "POST",
            path = "/v1/channels")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addChannel",
            method = "POST",
            path = "/v1/channels")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addChannel")
    @jakarta.ws.rs.Path("/channels")
    public AddChannelResponse addChannel(AddChannelRequest addChannelRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteChannel",
            method = "DELETE",
            path = "/v1/channels/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteChannel",
            method = "DELETE",
            path = "/v1/channels/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteChannel")
    @jakarta.ws.rs.Path("/channels/{id}")
    public DeleteChannel200Response deleteChannel(@jakarta.ws.rs.PathParam("id") String id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteConversation",
            method = "DELETE",
            path = "/v1/channels/{channel-id}/conversations/{conversation-id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteConversation",
            method = "DELETE",
            path = "/v1/channels/{channel-id}/conversations/{conversation-id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteConversation")
    @jakarta.ws.rs.Path("/channels/{channel-id}/conversations/{conversation-id}")
    public DeleteChannel200Response deleteConversation(
            @jakarta.ws.rs.PathParam("channel-id") String channelId,
            @jakarta.ws.rs.PathParam("conversation-id") String conversationId);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "receiveMessage",
            method = "POST",
            path = "/v1/channels/messages/receive")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "receiveMessage",
            method = "POST",
            path = "/v1/channels/messages/receive")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("receiveMessage")
    @jakarta.ws.rs.Path("/channels/messages/receive")
    public GetReceiveMessageSuccessResponse receiveMessage(
            ReceiveMessageRequest receiveMessageRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getCurrencies",
            method = "GET",
            path = "/v1/currencies")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getCurrencies",
            method = "GET",
            path = "/v1/currencies")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getCurrencies")
    @jakarta.ws.rs.Path("/currencies")
    public GetCurrenciesResponse getCurrencies(@jakarta.ws.rs.QueryParam("term") String term);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getCurrencies",
            method = "GET",
            path = "/v1/currencies")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getCurrencies",
            method = "GET",
            path = "/v1/currencies")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getCurrencies")
    @jakarta.ws.rs.Path("/currencies")
    public String getCurrenciesAsJson(@jakarta.ws.rs.QueryParam("term") String term);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addDealField",
            method = "POST",
            path = "/v1/dealFields")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addDealField",
            method = "POST",
            path = "/v1/dealFields")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addDealField")
    @jakarta.ws.rs.Path("/dealFields")
    public GetFieldResponse addDealField(CreateFieldRequest createFieldRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteDealField",
            method = "DELETE",
            path = "/v1/dealFields/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteDealField",
            method = "DELETE",
            path = "/v1/dealFields/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteDealField")
    @jakarta.ws.rs.Path("/dealFields/{id}")
    public DeleteResponse deleteDealField(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteDealFields",
            method = "DELETE",
            path = "/v1/dealFields")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteDealFields",
            method = "DELETE",
            path = "/v1/dealFields")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteDealFields")
    @jakarta.ws.rs.Path("/dealFields")
    public DeleteFieldsResponse deleteDealFields(@jakarta.ws.rs.QueryParam("ids") String ids);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealField",
            method = "GET",
            path = "/v1/dealFields/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealField",
            method = "GET",
            path = "/v1/dealFields/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getDealField")
    @jakarta.ws.rs.Path("/dealFields/{id}")
    public GetFieldResponse getDealField(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealFields",
            method = "GET",
            path = "/v1/dealFields")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealFields",
            method = "GET",
            path = "/v1/dealFields")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getDealFields")
    @jakarta.ws.rs.Path("/dealFields")
    public GetFieldsResponse getDealFields(
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealFields",
            method = "GET",
            path = "/v1/dealFields")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealFields",
            method = "GET",
            path = "/v1/dealFields")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getDealFields")
    @jakarta.ws.rs.Path("/dealFields")
    public String getDealFieldsAsJson(
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updateDealField",
            method = "PUT",
            path = "/v1/dealFields/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updateDealField",
            method = "PUT",
            path = "/v1/dealFields/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateDealField")
    @jakarta.ws.rs.Path("/dealFields/{id}")
    public GetFieldResponse updateDealField(
            @jakarta.ws.rs.PathParam("id") Integer id, UpdateFieldRequest updateFieldRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addDeal",
            method = "POST",
            path = "/v1/deals")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addDeal",
            method = "POST",
            path = "/v1/deals")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addDeal")
    @jakarta.ws.rs.Path("/deals")
    public GetAddedDealResponse addDeal(AddDealRequest addDealRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addDealFollower",
            method = "POST",
            path = "/v1/deals/{id}/followers")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addDealFollower",
            method = "POST",
            path = "/v1/deals/{id}/followers")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addDealFollower")
    @jakarta.ws.rs.Path("/deals/{id}/followers")
    public AddDealFollowerResponse addDealFollower(
            @jakarta.ws.rs.PathParam("id") Integer id,
            AddDealFollowerRequest addDealFollowerRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addDealParticipant",
            method = "POST",
            path = "/v1/deals/{id}/participants")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addDealParticipant",
            method = "POST",
            path = "/v1/deals/{id}/participants")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addDealParticipant")
    @jakarta.ws.rs.Path("/deals/{id}/participants")
    public AddParticipantsResponse addDealParticipant(
            @jakarta.ws.rs.PathParam("id") Integer id,
            AddDealParticipantRequest addDealParticipantRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addDealProduct",
            method = "POST",
            path = "/v1/deals/{id}/products")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addDealProduct",
            method = "POST",
            path = "/v1/deals/{id}/products")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addDealProduct")
    @jakarta.ws.rs.Path("/deals/{id}/products")
    public GetAddProductAttachmentDetailsResponse addDealProduct(
            @jakarta.ws.rs.PathParam("id") Integer id, AddDealProductRequest addDealProductRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteDeal",
            method = "DELETE",
            path = "/v1/deals/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteDeal",
            method = "DELETE",
            path = "/v1/deals/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteDeal")
    @jakarta.ws.rs.Path("/deals/{id}")
    public DeleteDealResponse deleteDeal(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteDealFollower",
            method = "DELETE",
            path = "/v1/deals/{id}/followers/{follower_id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteDealFollower",
            method = "DELETE",
            path = "/v1/deals/{id}/followers/{follower_id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteDealFollower")
    @jakarta.ws.rs.Path("/deals/{id}/followers/{follower_id}")
    public DeleteDealFollowerResponse deleteDealFollower(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.PathParam("follower_id") Integer followerId);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteDealParticipant",
            method = "DELETE",
            path = "/v1/deals/{id}/participants/{deal_participant_id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteDealParticipant",
            method = "DELETE",
            path = "/v1/deals/{id}/participants/{deal_participant_id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteDealParticipant")
    @jakarta.ws.rs.Path("/deals/{id}/participants/{deal_participant_id}")
    public DeleteDealParticipantResponse deleteDealParticipant(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.PathParam("deal_participant_id") Integer dealParticipantId);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteDealProduct",
            method = "DELETE",
            path = "/v1/deals/{id}/products/{product_attachment_id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteDealProduct",
            method = "DELETE",
            path = "/v1/deals/{id}/products/{product_attachment_id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteDealProduct")
    @jakarta.ws.rs.Path("/deals/{id}/products/{product_attachment_id}")
    public DeleteDealProductResponse deleteDealProduct(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.PathParam("product_attachment_id") Integer productAttachmentId);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteDeals",
            method = "DELETE",
            path = "/v1/deals")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteDeals",
            method = "DELETE",
            path = "/v1/deals")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteDeals")
    @jakarta.ws.rs.Path("/deals")
    public DeleteDealsResponse deleteDeals(@jakarta.ws.rs.QueryParam("ids") String ids);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "duplicateDeal",
            method = "POST",
            path = "/v1/deals/{id}/duplicate")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "duplicateDeal",
            method = "POST",
            path = "/v1/deals/{id}/duplicate")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("duplicateDeal")
    @jakarta.ws.rs.Path("/deals/{id}/duplicate")
    public GetDuplicatedDealResponse duplicateDeal(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getDeal",
            method = "GET",
            path = "/v1/deals/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getDeal",
            method = "GET",
            path = "/v1/deals/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getDeal")
    @jakarta.ws.rs.Path("/deals/{id}")
    public GetDealResponse getDeal(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealActivities",
            method = "GET",
            path = "/v1/deals/{id}/activities")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealActivities",
            method = "GET",
            path = "/v1/deals/{id}/activities")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getDealActivities")
    @jakarta.ws.rs.Path("/deals/{id}/activities")
    public GetDealActivitiesResponse getDealActivities(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("done") BigDecimal done,
            @jakarta.ws.rs.QueryParam("exclude") String exclude);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealChangelog",
            method = "GET",
            path = "/v1/deals/{id}/changelog")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealChangelog",
            method = "GET",
            path = "/v1/deals/{id}/changelog")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getDealChangelog")
    @jakarta.ws.rs.Path("/deals/{id}/changelog")
    public GetChangelogResponse getDealChangelog(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("cursor") String cursor,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealFiles",
            method = "GET",
            path = "/v1/deals/{id}/files")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealFiles",
            method = "GET",
            path = "/v1/deals/{id}/files")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getDealFiles")
    @jakarta.ws.rs.Path("/deals/{id}/files")
    public GetAssociatedFilesResponse getDealFiles(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("sort") String sort);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealFollowers",
            method = "GET",
            path = "/v1/deals/{id}/followers")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealFollowers",
            method = "GET",
            path = "/v1/deals/{id}/followers")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getDealFollowers")
    @jakarta.ws.rs.Path("/deals/{id}/followers")
    public GetListFollowersResponse getDealFollowers(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealMailMessages",
            method = "GET",
            path = "/v1/deals/{id}/mailMessages")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealMailMessages",
            method = "GET",
            path = "/v1/deals/{id}/mailMessages")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getDealMailMessages")
    @jakarta.ws.rs.Path("/deals/{id}/mailMessages")
    public GetAssociatedMailMessagesResponse getDealMailMessages(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealParticipants",
            method = "GET",
            path = "/v1/deals/{id}/participants")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealParticipants",
            method = "GET",
            path = "/v1/deals/{id}/participants")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getDealParticipants")
    @jakarta.ws.rs.Path("/deals/{id}/participants")
    public GetDealParticipantsResponse getDealParticipants(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealParticipantsChangelog",
            method = "GET",
            path = "/v1/deals/{id}/participantsChangelog")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealParticipantsChangelog",
            method = "GET",
            path = "/v1/deals/{id}/participantsChangelog")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getDealParticipantsChangelog")
    @jakarta.ws.rs.Path("/deals/{id}/participantsChangelog")
    public GetParticipantsChangelogResponse getDealParticipantsChangelog(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("cursor") String cursor);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealPersons",
            method = "GET",
            path = "/v1/deals/{id}/persons")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealPersons",
            method = "GET",
            path = "/v1/deals/{id}/persons")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getDealPersons")
    @jakarta.ws.rs.Path("/deals/{id}/persons")
    public GetPersonsResponse getDealPersons(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealProducts",
            method = "GET",
            path = "/v1/deals/{id}/products")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealProducts",
            method = "GET",
            path = "/v1/deals/{id}/products")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getDealProducts")
    @jakarta.ws.rs.Path("/deals/{id}/products")
    public GetProductsResponse getDealProducts(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("include_product_data") BigDecimal includeProductData);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealUpdates",
            method = "GET",
            path = "/v1/deals/{id}/flow")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealUpdates",
            method = "GET",
            path = "/v1/deals/{id}/flow")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getDealUpdates")
    @jakarta.ws.rs.Path("/deals/{id}/flow")
    public GetDealUpdatesResponse getDealUpdates(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("all_changes") String allChanges,
            @jakarta.ws.rs.QueryParam("items") String items);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealUsers",
            method = "GET",
            path = "/v1/deals/{id}/permittedUsers")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealUsers",
            method = "GET",
            path = "/v1/deals/{id}/permittedUsers")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getDealUsers")
    @jakarta.ws.rs.Path("/deals/{id}/permittedUsers")
    public GetPermittedUsersResponse getDealUsers(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getDeals",
            method = "GET",
            path = "/v1/deals")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getDeals",
            method = "GET",
            path = "/v1/deals")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getDeals")
    @jakarta.ws.rs.Path("/deals")
    public GetDealsResponse getDeals(
            @jakarta.ws.rs.QueryParam("user_id") Integer userId,
            @jakarta.ws.rs.QueryParam("filter_id") Integer filterId,
            @jakarta.ws.rs.QueryParam("stage_id") Integer stageId,
            @jakarta.ws.rs.QueryParam("status") String status,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("sort") String sort,
            @jakarta.ws.rs.QueryParam("owned_by_you") BigDecimal ownedByYou);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealsCollection",
            method = "GET",
            path = "/v1/deals/collection")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealsCollection",
            method = "GET",
            path = "/v1/deals/collection")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getDealsCollection")
    @jakarta.ws.rs.Path("/deals/collection")
    public GetDealsCollectionResponse getDealsCollection(
            @jakarta.ws.rs.QueryParam("cursor") String cursor,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("since") String since,
            @jakarta.ws.rs.QueryParam("until") String until,
            @jakarta.ws.rs.QueryParam("user_id") Integer userId,
            @jakarta.ws.rs.QueryParam("stage_id") Integer stageId,
            @jakarta.ws.rs.QueryParam("status") String status);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealsCollection",
            method = "GET",
            path = "/v1/deals/collection")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealsCollection",
            method = "GET",
            path = "/v1/deals/collection")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getDealsCollection")
    @jakarta.ws.rs.Path("/deals/collection")
    public String getDealsCollectionAsJson(
            @jakarta.ws.rs.QueryParam("cursor") String cursor,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("since") String since,
            @jakarta.ws.rs.QueryParam("until") String until,
            @jakarta.ws.rs.QueryParam("user_id") Integer userId,
            @jakarta.ws.rs.QueryParam("stage_id") Integer stageId,
            @jakarta.ws.rs.QueryParam("status") String status);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealsSummary",
            method = "GET",
            path = "/v1/deals/summary")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealsSummary",
            method = "GET",
            path = "/v1/deals/summary")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getDealsSummary")
    @jakarta.ws.rs.Path("/deals/summary")
    public GetDealsSummaryResponse getDealsSummary(
            @jakarta.ws.rs.QueryParam("status") String status,
            @jakarta.ws.rs.QueryParam("filter_id") Integer filterId,
            @jakarta.ws.rs.QueryParam("user_id") Integer userId,
            @jakarta.ws.rs.QueryParam("pipeline_id") Integer pipelineId,
            @jakarta.ws.rs.QueryParam("stage_id") Integer stageId);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealsTimeline",
            method = "GET",
            path = "/v1/deals/timeline")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getDealsTimeline",
            method = "GET",
            path = "/v1/deals/timeline")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getDealsTimeline")
    @jakarta.ws.rs.Path("/deals/timeline")
    public GetDealsTimelineResponse getDealsTimeline(
            @jakarta.ws.rs.QueryParam("start_date") LocalDate startDate,
            @jakarta.ws.rs.QueryParam("interval") String interval,
            @jakarta.ws.rs.QueryParam("amount") Integer amount,
            @jakarta.ws.rs.QueryParam("field_key") String fieldKey,
            @jakarta.ws.rs.QueryParam("user_id") Integer userId,
            @jakarta.ws.rs.QueryParam("pipeline_id") Integer pipelineId,
            @jakarta.ws.rs.QueryParam("filter_id") Integer filterId,
            @jakarta.ws.rs.QueryParam("exclude_deals") BigDecimal excludeDeals,
            @jakarta.ws.rs.QueryParam("totals_convert_currency") String totalsConvertCurrency);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "mergeDeals",
            method = "PUT",
            path = "/v1/deals/{id}/merge")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "mergeDeals",
            method = "PUT",
            path = "/v1/deals/{id}/merge")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("mergeDeals")
    @jakarta.ws.rs.Path("/deals/{id}/merge")
    public GetMergedDealResponse mergeDeals(
            @jakarta.ws.rs.PathParam("id") Integer id, MergeDealsRequest mergeDealsRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "searchDeals",
            method = "GET",
            path = "/v1/deals/search")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "searchDeals",
            method = "GET",
            path = "/v1/deals/search")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("searchDeals")
    @jakarta.ws.rs.Path("/deals/search")
    public GetDealSearchResponse searchDeals(
            @jakarta.ws.rs.QueryParam("term") String term,
            @jakarta.ws.rs.QueryParam("fields") String fields,
            @jakarta.ws.rs.QueryParam("exact_match") Boolean exactMatch,
            @jakarta.ws.rs.QueryParam("person_id") Integer personId,
            @jakarta.ws.rs.QueryParam("organization_id") Integer organizationId,
            @jakarta.ws.rs.QueryParam("status") String status,
            @jakarta.ws.rs.QueryParam("include_fields") String includeFields,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updateDeal",
            method = "PUT",
            path = "/v1/deals/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updateDeal",
            method = "PUT",
            path = "/v1/deals/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateDeal")
    @jakarta.ws.rs.Path("/deals/{id}")
    public GetAddedDealResponse updateDeal(
            @jakarta.ws.rs.PathParam("id") Integer id, UpdateDealRequest updateDealRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updateDealProduct",
            method = "PUT",
            path = "/v1/deals/{id}/products/{product_attachment_id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updateDealProduct",
            method = "PUT",
            path = "/v1/deals/{id}/products/{product_attachment_id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateDealProduct")
    @jakarta.ws.rs.Path("/deals/{id}/products/{product_attachment_id}")
    public GetProductAttachmentDetailsResponse updateDealProduct(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.PathParam("product_attachment_id") Integer productAttachmentId,
            UpdateDealProductRequest updateDealProductRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addFile",
            method = "POST",
            path = "/v1/files")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addFile",
            method = "POST",
            path = "/v1/files")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"multipart/form-data"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addFile")
    @jakarta.ws.rs.Path("/files")
    public AddFileResponse addFile(@jakarta.ws.rs.BeanParam AddFileMultipartForm multipartForm);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addFileAndLinkIt",
            method = "POST",
            path = "/v1/files/remote")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addFileAndLinkIt",
            method = "POST",
            path = "/v1/files/remote")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/x-www-form-urlencoded"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addFileAndLinkIt")
    @jakarta.ws.rs.Path("/files/remote")
    public AddRemoteFileAndLinkItToItemResponse addFileAndLinkIt(
            @jakarta.ws.rs.BeanParam AddFileAndLinkItMultipartForm multipartForm);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteFile",
            method = "DELETE",
            path = "/v1/files/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteFile",
            method = "DELETE",
            path = "/v1/files/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteFile")
    @jakarta.ws.rs.Path("/files/{id}")
    public DeleteFileResponse deleteFile(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getFile",
            method = "GET",
            path = "/v1/files/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getFile",
            method = "GET",
            path = "/v1/files/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getFile")
    @jakarta.ws.rs.Path("/files/{id}")
    public GetFileResponse getFile(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getFiles",
            method = "GET",
            path = "/v1/files")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getFiles",
            method = "GET",
            path = "/v1/files")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getFiles")
    @jakarta.ws.rs.Path("/files")
    public GetFilesResponse getFiles(
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("sort") String sort);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "linkFileToItem",
            method = "POST",
            path = "/v1/files/remoteLink")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "linkFileToItem",
            method = "POST",
            path = "/v1/files/remoteLink")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/x-www-form-urlencoded"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("linkFileToItem")
    @jakarta.ws.rs.Path("/files/remoteLink")
    public GetLinkRemoteFileToItemResponse linkFileToItem(
            @jakarta.ws.rs.BeanParam LinkFileToItemMultipartForm multipartForm);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updateFile",
            method = "PUT",
            path = "/v1/files/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updateFile",
            method = "PUT",
            path = "/v1/files/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/x-www-form-urlencoded"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateFile")
    @jakarta.ws.rs.Path("/files/{id}")
    public UpdateFileResponse updateFile(
            @jakarta.ws.rs.BeanParam UpdateFileMultipartForm multipartForm,
            @jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addFilter",
            method = "POST",
            path = "/v1/filters")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addFilter",
            method = "POST",
            path = "/v1/filters")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addFilter")
    @jakarta.ws.rs.Path("/filters")
    public AddFiltersResponse addFilter(AddFilterRequest addFilterRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteFilter",
            method = "DELETE",
            path = "/v1/filters/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteFilter",
            method = "DELETE",
            path = "/v1/filters/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteFilter")
    @jakarta.ws.rs.Path("/filters/{id}")
    public DeleteFilterResponse deleteFilter(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteFilters",
            method = "DELETE",
            path = "/v1/filters")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteFilters",
            method = "DELETE",
            path = "/v1/filters")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteFilters")
    @jakarta.ws.rs.Path("/filters")
    public DeleteFiltersResponse deleteFilters(@jakarta.ws.rs.QueryParam("ids") String ids);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getFilter",
            method = "GET",
            path = "/v1/filters/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getFilter",
            method = "GET",
            path = "/v1/filters/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getFilter")
    @jakarta.ws.rs.Path("/filters/{id}")
    public GetFiltersResponse1 getFilter(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getFilterHelpers",
            method = "GET",
            path = "/v1/filters/helpers")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getFilterHelpers",
            method = "GET",
            path = "/v1/filters/helpers")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getFilterHelpers")
    @jakarta.ws.rs.Path("/filters/helpers")
    public Object getFilterHelpers();

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getFilters",
            method = "GET",
            path = "/v1/filters")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getFilters",
            method = "GET",
            path = "/v1/filters")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getFilters")
    @jakarta.ws.rs.Path("/filters")
    public GetFiltersResponse getFilters(@jakarta.ws.rs.QueryParam("type") String type);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updateFilter",
            method = "PUT",
            path = "/v1/filters/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updateFilter",
            method = "PUT",
            path = "/v1/filters/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateFilter")
    @jakarta.ws.rs.Path("/filters/{id}")
    public AddFiltersResponse updateFilter(
            @jakarta.ws.rs.PathParam("id") Integer id, UpdateFilterRequest updateFilterRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addGoal",
            method = "POST",
            path = "/v1/goals")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addGoal",
            method = "POST",
            path = "/v1/goals")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addGoal")
    @jakarta.ws.rs.Path("/goals")
    public UpsertGoalResponse addGoal(AddGoalRequest addGoalRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteGoal",
            method = "DELETE",
            path = "/v1/goals/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteGoal",
            method = "DELETE",
            path = "/v1/goals/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteGoal")
    @jakarta.ws.rs.Path("/goals/{id}")
    public DeleteGoalResponse deleteGoal(@jakarta.ws.rs.PathParam("id") String id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getGoalResult",
            method = "GET",
            path = "/v1/goals/{id}/results")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getGoalResult",
            method = "GET",
            path = "/v1/goals/{id}/results")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getGoalResult")
    @jakarta.ws.rs.Path("/goals/{id}/results")
    public GetGoalResultResponse getGoalResult(
            @jakarta.ws.rs.PathParam("id") String id,
            @jakarta.ws.rs.QueryParam("period.start") LocalDate periodStart,
            @jakarta.ws.rs.QueryParam("period.end") LocalDate periodEnd);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getGoals",
            method = "GET",
            path = "/v1/goals/find")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getGoals",
            method = "GET",
            path = "/v1/goals/find")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getGoals")
    @jakarta.ws.rs.Path("/goals/find")
    public GetGoalsResponse getGoals(
            @jakarta.ws.rs.QueryParam("type.name") String typeName,
            @jakarta.ws.rs.QueryParam("title") String title,
            @jakarta.ws.rs.QueryParam("is_active") Boolean isActive,
            @jakarta.ws.rs.QueryParam("assignee.id") Integer assigneeId,
            @jakarta.ws.rs.QueryParam("assignee.type") String assigneeType,
            @jakarta.ws.rs.QueryParam("expected_outcome.target") BigDecimal expectedOutcomeTarget,
            @jakarta.ws.rs.QueryParam("expected_outcome.tracking_metric")
                    String expectedOutcomeTrackingMetric,
            @jakarta.ws.rs.QueryParam("expected_outcome.currency_id")
                    Integer expectedOutcomeCurrencyId,
            @jakarta.ws.rs.QueryParam("type.params.pipeline_id") List<Integer> typeParamsPipelineId,
            @jakarta.ws.rs.QueryParam("type.params.stage_id") Integer typeParamsStageId,
            @jakarta.ws.rs.QueryParam("type.params.activity_type_id")
                    List<Integer> typeParamsActivityTypeId,
            @jakarta.ws.rs.QueryParam("period.start") LocalDate periodStart,
            @jakarta.ws.rs.QueryParam("period.end") LocalDate periodEnd);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updateGoal",
            method = "PUT",
            path = "/v1/goals/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updateGoal",
            method = "PUT",
            path = "/v1/goals/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateGoal")
    @jakarta.ws.rs.Path("/goals/{id}")
    public UpsertGoalResponse updateGoal(
            @jakarta.ws.rs.PathParam("id") String id, BasicGoalRequest basicGoalRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "searchItem",
            method = "GET",
            path = "/v1/itemSearch")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "searchItem",
            method = "GET",
            path = "/v1/itemSearch")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("searchItem")
    @jakarta.ws.rs.Path("/itemSearch")
    public GetItemSearchResponse searchItem(
            @jakarta.ws.rs.QueryParam("term") String term,
            @jakarta.ws.rs.QueryParam("item_types") String itemTypes,
            @jakarta.ws.rs.QueryParam("fields") String fields,
            @jakarta.ws.rs.QueryParam("search_for_related_items") Boolean searchForRelatedItems,
            @jakarta.ws.rs.QueryParam("exact_match") Boolean exactMatch,
            @jakarta.ws.rs.QueryParam("include_fields") String includeFields,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "searchItemByField",
            method = "GET",
            path = "/v1/itemSearch/field")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "searchItemByField",
            method = "GET",
            path = "/v1/itemSearch/field")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("searchItemByField")
    @jakarta.ws.rs.Path("/itemSearch/field")
    public GetItemSearchFieldResponse searchItemByField(
            @jakarta.ws.rs.QueryParam("term") String term,
            @jakarta.ws.rs.QueryParam("field_type") String fieldType,
            @jakarta.ws.rs.QueryParam("field_key") String fieldKey,
            @jakarta.ws.rs.QueryParam("exact_match") Boolean exactMatch,
            @jakarta.ws.rs.QueryParam("return_item_ids") Boolean returnItemIds,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addLeadLabel",
            method = "POST",
            path = "/v1/leadLabels")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addLeadLabel",
            method = "POST",
            path = "/v1/leadLabels")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addLeadLabel")
    @jakarta.ws.rs.Path("/leadLabels")
    public UpsertLeadLabelResponse addLeadLabel(AddLeadLabelRequest addLeadLabelRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteLeadLabel",
            method = "DELETE",
            path = "/v1/leadLabels/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteLeadLabel",
            method = "DELETE",
            path = "/v1/leadLabels/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteLeadLabel")
    @jakarta.ws.rs.Path("/leadLabels/{id}")
    public DeleteLeadIdResponse deleteLeadLabel(@jakarta.ws.rs.PathParam("id") UUID id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getLeadLabels",
            method = "GET",
            path = "/v1/leadLabels")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getLeadLabels",
            method = "GET",
            path = "/v1/leadLabels")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getLeadLabels")
    @jakarta.ws.rs.Path("/leadLabels")
    public GetLeadLabelsResponse getLeadLabels();

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getLeadLabels",
            method = "GET",
            path = "/v1/leadLabels")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getLeadLabels",
            method = "GET",
            path = "/v1/leadLabels")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getLeadLabels")
    @jakarta.ws.rs.Path("/leadLabels")
    public String getLeadLabelsAsJson();

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updateLeadLabel",
            method = "PATCH",
            path = "/v1/leadLabels/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updateLeadLabel",
            method = "PATCH",
            path = "/v1/leadLabels/{id}")
    @jakarta.ws.rs.PATCH
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateLeadLabel")
    @jakarta.ws.rs.Path("/leadLabels/{id}")
    public UpsertLeadLabelResponse updateLeadLabel(
            @jakarta.ws.rs.PathParam("id") UUID id, UpdateLeadLabelRequest updateLeadLabelRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addLead",
            method = "POST",
            path = "/v1/leads")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addLead",
            method = "POST",
            path = "/v1/leads")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addLead")
    @jakarta.ws.rs.Path("/leads")
    public GetLeadResponse addLead(AddLeadRequest addLeadRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteLead",
            method = "DELETE",
            path = "/v1/leads/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteLead",
            method = "DELETE",
            path = "/v1/leads/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteLead")
    @jakarta.ws.rs.Path("/leads/{id}")
    public GetLeadIdResponse deleteLead(@jakarta.ws.rs.PathParam("id") UUID id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getLead",
            method = "GET",
            path = "/v1/leads/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getLead",
            method = "GET",
            path = "/v1/leads/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getLead")
    @jakarta.ws.rs.Path("/leads/{id}")
    public GetLeadResponse getLead(@jakarta.ws.rs.PathParam("id") UUID id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getLeadUsers",
            method = "GET",
            path = "/v1/leads/{id}/permittedUsers")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getLeadUsers",
            method = "GET",
            path = "/v1/leads/{id}/permittedUsers")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getLeadUsers")
    @jakarta.ws.rs.Path("/leads/{id}/permittedUsers")
    public UserIds getLeadUsers(@jakarta.ws.rs.PathParam("id") String id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getLeads",
            method = "GET",
            path = "/v1/leads")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getLeads",
            method = "GET",
            path = "/v1/leads")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getLeads")
    @jakarta.ws.rs.Path("/leads")
    public GetLeadsResponse getLeads(
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("archived_status") String archivedStatus,
            @jakarta.ws.rs.QueryParam("owner_id") Integer ownerId,
            @jakarta.ws.rs.QueryParam("person_id") Integer personId,
            @jakarta.ws.rs.QueryParam("organization_id") Integer organizationId,
            @jakarta.ws.rs.QueryParam("filter_id") Integer filterId,
            @jakarta.ws.rs.QueryParam("sort") String sort);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getLeads",
            method = "GET",
            path = "/v1/leads")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getLeads",
            method = "GET",
            path = "/v1/leads")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getLeads")
    @jakarta.ws.rs.Path("/leads")
    public String getLeadsAsJson(
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("archived_status") String archivedStatus,
            @jakarta.ws.rs.QueryParam("owner_id") Integer ownerId,
            @jakarta.ws.rs.QueryParam("person_id") Integer personId,
            @jakarta.ws.rs.QueryParam("organization_id") Integer organizationId,
            @jakarta.ws.rs.QueryParam("filter_id") Integer filterId,
            @jakarta.ws.rs.QueryParam("sort") String sort);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "searchLeads",
            method = "GET",
            path = "/v1/leads/search")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "searchLeads",
            method = "GET",
            path = "/v1/leads/search")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("searchLeads")
    @jakarta.ws.rs.Path("/leads/search")
    public GetLeadSearchResponse searchLeads(
            @jakarta.ws.rs.QueryParam("term") String term,
            @jakarta.ws.rs.QueryParam("fields") String fields,
            @jakarta.ws.rs.QueryParam("exact_match") Boolean exactMatch,
            @jakarta.ws.rs.QueryParam("person_id") Integer personId,
            @jakarta.ws.rs.QueryParam("organization_id") Integer organizationId,
            @jakarta.ws.rs.QueryParam("include_fields") String includeFields,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updateLead",
            method = "PATCH",
            path = "/v1/leads/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updateLead",
            method = "PATCH",
            path = "/v1/leads/{id}")
    @jakarta.ws.rs.PATCH
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateLead")
    @jakarta.ws.rs.Path("/leads/{id}")
    public GetLeadResponse updateLead(
            @jakarta.ws.rs.PathParam("id") UUID id, UpdateLeadRequest updateLeadRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getLeadSources",
            method = "GET",
            path = "/v1/leadSources")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getLeadSources",
            method = "GET",
            path = "/v1/leadSources")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getLeadSources")
    @jakarta.ws.rs.Path("/leadSources")
    public GetLeadsSourceResponse getLeadSources();

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addTeam",
            method = "POST",
            path = "/v1/legacyTeams")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addTeam",
            method = "POST",
            path = "/v1/legacyTeams")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addTeam")
    @jakarta.ws.rs.Path("/legacyTeams")
    public GetTeamResponse addTeam(AddTeamRequest addTeamRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addTeamUser",
            method = "POST",
            path = "/v1/legacyTeams/{id}/users")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addTeamUser",
            method = "POST",
            path = "/v1/legacyTeams/{id}/users")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addTeamUser")
    @jakarta.ws.rs.Path("/legacyTeams/{id}/users")
    public UserIds addTeamUser(
            @jakarta.ws.rs.PathParam("id") Integer id, AddTeamUserRequest addTeamUserRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteTeamUser",
            method = "DELETE",
            path = "/v1/legacyTeams/{id}/users")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteTeamUser",
            method = "DELETE",
            path = "/v1/legacyTeams/{id}/users")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteTeamUser")
    @jakarta.ws.rs.Path("/legacyTeams/{id}/users")
    public UserIds deleteTeamUser(
            @jakarta.ws.rs.PathParam("id") Integer id, DeleteTeamUserRequest deleteTeamUserRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getTeam",
            method = "GET",
            path = "/v1/legacyTeams/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getTeam",
            method = "GET",
            path = "/v1/legacyTeams/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getTeam")
    @jakarta.ws.rs.Path("/legacyTeams/{id}")
    public GetTeamResponse getTeam(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("skip_users") BigDecimal skipUsers);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getTeamUsers",
            method = "GET",
            path = "/v1/legacyTeams/{id}/users")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getTeamUsers",
            method = "GET",
            path = "/v1/legacyTeams/{id}/users")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getTeamUsers")
    @jakarta.ws.rs.Path("/legacyTeams/{id}/users")
    public UserIds getTeamUsers(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getTeams",
            method = "GET",
            path = "/v1/legacyTeams")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getTeams",
            method = "GET",
            path = "/v1/legacyTeams")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getTeams")
    @jakarta.ws.rs.Path("/legacyTeams")
    public GetTeamsResponse getTeams(
            @jakarta.ws.rs.QueryParam("order_by") String orderBy,
            @jakarta.ws.rs.QueryParam("skip_users") BigDecimal skipUsers);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getUserTeams",
            method = "GET",
            path = "/v1/legacyTeams/user/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getUserTeams",
            method = "GET",
            path = "/v1/legacyTeams/user/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getUserTeams")
    @jakarta.ws.rs.Path("/legacyTeams/user/{id}")
    public GetTeamsResponse getUserTeams(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("order_by") String orderBy,
            @jakarta.ws.rs.QueryParam("skip_users") BigDecimal skipUsers);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updateTeam",
            method = "PUT",
            path = "/v1/legacyTeams/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updateTeam",
            method = "PUT",
            path = "/v1/legacyTeams/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateTeam")
    @jakarta.ws.rs.Path("/legacyTeams/{id}")
    public GetTeamResponse updateTeam(
            @jakarta.ws.rs.PathParam("id") Integer id, UpdateTeamRequest updateTeamRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteMailThread",
            method = "DELETE",
            path = "/v1/mailbox/mailThreads/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteMailThread",
            method = "DELETE",
            path = "/v1/mailbox/mailThreads/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteMailThread")
    @jakarta.ws.rs.Path("/mailbox/mailThreads/{id}")
    public DeleteMailThreadResponse deleteMailThread(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getMailMessage",
            method = "GET",
            path = "/v1/mailbox/mailMessages/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getMailMessage",
            method = "GET",
            path = "/v1/mailbox/mailMessages/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getMailMessage")
    @jakarta.ws.rs.Path("/mailbox/mailMessages/{id}")
    public GetMailMessageResponse getMailMessage(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("include_body") BigDecimal includeBody);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getMailThread",
            method = "GET",
            path = "/v1/mailbox/mailThreads/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getMailThread",
            method = "GET",
            path = "/v1/mailbox/mailThreads/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getMailThread")
    @jakarta.ws.rs.Path("/mailbox/mailThreads/{id}")
    public GetMailThreadResponse1 getMailThread(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getMailThreadMessages",
            method = "GET",
            path = "/v1/mailbox/mailThreads/{id}/mailMessages")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getMailThreadMessages",
            method = "GET",
            path = "/v1/mailbox/mailThreads/{id}/mailMessages")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getMailThreadMessages")
    @jakarta.ws.rs.Path("/mailbox/mailThreads/{id}/mailMessages")
    public GetMailThreadMessagesResponse getMailThreadMessages(
            @jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getMailThreads",
            method = "GET",
            path = "/v1/mailbox/mailThreads")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getMailThreads",
            method = "GET",
            path = "/v1/mailbox/mailThreads")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getMailThreads")
    @jakarta.ws.rs.Path("/mailbox/mailThreads")
    public GetMailThreadResponse getMailThreads(
            @jakarta.ws.rs.QueryParam("folder") String folder,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updateMailThreadDetails",
            method = "PUT",
            path = "/v1/mailbox/mailThreads/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updateMailThreadDetails",
            method = "PUT",
            path = "/v1/mailbox/mailThreads/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/x-www-form-urlencoded"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateMailThreadDetails")
    @jakarta.ws.rs.Path("/mailbox/mailThreads/{id}")
    public UpdateMailThreadResponse updateMailThreadDetails(
            @jakarta.ws.rs.BeanParam UpdateMailThreadDetailsMultipartForm multipartForm,
            @jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteUserProviderLink",
            method = "DELETE",
            path = "/v1/meetings/userProviderLinks/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteUserProviderLink",
            method = "DELETE",
            path = "/v1/meetings/userProviderLinks/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteUserProviderLink")
    @jakarta.ws.rs.Path("/meetings/userProviderLinks/{id}")
    public GetUserProviderLinkSuccessResponse deleteUserProviderLink(
            @jakarta.ws.rs.PathParam("id") UUID id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "saveUserProviderLink",
            method = "POST",
            path = "/v1/meetings/userProviderLinks")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "saveUserProviderLink",
            method = "POST",
            path = "/v1/meetings/userProviderLinks")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("saveUserProviderLink")
    @jakarta.ws.rs.Path("/meetings/userProviderLinks")
    public GetUserProviderLinkSuccessResponse saveUserProviderLink(
            AddUserProviderLinkRequest addUserProviderLinkRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getNoteFields",
            method = "GET",
            path = "/v1/noteFields")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getNoteFields",
            method = "GET",
            path = "/v1/noteFields")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getNoteFields")
    @jakarta.ws.rs.Path("/noteFields")
    public GetNoteFieldsResponse getNoteFields();

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addNote",
            method = "POST",
            path = "/v1/notes")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addNote",
            method = "POST",
            path = "/v1/notes")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addNote")
    @jakarta.ws.rs.Path("/notes")
    public UpsertNoteResponse addNote(AddNoteRequest addNoteRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addNoteComment",
            method = "POST",
            path = "/v1/notes/{id}/comments")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addNoteComment",
            method = "POST",
            path = "/v1/notes/{id}/comments")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addNoteComment")
    @jakarta.ws.rs.Path("/notes/{id}/comments")
    public UpsertCommentResponse addNoteComment(
            @jakarta.ws.rs.PathParam("id") Integer id, CommentPostPutObject commentPostPutObject);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteComment",
            method = "DELETE",
            path = "/v1/notes/{id}/comments/{commentId}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteComment",
            method = "DELETE",
            path = "/v1/notes/{id}/comments/{commentId}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteComment")
    @jakarta.ws.rs.Path("/notes/{id}/comments/{commentId}")
    public DeleteCommentResponse deleteComment(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.PathParam("commentId") UUID commentId);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteNote",
            method = "DELETE",
            path = "/v1/notes/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteNote",
            method = "DELETE",
            path = "/v1/notes/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteNote")
    @jakarta.ws.rs.Path("/notes/{id}")
    public DeleteNoteResponse deleteNote(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getComment",
            method = "GET",
            path = "/v1/notes/{id}/comments/{commentId}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getComment",
            method = "GET",
            path = "/v1/notes/{id}/comments/{commentId}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getComment")
    @jakarta.ws.rs.Path("/notes/{id}/comments/{commentId}")
    public UpsertCommentResponse getComment(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.PathParam("commentId") UUID commentId);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getNote",
            method = "GET",
            path = "/v1/notes/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getNote",
            method = "GET",
            path = "/v1/notes/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getNote")
    @jakarta.ws.rs.Path("/notes/{id}")
    public UpsertNoteResponse getNote(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getNoteComments",
            method = "GET",
            path = "/v1/notes/{id}/comments")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getNoteComments",
            method = "GET",
            path = "/v1/notes/{id}/comments")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getNoteComments")
    @jakarta.ws.rs.Path("/notes/{id}/comments")
    public GetCommentsResponse getNoteComments(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getNotes",
            method = "GET",
            path = "/v1/notes")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getNotes",
            method = "GET",
            path = "/v1/notes")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getNotes")
    @jakarta.ws.rs.Path("/notes")
    public GetNotesResponse getNotes(
            @jakarta.ws.rs.QueryParam("user_id") Integer userId,
            @jakarta.ws.rs.QueryParam("lead_id") UUID leadId,
            @jakarta.ws.rs.QueryParam("deal_id") Integer dealId,
            @jakarta.ws.rs.QueryParam("person_id") Integer personId,
            @jakarta.ws.rs.QueryParam("org_id") Integer orgId,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("sort") String sort,
            @jakarta.ws.rs.QueryParam("start_date") LocalDate startDate,
            @jakarta.ws.rs.QueryParam("end_date") LocalDate endDate,
            @jakarta.ws.rs.QueryParam("pinned_to_lead_flag") BigDecimal pinnedToLeadFlag,
            @jakarta.ws.rs.QueryParam("pinned_to_deal_flag") BigDecimal pinnedToDealFlag,
            @jakarta.ws.rs.QueryParam("pinned_to_organization_flag")
                    BigDecimal pinnedToOrganizationFlag,
            @jakarta.ws.rs.QueryParam("pinned_to_person_flag") BigDecimal pinnedToPersonFlag);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getNotes",
            method = "GET",
            path = "/v1/notes")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getNotes",
            method = "GET",
            path = "/v1/notes")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getNotes")
    @jakarta.ws.rs.Path("/notes")
    public String getNotesAsJson(
            @jakarta.ws.rs.QueryParam("user_id") Integer userId,
            @jakarta.ws.rs.QueryParam("lead_id") UUID leadId,
            @jakarta.ws.rs.QueryParam("deal_id") Integer dealId,
            @jakarta.ws.rs.QueryParam("person_id") Integer personId,
            @jakarta.ws.rs.QueryParam("org_id") Integer orgId,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("sort") String sort,
            @jakarta.ws.rs.QueryParam("start_date") LocalDate startDate,
            @jakarta.ws.rs.QueryParam("end_date") LocalDate endDate,
            @jakarta.ws.rs.QueryParam("pinned_to_lead_flag") BigDecimal pinnedToLeadFlag,
            @jakarta.ws.rs.QueryParam("pinned_to_deal_flag") BigDecimal pinnedToDealFlag,
            @jakarta.ws.rs.QueryParam("pinned_to_organization_flag")
                    BigDecimal pinnedToOrganizationFlag,
            @jakarta.ws.rs.QueryParam("pinned_to_person_flag") BigDecimal pinnedToPersonFlag);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updateCommentForNote",
            method = "PUT",
            path = "/v1/notes/{id}/comments/{commentId}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updateCommentForNote",
            method = "PUT",
            path = "/v1/notes/{id}/comments/{commentId}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateCommentForNote")
    @jakarta.ws.rs.Path("/notes/{id}/comments/{commentId}")
    public UpsertCommentResponse updateCommentForNote(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.PathParam("commentId") UUID commentId,
            CommentPostPutObject commentPostPutObject);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updateNote",
            method = "PUT",
            path = "/v1/notes/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updateNote",
            method = "PUT",
            path = "/v1/notes/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateNote")
    @jakarta.ws.rs.Path("/notes/{id}")
    public UpsertNoteResponse updateNote(
            @jakarta.ws.rs.PathParam("id") Integer id, NoteRequest noteRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addOrganizationField",
            method = "POST",
            path = "/v1/organizationFields")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addOrganizationField",
            method = "POST",
            path = "/v1/organizationFields")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addOrganizationField")
    @jakarta.ws.rs.Path("/organizationFields")
    public GetFieldResponse addOrganizationField(CreateFieldRequest createFieldRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteOrganizationField",
            method = "DELETE",
            path = "/v1/organizationFields/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteOrganizationField",
            method = "DELETE",
            path = "/v1/organizationFields/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteOrganizationField")
    @jakarta.ws.rs.Path("/organizationFields/{id}")
    public DeleteResponse deleteOrganizationField(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteOrganizationFields",
            method = "DELETE",
            path = "/v1/organizationFields")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteOrganizationFields",
            method = "DELETE",
            path = "/v1/organizationFields")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteOrganizationFields")
    @jakarta.ws.rs.Path("/organizationFields")
    public DeleteFieldsResponse deleteOrganizationFields(
            @jakarta.ws.rs.QueryParam("ids") String ids);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationField",
            method = "GET",
            path = "/v1/organizationFields/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationField",
            method = "GET",
            path = "/v1/organizationFields/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationField")
    @jakarta.ws.rs.Path("/organizationFields/{id}")
    public GetFieldResponse getOrganizationField(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationFields",
            method = "GET",
            path = "/v1/organizationFields")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationFields",
            method = "GET",
            path = "/v1/organizationFields")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationFields")
    @jakarta.ws.rs.Path("/organizationFields")
    public GetFieldsResponse getOrganizationFields(
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationFields",
            method = "GET",
            path = "/v1/organizationFields")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationFields",
            method = "GET",
            path = "/v1/organizationFields")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationFields")
    @jakarta.ws.rs.Path("/organizationFields")
    public String getOrganizationFieldsAsJson(
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updateOrganizationField",
            method = "PUT",
            path = "/v1/organizationFields/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updateOrganizationField",
            method = "PUT",
            path = "/v1/organizationFields/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateOrganizationField")
    @jakarta.ws.rs.Path("/organizationFields/{id}")
    public GetFieldResponse updateOrganizationField(
            @jakarta.ws.rs.PathParam("id") Integer id, UpdateFieldRequest updateFieldRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addOrganizationRelationship",
            method = "POST",
            path = "/v1/organizationRelationships")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addOrganizationRelationship",
            method = "POST",
            path = "/v1/organizationRelationships")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addOrganizationRelationship")
    @jakarta.ws.rs.Path("/organizationRelationships")
    public AddOrganizationRelationshipResponse addOrganizationRelationship(
            AddOrganizationRelationshipRequest addOrganizationRelationshipRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteOrganizationRelationship",
            method = "DELETE",
            path = "/v1/organizationRelationships/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteOrganizationRelationship",
            method = "DELETE",
            path = "/v1/organizationRelationships/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteOrganizationRelationship")
    @jakarta.ws.rs.Path("/organizationRelationships/{id}")
    public DeleteOrganizationRelationshipResponse deleteOrganizationRelationship(
            @jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationRelationship",
            method = "GET",
            path = "/v1/organizationRelationships/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationRelationship",
            method = "GET",
            path = "/v1/organizationRelationships/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationRelationship")
    @jakarta.ws.rs.Path("/organizationRelationships/{id}")
    public GetOrganizationRelationshipResponse getOrganizationRelationship(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("org_id") Integer orgId);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationRelationships",
            method = "GET",
            path = "/v1/organizationRelationships")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationRelationships",
            method = "GET",
            path = "/v1/organizationRelationships")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationRelationships")
    @jakarta.ws.rs.Path("/organizationRelationships")
    public GetOrganizationRelationshipsResponse getOrganizationRelationships(
            @jakarta.ws.rs.QueryParam("org_id") Integer orgId);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updateOrganizationRelationship",
            method = "PUT",
            path = "/v1/organizationRelationships/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updateOrganizationRelationship",
            method = "PUT",
            path = "/v1/organizationRelationships/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateOrganizationRelationship")
    @jakarta.ws.rs.Path("/organizationRelationships/{id}")
    public UpdateOrganizationRelationshipResponse updateOrganizationRelationship(
            @jakarta.ws.rs.PathParam("id") Integer id,
            OrganizationRelationship organizationRelationship);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addOrganization",
            method = "POST",
            path = "/v1/organizations")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addOrganization",
            method = "POST",
            path = "/v1/organizations")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addOrganization")
    @jakarta.ws.rs.Path("/organizations")
    public AddOrganizationResponse addOrganization(AddOrganizationRequest addOrganizationRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addOrganizationFollower",
            method = "POST",
            path = "/v1/organizations/{id}/followers")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addOrganizationFollower",
            method = "POST",
            path = "/v1/organizations/{id}/followers")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addOrganizationFollower")
    @jakarta.ws.rs.Path("/organizations/{id}/followers")
    public AddOrganizationFollowerResponse addOrganizationFollower(
            @jakarta.ws.rs.PathParam("id") Integer id,
            AddOrganizationFollowerRequest addOrganizationFollowerRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteOrganization",
            method = "DELETE",
            path = "/v1/organizations/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteOrganization",
            method = "DELETE",
            path = "/v1/organizations/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteOrganization")
    @jakarta.ws.rs.Path("/organizations/{id}")
    public DeleteOrganizationResponse deleteOrganization(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteOrganizationFollower",
            method = "DELETE",
            path = "/v1/organizations/{id}/followers/{follower_id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteOrganizationFollower",
            method = "DELETE",
            path = "/v1/organizations/{id}/followers/{follower_id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteOrganizationFollower")
    @jakarta.ws.rs.Path("/organizations/{id}/followers/{follower_id}")
    public DeleteOrganizationFollowerResponse deleteOrganizationFollower(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.PathParam("follower_id") Integer followerId);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteOrganizations",
            method = "DELETE",
            path = "/v1/organizations")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteOrganizations",
            method = "DELETE",
            path = "/v1/organizations")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteOrganizations")
    @jakarta.ws.rs.Path("/organizations")
    public DeleteOrganizationsResponse deleteOrganizations(
            @jakarta.ws.rs.QueryParam("ids") String ids);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganization",
            method = "GET",
            path = "/v1/organizations/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganization",
            method = "GET",
            path = "/v1/organizations/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganization")
    @jakarta.ws.rs.Path("/organizations/{id}")
    public GetOrganizationResponse getOrganization(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationActivities",
            method = "GET",
            path = "/v1/organizations/{id}/activities")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationActivities",
            method = "GET",
            path = "/v1/organizations/{id}/activities")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationActivities")
    @jakarta.ws.rs.Path("/organizations/{id}/activities")
    public GetAssociatedActivitiesResponse getOrganizationActivities(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("done") BigDecimal done,
            @jakarta.ws.rs.QueryParam("exclude") String exclude);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationChangelog",
            method = "GET",
            path = "/v1/organizations/{id}/changelog")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationChangelog",
            method = "GET",
            path = "/v1/organizations/{id}/changelog")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationChangelog")
    @jakarta.ws.rs.Path("/organizations/{id}/changelog")
    public GetChangelogResponse getOrganizationChangelog(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("cursor") String cursor,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationDeals",
            method = "GET",
            path = "/v1/organizations/{id}/deals")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationDeals",
            method = "GET",
            path = "/v1/organizations/{id}/deals")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationDeals")
    @jakarta.ws.rs.Path("/organizations/{id}/deals")
    public GetAssociatedDealsResponse getOrganizationDeals(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("status") String status,
            @jakarta.ws.rs.QueryParam("sort") String sort,
            @jakarta.ws.rs.QueryParam("only_primary_association")
                    BigDecimal onlyPrimaryAssociation);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationFiles",
            method = "GET",
            path = "/v1/organizations/{id}/files")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationFiles",
            method = "GET",
            path = "/v1/organizations/{id}/files")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationFiles")
    @jakarta.ws.rs.Path("/organizations/{id}/files")
    public GetAssociatedFilesResponse getOrganizationFiles(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("sort") String sort);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationFollowers",
            method = "GET",
            path = "/v1/organizations/{id}/followers")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationFollowers",
            method = "GET",
            path = "/v1/organizations/{id}/followers")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationFollowers")
    @jakarta.ws.rs.Path("/organizations/{id}/followers")
    public GetAssociatedFollowersResponse getOrganizationFollowers(
            @jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationMailMessages",
            method = "GET",
            path = "/v1/organizations/{id}/mailMessages")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationMailMessages",
            method = "GET",
            path = "/v1/organizations/{id}/mailMessages")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationMailMessages")
    @jakarta.ws.rs.Path("/organizations/{id}/mailMessages")
    public GetAssociatedMailMessagesResponse getOrganizationMailMessages(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationPersons",
            method = "GET",
            path = "/v1/organizations/{id}/persons")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationPersons",
            method = "GET",
            path = "/v1/organizations/{id}/persons")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationPersons")
    @jakarta.ws.rs.Path("/organizations/{id}/persons")
    public GetPersonsResponse getOrganizationPersons(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationUpdates",
            method = "GET",
            path = "/v1/organizations/{id}/flow")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationUpdates",
            method = "GET",
            path = "/v1/organizations/{id}/flow")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationUpdates")
    @jakarta.ws.rs.Path("/organizations/{id}/flow")
    public GetAssociatedOrganizationUpdatesResponse getOrganizationUpdates(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("all_changes") String allChanges,
            @jakarta.ws.rs.QueryParam("items") String items);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationUsers",
            method = "GET",
            path = "/v1/organizations/{id}/permittedUsers")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationUsers",
            method = "GET",
            path = "/v1/organizations/{id}/permittedUsers")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationUsers")
    @jakarta.ws.rs.Path("/organizations/{id}/permittedUsers")
    public GetPermittedUsersResponse1 getOrganizationUsers(
            @jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizations",
            method = "GET",
            path = "/v1/organizations")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizations",
            method = "GET",
            path = "/v1/organizations")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizations")
    @jakarta.ws.rs.Path("/organizations")
    public GetOrganizationsResponse getOrganizations(
            @jakarta.ws.rs.QueryParam("user_id") Integer userId,
            @jakarta.ws.rs.QueryParam("filter_id") Integer filterId,
            @jakarta.ws.rs.QueryParam("first_char") String firstChar,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("sort") String sort);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationsCollection",
            method = "GET",
            path = "/v1/organizations/collection")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationsCollection",
            method = "GET",
            path = "/v1/organizations/collection")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationsCollection")
    @jakarta.ws.rs.Path("/organizations/collection")
    public GetOrganizationsCollection200Response getOrganizationsCollection(
            @jakarta.ws.rs.QueryParam("cursor") String cursor,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("since") String since,
            @jakarta.ws.rs.QueryParam("until") String until,
            @jakarta.ws.rs.QueryParam("owner_id") Integer ownerId,
            @jakarta.ws.rs.QueryParam("first_char") String firstChar);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationsCollection",
            method = "GET",
            path = "/v1/organizations/collection")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getOrganizationsCollection",
            method = "GET",
            path = "/v1/organizations/collection")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationsCollection")
    @jakarta.ws.rs.Path("/organizations/collection")
    public String getOrganizationsCollectionAsJson(
            @jakarta.ws.rs.QueryParam("cursor") String cursor,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("since") String since,
            @jakarta.ws.rs.QueryParam("until") String until,
            @jakarta.ws.rs.QueryParam("owner_id") Integer ownerId,
            @jakarta.ws.rs.QueryParam("first_char") String firstChar);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "mergeOrganizations",
            method = "PUT",
            path = "/v1/organizations/{id}/merge")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "mergeOrganizations",
            method = "PUT",
            path = "/v1/organizations/{id}/merge")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("mergeOrganizations")
    @jakarta.ws.rs.Path("/organizations/{id}/merge")
    public MergeOrganizationsResponse mergeOrganizations(
            @jakarta.ws.rs.PathParam("id") Integer id,
            MergeOrganizationsRequest mergeOrganizationsRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "searchOrganization",
            method = "GET",
            path = "/v1/organizations/search")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "searchOrganization",
            method = "GET",
            path = "/v1/organizations/search")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("searchOrganization")
    @jakarta.ws.rs.Path("/organizations/search")
    public GetOrganizationSearchResponse searchOrganization(
            @jakarta.ws.rs.QueryParam("term") String term,
            @jakarta.ws.rs.QueryParam("fields") String fields,
            @jakarta.ws.rs.QueryParam("exact_match") Boolean exactMatch,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updateOrganization",
            method = "PUT",
            path = "/v1/organizations/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updateOrganization",
            method = "PUT",
            path = "/v1/organizations/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateOrganization")
    @jakarta.ws.rs.Path("/organizations/{id}")
    public UpdateOrganizationResponse updateOrganization(
            @jakarta.ws.rs.PathParam("id") Integer id,
            UpdateOrganizationRequest updateOrganizationRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getPermissionSet",
            method = "GET",
            path = "/v1/permissionSets/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getPermissionSet",
            method = "GET",
            path = "/v1/permissionSets/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPermissionSet")
    @jakarta.ws.rs.Path("/permissionSets/{id}")
    public GetPermissionSetResponse getPermissionSet(@jakarta.ws.rs.PathParam("id") String id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getPermissionSetAssignments",
            method = "GET",
            path = "/v1/permissionSets/{id}/assignments")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getPermissionSetAssignments",
            method = "GET",
            path = "/v1/permissionSets/{id}/assignments")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPermissionSetAssignments")
    @jakarta.ws.rs.Path("/permissionSets/{id}/assignments")
    public GetUserAssignmentsToPermissionSetResponse getPermissionSetAssignments(
            @jakarta.ws.rs.PathParam("id") String id,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getPermissionSets",
            method = "GET",
            path = "/v1/permissionSets")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getPermissionSets",
            method = "GET",
            path = "/v1/permissionSets")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPermissionSets")
    @jakarta.ws.rs.Path("/permissionSets")
    public GetPermissionSetsResponse getPermissionSets(@jakarta.ws.rs.QueryParam("app") String app);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addPersonField",
            method = "POST",
            path = "/v1/personFields")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addPersonField",
            method = "POST",
            path = "/v1/personFields")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addPersonField")
    @jakarta.ws.rs.Path("/personFields")
    public GetFieldResponse addPersonField(CreateFieldRequest createFieldRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deletePersonField",
            method = "DELETE",
            path = "/v1/personFields/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deletePersonField",
            method = "DELETE",
            path = "/v1/personFields/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deletePersonField")
    @jakarta.ws.rs.Path("/personFields/{id}")
    public DeleteResponse deletePersonField(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deletePersonFields",
            method = "DELETE",
            path = "/v1/personFields")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deletePersonFields",
            method = "DELETE",
            path = "/v1/personFields")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deletePersonFields")
    @jakarta.ws.rs.Path("/personFields")
    public DeleteFieldsResponse deletePersonFields(@jakarta.ws.rs.QueryParam("ids") String ids);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonField",
            method = "GET",
            path = "/v1/personFields/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonField",
            method = "GET",
            path = "/v1/personFields/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersonField")
    @jakarta.ws.rs.Path("/personFields/{id}")
    public GetFieldResponse getPersonField(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonFields",
            method = "GET",
            path = "/v1/personFields")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonFields",
            method = "GET",
            path = "/v1/personFields")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersonFields")
    @jakarta.ws.rs.Path("/personFields")
    public GetFieldsResponse getPersonFields(
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonFields",
            method = "GET",
            path = "/v1/personFields")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonFields",
            method = "GET",
            path = "/v1/personFields")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersonFields")
    @jakarta.ws.rs.Path("/personFields")
    public String getPersonFieldsAsJson(
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updatePersonField",
            method = "PUT",
            path = "/v1/personFields/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updatePersonField",
            method = "PUT",
            path = "/v1/personFields/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updatePersonField")
    @jakarta.ws.rs.Path("/personFields/{id}")
    public GetFieldResponse updatePersonField(
            @jakarta.ws.rs.PathParam("id") Integer id, UpdateFieldRequest updateFieldRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addPerson",
            method = "POST",
            path = "/v1/persons")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addPerson",
            method = "POST",
            path = "/v1/persons")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addPerson")
    @jakarta.ws.rs.Path("/persons")
    public AddPersonResponse addPerson(AddPersonRequest addPersonRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addPersonFollower",
            method = "POST",
            path = "/v1/persons/{id}/followers")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addPersonFollower",
            method = "POST",
            path = "/v1/persons/{id}/followers")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addPersonFollower")
    @jakarta.ws.rs.Path("/persons/{id}/followers")
    public AddPersonFollowerResponse addPersonFollower(
            @jakarta.ws.rs.PathParam("id") Integer id,
            AddPersonFollowerRequest addPersonFollowerRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addPersonPicture",
            method = "POST",
            path = "/v1/persons/{id}/picture")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addPersonPicture",
            method = "POST",
            path = "/v1/persons/{id}/picture")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"multipart/form-data"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addPersonPicture")
    @jakarta.ws.rs.Path("/persons/{id}/picture")
    public AddPersonPictureResponse addPersonPicture(
            @jakarta.ws.rs.BeanParam AddPersonPictureMultipartForm multipartForm,
            @jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deletePerson",
            method = "DELETE",
            path = "/v1/persons/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deletePerson",
            method = "DELETE",
            path = "/v1/persons/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deletePerson")
    @jakarta.ws.rs.Path("/persons/{id}")
    public DeletePersonResponse deletePerson(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deletePersonFollower",
            method = "DELETE",
            path = "/v1/persons/{id}/followers/{follower_id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deletePersonFollower",
            method = "DELETE",
            path = "/v1/persons/{id}/followers/{follower_id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deletePersonFollower")
    @jakarta.ws.rs.Path("/persons/{id}/followers/{follower_id}")
    public DeletePersonResponse deletePersonFollower(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.PathParam("follower_id") Integer followerId);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deletePersonPicture",
            method = "DELETE",
            path = "/v1/persons/{id}/picture")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deletePersonPicture",
            method = "DELETE",
            path = "/v1/persons/{id}/picture")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deletePersonPicture")
    @jakarta.ws.rs.Path("/persons/{id}/picture")
    public DeletePersonResponse deletePersonPicture(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deletePersons",
            method = "DELETE",
            path = "/v1/persons")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deletePersons",
            method = "DELETE",
            path = "/v1/persons")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deletePersons")
    @jakarta.ws.rs.Path("/persons")
    public DeletePersonsResponse deletePersons(@jakarta.ws.rs.QueryParam("ids") String ids);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getPerson",
            method = "GET",
            path = "/v1/persons/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getPerson",
            method = "GET",
            path = "/v1/persons/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPerson")
    @jakarta.ws.rs.Path("/persons/{id}")
    public GetPersonDetailsResponse getPerson(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonActivities",
            method = "GET",
            path = "/v1/persons/{id}/activities")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonActivities",
            method = "GET",
            path = "/v1/persons/{id}/activities")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersonActivities")
    @jakarta.ws.rs.Path("/persons/{id}/activities")
    public GetAssociatedActivitiesResponse getPersonActivities(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("done") BigDecimal done,
            @jakarta.ws.rs.QueryParam("exclude") String exclude);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonChangelog",
            method = "GET",
            path = "/v1/persons/{id}/changelog")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonChangelog",
            method = "GET",
            path = "/v1/persons/{id}/changelog")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersonChangelog")
    @jakarta.ws.rs.Path("/persons/{id}/changelog")
    public GetChangelogResponse getPersonChangelog(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("cursor") String cursor,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonDeals",
            method = "GET",
            path = "/v1/persons/{id}/deals")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonDeals",
            method = "GET",
            path = "/v1/persons/{id}/deals")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersonDeals")
    @jakarta.ws.rs.Path("/persons/{id}/deals")
    public GetAssociatedDealsResponse getPersonDeals(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("status") String status,
            @jakarta.ws.rs.QueryParam("sort") String sort);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonFiles",
            method = "GET",
            path = "/v1/persons/{id}/files")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonFiles",
            method = "GET",
            path = "/v1/persons/{id}/files")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersonFiles")
    @jakarta.ws.rs.Path("/persons/{id}/files")
    public GetAssociatedFilesResponse getPersonFiles(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("sort") String sort);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonFollowers",
            method = "GET",
            path = "/v1/persons/{id}/followers")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonFollowers",
            method = "GET",
            path = "/v1/persons/{id}/followers")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersonFollowers")
    @jakarta.ws.rs.Path("/persons/{id}/followers")
    public GetListFollowersResponse getPersonFollowers(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonMailMessages",
            method = "GET",
            path = "/v1/persons/{id}/mailMessages")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonMailMessages",
            method = "GET",
            path = "/v1/persons/{id}/mailMessages")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersonMailMessages")
    @jakarta.ws.rs.Path("/persons/{id}/mailMessages")
    public GetAssociatedMailMessagesResponse getPersonMailMessages(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonProducts",
            method = "GET",
            path = "/v1/persons/{id}/products")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonProducts",
            method = "GET",
            path = "/v1/persons/{id}/products")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersonProducts")
    @jakarta.ws.rs.Path("/persons/{id}/products")
    public GetPersonProductsResponse getPersonProducts(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonUpdates",
            method = "GET",
            path = "/v1/persons/{id}/flow")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonUpdates",
            method = "GET",
            path = "/v1/persons/{id}/flow")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersonUpdates")
    @jakarta.ws.rs.Path("/persons/{id}/flow")
    public GetAssociatedPersonUpdatesResponse getPersonUpdates(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("all_changes") String allChanges,
            @jakarta.ws.rs.QueryParam("items") String items);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonUsers",
            method = "GET",
            path = "/v1/persons/{id}/permittedUsers")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonUsers",
            method = "GET",
            path = "/v1/persons/{id}/permittedUsers")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersonUsers")
    @jakarta.ws.rs.Path("/persons/{id}/permittedUsers")
    public GetPermittedUsersResponse1 getPersonUsers(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersons",
            method = "GET",
            path = "/v1/persons")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersons",
            method = "GET",
            path = "/v1/persons")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersons")
    @jakarta.ws.rs.Path("/persons")
    public GetPersonsResponse1 getPersons(
            @jakarta.ws.rs.QueryParam("user_id") Integer userId,
            @jakarta.ws.rs.QueryParam("filter_id") Integer filterId,
            @jakarta.ws.rs.QueryParam("first_char") String firstChar,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("sort") String sort);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonsCollection",
            method = "GET",
            path = "/v1/persons/collection")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonsCollection",
            method = "GET",
            path = "/v1/persons/collection")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersonsCollection")
    @jakarta.ws.rs.Path("/persons/collection")
    public GetPersonsCollection200Response getPersonsCollection(
            @jakarta.ws.rs.QueryParam("cursor") String cursor,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("since") String since,
            @jakarta.ws.rs.QueryParam("until") String until,
            @jakarta.ws.rs.QueryParam("owner_id") Integer ownerId,
            @jakarta.ws.rs.QueryParam("first_char") String firstChar);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonsCollection",
            method = "GET",
            path = "/v1/persons/collection")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getPersonsCollection",
            method = "GET",
            path = "/v1/persons/collection")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersonsCollection")
    @jakarta.ws.rs.Path("/persons/collection")
    public String getPersonsCollectionAsJson(
            @jakarta.ws.rs.QueryParam("cursor") String cursor,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("since") String since,
            @jakarta.ws.rs.QueryParam("until") String until,
            @jakarta.ws.rs.QueryParam("owner_id") Integer ownerId,
            @jakarta.ws.rs.QueryParam("first_char") String firstChar);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "mergePersons",
            method = "PUT",
            path = "/v1/persons/{id}/merge")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "mergePersons",
            method = "PUT",
            path = "/v1/persons/{id}/merge")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("mergePersons")
    @jakarta.ws.rs.Path("/persons/{id}/merge")
    public MergePersonsResponse mergePersons(
            @jakarta.ws.rs.PathParam("id") Integer id, MergePersonsRequest mergePersonsRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "searchPersons",
            method = "GET",
            path = "/v1/persons/search")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "searchPersons",
            method = "GET",
            path = "/v1/persons/search")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("searchPersons")
    @jakarta.ws.rs.Path("/persons/search")
    public GetPersonSearchResponse searchPersons(
            @jakarta.ws.rs.QueryParam("term") String term,
            @jakarta.ws.rs.QueryParam("fields") String fields,
            @jakarta.ws.rs.QueryParam("exact_match") Boolean exactMatch,
            @jakarta.ws.rs.QueryParam("organization_id") Integer organizationId,
            @jakarta.ws.rs.QueryParam("include_fields") String includeFields,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updatePerson",
            method = "PUT",
            path = "/v1/persons/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updatePerson",
            method = "PUT",
            path = "/v1/persons/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updatePerson")
    @jakarta.ws.rs.Path("/persons/{id}")
    public UpdatePersonResponse updatePerson(
            @jakarta.ws.rs.PathParam("id") Integer id, UpdatePersonRequest updatePersonRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addPipeline",
            method = "POST",
            path = "/v1/pipelines")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addPipeline",
            method = "POST",
            path = "/v1/pipelines")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addPipeline")
    @jakarta.ws.rs.Path("/pipelines")
    public AddPipelineResponse addPipeline(PipelineRequest pipelineRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deletePipeline",
            method = "DELETE",
            path = "/v1/pipelines/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deletePipeline",
            method = "DELETE",
            path = "/v1/pipelines/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deletePipeline")
    @jakarta.ws.rs.Path("/pipelines/{id}")
    public DeletePipelineResponse deletePipeline(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getPipeline",
            method = "GET",
            path = "/v1/pipelines/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getPipeline",
            method = "GET",
            path = "/v1/pipelines/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPipeline")
    @jakarta.ws.rs.Path("/pipelines/{id}")
    public GetPipelineResponse getPipeline(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("totals_convert_currency") String totalsConvertCurrency);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getPipelineConversionStatistics",
            method = "GET",
            path = "/v1/pipelines/{id}/conversion_statistics")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getPipelineConversionStatistics",
            method = "GET",
            path = "/v1/pipelines/{id}/conversion_statistics")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPipelineConversionStatistics")
    @jakarta.ws.rs.Path("/pipelines/{id}/conversion_statistics")
    public GetPipelineDealsConversionRatesInResponse getPipelineConversionStatistics(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("start_date") LocalDate startDate,
            @jakarta.ws.rs.QueryParam("end_date") LocalDate endDate,
            @jakarta.ws.rs.QueryParam("user_id") Integer userId);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getPipelineDeals",
            method = "GET",
            path = "/v1/pipelines/{id}/deals")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getPipelineDeals",
            method = "GET",
            path = "/v1/pipelines/{id}/deals")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPipelineDeals")
    @jakarta.ws.rs.Path("/pipelines/{id}/deals")
    public GetStageDealsResponse getPipelineDeals(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("filter_id") Integer filterId,
            @jakarta.ws.rs.QueryParam("user_id") Integer userId,
            @jakarta.ws.rs.QueryParam("everyone") BigDecimal everyone,
            @jakarta.ws.rs.QueryParam("stage_id") Integer stageId,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("get_summary") BigDecimal getSummary,
            @jakarta.ws.rs.QueryParam("totals_convert_currency") String totalsConvertCurrency);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getPipelineMovementStatistics",
            method = "GET",
            path = "/v1/pipelines/{id}/movement_statistics")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getPipelineMovementStatistics",
            method = "GET",
            path = "/v1/pipelines/{id}/movement_statistics")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPipelineMovementStatistics")
    @jakarta.ws.rs.Path("/pipelines/{id}/movement_statistics")
    public GetPipelineDealsMovementsStatisticsResponse getPipelineMovementStatistics(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("start_date") LocalDate startDate,
            @jakarta.ws.rs.QueryParam("end_date") LocalDate endDate,
            @jakarta.ws.rs.QueryParam("user_id") Integer userId);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getPipelines",
            method = "GET",
            path = "/v1/pipelines")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getPipelines",
            method = "GET",
            path = "/v1/pipelines")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPipelines")
    @jakarta.ws.rs.Path("/pipelines")
    public GetPipelinesResponse getPipelines();

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getPipelines",
            method = "GET",
            path = "/v1/pipelines")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getPipelines",
            method = "GET",
            path = "/v1/pipelines")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPipelines")
    @jakarta.ws.rs.Path("/pipelines")
    public String getPipelinesAsJson();

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updatePipeline",
            method = "PUT",
            path = "/v1/pipelines/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updatePipeline",
            method = "PUT",
            path = "/v1/pipelines/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updatePipeline")
    @jakarta.ws.rs.Path("/pipelines/{id}")
    public UpdatePipelineResponse updatePipeline(
            @jakarta.ws.rs.PathParam("id") Integer id, PipelineRequest1 pipelineRequest1);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addProductField",
            method = "POST",
            path = "/v1/productFields")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addProductField",
            method = "POST",
            path = "/v1/productFields")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addProductField")
    @jakarta.ws.rs.Path("/productFields")
    public GetProductFieldResponse addProductField(AddProductFieldRequest addProductFieldRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteProductField",
            method = "DELETE",
            path = "/v1/productFields/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteProductField",
            method = "DELETE",
            path = "/v1/productFields/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteProductField")
    @jakarta.ws.rs.Path("/productFields/{id}")
    public DeleteProductFieldResponse deleteProductField(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteProductFields",
            method = "DELETE",
            path = "/v1/productFields")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteProductFields",
            method = "DELETE",
            path = "/v1/productFields")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteProductFields")
    @jakarta.ws.rs.Path("/productFields")
    public DeleteProductFieldsResponse deleteProductFields(
            @jakarta.ws.rs.QueryParam("ids") String ids);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getProductField",
            method = "GET",
            path = "/v1/productFields/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getProductField",
            method = "GET",
            path = "/v1/productFields/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getProductField")
    @jakarta.ws.rs.Path("/productFields/{id}")
    public GetProductFieldResponse getProductField(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getProductFields",
            method = "GET",
            path = "/v1/productFields")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getProductFields",
            method = "GET",
            path = "/v1/productFields")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getProductFields")
    @jakarta.ws.rs.Path("/productFields")
    public GetProductFieldsResponse getProductFields(
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getProductFields",
            method = "GET",
            path = "/v1/productFields")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getProductFields",
            method = "GET",
            path = "/v1/productFields")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getProductFields")
    @jakarta.ws.rs.Path("/productFields")
    public String getProductFieldsAsJson(
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updateProductField",
            method = "PUT",
            path = "/v1/productFields/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updateProductField",
            method = "PUT",
            path = "/v1/productFields/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateProductField")
    @jakarta.ws.rs.Path("/productFields/{id}")
    public GetProductFieldResponse updateProductField(
            @jakarta.ws.rs.PathParam("id") Integer id,
            UpdateProductFieldResponse updateProductFieldResponse);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addProduct",
            method = "POST",
            path = "/v1/products")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addProduct",
            method = "POST",
            path = "/v1/products")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addProduct")
    @jakarta.ws.rs.Path("/products")
    public GetProductResponse addProduct(AddProductRequest addProductRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addProductFollower",
            method = "POST",
            path = "/v1/products/{id}/followers")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addProductFollower",
            method = "POST",
            path = "/v1/products/{id}/followers")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addProductFollower")
    @jakarta.ws.rs.Path("/products/{id}/followers")
    public AddNewFollowerResponse addProductFollower(
            @jakarta.ws.rs.PathParam("id") Integer id,
            AddProductFollowerRequest addProductFollowerRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteProduct",
            method = "DELETE",
            path = "/v1/products/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteProduct",
            method = "DELETE",
            path = "/v1/products/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteProduct")
    @jakarta.ws.rs.Path("/products/{id}")
    public DeleteProductResponse deleteProduct(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteProductFollower",
            method = "DELETE",
            path = "/v1/products/{id}/followers/{follower_id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteProductFollower",
            method = "DELETE",
            path = "/v1/products/{id}/followers/{follower_id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteProductFollower")
    @jakarta.ws.rs.Path("/products/{id}/followers/{follower_id}")
    public DeleteProductFollowerResponse deleteProductFollower(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.PathParam("follower_id") Integer followerId);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getProduct",
            method = "GET",
            path = "/v1/products/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getProduct",
            method = "GET",
            path = "/v1/products/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getProduct")
    @jakarta.ws.rs.Path("/products/{id}")
    public GetProductResponse getProduct(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getProductDeals",
            method = "GET",
            path = "/v1/products/{id}/deals")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getProductDeals",
            method = "GET",
            path = "/v1/products/{id}/deals")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getProductDeals")
    @jakarta.ws.rs.Path("/products/{id}/deals")
    public GetAssociatedDealsResponse getProductDeals(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("status") String status);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getProductFiles",
            method = "GET",
            path = "/v1/products/{id}/files")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getProductFiles",
            method = "GET",
            path = "/v1/products/{id}/files")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getProductFiles")
    @jakarta.ws.rs.Path("/products/{id}/files")
    public GetAssociatedProductFilesResponse getProductFiles(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("sort") String sort);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getProductFollowers",
            method = "GET",
            path = "/v1/products/{id}/followers")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getProductFollowers",
            method = "GET",
            path = "/v1/products/{id}/followers")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getProductFollowers")
    @jakarta.ws.rs.Path("/products/{id}/followers")
    public GetProductFollowersResponse getProductFollowers(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getProductUsers",
            method = "GET",
            path = "/v1/products/{id}/permittedUsers")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getProductUsers",
            method = "GET",
            path = "/v1/products/{id}/permittedUsers")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getProductUsers")
    @jakarta.ws.rs.Path("/products/{id}/permittedUsers")
    public UserIds getProductUsers(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getProducts",
            method = "GET",
            path = "/v1/products")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getProducts",
            method = "GET",
            path = "/v1/products")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getProducts")
    @jakarta.ws.rs.Path("/products")
    public GetProductsResponse1 getProducts(
            @jakarta.ws.rs.QueryParam("user_id") Integer userId,
            @jakarta.ws.rs.QueryParam("filter_id") Integer filterId,
            @jakarta.ws.rs.QueryParam("ids") List<Integer> ids,
            @jakarta.ws.rs.QueryParam("first_char") String firstChar,
            @jakarta.ws.rs.QueryParam("get_summary") Boolean getSummary,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getProducts",
            method = "GET",
            path = "/v1/products")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getProducts",
            method = "GET",
            path = "/v1/products")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getProducts")
    @jakarta.ws.rs.Path("/products")
    public String getProductsAsJson(
            @jakarta.ws.rs.QueryParam("user_id") Integer userId,
            @jakarta.ws.rs.QueryParam("filter_id") Integer filterId,
            @jakarta.ws.rs.QueryParam("ids") List<Integer> ids,
            @jakarta.ws.rs.QueryParam("first_char") String firstChar,
            @jakarta.ws.rs.QueryParam("get_summary") Boolean getSummary,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "searchProducts",
            method = "GET",
            path = "/v1/products/search")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "searchProducts",
            method = "GET",
            path = "/v1/products/search")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("searchProducts")
    @jakarta.ws.rs.Path("/products/search")
    public GetProductSearchResponse searchProducts(
            @jakarta.ws.rs.QueryParam("term") String term,
            @jakarta.ws.rs.QueryParam("fields") String fields,
            @jakarta.ws.rs.QueryParam("exact_match") Boolean exactMatch,
            @jakarta.ws.rs.QueryParam("include_fields") String includeFields,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updateProduct",
            method = "PUT",
            path = "/v1/products/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updateProduct",
            method = "PUT",
            path = "/v1/products/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateProduct")
    @jakarta.ws.rs.Path("/products/{id}")
    public UpdateProductResponse updateProduct(
            @jakarta.ws.rs.PathParam("id") Integer id, UpdateProductRequest updateProductRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addProject",
            method = "POST",
            path = "/v1/projects")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addProject",
            method = "POST",
            path = "/v1/projects")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addProject")
    @jakarta.ws.rs.Path("/projects")
    public AddProjectResponse addProject(AddProjectRequest addProjectRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "archiveProject",
            method = "POST",
            path = "/v1/projects/{id}/archive")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "archiveProject",
            method = "POST",
            path = "/v1/projects/{id}/archive")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("archiveProject")
    @jakarta.ws.rs.Path("/projects/{id}/archive")
    public UpdateProjectResponse archiveProject(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteProject",
            method = "DELETE",
            path = "/v1/projects/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteProject",
            method = "DELETE",
            path = "/v1/projects/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteProject")
    @jakarta.ws.rs.Path("/projects/{id}")
    public DeleteProjectResponse deleteProject(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getProject",
            method = "GET",
            path = "/v1/projects/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getProject",
            method = "GET",
            path = "/v1/projects/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getProject")
    @jakarta.ws.rs.Path("/projects/{id}")
    public GetProjectResponse getProject(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getProjectActivities",
            method = "GET",
            path = "/v1/projects/{id}/activities")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getProjectActivities",
            method = "GET",
            path = "/v1/projects/{id}/activities")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getProjectActivities")
    @jakarta.ws.rs.Path("/projects/{id}/activities")
    public GetActivitiesCollectionResponse getProjectActivities(
            @jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getProjectGroups",
            method = "GET",
            path = "/v1/projects/{id}/groups")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getProjectGroups",
            method = "GET",
            path = "/v1/projects/{id}/groups")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getProjectGroups")
    @jakarta.ws.rs.Path("/projects/{id}/groups")
    public GetProjectGroupsResponse getProjectGroups(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getProjectPlan",
            method = "GET",
            path = "/v1/projects/{id}/plan")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getProjectPlan",
            method = "GET",
            path = "/v1/projects/{id}/plan")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getProjectPlan")
    @jakarta.ws.rs.Path("/projects/{id}/plan")
    public GetProjectPlanResponse getProjectPlan(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getProjectTasks",
            method = "GET",
            path = "/v1/projects/{id}/tasks")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getProjectTasks",
            method = "GET",
            path = "/v1/projects/{id}/tasks")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getProjectTasks")
    @jakarta.ws.rs.Path("/projects/{id}/tasks")
    public GetTasksResponse getProjectTasks(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getProjects",
            method = "GET",
            path = "/v1/projects")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getProjects",
            method = "GET",
            path = "/v1/projects")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getProjects")
    @jakarta.ws.rs.Path("/projects")
    public GetProjectsResponse getProjects(
            @jakarta.ws.rs.QueryParam("cursor") String cursor,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("filter_id") Integer filterId,
            @jakarta.ws.rs.QueryParam("status") String status,
            @jakarta.ws.rs.QueryParam("phase_id") Integer phaseId,
            @jakarta.ws.rs.QueryParam("include_archived") Boolean includeArchived);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getProjects",
            method = "GET",
            path = "/v1/projects")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getProjects",
            method = "GET",
            path = "/v1/projects")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getProjects")
    @jakarta.ws.rs.Path("/projects")
    public String getProjectsAsJson(
            @jakarta.ws.rs.QueryParam("cursor") String cursor,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("filter_id") Integer filterId,
            @jakarta.ws.rs.QueryParam("status") String status,
            @jakarta.ws.rs.QueryParam("phase_id") Integer phaseId,
            @jakarta.ws.rs.QueryParam("include_archived") Boolean includeArchived);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getProjectsBoards",
            method = "GET",
            path = "/v1/projects/boards")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getProjectsBoards",
            method = "GET",
            path = "/v1/projects/boards")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getProjectsBoards")
    @jakarta.ws.rs.Path("/projects/boards")
    public GetProjectBoardsResponse getProjectsBoards();

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getProjectsPhases",
            method = "GET",
            path = "/v1/projects/phases")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getProjectsPhases",
            method = "GET",
            path = "/v1/projects/phases")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getProjectsPhases")
    @jakarta.ws.rs.Path("/projects/phases")
    public GetProjectPhasesResponse getProjectsPhases(
            @jakarta.ws.rs.QueryParam("board_id") Integer boardId);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "putProjectPlanActivity",
            method = "PUT",
            path = "/v1/projects/{id}/plan/activities/{activityId}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "putProjectPlanActivity",
            method = "PUT",
            path = "/v1/projects/{id}/plan/activities/{activityId}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("putProjectPlanActivity")
    @jakarta.ws.rs.Path("/projects/{id}/plan/activities/{activityId}")
    public UpdateActivityPlanItemResponse putProjectPlanActivity(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.PathParam("activityId") Integer activityId,
            ProjectPutPlanItemBodyObject projectPutPlanItemBodyObject);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "putProjectPlanTask",
            method = "PUT",
            path = "/v1/projects/{id}/plan/tasks/{taskId}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "putProjectPlanTask",
            method = "PUT",
            path = "/v1/projects/{id}/plan/tasks/{taskId}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("putProjectPlanTask")
    @jakarta.ws.rs.Path("/projects/{id}/plan/tasks/{taskId}")
    public UpdateTaskPlanItemResponse putProjectPlanTask(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.PathParam("taskId") Integer taskId,
            ProjectPutPlanItemBodyObject projectPutPlanItemBodyObject);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updateProject",
            method = "PUT",
            path = "/v1/projects/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updateProject",
            method = "PUT",
            path = "/v1/projects/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateProject")
    @jakarta.ws.rs.Path("/projects/{id}")
    public UpdateProjectResponse updateProject(
            @jakarta.ws.rs.PathParam("id") Integer id, UpdateProjectRequest updateProjectRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getProjectTemplate",
            method = "GET",
            path = "/v1/projectTemplates/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getProjectTemplate",
            method = "GET",
            path = "/v1/projectTemplates/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getProjectTemplate")
    @jakarta.ws.rs.Path("/projectTemplates/{id}")
    public GetProjectTemplateResponse getProjectTemplate(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getProjectTemplates",
            method = "GET",
            path = "/v1/projectTemplates")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getProjectTemplates",
            method = "GET",
            path = "/v1/projectTemplates")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getProjectTemplates")
    @jakarta.ws.rs.Path("/projectTemplates")
    public GetProjectTemplatesResponse getProjectTemplates(
            @jakarta.ws.rs.QueryParam("cursor") String cursor,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getProjectsBoard",
            method = "GET",
            path = "/v1/projects/boards/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getProjectsBoard",
            method = "GET",
            path = "/v1/projects/boards/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getProjectsBoard")
    @jakarta.ws.rs.Path("/projects/boards/{id}")
    public GetProjectBoardResponse getProjectsBoard(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getProjectsPhase",
            method = "GET",
            path = "/v1/projects/phases/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getProjectsPhase",
            method = "GET",
            path = "/v1/projects/phases/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getProjectsPhase")
    @jakarta.ws.rs.Path("/projects/phases/{id}")
    public GetProjectPhaseResponse getProjectsPhase(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getRecents",
            method = "GET",
            path = "/v1/recents")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getRecents",
            method = "GET",
            path = "/v1/recents")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getRecents")
    @jakarta.ws.rs.Path("/recents")
    public GetRecentsResponse getRecents(
            @jakarta.ws.rs.QueryParam("since_timestamp") String sinceTimestamp,
            @jakarta.ws.rs.QueryParam("items") String items,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addOrUpdateRoleSetting",
            method = "POST",
            path = "/v1/roles/{id}/settings")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addOrUpdateRoleSetting",
            method = "POST",
            path = "/v1/roles/{id}/settings")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addOrUpdateRoleSetting")
    @jakarta.ws.rs.Path("/roles/{id}/settings")
    public UpsertRoleSettingsResponse addOrUpdateRoleSetting(
            @jakarta.ws.rs.PathParam("id") Integer id,
            AddOrUpdateRoleSettingRequest addOrUpdateRoleSettingRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addRole",
            method = "POST",
            path = "/v1/roles")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addRole",
            method = "POST",
            path = "/v1/roles")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addRole")
    @jakarta.ws.rs.Path("/roles")
    public AddRolesResponse addRole(AddRoleRequest addRoleRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addRoleAssignment",
            method = "POST",
            path = "/v1/roles/{id}/assignments")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addRoleAssignment",
            method = "POST",
            path = "/v1/roles/{id}/assignments")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addRoleAssignment")
    @jakarta.ws.rs.Path("/roles/{id}/assignments")
    public AddRoleAssignmentResponse addRoleAssignment(
            @jakarta.ws.rs.PathParam("id") Integer id,
            AddRoleAssignmentRequest addRoleAssignmentRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteRole",
            method = "DELETE",
            path = "/v1/roles/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteRole",
            method = "DELETE",
            path = "/v1/roles/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteRole")
    @jakarta.ws.rs.Path("/roles/{id}")
    public DeleteRoleResponse deleteRole(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteRoleAssignment",
            method = "DELETE",
            path = "/v1/roles/{id}/assignments")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteRoleAssignment",
            method = "DELETE",
            path = "/v1/roles/{id}/assignments")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteRoleAssignment")
    @jakarta.ws.rs.Path("/roles/{id}/assignments")
    public DeleteRoleAssignmentResponse deleteRoleAssignment(
            @jakarta.ws.rs.PathParam("id") Integer id,
            DeleteRoleAssignmentRequest deleteRoleAssignmentRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getRole",
            method = "GET",
            path = "/v1/roles/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getRole",
            method = "GET",
            path = "/v1/roles/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getRole")
    @jakarta.ws.rs.Path("/roles/{id}")
    public GetRoleResponse getRole(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getRoleAssignments",
            method = "GET",
            path = "/v1/roles/{id}/assignments")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getRoleAssignments",
            method = "GET",
            path = "/v1/roles/{id}/assignments")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getRoleAssignments")
    @jakarta.ws.rs.Path("/roles/{id}/assignments")
    public GetRoleAssignmentsResponse getRoleAssignments(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getRolePipelines",
            method = "GET",
            path = "/v1/roles/{id}/pipelines")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getRolePipelines",
            method = "GET",
            path = "/v1/roles/{id}/pipelines")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getRolePipelines")
    @jakarta.ws.rs.Path("/roles/{id}/pipelines")
    public GetRolePipelinesResponse getRolePipelines(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("visible") Boolean visible);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getRoleSettings",
            method = "GET",
            path = "/v1/roles/{id}/settings")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getRoleSettings",
            method = "GET",
            path = "/v1/roles/{id}/settings")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getRoleSettings")
    @jakarta.ws.rs.Path("/roles/{id}/settings")
    public GetRoleSettingsResponse getRoleSettings(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getRoles",
            method = "GET",
            path = "/v1/roles")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getRoles",
            method = "GET",
            path = "/v1/roles")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getRoles")
    @jakarta.ws.rs.Path("/roles")
    public GetRolesResponse getRoles(
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getRoles",
            method = "GET",
            path = "/v1/roles")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getRoles",
            method = "GET",
            path = "/v1/roles")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getRoles")
    @jakarta.ws.rs.Path("/roles")
    public String getRolesAsJson(
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updateRole",
            method = "PUT",
            path = "/v1/roles/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updateRole",
            method = "PUT",
            path = "/v1/roles/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateRole")
    @jakarta.ws.rs.Path("/roles/{id}")
    public UpdateRoleResponse updateRole(
            @jakarta.ws.rs.PathParam("id") Integer id, BaseRoleRequest baseRoleRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updateRolePipelines",
            method = "PUT",
            path = "/v1/roles/{id}/pipelines")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updateRolePipelines",
            method = "PUT",
            path = "/v1/roles/{id}/pipelines")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateRolePipelines")
    @jakarta.ws.rs.Path("/roles/{id}/pipelines")
    public GetRolePipelinesResponse updateRolePipelines(
            @jakarta.ws.rs.PathParam("id") Integer id, PutRolePipelinesBody putRolePipelinesBody);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addStage",
            method = "POST",
            path = "/v1/stages")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addStage",
            method = "POST",
            path = "/v1/stages")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addStage")
    @jakarta.ws.rs.Path("/stages")
    public UpsertStageResponse addStage(AddStageRequest addStageRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteStage",
            method = "DELETE",
            path = "/v1/stages/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteStage",
            method = "DELETE",
            path = "/v1/stages/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteStage")
    @jakarta.ws.rs.Path("/stages/{id}")
    public DeleteStageResponse deleteStage(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteStages",
            method = "DELETE",
            path = "/v1/stages")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteStages",
            method = "DELETE",
            path = "/v1/stages")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteStages")
    @jakarta.ws.rs.Path("/stages")
    public DeleteStagesResponse deleteStages(@jakarta.ws.rs.QueryParam("ids") String ids);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getStage",
            method = "GET",
            path = "/v1/stages/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getStage",
            method = "GET",
            path = "/v1/stages/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getStage")
    @jakarta.ws.rs.Path("/stages/{id}")
    public GetStageResponse getStage(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("everyone") BigDecimal everyone);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getStageDeals",
            method = "GET",
            path = "/v1/stages/{id}/deals")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getStageDeals",
            method = "GET",
            path = "/v1/stages/{id}/deals")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getStageDeals")
    @jakarta.ws.rs.Path("/stages/{id}/deals")
    public GetStageDealsResponse getStageDeals(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("filter_id") Integer filterId,
            @jakarta.ws.rs.QueryParam("user_id") Integer userId,
            @jakarta.ws.rs.QueryParam("everyone") BigDecimal everyone,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getStages",
            method = "GET",
            path = "/v1/stages")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getStages",
            method = "GET",
            path = "/v1/stages")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getStages")
    @jakarta.ws.rs.Path("/stages")
    public GetStagesResponse getStages(
            @jakarta.ws.rs.QueryParam("pipeline_id") Integer pipelineId,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getStages",
            method = "GET",
            path = "/v1/stages")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getStages",
            method = "GET",
            path = "/v1/stages")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getStages")
    @jakarta.ws.rs.Path("/stages")
    public String getStagesAsJson(
            @jakarta.ws.rs.QueryParam("pipeline_id") Integer pipelineId,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updateStage",
            method = "PUT",
            path = "/v1/stages/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updateStage",
            method = "PUT",
            path = "/v1/stages/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateStage")
    @jakarta.ws.rs.Path("/stages/{id}")
    public UpsertStageResponse updateStage(
            @jakarta.ws.rs.PathParam("id") Integer id, UpdateStageRequest updateStageRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addRecurringSubscription",
            method = "POST",
            path = "/v1/subscriptions/recurring")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addRecurringSubscription",
            method = "POST",
            path = "/v1/subscriptions/recurring")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addRecurringSubscription")
    @jakarta.ws.rs.Path("/subscriptions/recurring")
    public GetSubscriptionsIdResponse addRecurringSubscription(
            AddRecurringSubscriptionRequest addRecurringSubscriptionRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addSubscriptionInstallment",
            method = "POST",
            path = "/v1/subscriptions/installment")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addSubscriptionInstallment",
            method = "POST",
            path = "/v1/subscriptions/installment")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addSubscriptionInstallment")
    @jakarta.ws.rs.Path("/subscriptions/installment")
    public GetSubscriptionsIdResponse addSubscriptionInstallment(
            AddSubscriptionInstallmentRequest addSubscriptionInstallmentRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "cancelRecurringSubscription",
            method = "PUT",
            path = "/v1/subscriptions/recurring/{id}/cancel")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "cancelRecurringSubscription",
            method = "PUT",
            path = "/v1/subscriptions/recurring/{id}/cancel")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("cancelRecurringSubscription")
    @jakarta.ws.rs.Path("/subscriptions/recurring/{id}/cancel")
    public GetSubscriptionsIdResponse cancelRecurringSubscription(
            @jakarta.ws.rs.PathParam("id") Integer id,
            CancelRecurringSubscriptionRequest cancelRecurringSubscriptionRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteSubscription",
            method = "DELETE",
            path = "/v1/subscriptions/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteSubscription",
            method = "DELETE",
            path = "/v1/subscriptions/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteSubscription")
    @jakarta.ws.rs.Path("/subscriptions/{id}")
    public GetSubscriptionsIdResponse deleteSubscription(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "findSubscriptionByDeal",
            method = "GET",
            path = "/v1/subscriptions/find/{dealId}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "findSubscriptionByDeal",
            method = "GET",
            path = "/v1/subscriptions/find/{dealId}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("findSubscriptionByDeal")
    @jakarta.ws.rs.Path("/subscriptions/find/{dealId}")
    public GetSubscriptionsIdResponse findSubscriptionByDeal(
            @jakarta.ws.rs.PathParam("dealId") Integer dealId);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getSubscription",
            method = "GET",
            path = "/v1/subscriptions/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getSubscription",
            method = "GET",
            path = "/v1/subscriptions/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getSubscription")
    @jakarta.ws.rs.Path("/subscriptions/{id}")
    public GetSubscriptionsIdResponse getSubscription(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getSubscriptionPayments",
            method = "GET",
            path = "/v1/subscriptions/{id}/payments")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getSubscriptionPayments",
            method = "GET",
            path = "/v1/subscriptions/{id}/payments")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getSubscriptionPayments")
    @jakarta.ws.rs.Path("/subscriptions/{id}/payments")
    public GetPaymentsResponse getSubscriptionPayments(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updateRecurringSubscription",
            method = "PUT",
            path = "/v1/subscriptions/recurring/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updateRecurringSubscription",
            method = "PUT",
            path = "/v1/subscriptions/recurring/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateRecurringSubscription")
    @jakarta.ws.rs.Path("/subscriptions/recurring/{id}")
    public GetSubscriptionsIdResponse updateRecurringSubscription(
            @jakarta.ws.rs.PathParam("id") Integer id,
            UpdateRecurringSubscriptionRequest updateRecurringSubscriptionRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updateSubscriptionInstallment",
            method = "PUT",
            path = "/v1/subscriptions/installment/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updateSubscriptionInstallment",
            method = "PUT",
            path = "/v1/subscriptions/installment/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateSubscriptionInstallment")
    @jakarta.ws.rs.Path("/subscriptions/installment/{id}")
    public GetSubscriptionsIdResponse updateSubscriptionInstallment(
            @jakarta.ws.rs.PathParam("id") Integer id,
            UpdateSubscriptionInstallmentRequest updateSubscriptionInstallmentRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addTask",
            method = "POST",
            path = "/v1/tasks")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addTask",
            method = "POST",
            path = "/v1/tasks")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addTask")
    @jakarta.ws.rs.Path("/tasks")
    public AddTaskResponse addTask(AddTaskRequest addTaskRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteTask",
            method = "DELETE",
            path = "/v1/tasks/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteTask",
            method = "DELETE",
            path = "/v1/tasks/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteTask")
    @jakarta.ws.rs.Path("/tasks/{id}")
    public DeleteTaskResponse deleteTask(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getTask",
            method = "GET",
            path = "/v1/tasks/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getTask",
            method = "GET",
            path = "/v1/tasks/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getTask")
    @jakarta.ws.rs.Path("/tasks/{id}")
    public GetTaskResponse getTask(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getTasks",
            method = "GET",
            path = "/v1/tasks")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getTasks",
            method = "GET",
            path = "/v1/tasks")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getTasks")
    @jakarta.ws.rs.Path("/tasks")
    public GetTasksResponse getTasks(
            @jakarta.ws.rs.QueryParam("cursor") String cursor,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("assignee_id") Integer assigneeId,
            @jakarta.ws.rs.QueryParam("project_id") Integer projectId,
            @jakarta.ws.rs.QueryParam("parent_task_id") Integer parentTaskId,
            @jakarta.ws.rs.QueryParam("done") BigDecimal done);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getTasks",
            method = "GET",
            path = "/v1/tasks")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getTasks",
            method = "GET",
            path = "/v1/tasks")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getTasks")
    @jakarta.ws.rs.Path("/tasks")
    public String getTasksAsJson(
            @jakarta.ws.rs.QueryParam("cursor") String cursor,
            @jakarta.ws.rs.QueryParam("limit") Integer limit,
            @jakarta.ws.rs.QueryParam("assignee_id") Integer assigneeId,
            @jakarta.ws.rs.QueryParam("project_id") Integer projectId,
            @jakarta.ws.rs.QueryParam("parent_task_id") Integer parentTaskId,
            @jakarta.ws.rs.QueryParam("done") BigDecimal done);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updateTask",
            method = "PUT",
            path = "/v1/tasks/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updateTask",
            method = "PUT",
            path = "/v1/tasks/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateTask")
    @jakarta.ws.rs.Path("/tasks/{id}")
    public UpdateTaskResponse updateTask(
            @jakarta.ws.rs.PathParam("id") Integer id, UpdateProjectRequest1 updateProjectRequest1);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getUserConnections",
            method = "GET",
            path = "/v1/userConnections")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getUserConnections",
            method = "GET",
            path = "/v1/userConnections")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getUserConnections")
    @jakarta.ws.rs.Path("/userConnections")
    public GetUserConnectionsResponse getUserConnections();

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addUser",
            method = "POST",
            path = "/v1/users")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addUser",
            method = "POST",
            path = "/v1/users")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addUser")
    @jakarta.ws.rs.Path("/users")
    public GetUserResponse addUser(AddUserRequest addUserRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "findUsersByName",
            method = "GET",
            path = "/v1/users/find")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "findUsersByName",
            method = "GET",
            path = "/v1/users/find")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("findUsersByName")
    @jakarta.ws.rs.Path("/users/find")
    public GetUsersResponse findUsersByName(
            @jakarta.ws.rs.QueryParam("term") String term,
            @jakarta.ws.rs.QueryParam("search_by_email") BigDecimal searchByEmail);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getCurrentUser",
            method = "GET",
            path = "/v1/users/me")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getCurrentUser",
            method = "GET",
            path = "/v1/users/me")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getCurrentUser")
    @jakarta.ws.rs.Path("/users/me")
    public GetCurrentUserResponse getCurrentUser();

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getUser",
            method = "GET",
            path = "/v1/users/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getUser",
            method = "GET",
            path = "/v1/users/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getUser")
    @jakarta.ws.rs.Path("/users/{id}")
    public GetUserResponse getUser(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getUserFollowers",
            method = "GET",
            path = "/v1/users/{id}/followers")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getUserFollowers",
            method = "GET",
            path = "/v1/users/{id}/followers")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getUserFollowers")
    @jakarta.ws.rs.Path("/users/{id}/followers")
    public UserIds getUserFollowers(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getUserPermissions",
            method = "GET",
            path = "/v1/users/{id}/permissions")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getUserPermissions",
            method = "GET",
            path = "/v1/users/{id}/permissions")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getUserPermissions")
    @jakarta.ws.rs.Path("/users/{id}/permissions")
    public GetUserPermissionsResponse getUserPermissions(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getUserRoleAssignments",
            method = "GET",
            path = "/v1/users/{id}/roleAssignments")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getUserRoleAssignments",
            method = "GET",
            path = "/v1/users/{id}/roleAssignments")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getUserRoleAssignments")
    @jakarta.ws.rs.Path("/users/{id}/roleAssignments")
    public GetRoleAssignmentsResponse getUserRoleAssignments(
            @jakarta.ws.rs.PathParam("id") Integer id,
            @jakarta.ws.rs.QueryParam("start") Integer start,
            @jakarta.ws.rs.QueryParam("limit") Integer limit);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getUserRoleSettings",
            method = "GET",
            path = "/v1/users/{id}/roleSettings")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getUserRoleSettings",
            method = "GET",
            path = "/v1/users/{id}/roleSettings")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getUserRoleSettings")
    @jakarta.ws.rs.Path("/users/{id}/roleSettings")
    public GetRoleSettingsResponse getUserRoleSettings(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getUsers",
            method = "GET",
            path = "/v1/users")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getUsers",
            method = "GET",
            path = "/v1/users")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getUsers")
    @jakarta.ws.rs.Path("/users")
    public GetUsersResponse getUsers();

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getUsers",
            method = "GET",
            path = "/v1/users")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getUsers",
            method = "GET",
            path = "/v1/users")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getUsers")
    @jakarta.ws.rs.Path("/users")
    public String getUsersAsJson();

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "updateUser",
            method = "PUT",
            path = "/v1/users/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "updateUser",
            method = "PUT",
            path = "/v1/users/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateUser")
    @jakarta.ws.rs.Path("/users/{id}")
    public GetUserResponse updateUser(
            @jakarta.ws.rs.PathParam("id") Integer id, UpdateUserRequest updateUserRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getUserSettings",
            method = "GET",
            path = "/v1/userSettings")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getUserSettings",
            method = "GET",
            path = "/v1/userSettings")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getUserSettings")
    @jakarta.ws.rs.Path("/userSettings")
    public GetUserSettingsResponse getUserSettings();

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "addWebhook",
            method = "POST",
            path = "/v1/webhooks")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "addWebhook",
            method = "POST",
            path = "/v1/webhooks")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addWebhook")
    @jakarta.ws.rs.Path("/webhooks")
    public GetWebhookResponse addWebhook(AddWebhookRequest addWebhookRequest);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteWebhook",
            method = "DELETE",
            path = "/v1/webhooks/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "deleteWebhook",
            method = "DELETE",
            path = "/v1/webhooks/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteWebhook")
    @jakarta.ws.rs.Path("/webhooks/{id}")
    public BaseResponse deleteWebhook(@jakarta.ws.rs.PathParam("id") Integer id);

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getWebhooks",
            method = "GET",
            path = "/v1/webhooks")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getWebhooks",
            method = "GET",
            path = "/v1/webhooks")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getWebhooks")
    @jakarta.ws.rs.Path("/webhooks")
    public GetWebhooksResponse getWebhooks();

    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "api_key",
            openApiSpecId = "openapi_yaml",
            operationId = "getWebhooks",
            method = "GET",
            path = "/v1/webhooks")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(
            name = "oauth2",
            openApiSpecId = "openapi_yaml",
            operationId = "getWebhooks",
            method = "GET",
            path = "/v1/webhooks")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getWebhooks")
    @jakarta.ws.rs.Path("/webhooks")
    public String getWebhooksAsJson();
}
