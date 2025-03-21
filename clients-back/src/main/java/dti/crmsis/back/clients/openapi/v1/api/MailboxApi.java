package dti.crmsis.back.clients.openapi.v1.api;

import java.util.List;
import java.util.Map;


import java.math.BigDecimal;
import dti.crmsis.back.clients.openapi.v1.model.DeleteMailThreadResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetMailMessageResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetMailThreadMessagesResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetMailThreadResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetMailThreadResponse1;
import java.util.UUID;
import dti.crmsis.back.clients.openapi.v1.model.UpdateMailThreadResponse;
/**
  * Pipedrive API v1
  * <p>No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)</p>
  */
@jakarta.ws.rs.Path("/mailbox")
@io.quarkiverse.openapi.generator.annotations.GeneratedClass(value="openapi.yaml", tag = "Mailbox")
@jakarta.enterprise.context.ApplicationScoped
public interface MailboxApi {

     /**
     * Delete mail thread
     *
     * Marks a mail thread as deleted.
     *
     * @param id The ID of the mail thread
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="deleteMailThread", method="DELETE", path="/v1/mailbox/mailThreads/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="deleteMailThread", method="DELETE", path="/v1/mailbox/mailThreads/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Path("/mailThreads/{id}")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteMailThread")
    public DeleteMailThreadResponse deleteMailThread(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id
    );

     /**
     * Get one mail message
     *
     * Returns data about a specific mail message.
     *
     * @param id The ID of the mail message to fetch
     * @param includeBody Whether to include the full message body or not. `0` = Don't include, `1` = Include.
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getMailMessage", method="GET", path="/v1/mailbox/mailMessages/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getMailMessage", method="GET", path="/v1/mailbox/mailMessages/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/mailMessages/{id}")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getMailMessage")
    public GetMailMessageResponse getMailMessage(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("include_body") @jakarta.ws.rs.QueryParam("include_body") BigDecimal includeBody
    );

     /**
     * Get one mail thread
     *
     * Returns a specific mail thread.
     *
     * @param id The ID of the mail thread
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getMailThread", method="GET", path="/v1/mailbox/mailThreads/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getMailThread", method="GET", path="/v1/mailbox/mailThreads/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/mailThreads/{id}")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getMailThread")
    public GetMailThreadResponse1 getMailThread(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id
    );

     /**
     * Get all mail messages of mail thread
     *
     * Returns all the mail messages inside a specified mail thread.
     *
     * @param id The ID of the mail thread
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getMailThreadMessages", method="GET", path="/v1/mailbox/mailThreads/{id}/mailMessages")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getMailThreadMessages", method="GET", path="/v1/mailbox/mailThreads/{id}/mailMessages")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/mailThreads/{id}/mailMessages")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getMailThreadMessages")
    public GetMailThreadMessagesResponse getMailThreadMessages(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id
    );

     /**
     * Get mail threads
     *
     * Returns mail threads in a specified folder ordered by the most recent message within.
     *
     * @param folder The type of folder to fetch
     * @param start Pagination start
     * @param limit Items shown per page
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getMailThreads", method="GET", path="/v1/mailbox/mailThreads")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getMailThreads", method="GET", path="/v1/mailbox/mailThreads")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/mailThreads")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getMailThreads")
    public GetMailThreadResponse getMailThreads(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("folder") @jakarta.ws.rs.QueryParam("folder") String folder, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("start") @jakarta.ws.rs.QueryParam("start") Integer start, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("limit") @jakarta.ws.rs.QueryParam("limit") Integer limit
    );

     /**
     * Update mail thread details
     *
     * Updates the properties of a mail thread.
     *
     * @param id The ID of the mail thread
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="updateMailThreadDetails", method="PUT", path="/v1/mailbox/mailThreads/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="updateMailThreadDetails", method="PUT", path="/v1/mailbox/mailThreads/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Path("/mailThreads/{id}")
    @jakarta.ws.rs.Consumes({"application/x-www-form-urlencoded"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateMailThreadDetails")
    public UpdateMailThreadResponse updateMailThreadDetails(
        @jakarta.ws.rs.BeanParam UpdateMailThreadDetailsMultipartForm multipartForm,
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id
        
        
        
        
    );

    public static class UpdateMailThreadDetailsMultipartForm {
        @jakarta.ws.rs.FormParam("deal_id")
        @org.jboss.resteasy.reactive.PartType(jakarta.ws.rs.core.MediaType.TEXT_PLAIN)
        public Integer dealId;
        @jakarta.ws.rs.FormParam("lead_id")
        @org.jboss.resteasy.reactive.PartType(jakarta.ws.rs.core.MediaType.TEXT_PLAIN)
        public UUID leadId;
        @jakarta.ws.rs.FormParam("shared_flag")
        @org.jboss.resteasy.reactive.PartType(jakarta.ws.rs.core.MediaType.TEXT_PLAIN)
        public BigDecimal sharedFlag;
        @jakarta.ws.rs.FormParam("read_flag")
        @org.jboss.resteasy.reactive.PartType(jakarta.ws.rs.core.MediaType.TEXT_PLAIN)
        public BigDecimal readFlag;
        @jakarta.ws.rs.FormParam("archived_flag")
        @org.jboss.resteasy.reactive.PartType(jakarta.ws.rs.core.MediaType.TEXT_PLAIN)
        public BigDecimal archivedFlag;
    }

}