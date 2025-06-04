package Java8_Features.optionalClass;

import java.util.Optional;
//Method	            Handles null?	Throws Exception?
//Optional.of()	        ❌ No	        ✅ Yes, if null
//Optional.ofNullable()	✅ Yes	        ❌ No
public class BestSuitableExample_OptionalClass {
    public static void main(String[] args) {

        // ✅ Using Optional.of() - value must NOT be null
        String name = "Rohan";
        Optional<String> optionalName = Optional.of(name);
        System.out.println("Optional.of() value: " + optionalName.get());

        // ❌ This will throw NullPointerException
        // Optional<String> error = Optional.of(null); // Uncomment to test exception

        // ✅ Using Optional.ofNullable() - null is allowed
        String city = null;
        Optional<String> optionalCity = Optional.ofNullable(city);
        System.out.println("Optional.ofNullable() value: " + optionalCity.orElse("No City Provided"));
    }
}
