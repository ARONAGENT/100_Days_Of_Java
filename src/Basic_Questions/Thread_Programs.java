package Basic_Questions;
/**
 * ✅ What This Program Does:
 * You have a printTable(int n) method that prints the multiplication table for a given number with a 1-second delay between each line.
 * You create two Runnable tasks, one for printing the table of 2 and the other for 3.
 * Each Runnable is executed in its own thread using Thread.start().
 * Since both threads run concurrently, the tables print simultaneously (interleaved).

 * ❗ Important Notes:
 * This example demonstrates concurrency, but not synchronization.
 * If both threads were accessing shared resources, you’d need proper thread safety (synchronized, Locks, etc.).
 * Thread.sleep() is only used to simulate time delay and is not a synchronization tool.
 */


public class Thread_Programs {

    // Method to print multiplication table of a given number
    public static void printTable(int n) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            // Print the current multiplication result
            System.out.println(n + " * " + i + " = " + (n * i));

            // Pause execution for 1 second to simulate delay
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) {

        // First Runnable using lambda for printing table of 2
        Runnable t1 = () -> {
            try {
                printTable(2); // prints 2's table
            } catch (InterruptedException e) {
                throw new RuntimeException(e); // handle checked exception
            }
        };

        // Second Runnable using lambda for printing table of 3
        Runnable t2 = () -> {
            try {
                printTable(3); // prints 3's table
            } catch (InterruptedException e) {
                throw new RuntimeException(e); // handle checked exception
            }
        };

        // Create and start threads for both tasks
        new Thread(t1).start(); // starts thread t1 to run table of 2
        new Thread(t2).start(); // starts thread t2 to run table of 3
    }
}
//💡 Key Java Concepts Used:
//Concept	Description
//Runnable	A functional interface used to create a task that runs in a thread.
//Lambda	Used here to write Runnable implementations concisely.
//Thread.sleep(ms)	Pauses the current thread for the given time (in milliseconds).
//Thread class	Used to create and manage threads.
//Concurrency	Two tasks (print tables) are executed simultaneously.


