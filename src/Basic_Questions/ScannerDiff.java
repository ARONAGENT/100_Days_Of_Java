package Basic_Questions;

import java.util.Scanner;

public class ScannerDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name using next(): ");
        String name1 = sc.next();  // Stops at space
        sc.nextLine(); // Clear the remaining line (important after next())

        System.out.print("Enter full sentence using nextLine(): ");
        String name2 = sc.nextLine();  // Reads entire line

        System.out.println("Using next(): " + name1);
        System.out.println("Using nextLine(): " + name2);
    }

    // ⚠️ Tip:
    //If you use next() first and then nextLine(), you must clear the newline using sc.nextLine(); before using nextLine().
}
