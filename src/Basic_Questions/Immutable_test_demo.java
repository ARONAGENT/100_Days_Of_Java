package Basic_Questions;

public class Immutable_test_demo {
    public static void main(String[] args) {
        Student student = new Student(101, "Rohan");
        System.out.println(student.getId());     // 101
        System.out.println(student.getName());   // Rohan

        // student.name = "NotAllowed"; // ❌ Compile-time error
    }
}
