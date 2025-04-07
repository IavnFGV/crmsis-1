package dti.crmsis.back.utils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateUtils {


    static DateTimeFormatter exportFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static LocalDateTime parseDateTime(String input) {
        if (input == null || input.isEmpty()) {
            return null;
        }

        if (input.contains("Z")) {//ISO-8601 with Z (e.g. 2025-02-28T00:51:01Z or 2025-02-28T15:40:09.795Z)
            try {
                Instant instant = Instant.parse(input);
                return LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
            } catch (DateTimeParseException ignored) {
                // fallback to other formats
            }
        } else {//Pipedrive export format (e.g. 2024-09-12 05:37:00) — assume UTC
            try {
                LocalDateTime dateTime = LocalDateTime.parse(input, exportFormat);
                return dateTime; // interpreted as UTC
            } catch (DateTimeParseException ignored) {
                // fallback to error
            }

        }
        return null;
    }
}
