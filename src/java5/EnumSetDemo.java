package java5;

import java.util.EnumSet;

public class EnumSetDemo {
    public static void main(String[] args) {
        // All days
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        System.out.println("All Days: " + allDays);

        // Working days
        EnumSet<Day> workingDays = EnumSet.range(Day.MONDAY, Day.FRIDAY);
        System.out.println("Working Days: " + workingDays);

        // Weekend
        EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
        System.out.println("Weekend: " + weekend);

        // Complement of weekend (i.e., not weekend)
        EnumSet<Day> notWeekend = EnumSet.complementOf(weekend);
        System.out.println("Not Weekend: " + notWeekend);
    }
}
