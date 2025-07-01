package dti.crmsis.back.taskassignment.availability;

import dti.crmsis.back.services.TimeZoneService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@ApplicationScoped
public class ManagerAvailabilityService {
    @Inject
    CalendarResolverService resolverService;
    @Inject
    TimeZoneService timeZoneService;

    Map<String, ManagerAvailability> index = new ConcurrentHashMap<>();

    public synchronized void rebuildIndex(List<String> allManagerEmails) {
        index.clear();
        for (String email : allManagerEmails) {
            WorkCalendar calendar = resolverService.resolveForManager(email, timeZoneService.getZoneId());
            index.put(email, ManagerAvailability.fromCalendar(email, calendar));
        }
    }

    public List<String> findAvailable(ZonedDateTime start, Duration duration) {
        return index.entrySet().stream()
                .filter(entry -> entry.getValue().isAvailable(start, duration))
                .map(Map.Entry::getKey)
                .toList();
    }

    public List<String> filterAvailable(List<String> emails, ZonedDateTime start, Duration duration) {
        return emails.stream()
                .filter(email -> {
                    ManagerAvailability availability = index.get(email);
                    return availability != null && availability.isAvailable(start, duration);
                })
                .toList();
    }

    public ManagerAvailability get(String email) {
        return index.get(email);
    }
}
