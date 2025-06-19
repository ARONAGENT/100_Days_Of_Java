package Basic_Questions;

public class VarargTheory {
//    ❓ Kya Varargs sirf int ke liye hote hain?
//    Nahi! Varargs kisi bhi data type ke liye ho sakte hain — primitive types (like int, double) ya object types (like String, Integer, custom classes).
//
//            ✅ Examples with Different Data Types:
//            🔹 int type varargs:
//    java
//            Copy
//    Edit
//    public static void sum(int... nums) { }
//🔹 String type varargs:
//    java
//            Copy
//    Edit
//    public static void greet(String... names) { }
//🔹 double type:
//    java
//            Copy
//    Edit
//    public static void average(double... values) { }
//🔹 Custom Object type:
//    java
//            Copy
//    Edit
//    public static void addStudents(Student... students) { }
//🚫 Rules (Very Important):
//    Only one varargs per method
//
//    It must be the last parameter in the method signature
//
//    java
//            Copy
//    Edit
//    // ✅ Correct
//    public void method(String message, int... numbers) { }
//
// ❌ Invalid – varargs not at end
// public void method(int... numbers, String msg) { }
// 🧠 Hinglish Summary:
//    Varargs sirf int ke liye nahi, kisi bhi type ke ho sakte hain — chahe String, double, ya koi custom object.
//    Bas rule ye hai ki varargs hamesha last mein aana chahiye aur ek hi allowed hota hai.


}
