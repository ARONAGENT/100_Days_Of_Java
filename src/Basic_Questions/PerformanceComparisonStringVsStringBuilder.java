package Basic_Questions;
/**
 *🧠 Why is StringBuilder Faster?
 * String is immutable, so every time you use str += "a";, a new object is created → consumes more time and memory.
 * StringBuilder is mutable, so all changes happen in-place, resulting in better performance and memory efficiency.
 */

public class PerformanceComparisonStringVsStringBuilder {
    public static void main(String[] args) {
        int iterations = 100000;  // Number of times we modify the string

        // 🔹 Measure time for String concatenation
        long startTimeString = System.nanoTime();  // Start timer
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "a";  // ❌ Creates a new String object every iteration (Slow & memory inefficient)
        }
        long endTimeString = System.nanoTime();  // End timer
        long durationString = endTimeString - startTimeString;  // Calculate time taken

        // 🔹 Measure time for StringBuilder append
        long startTimeBuilder = System.nanoTime();  // Start timer
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("a");  // ✅ Modifies the same object (Fast & memory efficient)
        }
        long endTimeBuilder = System.nanoTime();  // End timer
        long durationBuilder = endTimeBuilder - startTimeBuilder;  // Calculate time taken

        // 🔹 Print Execution Time Results
        System.out.println("-------------------------------------------------------");
        System.out.println("Time taken using String (nanoseconds): " + durationString);
        System.out.println("Time taken using StringBuilder (nanoseconds): " + durationBuilder);
        System.out.println("-------------------------------------------------------");

        // 🔹 Calculate Performance Difference
        if (durationBuilder != 0) {
            System.out.println("StringBuilder is Faster than String by: " + (double) durationString / durationBuilder + " times");
        } else {
            System.out.println("⚠️ StringBuilder execution time was too fast to compare.");
        }

        // 🔹 Final Comparison Result
        if (durationString < durationBuilder) {
            System.out.println("❗ String is faster (which is unusual for large modifications).");
        } else if (durationString > durationBuilder) {
            System.out.println("✅ StringBuilder is faster and more efficient for repeated modifications.");
        } else {
            System.out.println("⚖️ Both took the same time (rare case).");
        }
    }
}
