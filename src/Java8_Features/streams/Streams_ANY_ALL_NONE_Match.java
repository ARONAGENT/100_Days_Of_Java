package Java8_Features.streams;

import java.util.List;
/**
 *💡 Definition and Theory
 * 🔸 anyMatch(Predicate)
 * Returns true if any one element in the stream satisfies the condition.
 * Short-circuits as soon as one match is found.
 * 🔸 allMatch(Predicate)
 * Returns true only if all elements satisfy the condition.
 * Short-circuits on the first non-matching element.
 * 🔸 noneMatch(Predicate)
 * Returns true if none of the elements match the condition.
 * Returns false as soon as one match is found
 */

public class Streams_ANY_ALL_NONE_Match {
    public static void main(String[] args) {

        // Define a list of integers
        List<Integer> integersNo = List.of(3, 6, 8, 9, 6, 99, 88, 65, 9, 90);

        // ✅ anyMatch: Checks if any number in the list is divisible by 2
        boolean anyMatch = integersNo.stream()
                .anyMatch(integer -> integer % 2 == 0);  // returns true if any even number exists

        System.out.println("Any even number present? " + anyMatch); // Expected: true

        // ✅ allMatch: Checks if all numbers in the list are divisible by 2
        boolean allMatch = integersNo.stream()
                .allMatch(integer -> integer % 2 == 0);  // returns false if any odd number exists

        System.out.println("Are all numbers even? " + allMatch); // Expected: false

        // ✅ noneMatch: Checks if none of the numbers are divisible by 2
        boolean noneMatch = integersNo.stream()
                .noneMatch(integer -> integer % 2 == 0);  // returns true if no even number exists

        System.out.println("No even number present? " + noneMatch); // Expected: false
    }
}
