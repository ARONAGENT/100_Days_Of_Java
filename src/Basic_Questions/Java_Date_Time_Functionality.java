package Basic_Questions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
//✅ Why this topic?
//Introduced in Java 8 to replace the outdated java.util.Date and Calendar.
//Cleaner, more readable, and thread-safe.
//Frequently used in real-world apps and interview scenarios.

//🧠 Theory Summary:
//Main classes:
//Class	Description
//LocalDate	Date only (no time)
//LocalTime	Time only (no date)
//LocalDateTime	Both date and time
//ZonedDateTime	Date and time with timezone
//DateTimeFormatter	For formatting and parsing dates
public class Java_Date_Time_Functionality {
    public static void main(String[] args) {
        // Current date
        LocalDate date = LocalDate.now();
        System.out.println("Current Date: " + date);

        // Current time
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);

        // Current date and time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + dateTime);

        // Formatting date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Formatted DateTime: " + formattedDateTime);

        // Creating a specific date
        LocalDate birthday = LocalDate.of(2000, 10, 15);
        System.out.println("My Birthday: " + birthday);

        // Add days to a date
        LocalDate nextWeek = date.plusDays(7);
        System.out.println("Date after 7 days: " + nextWeek);
    }
}
