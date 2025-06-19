package dti.crmsis.back.taskassignment.availability;

import java.util.List;

public class WorkDayRuleDto {
    public String day; // MONDAY и т.д.
    public java.time.LocalDate specificDate;
    public String from;
    public String to;
    public boolean isOff;
    public List<BreakDto> breaks;
}