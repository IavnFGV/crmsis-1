package dti.crmsis.back.services;

import dti.crmsis.back.LoggingFilter;
import dti.crmsis.back.clients.Constants;
import dti.crmsis.back.clients.PipedriveRestClientV2;
import dti.crmsis.back.clients.WebhooksRestClientV1;
import dti.crmsis.back.clients.dto.*;
import dti.crmsis.back.dao.crmsis.CustomerEntity;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.hibernate.query.sqm.TemporalUnit;
import org.jboss.logging.Logger;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;

@ApplicationScoped
public class ClientRegistrationService {

    private static final Logger logger = Logger.getLogger(ClientRegistrationService.class);


    @Inject
    @RestClient
    PipedriveRestClientV2 pipedriveRestClientV2;

    @Inject
    @RestClient
    WebhooksRestClientV1 webhooksRestClientV1;

    @Inject
    PipedriveSyncService pipedriveSyncService;

    public void registerClient(String clientName, String apiToken, String pipedriveUrl) {
        CustomerEntity client = getCustomerEntity(clientName, apiToken, pipedriveUrl);

        String updatedUntil = Instant.now().truncatedTo(ChronoUnit.SECONDS).toString();
//         if(!registerWebhook(apiToken,client)){
//             return;
//         }
        logger.info("Start syncing data for client " + client.customerName);
        syncClientData(client, updatedUntil);
    }

    @Transactional
    protected CustomerEntity getCustomerEntity(String clientName, String apiToken, String pipedriveUrl) {
        CustomerEntity client = new CustomerEntity();
        client.customerName = clientName;
        client.fullName = clientName;
        client.apiToken = apiToken;
        client.url = pipedriveUrl;
        client.persist();
        return client;
    }

    private boolean registerWebhook(String apiToken, CustomerEntity client) {

        String expectedUrl = Constants.URL_FOR_WEBHOOKS + client.customerName;
        WebhookResponse response = webhooksRestClientV1.getAll(client.apiToken);
        boolean alreadyRegistered = response.getData().stream().anyMatch(webhookData -> webhookData.getSubscriptionUrl().equals(expectedUrl));
        if (alreadyRegistered) {
            logger.info("Webhook has been already registered!");
            return false;
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
    protected void syncClientData(CustomerEntity client, String updatedUntil) {
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
