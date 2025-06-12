package dti.crmsis.back.services;

import dti.crmsis.back.clients.CommonPipedriveRestClientV2;
import dti.crmsis.back.utils.Retry;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.Map;

@ApplicationScoped
public class PipedriveService {

    @Inject
    @RestClient
    CommonPipedriveRestClientV2 pipedriveClient;

    @Retry(maxRetries = 3, delayMs = 1000)
    public void assignManager(long dealId, long userId) {
        pipedriveClient.updateDeal(dealId, Map.of("owner_id", userId));
    }
}