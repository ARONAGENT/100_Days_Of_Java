package Basic_Questions;

public class CloneDemo  {
    public static void main(String[] args) {
        Students s1 = new Students(101, "Rohan");
        Students s2 = (Students) s1.clone(); // 🔁 Cloning

        System.out.println("Original: " + s1.id + " " + s1.name);
        System.out.println("Cloned  : " + s2.id + " " + s2.name);

        System.out.println("Are they same object? " + (s1 == s2)); // fal
    }
}
