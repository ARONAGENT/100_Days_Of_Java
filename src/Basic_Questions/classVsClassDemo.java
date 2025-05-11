package Basic_Questions;

/**
 * 🔸 class ek keyword hai jisse aap Java mein nayi class define karte ho.
 * 🔸 Class ek Java ki built-in class hai jo aapko runtime par kisi bhi class ke structure
 *     (jaise method, field) ko jaanchne ka feature deti hai.
 */
public class classVsClassDemo {
    public static void main(String[] args) {

        Class<?> c = String.class;
        System.out.println("Class name: " + c.getName());  // Output: java.lang.String
    }
}
