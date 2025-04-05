import os
import re

from genEntities import generate_entities, EntityFieldDeclaration
from genInitialEvent import generate_java_initial_events_processor

from typing import List, Dict

import subprocess

def format_javacode(java_code: str) -> str:
    """Formats Java code using google-java-format."""
    process = subprocess.run(
        ["D:\\java\\openjdk-23.0.1\\bin\\java.exe", "-jar", "google-java-format.jar", "--aosp", "-"],
        input=java_code.encode("utf-8"),
        stdout=subprocess.PIPE,
        stderr=subprocess.PIPE,
    )
    if process.returncode != 0:
        raise RuntimeError(f"Formatting failed: {process.stderr.decode()}")
    return process.stdout.decode("utf-8")

mandatory_methods =[
'getActivities',
# 'getActivitiesCollection',
# 'getActivity',
'getActivityFields',
'getActivityTypes',
# 'getCompanyAddons',
# 'getCallLog',
# 'getUserCallLogs',
'getCurrencies',
# 'getDealField',
'getDealFields',
# 'getDeal',
# 'getDealActivities',
# 'getDealChangelog',
# 'getDealFiles',
# 'getDealFollowers',
# 'getDealMailMessages',
# 'getDealParticipants',
# 'getDealParticipantsChangelog',
# 'getDealPersons',
# 'getDealProducts',
# 'getDealUpdates',
# 'getDealUsers',
# 'getDeals',
'getDealsCollection',
# 'getDealsSummary',
# 'getDealsTimeline',
# 'searchDeals',
# 'getFile',
# 'getFiles',
# 'getFilter',
# 'getFilterHelpers',
# 'getFilters',
# 'getGoalResult',
# 'getGoals',
# 'searchItem',
# 'searchItemByField',
'getLeadLabels',
# 'getLead',
# 'getLeadUsers',
'getLeads',
# 'searchLeads',
# 'getLeadSources',
# 'getTeam',
# 'getTeamUsers',
# 'getTeams',
# 'getUserTeams',
# 'getMailMessage',
# 'getMailThread',
# 'getMailThreadMessages',
# 'getMailThreads',
# 'getNoteFields',
# 'getComment',
# 'getNote',
# 'getNoteComments',
'getNotes',
# 'getOrganizationField',
'getOrganizationFields',
# 'getOrganizationRelationship',
# 'getOrganizationRelationships',
# 'getOrganization',
# 'getOrganizationActivities',
# 'getOrganizationChangelog',
# 'getOrganizationDeals',
# 'getOrganizationFiles',
# 'getOrganizationFollowers',
# 'getOrganizationMailMessages',
# 'getOrganizationPersons',
# 'getOrganizationUpdates',
# 'getOrganizationUsers',
# 'getOrganizations',
'getOrganizationsCollection',
# 'searchOrganization',
# 'getPermissionSet',
# 'getPermissionSetAssignments',
# 'getPermissionSets',
# 'getPersonField',
'getPersonFields',
# 'getPerson',
# 'getPersonActivities',
# 'getPersonChangelog',
# 'getPersonDeals',
# 'getPersonFiles',
# 'getPersonFollowers',
# 'getPersonMailMessages',
# 'getPersonProducts',
# 'getPersonUpdates',
# 'getPersonUsers',
# 'getPersons',
'getPersonsCollection',
# 'searchPersons',
# 'getPipeline',
# 'getPipelineConversionStatistics',
# 'getPipelineDeals',
# 'getPipelineMovementStatistics',
'getPipelines',
# 'getProductField',
'getProductFields',
# 'getProduct',
# 'getProductDeals',
# 'getProductFiles',
# 'getProductFollowers',
# 'getProductUsers',
'getProducts',
# 'searchProducts',
# 'getProject',
# 'getProjectActivities',
# 'getProjectGroups',
# 'getProjectPlan',
# 'getProjectTasks',
'getProjects',
# 'getProjectsBoards',
# 'getProjectsPhases',
# 'getProjectTemplate',
# 'getProjectTemplates',
# 'getProjectsBoard',
# 'getProjectsPhase',
# 'getRecents',
# 'getRole',
# 'getRoleAssignments',
# 'getRolePipelines',
# 'getRoleSettings',
'getRoles',
# 'getStage',
# 'getStageDeals',
'getStages',
# 'findSubscriptionByDeal',
# 'getSubscription',
# 'getSubscriptionPayments',
# 'getTask',
'getTasks',
# 'getUserConnections',
# 'findUsersByName',
# 'getCurrentUser',
# 'getUser',
# 'getUserFollowers',
# 'getUserPermissions',
# 'getUserRoleAssignments',
# 'getUserRoleSettings',
'getUsers',
# 'getUserSettings',
'getWebhooks',

]

def extract_methods(file_path):
    with open(file_path, 'r', encoding='utf-8') as file:
        content = file.read()

    # print(f"Processing file: {file_path}")

    # Шаг 1: Найти аннотации + метод без параметров
    # method_pattern = re.compile(
    #     r'((?:\s*@(?:[\w.]+)(?:\([^)]*\))?\s*)+)'  # Аннотации (включая без параметров)
    #     r'\s*(public|private|protected)\s+([\w<>]+)\s+([gG]et[A-Z][a-zA-Z]+(?:Collection)?)\s*'  # Метод (модификатор, тип, имя)
    #     r'\(',  # Открывающая скобка параметров (но без их обработки)
    #     re.MULTILINE
    # )
    #
    # # Шаг 2: Найти параметры метода (разрешая переносы строк)
    # param_pattern = re.compile(
    #     r'((?:\s*@(?:[\w.]+)(?:\([^)]*\))?\s*)*'  # Аннотации параметров
    #     r'\s*[\w<>]+\s+[\w]+\s*(?:,\s*)*)+',  # Тип + имя параметра (убираем лишнюю скобку)
    #     re.MULTILINE
    # )



    # Шаг 1: Найти аннотации + метод без параметров
    method_pattern = re.compile(
        r'((?:\s*@(?:[\w.]+)(?:\([^)]*\))?\s*)*)'  # Аннотации (если есть)
        r'\s*(public|private|protected)\s+([\w<>]+)\s+(\w+)\s*'  # Модификатор, тип, имя метода
        r'\((.*?)\)\s*(?=\{|;)',  # Ограничение: метод должен заканчиваться на `);` или `) {`
        re.MULTILINE | re.DOTALL
    )

    # Шаг 2: Найти параметры метода (разрешая переносы строк)
    param_pattern = re.compile(
        r'('
        r'(?:'
        r'\s*(?:@(?:[\w.]+)(?:\([^)]*\))?\s*)*'  # Опциональные аннотации (могут быть несколько)
        r'\s*([\w<>]+)\s+([\w]+)\s*'  # Тип параметра + имя параметра
        r'(?:,\s*)?'  # Опциональная запятая (если есть ещё параметры)
        r')*'  # Повторяем шаблон для нескольких параметров
        r')',
        re.MULTILINE | re.DOTALL
    )

    remove_generated_param_re = r'@io\.quarkiverse\.openapi\.generator\.annotations\.GeneratedParam\("[^"]+"\)\s*'


    extracted_methods = []

    for match in re.finditer(method_pattern, content):
        annotations = match.group(1).strip()
        visibility = match.group(2).strip()
        return_type = match.group(3).strip()
        method_name = match.group(4).strip()

        raw_params = match.group(5).strip()


        # Найти параметры после метода (ускоренный поиск)
        param_match = param_pattern.search(raw_params)
        parameters = param_match.group(1).strip() if param_match else ""

        new_parameters =[]

        # if (not "@jakarta.ws.rs.GET" in annotations):
        #     continue

        # for annotation in annotations.splitlines():
        #     if "@jakarta.ws.rs.Path" in annotation:
        #         if "{id}" in annotation:
        #             continue
        # if method_name not in mandatory_methods:
        #     continue

        for param in parameters.split(","):
            new_param=re.sub(remove_generated_param_re, "", param).strip()
            new_parameters.append(new_param)

        annotations = [annotation.strip() for annotation in annotations.splitlines() if "@jakarta.ws.rs.Path" not in annotation]

        new_path = ""
        for annotation in annotations:
            if "@io.quarkiverse.openapi.generator.markers.OperationMarker(name=\"api_key" in annotation:
                split = annotation.split('path="/v1/')
                new_path ="/"+split[1]
        annotations+=[f"@jakarta.ws.rs.Path(\"{new_path}"]


        # print(f"Found method: {method_name}, returns: {return_type}, annotations: \n{annotations}, parameters: \n{parameters}")
        # print(f"{method_name} {new_parameters}")
        entity_name = None
        if returnListOfEntities(annotations, visibility, return_type, method_name, parameters):
            entity_name=method_name.replace("get","").replace("Collection","").upper().replace("FIELDS","_FIELDS").replace("TYPES","_TYPES").replace("LABELS","_LABELS")
            if entity_name.endswith("FIELDS"):
                entity_name = "REF_"+entity_name
        extracted_methods.append((annotations, visibility, return_type, method_name, new_parameters, entity_name))
    return extracted_methods

def process_directory(directory):
    api_methods = []

    for file_name in os.listdir(directory):
        if file_name.endswith(".java"):
            file_path = os.path.join(directory, file_name)
            methods = extract_methods(file_path)
            if methods:
                api_methods.append((file_name, methods))

    return api_methods


def generate_java_rest_client(api_methods):
    class_code = """package dti.crmsis.back.clients.generated;

import dti.crmsis.back.LoggingFilter;
import dti.crmsis.back.RateLimitFilter;

import dti.crmsis.back.clients.openapi.v1.model.*;
import dti.crmsis.back.services.Constants;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.reactive.RestStreamElementType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import static dti.crmsis.back.clients.openapi.v1.api.CallLogsApi.AddCallLogAudioFileMultipartForm;
import static dti.crmsis.back.clients.openapi.v1.api.FilesApi.*;
import static dti.crmsis.back.clients.openapi.v1.api.MailboxApi.UpdateMailThreadDetailsMultipartForm;
import static dti.crmsis.back.clients.openapi.v1.api.PersonsApi.AddPersonPictureMultipartForm;

@RegisterRestClient(baseUri = Constants.API_PIPEDRIVE_COM + Constants.V_1)
@RestStreamElementType(MediaType.APPLICATION_JSON)
@RegisterProvider(LoggingFilter.class)
@RegisterProvider(RateLimitFilter.class)
public interface PipedriveRestClientGeneratedV1 {


"""

    for file_name, methods in api_methods:
        for annotations, visibility, return_type, method_name, parameters, entity_names in methods:
            class_code += f"    {'\n\t '.join(annotations)}\n"
            class_code += f"    public {return_type} {method_name}({',\n\t\t '.join(parameters)});\n\n"

            if(method_name in mandatory_methods):
                class_code += f"    {'\n\t '.join(annotations)}\n"
                class_code += f"    public String {method_name}AsJson({',\n\t\t '.join(parameters)});\n\n"



    class_code += "}"  # Закрываем класс
    return class_code

def save_code_to_file(file_name, code, is_java=True):
    if is_java:
        formatted_code = code
        # formatted_code = format_javacode(code)
    else:
        formatted_code = code
    with open(file_name, "w", encoding="utf-8") as f:
        f.write(formatted_code)
    print(f"{file_name} has been created.")


def returnListOfEntities(annotations, visibility, return_type, method_name, parameters):
    if (not "@jakarta.ws.rs.GET" in annotations):
        return False
    for annotation in annotations:
        if "@jakarta.ws.rs.Path" in annotation:
            if "{id}" in annotation:
                return False
    return method_name in mandatory_methods


def generate_java_init_service(api_methods):
    class_code = """package dti.crmsis.back.services;

import dti.crmsis.back.clients.generated.PipedriveRestClientGeneratedV1;
import dti.crmsis.back.clients.WebhooksRestClientV1;
import dti.crmsis.back.clients.dto.NewWebhookRequest;
import dti.crmsis.back.clients.dto.WebhookRegistrationResponse;
import dti.crmsis.back.clients.dto.WebhookResponse;
import dti.crmsis.back.dao.clientsback.EventEntity;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;
import dti.crmsis.back.dao.clientsback.ExtraInfoEntity;

import java.time.ZoneOffset;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.function.Supplier;

import static dti.crmsis.back.services.Constants.WEBHOOK_REGISTERED_DATETIME;

@ApplicationScoped
public class ClientDataExtractorServiceGenerated {

    private static final Logger logger = Logger.getLogger(ClientDataExtractorServiceGenerated.class);

    @Inject
    @RestClient
    PipedriveRestClientGeneratedV1 pipedriveRestClientGeneratedV1;
    
    @Inject
    @RestClient
    WebhooksRestClientV1 webhooksRestClientV1;

    @Inject
    PagingServiceV1 pagingServiceV1;

    @Inject
    PagingServiceV2 pagingServiceV2;
    
    @Inject 
    CustomerDetailsService customerDetailsService;

    
    @Transactional
    protected Long persistEvent(String json, Long rootEventId, String entityType) {
        EventEntity eventEntity = new EventEntity();
        eventEntity.processedData = json;
        eventEntity.comments = "{ \\\"type\\\": \\\"$ENTITY_TYPE\\\"}".replace("$ENTITY_TYPE", entityType);
        eventEntity.parentId = rootEventId;
        eventEntity.persist();
        return eventEntity.id;
    }
    
    public void initClient(CustomerDetailsService.CustomerInfo customerInfo) {
        String updatedUntil = Instant.now().truncatedTo(ChronoUnit.SECONDS).toString();
        if (!registerWebhook(customerInfo)) {
            return;
        }
        long rootEventId = startSyncingData(customerInfo, updatedUntil);
        generateInitialEvents(updatedUntil, rootEventId);
        stopSyncData(customerInfo, updatedUntil, rootEventId);
    }

    @Transactional
    protected void stopSyncData(CustomerDetailsService.CustomerInfo client, String updatedUntil, long rootEventId) {
        EventEntity eventEntity = new EventEntity();
        eventEntity.customerName = client.getName();
        eventEntity.comments = "{ \\\"type\\\": \\\"STOP_SYNC\\\", \\\"client\\\": \\\"$CUSTOMER_NAME\\\", \\\"updatedUntil\\\": \\\"$UPDATED_UNTIL\\\" }"
                .replace("$CUSTOMER_NAME", eventEntity.customerName)
                .replace("$UPDATED_UNTIL", updatedUntil);
        eventEntity.processedData = "{}";
        eventEntity.parentId = rootEventId;
        eventEntity.persist();
    }
    
    @Transactional
    protected long startSyncingData(CustomerDetailsService.CustomerInfo client, String updatedUntil) {
        logger.info("Start syncing data for client " + client.getName());

        EventEntity eventEntity = new EventEntity();
        eventEntity.customerName = client.getName();
        eventEntity.comments = "{ \\\"type\\\": \\\"START_SYNC\\\", \\\"client\\\": \\\"$CUSTOMER_NAME\\\", \\\"updatedUntil\\\": \\\"$UPDATED_UNTIL\\\" }"
                .replace("$CUSTOMER_NAME", eventEntity.customerName)
                .replace("$UPDATED_UNTIL", updatedUntil);
        eventEntity.processedData = "{}";
        eventEntity.persist();
        return eventEntity.id;
    }

    private boolean registerWebhook(CustomerDetailsService.CustomerInfo customerInfo) {

        String expectedUrl = Constants.URL_FOR_WEBHOOKS + customerInfo.getName();
        LocalDateTime dateTime = ExtraInfoEntity.getDateTime(WEBHOOK_REGISTERED_DATETIME);

        if (dateTime!=null) {
            logger.info("Webhook has been already registered!");
            return true;
        }

        WebhookResponse response = webhooksRestClientV1.getAll(customerInfo.getApiToken());
        boolean alreadyRegistered =
                response.getData().stream()
                        .anyMatch(
                                webhookData ->
                                        webhookData.getSubscriptionUrl().equals(expectedUrl));

        if (alreadyRegistered) {
            logger.info("Webhook has been already registered!");
            return true;
        }

        NewWebhookRequest request = new NewWebhookRequest(expectedUrl);
        WebhookRegistrationResponse registrationResponse =
                webhooksRestClientV1.registerNewWebhook(customerInfo.getApiToken(), request);

        if (registrationResponse != null && response.isSuccess()) {
            saveWebhookRegisteringTime();
            logger.info("Webhook registered successfully!");
            return true;
        } else {
            logger.info("Cant register webhook!");
        }
        return false;
    }

    private static void saveWebhookRegisteringTime() {
        ExtraInfoEntity.saveDateTime(WEBHOOK_REGISTERED_DATETIME, LocalDateTime.now(ZoneOffset.UTC));
    }
    
 private String wrapToRetry(Supplier<String> apiCall) {
        int retry = 0;
        String exceptionDecr = "[";
        while (true) {
            try {
                return apiCall.get();
            } catch (Exception e) {
                retry++;
                logger.error("Failed to fetch activity fields", e);

                exceptionDecr += ("{\\"error\\":" + e.getMessage() + "\\"},");
                if (retry > 5) {
                    if (exceptionDecr.endsWith(",")) {
                        exceptionDecr = exceptionDecr.substring(0, exceptionDecr.length() - 1);
                    }
                    exceptionDecr += "]";
                    return exceptionDecr;
                }
            }
        }
    }


    protected void generateInitialEvents(String updatedUntil, long rootEventId) {
"""

    for file_name, methods in api_methods:
        for annotations, visibility, return_type, method_name, parameters, entity_name in methods:
            if(not entity_name):
                continue
            method_type = "NO_PARAMS"
            for parameter in parameters:
                # print(f"parameter: {parameter}")
                if('String cursor' in parameter):
                    method_type = "CURSOR"
                    break
                if("Integer start" in parameter):
                    method_type = "PAGING"
                    break

            if method_type == "NO_PARAMS":
                def build_actual_params(parameters):
                    actual_params = []
                    if(len(parameters)==1 and parameters[0]==""):
                        return ""
                    for parameter in parameters:
                        actual_params.append("null")
                    return ",".join(actual_params)
                actual_params = build_actual_params(parameters)
                call_template= (f'persistEvent(wrapToRetry(()->pipedriveRestClientGeneratedV1.$METHOD_NAMEAsJson($PARAMS)) , rootEventId, "$ENTITY_NAME");'.replace("$METHOD_NAME", method_name).replace("$ENTITY_NAME", entity_name)).replace("$PARAMS", actual_params)
                class_code += call_template

            elif method_type == "CURSOR":
                call_template = """pagingServiceV2.fetchAllDataNew(rootEventId,
                (cursor) -> {
                
                    return wrapToRetry(()-> pipedriveRestClientGeneratedV1.$METHOD_NAMEAsJson($PARAMS));
                },
                (json, rootEvent) -> persistEvent(json, rootEvent, "$ENTITY_NAME"));"""

                def build_actual_params(parameters):
                    actual_params = []
                    for parameter in parameters:
                        if "cursor" in parameter:
                            actual_params.append("cursor")
                        elif "Integer limit" in parameter:
                            actual_params.append("Constants.PAGE_LIMIT")
                        else:
                            actual_params.append("null")
                    return ",".join(actual_params)

                actual_params = build_actual_params(parameters)
                call_template = call_template.replace("$METHOD_NAME", method_name)\
                                .replace("$ENTITY_NAME", entity_name)\
                                .replace("$PARAMS", actual_params)
                class_code += call_template
            elif method_type == "PAGING":
                call_template = """pagingServiceV1.fetchAllDataNew(
                rootEventId,
                start-> wrapToRetry(()->pipedriveRestClientGeneratedV1.$METHOD_NAMEAsJson($PARAMS)),
                (String json, Long rootEvent) -> persistEvent(json, rootEvent, "$ENTITY_NAME"));
                """
                def build_actual_params(parameters):
                    actual_params = []
                    for parameter in parameters:
                        if "Integer start" in parameter:
                            actual_params.append("start")
                        elif "Integer limit" in parameter:
                            actual_params.append("Constants.PAGE_LIMIT")
                        else:
                            actual_params.append("null")
                    return ",".join(actual_params)

                actual_params = build_actual_params(parameters)
                call_template = call_template.replace("$METHOD_NAME", method_name) \
                .replace("$ENTITY_NAME", entity_name) \
                .replace("$PARAMS", actual_params)
                class_code += call_template
            class_code += "\n"
    class_code += "}"  # close method
    class_code += "}"  # close class
    return class_code


to_entity_type_in_webhook={'ACTIVITIES':'activity',
                           'REF_ACTIVITY_FIELDS':'ref_activity_field',
                           'ACTIVITY_TYPES':'activity_type',
                           'CURRENCIES':'currency',
                           'REF_DEAL_FIELDS':'ref_deal_field',
                           'DEALS':'deal',
                           'NOTES':'note',
                           'LEAD_LABELS':'lead_label',
                           'REF_ORGANIZATION_FIELDS':'ref_organization_field',
                           'REF_PERSON_FIELDS':'ref_person_field',
                           'PERSONS':'person',
                           'PIPELINES':'pipeline',
                           'REF_PRODUCT_FIELDS':'ref_product_field',
                           'PRODUCTS':'product',
                           'ROLES':'roles',
                           'STAGES':'stage',
                           'USERS':'user',
                           'WEBHOOKS':'webhook'}


def to_entity_type(entity_name):
    return to_entity_type_in_webhook.get(entity_name,None)


def in_base_table(aux_name_in_dto):
    if len(aux_name_in_dto)!=40:
        return "TRUE"
    return "FALSE"


def save_known_fields(fields: Dict[str, List[EntityFieldDeclaration]]):
    insert_statements = []
    for entity_name, fields in fields.items():
        entity_type=to_entity_type(entity_name)
        if not entity_type:
            continue
        for field in fields:
            insert = f"INSERT INTO KNOWN_FIELDS(PIPEDRIVE_NAME_IN_JSON,MAIN_ENTITY_TYPE_NAME,IN_BASE_TABLE) values " \
                     f"('{field.aux_name_in_dto}','{to_entity_type(entity_name)}',{in_base_table(field.aux_name_in_dto)});"
            insert_statements.append(insert)
    return insert_statements


def main():
    # Указываем путь к директории с API-классами
    directory = "..\\clients-back\\src\\main\\java\\dti\\crmsis\\back\\clients\\openapi\\v1\\api"  # Заменить на фактический путь
    api_methods = process_directory(directory)
    java_rest_client = generate_java_rest_client(api_methods)
    java_init_service = generate_java_init_service(api_methods)
    save_code_to_file(file_name="..\\clients-back\\src\\main\\java\\dti\\crmsis\\back\\clients\\generated\\PipedriveRestClientGeneratedV1.java", code=java_rest_client)
    save_code_to_file(file_name="..\\clients-back\\src\\main\\java\\dti\\crmsis\\back\\services\\ClientDataExtractorServiceGenerated.java", code=java_init_service)
    entity_names =[]
    for file_name, methods in api_methods:
        for annotations, visibility, return_type, method_name, parameters, entity_name in methods:
            if(entity_name):
                entity_names.append(entity_name)
                print(return_type)

    entities,fields = generate_entities(entity_names,api_methods)
    for entity_name, entity_code in entities:
        save_code_to_file("..\\clients-back\\src\\main\\java\\dti\\crmsis\\back\\dao\\clientsback\\"+entity_name+".java", entity_code)

    initial_events_processor, json_to_entity = generate_java_initial_events_processor(api_methods,fields)

    known_fields = save_known_fields(fields)
    save_code_to_file(file_name="known_fields.sql", code="\n".join(known_fields), is_java=False)
    save_code_to_file(file_name="..\\clients-back\\src\\main\\java\\dti\\crmsis\\back\\services\\InitialEventsProcessorGenerated.java", code=initial_events_processor)
    save_code_to_file(file_name="..\\clients-back\\src\\main\\java\\dti\\crmsis\\back\\services\\JsonToEntityServiceGenerated.java", code=json_to_entity)

if __name__ == "__main__":
    main()

