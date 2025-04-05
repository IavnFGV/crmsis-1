from typing import List

from genEntities import EntityFieldDeclaration
from templates import read_template

response_class_to_dto_class = {
    "GetActivitiesCollectionResponse": "ActivityCollectionResponseObject",
    "GetActivitiesResponse": "Activity",
    "GetFieldsResponse": "GetField",
    "GetActivityTypesResponse": "ActivityType",
    "GetCurrenciesResponse": "GetCurrenciesResponseDataInner",
    "GetDealsCollectionResponse": "DealCollectionResponseObject",
    "GetLeadLabelsResponse": "LeadLabel",  # id =UUID
    "GetLeadsResponse": "Lead",  # id =UUID
    "GetOrganizationsCollection200Response": "GetOrganizationsCollectionResponseObject",
    "GetPersonsCollection200Response": "PersonsCollectionResponseObject",
    "GetPipelinesResponse": "BasePipelineWithSelectedFlag",
    "GetProductFieldsResponse": "GetProductFieldsResponseDataInner",
    "GetProductsResponse1": "GetProductResponse.ProductListItemProduct",
    "GetProjectsResponse": "ProjectResponseObject",
    "GetRolesResponse": "FullRole",
    "GetStagesResponse": "GetStagesResponseDataInner",
    "GetTasksResponse": "TaskResponseObject",
    "GetUsersResponse": "BaseUser",
    "GetWebhooksResponse": "BaseWebhook"
}


def calculate_dto_class_name(return_type):
    dto_class = response_class_to_dto_class[return_type]
    return dto_class


def generate_init_entity_method(method_tuple, fields: List[EntityFieldDeclaration]):
    custom_fields ={}
    annotations, visibility, return_type, method_name, new_parameters, entity_name = method_tuple

    entity_name_titled = entity_name.lower().title()


    words = [word[0].upper() + word[1:] for word in entity_name[0:-1].replace("_", " ").lower().split()]
    entity_class_name = "".join(words) + "Entity"
    entity_class_name = entity_class_name.replace("Activitie", "Activity")

    method_code = read_template("initial_event_processor_init_entity_method_body")

    persisting_code_common = read_template("initial_event_processor_init_entity_persisting_code")

    json_to_entity_code=''
    if entity_name.endswith("FIELDS"):
        json_to_entity_code = read_template("json_to_ref_entity_method")
    else:
        json_to_entity_code = read_template("json_to_entity_method")

    common_id_extractor ='entity.idPipedrive = node.get("id").asLong();'
    uuid_id_extractor ='entity.idPipedrive = UUID.fromString(node.get("id").asText());'

    other_fields_extractors =[]

    id_extractor = common_id_extractor

    if return_type in ("GetLeadLabelsResponse", "GetLeadsResponse"):
        id_extractor = uuid_id_extractor
    elif entity_name.endswith("FIELDS"):
        other_fields_extractors.append('entity.key = node.get("key").asText();')
        other_fields_extractors.append('entity.name = node.get("name").asText();')
        other_fields_extractors.append('entity.fieldType = node.get("field_type").asText();')
        other_fields_extractors.append('entity.nameTranslit = translit(node.get("name").asText());')


    for field in fields:
        if(len(field.field_name)==40):
            # other_fields_extractors.append('customFields.add(saveCustomField("{2}", node.get("id").asLong(), "{0}", node.hasNonNull("{1}") ? writeNodeAsString(node.get("{1}")) : null));'
            #                                .format(field.field_name, field.aux_name_in_dto,entity_class_name))
            continue
        if(field.field_name == "id"):
            continue
        if(entity_name.endswith("FIELDS") and field.field_name in ("key", "name", "fieldType")):
            continue

        if field.type_name == "Boolean":
            other_fields_extractors.append('entity.{0} = node.hasNonNull("{1}") ? node.get("{1}").asBoolean() : null;'
                                           .format(field.field_name, field.aux_name_in_dto))
        elif field.type_name == "Long":
            other_fields_extractors.append('entity.{0} = node.hasNonNull("{1}") ? node.get("{1}").asLong() : null;'
                                           .format(field.field_name, field.aux_name_in_dto))
        elif field.type_name == "LocalDateTime":
            other_fields_extractors.append('entity.{0} = parseDateTime(node.hasNonNull("{1}") ? node.get("{1}").asText() : null);'
                                           .format(field.field_name, field.aux_name_in_dto))
        elif field.type_name == "LocalDate":
            other_fields_extractors.append('entity.{0} = parseDate(node.hasNonNull("{1}") ? node.get("{1}").asText() : null);'
                                           .format(field.field_name, field.aux_name_in_dto))
        elif field.type_name == "Double":
            other_fields_extractors.append('entity.{0} = node.hasNonNull("{1}") ? node.get("{1}").asDouble() : null;'
                                           .format(field.field_name, field.aux_name_in_dto))
        else:
            other_fields_extractors.append('entity.{0} = node.hasNonNull("{1}") ? writeNodeAsString(node.get("{1}")) : null;'
                                           .format(field.field_name, field.aux_name_in_dto))

    base_entity_name =''
    if entity_name.endswith("FIELDS"):
        base_entity_name = entity_name.removeprefix("REF_").removesuffix("_FIELDS").lower()

    entity_name_in_template = entity_name
    # if entity_name != "REF_ACTIVITY_FIELDS":
    #     entity_name_in_template = entity_name_in_template.replace("REF_","")

    method_code = method_code.replace("$PERSISTING_CODE", persisting_code_common)\
                             .replace("$ENTITY_CLASS_NAME", entity_class_name)\
                             .replace("$ENTITY_NAME_TITLED", entity_name_titled)\
                             .replace("$ENTITY_CLASS_NAME", entity_class_name) \
                             .replace("$ENTITY_NAME", entity_name_in_template)

    json_to_entity_code = json_to_entity_code.replace("$ENTITY_NAME_TITLED", entity_name_titled) \
        .replace("$OTHER_FIELDS_EXTRACTOR", "\n\t\t\t\t\t".join(other_fields_extractors)) \
        .replace("$ID_EXTRACTOR", id_extractor) \
        .replace("$ENTITY_CLASS_NAME", entity_class_name) \
        .replace("$ENTITY_TYPE_NAME", entity_class_name.replace("Entity","").lower()) \
        .replace("$ENTITY_NAME", entity_name.replace("REF_",""))\
        .replace("$BASE_ENTITY_NAME", base_entity_name)
        # .replace("$METHOD_RESPONSE_CLASS", return_type) \
        # .replace("$METHOD_RESPONSE_DATA_DTO_CLASS", calculate_dto_class_name(return_type))
    method_call = "init$ENTITY_NAME_TITLED()"
    method_call = method_call.replace("$ENTITY_NAME_TITLED", entity_name_titled)

    return (method_code, method_call,json_to_entity_code)


def generate_java_initial_events_processor(api_methods,fields):
    processor_class_code = read_template("initial_event_processor_template")

    json_to_entity_class_code = read_template("json_to_entity_service")


    init_entity_calls = []
    init_entity_methods = []
    json_to_entity_methods = []

    for file_name, methods in api_methods:
        for method in methods:
            entity_name = method[5]
            if (not entity_name):
                continue
            entity_method, method_call,json_to_entity_code = generate_init_entity_method(method,fields.get(entity_name,[]))

            init_entity_calls.append(method_call)
            init_entity_methods.append(entity_method)
            json_to_entity_methods.append(json_to_entity_code)

    sorted_calls = sorted(init_entity_calls, key=lambda x: not x.strip().startswith("initRef_"))

    processor_class_code = (processor_class_code.replace("$INIT_ENTITY_METHODS", "\n".join(init_entity_methods))
                            .replace("$INIT_ENTITY_CALLS",   '\n\t\t\t\t'.join([item + ';' for item in sorted_calls])))

    json_to_entity_class_code = json_to_entity_class_code.replace("$JSON_TO_ENTITY_METHODS", "\n".join(json_to_entity_methods))


    return processor_class_code,json_to_entity_class_code
