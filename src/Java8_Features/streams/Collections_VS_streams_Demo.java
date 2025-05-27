package Java8_Features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collections_VS_streams_Demo {
    public static void main(String[] args) {
        // Creating a list of integers (Collection)
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Traditional Collection-based approach (Imperative Style)
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println("Even numbers using Collection: " + evenNumbers);

        // Using Stream API (Functional Style)
        List<Integer> evenWithStream = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers using Stream: " + evenWithStream);
    }
}
