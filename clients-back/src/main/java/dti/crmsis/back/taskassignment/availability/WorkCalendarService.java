package dti.crmsis.back.taskassignment.availability;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dti.crmsis.back.dao.app.WorkDayEntity;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Comparator;
import java.util.List;

@ApplicationScoped
public class WorkCalendarService {
    @Inject
    ObjectMapper objectMapper;

    public WorkCalendar buildFor(List<WorkDayEntity> calendarEntities, ZoneId targetZone) {
        List<WorkCalendarConfig> configs = calendarEntities.stream()
                .sorted(Comparator.comparingInt(e -> -e.priority))
                .map(e -> {
                    try {
                        WorkCalendarConfig config = objectMapper.readValue(e.configJson, WorkCalendarConfig.class);
                        ZoneId sourceZone = ZoneId.of(e.timeZone);
                        if (!sourceZone.equals(targetZone)) {
                            convertConfigToZone(config, sourceZone, targetZone);
                        }
                        return config;
                    } catch (JsonProcessingException ex) {
                        throw new RuntimeException("Invalid config for: " + e.name, ex);
                    }
                })
                .toList();

        return new WorkCalendar(configs, targetZone);
    }

    private void convertConfigToZone(WorkCalendarConfig config, ZoneId fromZone, ZoneId toZone) {
        if (config.weekly != null) {
            for (var rule : config.weekly) {
                rule.from = convertTime(rule.from, fromZone, toZone);
                rule.to = convertTime(rule.to, fromZone, toZone);
                if (rule.breaks != null) {
                    for (var br : rule.breaks) {
                        br.from = convertTime(br.from, fromZone, toZone);
                        br.to = convertTime(br.to, fromZone, toZone);
                    }
                }
            }
        }
        if (config.exceptions != null) {
            for (var ex : config.exceptions) {
                if (ex.from != null && ex.to != null) {
                    ex.from = convertTime(ex.from, fromZone, toZone);
                    ex.to = convertTime(ex.to, fromZone, toZone);
                }
            }
        }
    }

    private String convertTime(String timeStr, ZoneId fromZone, ZoneId toZone) {
        LocalTime localTime = LocalTime.parse(timeStr);
        ZonedDateTime zdt = ZonedDateTime.of(LocalDate.now(), localTime, fromZone);
        ZonedDateTime converted = zdt.withZoneSameInstant(toZone);
        return converted.toLocalTime().toString();
    }

}
