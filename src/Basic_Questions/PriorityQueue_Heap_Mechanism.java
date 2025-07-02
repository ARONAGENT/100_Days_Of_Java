package Basic_Questions;

import java.util.PriorityQueue;
// 🧠 Hinglish Summary:
//Chahe tum elements ko random order mein insert karo, PriorityQueue hamesha internally heap structure maintain karta hai.
//Isliye jab poll() karte ho, to sabse chhota (Min Heap) ya sabse bada (Max Heap) element pehle milta hai.
//Lekin agar tum System.out.println(pq) karoge, to elements sorted nahi dikhte
// – kyunki heap full sort nahi karta, sirf priority maintain karta hai.
public class PriorityQueue_Heap_Mechanism {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(99);
        pq.add(3);
        pq.add(10);
        pq.add(7);
        pq.add(1);
        System.out.println(pq);  // Output: [1, 3, 10, 99, 7] (not sorted!)

    }
}
