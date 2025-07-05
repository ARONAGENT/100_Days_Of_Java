package Basic_Questions;

import java.util.Arrays;

public class Arrays_equals_deepEquals {
    public static void main(String[] args) {
        int[] oneD1 = {1, 2, 3};
        int[] oneD2 = {1, 2, 3};
        System.out.println("1D equals: " + Arrays.equals(oneD1, oneD2)); // true

        int[][] twoD1 = {{1, 2}, {3, 4}};
        int[][] twoD2 = {{1, 2}, {3, 4}};
        System.out.println("2D equals: " + Arrays.equals(twoD1, twoD2));       // false
        System.out.println("2D deep equals: " + Arrays.deepEquals(twoD1, twoD2)); // true
    }
}
