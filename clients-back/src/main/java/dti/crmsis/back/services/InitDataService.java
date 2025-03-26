package dti.crmsis.back.services;

import dti.crmsis.back.dao.clientsback.ExtraInfoEntity;
import dti.crmsis.back.dao.crmsis.CustomerEntity;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;


@ApplicationScoped
public class InitDataService {

    private static final Logger logger = Logger.getLogger(InitDataService.class);


    @Inject
    ClientDataExtractorServiceGenerated clientDataExtractorServiceGenerated;
    @Inject
    InitialEventsProcessorGenerated initialEventsProcessor;
    @ConfigProperty(name = "APP_TOKEN")
    public String apiToken;


    public void start() {
        CustomerEntity customerEntity = getCustomerEntity();
        if (!initialLoadDone()) {
            initClient(customerEntity);
        }
        if (!initialEventsProcessed()) {
            processInitialEvents(customerEntity);
        }
    }

    private void processInitialEvents(CustomerEntity customerEntity) {
        initialEventsProcessor.processInitialEvents(customerEntity);
        markInitialEventsProcessed();
    }

    @Transactional
    protected void markInitialEventsProcessed(){
        ExtraInfoEntity.saveBoolean(Constants.INITIAL_EVENTS_PROCESSED, true);
    }

    private boolean initialEventsProcessed() {
        boolean initialSetupDone = ExtraInfoEntity.getBooleanByName(Constants.INITIAL_EVENTS_PROCESSED);
        if (initialSetupDone) {
            logger.infov("Initial setup already done");
            return true;
        }
        return false;
    }

    protected void initClient(CustomerEntity customerEntity) {
        try {
            if (customerEntity == null) {
                logger.fatalf("THERE IS NO CUSTOMER ENTITY WITH THIS TOKEN. %s PLEASE REGISTER A CUSTOMER FIRST", apiToken);
                throw new IllegalStateException("THERE IS NO CUSTOMER ENTITY WITH THIS TOKEN. PLEASE REGISTER A CUSTOMER FIRST");
            }
            clientDataExtractorServiceGenerated.initClient(customerEntity);
            logger.infof("Client successfully registered");

            markInitialLoadDone();
        } catch (Exception e) {
            System.out.println("Failed to start the application");
        }
    }

    @Transactional
    protected void markInitialLoadDone() {
        ExtraInfoEntity.saveBoolean(Constants.INITIAL_LOAD_DONE, true);
    }

    @Transactional
    protected static boolean initialLoadDone() {
        boolean initialSetupDone = ExtraInfoEntity.getBooleanByName(Constants.INITIAL_LOAD_DONE);
        if (initialSetupDone) {
            logger.infov("Initial setup already done");
            return true;
        }
        return false;
    }

    @Transactional
    protected CustomerEntity getCustomerEntity() {
        CustomerEntity customerEntity = CustomerEntity.find("apiToken", apiToken).firstResult();
        CustomerEntity result = new CustomerEntity();
        result.fullName = customerEntity.fullName;
        result.apiToken = customerEntity.apiToken;
        result.urlPath = customerEntity.urlPath;
        result.url = customerEntity.url;
        return result;
    }

}
