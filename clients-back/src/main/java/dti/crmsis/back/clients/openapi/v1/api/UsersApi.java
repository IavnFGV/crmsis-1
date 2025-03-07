package dti.crmsis.back.clients.openapi.v1.api;

import java.util.List;
import java.util.Map;


import dti.crmsis.back.clients.openapi.v1.model.AddUserRequest;
import java.math.BigDecimal;
import dti.crmsis.back.clients.openapi.v1.model.FailResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetCurrentUserResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetRoleAssignmentsResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetRoleSettingsResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetUserPermissionsResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetUserResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetUsersResponse;
import dti.crmsis.back.clients.openapi.v1.model.UnathorizedResponse;
import dti.crmsis.back.clients.openapi.v1.model.UpdateUserRequest;
import dti.crmsis.back.clients.openapi.v1.model.UserIds;
/**
  * Pipedrive API v1
  * <p>No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)</p>
  */
@jakarta.ws.rs.Path("/users")
@io.quarkiverse.openapi.generator.annotations.GeneratedClass(value="openapi.yaml", tag = "Users")
@jakarta.enterprise.context.ApplicationScoped
public interface UsersApi {

     /**
     * Add a new user
     *
     * Adds a new user to the company, returns the ID upon success.
     *
     * @param addUserRequest 
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="addUser", method="POST", path="/v1/users")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="addUser", method="POST", path="/v1/users")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addUser")
    public GetUserResponse addUser(
        AddUserRequest addUserRequest
    );

     /**
     * Find users by name
     *
     * Finds users by their name.
     *
     * @param term The search term to look for
     * @param searchByEmail When enabled, the term will only be matched against email addresses of users. Default: `false`.
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="findUsersByName", method="GET", path="/v1/users/find")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="findUsersByName", method="GET", path="/v1/users/find")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/find")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("findUsersByName")
    public GetUsersResponse findUsersByName(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("term") @jakarta.ws.rs.QueryParam("term") String term, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("search_by_email") @jakarta.ws.rs.QueryParam("search_by_email") BigDecimal searchByEmail
    );

     /**
     * Get current user data
     *
     * Returns data about an authorized user within the company with bound company data: company ID, company name, and domain. Note that the `locale` property means 'Date/number format' in the Pipedrive account settings, not the chosen language.
     *
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getCurrentUser", method="GET", path="/v1/users/me")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getCurrentUser", method="GET", path="/v1/users/me")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/me")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getCurrentUser")
    public GetCurrentUserResponse getCurrentUser(
    );

     /**
     * Get one user
     *
     * Returns data about a specific user within the company.
     *
     * @param id The ID of the user
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getUser", method="GET", path="/v1/users/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getUser", method="GET", path="/v1/users/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getUser")
    public GetUserResponse getUser(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id
    );

     /**
     * List followers of a user
     *
     * Lists the followers of a specific user.
     *
     * @param id The ID of the user
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getUserFollowers", method="GET", path="/v1/users/{id}/followers")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getUserFollowers", method="GET", path="/v1/users/{id}/followers")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}/followers")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getUserFollowers")
    public UserIds getUserFollowers(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id
    );

     /**
     * List user permissions
     *
     * Lists aggregated permissions over all assigned permission sets for a user.
     *
     * @param id The ID of the user
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getUserPermissions", method="GET", path="/v1/users/{id}/permissions")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getUserPermissions", method="GET", path="/v1/users/{id}/permissions")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}/permissions")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getUserPermissions")
    public GetUserPermissionsResponse getUserPermissions(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id
    );

     /**
     * List role assignments
     *
     * Lists role assignments for a user.
     *
     * @param id The ID of the user
     * @param start Pagination start
     * @param limit Items shown per page
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getUserRoleAssignments", method="GET", path="/v1/users/{id}/roleAssignments")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getUserRoleAssignments", method="GET", path="/v1/users/{id}/roleAssignments")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}/roleAssignments")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getUserRoleAssignments")
    public GetRoleAssignmentsResponse getUserRoleAssignments(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("start") @jakarta.ws.rs.QueryParam("start") Integer start, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("limit") @jakarta.ws.rs.QueryParam("limit") Integer limit
    );

     /**
     * List user role settings
     *
     * Lists the settings of user's assigned role.
     *
     * @param id The ID of the user
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getUserRoleSettings", method="GET", path="/v1/users/{id}/roleSettings")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getUserRoleSettings", method="GET", path="/v1/users/{id}/roleSettings")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}/roleSettings")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getUserRoleSettings")
    public GetRoleSettingsResponse getUserRoleSettings(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id
    );

     /**
     * Get all users
     *
     * Returns data about all users within the company.
     *
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getUsers", method="GET", path="/v1/users")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getUsers", method="GET", path="/v1/users")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getUsers")
    public GetUsersResponse getUsers(
    );

     /**
     * Update user details
     *
     * Updates the properties of a user. Currently, only `active_flag` can be updated.
     *
     * @param id The ID of the user
     * @param updateUserRequest 
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="updateUser", method="PUT", path="/v1/users/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="updateUser", method="PUT", path="/v1/users/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Path("/{id}")
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateUser")
    public GetUserResponse updateUser(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        UpdateUserRequest updateUserRequest
    );

}