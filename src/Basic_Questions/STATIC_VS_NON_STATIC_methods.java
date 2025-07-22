package Basic_Questions;
// No, a static method cannot directly access a non-static method or variable.
//❓ Why?
//Because:
//Static methods belong to the class, not to an instance.
//Non-static methods require an object to be called.
public class STATIC_VS_NON_STATIC_methods {
    void nonStaticMethod() {
        System.out.println("I am a non-static method.");
    }

    static void staticMethod() {
        // nonStaticMethod(); ❌ Error: Cannot make a static reference to the non-static method
        Student obj = new Student(1,"rohan");
        obj.getName(); // ✅ Correct way
    }

    public static void main(String[] args) {
        staticMethod();
    }
}
// 📌 Summary:
//Access Type	    Static Method	Non-Static Method
//Access static	    ✅ Yes	            ✅ Yes
//Access non-static	❌ No (directly)	✅ Yes