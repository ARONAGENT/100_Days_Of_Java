package Basic_Questions;
import java.util.Arrays;
//🔍 What to cover:
//Arrays.toString(array)
//Used for printing 1D arrays
//Example: int[] arr = {1, 2, 3};
//Arrays.deepToString(array)
//Used for 2D or nested arrays
//Example: int[][] matrix = {{1, 2}, {3, 4}};
//
//Why not use System.out.println(arr) directly?
//Outputs memory reference like [I@27f674d
//
//Use Arrays.toString() to see actual contents
//Bonus: Also try Arrays.equals() vs Arrays.deepEquals()
public class ArrayToString_ {

        public static void main(String[] args) {
            int[] oneD = {1, 2, 3, 4};
            int[][] twoD = {{1, 2}, {3, 4}};
            // use toString() method to print array directly
            System.out.println("1D Array: " + Arrays.toString(oneD));
            System.out.println("2D Array: " + Arrays.deepToString(twoD));
        }
    }

