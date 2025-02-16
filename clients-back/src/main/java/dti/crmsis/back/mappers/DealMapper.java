package dti.crmsis.back.mappers;

import dti.crmsis.back.clients.dto.DealResponse.Deal;
import dti.crmsis.back.dao.clientsback.DealEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "cdi")
public interface DealMapper {

    @Mapping(source = "organizationId", target = "organizationId")
    @Mapping(target = "customFields", ignore = true)
    @Mapping(target = "labelIds", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "idPipedrive", source = "id")
    DealEntity toEntity(Deal deal);

    @InheritInverseConfiguration
    Deal toDto(DealEntity dealEntity);

    List<DealEntity> toEntityList(List<Deal> deals);

    List<Deal> toDtoList(List<DealEntity> dealEntities);
}

