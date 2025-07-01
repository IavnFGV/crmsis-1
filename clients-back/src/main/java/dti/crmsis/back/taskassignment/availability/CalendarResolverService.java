package dti.crmsis.back.taskassignment.availability;

import dti.crmsis.back.dao.app.CalendarAssignmentEntity;
import dti.crmsis.back.dao.app.ManagerGroupEntity;
import dti.crmsis.back.dao.app.WorkDayEntity;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.time.ZoneId;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@ApplicationScoped
public class CalendarResolverService {

    @Inject
    WorkCalendarService calendarService;

    public WorkCalendar resolveForManager(String email, ZoneId targetZone) {
        List<String> groupCodes = ManagerGroupEntity.<ManagerGroupEntity>find("managerEmail", email)
            .stream()
            .map(g -> g.groupCode)
            .toList();

        List<CalendarAssignmentEntity> assignments = CalendarAssignmentEntity.find(
                "(ownerType = ?1 and ownerId = ?2) or (ownerType = ?3 and ownerId in ?4)",
                "USER", email,
                "GROUP", groupCodes
        ).list();

        Set<Long> seen = new HashSet<>();
        List<WorkDayEntity> calendars = assignments.stream()
                .map(a -> a.calendar)
                .filter(c -> seen.add(c.id)) // гарантированно уникально по ID
                .toList();

        return calendarService.buildFor(calendars, targetZone);
    }
}
