package Java14_Featuers;

public class EnhancedSwitching {
    public static void main(String[] args) {
        int value=4;
//        switch (value){
//            case 1:
//                System.out.println("Admin");
//                break;
//            case 2:
//                System.out.println("Manager");
//                break;
//            case 4:
//                System.out.println("User");
//                break;
//            default:
//                System.out.println("Nothing....");
//                break;
//
//        }

        String rolevalue  =switch (value){
            case 1,2 -> "Admin";
            case 4 -> "User";

            default -> throw new IllegalStateException("Unexpected value: " + value);
        };

        System.out.println(rolevalue);

        String day = "MONDAY";

        String result = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY" -> "Weekday";
            case "FRIDAY" -> "Friday vibes!";
            case "SATURDAY", "SUNDAY" -> "Weekend!";
            default -> throw new IllegalStateException("Invalid day: " + day);
        };

        System.out.println(result);



    }
}
