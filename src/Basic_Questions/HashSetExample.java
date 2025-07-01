import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
public class HashSetExample {
/*
Java mein agar aap custom objects HashSet ya HashMap mein daalte ho, toh JVM ye check karta hai 
ki objects barabar hain ya nahi using equals() aur kya unka hash code same hai using hashCode() method.
Dono methods ko sahi tarike se override karna bahut zaroori hai to avoid duplicates.
*/
 public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        people.add(new Person(1, "Rohan"));
        people.add(new Person(1, "Rohan")); // Same values

        System.out.println("Size of set: " + people.size());
        System.out.println("HashCode :"+people.hashCode()); // Should be 1 (no duplicates)
    }
}