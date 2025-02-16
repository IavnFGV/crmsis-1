package dti.crmsis.back.services;

import dti.crmsis.back.clients.PipedriveRestClientV1;
import dti.crmsis.back.clients.PipedriveRestClientV2;
import dti.crmsis.back.clients.dto.DealFieldsResponse;
import dti.crmsis.back.clients.dto.DealResponse;
import dti.crmsis.back.clients.dto.PipelineResponse;
import dti.crmsis.back.clients.dto.StageResponse;
import dti.crmsis.back.dao.clientsback.DealEntity;
import dti.crmsis.back.dao.clientsback.PipelineEntity;
import dti.crmsis.back.dao.clientsback.StageEntity;
import dti.crmsis.back.dao.clientsback.DealFieldEntity;
import dti.crmsis.back.mappers.DealFieldMapper;
import dti.crmsis.back.mappers.DealMapper;
import dti.crmsis.back.mappers.PipelineMapper;
import dti.crmsis.back.mappers.StageMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class PipedriveSyncService {

    private static final int PAGE_LIMIT = 100; // Maximum number of records per request

    @Inject
    @RestClient
    PipedriveRestClientV2 pipedriveRestClientV2;
    @Inject
    PagingServiceV2 pagingServiceV2;
    @Inject
    @RestClient
    PipedriveRestClientV1 pipedriveRestClientV1;
    @Inject
    PagingServiceV1 pagingServiceV1;

    @Inject
    DealMapper dealMapper;
    @Inject
    PipelineMapper pipelineMapper;
    @Inject
    private StageMapper stageMapper;
    @Inject
    DealFieldMapper dealFieldMapper;


    public List<DealFieldsResponse.DealField> syncDealFields(String apiToken) {
        List<DealFieldsResponse.DealField> dealFields = pagingServiceV1.fetchAllPages(
                (cursor, limit) -> pipedriveRestClientV1.getDealFields(cursor, limit, apiToken),
                DealFieldsResponse::getData,
                dr-> dr.getAdditionalData().getPagination().isMoreItemsInCollection()
        );

        List<DealFieldEntity> dealFieldEntities = dealFields.stream()
                .map(dealField -> {
                    DealFieldEntity existingDealField = DealFieldEntity.find("idPipedrive", dealField.getId()).firstResult();
                    return existingDealField != null ? existingDealField : dealFieldMapper.toEntity(dealField);
                })
                .toList();

        persistDealFields(dealFieldEntities.stream().filter(df -> df.id == null).collect(Collectors.toList()));
        return dealFields;
    }

    protected void persistDealFields(List<DealFieldEntity> dealFieldEntities) {
        DealFieldEntity.persist(dealFieldEntities);
    }


    public List<DealResponse.Deal> syncDeals(String apiToken, String updatedUntil) {
        List<DealResponse.Deal> deals = pagingServiceV2.fetchAllPages(
                (cursor, limit) -> pipedriveRestClientV2.getDeals(null, null, null, null, null, null, null,
                        null, null, updatedUntil, null, null, null, null,
                        limit, cursor, apiToken),
                DealResponse::getData,
                DealResponse::getNextCursor,
                deal -> {
                    DealEntity existingDeal = DealEntity.find("idPipedrive", deal.getId()).firstResult();
                    if (existingDeal == null) {
                        DealEntity.persist(dealMapper.toEntity(deal));
                    }
                });
        return deals;
    }

    public List<PipelineResponse.Pipeline> syncAndSavePipelines(String apiToken) {
        List<PipelineResponse.Pipeline> pipelines = pagingServiceV2.fetchAllPages(
                (cursor, limit) -> pipedriveRestClientV2.getPipelines(null, null, limit, cursor, apiToken),
                PipelineResponse::getData,
                PipelineResponse::getNextCursor,
                null
        );

        List<PipelineEntity> pipelineEntities = pipelines.stream()
                .map(pipeline -> {
                    PipelineEntity existingPipeline = PipelineEntity.find("idPipedrive", pipeline.getId()).firstResult();
                    return existingPipeline != null ? existingPipeline : pipelineMapper.toEntity(pipeline);
                })
                .toList();

        persistPipeLines(pipelineEntities.stream().filter(p -> p.id == null).collect(Collectors.toList()));
        return pipelines;
    }

    protected void persistPipeLines(List<PipelineEntity> pipelineEntities) {
        PipelineEntity.persist(pipelineEntities);
    }

    public List<StageResponse.Stage> syncAndSaveStages(String apiToken, Integer pipelineId) {
        List<StageResponse.Stage> stages = pagingServiceV2.fetchAllPages(
                (cursor, limit) -> pipedriveRestClientV2.getStages(pipelineId, null, null, limit, cursor, apiToken),
                StageResponse::getData,
                StageResponse::getNextCursor,
                null
        );

        List<StageEntity> stageEntities = stages.stream()
                .map(stage -> {
                    StageEntity existingStage = StageEntity.find("idPipedrive", stage.getId()).firstResult();
                    return existingStage != null ? existingStage : stageMapper.toEntity(stage);
                })
                .toList();

        persistStages(stageEntities.stream().filter(s -> s.id == null).collect(Collectors.toList()));
        return stages;
    }

    protected void persistStages(List<StageEntity> stageEntities) {
        StageEntity.persist(stageEntities);
    }
}
