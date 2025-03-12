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
    Map<String,Map<String,Set<String>>> fields = new HashMap<>();
    Map<String,Map<String,Set<String>>> dtos = new HashMap<>();



    @Inject
    private ObjectMapper objectMapper;

    public void processInitialEvents(CustomerEntity customerEntity) {
        try {
            $INIT_ENTITY_CALLS

            try(FileOutputStream fos=new FileOutputStream("D:\\projects\\crmsis-1\\fields.json"))
            {

                objectMapper.writerWithDefaultPrettyPrinter().writeValue(fos,fields);
                System.out.println("The file has been written");
            }
            try(FileOutputStream fos=new FileOutputStream("D:\\projects\\crmsis-1\\dtos.json"))
            {

                objectMapper.writerWithDefaultPrettyPrinter().writeValue(fos,dtos);
                System.out.println("The file has been written");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    $INIT_ENTITY_METHODS

}