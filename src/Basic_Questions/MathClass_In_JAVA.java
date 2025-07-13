package Basic_Questions;
// ✅ What to cover:
//Java’s Math class contains utility methods for mathematical operations
// — no need to import anything (it’s part of java.lang)
public class MathClass_In_JAVA {
    public static void main(String[] args) {
        int a = -10;
        int b = 5;

        System.out.println("Absolute: " + Math.abs(a));
        // Returns the absolute (non-negative) value of 'a'. If a = -10, result is 10.

        System.out.println("Max: " + Math.max(a, b));
        // Returns the greater of 'a' and 'b'. If a = -10, b = 5, result is 5.

        System.out.println("Min: " + Math.min(a, b));
        // Returns the smaller of 'a' and 'b'. If a = -10, b = 5, result is -10.

        System.out.println("Power: " + Math.pow(2, 3));
        // Raises 2 to the power of 3. Result: 8.0

        System.out.println("Square Root: " + Math.sqrt(25));
        // Returns the square root of 25. Result: 5.0

        System.out.println("Random (0-1): " + Math.random());
        // Returns a random double between 0.0 (inclusive) and 1.0 (exclusive)

        System.out.println(Math.round(4.5));
        // Rounds 4.5 to the nearest long. Result: 5

        System.out.println(Math.round(4.4));
        // Rounds 4.4 to the nearest long. Result: 4

        System.out.println(Math.round(-4.6));
        // Rounds -4.6 to the nearest long. Result: -5

        System.out.println(Math.ceil(4.2));
        // Rounds 4.2 up to the nearest integer. Result: 5.0

        System.out.println(Math.ceil(-4.2));
        // Rounds -4.2 up (toward zero) to the nearest integer. Result: -4.0

        System.out.println(Math.floor(4.8));
        // Rounds 4.8 down to the nearest integer. Result: 4.0

        System.out.println(Math.floor(-4.2));
        // Rounds -4.2 down (away from zero) to the nearest integer. Result: -5.0

        System.out.println(Math.toDegrees(Math.PI));
        // Converts π radians to degrees. Result: 180.0

        System.out.println(Math.toRadians(90));
        // Converts 90 degrees to radians. Result: π/2 ≈ 1.5707963267948966

    }
}
