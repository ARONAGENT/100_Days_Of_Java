package Basic_Questions;

import java.util.ArrayList;

public class WrapperClassDemo {

    public static void main(String[] args) {

        // 🔹 1. Manual Boxing (Converting primitive to object)
        int a = 10;
        Integer boxedA = Integer.valueOf(a); // Boxing
        System.out.println("Manual Boxing: " + boxedA);

        // 🔹 2. Manual Unboxing (Converting object to primitive)
        Integer b = new Integer(20);
        int unboxedB = b.intValue();         // Unboxing
        System.out.println("Manual Unboxing: " + unboxedB);

        // 🔹 3. Autoboxing (Automatically done by Java)
        int c = 30;
        Integer autoBoxed = c;               // Autoboxing
        System.out.println("Autoboxed: " + autoBoxed);

        // 🔹 4. Auto-unboxing (Automatically done by Java)
        Integer d = 40;
        int autoUnboxed = d;                 // Auto-unboxing
        System.out.println("Auto-unboxed: " + autoUnboxed);

        // 🔹 5. Wrapper class utility methods
        String numStr = "123";
        int parsed = Integer.parseInt(numStr);       // Converts string to int
        System.out.println("Parsed from String: " + parsed);

        int max = Integer.max(10, 20);               // Returns max value
        System.out.println("Max of 10 and 20: " + max);

        // 🔹 6. Wrapper objects in collection
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100); // autoboxing
        list.add(200);
        System.out.println("ArrayList of Integer: " + list);
    }
}
