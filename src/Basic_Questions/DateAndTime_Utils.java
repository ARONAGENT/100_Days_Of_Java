package Basic_Questions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
/**
 * 🔹 2. What are the main classes in java.time?
  * LocalDate – Date without time (e.g., 2025-06-03)
  * LocalTime – Time without date (e.g., 14:30:00)
  * LocalDateTime – Both date and time (e.g., 2025-06-03T14:30)
  * ZonedDateTime – Date and time with timezone
  * Period – For date-based amounts (e.g., 2 years, 3 days)
  * Duration – For time-based amounts (e.g., 5 hours)
 * DateTimeFormatter – For formatting and parsing dates
 */
public class DateAndTime_Utils {
    public static void main(String[] args) {

        // how to calculate age using period
        LocalDate birthDate = LocalDate.of(2000, 6, 1);
        LocalDate today = LocalDate.now();
        Period age = Period.between(birthDate, today);
        System.out.println("Age: " + age.getYears());

        // how to find current date and time
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        // how to format date
        LocalDate date1 = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date1.format(formatter);
    }
}
