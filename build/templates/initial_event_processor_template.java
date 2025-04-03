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

    @Inject
    JsonToEntityServiceGenerated jsonService;

    public void processInitialEvents() {
        try {
            $INIT_ENTITY_CALLS
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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


    $INIT_ENTITY_METHODS

}