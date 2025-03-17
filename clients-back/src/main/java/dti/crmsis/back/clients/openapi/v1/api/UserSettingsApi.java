package dti.crmsis.back.clients.openapi.v1.api;

import java.util.List;
import java.util.Map;


import dti.crmsis.back.clients.openapi.v1.model.GetUserSettingsResponse;
import dti.crmsis.back.clients.openapi.v1.model.UnathorizedResponse;
/**
  * Pipedrive API v1
  * <p>No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)</p>
  */
@jakarta.ws.rs.Path("/userSettings")
@io.quarkiverse.openapi.generator.annotations.GeneratedClass(value="openapi.yaml", tag = "UserSettings")
@jakarta.enterprise.context.ApplicationScoped
public interface UserSettingsApi {

     /**
     * List settings of an authorized user
     *
     * Lists the settings of an authorized user. Example response contains a shortened list of settings.
     *
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getUserSettings", method="GET", path="/v1/userSettings")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getUserSettings", method="GET", path="/v1/userSettings")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getUserSettings")
    public GetUserSettingsResponse getUserSettings(
    );

}