package dsa_Questions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
     public static void main(String[] args) {
            // 1. Creating a HashMap
            HashMap<String, Integer> map = new HashMap<>();

            // 2. Adding elements
            map.put("Rohan", 21);
            map.put("Amit", 23);
            map.put("Sneha", 20);
            map.put("Rohan", 25); // Overrides previous value for "Rohan"

            // 3. Retrieving elements
            System.out.println("Rohan's Age: " + map.get("Rohan")); // 25

            // 4. Checking existence
            System.out.println("Contains Amit? " + map.containsKey("Amit"));
            System.out.println("Contains Age 20? " + map.containsValue(20));

            // 5. Iterating using entrySet()
            System.out.println("\n--- Iterating using entrySet ---");
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " => " + entry.getValue());
            }

            // 6. Using keySet()
            System.out.println("\n--- Iterating using keySet ---");
            for (String key : map.keySet()) {
                System.out.println(key + " => " + map.get(key));
            }

            // 7. Using computeIfAbsent
            map.computeIfAbsent("Priya", k -> 22);
            System.out.println("Priya Added: " + map);

            // 8. Removing element
            map.remove("Sneha");

            // 9. Synchronized Map
            Map<String, Integer> syncMap = Collections.synchronizedMap(new HashMap<>(map));
            System.out.println("\nSynchronized Map: " + syncMap);

            // 10. ConcurrentHashMap Example
            Map<String, String> concurrentMap = new java.util.concurrent.ConcurrentHashMap<>();
            concurrentMap.put("token1", "valid");
            concurrentMap.put("token2", "expired");

            System.out.println("ConcurrentMap: " + concurrentMap);
        }
    }

