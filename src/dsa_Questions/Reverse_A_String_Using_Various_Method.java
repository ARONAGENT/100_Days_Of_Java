package dsa_Questions;

public class Reverse_A_String_Using_Various_Method {
    public static void main(String[] args) {
        String input = "OpenAI";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Reversed: " + reversed);

        String input1 = "OpenAI";
        StringBuilder sb = new StringBuilder(input1);
        sb.reverse();
        System.out.println("Reversed Using String Builder: " + sb.toString());
    }
}
