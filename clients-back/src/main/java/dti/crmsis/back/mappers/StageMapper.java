package dti.crmsis.back.mappers;

import dti.crmsis.back.clients.dto.StageResponse.Stage;
import dti.crmsis.back.dao.clientsback.StageEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "cdi")
public interface StageMapper {

    @Mapping(source = "id", target = "idPipedrive")
    @Mapping(target = "id", ignore = true)
    StageEntity toEntity(Stage stage);

    @InheritInverseConfiguration
    Stage toDto(StageEntity stageEntity);

    List<StageEntity> toEntityList(List<Stage> stages);

    List<Stage> toDtoList(List<StageEntity> stageEntities);
}
