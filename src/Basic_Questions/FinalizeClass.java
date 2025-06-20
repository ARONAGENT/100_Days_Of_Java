package Basic_Questions;
//🔍 What is finalize()?
//finalize() is a method defined in the Object class that Java calls before garbage collecting an object.
//It's like a destructor in C++, used to clean up resources (like closing files, releasing connections)
// before the object is destroyed.
public class FinalizeClass {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called for cleanup");
    }

    public static void main(String[] args) {
        FinalizeClass obj = new FinalizeClass();
        obj = null;

        // Requesting JVM to run GC
        System.gc();

        System.out.println("Main method finished");
    }
}
// since this  method is deprecated
// Java mein finalize() method tab call hota hai jab koi object garbage collector destroy karta hai.
//Iska use cleanup ke liye hota hai. Lekin Java 9 ke baad ise use karna mana hai kyunki ye reliable nahi hai.
//Aaj ke time mein AutoCloseable ya try-with-resources ka use hota hai.