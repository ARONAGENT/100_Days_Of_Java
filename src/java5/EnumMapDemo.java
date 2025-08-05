package java5;

import java.util.EnumMap;
// 🔐 When to Use EnumMap?
//When keys are from a fixed set of enum values
//For high-performance maps with enums
//To improve readability and avoid using strings or integers as keys
enum Role {
    ADMIN, MODERATOR, USER, GUEST
}
public class EnumMapDemo {
    public static void main(String[] args) {
        // Create EnumMap with Role as key and String as value
        EnumMap<Role, String> accessMap = new EnumMap<>(Role.class);

        accessMap.put(Role.ADMIN, "Full Access");
        accessMap.put(Role.MODERATOR, "Moderate Access");
        accessMap.put(Role.USER, "Limited Access");
        accessMap.put(Role.GUEST, "Read-Only Access");

        // Print all entries
        for (Role role : accessMap.keySet()) {
            System.out.println(role + ": " + accessMap.get(role));
        }
    }
}
