package operators;

public class Left_ShiftOperators {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("a << 1 = " + (a << 1)); // 10
        System.out.println("a << 2 = " + (a << 2)); // 20
        System.out.println("a << 3 = " + (a << 3)); // 40

        int b = 7;
        System.out.println("b << 1 = " + (b << 1)); // 14
        System.out.println("b << 2 = " + (b << 2)); // 28
    }
}
