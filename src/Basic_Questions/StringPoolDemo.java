package Basic_Questions;
//🔍 What is the String Pool?
//The String Pool is a special memory region in Java inside the Heap where String literals are stored.
//Java optimizes memory by storing only one copy of each string literal.
//🔑 Key Concepts:
//Feature	Explanation
//String literals	Stored in the String Pool
//new String("abc")	Creates a new object in heap, even if "abc" already exists
//== checks reference	.equals() checks content
public class StringPoolDemo {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";

        String s3 = new String("Java");

        System.out.println(s1 == s2); // true – both refer to same object in pool
        System.out.println(s1 == s3); // false – s3 is created in heap
        System.out.println(s1.equals(s3)); // true – content is same
    }
}
// 🧠 Hinglish Summary:
//Java string literals ek memory-efficient pool mein store hote hain. Agar aap "Java" string 100 baar likho, to JVM sirf ek copy store karta hai pool mein.
//Lekin agar aap new String("Java") likhte ho, to naya object banega heap mein.
//Isliye == false deta hai but .equals() true.