package dti.crmsis.back.services;

import dti.crmsis.back.clients.PipedriveRestClientV1;
import dti.crmsis.back.clients.openapi.v1.api.PipelinesApi;
import dti.crmsis.back.dao.clientsback.EventEntity;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class PipedriveInitialEventsServiceV1 {

    @Inject
    PagingServiceV1 pagingServiceV1;

    @Inject
    PagingServiceV2 pagingServiceV2;

    @Inject
    @RestClient
    private PipedriveRestClientV1 pipedriveRestClientV1;

    @Inject
    @RestClient
    PipelinesApi pipelinesApi;

    private static Long persistEvent(String json, Long rootEventId, String entityType) {
        EventEntity eventEntity = new EventEntity();
        eventEntity.processedData = json;
        eventEntity.comments = "{ \"type\": \"$ENTITY_TYPE\"}".replace("$ENTITY_TYPE", entityType);
        eventEntity.parentId = rootEventId;
        eventEntity.persist();
        return eventEntity.id;
    }

    public void extractPipelines(long rootEvent) {
        pagingServiceV1.fetchAllDataNew(rootEvent,
                this::getPipelines,
                (json, rootEventId) -> persistEvent(json, rootEventId, "PIPELINES")
        );
    }

    private String getPipelines(Integer start) {
        return pipedriveRestClientV1.getPipelinesAsJson(start, Constants.PAGE_LIMIT);
    }

    public void extractStages(long rootEventId) {
        pagingServiceV1.fetchAllDataNew(
                rootEventId,
                this::getStages,
                (String json, Long rootEvent) -> persistEvent(json, rootEvent, "STAGES")
        );
    }

    private String getStages(Integer start) {
        return pipedriveRestClientV1.getStagesAsJson(start, Constants.PAGE_LIMIT);
    }

    public void extractDealFields(long rootEventId) {
        pagingServiceV1.fetchAllDataNew(rootEventId,
                this::getDealFields,
                (json, rootEvent) -> persistEvent(json, rootEvent, "DEAL_FIELDS")
        );
    }

    private String getDealFields(Integer start) {
        return pipedriveRestClientV1.getDealFieldsAsJson(start, Constants.PAGE_LIMIT);
    }

    public void extractDeals(String updatedUntil, long rootEventId) {
        pagingServiceV1.fetchAllDataNew(rootEventId,
                this::getDeals,
                (json, rootEvent) -> persistEvent(json, rootEvent, "DEALS")
        );
    }

    private String getDeals(Integer start) {
        return pipedriveRestClientV1.getDealsAsJson(start, Constants.PAGE_LIMIT);
    }

    public void extractUsers(long rootEventId) {
        String usersAsString = pipedriveRestClientV1.getUsersAsJson();
        persistEvent(usersAsString, rootEventId, "USERS");
    }

    public void extractPersonFields(long rootEventId) {
        pagingServiceV1.fetchAllDataNew(rootEventId,
                this::getPersonFields,
                (json, rootEvent) -> persistEvent(json, rootEvent, "PERSON_FIELDS")
        );
    }

    private String getPersonFields(Integer start) {
        return pipedriveRestClientV1.getPersonFieldsAsJson(start, Constants.PAGE_LIMIT);
    }

    public void extractPersons(String updatedUntil, long rootEventId) {
        pagingServiceV2.fetchAllDataNew(rootEventId,
                (cursor) -> {
                    return pipedriveRestClientV1.getPersonsCollectionAsJson(cursor, Constants.PAGE_LIMIT, null, updatedUntil);
                },
                (json, rootEvent) -> persistEvent(json, rootEvent, "PERSONS"));
    }

    public void extractOrganizationFields(long rootEventId) {
        pagingServiceV1.fetchAllDataNew(rootEventId,
                this::getOrganizationFields,
                (json, rootEvent) -> persistEvent(json, rootEvent, "ORGANIZATION_FIELDS")
        );
    }

    private String getOrganizationFields(Integer start) {
        return pipedriveRestClientV1.getOrganizationFieldsAsJson(start, Constants.PAGE_LIMIT);
    }

    public void extractOrganizations(String updatedUntil, long rootEventId) {
        pagingServiceV2.fetchAllDataNew( rootEventId,
                (cursor) -> pipedriveRestClientV1.getOrganizationsCollectionAsJson(cursor, Constants.PAGE_LIMIT,
                        null, updatedUntil, null, null),
                (json, rootEvent) -> persistEvent(json, rootEvent, "ORGANIZATIONS")
        );
    }


    public void extractLeadLabels(long rootEventId) {
        String leadLabelsAsString = pipedriveRestClientV1.getLeadLabelsAsJson();
        persistEvent(leadLabelsAsString, rootEventId, "LEAD_LABELS");
    }

    public void extractLeads(long rootEventId) {
        pagingServiceV1.fetchAllDataNew(rootEventId,
                this::getLeads,
                (json, rootEvent) -> persistEvent(json, rootEvent, "LEADS")
        );
    }

    private String getLeads(Integer start) {
        return pipedriveRestClientV1.getLeadsAsJson(start, Constants.PAGE_LIMIT,
                null, null, null,
                null, null, null);
    }


}