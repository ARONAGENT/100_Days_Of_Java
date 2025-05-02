package Basic_Questions;

public class MainMethodWays {

    // 1. Standard main method
    // This is the most common form used in Java.
    // public → accessible by JVM
    // static → so JVM can call it without creating an object
    // void → does not return anything
    // String[] args → receives command-line arguments
//    public static void main(String[] args) {
//        System.out.println("Standard main method");
//    }

    // 2. Array declaration style variation
    // This is also valid in Java — "String args[]" is the same as "String[] args"
    // Both are treated as an array of Strings.
//    public static void main(String args[]) {
//        System.out.println("Array style main method");
//    }

    // 3. Using final in parameter
    // 'final' makes the reference to the array immutable (cannot be reassigned)
    // The behavior of the method remains the same.
//    public static void main(final String[] args) {
//        System.out.println("Final parameter main method");
//    }

    // 4. Changing order of modifiers — valid
    // 'final public static' is the same as 'public static final'
    // Java allows changing the order of modifiers as long as they are valid for the method
//    final public static void main(String args[]) {
//        System.out.println("Final method main method");
//    }

    // 5. Using varargs (variable-length argument list)
    // Introduced in Java 5
    // 'String... args' is a shorthand for 'String[] args' and allows passing 0 or more arguments
    // Internally, it is treated as an array, so you can loop over it like an array
//    public static void main(String... args) {
//        System.out.println("Varargs main method");
//    }
}
