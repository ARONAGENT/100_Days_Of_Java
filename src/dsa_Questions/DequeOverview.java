package dsa_Questions;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeOverview {
    public static void main(String[] args) {
        // Initialize Deque
        Deque<Integer> deque = new ArrayDeque<>();

        // Using Deque as Stack (LIFO)
        System.out.println("🔹 Using Deque as Stack:");
        deque.push(10); // same as addFirst()
        deque.push(20);
        deque.push(30);

        System.out.println("Stack top: " + deque.peek()); // 30
        while (!deque.isEmpty()) {
            System.out.println("Popped: " + deque.pop());
        }

        // Using Deque as Queue (FIFO)
        System.out.println("\n🔸 Using Deque as Queue:");
        deque.addLast(100); // enqueue
        deque.addLast(200);
        deque.addLast(300);

        System.out.println("Front of Queue: " + deque.peekFirst()); // 100
        while (!deque.isEmpty()) {
            System.out.println("Polled: " + deque.pollFirst());
        }
    }
}
