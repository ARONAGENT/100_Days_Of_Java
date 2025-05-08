package Basic_Questions;

/**
 * In Java, static blocks are executed first, even before the main() method or any constructor or instance initializer blocks.
 */
//
public class StaticBlockDemo {
    static int number;

    // Static block
    static {
        number = 50;
        System.out.println("Static block executed. Number set to: " + number);
    }

    public static void main(String[] args) {
        System.out.println("Main method started. Number is: " + number);
    }
}
