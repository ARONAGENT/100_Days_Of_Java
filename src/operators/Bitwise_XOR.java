package operators;

public class Bitwise_XOR {
    public static void main(String[] args) {
        int a = 5;   // binary: 0101
        int b = 3;   // binary: 0011

        int result = a ^ b; // XOR each bit

        System.out.println("a = " + a + " (" + Integer.toBinaryString(a) + ")");
        System.out.println("b = " + b + " (" + Integer.toBinaryString(b) + ")");
        System.out.println("a ^ b = " + result + " (" + Integer.toBinaryString(result) + ")");

        // XOR property: x ^ x = 0, x ^ 0 = x
        System.out.println("5 ^ 5 = " + (5 ^ 5));
        System.out.println("5 ^ 0 = " + (5 ^ 0));

        // XOR swap example
        int x = 10, y = 15;
        System.out.println("\nBefore Swap: x = " + x + ", y = " + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After Swap: x = " + x + ", y = " + y);
    }
}
