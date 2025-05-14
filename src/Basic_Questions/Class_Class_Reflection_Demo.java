package Basic_Questions;

import java.lang.reflect.*;
import java.util.Arrays;
/**
 *🧠 Hinglish Explanation:
 * field.setAccessible(true) — private fields ko accessible banata hai.
 * field.get(mangoObj) — object se actual field ka value nikalta hai.
 * newInstance() — Mango class ka ek object banata hai taaki values print ki ja sakein.
 */

public class Class_Class_Reflection_Demo {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("Basic_Questions.Mango");

        // ✅ Print class and superclass
        System.out.println("Class Name       : " + aClass.getName());
        System.out.println("Superclass       : " + aClass.getSuperclass().getName());

        // ✅ Print constructors
        System.out.println("Constructors     : " + Arrays.toString(aClass.getConstructors()));

        // ✅ Create an object of Mango
        Object mangoObj = aClass.getDeclaredConstructor().newInstance();

        // ✅ Print all fields and their actual values
        System.out.println("\nFields and Values:");
        for (Field field : aClass.getDeclaredFields()) {
            field.setAccessible(true);  // allow access to private fields
            System.out.println("  " + field.getName() + " = " + field.get(mangoObj));
        }

        // ✅ Print methods
        System.out.println("\nMethods:");
        for (Method method : aClass.getDeclaredMethods()) {
            System.out.println("  " + method.getName());
        }
    }
}
