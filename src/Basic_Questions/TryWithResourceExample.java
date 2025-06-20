package Basic_Questions;

class AutoClosableDemo implements AutoCloseable {
    public void doSomething() {
        System.out.println("Doing something important...");
    }

    @Override
    public void close() {
        System.out.println("MyResource is closed automatically.");
    }
}
public class TryWithResourceExample {
    public static void main(String[] args) {
        try (AutoClosableDemo resource = new AutoClosableDemo()) {
            resource.doSomething();
        }
    }
}
//🧠 Hinglish Summary:
//Java mein agar aap koi resource (jaise file, DB connection) open karte ho, to manually close karna padta tha.
//try-with-resources ka use karne se Java automatically close kar deta hai, bus aapke class ko AutoCloseable implement karna hota hai.
//Ye safer aur cleaner code likhne mein madad karta hai.