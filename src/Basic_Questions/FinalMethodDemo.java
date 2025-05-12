package Basic_Questions;
class Vehicle {
    final void run() {
        System.out.println("Vehicle is running");
    }
}
// 'run()' cannot override 'run()' in 'Basic_Questions.Vehicle'; overridden method is final
class Bike extends Vehicle {
//     void run() { ❌ Error: cannot override final method
//         System.out.println("Bike is running");
//     }
}
public class FinalMethodDemo {
    public static void main(String[] args) {
        new Bike().run();  // Calls method from Vehicle class
    }
}
