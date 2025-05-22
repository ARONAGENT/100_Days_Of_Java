package Java8_Features.built_in_Functional_interfaces;

import java.util.function.Consumer;
/**
 * 🔹 Purpose:
 * Represents an operation that takes a single argument and returns no result.
 * 🔹 Method:
 * void accept();
 */

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printName = name -> System.out.println("Hello, " + name);
        printName.accept("Rohan"); // Output: Hello, Rohan
    }
}
