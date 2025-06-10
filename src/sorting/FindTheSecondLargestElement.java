package sorting;

import java.util.Arrays;
import java.util.Collections;
//📘 Theory
//Finding the second largest element in an array is a classic DSA interview question.
// It helps you understand sorting, iteration, and stream operations.
public class FindTheSecondLargestElement {
    public static void main(String[] args) {
        int[] arr={5,2,1,89,99,54,23,76,54,45,76,67};
        int temp;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if(arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Arrays Descending Sorted : "+ Arrays.toString(arr));
        System.out.println("Second Largest element :"+arr[1]);


        int[] arr2={5,2,1,89,99,54,23,76,54,45,76,67};

        int secondLargest1 = Arrays.stream(arr)
                .boxed()
                .distinct() // Remove duplicates
                .sorted((a,b)-> Integer.compare(b,a))
                .skip(1) // Skip the largest element
                .findFirst() // Get the next element
                .orElseThrow(() -> new RuntimeException("No second largest element found"));


        int secondLargest2 = Arrays.stream(arr)
                .boxed()
                .distinct() // Remove duplicates
                .sorted(Collections.reverseOrder())
                .skip(1) // Skip the largest element
                .findFirst() // Get the next element
                .orElseThrow(() -> new RuntimeException("No second largest element found"));




        System.out.println("Second Largest Element: " + secondLargest1);
        System.out.println("Second Largest Element: " + secondLargest2);



    }
}
// 🔹 Approach 1: Bubble Sort in Descending Order
//Sort the array in descending order using nested loops.
//After sorting, the second element (index 1) will be the second largest.
//This approach has O(n²) time complexity.
//🔹 Approach 2: Java Streams (Functional Style)
//Use Arrays.stream() and convert to boxed Integer stream.
//Apply distinct() to eliminate duplicates.
//Use sorted() in reverse order.
//Use skip(1) to skip the largest element
//Use findFirst() to get the second largest.
//Time complexity is roughly O(n log n) due to internal sorting.