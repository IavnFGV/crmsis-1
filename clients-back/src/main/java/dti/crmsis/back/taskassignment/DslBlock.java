package dti.crmsis.back.taskassignment;

import java.util.List;
import java.util.Map;

public record DslBlock(
    String type,
    String from,
    List<FilterRule> filters,
    String pass_to,
    ScheduleRule schedule_if_off,
    List<String> members,
    Map<String, Double> weights
) {}