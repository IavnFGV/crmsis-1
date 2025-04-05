package dti.crmsis.back.services;

import io.quarkus.runtime.Startup;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
@Startup
public class Constants {

    public static final String API_PIPEDRIVE_COM = "https://api.pipedrive.com";
    public static final String V_2 = "/api/v2";
    public static final String V_1 = "/v1";
    public static final int CONSTANTS_START_UP_PRIORITY = 10;
    public static final int RATE_LIMIT_FILTER_START_UP_PRIORITY = 20;
    public static final int LAST_PROCESSED_ID_EXTRACT_PRIORITY = 30;
    public static final int KNOWN_SERVICE_INIT_PRIORITY = 40;
    public static final int STARTUP_SERVICE_START_UP_PRIORITY = 50;
    public static final String INITIAL_LOAD_DONE = "INITIAL_LOAD_DONE";
    public static final String INITIAL_EVENTS_PROCESSED = "INITIAL_EVENTS_PROCESSED";
    public static final String RETRY_NO_HANDLER = "RETRY_NO_HANDLER";
    public static final String LAST_PROCESSED_ID = "LAST_PROCESSED_ID";
    public static final String WEBHOOK_REGISTERED_DATETIME = "WEBHOOK_REGISTERED_DATETIME";
    public static final int STARTUP_SERVICE_ALTERNATIVE_PRIORITY = 10;

    public static String URL_FOR_WEBHOOKS;
    public static int PAGE_LIMIT;
    public static int MAX_REQUESTS_PER_SECOND;

    @ConfigProperty(name = "URL_FOR_WEBHOOKS")
    public String urlForWebhooks;
    @ConfigProperty(name = "PAGE_LIMIT", defaultValue = "200")
    public Integer pageLimit;
    @ConfigProperty(name = "MAX_REQUESTS_PER_SECOND",defaultValue = "18")
    public Integer maxRequestPerSecond;


    public void init(){
        URL_FOR_WEBHOOKS = urlForWebhooks;
        PAGE_LIMIT = pageLimit;
        MAX_REQUESTS_PER_SECOND = maxRequestPerSecond;
    }

}