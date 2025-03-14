package dti.crmsis.back.services;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import dti.crmsis.back.dao.clientsback.*;
import dti.crmsis.back.dao.crmsis.CustomerEntity;
import io.quarkus.panache.common.Page;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.jboss.logging.Logger;

import java.io.*;
import java.util.*;

@ApplicationScoped
public class InitialEventsProcessorGenerated {

    private static final Logger logger = Logger.getLogger(InitialEventsProcessorGenerated.class);

    @Inject
    private ObjectMapper objectMapper;

    public void processInitialEvents(CustomerEntity customerEntity) {
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
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        ActivityEntity entity = new ActivityEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Activities HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Activities processed. Events = " + eventsCount + ", entities = " + entitiesCount);
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
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        ActivityFieldEntity entity = new ActivityFieldEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        entity.key = node.get("key").asText();
                    entity.name = node.get("name").asText();
                    entity.fieldType = node.get("field_type").asText();
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Activity_Fields HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Activity_Fields processed. Events = " + eventsCount + ", entities = " + entitiesCount);
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
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        ActivityTypeEntity entity = new ActivityTypeEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Activity_Types HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Activity_Types processed. Events = " + eventsCount + ", entities = " + entitiesCount);
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
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        CurrencieEntity entity = new CurrencieEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Currencies HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Currencies processed. Events = " + eventsCount + ", entities = " + entitiesCount);
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
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        DealFieldEntity entity = new DealFieldEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        entity.key = node.get("key").asText();
                    entity.name = node.get("name").asText();
                    entity.fieldType = node.get("field_type").asText();
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Deal_Fields HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Deal_Fields processed. Events = " + eventsCount + ", entities = " + entitiesCount);
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
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        DealEntity entity = new DealEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Deals HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Deals processed. Events = " + eventsCount + ", entities = " + entitiesCount);
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
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        LeadLabelEntity entity = new LeadLabelEntity();
                        entity.idPipedrive = UUID.fromString(node.get("id").asText());
                        
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Lead_Labels HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Lead_Labels processed. Events = " + eventsCount + ", entities = " + entitiesCount);
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
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        LeadEntity entity = new LeadEntity();
                        entity.idPipedrive = UUID.fromString(node.get("id").asText());
                        
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Leads HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Leads processed. Events = " + eventsCount + ", entities = " + entitiesCount);
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
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        OrganizationFieldEntity entity = new OrganizationFieldEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        entity.key = node.get("key").asText();
                    entity.name = node.get("name").asText();
                    entity.fieldType = node.get("field_type").asText();
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Organization_Fields HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Organization_Fields processed. Events = " + eventsCount + ", entities = " + entitiesCount);
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
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        OrganizationEntity entity = new OrganizationEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Organizations HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Organizations processed. Events = " + eventsCount + ", entities = " + entitiesCount);
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
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        PersonFieldEntity entity = new PersonFieldEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        entity.key = node.get("key").asText();
                    entity.name = node.get("name").asText();
                    entity.fieldType = node.get("field_type").asText();
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Person_Fields HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Person_Fields processed. Events = " + eventsCount + ", entities = " + entitiesCount);
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
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        PersonEntity entity = new PersonEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Persons HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Persons processed. Events = " + eventsCount + ", entities = " + entitiesCount);
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
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        PipelineEntity entity = new PipelineEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Pipelines HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Pipelines processed. Events = " + eventsCount + ", entities = " + entitiesCount);
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
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        ProductFieldEntity entity = new ProductFieldEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        entity.key = node.get("key").asText();
                    entity.name = node.get("name").asText();
                    entity.fieldType = node.get("field_type").asText();
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Product_Fields HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Product_Fields processed. Events = " + eventsCount + ", entities = " + entitiesCount);
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
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        ProductEntity entity = new ProductEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Products HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Products processed. Events = " + eventsCount + ", entities = " + entitiesCount);
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
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        ProjectEntity entity = new ProjectEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Projects HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Projects processed. Events = " + eventsCount + ", entities = " + entitiesCount);
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
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        RoleEntity entity = new RoleEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Roles HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Roles processed. Events = " + eventsCount + ", entities = " + entitiesCount);
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
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        StageEntity entity = new StageEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Stages HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Stages processed. Events = " + eventsCount + ", entities = " + entitiesCount);
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
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        TaskEntity entity = new TaskEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Tasks HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Tasks processed. Events = " + eventsCount + ", entities = " + entitiesCount);
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
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        UserEntity entity = new UserEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Users HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Users processed. Events = " + eventsCount + ", entities = " + entitiesCount);
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
                JsonNode jsonNode = objectMapper.readTree(event.processedData);
                if(jsonNode.get("success")!=null && jsonNode.get("success").asBoolean()){
                                        JsonNode jsonArray = jsonNode.path("data");
                    for (JsonNode node : jsonArray) {
                        entitiesCount++;
                        WebhookEntity entity = new WebhookEntity();
                        entity.idPipedrive = node.get("id").asInt();
                        
                        entity.json = objectMapper.writeValueAsString(node);
                        entity.persist();
                    }

                }else{
                    logger.warn("Webhooks HAS PROBLEM EVENT. Event id = " + event.id);
                }
            }
            pageIndex++; // Переход к следующей странице
        }
        logger.info("Webhooks processed. Events = " + eventsCount + ", entities = " + entitiesCount);
    }

}