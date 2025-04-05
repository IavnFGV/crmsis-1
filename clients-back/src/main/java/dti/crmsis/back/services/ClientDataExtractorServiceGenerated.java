package dti.crmsis.back.services;

import dti.crmsis.back.clients.generated.PipedriveRestClientGeneratedV1;
import dti.crmsis.back.clients.WebhooksRestClientV1;
import dti.crmsis.back.clients.dto.NewWebhookRequest;
import dti.crmsis.back.clients.dto.WebhookRegistrationResponse;
import dti.crmsis.back.clients.dto.WebhookResponse;
import dti.crmsis.back.dao.clientsback.EventEntity;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;
import dti.crmsis.back.dao.clientsback.ExtraInfoEntity;

import java.time.ZoneOffset;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.function.Supplier;

import static dti.crmsis.back.services.Constants.WEBHOOK_REGISTERED_DATETIME;

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
    
    @Inject 
    CustomerDetailsService customerDetailsService;

    
    @Transactional
    protected Long persistEvent(String json, Long rootEventId, String entityType) {
        EventEntity eventEntity = new EventEntity();
        eventEntity.processedData = json;
        eventEntity.comments = "{ \"type\": \"$ENTITY_TYPE\"}".replace("$ENTITY_TYPE", entityType);
        eventEntity.parentId = rootEventId;
        eventEntity.persist();
        return eventEntity.id;
    }
    
    public void initClient(CustomerDetailsService.CustomerInfo customerInfo) {
        String updatedUntil = Instant.now().truncatedTo(ChronoUnit.SECONDS).toString();
        if (!registerWebhook(customerInfo)) {
            return;
        }
        long rootEventId = startSyncingData(customerInfo, updatedUntil);
        generateInitialEvents(updatedUntil, rootEventId);
        stopSyncData(customerInfo, updatedUntil, rootEventId);
    }

    @Transactional
    protected void stopSyncData(CustomerDetailsService.CustomerInfo client, String updatedUntil, long rootEventId) {
        EventEntity eventEntity = new EventEntity();
        eventEntity.customerName = client.getName();
        eventEntity.comments = "{ \"type\": \"STOP_SYNC\", \"client\": \"$CUSTOMER_NAME\", \"updatedUntil\": \"$UPDATED_UNTIL\" }"
                .replace("$CUSTOMER_NAME", eventEntity.customerName)
                .replace("$UPDATED_UNTIL", updatedUntil);
        eventEntity.processedData = "{}";
        eventEntity.parentId = rootEventId;
        eventEntity.persist();
    }
    
    @Transactional
    protected long startSyncingData(CustomerDetailsService.CustomerInfo client, String updatedUntil) {
        logger.info("Start syncing data for client " + client.getName());

        EventEntity eventEntity = new EventEntity();
        eventEntity.customerName = client.getName();
        eventEntity.comments = "{ \"type\": \"START_SYNC\", \"client\": \"$CUSTOMER_NAME\", \"updatedUntil\": \"$UPDATED_UNTIL\" }"
                .replace("$CUSTOMER_NAME", eventEntity.customerName)
                .replace("$UPDATED_UNTIL", updatedUntil);
        eventEntity.processedData = "{}";
        eventEntity.persist();
        return eventEntity.id;
    }

    private boolean registerWebhook(CustomerDetailsService.CustomerInfo customerInfo) {

        String expectedUrl = Constants.URL_FOR_WEBHOOKS + customerInfo.getName();
        LocalDateTime dateTime = ExtraInfoEntity.getDateTime(WEBHOOK_REGISTERED_DATETIME);

        if (dateTime!=null) {
            logger.info("Webhook has been already registered!");
            return true;
        }

        WebhookResponse response = webhooksRestClientV1.getAll(customerInfo.getApiToken());
        boolean alreadyRegistered =
                response.getData().stream()
                        .anyMatch(
                                webhookData ->
                                        webhookData.getSubscriptionUrl().equals(expectedUrl));

        if (alreadyRegistered) {
            logger.info("Webhook has been already registered!");
            return true;
        }

        NewWebhookRequest request = new NewWebhookRequest(expectedUrl);
        WebhookRegistrationResponse registrationResponse =
                webhooksRestClientV1.registerNewWebhook(customerInfo.getApiToken(), request);

        if (registrationResponse != null && response.isSuccess()) {
            saveWebhookRegisteringTime();
            logger.info("Webhook registered successfully!");
            return true;
        } else {
            logger.info("Cant register webhook!");
        }
        return false;
    }

    private static void saveWebhookRegisteringTime() {
        ExtraInfoEntity.saveDateTime(WEBHOOK_REGISTERED_DATETIME, LocalDateTime.now(ZoneOffset.UTC));
    }
    
 private String wrapToRetry(Supplier<String> apiCall) {
        int retry = 0;
        String exceptionDecr = "[";
        while (true) {
            try {
                return apiCall.get();
            } catch (Exception e) {
                retry++;
                logger.error("Failed to fetch activity fields", e);

                exceptionDecr += ("{\"error\":" + e.getMessage() + "\"},");
                if (retry > 5) {
                    if (exceptionDecr.endsWith(",")) {
                        exceptionDecr = exceptionDecr.substring(0, exceptionDecr.length() - 1);
                    }
                    exceptionDecr += "]";
                    return exceptionDecr;
                }
            }
        }
    }


    protected void generateInitialEvents(String updatedUntil, long rootEventId) {
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
                start-> wrapToRetry(()->pipedriveRestClientGeneratedV1.getNotesAsJson(null,null,null,null,null,start,Constants.PAGE_LIMIT,null,null,null,null,null,null,null)),
                (String json, Long rootEvent) -> persistEvent(json, rootEvent, "NOTES"));
                
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