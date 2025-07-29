package dsa_Questions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 10);
        hashMap.put("Mango", 20);
        hashMap.put("Banana", 30);
        System.out.println("HashMap (No Order): " + hashMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Mango", 20);
        linkedHashMap.put("Banana", 30);
        System.out.println("LinkedHashMap (Insertion Order): " + linkedHashMap);
    }
    // | Feature            | `HashMap`            | `LinkedHashMap`                    |
    //| ------------------ | -------------------- | ---------------------------------- |
    //| Order              | No order (unordered) | Maintains insertion order          |
    //| Performance        | Slightly better      | Slight overhead due to linked list |
    //| Internal Structure | Hash table           | Hash table + doubly linked list    |
    //| Use Case           | Fast lookup          | Predictable iteration order needed |
}
