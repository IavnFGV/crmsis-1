package dti.crmsis.back.mappers;

import dti.crmsis.back.clients.dto.PipelineResponse.Pipeline;
import dti.crmsis.back.dao.clientsback.PipelineEntity;
import org.mapstruct.*;
import java.util.List;

@Mapper(componentModel = "cdi")
public interface PipelineMapper {

    @Mapping(source = "id", target = "idPipedrive")
    @Mapping(target = "id", ignore = true)
    PipelineEntity toEntity(Pipeline pipeline);

    @InheritInverseConfiguration
    Pipeline toDto(PipelineEntity pipelineEntity);

    List<PipelineEntity> toEntityList(List<Pipeline> pipelines);

    List<Pipeline> toDtoList(List<PipelineEntity> pipelineEntities);
}
