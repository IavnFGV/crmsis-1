package dti.crmsis.back.taskassignment.dslexecutors.filter;

import dti.crmsis.back.services.TimeZoneService;
import dti.crmsis.back.taskassignment.TaskAssignmentContext;
import dti.crmsis.back.taskassignment.availability.ManagerAvailabilityService;
import dti.crmsis.back.taskassignment.dsl.DslUserFilterByAvailabilityBlock;
import dti.crmsis.back.taskassignment.dsl.DslUserFilterByPermissionBlock;
import dti.crmsis.back.taskassignment.dslexecutors.BlockType;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

@BlockType(DslUserFilterByAvailabilityBlock.TYPE)
@Dependent
public class DslUserFilterByAvailabilityExecutor
        extends DslUserFilterExecutor<DslUserFilterByPermissionBlock> {
    @Inject
    ManagerAvailabilityService managerAvailabilityService;
    @Inject
    TimeZoneService timeZoneService;

    @Override
    public List<String> calculateUsers(TaskAssignmentContext context, List<String> prevList) {
        if (prevList == null || prevList.isEmpty()) {
            return calculateInitialUsers(context);
        }
        ZonedDateTime now = ZonedDateTime.now(timeZoneService.getZoneId());
        return managerAvailabilityService.filterAvailable(prevList,now, Duration.of(1, ChronoUnit.MINUTES));
    }

    @Override
    public List<String> calculateInitialUsers(TaskAssignmentContext context) {
        ZonedDateTime now = ZonedDateTime.now(timeZoneService.getZoneId());
        List<String> available = managerAvailabilityService.findAvailable(now, Duration.of(1, ChronoUnit.MINUTES));
        return available;
    }

}
