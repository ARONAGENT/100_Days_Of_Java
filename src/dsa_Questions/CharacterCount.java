package dsa_Questions;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "hello world";
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (c == ' ') continue; // Skip spaces
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
