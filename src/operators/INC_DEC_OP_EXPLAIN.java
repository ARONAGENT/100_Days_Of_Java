package operators;

public class INC_DEC_OP_EXPLAIN {
    public static void main(String[] args) {
        int a = 5;
        int b = a++;  // b = 5, a = 6
        int c = ++a;  // a = 7, c = 7

        System.out.println("a = " + a); // 7
        System.out.println("b = " + b); // 5
        System.out.println("c = " + c); // 7

        // Trick question
        int x = 5;
        x = x++ + ++x;
        System.out.println("x = " + x); // ??
    }
    }
