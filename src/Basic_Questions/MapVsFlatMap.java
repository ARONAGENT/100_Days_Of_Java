package Basic_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * 🔸 map() vs flatMap() in Java Streams
 * ✅ 1. map():
 * Transforms each element of the stream and returns a new stream of the same structure.
 * ✅ 2. flatMap():
 * Flattens the nested structure (like a Stream<Stream<T>>) into a single stream.
 * 🔁 Visual Analogy:
 * map() → “Do something to every item, keep structure.”
 * flatMap() → “Break inner structures and merge into one stream.”
 */
public class MapVsFlatMap {
    public static void main(String[] args) {

        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("Java", "Python"),
                Arrays.asList("C++", "Go"),
                Arrays.asList("Rust", "Kotlin")
        );

        // Using map() → returns Stream<Stream<String>>
        List<java.util.stream.Stream<String>> mapped = nestedList
                .stream()
                .map(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println("Using map():");
        mapped.forEach(stream -> {
            stream.forEach(System.out::println);  // Need second forEach to print
        });

        System.out.println("-------------------------------------------------");

        // Using flatMap() → returns Stream<String>
        List<String> flatMapped = nestedList
                .stream()
                .flatMap(list -> list.stream())  // flattens and merges
                .collect(Collectors.toList());

        System.out.println("Using flatMap():");
        flatMapped.forEach(System.out::println);  // Direct print
    }
}
