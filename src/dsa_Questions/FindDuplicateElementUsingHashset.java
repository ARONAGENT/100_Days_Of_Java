package dsa_Questions;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementUsingHashset {
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 2, 5, 3, 6,7,8,1};

        Set<Integer> seen = new HashSet<>();
        boolean duplicateFound = false;

        for (int num : nums) {
            if (!seen.add(num)) {
                System.out.println("Duplicate number found: " + num);
                duplicateFound = true;
            }
        }

        if (!duplicateFound) {
            System.out.println("No duplicate number found.");
        }
    }
}
