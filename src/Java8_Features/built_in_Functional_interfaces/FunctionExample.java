package Java8_Features.built_in_Functional_interfaces;

import java.util.function.Function;
/**
 * 🔹 Purpose:
 * Represents a function that takes one argument and produces a result.
 * 🔹 Method:
 *  apply();
 */

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunction = str -> str.length();
        System.out.println(lengthFunction.apply("Hello")); // Output: 5
    }
}
