package dti.crmsis.back.services;

import dti.crmsis.back.clients.generated.PipedriveRestClientGeneratedV1;
import dti.crmsis.back.clients.WebhooksRestClientV1;
import dti.crmsis.back.clients.dto.NewWebhookRequest;
import dti.crmsis.back.clients.dto.WebhookRegistrationResponse;
import dti.crmsis.back.clients.dto.WebhookResponse;
import dti.crmsis.back.dao.clientsback.EventEntity;
import dti.crmsis.back.dao.crmsis.CustomerEntity;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.function.Supplier;


@ApplicationScoped
public class ClientDataExtractorServiceGenerated {

    private static final Logger logger = Logger.getLogger(ClientDataExtractorServiceGenerated.class);

    @Inject
    @RestClient
    PipedriveRestClientGeneratedV1 pipedriveRestClientGeneratedV1;
    
    @Inject
    @RestClient
    WebhooksRestClientV1 webhooksRestClientV1;

    @Inject
    PagingServiceV1 pagingServiceV1;

    @Inject
    PagingServiceV2 pagingServiceV2;

    
    @Transactional
    protected Long persistEvent(String json, Long rootEventId, String entityType) {
        EventEntity eventEntity = new EventEntity();
        eventEntity.processedData = json;
        eventEntity.comments = "{ \"type\": \"$ENTITY_TYPE\"}".replace("$ENTITY_TYPE", entityType);
        eventEntity.parentId = rootEventId;
        eventEntity.persist();
        return eventEntity.id;
    }
    
    public void initClient(CustomerEntity client) {
        String updatedUntil = Instant.now().truncatedTo(ChronoUnit.SECONDS).toString();
        if (!registerWebhook(client)) {
            return;
        }
        long rootEventId = startSyncingData(client, updatedUntil);
        generateInitialEvents(client, updatedUntil, rootEventId);
        stopSyncData(client, updatedUntil, rootEventId);
    }

    @Transactional
    protected void stopSyncData(CustomerEntity client, String updatedUntil, long rootEventId) {
        EventEntity eventEntity = new EventEntity();
        eventEntity.customerName = client.urlPath;
        eventEntity.comments = "{ \"type\": \"STOP_SYNC\", \"client\": \"$CUSTOMER_NAME\", \"updatedUntil\": \"$UPDATED_UNTIL\" }"
                .replace("$CUSTOMER_NAME", eventEntity.customerName)
                .replace("$UPDATED_UNTIL", updatedUntil);
        eventEntity.processedData = "{}";
        eventEntity.parentId = rootEventId;
        eventEntity.persist();
    }
    
    @Transactional
    protected long startSyncingData(CustomerEntity client, String updatedUntil) {
        logger.info("Start syncing data for client " + client.urlPath);

        EventEntity eventEntity = new EventEntity();
        eventEntity.customerName = client.urlPath;
        eventEntity.comments = "{ \"type\": \"START_SYNC\", \"client\": \"$CUSTOMER_NAME\", \"updatedUntil\": \"$UPDATED_UNTIL\" }"
                .replace("$CUSTOMER_NAME", eventEntity.customerName)
                .replace("$UPDATED_UNTIL", updatedUntil);
        eventEntity.processedData = "{}";
        eventEntity.persist();
        return eventEntity.id;
    }

    private boolean registerWebhook(CustomerEntity client) {

        String expectedUrl = Constants.URL_FOR_WEBHOOKS + client.urlPath;
        WebhookResponse response = webhooksRestClientV1.getAll(client.apiToken);
        boolean alreadyRegistered = response.getData().stream().anyMatch(webhookData -> webhookData.getSubscriptionUrl().equals(expectedUrl));
        if (alreadyRegistered) {
            logger.info("Webhook has been already registered!");
            return true;
        }

        NewWebhookRequest request = new NewWebhookRequest(expectedUrl);
        WebhookRegistrationResponse registrationResponse = webhooksRestClientV1.registerNewWebhook(client.apiToken, request);

        if (registrationResponse != null && response.isSuccess()) {
            logger.info("Webhook registered successfully!");
            return true;
        } else {
            logger.info("Cant register webhook!");
        }
        return false;
    }
    
     private String wrapToRetry(Supplier<String> apiCall) {
        try {
            return apiCall.get();
        } catch (Exception e) {
            logger.error("Failed to fetch activity fields", e);
            return "{" +
                   "\"error\": \"" + e.getMessage() + "\"" +
                   "}";
        }
    }


    protected void generateInitialEvents(CustomerEntity client, String updatedUntil, long rootEventId) {
pagingServiceV1.fetchAllDataNew(
                rootEventId,
                start-> wrapToRetry(()->pipedriveRestClientGeneratedV1.getActivitiesAsJson(null,null,null,Constants.PAGE_LIMIT,start,null,null,null)),
                (String json, Long rootEvent) -> persistEvent(json, rootEvent, "ACTIVITIES"));
                
persistEvent(wrapToRetry(()->pipedriveRestClientGeneratedV1.getActivityFieldsAsJson()) , rootEventId, "REF_ACTIVITY_FIELDS");
persistEvent(wrapToRetry(()->pipedriveRestClientGeneratedV1.getActivityTypesAsJson()) , rootEventId, "ACTIVITY_TYPES");
persistEvent(wrapToRetry(()->pipedriveRestClientGeneratedV1.getCurrenciesAsJson(null)) , rootEventId, "CURRENCIES");
pagingServiceV1.fetchAllDataNew(
                rootEventId,
                start-> wrapToRetry(()->pipedriveRestClientGeneratedV1.getDealFieldsAsJson(start,Constants.PAGE_LIMIT)),
                (String json, Long rootEvent) -> persistEvent(json, rootEvent, "REF_DEAL_FIELDS"));
                
pagingServiceV2.fetchAllDataNew(rootEventId,
                (cursor) -> {
                
                    return wrapToRetry(()-> pipedriveRestClientGeneratedV1.getDealsCollectionAsJson(cursor,Constants.PAGE_LIMIT,null,null,null,null,null));
                },
                (json, rootEvent) -> persistEvent(json, rootEvent, "DEALS"));
persistEvent(wrapToRetry(()->pipedriveRestClientGeneratedV1.getLeadLabelsAsJson()) , rootEventId, "LEAD_LABELS");
pagingServiceV1.fetchAllDataNew(
                rootEventId,
                start-> wrapToRetry(()->pipedriveRestClientGeneratedV1.getLeadsAsJson(Constants.PAGE_LIMIT,start,null,null,null,null,null,null)),
                (String json, Long rootEvent) -> persistEvent(json, rootEvent, "LEADS"));
                
pagingServiceV1.fetchAllDataNew(
                rootEventId,
                start-> wrapToRetry(()->pipedriveRestClientGeneratedV1.getOrganizationFieldsAsJson(start,Constants.PAGE_LIMIT)),
                (String json, Long rootEvent) -> persistEvent(json, rootEvent, "REF_ORGANIZATION_FIELDS"));
                
pagingServiceV2.fetchAllDataNew(rootEventId,
                (cursor) -> {
                
                    return wrapToRetry(()-> pipedriveRestClientGeneratedV1.getOrganizationsCollectionAsJson(cursor,Constants.PAGE_LIMIT,null,null,null,null));
                },
                (json, rootEvent) -> persistEvent(json, rootEvent, "ORGANIZATIONS"));
pagingServiceV1.fetchAllDataNew(
                rootEventId,
                start-> wrapToRetry(()->pipedriveRestClientGeneratedV1.getPersonFieldsAsJson(start,Constants.PAGE_LIMIT)),
                (String json, Long rootEvent) -> persistEvent(json, rootEvent, "REF_PERSON_FIELDS"));
                
pagingServiceV2.fetchAllDataNew(rootEventId,
                (cursor) -> {
                
                    return wrapToRetry(()-> pipedriveRestClientGeneratedV1.getPersonsCollectionAsJson(cursor,Constants.PAGE_LIMIT,null,null,null,null));
                },
                (json, rootEvent) -> persistEvent(json, rootEvent, "PERSONS"));
persistEvent(wrapToRetry(()->pipedriveRestClientGeneratedV1.getPipelinesAsJson()) , rootEventId, "PIPELINES");
pagingServiceV1.fetchAllDataNew(
                rootEventId,
                start-> wrapToRetry(()->pipedriveRestClientGeneratedV1.getProductFieldsAsJson(start,Constants.PAGE_LIMIT)),
                (String json, Long rootEvent) -> persistEvent(json, rootEvent, "REF_PRODUCT_FIELDS"));
                
pagingServiceV1.fetchAllDataNew(
                rootEventId,
                start-> wrapToRetry(()->pipedriveRestClientGeneratedV1.getProductsAsJson(null,null,null,null,null,start,Constants.PAGE_LIMIT)),
                (String json, Long rootEvent) -> persistEvent(json, rootEvent, "PRODUCTS"));
                
pagingServiceV2.fetchAllDataNew(rootEventId,
                (cursor) -> {
                
                    return wrapToRetry(()-> pipedriveRestClientGeneratedV1.getProjectsAsJson(cursor,Constants.PAGE_LIMIT,null,null,null,null));
                },
                (json, rootEvent) -> persistEvent(json, rootEvent, "PROJECTS"));
pagingServiceV1.fetchAllDataNew(
                rootEventId,
                start-> wrapToRetry(()->pipedriveRestClientGeneratedV1.getRolesAsJson(start,Constants.PAGE_LIMIT)),
                (String json, Long rootEvent) -> persistEvent(json, rootEvent, "ROLES"));
                
pagingServiceV1.fetchAllDataNew(
                rootEventId,
                start-> wrapToRetry(()->pipedriveRestClientGeneratedV1.getStagesAsJson(null,start,Constants.PAGE_LIMIT)),
                (String json, Long rootEvent) -> persistEvent(json, rootEvent, "STAGES"));
                
pagingServiceV2.fetchAllDataNew(rootEventId,
                (cursor) -> {
                
                    return wrapToRetry(()-> pipedriveRestClientGeneratedV1.getTasksAsJson(cursor,Constants.PAGE_LIMIT,null,null,null,null));
                },
                (json, rootEvent) -> persistEvent(json, rootEvent, "TASKS"));
persistEvent(wrapToRetry(()->pipedriveRestClientGeneratedV1.getUsersAsJson()) , rootEventId, "USERS");
persistEvent(wrapToRetry(()->pipedriveRestClientGeneratedV1.getWebhooksAsJson()) , rootEventId, "WEBHOOKS");
}}