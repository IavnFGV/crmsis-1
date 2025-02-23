package dti.crmsis.back.services;

import dti.crmsis.back.LoggingFilter;
import dti.crmsis.back.dao.clientsback.ExtraInfoEntity;
import dti.crmsis.back.dao.crmsis.CustomerEntity;
import io.quarkus.runtime.Startup;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import jakarta.enterprise.context.ApplicationScoped;
import org.jboss.logging.Logger;


@ApplicationScoped
public class StartupService {

    private static final Logger logger = Logger.getLogger(StartupService.class);


    @Inject
    ClientRegistrationService clientRegistrationService;

    @ConfigProperty(name = "APP_TOKEN")
    public String apiToken;

    @Startup(5000)
    public void start() {
        if (alreadyInitted()) return;
        CustomerEntity customerEntity = getCustomerEntity();
        initClient(customerEntity);
    }

    @Transactional
    protected void initClient(CustomerEntity customerEntity) {
        try {
            if (customerEntity == null) {
                logger.fatalf("THERE IS NO CUSTOMER ENTITY WITH THIS TOKEN. %s PLEASE REGISTER A CUSTOMER FIRST", apiToken);
                throw new IllegalStateException("THERE IS NO CUSTOMER ENTITY WITH THIS TOKEN. PLEASE REGISTER A CUSTOMER FIRST");
            }
            clientRegistrationService.initClient(customerEntity);
            logger.infof("Client successfully registered");

            ExtraInfoEntity.saveBoolean("INITIAL_SETUP_DONE", true);
        } catch (Exception e) {
            System.out.println("Failed to start the application");
            return;
        }
    }

    @Transactional
    protected static boolean alreadyInitted() {
        boolean initialSetupDone = ExtraInfoEntity.getBooleanByName("INITIAL_SETUP_DONE");
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
