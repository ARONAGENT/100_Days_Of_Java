package Basic_Questions;

import java.util.Arrays;
import java.util.List;
//Unbounded Wildcard <?>
//Accepts any type.
//Example: List<?> → list of unknown objects.
public class WildCardGenericsUnBounded_Example {
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4);
        List<String> strList = Arrays.asList("A", "B", "C");

        printList(intList); // works
        printList(strList); // works
    }
}
