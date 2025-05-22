package Java8_Features.built_in_Functional_interfaces;

import java.util.function.Predicate;
/**
 * 🔹 Purpose:
 * Represents a boolean-valued function (used for testing conditions).
 * 🔹 Method:
 * boolean test();
 */
public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println(isEven.test(4)); // Output: true
        System.out.println(isEven.test(5)); // Output: false
    }
}
