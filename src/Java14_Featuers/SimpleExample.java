package Java14_Featuers;

public class SimpleExample {
    public static void main(String[] args) {
        char grade = 'B';

        String result = switch (grade) {
            case 'A' -> "Excellent";
            case 'B' -> "Good";
            case 'C' -> "Average";
            case 'D' -> "Below Average";
            case 'F' -> "Fail";
            default -> "Invalid Grade";
        };

        System.out.println("Result: " + result);
    }
}
