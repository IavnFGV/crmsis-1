package dti.crmsis.back.clients.openapi.v1.api;

import java.util.List;
import java.util.Map;


import dti.crmsis.back.clients.openapi.v1.model.AddPersonFollowerRequest;
import dti.crmsis.back.clients.openapi.v1.model.AddPersonFollowerResponse;
import dti.crmsis.back.clients.openapi.v1.model.AddPersonPictureResponse;
import dti.crmsis.back.clients.openapi.v1.model.AddPersonRequest;
import dti.crmsis.back.clients.openapi.v1.model.AddPersonResponse;
import java.math.BigDecimal;
import dti.crmsis.back.clients.openapi.v1.model.DeletePersonResponse;
import dti.crmsis.back.clients.openapi.v1.model.DeletePersonsResponse;
import dti.crmsis.back.clients.openapi.v1.model.FailResponse;
import java.io.File;
import dti.crmsis.back.clients.openapi.v1.model.GetAssociatedActivitiesResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetAssociatedDealsResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetAssociatedFilesResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetAssociatedMailMessagesResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetAssociatedPersonUpdatesResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetChangelogResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetListFollowersResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetPermittedUsersResponse1;
import dti.crmsis.back.clients.openapi.v1.model.GetPersonDetailsResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetPersonProductsResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetPersonSearchResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetPersonsCollection200Response;
import dti.crmsis.back.clients.openapi.v1.model.GetPersonsResponse1;
import dti.crmsis.back.clients.openapi.v1.model.MergePersonsRequest;
import dti.crmsis.back.clients.openapi.v1.model.MergePersonsResponse;
import dti.crmsis.back.clients.openapi.v1.model.UpdatePersonRequest;
import dti.crmsis.back.clients.openapi.v1.model.UpdatePersonResponse;
/**
  * Pipedrive API v1
  * <p>No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)</p>
  */
@jakarta.ws.rs.Path("/persons")
@io.quarkiverse.openapi.generator.annotations.GeneratedClass(value="openapi.yaml", tag = "Persons")
@jakarta.enterprise.context.ApplicationScoped
public interface PersonsApi {

     /**
     * Add a person
     *
     * Adds a new person. Note that you can supply additional custom fields along with the request that are not described here. These custom fields are different for each Pipedrive account and can be recognized by long hashes as keys. To determine which custom fields exists, fetch the personFields and look for `key` values.<br>If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint will also accept and return the `data.marketing_status` field.
     *
     * @param addPersonRequest 
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="addPerson", method="POST", path="/v1/persons")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="addPerson", method="POST", path="/v1/persons")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addPerson")
    public AddPersonResponse addPerson(
        AddPersonRequest addPersonRequest
    );

     /**
     * Add a follower to a person
     *
     * Adds a follower to a person.
     *
     * @param id The ID of the person
     * @param addPersonFollowerRequest 
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="addPersonFollower", method="POST", path="/v1/persons/{id}/followers")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="addPersonFollower", method="POST", path="/v1/persons/{id}/followers")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Path("/{id}/followers")
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addPersonFollower")
    public AddPersonFollowerResponse addPersonFollower(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        AddPersonFollowerRequest addPersonFollowerRequest
    );

     /**
     * Add person picture
     *
     * Adds a picture to a person. If a picture is already set, the old picture will be replaced. Added image (or the cropping parameters supplied with the request) should have an equal width and height and should be at least 128 pixels. GIF, JPG and PNG are accepted. All added images will be resized to 128 and 512 pixel wide squares.
     *
     * @param id The ID of the person
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="addPersonPicture", method="POST", path="/v1/persons/{id}/picture")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="addPersonPicture", method="POST", path="/v1/persons/{id}/picture")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Path("/{id}/picture")
    @jakarta.ws.rs.Consumes({"multipart/form-data"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addPersonPicture")
    public AddPersonPictureResponse addPersonPicture(
        @jakarta.ws.rs.BeanParam AddPersonPictureMultipartForm multipartForm,
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id
        
        
        
        
    );

    public static class AddPersonPictureMultipartForm {
        @jakarta.ws.rs.FormParam("file")
        @org.jboss.resteasy.reactive.PartFilename("fileFile")
        @org.jboss.resteasy.reactive.PartType(jakarta.ws.rs.core.MediaType.APPLICATION_OCTET_STREAM)
        public File _file;
        @jakarta.ws.rs.FormParam("crop_x")
        @org.jboss.resteasy.reactive.PartType(jakarta.ws.rs.core.MediaType.TEXT_PLAIN)
        public Integer cropX;
        @jakarta.ws.rs.FormParam("crop_y")
        @org.jboss.resteasy.reactive.PartType(jakarta.ws.rs.core.MediaType.TEXT_PLAIN)
        public Integer cropY;
        @jakarta.ws.rs.FormParam("crop_width")
        @org.jboss.resteasy.reactive.PartType(jakarta.ws.rs.core.MediaType.TEXT_PLAIN)
        public Integer cropWidth;
        @jakarta.ws.rs.FormParam("crop_height")
        @org.jboss.resteasy.reactive.PartType(jakarta.ws.rs.core.MediaType.TEXT_PLAIN)
        public Integer cropHeight;
    }

     /**
     * Delete a person
     *
     * Marks a person as deleted. After 30 days, the person will be permanently deleted.
     *
     * @param id The ID of the person
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="deletePerson", method="DELETE", path="/v1/persons/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="deletePerson", method="DELETE", path="/v1/persons/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Path("/{id}")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deletePerson")
    public DeletePersonResponse deletePerson(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id
    );

     /**
     * Delete a follower from a person
     *
     * Deletes a follower from a person.
     *
     * @param id The ID of the person
     * @param followerId The ID of the follower
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="deletePersonFollower", method="DELETE", path="/v1/persons/{id}/followers/{follower_id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="deletePersonFollower", method="DELETE", path="/v1/persons/{id}/followers/{follower_id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Path("/{id}/followers/{follower_id}")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deletePersonFollower")
    public DeletePersonResponse deletePersonFollower(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("follower_id") @jakarta.ws.rs.PathParam("follower_id")Integer followerId
    );

     /**
     * Delete person picture
     *
     * Deletes a person’s picture.
     *
     * @param id The ID of the person
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="deletePersonPicture", method="DELETE", path="/v1/persons/{id}/picture")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="deletePersonPicture", method="DELETE", path="/v1/persons/{id}/picture")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Path("/{id}/picture")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deletePersonPicture")
    public DeletePersonResponse deletePersonPicture(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id
    );

     /**
     * Delete multiple persons in bulk
     *
     * Marks multiple persons as deleted. After 30 days, the persons will be permanently deleted.
     *
     * @param ids The comma-separated IDs that will be deleted
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="deletePersons", method="DELETE", path="/v1/persons")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="deletePersons", method="DELETE", path="/v1/persons")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deletePersons")
    public DeletePersonsResponse deletePersons(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("ids") @jakarta.ws.rs.QueryParam("ids") String ids
    );

     /**
     * Get details of a person
     *
     * Returns the details of a person. Note that this also returns some additional fields which are not present when asking for all persons. Also note that custom fields appear as long hashes in the resulting data. These hashes can be mapped against the `key` value of personFields.<br>If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint will also return the `data.marketing_status` field.
     *
     * @param id The ID of the person
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getPerson", method="GET", path="/v1/persons/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getPerson", method="GET", path="/v1/persons/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPerson")
    public GetPersonDetailsResponse getPerson(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id
    );

     /**
     * List activities associated with a person
     *
     * Lists activities associated with a person.
     *
     * @param id The ID of the person
     * @param start Pagination start
     * @param limit Items shown per page
     * @param done Whether the activity is done or not. 0 = Not done, 1 = Done. If omitted, returns both Done and Not done activities.
     * @param exclude A comma-separated string of activity IDs to exclude from result
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getPersonActivities", method="GET", path="/v1/persons/{id}/activities")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getPersonActivities", method="GET", path="/v1/persons/{id}/activities")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}/activities")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersonActivities")
    public GetAssociatedActivitiesResponse getPersonActivities(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("start") @jakarta.ws.rs.QueryParam("start") Integer start, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("limit") @jakarta.ws.rs.QueryParam("limit") Integer limit, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("done") @jakarta.ws.rs.QueryParam("done") BigDecimal done, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("exclude") @jakarta.ws.rs.QueryParam("exclude") String exclude
    );

     /**
     * List updates about person field values
     *
     * Lists updates about field values of a person.
     *
     * @param id The ID of the person
     * @param cursor For pagination, the marker (an opaque string value) representing the first item on the next page
     * @param limit Items shown per page
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getPersonChangelog", method="GET", path="/v1/persons/{id}/changelog")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getPersonChangelog", method="GET", path="/v1/persons/{id}/changelog")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}/changelog")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersonChangelog")
    public GetChangelogResponse getPersonChangelog(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("cursor") @jakarta.ws.rs.QueryParam("cursor") String cursor, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("limit") @jakarta.ws.rs.QueryParam("limit") Integer limit
    );

     /**
     * List deals associated with a person
     *
     * Lists deals associated with a person.
     *
     * @param id The ID of the person
     * @param start Pagination start
     * @param limit Items shown per page
     * @param status Only fetch deals with a specific status. If omitted, all not deleted deals are returned. If set to deleted, deals that have been deleted up to 30 days ago will be included.
     * @param sort The field names and sorting mode separated by a comma (`field_name_1 ASC`, `field_name_2 DESC`). Only first-level field keys are supported (no nested keys).
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getPersonDeals", method="GET", path="/v1/persons/{id}/deals")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getPersonDeals", method="GET", path="/v1/persons/{id}/deals")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}/deals")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersonDeals")
    public GetAssociatedDealsResponse getPersonDeals(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("start") @jakarta.ws.rs.QueryParam("start") Integer start, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("limit") @jakarta.ws.rs.QueryParam("limit") Integer limit, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("status") @jakarta.ws.rs.QueryParam("status") String status, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("sort") @jakarta.ws.rs.QueryParam("sort") String sort
    );

     /**
     * List files attached to a person
     *
     * Lists files associated with a person.
     *
     * @param id The ID of the person
     * @param start Pagination start
     * @param limit Items shown per page. Please note that a maximum value of 100 is allowed.
     * @param sort Supported fields: `id`, `update_time`
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getPersonFiles", method="GET", path="/v1/persons/{id}/files")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getPersonFiles", method="GET", path="/v1/persons/{id}/files")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}/files")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersonFiles")
    public GetAssociatedFilesResponse getPersonFiles(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("start") @jakarta.ws.rs.QueryParam("start") Integer start, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("limit") @jakarta.ws.rs.QueryParam("limit") Integer limit, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("sort") @jakarta.ws.rs.QueryParam("sort") String sort
    );

     /**
     * List followers of a person
     *
     * Lists the followers of a person.
     *
     * @param id The ID of the person
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getPersonFollowers", method="GET", path="/v1/persons/{id}/followers")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getPersonFollowers", method="GET", path="/v1/persons/{id}/followers")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}/followers")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersonFollowers")
    public GetListFollowersResponse getPersonFollowers(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id
    );

     /**
     * List mail messages associated with a person
     *
     * Lists mail messages associated with a person.
     *
     * @param id The ID of the person
     * @param start Pagination start
     * @param limit Items shown per page
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getPersonMailMessages", method="GET", path="/v1/persons/{id}/mailMessages")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getPersonMailMessages", method="GET", path="/v1/persons/{id}/mailMessages")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}/mailMessages")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersonMailMessages")
    public GetAssociatedMailMessagesResponse getPersonMailMessages(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("start") @jakarta.ws.rs.QueryParam("start") Integer start, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("limit") @jakarta.ws.rs.QueryParam("limit") Integer limit
    );

     /**
     * List products associated with a person
     *
     * Lists products associated with a person.
     *
     * @param id The ID of the person
     * @param start Pagination start
     * @param limit Items shown per page
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getPersonProducts", method="GET", path="/v1/persons/{id}/products")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getPersonProducts", method="GET", path="/v1/persons/{id}/products")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}/products")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersonProducts")
    public GetPersonProductsResponse getPersonProducts(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("start") @jakarta.ws.rs.QueryParam("start") Integer start, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("limit") @jakarta.ws.rs.QueryParam("limit") Integer limit
    );

     /**
     * List updates about a person
     *
     * Lists updates about a person.<br>If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint's response will also include updates for the `marketing_status` field.
     *
     * @param id The ID of the person
     * @param start Pagination start
     * @param limit Items shown per page
     * @param allChanges Whether to show custom field updates or not. 1 = Include custom field changes. If omitted returns changes without custom field updates.
     * @param items A comma-separated string for filtering out item specific updates. (Possible values - call, activity, plannedActivity, change, note, deal, file, dealChange, personChange, organizationChange, follower, dealFollower, personFollower, organizationFollower, participant, comment, mailMessage, mailMessageWithAttachment, invoice, document, marketing_campaign_stat, marketing_status_change).
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getPersonUpdates", method="GET", path="/v1/persons/{id}/flow")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getPersonUpdates", method="GET", path="/v1/persons/{id}/flow")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}/flow")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersonUpdates")
    public GetAssociatedPersonUpdatesResponse getPersonUpdates(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("start") @jakarta.ws.rs.QueryParam("start") Integer start, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("limit") @jakarta.ws.rs.QueryParam("limit") Integer limit, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("all_changes") @jakarta.ws.rs.QueryParam("all_changes") String allChanges, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("items") @jakarta.ws.rs.QueryParam("items") String items
    );

     /**
     * List permitted users
     *
     * List users permitted to access a person.
     *
     * @param id The ID of the person
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getPersonUsers", method="GET", path="/v1/persons/{id}/permittedUsers")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getPersonUsers", method="GET", path="/v1/persons/{id}/permittedUsers")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}/permittedUsers")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersonUsers")
    public GetPermittedUsersResponse1 getPersonUsers(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id
    );

     /**
     * Get all persons
     *
     * Returns all persons.
     *
     * @param userId If supplied, only persons owned by the given user will be returned. However, `filter_id` takes precedence over `user_id` when both are supplied.
     * @param filterId The ID of the filter to use
     * @param firstChar If supplied, only persons whose name starts with the specified letter will be returned (case-insensitive)
     * @param start Pagination start
     * @param limit Items shown per page
     * @param sort The field names and sorting mode separated by a comma (`field_name_1 ASC`, `field_name_2 DESC`). Only first-level field keys are supported (no nested keys).
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getPersons", method="GET", path="/v1/persons")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getPersons", method="GET", path="/v1/persons")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersons")
    public GetPersonsResponse1 getPersons(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("user_id") @jakarta.ws.rs.QueryParam("user_id") Integer userId, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("filter_id") @jakarta.ws.rs.QueryParam("filter_id") Integer filterId, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("first_char") @jakarta.ws.rs.QueryParam("first_char") String firstChar, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("start") @jakarta.ws.rs.QueryParam("start") Integer start, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("limit") @jakarta.ws.rs.QueryParam("limit") Integer limit, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("sort") @jakarta.ws.rs.QueryParam("sort") String sort
    );

     /**
     * Get all persons (BETA)
     *
     * Returns all persons. This is a cursor-paginated endpoint that is currently in BETA. For more information, please refer to our documentation on <a href=\"https://pipedrive.readme.io/docs/core-api-concepts-pagination\" target=\"_blank\" rel=\"noopener noreferrer\">pagination</a>. Please note that only global admins (those with global permissions) can access these endpoints. Users with regular permissions will receive a 403 response. Read more about global permissions <a href=\"https://support.pipedrive.com/en/article/global-user-management\" target=\"_blank\" rel=\"noopener noreferrer\">here</a>.
     *
     * @param cursor For pagination, the marker (an opaque string value) representing the first item on the next page
     * @param limit For pagination, the limit of entries to be returned. If not provided, 100 items will be returned. Please note that a maximum value of 500 is allowed.
     * @param since The time boundary that points to the start of the range of data. Datetime in ISO 8601 format. E.g. 2022-11-01 08:55:59. Operates on the `update_time` field.
     * @param until The time boundary that points to the end of the range of data. Datetime in ISO 8601 format. E.g. 2022-11-01 08:55:59. Operates on the `update_time` field.
     * @param ownerId If supplied, only persons owned by the given user will be returned
     * @param firstChar If supplied, only persons whose name starts with the specified letter will be returned (case-insensitive)
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getPersonsCollection", method="GET", path="/v1/persons/collection")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getPersonsCollection", method="GET", path="/v1/persons/collection")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/collection")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPersonsCollection")
    public GetPersonsCollection200Response getPersonsCollection(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("cursor") @jakarta.ws.rs.QueryParam("cursor") String cursor, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("limit") @jakarta.ws.rs.QueryParam("limit") Integer limit, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("since") @jakarta.ws.rs.QueryParam("since") String since, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("until") @jakarta.ws.rs.QueryParam("until") String until, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("owner_id") @jakarta.ws.rs.QueryParam("owner_id") Integer ownerId, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("first_char") @jakarta.ws.rs.QueryParam("first_char") String firstChar
    );

     /**
     * Merge two persons
     *
     * Merges a person with another person. For more information, see the tutorial for <a href=\"https://pipedrive.readme.io/docs/merging-two-persons\" target=\"_blank\" rel=\"noopener noreferrer\">merging two persons</a>.
     *
     * @param id The ID of the person
     * @param mergePersonsRequest 
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="mergePersons", method="PUT", path="/v1/persons/{id}/merge")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="mergePersons", method="PUT", path="/v1/persons/{id}/merge")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Path("/{id}/merge")
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("mergePersons")
    public MergePersonsResponse mergePersons(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        MergePersonsRequest mergePersonsRequest
    );

     /**
     * Search persons
     *
     * Searches all persons by name, email, phone, notes and/or custom fields. This endpoint is a wrapper of <a href=\"https://developers.pipedrive.com/docs/api/v1/ItemSearch#searchItem\">/v1/itemSearch</a> with a narrower OAuth scope. Found persons can be filtered by organization ID.
     *
     * @param term The search term to look for. Minimum 2 characters (or 1 if using `exact_match`). Please note that the search term has to be URL encoded.
     * @param fields A comma-separated string array. The fields to perform the search from. Defaults to all of them. Only the following custom field types are searchable: `address`, `varchar`, `text`, `varchar_auto`, `double`, `monetary` and `phone`. Read more about searching by custom fields <a href=\"https://support.pipedrive.com/en/article/search-finding-what-you-need#searching-by-custom-fields\" target=\"_blank\" rel=\"noopener noreferrer\">here</a>.
     * @param exactMatch When enabled, only full exact matches against the given term are returned. It is <b>not</b> case sensitive.
     * @param organizationId Will filter persons by the provided organization ID. The upper limit of found persons associated with the organization is 2000.
     * @param includeFields Supports including optional fields in the results which are not provided by default
     * @param start Pagination start. Note that the pagination is based on main results and does not include related items when using `search_for_related_items` parameter.
     * @param limit Items shown per page
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="searchPersons", method="GET", path="/v1/persons/search")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="searchPersons", method="GET", path="/v1/persons/search")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/search")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("searchPersons")
    public GetPersonSearchResponse searchPersons(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("term") @jakarta.ws.rs.QueryParam("term") String term, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("fields") @jakarta.ws.rs.QueryParam("fields") String fields, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("exact_match") @jakarta.ws.rs.QueryParam("exact_match") Boolean exactMatch, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("organization_id") @jakarta.ws.rs.QueryParam("organization_id") Integer organizationId, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("include_fields") @jakarta.ws.rs.QueryParam("include_fields") String includeFields, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("start") @jakarta.ws.rs.QueryParam("start") Integer start, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("limit") @jakarta.ws.rs.QueryParam("limit") Integer limit
    );

     /**
     * Update a person
     *
     * Updates the properties of a person. For more information, see the tutorial for <a href=\"https://pipedrive.readme.io/docs/updating-a-person\" target=\"_blank\" rel=\"noopener noreferrer\">updating a person</a>.<br>If a company uses the [Campaigns product](https://pipedrive.readme.io/docs/campaigns-in-pipedrive-api), then this endpoint will also accept and return the `data.marketing_status` field.
     *
     * @param id The ID of the person
     * @param updatePersonRequest 
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="updatePerson", method="PUT", path="/v1/persons/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="updatePerson", method="PUT", path="/v1/persons/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Path("/{id}")
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updatePerson")
    public UpdatePersonResponse updatePerson(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        UpdatePersonRequest updatePersonRequest
    );

}