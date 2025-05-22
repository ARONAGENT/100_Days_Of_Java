package Java8_Features.built_in_Functional_interfaces;

import java.util.function.Supplier;
/**
 * 🔹 Purpose:
 * Represents a supplier of results – i.e., no input, but returns a result.
 * 🔹 Method:
 * T get();
 */
public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> nameSupplier = () -> "Hello from Supplier!";
        System.out.println(nameSupplier.get()); // Output: Hello from Supplier!
    }
}
