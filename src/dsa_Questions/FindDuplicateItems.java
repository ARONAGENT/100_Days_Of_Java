package dsa_Questions;

public class FindDuplicateItems {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 5, 3,5,};

        boolean found = false;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element found: " + arr[i]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No duplicate found");
        }
    }
}
