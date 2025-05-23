package Java8_Features.method_Reference;

import java.util.Arrays;
import java.util.List;

/**
 * 🧠 Explanation:
 * name -> MethodReferenceVsTraditional.printName(name) → Traditional lambda way
 * MethodReferenceVsTraditional::printName → Method reference (shorthand for above.
 * Both lines do the exact same thing, but method reference is shorter and cleaner.
 */

public class MethodReferenceVsTraditional {
    public static void printName(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ravi", "Sita", "Geeta");

        // ✅ Traditional Lambda Expression Approach
        System.out.println("Using Lambda:");
        names.forEach(name -> MethodReferenceVsTraditional.printName(name));

        // ✅ Method Reference Approach
        System.out.println("\nUsing Method Reference:");
        names.forEach(MethodReferenceVsTraditional::printName);
    }
}
