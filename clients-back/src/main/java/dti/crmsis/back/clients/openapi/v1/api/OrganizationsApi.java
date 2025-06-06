package dti.crmsis.back.clients.openapi.v1.api;

import java.util.List;
import java.util.Map;


import dti.crmsis.back.clients.openapi.v1.model.AddOrganizationFollowerRequest;
import dti.crmsis.back.clients.openapi.v1.model.AddOrganizationFollowerResponse;
import dti.crmsis.back.clients.openapi.v1.model.AddOrganizationRequest;
import dti.crmsis.back.clients.openapi.v1.model.AddOrganizationResponse;
import java.math.BigDecimal;
import dti.crmsis.back.clients.openapi.v1.model.DeleteOrganizationFollowerResponse;
import dti.crmsis.back.clients.openapi.v1.model.DeleteOrganizationResponse;
import dti.crmsis.back.clients.openapi.v1.model.DeleteOrganizationsResponse;
import dti.crmsis.back.clients.openapi.v1.model.FailResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetAssociatedActivitiesResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetAssociatedDealsResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetAssociatedFilesResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetAssociatedFollowersResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetAssociatedMailMessagesResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetAssociatedOrganizationUpdatesResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetChangelogResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetOrganizationResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetOrganizationSearchResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetOrganizationsCollection200Response;
import dti.crmsis.back.clients.openapi.v1.model.GetOrganizationsResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetPermittedUsersResponse1;
import dti.crmsis.back.clients.openapi.v1.model.GetPersonsResponse;
import dti.crmsis.back.clients.openapi.v1.model.MergeOrganizationsRequest;
import dti.crmsis.back.clients.openapi.v1.model.MergeOrganizationsResponse;
import dti.crmsis.back.clients.openapi.v1.model.UpdateOrganizationRequest;
import dti.crmsis.back.clients.openapi.v1.model.UpdateOrganizationResponse;
/**
  * Pipedrive API v1
  * <p>No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)</p>
  */
@jakarta.ws.rs.Path("/organizations")
@io.quarkiverse.openapi.generator.annotations.GeneratedClass(value="openapi.yaml", tag = "Organizations")
@jakarta.enterprise.context.ApplicationScoped
public interface OrganizationsApi {

     /**
     * Add an organization
     *
     * Adds a new organization. Note that you can supply additional custom fields along with the request that are not described here. These custom fields are different for each Pipedrive account and can be recognized by long hashes as keys. To determine which custom fields exists, fetch the organizationFields and look for `key` values. For more information, see the tutorial for <a href=\"https://pipedrive.readme.io/docs/adding-an-organization\" target=\"_blank\" rel=\"noopener noreferrer\">adding an organization</a>.
     *
     * @param addOrganizationRequest 
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="addOrganization", method="POST", path="/v1/organizations")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="addOrganization", method="POST", path="/v1/organizations")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addOrganization")
    public AddOrganizationResponse addOrganization(
        AddOrganizationRequest addOrganizationRequest
    );

     /**
     * Add a follower to an organization
     *
     * Adds a follower to an organization.
     *
     * @param id The ID of the organization
     * @param addOrganizationFollowerRequest 
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="addOrganizationFollower", method="POST", path="/v1/organizations/{id}/followers")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="addOrganizationFollower", method="POST", path="/v1/organizations/{id}/followers")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Path("/{id}/followers")
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addOrganizationFollower")
    public AddOrganizationFollowerResponse addOrganizationFollower(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        AddOrganizationFollowerRequest addOrganizationFollowerRequest
    );

     /**
     * Delete an organization
     *
     * Marks an organization as deleted. After 30 days, the organization will be permanently deleted.
     *
     * @param id The ID of the organization
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="deleteOrganization", method="DELETE", path="/v1/organizations/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="deleteOrganization", method="DELETE", path="/v1/organizations/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Path("/{id}")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteOrganization")
    public DeleteOrganizationResponse deleteOrganization(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id
    );

     /**
     * Delete a follower from an organization
     *
     * Deletes a follower from an organization. You can retrieve the `follower_id` from the <a href=\"https://developers.pipedrive.com/docs/api/v1/Organizations#getOrganizationFollowers\">List followers of an organization</a> endpoint.
     *
     * @param id The ID of the organization
     * @param followerId The ID of the follower
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="deleteOrganizationFollower", method="DELETE", path="/v1/organizations/{id}/followers/{follower_id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="deleteOrganizationFollower", method="DELETE", path="/v1/organizations/{id}/followers/{follower_id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Path("/{id}/followers/{follower_id}")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteOrganizationFollower")
    public DeleteOrganizationFollowerResponse deleteOrganizationFollower(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("follower_id") @jakarta.ws.rs.PathParam("follower_id")Integer followerId
    );

     /**
     * Delete multiple organizations in bulk
     *
     * Marks multiple organizations as deleted. After 30 days, the organizations will be permanently deleted.
     *
     * @param ids The comma-separated IDs that will be deleted
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="deleteOrganizations", method="DELETE", path="/v1/organizations")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="deleteOrganizations", method="DELETE", path="/v1/organizations")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteOrganizations")
    public DeleteOrganizationsResponse deleteOrganizations(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("ids") @jakarta.ws.rs.QueryParam("ids") String ids
    );

     /**
     * Get details of an organization
     *
     * Returns the details of an organization. Note that this also returns some additional fields which are not present when asking for all organizations. Also note that custom fields appear as long hashes in the resulting data. These hashes can be mapped against the `key` value of organizationFields.
     *
     * @param id The ID of the organization
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getOrganization", method="GET", path="/v1/organizations/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getOrganization", method="GET", path="/v1/organizations/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganization")
    public GetOrganizationResponse getOrganization(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id
    );

     /**
     * List activities associated with an organization
     *
     * Lists activities associated with an organization.
     *
     * @param id The ID of the organization
     * @param start Pagination start
     * @param limit Items shown per page
     * @param done Whether the activity is done or not. 0 = Not done, 1 = Done. If omitted returns both Done and Not done activities.
     * @param exclude A comma-separated string of activity IDs to exclude from result
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getOrganizationActivities", method="GET", path="/v1/organizations/{id}/activities")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getOrganizationActivities", method="GET", path="/v1/organizations/{id}/activities")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}/activities")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationActivities")
    public GetAssociatedActivitiesResponse getOrganizationActivities(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("start") @jakarta.ws.rs.QueryParam("start") Integer start, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("limit") @jakarta.ws.rs.QueryParam("limit") Integer limit, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("done") @jakarta.ws.rs.QueryParam("done") BigDecimal done, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("exclude") @jakarta.ws.rs.QueryParam("exclude") String exclude
    );

     /**
     * List updates about organization field values
     *
     * Lists updates about field values of an organization.
     *
     * @param id The ID of the organization
     * @param cursor For pagination, the marker (an opaque string value) representing the first item on the next page
     * @param limit Items shown per page
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getOrganizationChangelog", method="GET", path="/v1/organizations/{id}/changelog")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getOrganizationChangelog", method="GET", path="/v1/organizations/{id}/changelog")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}/changelog")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationChangelog")
    public GetChangelogResponse getOrganizationChangelog(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("cursor") @jakarta.ws.rs.QueryParam("cursor") String cursor, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("limit") @jakarta.ws.rs.QueryParam("limit") Integer limit
    );

     /**
     * List deals associated with an organization
     *
     * Lists deals associated with an organization.
     *
     * @param id The ID of the organization
     * @param start Pagination start
     * @param limit Items shown per page
     * @param status Only fetch deals with a specific status. If omitted, all not deleted deals are returned. If set to deleted, deals that have been deleted up to 30 days ago will be included.
     * @param sort The field names and sorting mode separated by a comma (`field_name_1 ASC`, `field_name_2 DESC`). Only first-level field keys are supported (no nested keys).
     * @param onlyPrimaryAssociation If set, only deals that are directly associated to the organization are fetched. If not set (default), all deals are fetched that are either directly or indirectly related to the organization. Indirect relations include relations through custom, organization-type fields and through persons of the given organization.
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getOrganizationDeals", method="GET", path="/v1/organizations/{id}/deals")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getOrganizationDeals", method="GET", path="/v1/organizations/{id}/deals")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}/deals")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationDeals")
    public GetAssociatedDealsResponse getOrganizationDeals(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("start") @jakarta.ws.rs.QueryParam("start") Integer start, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("limit") @jakarta.ws.rs.QueryParam("limit") Integer limit, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("status") @jakarta.ws.rs.QueryParam("status") String status, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("sort") @jakarta.ws.rs.QueryParam("sort") String sort, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("only_primary_association") @jakarta.ws.rs.QueryParam("only_primary_association") BigDecimal onlyPrimaryAssociation
    );

     /**
     * List files attached to an organization
     *
     * Lists files associated with an organization.
     *
     * @param id The ID of the organization
     * @param start Pagination start
     * @param limit Items shown per page. Please note that a maximum value of 100 is allowed.
     * @param sort Supported fields: `id`, `update_time`
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getOrganizationFiles", method="GET", path="/v1/organizations/{id}/files")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getOrganizationFiles", method="GET", path="/v1/organizations/{id}/files")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}/files")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationFiles")
    public GetAssociatedFilesResponse getOrganizationFiles(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("start") @jakarta.ws.rs.QueryParam("start") Integer start, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("limit") @jakarta.ws.rs.QueryParam("limit") Integer limit, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("sort") @jakarta.ws.rs.QueryParam("sort") String sort
    );

     /**
     * List followers of an organization
     *
     * Lists the followers of an organization.
     *
     * @param id The ID of the organization
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getOrganizationFollowers", method="GET", path="/v1/organizations/{id}/followers")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getOrganizationFollowers", method="GET", path="/v1/organizations/{id}/followers")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}/followers")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationFollowers")
    public GetAssociatedFollowersResponse getOrganizationFollowers(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id
    );

     /**
     * List mail messages associated with an organization
     *
     * Lists mail messages associated with an organization.
     *
     * @param id The ID of the organization
     * @param start Pagination start
     * @param limit Items shown per page
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getOrganizationMailMessages", method="GET", path="/v1/organizations/{id}/mailMessages")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getOrganizationMailMessages", method="GET", path="/v1/organizations/{id}/mailMessages")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}/mailMessages")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationMailMessages")
    public GetAssociatedMailMessagesResponse getOrganizationMailMessages(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("start") @jakarta.ws.rs.QueryParam("start") Integer start, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("limit") @jakarta.ws.rs.QueryParam("limit") Integer limit
    );

     /**
     * List persons of an organization
     *
     * Lists persons associated with an organization.<br>If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint will also return the `data.marketing_status` field.
     *
     * @param id The ID of the organization
     * @param start Pagination start
     * @param limit Items shown per page
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getOrganizationPersons", method="GET", path="/v1/organizations/{id}/persons")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getOrganizationPersons", method="GET", path="/v1/organizations/{id}/persons")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}/persons")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationPersons")
    public GetPersonsResponse getOrganizationPersons(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("start") @jakarta.ws.rs.QueryParam("start") Integer start, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("limit") @jakarta.ws.rs.QueryParam("limit") Integer limit
    );

     /**
     * List updates about an organization
     *
     * Lists updates about an organization.
     *
     * @param id The ID of the organization
     * @param start Pagination start
     * @param limit Items shown per page
     * @param allChanges Whether to show custom field updates or not. 1 = Include custom field changes. If omitted, returns changes without custom field updates.
     * @param items A comma-separated string for filtering out item specific updates. (Possible values - activity, plannedActivity, note, file, change, deal, follower, participant, mailMessage, mailMessageWithAttachment, invoice, activityFile, document).
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getOrganizationUpdates", method="GET", path="/v1/organizations/{id}/flow")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getOrganizationUpdates", method="GET", path="/v1/organizations/{id}/flow")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}/flow")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationUpdates")
    public GetAssociatedOrganizationUpdatesResponse getOrganizationUpdates(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("start") @jakarta.ws.rs.QueryParam("start") Integer start, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("limit") @jakarta.ws.rs.QueryParam("limit") Integer limit, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("all_changes") @jakarta.ws.rs.QueryParam("all_changes") String allChanges, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("items") @jakarta.ws.rs.QueryParam("items") String items
    );

     /**
     * List permitted users
     *
     * List users permitted to access an organization.
     *
     * @param id The ID of the organization
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getOrganizationUsers", method="GET", path="/v1/organizations/{id}/permittedUsers")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getOrganizationUsers", method="GET", path="/v1/organizations/{id}/permittedUsers")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}/permittedUsers")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationUsers")
    public GetPermittedUsersResponse1 getOrganizationUsers(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id
    );

     /**
     * Get all organizations
     *
     * Returns all organizations.
     *
     * @param userId If supplied, only organizations owned by the given user will be returned. However, `filter_id` takes precedence over `user_id` when both are supplied.
     * @param filterId The ID of the filter to use
     * @param firstChar If supplied, only organizations whose name starts with the specified letter will be returned (case-insensitive)
     * @param start Pagination start
     * @param limit Items shown per page
     * @param sort The field names and sorting mode separated by a comma (`field_name_1 ASC`, `field_name_2 DESC`). Only first-level field keys are supported (no nested keys).
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getOrganizations", method="GET", path="/v1/organizations")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getOrganizations", method="GET", path="/v1/organizations")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizations")
    public GetOrganizationsResponse getOrganizations(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("user_id") @jakarta.ws.rs.QueryParam("user_id") Integer userId, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("filter_id") @jakarta.ws.rs.QueryParam("filter_id") Integer filterId, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("first_char") @jakarta.ws.rs.QueryParam("first_char") String firstChar, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("start") @jakarta.ws.rs.QueryParam("start") Integer start, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("limit") @jakarta.ws.rs.QueryParam("limit") Integer limit, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("sort") @jakarta.ws.rs.QueryParam("sort") String sort
    );

     /**
     * Get all organizations (BETA)
     *
     * Returns all organizations. This is a cursor-paginated endpoint that is currently in BETA. For more information, please refer to our documentation on <a href=\"https://pipedrive.readme.io/docs/core-api-concepts-pagination\" target=\"_blank\" rel=\"noopener noreferrer\">pagination</a>. Please note that only global admins (those with global permissions) can access these endpoints. Users with regular permissions will receive a 403 response. Read more about global permissions <a href=\"https://support.pipedrive.com/en/article/global-user-management\" target=\"_blank\" rel=\"noopener noreferrer\">here</a>.
     *
     * @param cursor For pagination, the marker (an opaque string value) representing the first item on the next page
     * @param limit For pagination, the limit of entries to be returned. If not provided, 100 items will be returned. Please note that a maximum value of 500 is allowed.
     * @param since The time boundary that points to the start of the range of data. Datetime in ISO 8601 format. E.g. 2022-11-01 08:55:59. Operates on the `update_time` field.
     * @param until The time boundary that points to the end of the range of data. Datetime in ISO 8601 format. E.g. 2022-11-01 08:55:59. Operates on the `update_time` field.
     * @param ownerId If supplied, only organizations owned by the given user will be returned
     * @param firstChar If supplied, only organizations whose name starts with the specified letter will be returned (case-insensitive)
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getOrganizationsCollection", method="GET", path="/v1/organizations/collection")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getOrganizationsCollection", method="GET", path="/v1/organizations/collection")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/collection")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getOrganizationsCollection")
    public GetOrganizationsCollection200Response getOrganizationsCollection(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("cursor") @jakarta.ws.rs.QueryParam("cursor") String cursor, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("limit") @jakarta.ws.rs.QueryParam("limit") Integer limit, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("since") @jakarta.ws.rs.QueryParam("since") String since, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("until") @jakarta.ws.rs.QueryParam("until") String until, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("owner_id") @jakarta.ws.rs.QueryParam("owner_id") Integer ownerId, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("first_char") @jakarta.ws.rs.QueryParam("first_char") String firstChar
    );

     /**
     * Merge two organizations
     *
     * Merges an organization with another organization. For more information, see the tutorial for <a href=\"https://pipedrive.readme.io/docs/merging-two-organizations\" target=\"_blank\" rel=\"noopener noreferrer\">merging two organizations</a>.
     *
     * @param id The ID of the organization
     * @param mergeOrganizationsRequest 
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="mergeOrganizations", method="PUT", path="/v1/organizations/{id}/merge")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="mergeOrganizations", method="PUT", path="/v1/organizations/{id}/merge")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Path("/{id}/merge")
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("mergeOrganizations")
    public MergeOrganizationsResponse mergeOrganizations(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        MergeOrganizationsRequest mergeOrganizationsRequest
    );

     /**
     * Search organizations
     *
     * Searches all organizations by name, address, notes and/or custom fields. This endpoint is a wrapper of <a href=\"https://developers.pipedrive.com/docs/api/v1/ItemSearch#searchItem\">/v1/itemSearch</a> with a narrower OAuth scope.
     *
     * @param term The search term to look for. Minimum 2 characters (or 1 if using `exact_match`). Please note that the search term has to be URL encoded.
     * @param fields A comma-separated string array. The fields to perform the search from. Defaults to all of them. Only the following custom field types are searchable: `address`, `varchar`, `text`, `varchar_auto`, `double`, `monetary` and `phone`. Read more about searching by custom fields <a href=\"https://support.pipedrive.com/en/article/search-finding-what-you-need#searching-by-custom-fields\" target=\"_blank\" rel=\"noopener noreferrer\">here</a>.
     * @param exactMatch When enabled, only full exact matches against the given term are returned. It is <b>not</b> case sensitive.
     * @param start Pagination start. Note that the pagination is based on main results and does not include related items when using `search_for_related_items` parameter.
     * @param limit Items shown per page
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="searchOrganization", method="GET", path="/v1/organizations/search")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="searchOrganization", method="GET", path="/v1/organizations/search")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/search")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("searchOrganization")
    public GetOrganizationSearchResponse searchOrganization(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("term") @jakarta.ws.rs.QueryParam("term") String term, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("fields") @jakarta.ws.rs.QueryParam("fields") String fields, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("exact_match") @jakarta.ws.rs.QueryParam("exact_match") Boolean exactMatch, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("start") @jakarta.ws.rs.QueryParam("start") Integer start, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("limit") @jakarta.ws.rs.QueryParam("limit") Integer limit
    );

     /**
     * Update an organization
     *
     * Updates the properties of an organization.
     *
     * @param id The ID of the organization
     * @param updateOrganizationRequest 
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="updateOrganization", method="PUT", path="/v1/organizations/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="updateOrganization", method="PUT", path="/v1/organizations/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Path("/{id}")
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateOrganization")
    public UpdateOrganizationResponse updateOrganization(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        UpdateOrganizationRequest updateOrganizationRequest
    );

}