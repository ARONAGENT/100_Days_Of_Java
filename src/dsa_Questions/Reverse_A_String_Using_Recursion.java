package dsa_Questions;

public class Reverse_A_String_Using_Recursion {
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        String input = "OpenAI";
        System.out.println("Reversed: " + reverse(input));
    }
}
