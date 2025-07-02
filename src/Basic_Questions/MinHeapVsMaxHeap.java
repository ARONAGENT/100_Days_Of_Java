package Basic_Questions;

import java.util.PriorityQueue;

public class MinHeapVsMaxHeap {
        public static void main(String[] args) {
            // Min Heap (default)
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            minHeap.add(4);
            minHeap.add(1);
            minHeap.add(7);
            minHeap.add(2);

            System.out.println("Min Heap:");
            while (!minHeap.isEmpty()) {
                System.out.print(minHeap.poll() + " ");  // ascending order
            }

            // Max Heap using custom Comparator
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
            maxHeap.add(4);
            maxHeap.add(1);
            maxHeap.add(7);
            maxHeap.add(2);

            System.out.println("\nMax Heap:");
            while (!maxHeap.isEmpty()) {
                System.out.print(maxHeap.poll() + " ");  // descending order
            }
        }
    }

