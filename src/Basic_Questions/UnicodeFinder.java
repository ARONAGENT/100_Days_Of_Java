package Basic_Questions;

import java.util.Scanner;
public class UnicodeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any character: ");
        char ch = scanner.next().charAt(0);  // Take first character from input

        // Print Unicode (decimal and hex both)
        System.out.println("Unicode (Decimal): " + (int) ch);
        System.out.printf("Unicode (Hex)    : \\u%04X\n", (int) ch);
    }
}
/*
 *  Line 1:
 * System.out.println("Unicode (Decimal): " + (int) ch);
 * 🧠 Explanation:
 *  Yahan par ch ek char type ka variable hai (ek character).
 *  Jab hum (int) ch likhte hain, to Java us character ka Unicode number (code point) decimal form mein de deta hai.
 *  + ka use kiya gaya hai string aur number ko jodne ke liye.
 * 📌 Hinglish:
 * Ye line character ko integer mein convert karke uska decimal Unicode value print karti hai.
 *

🔹 Line 2:
System.out.printf("Unicode (Hex)    : \\u%04X\n", (int) ch);
🧠 Explanation:
System.out.printf() ka use format ke sath output dene ke liye hota hai.
 \\u print karne ke liye \\ likhna padta hai kyunki ek backslash escape character hota hai.
%04X ka matlab hai:
%X → Number ko uppercase hexadecimal format mein print karo.
04 → Agar 4 digits se kam hai, to uske aage 0 laga do (zero-padding).
(int) ch → again character ko Unicode integer mein convert kar raha hai.
📌 Hinglish:
Ye line character ka hexadecimal Unicode value print karti hai, jaise \u0915 (hex format with padding).
 */