package dti.crmsis.back.taskassignment.availability;

import java.util.List;

public class WorkDayDto {
    public String name;
    public String zoneId;
    public List<WorkDayRuleDto> weekly;
    public List<WorkDayRuleDto> exceptions;
}