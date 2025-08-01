import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> isNotEmpty = str -> !str.isEmpty();
        Predicate<String> startsWithA = str -> str.startsWith("A");

        String name = "Alex";

        // Combine predicates using and()
        boolean result = isNotEmpty.and(startsWithA).test(name);
        System.out.println("Valid name? " + result); // Output: true
    }
}
// Why this next?
//It naturally follows Function<T, R> by exploring another core functional interface.
//
//Predicate<T> is used for conditional checks / filtering.
//
//Often used in Streams, filtering data, validation pipelines, and if conditions.
//
//🔍 What You’ll Learn:
//What is Predicate<T> and its methods (test(), and(), or(), negate())
//
//Real-world examples:
//
//Filtering valid emails
//
//Validating user age
//
//Chaining multiple predicates