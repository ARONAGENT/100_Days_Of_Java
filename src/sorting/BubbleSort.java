package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={23,12,45,3,2,67,99};
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    // swap
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        // first way
        int[] arr2=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[i];
        }
        System.out.println(Arrays.toString(arr2));


        // 3rd way
        int[] arr3=Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(arr3));
    }
}
/*
 * ✅ Theory:
 * In DSA, sorting is the process of arranging data in a particular format (ascending or descending). It's important for efficient searching, comparison, and optimization.
 * Common sorting methods:
 * Bubble Sort – Repeatedly swaps adjacent elements if they are in the wrong order.
 * Selection Sort – Selects the minimum element and puts it in the correct position.
 * Insertion Sort – Builds the sorted array one item at a time.
 * Built-in Sort – Using Java's Arrays.sort() method.
 */