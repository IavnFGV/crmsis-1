package dti.crmsis.back.services;

import com.fasterxml.jackson.core.JsonProcessingException;
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

import static dti.crmsis.back.services.JsonToEntityServiceAnswer.of;


@ApplicationScoped
public class JsonToEntityServiceGenerated{

    private static final Logger logger = Logger.getLogger(JsonToEntityServiceGenerated.class);

    @Inject
    private ObjectMapper objectMapper;

    @Inject
    KnownFieldService knownFieldService;

    public String writeNodeAsString(JsonNode node) {
        try {
            String s = objectMapper.writeValueAsString(node);
            if (s.startsWith("\"") && s.endsWith("\"")) {
                s = s.substring(1, s.length() - 1);
            }
            return s;
        } catch (JsonProcessingException e) {
            logger.error(e.getMessage(), e);
            return "EMPTY_AS_THERE_WAS_ERROR";
        }
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

    $JSON_TO_ENTITY_METHODS


}
