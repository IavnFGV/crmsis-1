import os
import re

mandatory_methods =[
# 'getActivities',
'getActivitiesCollection',
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
# 'getPipelinesAsJson',
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
    # Шаг 1: Найти аннотации + метод без параметров
    method_pattern = re.compile(
        r'((?:\s*@(?:[\w.]+)(?:\([^)]*\))?\s*)+)'  # Аннотации (включая без параметров)
        r'\s*(public|private|protected)\s+([\w<>]+)\s+(\w+)\s*'  # Метод (модификатор, тип, имя)
        r'\(',  # Открывающая скобка параметров (но без их обработки)
        re.MULTILINE
    )

    # Шаг 2: Найти параметры метода (разрешая переносы строк)
    param_pattern = re.compile(
        r'((?:\s*@(?:[\w.]+)(?:\([^)]*\))?\s*)*'  # Аннотации параметров
        r'\s*[\w<>]+\s+[\w]+\s*(?:,\s*)*)+',  # Тип + имя параметра (убираем лишнюю скобку)
        re.MULTILINE
    )

    extracted_methods = []

    for match in re.finditer(method_pattern, content):
        annotations = match.group(1).strip()
        visibility = match.group(2).strip()
        return_type = match.group(3).strip()
        method_name = match.group(4).strip()

        # Найти параметры после метода (ускоренный поиск)
        param_match = param_pattern.search(content, match.end())
        parameters = param_match.group(0).strip() if param_match else ""

        new_parameters =[]

        if (not "@jakarta.ws.rs.GET" in annotations):
            continue

        for annotation in annotations.splitlines():
            if "@jakarta.ws.rs.Path" in annotation:
                if "{id}" in annotation:
                    continue
        if method_name not in mandatory_methods:
            continue

        for param in parameters.split(","):
            new_param=""
            for param_part in param.split("@"):
                if param_part.startswith("jakarta.ws.rs.QueryParam"):
                    new_param+=("@"+param_part)
            new_parameters.append(new_param)

        annotations = [annotation for annotation in annotations.splitlines() if "@jakarta.ws.rs.Path" not in annotation]

        new_path = ""
        for annotation in annotations:
            if "@io.quarkiverse.openapi.generator.markers.OperationMarker(name=\"api_key" in annotation:
                split = annotation.split('path="/v1/')
                new_path ="/"+split[1]
        annotations+=[f"@jakarta.ws.rs.Path(\"{new_path}"]


        # print(f"Found method: {method_name}, returns: {return_type}, annotations: \n{annotations}, parameters: \n{parameters}")
        print(f"{method_name} {new_parameters}")
        extracted_methods.append((annotations, visibility, return_type, method_name, new_parameters))

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

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.inject.Inject;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.reactive.RestStreamElementType;

import dti.crmsis.back.LoggingFilter;
import dti.crmsis.back.RateLimitFilter;
import dti.crmsis.back.services.Constants;

import java.math.BigDecimal;
import java.util.List;


@RegisterRestClient(baseUri = Constants.API_PIPEDRIVE_COM + Constants.V_1)
@RestStreamElementType(MediaType.APPLICATION_JSON)
@RegisterProvider(LoggingFilter.class)
@RegisterProvider(RateLimitFilter.class)
public interface PipedriveRestClientGeneratedV1.java {


"""

    for file_name, methods in api_methods:
        for annotations, visibility, return_type, method_name, parameters in methods:
            class_code += f"    {'\n\t '.join(annotations)}\n"
            class_code += f"    public String {method_name}({',\n\t\t '.join(parameters)});\n\n"

    class_code += "}"  # Закрываем класс
    return class_code

def save_code_to_file(file_name, class_code):
    with open(file_name, "w", encoding="utf-8") as f:
        f.write(class_code)
    print(f"{file_name} has been created.")


def generate_java_init_service(api_methods):
    class_code = """package dti.crmsis.back.clients.generated;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.inject.Inject;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.reactive.RestStreamElementType;

import dti.crmsis.back.LoggingFilter;
import dti.crmsis.back.RateLimitFilter;
import dti.crmsis.back.services.Constants;

import java.math.BigDecimal;
import java.util.List;


@RegisterRestClient(baseUri = Constants.API_PIPEDRIVE_COM + Constants.V_1)
@RestStreamElementType(MediaType.APPLICATION_JSON)
@RegisterProvider(LoggingFilter.class)
@RegisterProvider(RateLimitFilter.class)
public interface PipedriveRestClientGeneratedV1.java {


"""


def main():
    # Указываем путь к директории с API-классами
    directory = "D:\\projects\\crmsis-1\\clients-back\\src\\main\\java\\dti\\crmsis\\back\\clients\\openapi\\v1\\api"  # Заменить на фактический путь
    api_methods = process_directory(directory)
    java_rest_client = generate_java_rest_client(api_methods)
    java_init_service = generate_java_init_service(api_methods)
    save_code_to_file(file_name="GeneratedApi.java", class_code=java_rest_client)

if __name__ == "__main__":
    main()

