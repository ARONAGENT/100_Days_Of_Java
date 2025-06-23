package Basic_Questions;

public class ShallowCopyDemo {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] shallow = original; // 🔸 Points to same array

        shallow[0] = 99;

        // 🔹 Both arrays show changes
        System.out.println("Original: " + java.util.Arrays.toString(original));
        System.out.println("Shallow : " + java.util.Arrays.toString(shallow));
    }
}
