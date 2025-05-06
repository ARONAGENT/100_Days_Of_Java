package Basic_Questions;
/**
 *🧠 Hinglish Summary:
 * x static hai, isliye obj1 ya obj2 se change karne par ek hi variable update hota hai
 *  — shared hota hai sab objects ke liye.
 * y instance variable hai, isliye obj2.y ki value 12 hi rahti hai.
 * Final result: x = 40, y = 12 → Output: 52
 */

public class StaticVsInstanceDemo2 {

    // 🔹 Static variable (shared across all objects)
    static int x = 10;

    // 🔸 Instance variable (unique for each object)
    int y = 12;

    public static void main(String[] args) {

        // 🔸 Creating first object
        StaticVsInstanceDemo2 obj1 = new StaticVsInstanceDemo2();

        // 🔸 Creating second object
        StaticVsInstanceDemo2 obj2 = new StaticVsInstanceDemo2();

        /*
         🔹 Static variable 'x' is shared between both obj1 and obj2.
         🔹 So, updating x via obj1 or obj2 affects the same static variable.
         */

        obj1.x += 10; // x = 10 + 10 = 20
        // Now, x becomes 20 globally for the class

        obj2.x += 20; // x = 20 + 20 = 40
        // Again, x is updated to 40 (shared variable)

        /*
         🔹 obj1.x = 40 (static, shared)
         🔸 obj2.y = 12 (instance variable of obj2, remains 12)

         ✅ Final expression: obj1.x + obj2.y = 40 + 12 = 52
         */

        System.out.println(obj1.x + obj2.y); // Output: 52
    }

}
