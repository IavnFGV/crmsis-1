package dti.crmsis.back.taskassignment.availability;

import java.time.*;
import java.util.List;
import java.util.Optional;

public class WorkCalendar {

    private final List<WorkCalendarConfig> configs;
    private final ZoneId zoneId;

    public List<WorkCalendarConfig> getConfigs() {
        return configs;
    }

    public ZoneId getZoneId() {
        return zoneId;
    }

    public WorkCalendar(List<WorkCalendarConfig> configs, ZoneId zoneId) {
        this.configs = configs;
        this.zoneId = zoneId;
    }

    public boolean isAvailableAt(ZonedDateTime dateTime) {
        return isAvailableForDuration(dateTime, Duration.ZERO);
    }

    public boolean isAvailableForDuration(ZonedDateTime dateTime, Duration duration) {
        LocalDate date = dateTime.toLocalDate();
        LocalTime startTime = dateTime.toLocalTime();
        LocalTime endTime = startTime.plus(duration);
        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();

        for (WorkCalendarConfig config : configs) {
            Optional<WorkCalendarConfig.CalendarException> exception = config.exceptions != null ?
                    config.exceptions.stream().filter(e -> e.date.equals(date.toString())).findFirst()
                    : Optional.empty();

            if (exception.isPresent()) {
                var ex = exception.get();
                if (ex.off) return false;
                if (ex.from != null && ex.to != null && isRangeWithin(startTime, endTime, ex.from, ex.to)) return true;
                return false;
            }

            if (config.weekly != null) {
                for (var rule : config.weekly) {
                    if (DayOfWeek.valueOf(rule.day.toUpperCase()) == dayOfWeek) {
                        if (rule.off) return false;
                        if (!isRangeWithin(startTime, endTime, rule.from, rule.to)) return false;
                        if (rule.breaks != null) {
                            for (var br : rule.breaks) {
                                if (rangesOverlap(startTime, endTime, br.from, br.to)) return false;
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean isInRange(LocalTime time, String from, String to) {
        LocalTime fromTime = LocalTime.parse(from);
        LocalTime toTime = LocalTime.parse(to);
        return !time.isBefore(fromTime) && time.isBefore(toTime);
    }

    private boolean isRangeWithin(LocalTime start, LocalTime end, String from, String to) {
        LocalTime fromTime = LocalTime.parse(from);
        LocalTime toTime = LocalTime.parse(to);
        return !start.isBefore(fromTime) && !end.isAfter(toTime);
    }

    private boolean rangesOverlap(LocalTime start, LocalTime end, String breakFrom, String breakTo) {
        LocalTime breakStart = LocalTime.parse(breakFrom);
        LocalTime breakEnd = LocalTime.parse(breakTo);
        return !start.isAfter(breakEnd) && !end.isBefore(breakStart);
    }
}
