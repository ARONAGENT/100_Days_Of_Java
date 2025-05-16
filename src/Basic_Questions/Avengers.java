package Basic_Questions;


/**
 *  🧠 What You Need to Know:
 * ✅ When you override equals() and hashCode(),
 * two objects with same data are considered equal — both logically (equals()) and in collections (HashSet, etc.).
 * ❌ If you don’t override them,
 * Java uses default equals() (compares memory addresses) and default hashCode() (usually derived from memory location).
 */

public class Avengers {
    String heroName;

    public Avengers(String heroName) {
        this.heroName = heroName;
    }


}
