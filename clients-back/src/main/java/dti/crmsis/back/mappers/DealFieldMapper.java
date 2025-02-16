package dti.crmsis.back.mappers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import dti.crmsis.back.clients.dto.DealFieldsResponse;
import dti.crmsis.back.clients.dto.DealFieldsResponse.DealField;
import dti.crmsis.back.dao.clientsback.DealFieldEntity;
import org.mapstruct.*;
import java.util.List;

@Mapper(componentModel = "cdi")
public interface DealFieldMapper {

    @Mapping(source = "id", target = "idPipedrive")
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "mandatoryFlag", target = "mandatoryFlag", qualifiedByName = "objectToJsonString")
    @Mapping(target = "options", source = "options", qualifiedByName = "optionsToJsonString")
    DealFieldEntity toEntity(DealField dealField);

    @InheritInverseConfiguration
    DealField toDto(DealFieldEntity dealFieldEntity);

    List<DealFieldEntity> toEntityList(List<DealField> dealFields);

    List<DealField> toDtoList(List<DealFieldEntity> dealFieldEntities);

    @Named("objectToJsonString")
    static String objectToJsonString(Object obj) {
        try {
            return obj != null ? new ObjectMapper().writeValueAsString(obj) : null;
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting object to JSON string", e);
        }
    }

    @Named("optionsToJsonString")
    static String optionsToJsonString(List<DealFieldsResponse.Option> obj) {
        try {
            return obj != null ? new ObjectMapper().writeValueAsString(obj) : null;
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting object to JSON string", e);
        }
    }

    @Named("optionsToJsonString")
    static List<DealFieldsResponse.Option> optionsToJsonString(String json) {
        try {
            return json != null ? new ObjectMapper().readValue(json, new TypeReference<List<DealFieldsResponse.Option>>() {}) : null;
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting JSON string to object", e);
        }
    }

}
