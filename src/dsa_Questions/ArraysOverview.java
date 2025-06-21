package dsa_Questions;
//Arrays Java ka basic data structure hai jise DSA problems mein har jagah use karte hain — jaise searching, sorting, matrix problems, etc.
//Aaj ka focus hai arrays ke basic operations samajhna: traverse, max/min dhoondhna, reverse karna, etc.
public class ArraysOverview {
    public static void main(String[] args) {
        // 🔹 1. Declare and initialize
        int[] numbers = {10, 20, 30, 40, 50};

        // 🔹 2. Traverse
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // 🔹 3. Find max
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("\nMax element: " + max);

        // 🔹 4. Reverse array (print only)
        System.out.println("Reversed array:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
