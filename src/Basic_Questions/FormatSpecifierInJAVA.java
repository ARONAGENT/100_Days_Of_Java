package Basic_Questions;

public class FormatSpecifierInJAVA {
    public static void main(String[] args) {
        int age = 21;
        double marks = 92.456;
        String name = "Rohan";

        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d years%n", age);
        System.out.printf("Marks: %.2f%% %n", marks);  // 2 decimal places
    }

    // Format	Meaning	Example Output
    //%d	Integer	System.out.printf("%d", 5); → 5
    //%f	Floating point (decimal)	%.2f → 2 decimal places
    //%s	String	System.out.printf("%s", "Java");
    //%n	Newline (instead of \n)	System.out.printf("Hi%nBye");
}
