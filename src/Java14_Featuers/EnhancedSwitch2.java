package Java14_Featuers;

public class EnhancedSwitch2 {
    public static void main(String[] args) {
        String day ="MONDAY";
        String type = switch (day) {
            case "MONDAY" -> {
                System.out.println("Calculating...");
                yield "Workday";
            }
            default -> "Unknown";
        };

        System.out.println(type);
    }
}
