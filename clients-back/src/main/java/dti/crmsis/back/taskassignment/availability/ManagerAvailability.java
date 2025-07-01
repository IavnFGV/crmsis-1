package dti.crmsis.back.taskassignment.availability;

import java.time.*;
import java.util.*;

public record ManagerAvailability(
        String email,
        ZoneId zoneId,
        Map<DayOfWeek, List<WorkCalendarConfig.TimeRange>> dailyWindows,
        Set<LocalDate> fullDayExceptions
) {
    public boolean isAvailable(ZonedDateTime dateTime, Duration duration) {
        if (!zoneId.equals(dateTime.getZone())) {
            dateTime = dateTime.withZoneSameInstant(zoneId);
        }
        LocalDate date = dateTime.toLocalDate();
        LocalTime start = dateTime.toLocalTime();
        LocalTime end = start.plus(duration);

        if (fullDayExceptions.contains(date)) return false;

        List<WorkCalendarConfig.TimeRange> ranges = dailyWindows.getOrDefault(dateTime.getDayOfWeek(), List.of());
        return ranges.stream().anyMatch(r -> r.contains(start, end));
    }

    public static ManagerAvailability fromCalendar(String email, WorkCalendar calendar) {
        Map<DayOfWeek, List<WorkCalendarConfig.TimeRange>> daily = new EnumMap<>(DayOfWeek.class);
        Set<LocalDate> exceptions = new HashSet<>();

        for (WorkCalendarConfig config : calendar.getConfigs()) {
            if (config.exceptions != null) {
                for (var e : config.exceptions) {
                    if (Boolean.TRUE.equals(e.off)) {
                        exceptions.add(LocalDate.parse(e.date));
                    }
                }
            }
            if (config.weekly != null) {
                for (var rule : config.weekly) {
                    if (Boolean.TRUE.equals(rule.off)) continue;
                    var day = DayOfWeek.valueOf(rule.day.toUpperCase());
                    List<WorkCalendarConfig.TimeRange> list = daily.computeIfAbsent(day, d -> new ArrayList<>());
                    list.add(new WorkCalendarConfig.TimeRange(rule.from, rule.to));
                }
            }
        }

        return new ManagerAvailability(email, calendar.getZoneId(), daily, exceptions);
    }
}