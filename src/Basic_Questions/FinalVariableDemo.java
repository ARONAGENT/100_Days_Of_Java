package Basic_Questions;

public class FinalVariableDemo {
    public static void main(String[] args) {
        final int speedLimit = 60;  // final variable
        //speedLimit = 80;  ❌ Error: can't assign again
        // error msg -> java: cannot assign a value to final variable speedLimit
        System.out.println("Speed limit is: " + speedLimit);
    }
}
