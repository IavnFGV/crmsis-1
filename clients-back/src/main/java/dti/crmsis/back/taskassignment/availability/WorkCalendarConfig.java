package dti.crmsis.back.taskassignment.availability;

import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

public class WorkCalendarConfig {
    public List<WeeklyRule> weekly;
    public List<CalendarException> exceptions;

    public static class WeeklyRule {
        public String day;
        public String from;
        public String to;
        public boolean off = false;
        public List<TimeRange> breaks = List.of();
    }

    public static class CalendarException {
        public String date; // format: yyyy-MM-dd
        public boolean off = false;
        public String from;
        public String to;
    }

    public static class TimeRange {
        public String fromStr;
        public String toStr;
        public LocalTime from;
        public LocalTime to;

        public TimeRange(LocalTime from, LocalTime to) {
            this.from = from;
            this.to = to;
        }

        public void setFrom(String from) {
            this.from = LocalTime.parse(from);
            this.fromStr = from;
        }

        public void setTo(String to) {
            this.to = LocalTime.parse(to);
            this.toStr = to;
        }

        public TimeRange(String fromStr, String toStr) {
            this(LocalTime.parse(fromStr), LocalTime.parse(toStr));
        }

        public boolean contains(LocalTime start, LocalTime end) {
            return !start.isBefore(from) && !end.isAfter(to);
        }

        @Override
        public String toString() {
            return "%s-%s".formatted(from, to);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof TimeRange other)) return false;
            return from.equals(other.from) && to.equals(other.to);
        }

        @Override
        public int hashCode() {
            return Objects.hash(from, to);
        }
    }
}
