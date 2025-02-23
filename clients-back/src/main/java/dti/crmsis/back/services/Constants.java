package dti.crmsis.back.services;

import io.quarkus.runtime.Startup;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class Constants {

    public static final String API_PIPEDRIVE_COM = "https://api.pipedrive.com";
    public static final String V_2 = "/api/v2";
    public static final String V_1 = "/v1";
    public static final int CONSTANTS_START_UP_PRIORITY = 1000;
    public static final int RATE_LIMIT_FILTER_START_UP_PRIORITY = 2000;
    public static final int STARTUP_SERVICE_START_UP_PRIORITY = 5000;

    public static String URL_FOR_WEBHOOKS;
    public static int PAGE_LIMIT;
    public static int MAX_REQUESTS_PER_SECOND;

    @ConfigProperty(name = "URL_FOR_WEBHOOKS")
    public String urlForWebhooks;
    @ConfigProperty(name = "PAGE_LIMIT", defaultValue = "200")
    public Integer pageLimit;
    @ConfigProperty(name = "MAX_REQUESTS_PER_SECOND",defaultValue = "18")
    public Integer maxRequestPerSecond;


    @Startup(CONSTANTS_START_UP_PRIORITY)
    public void start(){
        URL_FOR_WEBHOOKS = urlForWebhooks;
        PAGE_LIMIT = pageLimit;
        MAX_REQUESTS_PER_SECOND = maxRequestPerSecond;
    }

}