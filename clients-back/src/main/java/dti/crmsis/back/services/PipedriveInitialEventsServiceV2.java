package dti.crmsis.back.services;

import dti.crmsis.back.clients.Constants;
import dti.crmsis.back.clients.PipedriveRestClientV1;
import dti.crmsis.back.clients.PipedriveRestClientV2;
import dti.crmsis.back.clients.openapi.v1.api.PipelinesApi;
import dti.crmsis.back.dao.clientsback.EventEntity;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class PipedriveInitialEventsServiceV2 {


    @Inject
    PagingServiceV2 pagingServiceV2;
    @Inject
    PagingServiceV1 pagingServiceV1;
    @Inject
    @RestClient
    private PipedriveRestClientV2 pipedriveRestClientV2;
    @Inject
    @RestClient
    private PipedriveRestClientV1 pipedriveRestClientV1;

    @Inject
    @RestClient
    PipelinesApi pipelinesApi;

    public void extractPipelines(String apiToken, long rootEvent) {
        pagingServiceV2.fetchAllData(apiToken, rootEvent,
                this::getPipelines,
                (json, rootEventId) -> persistEvent(json, rootEventId, "PIPELINES")
        );


    }

    private static Long persistEvent(String json, Long rootEventId, String entityType) {
        EventEntity eventEntity = new EventEntity();
        eventEntity.processedData = json;
        eventEntity.comments = "{ \"type\": \"$ENTITY_TYPE\"}".replace("$ENTITY_TYPE", entityType);
        eventEntity.parentId = rootEventId;
        eventEntity.persist();
        return eventEntity.id;
    }

    private String getPipelines(String cursor, String token) {
        return pipedriveRestClientV2.getPipelinesAsJson(null, null, Constants.PAGE_LIMIT, cursor, token);
    }

    public void extractStages(String apiToken, long rootEventId) {
        pagingServiceV2.fetchAllData(
                apiToken, rootEventId,
                this::getStages,
                (String json, Long rootEvent) -> persistEvent(json, rootEvent, "STAGES")
        );
    }

    private String getStages(String cursor, String token) {
        return pipedriveRestClientV2.getStagesAsJson(null, null, null, Constants.PAGE_LIMIT, cursor, token);
    }

    public void extractDealFields(String apiToken, long rootEventId) {
        pagingServiceV1.fetchAllData(apiToken, rootEventId,
                this::getDealFields,
                (json, rootEvent) -> persistEvent(json, rootEvent, "DEAL_FIELDS")
        );
    }

    private String getDealFields(Integer start, Integer limit, String token) {
        return pipedriveRestClientV1.getDealFieldsAsJson(start, limit, token);
    }

    public void extractDeals(String apiToken, String updatedUntil, long rootEventId) {
        pagingServiceV2.fetchAllData(apiToken, rootEventId,
                (cursor, token) -> {
                    return pipedriveRestClientV2.getDealsAsJson(null, null, null, null, null, null, null,
                            null, null, updatedUntil, null, null, null, null,
                            Constants.PAGE_LIMIT, cursor, token);
                },
                (json, rootEvent) -> persistEvent(json, rootEvent, "DEALS")
        );
    }

    public void extractUsers(String apiToken, long rootEventId) {
        String usersAsString = pipedriveRestClientV1.getUsersAsJson(apiToken);
        persistEvent(usersAsString, rootEventId, "USERS");
    }

    public void extractPersonFields(String apiToken, long rootEventId) {
        pagingServiceV1.fetchAllData(apiToken, rootEventId,
                this::getPersonFields,
                (json, rootEvent) -> persistEvent(json, rootEvent, "PERSON_FIELDS")
        );
    }

    private String getPersonFields(Integer start, Integer limit, String token) {
        return pipedriveRestClientV1.getPersonFieldsAsJson(start, limit, token);
    }

    public void extractPersons(String apiToken, String updatedUntil, long rootEventId) {
        pagingServiceV2.fetchAllData(apiToken, rootEventId,
                (cursor, token) -> {
                    return pipedriveRestClientV2.getPersonsAsJson(null, null, null, null, null, updatedUntil, null,
                            null, null, null, Constants.PAGE_LIMIT, cursor, token);
                },
                (json, rootEvent) -> persistEvent(json, rootEvent, "PERSONS"));
    }

    public void extractOrganizationFields(String apiToken, long rootEventId) {
        pagingServiceV1.fetchAllData(apiToken, rootEventId,
                this::getOrganizationFields,
                (json, rootEvent) -> persistEvent(json, rootEvent, "ORGANIZATION_FIELDS")
        );
    }

    private String getOrganizationFields(Integer start, Integer limit, String token) {
        return pipedriveRestClientV1.getOrganizationFieldsAsJson(start, limit, token);
    }

    public void extractOrganizations(String apiToken, String updatedUntil, long rootEventId) {
        pagingServiceV2.fetchAllData(apiToken, rootEventId,
                (cursor, token) -> {
                    return pipedriveRestClientV2.getOrganizationsAsJson(null, null, null, null, updatedUntil, null, null,
                            null, null, Constants.PAGE_LIMIT, cursor, token);
                },
                (json, rootEvent) -> persistEvent(json, rootEvent, "ORGANIZATIONS")
        );
    }

    public void extractLeadLabels(String apiToken, long rootEventId) {
        String leadLabelsAsString = pipedriveRestClientV1.getLeadLabelsAsJson(apiToken);
        persistEvent(leadLabelsAsString, rootEventId, "LEAD_LABELS");
    }

    public void extractLeads(String apiToken, long rootEventId) {
        pagingServiceV1.fetchAllData(apiToken, rootEventId,
                this::getLeads,
                (json, rootEvent) -> persistEvent(json, rootEvent, "LEADS")
        );
    }

    private String getLeads(Integer start, Integer limit, String token) {
        return pipedriveRestClientV1.getLeadsAsJson(start,limit,null,null,null,
                null,null,null,token);
    }
}