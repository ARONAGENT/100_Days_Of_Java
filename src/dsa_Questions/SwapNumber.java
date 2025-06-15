package dsa_Questions;

public class SwapNumber {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before Swapping:");
        System.out.println("a = " + a + ", b = " + b);

        // ✅ Swapping using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter Swapping using temp variable:");
        System.out.println("a = " + a + ", b = " + b);

        // ✅ Swapping without using a third variable (arithmetic method)
        a = a + b; // Now a = 15
        b = a - b; // Now b = 15 - 10 = 5
        a = a - b; // Now a = 15 - 5 = 10

        System.out.println("\nAfter Swapping without temp variable:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
