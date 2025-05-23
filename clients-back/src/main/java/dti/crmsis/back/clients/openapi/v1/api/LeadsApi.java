package dti.crmsis.back.clients.openapi.v1.api;

import java.util.List;
import java.util.Map;


import dti.crmsis.back.clients.openapi.v1.model.AddLeadRequest;
import dti.crmsis.back.clients.openapi.v1.model.GetLeadIdResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetLeadResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetLeadSearchResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetLeadsResponse;
import dti.crmsis.back.clients.openapi.v1.model.LeadNotFoundResponse;
import java.util.UUID;
import dti.crmsis.back.clients.openapi.v1.model.UpdateLeadRequest;
import dti.crmsis.back.clients.openapi.v1.model.UserIds;
/**
  * Pipedrive API v1
  * <p>No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)</p>
  */
@jakarta.ws.rs.Path("/leads")
@io.quarkiverse.openapi.generator.annotations.GeneratedClass(value="openapi.yaml", tag = "Leads")
@jakarta.enterprise.context.ApplicationScoped
public interface LeadsApi {

     /**
     * Add a lead
     *
     * Creates a lead. A lead always has to be linked to a person or an organization or both. All leads created through the Pipedrive API will have a lead source and origin set to `API`. Here's the tutorial for <a href=\"https://pipedrive.readme.io/docs/adding-a-lead\" target=\"_blank\" rel=\"noopener noreferrer\">adding a lead</a>. If a lead contains custom fields, the fields' values will be included in the response in the same format as with the `Deals` endpoints. If a custom field's value hasn't been set for the lead, it won't appear in the response. Please note that leads do not have a separate set of custom fields, instead they inherit the custom fields' structure from deals. See an example given in the <a href=\"https://pipedrive.readme.io/docs/updating-custom-field-value\" target=\"_blank\" rel=\"noopener noreferrer\">updating custom fields' values tutorial</a>.
     *
     * @param addLeadRequest 
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="addLead", method="POST", path="/v1/leads")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="addLead", method="POST", path="/v1/leads")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addLead")
    public GetLeadResponse addLead(
        AddLeadRequest addLeadRequest
    );

     /**
     * Delete a lead
     *
     * Deletes a specific lead.
     *
     * @param id The ID of the lead
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="deleteLead", method="DELETE", path="/v1/leads/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="deleteLead", method="DELETE", path="/v1/leads/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Path("/{id}")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteLead")
    public GetLeadIdResponse deleteLead(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")UUID id
    );

     /**
     * Get one lead
     *
     * Returns details of a specific lead. If a lead contains custom fields, the fields' values will be included in the response in the same format as with the `Deals` endpoints. If a custom field's value hasn't been set for the lead, it won't appear in the response. Please note that leads do not have a separate set of custom fields, instead they inherit the custom fields’ structure from deals.
     *
     * @param id The ID of the lead
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getLead", method="GET", path="/v1/leads/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getLead", method="GET", path="/v1/leads/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getLead")
    public GetLeadResponse getLead(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")UUID id
    );

     /**
     * List permitted users
     *
     * Lists the users permitted to access a lead.
     *
     * @param id The ID of the lead
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getLeadUsers", method="GET", path="/v1/leads/{id}/permittedUsers")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getLeadUsers", method="GET", path="/v1/leads/{id}/permittedUsers")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}/permittedUsers")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getLeadUsers")
    public UserIds getLeadUsers(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")String id
    );

     /**
     * Get all leads
     *
     * Returns multiple leads. Leads are sorted by the time they were created, from oldest to newest. Pagination can be controlled using `limit` and `start` query parameters. If a lead contains custom fields, the fields' values will be included in the response in the same format as with the `Deals` endpoints. If a custom field's value hasn't been set for the lead, it won't appear in the response. Please note that leads do not have a separate set of custom fields, instead they inherit the custom fields' structure from deals. 
     *
     * @param limit For pagination, the limit of entries to be returned. If not provided, 100 items will be returned.
     * @param start For pagination, the position that represents the first result for the page
     * @param archivedStatus Filtering based on the archived status of a lead. If not provided, `All` is used.
     * @param ownerId If supplied, only leads matching the given user will be returned. However, `filter_id` takes precedence over `owner_id` when supplied.
     * @param personId If supplied, only leads matching the given person will be returned. However, `filter_id` takes precedence over `person_id` when supplied.
     * @param organizationId If supplied, only leads matching the given organization will be returned. However, `filter_id` takes precedence over `organization_id` when supplied.
     * @param filterId The ID of the filter to use
     * @param sort The field names and sorting mode separated by a comma (`field_name_1 ASC`, `field_name_2 DESC`). Only first-level field keys are supported (no nested keys).
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getLeads", method="GET", path="/v1/leads")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getLeads", method="GET", path="/v1/leads")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getLeads")
    public GetLeadsResponse getLeads(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("limit") @jakarta.ws.rs.QueryParam("limit") Integer limit, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("start") @jakarta.ws.rs.QueryParam("start") Integer start, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("archived_status") @jakarta.ws.rs.QueryParam("archived_status") String archivedStatus, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("owner_id") @jakarta.ws.rs.QueryParam("owner_id") Integer ownerId, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("person_id") @jakarta.ws.rs.QueryParam("person_id") Integer personId, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("organization_id") @jakarta.ws.rs.QueryParam("organization_id") Integer organizationId, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("filter_id") @jakarta.ws.rs.QueryParam("filter_id") Integer filterId, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("sort") @jakarta.ws.rs.QueryParam("sort") String sort
    );

     /**
     * Search leads
     *
     * Searches all leads by title, notes and/or custom fields. This endpoint is a wrapper of <a href=\"https://developers.pipedrive.com/docs/api/v1/ItemSearch#searchItem\">/v1/itemSearch</a> with a narrower OAuth scope. Found leads can be filtered by the person ID and the organization ID.
     *
     * @param term The search term to look for. Minimum 2 characters (or 1 if using `exact_match`). Please note that the search term has to be URL encoded.
     * @param fields A comma-separated string array. The fields to perform the search from. Defaults to all of them.
     * @param exactMatch When enabled, only full exact matches against the given term are returned. It is <b>not</b> case sensitive.
     * @param personId Will filter leads by the provided person ID. The upper limit of found leads associated with the person is 2000.
     * @param organizationId Will filter leads by the provided organization ID. The upper limit of found leads associated with the organization is 2000.
     * @param includeFields Supports including optional fields in the results which are not provided by default
     * @param start Pagination start. Note that the pagination is based on main results and does not include related items when using `search_for_related_items` parameter.
     * @param limit Items shown per page
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="searchLeads", method="GET", path="/v1/leads/search")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="searchLeads", method="GET", path="/v1/leads/search")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/search")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("searchLeads")
    public GetLeadSearchResponse searchLeads(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("term") @jakarta.ws.rs.QueryParam("term") String term, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("fields") @jakarta.ws.rs.QueryParam("fields") String fields, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("exact_match") @jakarta.ws.rs.QueryParam("exact_match") Boolean exactMatch, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("person_id") @jakarta.ws.rs.QueryParam("person_id") Integer personId, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("organization_id") @jakarta.ws.rs.QueryParam("organization_id") Integer organizationId, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("include_fields") @jakarta.ws.rs.QueryParam("include_fields") String includeFields, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("start") @jakarta.ws.rs.QueryParam("start") Integer start, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("limit") @jakarta.ws.rs.QueryParam("limit") Integer limit
    );

     /**
     * Update a lead
     *
     * Updates one or more properties of a lead. Only properties included in the request will be updated. Send `null` to unset a property (applicable for example for `value`, `person_id` or `organization_id`). If a lead contains custom fields, the fields' values will be included in the response in the same format as with the `Deals` endpoints. If a custom field's value hasn't been set for the lead, it won't appear in the response. Please note that leads do not have a separate set of custom fields, instead they inherit the custom fields’ structure from deals. See an example given in the <a href=\"https://pipedrive.readme.io/docs/updating-custom-field-value\" target=\"_blank\" rel=\"noopener noreferrer\">updating custom fields’ values tutorial</a>.
     *
     * @param id The ID of the lead
     * @param updateLeadRequest 
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="updateLead", method="PATCH", path="/v1/leads/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="updateLead", method="PATCH", path="/v1/leads/{id}")
    @jakarta.ws.rs.PATCH
    @jakarta.ws.rs.Path("/{id}")
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateLead")
    public GetLeadResponse updateLead(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")UUID id, 
        UpdateLeadRequest updateLeadRequest
    );

}