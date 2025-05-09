package Basic_Questions;

/**
 * 🧠 Hinglish Explanation:
 * Har baar jab object banta hai, sabse pehle instance block execute hota hai.
 * Uske baad constructor chalega — jo bhi aap use kar rahe ho (default ya parameterized).
 * Ye helpful hota hai jab aapko common logic har object creation pe run karna ho, bina har constructor me repeat kare.
 */
public class Instance_Initializer_Block_Demo {
    // Instance Initializer Block
    {
        System.out.println("🔄 Instance Initializer Block executed");
    }

    // Constructor 1
    public Instance_Initializer_Block_Demo() {
        System.out.println("🛠 Default Constructor called");
    }

    // Constructor 2
    public Instance_Initializer_Block_Demo(String name) {
        System.out.println("🛠 Parameterized Constructor called with name: " + name);
    }

    public static void main(String[] args) {
        System.out.println("🚀 Main Method starts");

        Instance_Initializer_Block_Demo obj1 = new Instance_Initializer_Block_Demo();
        System.out.println("----------------------");
        Instance_Initializer_Block_Demo obj2 = new Instance_Initializer_Block_Demo("Aman");

        System.out.println("✅ Main Method ends");
    }
}
