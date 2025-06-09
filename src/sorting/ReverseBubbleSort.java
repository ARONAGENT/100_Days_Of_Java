package sorting;

import java.util.Arrays;
// Reversing the Logic of Bubble Sort
// Theory:
//In standard Bubble Sort, larger elements "bubble" to the end with each iteration.
//To reverse it, we'll make smaller elements bubble to the end, effectively sorting the array in descending order.
// just change the logic > to < in if condition
public class ReverseBubbleSort {
    public static void main(String[] args) {
        int[] arr={45,87,65,12,22,1,3,53,2,0};

        int temp;
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-1-i ; j++) {
                if(arr[j]<arr[j+1]){
                 temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
                }
            }
        }

        System.out.println("Descending Sorted Array :"+Arrays.toString(arr));
    }
}
