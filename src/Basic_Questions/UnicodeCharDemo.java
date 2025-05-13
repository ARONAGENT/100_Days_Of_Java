package Basic_Questions;
/**
 * Java mein char 2 byte ka hota hai, isliye hum Unicode ke zariye duniya ke almost saare
 * characters print kar sakte hain — Hindi, Chinese, Emoji, etc.
 * Agar aap Unicode ka number jaante ho (jaise \u0915 for क), to usse bhi directly print kar sakte ho.
 */

public class UnicodeCharDemo {
    public static void main(String[] args) {
        // 🔹 Declaring characters using normal character literals
        char ch1 = 'A';
        char ch2 = 'क';         // Hindi character
        char ch4 = '❤';         // Heart symbol (may require surrogate pair for full emoji)
        char ch5 = '\u03A9';    // Greek Capital Letter Omega (Ω) using Unicode escape

        // 🔹 Printing characters and their Unicode values (casting to int)
        System.out.println("Character: " + ch1 + " | Unicode: " + (int) ch1); // 65
        System.out.println("Character: " + ch2 + " | Unicode: " + (int) ch2); // 2325
        System.out.println("Character: " + ch4 + " | Unicode: " + (int) ch4); // 10084
        System.out.println("Character: " + ch5 + " | Unicode: " + (int) ch5); // 937 (Ω)

        // 🔹 Loop to print a range of Unicode characters
        System.out.println("\nPrinting Unicode characters from 65 to 90 (A to Z):");
        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i + " ");
        }

        System.out.println("\n\nPrinting Hindi characters (2309 to 2319):");
        for (int i = 2309; i <= 2319; i++) {
            System.out.print((char) i + " ");
        }
    }
}
