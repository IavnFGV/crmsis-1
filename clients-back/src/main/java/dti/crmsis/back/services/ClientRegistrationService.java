package dti.crmsis.back.services;

import dti.crmsis.back.ApiTokenRequestFilter;
import dti.crmsis.back.clients.PipedriveRestClientGeneratedV1;
import dti.crmsis.back.clients.PipedriveRestClientV1;
import dti.crmsis.back.clients.PipedriveRestClientV2;
import dti.crmsis.back.clients.WebhooksRestClientV1;
import dti.crmsis.back.clients.dto.*;
import dti.crmsis.back.dao.clientsback.EventEntity;
import dti.crmsis.back.dao.crmsis.CustomerEntity;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;

@ApplicationScoped
public class ClientRegistrationService {

    private static final Logger logger = Logger.getLogger(ClientRegistrationService.class);

    @Inject
    @RestClient
    PipedriveRestClientGeneratedV1 pipedriveRestClientGeneratedV1;

    @Inject
    @RestClient
    PipedriveRestClientV2 pipedriveRestClientV2;

    @Inject
    @RestClient
    PipedriveRestClientV1 pipedriveRestClientV1;

    @Inject
    @RestClient
    WebhooksRestClientV1 webhooksRestClientV1;

    @Inject
    PipedriveSyncService pipedriveSyncService;

    @Inject
    PipedriveInitialEventsServiceV1 pipedriveInitialEventsServiceV1;

    @Inject
    ApiTokenRequestFilter apiTokenRequestFilter;

    public void initClient(CustomerEntity client) {

        String updatedUntil = Instant.now().truncatedTo(ChronoUnit.SECONDS).toString();
        if (!registerWebhook(client)) {
            return;
        }
        long rootEventId = startSyncingData(client, updatedUntil);

//        syncClientData(client, updatedUntil, rootEventId);
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
    protected void generateInitialEvents(CustomerEntity client, String updatedUntil, long rootEventId) {
        pipedriveInitialEventsServiceV1.extractPipelines(rootEventId);
        pipedriveInitialEventsServiceV1.extractStages(rootEventId);
        pipedriveInitialEventsServiceV1.extractDealFields(rootEventId);
        pipedriveInitialEventsServiceV1.extractDeals(updatedUntil, rootEventId);
        pipedriveInitialEventsServiceV1.extractUsers(rootEventId);
        pipedriveInitialEventsServiceV1.extractPersonFields(rootEventId);
        pipedriveInitialEventsServiceV1.extractPersons(updatedUntil, rootEventId);
        pipedriveInitialEventsServiceV1.extractOrganizationFields(rootEventId);
        pipedriveInitialEventsServiceV1.extractOrganizations(updatedUntil, rootEventId);
        pipedriveInitialEventsServiceV1.extractLeadLabels(rootEventId);
        pipedriveInitialEventsServiceV1.extractLeads(rootEventId);
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

    @Transactional
    protected void syncClientData(CustomerEntity client, String updatedUntil, long rootEventId) {

        List<PipelineResponse.Pipeline> pipelines = pipedriveSyncService.syncAndSavePipelines(client.apiToken);
        logger.info("Pipelines synced: " + pipelines.size());

        for (PipelineResponse.Pipeline pipeline : pipelines) {
            List<StageResponse.Stage> stages = pipedriveSyncService.syncAndSaveStages(client.apiToken, pipeline.getId().intValue());
            logger.info("Stages synced for pipeline " + pipeline.getId() + ": " + stages.size());
        }

        List<DealFieldsResponse.DealField> dealFields = pipedriveSyncService.syncDealFields(client.apiToken);
        logger.info("Deal`s fields synced: " + dealFields.size());

        List<DealResponse.Deal> deals = pipedriveSyncService.syncDeals(client.apiToken, updatedUntil);
        logger.info("Deals synced: " + deals.size());
    }
}
