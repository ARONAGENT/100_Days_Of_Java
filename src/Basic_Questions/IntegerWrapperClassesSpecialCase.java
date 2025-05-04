package Basic_Questions;
/**
 * Java -128 se 127 ke bich ke numbers ke liye same object use karta hai (cached).
 * Us range ke bahar jaise hi value aayi, Java har baar naya object banata hai.
 * Isliye == false deta hai, kyunki reference alag hota hai.
 */
public class IntegerWrapperClassesSpecialCase {
    public static void main(String[] args) {

        // Autoboxing: converts int 128 into Integer object
        Integer i = 128;
        Integer j = 128;

        // Java caches Integer objects only from -128 to 127
        // 128 is outside that range, so new objects are created for both i and j

        // '==' compares object references, not values
        System.out.println(i == j); // false: i and j are two different objects

        // If we use .equals(), it will compare the values
        System.out.println(i.equals(j)); // true: same value 128

        // similarly Long and Short Wrapper class use same concept.....
        // checkout notes -> Wrapper Classes in java file
    }
}
