package Java8_Features.streams;

import Basic_Questions.Student;

import java.util.ArrayList;
import java.util.List;

// Integer Question How will find distinct elements in list
// How object should be sorted
/**
 * 📘 Definition and Explanation:
 * **distinct()**:
 * It returns a stream with duplicate elements removed (based on equals() and hashCode()).
 * Useful when working with lists containing repeated elements.
 * **sorted()**:
 * It returns a stream with the elements sorted in natural order.
 * For custom objects, we must provide a comparator (usually via a lambda or method reference).
 */

public class StreamsDistinctAndSorted {
    public static void main(String[] args) {
        // List of integers with duplicate values
        List<Integer> list = List.of(1, 4, 7, 7, 8, 3, 9, 0, 6, 3, 9, 0);

        // List of custom Student objects
        List<Student> studlist = new ArrayList<>();
        Student student0 = new Student(4, "Rohan");
        Student student1 = new Student(7, "Om");
        Student student2 = new Student(3, "Yash");
        Student student3 = new Student(9, "Athrava");

        studlist.add(student0);
        studlist.add(student1);
        studlist.add(student2);
        studlist.add(student3);

        // ✅ Using distinct() and sorted() on primitive list
        System.out.println("Distinct and Sorted Integer List:");
        list.stream()
                .distinct() // removes duplicate integers
                .sorted()   // sorts in ascending order
                .forEach(System.out::println);

        // ✅ Using sorted() on custom Student list based on ID
        System.out.println("\nSorted Student List by ID:");
        studlist.stream()
                .sorted((o1, o2) -> o1.getId() - o2.getId()) // custom comparator
                .forEach(student -> {
                    System.out.println("Student id: " + student.getId() +
                            ", Name: " + student.getName());
                });
    }

    /*
     * 🧠 Key Interview Points:
     * distinct() uses equals() and hashCode() internally → override them in custom classes to make it work.
     * sorted() with custom objects needs a comparator using lambda or Comparator.comparing(...).
     * These stream operations are non-destructive (they don’t change the original list).
     */
}
