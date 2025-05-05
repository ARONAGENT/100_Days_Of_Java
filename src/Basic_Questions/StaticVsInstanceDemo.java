package Basic_Questions;

/**
 *🧠 Hinglish Explanation (in comments above):
 * staticCount sab objects ke beech shared hota hai, isliye wo har baar increase hota hai.
 * instanceCount har object ka apna alag variable hota hai, isliye hamesha 1 hi
 * rahta hai (constructor ke andar sirf 1 baar increment ho raha hai).
 */

public class StaticVsInstanceDemo {
    // 🔹 Static variable — shared by all objects
    static int staticCount = 0;

    // 🔸 Instance variable — unique to each object
    int instanceCount = 0;

    // 🔧 Constructor to increment both variables
    StaticVsInstanceDemo() {
        staticCount++;     // Shared, so value increases globally
        instanceCount++;   // Separate, so each object has its own copy
    }

    // 🔍 Method to display current values
    void display(String objectName) {
        System.out.println(objectName + " -> staticCount: " + staticCount + ", instanceCount: " + instanceCount);
    }

    // 🚀 Main method to test the behavior
    public static void main(String[] args) {

        // 🔸 Creating first object
        StaticVsInstanceDemo obj1 = new StaticVsInstanceDemo();
        obj1.display("obj1");  // staticCount = 1, instanceCount = 1

        // 🔸 Creating second object
        StaticVsInstanceDemo obj2 = new StaticVsInstanceDemo();
        obj2.display("obj2");  // staticCount = 2, instanceCount = 1

        // 🔸 Creating third object
        StaticVsInstanceDemo obj3 = new StaticVsInstanceDemo();
        obj3.display("obj3");  // staticCount = 3, instanceCount = 1
    }
}
