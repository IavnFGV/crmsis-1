package dti.crmsis.back.taskassignment.availability;

import jakarta.enterprise.context.ApplicationScoped;

import java.time.*;
import java.util.List;

@ApplicationScoped
public class UserAvailabilityService {

    public AvailabilityResult checkAvailability(List<WorkDayDto> calendars, LocalDateTime dateTimeUtc) {
        Boolean available = null;
        String explanation = "No matching rules";

        for (WorkDayDto calendar : calendars) {
            ZoneId zoneId = ZoneId.of(calendar.zoneId);
            LocalDateTime localDateTime = dateTimeUtc.atZone(ZoneOffset.UTC)
                    .withZoneSameInstant(zoneId)
                    .toLocalDateTime();

            String dayOfWeek = localDateTime.getDayOfWeek().name();
            LocalDate date = localDateTime.toLocalDate();
            LocalTime time = localDateTime.toLocalTime();

            // Проверка исключений
            if (calendar.exceptions != null) {
                for (WorkDayRuleDto ex : calendar.exceptions) {
                    if (ex.specificDate != null && ex.specificDate.equals(date)) {
                        if (ex.isOff) {
                            return new AvailabilityResult(false, "Exception off in " + calendar.name);
                        }
                        if (ex.from != null && ex.to != null) {
                            if (isWithin(time, ex.from, ex.to, ex.breaks)) {
                                return new AvailabilityResult(true, "Exception match in " + calendar.name);
                            } else {
                                available = false;
                                explanation = "Exception no match interval in " + calendar.name;
                            }
                        }
                    }
                }
            }

            // Проверка недельных правил
            if (calendar.weekly != null) {
                for (WorkDayRuleDto rule : calendar.weekly) {
                    if (rule.day != null && rule.day.equals(dayOfWeek)) {
                        if (rule.isOff) {
                            return new AvailabilityResult(false, "Weekly off in " + calendar.name);
                        }
                        if (rule.from != null && rule.to != null) {
                            if (isWithin(time, rule.from, rule.to, rule.breaks)) {
                                return new AvailabilityResult(true, "Weekly match in " + calendar.name);
                            } else if (available == null) {
                                available = false;
                                explanation = "Weekly no match interval in " + calendar.name;
                            }
                        }
                    }
                }
            }
        }

        if (available != null) {
            return new AvailabilityResult(available, explanation);
        } else {
            return new AvailabilityResult(false, "No matching rules found");
        }
    }

    private boolean isWithin(LocalTime time, String from, String to, List<BreakDto> breaks) {
        LocalTime fromTime = LocalTime.parse(from);
        LocalTime toTime = LocalTime.parse(to);

        if (time.isBefore(fromTime) || time.isAfter(toTime)) {
            return false;
        }

        if (breaks != null) {
            for (BreakDto br : breaks) {
                LocalTime brFrom = LocalTime.parse(br.from);
                LocalTime brTo = LocalTime.parse(br.to);
                if (!time.isBefore(brFrom) && !time.isAfter(brTo)) {
                    return false;
                }
            }
        }

        return true;
    }
}