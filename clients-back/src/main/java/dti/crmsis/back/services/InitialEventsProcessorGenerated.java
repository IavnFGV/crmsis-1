package dti.crmsis.back.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import dti.crmsis.back.clients.openapi.v1.model.*;
import dti.crmsis.back.dao.clientsback.*;
import dti.crmsis.back.dao.crmsis.CustomerEntity;
import io.quarkus.panache.common.Page;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
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
            initActivities();
            initActivity_Fields();
            initActivity_Types();
            initCurrencies();
            initDeal_Fields();
            initDeals();
            initLead_Labels();
            initLeads();
            initOrganization_Fields();
            initOrganizations();
            initPerson_Fields();
            initPersons();
            initPipelines();
            initProduct_Fields();
            initProducts();
            initProjects();
            initRoles();
            initStages();
            initTasks();
            initUsers();
            initWebhooks();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Transactional
    public void initActivities() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "ACTIVITIES")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                GetActivitiesCollectionResponse response = objectMapper.readValue(event.processedData, GetActivitiesCollectionResponse.class);

                List<ActivityCollectionResponseObject> data = response.getData();
                for (ActivityCollectionResponseObject dto : data) {
                    entitiesCount++;

                    ActivityEntity entity = new ActivityEntity();
                    entity.idPipedrive = dto.getId();
                    entity.json = objectMapper.writeValueAsString(dto);
                    entity.persist();
                }

            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Activities processed. Events = " + eventsCount + ", deals = " + entitiesCount);
    }

    @Transactional
    public void initActivity_Fields() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "ACTIVITY_FIELDS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                GetFieldsResponse response = objectMapper.readValue(event.processedData, GetFieldsResponse.class);

                List<GetField> data = response.getData();
                for (GetField dto : data) {
                    entitiesCount++;

                    ActivityFieldEntity entity = new ActivityFieldEntity();
                    entity.idPipedrive = dto.getId();
                    entity.json = objectMapper.writeValueAsString(dto);
                    entity.persist();
                }

            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Activity_Fields processed. Events = " + eventsCount + ", deals = " + entitiesCount);
    }

    @Transactional
    public void initActivity_Types() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "ACTIVITY_TYPES")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                GetActivityTypesResponse response = objectMapper.readValue(event.processedData, GetActivityTypesResponse.class);

                List<ActivityType> data = response.getData();
                for (ActivityType dto : data) {
                    entitiesCount++;

                    ActivityTypeEntity entity = new ActivityTypeEntity();
                    entity.idPipedrive = dto.getId();
                    entity.json = objectMapper.writeValueAsString(dto);
                    entity.persist();
                }

            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Activity_Types processed. Events = " + eventsCount + ", deals = " + entitiesCount);
    }

    @Transactional
    public void initCurrencies() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "CURRENCIES")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                GetCurrenciesResponse response = objectMapper.readValue(event.processedData, GetCurrenciesResponse.class);

                List<GetCurrenciesResponseDataInner> data = response.getData();
                for (GetCurrenciesResponseDataInner dto : data) {
                    entitiesCount++;

                    CurrencieEntity entity = new CurrencieEntity();
                    entity.idPipedrive = dto.getId();
                    entity.json = objectMapper.writeValueAsString(dto);
                    entity.persist();
                }

            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Currencies processed. Events = " + eventsCount + ", deals = " + entitiesCount);
    }

    @Transactional
    public void initDeal_Fields() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "DEAL_FIELDS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                GetFieldsResponse response = objectMapper.readValue(event.processedData, GetFieldsResponse.class);

                List<GetField> data = response.getData();
                for (GetField dto : data) {
                    entitiesCount++;

                    DealFieldEntity entity = new DealFieldEntity();
                    entity.idPipedrive = dto.getId();
                    entity.json = objectMapper.writeValueAsString(dto);
                    entity.persist();
                }

            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Deal_Fields processed. Events = " + eventsCount + ", deals = " + entitiesCount);
    }

    @Transactional
    public void initDeals() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "DEALS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                GetDealsCollectionResponse response = objectMapper.readValue(event.processedData, GetDealsCollectionResponse.class);

                List<DealCollectionResponseObject> data = response.getData();
                for (DealCollectionResponseObject dto : data) {
                    entitiesCount++;

                    DealEntity entity = new DealEntity();
                    entity.idPipedrive = dto.getId();
                    entity.json = objectMapper.writeValueAsString(dto);
                    entity.persist();
                }

            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Deals processed. Events = " + eventsCount + ", deals = " + entitiesCount);
    }

    @Transactional
    public void initLead_Labels() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "LEAD_LABELS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                GetLeadLabelsResponse response = objectMapper.readValue(event.processedData, GetLeadLabelsResponse.class);

                List<LeadLabel> data = response.getData();
                for (LeadLabel dto : data) {
                    entitiesCount++;

                    LeadLabelEntity entity = new LeadLabelEntity();
                    entity.idPipedrive = dto.getId();
                    entity.json = objectMapper.writeValueAsString(dto);
                    entity.persist();
                }

            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Lead_Labels processed. Events = " + eventsCount + ", deals = " + entitiesCount);
    }

    @Transactional
    public void initLeads() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "LEADS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                GetLeadsResponse response = objectMapper.readValue(event.processedData, GetLeadsResponse.class);

                List<Lead> data = response.getData();
                for (Lead dto : data) {
                    entitiesCount++;

                    LeadEntity entity = new LeadEntity();
                    entity.idPipedrive = dto.getId();
                    entity.json = objectMapper.writeValueAsString(dto);
                    entity.persist();
                }

            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Leads processed. Events = " + eventsCount + ", deals = " + entitiesCount);
    }

    @Transactional
    public void initOrganization_Fields() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "ORGANIZATION_FIELDS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                GetFieldsResponse response = objectMapper.readValue(event.processedData, GetFieldsResponse.class);

                List<GetField> data = response.getData();
                for (GetField dto : data) {
                    entitiesCount++;

                    OrganizationFieldEntity entity = new OrganizationFieldEntity();
                    entity.idPipedrive = dto.getId();
                    entity.json = objectMapper.writeValueAsString(dto);
                    entity.persist();
                }

            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Organization_Fields processed. Events = " + eventsCount + ", deals = " + entitiesCount);
    }

    @Transactional
    public void initOrganizations() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "ORGANIZATIONS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                GetOrganizationsCollection200Response response = objectMapper.readValue(event.processedData, GetOrganizationsCollection200Response.class);

                List<GetOrganizationsCollectionResponseObject> data = response.getData();
                for (GetOrganizationsCollectionResponseObject dto : data) {
                    entitiesCount++;

                    OrganizationEntity entity = new OrganizationEntity();
                    entity.idPipedrive = dto.getId();
                    entity.json = objectMapper.writeValueAsString(dto);
                    entity.persist();
                }

            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Organizations processed. Events = " + eventsCount + ", deals = " + entitiesCount);
    }

    @Transactional
    public void initPerson_Fields() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "PERSON_FIELDS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                GetFieldsResponse response = objectMapper.readValue(event.processedData, GetFieldsResponse.class);

                List<GetField> data = response.getData();
                for (GetField dto : data) {
                    entitiesCount++;

                    PersonFieldEntity entity = new PersonFieldEntity();
                    entity.idPipedrive = dto.getId();
                    entity.json = objectMapper.writeValueAsString(dto);
                    entity.persist();
                }

            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Person_Fields processed. Events = " + eventsCount + ", deals = " + entitiesCount);
    }

    @Transactional
    public void initPersons() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "PERSONS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                GetPersonsCollection200Response response = objectMapper.readValue(event.processedData, GetPersonsCollection200Response.class);

                List<PersonsCollectionResponseObject> data = response.getData();
                for (PersonsCollectionResponseObject dto : data) {
                    entitiesCount++;

                    PersonEntity entity = new PersonEntity();
                    entity.idPipedrive = dto.getId();
                    entity.json = objectMapper.writeValueAsString(dto);
                    entity.persist();
                }

            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Persons processed. Events = " + eventsCount + ", deals = " + entitiesCount);
    }

    @Transactional
    public void initPipelines() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "PIPELINES")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                GetPipelinesResponse response = objectMapper.readValue(event.processedData, GetPipelinesResponse.class);

                List<BasePipelineWithSelectedFlag> data = response.getData();
                for (BasePipelineWithSelectedFlag dto : data) {
                    entitiesCount++;

                    PipelineEntity entity = new PipelineEntity();
                    entity.idPipedrive = dto.getId();
                    entity.json = objectMapper.writeValueAsString(dto);
                    entity.persist();
                }

            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Pipelines processed. Events = " + eventsCount + ", deals = " + entitiesCount);
    }

    @Transactional
    public void initProduct_Fields() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "PRODUCT_FIELDS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                GetProductFieldsResponse response = objectMapper.readValue(event.processedData, GetProductFieldsResponse.class);

                List<GetProductFieldsResponseDataInner> data = response.getData();
                for (GetProductFieldsResponseDataInner dto : data) {
                    entitiesCount++;

                    ProductFieldEntity entity = new ProductFieldEntity();
                    entity.idPipedrive = dto.getId();
                    entity.json = objectMapper.writeValueAsString(dto);
                    entity.persist();
                }

            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Product_Fields processed. Events = " + eventsCount + ", deals = " + entitiesCount);
    }

    @Transactional
    public void initProducts() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "PRODUCTS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                GetProductsResponse1 response = objectMapper.readValue(event.processedData, GetProductsResponse1.class);

                List<GetProductResponse> data = response.getData();
                for (GetProductResponse dto : data) {
                    entitiesCount++;
                    ProductEntity entity = new ProductEntity();
                    ProductListItemProduct innerDto = dto.getData();
                    entity.idPipedrive = innerDto.getId().intValue();
                    entity.json = objectMapper.writeValueAsString(innerDto);
                    entity.persist();
                }

            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Products processed. Events = " + eventsCount + ", deals = " + entitiesCount);
    }

    @Transactional
    public void initProjects() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "PROJECTS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                GetProjectsResponse response = objectMapper.readValue(event.processedData, GetProjectsResponse.class);

                List<ProjectResponseObject> data = response.getData();
                for (ProjectResponseObject dto : data) {
                    entitiesCount++;

                    ProjectEntity entity = new ProjectEntity();
                    entity.idPipedrive = dto.getId();
                    entity.json = objectMapper.writeValueAsString(dto);
                    entity.persist();
                }

            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Projects processed. Events = " + eventsCount + ", deals = " + entitiesCount);
    }

    @Transactional
    public void initRoles() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "ROLES")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                GetRolesResponse response = objectMapper.readValue(event.processedData, GetRolesResponse.class);

                List<FullRole> data = response.getData();
                for (FullRole dto : data) {
                    entitiesCount++;

                    RoleEntity entity = new RoleEntity();
                    entity.idPipedrive = dto.getId();
                    entity.json = objectMapper.writeValueAsString(dto);
                    entity.persist();
                }

            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Roles processed. Events = " + eventsCount + ", deals = " + entitiesCount);
    }

    @Transactional
    public void initStages() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "STAGES")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                GetStagesResponse response = objectMapper.readValue(event.processedData, GetStagesResponse.class);

                List<GetStagesResponseDataInner> data = response.getData();
                for (GetStagesResponseDataInner dto : data) {
                    entitiesCount++;

                    StageEntity entity = new StageEntity();
                    entity.idPipedrive = dto.getId();
                    entity.json = objectMapper.writeValueAsString(dto);
                    entity.persist();
                }

            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Stages processed. Events = " + eventsCount + ", deals = " + entitiesCount);
    }

    @Transactional
    public void initTasks() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "TASKS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                GetTasksResponse response = objectMapper.readValue(event.processedData, GetTasksResponse.class);

                List<TaskResponseObject> data = response.getData();
                for (TaskResponseObject dto : data) {
                    entitiesCount++;

                    TaskEntity entity = new TaskEntity();
                    entity.idPipedrive = dto.getId();
                    entity.json = objectMapper.writeValueAsString(dto);
                    entity.persist();
                }

            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Tasks processed. Events = " + eventsCount + ", deals = " + entitiesCount);
    }

    @Transactional
    public void initUsers() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "USERS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                GetUsersResponse response = objectMapper.readValue(event.processedData, GetUsersResponse.class);

                List<BaseUser> data = response.getData();
                for (BaseUser dto : data) {
                    entitiesCount++;

                    UserEntity entity = new UserEntity();
                    entity.idPipedrive = dto.getId();
                    entity.json = objectMapper.writeValueAsString(dto);
                    entity.persist();
                }

            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Users processed. Events = " + eventsCount + ", deals = " + entitiesCount);
    }

    @Transactional
    public void initWebhooks() throws IOException {
        int pageIndex = 0;
        int pageSize = 40;
        int eventsCount = 0;
        int entitiesCount = 0;
        while (true) {
            List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", "WEBHOOKS")
                    .page(Page.of(pageIndex, pageSize))
                    .list();

            if (events.isEmpty()) {
                break;
            }

            for (EventEntity event : events) {
                eventsCount++;
                GetWebhooksResponse response = objectMapper.readValue(event.processedData, GetWebhooksResponse.class);

                List<BaseWebhook> data = response.getData();
                for (BaseWebhook dto : data) {
                    entitiesCount++;

                    WebhookEntity entity = new WebhookEntity();
                    entity.idPipedrive = dto.getId();
                    entity.json = objectMapper.writeValueAsString(dto);
                    entity.persist();
                }

            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Webhooks processed. Events = " + eventsCount + ", deals = " + entitiesCount);
    }


}
    