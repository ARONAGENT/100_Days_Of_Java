package Basic_Questions;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 🧠 Hinglish Explanation:
 * Is example mein humne Class class ka use kiya hai Animal class ke structure ko runtime par jaanchne ke liye.
 * getFields() se sirf public fields milti hain.
 * getDeclaredMethods() se saare methods milte hain (public + private).
 * Isse aap runtime mein class ka pura structure inspect kar sakte ho — useful in frameworks like Spring, Hibernate, etc
 */
//
public class ReflectionDemo {
    public static void main(String[] args) {
        // Getting the Class object
        Class<?> clazz = Animal.class;

        // Printing class name
        System.out.println("Class Name: " + clazz.getName());

        // Getting all public fields
        Field[] fields = clazz.getFields();
        System.out.println("\nPublic Fields:");
        for (Field f : fields) {
            System.out.println("  " + f.getName());
        }

        // Getting all declared methods (even private)
        Method[] methods = clazz.getDeclaredMethods();
        System.out.println("\nDeclared Methods:");
        for (Method m : methods) {
            System.out.println("  " + m.getName());
        }
    }
}
