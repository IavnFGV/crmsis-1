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


def generate_init_entity_method(method_tuple):
    annotations, visibility, return_type, method_name, new_parameters, entity_name = method_tuple

    entity_name_titled = entity_name.lower().title()

    words = [word[0].upper() + word[1:] for word in entity_name[0:-1].replace("_", " ").lower().split()]
    entity_class_name = "".join(words) + "Entity"
    entity_class_name = entity_class_name.replace("Activitie", "Activity")

    method_code = read_template("initial_event_processor_init_entity_method_body")

    persisting_code_common = read_template("initial_event_processor_init_entity_persisting_code")

    common_id_extractor ='entity.idPipedrive = node.get("id").asInt();'
    uuid_id_extractor ='entity.idPipedrive = UUID.fromString(node.get("id").asText());'

    other_fields_extractors =[]

    id_extractor = common_id_extractor

    if return_type in ("GetLeadLabelsResponse", "GetLeadsResponse"):
        id_extractor = uuid_id_extractor
    elif entity_name.endswith("FIELDS"):
        other_fields_extractors.append('entity.key = node.get("key").asText();')
        other_fields_extractors.append('entity.name = node.get("name").asText();')
        other_fields_extractors.append('entity.fieldType = node.get("field_type").asText();')
    method_code = method_code.replace("$PERSISTING_CODE", persisting_code_common)

    method_code = method_code.replace("$ENTITY_NAME_TITLED", entity_name_titled) \
        .replace("$OTHER_FIELDS_EXTRACTOR", "\n\t\t\t\t\t".join(other_fields_extractors)) \
        .replace("$ID_EXTRACTOR", id_extractor) \
        .replace("$ENTITY_CLASS_NAME", entity_class_name) \
        .replace("$ENTITY_NAME", entity_name)
        # .replace("$METHOD_RESPONSE_CLASS", return_type) \
        # .replace("$METHOD_RESPONSE_DATA_DTO_CLASS", calculate_dto_class_name(return_type))
    method_call = "init$ENTITY_NAME_TITLED()"
    method_call = method_call.replace("$ENTITY_NAME_TITLED", entity_name_titled)

    return (method_code, method_call)


def generate_java_initial_events_processor(api_methods):
    class_code = read_template("initial_event_processor_template")

    init_entity_calls = []
    init_entity_methods = []

    for file_name, methods in api_methods:
        for method in methods:
            entity_name = method[5]
            if (not entity_name):
                continue
            entity_method, method_call = generate_init_entity_method(method)

            init_entity_calls.append(method_call)
            init_entity_methods.append(entity_method)

    class_code = (class_code.replace("$INIT_ENTITY_METHODS", "\n".join(init_entity_methods))
                            .replace("$INIT_ENTITY_CALLS",   '\n\t\t\t\t'.join([item + ';' for item in init_entity_calls])))
    return class_code
