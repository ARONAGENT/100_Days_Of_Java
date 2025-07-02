package Basic_Questions;

import Basic_Questions.Student;

import java.util.*;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student(3, "Om"),
                new Student(1, "Rohan"),
                new Student(2, "Yash")
        );

        // 🔸 Using Comparable (by id)
        List<Student> list1 = new ArrayList<>(students);
//        Collections.sort(list1);
        System.out.println("Sorted by ID: " + list1);

        // 🔸 Using Comparator (by name)
        List<Student> list2 = new ArrayList<>(students);
        list2.sort(Comparator.comparing(student -> student.getName()));
        System.out.println("Sorted by Name: " + list2);
    }
}
// Comparable tab use hota hai jab aap chahte ho ki object khud decide kare wo kaise compare hoga.
//Comparator tab use hota hai jab aap bahar se comparison ka rule dena chahte ho (like sort by name, age).
//Interview mein mostly puchte hain: "When will you use Comparable vs Comparator?"