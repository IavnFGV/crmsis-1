

response_class_to_dto_class = {
"GetActivitiesCollectionResponse":"ActivityCollectionResponseObject",
"GetFieldsResponse":"GetField",
"GetActivityTypesResponse":"ActivityType",
"GetCurrenciesResponse":"GetCurrenciesResponseDataInner",
"GetDealsCollectionResponse":"DealCollectionResponseObject",
"GetLeadLabelsResponse":"LeadLabel",  # id =UUID
"GetLeadsResponse":"Lead", # id =UUID
"GetOrganizationsCollection200Response":"GetOrganizationsCollectionResponseObject",
"GetPersonsCollection200Response":"PersonsCollectionResponseObject",
"GetPipelinesResponse":"BasePipelineWithSelectedFlag",
"GetProductFieldsResponse":"GetProductFieldsResponseDataInner",
"GetProductsResponse1":"GetProductResponse.ProductListItemProduct",
"GetProjectsResponse":"ProjectResponseObject",
"GetRolesResponse":"FullRole",
"GetStagesResponse":"GetStagesResponseDataInner",
"GetTasksResponse":"TaskResponseObject",
"GetUsersResponse":"BaseUser",
"GetWebhooksResponse":"BaseWebhook"
}


def calculate_dto_class_name(return_type):
    dto_class = response_class_to_dto_class[return_type]
    return dto_class


def generate_init_entity_method(method_tuple):
        annotations, visibility, return_type, method_name, new_parameters, entity_name  = method_tuple

        entity_name_titled = entity_name.lower().title()

        words = [word[0].upper() + word[1:] for word in entity_name[0:-1].replace("_"," ").lower().split()]
        entity_class_name = "".join(words)+"Entity"
        entity_class_name = entity_class_name.replace("Activitie","Activity")

        method_code = """ @Transactional
    public void init$ENTITY_NAME_TITLED() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "$ENTITY_NAME")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                $METHOD_RESPONSE_CLASS response = objectMapper.readValue(event.processedData, $METHOD_RESPONSE_CLASS.class);
                $PERSISTING_CODE
            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("$ENTITY_NAME_TITLED processed. Events = " + eventsCount + ", deals = " + entitiesCount);
    } """

        persisting_code_common = """
                        List<$METHOD_RESPONSE_DATA_DTO_CLASS> data = response.getData();
                        for ($METHOD_RESPONSE_DATA_DTO_CLASS dto : data) {
                            entitiesCount++;
            
                            $ENTITY_CLASS_NAME entity = new $ENTITY_CLASS_NAME();
                            entity.idPipedrive = dto.getId();
                            entity.json = objectMapper.writeValueAsString(dto);
                            entity.persist();
                        }
        """
        persisting_code_GetProductsResponse1 = """
                        List<GetProductResponse> data = response.getData();
                        for (GetProductResponse dto : data) {
                            entitiesCount++;
                            ProductEntity entity = new ProductEntity();
                            ProductListItemProduct innerDto = dto.getData();
                            entity.idPipedrive = innerDto.getId().intValue();
                            entity.json = objectMapper.writeValueAsString(innerDto);
                            entity.persist();
                        }
        """



        if return_type == "GetProductsResponse1":
            method_code = method_code.replace("$PERSISTING_CODE", persisting_code_GetProductsResponse1)
        else:
            method_code = method_code.replace("$PERSISTING_CODE", persisting_code_common)



        method_code = method_code.replace("$ENTITY_NAME_TITLED", entity_name_titled)\
                             .replace("$ENTITY_CLASS_NAME", entity_class_name)\
                             .replace("$ENTITY_NAME", entity_name)\
                             .replace("$METHOD_RESPONSE_CLASS", return_type) \
                             .replace("$METHOD_RESPONSE_DATA_DTO_CLASS", calculate_dto_class_name(return_type))
        method_call = "init$ENTITY_NAME_TITLED()"
        method_call = method_call.replace("$ENTITY_NAME_TITLED", entity_name_titled)

        return (method_code, method_call)


def generate_java_initial_events_processor(api_methods):
    class_code = """package dti.crmsis.back.services;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import dti.crmsis.back.clients.openapi.v1.model.DealCollectionResponseObject;
import dti.crmsis.back.clients.openapi.v1.model.GetDealsCollectionResponse;
import dti.crmsis.back.dao.clientsback.DealEntity;
import dti.crmsis.back.dao.clientsback.EventEntity;
import dti.crmsis.back.dao.crmsis.CustomerEntity;
import io.quarkus.panache.common.Page;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import dti.crmsis.back.clients.openapi.v1.model.*;
import dti.crmsis.back.dao.clientsback.*;
import org.jboss.logging.Logger;

import java.io.IOException;
import java.util.List;

@ApplicationScoped
public class InitialEventsProcessorGenerated {

    private static final Logger logger = Logger.getLogger(InitialEventsProcessorGenerated.class);

    private final ObjectMapper objectMapper = new ObjectMapper();
    
    
    public void processInitialEvents(CustomerEntity customerEntity) {
        objectMapper.registerModule(new JavaTimeModule());
        try {
            $INIT_ENTITY_CALLS
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    $INIT_ENTITY_METHODS
   
}
    """

    for file_name, methods in api_methods:
        for method in methods:
            entity_name = method[5]
            if (not entity_name):
                continue
            entity_method, method_call= generate_init_entity_method(method)

            class_code = class_code.replace("$INIT_ENTITY_METHODS", entity_method +"\n$INIT_ENTITY_METHODS")\
                                   .replace("$INIT_ENTITY_CALLS", method_call +";\n$INIT_ENTITY_CALLS")\

    class_code = class_code.replace("$INIT_ENTITY_METHODS", "") \
                           .replace("$INIT_ENTITY_CALLS", "")
    return class_code