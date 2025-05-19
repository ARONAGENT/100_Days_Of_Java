package Java8_Features.Anonymous_expression;

/**
 *🧠 Hinglish Explanation:
 * Humne yaha DemoInterface ka object direct nahi banaya (kyuki interface ka object banta nahi),
 * balki uska ek anonymous class banake printName() method override kiya.
 */
public class Anonymous_ExpressionDemo {
    public static void main(String[] args) {

        // ✅ Anonymous class: creating object + method override at the same time
        DemoInterface demoInterface = new DemoInterface() {
            @Override
            public void printName(String name) {
                System.out.println("Name is " + name);
            }
        };

        // 🔍 Call the method using the interface reference
        demoInterface.printName("Rohan");
    }
}
