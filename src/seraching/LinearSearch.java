package seraching;
//🔹 Day 39 Topic: Linear Search in an Array
//Why this topic?
//Linear search is one of the most basic searching algorithms used in DSA. It's easy to understand and builds a good base for more advanced searching techniques like binary search.
//
//✅ Theory:
//Linear Search means checking every element in the array one by one until the desired element is found.
//
//Time Complexity: O(n)
//
//Use Case: When the array is unsorted.
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6};
        int key = 9;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found in array.");
        }
    }
}
