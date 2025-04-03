package dti.crmsis.back.services;

import jakarta.enterprise.context.ApplicationScoped;

import java.time.ZoneId;

@ApplicationScoped
public class TimeZoneService {

    private static TimeZoneService instance;

    public static TimeZoneService getInstance() {
        return instance;
    }

    ZoneId kievZoneId = ZoneId.of("Europe/Kiev");

    public ZoneId getZoneId() {
        return kievZoneId;
    }

    public void init(TimeZoneService timeZoneService) {
        instance = timeZoneService;
    }

}
