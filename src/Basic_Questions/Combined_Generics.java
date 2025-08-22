package Basic_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combined_Generics {
    // Method with Unbounded Wildcard
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    // Method with Upper-Bounded Wildcard
    public static double sumOfNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    // Method with Lower-Bounded Wildcard
    public static void addIntegers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    public static void main(String[] args) {
        // Unbounded wildcard
        List<String> stringList = Arrays.asList("Java", "Generics", "Wildcard");
        printList(stringList);

        // Upper bounded wildcard
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Sum of numbers: " + sumOfNumbers(intList));

        // Lower bounded wildcard
        List<Number> numberList = new ArrayList<>();
        addIntegers(numberList);
        printList(numberList);
    }
}
