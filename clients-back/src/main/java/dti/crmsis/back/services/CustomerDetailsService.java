package dti.crmsis.back.services;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class CustomerDetailsService {

    @ConfigProperty(name = "app.token")
    private String apiToken;

    @ConfigProperty(name = "customer.full.name")
    private String fullName;

    @ConfigProperty(name = "customer.name")
    private String name;

    @ConfigProperty(name = "customer.pipedrive.url")
    private String pipedriveUrl;

    public String getApiToken() {
        return apiToken;
    }

    public String getFullName() {
        return fullName;
    }


    public String getName() {
        return name;
    }

    public String getPipedriveUrl() {
        return pipedriveUrl;
    }

    public CustomerInfo getCustomerInfo() {
        return new CustomerInfo(this);
    }


    public static class CustomerInfo {

        private final CustomerDetailsService detailsService;

        public CustomerInfo(CustomerDetailsService detailsService) {
            this.detailsService = detailsService;

        }

        public String getApiToken() {
            return detailsService.getApiToken();
        }

        public String getFullName() {
            return detailsService.getFullName();
        }

        public String getName() {
            return detailsService.getName();
        }

        public String getPipedriveUrl() {
            return detailsService.getPipedriveUrl();
        }
    }
    @PostConstruct
    void printConfig() {
        System.out.println(">>> [TEST] APP_TOKEN = " + apiToken);
    }
}
