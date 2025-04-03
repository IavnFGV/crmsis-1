package dti.crmsis.back.services;

import dti.crmsis.back.dao.clientsback.ExtraInfoEntity;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.jboss.logging.Logger;


@ApplicationScoped
public class InitDataService {

    private static final Logger logger = Logger.getLogger(InitDataService.class);

    @Inject
    ClientDataExtractorServiceGenerated clientDataExtractorServiceGenerated;
    @Inject
    InitialEventsProcessorGenerated initialEventsProcessor;
    @Inject
    CustomerDetailsService detailsService;

    public void start() {
        CustomerDetailsService.CustomerInfo customerInfo = detailsService.getCustomerInfo();
        if (!initialLoadDone()) {
            initClient(customerInfo);
        }
        if (!initialEventsProcessed()) {
            processInitialEvents();
        }
    }

    private void processInitialEvents() {
        initialEventsProcessor.processInitialEvents();
        markInitialEventsProcessed();
    }

    @Transactional
    protected void markInitialEventsProcessed(){
        ExtraInfoEntity.saveBoolean(Constants.INITIAL_EVENTS_PROCESSED, true);
    }

    private boolean initialEventsProcessed() {
        boolean initialSetupDone = ExtraInfoEntity.getBooleanByName(Constants.INITIAL_EVENTS_PROCESSED);
        if (initialSetupDone) {
            logger.infof("%s already done",Constants.INITIAL_EVENTS_PROCESSED);
            return true;
        }
        return false;
    }

    protected void initClient(CustomerDetailsService.CustomerInfo customerInfo) {
        try {
            clientDataExtractorServiceGenerated.initClient(customerInfo);
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
            logger.infof("%s already done", Constants.INITIAL_LOAD_DONE);
            return true;
        }
        return false;
    }
}
