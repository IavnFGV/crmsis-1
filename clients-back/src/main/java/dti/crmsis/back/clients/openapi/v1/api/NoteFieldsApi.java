package dti.crmsis.back.clients.openapi.v1.api;

import java.util.List;
import java.util.Map;


import dti.crmsis.back.clients.openapi.v1.model.GetNoteFieldsResponse;
/**
  * Pipedrive API v1
  * <p>No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)</p>
  */
@jakarta.ws.rs.Path("/noteFields")
@io.quarkiverse.openapi.generator.annotations.GeneratedClass(value="openapi.yaml", tag = "NoteFields")
@jakarta.enterprise.context.ApplicationScoped
public interface NoteFieldsApi {

     /**
     * Get all note fields
     *
     * Returns data about all note fields.
     *
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getNoteFields", method="GET", path="/v1/noteFields")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getNoteFields", method="GET", path="/v1/noteFields")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getNoteFields")
    public GetNoteFieldsResponse getNoteFields(
    );

}