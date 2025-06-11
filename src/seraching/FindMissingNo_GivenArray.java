package seraching;

import java.util.Arrays;

public class FindMissingNo_GivenArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,8};
        int n= arr[arr.length-1];
        int expectedSum= n*(n+1)/2;
        int actual_sum=0;
        for(int num : arr){
            actual_sum+=num;
        }

        System.out.println(actual_sum);
        int missing_no= expectedSum-actual_sum;
        System.out.println("missing no :"+missing_no);

    }
}
