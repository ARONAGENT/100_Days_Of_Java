package java5;
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class Enums {
    public static void main(String[] args) {
        Day today = Day.SATURDAY;

        switch (today) {
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's weekend!");
                break;
            default:
                System.out.println("Weekday.");
        }
    }
}
