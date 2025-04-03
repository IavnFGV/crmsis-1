package dti.crmsis.back.services;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class CustomerDetailsService {

    @ConfigProperty(name = "APP_TOKEN")
    private String apiToken;

    @ConfigProperty(name = "CUSTOMER_FULL_NAME")
    private String fullName;

    @ConfigProperty(name = "CUSTOMER_NAME")
    private String name;

    @ConfigProperty(name = "CUSTOMER_PIPEDRIVE_URL")
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
}
