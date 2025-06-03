package Java8_Features.optionalClass;

import java.util.Optional;
/**
 * ✅ What is Optional in Java 8?
 * 🔹 Definition:
 * Optional is a container object introduced in Java 8 to represent the presence or absence of a value.
 * 🔹 Purpose:
 * To avoid NullPointerException and encourage safe code when dealing with potentially null values.
 */
//✅ Key Methods in Optional:
//Method	Description
//empty()	Returns an empty Optional
//of(value)	Returns Optional with value (throws NPE if null)
//ofNullable(value)	Returns Optional that may contain null
//isPresent()	Checks if value is present
//ifPresent()	Performs action if value is present
//orElse()	Returns value or default
//orElseGet()	Returns value or gets from Supplier
//orElseThrow()	Throws an exception if no value present
//get()	Returns value (avoid using without checking)
public class OptionalClassInJAVA {
    public static Optional<String> getName(String name) {
        // Wrapping the string in Optional
        return Optional.ofNullable(name);
    }

    public static void main(String[] args) {

        // Case 1: Value is present
        Optional<String> nameOptional = getName("Rohan");

        // Print if value is present
        nameOptional.ifPresent(name ->
                System.out.println("Name in uppercase: " + name.toUpperCase())
        );

        // Case 2: Value is null
        Optional<String> nullName = getName(null);

        // Provide default if null
        String result = nullName.orElse("Default Name");
        System.out.println("Name: " + result);

        // Using orElseGet (takes a Supplier)
        String lazyDefault = nullName.orElseGet(() -> "Lazy Name");
        System.out.println("Lazy Name: " + lazyDefault);

        // Uncommenting below will throw NoSuchElementException
        // System.out.println(nullName.get());

        // Using orElseThrow to throw custom exception
        try {
            String risky = nullName.orElseThrow(() ->
                    new IllegalArgumentException("Name is required!")
            );
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
