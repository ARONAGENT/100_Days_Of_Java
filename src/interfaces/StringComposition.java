package interfaces;

import java.util.function.Function;

public class StringComposition {
    public static void main(String[] args) {
        // Step 1: Trim whitespace from the input string
        Function<String, String> trim = str -> str.trim();

        // Step 2: Convert all characters to lowercase
        Function<String, String> toLower = str -> str.toLowerCase();

        // Step 3: Replace spaces with hyphens
        Function<String, String> replaceSpaces = str -> str.replace(" ", "-");

        // Compose all steps using andThen
        Function<String, String> formatString = trim.andThen(toLower).andThen(replaceSpaces);

        // Input string
        String input = "   java FUNCTIONAL Programming   ";

        // Apply composed function
        String result = formatString.apply(input);

        // Output the result
        System.out.println("Formatted String: " + result);
    }
}
