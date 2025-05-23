package dti.crmsis.back.clients.openapi.v1.api;

import java.util.List;
import java.util.Map;


import dti.crmsis.back.ApiTokenRequestFilter;
import dti.crmsis.back.LoggingFilter;
import dti.crmsis.back.RateLimitFilter;
import dti.crmsis.back.clients.openapi.v1.model.AddPipelineResponse;
import java.math.BigDecimal;
import dti.crmsis.back.clients.openapi.v1.model.DeletePipelineResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetPipelineDealsConversionRatesInResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetPipelineDealsMovementsStatisticsResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetPipelineResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetPipelinesResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetStageDealsResponse;
import java.time.LocalDate;
import dti.crmsis.back.clients.openapi.v1.model.PipelineRequest;
import dti.crmsis.back.clients.openapi.v1.model.PipelineRequest1;
import dti.crmsis.back.clients.openapi.v1.model.UpdatePipelineResponse;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;

/**
  * Pipedrive API v1
  * <p>No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)</p>
  */
@jakarta.ws.rs.Path("/pipelines")
@io.quarkiverse.openapi.generator.annotations.GeneratedClass(value="openapi.yaml", tag = "Pipelines")
@jakarta.enterprise.context.ApplicationScoped
@RegisterProvider(LoggingFilter.class)
@RegisterProvider(RateLimitFilter.class)
//@RegisterProvider(ApiTokenRequestFilter.class)
public interface PipelinesApi {

     /**
     * Add a new pipeline
     *
     * Adds a new pipeline.
     *
     * @param pipelineRequest 
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="addPipeline", method="POST", path="/v1/pipelines")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="addPipeline", method="POST", path="/v1/pipelines")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addPipeline")
    public AddPipelineResponse addPipeline(
        PipelineRequest pipelineRequest
    );

     /**
     * Delete a pipeline
     *
     * Marks a pipeline as deleted.
     *
     * @param id The ID of the pipeline
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="deletePipeline", method="DELETE", path="/v1/pipelines/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="deletePipeline", method="DELETE", path="/v1/pipelines/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Path("/{id}")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deletePipeline")
    public DeletePipelineResponse deletePipeline(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id
    );

     /**
     * Get one pipeline
     *
     * Returns data about a specific pipeline. Also returns the summary of the deals in this pipeline across its stages.
     *
     * @param id The ID of the pipeline
     * @param totalsConvertCurrency The 3-letter currency code of any of the supported currencies. When supplied, `per_stages_converted` is returned in `deals_summary` which contains the currency-converted total amounts in the given currency per each stage. You may also set this parameter to `default_currency` in which case users default currency is used.
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getPipeline", method="GET", path="/v1/pipelines/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getPipeline", method="GET", path="/v1/pipelines/{id}")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPipeline")
    public GetPipelineResponse getPipeline(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("totals_convert_currency") @jakarta.ws.rs.QueryParam("totals_convert_currency") String totalsConvertCurrency
    );

     /**
     * Get deals conversion rates in pipeline
     *
     * Returns all stage-to-stage conversion and pipeline-to-close rates for the given time period.
     *
     * @param id The ID of the pipeline
     * @param startDate The start of the period. Date in format of YYYY-MM-DD.
     * @param endDate The end of the period. Date in format of YYYY-MM-DD.
     * @param userId The ID of the user who's pipeline metrics statistics to fetch. If omitted, the authorized user will be used.
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getPipelineConversionStatistics", method="GET", path="/v1/pipelines/{id}/conversion_statistics")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getPipelineConversionStatistics", method="GET", path="/v1/pipelines/{id}/conversion_statistics")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}/conversion_statistics")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPipelineConversionStatistics")
    public GetPipelineDealsConversionRatesInResponse getPipelineConversionStatistics(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("start_date") @jakarta.ws.rs.QueryParam("start_date") LocalDate startDate, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("end_date") @jakarta.ws.rs.QueryParam("end_date") LocalDate endDate, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("user_id") @jakarta.ws.rs.QueryParam("user_id") Integer userId
    );

     /**
     * Get deals in a pipeline
     *
     * Lists deals in a specific pipeline across all its stages. If no parameters are provided open deals owned by the authorized user will be returned.
     *
     * @param id The ID of the pipeline
     * @param filterId If supplied, only deals matching the given filter will be returned
     * @param userId If supplied, `filter_id` will not be considered and only deals owned by the given user will be returned. If omitted, deals owned by the authorized user will be returned.
     * @param everyone If supplied, `filter_id` and `user_id` will not be considered – instead, deals owned by everyone will be returned
     * @param stageId If supplied, only deals within the given stage will be returned
     * @param start Pagination start
     * @param limit Items shown per page
     * @param getSummary Whether to include a summary of the pipeline in the `additional_data` or not
     * @param totalsConvertCurrency The 3-letter currency code of any of the supported currencies. When supplied, `per_stages_converted` is returned inside `deals_summary` inside `additional_data` which contains the currency-converted total amounts in the given currency per each stage. You may also set this parameter to `default_currency` in which case users default currency is used. Only works when `get_summary` parameter flag is enabled.
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getPipelineDeals", method="GET", path="/v1/pipelines/{id}/deals")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getPipelineDeals", method="GET", path="/v1/pipelines/{id}/deals")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}/deals")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPipelineDeals")
    public GetStageDealsResponse getPipelineDeals(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("filter_id") @jakarta.ws.rs.QueryParam("filter_id") Integer filterId, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("user_id") @jakarta.ws.rs.QueryParam("user_id") Integer userId, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("everyone") @jakarta.ws.rs.QueryParam("everyone") BigDecimal everyone, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("stage_id") @jakarta.ws.rs.QueryParam("stage_id") Integer stageId, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("start") @jakarta.ws.rs.QueryParam("start") Integer start, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("limit") @jakarta.ws.rs.QueryParam("limit") Integer limit, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("get_summary") @jakarta.ws.rs.QueryParam("get_summary") BigDecimal getSummary, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("totals_convert_currency") @jakarta.ws.rs.QueryParam("totals_convert_currency") String totalsConvertCurrency
    );

     /**
     * Get deals movements in pipeline
     *
     * Returns statistics for deals movements for the given time period.
     *
     * @param id The ID of the pipeline
     * @param startDate The start of the period. Date in format of YYYY-MM-DD.
     * @param endDate The end of the period. Date in format of YYYY-MM-DD.
     * @param userId The ID of the user who's pipeline statistics to fetch. If omitted, the authorized user will be used.
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getPipelineMovementStatistics", method="GET", path="/v1/pipelines/{id}/movement_statistics")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getPipelineMovementStatistics", method="GET", path="/v1/pipelines/{id}/movement_statistics")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}/movement_statistics")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPipelineMovementStatistics")
    public GetPipelineDealsMovementsStatisticsResponse getPipelineMovementStatistics(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("start_date") @jakarta.ws.rs.QueryParam("start_date") LocalDate startDate, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("end_date") @jakarta.ws.rs.QueryParam("end_date") LocalDate endDate, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("user_id") @jakarta.ws.rs.QueryParam("user_id") Integer userId
    );

     /**
     * Get all pipelines
     *
     * Returns data about all pipelines.
     *
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getPipelines", method="GET", path="/v1/pipelines")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getPipelines", method="GET", path="/v1/pipelines")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getPipelines")
    public GetPipelinesResponse getPipelines(
    );

     /**
     * Update a pipeline
     *
     * Updates the properties of a pipeline.
     *
     * @param id The ID of the pipeline
     * @param pipelineRequest1 
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="updatePipeline", method="PUT", path="/v1/pipelines/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="updatePipeline", method="PUT", path="/v1/pipelines/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Path("/{id}")
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updatePipeline")
    public UpdatePipelineResponse updatePipeline(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")Integer id, 
        PipelineRequest1 pipelineRequest1
    );

}