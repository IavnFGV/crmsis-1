package dti.crmsis.back.services;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import dti.crmsis.back.dao.clientsback.*;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import dti.crmsis.back.dao.crmsis.CustomerEntity;
import io.quarkus.panache.common.Page;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.jboss.logging.Logger;
import java.util.stream.Collectors;
import java.util.concurrent.ThreadPoolExecutor;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.Instant;
import java.time.ZoneOffset;

import java.io.*;
import java.util.*;

@ApplicationScoped
public class InitialEventsProcessorGenerated {

    private static final Logger logger = Logger.getLogger(InitialEventsProcessorGenerated.class);

    @Inject
    private ObjectMapper objectMapper;

    @Inject
    private ThreadPoolExecutor executorService;

    public void processInitialEvents(CustomerEntity customerEntity) {
        try {
            $INIT_ENTITY_CALLS
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public PanacheEntityBase saveCustomField(String mainEntityClassName, Long mainEntityId, String customFieldName, String value) {
        if(value == null || value.isEmpty()) {
            return null;
        }
        switch (mainEntityClassName) {
            case "ActivityEntity":
                ActivityCustomFieldEntity  activityCustomFieldEntity = new ActivityCustomFieldEntity();
                activityCustomFieldEntity.mainEntityId = mainEntityId;
                activityCustomFieldEntity.key = customFieldName;
                activityCustomFieldEntity.value = value;
                return activityCustomFieldEntity;
            case "DealEntity":
                DealCustomFieldEntity  dealCustomFieldEntity = new DealCustomFieldEntity();
                dealCustomFieldEntity.mainEntityId = mainEntityId;
                dealCustomFieldEntity.key = customFieldName;
                dealCustomFieldEntity.value = value;
                return dealCustomFieldEntity;
            case "OrganizationEntity":
                OrganizationCustomFieldEntity organizationCustomFieldEntity = new OrganizationCustomFieldEntity();
                organizationCustomFieldEntity.mainEntityId = mainEntityId;
                organizationCustomFieldEntity.key = customFieldName;
                organizationCustomFieldEntity.value = value;
                return organizationCustomFieldEntity;
            case "PersonEntity":
                PersonCustomFieldEntity  personCustomFieldEntity = new PersonCustomFieldEntity();
                personCustomFieldEntity.mainEntityId = mainEntityId;
                personCustomFieldEntity.key = customFieldName;
                personCustomFieldEntity.value = value;
                return personCustomFieldEntity;
            case "ProductEntity":
                ProductCustomFieldEntity productCustomFieldEntity = new ProductCustomFieldEntity();
                productCustomFieldEntity.mainEntityId = mainEntityId;
                productCustomFieldEntity.key = customFieldName;
                productCustomFieldEntity.value = value;
                return productCustomFieldEntity;
            default:
                logger.warn("Unknown main entity type: " + mainEntityClassName);
                break;
        }
        return null;
    }

    protected   List<EventEntity> getEventEntities(int pageIndex, int pageSize, String entityName) {
        List<EventEntity> events = EventEntity.find("JSON_EXTRACT(comments, '$.type') = ?1 ORDER BY ID ASC", entityName)
                .page(Page.of(pageIndex, pageSize))
                .list();
        return events;
    }

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public void persistEntities(List<PanacheEntityBase> entities,String entityName){
        logger.infof("Persisting %d entities of type %s", entities.size(), entityName);
        PanacheEntityBase.persist(entities);
    }

    public void  persistEntitiesAsync(List<PanacheEntityBase> entities,String entityName){
        logger.infof("active %d queue %d max %d",executorService.getActiveCount(),executorService.getQueue().size(), executorService.getLargestPoolSize());
        executorService.submit(() -> persistEntities(entities, entityName));
    }

    public LocalDateTime parseDateTime(String dateStr) {
        if (dateStr == null || dateStr.isEmpty()) {
            return null;
        }
        LocalDateTime dateTime;
        try {
            dateTime = LocalDateTime.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        } catch (DateTimeParseException e1) {
            try {
                dateTime = LocalDateTime.parse(dateStr, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
            } catch (DateTimeParseException e2) {
                dateTime = LocalDateTime.ofInstant(Instant.parse(dateStr), ZoneOffset.UTC);
            }
        }
        return dateTime;
    }

    public LocalDate parseDate(String dateStr) {
        if (dateStr == null || dateStr.isEmpty()) {
            return null;
        }
        LocalDate localDate = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return localDate;
    }


    $INIT_ENTITY_METHODS

}