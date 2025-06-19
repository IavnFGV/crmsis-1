package dti.crmsis.back.taskassignment.availability;

public class AvailabilityResult {
    public boolean available;
    public String explanation;

    public AvailabilityResult(boolean available, String explanation) {
        this.available = available;
        this.explanation = explanation;
    }
}