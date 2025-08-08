package operators;
// ⚠️ Important:
//Shift operators (>>, <<, >>>) only work with integers in Java. They do not support float or double types.
//So if you want decimal-based division (e.g. 2.5), you must use floating-point division, not shift.

public class Practices_Left_Right_Shift_Operators {
    public static void main(String[] args) {
        int x1 = 2;      // 0000 0010
        int x2 = 5;
        int x3 = 7;
        int x4 = 10;
        int x5 = 15;
        int x6 = 20;
        int x7 = 25;
        int x8 = -3;
        int x9 = -6;
        int x10 = -8;

        System.out.println("Left Shift Examples:");
        System.out.println("2 << 1 = " + (x1 << 1));   // 4
        System.out.println("5 << 2 = " + (x2 << 2));   // 20
        System.out.println("7 << 1 = " + (x3 << 1));   // 14
        System.out.println("10 << 3 = " + (x4 << 3));  // 80
        System.out.println("15 << 2 = " + (x5 << 2));  // 60
        System.out.println("20 << 1 = " + (x6 << 1));  // 40
        System.out.println("25 << 2 = " + (x7 << 2));  // 100
        System.out.println("-3 << 1 = " + (x8 << 1));  // -6
        System.out.println("-6 << 2 = " + (x9 << 2));  // -24
        System.out.println("-8 << 1 = " + (x10 << 1)); // -16



        int y1 = 8;      // 0000 1000
        int y2 = 10;
        int y3 = 16;
        int y4 = 20;
        int y5 = 40;
        int y6 = 50;
        int y7 = 100;
        int y8 = -2;
        int y9 = -4;
        int y10 = -10;

        System.out.println("\nRight Shift Examples:");
        System.out.println("8 >> 1 = " + (y1 >> 1));    // 4
        System.out.println("10 >> 2 = " + (y2 >> 2));   // 2
        System.out.println("16 >> 3 = " + (y3 >> 3));   // 2
        System.out.println("20 >> 1 = " + (y4 >> 1));   // 10
        System.out.println("40 >> 2 = " + (y5 >> 2));   // 10
        System.out.println("50 >> 3 = " + (y6 >> 3));   // 6
        System.out.println("100 >> 2 = " + (y7 >> 2));  // 25
        System.out.println("-2 >> 1 = " + (y8 >> 1));   // -1
        System.out.println("-4 >> 2 = " + (y9 >> 2));   // -1
        System.out.println("-10 >> 1 = " + (y10 >> 1)); // -5


    }
}
