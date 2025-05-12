package Basic_Questions;

final class Animal1 {
    void sound() {
        System.out.println("Animal makes sound");
    }
}
// Final class ko inherit nahi kar sakte.
// java: cannot inherit from final Basic_Questions.Animal1
public class FinalClassDemo
        // extends Animal1
        {
    public static void main(String[] args) {
        Animal1 a = new Animal1();
        a.sound();
    }
}
