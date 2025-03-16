import os
import re

from genEntities import generate_entities
from genInitialEvent import generate_java_initial_events_processor

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
# 'getNotes',
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

def save_code_to_file(file_name, class_code):
    class_code1 = class_code.replace("\t","    ")
    with open(file_name, "w", encoding="utf-8") as f:
        f.write(class_code1)
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
import dti.crmsis.back.dao.crmsis.CustomerEntity;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.function.Supplier;


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

    
    @Transactional
    protected Long persistEvent(String json, Long rootEventId, String entityType) {
        EventEntity eventEntity = new EventEntity();
        eventEntity.processedData = json;
        eventEntity.comments = "{ \\\"type\\\": \\\"$ENTITY_TYPE\\\"}".replace("$ENTITY_TYPE", entityType);
        eventEntity.parentId = rootEventId;
        eventEntity.persist();
        return eventEntity.id;
    }
    
    public void initClient(CustomerEntity client) {
        String updatedUntil = Instant.now().truncatedTo(ChronoUnit.SECONDS).toString();
        if (!registerWebhook(client)) {
            return;
        }
        long rootEventId = startSyncingData(client, updatedUntil);
        generateInitialEvents(client, updatedUntil, rootEventId);
        stopSyncData(client, updatedUntil, rootEventId);
    }

    @Transactional
    protected void stopSyncData(CustomerEntity client, String updatedUntil, long rootEventId) {
        EventEntity eventEntity = new EventEntity();
        eventEntity.customerName = client.urlPath;
        eventEntity.comments = "{ \\\"type\\\": \\\"STOP_SYNC\\\", \\\"client\\\": \\\"$CUSTOMER_NAME\\\", \\\"updatedUntil\\\": \\\"$UPDATED_UNTIL\\\" }"
                .replace("$CUSTOMER_NAME", eventEntity.customerName)
                .replace("$UPDATED_UNTIL", updatedUntil);
        eventEntity.processedData = "{}";
        eventEntity.parentId = rootEventId;
        eventEntity.persist();
    }
    
    @Transactional
    protected long startSyncingData(CustomerEntity client, String updatedUntil) {
        logger.info("Start syncing data for client " + client.urlPath);

        EventEntity eventEntity = new EventEntity();
        eventEntity.customerName = client.urlPath;
        eventEntity.comments = "{ \\\"type\\\": \\\"START_SYNC\\\", \\\"client\\\": \\\"$CUSTOMER_NAME\\\", \\\"updatedUntil\\\": \\\"$UPDATED_UNTIL\\\" }"
                .replace("$CUSTOMER_NAME", eventEntity.customerName)
                .replace("$UPDATED_UNTIL", updatedUntil);
        eventEntity.processedData = "{}";
        eventEntity.persist();
        return eventEntity.id;
    }

    private boolean registerWebhook(CustomerEntity client) {

        String expectedUrl = Constants.URL_FOR_WEBHOOKS + client.urlPath;
        WebhookResponse response = webhooksRestClientV1.getAll(client.apiToken);
        boolean alreadyRegistered = response.getData().stream().anyMatch(webhookData -> webhookData.getSubscriptionUrl().equals(expectedUrl));
        if (alreadyRegistered) {
            logger.info("Webhook has been already registered!");
            return true;
        }

        NewWebhookRequest request = new NewWebhookRequest(expectedUrl);
        WebhookRegistrationResponse registrationResponse = webhooksRestClientV1.registerNewWebhook(client.apiToken, request);

        if (registrationResponse != null && response.isSuccess()) {
            logger.info("Webhook registered successfully!");
            return true;
        } else {
            logger.info("Cant register webhook!");
        }
        return false;
    }
    
     private String wrapToRetry(Supplier<String> apiCall) {
        try {
            return apiCall.get();
        } catch (Exception e) {
            logger.error("Failed to fetch activity fields", e);
            return "{" +
                   "\\"error\\": \\"" + e.getMessage() + "\\"" +
                   "}";
        }
    }


    protected void generateInitialEvents(CustomerEntity client, String updatedUntil, long rootEventId) {
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


def main():
    # Указываем путь к директории с API-классами
    directory = "..\\clients-back\\src\\main\\java\\dti\\crmsis\\back\\clients\\openapi\\v1\\api"  # Заменить на фактический путь
    api_methods = process_directory(directory)
    java_rest_client = generate_java_rest_client(api_methods)
    java_init_service = generate_java_init_service(api_methods)
    save_code_to_file(file_name="..\\clients-back\\src\\main\\java\\dti\\crmsis\\back\\clients\\generated\\PipedriveRestClientGeneratedV1.java", class_code=java_rest_client)
    save_code_to_file(file_name="..\\clients-back\\src\\main\\java\\dti\\crmsis\\back\\services\\ClientDataExtractorServiceGenerated.java", class_code=java_init_service)
    entity_names =[]
    for file_name, methods in api_methods:
        for annotations, visibility, return_type, method_name, parameters, entity_name in methods:
            if(entity_name):
                entity_names.append(entity_name)
                print(return_type)

    entities,fields = generate_entities(entity_names,api_methods)
    for entity_name, entity_code in entities:
        save_code_to_file("..\\clients-back\\src\\main\\java\\dti\\crmsis\\back\\dao\\clientsback\\"+entity_name+".java", entity_code)

    initial_events_processor = generate_java_initial_events_processor(api_methods,fields)

    save_code_to_file(file_name="..\\clients-back\\src\\main\\java\\dti\\crmsis\\back\\services\\InitialEventsProcessorGenerated.java", class_code=initial_events_processor)

if __name__ == "__main__":
    main()

