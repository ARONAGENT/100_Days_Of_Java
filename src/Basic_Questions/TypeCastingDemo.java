package Basic_Questions;

public class TypeCastingDemo {

    public static void main(String[] args) {

        // 🔷 Implicit Type Casting (Widening Conversion)
        int intVal = 100;
        long longVal = intVal;          // int to long
        float floatVal = longVal;       // long to float
        double doubleVal = floatVal;    // float to double

        System.out.println("🔹 Implicit Type Casting:");
        System.out.println("int to long: " + longVal);
        System.out.println("long to float: " + floatVal);
        System.out.println("float to double: " + doubleVal);

        // 🔷 Explicit Type Casting (Narrowing Conversion)
        double d = 99.99;
        float f = (float) d;            // double to float
        long l = (long) f;              // float to long
        int i = (int) l;                // long to int
        byte b = (byte) i;              // int to byte

        System.out.println("\n🔹 Explicit Type Casting:");
        System.out.println("double to float: " + f);
        System.out.println("float to long: " + l);
        System.out.println("long to int: " + i);
        System.out.println("int to byte: " + b);
    }
}
