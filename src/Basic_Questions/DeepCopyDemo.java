package Basic_Questions;

public class DeepCopyDemo {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] deep = java.util.Arrays.copyOf(original, original.length); // 🔸 Creates new array

        deep[0] = 99;

        // 🔹 Only deep copy changes
        System.out.println("Original: " + java.util.Arrays.toString(original));
        System.out.println("Deep    : " + java.util.Arrays.toString(deep));
    }
}
