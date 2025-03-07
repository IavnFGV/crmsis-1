package dti.crmsis.back.clients.openapi.v1.api;

import java.util.List;
import java.util.Map;


import dti.crmsis.back.clients.openapi.v1.model.GetRecentsResponse;
/**
  * Pipedrive API v1
  * <p>No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)</p>
  */
@jakarta.ws.rs.Path("/recents")
@io.quarkiverse.openapi.generator.annotations.GeneratedClass(value="openapi.yaml", tag = "Recents")
@jakarta.enterprise.context.ApplicationScoped
public interface RecentsApi {

     /**
     * Get recents
     *
     * Returns data about all recent changes occurred after the given timestamp.
     *
     * @param sinceTimestamp The timestamp in UTC. Format: YYYY-MM-DD HH:MM:SS.
     * @param items Multiple selection of item types to include in the query (optional)
     * @param start Pagination start
     * @param limit Items shown per page
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getRecents", method="GET", path="/v1/recents")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getRecents", method="GET", path="/v1/recents")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getRecents")
    public GetRecentsResponse getRecents(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("since_timestamp") @jakarta.ws.rs.QueryParam("since_timestamp") String sinceTimestamp, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("items") @jakarta.ws.rs.QueryParam("items") String items, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("start") @jakarta.ws.rs.QueryParam("start") Integer start, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("limit") @jakarta.ws.rs.QueryParam("limit") Integer limit
    );

}