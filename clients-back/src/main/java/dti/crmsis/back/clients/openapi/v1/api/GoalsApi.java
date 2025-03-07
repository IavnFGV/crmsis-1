package dti.crmsis.back.clients.openapi.v1.api;

import java.util.List;
import java.util.Map;


import dti.crmsis.back.clients.openapi.v1.model.AddGoalRequest;
import dti.crmsis.back.clients.openapi.v1.model.BasicGoalRequest;
import java.math.BigDecimal;
import dti.crmsis.back.clients.openapi.v1.model.DeleteGoalResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetGoalResultResponse;
import dti.crmsis.back.clients.openapi.v1.model.GetGoalsResponse;
import java.time.LocalDate;
import dti.crmsis.back.clients.openapi.v1.model.UpsertGoalResponse;
/**
  * Pipedrive API v1
  * <p>No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)</p>
  */
@jakarta.ws.rs.Path("/goals")
@io.quarkiverse.openapi.generator.annotations.GeneratedClass(value="openapi.yaml", tag = "Goals")
@jakarta.enterprise.context.ApplicationScoped
public interface GoalsApi {

     /**
     * Add a new goal
     *
     * Adds a new goal. Along with adding a new goal, a report is created to track the progress of your goal.
     *
     * @param addGoalRequest 
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="addGoal", method="POST", path="/v1/goals")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="addGoal", method="POST", path="/v1/goals")
    @jakarta.ws.rs.POST
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("addGoal")
    public UpsertGoalResponse addGoal(
        AddGoalRequest addGoalRequest
    );

     /**
     * Delete existing goal
     *
     * Marks a goal as deleted.
     *
     * @param id The ID of the goal
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="deleteGoal", method="DELETE", path="/v1/goals/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="deleteGoal", method="DELETE", path="/v1/goals/{id}")
    @jakarta.ws.rs.DELETE
    @jakarta.ws.rs.Path("/{id}")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("deleteGoal")
    public DeleteGoalResponse deleteGoal(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")String id
    );

     /**
     * Get result of a goal
     *
     * Gets the progress of a goal for the specified period.
     *
     * @param id The ID of the goal that the results are looked for
     * @param periodStart The start date of the period for which to find the goal's progress. Format: YYYY-MM-DD. This date must be the same or after the goal duration start date. 
     * @param periodEnd The end date of the period for which to find the goal's progress. Format: YYYY-MM-DD. This date must be the same or before the goal duration end date. 
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getGoalResult", method="GET", path="/v1/goals/{id}/results")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getGoalResult", method="GET", path="/v1/goals/{id}/results")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/{id}/results")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getGoalResult")
    public GetGoalResultResponse getGoalResult(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")String id, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("period.start") @jakarta.ws.rs.QueryParam("period.start") LocalDate periodStart, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("period.end") @jakarta.ws.rs.QueryParam("period.end") LocalDate periodEnd
    );

     /**
     * Find goals
     *
     * Returns data about goals based on criteria. For searching, append `{searchField}={searchValue}` to the URL, where `searchField` can be any one of the lowest-level fields in dot-notation (e.g. `type.params.pipeline_id`; `title`). `searchValue` should be the value you are looking for on that field. Additionally, `is_active=<true|false>` can be provided to search for only active/inactive goals. When providing `period.start`, `period.end` must also be provided and vice versa.
     *
     * @param typeName The type of the goal. If provided, everyone's goals will be returned.
     * @param title The title of the goal
     * @param isActive Whether the goal is active or not
     * @param assigneeId The ID of the user who's goal to fetch. When omitted, only your goals will be returned.
     * @param assigneeType The type of the goal's assignee. If provided, everyone's goals will be returned.
     * @param expectedOutcomeTarget The numeric value of the outcome. If provided, everyone's goals will be returned.
     * @param expectedOutcomeTrackingMetric The tracking metric of the expected outcome of the goal. If provided, everyone's goals will be returned.
     * @param expectedOutcomeCurrencyId The numeric ID of the goal's currency. Only applicable to goals with `expected_outcome.tracking_metric` with value `sum`. If provided, everyone's goals will be returned.
     * @param typeParamsPipelineId An array of pipeline IDs or `null` for all pipelines. If provided, everyone's goals will be returned.
     * @param typeParamsStageId The ID of the stage. Applicable to only `deals_progressed` type of goals. If provided, everyone's goals will be returned.
     * @param typeParamsActivityTypeId An array of IDs or `null` for all activity types. Only applicable for `activities_completed` and/or `activities_added` types of goals. If provided, everyone's goals will be returned.
     * @param periodStart The start date of the period for which to find goals. Date in format of YYYY-MM-DD. When `period.start` is provided, `period.end` must be provided too.
     * @param periodEnd The end date of the period for which to find goals. Date in format of YYYY-MM-DD.
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="getGoals", method="GET", path="/v1/goals/find")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="getGoals", method="GET", path="/v1/goals/find")
    @jakarta.ws.rs.GET
    @jakarta.ws.rs.Path("/find")
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("getGoals")
    public GetGoalsResponse getGoals(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("type.name") @jakarta.ws.rs.QueryParam("type.name") String typeName, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("title") @jakarta.ws.rs.QueryParam("title") String title, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("is_active") @jakarta.ws.rs.QueryParam("is_active") Boolean isActive, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("assignee.id") @jakarta.ws.rs.QueryParam("assignee.id") Integer assigneeId, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("assignee.type") @jakarta.ws.rs.QueryParam("assignee.type") String assigneeType, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("expected_outcome.target") @jakarta.ws.rs.QueryParam("expected_outcome.target") BigDecimal expectedOutcomeTarget, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("expected_outcome.tracking_metric") @jakarta.ws.rs.QueryParam("expected_outcome.tracking_metric") String expectedOutcomeTrackingMetric, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("expected_outcome.currency_id") @jakarta.ws.rs.QueryParam("expected_outcome.currency_id") Integer expectedOutcomeCurrencyId, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("type.params.pipeline_id") @jakarta.ws.rs.QueryParam("type.params.pipeline_id") List<Integer> typeParamsPipelineId, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("type.params.stage_id") @jakarta.ws.rs.QueryParam("type.params.stage_id") Integer typeParamsStageId, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("type.params.activity_type_id") @jakarta.ws.rs.QueryParam("type.params.activity_type_id") List<Integer> typeParamsActivityTypeId, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("period.start") @jakarta.ws.rs.QueryParam("period.start") LocalDate periodStart, 
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("period.end") @jakarta.ws.rs.QueryParam("period.end") LocalDate periodEnd
    );

     /**
     * Update existing goal
     *
     * Updates an existing goal.
     *
     * @param id The ID of the goal
     * @param basicGoalRequest 
     */
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="api_key", openApiSpecId="openapi_yaml", operationId="updateGoal", method="PUT", path="/v1/goals/{id}")
    @io.quarkiverse.openapi.generator.markers.OperationMarker(name="oauth2", openApiSpecId="openapi_yaml", operationId="updateGoal", method="PUT", path="/v1/goals/{id}")
    @jakarta.ws.rs.PUT
    @jakarta.ws.rs.Path("/{id}")
    @jakarta.ws.rs.Consumes({"application/json"})
    @jakarta.ws.rs.Produces({"application/json"})
    @io.quarkiverse.openapi.generator.annotations.GeneratedMethod("updateGoal")
    public UpsertGoalResponse updateGoal(
        @io.quarkiverse.openapi.generator.annotations.GeneratedParam("id") @jakarta.ws.rs.PathParam("id")String id, 
        BasicGoalRequest basicGoalRequest
    );

}